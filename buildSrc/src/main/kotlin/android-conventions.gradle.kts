plugins {
    id("project-conventions")
    id("com.android.application")
    id("kotlin-android")
}

android {

    compileSdk = 34
    buildToolsVersion = "34"

    defaultConfig {
        applicationId = "com.dognjen.app.calculator"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    /*
    // not needed with kotlin 2.0.0
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }*/
}