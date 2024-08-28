val jdkVersion: String by rootProject
val targetJavaVersion = jdkVersion.toInt()

val javaComponent = components["java"] as AdhocComponentWithVariants

// Add a different runtime variant for each platform
afterEvaluate {
    overrunglModule.nativeBinding.get().also { nativeBinding ->
        nativeBinding.platforms.forEach { platform ->
            val archiveTaskName = "${nativeBinding.bindingName}${platform.classifier}Jar"

            val nativeJar = tasks.register<Jar>(archiveTaskName) {
                archiveBaseName.set(overrunglModule.artifactName)
                archiveClassifier.set(platform.classifier)

                val nativeFileName = nativeFileName(nativeBinding, platform)
                val file = rootProject.projectDir.resolve("natives").resolve(nativeFileName)
                from(file) { into(File(nativeFileName).parent) }
            }

            val nativeRuntimeElements = configurations.create(platform.classifier + "RuntimeElements") {
                isCanBeConsumed = true; isCanBeResolved = false
                attributes {
                    attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.LIBRARY))
                    attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling.EXTERNAL))
                    attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, targetJavaVersion)
                    attribute(LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named(LibraryElements.JAR))
                    attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
                    attributes.attribute(
                        OperatingSystemFamily.OPERATING_SYSTEM_ATTRIBUTE,
                        objects.named(platform.osFamilyName)
                    )
                    attributes.attribute(MachineArchitecture.ARCHITECTURE_ATTRIBUTE, objects.named(platform.osArch))
                }
                outgoing.artifact(tasks.named("jar"))
                outgoing.artifact(nativeJar)
                extendsFrom(configurations["runtimeElements"])
            }
            javaComponent.addVariantsFromConfiguration(nativeRuntimeElements) {}
        }
    }
}
