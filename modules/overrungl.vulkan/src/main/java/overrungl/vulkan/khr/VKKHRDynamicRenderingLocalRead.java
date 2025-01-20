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
import static overrungl.vulkan.VK14.*;
public class VKKHRDynamicRenderingLocalRead {
    public static final int VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION = 1;
    public static final String VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME = "VK_KHR_dynamic_rendering_local_read";
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR = VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR = VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR = VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetRenderingAttachmentLocationsKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetRenderingInputAttachmentIndicesKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetRenderingAttachmentLocationsKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetRenderingAttachmentLocationsKHR);
        public static final MethodHandle MH_vkCmdSetRenderingInputAttachmentIndicesKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetRenderingInputAttachmentIndicesKHR);
        public final MemorySegment PFN_vkCmdSetRenderingAttachmentLocationsKHR;
        public final MemorySegment PFN_vkCmdSetRenderingInputAttachmentIndicesKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetRenderingAttachmentLocationsKHR = func.invoke(device, "vkCmdSetRenderingAttachmentLocationsKHR", "vkCmdSetRenderingAttachmentLocations");
            PFN_vkCmdSetRenderingInputAttachmentIndicesKHR = func.invoke(device, "vkCmdSetRenderingInputAttachmentIndicesKHR", "vkCmdSetRenderingInputAttachmentIndices");
        }
    }

    public VKKHRDynamicRenderingLocalRead(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetRenderingAttachmentLocationsKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderingAttachmentLocationInfo *") MemorySegment pLocationInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRenderingAttachmentLocationsKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRenderingAttachmentLocationsKHR");
        try { Handles.MH_vkCmdSetRenderingAttachmentLocationsKHR.invokeExact(handles.PFN_vkCmdSetRenderingAttachmentLocationsKHR, commandBuffer, pLocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingAttachmentLocationsKHR", e); }
    }

    public void CmdSetRenderingInputAttachmentIndicesKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderingInputAttachmentIndexInfo *") MemorySegment pInputAttachmentIndexInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRenderingInputAttachmentIndicesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRenderingInputAttachmentIndicesKHR");
        try { Handles.MH_vkCmdSetRenderingInputAttachmentIndicesKHR.invokeExact(handles.PFN_vkCmdSetRenderingInputAttachmentIndicesKHR, commandBuffer, pInputAttachmentIndexInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingInputAttachmentIndicesKHR", e); }
    }

}
