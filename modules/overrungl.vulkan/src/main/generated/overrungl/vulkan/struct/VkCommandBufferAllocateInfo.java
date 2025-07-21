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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCommandBufferAllocateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkCommandPool commandPool;
///     (int) VkCommandBufferLevel level;
///     uint32_t commandBufferCount;
/// };
/// ```
public final class VkCommandBufferAllocateInfo extends GroupType {
    /// The struct layout of `VkCommandBufferAllocateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("commandPool"),
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_INT.withName("commandBufferCount")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `commandPool`.
    public static final long OFFSET_commandPool = LAYOUT.byteOffset(PathElement.groupElement("commandPool"));
    /// The memory layout of `commandPool`.
    public static final MemoryLayout LAYOUT_commandPool = LAYOUT.select(PathElement.groupElement("commandPool"));
    /// The [VarHandle] of `commandPool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPool"));
    /// The byte offset of `level`.
    public static final long OFFSET_level = LAYOUT.byteOffset(PathElement.groupElement("level"));
    /// The memory layout of `level`.
    public static final MemoryLayout LAYOUT_level = LAYOUT.select(PathElement.groupElement("level"));
    /// The [VarHandle] of `level` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_level = LAYOUT.arrayElementVarHandle(PathElement.groupElement("level"));
    /// The byte offset of `commandBufferCount`.
    public static final long OFFSET_commandBufferCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
    /// The memory layout of `commandBufferCount`.
    public static final MemoryLayout LAYOUT_commandBufferCount = LAYOUT.select(PathElement.groupElement("commandBufferCount"));
    /// The [VarHandle] of `commandBufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCommandBufferAllocateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferAllocateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferAllocateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferAllocateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferAllocateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferAllocateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param commandPool `commandPool`
    /// @param level `level`
    /// @param commandBufferCount `commandBufferCount`
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long commandPool, int level, int commandBufferCount) {
        return alloc(allocator).sType(sType).pNext(pNext).commandPool(commandPool).level(level).commandBufferCount(commandBufferCount);
    }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param commandPool `commandPool`
    /// @param level `level`
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long commandPool, int level) {
        return alloc(allocator).sType(sType).pNext(pNext).commandPool(commandPool).level(level);
    }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param commandPool `commandPool`
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long commandPool) {
        return alloc(allocator).sType(sType).pNext(pNext).commandPool(commandPool);
    }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferAllocateInfo copyFrom(VkCommandBufferAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCommandBufferAllocateInfo reinterpret(long count) { return new VkCommandBufferAllocateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `commandPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long commandPool(MemorySegment segment, long index) { return (long) VH_commandPool.get(segment, 0L, index); }
    /// {@return `commandPool`}
    public long commandPool() { return commandPool(this.segment(), 0L); }
    /// Sets `commandPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPool(MemorySegment segment, long index, long value) { VH_commandPool.set(segment, 0L, index, value); }
    /// Sets `commandPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo commandPool(long value) { commandPool(this.segment(), 0L, value); return this; }

    /// {@return `level` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int level(MemorySegment segment, long index) { return (int) VH_level.get(segment, 0L, index); }
    /// {@return `level`}
    public int level() { return level(this.segment(), 0L); }
    /// Sets `level` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void level(MemorySegment segment, long index, int value) { VH_level.set(segment, 0L, index, value); }
    /// Sets `level` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo level(int value) { level(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferCount(MemorySegment segment, long index) { return (int) VH_commandBufferCount.get(segment, 0L, index); }
    /// {@return `commandBufferCount`}
    public int commandBufferCount() { return commandBufferCount(this.segment(), 0L); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferCount(MemorySegment segment, long index, int value) { VH_commandBufferCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo commandBufferCount(int value) { commandBufferCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCommandBufferAllocateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCommandBufferAllocateInfo`
    public VkCommandBufferAllocateInfo asSlice(long index) { return new VkCommandBufferAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCommandBufferAllocateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCommandBufferAllocateInfo`
    public VkCommandBufferAllocateInfo asSlice(long index, long count) { return new VkCommandBufferAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCommandBufferAllocateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCommandBufferAllocateInfo at(long index, Consumer<VkCommandBufferAllocateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `commandPool` at the given index}
    /// @param index the index of the struct buffer
    public long commandPoolAt(long index) { return commandPool(this.segment(), index); }
    /// Sets `commandPool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo commandPoolAt(long index, long value) { commandPool(this.segment(), index, value); return this; }

    /// {@return `level` at the given index}
    /// @param index the index of the struct buffer
    public int levelAt(long index) { return level(this.segment(), index); }
    /// Sets `level` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo levelAt(long index, int value) { level(this.segment(), index, value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param index the index of the struct buffer
    public int commandBufferCountAt(long index) { return commandBufferCount(this.segment(), index); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo commandBufferCountAt(long index, int value) { commandBufferCount(this.segment(), index, value); return this; }

}
