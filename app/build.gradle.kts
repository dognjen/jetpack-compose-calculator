plugins {
    `android-conventions`
    //alias(libs.plugins.android.)
    alias(libs.plugins.kotlin.compose.compiler)
}

android.namespace = "com.dognjen.app.calculator"

dependencies {
    val composeBom = platform(libs.androidx.compose.bom)
    implementation(composeBom)

    implementation(libs.androidx.ktx)

    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.constraintlayout.compose)

    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material.iconsExtended)
}