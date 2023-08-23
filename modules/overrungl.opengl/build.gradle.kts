val enablePreview: Boolean by rootProject.ext

sourceSets {
    create("generator")
}

tasks.named<JavaCompile>("compileGeneratorJava") {
    javaCompiler.set(javaToolchains.compilerFor {
        languageVersion.set(JavaLanguageVersion.of(20))
    })
}

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["generator"].runtimeClasspath)
    if (enablePreview) jvmArgs("--enable-preview")
    mainClass.set("overrungl.opengl.OpenGLGenerator")
    workingDir = File("src/main/java/overrungl/opengl")
}
