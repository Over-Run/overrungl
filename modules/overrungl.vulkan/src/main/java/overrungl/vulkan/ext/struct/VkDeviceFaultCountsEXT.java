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
package overrungl.vulkan.ext.struct;

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
/// ### addressInfoCount
/// [VarHandle][#VH_addressInfoCount] - [Getter][#addressInfoCount()] - [Setter][#addressInfoCount(int)]
/// ### vendorInfoCount
/// [VarHandle][#VH_vendorInfoCount] - [Getter][#vendorInfoCount()] - [Setter][#vendorInfoCount(int)]
/// ### vendorBinarySize
/// [VarHandle][#VH_vendorBinarySize] - [Getter][#vendorBinarySize()] - [Setter][#vendorBinarySize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceFaultCountsEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t addressInfoCount;
///     uint32_t vendorInfoCount;
///     VkDeviceSize vendorBinarySize;
/// } VkDeviceFaultCountsEXT;
/// ```
public sealed class VkDeviceFaultCountsEXT extends Struct {
    /// The struct layout of `VkDeviceFaultCountsEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("addressInfoCount"),
        ValueLayout.JAVA_INT.withName("vendorInfoCount"),
        ValueLayout.JAVA_LONG.withName("vendorBinarySize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `addressInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_addressInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressInfoCount"));
    /// The [VarHandle] of `vendorInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorInfoCount"));
    /// The [VarHandle] of `vendorBinarySize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_vendorBinarySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorBinarySize"));

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultCountsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultCountsEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultCountsEXT(segment); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultCountsEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultCountsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceFaultCountsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultCountsEXT`
    public static VkDeviceFaultCountsEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultCountsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultCountsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultCountsEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceFaultCountsEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultCountsEXT`
    public static VkDeviceFaultCountsEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int addressInfoCount, @CType("uint32_t") int vendorInfoCount, @CType("VkDeviceSize") long vendorBinarySize) { return alloc(allocator).sType(sType).pNext(pNext).addressInfoCount(addressInfoCount).vendorInfoCount(vendorInfoCount).vendorBinarySize(vendorBinarySize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultCountsEXT copyFrom(VkDeviceFaultCountsEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceFaultCountsEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceFaultCountsEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceFaultCountsEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT sType(@CType("VkStructureType") int value) { VkDeviceFaultCountsEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceFaultCountsEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkDeviceFaultCountsEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkDeviceFaultCountsEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT pNext(@CType("void *") MemorySegment value) { VkDeviceFaultCountsEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `addressInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_addressInfoCount(MemorySegment segment, long index) { return (int) VH_addressInfoCount.get(segment, 0L, index); }
    /// {@return `addressInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_addressInfoCount(MemorySegment segment) { return VkDeviceFaultCountsEXT.get_addressInfoCount(segment, 0L); }
    /// {@return `addressInfoCount`}
    public @CType("uint32_t") int addressInfoCount() { return VkDeviceFaultCountsEXT.get_addressInfoCount(this.segment()); }
    /// Sets `addressInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_addressInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_addressInfoCount.set(segment, 0L, index, value); }
    /// Sets `addressInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_addressInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultCountsEXT.set_addressInfoCount(segment, 0L, value); }
    /// Sets `addressInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT addressInfoCount(@CType("uint32_t") int value) { VkDeviceFaultCountsEXT.set_addressInfoCount(this.segment(), value); return this; }

    /// {@return `vendorInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorInfoCount(MemorySegment segment, long index) { return (int) VH_vendorInfoCount.get(segment, 0L, index); }
    /// {@return `vendorInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorInfoCount(MemorySegment segment) { return VkDeviceFaultCountsEXT.get_vendorInfoCount(segment, 0L); }
    /// {@return `vendorInfoCount`}
    public @CType("uint32_t") int vendorInfoCount() { return VkDeviceFaultCountsEXT.get_vendorInfoCount(this.segment()); }
    /// Sets `vendorInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vendorInfoCount.set(segment, 0L, index, value); }
    /// Sets `vendorInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultCountsEXT.set_vendorInfoCount(segment, 0L, value); }
    /// Sets `vendorInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT vendorInfoCount(@CType("uint32_t") int value) { VkDeviceFaultCountsEXT.set_vendorInfoCount(this.segment(), value); return this; }

    /// {@return `vendorBinarySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_vendorBinarySize(MemorySegment segment, long index) { return (long) VH_vendorBinarySize.get(segment, 0L, index); }
    /// {@return `vendorBinarySize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_vendorBinarySize(MemorySegment segment) { return VkDeviceFaultCountsEXT.get_vendorBinarySize(segment, 0L); }
    /// {@return `vendorBinarySize`}
    public @CType("VkDeviceSize") long vendorBinarySize() { return VkDeviceFaultCountsEXT.get_vendorBinarySize(this.segment()); }
    /// Sets `vendorBinarySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorBinarySize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_vendorBinarySize.set(segment, 0L, index, value); }
    /// Sets `vendorBinarySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorBinarySize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDeviceFaultCountsEXT.set_vendorBinarySize(segment, 0L, value); }
    /// Sets `vendorBinarySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT vendorBinarySize(@CType("VkDeviceSize") long value) { VkDeviceFaultCountsEXT.set_vendorBinarySize(this.segment(), value); return this; }

    /// A buffer of [VkDeviceFaultCountsEXT].
    public static final class Buffer extends VkDeviceFaultCountsEXT {
        private final long elementCount;

        /// Creates `VkDeviceFaultCountsEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceFaultCountsEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceFaultCountsEXT`
        public VkDeviceFaultCountsEXT asSlice(long index) { return new VkDeviceFaultCountsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceFaultCountsEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceFaultCountsEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceFaultCountsEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceFaultCountsEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkDeviceFaultCountsEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkDeviceFaultCountsEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `addressInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int addressInfoCountAt(long index) { return VkDeviceFaultCountsEXT.get_addressInfoCount(this.segment(), index); }
        /// Sets `addressInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressInfoCountAt(long index, @CType("uint32_t") int value) { VkDeviceFaultCountsEXT.set_addressInfoCount(this.segment(), index, value); return this; }

        /// {@return `vendorInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vendorInfoCountAt(long index) { return VkDeviceFaultCountsEXT.get_vendorInfoCount(this.segment(), index); }
        /// Sets `vendorInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorInfoCountAt(long index, @CType("uint32_t") int value) { VkDeviceFaultCountsEXT.set_vendorInfoCount(this.segment(), index, value); return this; }

        /// {@return `vendorBinarySize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long vendorBinarySizeAt(long index) { return VkDeviceFaultCountsEXT.get_vendorBinarySize(this.segment(), index); }
        /// Sets `vendorBinarySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorBinarySizeAt(long index, @CType("VkDeviceSize") long value) { VkDeviceFaultCountsEXT.set_vendorBinarySize(this.segment(), index, value); return this; }

    }
}
