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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoDecodeH265ReferenceInfo {
///     (struct StdVideoDecodeH265ReferenceInfoFlags) StdVideoDecodeH265ReferenceInfoFlags flags;
///     int32_t PicOrderCntVal;
/// };
/// ```
public final class StdVideoDecodeH265ReferenceInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeH265ReferenceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeH265ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `PicOrderCntVal`.
    public static final long OFFSET_PicOrderCntVal = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
    /// The memory layout of `PicOrderCntVal`.
    public static final MemoryLayout LAYOUT_PicOrderCntVal = LAYOUT.select(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeH265ReferenceInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265ReferenceInfo`
    public static StdVideoDecodeH265ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265ReferenceInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265ReferenceInfo`
    public static StdVideoDecodeH265ReferenceInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH265ReferenceInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param PicOrderCntVal `PicOrderCntVal`
    /// @return the allocated `StdVideoDecodeH265ReferenceInfo`
    public static StdVideoDecodeH265ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags, int PicOrderCntVal) {
        return alloc(allocator).flags(flags).PicOrderCntVal(PicOrderCntVal);
    }

    /// Allocates a `StdVideoDecodeH265ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoDecodeH265ReferenceInfo`
    public static StdVideoDecodeH265ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo copyFrom(StdVideoDecodeH265ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeH265ReferenceInfo reinterpret(long count) { return new StdVideoDecodeH265ReferenceInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo flags(Consumer<overrungl.vulkan.video.StdVideoDecodeH265ReferenceInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeH265ReferenceInfoFlags.of(flags())); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int PicOrderCntVal(MemorySegment segment, long index) { return (int) VH_PicOrderCntVal.get(segment, 0L, index); }
    /// {@return `PicOrderCntVal`}
    public int PicOrderCntVal() { return PicOrderCntVal(this.segment(), 0L); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PicOrderCntVal(MemorySegment segment, long index, int value) { VH_PicOrderCntVal.set(segment, 0L, index, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo PicOrderCntVal(int value) { PicOrderCntVal(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoDecodeH265ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeH265ReferenceInfo`
    public StdVideoDecodeH265ReferenceInfo asSlice(long index) { return new StdVideoDecodeH265ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeH265ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeH265ReferenceInfo`
    public StdVideoDecodeH265ReferenceInfo asSlice(long index, long count) { return new StdVideoDecodeH265ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeH265ReferenceInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo at(long index, Consumer<StdVideoDecodeH265ReferenceInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoDecodeH265ReferenceInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeH265ReferenceInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param index the index of the struct buffer
    public int PicOrderCntValAt(long index) { return PicOrderCntVal(this.segment(), index); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo PicOrderCntValAt(long index, int value) { PicOrderCntVal(this.segment(), index, value); return this; }

}
