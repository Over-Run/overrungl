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
public class VKEXTHostQueryReset {
    public static final int VK_EXT_HOST_QUERY_RESET_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME = "VK_EXT_host_query_reset";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT = 1000261000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkResetQueryPoolEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkResetQueryPoolEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkResetQueryPoolEXT = func.invoke(device, "vkResetQueryPoolEXT", "vkResetQueryPool");
        }
    }

    public VKEXTHostQueryReset(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkResetQueryPoolEXT(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount);
    /// ```
    public void ResetQueryPoolEXT(MemorySegment device, long queryPool, int firstQuery, int queryCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkResetQueryPoolEXT)) throw new SymbolNotFoundError("Symbol not found: vkResetQueryPoolEXT");
        try { Handles.MH_vkResetQueryPoolEXT.invokeExact(handles.PFN_vkResetQueryPoolEXT, device, queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in ResetQueryPoolEXT", e); }
    }

}
