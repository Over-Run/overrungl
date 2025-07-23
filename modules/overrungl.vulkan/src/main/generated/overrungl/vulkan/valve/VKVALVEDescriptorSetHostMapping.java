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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKVALVEDescriptorSetHostMapping {
    public static final int VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION = 1;
    public static final String VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME = "VK_VALVE_descriptor_set_host_mapping";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE = 1000420000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE = 1000420001;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE = 1000420002;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDescriptorSetLayoutHostMappingInfoVALVE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDescriptorSetHostMappingVALVE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKVALVEDescriptorSetHostMapping() {}

    /// ```
    /// void vkGetDescriptorSetLayoutHostMappingInfoVALVE((struct VkDevice*) VkDevice device, const VkDescriptorSetBindingReferenceVALVE* pBindingReference, VkDescriptorSetLayoutHostMappingInfoVALVE* pHostMapping);
    /// ```
    public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, MemorySegment pBindingReference, MemorySegment pHostMapping) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutHostMappingInfoVALVE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDescriptorSetLayoutHostMappingInfoVALVE", device, pBindingReference, pHostMapping); }
        Handles.MH_vkGetDescriptorSetLayoutHostMappingInfoVALVE.invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE, device.segment(), pBindingReference, pHostMapping); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutHostMappingInfoVALVE", e); }
    }

    /// ```
    /// void vkGetDescriptorSetHostMappingVALVE((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSet descriptorSet, void** ppData);
    /// ```
    public static void vkGetDescriptorSetHostMappingVALVE(VkDevice device, long descriptorSet, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetHostMappingVALVE)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetHostMappingVALVE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDescriptorSetHostMappingVALVE", device, descriptorSet, ppData); }
        Handles.MH_vkGetDescriptorSetHostMappingVALVE.invokeExact(device.capabilities().PFN_vkGetDescriptorSetHostMappingVALVE, device.segment(), descriptorSet, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetHostMappingVALVE", e); }
    }

}
