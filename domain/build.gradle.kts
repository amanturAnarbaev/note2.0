plugins {
    id(Plugin.AGP.javaLibrary)
    id(Plugin.AGP.jetbrainsKotlin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation (Dependencies.UI)

    implementation (Dependencies.Coroutine.coroutines)
}