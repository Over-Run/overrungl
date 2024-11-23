import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { kotlin("jvm") }

val jdkVersion: String by rootProject
val kotlinTargetJdkVersion: String by rootProject

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.palantir.javapoet:javapoet:0.5.0")
}

tasks.withType<KotlinCompile> {
    compilerOptions { jvmTarget.set(JvmTarget.fromTarget(kotlinTargetJdkVersion)) }
}

tasks.withType<JavaCompile> {
    javaCompiler.set(javaToolchains.compilerFor {
        targetCompatibility = kotlinTargetJdkVersion
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
}
