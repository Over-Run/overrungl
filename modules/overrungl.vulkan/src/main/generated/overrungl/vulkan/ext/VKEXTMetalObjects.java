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
public final class VKEXTMetalObjects {
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT = 0x00000001;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 0x00000002;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT = 0x00000004;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT = 0x00000008;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT = 0x00000010;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT = 0x00000020;
    public static final int VK_EXT_METAL_OBJECTS_SPEC_VERSION = 2;
    public static final String VK_EXT_METAL_OBJECTS_EXTENSION_NAME = "VK_EXT_metal_objects";
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT = 1000311000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT = 1000311001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT = 1000311002;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT = 1000311003;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT = 1000311004;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT = 1000311005;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT = 1000311006;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT = 1000311007;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT = 1000311008;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT = 1000311009;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311010;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311011;
    public static final class Handles {
        public static final MethodHandle MH_vkExportMetalObjectsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTMetalObjects() {}

    /// ```
    /// void vkExportMetalObjectsEXT((struct VkDevice*) VkDevice device, VkExportMetalObjectsInfoEXT* pMetalObjectsInfo);
    /// ```
    public static void vkExportMetalObjectsEXT(VkDevice device, MemorySegment pMetalObjectsInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkExportMetalObjectsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkExportMetalObjectsEXT");
        try { Handles.MH_vkExportMetalObjectsEXT.invokeExact(device.capabilities().PFN_vkExportMetalObjectsEXT, device.segment(), pMetalObjectsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkExportMetalObjectsEXT", e); }
    }

}
