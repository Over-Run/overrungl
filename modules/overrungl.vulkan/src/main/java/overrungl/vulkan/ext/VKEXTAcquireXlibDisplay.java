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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTAcquireXlibDisplay {
    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkAcquireXlibDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRandROutputDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkAcquireXlibDisplayEXT;
        public final MemorySegment PFN_vkGetRandROutputDisplayEXT;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkAcquireXlibDisplayEXT = func.invoke(instance, "vkAcquireXlibDisplayEXT");
            PFN_vkGetRandROutputDisplayEXT = func.invoke(instance, "vkGetRandROutputDisplayEXT");
        }
    }

    public VKEXTAcquireXlibDisplay(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int AcquireXlibDisplayEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("Display *") MemorySegment dpy, @CType("VkDisplayKHR") MemorySegment display) {
        if (Unmarshal.isNullPointer(handles.PFN_vkAcquireXlibDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkAcquireXlibDisplayEXT");
        try { return (int) Handles.MH_vkAcquireXlibDisplayEXT.invokeExact(handles.PFN_vkAcquireXlibDisplayEXT, physicalDevice, dpy, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireXlibDisplayEXT", e); }
    }

    public @CType("VkResult") int GetRandROutputDisplayEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("Display *") MemorySegment dpy, @CType("RROutput") long rrOutput, @CType("VkDisplayKHR *") MemorySegment pDisplay) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRandROutputDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetRandROutputDisplayEXT");
        try { return (int) Handles.MH_vkGetRandROutputDisplayEXT.invokeExact(handles.PFN_vkGetRandROutputDisplayEXT, physicalDevice, dpy, rrOutput, pDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRandROutputDisplayEXT", e); }
    }

}
