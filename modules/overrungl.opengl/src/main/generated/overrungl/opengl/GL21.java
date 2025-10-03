// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// Constants and functions of OpenGL 2.1.
public class GL21 extends GL20 {
    public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
    public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    public static final int GL_FLOAT_MAT2x3 = 0x8B65;
    public static final int GL_FLOAT_MAT2x4 = 0x8B66;
    public static final int GL_FLOAT_MAT3x2 = 0x8B67;
    public static final int GL_FLOAT_MAT3x4 = 0x8B68;
    public static final int GL_FLOAT_MAT4x2 = 0x8B69;
    public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
    public static final int GL_SRGB = 0x8C40;
    public static final int GL_SRGB8 = 0x8C41;
    public static final int GL_SRGB_ALPHA = 0x8C42;
    public static final int GL_SRGB8_ALPHA8 = 0x8C43;
    public static final int GL_COMPRESSED_SRGB = 0x8C48;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glUniformMatrix2x3fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniformMatrix3x2fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniformMatrix2x4fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniformMatrix4x2fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniformMatrix3x4fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glUniformMatrix4x3fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glUniformMatrix2x3fv;
        public final MemorySegment PFN_glUniformMatrix3x2fv;
        public final MemorySegment PFN_glUniformMatrix2x4fv;
        public final MemorySegment PFN_glUniformMatrix4x2fv;
        public final MemorySegment PFN_glUniformMatrix3x4fv;
        public final MemorySegment PFN_glUniformMatrix4x3fv;
        private Handles(GLLoadFunc func) {
            PFN_glUniformMatrix2x3fv = func.invoke("glUniformMatrix2x3fv", "glUniformMatrix2x3fvNV");
            PFN_glUniformMatrix3x2fv = func.invoke("glUniformMatrix3x2fv", "glUniformMatrix3x2fvNV");
            PFN_glUniformMatrix2x4fv = func.invoke("glUniformMatrix2x4fv", "glUniformMatrix2x4fvNV");
            PFN_glUniformMatrix4x2fv = func.invoke("glUniformMatrix4x2fv", "glUniformMatrix4x2fvNV");
            PFN_glUniformMatrix3x4fv = func.invoke("glUniformMatrix3x4fv", "glUniformMatrix3x4fvNV");
            PFN_glUniformMatrix4x3fv = func.invoke("glUniformMatrix4x3fv", "glUniformMatrix4x3fvNV");
        }
    }

    public GL21(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// Invokes `glUniformMatrix2x3fv`.
    /// ```
    /// void glUniformMatrix2x3fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix2x3fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2x3fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2x3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2x3fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2x3fv.get().invokeExact(handles.PFN_glUniformMatrix2x3fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2x3fv", e); }
    }

    /// Invokes `glUniformMatrix3x2fv`.
    /// ```
    /// void glUniformMatrix3x2fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix3x2fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3x2fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3x2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3x2fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3x2fv.get().invokeExact(handles.PFN_glUniformMatrix3x2fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3x2fv", e); }
    }

    /// Invokes `glUniformMatrix2x4fv`.
    /// ```
    /// void glUniformMatrix2x4fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix2x4fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2x4fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2x4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2x4fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2x4fv.get().invokeExact(handles.PFN_glUniformMatrix2x4fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2x4fv", e); }
    }

    /// Invokes `glUniformMatrix4x2fv`.
    /// ```
    /// void glUniformMatrix4x2fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix4x2fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4x2fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4x2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4x2fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4x2fv.get().invokeExact(handles.PFN_glUniformMatrix4x2fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4x2fv", e); }
    }

    /// Invokes `glUniformMatrix3x4fv`.
    /// ```
    /// void glUniformMatrix3x4fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix3x4fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3x4fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3x4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3x4fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3x4fv.get().invokeExact(handles.PFN_glUniformMatrix3x4fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3x4fv", e); }
    }

    /// Invokes `glUniformMatrix4x3fv`.
    /// ```
    /// void glUniformMatrix4x3fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix4x3fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4x3fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4x3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4x3fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4x3fv.get().invokeExact(handles.PFN_glUniformMatrix4x3fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4x3fv", e); }
    }

}
