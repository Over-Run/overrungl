plugins { kotlin("jvm") }

val javaPoetVersion: String by rootProject
val kotlinTargetJdkVersion: String by rootProject

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.palantir.javapoet:javapoet:$javaPoetVersion")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(kotlinTargetJdkVersion))
    }
}
