val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["main"].runtimeClasspath)
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
    if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    mainClass.set("overrungl.opengl.OpenGLGeneratorKt")
    workingDir = project(":opengl").projectDir.resolve("src/main/java/overrungl/opengl")
}
