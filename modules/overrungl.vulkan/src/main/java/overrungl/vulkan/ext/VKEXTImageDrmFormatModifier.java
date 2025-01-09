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
public class VKEXTImageDrmFormatModifier {
    public static final int VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION = 2;
    public static final String VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME = "VK_EXT_image_drm_format_modifier";
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT = 1000158000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT = 1000158002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT = 1000158003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT = 1000158004;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT = 1000158005;
    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 0x00000080;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 0x00000100;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 0x00000200;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 0x00000400;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT = 1000158006;
    public static final MethodHandle MH_vkGetImageDrmFormatModifierPropertiesEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetImageDrmFormatModifierPropertiesEXT;

    public VKEXTImageDrmFormatModifier(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetImageDrmFormatModifierPropertiesEXT = func.invoke(device, "vkGetImageDrmFormatModifierPropertiesEXT");
    }

    public @CType("VkResult") int GetImageDrmFormatModifierPropertiesEXT(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("VkImageDrmFormatModifierPropertiesEXT *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetImageDrmFormatModifierPropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageDrmFormatModifierPropertiesEXT");
        try { return (int) MH_vkGetImageDrmFormatModifierPropertiesEXT.invokeExact(PFN_vkGetImageDrmFormatModifierPropertiesEXT, device, image, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageDrmFormatModifierPropertiesEXT", e); }
    }

}
