plugins {
    id(Plugin.AGP.application)
    id(Plugin.Kotlin.android)
    id(Plugin.Kotlin.kapt)


}

android {
    namespace ="com.example.note20"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.note"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }


}

dependencies {

//room
    implementation(Dependencies.Room.roomRuntime)
    implementation(Dependencies.Room.room)
    kapt(Dependencies.Room.roomCompiler)



    //Coroutine
    implementation(Dependencies.Coroutine.coroutines)

}