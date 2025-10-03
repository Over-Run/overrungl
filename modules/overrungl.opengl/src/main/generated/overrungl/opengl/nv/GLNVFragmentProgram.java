// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_fragment_program`
public final class GLNVFragmentProgram {
    public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;
    public static final int GL_FRAGMENT_PROGRAM_NV = 0x8870;
    public static final int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
    public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
    public static final int GL_PROGRAM_ERROR_STRING_NV = 0x8874;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glProgramNamedParameter4fNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glProgramNamedParameter4fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramNamedParameter4dNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glProgramNamedParameter4dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetProgramNamedParameterfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetProgramNamedParameterdvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glProgramNamedParameter4fNV;
        public final MemorySegment PFN_glProgramNamedParameter4fvNV;
        public final MemorySegment PFN_glProgramNamedParameter4dNV;
        public final MemorySegment PFN_glProgramNamedParameter4dvNV;
        public final MemorySegment PFN_glGetProgramNamedParameterfvNV;
        public final MemorySegment PFN_glGetProgramNamedParameterdvNV;
        private Handles(GLLoadFunc func) {
            PFN_glProgramNamedParameter4fNV = func.invoke("glProgramNamedParameter4fNV");
            PFN_glProgramNamedParameter4fvNV = func.invoke("glProgramNamedParameter4fvNV");
            PFN_glProgramNamedParameter4dNV = func.invoke("glProgramNamedParameter4dNV");
            PFN_glProgramNamedParameter4dvNV = func.invoke("glProgramNamedParameter4dvNV");
            PFN_glGetProgramNamedParameterfvNV = func.invoke("glGetProgramNamedParameterfvNV");
            PFN_glGetProgramNamedParameterdvNV = func.invoke("glGetProgramNamedParameterdvNV");
        }
    }

    public GLNVFragmentProgram(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProgramNamedParameter4fNV`.
    /// ```
    /// void glProgramNamedParameter4fNV((unsigned int) GLuint id, (int) GLsizei len, const GLubyte* name, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void ProgramNamedParameter4fNV(int id, int len, @NonNull MemorySegment name, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4fNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramNamedParameter4fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramNamedParameter4fNV", id, len, name, x, y, z, w); }
        Handles.MH_glProgramNamedParameter4fNV.get().invokeExact(handles.PFN_glProgramNamedParameter4fNV, id, len, name, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4fNV", e); }
    }

    /// Invokes `glProgramNamedParameter4fvNV`.
    /// ```
    /// void glProgramNamedParameter4fvNV((unsigned int) GLuint id, (int) GLsizei len, const GLubyte* name, const GLfloat* v);
    /// ```
    public void ProgramNamedParameter4fvNV(int id, int len, @NonNull MemorySegment name, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramNamedParameter4fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramNamedParameter4fvNV", id, len, name, v); }
        Handles.MH_glProgramNamedParameter4fvNV.get().invokeExact(handles.PFN_glProgramNamedParameter4fvNV, id, len, name, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4fvNV", e); }
    }

    /// Invokes `glProgramNamedParameter4dNV`.
    /// ```
    /// void glProgramNamedParameter4dNV((unsigned int) GLuint id, (int) GLsizei len, const GLubyte* name, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramNamedParameter4dNV(int id, int len, @NonNull MemorySegment name, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4dNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramNamedParameter4dNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramNamedParameter4dNV", id, len, name, x, y, z, w); }
        Handles.MH_glProgramNamedParameter4dNV.get().invokeExact(handles.PFN_glProgramNamedParameter4dNV, id, len, name, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4dNV", e); }
    }

    /// Invokes `glProgramNamedParameter4dvNV`.
    /// ```
    /// void glProgramNamedParameter4dvNV((unsigned int) GLuint id, (int) GLsizei len, const GLubyte* name, const GLdouble* v);
    /// ```
    public void ProgramNamedParameter4dvNV(int id, int len, @NonNull MemorySegment name, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramNamedParameter4dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramNamedParameter4dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramNamedParameter4dvNV", id, len, name, v); }
        Handles.MH_glProgramNamedParameter4dvNV.get().invokeExact(handles.PFN_glProgramNamedParameter4dvNV, id, len, name, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramNamedParameter4dvNV", e); }
    }

    /// Invokes `glGetProgramNamedParameterfvNV`.
    /// ```
    /// void glGetProgramNamedParameterfvNV((unsigned int) GLuint id, (int) GLsizei len, const GLubyte* name, GLfloat* params);
    /// ```
    public void GetProgramNamedParameterfvNV(int id, int len, @NonNull MemorySegment name, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramNamedParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramNamedParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramNamedParameterfvNV", id, len, name, params); }
        Handles.MH_glGetProgramNamedParameterfvNV.get().invokeExact(handles.PFN_glGetProgramNamedParameterfvNV, id, len, name, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramNamedParameterfvNV", e); }
    }

    /// Invokes `glGetProgramNamedParameterdvNV`.
    /// ```
    /// void glGetProgramNamedParameterdvNV((unsigned int) GLuint id, (int) GLsizei len, const GLubyte* name, GLdouble* params);
    /// ```
    public void GetProgramNamedParameterdvNV(int id, int len, @NonNull MemorySegment name, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramNamedParameterdvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramNamedParameterdvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramNamedParameterdvNV", id, len, name, params); }
        Handles.MH_glGetProgramNamedParameterdvNV.get().invokeExact(handles.PFN_glGetProgramNamedParameterdvNV, id, len, name, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramNamedParameterdvNV", e); }
    }

}
