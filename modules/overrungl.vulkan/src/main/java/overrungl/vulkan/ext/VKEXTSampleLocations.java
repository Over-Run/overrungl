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
public class VKEXTSampleLocations {
    public static final int VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;
    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 0x00001000;
    public static final int VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT = 1000143000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT = 1000143001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = 1000143002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = 1000143003;
    public static final int VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT = 1000143004;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetSampleLocationsEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceMultisamplePropertiesEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetSampleLocationsEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetSampleLocationsEXT);
        public static final MethodHandle MH_vkGetPhysicalDeviceMultisamplePropertiesEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceMultisamplePropertiesEXT);
        public final MemorySegment PFN_vkCmdSetSampleLocationsEXT;
        public final MemorySegment PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetSampleLocationsEXT = func.invoke(device, "vkCmdSetSampleLocationsEXT");
            PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT = func.invoke(device, "vkGetPhysicalDeviceMultisamplePropertiesEXT");
        }
    }

    public VKEXTSampleLocations(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetSampleLocationsEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkSampleLocationsInfoEXT *") MemorySegment pSampleLocationsInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetSampleLocationsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEXT");
        try { Handles.MH_vkCmdSetSampleLocationsEXT.invokeExact(handles.PFN_vkCmdSetSampleLocationsEXT, commandBuffer, pSampleLocationsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEXT", e); }
    }

    public void GetPhysicalDeviceMultisamplePropertiesEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkSampleCountFlagBits") int samples, @CType("VkMultisamplePropertiesEXT *") MemorySegment pMultisampleProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMultisamplePropertiesEXT");
        try { Handles.MH_vkGetPhysicalDeviceMultisamplePropertiesEXT.invokeExact(handles.PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT, physicalDevice, samples, pMultisampleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMultisamplePropertiesEXT", e); }
    }

}
