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
/// ### field_pic_flag
/// [VarHandle][#VH_field_pic_flag] - [Getter][#field_pic_flag()] - [Setter][#field_pic_flag(int)]
/// ### is_intra
/// [VarHandle][#VH_is_intra] - [Getter][#is_intra()] - [Setter][#is_intra(int)]
/// ### IdrPicFlag
/// [VarHandle][#VH_IdrPicFlag] - [Getter][#IdrPicFlag()] - [Setter][#IdrPicFlag(int)]
/// ### bottom_field_flag
/// [VarHandle][#VH_bottom_field_flag] - [Getter][#bottom_field_flag()] - [Setter][#bottom_field_flag(int)]
/// ### is_reference
/// [VarHandle][#VH_is_reference] - [Getter][#is_reference()] - [Setter][#is_reference(int)]
/// ### complementary_field_pair
/// [VarHandle][#VH_complementary_field_pair] - [Getter][#complementary_field_pair()] - [Setter][#complementary_field_pair(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH264PictureInfoFlags {
///     uint32_t : 1 field_pic_flag;
///     uint32_t : 1 is_intra;
///     uint32_t : 1 IdrPicFlag;
///     uint32_t : 1 bottom_field_flag;
///     uint32_t : 1 is_reference;
///     uint32_t : 1 complementary_field_pair;
/// } StdVideoDecodeH264PictureInfoFlags;
/// ```
public final class StdVideoDecodeH264PictureInfoFlags extends Struct {
    /// The struct layout of `StdVideoDecodeH264PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("field_pic_flag"),
        ValueLayout.JAVA_INT.withName("is_intra"),
        ValueLayout.JAVA_INT.withName("IdrPicFlag"),
        ValueLayout.JAVA_INT.withName("bottom_field_flag"),
        ValueLayout.JAVA_INT.withName("is_reference"),
        ValueLayout.JAVA_INT.withName("complementary_field_pair")
    );
    /// The [VarHandle] of `field_pic_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_field_pic_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("field_pic_flag"));
    /// The [VarHandle] of `is_intra` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_intra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_intra"));
    /// The [VarHandle] of `IdrPicFlag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_IdrPicFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("IdrPicFlag"));
    /// The [VarHandle] of `bottom_field_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bottom_field_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bottom_field_flag"));
    /// The [VarHandle] of `is_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_reference"));
    /// The [VarHandle] of `complementary_field_pair` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_complementary_field_pair = LAYOUT.arrayElementVarHandle(PathElement.groupElement("complementary_field_pair"));

    /// Creates `StdVideoDecodeH264PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH264PictureInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH264PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfoFlags(segment); }

    /// Creates `StdVideoDecodeH264PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH264PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeH264PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264PictureInfoFlags`
    public static StdVideoDecodeH264PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeH264PictureInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH264PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH264PictureInfoFlags`
    public static StdVideoDecodeH264PictureInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH264PictureInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoDecodeH264PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeH264PictureInfoFlags`
    public StdVideoDecodeH264PictureInfoFlags asSlice(long index) { return new StdVideoDecodeH264PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoDecodeH264PictureInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeH264PictureInfoFlags`
    public StdVideoDecodeH264PictureInfoFlags asSlice(long index, long count) { return new StdVideoDecodeH264PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `field_pic_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_field_pic_flag(MemorySegment segment, long index) { return (int) VH_field_pic_flag.get(segment, 0L, index); }
    /// {@return `field_pic_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_field_pic_flag(MemorySegment segment) { return StdVideoDecodeH264PictureInfoFlags.get_field_pic_flag(segment, 0L); }
    /// {@return `field_pic_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int field_pic_flagAt(long index) { return StdVideoDecodeH264PictureInfoFlags.get_field_pic_flag(this.segment(), index); }
    /// {@return `field_pic_flag`}
    public @CType("uint32_t : 1") int field_pic_flag() { return StdVideoDecodeH264PictureInfoFlags.get_field_pic_flag(this.segment()); }
    /// Sets `field_pic_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_field_pic_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_field_pic_flag.set(segment, 0L, index, value); }
    /// Sets `field_pic_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_field_pic_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_field_pic_flag(segment, 0L, value); }
    /// Sets `field_pic_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags field_pic_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_field_pic_flag(this.segment(), index, value); return this; }
    /// Sets `field_pic_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags field_pic_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_field_pic_flag(this.segment(), value); return this; }

    /// {@return `is_intra` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_intra(MemorySegment segment, long index) { return (int) VH_is_intra.get(segment, 0L, index); }
    /// {@return `is_intra`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_intra(MemorySegment segment) { return StdVideoDecodeH264PictureInfoFlags.get_is_intra(segment, 0L); }
    /// {@return `is_intra` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int is_intraAt(long index) { return StdVideoDecodeH264PictureInfoFlags.get_is_intra(this.segment(), index); }
    /// {@return `is_intra`}
    public @CType("uint32_t : 1") int is_intra() { return StdVideoDecodeH264PictureInfoFlags.get_is_intra(this.segment()); }
    /// Sets `is_intra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_intra(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_intra.set(segment, 0L, index, value); }
    /// Sets `is_intra` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_intra(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_is_intra(segment, 0L, value); }
    /// Sets `is_intra` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags is_intraAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_is_intra(this.segment(), index, value); return this; }
    /// Sets `is_intra` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags is_intra(@CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_is_intra(this.segment(), value); return this; }

    /// {@return `IdrPicFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_IdrPicFlag(MemorySegment segment, long index) { return (int) VH_IdrPicFlag.get(segment, 0L, index); }
    /// {@return `IdrPicFlag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_IdrPicFlag(MemorySegment segment) { return StdVideoDecodeH264PictureInfoFlags.get_IdrPicFlag(segment, 0L); }
    /// {@return `IdrPicFlag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int IdrPicFlagAt(long index) { return StdVideoDecodeH264PictureInfoFlags.get_IdrPicFlag(this.segment(), index); }
    /// {@return `IdrPicFlag`}
    public @CType("uint32_t : 1") int IdrPicFlag() { return StdVideoDecodeH264PictureInfoFlags.get_IdrPicFlag(this.segment()); }
    /// Sets `IdrPicFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_IdrPicFlag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_IdrPicFlag.set(segment, 0L, index, value); }
    /// Sets `IdrPicFlag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_IdrPicFlag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_IdrPicFlag(segment, 0L, value); }
    /// Sets `IdrPicFlag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags IdrPicFlagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_IdrPicFlag(this.segment(), index, value); return this; }
    /// Sets `IdrPicFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags IdrPicFlag(@CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_IdrPicFlag(this.segment(), value); return this; }

    /// {@return `bottom_field_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_bottom_field_flag(MemorySegment segment, long index) { return (int) VH_bottom_field_flag.get(segment, 0L, index); }
    /// {@return `bottom_field_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_bottom_field_flag(MemorySegment segment) { return StdVideoDecodeH264PictureInfoFlags.get_bottom_field_flag(segment, 0L); }
    /// {@return `bottom_field_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int bottom_field_flagAt(long index) { return StdVideoDecodeH264PictureInfoFlags.get_bottom_field_flag(this.segment(), index); }
    /// {@return `bottom_field_flag`}
    public @CType("uint32_t : 1") int bottom_field_flag() { return StdVideoDecodeH264PictureInfoFlags.get_bottom_field_flag(this.segment()); }
    /// Sets `bottom_field_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bottom_field_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_bottom_field_flag.set(segment, 0L, index, value); }
    /// Sets `bottom_field_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bottom_field_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_bottom_field_flag(segment, 0L, value); }
    /// Sets `bottom_field_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags bottom_field_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_bottom_field_flag(this.segment(), index, value); return this; }
    /// Sets `bottom_field_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags bottom_field_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_bottom_field_flag(this.segment(), value); return this; }

    /// {@return `is_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_reference(MemorySegment segment, long index) { return (int) VH_is_reference.get(segment, 0L, index); }
    /// {@return `is_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_reference(MemorySegment segment) { return StdVideoDecodeH264PictureInfoFlags.get_is_reference(segment, 0L); }
    /// {@return `is_reference` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int is_referenceAt(long index) { return StdVideoDecodeH264PictureInfoFlags.get_is_reference(this.segment(), index); }
    /// {@return `is_reference`}
    public @CType("uint32_t : 1") int is_reference() { return StdVideoDecodeH264PictureInfoFlags.get_is_reference(this.segment()); }
    /// Sets `is_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_reference.set(segment, 0L, index, value); }
    /// Sets `is_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_is_reference(segment, 0L, value); }
    /// Sets `is_reference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags is_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_is_reference(this.segment(), index, value); return this; }
    /// Sets `is_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags is_reference(@CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_is_reference(this.segment(), value); return this; }

    /// {@return `complementary_field_pair` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_complementary_field_pair(MemorySegment segment, long index) { return (int) VH_complementary_field_pair.get(segment, 0L, index); }
    /// {@return `complementary_field_pair`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_complementary_field_pair(MemorySegment segment) { return StdVideoDecodeH264PictureInfoFlags.get_complementary_field_pair(segment, 0L); }
    /// {@return `complementary_field_pair` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int complementary_field_pairAt(long index) { return StdVideoDecodeH264PictureInfoFlags.get_complementary_field_pair(this.segment(), index); }
    /// {@return `complementary_field_pair`}
    public @CType("uint32_t : 1") int complementary_field_pair() { return StdVideoDecodeH264PictureInfoFlags.get_complementary_field_pair(this.segment()); }
    /// Sets `complementary_field_pair` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_complementary_field_pair(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_complementary_field_pair.set(segment, 0L, index, value); }
    /// Sets `complementary_field_pair` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_complementary_field_pair(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_complementary_field_pair(segment, 0L, value); }
    /// Sets `complementary_field_pair` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags complementary_field_pairAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_complementary_field_pair(this.segment(), index, value); return this; }
    /// Sets `complementary_field_pair` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfoFlags complementary_field_pair(@CType("uint32_t : 1") int value) { StdVideoDecodeH264PictureInfoFlags.set_complementary_field_pair(this.segment(), value); return this; }

}
