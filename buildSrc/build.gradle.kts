import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { `kotlin-dsl` }

val kotlinPluginVersion = rootProject.providers.gradleProperty("kotlinPluginVersion").get()
val kotlinTargetJdkVersion = rootProject.providers.gradleProperty("kotlinTargetJdkVersion").get()

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinPluginVersion")
}

tasks.withType<JavaCompile>().configureEach {
    targetCompatibility = kotlinTargetJdkVersion
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions { jvmTarget = JvmTarget.fromTarget(kotlinTargetJdkVersion) }
}
