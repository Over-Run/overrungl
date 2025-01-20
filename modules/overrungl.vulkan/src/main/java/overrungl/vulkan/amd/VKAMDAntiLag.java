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
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKAMDAntiLag {
    public static final int VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD = 0;
    public static final int VK_ANTI_LAG_MODE_ON_AMD = 1;
    public static final int VK_ANTI_LAG_MODE_OFF_AMD = 2;
    public static final int VK_ANTI_LAG_STAGE_INPUT_AMD = 0;
    public static final int VK_ANTI_LAG_STAGE_PRESENT_AMD = 1;
    public static final int VK_AMD_ANTI_LAG_SPEC_VERSION = 1;
    public static final String VK_AMD_ANTI_LAG_EXTENSION_NAME = "VK_AMD_anti_lag";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD = 1000476000;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD = 1000476001;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD = 1000476002;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkAntiLagUpdateAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkAntiLagUpdateAMD;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkAntiLagUpdateAMD = func.invoke(device, "vkAntiLagUpdateAMD");
        }
    }

    public VKAMDAntiLag(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void AntiLagUpdateAMD(@CType("VkDevice") MemorySegment device, @CType("const VkAntiLagDataAMD *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkAntiLagUpdateAMD)) throw new SymbolNotFoundError("Symbol not found: vkAntiLagUpdateAMD");
        try { Handles.MH_vkAntiLagUpdateAMD.invokeExact(handles.PFN_vkAntiLagUpdateAMD, device, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkAntiLagUpdateAMD", e); }
    }

}
