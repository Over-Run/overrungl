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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_shader_module_identifier` - device extension
public final class VKEXTShaderModuleIdentifier {
    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT = 1000462000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT = 1000462003;
    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;
    public static final class Handles {
        public static final MethodHandle MH_vkGetShaderModuleIdentifierEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetShaderModuleCreateInfoIdentifierEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTShaderModuleIdentifier() {}

    /// Invokes `vkGetShaderModuleIdentifierEXT`.
    /// ```
    /// void vkGetShaderModuleIdentifierEXT((struct VkDevice*) VkDevice device, (uint64_t) VkShaderModule shaderModule, VkShaderModuleIdentifierEXT* pIdentifier);
    /// ```
    public static void vkGetShaderModuleIdentifierEXT(@NonNull VkDevice device, long shaderModule, @NonNull MemorySegment pIdentifier) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderModuleIdentifierEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetShaderModuleIdentifierEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetShaderModuleIdentifierEXT", device, shaderModule, pIdentifier); }
        Handles.MH_vkGetShaderModuleIdentifierEXT.invokeExact(device.capabilities().PFN_vkGetShaderModuleIdentifierEXT, device.segment(), shaderModule, pIdentifier); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderModuleIdentifierEXT", e); }
    }

    /// Invokes `vkGetShaderModuleCreateInfoIdentifierEXT`.
    /// ```
    /// void vkGetShaderModuleCreateInfoIdentifierEXT((struct VkDevice*) VkDevice device, const VkShaderModuleCreateInfo* pCreateInfo, VkShaderModuleIdentifierEXT* pIdentifier);
    /// ```
    public static void vkGetShaderModuleCreateInfoIdentifierEXT(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pIdentifier) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderModuleCreateInfoIdentifierEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetShaderModuleCreateInfoIdentifierEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetShaderModuleCreateInfoIdentifierEXT", device, pCreateInfo, pIdentifier); }
        Handles.MH_vkGetShaderModuleCreateInfoIdentifierEXT.invokeExact(device.capabilities().PFN_vkGetShaderModuleCreateInfoIdentifierEXT, device.segment(), pCreateInfo, pIdentifier); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderModuleCreateInfoIdentifierEXT", e); }
    }

}
