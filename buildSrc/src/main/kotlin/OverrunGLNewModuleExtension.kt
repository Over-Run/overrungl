import org.gradle.api.provider.Property

abstract class OverrunGLNewModuleExtension {
    abstract val artifactName: Property<String>
    abstract val artifactVersion: Property<String>
    abstract val projectTitle: Property<String>
    abstract val description: Property<String>
}
