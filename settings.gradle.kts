pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
    }
}

val projName: String by settings
rootProject.name = projName

listOf("core", "glfw", "nfd", "joml", "opengl", "stb").forEach {
    include(it)
    project(":$it").projectDir = file("modules/overrungl/$it/")
}

include("samples")
project(":samples").projectDir = file("modules/samples/")
