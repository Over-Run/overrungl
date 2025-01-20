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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### globalPriority
/// [VarHandle][#VH_globalPriority] - [Getter][#globalPriority()] - [Setter][#globalPriority(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceQueueGlobalPriorityCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkQueueGlobalPriority globalPriority;
/// } VkDeviceQueueGlobalPriorityCreateInfo;
/// ```
public sealed class VkDeviceQueueGlobalPriorityCreateInfo extends Struct {
    /// The struct layout of `VkDeviceQueueGlobalPriorityCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriority")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `globalPriority` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_globalPriority = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalPriority"));

    /// Creates `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceQueueGlobalPriorityCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueGlobalPriorityCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueGlobalPriorityCreateInfo(segment); }

    /// Creates `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueGlobalPriorityCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueGlobalPriorityCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueGlobalPriorityCreateInfo`
    public static VkDeviceQueueGlobalPriorityCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceQueueGlobalPriorityCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceQueueGlobalPriorityCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceQueueGlobalPriorityCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueGlobalPriorityCreateInfo`
    public static VkDeviceQueueGlobalPriorityCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkQueueGlobalPriority") int globalPriority) { return alloc(allocator).sType(sType).pNext(pNext).globalPriority(globalPriority); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceQueueGlobalPriorityCreateInfo copyFrom(VkDeviceQueueGlobalPriorityCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceQueueGlobalPriorityCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceQueueGlobalPriorityCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueGlobalPriorityCreateInfo sType(@CType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceQueueGlobalPriorityCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDeviceQueueGlobalPriorityCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceQueueGlobalPriorityCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueGlobalPriorityCreateInfo pNext(@CType("const void *") MemorySegment value) { VkDeviceQueueGlobalPriorityCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `globalPriority` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueueGlobalPriority") int get_globalPriority(MemorySegment segment, long index) { return (int) VH_globalPriority.get(segment, 0L, index); }
    /// {@return `globalPriority`}
    /// @param segment the segment of the struct
    public static @CType("VkQueueGlobalPriority") int get_globalPriority(MemorySegment segment) { return VkDeviceQueueGlobalPriorityCreateInfo.get_globalPriority(segment, 0L); }
    /// {@return `globalPriority`}
    public @CType("VkQueueGlobalPriority") int globalPriority() { return VkDeviceQueueGlobalPriorityCreateInfo.get_globalPriority(this.segment()); }
    /// Sets `globalPriority` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_globalPriority(MemorySegment segment, long index, @CType("VkQueueGlobalPriority") int value) { VH_globalPriority.set(segment, 0L, index, value); }
    /// Sets `globalPriority` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_globalPriority(MemorySegment segment, @CType("VkQueueGlobalPriority") int value) { VkDeviceQueueGlobalPriorityCreateInfo.set_globalPriority(segment, 0L, value); }
    /// Sets `globalPriority` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueGlobalPriorityCreateInfo globalPriority(@CType("VkQueueGlobalPriority") int value) { VkDeviceQueueGlobalPriorityCreateInfo.set_globalPriority(this.segment(), value); return this; }

    /// A buffer of [VkDeviceQueueGlobalPriorityCreateInfo].
    public static final class Buffer extends VkDeviceQueueGlobalPriorityCreateInfo {
        private final long elementCount;

        /// Creates `VkDeviceQueueGlobalPriorityCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceQueueGlobalPriorityCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceQueueGlobalPriorityCreateInfo`
        public VkDeviceQueueGlobalPriorityCreateInfo asSlice(long index) { return new VkDeviceQueueGlobalPriorityCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceQueueGlobalPriorityCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceQueueGlobalPriorityCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceQueueGlobalPriorityCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDeviceQueueGlobalPriorityCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDeviceQueueGlobalPriorityCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `globalPriority` at the given index}
        /// @param index the index
        public @CType("VkQueueGlobalPriority") int globalPriorityAt(long index) { return VkDeviceQueueGlobalPriorityCreateInfo.get_globalPriority(this.segment(), index); }
        /// Sets `globalPriority` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer globalPriorityAt(long index, @CType("VkQueueGlobalPriority") int value) { VkDeviceQueueGlobalPriorityCreateInfo.set_globalPriority(this.segment(), index, value); return this; }

    }
}
