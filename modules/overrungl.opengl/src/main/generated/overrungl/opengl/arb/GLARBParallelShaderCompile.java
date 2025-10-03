// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_parallel_shader_compile`
public final class GLARBParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;
    public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glMaxShaderCompilerThreadsARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glMaxShaderCompilerThreadsARB;
        private Handles(GLLoadFunc func) {
            PFN_glMaxShaderCompilerThreadsARB = func.invoke("glMaxShaderCompilerThreadsARB", "glMaxShaderCompilerThreadsKHR");
        }
    }

    public GLARBParallelShaderCompile(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMaxShaderCompilerThreadsARB`.
    /// ```
    /// void glMaxShaderCompilerThreadsARB((unsigned int) GLuint count);
    /// ```
    public void MaxShaderCompilerThreadsARB(int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMaxShaderCompilerThreadsARB)) throw new GLSymbolNotFoundError("Symbol not found: glMaxShaderCompilerThreadsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMaxShaderCompilerThreadsARB", count); }
        Handles.MH_glMaxShaderCompilerThreadsARB.get().invokeExact(handles.PFN_glMaxShaderCompilerThreadsARB, count); }
        catch (Throwable e) { throw new RuntimeException("error in MaxShaderCompilerThreadsARB", e); }
    }

}
