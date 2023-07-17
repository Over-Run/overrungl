dependencies {
    listOf("core", "glfw", "nfd", "joml", "opengl", "stb").forEach {
        implementation(project(":$it"))
    }
    testImplementation("io.github.over-run:timer:0.3.0")
    jmh("org.openjdk.jmh:jmh-core:1.36")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.36")
}