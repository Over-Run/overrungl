plugins { `kotlin-dsl` }

val kotlinPluginVersion: String by rootProject
val kotlinTargetJdkVersion: String by rootProject

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinPluginVersion")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(kotlinTargetJdkVersion))
    }
}
