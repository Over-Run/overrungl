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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKFUCHSIABufferCollection {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateBufferCollectionFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetBufferCollectionImageConstraintsFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetBufferCollectionBufferConstraintsFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBufferCollectionFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferCollectionPropertiesFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateBufferCollectionFUCHSIA;
        public final MemorySegment PFN_vkSetBufferCollectionImageConstraintsFUCHSIA;
        public final MemorySegment PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA;
        public final MemorySegment PFN_vkDestroyBufferCollectionFUCHSIA;
        public final MemorySegment PFN_vkGetBufferCollectionPropertiesFUCHSIA;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateBufferCollectionFUCHSIA = func.invoke(device, "vkCreateBufferCollectionFUCHSIA");
            PFN_vkSetBufferCollectionImageConstraintsFUCHSIA = func.invoke(device, "vkSetBufferCollectionImageConstraintsFUCHSIA");
            PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA = func.invoke(device, "vkSetBufferCollectionBufferConstraintsFUCHSIA");
            PFN_vkDestroyBufferCollectionFUCHSIA = func.invoke(device, "vkDestroyBufferCollectionFUCHSIA");
            PFN_vkGetBufferCollectionPropertiesFUCHSIA = func.invoke(device, "vkGetBufferCollectionPropertiesFUCHSIA");
        }
    }

    public VKFUCHSIABufferCollection(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreateBufferCollectionFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("const VkBufferCollectionCreateInfoFUCHSIA *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkBufferCollectionFUCHSIA *") MemorySegment pCollection) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateBufferCollectionFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkCreateBufferCollectionFUCHSIA");
        try { return (int) Handles.MH_vkCreateBufferCollectionFUCHSIA.invokeExact(handles.PFN_vkCreateBufferCollectionFUCHSIA, device, pCreateInfo, pAllocator, pCollection); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferCollectionFUCHSIA", e); }
    }

    public @CType("VkResult") int SetBufferCollectionImageConstraintsFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("VkBufferCollectionFUCHSIA") MemorySegment collection, @CType("const VkImageConstraintsInfoFUCHSIA *") MemorySegment pImageConstraintsInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkSetBufferCollectionImageConstraintsFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkSetBufferCollectionImageConstraintsFUCHSIA");
        try { return (int) Handles.MH_vkSetBufferCollectionImageConstraintsFUCHSIA.invokeExact(handles.PFN_vkSetBufferCollectionImageConstraintsFUCHSIA, device, collection, pImageConstraintsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetBufferCollectionImageConstraintsFUCHSIA", e); }
    }

    public @CType("VkResult") int SetBufferCollectionBufferConstraintsFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("VkBufferCollectionFUCHSIA") MemorySegment collection, @CType("const VkBufferConstraintsInfoFUCHSIA *") MemorySegment pBufferConstraintsInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkSetBufferCollectionBufferConstraintsFUCHSIA");
        try { return (int) Handles.MH_vkSetBufferCollectionBufferConstraintsFUCHSIA.invokeExact(handles.PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA, device, collection, pBufferConstraintsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetBufferCollectionBufferConstraintsFUCHSIA", e); }
    }

    public void DestroyBufferCollectionFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("VkBufferCollectionFUCHSIA") MemorySegment collection, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyBufferCollectionFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBufferCollectionFUCHSIA");
        try { Handles.MH_vkDestroyBufferCollectionFUCHSIA.invokeExact(handles.PFN_vkDestroyBufferCollectionFUCHSIA, device, collection, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferCollectionFUCHSIA", e); }
    }

    public @CType("VkResult") int GetBufferCollectionPropertiesFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("VkBufferCollectionFUCHSIA") MemorySegment collection, @CType("VkBufferCollectionPropertiesFUCHSIA *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferCollectionPropertiesFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferCollectionPropertiesFUCHSIA");
        try { return (int) Handles.MH_vkGetBufferCollectionPropertiesFUCHSIA.invokeExact(handles.PFN_vkGetBufferCollectionPropertiesFUCHSIA, device, collection, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferCollectionPropertiesFUCHSIA", e); }
    }

}
