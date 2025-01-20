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
import java.util.*;
public class VKEXTShaderModuleIdentifier {
    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT = 1000462000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT = 1000462003;
    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetShaderModuleIdentifierEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetShaderModuleCreateInfoIdentifierEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetShaderModuleIdentifierEXT,
            FD_vkGetShaderModuleCreateInfoIdentifierEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetShaderModuleIdentifierEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetShaderModuleIdentifierEXT);
        public static final MethodHandle MH_vkGetShaderModuleCreateInfoIdentifierEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetShaderModuleCreateInfoIdentifierEXT);
        public final MemorySegment PFN_vkGetShaderModuleIdentifierEXT;
        public final MemorySegment PFN_vkGetShaderModuleCreateInfoIdentifierEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetShaderModuleIdentifierEXT = func.invoke(device, "vkGetShaderModuleIdentifierEXT");
            PFN_vkGetShaderModuleCreateInfoIdentifierEXT = func.invoke(device, "vkGetShaderModuleCreateInfoIdentifierEXT");
        }
    }

    public VKEXTShaderModuleIdentifier(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void GetShaderModuleIdentifierEXT(@CType("VkDevice") MemorySegment device, @CType("VkShaderModule") MemorySegment shaderModule, @CType("VkShaderModuleIdentifierEXT *") MemorySegment pIdentifier) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetShaderModuleIdentifierEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderModuleIdentifierEXT");
        try { Handles.MH_vkGetShaderModuleIdentifierEXT.invokeExact(handles.PFN_vkGetShaderModuleIdentifierEXT, device, shaderModule, pIdentifier); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderModuleIdentifierEXT", e); }
    }

    public void GetShaderModuleCreateInfoIdentifierEXT(@CType("VkDevice") MemorySegment device, @CType("const VkShaderModuleCreateInfo *") MemorySegment pCreateInfo, @CType("VkShaderModuleIdentifierEXT *") MemorySegment pIdentifier) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetShaderModuleCreateInfoIdentifierEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderModuleCreateInfoIdentifierEXT");
        try { Handles.MH_vkGetShaderModuleCreateInfoIdentifierEXT.invokeExact(handles.PFN_vkGetShaderModuleCreateInfoIdentifierEXT, device, pCreateInfo, pIdentifier); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderModuleCreateInfoIdentifierEXT", e); }
    }

}
