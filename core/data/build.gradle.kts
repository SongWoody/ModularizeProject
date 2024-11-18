plugins {
    alias(libs.plugins.woody.android.application)
    alias(libs.plugins.woody.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.woody.core.data"
}

dependencies {
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.kotlinx.serialization.json)
}