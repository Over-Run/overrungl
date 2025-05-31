plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.glfw.GLFWGeneratorKt", ":glfw")
