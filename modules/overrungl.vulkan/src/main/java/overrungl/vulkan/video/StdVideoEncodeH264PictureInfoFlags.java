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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### IdrPicFlag
/// [VarHandle][#VH_IdrPicFlag] - [Getter][#IdrPicFlag()] - [Setter][#IdrPicFlag(int)]
/// ### is_reference
/// [VarHandle][#VH_is_reference] - [Getter][#is_reference()] - [Setter][#is_reference(int)]
/// ### no_output_of_prior_pics_flag
/// [VarHandle][#VH_no_output_of_prior_pics_flag] - [Getter][#no_output_of_prior_pics_flag()] - [Setter][#no_output_of_prior_pics_flag(int)]
/// ### long_term_reference_flag
/// [VarHandle][#VH_long_term_reference_flag] - [Getter][#long_term_reference_flag()] - [Setter][#long_term_reference_flag(int)]
/// ### adaptive_ref_pic_marking_mode_flag
/// [VarHandle][#VH_adaptive_ref_pic_marking_mode_flag] - [Getter][#adaptive_ref_pic_marking_mode_flag()] - [Setter][#adaptive_ref_pic_marking_mode_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264PictureInfoFlags {
///     uint32_t : 1 IdrPicFlag;
///     uint32_t : 1 is_reference;
///     uint32_t : 1 no_output_of_prior_pics_flag;
///     uint32_t : 1 long_term_reference_flag;
///     uint32_t : 1 adaptive_ref_pic_marking_mode_flag;
///     uint32_t : 27 reserved;
/// } StdVideoEncodeH264PictureInfoFlags;
/// ```
public sealed class StdVideoEncodeH264PictureInfoFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH264PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("IdrPicFlag"),
        ValueLayout.JAVA_INT.withName("is_reference"),
        ValueLayout.JAVA_INT.withName("no_output_of_prior_pics_flag"),
        ValueLayout.JAVA_INT.withName("long_term_reference_flag"),
        ValueLayout.JAVA_INT.withName("adaptive_ref_pic_marking_mode_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `IdrPicFlag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_IdrPicFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("IdrPicFlag"));
    /// The [VarHandle] of `is_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_reference"));
    /// The [VarHandle] of `no_output_of_prior_pics_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_no_output_of_prior_pics_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("no_output_of_prior_pics_flag"));
    /// The [VarHandle] of `long_term_reference_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_long_term_reference_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_reference_flag"));
    /// The [VarHandle] of `adaptive_ref_pic_marking_mode_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_adaptive_ref_pic_marking_mode_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("adaptive_ref_pic_marking_mode_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeH264PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264PictureInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfoFlags(segment); }

    /// Creates `StdVideoEncodeH264PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH264PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264PictureInfoFlags`
    public static StdVideoEncodeH264PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264PictureInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264PictureInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH264PictureInfoFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264PictureInfoFlags`
    public static StdVideoEncodeH264PictureInfoFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int IdrPicFlag, @CType("uint32_t : 1") int is_reference, @CType("uint32_t : 1") int no_output_of_prior_pics_flag, @CType("uint32_t : 1") int long_term_reference_flag, @CType("uint32_t : 1") int adaptive_ref_pic_marking_mode_flag, @CType("uint32_t : 27") int reserved) { return alloc(allocator).IdrPicFlag(IdrPicFlag).is_reference(is_reference).no_output_of_prior_pics_flag(no_output_of_prior_pics_flag).long_term_reference_flag(long_term_reference_flag).adaptive_ref_pic_marking_mode_flag(adaptive_ref_pic_marking_mode_flag).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags copyFrom(StdVideoEncodeH264PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `IdrPicFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_IdrPicFlag(MemorySegment segment, long index) { return (int) VH_IdrPicFlag.get(segment, 0L, index); }
    /// {@return `IdrPicFlag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_IdrPicFlag(MemorySegment segment) { return StdVideoEncodeH264PictureInfoFlags.get_IdrPicFlag(segment, 0L); }
    /// {@return `IdrPicFlag`}
    public @CType("uint32_t : 1") int IdrPicFlag() { return StdVideoEncodeH264PictureInfoFlags.get_IdrPicFlag(this.segment()); }
    /// Sets `IdrPicFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_IdrPicFlag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_IdrPicFlag.set(segment, 0L, index, value); }
    /// Sets `IdrPicFlag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_IdrPicFlag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_IdrPicFlag(segment, 0L, value); }
    /// Sets `IdrPicFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags IdrPicFlag(@CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_IdrPicFlag(this.segment(), value); return this; }

    /// {@return `is_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_reference(MemorySegment segment, long index) { return (int) VH_is_reference.get(segment, 0L, index); }
    /// {@return `is_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_reference(MemorySegment segment) { return StdVideoEncodeH264PictureInfoFlags.get_is_reference(segment, 0L); }
    /// {@return `is_reference`}
    public @CType("uint32_t : 1") int is_reference() { return StdVideoEncodeH264PictureInfoFlags.get_is_reference(this.segment()); }
    /// Sets `is_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_reference.set(segment, 0L, index, value); }
    /// Sets `is_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_is_reference(segment, 0L, value); }
    /// Sets `is_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags is_reference(@CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_is_reference(this.segment(), value); return this; }

    /// {@return `no_output_of_prior_pics_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_no_output_of_prior_pics_flag(MemorySegment segment, long index) { return (int) VH_no_output_of_prior_pics_flag.get(segment, 0L, index); }
    /// {@return `no_output_of_prior_pics_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_no_output_of_prior_pics_flag(MemorySegment segment) { return StdVideoEncodeH264PictureInfoFlags.get_no_output_of_prior_pics_flag(segment, 0L); }
    /// {@return `no_output_of_prior_pics_flag`}
    public @CType("uint32_t : 1") int no_output_of_prior_pics_flag() { return StdVideoEncodeH264PictureInfoFlags.get_no_output_of_prior_pics_flag(this.segment()); }
    /// Sets `no_output_of_prior_pics_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_no_output_of_prior_pics_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_no_output_of_prior_pics_flag.set(segment, 0L, index, value); }
    /// Sets `no_output_of_prior_pics_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_no_output_of_prior_pics_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_no_output_of_prior_pics_flag(segment, 0L, value); }
    /// Sets `no_output_of_prior_pics_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags no_output_of_prior_pics_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_no_output_of_prior_pics_flag(this.segment(), value); return this; }

    /// {@return `long_term_reference_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_long_term_reference_flag(MemorySegment segment, long index) { return (int) VH_long_term_reference_flag.get(segment, 0L, index); }
    /// {@return `long_term_reference_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_long_term_reference_flag(MemorySegment segment) { return StdVideoEncodeH264PictureInfoFlags.get_long_term_reference_flag(segment, 0L); }
    /// {@return `long_term_reference_flag`}
    public @CType("uint32_t : 1") int long_term_reference_flag() { return StdVideoEncodeH264PictureInfoFlags.get_long_term_reference_flag(this.segment()); }
    /// Sets `long_term_reference_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_long_term_reference_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_long_term_reference_flag.set(segment, 0L, index, value); }
    /// Sets `long_term_reference_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_long_term_reference_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_long_term_reference_flag(segment, 0L, value); }
    /// Sets `long_term_reference_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags long_term_reference_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_long_term_reference_flag(this.segment(), value); return this; }

    /// {@return `adaptive_ref_pic_marking_mode_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_adaptive_ref_pic_marking_mode_flag(MemorySegment segment, long index) { return (int) VH_adaptive_ref_pic_marking_mode_flag.get(segment, 0L, index); }
    /// {@return `adaptive_ref_pic_marking_mode_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_adaptive_ref_pic_marking_mode_flag(MemorySegment segment) { return StdVideoEncodeH264PictureInfoFlags.get_adaptive_ref_pic_marking_mode_flag(segment, 0L); }
    /// {@return `adaptive_ref_pic_marking_mode_flag`}
    public @CType("uint32_t : 1") int adaptive_ref_pic_marking_mode_flag() { return StdVideoEncodeH264PictureInfoFlags.get_adaptive_ref_pic_marking_mode_flag(this.segment()); }
    /// Sets `adaptive_ref_pic_marking_mode_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_adaptive_ref_pic_marking_mode_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_adaptive_ref_pic_marking_mode_flag.set(segment, 0L, index, value); }
    /// Sets `adaptive_ref_pic_marking_mode_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_adaptive_ref_pic_marking_mode_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_adaptive_ref_pic_marking_mode_flag(segment, 0L, value); }
    /// Sets `adaptive_ref_pic_marking_mode_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags adaptive_ref_pic_marking_mode_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_adaptive_ref_pic_marking_mode_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 27") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 27") int get_reserved(MemorySegment segment) { return StdVideoEncodeH264PictureInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 27") int reserved() { return StdVideoEncodeH264PictureInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 27") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 27") int value) { StdVideoEncodeH264PictureInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfoFlags reserved(@CType("uint32_t : 27") int value) { StdVideoEncodeH264PictureInfoFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH264PictureInfoFlags].
    public static final class Buffer extends StdVideoEncodeH264PictureInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264PictureInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264PictureInfoFlags`
        public StdVideoEncodeH264PictureInfoFlags asSlice(long index) { return new StdVideoEncodeH264PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264PictureInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `IdrPicFlag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int IdrPicFlagAt(long index) { return StdVideoEncodeH264PictureInfoFlags.get_IdrPicFlag(this.segment(), index); }
        /// Sets `IdrPicFlag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer IdrPicFlagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_IdrPicFlag(this.segment(), index, value); return this; }

        /// {@return `is_reference` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int is_referenceAt(long index) { return StdVideoEncodeH264PictureInfoFlags.get_is_reference(this.segment(), index); }
        /// Sets `is_reference` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer is_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_is_reference(this.segment(), index, value); return this; }

        /// {@return `no_output_of_prior_pics_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int no_output_of_prior_pics_flagAt(long index) { return StdVideoEncodeH264PictureInfoFlags.get_no_output_of_prior_pics_flag(this.segment(), index); }
        /// Sets `no_output_of_prior_pics_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer no_output_of_prior_pics_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_no_output_of_prior_pics_flag(this.segment(), index, value); return this; }

        /// {@return `long_term_reference_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int long_term_reference_flagAt(long index) { return StdVideoEncodeH264PictureInfoFlags.get_long_term_reference_flag(this.segment(), index); }
        /// Sets `long_term_reference_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer long_term_reference_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_long_term_reference_flag(this.segment(), index, value); return this; }

        /// {@return `adaptive_ref_pic_marking_mode_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int adaptive_ref_pic_marking_mode_flagAt(long index) { return StdVideoEncodeH264PictureInfoFlags.get_adaptive_ref_pic_marking_mode_flag(this.segment(), index); }
        /// Sets `adaptive_ref_pic_marking_mode_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer adaptive_ref_pic_marking_mode_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264PictureInfoFlags.set_adaptive_ref_pic_marking_mode_flag(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 27") int reservedAt(long index) { return StdVideoEncodeH264PictureInfoFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 27") int value) { StdVideoEncodeH264PictureInfoFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
