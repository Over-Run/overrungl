import org.gradle.api.Action
import org.gradle.api.Project

val Project.overrunglModule: OverrunGLModuleExtension
    get() = extensions.getByName("overrunglModule") as OverrunGLModuleExtension

fun Project.overrunglModule(configure: Action<OverrunGLModuleExtension>) =
    extensions.configure("overrunglModule", configure)

val Project.overrunglModuleNew: OverrunGLNewModuleExtension
    get() = extensions.getByName("overrunglModuleNew") as OverrunGLNewModuleExtension

fun Project.overrunglModuleNew(configure: Action<OverrunGLNewModuleExtension>) =
    extensions.configure("overrunglModuleNew", configure)
