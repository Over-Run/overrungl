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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeH265ReferenceInfo {
///     StdVideoEncodeH265ReferenceInfoFlags flags;
///     StdVideoH265PictureType pic_type;
///     int32_t PicOrderCntVal;
///     uint8_t TemporalId;
/// };
/// ```
public sealed class StdVideoEncodeH265ReferenceInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH265ReferenceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH265ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pic_type"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_BYTE.withName("TemporalId")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `pic_type`.
    public static final long OFFSET_pic_type = LAYOUT.byteOffset(PathElement.groupElement("pic_type"));
    /// The memory layout of `pic_type`.
    public static final MemoryLayout LAYOUT_pic_type = LAYOUT.select(PathElement.groupElement("pic_type"));
    /// The [VarHandle] of `pic_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_type"));
    /// The byte offset of `PicOrderCntVal`.
    public static final long OFFSET_PicOrderCntVal = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
    /// The memory layout of `PicOrderCntVal`.
    public static final MemoryLayout LAYOUT_PicOrderCntVal = LAYOUT.select(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));
    /// The byte offset of `TemporalId`.
    public static final long OFFSET_TemporalId = LAYOUT.byteOffset(PathElement.groupElement("TemporalId"));
    /// The memory layout of `TemporalId`.
    public static final MemoryLayout LAYOUT_TemporalId = LAYOUT.select(PathElement.groupElement("TemporalId"));
    /// The [VarHandle] of `TemporalId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_TemporalId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TemporalId"));

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceInfo`
    public static StdVideoEncodeH265ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265ReferenceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo copyFrom(StdVideoEncodeH265ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public StdVideoEncodeH265ReferenceInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_type(MemorySegment segment, long index) { return (int) VH_pic_type.get(segment, 0L, index); }
    /// {@return `pic_type`}
    public int pic_type() { return pic_type(this.segment(), 0L); }
    /// Sets `pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_type(MemorySegment segment, long index, int value) { VH_pic_type.set(segment, 0L, index, value); }
    /// Sets `pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo pic_type(int value) { pic_type(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265ReferenceInfo PicOrderCntVal(int value) { PicOrderCntVal(this.segment(), 0L, value); return this; }

    /// {@return `TemporalId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte TemporalId(MemorySegment segment, long index) { return (byte) VH_TemporalId.get(segment, 0L, index); }
    /// {@return `TemporalId`}
    public byte TemporalId() { return TemporalId(this.segment(), 0L); }
    /// Sets `TemporalId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void TemporalId(MemorySegment segment, long index, byte value) { VH_TemporalId.set(segment, 0L, index, value); }
    /// Sets `TemporalId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceInfo TemporalId(byte value) { TemporalId(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeH265ReferenceInfo].
    public static final class Buffer extends StdVideoEncodeH265ReferenceInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265ReferenceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265ReferenceInfo`
        public StdVideoEncodeH265ReferenceInfo asSlice(long index) { return new StdVideoEncodeH265ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265ReferenceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `pic_type` at the given index}
        /// @param index the index of the struct buffer
        public int pic_typeAt(long index) { return pic_type(this.segment(), index); }
        /// Sets `pic_type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pic_typeAt(long index, int value) { pic_type(this.segment(), index, value); return this; }

        /// {@return `PicOrderCntVal` at the given index}
        /// @param index the index of the struct buffer
        public int PicOrderCntValAt(long index) { return PicOrderCntVal(this.segment(), index); }
        /// Sets `PicOrderCntVal` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntValAt(long index, int value) { PicOrderCntVal(this.segment(), index, value); return this; }

        /// {@return `TemporalId` at the given index}
        /// @param index the index of the struct buffer
        public byte TemporalIdAt(long index) { return TemporalId(this.segment(), index); }
        /// Sets `TemporalId` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer TemporalIdAt(long index, byte value) { TemporalId(this.segment(), index, value); return this; }

    }
}
