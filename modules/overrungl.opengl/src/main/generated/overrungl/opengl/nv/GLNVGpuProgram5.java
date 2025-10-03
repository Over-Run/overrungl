// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_gpu_program5`
public final class GLNVGpuProgram5 {
    public static final int GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV = 0x8E5A;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5B;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5C;
    public static final int GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV = 0x8E5D;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5E;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5F;
    public static final int GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV = 0x8F44;
    public static final int GL_MAX_PROGRAM_SUBROUTINE_NUM_NV = 0x8F45;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramSubroutineParametersuivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramSubroutineParameteruivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glProgramSubroutineParametersuivNV;
        public final MemorySegment PFN_glGetProgramSubroutineParameteruivNV;
        private Handles(GLLoadFunc func) {
            PFN_glProgramSubroutineParametersuivNV = func.invoke("glProgramSubroutineParametersuivNV");
            PFN_glGetProgramSubroutineParameteruivNV = func.invoke("glGetProgramSubroutineParameteruivNV");
        }
    }

    public GLNVGpuProgram5(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProgramSubroutineParametersuivNV`.
    /// ```
    /// void glProgramSubroutineParametersuivNV((unsigned int) GLenum target, (int) GLsizei count, const GLuint* params);
    /// ```
    public void ProgramSubroutineParametersuivNV(int target, int count, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramSubroutineParametersuivNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramSubroutineParametersuivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramSubroutineParametersuivNV", target, count, params); }
        Handles.MH_glProgramSubroutineParametersuivNV.invokeExact(handles.PFN_glProgramSubroutineParametersuivNV, target, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramSubroutineParametersuivNV", e); }
    }

    /// Invokes `glGetProgramSubroutineParameteruivNV`.
    /// ```
    /// void glGetProgramSubroutineParameteruivNV((unsigned int) GLenum target, (unsigned int) GLuint index, GLuint* param);
    /// ```
    public void GetProgramSubroutineParameteruivNV(int target, int index, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramSubroutineParameteruivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramSubroutineParameteruivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramSubroutineParameteruivNV", target, index, param); }
        Handles.MH_glGetProgramSubroutineParameteruivNV.invokeExact(handles.PFN_glGetProgramSubroutineParameteruivNV, target, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramSubroutineParameteruivNV", e); }
    }

}
