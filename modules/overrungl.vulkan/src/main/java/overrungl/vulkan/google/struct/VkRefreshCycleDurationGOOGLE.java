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
package overrungl.vulkan.google.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### refreshDuration
/// [VarHandle][#VH_refreshDuration] - [Getter][#refreshDuration()] - [Setter][#refreshDuration(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRefreshCycleDurationGOOGLE {
///     uint64_t refreshDuration;
/// } VkRefreshCycleDurationGOOGLE;
/// ```
public final class VkRefreshCycleDurationGOOGLE extends Struct {
    /// The struct layout of `VkRefreshCycleDurationGOOGLE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );
    /// The [VarHandle] of `refreshDuration` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_refreshDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshDuration"));

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    /// @param segment the memory segment
    public VkRefreshCycleDurationGOOGLE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshCycleDurationGOOGLE of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment); }

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshCycleDurationGOOGLE ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshCycleDurationGOOGLE ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRefreshCycleDurationGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRefreshCycleDurationGOOGLE`
    public static VkRefreshCycleDurationGOOGLE alloc(SegmentAllocator allocator) { return new VkRefreshCycleDurationGOOGLE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRefreshCycleDurationGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRefreshCycleDurationGOOGLE`
    public static VkRefreshCycleDurationGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkRefreshCycleDurationGOOGLE(allocator.allocate(LAYOUT, count)); }

    /// {@return `refreshDuration` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_refreshDuration(MemorySegment segment, long index) { return (long) VH_refreshDuration.get(segment, 0L, index); }
    /// {@return `refreshDuration`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_refreshDuration(MemorySegment segment) { return VkRefreshCycleDurationGOOGLE.get_refreshDuration(segment, 0L); }
    /// {@return `refreshDuration` at the given index}
    /// @param index the index
    public @CType("uint64_t") long refreshDurationAt(long index) { return VkRefreshCycleDurationGOOGLE.get_refreshDuration(this.segment(), index); }
    /// {@return `refreshDuration`}
    public @CType("uint64_t") long refreshDuration() { return VkRefreshCycleDurationGOOGLE.get_refreshDuration(this.segment()); }
    /// Sets `refreshDuration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refreshDuration(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_refreshDuration.set(segment, 0L, index, value); }
    /// Sets `refreshDuration` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refreshDuration(MemorySegment segment, @CType("uint64_t") long value) { VkRefreshCycleDurationGOOGLE.set_refreshDuration(segment, 0L, value); }
    /// Sets `refreshDuration` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshCycleDurationGOOGLE refreshDurationAt(long index, @CType("uint64_t") long value) { VkRefreshCycleDurationGOOGLE.set_refreshDuration(this.segment(), index, value); return this; }
    /// Sets `refreshDuration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshCycleDurationGOOGLE refreshDuration(@CType("uint64_t") long value) { VkRefreshCycleDurationGOOGLE.set_refreshDuration(this.segment(), value); return this; }

}
