// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_KHR_parallel_shader_compile`
public final class GLKHRParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_KHR = 0x91B0;
    public static final int GL_COMPLETION_STATUS_KHR = 0x91B1;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMaxShaderCompilerThreadsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMaxShaderCompilerThreadsKHR;
        private Handles(GLLoadFunc func) {
            PFN_glMaxShaderCompilerThreadsKHR = func.invoke("glMaxShaderCompilerThreadsKHR", "glMaxShaderCompilerThreadsARB");
        }
    }

    public GLKHRParallelShaderCompile(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMaxShaderCompilerThreadsKHR`.
    /// ```
    /// void glMaxShaderCompilerThreadsKHR((unsigned int) GLuint count);
    /// ```
    public void MaxShaderCompilerThreadsKHR(int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMaxShaderCompilerThreadsKHR)) throw new GLSymbolNotFoundError("Symbol not found: glMaxShaderCompilerThreadsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMaxShaderCompilerThreadsKHR", count); }
        Handles.MH_glMaxShaderCompilerThreadsKHR.invokeExact(handles.PFN_glMaxShaderCompilerThreadsKHR, count); }
        catch (Throwable e) { throw new RuntimeException("error in MaxShaderCompilerThreadsKHR", e); }
    }

}
