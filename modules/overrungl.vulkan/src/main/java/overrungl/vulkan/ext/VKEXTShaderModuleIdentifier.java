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
public final class VKEXTShaderModuleIdentifier {
    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT = 1000462000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT = 1000462003;
    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;
    public static final class Handles {
        public static final MethodHandle MH_vkGetShaderModuleIdentifierEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetShaderModuleCreateInfoIdentifierEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTShaderModuleIdentifier() {}

    /// ```
    /// void vkGetShaderModuleIdentifierEXT((struct VkDevice*) VkDevice device, (uint64_t) VkShaderModule shaderModule, VkShaderModuleIdentifierEXT* pIdentifier);
    /// ```
    public static void vkGetShaderModuleIdentifierEXT(VkDevice device, long shaderModule, MemorySegment pIdentifier) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderModuleIdentifierEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderModuleIdentifierEXT");
        try { Handles.MH_vkGetShaderModuleIdentifierEXT.invokeExact(device.capabilities().PFN_vkGetShaderModuleIdentifierEXT, device.segment(), shaderModule, pIdentifier); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderModuleIdentifierEXT", e); }
    }

    /// ```
    /// void vkGetShaderModuleCreateInfoIdentifierEXT((struct VkDevice*) VkDevice device, const VkShaderModuleCreateInfo* pCreateInfo, VkShaderModuleIdentifierEXT* pIdentifier);
    /// ```
    public static void vkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, MemorySegment pCreateInfo, MemorySegment pIdentifier) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderModuleCreateInfoIdentifierEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderModuleCreateInfoIdentifierEXT");
        try { Handles.MH_vkGetShaderModuleCreateInfoIdentifierEXT.invokeExact(device.capabilities().PFN_vkGetShaderModuleCreateInfoIdentifierEXT, device.segment(), pCreateInfo, pIdentifier); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderModuleCreateInfoIdentifierEXT", e); }
    }

}
