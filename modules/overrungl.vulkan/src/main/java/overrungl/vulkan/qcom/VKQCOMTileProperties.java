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
package overrungl.vulkan.qcom;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKQCOMTileProperties {
    public static final int VK_QCOM_TILE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_PROPERTIES_EXTENSION_NAME = "VK_QCOM_tile_properties";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM = 1000484000;
    public static final int VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM = 1000484001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetFramebufferTilePropertiesQCOM = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDynamicRenderingTilePropertiesQCOM = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetFramebufferTilePropertiesQCOM;
        public final MemorySegment PFN_vkGetDynamicRenderingTilePropertiesQCOM;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetFramebufferTilePropertiesQCOM = func.invoke(device, "vkGetFramebufferTilePropertiesQCOM");
            PFN_vkGetDynamicRenderingTilePropertiesQCOM = func.invoke(device, "vkGetDynamicRenderingTilePropertiesQCOM");
        }
    }

    public VKQCOMTileProperties(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetFramebufferTilePropertiesQCOM(@CType("VkDevice") MemorySegment device, @CType("VkFramebuffer") MemorySegment framebuffer, @CType("uint32_t *") MemorySegment pPropertiesCount, @CType("VkTilePropertiesQCOM *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetFramebufferTilePropertiesQCOM)) throw new SymbolNotFoundError("Symbol not found: vkGetFramebufferTilePropertiesQCOM");
        try { return (int) Handles.MH_vkGetFramebufferTilePropertiesQCOM.invokeExact(handles.PFN_vkGetFramebufferTilePropertiesQCOM, device, framebuffer, pPropertiesCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFramebufferTilePropertiesQCOM", e); }
    }

    public @CType("VkResult") int GetDynamicRenderingTilePropertiesQCOM(@CType("VkDevice") MemorySegment device, @CType("const VkRenderingInfo *") MemorySegment pRenderingInfo, @CType("VkTilePropertiesQCOM *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDynamicRenderingTilePropertiesQCOM)) throw new SymbolNotFoundError("Symbol not found: vkGetDynamicRenderingTilePropertiesQCOM");
        try { return (int) Handles.MH_vkGetDynamicRenderingTilePropertiesQCOM.invokeExact(handles.PFN_vkGetDynamicRenderingTilePropertiesQCOM, device, pRenderingInfo, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDynamicRenderingTilePropertiesQCOM", e); }
    }

}
