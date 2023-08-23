val enablePreview: Boolean by rootProject.ext

sourceSets {
    create("generator")
}

tasks.named<JavaCompile>("compileGeneratorJava") {
    javaCompiler.set(javaToolchains.compilerFor {
        targetCompatibility = "20"
        languageVersion.set(JavaLanguageVersion.of(21))
    })
}

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["generator"].runtimeClasspath)
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(21))
    })
    if (enablePreview) jvmArgs("--enable-preview")
    mainClass.set("overrungl.opengl.OpenGLGeneratorKt")
    workingDir = File("src/main/java/overrungl/opengl")
}
