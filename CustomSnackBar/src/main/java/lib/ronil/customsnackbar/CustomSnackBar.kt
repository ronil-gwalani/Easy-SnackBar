package lib.ronil.customsnackbar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex


@Composable
fun rememberSnackBarState(): ShackBarState {
    val state = remember { ShackBarState() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .zIndex(Float.MAX_VALUE),
        contentAlignment = state.contentAlignment
    ) {
        AnimatedVisibility(
            modifier = Modifier.zIndex(Float.MAX_VALUE),

            visible = state.isVisible,
            enter = slideInVertically(initialOffsetY = { if (state.contentAlignment==Alignment.TopCenter) -it else it }) + fadeIn(),
            exit = slideOutVertically(targetOffsetY = { if (state.contentAlignment==Alignment.TopCenter) -it else it  }) + fadeOut()
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = state.horizontalPadding)
                    .padding(vertical = state.verticalPadding)
                    .clip(state.shape)
                    .wrapContentHeight()
                    .background(
                        if (state.snackBarType == ShackBarState.ShackBarType.POSITIVE) state.positiveSnackBarColor else state.negativeSnackBarColor,
                    )
                    .padding(17.dp)
            ) {
                Text(
                    text = state.message,
                    style = TextStyle(
                        color = if (state.snackBarType == ShackBarState.ShackBarType.POSITIVE) state.positiveSnackBarTextColor else state.negativeSnackBarTextColor,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = MaterialTheme.typography.bodyLarge.fontWeight
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = state.textAlignment
                )

            }
        }
    }

    return state
}
