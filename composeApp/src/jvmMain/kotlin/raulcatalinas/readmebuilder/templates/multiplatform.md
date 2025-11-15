# {{projectName}}

> {{description}}

![Kotlin](https://img.shields.io/badge/Kotlin-Multiplatform-purple)
![Platforms](https://img.shields.io/badge/Platforms-{{platforms}}-blue)
![License](https://img.shields.io/badge/License-{{license}}-blue.svg)
{{#sharedCode}}
![Shared Code](https://img.shields.io/badge/Shared%20Code-{{sharedCode}}%25-green)
{{/sharedCode}}

## ✨ Features

{{features}}

## 🎯 Supported Platforms

{{platforms}}

## 🛠️ Built With

{{techStack}}

{{#sharedCode}}

## 📊 Code Sharing

This project shares **{{sharedCode}}%** of its codebase across all platforms, maximizing code reuse and reducing
maintenance overhead.
{{/sharedCode}}

## 📦 Installation

```bash
{{installation}}
```

## 🚀 Getting Started

### Prerequisites

- JDK 11 or higher
- Android Studio (for Android)
- Xcode (for iOS)
- Kotlin Multiplatform plugin

### Building for Different Platforms

#### Android

```bash
./gradlew :androidApp:assembleDebug
```

#### iOS

```bash
./gradlew :iosApp:build
```

#### Desktop

```bash
./gradlew :desktopApp:run
```

{{#web}}

#### Web

```bash
./gradlew :webApp:jsBrowserRun
```

{{/web}}

## 📁 Project Structure

```
├── androidApp/          # Android-specific code
├── iosApp/              # iOS-specific code
├── desktopApp/          # Desktop-specific code
├── shared/              # Shared Kotlin code
│   ├── commonMain/      # Common code for all platforms
│   ├── androidMain/     # Android-specific implementations
│   ├── iosMain/         # iOS-specific implementations
│   └── desktopMain/     # Desktop-specific implementations
└── build.gradle.kts
```

## 🗺️ Roadmap

- [ ] Feature 1
- [ ] Feature 2
- [ ] Feature 3

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the {{license}} License - see the [LICENSE](LICENSE) file for details.

## 💬 Contact

Your Name - [@your_twitter](https://twitter.com/your_twitter)

Project Link: [https://github.com/yourusername/{{projectName}}](https://github.com/yourusername/{{projectName}})

