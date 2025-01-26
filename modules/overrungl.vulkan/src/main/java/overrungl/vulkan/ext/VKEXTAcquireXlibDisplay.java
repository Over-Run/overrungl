/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTAcquireXlibDisplay {
    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkAcquireXlibDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetRandROutputDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkAcquireXlibDisplayEXT;
        public final MemorySegment PFN_vkGetRandROutputDisplayEXT;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkAcquireXlibDisplayEXT = func.invoke(instance, "vkAcquireXlibDisplayEXT");
            PFN_vkGetRandROutputDisplayEXT = func.invoke(instance, "vkGetRandROutputDisplayEXT");
        }
    }

    public VKEXTAcquireXlibDisplay(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, Display* dpy, VkDisplayKHR display);
    /// ```
    public int AcquireXlibDisplayEXT(MemorySegment physicalDevice, MemorySegment dpy, long display) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAcquireXlibDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkAcquireXlibDisplayEXT");
        try { return (int) Handles.MH_vkAcquireXlibDisplayEXT.invokeExact(handles.PFN_vkAcquireXlibDisplayEXT, physicalDevice, dpy, display); }
        catch (Throwable e) { throw new RuntimeException("error in AcquireXlibDisplayEXT", e); }
    }

    /// ```
    /// VkResult vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, Display* dpy, RROutput rrOutput, VkDisplayKHR* pDisplay);
    /// ```
    public int GetRandROutputDisplayEXT(MemorySegment physicalDevice, MemorySegment dpy, long rrOutput, MemorySegment pDisplay) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRandROutputDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetRandROutputDisplayEXT");
        try { return (int) Handles.MH_vkGetRandROutputDisplayEXT.invoke(handles.PFN_vkGetRandROutputDisplayEXT, physicalDevice, dpy, MemoryUtil.narrowingLong(CanonicalTypes.C_LONG, rrOutput), pDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in GetRandROutputDisplayEXT", e); }
    }

}
