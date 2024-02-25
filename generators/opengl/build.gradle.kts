import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    embeddedKotlin("jvm")
}

repositories { mavenCentral() }

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject
val kotlinTargetJdkVersion: String by rootProject

tasks.withType<KotlinCompile> {
    kotlinOptions { jvmTarget = kotlinTargetJdkVersion }
}

tasks.withType<JavaCompile> {
    javaCompiler.set(javaToolchains.compilerFor {
        targetCompatibility = kotlinTargetJdkVersion
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
}

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["main"].runtimeClasspath)
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
    if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    mainClass.set("overrungl.opengl.OpenGLGeneratorKt")
    workingDir = project(":opengl").projectDir.resolve("src/main/java/overrungl/opengl")
}
