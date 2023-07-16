dependencies {
    listOf("core", "glfw", "nfd", "joml", "opengl", "stb").forEach {
        implementation(project(":$it"))
    }
}
