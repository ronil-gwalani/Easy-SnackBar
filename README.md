# 📦 Easy SnackBar: Streamlined Snackbar Library for Jetpack Compose

A lightweight and customizable snackbar library made for Jetpack Compose, allowing quick integration and flexible control over UI feedback for success and error messages.

---

## 🚀 Quick Start

### 🔧 Step 1: Add JitPack Repository

```kotlin
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### 📦 Step 2: Add Dependency

In your **app-level `build.gradle`**:

```kotlin
dependencies {
    implementation 'com.github.ronil-gwalani:Easy-SnackBar:1.0.1'
}
```

### 🧪 Step 3: Basic Usage

```kotlin
@Composable
fun ExampleUsage() {
    val dialogState = rememberSnackBarState()    // Create SnackBar State

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            dialogState.showPositiveSnackBar("This is the Positive Snack-bar") // Use Positive Snackbar
        }) {
            Text("Show Positive SnackBar")
        }
        Button(onClick = {
            dialogState.showNegativeSnackBar("This is the Negative Snack-bar") // Use Negative Snackbar
        }) {
            Text("Show Negative SnackBar")
        }
    }
}
```

### 🎨 Advanced Customization

```kotlin
val dialogState = rememberSnackBarState().apply {
    duration = 5000 // Duration in milliseconds
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

---

## ✨ Features

* 🔀 Easy integration with Jetpack Compose
* ⏳ Customizable duration and alignment
* ✅ Positive and ❌ negative snackbar styles
* 🎨 Flexible color and text style configuration
* 🧹 Support for custom shapes and padding

---

## 📸 Screenshots
<div style="display: flex; justify-content: space-between;">
    <img src="https://github.com/ronil-gwalani/Easy-SnackBar/blob/main/CustomSnackBar/screenshots/image1.png" alt="Positive Snackbar in default mode" width="200"/>
    <img src="https://github.com/ronil-gwalani/Easy-SnackBar/blob/main/CustomSnackBar/screenshots/image2.png" alt="Negative Snackbar in default mode" width="200"/>
    <img src="https://github.com/ronil-gwalani/Easy-SnackBar/blob/main/CustomSnackBar/screenshots/image3.png" alt="Positive Snackbar in Customized mode" width="200"/>
    <img src="https://github.com/ronil-gwalani/Easy-SnackBar/blob/main/CustomSnackBar/screenshots/image4.png" alt="Negative Snackbar in Customized mode" width="200"/>
</div>


## 🙌 Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

---

## 📝 License

This library is released under the **MIT License**. See the [LICENSE](https://opensource.org/licenses/MIT) file for more details.

---

## 📬 Support

For queries or support, reach out to me:

* 📧 [ronilgwalani@gmail.com](mailto:ronilgwalani@gmail.com)
* 🌐 [ronildeveloper.in](https://ronildeveloper.in)
* 💼 [LinkedIn – Ronil Gwalani](https://www.linkedin.com/in/ronil-gwalani/)
* 📄 [My Resume](https://ronildeveloper.in/files/Ronil-CV.pdf)

---

## 👏 Credits

Developed and maintained by [Ronil Gwalani](https://github.com/ronil-gwalani). Always happy to connect with the dev community.

---

# 💻 Happy Coding!
