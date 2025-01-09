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
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK13.*;
public class VKKHRCopyCommands2 {
    public static final int VK_KHR_COPY_COMMANDS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME = "VK_KHR_copy_commands2";
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR = VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR = VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR = VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR = VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR = VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR = VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR = VK_STRUCTURE_TYPE_BUFFER_COPY_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR = VK_STRUCTURE_TYPE_IMAGE_COPY_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR = VK_STRUCTURE_TYPE_IMAGE_BLIT_2;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR = VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR = VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2;
    public static final MethodHandle MH_vkCmdCopyBuffer2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyBufferToImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyImageToBuffer2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBlitImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdResolveImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdCopyBuffer2KHR;
    public final MemorySegment PFN_vkCmdCopyImage2KHR;
    public final MemorySegment PFN_vkCmdCopyBufferToImage2KHR;
    public final MemorySegment PFN_vkCmdCopyImageToBuffer2KHR;
    public final MemorySegment PFN_vkCmdBlitImage2KHR;
    public final MemorySegment PFN_vkCmdResolveImage2KHR;

    public VKKHRCopyCommands2(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdCopyBuffer2KHR = func.invoke(device, "vkCmdCopyBuffer2KHR", "vkCmdCopyBuffer2");
        PFN_vkCmdCopyImage2KHR = func.invoke(device, "vkCmdCopyImage2KHR", "vkCmdCopyImage2");
        PFN_vkCmdCopyBufferToImage2KHR = func.invoke(device, "vkCmdCopyBufferToImage2KHR", "vkCmdCopyBufferToImage2");
        PFN_vkCmdCopyImageToBuffer2KHR = func.invoke(device, "vkCmdCopyImageToBuffer2KHR", "vkCmdCopyImageToBuffer2");
        PFN_vkCmdBlitImage2KHR = func.invoke(device, "vkCmdBlitImage2KHR", "vkCmdBlitImage2");
        PFN_vkCmdResolveImage2KHR = func.invoke(device, "vkCmdResolveImage2KHR", "vkCmdResolveImage2");
    }

    public void CmdCopyBuffer2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyBufferInfo2 *") MemorySegment pCopyBufferInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyBuffer2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBuffer2KHR");
        try { MH_vkCmdCopyBuffer2KHR.invokeExact(PFN_vkCmdCopyBuffer2KHR, commandBuffer, pCopyBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer2KHR", e); }
    }

    public void CmdCopyImage2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyImageInfo2 *") MemorySegment pCopyImageInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImage2KHR");
        try { MH_vkCmdCopyImage2KHR.invokeExact(PFN_vkCmdCopyImage2KHR, commandBuffer, pCopyImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage2KHR", e); }
    }

    public void CmdCopyBufferToImage2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyBufferToImageInfo2 *") MemorySegment pCopyBufferToImageInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyBufferToImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage2KHR");
        try { MH_vkCmdCopyBufferToImage2KHR.invokeExact(PFN_vkCmdCopyBufferToImage2KHR, commandBuffer, pCopyBufferToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage2KHR", e); }
    }

    public void CmdCopyImageToBuffer2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyImageToBufferInfo2 *") MemorySegment pCopyImageToBufferInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyImageToBuffer2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer2KHR");
        try { MH_vkCmdCopyImageToBuffer2KHR.invokeExact(PFN_vkCmdCopyImageToBuffer2KHR, commandBuffer, pCopyImageToBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer2KHR", e); }
    }

    public void CmdBlitImage2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkBlitImageInfo2 *") MemorySegment pBlitImageInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBlitImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBlitImage2KHR");
        try { MH_vkCmdBlitImage2KHR.invokeExact(PFN_vkCmdBlitImage2KHR, commandBuffer, pBlitImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage2KHR", e); }
    }

    public void CmdResolveImage2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkResolveImageInfo2 *") MemorySegment pResolveImageInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdResolveImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdResolveImage2KHR");
        try { MH_vkCmdResolveImage2KHR.invokeExact(PFN_vkCmdResolveImage2KHR, commandBuffer, pResolveImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage2KHR", e); }
    }

}
