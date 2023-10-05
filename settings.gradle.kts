pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
    }
}

val projName: String by settings
val projModules: String by settings

rootProject.name = projName

projModules.split(',').map { it.trim() }.forEach {
    include(it)
    project(":$it").projectDir = File("modules/overrungl.$it/")
}

include("samples")
project(":samples").projectDir = File("modules/samples/")
