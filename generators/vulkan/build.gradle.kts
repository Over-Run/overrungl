plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

tasks.register<GenerateTask>("generate") {
    mainClass.set("overrungl.vulkan.VulkanGeneratorKt")
    workingDir = project(":vulkan").projectDir.resolve("src/main/java/overrungl/vulkan")
}
