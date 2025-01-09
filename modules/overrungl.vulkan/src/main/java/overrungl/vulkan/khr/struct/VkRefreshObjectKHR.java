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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### objectType
/// [VarHandle][#VH_objectType] - [Getter][#objectType()] - [Setter][#objectType(int)]
/// ### objectHandle
/// [VarHandle][#VH_objectHandle] - [Getter][#objectHandle()] - [Setter][#objectHandle(long)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRefreshObjectKHR {
///     VkObjectType objectType;
///     uint64_t objectHandle;
///     VkRefreshObjectFlagsKHR flags;
/// } VkRefreshObjectKHR;
/// ```
public final class VkRefreshObjectKHR extends Struct {
    /// The struct layout of `VkRefreshObjectKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkRefreshObjectKHR` with the given segment.
    /// @param segment the memory segment
    public VkRefreshObjectKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRefreshObjectKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshObjectKHR(segment); }

    /// Creates `VkRefreshObjectKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshObjectKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRefreshObjectKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshObjectKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRefreshObjectKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRefreshObjectKHR`
    public static VkRefreshObjectKHR alloc(SegmentAllocator allocator) { return new VkRefreshObjectKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRefreshObjectKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRefreshObjectKHR`
    public static VkRefreshObjectKHR alloc(SegmentAllocator allocator, long count) { return new VkRefreshObjectKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRefreshObjectKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRefreshObjectKHR`
    public VkRefreshObjectKHR asSlice(long index) { return new VkRefreshObjectKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRefreshObjectKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRefreshObjectKHR`
    public VkRefreshObjectKHR asSlice(long index, long count) { return new VkRefreshObjectKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkObjectType") int get_objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    /// @param segment the segment of the struct
    public static @CType("VkObjectType") int get_objectType(MemorySegment segment) { return VkRefreshObjectKHR.get_objectType(segment, 0L); }
    /// {@return `objectType` at the given index}
    /// @param index the index
    public @CType("VkObjectType") int objectTypeAt(long index) { return VkRefreshObjectKHR.get_objectType(this.segment(), index); }
    /// {@return `objectType`}
    public @CType("VkObjectType") int objectType() { return VkRefreshObjectKHR.get_objectType(this.segment()); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, long index, @CType("VkObjectType") int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, @CType("VkObjectType") int value) { VkRefreshObjectKHR.set_objectType(segment, 0L, value); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR objectTypeAt(long index, @CType("VkObjectType") int value) { VkRefreshObjectKHR.set_objectType(this.segment(), index, value); return this; }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR objectType(@CType("VkObjectType") int value) { VkRefreshObjectKHR.set_objectType(this.segment(), value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get(segment, 0L, index); }
    /// {@return `objectHandle`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_objectHandle(MemorySegment segment) { return VkRefreshObjectKHR.get_objectHandle(segment, 0L); }
    /// {@return `objectHandle` at the given index}
    /// @param index the index
    public @CType("uint64_t") long objectHandleAt(long index) { return VkRefreshObjectKHR.get_objectHandle(this.segment(), index); }
    /// {@return `objectHandle`}
    public @CType("uint64_t") long objectHandle() { return VkRefreshObjectKHR.get_objectHandle(this.segment()); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectHandle(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_objectHandle.set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectHandle(MemorySegment segment, @CType("uint64_t") long value) { VkRefreshObjectKHR.set_objectHandle(segment, 0L, value); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR objectHandleAt(long index, @CType("uint64_t") long value) { VkRefreshObjectKHR.set_objectHandle(this.segment(), index, value); return this; }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR objectHandle(@CType("uint64_t") long value) { VkRefreshObjectKHR.set_objectHandle(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRefreshObjectFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkRefreshObjectFlagsKHR") int get_flags(MemorySegment segment) { return VkRefreshObjectKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkRefreshObjectFlagsKHR") int flagsAt(long index) { return VkRefreshObjectKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkRefreshObjectFlagsKHR") int flags() { return VkRefreshObjectKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkRefreshObjectFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkRefreshObjectFlagsKHR") int value) { VkRefreshObjectKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR flagsAt(long index, @CType("VkRefreshObjectFlagsKHR") int value) { VkRefreshObjectKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR flags(@CType("VkRefreshObjectFlagsKHR") int value) { VkRefreshObjectKHR.set_flags(this.segment(), value); return this; }

}
