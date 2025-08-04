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
/// struct VkDevicePrivateDataCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t privateDataSlotRequestCount;
/// };
/// ```
public final class VkDevicePrivateDataCreateInfo extends GroupType {
    /// The struct layout of `VkDevicePrivateDataCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("privateDataSlotRequestCount")
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
    /// The byte offset of `privateDataSlotRequestCount`.
    public static final long OFFSET_privateDataSlotRequestCount = LAYOUT.byteOffset(PathElement.groupElement("privateDataSlotRequestCount"));
    /// The memory layout of `privateDataSlotRequestCount`.
    public static final MemoryLayout LAYOUT_privateDataSlotRequestCount = LAYOUT.select(PathElement.groupElement("privateDataSlotRequestCount"));
    /// The [VarHandle] of `privateDataSlotRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_privateDataSlotRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("privateDataSlotRequestCount"));

    /// Creates `VkDevicePrivateDataCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDevicePrivateDataCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDevicePrivateDataCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDevicePrivateDataCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePrivateDataCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDevicePrivateDataCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDevicePrivateDataCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePrivateDataCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDevicePrivateDataCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDevicePrivateDataCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePrivateDataCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDevicePrivateDataCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDevicePrivateDataCreateInfo`
    public static VkDevicePrivateDataCreateInfo alloc(SegmentAllocator allocator) { return new VkDevicePrivateDataCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDevicePrivateDataCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDevicePrivateDataCreateInfo`
    public static VkDevicePrivateDataCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDevicePrivateDataCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDevicePrivateDataCreateInfo copyFrom(VkDevicePrivateDataCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDevicePrivateDataCreateInfo reinterpret(long count) { return new VkDevicePrivateDataCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDevicePrivateDataCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDevicePrivateDataCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `privateDataSlotRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int privateDataSlotRequestCount(MemorySegment segment, long index) { return (int) VH_privateDataSlotRequestCount.get(segment, 0L, index); }
    /// {@return `privateDataSlotRequestCount`}
    public int privateDataSlotRequestCount() { return privateDataSlotRequestCount(this.segment(), 0L); }
    /// Sets `privateDataSlotRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void privateDataSlotRequestCount(MemorySegment segment, long index, int value) { VH_privateDataSlotRequestCount.set(segment, 0L, index, value); }
    /// Sets `privateDataSlotRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDevicePrivateDataCreateInfo privateDataSlotRequestCount(int value) { privateDataSlotRequestCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDevicePrivateDataCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDevicePrivateDataCreateInfo`
    public VkDevicePrivateDataCreateInfo asSlice(long index) { return new VkDevicePrivateDataCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDevicePrivateDataCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDevicePrivateDataCreateInfo`
    public VkDevicePrivateDataCreateInfo asSlice(long index, long count) { return new VkDevicePrivateDataCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDevicePrivateDataCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDevicePrivateDataCreateInfo at(long index, Consumer<VkDevicePrivateDataCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDevicePrivateDataCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDevicePrivateDataCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `privateDataSlotRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int privateDataSlotRequestCountAt(long index) { return privateDataSlotRequestCount(this.segment(), index); }
    /// Sets `privateDataSlotRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDevicePrivateDataCreateInfo privateDataSlotRequestCountAt(long index, int value) { privateDataSlotRequestCount(this.segment(), index, value); return this; }

}
