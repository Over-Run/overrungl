import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { kotlin("jvm") }

val kotlinTargetJdkVersion: String by rootProject

repositories {
    mavenCentral()
}

dependencies {
}

tasks.withType<JavaCompile>().configureEach {
    targetCompatibility = kotlinTargetJdkVersion
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions { jvmTarget = JvmTarget.fromTarget(kotlinTargetJdkVersion) }
}
