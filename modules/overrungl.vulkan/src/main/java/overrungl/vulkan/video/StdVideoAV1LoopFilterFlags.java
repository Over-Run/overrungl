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
/// ### loop_filter_delta_enabled
/// [VarHandle][#VH_loop_filter_delta_enabled] - [Getter][#loop_filter_delta_enabled()] - [Setter][#loop_filter_delta_enabled(int)]
/// ### loop_filter_delta_update
/// [VarHandle][#VH_loop_filter_delta_update] - [Getter][#loop_filter_delta_update()] - [Setter][#loop_filter_delta_update(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1LoopFilterFlags {
///     uint32_t : 1 loop_filter_delta_enabled;
///     uint32_t : 1 loop_filter_delta_update;
///     uint32_t : 30 reserved;
/// } StdVideoAV1LoopFilterFlags;
/// ```
public final class StdVideoAV1LoopFilterFlags extends Struct {
    /// The struct layout of `StdVideoAV1LoopFilterFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("loop_filter_delta_enabled"),
        ValueLayout.JAVA_INT.withName("loop_filter_delta_update"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `loop_filter_delta_enabled` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_loop_filter_delta_enabled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_delta_enabled"));
    /// The [VarHandle] of `loop_filter_delta_update` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_loop_filter_delta_update = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_delta_update"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1LoopFilterFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilterFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopFilterFlags(segment); }

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilterFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopFilterFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1LoopFilterFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilterFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopFilterFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1LoopFilterFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopFilterFlags`
    public static StdVideoAV1LoopFilterFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopFilterFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1LoopFilterFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1LoopFilterFlags`
    public static StdVideoAV1LoopFilterFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1LoopFilterFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoAV1LoopFilterFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1LoopFilterFlags`
    public StdVideoAV1LoopFilterFlags asSlice(long index) { return new StdVideoAV1LoopFilterFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoAV1LoopFilterFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1LoopFilterFlags`
    public StdVideoAV1LoopFilterFlags asSlice(long index, long count) { return new StdVideoAV1LoopFilterFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `loop_filter_delta_enabled` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_loop_filter_delta_enabled(MemorySegment segment, long index) { return (int) VH_loop_filter_delta_enabled.get(segment, 0L, index); }
    /// {@return `loop_filter_delta_enabled`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_loop_filter_delta_enabled(MemorySegment segment) { return StdVideoAV1LoopFilterFlags.get_loop_filter_delta_enabled(segment, 0L); }
    /// {@return `loop_filter_delta_enabled` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int loop_filter_delta_enabledAt(long index) { return StdVideoAV1LoopFilterFlags.get_loop_filter_delta_enabled(this.segment(), index); }
    /// {@return `loop_filter_delta_enabled`}
    public @CType("uint32_t : 1") int loop_filter_delta_enabled() { return StdVideoAV1LoopFilterFlags.get_loop_filter_delta_enabled(this.segment()); }
    /// Sets `loop_filter_delta_enabled` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_delta_enabled(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_loop_filter_delta_enabled.set(segment, 0L, index, value); }
    /// Sets `loop_filter_delta_enabled` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_delta_enabled(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1LoopFilterFlags.set_loop_filter_delta_enabled(segment, 0L, value); }
    /// Sets `loop_filter_delta_enabled` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilterFlags loop_filter_delta_enabledAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1LoopFilterFlags.set_loop_filter_delta_enabled(this.segment(), index, value); return this; }
    /// Sets `loop_filter_delta_enabled` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilterFlags loop_filter_delta_enabled(@CType("uint32_t : 1") int value) { StdVideoAV1LoopFilterFlags.set_loop_filter_delta_enabled(this.segment(), value); return this; }

    /// {@return `loop_filter_delta_update` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_loop_filter_delta_update(MemorySegment segment, long index) { return (int) VH_loop_filter_delta_update.get(segment, 0L, index); }
    /// {@return `loop_filter_delta_update`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_loop_filter_delta_update(MemorySegment segment) { return StdVideoAV1LoopFilterFlags.get_loop_filter_delta_update(segment, 0L); }
    /// {@return `loop_filter_delta_update` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int loop_filter_delta_updateAt(long index) { return StdVideoAV1LoopFilterFlags.get_loop_filter_delta_update(this.segment(), index); }
    /// {@return `loop_filter_delta_update`}
    public @CType("uint32_t : 1") int loop_filter_delta_update() { return StdVideoAV1LoopFilterFlags.get_loop_filter_delta_update(this.segment()); }
    /// Sets `loop_filter_delta_update` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_delta_update(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_loop_filter_delta_update.set(segment, 0L, index, value); }
    /// Sets `loop_filter_delta_update` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_delta_update(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1LoopFilterFlags.set_loop_filter_delta_update(segment, 0L, value); }
    /// Sets `loop_filter_delta_update` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilterFlags loop_filter_delta_updateAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1LoopFilterFlags.set_loop_filter_delta_update(this.segment(), index, value); return this; }
    /// Sets `loop_filter_delta_update` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilterFlags loop_filter_delta_update(@CType("uint32_t : 1") int value) { StdVideoAV1LoopFilterFlags.set_loop_filter_delta_update(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment) { return StdVideoAV1LoopFilterFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 30") int reservedAt(long index) { return StdVideoAV1LoopFilterFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 30") int reserved() { return StdVideoAV1LoopFilterFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 30") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 30") int value) { StdVideoAV1LoopFilterFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilterFlags reservedAt(long index, @CType("uint32_t : 30") int value) { StdVideoAV1LoopFilterFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilterFlags reserved(@CType("uint32_t : 30") int value) { StdVideoAV1LoopFilterFlags.set_reserved(this.segment(), value); return this; }

}
