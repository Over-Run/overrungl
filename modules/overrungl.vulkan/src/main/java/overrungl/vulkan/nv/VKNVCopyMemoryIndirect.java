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
public class VKNVCopyMemoryIndirect {
    public static final int VK_NV_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final String VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_NV_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV = 1000426000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV = 1000426001;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdCopyMemoryIndirectNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdCopyMemoryToImageIndirectNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdCopyMemoryIndirectNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyMemoryIndirectNV);
        public static final MethodHandle MH_vkCmdCopyMemoryToImageIndirectNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyMemoryToImageIndirectNV);
        public final MemorySegment PFN_vkCmdCopyMemoryIndirectNV;
        public final MemorySegment PFN_vkCmdCopyMemoryToImageIndirectNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdCopyMemoryIndirectNV = func.invoke(device, "vkCmdCopyMemoryIndirectNV");
            PFN_vkCmdCopyMemoryToImageIndirectNV = func.invoke(device, "vkCmdCopyMemoryToImageIndirectNV");
        }
    }

    public VKNVCopyMemoryIndirect(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdCopyMemoryIndirectNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDeviceAddress") long copyBufferAddress, @CType("uint32_t") int copyCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyMemoryIndirectNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMemoryIndirectNV");
        try { Handles.MH_vkCmdCopyMemoryIndirectNV.invokeExact(handles.PFN_vkCmdCopyMemoryIndirectNV, commandBuffer, copyBufferAddress, copyCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryIndirectNV", e); }
    }

    public void CmdCopyMemoryToImageIndirectNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDeviceAddress") long copyBufferAddress, @CType("uint32_t") int copyCount, @CType("uint32_t") int stride, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("const VkImageSubresourceLayers *") MemorySegment pImageSubresources) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyMemoryToImageIndirectNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToImageIndirectNV");
        try { Handles.MH_vkCmdCopyMemoryToImageIndirectNV.invokeExact(handles.PFN_vkCmdCopyMemoryToImageIndirectNV, commandBuffer, copyBufferAddress, copyCount, stride, dstImage, dstImageLayout, pImageSubresources); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToImageIndirectNV", e); }
    }

}
