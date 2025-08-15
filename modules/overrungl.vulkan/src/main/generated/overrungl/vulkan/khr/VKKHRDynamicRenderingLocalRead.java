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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_dynamic_rendering_local_read` - device extension
public final class VKKHRDynamicRenderingLocalRead {
    public static final int VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION = 1;
    public static final String VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME = "VK_KHR_dynamic_rendering_local_read";
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR = 1000232000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR = 1000232000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR = 1000232001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR = 1000232002;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetRenderingAttachmentLocationsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetRenderingInputAttachmentIndicesKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRDynamicRenderingLocalRead() {}

    /// Invokes `vkCmdSetRenderingAttachmentLocationsKHR`.
    /// ```
    /// void vkCmdSetRenderingAttachmentLocationsKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderingAttachmentLocationInfo* pLocationInfo);
    /// ```
    public static void vkCmdSetRenderingAttachmentLocationsKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pLocationInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRenderingAttachmentLocationsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRenderingAttachmentLocationsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRenderingAttachmentLocationsKHR", commandBuffer, pLocationInfo); }
        Handles.MH_vkCmdSetRenderingAttachmentLocationsKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRenderingAttachmentLocationsKHR, commandBuffer.segment(), pLocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingAttachmentLocationsKHR", e); }
    }

    /// Invokes `vkCmdSetRenderingInputAttachmentIndicesKHR`.
    /// ```
    /// void vkCmdSetRenderingInputAttachmentIndicesKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderingInputAttachmentIndexInfo* pInputAttachmentIndexInfo);
    /// ```
    public static void vkCmdSetRenderingInputAttachmentIndicesKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInputAttachmentIndexInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRenderingInputAttachmentIndicesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRenderingInputAttachmentIndicesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRenderingInputAttachmentIndicesKHR", commandBuffer, pInputAttachmentIndexInfo); }
        Handles.MH_vkCmdSetRenderingInputAttachmentIndicesKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRenderingInputAttachmentIndicesKHR, commandBuffer.segment(), pInputAttachmentIndexInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingInputAttachmentIndicesKHR", e); }
    }

}
