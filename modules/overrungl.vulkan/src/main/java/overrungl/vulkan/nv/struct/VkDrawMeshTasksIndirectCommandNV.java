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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### taskCount
/// [VarHandle][#VH_taskCount] - [Getter][#taskCount()] - [Setter][#taskCount(int)]
/// ### firstTask
/// [VarHandle][#VH_firstTask] - [Getter][#firstTask()] - [Setter][#firstTask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrawMeshTasksIndirectCommandNV {
///     uint32_t taskCount;
///     uint32_t firstTask;
/// } VkDrawMeshTasksIndirectCommandNV;
/// ```
public final class VkDrawMeshTasksIndirectCommandNV extends Struct {
    /// The struct layout of `VkDrawMeshTasksIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("taskCount"),
        ValueLayout.JAVA_INT.withName("firstTask")
    );
    /// The [VarHandle] of `taskCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_taskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskCount"));
    /// The [VarHandle] of `firstTask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstTask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstTask"));

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkDrawMeshTasksIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment); }

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawMeshTasksIndirectCommandNV`
    public static VkDrawMeshTasksIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkDrawMeshTasksIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawMeshTasksIndirectCommandNV`
    public static VkDrawMeshTasksIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkDrawMeshTasksIndirectCommandNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDrawMeshTasksIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrawMeshTasksIndirectCommandNV`
    public VkDrawMeshTasksIndirectCommandNV asSlice(long index) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDrawMeshTasksIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrawMeshTasksIndirectCommandNV`
    public VkDrawMeshTasksIndirectCommandNV asSlice(long index, long count) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `taskCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_taskCount(MemorySegment segment, long index) { return (int) VH_taskCount.get(segment, 0L, index); }
    /// {@return `taskCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_taskCount(MemorySegment segment) { return VkDrawMeshTasksIndirectCommandNV.get_taskCount(segment, 0L); }
    /// {@return `taskCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int taskCountAt(long index) { return VkDrawMeshTasksIndirectCommandNV.get_taskCount(this.segment(), index); }
    /// {@return `taskCount`}
    public @CType("uint32_t") int taskCount() { return VkDrawMeshTasksIndirectCommandNV.get_taskCount(this.segment()); }
    /// Sets `taskCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_taskCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_taskCount.set(segment, 0L, index, value); }
    /// Sets `taskCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_taskCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.set_taskCount(segment, 0L, value); }
    /// Sets `taskCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV taskCountAt(long index, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.set_taskCount(this.segment(), index, value); return this; }
    /// Sets `taskCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV taskCount(@CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.set_taskCount(this.segment(), value); return this; }

    /// {@return `firstTask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstTask(MemorySegment segment, long index) { return (int) VH_firstTask.get(segment, 0L, index); }
    /// {@return `firstTask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstTask(MemorySegment segment) { return VkDrawMeshTasksIndirectCommandNV.get_firstTask(segment, 0L); }
    /// {@return `firstTask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstTaskAt(long index) { return VkDrawMeshTasksIndirectCommandNV.get_firstTask(this.segment(), index); }
    /// {@return `firstTask`}
    public @CType("uint32_t") int firstTask() { return VkDrawMeshTasksIndirectCommandNV.get_firstTask(this.segment()); }
    /// Sets `firstTask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstTask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstTask.set(segment, 0L, index, value); }
    /// Sets `firstTask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstTask(MemorySegment segment, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.set_firstTask(segment, 0L, value); }
    /// Sets `firstTask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV firstTaskAt(long index, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.set_firstTask(this.segment(), index, value); return this; }
    /// Sets `firstTask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV firstTask(@CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.set_firstTask(this.segment(), value); return this; }

}
