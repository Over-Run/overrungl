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
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 descriptorSetHostMapping;
/// };
/// ```
public final class VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetHostMapping")
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
    /// The byte offset of `descriptorSetHostMapping`.
    public static final long OFFSET_descriptorSetHostMapping = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetHostMapping"));
    /// The memory layout of `descriptorSetHostMapping`.
    public static final MemoryLayout LAYOUT_descriptorSetHostMapping = LAYOUT.select(PathElement.groupElement("descriptorSetHostMapping"));
    /// The [VarHandle] of `descriptorSetHostMapping` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetHostMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetHostMapping"));

    /// Creates `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE copyFrom(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE reinterpret(long count) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetHostMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetHostMapping(MemorySegment segment, long index) { return (int) VH_descriptorSetHostMapping.get(segment, 0L, index); }
    /// {@return `descriptorSetHostMapping`}
    public int descriptorSetHostMapping() { return descriptorSetHostMapping(this.segment(), 0L); }
    /// Sets `descriptorSetHostMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetHostMapping(MemorySegment segment, long index, int value) { VH_descriptorSetHostMapping.set(segment, 0L, index, value); }
    /// Sets `descriptorSetHostMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMapping(int value) { descriptorSetHostMapping(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE asSlice(long index) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE at(long index, Consumer<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `descriptorSetHostMapping` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetHostMappingAt(long index) { return descriptorSetHostMapping(this.segment(), index); }
    /// Sets `descriptorSetHostMapping` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMappingAt(long index, int value) { descriptorSetHostMapping(this.segment(), index, value); return this; }

}
