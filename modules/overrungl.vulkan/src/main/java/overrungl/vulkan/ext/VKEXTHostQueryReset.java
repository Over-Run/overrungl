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
import static overrungl.vulkan.VK12.*;
public class VKEXTHostQueryReset {
    public static final int VK_EXT_HOST_QUERY_RESET_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME = "VK_EXT_host_query_reset";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES;
    public static final MethodHandle MH_vkResetQueryPoolEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_vkResetQueryPoolEXT;

    public VKEXTHostQueryReset(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkResetQueryPoolEXT = func.invoke(device, "vkResetQueryPoolEXT", "vkResetQueryPool");
    }

    public void ResetQueryPoolEXT(@CType("VkDevice") MemorySegment device, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount) {
        if (Unmarshal.isNullPointer(PFN_vkResetQueryPoolEXT)) throw new SymbolNotFoundError("Symbol not found: vkResetQueryPoolEXT");
        try { MH_vkResetQueryPoolEXT.invokeExact(PFN_vkResetQueryPoolEXT, device, queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetQueryPoolEXT", e); }
    }

}