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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineBinaryKeysAndDataKHR {
///     uint32_t binaryCount;
///     const VkPipelineBinaryKeyKHR* pPipelineBinaryKeys;
///     const VkPipelineBinaryDataKHR* pPipelineBinaryData;
/// };
/// ```
public final class VkPipelineBinaryKeysAndDataKHR extends GroupType {
    /// The struct layout of `VkPipelineBinaryKeysAndDataKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withName("pPipelineBinaryKeys"),
        ValueLayout.ADDRESS.withName("pPipelineBinaryData")
    );
    /// The byte offset of `binaryCount`.
    public static final long OFFSET_binaryCount = LAYOUT.byteOffset(PathElement.groupElement("binaryCount"));
    /// The memory layout of `binaryCount`.
    public static final MemoryLayout LAYOUT_binaryCount = LAYOUT.select(PathElement.groupElement("binaryCount"));
    /// The [VarHandle] of `binaryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binaryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binaryCount"));
    /// The byte offset of `pPipelineBinaryKeys`.
    public static final long OFFSET_pPipelineBinaryKeys = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaryKeys"));
    /// The memory layout of `pPipelineBinaryKeys`.
    public static final MemoryLayout LAYOUT_pPipelineBinaryKeys = LAYOUT.select(PathElement.groupElement("pPipelineBinaryKeys"));
    /// The [VarHandle] of `pPipelineBinaryKeys` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineBinaryKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaryKeys"));
    /// The byte offset of `pPipelineBinaryData`.
    public static final long OFFSET_pPipelineBinaryData = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaryData"));
    /// The memory layout of `pPipelineBinaryData`.
    public static final MemoryLayout LAYOUT_pPipelineBinaryData = LAYOUT.select(PathElement.groupElement("pPipelineBinaryData"));
    /// The [VarHandle] of `pPipelineBinaryData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineBinaryData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaryData"));

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineBinaryKeysAndDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeysAndDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeysAndDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeysAndDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineBinaryKeysAndDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryKeysAndDataKHR`
    public static VkPipelineBinaryKeysAndDataKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryKeysAndDataKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineBinaryKeysAndDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryKeysAndDataKHR`
    public static VkPipelineBinaryKeysAndDataKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryKeysAndDataKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR copyFrom(VkPipelineBinaryKeysAndDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineBinaryKeysAndDataKHR reinterpret(long count) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `binaryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binaryCount(MemorySegment segment, long index) { return (int) VH_binaryCount.get(segment, 0L, index); }
    /// {@return `binaryCount`}
    public int binaryCount() { return binaryCount(this.segment(), 0L); }
    /// Sets `binaryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binaryCount(MemorySegment segment, long index, int value) { VH_binaryCount.set(segment, 0L, index, value); }
    /// Sets `binaryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR binaryCount(int value) { binaryCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineBinaryKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineBinaryKeys(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineBinaryKeys.get(segment, 0L, index); }
    /// {@return `pPipelineBinaryKeys`}
    public MemorySegment pPipelineBinaryKeys() { return pPipelineBinaryKeys(this.segment(), 0L); }
    /// Sets `pPipelineBinaryKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineBinaryKeys(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineBinaryKeys.set(segment, 0L, index, value); }
    /// Sets `pPipelineBinaryKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeys(MemorySegment value) { pPipelineBinaryKeys(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineBinaryData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineBinaryData(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineBinaryData.get(segment, 0L, index); }
    /// {@return `pPipelineBinaryData`}
    public MemorySegment pPipelineBinaryData() { return pPipelineBinaryData(this.segment(), 0L); }
    /// Sets `pPipelineBinaryData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineBinaryData(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineBinaryData.set(segment, 0L, index, value); }
    /// Sets `pPipelineBinaryData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryData(MemorySegment value) { pPipelineBinaryData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineBinaryKeysAndDataKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineBinaryKeysAndDataKHR`
    public VkPipelineBinaryKeysAndDataKHR asSlice(long index) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineBinaryKeysAndDataKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineBinaryKeysAndDataKHR`
    public VkPipelineBinaryKeysAndDataKHR asSlice(long index, long count) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineBinaryKeysAndDataKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR at(long index, Consumer<VkPipelineBinaryKeysAndDataKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `binaryCount` at the given index}
    /// @param index the index of the struct buffer
    public int binaryCountAt(long index) { return binaryCount(this.segment(), index); }
    /// Sets `binaryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR binaryCountAt(long index, int value) { binaryCount(this.segment(), index, value); return this; }

    /// {@return `pPipelineBinaryKeys` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPipelineBinaryKeysAt(long index) { return pPipelineBinaryKeys(this.segment(), index); }
    /// Sets `pPipelineBinaryKeys` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeysAt(long index, MemorySegment value) { pPipelineBinaryKeys(this.segment(), index, value); return this; }

    /// {@return `pPipelineBinaryData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPipelineBinaryDataAt(long index) { return pPipelineBinaryData(this.segment(), index); }
    /// Sets `pPipelineBinaryData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryDataAt(long index, MemorySegment value) { pPipelineBinaryData(this.segment(), index, value); return this; }

}
