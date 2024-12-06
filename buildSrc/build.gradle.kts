plugins { `kotlin-dsl` }

val kotlinPluginVersion: String by rootProject

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinPluginVersion")
}
