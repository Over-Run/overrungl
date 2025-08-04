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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan11Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 storageBuffer16BitAccess;
///     (uint32_t) VkBool32 uniformAndStorageBuffer16BitAccess;
///     (uint32_t) VkBool32 storagePushConstant16;
///     (uint32_t) VkBool32 storageInputOutput16;
///     (uint32_t) VkBool32 multiview;
///     (uint32_t) VkBool32 multiviewGeometryShader;
///     (uint32_t) VkBool32 multiviewTessellationShader;
///     (uint32_t) VkBool32 variablePointersStorageBuffer;
///     (uint32_t) VkBool32 variablePointers;
///     (uint32_t) VkBool32 protectedMemory;
///     (uint32_t) VkBool32 samplerYcbcrConversion;
///     (uint32_t) VkBool32 shaderDrawParameters;
/// };
/// ```
public final class VkPhysicalDeviceVulkan11Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan11Features`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers"),
        ValueLayout.JAVA_INT.withName("protectedMemory"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversion"),
        ValueLayout.JAVA_INT.withName("shaderDrawParameters")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `storageBuffer16BitAccess`.
    public static final long OFFSET_storageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The memory layout of `storageBuffer16BitAccess`.
    public static final MemoryLayout LAYOUT_storageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The [VarHandle] of `storageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The byte offset of `uniformAndStorageBuffer16BitAccess`.
    public static final long OFFSET_uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The memory layout of `uniformAndStorageBuffer16BitAccess`.
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformAndStorageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The byte offset of `storagePushConstant16`.
    public static final long OFFSET_storagePushConstant16 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant16"));
    /// The memory layout of `storagePushConstant16`.
    public static final MemoryLayout LAYOUT_storagePushConstant16 = LAYOUT.select(PathElement.groupElement("storagePushConstant16"));
    /// The [VarHandle] of `storagePushConstant16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storagePushConstant16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant16"));
    /// The byte offset of `storageInputOutput16`.
    public static final long OFFSET_storageInputOutput16 = LAYOUT.byteOffset(PathElement.groupElement("storageInputOutput16"));
    /// The memory layout of `storageInputOutput16`.
    public static final MemoryLayout LAYOUT_storageInputOutput16 = LAYOUT.select(PathElement.groupElement("storageInputOutput16"));
    /// The [VarHandle] of `storageInputOutput16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageInputOutput16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageInputOutput16"));
    /// The byte offset of `multiview`.
    public static final long OFFSET_multiview = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
    /// The memory layout of `multiview`.
    public static final MemoryLayout LAYOUT_multiview = LAYOUT.select(PathElement.groupElement("multiview"));
    /// The [VarHandle] of `multiview` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    /// The byte offset of `multiviewGeometryShader`.
    public static final long OFFSET_multiviewGeometryShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
    /// The memory layout of `multiviewGeometryShader`.
    public static final MemoryLayout LAYOUT_multiviewGeometryShader = LAYOUT.select(PathElement.groupElement("multiviewGeometryShader"));
    /// The [VarHandle] of `multiviewGeometryShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    /// The byte offset of `multiviewTessellationShader`.
    public static final long OFFSET_multiviewTessellationShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
    /// The memory layout of `multiviewTessellationShader`.
    public static final MemoryLayout LAYOUT_multiviewTessellationShader = LAYOUT.select(PathElement.groupElement("multiviewTessellationShader"));
    /// The [VarHandle] of `multiviewTessellationShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));
    /// The byte offset of `variablePointersStorageBuffer`.
    public static final long OFFSET_variablePointersStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The memory layout of `variablePointersStorageBuffer`.
    public static final MemoryLayout LAYOUT_variablePointersStorageBuffer = LAYOUT.select(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The [VarHandle] of `variablePointersStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The byte offset of `variablePointers`.
    public static final long OFFSET_variablePointers = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
    /// The memory layout of `variablePointers`.
    public static final MemoryLayout LAYOUT_variablePointers = LAYOUT.select(PathElement.groupElement("variablePointers"));
    /// The [VarHandle] of `variablePointers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));
    /// The byte offset of `protectedMemory`.
    public static final long OFFSET_protectedMemory = LAYOUT.byteOffset(PathElement.groupElement("protectedMemory"));
    /// The memory layout of `protectedMemory`.
    public static final MemoryLayout LAYOUT_protectedMemory = LAYOUT.select(PathElement.groupElement("protectedMemory"));
    /// The [VarHandle] of `protectedMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_protectedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedMemory"));
    /// The byte offset of `samplerYcbcrConversion`.
    public static final long OFFSET_samplerYcbcrConversion = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversion"));
    /// The memory layout of `samplerYcbcrConversion`.
    public static final MemoryLayout LAYOUT_samplerYcbcrConversion = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversion"));
    /// The [VarHandle] of `samplerYcbcrConversion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerYcbcrConversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversion"));
    /// The byte offset of `shaderDrawParameters`.
    public static final long OFFSET_shaderDrawParameters = LAYOUT.byteOffset(PathElement.groupElement("shaderDrawParameters"));
    /// The memory layout of `shaderDrawParameters`.
    public static final MemoryLayout LAYOUT_shaderDrawParameters = LAYOUT.select(PathElement.groupElement("shaderDrawParameters"));
    /// The [VarHandle] of `shaderDrawParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDrawParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDrawParameters"));

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkan11Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan11Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan11Features`
    public static VkPhysicalDeviceVulkan11Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan11Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkan11Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan11Features`
    public static VkPhysicalDeviceVulkan11Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan11Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features copyFrom(VkPhysicalDeviceVulkan11Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkan11Features reinterpret(long count) { return new VkPhysicalDeviceVulkan11Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer16BitAccess`}
    public int storageBuffer16BitAccess() { return storageBuffer16BitAccess(this.segment(), 0L); }
    /// Sets `storageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBuffer16BitAccess(MemorySegment segment, long index, int value) { VH_storageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(int value) { storageBuffer16BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer16BitAccess`}
    public int uniformAndStorageBuffer16BitAccess() { return uniformAndStorageBuffer16BitAccess(this.segment(), 0L); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index, int value) { VH_uniformAndStorageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(int value) { uniformAndStorageBuffer16BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `storagePushConstant16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storagePushConstant16(MemorySegment segment, long index) { return (int) VH_storagePushConstant16.get(segment, 0L, index); }
    /// {@return `storagePushConstant16`}
    public int storagePushConstant16() { return storagePushConstant16(this.segment(), 0L); }
    /// Sets `storagePushConstant16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storagePushConstant16(MemorySegment segment, long index, int value) { VH_storagePushConstant16.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storagePushConstant16(int value) { storagePushConstant16(this.segment(), 0L, value); return this; }

    /// {@return `storageInputOutput16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageInputOutput16(MemorySegment segment, long index) { return (int) VH_storageInputOutput16.get(segment, 0L, index); }
    /// {@return `storageInputOutput16`}
    public int storageInputOutput16() { return storageInputOutput16(this.segment(), 0L); }
    /// Sets `storageInputOutput16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageInputOutput16(MemorySegment segment, long index, int value) { VH_storageInputOutput16.set(segment, 0L, index, value); }
    /// Sets `storageInputOutput16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageInputOutput16(int value) { storageInputOutput16(this.segment(), 0L, value); return this; }

    /// {@return `multiview` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiview(MemorySegment segment, long index) { return (int) VH_multiview.get(segment, 0L, index); }
    /// {@return `multiview`}
    public int multiview() { return multiview(this.segment(), 0L); }
    /// Sets `multiview` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiview(MemorySegment segment, long index, int value) { VH_multiview.set(segment, 0L, index, value); }
    /// Sets `multiview` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiview(int value) { multiview(this.segment(), 0L, value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewGeometryShader(MemorySegment segment, long index) { return (int) VH_multiviewGeometryShader.get(segment, 0L, index); }
    /// {@return `multiviewGeometryShader`}
    public int multiviewGeometryShader() { return multiviewGeometryShader(this.segment(), 0L); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewGeometryShader(MemorySegment segment, long index, int value) { VH_multiviewGeometryShader.set(segment, 0L, index, value); }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(int value) { multiviewGeometryShader(this.segment(), 0L, value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewTessellationShader(MemorySegment segment, long index) { return (int) VH_multiviewTessellationShader.get(segment, 0L, index); }
    /// {@return `multiviewTessellationShader`}
    public int multiviewTessellationShader() { return multiviewTessellationShader(this.segment(), 0L); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewTessellationShader(MemorySegment segment, long index, int value) { VH_multiviewTessellationShader.set(segment, 0L, index, value); }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(int value) { multiviewTessellationShader(this.segment(), 0L, value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variablePointersStorageBuffer(MemorySegment segment, long index) { return (int) VH_variablePointersStorageBuffer.get(segment, 0L, index); }
    /// {@return `variablePointersStorageBuffer`}
    public int variablePointersStorageBuffer() { return variablePointersStorageBuffer(this.segment(), 0L); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variablePointersStorageBuffer(MemorySegment segment, long index, int value) { VH_variablePointersStorageBuffer.set(segment, 0L, index, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(int value) { variablePointersStorageBuffer(this.segment(), 0L, value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variablePointers(MemorySegment segment, long index) { return (int) VH_variablePointers.get(segment, 0L, index); }
    /// {@return `variablePointers`}
    public int variablePointers() { return variablePointers(this.segment(), 0L); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variablePointers(MemorySegment segment, long index, int value) { VH_variablePointers.set(segment, 0L, index, value); }
    /// Sets `variablePointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointers(int value) { variablePointers(this.segment(), 0L, value); return this; }

    /// {@return `protectedMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int protectedMemory(MemorySegment segment, long index) { return (int) VH_protectedMemory.get(segment, 0L, index); }
    /// {@return `protectedMemory`}
    public int protectedMemory() { return protectedMemory(this.segment(), 0L); }
    /// Sets `protectedMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void protectedMemory(MemorySegment segment, long index, int value) { VH_protectedMemory.set(segment, 0L, index, value); }
    /// Sets `protectedMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features protectedMemory(int value) { protectedMemory(this.segment(), 0L, value); return this; }

    /// {@return `samplerYcbcrConversion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerYcbcrConversion(MemorySegment segment, long index) { return (int) VH_samplerYcbcrConversion.get(segment, 0L, index); }
    /// {@return `samplerYcbcrConversion`}
    public int samplerYcbcrConversion() { return samplerYcbcrConversion(this.segment(), 0L); }
    /// Sets `samplerYcbcrConversion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerYcbcrConversion(MemorySegment segment, long index, int value) { VH_samplerYcbcrConversion.set(segment, 0L, index, value); }
    /// Sets `samplerYcbcrConversion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(int value) { samplerYcbcrConversion(this.segment(), 0L, value); return this; }

    /// {@return `shaderDrawParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDrawParameters(MemorySegment segment, long index) { return (int) VH_shaderDrawParameters.get(segment, 0L, index); }
    /// {@return `shaderDrawParameters`}
    public int shaderDrawParameters() { return shaderDrawParameters(this.segment(), 0L); }
    /// Sets `shaderDrawParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDrawParameters(MemorySegment segment, long index, int value) { VH_shaderDrawParameters.set(segment, 0L, index, value); }
    /// Sets `shaderDrawParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(int value) { shaderDrawParameters(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkan11Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkan11Features`
    public VkPhysicalDeviceVulkan11Features asSlice(long index) { return new VkPhysicalDeviceVulkan11Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkan11Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkan11Features`
    public VkPhysicalDeviceVulkan11Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan11Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkan11Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features at(long index, Consumer<VkPhysicalDeviceVulkan11Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `storageBuffer16BitAccess` at the given index}
    /// @param index the index of the struct buffer
    public int storageBuffer16BitAccessAt(long index) { return storageBuffer16BitAccess(this.segment(), index); }
    /// Sets `storageBuffer16BitAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccessAt(long index, int value) { storageBuffer16BitAccess(this.segment(), index, value); return this; }

    /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
    /// @param index the index of the struct buffer
    public int uniformAndStorageBuffer16BitAccessAt(long index) { return uniformAndStorageBuffer16BitAccess(this.segment(), index); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccessAt(long index, int value) { uniformAndStorageBuffer16BitAccess(this.segment(), index, value); return this; }

    /// {@return `storagePushConstant16` at the given index}
    /// @param index the index of the struct buffer
    public int storagePushConstant16At(long index) { return storagePushConstant16(this.segment(), index); }
    /// Sets `storagePushConstant16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storagePushConstant16At(long index, int value) { storagePushConstant16(this.segment(), index, value); return this; }

    /// {@return `storageInputOutput16` at the given index}
    /// @param index the index of the struct buffer
    public int storageInputOutput16At(long index) { return storageInputOutput16(this.segment(), index); }
    /// Sets `storageInputOutput16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageInputOutput16At(long index, int value) { storageInputOutput16(this.segment(), index, value); return this; }

    /// {@return `multiview` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewAt(long index) { return multiview(this.segment(), index); }
    /// Sets `multiview` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewAt(long index, int value) { multiview(this.segment(), index, value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewGeometryShaderAt(long index) { return multiviewGeometryShader(this.segment(), index); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShaderAt(long index, int value) { multiviewGeometryShader(this.segment(), index, value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewTessellationShaderAt(long index) { return multiviewTessellationShader(this.segment(), index); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShaderAt(long index, int value) { multiviewTessellationShader(this.segment(), index, value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param index the index of the struct buffer
    public int variablePointersStorageBufferAt(long index) { return variablePointersStorageBuffer(this.segment(), index); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBufferAt(long index, int value) { variablePointersStorageBuffer(this.segment(), index, value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param index the index of the struct buffer
    public int variablePointersAt(long index) { return variablePointers(this.segment(), index); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointersAt(long index, int value) { variablePointers(this.segment(), index, value); return this; }

    /// {@return `protectedMemory` at the given index}
    /// @param index the index of the struct buffer
    public int protectedMemoryAt(long index) { return protectedMemory(this.segment(), index); }
    /// Sets `protectedMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features protectedMemoryAt(long index, int value) { protectedMemory(this.segment(), index, value); return this; }

    /// {@return `samplerYcbcrConversion` at the given index}
    /// @param index the index of the struct buffer
    public int samplerYcbcrConversionAt(long index) { return samplerYcbcrConversion(this.segment(), index); }
    /// Sets `samplerYcbcrConversion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversionAt(long index, int value) { samplerYcbcrConversion(this.segment(), index, value); return this; }

    /// {@return `shaderDrawParameters` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDrawParametersAt(long index) { return shaderDrawParameters(this.segment(), index); }
    /// Sets `shaderDrawParameters` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features shaderDrawParametersAt(long index, int value) { shaderDrawParameters(this.segment(), index, value); return this; }

}
