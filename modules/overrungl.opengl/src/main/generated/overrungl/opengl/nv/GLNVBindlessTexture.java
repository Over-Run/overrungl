// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_bindless_texture`
public final class GLNVBindlessTexture {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureHandleNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureSamplerHandleNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeTextureHandleResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMakeTextureHandleNonResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetImageHandleNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleNonResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformHandleui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniformHandleui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTextureHandleResidentNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glIsImageHandleResidentNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glGetTextureHandleNV;
        public final MemorySegment PFN_glGetTextureSamplerHandleNV;
        public final MemorySegment PFN_glMakeTextureHandleResidentNV;
        public final MemorySegment PFN_glMakeTextureHandleNonResidentNV;
        public final MemorySegment PFN_glGetImageHandleNV;
        public final MemorySegment PFN_glMakeImageHandleResidentNV;
        public final MemorySegment PFN_glMakeImageHandleNonResidentNV;
        public final MemorySegment PFN_glUniformHandleui64NV;
        public final MemorySegment PFN_glUniformHandleui64vNV;
        public final MemorySegment PFN_glProgramUniformHandleui64NV;
        public final MemorySegment PFN_glProgramUniformHandleui64vNV;
        public final MemorySegment PFN_glIsTextureHandleResidentNV;
        public final MemorySegment PFN_glIsImageHandleResidentNV;
        private Handles(GLLoadFunc func) {
            PFN_glGetTextureHandleNV = func.invoke("glGetTextureHandleNV");
            PFN_glGetTextureSamplerHandleNV = func.invoke("glGetTextureSamplerHandleNV");
            PFN_glMakeTextureHandleResidentNV = func.invoke("glMakeTextureHandleResidentNV");
            PFN_glMakeTextureHandleNonResidentNV = func.invoke("glMakeTextureHandleNonResidentNV");
            PFN_glGetImageHandleNV = func.invoke("glGetImageHandleNV");
            PFN_glMakeImageHandleResidentNV = func.invoke("glMakeImageHandleResidentNV");
            PFN_glMakeImageHandleNonResidentNV = func.invoke("glMakeImageHandleNonResidentNV");
            PFN_glUniformHandleui64NV = func.invoke("glUniformHandleui64NV");
            PFN_glUniformHandleui64vNV = func.invoke("glUniformHandleui64vNV");
            PFN_glProgramUniformHandleui64NV = func.invoke("glProgramUniformHandleui64NV");
            PFN_glProgramUniformHandleui64vNV = func.invoke("glProgramUniformHandleui64vNV");
            PFN_glIsTextureHandleResidentNV = func.invoke("glIsTextureHandleResidentNV");
            PFN_glIsImageHandleResidentNV = func.invoke("glIsImageHandleResidentNV");
        }
    }

    public GLNVBindlessTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetTextureHandleNV`.
    /// ```
    /// ((uint64_t) khronos_uint64_t) GLuint64 glGetTextureHandleNV((unsigned int) GLuint texture);
    /// ```
    public long GetTextureHandleNV(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureHandleNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureHandleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureHandleNV", texture); }
        return (long) Handles.MH_glGetTextureHandleNV.invokeExact(handles.PFN_glGetTextureHandleNV, texture); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureHandleNV", e); }
    }

    /// Invokes `glGetTextureSamplerHandleNV`.
    /// ```
    /// ((uint64_t) khronos_uint64_t) GLuint64 glGetTextureSamplerHandleNV((unsigned int) GLuint texture, (unsigned int) GLuint sampler);
    /// ```
    public long GetTextureSamplerHandleNV(int texture, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureSamplerHandleNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureSamplerHandleNV", texture, sampler); }
        return (long) Handles.MH_glGetTextureSamplerHandleNV.invokeExact(handles.PFN_glGetTextureSamplerHandleNV, texture, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureSamplerHandleNV", e); }
    }

    /// Invokes `glMakeTextureHandleResidentNV`.
    /// ```
    /// void glMakeTextureHandleResidentNV(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public void MakeTextureHandleResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeTextureHandleResidentNV", handle); }
        Handles.MH_glMakeTextureHandleResidentNV.invokeExact(handles.PFN_glMakeTextureHandleResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleResidentNV", e); }
    }

    /// Invokes `glMakeTextureHandleNonResidentNV`.
    /// ```
    /// void glMakeTextureHandleNonResidentNV(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public void MakeTextureHandleNonResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleNonResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeTextureHandleNonResidentNV", handle); }
        Handles.MH_glMakeTextureHandleNonResidentNV.invokeExact(handles.PFN_glMakeTextureHandleNonResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleNonResidentNV", e); }
    }

    /// Invokes `glGetImageHandleNV`.
    /// ```
    /// ((uint64_t) khronos_uint64_t) GLuint64 glGetImageHandleNV((unsigned int) GLuint texture, (int) GLint level, GLboolean layered, (int) GLint layer, (unsigned int) GLenum format);
    /// ```
    public long GetImageHandleNV(int texture, int level, boolean layered, int layer, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetImageHandleNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetImageHandleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetImageHandleNV", texture, level, layered, layer, format); }
        return (long) Handles.MH_glGetImageHandleNV.invokeExact(handles.PFN_glGetImageHandleNV, texture, level, ((layered) ? (byte)1 : (byte)0), layer, format); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageHandleNV", e); }
    }

    /// Invokes `glMakeImageHandleResidentNV`.
    /// ```
    /// void glMakeImageHandleResidentNV(((uint64_t) khronos_uint64_t) GLuint64 handle, (unsigned int) GLenum access);
    /// ```
    public void MakeImageHandleResidentNV(long handle, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeImageHandleResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeImageHandleResidentNV", handle, access); }
        Handles.MH_glMakeImageHandleResidentNV.invokeExact(handles.PFN_glMakeImageHandleResidentNV, handle, access); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleResidentNV", e); }
    }

    /// Invokes `glMakeImageHandleNonResidentNV`.
    /// ```
    /// void glMakeImageHandleNonResidentNV(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public void MakeImageHandleNonResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleNonResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeImageHandleNonResidentNV", handle); }
        Handles.MH_glMakeImageHandleNonResidentNV.invokeExact(handles.PFN_glMakeImageHandleNonResidentNV, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleNonResidentNV", e); }
    }

    /// Invokes `glUniformHandleui64NV`.
    /// ```
    /// void glUniformHandleui64NV((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 value);
    /// ```
    public void UniformHandleui64NV(int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniformHandleui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformHandleui64NV", location, value); }
        Handles.MH_glUniformHandleui64NV.invokeExact(handles.PFN_glUniformHandleui64NV, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64NV", e); }
    }

    /// Invokes `glUniformHandleui64vNV`.
    /// ```
    /// void glUniformHandleui64vNV((int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void UniformHandleui64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniformHandleui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformHandleui64vNV", location, count, value); }
        Handles.MH_glUniformHandleui64vNV.invokeExact(handles.PFN_glUniformHandleui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64vNV", e); }
    }

    /// Invokes `glProgramUniformHandleui64NV`.
    /// ```
    /// void glProgramUniformHandleui64NV((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 value);
    /// ```
    public void ProgramUniformHandleui64NV(int program, int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformHandleui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformHandleui64NV", program, location, value); }
        Handles.MH_glProgramUniformHandleui64NV.invokeExact(handles.PFN_glProgramUniformHandleui64NV, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64NV", e); }
    }

    /// Invokes `glProgramUniformHandleui64vNV`.
    /// ```
    /// void glProgramUniformHandleui64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64* values);
    /// ```
    public void ProgramUniformHandleui64vNV(int program, int location, int count, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformHandleui64vNV", program, location, count, values); }
        Handles.MH_glProgramUniformHandleui64vNV.invokeExact(handles.PFN_glProgramUniformHandleui64vNV, program, location, count, values); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64vNV", e); }
    }

    /// Invokes `glIsTextureHandleResidentNV`.
    /// ```
    /// GLboolean glIsTextureHandleResidentNV(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public boolean IsTextureHandleResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTextureHandleResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsTextureHandleResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTextureHandleResidentNV", handle); }
        return (((byte) Handles.MH_glIsTextureHandleResidentNV.invokeExact(handles.PFN_glIsTextureHandleResidentNV, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTextureHandleResidentNV", e); }
    }

    /// Invokes `glIsImageHandleResidentNV`.
    /// ```
    /// GLboolean glIsImageHandleResidentNV(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public boolean IsImageHandleResidentNV(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsImageHandleResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsImageHandleResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsImageHandleResidentNV", handle); }
        return (((byte) Handles.MH_glIsImageHandleResidentNV.invokeExact(handles.PFN_glIsImageHandleResidentNV, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsImageHandleResidentNV", e); }
    }

}
