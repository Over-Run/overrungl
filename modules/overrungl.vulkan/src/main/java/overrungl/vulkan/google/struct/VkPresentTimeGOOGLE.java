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
/// ### presentID
/// [VarHandle][#VH_presentID] - [Getter][#presentID()] - [Setter][#presentID(int)]
/// ### desiredPresentTime
/// [VarHandle][#VH_desiredPresentTime] - [Getter][#desiredPresentTime()] - [Setter][#desiredPresentTime(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPresentTimeGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
/// } VkPresentTimeGOOGLE;
/// ```
public final class VkPresentTimeGOOGLE extends Struct {
    /// The struct layout of `VkPresentTimeGOOGLE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime")
    );
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `desiredPresentTime` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_desiredPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("desiredPresentTime"));

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    /// @param segment the memory segment
    public VkPresentTimeGOOGLE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimeGOOGLE of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment); }

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimeGOOGLE ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimeGOOGLE ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPresentTimeGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentTimeGOOGLE`
    public static VkPresentTimeGOOGLE alloc(SegmentAllocator allocator) { return new VkPresentTimeGOOGLE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentTimeGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentTimeGOOGLE`
    public static VkPresentTimeGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkPresentTimeGOOGLE(allocator.allocate(LAYOUT, count)); }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_presentID(MemorySegment segment, long index) { return (int) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_presentID(MemorySegment segment) { return VkPresentTimeGOOGLE.get_presentID(segment, 0L); }
    /// {@return `presentID` at the given index}
    /// @param index the index
    public @CType("uint32_t") int presentIDAt(long index) { return VkPresentTimeGOOGLE.get_presentID(this.segment(), index); }
    /// {@return `presentID`}
    public @CType("uint32_t") int presentID() { return VkPresentTimeGOOGLE.get_presentID(this.segment()); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, @CType("uint32_t") int value) { VkPresentTimeGOOGLE.set_presentID(segment, 0L, value); }
    /// Sets `presentID` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentTimeGOOGLE presentIDAt(long index, @CType("uint32_t") int value) { VkPresentTimeGOOGLE.set_presentID(this.segment(), index, value); return this; }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentTimeGOOGLE presentID(@CType("uint32_t") int value) { VkPresentTimeGOOGLE.set_presentID(this.segment(), value); return this; }

    /// {@return `desiredPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_desiredPresentTime(MemorySegment segment, long index) { return (long) VH_desiredPresentTime.get(segment, 0L, index); }
    /// {@return `desiredPresentTime`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_desiredPresentTime(MemorySegment segment) { return VkPresentTimeGOOGLE.get_desiredPresentTime(segment, 0L); }
    /// {@return `desiredPresentTime` at the given index}
    /// @param index the index
    public @CType("uint64_t") long desiredPresentTimeAt(long index) { return VkPresentTimeGOOGLE.get_desiredPresentTime(this.segment(), index); }
    /// {@return `desiredPresentTime`}
    public @CType("uint64_t") long desiredPresentTime() { return VkPresentTimeGOOGLE.get_desiredPresentTime(this.segment()); }
    /// Sets `desiredPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_desiredPresentTime(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_desiredPresentTime.set(segment, 0L, index, value); }
    /// Sets `desiredPresentTime` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_desiredPresentTime(MemorySegment segment, @CType("uint64_t") long value) { VkPresentTimeGOOGLE.set_desiredPresentTime(segment, 0L, value); }
    /// Sets `desiredPresentTime` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentTimeGOOGLE desiredPresentTimeAt(long index, @CType("uint64_t") long value) { VkPresentTimeGOOGLE.set_desiredPresentTime(this.segment(), index, value); return this; }
    /// Sets `desiredPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentTimeGOOGLE desiredPresentTime(@CType("uint64_t") long value) { VkPresentTimeGOOGLE.set_desiredPresentTime(this.segment(), value); return this; }

}
