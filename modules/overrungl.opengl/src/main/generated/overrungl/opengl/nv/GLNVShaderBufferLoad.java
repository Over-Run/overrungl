// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_shader_buffer_load`
public final class GLNVShaderBufferLoad {
    public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
    public static final int GL_GPU_ADDRESS_NV = 0x8F34;
    public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMakeBufferResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeBufferNonResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsBufferResidentNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeNamedBufferResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeNamedBufferNonResidentNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsNamedBufferResidentNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetBufferParameterui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferParameterui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetIntegerui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformui64NV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniformui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glMakeBufferResidentNV;
        public final MemorySegment PFN_glMakeBufferNonResidentNV;
        public final MemorySegment PFN_glIsBufferResidentNV;
        public final MemorySegment PFN_glMakeNamedBufferResidentNV;
        public final MemorySegment PFN_glMakeNamedBufferNonResidentNV;
        public final MemorySegment PFN_glIsNamedBufferResidentNV;
        public final MemorySegment PFN_glGetBufferParameterui64vNV;
        public final MemorySegment PFN_glGetNamedBufferParameterui64vNV;
        public final MemorySegment PFN_glGetIntegerui64vNV;
        public final MemorySegment PFN_glUniformui64NV;
        public final MemorySegment PFN_glUniformui64vNV;
        public final MemorySegment PFN_glGetUniformui64vNV;
        public final MemorySegment PFN_glProgramUniformui64NV;
        public final MemorySegment PFN_glProgramUniformui64vNV;
        private Handles(GLLoadFunc func) {
            PFN_glMakeBufferResidentNV = func.invoke("glMakeBufferResidentNV");
            PFN_glMakeBufferNonResidentNV = func.invoke("glMakeBufferNonResidentNV");
            PFN_glIsBufferResidentNV = func.invoke("glIsBufferResidentNV");
            PFN_glMakeNamedBufferResidentNV = func.invoke("glMakeNamedBufferResidentNV");
            PFN_glMakeNamedBufferNonResidentNV = func.invoke("glMakeNamedBufferNonResidentNV");
            PFN_glIsNamedBufferResidentNV = func.invoke("glIsNamedBufferResidentNV");
            PFN_glGetBufferParameterui64vNV = func.invoke("glGetBufferParameterui64vNV");
            PFN_glGetNamedBufferParameterui64vNV = func.invoke("glGetNamedBufferParameterui64vNV");
            PFN_glGetIntegerui64vNV = func.invoke("glGetIntegerui64vNV");
            PFN_glUniformui64NV = func.invoke("glUniformui64NV");
            PFN_glUniformui64vNV = func.invoke("glUniformui64vNV");
            PFN_glGetUniformui64vNV = func.invoke("glGetUniformui64vNV");
            PFN_glProgramUniformui64NV = func.invoke("glProgramUniformui64NV");
            PFN_glProgramUniformui64vNV = func.invoke("glProgramUniformui64vNV");
        }
    }

    public GLNVShaderBufferLoad(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMakeBufferResidentNV`.
    /// ```
    /// void glMakeBufferResidentNV((unsigned int) GLenum target, (unsigned int) GLenum access);
    /// ```
    public void MakeBufferResidentNV(int target, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeBufferResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeBufferResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeBufferResidentNV", target, access); }
        Handles.MH_glMakeBufferResidentNV.invokeExact(handles.PFN_glMakeBufferResidentNV, target, access); }
        catch (Throwable e) { throw new RuntimeException("error in MakeBufferResidentNV", e); }
    }

    /// Invokes `glMakeBufferNonResidentNV`.
    /// ```
    /// void glMakeBufferNonResidentNV((unsigned int) GLenum target);
    /// ```
    public void MakeBufferNonResidentNV(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeBufferNonResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeBufferNonResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeBufferNonResidentNV", target); }
        Handles.MH_glMakeBufferNonResidentNV.invokeExact(handles.PFN_glMakeBufferNonResidentNV, target); }
        catch (Throwable e) { throw new RuntimeException("error in MakeBufferNonResidentNV", e); }
    }

    /// Invokes `glIsBufferResidentNV`.
    /// ```
    /// GLboolean glIsBufferResidentNV((unsigned int) GLenum target);
    /// ```
    public boolean IsBufferResidentNV(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsBufferResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsBufferResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsBufferResidentNV", target); }
        return (((byte) Handles.MH_glIsBufferResidentNV.invokeExact(handles.PFN_glIsBufferResidentNV, target)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsBufferResidentNV", e); }
    }

    /// Invokes `glMakeNamedBufferResidentNV`.
    /// ```
    /// void glMakeNamedBufferResidentNV((unsigned int) GLuint buffer, (unsigned int) GLenum access);
    /// ```
    public void MakeNamedBufferResidentNV(int buffer, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeNamedBufferResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeNamedBufferResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeNamedBufferResidentNV", buffer, access); }
        Handles.MH_glMakeNamedBufferResidentNV.invokeExact(handles.PFN_glMakeNamedBufferResidentNV, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in MakeNamedBufferResidentNV", e); }
    }

    /// Invokes `glMakeNamedBufferNonResidentNV`.
    /// ```
    /// void glMakeNamedBufferNonResidentNV((unsigned int) GLuint buffer);
    /// ```
    public void MakeNamedBufferNonResidentNV(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMakeNamedBufferNonResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glMakeNamedBufferNonResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMakeNamedBufferNonResidentNV", buffer); }
        Handles.MH_glMakeNamedBufferNonResidentNV.invokeExact(handles.PFN_glMakeNamedBufferNonResidentNV, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in MakeNamedBufferNonResidentNV", e); }
    }

    /// Invokes `glIsNamedBufferResidentNV`.
    /// ```
    /// GLboolean glIsNamedBufferResidentNV((unsigned int) GLuint buffer);
    /// ```
    public boolean IsNamedBufferResidentNV(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsNamedBufferResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsNamedBufferResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsNamedBufferResidentNV", buffer); }
        return (((byte) Handles.MH_glIsNamedBufferResidentNV.invokeExact(handles.PFN_glIsNamedBufferResidentNV, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsNamedBufferResidentNV", e); }
    }

    /// Invokes `glGetBufferParameterui64vNV`.
    /// ```
    /// void glGetBufferParameterui64vNV((unsigned int) GLenum target, (unsigned int) GLenum pname, GLuint64EXT* params);
    /// ```
    public void GetBufferParameterui64vNV(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferParameterui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetBufferParameterui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBufferParameterui64vNV", target, pname, params); }
        Handles.MH_glGetBufferParameterui64vNV.invokeExact(handles.PFN_glGetBufferParameterui64vNV, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferParameterui64vNV", e); }
    }

    /// Invokes `glGetNamedBufferParameterui64vNV`.
    /// ```
    /// void glGetNamedBufferParameterui64vNV((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLuint64EXT* params);
    /// ```
    public void GetNamedBufferParameterui64vNV(int buffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferParameterui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferParameterui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedBufferParameterui64vNV", buffer, pname, params); }
        Handles.MH_glGetNamedBufferParameterui64vNV.invokeExact(handles.PFN_glGetNamedBufferParameterui64vNV, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferParameterui64vNV", e); }
    }

    /// Invokes `glGetIntegerui64vNV`.
    /// ```
    /// void glGetIntegerui64vNV((unsigned int) GLenum value, GLuint64EXT* result);
    /// ```
    public void GetIntegerui64vNV(int value, @NonNull MemorySegment result) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegerui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegerui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetIntegerui64vNV", value, result); }
        Handles.MH_glGetIntegerui64vNV.invokeExact(handles.PFN_glGetIntegerui64vNV, value, result); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegerui64vNV", e); }
    }

    /// Invokes `glUniformui64NV`.
    /// ```
    /// void glUniformui64NV((int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT value);
    /// ```
    public void Uniformui64NV(int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glUniformui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformui64NV", location, value); }
        Handles.MH_glUniformui64NV.invokeExact(handles.PFN_glUniformui64NV, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniformui64NV", e); }
    }

    /// Invokes `glUniformui64vNV`.
    /// ```
    /// void glUniformui64vNV((int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void Uniformui64vNV(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glUniformui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformui64vNV", location, count, value); }
        Handles.MH_glUniformui64vNV.invokeExact(handles.PFN_glUniformui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniformui64vNV", e); }
    }

    /// Invokes `glGetUniformui64vNV`.
    /// ```
    /// void glGetUniformui64vNV((unsigned int) GLuint program, (int) GLint location, GLuint64EXT* params);
    /// ```
    public void GetUniformui64vNV(int program, int location, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformui64vNV", program, location, params); }
        Handles.MH_glGetUniformui64vNV.invokeExact(handles.PFN_glGetUniformui64vNV, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformui64vNV", e); }
    }

    /// Invokes `glProgramUniformui64NV`.
    /// ```
    /// void glProgramUniformui64NV((unsigned int) GLuint program, (int) GLint location, ((uint64_t) khronos_uint64_t) GLuint64EXT value);
    /// ```
    public void ProgramUniformui64NV(int program, int location, long value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformui64NV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformui64NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformui64NV", program, location, value); }
        Handles.MH_glProgramUniformui64NV.invokeExact(handles.PFN_glProgramUniformui64NV, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformui64NV", e); }
    }

    /// Invokes `glProgramUniformui64vNV`.
    /// ```
    /// void glProgramUniformui64vNV((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint64EXT* value);
    /// ```
    public void ProgramUniformui64vNV(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformui64vNV", program, location, count, value); }
        Handles.MH_glProgramUniformui64vNV.invokeExact(handles.PFN_glProgramUniformui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformui64vNV", e); }
    }

}
