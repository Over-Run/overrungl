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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### commandPool
/// [VarHandle][#VH_commandPool] - [Getter][#commandPool()] - [Setter][#commandPool(java.lang.foreign.MemorySegment)]
/// ### level
/// [VarHandle][#VH_level] - [Getter][#level()] - [Setter][#level(int)]
/// ### commandBufferCount
/// [VarHandle][#VH_commandBufferCount] - [Getter][#commandBufferCount()] - [Setter][#commandBufferCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferAllocateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkCommandPool commandPool;
///     VkCommandBufferLevel level;
///     uint32_t commandBufferCount;
/// } VkCommandBufferAllocateInfo;
/// ```
public sealed class VkCommandBufferAllocateInfo extends Struct {
    /// The struct layout of `VkCommandBufferAllocateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandPool"),
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_INT.withName("commandBufferCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `commandPool` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_commandPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPool"));
    /// The [VarHandle] of `level` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_level = LAYOUT.arrayElementVarHandle(PathElement.groupElement("level"));
    /// The [VarHandle] of `commandBufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferAllocateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferAllocateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandBufferAllocateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferAllocateInfo`
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkCommandPool") java.lang.foreign.MemorySegment commandPool, @CType("VkCommandBufferLevel") int level, @CType("uint32_t") int commandBufferCount) { return alloc(allocator).sType(sType).pNext(pNext).commandPool(commandPool).level(level).commandBufferCount(commandBufferCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferAllocateInfo copyFrom(VkCommandBufferAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferAllocateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferAllocateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferAllocateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo sType(@CType("VkStructureType") int value) { VkCommandBufferAllocateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferAllocateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCommandBufferAllocateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferAllocateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferAllocateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `commandPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCommandPool") java.lang.foreign.MemorySegment get_commandPool(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_commandPool.get(segment, 0L, index); }
    /// {@return `commandPool`}
    /// @param segment the segment of the struct
    public static @CType("VkCommandPool") java.lang.foreign.MemorySegment get_commandPool(MemorySegment segment) { return VkCommandBufferAllocateInfo.get_commandPool(segment, 0L); }
    /// {@return `commandPool`}
    public @CType("VkCommandPool") java.lang.foreign.MemorySegment commandPool() { return VkCommandBufferAllocateInfo.get_commandPool(this.segment()); }
    /// Sets `commandPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPool(MemorySegment segment, long index, @CType("VkCommandPool") java.lang.foreign.MemorySegment value) { VH_commandPool.set(segment, 0L, index, value); }
    /// Sets `commandPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPool(MemorySegment segment, @CType("VkCommandPool") java.lang.foreign.MemorySegment value) { VkCommandBufferAllocateInfo.set_commandPool(segment, 0L, value); }
    /// Sets `commandPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo commandPool(@CType("VkCommandPool") java.lang.foreign.MemorySegment value) { VkCommandBufferAllocateInfo.set_commandPool(this.segment(), value); return this; }

    /// {@return `level` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCommandBufferLevel") int get_level(MemorySegment segment, long index) { return (int) VH_level.get(segment, 0L, index); }
    /// {@return `level`}
    /// @param segment the segment of the struct
    public static @CType("VkCommandBufferLevel") int get_level(MemorySegment segment) { return VkCommandBufferAllocateInfo.get_level(segment, 0L); }
    /// {@return `level`}
    public @CType("VkCommandBufferLevel") int level() { return VkCommandBufferAllocateInfo.get_level(this.segment()); }
    /// Sets `level` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_level(MemorySegment segment, long index, @CType("VkCommandBufferLevel") int value) { VH_level.set(segment, 0L, index, value); }
    /// Sets `level` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_level(MemorySegment segment, @CType("VkCommandBufferLevel") int value) { VkCommandBufferAllocateInfo.set_level(segment, 0L, value); }
    /// Sets `level` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo level(@CType("VkCommandBufferLevel") int value) { VkCommandBufferAllocateInfo.set_level(this.segment(), value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandBufferCount(MemorySegment segment, long index) { return (int) VH_commandBufferCount.get(segment, 0L, index); }
    /// {@return `commandBufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandBufferCount(MemorySegment segment) { return VkCommandBufferAllocateInfo.get_commandBufferCount(segment, 0L); }
    /// {@return `commandBufferCount`}
    public @CType("uint32_t") int commandBufferCount() { return VkCommandBufferAllocateInfo.get_commandBufferCount(this.segment()); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandBufferCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkCommandBufferAllocateInfo.set_commandBufferCount(segment, 0L, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferAllocateInfo commandBufferCount(@CType("uint32_t") int value) { VkCommandBufferAllocateInfo.set_commandBufferCount(this.segment(), value); return this; }

    /// A buffer of [VkCommandBufferAllocateInfo].
    public static final class Buffer extends VkCommandBufferAllocateInfo {
        private final long elementCount;

        /// Creates `VkCommandBufferAllocateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandBufferAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandBufferAllocateInfo`
        public VkCommandBufferAllocateInfo asSlice(long index) { return new VkCommandBufferAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandBufferAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandBufferAllocateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferAllocateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferAllocateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandBufferAllocateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferAllocateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `commandPool` at the given index}
        /// @param index the index
        public @CType("VkCommandPool") java.lang.foreign.MemorySegment commandPoolAt(long index) { return VkCommandBufferAllocateInfo.get_commandPool(this.segment(), index); }
        /// Sets `commandPool` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandPoolAt(long index, @CType("VkCommandPool") java.lang.foreign.MemorySegment value) { VkCommandBufferAllocateInfo.set_commandPool(this.segment(), index, value); return this; }

        /// {@return `level` at the given index}
        /// @param index the index
        public @CType("VkCommandBufferLevel") int levelAt(long index) { return VkCommandBufferAllocateInfo.get_level(this.segment(), index); }
        /// Sets `level` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer levelAt(long index, @CType("VkCommandBufferLevel") int value) { VkCommandBufferAllocateInfo.set_level(this.segment(), index, value); return this; }

        /// {@return `commandBufferCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int commandBufferCountAt(long index) { return VkCommandBufferAllocateInfo.get_commandBufferCount(this.segment(), index); }
        /// Sets `commandBufferCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferCountAt(long index, @CType("uint32_t") int value) { VkCommandBufferAllocateInfo.set_commandBufferCount(this.segment(), index, value); return this; }

    }
}
