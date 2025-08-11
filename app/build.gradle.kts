plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.quiz_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.quiz_app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    val roomVersion = "2.5.1" // Use the latest version
    implementation("androidx.room:room-runtime:$roomVersion")
    annotationProcessor("androidx.room:room-compiler:$roomVersion") // For Java users
    implementation("androidx.room:room-ktx:$roomVersion") // Optional, but can still be used
    testImplementation("androidx.room:room-testing:$roomVersion")

    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.19")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.tbuonomo:dotsindicator:4.2")
}
