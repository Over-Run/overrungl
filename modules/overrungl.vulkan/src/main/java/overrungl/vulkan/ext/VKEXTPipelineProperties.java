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
import static overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.*;
public class VKEXTPipelineProperties {
    public static final int VK_EXT_PIPELINE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME = "VK_EXT_pipeline_properties";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT = 1000372000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT = 1000372001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT = VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPipelinePropertiesEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetPipelinePropertiesEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelinePropertiesEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelinePropertiesEXT);
        public final MemorySegment PFN_vkGetPipelinePropertiesEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPipelinePropertiesEXT = func.invoke(device, "vkGetPipelinePropertiesEXT");
        }
    }

    public VKEXTPipelineProperties(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPipelinePropertiesEXT(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineInfoEXT *") MemorySegment pPipelineInfo, @CType("VkBaseOutStructure *") MemorySegment pPipelineProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelinePropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelinePropertiesEXT");
        try { return (int) Handles.MH_vkGetPipelinePropertiesEXT.invokeExact(handles.PFN_vkGetPipelinePropertiesEXT, device, pPipelineInfo, pPipelineProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelinePropertiesEXT", e); }
    }

}
