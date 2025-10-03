// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// Constants and functions of OpenGL 3.2.
public class GL32 extends GL31 {
    public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    public static final int GL_LINES_ADJACENCY = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    public static final int GL_GEOMETRY_SHADER = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
    public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
    public static final int GL_DEPTH_CLAMP = 0x864F;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int GL_OBJECT_TYPE = 0x9112;
    public static final int GL_SYNC_CONDITION = 0x9113;
    public static final int GL_SYNC_STATUS = 0x9114;
    public static final int GL_SYNC_FLAGS = 0x9115;
    public static final int GL_SYNC_FENCE = 0x9116;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int GL_UNSIGNALED = 0x9118;
    public static final int GL_SIGNALED = 0x9119;
    public static final int GL_ALREADY_SIGNALED = 0x911A;
    public static final int GL_TIMEOUT_EXPIRED = 0x911B;
    public static final int GL_CONDITION_SATISFIED = 0x911C;
    public static final int GL_WAIT_FAILED = 0x911D;
    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final int GL_SAMPLE_POSITION = 0x8E50;
    public static final int GL_SAMPLE_MASK = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_SAMPLES = 0x9106;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDrawElementsBaseVertex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDrawRangeElementsBaseVertex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDrawElementsInstancedBaseVertex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glMultiDrawElementsBaseVertex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProvokingVertex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFenceSync = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glIsSync = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteSync = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glClientWaitSync = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glWaitSync = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glGetInteger64v = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSynciv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetInteger64i_v = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetBufferParameteri64v = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glFramebufferTexture = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTexImage2DMultisample = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glTexImage3DMultisample = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glGetMultisamplefv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSampleMaski = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glDrawElementsBaseVertex;
        public final MemorySegment PFN_glDrawRangeElementsBaseVertex;
        public final MemorySegment PFN_glDrawElementsInstancedBaseVertex;
        public final MemorySegment PFN_glMultiDrawElementsBaseVertex;
        public final MemorySegment PFN_glProvokingVertex;
        public final MemorySegment PFN_glFenceSync;
        public final MemorySegment PFN_glIsSync;
        public final MemorySegment PFN_glDeleteSync;
        public final MemorySegment PFN_glClientWaitSync;
        public final MemorySegment PFN_glWaitSync;
        public final MemorySegment PFN_glGetInteger64v;
        public final MemorySegment PFN_glGetSynciv;
        public final MemorySegment PFN_glGetInteger64i_v;
        public final MemorySegment PFN_glGetBufferParameteri64v;
        public final MemorySegment PFN_glFramebufferTexture;
        public final MemorySegment PFN_glTexImage2DMultisample;
        public final MemorySegment PFN_glTexImage3DMultisample;
        public final MemorySegment PFN_glGetMultisamplefv;
        public final MemorySegment PFN_glSampleMaski;
        private Handles(GLLoadFunc func) {
            PFN_glDrawElementsBaseVertex = func.invoke("glDrawElementsBaseVertex", "glDrawElementsBaseVertexEXT", "glDrawElementsBaseVertexOES");
            PFN_glDrawRangeElementsBaseVertex = func.invoke("glDrawRangeElementsBaseVertex", "glDrawRangeElementsBaseVertexEXT", "glDrawRangeElementsBaseVertexOES");
            PFN_glDrawElementsInstancedBaseVertex = func.invoke("glDrawElementsInstancedBaseVertex", "glDrawElementsInstancedBaseVertexEXT", "glDrawElementsInstancedBaseVertexOES");
            PFN_glMultiDrawElementsBaseVertex = func.invoke("glMultiDrawElementsBaseVertex", "glMultiDrawElementsBaseVertexEXT");
            PFN_glProvokingVertex = func.invoke("glProvokingVertex", "glProvokingVertexEXT");
            PFN_glFenceSync = func.invoke("glFenceSync", "glFenceSyncAPPLE");
            PFN_glIsSync = func.invoke("glIsSync", "glIsSyncAPPLE");
            PFN_glDeleteSync = func.invoke("glDeleteSync", "glDeleteSyncAPPLE");
            PFN_glClientWaitSync = func.invoke("glClientWaitSync", "glClientWaitSyncAPPLE");
            PFN_glWaitSync = func.invoke("glWaitSync", "glWaitSyncAPPLE");
            PFN_glGetInteger64v = func.invoke("glGetInteger64v", "glGetInteger64vAPPLE", "glGetInteger64vEXT");
            PFN_glGetSynciv = func.invoke("glGetSynciv", "glGetSyncivAPPLE");
            PFN_glGetInteger64i_v = func.invoke("glGetInteger64i_v");
            PFN_glGetBufferParameteri64v = func.invoke("glGetBufferParameteri64v");
            PFN_glFramebufferTexture = func.invoke("glFramebufferTexture", "glFramebufferTextureARB", "glFramebufferTextureEXT", "glFramebufferTextureOES");
            PFN_glTexImage2DMultisample = func.invoke("glTexImage2DMultisample");
            PFN_glTexImage3DMultisample = func.invoke("glTexImage3DMultisample");
            PFN_glGetMultisamplefv = func.invoke("glGetMultisamplefv", "glGetMultisamplefvNV");
            PFN_glSampleMaski = func.invoke("glSampleMaski");
        }
    }

    public GL32(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawElementsBaseVertex`.
    /// ```
    /// void glDrawElementsBaseVertex((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLint basevertex);
    /// ```
    public void DrawElementsBaseVertex(int mode, int count, int type, @NonNull MemorySegment indices, int basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsBaseVertex", mode, count, type, indices, basevertex); }
        Handles.MH_glDrawElementsBaseVertex.get().invokeExact(handles.PFN_glDrawElementsBaseVertex, mode, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsBaseVertex", e); }
    }

    /// Invokes `glDrawRangeElementsBaseVertex`.
    /// ```
    /// void glDrawRangeElementsBaseVertex((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLint basevertex);
    /// ```
    public void DrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, @NonNull MemorySegment indices, int basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawRangeElementsBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glDrawRangeElementsBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawRangeElementsBaseVertex", mode, start, end, count, type, indices, basevertex); }
        Handles.MH_glDrawRangeElementsBaseVertex.get().invokeExact(handles.PFN_glDrawRangeElementsBaseVertex, mode, start, end, count, type, indices, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in DrawRangeElementsBaseVertex", e); }
    }

    /// Invokes `glDrawElementsInstancedBaseVertex`.
    /// ```
    /// void glDrawElementsInstancedBaseVertex((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei instancecount, (int) GLint basevertex);
    /// ```
    public void DrawElementsInstancedBaseVertex(int mode, int count, int type, @NonNull MemorySegment indices, int instancecount, int basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedBaseVertex", mode, count, type, indices, instancecount, basevertex); }
        Handles.MH_glDrawElementsInstancedBaseVertex.get().invokeExact(handles.PFN_glDrawElementsInstancedBaseVertex, mode, count, type, indices, instancecount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseVertex", e); }
    }

    /// Invokes `glMultiDrawElementsBaseVertex`.
    /// ```
    /// void glMultiDrawElementsBaseVertex((unsigned int) GLenum mode, const GLsizei* count, (unsigned int) GLenum type, const void* const * indices, (int) GLsizei drawcount, const GLint* basevertex);
    /// ```
    public void MultiDrawElementsBaseVertex(int mode, @NonNull MemorySegment count, int type, @NonNull MemorySegment indices, int drawcount, @NonNull MemorySegment basevertex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsBaseVertex)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsBaseVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsBaseVertex", mode, count, type, indices, drawcount, basevertex); }
        Handles.MH_glMultiDrawElementsBaseVertex.get().invokeExact(handles.PFN_glMultiDrawElementsBaseVertex, mode, count, type, indices, drawcount, basevertex); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsBaseVertex", e); }
    }

    /// Invokes `glProvokingVertex`.
    /// ```
    /// void glProvokingVertex((unsigned int) GLenum mode);
    /// ```
    public void ProvokingVertex(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProvokingVertex)) throw new GLSymbolNotFoundError("Symbol not found: glProvokingVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProvokingVertex", mode); }
        Handles.MH_glProvokingVertex.get().invokeExact(handles.PFN_glProvokingVertex, mode); }
        catch (Throwable e) { throw new RuntimeException("error in ProvokingVertex", e); }
    }

    /// Invokes `glFenceSync`.
    /// ```
    /// (struct __GLsync *) GLsync glFenceSync((unsigned int) GLenum condition, (unsigned int) GLbitfield flags);
    /// ```
    public @NonNull MemorySegment FenceSync(int condition, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFenceSync)) throw new GLSymbolNotFoundError("Symbol not found: glFenceSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFenceSync", condition, flags); }
        return (MemorySegment) Handles.MH_glFenceSync.get().invokeExact(handles.PFN_glFenceSync, condition, flags); }
        catch (Throwable e) { throw new RuntimeException("error in FenceSync", e); }
    }

    /// Invokes `glIsSync`.
    /// ```
    /// GLboolean glIsSync((struct __GLsync *) GLsync sync);
    /// ```
    public boolean IsSync(@NonNull MemorySegment sync) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSync)) throw new GLSymbolNotFoundError("Symbol not found: glIsSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsSync", sync); }
        return (((byte) Handles.MH_glIsSync.get().invokeExact(handles.PFN_glIsSync, sync)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSync", e); }
    }

    /// Invokes `glDeleteSync`.
    /// ```
    /// void glDeleteSync((struct __GLsync *) GLsync sync);
    /// ```
    public void DeleteSync(@NonNull MemorySegment sync) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSync)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteSync", sync); }
        Handles.MH_glDeleteSync.get().invokeExact(handles.PFN_glDeleteSync, sync); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSync", e); }
    }

    /// Invokes `glClientWaitSync`.
    /// ```
    /// (unsigned int) GLenum glClientWaitSync((struct __GLsync *) GLsync sync, (unsigned int) GLbitfield flags, ((uint64_t) khronos_uint64_t) GLuint64 timeout);
    /// ```
    public int ClientWaitSync(@NonNull MemorySegment sync, int flags, long timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientWaitSync)) throw new GLSymbolNotFoundError("Symbol not found: glClientWaitSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClientWaitSync", sync, flags, timeout); }
        return (int) Handles.MH_glClientWaitSync.get().invokeExact(handles.PFN_glClientWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in ClientWaitSync", e); }
    }

    /// Invokes `glWaitSync`.
    /// ```
    /// void glWaitSync((struct __GLsync *) GLsync sync, (unsigned int) GLbitfield flags, ((uint64_t) khronos_uint64_t) GLuint64 timeout);
    /// ```
    public void WaitSync(@NonNull MemorySegment sync, int flags, long timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitSync)) throw new GLSymbolNotFoundError("Symbol not found: glWaitSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWaitSync", sync, flags, timeout); }
        Handles.MH_glWaitSync.get().invokeExact(handles.PFN_glWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSync", e); }
    }

    /// Invokes `glGetInteger64v`.
    /// ```
    /// void glGetInteger64v((unsigned int) GLenum pname, GLint64* data);
    /// ```
    public void GetInteger64v(int pname, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInteger64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetInteger64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInteger64v", pname, data); }
        Handles.MH_glGetInteger64v.get().invokeExact(handles.PFN_glGetInteger64v, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetInteger64v", e); }
    }

    /// Invokes `glGetSynciv`.
    /// ```
    /// void glGetSynciv((struct __GLsync *) GLsync sync, (unsigned int) GLenum pname, (int) GLsizei count, GLsizei* length, GLint* values);
    /// ```
    public void GetSynciv(@NonNull MemorySegment sync, int pname, int count, @NonNull MemorySegment length, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSynciv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSynciv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSynciv", sync, pname, count, length, values); }
        Handles.MH_glGetSynciv.get().invokeExact(handles.PFN_glGetSynciv, sync, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetSynciv", e); }
    }

    /// Invokes `glGetInteger64i_v`.
    /// ```
    /// void glGetInteger64i_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLint64* data);
    /// ```
    public void GetInteger64i_v(int target, int index, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInteger64i_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetInteger64i_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInteger64i_v", target, index, data); }
        Handles.MH_glGetInteger64i_v.get().invokeExact(handles.PFN_glGetInteger64i_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetInteger64i_v", e); }
    }

    /// Invokes `glGetBufferParameteri64v`.
    /// ```
    /// void glGetBufferParameteri64v((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void GetBufferParameteri64v(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBufferParameteri64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetBufferParameteri64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBufferParameteri64v", target, pname, params); }
        Handles.MH_glGetBufferParameteri64v.get().invokeExact(handles.PFN_glGetBufferParameteri64v, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferParameteri64v", e); }
    }

    /// Invokes `glFramebufferTexture`.
    /// ```
    /// void glFramebufferTexture((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture(int target, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture", target, attachment, texture, level); }
        Handles.MH_glFramebufferTexture.get().invokeExact(handles.PFN_glFramebufferTexture, target, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture", e); }
    }

    /// Invokes `glTexImage2DMultisample`.
    /// ```
    /// void glTexImage2DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage2DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage2DMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexImage2DMultisample", target, samples, internalformat, width, height, fixedsamplelocations); }
        Handles.MH_glTexImage2DMultisample.get().invokeExact(handles.PFN_glTexImage2DMultisample, target, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage2DMultisample", e); }
    }

    /// Invokes `glTexImage3DMultisample`.
    /// ```
    /// void glTexImage3DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage3DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage3DMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexImage3DMultisample", target, samples, internalformat, width, height, depth, fixedsamplelocations); }
        Handles.MH_glTexImage3DMultisample.get().invokeExact(handles.PFN_glTexImage3DMultisample, target, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage3DMultisample", e); }
    }

    /// Invokes `glGetMultisamplefv`.
    /// ```
    /// void glGetMultisamplefv((unsigned int) GLenum pname, (unsigned int) GLuint index, GLfloat* val);
    /// ```
    public void GetMultisamplefv(int pname, int index, @NonNull MemorySegment val) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultisamplefv)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultisamplefv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMultisamplefv", pname, index, val); }
        Handles.MH_glGetMultisamplefv.get().invokeExact(handles.PFN_glGetMultisamplefv, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultisamplefv", e); }
    }

    /// Invokes `glSampleMaski`.
    /// ```
    /// void glSampleMaski((unsigned int) GLuint maskNumber, (unsigned int) GLbitfield mask);
    /// ```
    public void SampleMaski(int maskNumber, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleMaski)) throw new GLSymbolNotFoundError("Symbol not found: glSampleMaski");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSampleMaski", maskNumber, mask); }
        Handles.MH_glSampleMaski.get().invokeExact(handles.PFN_glSampleMaski, maskNumber, mask); }
        catch (Throwable e) { throw new RuntimeException("error in SampleMaski", e); }
    }

}
