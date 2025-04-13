plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.ndesai163257.comp_6057_finalprojectg12"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ndesai163257.comp_6057_finalprojectg12"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.gson) //Added the gson library
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation("com.google.code.gson:gson:2.12.1")
    implementation(libs.realm.android.library)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}