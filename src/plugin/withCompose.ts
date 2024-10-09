import { ConfigPlugin, withProjectBuildGradle } from "@expo/config-plugins";
import { mergeContents } from "@expo/config-plugins/build/utils/generateCode";

const withCompose: ConfigPlugin = (config) => {
  return withProjectBuildGradle(config, (config) => {
    if (config.modResults.language === "groovy") {
      config.modResults.contents = mergeBuildGradle(config.modResults.contents);
    } else {
      throw new Error(
        "Cannot add orientation maven gradle because the build.gradle is not groovy"
      );
    }
    return config;
  });
};

const mergeBuildGradle = (contents: string) => {
  const dependency = [
    `      classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10"`,
  ];
  return mergeContents({
    src: contents,
    newSrc: dependency.join("\n"),
    tag: "kotlin-gradle-plugin-dependency",
    comment: "//",
    anchor: /dependencies\s?{/,
    offset: 1,
  }).contents;
};

export default withCompose;
