// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_gpu_program_parameters`
public final class GLEXTGpuProgramParameters {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glProgramEnvParameters4fvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramLocalParameters4fvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glProgramEnvParameters4fvEXT;
        public final MemorySegment PFN_glProgramLocalParameters4fvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glProgramEnvParameters4fvEXT = func.invoke("glProgramEnvParameters4fvEXT");
            PFN_glProgramLocalParameters4fvEXT = func.invoke("glProgramLocalParameters4fvEXT");
        }
    }

    public GLEXTGpuProgramParameters(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProgramEnvParameters4fvEXT`.
    /// ```
    /// void glProgramEnvParameters4fvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLfloat* params);
    /// ```
    public void ProgramEnvParameters4fvEXT(int target, int index, int count, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameters4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameters4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameters4fvEXT", target, index, count, params); }
        Handles.MH_glProgramEnvParameters4fvEXT.get().invokeExact(handles.PFN_glProgramEnvParameters4fvEXT, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameters4fvEXT", e); }
    }

    /// Invokes `glProgramLocalParameters4fvEXT`.
    /// ```
    /// void glProgramLocalParameters4fvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLfloat* params);
    /// ```
    public void ProgramLocalParameters4fvEXT(int target, int index, int count, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameters4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameters4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameters4fvEXT", target, index, count, params); }
        Handles.MH_glProgramLocalParameters4fvEXT.get().invokeExact(handles.PFN_glProgramLocalParameters4fvEXT, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameters4fvEXT", e); }
    }

}
