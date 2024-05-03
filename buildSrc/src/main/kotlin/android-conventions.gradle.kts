plugins {
    id("project-conventions")
    id("com.android.application")
    id("kotlin-android")
}

android {

    compileSdk = 33
    buildToolsVersion = "33"

    defaultConfig {
        minSdk = 21
    }

    buildFeatures {
        compose = true
    }

    /*
    // not needed with kotlin 2.0.0
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }*/
}