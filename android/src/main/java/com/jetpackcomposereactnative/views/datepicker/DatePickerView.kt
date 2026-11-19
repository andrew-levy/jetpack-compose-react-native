package com.jetpackcomposereactnative.views.datepicker

import android.content.Context
import com.jetpackcomposereactnative.common.LegacyComposeView
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier

data class DatePickerProps(
    var modifier: ModifierProp = emptyList(),
    var confirmText: String? = null,
    var dismissText: String? = null,
    var tonalElevation: Int? = null,
    var showModeToggle: Boolean? = null,
)

class DatePickerView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(DatePickerProps())
    private val onConfirm = legacyEvent("topConfirm")
    private val onDismiss = legacyEvent("topDismiss")

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                DatePickerComposable(
                    props = props.value, 
                    onConfirmation = onConfirm,
                    onDismissRequest = onDismiss
                )
            }
            addView(it)
        }
    }

    fun updateShowModeToggle(showModeToggle: Boolean){
        props.value = props.value.copy(showModeToggle = showModeToggle)
    }

    fun updateTonalElevation(tonalElevation: Int) {
        props.value = props.value.copy(tonalElevation = tonalElevation)
    }

    fun updateConfirmText(confirmText: String) {
        props.value = props.value.copy(confirmText = confirmText)
    }

    fun updateDismissText(dismissText: String) {
        props.value = props.value.copy(dismissText = dismissText)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerComposable(
    props: DatePickerProps,
    onConfirmation: (Map<String, Any>) -> Unit,
    onDismissRequest: (Map<String, Any>) -> Unit
) {
    val modifier: Modifier = props.modifier.toModifier()
    val datePickerState = rememberDatePickerState()

    DatePickerDialog(
        onDismissRequest = {
            onDismissRequest(mapOf())
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation(mapOf())
                }
            ) {
                Text(props.confirmText ?: "OK")
            }
        },
        dismissButton = {
        TextButton(
            onClick = {
                onDismissRequest(mapOf())
                }
            ) {
                Text(props.dismissText ?: "Cancel")
            }
        },
        tonalElevation = props.tonalElevation?.dp ?: AlertDialogDefaults.TonalElevation
    ) {
        DatePicker(
            state = datePickerState,
            showModeToggle = props.showModeToggle ?: true,
        )
    }    
}