// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_bindless_texture`
public final class GLARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTextureHandleARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureSamplerHandleARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeTextureHandleResidentARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMakeTextureHandleNonResidentARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetImageHandleARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleResidentARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeImageHandleNonResidentARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64ARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformHandleui64vARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformHandleui64ARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniformHandleui64vARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTextureHandleResidentARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glIsImageHandleResidentARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL1ui64ARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexAttribL1ui64vARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLui64vARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetTextureHandleARB;
        public final MemorySegment PFN_glGetTextureSamplerHandleARB;
        public final MemorySegment PFN_glMakeTextureHandleResidentARB;
        public final MemorySegment PFN_glMakeTextureHandleNonResidentARB;
        public final MemorySegment PFN_glGetImageHandleARB;
        public final MemorySegment PFN_glMakeImageHandleResidentARB;
        public final MemorySegment PFN_glMakeImageHandleNonResidentARB;
        public final MemorySegment PFN_glUniformHandleui64ARB;
        public final MemorySegment PFN_glUniformHandleui64vARB;
        public final MemorySegment PFN_glProgramUniformHandleui64ARB;
        public final MemorySegment PFN_glProgramUniformHandleui64vARB;
        public final MemorySegment PFN_glIsTextureHandleResidentARB;
        public final MemorySegment PFN_glIsImageHandleResidentARB;
        public final MemorySegment PFN_glVertexAttribL1ui64ARB;
        public final MemorySegment PFN_glVertexAttribL1ui64vARB;
        public final MemorySegment PFN_glGetVertexAttribLui64vARB;
        private Handles(GLLoadFunc func) {
            PFN_glGetTextureHandleARB = func.invoke("glGetTextureHandleARB", "glGetTextureHandleIMG");
            PFN_glGetTextureSamplerHandleARB = func.invoke("glGetTextureSamplerHandleARB", "glGetTextureSamplerHandleIMG");
            PFN_glMakeTextureHandleResidentARB = func.invoke("glMakeTextureHandleResidentARB");
            PFN_glMakeTextureHandleNonResidentARB = func.invoke("glMakeTextureHandleNonResidentARB");
            PFN_glGetImageHandleARB = func.invoke("glGetImageHandleARB");
            PFN_glMakeImageHandleResidentARB = func.invoke("glMakeImageHandleResidentARB");
            PFN_glMakeImageHandleNonResidentARB = func.invoke("glMakeImageHandleNonResidentARB");
            PFN_glUniformHandleui64ARB = func.invoke("glUniformHandleui64ARB", "glUniformHandleui64IMG");
            PFN_glUniformHandleui64vARB = func.invoke("glUniformHandleui64vARB", "glUniformHandleui64vIMG");
            PFN_glProgramUniformHandleui64ARB = func.invoke("glProgramUniformHandleui64ARB", "glProgramUniformHandleui64IMG");
            PFN_glProgramUniformHandleui64vARB = func.invoke("glProgramUniformHandleui64vARB", "glProgramUniformHandleui64vIMG");
            PFN_glIsTextureHandleResidentARB = func.invoke("glIsTextureHandleResidentARB");
            PFN_glIsImageHandleResidentARB = func.invoke("glIsImageHandleResidentARB");
            PFN_glVertexAttribL1ui64ARB = func.invoke("glVertexAttribL1ui64ARB");
            PFN_glVertexAttribL1ui64vARB = func.invoke("glVertexAttribL1ui64vARB");
            PFN_glGetVertexAttribLui64vARB = func.invoke("glGetVertexAttribLui64vARB");
        }
    }

    public GLARBBindlessTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetTextureHandleARB`.
    /// ```
    /// ((uint64_t) khronos_uint64_t) GLuint64 glGetTextureHandleARB((unsigned int) GLuint texture);
    /// ```
    public long GetTextureHandleARB(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureHandleARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureHandleARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureHandleARB", texture); }
        return (long) Handles.MH_glGetTextureHandleARB.invokeExact(handles.PFN_glGetTextureHandleARB, texture); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureHandleARB", e); }
    }

    /// Invokes `glGetTextureSamplerHandleARB`.
    /// ```
    /// ((uint64_t) khronos_uint64_t) GLuint64 glGetTextureSamplerHandleARB((unsigned int) GLuint texture, (unsigned int) GLuint sampler);
    /// ```
    public long GetTextureSamplerHandleARB(int texture, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureSamplerHandleARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureSamplerHandleARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureSamplerHandleARB", texture, sampler); }
        return (long) Handles.MH_glGetTextureSamplerHandleARB.invokeExact(handles.PFN_glGetTextureSamplerHandleARB, texture, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureSamplerHandleARB", e); }
    }

    /// Invokes `glMakeTextureHandleResidentARB`.
    /// ```
    /// void glMakeTextureHandleResidentARB(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public void MakeTextureHandleResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleResidentARB)) throw new GLSymbolNotFoundError("Symbol not found: glMakeTextureHandleResidentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeTextureHandleResidentARB", handle); }
        Handles.MH_glMakeTextureHandleResidentARB.invokeExact(handles.PFN_glMakeTextureHandleResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleResidentARB", e); }
    }

    /// Invokes `glMakeTextureHandleNonResidentARB`.
    /// ```
    /// void glMakeTextureHandleNonResidentARB(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public void MakeTextureHandleNonResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeTextureHandleNonResidentARB)) throw new GLSymbolNotFoundError("Symbol not found: glMakeTextureHandleNonResidentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeTextureHandleNonResidentARB", handle); }
        Handles.MH_glMakeTextureHandleNonResidentARB.invokeExact(handles.PFN_glMakeTextureHandleNonResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeTextureHandleNonResidentARB", e); }
    }

    /// Invokes `glGetImageHandleARB`.
    /// ```
    /// ((uint64_t) khronos_uint64_t) GLuint64 glGetImageHandleARB((unsigned int) GLuint texture, (int) GLint level, GLboolean layered, (int) GLint layer, (unsigned int) GLenum format);
    /// ```
    public long GetImageHandleARB(int texture, int level, boolean layered, int layer, int format) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetImageHandleARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetImageHandleARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetImageHandleARB", texture, level, layered, layer, format); }
        return (long) Handles.MH_glGetImageHandleARB.invokeExact(handles.PFN_glGetImageHandleARB, texture, level, ((layered) ? (byte)1 : (byte)0), layer, format); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageHandleARB", e); }
    }

    /// Invokes `glMakeImageHandleResidentARB`.
    /// ```
    /// void glMakeImageHandleResidentARB(((uint64_t) khronos_uint64_t) GLuint64 handle, (unsigned int) GLenum access);
    /// ```
    public void MakeImageHandleResidentARB(long handle, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleResidentARB)) throw new GLSymbolNotFoundError("Symbol not found: glMakeImageHandleResidentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeImageHandleResidentARB", handle, access); }
        Handles.MH_glMakeImageHandleResidentARB.invokeExact(handles.PFN_glMakeImageHandleResidentARB, handle, access); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleResidentARB", e); }
    }

    /// Invokes `glMakeImageHandleNonResidentARB`.
    /// ```
    /// void glMakeImageHandleNonResidentARB(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public void MakeImageHandleNonResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeImageHandleNonResidentARB)) throw new GLSymbolNotFoundError("Symbol not found: glMakeImageHandleNonResidentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeImageHandleNonResidentARB", handle); }
        Handles.MH_glMakeImageHandleNonResidentARB.invokeExact(handles.PFN_glMakeImageHandleNonResidentARB, handle); }
        catch (Throwable e) { throw new RuntimeException("error in MakeImageHandleNonResidentARB", e); }
    }

    /// Invokes `glUniformHandleui64ARB`.
    /// ```
    /// void glUniformHandleui64ARB((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 value);
    /// ```
    public void UniformHandleui64ARB(int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64ARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniformHandleui64ARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformHandleui64ARB", location, value); }
        Handles.MH_glUniformHandleui64ARB.invokeExact(handles.PFN_glUniformHandleui64ARB, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64ARB", e); }
    }

    /// Invokes `glUniformHandleui64vARB`.
    /// ```
    /// void glUniformHandleui64vARB((int) GLint location, (int) GLsizei count, const GLuint64* value);
    /// ```
    public void UniformHandleui64vARB(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformHandleui64vARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniformHandleui64vARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformHandleui64vARB", location, count, value); }
        Handles.MH_glUniformHandleui64vARB.invokeExact(handles.PFN_glUniformHandleui64vARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformHandleui64vARB", e); }
    }

    /// Invokes `glProgramUniformHandleui64ARB`.
    /// ```
    /// void glProgramUniformHandleui64ARB((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64 value);
    /// ```
    public void ProgramUniformHandleui64ARB(int program, int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64ARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformHandleui64ARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformHandleui64ARB", program, location, value); }
        Handles.MH_glProgramUniformHandleui64ARB.invokeExact(handles.PFN_glProgramUniformHandleui64ARB, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64ARB", e); }
    }

    /// Invokes `glProgramUniformHandleui64vARB`.
    /// ```
    /// void glProgramUniformHandleui64vARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64* values);
    /// ```
    public void ProgramUniformHandleui64vARB(int program, int location, int count, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformHandleui64vARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformHandleui64vARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformHandleui64vARB", program, location, count, values); }
        Handles.MH_glProgramUniformHandleui64vARB.invokeExact(handles.PFN_glProgramUniformHandleui64vARB, program, location, count, values); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformHandleui64vARB", e); }
    }

    /// Invokes `glIsTextureHandleResidentARB`.
    /// ```
    /// GLboolean glIsTextureHandleResidentARB(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public boolean IsTextureHandleResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTextureHandleResidentARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsTextureHandleResidentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTextureHandleResidentARB", handle); }
        return (((byte) Handles.MH_glIsTextureHandleResidentARB.invokeExact(handles.PFN_glIsTextureHandleResidentARB, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTextureHandleResidentARB", e); }
    }

    /// Invokes `glIsImageHandleResidentARB`.
    /// ```
    /// GLboolean glIsImageHandleResidentARB(((uint64_t) khronos_uint64_t) GLuint64 handle);
    /// ```
    public boolean IsImageHandleResidentARB(long handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsImageHandleResidentARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsImageHandleResidentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsImageHandleResidentARB", handle); }
        return (((byte) Handles.MH_glIsImageHandleResidentARB.invokeExact(handles.PFN_glIsImageHandleResidentARB, handle)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsImageHandleResidentARB", e); }
    }

    /// Invokes `glVertexAttribL1ui64ARB`.
    /// ```
    /// void glVertexAttribL1ui64ARB((unsigned int) GLuint index, ((uint64_t) khronos_uint64_t) GLuint64EXT x);
    /// ```
    public void VertexAttribL1ui64ARB(int index, long x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1ui64ARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1ui64ARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1ui64ARB", index, x); }
        Handles.MH_glVertexAttribL1ui64ARB.invokeExact(handles.PFN_glVertexAttribL1ui64ARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1ui64ARB", e); }
    }

    /// Invokes `glVertexAttribL1ui64vARB`.
    /// ```
    /// void glVertexAttribL1ui64vARB((unsigned int) GLuint index, const GLuint64EXT* v);
    /// ```
    public void VertexAttribL1ui64vARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1ui64vARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1ui64vARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1ui64vARB", index, v); }
        Handles.MH_glVertexAttribL1ui64vARB.invokeExact(handles.PFN_glVertexAttribL1ui64vARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1ui64vARB", e); }
    }

    /// Invokes `glGetVertexAttribLui64vARB`.
    /// ```
    /// void glGetVertexAttribLui64vARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLuint64EXT* params);
    /// ```
    public void GetVertexAttribLui64vARB(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLui64vARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribLui64vARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribLui64vARB", index, pname, params); }
        Handles.MH_glGetVertexAttribLui64vARB.invokeExact(handles.PFN_glGetVertexAttribLui64vARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLui64vARB", e); }
    }

}
