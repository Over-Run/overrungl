// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_semaphore`
public final class GLEXTSemaphore {
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 0x9596;
    public static final int GL_DEVICE_UUID_EXT = 0x9597;
    public static final int GL_DRIVER_UUID_EXT = 0x9598;
    public static final int GL_UUID_SIZE_EXT = 16;
    public static final int GL_LAYOUT_GENERAL_EXT = 0x958D;
    public static final int GL_LAYOUT_COLOR_ATTACHMENT_EXT = 0x958E;
    public static final int GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT = 0x958F;
    public static final int GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT = 0x9590;
    public static final int GL_LAYOUT_SHADER_READ_ONLY_EXT = 0x9591;
    public static final int GL_LAYOUT_TRANSFER_SRC_EXT = 0x9592;
    public static final int GL_LAYOUT_TRANSFER_DST_EXT = 0x9593;
    public static final int GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 0x9530;
    public static final int GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 0x9531;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetUnsignedBytevEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetUnsignedBytei_vEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenSemaphoresEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteSemaphoresEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsSemaphoreEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSemaphoreParameterui64vEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSemaphoreParameterui64vEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWaitSemaphoreEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSignalSemaphoreEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGetUnsignedBytevEXT;
        public final MemorySegment PFN_glGetUnsignedBytei_vEXT;
        public final MemorySegment PFN_glGenSemaphoresEXT;
        public final MemorySegment PFN_glDeleteSemaphoresEXT;
        public final MemorySegment PFN_glIsSemaphoreEXT;
        public final MemorySegment PFN_glSemaphoreParameterui64vEXT;
        public final MemorySegment PFN_glGetSemaphoreParameterui64vEXT;
        public final MemorySegment PFN_glWaitSemaphoreEXT;
        public final MemorySegment PFN_glSignalSemaphoreEXT;
        private Handles(GLLoadFunc func) {
            PFN_glGetUnsignedBytevEXT = func.invoke("glGetUnsignedBytevEXT");
            PFN_glGetUnsignedBytei_vEXT = func.invoke("glGetUnsignedBytei_vEXT");
            PFN_glGenSemaphoresEXT = func.invoke("glGenSemaphoresEXT");
            PFN_glDeleteSemaphoresEXT = func.invoke("glDeleteSemaphoresEXT");
            PFN_glIsSemaphoreEXT = func.invoke("glIsSemaphoreEXT");
            PFN_glSemaphoreParameterui64vEXT = func.invoke("glSemaphoreParameterui64vEXT");
            PFN_glGetSemaphoreParameterui64vEXT = func.invoke("glGetSemaphoreParameterui64vEXT");
            PFN_glWaitSemaphoreEXT = func.invoke("glWaitSemaphoreEXT");
            PFN_glSignalSemaphoreEXT = func.invoke("glSignalSemaphoreEXT");
        }
    }

    public GLEXTSemaphore(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetUnsignedBytevEXT`.
    /// ```
    /// void glGetUnsignedBytevEXT((unsigned int) GLenum pname, GLubyte* data);
    /// ```
    public void GetUnsignedBytevEXT(int pname, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytevEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetUnsignedBytevEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUnsignedBytevEXT", pname, data); }
        Handles.MH_glGetUnsignedBytevEXT.get().invokeExact(handles.PFN_glGetUnsignedBytevEXT, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytevEXT", e); }
    }

    /// Invokes `glGetUnsignedBytei_vEXT`.
    /// ```
    /// void glGetUnsignedBytei_vEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLubyte* data);
    /// ```
    public void GetUnsignedBytei_vEXT(int target, int index, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUnsignedBytei_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetUnsignedBytei_vEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUnsignedBytei_vEXT", target, index, data); }
        Handles.MH_glGetUnsignedBytei_vEXT.get().invokeExact(handles.PFN_glGetUnsignedBytei_vEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetUnsignedBytei_vEXT", e); }
    }

    /// Invokes `glGenSemaphoresEXT`.
    /// ```
    /// void glGenSemaphoresEXT((int) GLsizei n, GLuint* semaphores);
    /// ```
    public void GenSemaphoresEXT(int n, @NonNull MemorySegment semaphores) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenSemaphoresEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenSemaphoresEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenSemaphoresEXT", n, semaphores); }
        Handles.MH_glGenSemaphoresEXT.get().invokeExact(handles.PFN_glGenSemaphoresEXT, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in GenSemaphoresEXT", e); }
    }

    /// Invokes `glDeleteSemaphoresEXT`.
    /// ```
    /// void glDeleteSemaphoresEXT((int) GLsizei n, const GLuint* semaphores);
    /// ```
    public void DeleteSemaphoresEXT(int n, @NonNull MemorySegment semaphores) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSemaphoresEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteSemaphoresEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteSemaphoresEXT", n, semaphores); }
        Handles.MH_glDeleteSemaphoresEXT.get().invokeExact(handles.PFN_glDeleteSemaphoresEXT, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSemaphoresEXT", e); }
    }

    /// Invokes `glIsSemaphoreEXT`.
    /// ```
    /// GLboolean glIsSemaphoreEXT((unsigned int) GLuint semaphore);
    /// ```
    public boolean IsSemaphoreEXT(int semaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSemaphoreEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsSemaphoreEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsSemaphoreEXT", semaphore); }
        return (((byte) Handles.MH_glIsSemaphoreEXT.get().invokeExact(handles.PFN_glIsSemaphoreEXT, semaphore)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSemaphoreEXT", e); }
    }

    /// Invokes `glSemaphoreParameterui64vEXT`.
    /// ```
    /// void glSemaphoreParameterui64vEXT((unsigned int) GLuint semaphore, (unsigned int) GLenum pname, const GLuint64* params);
    /// ```
    public void SemaphoreParameterui64vEXT(int semaphore, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSemaphoreParameterui64vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSemaphoreParameterui64vEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSemaphoreParameterui64vEXT", semaphore, pname, params); }
        Handles.MH_glSemaphoreParameterui64vEXT.get().invokeExact(handles.PFN_glSemaphoreParameterui64vEXT, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in SemaphoreParameterui64vEXT", e); }
    }

    /// Invokes `glGetSemaphoreParameterui64vEXT`.
    /// ```
    /// void glGetSemaphoreParameterui64vEXT((unsigned int) GLuint semaphore, (unsigned int) GLenum pname, GLuint64* params);
    /// ```
    public void GetSemaphoreParameterui64vEXT(int semaphore, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSemaphoreParameterui64vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetSemaphoreParameterui64vEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSemaphoreParameterui64vEXT", semaphore, pname, params); }
        Handles.MH_glGetSemaphoreParameterui64vEXT.get().invokeExact(handles.PFN_glGetSemaphoreParameterui64vEXT, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSemaphoreParameterui64vEXT", e); }
    }

    /// Invokes `glWaitSemaphoreEXT`.
    /// ```
    /// void glWaitSemaphoreEXT((unsigned int) GLuint semaphore, (unsigned int) GLuint numBufferBarriers, const GLuint* buffers, (unsigned int) GLuint numTextureBarriers, const GLuint* textures, const GLenum* srcLayouts);
    /// ```
    public void WaitSemaphoreEXT(int semaphore, int numBufferBarriers, @NonNull MemorySegment buffers, int numTextureBarriers, @NonNull MemorySegment textures, @NonNull MemorySegment srcLayouts) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitSemaphoreEXT)) throw new GLSymbolNotFoundError("Symbol not found: glWaitSemaphoreEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWaitSemaphoreEXT", semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts); }
        Handles.MH_glWaitSemaphoreEXT.get().invokeExact(handles.PFN_glWaitSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSemaphoreEXT", e); }
    }

    /// Invokes `glSignalSemaphoreEXT`.
    /// ```
    /// void glSignalSemaphoreEXT((unsigned int) GLuint semaphore, (unsigned int) GLuint numBufferBarriers, const GLuint* buffers, (unsigned int) GLuint numTextureBarriers, const GLuint* textures, const GLenum* dstLayouts);
    /// ```
    public void SignalSemaphoreEXT(int semaphore, int numBufferBarriers, @NonNull MemorySegment buffers, int numTextureBarriers, @NonNull MemorySegment textures, @NonNull MemorySegment dstLayouts) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalSemaphoreEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSignalSemaphoreEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSignalSemaphoreEXT", semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts); }
        Handles.MH_glSignalSemaphoreEXT.get().invokeExact(handles.PFN_glSignalSemaphoreEXT, semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts); }
        catch (Throwable e) { throw new RuntimeException("error in SignalSemaphoreEXT", e); }
    }

}
