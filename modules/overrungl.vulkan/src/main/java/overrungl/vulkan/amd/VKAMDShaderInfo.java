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
public class VKAMDShaderInfo {
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;
    public static final int VK_AMD_SHADER_INFO_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetShaderInfoAMD = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetShaderInfoAMD;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetShaderInfoAMD = func.invoke(device, "vkGetShaderInfoAMD");
        }
    }

    public VKAMDShaderInfo(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetShaderInfoAMD(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("VkShaderStageFlagBits") int shaderStage, @CType("VkShaderInfoTypeAMD") int infoType, @CType("size_t *") MemorySegment pInfoSize, @CType("void *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetShaderInfoAMD)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderInfoAMD");
        try { return (int) Handles.MH_vkGetShaderInfoAMD.invokeExact(handles.PFN_vkGetShaderInfoAMD, device, pipeline, shaderStage, infoType, pInfoSize, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderInfoAMD", e); }
    }

}
