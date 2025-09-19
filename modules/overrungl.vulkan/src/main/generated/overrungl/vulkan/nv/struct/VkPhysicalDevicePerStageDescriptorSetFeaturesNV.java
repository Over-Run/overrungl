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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePerStageDescriptorSetFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 perStageDescriptorSet;
///     (uint32_t) VkBool32 dynamicPipelineLayout;
/// };
/// ```
public final class VkPhysicalDevicePerStageDescriptorSetFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perStageDescriptorSet"),
        ValueLayout.JAVA_INT.withName("dynamicPipelineLayout")
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
    /// The byte offset of `perStageDescriptorSet`.
    public static final long OFFSET_perStageDescriptorSet = LAYOUT.byteOffset(PathElement.groupElement("perStageDescriptorSet"));
    /// The memory layout of `perStageDescriptorSet`.
    public static final MemoryLayout LAYOUT_perStageDescriptorSet = LAYOUT.select(PathElement.groupElement("perStageDescriptorSet"));
    /// The [VarHandle] of `perStageDescriptorSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_perStageDescriptorSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perStageDescriptorSet"));
    /// The byte offset of `dynamicPipelineLayout`.
    public static final long OFFSET_dynamicPipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("dynamicPipelineLayout"));
    /// The memory layout of `dynamicPipelineLayout`.
    public static final MemoryLayout LAYOUT_dynamicPipelineLayout = LAYOUT.select(PathElement.groupElement("dynamicPipelineLayout"));
    /// The [VarHandle] of `dynamicPipelineLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicPipelineLayout"));

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV copyFrom(VkPhysicalDevicePerStageDescriptorSetFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV reinterpret(long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `perStageDescriptorSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int perStageDescriptorSet(MemorySegment segment, long index) { return (int) VH_perStageDescriptorSet.get(segment, 0L, index); }
    /// {@return `perStageDescriptorSet`}
    public int perStageDescriptorSet() { return perStageDescriptorSet(this.segment(), 0L); }
    /// Sets `perStageDescriptorSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void perStageDescriptorSet(MemorySegment segment, long index, int value) { VH_perStageDescriptorSet.set(segment, 0L, index, value); }
    /// Sets `perStageDescriptorSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSet(int value) { perStageDescriptorSet(this.segment(), 0L, value); return this; }

    /// {@return `dynamicPipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicPipelineLayout(MemorySegment segment, long index) { return (int) VH_dynamicPipelineLayout.get(segment, 0L, index); }
    /// {@return `dynamicPipelineLayout`}
    public int dynamicPipelineLayout() { return dynamicPipelineLayout(this.segment(), 0L); }
    /// Sets `dynamicPipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicPipelineLayout(MemorySegment segment, long index, int value) { VH_dynamicPipelineLayout.set(segment, 0L, index, value); }
    /// Sets `dynamicPipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayout(int value) { dynamicPipelineLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV asSlice(long index) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV asSlice(long index, long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV at(long index, Consumer<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `perStageDescriptorSet` at the given index}
    /// @param index the index of the struct buffer
    public int perStageDescriptorSetAt(long index) { return perStageDescriptorSet(this.segment(), index); }
    /// Sets `perStageDescriptorSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSetAt(long index, int value) { perStageDescriptorSet(this.segment(), index, value); return this; }

    /// {@return `dynamicPipelineLayout` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicPipelineLayoutAt(long index) { return dynamicPipelineLayout(this.segment(), index); }
    /// Sets `dynamicPipelineLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayoutAt(long index, int value) { dynamicPipelineLayout(this.segment(), index, value); return this; }

}
