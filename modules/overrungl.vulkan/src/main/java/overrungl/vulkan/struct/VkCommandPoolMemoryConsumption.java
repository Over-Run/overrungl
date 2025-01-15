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
/// ### commandPoolAllocated
/// [VarHandle][#VH_commandPoolAllocated] - [Getter][#commandPoolAllocated()] - [Setter][#commandPoolAllocated(long)]
/// ### commandPoolReservedSize
/// [VarHandle][#VH_commandPoolReservedSize] - [Getter][#commandPoolReservedSize()] - [Setter][#commandPoolReservedSize(long)]
/// ### commandBufferAllocated
/// [VarHandle][#VH_commandBufferAllocated] - [Getter][#commandBufferAllocated()] - [Setter][#commandBufferAllocated(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandPoolMemoryConsumption {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize commandPoolAllocated;
///     VkDeviceSize commandPoolReservedSize;
///     VkDeviceSize commandBufferAllocated;
/// } VkCommandPoolMemoryConsumption;
/// ```
public sealed class VkCommandPoolMemoryConsumption extends Struct {
    /// The struct layout of `VkCommandPoolMemoryConsumption`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("commandPoolAllocated"),
        ValueLayout.JAVA_LONG.withName("commandPoolReservedSize"),
        ValueLayout.JAVA_LONG.withName("commandBufferAllocated")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `commandPoolAllocated` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_commandPoolAllocated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolAllocated"));
    /// The [VarHandle] of `commandPoolReservedSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_commandPoolReservedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolReservedSize"));
    /// The [VarHandle] of `commandBufferAllocated` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_commandBufferAllocated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferAllocated"));

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    /// @param segment the memory segment
    public VkCommandPoolMemoryConsumption(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryConsumption of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandPoolMemoryConsumption(segment); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryConsumption ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandPoolMemoryConsumption(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCommandPoolMemoryConsumption` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandPoolMemoryConsumption`
    public static VkCommandPoolMemoryConsumption alloc(SegmentAllocator allocator) { return new VkCommandPoolMemoryConsumption(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandPoolMemoryConsumption` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandPoolMemoryConsumption`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandPoolMemoryConsumption` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandPoolMemoryConsumption`
    public static VkCommandPoolMemoryConsumption allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceSize") long commandPoolAllocated, @CType("VkDeviceSize") long commandPoolReservedSize, @CType("VkDeviceSize") long commandBufferAllocated) { return alloc(allocator).sType(sType).pNext(pNext).commandPoolAllocated(commandPoolAllocated).commandPoolReservedSize(commandPoolReservedSize).commandBufferAllocated(commandBufferAllocated); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandPoolMemoryConsumption copyFrom(VkCommandPoolMemoryConsumption src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandPoolMemoryConsumption.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandPoolMemoryConsumption.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandPoolMemoryConsumption.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption sType(@CType("VkStructureType") int value) { VkCommandPoolMemoryConsumption.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandPoolMemoryConsumption.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkCommandPoolMemoryConsumption.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkCommandPoolMemoryConsumption.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkCommandPoolMemoryConsumption.set_pNext(this.segment(), value); return this; }

    /// {@return `commandPoolAllocated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_commandPoolAllocated(MemorySegment segment, long index) { return (long) VH_commandPoolAllocated.get(segment, 0L, index); }
    /// {@return `commandPoolAllocated`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_commandPoolAllocated(MemorySegment segment) { return VkCommandPoolMemoryConsumption.get_commandPoolAllocated(segment, 0L); }
    /// {@return `commandPoolAllocated`}
    public @CType("VkDeviceSize") long commandPoolAllocated() { return VkCommandPoolMemoryConsumption.get_commandPoolAllocated(this.segment()); }
    /// Sets `commandPoolAllocated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolAllocated(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_commandPoolAllocated.set(segment, 0L, index, value); }
    /// Sets `commandPoolAllocated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolAllocated(MemorySegment segment, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandPoolAllocated(segment, 0L, value); }
    /// Sets `commandPoolAllocated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandPoolAllocated(@CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandPoolAllocated(this.segment(), value); return this; }

    /// {@return `commandPoolReservedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_commandPoolReservedSize(MemorySegment segment, long index) { return (long) VH_commandPoolReservedSize.get(segment, 0L, index); }
    /// {@return `commandPoolReservedSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_commandPoolReservedSize(MemorySegment segment) { return VkCommandPoolMemoryConsumption.get_commandPoolReservedSize(segment, 0L); }
    /// {@return `commandPoolReservedSize`}
    public @CType("VkDeviceSize") long commandPoolReservedSize() { return VkCommandPoolMemoryConsumption.get_commandPoolReservedSize(this.segment()); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolReservedSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_commandPoolReservedSize.set(segment, 0L, index, value); }
    /// Sets `commandPoolReservedSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolReservedSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandPoolReservedSize(segment, 0L, value); }
    /// Sets `commandPoolReservedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandPoolReservedSize(@CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandPoolReservedSize(this.segment(), value); return this; }

    /// {@return `commandBufferAllocated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_commandBufferAllocated(MemorySegment segment, long index) { return (long) VH_commandBufferAllocated.get(segment, 0L, index); }
    /// {@return `commandBufferAllocated`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_commandBufferAllocated(MemorySegment segment) { return VkCommandPoolMemoryConsumption.get_commandBufferAllocated(segment, 0L); }
    /// {@return `commandBufferAllocated`}
    public @CType("VkDeviceSize") long commandBufferAllocated() { return VkCommandPoolMemoryConsumption.get_commandBufferAllocated(this.segment()); }
    /// Sets `commandBufferAllocated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferAllocated(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_commandBufferAllocated.set(segment, 0L, index, value); }
    /// Sets `commandBufferAllocated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferAllocated(MemorySegment segment, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandBufferAllocated(segment, 0L, value); }
    /// Sets `commandBufferAllocated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandBufferAllocated(@CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandBufferAllocated(this.segment(), value); return this; }

    /// A buffer of [VkCommandPoolMemoryConsumption].
    public static final class Buffer extends VkCommandPoolMemoryConsumption {
        private final long elementCount;

        /// Creates `VkCommandPoolMemoryConsumption.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandPoolMemoryConsumption`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandPoolMemoryConsumption`
        public VkCommandPoolMemoryConsumption asSlice(long index) { return new VkCommandPoolMemoryConsumption(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandPoolMemoryConsumption`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandPoolMemoryConsumption`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandPoolMemoryConsumption.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandPoolMemoryConsumption.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandPoolMemoryConsumption.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkCommandPoolMemoryConsumption.set_pNext(this.segment(), index, value); return this; }

        /// {@return `commandPoolAllocated` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long commandPoolAllocatedAt(long index) { return VkCommandPoolMemoryConsumption.get_commandPoolAllocated(this.segment(), index); }
        /// Sets `commandPoolAllocated` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandPoolAllocatedAt(long index, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandPoolAllocated(this.segment(), index, value); return this; }

        /// {@return `commandPoolReservedSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long commandPoolReservedSizeAt(long index) { return VkCommandPoolMemoryConsumption.get_commandPoolReservedSize(this.segment(), index); }
        /// Sets `commandPoolReservedSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandPoolReservedSizeAt(long index, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandPoolReservedSize(this.segment(), index, value); return this; }

        /// {@return `commandBufferAllocated` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long commandBufferAllocatedAt(long index) { return VkCommandPoolMemoryConsumption.get_commandBufferAllocated(this.segment(), index); }
        /// Sets `commandBufferAllocated` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferAllocatedAt(long index, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryConsumption.set_commandBufferAllocated(this.segment(), index, value); return this; }

    }
}
