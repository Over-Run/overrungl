// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_gpu_shader_fp64`
public final class GLARBGpuShaderFp64 {
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_DOUBLE_VEC2 = 0x8FFC;
    public static final int GL_DOUBLE_VEC3 = 0x8FFD;
    public static final int GL_DOUBLE_VEC4 = 0x8FFE;
    public static final int GL_DOUBLE_MAT2 = 0x8F46;
    public static final int GL_DOUBLE_MAT3 = 0x8F47;
    public static final int GL_DOUBLE_MAT4 = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUniform1d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform2d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform3d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform4d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform1dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2x3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2x4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3x2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3x4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4x2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4x3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformdv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUniform1d;
        public final MemorySegment PFN_glUniform2d;
        public final MemorySegment PFN_glUniform3d;
        public final MemorySegment PFN_glUniform4d;
        public final MemorySegment PFN_glUniform1dv;
        public final MemorySegment PFN_glUniform2dv;
        public final MemorySegment PFN_glUniform3dv;
        public final MemorySegment PFN_glUniform4dv;
        public final MemorySegment PFN_glUniformMatrix2dv;
        public final MemorySegment PFN_glUniformMatrix3dv;
        public final MemorySegment PFN_glUniformMatrix4dv;
        public final MemorySegment PFN_glUniformMatrix2x3dv;
        public final MemorySegment PFN_glUniformMatrix2x4dv;
        public final MemorySegment PFN_glUniformMatrix3x2dv;
        public final MemorySegment PFN_glUniformMatrix3x4dv;
        public final MemorySegment PFN_glUniformMatrix4x2dv;
        public final MemorySegment PFN_glUniformMatrix4x3dv;
        public final MemorySegment PFN_glGetUniformdv;
        private Handles(GLLoadFunc func) {
            PFN_glUniform1d = func.invoke("glUniform1d");
            PFN_glUniform2d = func.invoke("glUniform2d");
            PFN_glUniform3d = func.invoke("glUniform3d");
            PFN_glUniform4d = func.invoke("glUniform4d");
            PFN_glUniform1dv = func.invoke("glUniform1dv");
            PFN_glUniform2dv = func.invoke("glUniform2dv");
            PFN_glUniform3dv = func.invoke("glUniform3dv");
            PFN_glUniform4dv = func.invoke("glUniform4dv");
            PFN_glUniformMatrix2dv = func.invoke("glUniformMatrix2dv");
            PFN_glUniformMatrix3dv = func.invoke("glUniformMatrix3dv");
            PFN_glUniformMatrix4dv = func.invoke("glUniformMatrix4dv");
            PFN_glUniformMatrix2x3dv = func.invoke("glUniformMatrix2x3dv");
            PFN_glUniformMatrix2x4dv = func.invoke("glUniformMatrix2x4dv");
            PFN_glUniformMatrix3x2dv = func.invoke("glUniformMatrix3x2dv");
            PFN_glUniformMatrix3x4dv = func.invoke("glUniformMatrix3x4dv");
            PFN_glUniformMatrix4x2dv = func.invoke("glUniformMatrix4x2dv");
            PFN_glUniformMatrix4x3dv = func.invoke("glUniformMatrix4x3dv");
            PFN_glGetUniformdv = func.invoke("glGetUniformdv");
        }
    }

    public GLARBGpuShaderFp64(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUniform1d`.
    /// ```
    /// void glUniform1d((int) GLint location, (double) GLdouble x);
    /// ```
    public void Uniform1d(int location, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1d", location, x); }
        Handles.MH_glUniform1d.invokeExact(handles.PFN_glUniform1d, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1d", e); }
    }

    /// Invokes `glUniform2d`.
    /// ```
    /// void glUniform2d((int) GLint location, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void Uniform2d(int location, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2d", location, x, y); }
        Handles.MH_glUniform2d.invokeExact(handles.PFN_glUniform2d, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2d", e); }
    }

    /// Invokes `glUniform3d`.
    /// ```
    /// void glUniform3d((int) GLint location, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void Uniform3d(int location, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3d", location, x, y, z); }
        Handles.MH_glUniform3d.invokeExact(handles.PFN_glUniform3d, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3d", e); }
    }

    /// Invokes `glUniform4d`.
    /// ```
    /// void glUniform4d((int) GLint location, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void Uniform4d(int location, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4d", location, x, y, z, w); }
        Handles.MH_glUniform4d.invokeExact(handles.PFN_glUniform4d, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4d", e); }
    }

    /// Invokes `glUniform1dv`.
    /// ```
    /// void glUniform1dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform1dv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1dv", location, count, value); }
        Handles.MH_glUniform1dv.invokeExact(handles.PFN_glUniform1dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1dv", e); }
    }

    /// Invokes `glUniform2dv`.
    /// ```
    /// void glUniform2dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform2dv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2dv", location, count, value); }
        Handles.MH_glUniform2dv.invokeExact(handles.PFN_glUniform2dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2dv", e); }
    }

    /// Invokes `glUniform3dv`.
    /// ```
    /// void glUniform3dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform3dv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3dv", location, count, value); }
        Handles.MH_glUniform3dv.invokeExact(handles.PFN_glUniform3dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3dv", e); }
    }

    /// Invokes `glUniform4dv`.
    /// ```
    /// void glUniform4dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform4dv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4dv", location, count, value); }
        Handles.MH_glUniform4dv.invokeExact(handles.PFN_glUniform4dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4dv", e); }
    }

    /// Invokes `glUniformMatrix2dv`.
    /// ```
    /// void glUniformMatrix2dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix2dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2dv.invokeExact(handles.PFN_glUniformMatrix2dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2dv", e); }
    }

    /// Invokes `glUniformMatrix3dv`.
    /// ```
    /// void glUniformMatrix3dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix3dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3dv.invokeExact(handles.PFN_glUniformMatrix3dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3dv", e); }
    }

    /// Invokes `glUniformMatrix4dv`.
    /// ```
    /// void glUniformMatrix4dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix4dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4dv.invokeExact(handles.PFN_glUniformMatrix4dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4dv", e); }
    }

    /// Invokes `glUniformMatrix2x3dv`.
    /// ```
    /// void glUniformMatrix2x3dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix2x3dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2x3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2x3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2x3dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2x3dv.invokeExact(handles.PFN_glUniformMatrix2x3dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2x3dv", e); }
    }

    /// Invokes `glUniformMatrix2x4dv`.
    /// ```
    /// void glUniformMatrix2x4dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix2x4dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2x4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2x4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2x4dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2x4dv.invokeExact(handles.PFN_glUniformMatrix2x4dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2x4dv", e); }
    }

    /// Invokes `glUniformMatrix3x2dv`.
    /// ```
    /// void glUniformMatrix3x2dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix3x2dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3x2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3x2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3x2dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3x2dv.invokeExact(handles.PFN_glUniformMatrix3x2dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3x2dv", e); }
    }

    /// Invokes `glUniformMatrix3x4dv`.
    /// ```
    /// void glUniformMatrix3x4dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix3x4dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3x4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3x4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3x4dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3x4dv.invokeExact(handles.PFN_glUniformMatrix3x4dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3x4dv", e); }
    }

    /// Invokes `glUniformMatrix4x2dv`.
    /// ```
    /// void glUniformMatrix4x2dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix4x2dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4x2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4x2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4x2dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4x2dv.invokeExact(handles.PFN_glUniformMatrix4x2dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4x2dv", e); }
    }

    /// Invokes `glUniformMatrix4x3dv`.
    /// ```
    /// void glUniformMatrix4x3dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix4x3dv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4x3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4x3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4x3dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4x3dv.invokeExact(handles.PFN_glUniformMatrix4x3dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4x3dv", e); }
    }

    /// Invokes `glGetUniformdv`.
    /// ```
    /// void glGetUniformdv((unsigned int) GLuint program, (int) GLint location, GLdouble* params);
    /// ```
    public void GetUniformdv(int program, int location, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformdv)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformdv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformdv", program, location, params); }
        Handles.MH_glGetUniformdv.invokeExact(handles.PFN_glGetUniformdv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformdv", e); }
    }

}
