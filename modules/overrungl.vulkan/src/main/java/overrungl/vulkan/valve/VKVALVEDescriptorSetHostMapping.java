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
package overrungl.vulkan.valve;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
public class VKVALVEDescriptorSetHostMapping {
    public static final int VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION = 1;
    public static final String VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME = "VK_VALVE_descriptor_set_host_mapping";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE = 1000420000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE = 1000420001;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE = 1000420002;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetDescriptorSetLayoutHostMappingInfoVALVE = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDescriptorSetHostMappingVALVE = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetDescriptorSetLayoutHostMappingInfoVALVE,
            FD_vkGetDescriptorSetHostMappingVALVE
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetDescriptorSetLayoutHostMappingInfoVALVE = RuntimeHelper.downcall(Descriptors.FD_vkGetDescriptorSetLayoutHostMappingInfoVALVE);
        public static final MethodHandle MH_vkGetDescriptorSetHostMappingVALVE = RuntimeHelper.downcall(Descriptors.FD_vkGetDescriptorSetHostMappingVALVE);
        public final MemorySegment PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE;
        public final MemorySegment PFN_vkGetDescriptorSetHostMappingVALVE;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE = func.invoke(device, "vkGetDescriptorSetLayoutHostMappingInfoVALVE");
            PFN_vkGetDescriptorSetHostMappingVALVE = func.invoke(device, "vkGetDescriptorSetHostMappingVALVE");
        }
    }

    public VKVALVEDescriptorSetHostMapping(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void GetDescriptorSetLayoutHostMappingInfoVALVE(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetBindingReferenceVALVE *") MemorySegment pBindingReference, @CType("VkDescriptorSetLayoutHostMappingInfoVALVE *") MemorySegment pHostMapping) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutHostMappingInfoVALVE");
        try { Handles.MH_vkGetDescriptorSetLayoutHostMappingInfoVALVE.invokeExact(handles.PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE, device, pBindingReference, pHostMapping); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutHostMappingInfoVALVE", e); }
    }

    public void GetDescriptorSetHostMappingVALVE(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSet") MemorySegment descriptorSet, @CType("void **") MemorySegment ppData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDescriptorSetHostMappingVALVE)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetHostMappingVALVE");
        try { Handles.MH_vkGetDescriptorSetHostMappingVALVE.invokeExact(handles.PFN_vkGetDescriptorSetHostMappingVALVE, device, descriptorSet, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetHostMappingVALVE", e); }
    }

}
