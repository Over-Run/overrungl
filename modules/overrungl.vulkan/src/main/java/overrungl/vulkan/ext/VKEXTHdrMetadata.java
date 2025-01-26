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
public class VKEXTHdrMetadata {
    public static final int VK_EXT_HDR_METADATA_SPEC_VERSION = 3;
    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";
    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = 1000105000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkSetHdrMetadataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkSetHdrMetadataEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkSetHdrMetadataEXT = func.invoke(device, "vkSetHdrMetadataEXT");
        }
    }

    public VKEXTHdrMetadata(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkSetHdrMetadataEXT(VkDevice device, uint32_t swapchainCount, const VkSwapchainKHR* pSwapchains, const VkHdrMetadataEXT* pMetadata);
    /// ```
    public void SetHdrMetadataEXT(MemorySegment device, int swapchainCount, MemorySegment pSwapchains, MemorySegment pMetadata) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetHdrMetadataEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetHdrMetadataEXT");
        try { Handles.MH_vkSetHdrMetadataEXT.invokeExact(handles.PFN_vkSetHdrMetadataEXT, device, swapchainCount, pSwapchains, pMetadata); }
        catch (Throwable e) { throw new RuntimeException("error in SetHdrMetadataEXT", e); }
    }

}
