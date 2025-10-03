// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_draw_vulkan_image`
public final class GLNVDrawVulkanImage {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDrawVkImageNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glGetVkProcAddrNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWaitVkSemaphoreNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glSignalVkSemaphoreNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glSignalVkFenceNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)));
        public final MemorySegment PFN_glDrawVkImageNV;
        public final MemorySegment PFN_glGetVkProcAddrNV;
        public final MemorySegment PFN_glWaitVkSemaphoreNV;
        public final MemorySegment PFN_glSignalVkSemaphoreNV;
        public final MemorySegment PFN_glSignalVkFenceNV;
        private Handles(GLLoadFunc func) {
            PFN_glDrawVkImageNV = func.invoke("glDrawVkImageNV");
            PFN_glGetVkProcAddrNV = func.invoke("glGetVkProcAddrNV");
            PFN_glWaitVkSemaphoreNV = func.invoke("glWaitVkSemaphoreNV");
            PFN_glSignalVkSemaphoreNV = func.invoke("glSignalVkSemaphoreNV");
            PFN_glSignalVkFenceNV = func.invoke("glSignalVkFenceNV");
        }
    }

    public GLNVDrawVulkanImage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawVkImageNV`.
    /// ```
    /// void glDrawVkImageNV(((uint64_t) khronos_uint64_t) GLuint64 vkImage, (unsigned int) GLuint sampler, ((float) khronos_float_t) GLfloat x0, ((float) khronos_float_t) GLfloat y0, ((float) khronos_float_t) GLfloat x1, ((float) khronos_float_t) GLfloat y1, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat s0, ((float) khronos_float_t) GLfloat t0, ((float) khronos_float_t) GLfloat s1, ((float) khronos_float_t) GLfloat t1);
    /// ```
    public void DrawVkImageNV(long vkImage, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawVkImageNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawVkImageNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawVkImageNV", vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        Handles.MH_glDrawVkImageNV.get().invokeExact(handles.PFN_glDrawVkImageNV, vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        catch (Throwable e) { throw new RuntimeException("error in DrawVkImageNV", e); }
    }

    /// Invokes `glGetVkProcAddrNV`.
    /// ```
    /// (void*) GLVULKANPROCNV glGetVkProcAddrNV(const GLchar* name);
    /// ```
    public @NonNull MemorySegment GetVkProcAddrNV(@NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVkProcAddrNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVkProcAddrNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVkProcAddrNV", name); }
        return (MemorySegment) Handles.MH_glGetVkProcAddrNV.get().invokeExact(handles.PFN_glGetVkProcAddrNV, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetVkProcAddrNV", e); }
    }

    /// Invokes `glWaitVkSemaphoreNV`.
    /// ```
    /// void glWaitVkSemaphoreNV(((uint64_t) khronos_uint64_t) GLuint64 vkSemaphore);
    /// ```
    public void WaitVkSemaphoreNV(long vkSemaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitVkSemaphoreNV)) throw new GLSymbolNotFoundError("Symbol not found: glWaitVkSemaphoreNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWaitVkSemaphoreNV", vkSemaphore); }
        Handles.MH_glWaitVkSemaphoreNV.get().invokeExact(handles.PFN_glWaitVkSemaphoreNV, vkSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in WaitVkSemaphoreNV", e); }
    }

    /// Invokes `glSignalVkSemaphoreNV`.
    /// ```
    /// void glSignalVkSemaphoreNV(((uint64_t) khronos_uint64_t) GLuint64 vkSemaphore);
    /// ```
    public void SignalVkSemaphoreNV(long vkSemaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalVkSemaphoreNV)) throw new GLSymbolNotFoundError("Symbol not found: glSignalVkSemaphoreNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSignalVkSemaphoreNV", vkSemaphore); }
        Handles.MH_glSignalVkSemaphoreNV.get().invokeExact(handles.PFN_glSignalVkSemaphoreNV, vkSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in SignalVkSemaphoreNV", e); }
    }

    /// Invokes `glSignalVkFenceNV`.
    /// ```
    /// void glSignalVkFenceNV(((uint64_t) khronos_uint64_t) GLuint64 vkFence);
    /// ```
    public void SignalVkFenceNV(long vkFence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSignalVkFenceNV)) throw new GLSymbolNotFoundError("Symbol not found: glSignalVkFenceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSignalVkFenceNV", vkFence); }
        Handles.MH_glSignalVkFenceNV.get().invokeExact(handles.PFN_glSignalVkFenceNV, vkFence); }
        catch (Throwable e) { throw new RuntimeException("error in SignalVkFenceNV", e); }
    }

}
