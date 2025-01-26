# Easy SnackBar: Streamlined Snackbar Library for Jetpack Compose

## Quick Start
### Step 1: Add JitPack Repository

```kotlin

allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
## Step 2: Add Dependency
### In your app-level build.gradle:
```kotlin

dependencies {
    implementation 'com.github.ronil-gwalani:Easy-SnackBar:1.0.1'
}
```
###  Step 3: Basic Usage

```kotlin

@Composable
fun ExampleUsage() {
    val dialogState = rememberSnackBarState()    // Create SnackBar State

    
  
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
        dialogState.showPositiveSnackBar("This is the Positive Snack-bar") \\ Use Possitive Snackbar Like this 
        }) {
            Text("Show Positive SnackBar")
        }
        Button(onClick = { 
        dialogState.showNegativeSnackBar("This is the Negative Snack-bar") \\ Use Negetive Snackbar Like this 
        }) {
            Text("Show Negative SnackBar")
        }
    }
}

```
### Advanced Customization

```kotlin
 
val dialogState = rememberSnackBarState().apply {
    duration = 5000                     // Set duration in milliseconds
    contentAlignment = Alignment.BottomCenter
    textAlignment = TextAlign.Center
    
    // Positive SnackBar Customization
    positiveSnackBarColor = Color.Cyan
    positiveSnackBarTextColor = Color.Red
    
    // Negative SnackBar Customization
    negativeSnackBarColor = Color.Black
    negativeSnackBarTextColor = Color.Yellow
    
    // Styling Options
    shape = CircleShape
    horizontalPadding = 10.dp
    verticalPadding = 10.dp
}

```

# Features
1. Easy integration with Jetpack Compose
2. Customizable duration and alignment
3. Positive and negative snackbar styles
4. Flexible color and text color configuration
5. Supports custom shapes and padding

With these steps, you should be able to successfully integrate and use the Custom Snack Bar in your project. If you encounter any issues or have further questions, feel free to reach out.

## Contributing

Contributions to the project are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

Image Picker Library is released under the **MIT License**. See the [LICENSE](https://en.wikipedia.org/wiki/MIT_License) file for more details.

## Support

For any questions or support related to Easy Snack Bar Library, you can reach out to us at ronilgwalani@gmail.com or join my community forum.

## Credits

The Easy Snack Bar Library was developed by [Ronil Gwalani](https://github.com/ronilgwalnai) feel free to contact in case of any query.

## Connect 

### Email-[Send an Email📧](ronilgwalani@gmail.com)

### Portfolio Website-[Ronil Gwalani](ronildeveloper.in)

### Linkeden-[Lets Connect](https://www.linkedin.com/in/ronil-gwalani/)








