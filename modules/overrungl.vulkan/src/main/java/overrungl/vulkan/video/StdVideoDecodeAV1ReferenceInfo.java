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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### frame_type
/// [VarHandle][#VH_frame_type] - [Getter][#frame_type()] - [Setter][#frame_type(byte)]
/// ### RefFrameSignBias
/// [VarHandle][#VH_RefFrameSignBias] - [Getter][#RefFrameSignBias()] - [Setter][#RefFrameSignBias(byte)]
/// ### OrderHint
/// [VarHandle][#VH_OrderHint] - [Getter][#OrderHint()] - [Setter][#OrderHint(byte)]
/// ### SavedOrderHints
/// [VarHandle][#VH_SavedOrderHints] - [Getter][#SavedOrderHints()] - [Setter][#SavedOrderHints(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeAV1ReferenceInfo {
///     StdVideoDecodeAV1ReferenceInfoFlags flags;
///     uint8_t frame_type;
///     uint8_t RefFrameSignBias;
///     uint8_t OrderHint;
///     uint8_t [ ] SavedOrderHints;
/// } StdVideoDecodeAV1ReferenceInfo;
/// ```
public final class StdVideoDecodeAV1ReferenceInfo extends Struct {
    /// The struct layout of `StdVideoDecodeAV1ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("RefFrameSignBias"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        ValueLayout.JAVA_BYTE.withName("SavedOrderHints")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `RefFrameSignBias` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_RefFrameSignBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefFrameSignBias"));
    /// The [VarHandle] of `OrderHint` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_OrderHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHint"));
    /// The [VarHandle] of `SavedOrderHints` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_SavedOrderHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("SavedOrderHints"));

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeAV1ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfo(segment); }

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeAV1ReferenceInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoDecodeAV1ReferenceInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoDecodeAV1ReferenceInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoDecodeAV1ReferenceInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeAV1ReferenceInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo flagsAt(long index, @CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeAV1ReferenceInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo flags(@CType("StdVideoDecodeAV1ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeAV1ReferenceInfo.set_flags(this.segment(), value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_frame_type(MemorySegment segment, long index) { return (byte) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_frame_type(MemorySegment segment) { return StdVideoDecodeAV1ReferenceInfo.get_frame_type(segment, 0L); }
    /// {@return `frame_type` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte frame_typeAt(long index) { return StdVideoDecodeAV1ReferenceInfo.get_frame_type(this.segment(), index); }
    /// {@return `frame_type`}
    public @CType("uint8_t") byte frame_type() { return StdVideoDecodeAV1ReferenceInfo.get_frame_type(this.segment()); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_frame_type(segment, 0L, value); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo frame_typeAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_frame_type(this.segment(), index, value); return this; }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo frame_type(@CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_frame_type(this.segment(), value); return this; }

    /// {@return `RefFrameSignBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_RefFrameSignBias(MemorySegment segment, long index) { return (byte) VH_RefFrameSignBias.get(segment, 0L, index); }
    /// {@return `RefFrameSignBias`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_RefFrameSignBias(MemorySegment segment) { return StdVideoDecodeAV1ReferenceInfo.get_RefFrameSignBias(segment, 0L); }
    /// {@return `RefFrameSignBias` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte RefFrameSignBiasAt(long index) { return StdVideoDecodeAV1ReferenceInfo.get_RefFrameSignBias(this.segment(), index); }
    /// {@return `RefFrameSignBias`}
    public @CType("uint8_t") byte RefFrameSignBias() { return StdVideoDecodeAV1ReferenceInfo.get_RefFrameSignBias(this.segment()); }
    /// Sets `RefFrameSignBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefFrameSignBias(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_RefFrameSignBias.set(segment, 0L, index, value); }
    /// Sets `RefFrameSignBias` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefFrameSignBias(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_RefFrameSignBias(segment, 0L, value); }
    /// Sets `RefFrameSignBias` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo RefFrameSignBiasAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_RefFrameSignBias(this.segment(), index, value); return this; }
    /// Sets `RefFrameSignBias` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo RefFrameSignBias(@CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_RefFrameSignBias(this.segment(), value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_OrderHint(MemorySegment segment, long index) { return (byte) VH_OrderHint.get(segment, 0L, index); }
    /// {@return `OrderHint`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_OrderHint(MemorySegment segment) { return StdVideoDecodeAV1ReferenceInfo.get_OrderHint(segment, 0L); }
    /// {@return `OrderHint` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte OrderHintAt(long index) { return StdVideoDecodeAV1ReferenceInfo.get_OrderHint(this.segment(), index); }
    /// {@return `OrderHint`}
    public @CType("uint8_t") byte OrderHint() { return StdVideoDecodeAV1ReferenceInfo.get_OrderHint(this.segment()); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_OrderHint(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_OrderHint.set(segment, 0L, index, value); }
    /// Sets `OrderHint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_OrderHint(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_OrderHint(segment, 0L, value); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo OrderHintAt(long index, @CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_OrderHint(this.segment(), index, value); return this; }
    /// Sets `OrderHint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo OrderHint(@CType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.set_OrderHint(this.segment(), value); return this; }

    /// {@return `SavedOrderHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_SavedOrderHints(MemorySegment segment, long index) { return (byte) VH_SavedOrderHints.get(segment, 0L, index); }
    /// {@return `SavedOrderHints`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_SavedOrderHints(MemorySegment segment) { return StdVideoDecodeAV1ReferenceInfo.get_SavedOrderHints(segment, 0L); }
    /// {@return `SavedOrderHints` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte SavedOrderHintsAt(long index) { return StdVideoDecodeAV1ReferenceInfo.get_SavedOrderHints(this.segment(), index); }
    /// {@return `SavedOrderHints`}
    public @CType("uint8_t [ ]") byte SavedOrderHints() { return StdVideoDecodeAV1ReferenceInfo.get_SavedOrderHints(this.segment()); }
    /// Sets `SavedOrderHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_SavedOrderHints(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_SavedOrderHints.set(segment, 0L, index, value); }
    /// Sets `SavedOrderHints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_SavedOrderHints(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1ReferenceInfo.set_SavedOrderHints(segment, 0L, value); }
    /// Sets `SavedOrderHints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHintsAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1ReferenceInfo.set_SavedOrderHints(this.segment(), index, value); return this; }
    /// Sets `SavedOrderHints` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(@CType("uint8_t [ ]") byte value) { StdVideoDecodeAV1ReferenceInfo.set_SavedOrderHints(this.segment(), value); return this; }

}
