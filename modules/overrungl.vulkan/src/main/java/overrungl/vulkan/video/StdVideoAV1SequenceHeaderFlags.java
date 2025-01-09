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
/// ### still_picture
/// [VarHandle][#VH_still_picture] - [Getter][#still_picture()] - [Setter][#still_picture(int)]
/// ### reduced_still_picture_header
/// [VarHandle][#VH_reduced_still_picture_header] - [Getter][#reduced_still_picture_header()] - [Setter][#reduced_still_picture_header(int)]
/// ### use_128x128_superblock
/// [VarHandle][#VH_use_128x128_superblock] - [Getter][#use_128x128_superblock()] - [Setter][#use_128x128_superblock(int)]
/// ### enable_filter_intra
/// [VarHandle][#VH_enable_filter_intra] - [Getter][#enable_filter_intra()] - [Setter][#enable_filter_intra(int)]
/// ### enable_intra_edge_filter
/// [VarHandle][#VH_enable_intra_edge_filter] - [Getter][#enable_intra_edge_filter()] - [Setter][#enable_intra_edge_filter(int)]
/// ### enable_interintra_compound
/// [VarHandle][#VH_enable_interintra_compound] - [Getter][#enable_interintra_compound()] - [Setter][#enable_interintra_compound(int)]
/// ### enable_masked_compound
/// [VarHandle][#VH_enable_masked_compound] - [Getter][#enable_masked_compound()] - [Setter][#enable_masked_compound(int)]
/// ### enable_warped_motion
/// [VarHandle][#VH_enable_warped_motion] - [Getter][#enable_warped_motion()] - [Setter][#enable_warped_motion(int)]
/// ### enable_dual_filter
/// [VarHandle][#VH_enable_dual_filter] - [Getter][#enable_dual_filter()] - [Setter][#enable_dual_filter(int)]
/// ### enable_order_hint
/// [VarHandle][#VH_enable_order_hint] - [Getter][#enable_order_hint()] - [Setter][#enable_order_hint(int)]
/// ### enable_jnt_comp
/// [VarHandle][#VH_enable_jnt_comp] - [Getter][#enable_jnt_comp()] - [Setter][#enable_jnt_comp(int)]
/// ### enable_ref_frame_mvs
/// [VarHandle][#VH_enable_ref_frame_mvs] - [Getter][#enable_ref_frame_mvs()] - [Setter][#enable_ref_frame_mvs(int)]
/// ### frame_id_numbers_present_flag
/// [VarHandle][#VH_frame_id_numbers_present_flag] - [Getter][#frame_id_numbers_present_flag()] - [Setter][#frame_id_numbers_present_flag(int)]
/// ### enable_superres
/// [VarHandle][#VH_enable_superres] - [Getter][#enable_superres()] - [Setter][#enable_superres(int)]
/// ### enable_cdef
/// [VarHandle][#VH_enable_cdef] - [Getter][#enable_cdef()] - [Setter][#enable_cdef(int)]
/// ### enable_restoration
/// [VarHandle][#VH_enable_restoration] - [Getter][#enable_restoration()] - [Setter][#enable_restoration(int)]
/// ### film_grain_params_present
/// [VarHandle][#VH_film_grain_params_present] - [Getter][#film_grain_params_present()] - [Setter][#film_grain_params_present(int)]
/// ### timing_info_present_flag
/// [VarHandle][#VH_timing_info_present_flag] - [Getter][#timing_info_present_flag()] - [Setter][#timing_info_present_flag(int)]
/// ### initial_display_delay_present_flag
/// [VarHandle][#VH_initial_display_delay_present_flag] - [Getter][#initial_display_delay_present_flag()] - [Setter][#initial_display_delay_present_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1SequenceHeaderFlags {
///     uint32_t : 1 still_picture;
///     uint32_t : 1 reduced_still_picture_header;
///     uint32_t : 1 use_128x128_superblock;
///     uint32_t : 1 enable_filter_intra;
///     uint32_t : 1 enable_intra_edge_filter;
///     uint32_t : 1 enable_interintra_compound;
///     uint32_t : 1 enable_masked_compound;
///     uint32_t : 1 enable_warped_motion;
///     uint32_t : 1 enable_dual_filter;
///     uint32_t : 1 enable_order_hint;
///     uint32_t : 1 enable_jnt_comp;
///     uint32_t : 1 enable_ref_frame_mvs;
///     uint32_t : 1 frame_id_numbers_present_flag;
///     uint32_t : 1 enable_superres;
///     uint32_t : 1 enable_cdef;
///     uint32_t : 1 enable_restoration;
///     uint32_t : 1 film_grain_params_present;
///     uint32_t : 1 timing_info_present_flag;
///     uint32_t : 1 initial_display_delay_present_flag;
///     uint32_t : 13 reserved;
/// } StdVideoAV1SequenceHeaderFlags;
/// ```
public final class StdVideoAV1SequenceHeaderFlags extends Struct {
    /// The struct layout of `StdVideoAV1SequenceHeaderFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("still_picture"),
        ValueLayout.JAVA_INT.withName("reduced_still_picture_header"),
        ValueLayout.JAVA_INT.withName("use_128x128_superblock"),
        ValueLayout.JAVA_INT.withName("enable_filter_intra"),
        ValueLayout.JAVA_INT.withName("enable_intra_edge_filter"),
        ValueLayout.JAVA_INT.withName("enable_interintra_compound"),
        ValueLayout.JAVA_INT.withName("enable_masked_compound"),
        ValueLayout.JAVA_INT.withName("enable_warped_motion"),
        ValueLayout.JAVA_INT.withName("enable_dual_filter"),
        ValueLayout.JAVA_INT.withName("enable_order_hint"),
        ValueLayout.JAVA_INT.withName("enable_jnt_comp"),
        ValueLayout.JAVA_INT.withName("enable_ref_frame_mvs"),
        ValueLayout.JAVA_INT.withName("frame_id_numbers_present_flag"),
        ValueLayout.JAVA_INT.withName("enable_superres"),
        ValueLayout.JAVA_INT.withName("enable_cdef"),
        ValueLayout.JAVA_INT.withName("enable_restoration"),
        ValueLayout.JAVA_INT.withName("film_grain_params_present"),
        ValueLayout.JAVA_INT.withName("timing_info_present_flag"),
        ValueLayout.JAVA_INT.withName("initial_display_delay_present_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `still_picture` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_still_picture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("still_picture"));
    /// The [VarHandle] of `reduced_still_picture_header` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reduced_still_picture_header = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reduced_still_picture_header"));
    /// The [VarHandle] of `use_128x128_superblock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_use_128x128_superblock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_128x128_superblock"));
    /// The [VarHandle] of `enable_filter_intra` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_filter_intra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_filter_intra"));
    /// The [VarHandle] of `enable_intra_edge_filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_intra_edge_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_intra_edge_filter"));
    /// The [VarHandle] of `enable_interintra_compound` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_interintra_compound = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_interintra_compound"));
    /// The [VarHandle] of `enable_masked_compound` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_masked_compound = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_masked_compound"));
    /// The [VarHandle] of `enable_warped_motion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_warped_motion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_warped_motion"));
    /// The [VarHandle] of `enable_dual_filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_dual_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_dual_filter"));
    /// The [VarHandle] of `enable_order_hint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_order_hint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_order_hint"));
    /// The [VarHandle] of `enable_jnt_comp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_jnt_comp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_jnt_comp"));
    /// The [VarHandle] of `enable_ref_frame_mvs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_ref_frame_mvs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_ref_frame_mvs"));
    /// The [VarHandle] of `frame_id_numbers_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_id_numbers_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_id_numbers_present_flag"));
    /// The [VarHandle] of `enable_superres` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_superres = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_superres"));
    /// The [VarHandle] of `enable_cdef` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_cdef = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_cdef"));
    /// The [VarHandle] of `enable_restoration` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable_restoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable_restoration"));
    /// The [VarHandle] of `film_grain_params_present` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_film_grain_params_present = LAYOUT.arrayElementVarHandle(PathElement.groupElement("film_grain_params_present"));
    /// The [VarHandle] of `timing_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_timing_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timing_info_present_flag"));
    /// The [VarHandle] of `initial_display_delay_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_initial_display_delay_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_display_delay_present_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1SequenceHeaderFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeaderFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeaderFlags(segment); }

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeaderFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1SequenceHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1SequenceHeaderFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1SequenceHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1SequenceHeaderFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1SequenceHeaderFlags`
    public static StdVideoAV1SequenceHeaderFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1SequenceHeaderFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1SequenceHeaderFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1SequenceHeaderFlags`
    public static StdVideoAV1SequenceHeaderFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1SequenceHeaderFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `still_picture` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_still_picture(MemorySegment segment, long index) { return (int) VH_still_picture.get(segment, 0L, index); }
    /// {@return `still_picture`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_still_picture(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_still_picture(segment, 0L); }
    /// {@return `still_picture` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int still_pictureAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_still_picture(this.segment(), index); }
    /// {@return `still_picture`}
    public @CType("uint32_t : 1") int still_picture() { return StdVideoAV1SequenceHeaderFlags.get_still_picture(this.segment()); }
    /// Sets `still_picture` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_still_picture(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_still_picture.set(segment, 0L, index, value); }
    /// Sets `still_picture` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_still_picture(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_still_picture(segment, 0L, value); }
    /// Sets `still_picture` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags still_pictureAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_still_picture(this.segment(), index, value); return this; }
    /// Sets `still_picture` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags still_picture(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_still_picture(this.segment(), value); return this; }

    /// {@return `reduced_still_picture_header` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_reduced_still_picture_header(MemorySegment segment, long index) { return (int) VH_reduced_still_picture_header.get(segment, 0L, index); }
    /// {@return `reduced_still_picture_header`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_reduced_still_picture_header(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_reduced_still_picture_header(segment, 0L); }
    /// {@return `reduced_still_picture_header` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int reduced_still_picture_headerAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_reduced_still_picture_header(this.segment(), index); }
    /// {@return `reduced_still_picture_header`}
    public @CType("uint32_t : 1") int reduced_still_picture_header() { return StdVideoAV1SequenceHeaderFlags.get_reduced_still_picture_header(this.segment()); }
    /// Sets `reduced_still_picture_header` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reduced_still_picture_header(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_reduced_still_picture_header.set(segment, 0L, index, value); }
    /// Sets `reduced_still_picture_header` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reduced_still_picture_header(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_reduced_still_picture_header(segment, 0L, value); }
    /// Sets `reduced_still_picture_header` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags reduced_still_picture_headerAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_reduced_still_picture_header(this.segment(), index, value); return this; }
    /// Sets `reduced_still_picture_header` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags reduced_still_picture_header(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_reduced_still_picture_header(this.segment(), value); return this; }

    /// {@return `use_128x128_superblock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_use_128x128_superblock(MemorySegment segment, long index) { return (int) VH_use_128x128_superblock.get(segment, 0L, index); }
    /// {@return `use_128x128_superblock`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_use_128x128_superblock(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_use_128x128_superblock(segment, 0L); }
    /// {@return `use_128x128_superblock` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int use_128x128_superblockAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_use_128x128_superblock(this.segment(), index); }
    /// {@return `use_128x128_superblock`}
    public @CType("uint32_t : 1") int use_128x128_superblock() { return StdVideoAV1SequenceHeaderFlags.get_use_128x128_superblock(this.segment()); }
    /// Sets `use_128x128_superblock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_use_128x128_superblock(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_use_128x128_superblock.set(segment, 0L, index, value); }
    /// Sets `use_128x128_superblock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_use_128x128_superblock(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_use_128x128_superblock(segment, 0L, value); }
    /// Sets `use_128x128_superblock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags use_128x128_superblockAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_use_128x128_superblock(this.segment(), index, value); return this; }
    /// Sets `use_128x128_superblock` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags use_128x128_superblock(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_use_128x128_superblock(this.segment(), value); return this; }

    /// {@return `enable_filter_intra` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_filter_intra(MemorySegment segment, long index) { return (int) VH_enable_filter_intra.get(segment, 0L, index); }
    /// {@return `enable_filter_intra`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_filter_intra(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_filter_intra(segment, 0L); }
    /// {@return `enable_filter_intra` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_filter_intraAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_filter_intra(this.segment(), index); }
    /// {@return `enable_filter_intra`}
    public @CType("uint32_t : 1") int enable_filter_intra() { return StdVideoAV1SequenceHeaderFlags.get_enable_filter_intra(this.segment()); }
    /// Sets `enable_filter_intra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_filter_intra(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_filter_intra.set(segment, 0L, index, value); }
    /// Sets `enable_filter_intra` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_filter_intra(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_filter_intra(segment, 0L, value); }
    /// Sets `enable_filter_intra` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_filter_intraAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_filter_intra(this.segment(), index, value); return this; }
    /// Sets `enable_filter_intra` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_filter_intra(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_filter_intra(this.segment(), value); return this; }

    /// {@return `enable_intra_edge_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_intra_edge_filter(MemorySegment segment, long index) { return (int) VH_enable_intra_edge_filter.get(segment, 0L, index); }
    /// {@return `enable_intra_edge_filter`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_intra_edge_filter(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_intra_edge_filter(segment, 0L); }
    /// {@return `enable_intra_edge_filter` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_intra_edge_filterAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_intra_edge_filter(this.segment(), index); }
    /// {@return `enable_intra_edge_filter`}
    public @CType("uint32_t : 1") int enable_intra_edge_filter() { return StdVideoAV1SequenceHeaderFlags.get_enable_intra_edge_filter(this.segment()); }
    /// Sets `enable_intra_edge_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_intra_edge_filter(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_intra_edge_filter.set(segment, 0L, index, value); }
    /// Sets `enable_intra_edge_filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_intra_edge_filter(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_intra_edge_filter(segment, 0L, value); }
    /// Sets `enable_intra_edge_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_intra_edge_filterAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_intra_edge_filter(this.segment(), index, value); return this; }
    /// Sets `enable_intra_edge_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_intra_edge_filter(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_intra_edge_filter(this.segment(), value); return this; }

    /// {@return `enable_interintra_compound` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_interintra_compound(MemorySegment segment, long index) { return (int) VH_enable_interintra_compound.get(segment, 0L, index); }
    /// {@return `enable_interintra_compound`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_interintra_compound(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_interintra_compound(segment, 0L); }
    /// {@return `enable_interintra_compound` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_interintra_compoundAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_interintra_compound(this.segment(), index); }
    /// {@return `enable_interintra_compound`}
    public @CType("uint32_t : 1") int enable_interintra_compound() { return StdVideoAV1SequenceHeaderFlags.get_enable_interintra_compound(this.segment()); }
    /// Sets `enable_interintra_compound` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_interintra_compound(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_interintra_compound.set(segment, 0L, index, value); }
    /// Sets `enable_interintra_compound` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_interintra_compound(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_interintra_compound(segment, 0L, value); }
    /// Sets `enable_interintra_compound` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_interintra_compoundAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_interintra_compound(this.segment(), index, value); return this; }
    /// Sets `enable_interintra_compound` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_interintra_compound(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_interintra_compound(this.segment(), value); return this; }

    /// {@return `enable_masked_compound` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_masked_compound(MemorySegment segment, long index) { return (int) VH_enable_masked_compound.get(segment, 0L, index); }
    /// {@return `enable_masked_compound`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_masked_compound(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_masked_compound(segment, 0L); }
    /// {@return `enable_masked_compound` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_masked_compoundAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_masked_compound(this.segment(), index); }
    /// {@return `enable_masked_compound`}
    public @CType("uint32_t : 1") int enable_masked_compound() { return StdVideoAV1SequenceHeaderFlags.get_enable_masked_compound(this.segment()); }
    /// Sets `enable_masked_compound` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_masked_compound(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_masked_compound.set(segment, 0L, index, value); }
    /// Sets `enable_masked_compound` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_masked_compound(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_masked_compound(segment, 0L, value); }
    /// Sets `enable_masked_compound` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_masked_compoundAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_masked_compound(this.segment(), index, value); return this; }
    /// Sets `enable_masked_compound` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_masked_compound(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_masked_compound(this.segment(), value); return this; }

    /// {@return `enable_warped_motion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_warped_motion(MemorySegment segment, long index) { return (int) VH_enable_warped_motion.get(segment, 0L, index); }
    /// {@return `enable_warped_motion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_warped_motion(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_warped_motion(segment, 0L); }
    /// {@return `enable_warped_motion` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_warped_motionAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_warped_motion(this.segment(), index); }
    /// {@return `enable_warped_motion`}
    public @CType("uint32_t : 1") int enable_warped_motion() { return StdVideoAV1SequenceHeaderFlags.get_enable_warped_motion(this.segment()); }
    /// Sets `enable_warped_motion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_warped_motion(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_warped_motion.set(segment, 0L, index, value); }
    /// Sets `enable_warped_motion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_warped_motion(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_warped_motion(segment, 0L, value); }
    /// Sets `enable_warped_motion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_warped_motionAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_warped_motion(this.segment(), index, value); return this; }
    /// Sets `enable_warped_motion` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_warped_motion(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_warped_motion(this.segment(), value); return this; }

    /// {@return `enable_dual_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_dual_filter(MemorySegment segment, long index) { return (int) VH_enable_dual_filter.get(segment, 0L, index); }
    /// {@return `enable_dual_filter`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_dual_filter(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_dual_filter(segment, 0L); }
    /// {@return `enable_dual_filter` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_dual_filterAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_dual_filter(this.segment(), index); }
    /// {@return `enable_dual_filter`}
    public @CType("uint32_t : 1") int enable_dual_filter() { return StdVideoAV1SequenceHeaderFlags.get_enable_dual_filter(this.segment()); }
    /// Sets `enable_dual_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_dual_filter(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_dual_filter.set(segment, 0L, index, value); }
    /// Sets `enable_dual_filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_dual_filter(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_dual_filter(segment, 0L, value); }
    /// Sets `enable_dual_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_dual_filterAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_dual_filter(this.segment(), index, value); return this; }
    /// Sets `enable_dual_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_dual_filter(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_dual_filter(this.segment(), value); return this; }

    /// {@return `enable_order_hint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_order_hint(MemorySegment segment, long index) { return (int) VH_enable_order_hint.get(segment, 0L, index); }
    /// {@return `enable_order_hint`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_order_hint(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_order_hint(segment, 0L); }
    /// {@return `enable_order_hint` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_order_hintAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_order_hint(this.segment(), index); }
    /// {@return `enable_order_hint`}
    public @CType("uint32_t : 1") int enable_order_hint() { return StdVideoAV1SequenceHeaderFlags.get_enable_order_hint(this.segment()); }
    /// Sets `enable_order_hint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_order_hint(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_order_hint.set(segment, 0L, index, value); }
    /// Sets `enable_order_hint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_order_hint(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_order_hint(segment, 0L, value); }
    /// Sets `enable_order_hint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_order_hintAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_order_hint(this.segment(), index, value); return this; }
    /// Sets `enable_order_hint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_order_hint(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_order_hint(this.segment(), value); return this; }

    /// {@return `enable_jnt_comp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_jnt_comp(MemorySegment segment, long index) { return (int) VH_enable_jnt_comp.get(segment, 0L, index); }
    /// {@return `enable_jnt_comp`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_jnt_comp(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_jnt_comp(segment, 0L); }
    /// {@return `enable_jnt_comp` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_jnt_compAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_jnt_comp(this.segment(), index); }
    /// {@return `enable_jnt_comp`}
    public @CType("uint32_t : 1") int enable_jnt_comp() { return StdVideoAV1SequenceHeaderFlags.get_enable_jnt_comp(this.segment()); }
    /// Sets `enable_jnt_comp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_jnt_comp(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_jnt_comp.set(segment, 0L, index, value); }
    /// Sets `enable_jnt_comp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_jnt_comp(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_jnt_comp(segment, 0L, value); }
    /// Sets `enable_jnt_comp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_jnt_compAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_jnt_comp(this.segment(), index, value); return this; }
    /// Sets `enable_jnt_comp` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_jnt_comp(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_jnt_comp(this.segment(), value); return this; }

    /// {@return `enable_ref_frame_mvs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_ref_frame_mvs(MemorySegment segment, long index) { return (int) VH_enable_ref_frame_mvs.get(segment, 0L, index); }
    /// {@return `enable_ref_frame_mvs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_ref_frame_mvs(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_ref_frame_mvs(segment, 0L); }
    /// {@return `enable_ref_frame_mvs` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_ref_frame_mvsAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_ref_frame_mvs(this.segment(), index); }
    /// {@return `enable_ref_frame_mvs`}
    public @CType("uint32_t : 1") int enable_ref_frame_mvs() { return StdVideoAV1SequenceHeaderFlags.get_enable_ref_frame_mvs(this.segment()); }
    /// Sets `enable_ref_frame_mvs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_ref_frame_mvs(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_ref_frame_mvs.set(segment, 0L, index, value); }
    /// Sets `enable_ref_frame_mvs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_ref_frame_mvs(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_ref_frame_mvs(segment, 0L, value); }
    /// Sets `enable_ref_frame_mvs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_ref_frame_mvsAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_ref_frame_mvs(this.segment(), index, value); return this; }
    /// Sets `enable_ref_frame_mvs` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_ref_frame_mvs(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_ref_frame_mvs(this.segment(), value); return this; }

    /// {@return `frame_id_numbers_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_frame_id_numbers_present_flag(MemorySegment segment, long index) { return (int) VH_frame_id_numbers_present_flag.get(segment, 0L, index); }
    /// {@return `frame_id_numbers_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_frame_id_numbers_present_flag(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_frame_id_numbers_present_flag(segment, 0L); }
    /// {@return `frame_id_numbers_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int frame_id_numbers_present_flagAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_frame_id_numbers_present_flag(this.segment(), index); }
    /// {@return `frame_id_numbers_present_flag`}
    public @CType("uint32_t : 1") int frame_id_numbers_present_flag() { return StdVideoAV1SequenceHeaderFlags.get_frame_id_numbers_present_flag(this.segment()); }
    /// Sets `frame_id_numbers_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_id_numbers_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_frame_id_numbers_present_flag.set(segment, 0L, index, value); }
    /// Sets `frame_id_numbers_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_id_numbers_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_frame_id_numbers_present_flag(segment, 0L, value); }
    /// Sets `frame_id_numbers_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags frame_id_numbers_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_frame_id_numbers_present_flag(this.segment(), index, value); return this; }
    /// Sets `frame_id_numbers_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags frame_id_numbers_present_flag(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_frame_id_numbers_present_flag(this.segment(), value); return this; }

    /// {@return `enable_superres` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_superres(MemorySegment segment, long index) { return (int) VH_enable_superres.get(segment, 0L, index); }
    /// {@return `enable_superres`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_superres(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_superres(segment, 0L); }
    /// {@return `enable_superres` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_superresAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_superres(this.segment(), index); }
    /// {@return `enable_superres`}
    public @CType("uint32_t : 1") int enable_superres() { return StdVideoAV1SequenceHeaderFlags.get_enable_superres(this.segment()); }
    /// Sets `enable_superres` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_superres(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_superres.set(segment, 0L, index, value); }
    /// Sets `enable_superres` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_superres(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_superres(segment, 0L, value); }
    /// Sets `enable_superres` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_superresAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_superres(this.segment(), index, value); return this; }
    /// Sets `enable_superres` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_superres(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_superres(this.segment(), value); return this; }

    /// {@return `enable_cdef` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_cdef(MemorySegment segment, long index) { return (int) VH_enable_cdef.get(segment, 0L, index); }
    /// {@return `enable_cdef`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_cdef(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_cdef(segment, 0L); }
    /// {@return `enable_cdef` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_cdefAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_cdef(this.segment(), index); }
    /// {@return `enable_cdef`}
    public @CType("uint32_t : 1") int enable_cdef() { return StdVideoAV1SequenceHeaderFlags.get_enable_cdef(this.segment()); }
    /// Sets `enable_cdef` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_cdef(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_cdef.set(segment, 0L, index, value); }
    /// Sets `enable_cdef` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_cdef(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_cdef(segment, 0L, value); }
    /// Sets `enable_cdef` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_cdefAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_cdef(this.segment(), index, value); return this; }
    /// Sets `enable_cdef` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_cdef(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_cdef(this.segment(), value); return this; }

    /// {@return `enable_restoration` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_enable_restoration(MemorySegment segment, long index) { return (int) VH_enable_restoration.get(segment, 0L, index); }
    /// {@return `enable_restoration`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_enable_restoration(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_enable_restoration(segment, 0L); }
    /// {@return `enable_restoration` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int enable_restorationAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_enable_restoration(this.segment(), index); }
    /// {@return `enable_restoration`}
    public @CType("uint32_t : 1") int enable_restoration() { return StdVideoAV1SequenceHeaderFlags.get_enable_restoration(this.segment()); }
    /// Sets `enable_restoration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable_restoration(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_enable_restoration.set(segment, 0L, index, value); }
    /// Sets `enable_restoration` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable_restoration(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_restoration(segment, 0L, value); }
    /// Sets `enable_restoration` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_restorationAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_restoration(this.segment(), index, value); return this; }
    /// Sets `enable_restoration` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags enable_restoration(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_enable_restoration(this.segment(), value); return this; }

    /// {@return `film_grain_params_present` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_film_grain_params_present(MemorySegment segment, long index) { return (int) VH_film_grain_params_present.get(segment, 0L, index); }
    /// {@return `film_grain_params_present`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_film_grain_params_present(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_film_grain_params_present(segment, 0L); }
    /// {@return `film_grain_params_present` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int film_grain_params_presentAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_film_grain_params_present(this.segment(), index); }
    /// {@return `film_grain_params_present`}
    public @CType("uint32_t : 1") int film_grain_params_present() { return StdVideoAV1SequenceHeaderFlags.get_film_grain_params_present(this.segment()); }
    /// Sets `film_grain_params_present` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_film_grain_params_present(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_film_grain_params_present.set(segment, 0L, index, value); }
    /// Sets `film_grain_params_present` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_film_grain_params_present(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_film_grain_params_present(segment, 0L, value); }
    /// Sets `film_grain_params_present` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags film_grain_params_presentAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_film_grain_params_present(this.segment(), index, value); return this; }
    /// Sets `film_grain_params_present` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags film_grain_params_present(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_film_grain_params_present(this.segment(), value); return this; }

    /// {@return `timing_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_timing_info_present_flag(MemorySegment segment, long index) { return (int) VH_timing_info_present_flag.get(segment, 0L, index); }
    /// {@return `timing_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_timing_info_present_flag(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_timing_info_present_flag(segment, 0L); }
    /// {@return `timing_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int timing_info_present_flagAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_timing_info_present_flag(this.segment(), index); }
    /// {@return `timing_info_present_flag`}
    public @CType("uint32_t : 1") int timing_info_present_flag() { return StdVideoAV1SequenceHeaderFlags.get_timing_info_present_flag(this.segment()); }
    /// Sets `timing_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timing_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_timing_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `timing_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timing_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_timing_info_present_flag(segment, 0L, value); }
    /// Sets `timing_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags timing_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_timing_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `timing_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags timing_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_timing_info_present_flag(this.segment(), value); return this; }

    /// {@return `initial_display_delay_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_initial_display_delay_present_flag(MemorySegment segment, long index) { return (int) VH_initial_display_delay_present_flag.get(segment, 0L, index); }
    /// {@return `initial_display_delay_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_initial_display_delay_present_flag(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_initial_display_delay_present_flag(segment, 0L); }
    /// {@return `initial_display_delay_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int initial_display_delay_present_flagAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_initial_display_delay_present_flag(this.segment(), index); }
    /// {@return `initial_display_delay_present_flag`}
    public @CType("uint32_t : 1") int initial_display_delay_present_flag() { return StdVideoAV1SequenceHeaderFlags.get_initial_display_delay_present_flag(this.segment()); }
    /// Sets `initial_display_delay_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initial_display_delay_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_initial_display_delay_present_flag.set(segment, 0L, index, value); }
    /// Sets `initial_display_delay_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initial_display_delay_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_initial_display_delay_present_flag(segment, 0L, value); }
    /// Sets `initial_display_delay_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags initial_display_delay_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_initial_display_delay_present_flag(this.segment(), index, value); return this; }
    /// Sets `initial_display_delay_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags initial_display_delay_present_flag(@CType("uint32_t : 1") int value) { StdVideoAV1SequenceHeaderFlags.set_initial_display_delay_present_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 13") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 13") int get_reserved(MemorySegment segment) { return StdVideoAV1SequenceHeaderFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 13") int reservedAt(long index) { return StdVideoAV1SequenceHeaderFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 13") int reserved() { return StdVideoAV1SequenceHeaderFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 13") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 13") int value) { StdVideoAV1SequenceHeaderFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags reservedAt(long index, @CType("uint32_t : 13") int value) { StdVideoAV1SequenceHeaderFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1SequenceHeaderFlags reserved(@CType("uint32_t : 13") int value) { StdVideoAV1SequenceHeaderFlags.set_reserved(this.segment(), value); return this; }

}
