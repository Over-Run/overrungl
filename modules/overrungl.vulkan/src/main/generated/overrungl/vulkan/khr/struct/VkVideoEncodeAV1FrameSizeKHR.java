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

/// Represents `VkVideoEncodeAV1FrameSizeKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1FrameSizeKHR {
///     uint32_t intraFrameSize;
///     uint32_t predictiveFrameSize;
///     uint32_t bipredictiveFrameSize;
/// };
/// ```
public final class VkVideoEncodeAV1FrameSizeKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1FrameSizeKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("intraFrameSize"),
        ValueLayout.JAVA_INT.withName("predictiveFrameSize"),
        ValueLayout.JAVA_INT.withName("bipredictiveFrameSize")
    );
    /// The byte offset of `intraFrameSize`.
    public static final long OFFSET_intraFrameSize = LAYOUT.byteOffset(PathElement.groupElement("intraFrameSize"));
    /// The memory layout of `intraFrameSize`.
    public static final MemoryLayout LAYOUT_intraFrameSize = LAYOUT.select(PathElement.groupElement("intraFrameSize"));
    /// The [VarHandle] of `intraFrameSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_intraFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraFrameSize"));
    /// The byte offset of `predictiveFrameSize`.
    public static final long OFFSET_predictiveFrameSize = LAYOUT.byteOffset(PathElement.groupElement("predictiveFrameSize"));
    /// The memory layout of `predictiveFrameSize`.
    public static final MemoryLayout LAYOUT_predictiveFrameSize = LAYOUT.select(PathElement.groupElement("predictiveFrameSize"));
    /// The [VarHandle] of `predictiveFrameSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_predictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictiveFrameSize"));
    /// The byte offset of `bipredictiveFrameSize`.
    public static final long OFFSET_bipredictiveFrameSize = LAYOUT.byteOffset(PathElement.groupElement("bipredictiveFrameSize"));
    /// The memory layout of `bipredictiveFrameSize`.
    public static final MemoryLayout LAYOUT_bipredictiveFrameSize = LAYOUT.select(PathElement.groupElement("bipredictiveFrameSize"));
    /// The [VarHandle] of `bipredictiveFrameSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bipredictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bipredictiveFrameSize"));

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1FrameSizeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1FrameSizeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1FrameSizeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1FrameSizeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1FrameSizeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1FrameSizeKHR`
    public static VkVideoEncodeAV1FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1FrameSizeKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1FrameSizeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1FrameSizeKHR`
    public static VkVideoEncodeAV1FrameSizeKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1FrameSizeKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR copyFrom(VkVideoEncodeAV1FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1FrameSizeKHR reinterpret(long count) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `intraFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int intraFrameSize(MemorySegment segment, long index) { return (int) VH_intraFrameSize.get(segment, 0L, index); }
    /// {@return `intraFrameSize`}
    public int intraFrameSize() { return intraFrameSize(this.segment(), 0L); }
    /// Sets `intraFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void intraFrameSize(MemorySegment segment, long index, int value) { VH_intraFrameSize.set(segment, 0L, index, value); }
    /// Sets `intraFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSize(int value) { intraFrameSize(this.segment(), 0L, value); return this; }

    /// {@return `predictiveFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int predictiveFrameSize(MemorySegment segment, long index) { return (int) VH_predictiveFrameSize.get(segment, 0L, index); }
    /// {@return `predictiveFrameSize`}
    public int predictiveFrameSize() { return predictiveFrameSize(this.segment(), 0L); }
    /// Sets `predictiveFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void predictiveFrameSize(MemorySegment segment, long index, int value) { VH_predictiveFrameSize.set(segment, 0L, index, value); }
    /// Sets `predictiveFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSize(int value) { predictiveFrameSize(this.segment(), 0L, value); return this; }

    /// {@return `bipredictiveFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bipredictiveFrameSize(MemorySegment segment, long index) { return (int) VH_bipredictiveFrameSize.get(segment, 0L, index); }
    /// {@return `bipredictiveFrameSize`}
    public int bipredictiveFrameSize() { return bipredictiveFrameSize(this.segment(), 0L); }
    /// Sets `bipredictiveFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bipredictiveFrameSize(MemorySegment segment, long index, int value) { VH_bipredictiveFrameSize.set(segment, 0L, index, value); }
    /// Sets `bipredictiveFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSize(int value) { bipredictiveFrameSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeAV1FrameSizeKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1FrameSizeKHR`
    public VkVideoEncodeAV1FrameSizeKHR asSlice(long index) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1FrameSizeKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1FrameSizeKHR`
    public VkVideoEncodeAV1FrameSizeKHR asSlice(long index, long count) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1FrameSizeKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR at(long index, Consumer<VkVideoEncodeAV1FrameSizeKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `intraFrameSize` at the given index}
    /// @param index the index of the struct buffer
    public int intraFrameSizeAt(long index) { return intraFrameSize(this.segment(), index); }
    /// Sets `intraFrameSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSizeAt(long index, int value) { intraFrameSize(this.segment(), index, value); return this; }

    /// {@return `predictiveFrameSize` at the given index}
    /// @param index the index of the struct buffer
    public int predictiveFrameSizeAt(long index) { return predictiveFrameSize(this.segment(), index); }
    /// Sets `predictiveFrameSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSizeAt(long index, int value) { predictiveFrameSize(this.segment(), index, value); return this; }

    /// {@return `bipredictiveFrameSize` at the given index}
    /// @param index the index of the struct buffer
    public int bipredictiveFrameSizeAt(long index) { return bipredictiveFrameSize(this.segment(), index); }
    /// Sets `bipredictiveFrameSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSizeAt(long index, int value) { bipredictiveFrameSize(this.segment(), index, value); return this; }

}
