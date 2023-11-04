val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject

sourceSets {
    create("generator")
}

tasks.named<JavaCompile>("compileGeneratorJava") {
    javaCompiler.set(javaToolchains.compilerFor {
        targetCompatibility = "20"
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
}

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["generator"].runtimeClasspath)
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
    if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    mainClass.set("overrungl.opengl.OpenGLGeneratorKt")
    workingDir = File("src/main/java/overrungl/opengl")
}
