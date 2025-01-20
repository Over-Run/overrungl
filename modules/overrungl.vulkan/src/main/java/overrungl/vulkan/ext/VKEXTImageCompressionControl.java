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
import static overrungl.vulkan.VK14.*;
public class VKEXTImageCompressionControl {
    public static final int VK_IMAGE_COMPRESSION_DEFAULT_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 0x00000001;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 0x00000002;
    public static final int VK_IMAGE_COMPRESSION_DISABLED_EXT = 0x00000004;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT = 0x00000001;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT = 0x00000002;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT = 0x00000004;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT = 0x00000008;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT = 0x00000010;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT = 0x00000020;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT = 0x00000040;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT = 0x00000080;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT = 0x00000100;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 0x00000200;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 0x00000400;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 0x00000800;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 0x00001000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 0x00002000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 0x00004000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 0x00008000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 0x00010000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 0x00020000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 0x00040000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 0x00080000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 0x00100000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 0x00200000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 0x00400000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 0x00800000;
    public static final int VK_EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME = "VK_EXT_image_compression_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT = 1000338000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT = 1000338001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT = 1000338004;
    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT = VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT = VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetImageSubresourceLayout2EXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetImageSubresourceLayout2EXT = RuntimeHelper.downcall(Descriptors.FD_vkGetImageSubresourceLayout2EXT);
        public final MemorySegment PFN_vkGetImageSubresourceLayout2EXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetImageSubresourceLayout2EXT = func.invoke(device, "vkGetImageSubresourceLayout2EXT", "vkGetImageSubresourceLayout2");
        }
    }

    public VKEXTImageCompressionControl(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void GetImageSubresourceLayout2EXT(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkImageSubresource2 *") MemorySegment pSubresource, @CType("VkSubresourceLayout2 *") MemorySegment pLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageSubresourceLayout2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2EXT");
        try { Handles.MH_vkGetImageSubresourceLayout2EXT.invokeExact(handles.PFN_vkGetImageSubresourceLayout2EXT, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2EXT", e); }
    }

}
