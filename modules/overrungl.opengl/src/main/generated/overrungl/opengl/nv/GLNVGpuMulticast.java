// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_gpu_multicast`
public final class GLNVGpuMulticast {
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x0800;
    public static final int GL_MULTICAST_GPUS_NV = 0x92BA;
    public static final int GL_RENDER_GPU_MASK_NV = 0x9558;
    public static final int GL_PER_GPU_STORAGE_NV = 0x9548;
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRenderGpuMaskNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastBufferSubDataNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastCopyBufferSubDataNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMulticastCopyImageSubDataNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastBlitFramebufferNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastFramebufferSampleLocationsfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastBarrierNV = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glMulticastWaitSyncNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastGetQueryObjectivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastGetQueryObjectuivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastGetQueryObjecti64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastGetQueryObjectui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glRenderGpuMaskNV;
        public final MemorySegment PFN_glMulticastBufferSubDataNV;
        public final MemorySegment PFN_glMulticastCopyBufferSubDataNV;
        public final MemorySegment PFN_glMulticastCopyImageSubDataNV;
        public final MemorySegment PFN_glMulticastBlitFramebufferNV;
        public final MemorySegment PFN_glMulticastFramebufferSampleLocationsfvNV;
        public final MemorySegment PFN_glMulticastBarrierNV;
        public final MemorySegment PFN_glMulticastWaitSyncNV;
        public final MemorySegment PFN_glMulticastGetQueryObjectivNV;
        public final MemorySegment PFN_glMulticastGetQueryObjectuivNV;
        public final MemorySegment PFN_glMulticastGetQueryObjecti64vNV;
        public final MemorySegment PFN_glMulticastGetQueryObjectui64vNV;
        private Handles(GLLoadFunc func) {
            PFN_glRenderGpuMaskNV = func.invoke("glRenderGpuMaskNV");
            PFN_glMulticastBufferSubDataNV = func.invoke("glMulticastBufferSubDataNV");
            PFN_glMulticastCopyBufferSubDataNV = func.invoke("glMulticastCopyBufferSubDataNV");
            PFN_glMulticastCopyImageSubDataNV = func.invoke("glMulticastCopyImageSubDataNV");
            PFN_glMulticastBlitFramebufferNV = func.invoke("glMulticastBlitFramebufferNV");
            PFN_glMulticastFramebufferSampleLocationsfvNV = func.invoke("glMulticastFramebufferSampleLocationsfvNV");
            PFN_glMulticastBarrierNV = func.invoke("glMulticastBarrierNV");
            PFN_glMulticastWaitSyncNV = func.invoke("glMulticastWaitSyncNV");
            PFN_glMulticastGetQueryObjectivNV = func.invoke("glMulticastGetQueryObjectivNV");
            PFN_glMulticastGetQueryObjectuivNV = func.invoke("glMulticastGetQueryObjectuivNV");
            PFN_glMulticastGetQueryObjecti64vNV = func.invoke("glMulticastGetQueryObjecti64vNV");
            PFN_glMulticastGetQueryObjectui64vNV = func.invoke("glMulticastGetQueryObjectui64vNV");
        }
    }

    public GLNVGpuMulticast(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glRenderGpuMaskNV`.
    /// ```
    /// void glRenderGpuMaskNV((unsigned int) GLbitfield mask);
    /// ```
    public void RenderGpuMaskNV(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderGpuMaskNV)) throw new GLSymbolNotFoundError("Symbol not found: glRenderGpuMaskNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderGpuMaskNV", mask); }
        Handles.MH_glRenderGpuMaskNV.invokeExact(handles.PFN_glRenderGpuMaskNV, mask); }
        catch (Throwable e) { throw new RuntimeException("error in RenderGpuMaskNV", e); }
    }

    /// Invokes `glMulticastBufferSubDataNV`.
    /// ```
    /// void glMulticastBufferSubDataNV((unsigned int) GLbitfield gpuMask, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data);
    /// ```
    public void MulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastBufferSubDataNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastBufferSubDataNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastBufferSubDataNV", gpuMask, buffer, offset, size, data); }
        Handles.MH_glMulticastBufferSubDataNV.invokeExact(handles.PFN_glMulticastBufferSubDataNV, gpuMask, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastBufferSubDataNV", e); }
    }

    /// Invokes `glMulticastCopyBufferSubDataNV`.
    /// ```
    /// void glMulticastCopyBufferSubDataNV((unsigned int) GLuint readGpu, (unsigned int) GLbitfield writeGpuMask, (unsigned int) GLuint readBuffer, (unsigned int) GLuint writeBuffer, ((signed long long) khronos_intptr_t) GLintptr readOffset, ((signed long long) khronos_intptr_t) GLintptr writeOffset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void MulticastCopyBufferSubDataNV(int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastCopyBufferSubDataNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastCopyBufferSubDataNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastCopyBufferSubDataNV", readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        Handles.MH_glMulticastCopyBufferSubDataNV.invokeExact(handles.PFN_glMulticastCopyBufferSubDataNV, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastCopyBufferSubDataNV", e); }
    }

    /// Invokes `glMulticastCopyImageSubDataNV`.
    /// ```
    /// void glMulticastCopyImageSubDataNV((unsigned int) GLuint srcGpu, (unsigned int) GLbitfield dstGpuMask, (unsigned int) GLuint srcName, (unsigned int) GLenum srcTarget, (int) GLint srcLevel, (int) GLint srcX, (int) GLint srcY, (int) GLint srcZ, (unsigned int) GLuint dstName, (unsigned int) GLenum dstTarget, (int) GLint dstLevel, (int) GLint dstX, (int) GLint dstY, (int) GLint dstZ, (int) GLsizei srcWidth, (int) GLsizei srcHeight, (int) GLsizei srcDepth);
    /// ```
    public void MulticastCopyImageSubDataNV(int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastCopyImageSubDataNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastCopyImageSubDataNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastCopyImageSubDataNV", srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth); }
        Handles.MH_glMulticastCopyImageSubDataNV.invokeExact(handles.PFN_glMulticastCopyImageSubDataNV, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastCopyImageSubDataNV", e); }
    }

    /// Invokes `glMulticastBlitFramebufferNV`.
    /// ```
    /// void glMulticastBlitFramebufferNV((unsigned int) GLuint srcGpu, (unsigned int) GLuint dstGpu, (int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void MulticastBlitFramebufferNV(int srcGpu, int dstGpu, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastBlitFramebufferNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastBlitFramebufferNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastBlitFramebufferNV", srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        Handles.MH_glMulticastBlitFramebufferNV.invokeExact(handles.PFN_glMulticastBlitFramebufferNV, srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastBlitFramebufferNV", e); }
    }

    /// Invokes `glMulticastFramebufferSampleLocationsfvNV`.
    /// ```
    /// void glMulticastFramebufferSampleLocationsfvNV((unsigned int) GLuint gpu, (unsigned int) GLuint framebuffer, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void MulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastFramebufferSampleLocationsfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastFramebufferSampleLocationsfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastFramebufferSampleLocationsfvNV", gpu, framebuffer, start, count, v); }
        Handles.MH_glMulticastFramebufferSampleLocationsfvNV.invokeExact(handles.PFN_glMulticastFramebufferSampleLocationsfvNV, gpu, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastFramebufferSampleLocationsfvNV", e); }
    }

    /// Invokes `glMulticastBarrierNV`.
    /// ```
    /// void glMulticastBarrierNV();
    /// ```
    public void MulticastBarrierNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastBarrierNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastBarrierNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastBarrierNV"); }
        Handles.MH_glMulticastBarrierNV.invokeExact(handles.PFN_glMulticastBarrierNV); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastBarrierNV", e); }
    }

    /// Invokes `glMulticastWaitSyncNV`.
    /// ```
    /// void glMulticastWaitSyncNV((unsigned int) GLuint signalGpu, (unsigned int) GLbitfield waitGpuMask);
    /// ```
    public void MulticastWaitSyncNV(int signalGpu, int waitGpuMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastWaitSyncNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastWaitSyncNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastWaitSyncNV", signalGpu, waitGpuMask); }
        Handles.MH_glMulticastWaitSyncNV.invokeExact(handles.PFN_glMulticastWaitSyncNV, signalGpu, waitGpuMask); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastWaitSyncNV", e); }
    }

    /// Invokes `glMulticastGetQueryObjectivNV`.
    /// ```
    /// void glMulticastGetQueryObjectivNV((unsigned int) GLuint gpu, (unsigned int) GLuint id, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void MulticastGetQueryObjectivNV(int gpu, int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjectivNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastGetQueryObjectivNV", gpu, id, pname, params); }
        Handles.MH_glMulticastGetQueryObjectivNV.invokeExact(handles.PFN_glMulticastGetQueryObjectivNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjectivNV", e); }
    }

    /// Invokes `glMulticastGetQueryObjectuivNV`.
    /// ```
    /// void glMulticastGetQueryObjectuivNV((unsigned int) GLuint gpu, (unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void MulticastGetQueryObjectuivNV(int gpu, int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjectuivNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectuivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastGetQueryObjectuivNV", gpu, id, pname, params); }
        Handles.MH_glMulticastGetQueryObjectuivNV.invokeExact(handles.PFN_glMulticastGetQueryObjectuivNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjectuivNV", e); }
    }

    /// Invokes `glMulticastGetQueryObjecti64vNV`.
    /// ```
    /// void glMulticastGetQueryObjecti64vNV((unsigned int) GLuint gpu, (unsigned int) GLuint id, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void MulticastGetQueryObjecti64vNV(int gpu, int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjecti64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastGetQueryObjecti64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastGetQueryObjecti64vNV", gpu, id, pname, params); }
        Handles.MH_glMulticastGetQueryObjecti64vNV.invokeExact(handles.PFN_glMulticastGetQueryObjecti64vNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjecti64vNV", e); }
    }

    /// Invokes `glMulticastGetQueryObjectui64vNV`.
    /// ```
    /// void glMulticastGetQueryObjectui64vNV((unsigned int) GLuint gpu, (unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint64* params);
    /// ```
    public void MulticastGetQueryObjectui64vNV(int gpu, int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastGetQueryObjectui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastGetQueryObjectui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastGetQueryObjectui64vNV", gpu, id, pname, params); }
        Handles.MH_glMulticastGetQueryObjectui64vNV.invokeExact(handles.PFN_glMulticastGetQueryObjectui64vNV, gpu, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastGetQueryObjectui64vNV", e); }
    }

}
