package org.ronil.easysnackbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.ronil.easysnackbar.ui.theme.EasySnackBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EasySnackBarTheme {
//                ExampleUsage()

            }
        }
    }
}


//@Composable
//fun ExampleUsage() {
//    val dialogState = rememberSnackBarState().apply {
//        duration = 5000
//        contentAlignment = Alignment.BottomCenter
//        textAlignment= TextAlign.Center
//        positiveSnackBarColor = Color.Cyan
//        positiveSnackBarTextColor = Color.Red
//        negativeSnackBarColor = Color.Black
//        negativeSnackBarTextColor = Color.Yellow
//        shape = CircleShape
//        horizontalPadding = 10.dp
//        verticalPadding = 10.dp
//    }
//
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
//    ) {
//        Button(onClick = { dialogState.showPositiveSnackBar("This is the Positive Snack-bar") }) {
//            Text("Show Positive SnackBar")
//        }
//        Button(onClick = { dialogState.showNegativeSnackBar("This is the Negative Snack-bar") }) {
//            Text("Show Negative SnackBar")
//        }
//    }
//}