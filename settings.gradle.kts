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

file("modules").listFiles()?.forEach {
    val s = it.name.substringAfterLast("overrungl.")
    include(s)
    project(":$s").projectDir = it
}

include(
    "generators:core",
    "generators:glfw",
    "generators:nfd",
    "generators:opengl",
    "generators:stb",
    "generators:vulkan"
)
