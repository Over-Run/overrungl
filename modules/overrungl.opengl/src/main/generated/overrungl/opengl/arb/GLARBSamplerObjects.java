// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_sampler_objects`
public final class GLARBSamplerObjects {
    public static final int GL_SAMPLER_BINDING = 0x8919;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGenSamplers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteSamplers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsSampler = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBindSampler = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSamplerParameteri = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSamplerParameteriv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSamplerParameterf = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glSamplerParameterfv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSamplerParameterIiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSamplerParameterIuiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSamplerParameteriv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSamplerParameterIiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSamplerParameterfv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSamplerParameterIuiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGenSamplers;
        public final MemorySegment PFN_glDeleteSamplers;
        public final MemorySegment PFN_glIsSampler;
        public final MemorySegment PFN_glBindSampler;
        public final MemorySegment PFN_glSamplerParameteri;
        public final MemorySegment PFN_glSamplerParameteriv;
        public final MemorySegment PFN_glSamplerParameterf;
        public final MemorySegment PFN_glSamplerParameterfv;
        public final MemorySegment PFN_glSamplerParameterIiv;
        public final MemorySegment PFN_glSamplerParameterIuiv;
        public final MemorySegment PFN_glGetSamplerParameteriv;
        public final MemorySegment PFN_glGetSamplerParameterIiv;
        public final MemorySegment PFN_glGetSamplerParameterfv;
        public final MemorySegment PFN_glGetSamplerParameterIuiv;
        private Handles(GLLoadFunc func) {
            PFN_glGenSamplers = func.invoke("glGenSamplers");
            PFN_glDeleteSamplers = func.invoke("glDeleteSamplers");
            PFN_glIsSampler = func.invoke("glIsSampler");
            PFN_glBindSampler = func.invoke("glBindSampler");
            PFN_glSamplerParameteri = func.invoke("glSamplerParameteri");
            PFN_glSamplerParameteriv = func.invoke("glSamplerParameteriv");
            PFN_glSamplerParameterf = func.invoke("glSamplerParameterf");
            PFN_glSamplerParameterfv = func.invoke("glSamplerParameterfv");
            PFN_glSamplerParameterIiv = func.invoke("glSamplerParameterIiv");
            PFN_glSamplerParameterIuiv = func.invoke("glSamplerParameterIuiv");
            PFN_glGetSamplerParameteriv = func.invoke("glGetSamplerParameteriv");
            PFN_glGetSamplerParameterIiv = func.invoke("glGetSamplerParameterIiv");
            PFN_glGetSamplerParameterfv = func.invoke("glGetSamplerParameterfv");
            PFN_glGetSamplerParameterIuiv = func.invoke("glGetSamplerParameterIuiv");
        }
    }

    public GLARBSamplerObjects(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGenSamplers`.
    /// ```
    /// void glGenSamplers((int) GLsizei count, GLuint* samplers);
    /// ```
    public void GenSamplers(int count, @NonNull MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glGenSamplers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenSamplers", count, samplers); }
        Handles.MH_glGenSamplers.get().invokeExact(handles.PFN_glGenSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in GenSamplers", e); }
    }

    /// Invokes `glDeleteSamplers`.
    /// ```
    /// void glDeleteSamplers((int) GLsizei count, const GLuint* samplers);
    /// ```
    public void DeleteSamplers(int count, @NonNull MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteSamplers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteSamplers", count, samplers); }
        Handles.MH_glDeleteSamplers.get().invokeExact(handles.PFN_glDeleteSamplers, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSamplers", e); }
    }

    /// Invokes `glIsSampler`.
    /// ```
    /// GLboolean glIsSampler((unsigned int) GLuint sampler);
    /// ```
    public boolean IsSampler(int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSampler)) throw new GLSymbolNotFoundError("Symbol not found: glIsSampler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsSampler", sampler); }
        return (((byte) Handles.MH_glIsSampler.get().invokeExact(handles.PFN_glIsSampler, sampler)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSampler", e); }
    }

    /// Invokes `glBindSampler`.
    /// ```
    /// void glBindSampler((unsigned int) GLuint unit, (unsigned int) GLuint sampler);
    /// ```
    public void BindSampler(int unit, int sampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindSampler)) throw new GLSymbolNotFoundError("Symbol not found: glBindSampler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindSampler", unit, sampler); }
        Handles.MH_glBindSampler.get().invokeExact(handles.PFN_glBindSampler, unit, sampler); }
        catch (Throwable e) { throw new RuntimeException("error in BindSampler", e); }
    }

    /// Invokes `glSamplerParameteri`.
    /// ```
    /// void glSamplerParameteri((unsigned int) GLuint sampler, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void SamplerParameteri(int sampler, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameteri", sampler, pname, param); }
        Handles.MH_glSamplerParameteri.get().invokeExact(handles.PFN_glSamplerParameteri, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameteri", e); }
    }

    /// Invokes `glSamplerParameteriv`.
    /// ```
    /// void glSamplerParameteriv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void SamplerParameteriv(int sampler, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameteriv", sampler, pname, param); }
        Handles.MH_glSamplerParameteriv.get().invokeExact(handles.PFN_glSamplerParameteriv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameteriv", e); }
    }

    /// Invokes `glSamplerParameterf`.
    /// ```
    /// void glSamplerParameterf((unsigned int) GLuint sampler, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void SamplerParameterf(int sampler, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterf)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterf");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterf", sampler, pname, param); }
        Handles.MH_glSamplerParameterf.get().invokeExact(handles.PFN_glSamplerParameterf, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterf", e); }
    }

    /// Invokes `glSamplerParameterfv`.
    /// ```
    /// void glSamplerParameterfv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLfloat* param);
    /// ```
    public void SamplerParameterfv(int sampler, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterfv", sampler, pname, param); }
        Handles.MH_glSamplerParameterfv.get().invokeExact(handles.PFN_glSamplerParameterfv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterfv", e); }
    }

    /// Invokes `glSamplerParameterIiv`.
    /// ```
    /// void glSamplerParameterIiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void SamplerParameterIiv(int sampler, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterIiv", sampler, pname, param); }
        Handles.MH_glSamplerParameterIiv.get().invokeExact(handles.PFN_glSamplerParameterIiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterIiv", e); }
    }

    /// Invokes `glSamplerParameterIuiv`.
    /// ```
    /// void glSamplerParameterIuiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, const GLuint* param);
    /// ```
    public void SamplerParameterIuiv(int sampler, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplerParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glSamplerParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplerParameterIuiv", sampler, pname, param); }
        Handles.MH_glSamplerParameterIuiv.get().invokeExact(handles.PFN_glSamplerParameterIuiv, sampler, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SamplerParameterIuiv", e); }
    }

    /// Invokes `glGetSamplerParameteriv`.
    /// ```
    /// void glGetSamplerParameteriv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSamplerParameteriv(int sampler, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameteriv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameteriv.get().invokeExact(handles.PFN_glGetSamplerParameteriv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameteriv", e); }
    }

    /// Invokes `glGetSamplerParameterIiv`.
    /// ```
    /// void glGetSamplerParameterIiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSamplerParameterIiv(int sampler, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameterIiv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameterIiv.get().invokeExact(handles.PFN_glGetSamplerParameterIiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterIiv", e); }
    }

    /// Invokes `glGetSamplerParameterfv`.
    /// ```
    /// void glGetSamplerParameterfv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetSamplerParameterfv(int sampler, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameterfv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameterfv.get().invokeExact(handles.PFN_glGetSamplerParameterfv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterfv", e); }
    }

    /// Invokes `glGetSamplerParameterIuiv`.
    /// ```
    /// void glGetSamplerParameterIuiv((unsigned int) GLuint sampler, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetSamplerParameterIuiv(int sampler, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSamplerParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSamplerParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSamplerParameterIuiv", sampler, pname, params); }
        Handles.MH_glGetSamplerParameterIuiv.get().invokeExact(handles.PFN_glGetSamplerParameterIuiv, sampler, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSamplerParameterIuiv", e); }
    }

}
