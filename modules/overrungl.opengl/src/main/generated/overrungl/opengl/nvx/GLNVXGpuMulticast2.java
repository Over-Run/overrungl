// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nvx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NVX_gpu_multicast2`
public final class GLNVXGpuMulticast2 {
    public static final int GL_UPLOAD_GPU_MASK_NVX = 0x954A;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUploadGpuMaskNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMulticastViewportArrayvNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMulticastViewportPositionWScaleNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMulticastScissorArrayvNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glAsyncCopyBufferSubDataNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glAsyncCopyImageSubDataNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUploadGpuMaskNVX;
        public final MemorySegment PFN_glMulticastViewportArrayvNVX;
        public final MemorySegment PFN_glMulticastViewportPositionWScaleNVX;
        public final MemorySegment PFN_glMulticastScissorArrayvNVX;
        public final MemorySegment PFN_glAsyncCopyBufferSubDataNVX;
        public final MemorySegment PFN_glAsyncCopyImageSubDataNVX;
        private Handles(GLLoadFunc func) {
            PFN_glUploadGpuMaskNVX = func.invoke("glUploadGpuMaskNVX");
            PFN_glMulticastViewportArrayvNVX = func.invoke("glMulticastViewportArrayvNVX");
            PFN_glMulticastViewportPositionWScaleNVX = func.invoke("glMulticastViewportPositionWScaleNVX");
            PFN_glMulticastScissorArrayvNVX = func.invoke("glMulticastScissorArrayvNVX");
            PFN_glAsyncCopyBufferSubDataNVX = func.invoke("glAsyncCopyBufferSubDataNVX");
            PFN_glAsyncCopyImageSubDataNVX = func.invoke("glAsyncCopyImageSubDataNVX");
        }
    }

    public GLNVXGpuMulticast2(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUploadGpuMaskNVX`.
    /// ```
    /// void glUploadGpuMaskNVX((unsigned int) GLbitfield mask);
    /// ```
    public void UploadGpuMaskNVX(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUploadGpuMaskNVX)) throw new GLSymbolNotFoundError("Symbol not found: glUploadGpuMaskNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUploadGpuMaskNVX", mask); }
        Handles.MH_glUploadGpuMaskNVX.invokeExact(handles.PFN_glUploadGpuMaskNVX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in UploadGpuMaskNVX", e); }
    }

    /// Invokes `glMulticastViewportArrayvNVX`.
    /// ```
    /// void glMulticastViewportArrayvNVX((unsigned int) GLuint gpu, (unsigned int) GLuint first, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void MulticastViewportArrayvNVX(int gpu, int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastViewportArrayvNVX)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastViewportArrayvNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastViewportArrayvNVX", gpu, first, count, v); }
        Handles.MH_glMulticastViewportArrayvNVX.invokeExact(handles.PFN_glMulticastViewportArrayvNVX, gpu, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastViewportArrayvNVX", e); }
    }

    /// Invokes `glMulticastViewportPositionWScaleNVX`.
    /// ```
    /// void glMulticastViewportPositionWScaleNVX((unsigned int) GLuint gpu, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat xcoeff, ((float) khronos_float_t) GLfloat ycoeff);
    /// ```
    public void MulticastViewportPositionWScaleNVX(int gpu, int index, float xcoeff, float ycoeff) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastViewportPositionWScaleNVX)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastViewportPositionWScaleNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastViewportPositionWScaleNVX", gpu, index, xcoeff, ycoeff); }
        Handles.MH_glMulticastViewportPositionWScaleNVX.invokeExact(handles.PFN_glMulticastViewportPositionWScaleNVX, gpu, index, xcoeff, ycoeff); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastViewportPositionWScaleNVX", e); }
    }

    /// Invokes `glMulticastScissorArrayvNVX`.
    /// ```
    /// void glMulticastScissorArrayvNVX((unsigned int) GLuint gpu, (unsigned int) GLuint first, (int) GLsizei count, const GLint* v);
    /// ```
    public void MulticastScissorArrayvNVX(int gpu, int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMulticastScissorArrayvNVX)) throw new GLSymbolNotFoundError("Symbol not found: glMulticastScissorArrayvNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMulticastScissorArrayvNVX", gpu, first, count, v); }
        Handles.MH_glMulticastScissorArrayvNVX.invokeExact(handles.PFN_glMulticastScissorArrayvNVX, gpu, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in MulticastScissorArrayvNVX", e); }
    }

    /// Invokes `glAsyncCopyBufferSubDataNVX`.
    /// ```
    /// (unsigned int) GLuint glAsyncCopyBufferSubDataNVX((int) GLsizei waitSemaphoreCount, const GLuint* waitSemaphoreArray, const GLuint64* fenceValueArray, (unsigned int) GLuint readGpu, (unsigned int) GLbitfield writeGpuMask, (unsigned int) GLuint readBuffer, (unsigned int) GLuint writeBuffer, ((signed long long) khronos_intptr_t) GLintptr readOffset, ((signed long long) khronos_intptr_t) GLintptr writeOffset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (int) GLsizei signalSemaphoreCount, const GLuint* signalSemaphoreArray, const GLuint64* signalValueArray);
    /// ```
    public int AsyncCopyBufferSubDataNVX(int waitSemaphoreCount, @NonNull MemorySegment waitSemaphoreArray, @NonNull MemorySegment fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, @NonNull MemorySegment signalSemaphoreArray, @NonNull MemorySegment signalValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAsyncCopyBufferSubDataNVX)) throw new GLSymbolNotFoundError("Symbol not found: glAsyncCopyBufferSubDataNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAsyncCopyBufferSubDataNVX", waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray); }
        return (int) Handles.MH_glAsyncCopyBufferSubDataNVX.invokeExact(handles.PFN_glAsyncCopyBufferSubDataNVX, waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in AsyncCopyBufferSubDataNVX", e); }
    }

    /// Invokes `glAsyncCopyImageSubDataNVX`.
    /// ```
    /// (unsigned int) GLuint glAsyncCopyImageSubDataNVX((int) GLsizei waitSemaphoreCount, const GLuint* waitSemaphoreArray, const GLuint64* waitValueArray, (unsigned int) GLuint srcGpu, (unsigned int) GLbitfield dstGpuMask, (unsigned int) GLuint srcName, (unsigned int) GLenum srcTarget, (int) GLint srcLevel, (int) GLint srcX, (int) GLint srcY, (int) GLint srcZ, (unsigned int) GLuint dstName, (unsigned int) GLenum dstTarget, (int) GLint dstLevel, (int) GLint dstX, (int) GLint dstY, (int) GLint dstZ, (int) GLsizei srcWidth, (int) GLsizei srcHeight, (int) GLsizei srcDepth, (int) GLsizei signalSemaphoreCount, const GLuint* signalSemaphoreArray, const GLuint64* signalValueArray);
    /// ```
    public int AsyncCopyImageSubDataNVX(int waitSemaphoreCount, @NonNull MemorySegment waitSemaphoreArray, @NonNull MemorySegment waitValueArray, int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, int signalSemaphoreCount, @NonNull MemorySegment signalSemaphoreArray, @NonNull MemorySegment signalValueArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAsyncCopyImageSubDataNVX)) throw new GLSymbolNotFoundError("Symbol not found: glAsyncCopyImageSubDataNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAsyncCopyImageSubDataNVX", waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray); }
        return (int) Handles.MH_glAsyncCopyImageSubDataNVX.invokeExact(handles.PFN_glAsyncCopyImageSubDataNVX, waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray); }
        catch (Throwable e) { throw new RuntimeException("error in AsyncCopyImageSubDataNVX", e); }
    }

}
