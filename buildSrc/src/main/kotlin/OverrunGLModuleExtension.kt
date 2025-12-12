import org.gradle.api.provider.Property

/**
 * @author squid233
 * @since 0.1.0
 */
abstract class OverrunGLModuleExtension {
    abstract val artifactName: Property<String>
    abstract val publishInfo: Property<Artifact>
    abstract val nativeBinding: Property<NativeBinding>
    abstract val lwjglArtifactName: Property<String>
}
