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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 pipelineFragmentShadingRate;
///     (uint32_t) VkBool32 primitiveFragmentShadingRate;
///     (uint32_t) VkBool32 attachmentFragmentShadingRate;
/// };
/// ```
public final class VkPhysicalDeviceFragmentShadingRateFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("attachmentFragmentShadingRate")
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
    /// The byte offset of `pipelineFragmentShadingRate`.
    public static final long OFFSET_pipelineFragmentShadingRate = LAYOUT.byteOffset(PathElement.groupElement("pipelineFragmentShadingRate"));
    /// The memory layout of `pipelineFragmentShadingRate`.
    public static final MemoryLayout LAYOUT_pipelineFragmentShadingRate = LAYOUT.select(PathElement.groupElement("pipelineFragmentShadingRate"));
    /// The [VarHandle] of `pipelineFragmentShadingRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineFragmentShadingRate"));
    /// The byte offset of `primitiveFragmentShadingRate`.
    public static final long OFFSET_primitiveFragmentShadingRate = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRate"));
    /// The memory layout of `primitiveFragmentShadingRate`.
    public static final MemoryLayout LAYOUT_primitiveFragmentShadingRate = LAYOUT.select(PathElement.groupElement("primitiveFragmentShadingRate"));
    /// The [VarHandle] of `primitiveFragmentShadingRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRate"));
    /// The byte offset of `attachmentFragmentShadingRate`.
    public static final long OFFSET_attachmentFragmentShadingRate = LAYOUT.byteOffset(PathElement.groupElement("attachmentFragmentShadingRate"));
    /// The memory layout of `attachmentFragmentShadingRate`.
    public static final MemoryLayout LAYOUT_attachmentFragmentShadingRate = LAYOUT.select(PathElement.groupElement("attachmentFragmentShadingRate"));
    /// The [VarHandle] of `attachmentFragmentShadingRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFragmentShadingRate"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR copyFrom(VkPhysicalDeviceFragmentShadingRateFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineFragmentShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineFragmentShadingRate(MemorySegment segment, long index) { return (int) VH_pipelineFragmentShadingRate.get(segment, 0L, index); }
    /// {@return `pipelineFragmentShadingRate`}
    public int pipelineFragmentShadingRate() { return pipelineFragmentShadingRate(this.segment(), 0L); }
    /// Sets `pipelineFragmentShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineFragmentShadingRate(MemorySegment segment, long index, int value) { VH_pipelineFragmentShadingRate.set(segment, 0L, index, value); }
    /// Sets `pipelineFragmentShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRate(int value) { pipelineFragmentShadingRate(this.segment(), 0L, value); return this; }

    /// {@return `primitiveFragmentShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveFragmentShadingRate(MemorySegment segment, long index) { return (int) VH_primitiveFragmentShadingRate.get(segment, 0L, index); }
    /// {@return `primitiveFragmentShadingRate`}
    public int primitiveFragmentShadingRate() { return primitiveFragmentShadingRate(this.segment(), 0L); }
    /// Sets `primitiveFragmentShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveFragmentShadingRate(MemorySegment segment, long index, int value) { VH_primitiveFragmentShadingRate.set(segment, 0L, index, value); }
    /// Sets `primitiveFragmentShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRate(int value) { primitiveFragmentShadingRate(this.segment(), 0L, value); return this; }

    /// {@return `attachmentFragmentShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentFragmentShadingRate(MemorySegment segment, long index) { return (int) VH_attachmentFragmentShadingRate.get(segment, 0L, index); }
    /// {@return `attachmentFragmentShadingRate`}
    public int attachmentFragmentShadingRate() { return attachmentFragmentShadingRate(this.segment(), 0L); }
    /// Sets `attachmentFragmentShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentFragmentShadingRate(MemorySegment segment, long index, int value) { VH_attachmentFragmentShadingRate.set(segment, 0L, index, value); }
    /// Sets `attachmentFragmentShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRate(int value) { attachmentFragmentShadingRate(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelineFragmentShadingRate` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineFragmentShadingRateAt(long index) { return pipelineFragmentShadingRate(this.segment(), index); }
    /// Sets `pipelineFragmentShadingRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRateAt(long index, int value) { pipelineFragmentShadingRate(this.segment(), index, value); return this; }

    /// {@return `primitiveFragmentShadingRate` at the given index}
    /// @param index the index of the struct buffer
    public int primitiveFragmentShadingRateAt(long index) { return primitiveFragmentShadingRate(this.segment(), index); }
    /// Sets `primitiveFragmentShadingRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRateAt(long index, int value) { primitiveFragmentShadingRate(this.segment(), index, value); return this; }

    /// {@return `attachmentFragmentShadingRate` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentFragmentShadingRateAt(long index) { return attachmentFragmentShadingRate(this.segment(), index); }
    /// Sets `attachmentFragmentShadingRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRateAt(long index, int value) { attachmentFragmentShadingRate(this.segment(), index, value); return this; }

}
