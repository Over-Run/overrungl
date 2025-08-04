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
/// struct VkQueueFamilyProperties {
///     ((uint32_t) VkFlags) VkQueueFlags queueFlags;
///     uint32_t queueCount;
///     uint32_t timestampValidBits;
///     (struct VkExtent3D) VkExtent3D minImageTransferGranularity;
/// };
/// ```
public final class VkQueueFamilyProperties extends GroupType {
    /// The struct layout of `VkQueueFamilyProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("queueFlags"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.JAVA_INT.withName("timestampValidBits"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
    );
    /// The byte offset of `queueFlags`.
    public static final long OFFSET_queueFlags = LAYOUT.byteOffset(PathElement.groupElement("queueFlags"));
    /// The memory layout of `queueFlags`.
    public static final MemoryLayout LAYOUT_queueFlags = LAYOUT.select(PathElement.groupElement("queueFlags"));
    /// The [VarHandle] of `queueFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFlags"));
    /// The byte offset of `queueCount`.
    public static final long OFFSET_queueCount = LAYOUT.byteOffset(PathElement.groupElement("queueCount"));
    /// The memory layout of `queueCount`.
    public static final MemoryLayout LAYOUT_queueCount = LAYOUT.select(PathElement.groupElement("queueCount"));
    /// The [VarHandle] of `queueCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCount"));
    /// The byte offset of `timestampValidBits`.
    public static final long OFFSET_timestampValidBits = LAYOUT.byteOffset(PathElement.groupElement("timestampValidBits"));
    /// The memory layout of `timestampValidBits`.
    public static final MemoryLayout LAYOUT_timestampValidBits = LAYOUT.select(PathElement.groupElement("timestampValidBits"));
    /// The [VarHandle] of `timestampValidBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_timestampValidBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampValidBits"));
    /// The byte offset of `minImageTransferGranularity`.
    public static final long OFFSET_minImageTransferGranularity = LAYOUT.byteOffset(PathElement.groupElement("minImageTransferGranularity"));
    /// The memory layout of `minImageTransferGranularity`.
    public static final MemoryLayout LAYOUT_minImageTransferGranularity = LAYOUT.select(PathElement.groupElement("minImageTransferGranularity"));

    /// Creates `VkQueueFamilyProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyProperties`
    public static VkQueueFamilyProperties alloc(SegmentAllocator allocator) { return new VkQueueFamilyProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyProperties`
    public static VkQueueFamilyProperties alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyProperties copyFrom(VkQueueFamilyProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyProperties reinterpret(long count) { return new VkQueueFamilyProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `queueFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFlags(MemorySegment segment, long index) { return (int) VH_queueFlags.get(segment, 0L, index); }
    /// {@return `queueFlags`}
    public int queueFlags() { return queueFlags(this.segment(), 0L); }
    /// Sets `queueFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFlags(MemorySegment segment, long index, int value) { VH_queueFlags.set(segment, 0L, index, value); }
    /// Sets `queueFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties queueFlags(int value) { queueFlags(this.segment(), 0L, value); return this; }

    /// {@return `queueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueCount(MemorySegment segment, long index) { return (int) VH_queueCount.get(segment, 0L, index); }
    /// {@return `queueCount`}
    public int queueCount() { return queueCount(this.segment(), 0L); }
    /// Sets `queueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueCount(MemorySegment segment, long index, int value) { VH_queueCount.set(segment, 0L, index, value); }
    /// Sets `queueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties queueCount(int value) { queueCount(this.segment(), 0L, value); return this; }

    /// {@return `timestampValidBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int timestampValidBits(MemorySegment segment, long index) { return (int) VH_timestampValidBits.get(segment, 0L, index); }
    /// {@return `timestampValidBits`}
    public int timestampValidBits() { return timestampValidBits(this.segment(), 0L); }
    /// Sets `timestampValidBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timestampValidBits(MemorySegment segment, long index, int value) { VH_timestampValidBits.set(segment, 0L, index, value); }
    /// Sets `timestampValidBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties timestampValidBits(int value) { timestampValidBits(this.segment(), 0L, value); return this; }

    /// {@return `minImageTransferGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minImageTransferGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minImageTransferGranularity, index), LAYOUT_minImageTransferGranularity); }
    /// {@return `minImageTransferGranularity`}
    public MemorySegment minImageTransferGranularity() { return minImageTransferGranularity(this.segment(), 0L); }
    /// Sets `minImageTransferGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minImageTransferGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minImageTransferGranularity, index), LAYOUT_minImageTransferGranularity.byteSize()); }
    /// Sets `minImageTransferGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties minImageTransferGranularity(MemorySegment value) { minImageTransferGranularity(this.segment(), 0L, value); return this; }
    /// Accepts `minImageTransferGranularity` with the given function.
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyProperties minImageTransferGranularity(Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(minImageTransferGranularity())); return this; }

    /// Creates a slice of `VkQueueFamilyProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyProperties`
    public VkQueueFamilyProperties asSlice(long index) { return new VkQueueFamilyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyProperties`
    public VkQueueFamilyProperties asSlice(long index, long count) { return new VkQueueFamilyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyProperties at(long index, Consumer<VkQueueFamilyProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `queueFlags` at the given index}
    /// @param index the index of the struct buffer
    public int queueFlagsAt(long index) { return queueFlags(this.segment(), index); }
    /// Sets `queueFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties queueFlagsAt(long index, int value) { queueFlags(this.segment(), index, value); return this; }

    /// {@return `queueCount` at the given index}
    /// @param index the index of the struct buffer
    public int queueCountAt(long index) { return queueCount(this.segment(), index); }
    /// Sets `queueCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties queueCountAt(long index, int value) { queueCount(this.segment(), index, value); return this; }

    /// {@return `timestampValidBits` at the given index}
    /// @param index the index of the struct buffer
    public int timestampValidBitsAt(long index) { return timestampValidBits(this.segment(), index); }
    /// Sets `timestampValidBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties timestampValidBitsAt(long index, int value) { timestampValidBits(this.segment(), index, value); return this; }

    /// {@return `minImageTransferGranularity` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minImageTransferGranularityAt(long index) { return minImageTransferGranularity(this.segment(), index); }
    /// Sets `minImageTransferGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties minImageTransferGranularityAt(long index, MemorySegment value) { minImageTransferGranularity(this.segment(), index, value); return this; }
    /// Accepts `minImageTransferGranularity` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyProperties minImageTransferGranularityAt(long index, Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(minImageTransferGranularityAt(index))); return this; }

}
