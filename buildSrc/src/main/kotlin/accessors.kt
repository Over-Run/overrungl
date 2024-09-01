import org.gradle.api.Action
import org.gradle.api.Project

val Project.overrunglModule: OverrunGLModuleExtension
    get() = extensions.getByName("overrunglModule") as OverrunGLModuleExtension

fun Project.overrunglModule(configure: Action<OverrunGLModuleExtension>) =
    extensions.configure("overrunglModule", configure)
