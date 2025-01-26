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
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKFUCHSIABufferCollection {
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_RARELY_FUCHSIA = 0x00000001;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_OFTEN_FUCHSIA = 0x00000002;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_RARELY_FUCHSIA = 0x00000004;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_OFTEN_FUCHSIA = 0x00000008;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_PROTECTED_OPTIONAL_FUCHSIA = 0x00000010;
    public static final int VK_FUCHSIA_BUFFER_COLLECTION_SPEC_VERSION = 2;
    public static final String VK_FUCHSIA_BUFFER_COLLECTION_EXTENSION_NAME = "VK_FUCHSIA_buffer_collection";
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CREATE_INFO_FUCHSIA = 1000366000;
    public static final int VK_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA = 1000366000;
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA = 1000366001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_IMAGE_CREATE_INFO_FUCHSIA = 1000366002;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_PROPERTIES_FUCHSIA = 1000366003;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CONSTRAINTS_INFO_FUCHSIA = 1000366004;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA = 1000366005;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CONSTRAINTS_INFO_FUCHSIA = 1000366006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA = 1000366007;
    public static final int VK_STRUCTURE_TYPE_SYSMEM_COLOR_SPACE_FUCHSIA = 1000366008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA = 1000366009;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA_EXT = 1000366000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateBufferCollectionFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetBufferCollectionImageConstraintsFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetBufferCollectionBufferConstraintsFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBufferCollectionFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferCollectionPropertiesFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKFUCHSIABufferCollection() {}

    /// ```
    /// (int) VkResult vkCreateBufferCollectionFUCHSIA((struct VkDevice*) VkDevice device, const VkBufferCollectionCreateInfoFUCHSIA* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBufferCollectionFUCHSIA* pCollection);
    /// ```
    public static int vkCreateBufferCollectionFUCHSIA(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pCollection) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateBufferCollectionFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkCreateBufferCollectionFUCHSIA");
        try { return (int) Handles.MH_vkCreateBufferCollectionFUCHSIA.invokeExact(device.capabilities().PFN_vkCreateBufferCollectionFUCHSIA, device.segment(), pCreateInfo, pAllocator, pCollection); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferCollectionFUCHSIA", e); }
    }

    /// ```
    /// (int) VkResult vkSetBufferCollectionImageConstraintsFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, const VkImageConstraintsInfoFUCHSIA* pImageConstraintsInfo);
    /// ```
    public static int vkSetBufferCollectionImageConstraintsFUCHSIA(VkDevice device, long collection, MemorySegment pImageConstraintsInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetBufferCollectionImageConstraintsFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkSetBufferCollectionImageConstraintsFUCHSIA");
        try { return (int) Handles.MH_vkSetBufferCollectionImageConstraintsFUCHSIA.invokeExact(device.capabilities().PFN_vkSetBufferCollectionImageConstraintsFUCHSIA, device.segment(), collection, pImageConstraintsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetBufferCollectionImageConstraintsFUCHSIA", e); }
    }

    /// ```
    /// (int) VkResult vkSetBufferCollectionBufferConstraintsFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, const VkBufferConstraintsInfoFUCHSIA* pBufferConstraintsInfo);
    /// ```
    public static int vkSetBufferCollectionBufferConstraintsFUCHSIA(VkDevice device, long collection, MemorySegment pBufferConstraintsInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkSetBufferCollectionBufferConstraintsFUCHSIA");
        try { return (int) Handles.MH_vkSetBufferCollectionBufferConstraintsFUCHSIA.invokeExact(device.capabilities().PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA, device.segment(), collection, pBufferConstraintsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetBufferCollectionBufferConstraintsFUCHSIA", e); }
    }

    /// ```
    /// void vkDestroyBufferCollectionFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyBufferCollectionFUCHSIA(VkDevice device, long collection, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyBufferCollectionFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBufferCollectionFUCHSIA");
        try { Handles.MH_vkDestroyBufferCollectionFUCHSIA.invokeExact(device.capabilities().PFN_vkDestroyBufferCollectionFUCHSIA, device.segment(), collection, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferCollectionFUCHSIA", e); }
    }

    /// ```
    /// (int) VkResult vkGetBufferCollectionPropertiesFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, VkBufferCollectionPropertiesFUCHSIA* pProperties);
    /// ```
    public static int vkGetBufferCollectionPropertiesFUCHSIA(VkDevice device, long collection, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferCollectionPropertiesFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferCollectionPropertiesFUCHSIA");
        try { return (int) Handles.MH_vkGetBufferCollectionPropertiesFUCHSIA.invokeExact(device.capabilities().PFN_vkGetBufferCollectionPropertiesFUCHSIA, device.segment(), collection, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferCollectionPropertiesFUCHSIA", e); }
    }

}
