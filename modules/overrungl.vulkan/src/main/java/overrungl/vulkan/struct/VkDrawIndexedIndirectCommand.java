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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### indexCount
/// [VarHandle][#VH_indexCount] - [Getter][#indexCount()] - [Setter][#indexCount(int)]
/// ### instanceCount
/// [VarHandle][#VH_instanceCount] - [Getter][#instanceCount()] - [Setter][#instanceCount(int)]
/// ### firstIndex
/// [VarHandle][#VH_firstIndex] - [Getter][#firstIndex()] - [Setter][#firstIndex(int)]
/// ### vertexOffset
/// [VarHandle][#VH_vertexOffset] - [Getter][#vertexOffset()] - [Setter][#vertexOffset(int)]
/// ### firstInstance
/// [VarHandle][#VH_firstInstance] - [Getter][#firstInstance()] - [Setter][#firstInstance(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrawIndexedIndirectCommand {
///     uint32_t indexCount;
///     uint32_t instanceCount;
///     uint32_t firstIndex;
///     int32_t vertexOffset;
///     uint32_t firstInstance;
/// } VkDrawIndexedIndirectCommand;
/// ```
public final class VkDrawIndexedIndirectCommand extends Struct {
    /// The struct layout of `VkDrawIndexedIndirectCommand`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    /// The [VarHandle] of `indexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `firstIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstIndex"));
    /// The [VarHandle] of `vertexOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));
    /// The [VarHandle] of `firstInstance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstInstance"));

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    /// @param segment the memory segment
    public VkDrawIndexedIndirectCommand(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndexedIndirectCommand of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment); }

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndexedIndirectCommand ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrawIndexedIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndexedIndirectCommand ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDrawIndexedIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndexedIndirectCommand`
    public static VkDrawIndexedIndirectCommand alloc(SegmentAllocator allocator) { return new VkDrawIndexedIndirectCommand(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawIndexedIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawIndexedIndirectCommand`
    public static VkDrawIndexedIndirectCommand alloc(SegmentAllocator allocator, long count) { return new VkDrawIndexedIndirectCommand(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDrawIndexedIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrawIndexedIndirectCommand`
    public VkDrawIndexedIndirectCommand asSlice(long index) { return new VkDrawIndexedIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDrawIndexedIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrawIndexedIndirectCommand`
    public VkDrawIndexedIndirectCommand asSlice(long index, long count) { return new VkDrawIndexedIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `indexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_indexCount(MemorySegment segment, long index) { return (int) VH_indexCount.get(segment, 0L, index); }
    /// {@return `indexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_indexCount(MemorySegment segment) { return VkDrawIndexedIndirectCommand.get_indexCount(segment, 0L); }
    /// {@return `indexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int indexCountAt(long index) { return VkDrawIndexedIndirectCommand.get_indexCount(this.segment(), index); }
    /// {@return `indexCount`}
    public @CType("uint32_t") int indexCount() { return VkDrawIndexedIndirectCommand.get_indexCount(this.segment()); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_indexCount.set(segment, 0L, index, value); }
    /// Sets `indexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_indexCount(segment, 0L, value); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand indexCountAt(long index, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_indexCount(this.segment(), index, value); return this; }
    /// Sets `indexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand indexCount(@CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_indexCount(this.segment(), value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceCount(MemorySegment segment) { return VkDrawIndexedIndirectCommand.get_instanceCount(segment, 0L); }
    /// {@return `instanceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int instanceCountAt(long index) { return VkDrawIndexedIndirectCommand.get_instanceCount(this.segment(), index); }
    /// {@return `instanceCount`}
    public @CType("uint32_t") int instanceCount() { return VkDrawIndexedIndirectCommand.get_instanceCount(this.segment()); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_instanceCount(segment, 0L, value); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand instanceCountAt(long index, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_instanceCount(this.segment(), index, value); return this; }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand instanceCount(@CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_instanceCount(this.segment(), value); return this; }

    /// {@return `firstIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstIndex(MemorySegment segment, long index) { return (int) VH_firstIndex.get(segment, 0L, index); }
    /// {@return `firstIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstIndex(MemorySegment segment) { return VkDrawIndexedIndirectCommand.get_firstIndex(segment, 0L); }
    /// {@return `firstIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstIndexAt(long index) { return VkDrawIndexedIndirectCommand.get_firstIndex(this.segment(), index); }
    /// {@return `firstIndex`}
    public @CType("uint32_t") int firstIndex() { return VkDrawIndexedIndirectCommand.get_firstIndex(this.segment()); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstIndex.set(segment, 0L, index, value); }
    /// Sets `firstIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_firstIndex(segment, 0L, value); }
    /// Sets `firstIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand firstIndexAt(long index, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_firstIndex(this.segment(), index, value); return this; }
    /// Sets `firstIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand firstIndex(@CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_firstIndex(this.segment(), value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_vertexOffset(MemorySegment segment, long index) { return (int) VH_vertexOffset.get(segment, 0L, index); }
    /// {@return `vertexOffset`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_vertexOffset(MemorySegment segment) { return VkDrawIndexedIndirectCommand.get_vertexOffset(segment, 0L); }
    /// {@return `vertexOffset` at the given index}
    /// @param index the index
    public @CType("int32_t") int vertexOffsetAt(long index) { return VkDrawIndexedIndirectCommand.get_vertexOffset(this.segment(), index); }
    /// {@return `vertexOffset`}
    public @CType("int32_t") int vertexOffset() { return VkDrawIndexedIndirectCommand.get_vertexOffset(this.segment()); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexOffset(MemorySegment segment, long index, @CType("int32_t") int value) { VH_vertexOffset.set(segment, 0L, index, value); }
    /// Sets `vertexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexOffset(MemorySegment segment, @CType("int32_t") int value) { VkDrawIndexedIndirectCommand.set_vertexOffset(segment, 0L, value); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand vertexOffsetAt(long index, @CType("int32_t") int value) { VkDrawIndexedIndirectCommand.set_vertexOffset(this.segment(), index, value); return this; }
    /// Sets `vertexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand vertexOffset(@CType("int32_t") int value) { VkDrawIndexedIndirectCommand.set_vertexOffset(this.segment(), value); return this; }

    /// {@return `firstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstInstance(MemorySegment segment, long index) { return (int) VH_firstInstance.get(segment, 0L, index); }
    /// {@return `firstInstance`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstInstance(MemorySegment segment) { return VkDrawIndexedIndirectCommand.get_firstInstance(segment, 0L); }
    /// {@return `firstInstance` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstInstanceAt(long index) { return VkDrawIndexedIndirectCommand.get_firstInstance(this.segment(), index); }
    /// {@return `firstInstance`}
    public @CType("uint32_t") int firstInstance() { return VkDrawIndexedIndirectCommand.get_firstInstance(this.segment()); }
    /// Sets `firstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstInstance(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstInstance.set(segment, 0L, index, value); }
    /// Sets `firstInstance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstInstance(MemorySegment segment, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_firstInstance(segment, 0L, value); }
    /// Sets `firstInstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand firstInstanceAt(long index, @CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_firstInstance(this.segment(), index, value); return this; }
    /// Sets `firstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndexedIndirectCommand firstInstance(@CType("uint32_t") int value) { VkDrawIndexedIndirectCommand.set_firstInstance(this.segment(), value); return this; }

}
