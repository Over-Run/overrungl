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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNVScissorExclusive {
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;
    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV = 1000205002;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV = 1000205001;
    public static final MethodHandle MH_vkCmdSetExclusiveScissorEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetExclusiveScissorNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdSetExclusiveScissorEnableNV;
    public final MemorySegment PFN_vkCmdSetExclusiveScissorNV;

    public VKNVScissorExclusive(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdSetExclusiveScissorEnableNV = func.invoke(device, "vkCmdSetExclusiveScissorEnableNV");
        PFN_vkCmdSetExclusiveScissorNV = func.invoke(device, "vkCmdSetExclusiveScissorNV");
    }

    public void CmdSetExclusiveScissorEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstExclusiveScissor, @CType("uint32_t") int exclusiveScissorCount, @CType("const VkBool32 *") MemorySegment pExclusiveScissorEnables) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetExclusiveScissorEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExclusiveScissorEnableNV");
        try { MH_vkCmdSetExclusiveScissorEnableNV.invokeExact(PFN_vkCmdSetExclusiveScissorEnableNV, commandBuffer, firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExclusiveScissorEnableNV", e); }
    }

    public void CmdSetExclusiveScissorNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstExclusiveScissor, @CType("uint32_t") int exclusiveScissorCount, @CType("const VkRect2D *") MemorySegment pExclusiveScissors) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetExclusiveScissorNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExclusiveScissorNV");
        try { MH_vkCmdSetExclusiveScissorNV.invokeExact(PFN_vkCmdSetExclusiveScissorNV, commandBuffer, firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExclusiveScissorNV", e); }
    }

}
