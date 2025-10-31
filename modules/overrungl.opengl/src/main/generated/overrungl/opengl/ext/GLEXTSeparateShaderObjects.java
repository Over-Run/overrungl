// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_separate_shader_objects`
public final class GLEXTSeparateShaderObjects {
    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUseShaderProgramEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glActiveProgramEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShaderProgramEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUseShaderProgramEXT;
        public final MemorySegment PFN_glActiveProgramEXT;
        public final MemorySegment PFN_glCreateShaderProgramEXT;
        private Handles(GLLoadFunc func) {
            PFN_glUseShaderProgramEXT = func.invoke("glUseShaderProgramEXT");
            PFN_glActiveProgramEXT = func.invoke("glActiveProgramEXT");
            PFN_glCreateShaderProgramEXT = func.invoke("glCreateShaderProgramEXT");
        }
    }

    public GLEXTSeparateShaderObjects(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUseShaderProgramEXT`.
    /// ```
    /// void glUseShaderProgramEXT((unsigned int) GLenum type, (unsigned int) GLuint program);
    /// ```
    public void UseShaderProgramEXT(int type, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseShaderProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glUseShaderProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUseShaderProgramEXT", type, program); }
        Handles.MH_glUseShaderProgramEXT.invokeExact(handles.PFN_glUseShaderProgramEXT, type, program); }
        catch (Throwable e) { throw new RuntimeException("error in UseShaderProgramEXT", e); }
    }

    /// Invokes `glActiveProgramEXT`.
    /// ```
    /// void glActiveProgramEXT((unsigned int) GLuint program);
    /// ```
    public void ActiveProgramEXT(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glActiveProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveProgramEXT", program); }
        Handles.MH_glActiveProgramEXT.invokeExact(handles.PFN_glActiveProgramEXT, program); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveProgramEXT", e); }
    }

    /// Invokes `glCreateShaderProgramEXT`.
    /// ```
    /// (unsigned int) GLuint glCreateShaderProgramEXT((unsigned int) GLenum type, const GLchar* string);
    /// ```
    public int CreateShaderProgramEXT(int type, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShaderProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCreateShaderProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateShaderProgramEXT", type, string); }
        return (int) Handles.MH_glCreateShaderProgramEXT.invokeExact(handles.PFN_glCreateShaderProgramEXT, type, string); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderProgramEXT", e); }
    }

}
