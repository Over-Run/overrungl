// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_gpu_shader5`
public final class GLNVGpuShader5 {
    public static final int GL_INT64_NV = 0x140E;
    public static final int GL_UNSIGNED_INT64_NV = 0x140F;
    public static final int GL_INT8_NV = 0x8FE0;
    public static final int GL_INT8_VEC2_NV = 0x8FE1;
    public static final int GL_INT8_VEC3_NV = 0x8FE2;
    public static final int GL_INT8_VEC4_NV = 0x8FE3;
    public static final int GL_INT16_NV = 0x8FE4;
    public static final int GL_INT16_VEC2_NV = 0x8FE5;
    public static final int GL_INT16_VEC3_NV = 0x8FE6;
    public static final int GL_INT16_VEC4_NV = 0x8FE7;
    public static final int GL_INT64_VEC2_NV = 0x8FE9;
    public static final int GL_INT64_VEC3_NV = 0x8FEA;
    public static final int GL_INT64_VEC4_NV = 0x8FEB;
    public static final int GL_UNSIGNED_INT8_NV = 0x8FEC;
    public static final int GL_UNSIGNED_INT8_VEC2_NV = 0x8FED;
    public static final int GL_UNSIGNED_INT8_VEC3_NV = 0x8FEE;
    public static final int GL_UNSIGNED_INT8_VEC4_NV = 0x8FEF;
    public static final int GL_UNSIGNED_INT16_NV = 0x8FF0;
    public static final int GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1;
    public static final int GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2;
    public static final int GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3;
    public static final int GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7;
    public static final int GL_FLOAT16_NV = 0x8FF8;
    public static final int GL_FLOAT16_VEC2_NV = 0x8FF9;
    public static final int GL_FLOAT16_VEC3_NV = 0x8FFA;
    public static final int GL_FLOAT16_VEC4_NV = 0x8FFB;
    public static final int GL_PATCHES = 0x000E;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glUniform1i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform2i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform3i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform4i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform1i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform2i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform3i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform4i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform1ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform2ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform3ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform4ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glUniform1ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform2ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform3ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniform4ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetUniformi64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4i64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4i64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4ui64NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4ui64vNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glUniform1i64NV;
        public final MemorySegment PFN_glUniform2i64NV;
        public final MemorySegment PFN_glUniform3i64NV;
        public final MemorySegment PFN_glUniform4i64NV;
        public final MemorySegment PFN_glUniform1i64vNV;
        public final MemorySegment PFN_glUniform2i64vNV;
        public final MemorySegment PFN_glUniform3i64vNV;
        public final MemorySegment PFN_glUniform4i64vNV;
        public final MemorySegment PFN_glUniform1ui64NV;
        public final MemorySegment PFN_glUniform2ui64NV;
        public final MemorySegment PFN_glUniform3ui64NV;
        public final MemorySegment PFN_glUniform4ui64NV;
        public final MemorySegment PFN_glUniform1ui64vNV;
        public final MemorySegment PFN_glUniform2ui64vNV;
        public final MemorySegment PFN_glUniform3ui64vNV;
        public final MemorySegment PFN_glUniform4ui64vNV;
        public final MemorySegment PFN_glGetUniformi64vNV;
        public final MemorySegment PFN_glProgramUniform1i64NV;
        public final MemorySegment PFN_glProgramUniform2i64NV;
        public final MemorySegment PFN_glProgramUniform3i64NV;
        public final MemorySegment PFN_glProgramUniform4i64NV;
        public final MemorySegment PFN_glProgramUniform1i64vNV;
        public final MemorySegment PFN_glProgramUniform2i64vNV;
        public final MemorySegment PFN_glProgramUniform3i64vNV;
        public final MemorySegment PFN_glProgramUniform4i64vNV;
        public final MemorySegment PFN_glProgramUniform1ui64NV;
        public final MemorySegment PFN_glProgramUniform2ui64NV;
        public final MemorySegment PFN_glProgramUniform3ui64NV;
        public final MemorySegment PFN_glProgramUniform4ui64NV;
        public final MemorySegment PFN_glProgramUniform1ui64vNV;
        public final MemorySegment PFN_glProgramUniform2ui64vNV;
        public final MemorySegment PFN_glProgramUniform3ui64vNV;
        public final MemorySegment PFN_glProgramUniform4ui64vNV;
        private Handles(GLLoadFunc func) {
            PFN_glUniform1i64NV = func.invoke("glUniform1i64NV");
            PFN_glUniform2i64NV = func.invoke("glUniform2i64NV");
            PFN_glUniform3i64NV = func.invoke("glUniform3i64NV");
            PFN_glUniform4i64NV = func.invoke("glUniform4i64NV");
            PFN_glUniform1i64vNV = func.invoke("glUniform1i64vNV");
            PFN_glUniform2i64vNV = func.invoke("glUniform2i64vNV");
            PFN_glUniform3i64vNV = func.invoke("glUniform3i64vNV");
            PFN_glUniform4i64vNV = func.invoke("glUniform4i64vNV");
            PFN_glUniform1ui64NV = func.invoke("glUniform1ui64NV");
            PFN_glUniform2ui64NV = func.invoke("glUniform2ui64NV");
            PFN_glUniform3ui64NV = func.invoke("glUniform3ui64NV");
            PFN_glUniform4ui64NV = func.invoke("glUniform4ui64NV");
            PFN_glUniform1ui64vNV = func.invoke("glUniform1ui64vNV");
            PFN_glUniform2ui64vNV = func.invoke("glUniform2ui64vNV");
            PFN_glUniform3ui64vNV = func.invoke("glUniform3ui64vNV");
            PFN_glUniform4ui64vNV = func.invoke("glUniform4ui64vNV");
            PFN_glGetUniformi64vNV = func.invoke("glGetUniformi64vNV");PFN_glProgramUniform1i64NV = func.invoke("glProgramUniform1i64NV");
            PFN_glProgramUniform2i64NV = func.invoke("glProgramUniform2i64NV");
            PFN_glProgramUniform3i64NV = func.invoke("glProgramUniform3i64NV");
            PFN_glProgramUniform4i64NV = func.invoke("glProgramUniform4i64NV");
            PFN_glProgramUniform1i64vNV = func.invoke("glProgramUniform1i64vNV");
            PFN_glProgramUniform2i64vNV = func.invoke("glProgramUniform2i64vNV");
            PFN_glProgramUniform3i64vNV = func.invoke("glProgramUniform3i64vNV");
            PFN_glProgramUniform4i64vNV = func.invoke("glProgramUniform4i64vNV");
            PFN_glProgramUniform1ui64NV = func.invoke("glProgramUniform1ui64NV");
            PFN_glProgramUniform2ui64NV = func.invoke("glProgramUniform2ui64NV");
            PFN_glProgramUniform3ui64NV = func.invoke("glProgramUniform3ui64NV");
            PFN_glProgramUniform4ui64NV = func.invoke("glProgramUniform4ui64NV");
            PFN_glProgramUniform1ui64vNV = func.invoke("glProgramUniform1ui64vNV");
            PFN_glProgramUniform2ui64vNV = func.invoke("glProgramUniform2ui64vNV");
            PFN_glProgramUniform3ui64vNV = func.invoke("glProgramUniform3ui64vNV");
            PFN_glProgramUniform4ui64vNV = func.invoke("glProgramUniform4ui64vNV");
        }
    }

    public GLNVGpuShader5(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUniform1i64NV`.
    /// ```
    /// void glUniform1i64NV((int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x);
    /// ```
    public void Uniform1i64NV(int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1i64NV", location, x); }
        Handles.MH_glUniform1i64NV.get().invokeExact(handles.PFN_glUniform1i64NV, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i64NV", e); }
    }

    /// Invokes `glUniform2i64NV`.
    /// ```
    /// void glUniform2i64NV((int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y);
    /// ```
    public void Uniform2i64NV(int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2i64NV", location, x, y); }
        Handles.MH_glUniform2i64NV.get().invokeExact(handles.PFN_glUniform2i64NV, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i64NV", e); }
    }

    /// Invokes `glUniform3i64NV`.
    /// ```
    /// void glUniform3i64NV((int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y, ((int64_t) khronos_int64_t) GLint64EXT z);
    /// ```
    public void Uniform3i64NV(int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3i64NV", location, x, y, z); }
        Handles.MH_glUniform3i64NV.get().invokeExact(handles.PFN_glUniform3i64NV, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i64NV", e); }
    }

    /// Invokes `glUniform4i64NV`.
    /// ```
    /// void glUniform4i64NV((int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y, ((int64_t) khronos_int64_t) GLint64EXT z, ((int64_t) khronos_int64_t) GLint64EXT w);
    /// ```
    public void Uniform4i64NV(int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4i64NV", location, x, y, z, w); }
        Handles.MH_glUniform4i64NV.get().invokeExact(handles.PFN_glUniform4i64NV, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i64NV", e); }
    }

    /// Invokes `glUniform1i64vNV`.
    /// ```
    /// void glUniform1i64vNV((int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform1i64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1i64vNV", location, count, value); }
        Handles.MH_glUniform1i64vNV.get().invokeExact(handles.PFN_glUniform1i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i64vNV", e); }
    }

    /// Invokes `glUniform2i64vNV`.
    /// ```
    /// void glUniform2i64vNV((int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform2i64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2i64vNV", location, count, value); }
        Handles.MH_glUniform2i64vNV.get().invokeExact(handles.PFN_glUniform2i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i64vNV", e); }
    }

    /// Invokes `glUniform3i64vNV`.
    /// ```
    /// void glUniform3i64vNV((int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform3i64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3i64vNV", location, count, value); }
        Handles.MH_glUniform3i64vNV.get().invokeExact(handles.PFN_glUniform3i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i64vNV", e); }
    }

    /// Invokes `glUniform4i64vNV`.
    /// ```
    /// void glUniform4i64vNV((int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void Uniform4i64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4i64vNV", location, count, value); }
        Handles.MH_glUniform4i64vNV.get().invokeExact(handles.PFN_glUniform4i64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i64vNV", e); }
    }

    /// Invokes `glUniform1ui64NV`.
    /// ```
    /// void glUniform1ui64NV((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x);
    /// ```
    public void Uniform1ui64NV(int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1ui64NV", location, x); }
        Handles.MH_glUniform1ui64NV.get().invokeExact(handles.PFN_glUniform1ui64NV, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui64NV", e); }
    }

    /// Invokes `glUniform2ui64NV`.
    /// ```
    /// void glUniform2ui64NV((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y);
    /// ```
    public void Uniform2ui64NV(int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2ui64NV", location, x, y); }
        Handles.MH_glUniform2ui64NV.get().invokeExact(handles.PFN_glUniform2ui64NV, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui64NV", e); }
    }

    /// Invokes `glUniform3ui64NV`.
    /// ```
    /// void glUniform3ui64NV((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y, ((uint64_t) khronos_uint64_t) GLuint64EXT z);
    /// ```
    public void Uniform3ui64NV(int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3ui64NV", location, x, y, z); }
        Handles.MH_glUniform3ui64NV.get().invokeExact(handles.PFN_glUniform3ui64NV, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui64NV", e); }
    }

    /// Invokes `glUniform4ui64NV`.
    /// ```
    /// void glUniform4ui64NV((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y, ((uint64_t) khronos_uint64_t) GLuint64EXT z, ((uint64_t) khronos_uint64_t) GLuint64EXT w);
    /// ```
    public void Uniform4ui64NV(int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4ui64NV", location, x, y, z, w); }
        Handles.MH_glUniform4ui64NV.get().invokeExact(handles.PFN_glUniform4ui64NV, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui64NV", e); }
    }

    /// Invokes `glUniform1ui64vNV`.
    /// ```
    /// void glUniform1ui64vNV((int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform1ui64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1ui64vNV", location, count, value); }
        Handles.MH_glUniform1ui64vNV.get().invokeExact(handles.PFN_glUniform1ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui64vNV", e); }
    }

    /// Invokes `glUniform2ui64vNV`.
    /// ```
    /// void glUniform2ui64vNV((int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform2ui64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2ui64vNV", location, count, value); }
        Handles.MH_glUniform2ui64vNV.get().invokeExact(handles.PFN_glUniform2ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui64vNV", e); }
    }

    /// Invokes `glUniform3ui64vNV`.
    /// ```
    /// void glUniform3ui64vNV((int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform3ui64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3ui64vNV", location, count, value); }
        Handles.MH_glUniform3ui64vNV.get().invokeExact(handles.PFN_glUniform3ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui64vNV", e); }
    }

    /// Invokes `glUniform4ui64vNV`.
    /// ```
    /// void glUniform4ui64vNV((int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniform4ui64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4ui64vNV", location, count, value); }
        Handles.MH_glUniform4ui64vNV.get().invokeExact(handles.PFN_glUniform4ui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui64vNV", e); }
    }

    /// Invokes `glGetUniformi64vNV`.
    /// ```
    /// void glGetUniformi64vNV((unsigned int) GLuint program, (int) GLint location, GLint64EXT* params);
    /// ```
    public void GetUniformi64vNV(int program, int location, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformi64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformi64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformi64vNV", program, location, params); }
        Handles.MH_glGetUniformi64vNV.get().invokeExact(handles.PFN_glGetUniformi64vNV, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformi64vNV", e); }
    }

    /// Invokes `glProgramUniform1i64NV`.
    /// ```
    /// void glProgramUniform1i64NV((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x);
    /// ```
    public void ProgramUniform1i64NV(int program, int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1i64NV", program, location, x); }
        Handles.MH_glProgramUniform1i64NV.get().invokeExact(handles.PFN_glProgramUniform1i64NV, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i64NV", e); }
    }

    /// Invokes `glProgramUniform2i64NV`.
    /// ```
    /// void glProgramUniform2i64NV((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y);
    /// ```
    public void ProgramUniform2i64NV(int program, int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2i64NV", program, location, x, y); }
        Handles.MH_glProgramUniform2i64NV.get().invokeExact(handles.PFN_glProgramUniform2i64NV, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i64NV", e); }
    }

    /// Invokes `glProgramUniform3i64NV`.
    /// ```
    /// void glProgramUniform3i64NV((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y, ((int64_t) khronos_int64_t) GLint64EXT z);
    /// ```
    public void ProgramUniform3i64NV(int program, int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3i64NV", program, location, x, y, z); }
        Handles.MH_glProgramUniform3i64NV.get().invokeExact(handles.PFN_glProgramUniform3i64NV, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i64NV", e); }
    }

    /// Invokes `glProgramUniform4i64NV`.
    /// ```
    /// void glProgramUniform4i64NV((unsigned int) GLuint program, (int) GLint location, ((int64_t) khronos_int64_t) GLint64EXT x, ((int64_t) khronos_int64_t) GLint64EXT y, ((int64_t) khronos_int64_t) GLint64EXT z, ((int64_t) khronos_int64_t) GLint64EXT w);
    /// ```
    public void ProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4i64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4i64NV", program, location, x, y, z, w); }
        Handles.MH_glProgramUniform4i64NV.get().invokeExact(handles.PFN_glProgramUniform4i64NV, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i64NV", e); }
    }

    /// Invokes `glProgramUniform1i64vNV`.
    /// ```
    /// void glProgramUniform1i64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform1i64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1i64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform1i64vNV.get().invokeExact(handles.PFN_glProgramUniform1i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i64vNV", e); }
    }

    /// Invokes `glProgramUniform2i64vNV`.
    /// ```
    /// void glProgramUniform2i64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform2i64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2i64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform2i64vNV.get().invokeExact(handles.PFN_glProgramUniform2i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i64vNV", e); }
    }

    /// Invokes `glProgramUniform3i64vNV`.
    /// ```
    /// void glProgramUniform3i64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform3i64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3i64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform3i64vNV.get().invokeExact(handles.PFN_glProgramUniform3i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i64vNV", e); }
    }

    /// Invokes `glProgramUniform4i64vNV`.
    /// ```
    /// void glProgramUniform4i64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint64EXT* value);
    /// ```
    public void ProgramUniform4i64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4i64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4i64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform4i64vNV.get().invokeExact(handles.PFN_glProgramUniform4i64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i64vNV", e); }
    }

    /// Invokes `glProgramUniform1ui64NV`.
    /// ```
    /// void glProgramUniform1ui64NV((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x);
    /// ```
    public void ProgramUniform1ui64NV(int program, int location, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1ui64NV", program, location, x); }
        Handles.MH_glProgramUniform1ui64NV.get().invokeExact(handles.PFN_glProgramUniform1ui64NV, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui64NV", e); }
    }

    /// Invokes `glProgramUniform2ui64NV`.
    /// ```
    /// void glProgramUniform2ui64NV((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y);
    /// ```
    public void ProgramUniform2ui64NV(int program, int location, long x, long y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2ui64NV", program, location, x, y); }
        Handles.MH_glProgramUniform2ui64NV.get().invokeExact(handles.PFN_glProgramUniform2ui64NV, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui64NV", e); }
    }

    /// Invokes `glProgramUniform3ui64NV`.
    /// ```
    /// void glProgramUniform3ui64NV((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y, ((uint64_t) khronos_uint64_t) GLuint64EXT z);
    /// ```
    public void ProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3ui64NV", program, location, x, y, z); }
        Handles.MH_glProgramUniform3ui64NV.get().invokeExact(handles.PFN_glProgramUniform3ui64NV, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui64NV", e); }
    }

    /// Invokes `glProgramUniform4ui64NV`.
    /// ```
    /// void glProgramUniform4ui64NV((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT x, ((uint64_t) khronos_uint64_t) GLuint64EXT y, ((uint64_t) khronos_uint64_t) GLuint64EXT z, ((uint64_t) khronos_uint64_t) GLuint64EXT w);
    /// ```
    public void ProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4ui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4ui64NV", program, location, x, y, z, w); }
        Handles.MH_glProgramUniform4ui64NV.get().invokeExact(handles.PFN_glProgramUniform4ui64NV, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui64NV", e); }
    }

    /// Invokes `glProgramUniform1ui64vNV`.
    /// ```
    /// void glProgramUniform1ui64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform1ui64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1ui64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform1ui64vNV.get().invokeExact(handles.PFN_glProgramUniform1ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui64vNV", e); }
    }

    /// Invokes `glProgramUniform2ui64vNV`.
    /// ```
    /// void glProgramUniform2ui64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform2ui64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2ui64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform2ui64vNV.get().invokeExact(handles.PFN_glProgramUniform2ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui64vNV", e); }
    }

    /// Invokes `glProgramUniform3ui64vNV`.
    /// ```
    /// void glProgramUniform3ui64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform3ui64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3ui64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform3ui64vNV.get().invokeExact(handles.PFN_glProgramUniform3ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui64vNV", e); }
    }

    /// Invokes `glProgramUniform4ui64vNV`.
    /// ```
    /// void glProgramUniform4ui64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniform4ui64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4ui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4ui64vNV", program, location, count, value); }
        Handles.MH_glProgramUniform4ui64vNV.get().invokeExact(handles.PFN_glProgramUniform4ui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui64vNV", e); }
    }

}
