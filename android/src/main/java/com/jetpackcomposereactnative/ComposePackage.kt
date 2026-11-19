package com.jetpackcomposereactnative

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.jetpackcomposereactnative.generated.ComposeHostManager
import com.jetpackcomposereactnative.generated.ComposeNodeManager
import com.jetpackcomposereactnative.views.badge.BadgeManager
import com.jetpackcomposereactnative.views.badged_box.BadgedBoxManager
import com.jetpackcomposereactnative.views.box.BoxManager
import com.jetpackcomposereactnative.views.button.ButtonManager
import com.jetpackcomposereactnative.views.card.CardManager
import com.jetpackcomposereactnative.views.carousel.CarouselManager
import com.jetpackcomposereactnative.views.checkbox.CheckboxManager
import com.jetpackcomposereactnative.views.chip.ChipManager
import com.jetpackcomposereactnative.views.column.ColumnManager
import com.jetpackcomposereactnative.views.datepicker.DatePickerManager
import com.jetpackcomposereactnative.views.dialog.DialogManager
import com.jetpackcomposereactnative.views.divider.DividerManager
import com.jetpackcomposereactnative.views.grid.GridManager
import com.jetpackcomposereactnative.views.icon.IconManager
import com.jetpackcomposereactnative.views.image.ImageManager
import com.jetpackcomposereactnative.views.progress_indicator.ProgressIndicatorManager
import com.jetpackcomposereactnative.views.row.RowManager
import com.jetpackcomposereactnative.views.scaffold.ScaffoldManager
import com.jetpackcomposereactnative.views.slider.SliderManager
import com.jetpackcomposereactnative.views.snackbar.SnackbarManager
import com.jetpackcomposereactnative.views.spacer.SpacerManager
import com.jetpackcomposereactnative.views.switch_.SwitchManager
import com.jetpackcomposereactnative.views.text.TextManager
import com.jetpackcomposereactnative.views.textfield.TextFieldManager

class ComposePackage : ReactPackage {
    override fun createNativeModules(context: ReactApplicationContext): List<NativeModule> = emptyList()

    override fun createViewManagers(context: ReactApplicationContext): List<ViewManager<*, *>> = listOf(
        ComposeHostManager(),
        ComposeNodeManager(),
        BadgeManager(),
        BadgedBoxManager(),
        BoxManager(),
        ButtonManager(),
        CardManager(),
        CarouselManager(),
        CheckboxManager(),
        ChipManager(),
        ColumnManager(),
        DatePickerManager(),
        DialogManager(),
        DividerManager(),
        GridManager(),
        IconManager(),
        ImageManager(),
        ProgressIndicatorManager(),
        RowManager(),
        ScaffoldManager(),
        SliderManager(),
        SnackbarManager(),
        SpacerManager(),
        SwitchManager(),
        TextManager(),
        TextFieldManager(),
    )
}
