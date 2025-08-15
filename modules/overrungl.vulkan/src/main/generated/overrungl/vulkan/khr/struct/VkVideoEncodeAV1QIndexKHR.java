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

/// Represents `VkVideoEncodeAV1QIndexKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1QIndexKHR {
///     uint32_t intraQIndex;
///     uint32_t predictiveQIndex;
///     uint32_t bipredictiveQIndex;
/// };
/// ```
public final class VkVideoEncodeAV1QIndexKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1QIndexKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("intraQIndex"),
        ValueLayout.JAVA_INT.withName("predictiveQIndex"),
        ValueLayout.JAVA_INT.withName("bipredictiveQIndex")
    );
    /// The byte offset of `intraQIndex`.
    public static final long OFFSET_intraQIndex = LAYOUT.byteOffset(PathElement.groupElement("intraQIndex"));
    /// The memory layout of `intraQIndex`.
    public static final MemoryLayout LAYOUT_intraQIndex = LAYOUT.select(PathElement.groupElement("intraQIndex"));
    /// The [VarHandle] of `intraQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_intraQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraQIndex"));
    /// The byte offset of `predictiveQIndex`.
    public static final long OFFSET_predictiveQIndex = LAYOUT.byteOffset(PathElement.groupElement("predictiveQIndex"));
    /// The memory layout of `predictiveQIndex`.
    public static final MemoryLayout LAYOUT_predictiveQIndex = LAYOUT.select(PathElement.groupElement("predictiveQIndex"));
    /// The [VarHandle] of `predictiveQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_predictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictiveQIndex"));
    /// The byte offset of `bipredictiveQIndex`.
    public static final long OFFSET_bipredictiveQIndex = LAYOUT.byteOffset(PathElement.groupElement("bipredictiveQIndex"));
    /// The memory layout of `bipredictiveQIndex`.
    public static final MemoryLayout LAYOUT_bipredictiveQIndex = LAYOUT.select(PathElement.groupElement("bipredictiveQIndex"));
    /// The [VarHandle] of `bipredictiveQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bipredictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bipredictiveQIndex"));

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1QIndexKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QIndexKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QIndexKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QIndexKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1QIndexKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QIndexKHR`
    public static VkVideoEncodeAV1QIndexKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QIndexKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1QIndexKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1QIndexKHR`
    public static VkVideoEncodeAV1QIndexKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QIndexKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR copyFrom(VkVideoEncodeAV1QIndexKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1QIndexKHR reinterpret(long count) { return new VkVideoEncodeAV1QIndexKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `intraQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int intraQIndex(MemorySegment segment, long index) { return (int) VH_intraQIndex.get(segment, 0L, index); }
    /// {@return `intraQIndex`}
    public int intraQIndex() { return intraQIndex(this.segment(), 0L); }
    /// Sets `intraQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void intraQIndex(MemorySegment segment, long index, int value) { VH_intraQIndex.set(segment, 0L, index, value); }
    /// Sets `intraQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR intraQIndex(int value) { intraQIndex(this.segment(), 0L, value); return this; }

    /// {@return `predictiveQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int predictiveQIndex(MemorySegment segment, long index) { return (int) VH_predictiveQIndex.get(segment, 0L, index); }
    /// {@return `predictiveQIndex`}
    public int predictiveQIndex() { return predictiveQIndex(this.segment(), 0L); }
    /// Sets `predictiveQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void predictiveQIndex(MemorySegment segment, long index, int value) { VH_predictiveQIndex.set(segment, 0L, index, value); }
    /// Sets `predictiveQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR predictiveQIndex(int value) { predictiveQIndex(this.segment(), 0L, value); return this; }

    /// {@return `bipredictiveQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bipredictiveQIndex(MemorySegment segment, long index) { return (int) VH_bipredictiveQIndex.get(segment, 0L, index); }
    /// {@return `bipredictiveQIndex`}
    public int bipredictiveQIndex() { return bipredictiveQIndex(this.segment(), 0L); }
    /// Sets `bipredictiveQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bipredictiveQIndex(MemorySegment segment, long index, int value) { VH_bipredictiveQIndex.set(segment, 0L, index, value); }
    /// Sets `bipredictiveQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndex(int value) { bipredictiveQIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeAV1QIndexKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1QIndexKHR`
    public VkVideoEncodeAV1QIndexKHR asSlice(long index) { return new VkVideoEncodeAV1QIndexKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1QIndexKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1QIndexKHR`
    public VkVideoEncodeAV1QIndexKHR asSlice(long index, long count) { return new VkVideoEncodeAV1QIndexKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1QIndexKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR at(long index, Consumer<VkVideoEncodeAV1QIndexKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `intraQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int intraQIndexAt(long index) { return intraQIndex(this.segment(), index); }
    /// Sets `intraQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR intraQIndexAt(long index, int value) { intraQIndex(this.segment(), index, value); return this; }

    /// {@return `predictiveQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int predictiveQIndexAt(long index) { return predictiveQIndex(this.segment(), index); }
    /// Sets `predictiveQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR predictiveQIndexAt(long index, int value) { predictiveQIndex(this.segment(), index, value); return this; }

    /// {@return `bipredictiveQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int bipredictiveQIndexAt(long index) { return bipredictiveQIndex(this.segment(), index); }
    /// Sets `bipredictiveQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndexAt(long index, int value) { bipredictiveQIndex(this.segment(), index, value); return this; }

}
