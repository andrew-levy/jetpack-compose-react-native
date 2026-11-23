// Native configuration the example app needs on top of Expo's Android template. `expo prebuild`
// regenerates android/ from app.json, so everything the app changes in android/ lives here.
const {
  withAppBuildGradle,
  withGradleProperties,
  withMainActivity,
  withProjectBuildGradle,
} = require('expo/config-plugins');

// Compose UI and Foundation 1.13 are compiled against Android API 37.1 and require it at compile time.
const COMPILE_SDK_MINOR = 1;

function replaceOnce(source, pattern, replacement, what) {
  if (!pattern.test(source)) {
    throw new Error(`withComposeExample: could not find ${what} in the generated Android project`);
  }
  return source.replace(pattern, replacement);
}

// The library applies org.jetbrains.kotlin.plugin.compose, so the build classpath needs the Compose
// compiler Gradle plugin at the same version as Kotlin (android.kotlinVersion from app.json).
function withComposeClasspath(config) {
  return withProjectBuildGradle(config, (config) => {
    let gradle = config.modResults.contents;
    if (gradle.includes('compose-compiler-gradle-plugin')) return config;
    gradle = replaceOnce(
      gradle,
      /(\n(\s*)classpath\(kotlinVersion \?[^\n]*kotlin-gradle-plugin[^\n]*\))/,
      `$1\n$2classpath("org.jetbrains.kotlin:compose-compiler-gradle-plugin:\${kotlinVersion ?: '2.2.0'}")`,
      'the Kotlin Gradle plugin classpath'
    );
    config.modResults.contents = gradle;
    return config;
  });
}

function withCompileSdkMinor(config) {
  return withAppBuildGradle(config, (config) => {
    let gradle = config.modResults.contents;
    if (gradle.includes('compileSdkMinor')) return config;
    gradle = replaceOnce(
      gradle,
      /(\n(\s*)compileSdk rootProject\.ext\.compileSdkVersion)/,
      `$1\n$2compileSdkMinor rootProject.ext.has('compileSdkMinorVersion') ? rootProject.ext.compileSdkMinorVersion : ${COMPILE_SDK_MINOR}`,
      'compileSdk in app/build.gradle'
    );
    config.modResults.contents = gradle;
    return config;
  });
}

// scripts/check-emulator.py and scripts/sweep-catalog.py start MainActivity with intent extras
// (`--ei catalogStart N`, `--ez bridgeChecks true`). Forward them to JavaScript as App's initial props.
function withLaunchOptions(config) {
  return withMainActivity(config, (config) => {
    let activity = config.modResults.contents;
    if (activity.includes('getLaunchOptions')) return config;
    activity = replaceOnce(
      activity,
      /(object\s*:\s*DefaultReactActivityDelegate\([^)]*\)\s*)\{\s*\}/,
      `$1{
            override fun getLaunchOptions(): Bundle? {
                val start = intent?.getIntExtra("catalogStart", -1) ?: -1
                val bridgeChecks = intent?.getBooleanExtra("bridgeChecks", false) ?: false
                if (start < 0 && !bridgeChecks) return null
                return Bundle().apply {
                    if (start >= 0) putInt("catalogStart", start)
                    if (bridgeChecks) putBoolean("bridgeChecks", true)
                }
            }
          }`,
      'the DefaultReactActivityDelegate in MainActivity'
    );
    config.modResults.contents = activity;
    return config;
  });
}

function withComposeGradleProperties(config) {
  return withGradleProperties(config, (config) => {
    const properties = {
      'org.gradle.jvmargs': '-Xmx4096m -XX:MaxMetaspaceSize=1536m',
      // Compile the generated Compose dispatch in the same heap as Gradle. In-process Kotlin
      // compilation of every module loads its classes into the daemon, hence the Metaspace.
      'kotlin.compiler.execution.strategy': 'in-process',
    };
    for (const [key, value] of Object.entries(properties)) {
      const existing = config.modResults.find((item) => item.type === 'property' && item.key === key);
      if (existing) existing.value = value;
      else config.modResults.push({ type: 'property', key, value });
    }
    return config;
  });
}

module.exports = function withComposeExample(config) {
  config = withComposeClasspath(config);
  config = withCompileSdkMinor(config);
  config = withLaunchOptions(config);
  config = withComposeGradleProperties(config);
  return config;
};
