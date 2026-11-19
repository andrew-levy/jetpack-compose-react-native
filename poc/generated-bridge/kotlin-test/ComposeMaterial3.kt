package androidx.compose.material3
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
@Composable fun Text(text: String, modifier: Modifier = Modifier.Default) { require(text.isNotBlank()) }
@Composable fun Button(onClick: () -> Unit, modifier: Modifier = Modifier.Default, enabled: Boolean = true, content: @Composable () -> Unit) { if (enabled) onClick(); content() }
