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
/// struct VkVideoEncodeH264FrameSizeKHR {
///     uint32_t frameISize;
///     uint32_t framePSize;
///     uint32_t frameBSize;
/// };
/// ```
public final class VkVideoEncodeH264FrameSizeKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264FrameSizeKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("frameISize"),
        ValueLayout.JAVA_INT.withName("framePSize"),
        ValueLayout.JAVA_INT.withName("frameBSize")
    );
    /// The byte offset of `frameISize`.
    public static final long OFFSET_frameISize = LAYOUT.byteOffset(PathElement.groupElement("frameISize"));
    /// The memory layout of `frameISize`.
    public static final MemoryLayout LAYOUT_frameISize = LAYOUT.select(PathElement.groupElement("frameISize"));
    /// The [VarHandle] of `frameISize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameISize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameISize"));
    /// The byte offset of `framePSize`.
    public static final long OFFSET_framePSize = LAYOUT.byteOffset(PathElement.groupElement("framePSize"));
    /// The memory layout of `framePSize`.
    public static final MemoryLayout LAYOUT_framePSize = LAYOUT.select(PathElement.groupElement("framePSize"));
    /// The [VarHandle] of `framePSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framePSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framePSize"));
    /// The byte offset of `frameBSize`.
    public static final long OFFSET_frameBSize = LAYOUT.byteOffset(PathElement.groupElement("frameBSize"));
    /// The memory layout of `frameBSize`.
    public static final MemoryLayout LAYOUT_frameBSize = LAYOUT.select(PathElement.groupElement("frameBSize"));
    /// The [VarHandle] of `frameBSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameBSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameBSize"));

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH264FrameSizeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264FrameSizeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264FrameSizeKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264FrameSizeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264FrameSizeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264FrameSizeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264FrameSizeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264FrameSizeKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264FrameSizeKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param frameISize `frameISize`
    /// @param framePSize `framePSize`
    /// @param frameBSize `frameBSize`
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR allocInit(SegmentAllocator allocator, int frameISize, int framePSize, int frameBSize) {
        return alloc(allocator).frameISize(frameISize).framePSize(framePSize).frameBSize(frameBSize);
    }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param frameISize `frameISize`
    /// @param framePSize `framePSize`
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR allocInit(SegmentAllocator allocator, int frameISize, int framePSize) {
        return alloc(allocator).frameISize(frameISize).framePSize(framePSize);
    }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param frameISize `frameISize`
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR allocInit(SegmentAllocator allocator, int frameISize) {
        return alloc(allocator).frameISize(frameISize);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR copyFrom(VkVideoEncodeH264FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH264FrameSizeKHR reinterpret(long count) { return new VkVideoEncodeH264FrameSizeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `frameISize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameISize(MemorySegment segment, long index) { return (int) VH_frameISize.get(segment, 0L, index); }
    /// {@return `frameISize`}
    public int frameISize() { return frameISize(this.segment(), 0L); }
    /// Sets `frameISize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameISize(MemorySegment segment, long index, int value) { VH_frameISize.set(segment, 0L, index, value); }
    /// Sets `frameISize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR frameISize(int value) { frameISize(this.segment(), 0L, value); return this; }

    /// {@return `framePSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framePSize(MemorySegment segment, long index) { return (int) VH_framePSize.get(segment, 0L, index); }
    /// {@return `framePSize`}
    public int framePSize() { return framePSize(this.segment(), 0L); }
    /// Sets `framePSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framePSize(MemorySegment segment, long index, int value) { VH_framePSize.set(segment, 0L, index, value); }
    /// Sets `framePSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR framePSize(int value) { framePSize(this.segment(), 0L, value); return this; }

    /// {@return `frameBSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameBSize(MemorySegment segment, long index) { return (int) VH_frameBSize.get(segment, 0L, index); }
    /// {@return `frameBSize`}
    public int frameBSize() { return frameBSize(this.segment(), 0L); }
    /// Sets `frameBSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameBSize(MemorySegment segment, long index, int value) { VH_frameBSize.set(segment, 0L, index, value); }
    /// Sets `frameBSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR frameBSize(int value) { frameBSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH264FrameSizeKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH264FrameSizeKHR`
    public VkVideoEncodeH264FrameSizeKHR asSlice(long index) { return new VkVideoEncodeH264FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH264FrameSizeKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH264FrameSizeKHR`
    public VkVideoEncodeH264FrameSizeKHR asSlice(long index, long count) { return new VkVideoEncodeH264FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH264FrameSizeKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR at(long index, Consumer<VkVideoEncodeH264FrameSizeKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `frameISize` at the given index}
    /// @param index the index of the struct buffer
    public int frameISizeAt(long index) { return frameISize(this.segment(), index); }
    /// Sets `frameISize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR frameISizeAt(long index, int value) { frameISize(this.segment(), index, value); return this; }

    /// {@return `framePSize` at the given index}
    /// @param index the index of the struct buffer
    public int framePSizeAt(long index) { return framePSize(this.segment(), index); }
    /// Sets `framePSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR framePSizeAt(long index, int value) { framePSize(this.segment(), index, value); return this; }

    /// {@return `frameBSize` at the given index}
    /// @param index the index of the struct buffer
    public int frameBSizeAt(long index) { return frameBSize(this.segment(), index); }
    /// Sets `frameBSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR frameBSizeAt(long index, int value) { frameBSize(this.segment(), index, value); return this; }

}
