// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugin.AGP.application) version Versions.AGP apply false
    id(Plugin.AGP.library) version Versions.AGP apply false
    id(Plugin.Kotlin.android) version Versions.kotlin apply false
    id(Plugin.DaggerHilt.hilt) version Versions.DaggerHilt apply false
    id(Plugin.Kotlin.jwm) version Versions.kotlinJwm apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.20" apply false

}