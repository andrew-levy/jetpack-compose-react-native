import { useRef } from "react";
import { useModalBottomSheetState } from "jetpack-compose-react-native";

export function useDismissibleSheet(onDismiss: () => void) {
  const hideRequested = useRef(false);

  function dismiss() {
    hideRequested.current = false;
    onDismiss();
  }

  const sheet = useModalBottomSheetState({
    skipPartiallyExpanded: true,
    onStateChange: ({ currentValue, targetValue, isVisible }) => {
      // During opening, the current anchor can still be Hidden while the sheet is visible.
      if (hideRequested.current && currentValue === "hidden" && targetValue === "hidden" && !isVisible) {
        dismiss();
      }
    },
  });

  function hide() {
    hideRequested.current = true;
    sheet.hide();
  }

  return { sheet, hide, dismiss };
}
