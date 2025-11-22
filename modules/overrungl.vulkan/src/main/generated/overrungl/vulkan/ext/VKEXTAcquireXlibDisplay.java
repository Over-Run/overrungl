// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_acquire_xlib_display` - instance extension
public final class VKEXTAcquireXlibDisplay {
    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";
    private VKEXTAcquireXlibDisplay() {}
    public static final class Handles {
        public static final MethodHandle MH_vkAcquireXlibDisplayEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetRandROutputDisplayEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkAcquireXlibDisplayEXT`.
    /// ```
    /// VkResult vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, Display* dpy, VkDisplayKHR display);
    /// ```
    public static int vkAcquireXlibDisplayEXT(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment dpy, long display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkAcquireXlibDisplayEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquireXlibDisplayEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquireXlibDisplayEXT", physicalDevice, dpy, display); }
        return (int) Handles.MH_vkAcquireXlibDisplayEXT.invokeExact(physicalDevice.capabilities().PFN_vkAcquireXlibDisplayEXT, physicalDevice.segment(), dpy, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireXlibDisplayEXT", e); }
    }

    /// Invokes `vkGetRandROutputDisplayEXT`.
    /// ```
    /// VkResult vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, Display* dpy, RROutput rrOutput, VkDisplayKHR* pDisplay);
    /// ```
    public static int vkGetRandROutputDisplayEXT(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment dpy, int rrOutput, @NonNull MemorySegment pDisplay) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetRandROutputDisplayEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRandROutputDisplayEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRandROutputDisplayEXT", physicalDevice, dpy, rrOutput, pDisplay); }
        return (int) Handles.MH_vkGetRandROutputDisplayEXT.invokeExact(physicalDevice.capabilities().PFN_vkGetRandROutputDisplayEXT, physicalDevice.segment(), dpy, rrOutput, pDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRandROutputDisplayEXT", e); }
    }

}
