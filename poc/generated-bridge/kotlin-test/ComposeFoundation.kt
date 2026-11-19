package androidx.compose.foundation.layout
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
@Composable fun Column(modifier: Modifier = Modifier.Default, content: @Composable () -> Unit) { content() }
