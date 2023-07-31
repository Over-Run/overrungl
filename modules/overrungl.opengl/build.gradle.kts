sourceSets {
    create("generator")
}

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["generator"].runtimeClasspath)
    jvmArgs("--enable-preview")
    mainClass.set("overrungl.opengl.OpenGLGenerator")
    workingDir = File("src/main/java/overrungl/opengl")
}
