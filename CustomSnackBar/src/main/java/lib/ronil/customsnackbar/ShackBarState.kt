package lib.ronil.customsnackbar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Stable
class ShackBarState {
    private var job: Job? = null
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    var duration = 2500L
    var textAlignment by mutableStateOf(TextAlign.Start)
    var shape by mutableStateOf(RoundedCornerShape(5.dp))
    var horizontalPadding by mutableStateOf(2.dp)
    var verticalPadding by mutableStateOf(35.dp)
    var contentAlignment by mutableStateOf(Alignment.TopCenter)
    var positiveSnackBarColor by mutableStateOf(Color.Green)
    var positiveSnackBarTextColor by mutableStateOf(Color.Black)
    var negativeSnackBarColor by mutableStateOf(Color.Red)
    var negativeSnackBarTextColor by mutableStateOf(Color.White)

    var isVisible by mutableStateOf(false)
        private set

    var message: String by mutableStateOf("")
        private set

    var snackBarType by mutableStateOf(ShackBarType.POSITIVE)
        private set

    private fun show(message: String) {
        this.message = message
        isVisible = true
    }

    fun dismiss() {
        isVisible = false
    }

    fun showNegativeSnackBar(message: String) {
        job?.cancel()
        snackBarType = ShackBarType.NEGATIVE
        show(message)
        job = coroutineScope.launch {
            delay(duration)
            dismiss()
        }
    }

    fun showPositiveSnackBar(message: String) {
        job?.cancel()
        snackBarType = ShackBarType.POSITIVE
        show(message)
        job = coroutineScope.launch {
            delay(duration)
            dismiss()
        }
    }

    enum class ShackBarType {
        POSITIVE, NEGATIVE
    }

}