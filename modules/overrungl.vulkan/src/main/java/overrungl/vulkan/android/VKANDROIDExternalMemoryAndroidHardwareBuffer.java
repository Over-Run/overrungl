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
package overrungl.vulkan.android;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
public class VKANDROIDExternalMemoryAndroidHardwareBuffer {
    public static final int VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION = 5;
    public static final String VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME = "VK_ANDROID_external_memory_android_hardware_buffer";
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID = 0x00000400;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID = 1000129000;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID = 1000129001;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID = 1000129002;
    public static final int VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = 1000129003;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = 1000129004;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID = 1000129005;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID = 1000129006;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetAndroidHardwareBufferPropertiesANDROID = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetMemoryAndroidHardwareBufferANDROID = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetAndroidHardwareBufferPropertiesANDROID,
            FD_vkGetMemoryAndroidHardwareBufferANDROID
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetAndroidHardwareBufferPropertiesANDROID = RuntimeHelper.downcall(Descriptors.FD_vkGetAndroidHardwareBufferPropertiesANDROID);
        public static final MethodHandle MH_vkGetMemoryAndroidHardwareBufferANDROID = RuntimeHelper.downcall(Descriptors.FD_vkGetMemoryAndroidHardwareBufferANDROID);
        public final MemorySegment PFN_vkGetAndroidHardwareBufferPropertiesANDROID;
        public final MemorySegment PFN_vkGetMemoryAndroidHardwareBufferANDROID;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetAndroidHardwareBufferPropertiesANDROID = func.invoke(device, "vkGetAndroidHardwareBufferPropertiesANDROID");
            PFN_vkGetMemoryAndroidHardwareBufferANDROID = func.invoke(device, "vkGetMemoryAndroidHardwareBufferANDROID");
        }
    }

    public VKANDROIDExternalMemoryAndroidHardwareBuffer(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetAndroidHardwareBufferPropertiesANDROID(@CType("VkDevice") MemorySegment device, @CType("const struct AHardwareBuffer *") MemorySegment buffer, @CType("VkAndroidHardwareBufferPropertiesANDROID *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetAndroidHardwareBufferPropertiesANDROID)) throw new SymbolNotFoundError("Symbol not found: vkGetAndroidHardwareBufferPropertiesANDROID");
        try { return (int) Handles.MH_vkGetAndroidHardwareBufferPropertiesANDROID.invokeExact(handles.PFN_vkGetAndroidHardwareBufferPropertiesANDROID, device, buffer, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAndroidHardwareBufferPropertiesANDROID", e); }
    }

    public @CType("VkResult") int GetMemoryAndroidHardwareBufferANDROID(@CType("VkDevice") MemorySegment device, @CType("const VkMemoryGetAndroidHardwareBufferInfoANDROID *") MemorySegment pInfo, @CType("struct AHardwareBuffer **") MemorySegment pBuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetMemoryAndroidHardwareBufferANDROID)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryAndroidHardwareBufferANDROID");
        try { return (int) Handles.MH_vkGetMemoryAndroidHardwareBufferANDROID.invokeExact(handles.PFN_vkGetMemoryAndroidHardwareBufferANDROID, device, pInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryAndroidHardwareBufferANDROID", e); }
    }

}
