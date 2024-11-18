plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "woody.android.application"
            implementationClass = "AndroidApplicationPlugin"
        }
        register("androidCompose") {
            id = "woody.android.compose"
            implementationClass = "AndroidComposePlugin"
        }
        register("hilt") {
            id = "woody.hilt"
            implementationClass = "HiltPlugin"
        }
    }
}