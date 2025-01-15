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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### address
/// [VarHandle][#VH_address] - [Getter][#address()] - [Setter][#address(long)]
/// ### range
/// [VarHandle][#VH_range] - [Getter][#range()] - [Setter][#range(long)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorAddressInfoEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceAddress address;
///     VkDeviceSize range;
///     VkFormat format;
/// } VkDescriptorAddressInfoEXT;
/// ```
public sealed class VkDescriptorAddressInfoEXT extends Struct {
    /// The struct layout of `VkDescriptorAddressInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_LONG.withName("range"),
        ValueLayout.JAVA_INT.withName("format")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `address` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    /// The [VarHandle] of `range` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("range"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorAddressInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorAddressInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorAddressInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorAddressInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorAddressInfoEXT`
    public static VkDescriptorAddressInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorAddressInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorAddressInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorAddressInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorAddressInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorAddressInfoEXT`
    public static VkDescriptorAddressInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceAddress") long address, @CType("VkDeviceSize") long range, @CType("VkFormat") int format) { return alloc(allocator).sType(sType).pNext(pNext).address(address).range(range).format(format); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorAddressInfoEXT copyFrom(VkDescriptorAddressInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorAddressInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorAddressInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorAddressInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT sType(@CType("VkStructureType") int value) { VkDescriptorAddressInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorAddressInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorAddressInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDescriptorAddressInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDescriptorAddressInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `address` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_address(MemorySegment segment, long index) { return (long) VH_address.get(segment, 0L, index); }
    /// {@return `address`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_address(MemorySegment segment) { return VkDescriptorAddressInfoEXT.get_address(segment, 0L); }
    /// {@return `address`}
    public @CType("VkDeviceAddress") long address() { return VkDescriptorAddressInfoEXT.get_address(this.segment()); }
    /// Sets `address` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_address(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_address.set(segment, 0L, index, value); }
    /// Sets `address` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_address(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDescriptorAddressInfoEXT.set_address(segment, 0L, value); }
    /// Sets `address` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT address(@CType("VkDeviceAddress") long value) { VkDescriptorAddressInfoEXT.set_address(this.segment(), value); return this; }

    /// {@return `range` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_range(MemorySegment segment, long index) { return (long) VH_range.get(segment, 0L, index); }
    /// {@return `range`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_range(MemorySegment segment) { return VkDescriptorAddressInfoEXT.get_range(segment, 0L); }
    /// {@return `range`}
    public @CType("VkDeviceSize") long range() { return VkDescriptorAddressInfoEXT.get_range(this.segment()); }
    /// Sets `range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_range(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_range.set(segment, 0L, index, value); }
    /// Sets `range` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_range(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDescriptorAddressInfoEXT.set_range(segment, 0L, value); }
    /// Sets `range` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT range(@CType("VkDeviceSize") long value) { VkDescriptorAddressInfoEXT.set_range(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkDescriptorAddressInfoEXT.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkDescriptorAddressInfoEXT.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkDescriptorAddressInfoEXT.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT format(@CType("VkFormat") int value) { VkDescriptorAddressInfoEXT.set_format(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorAddressInfoEXT].
    public static final class Buffer extends VkDescriptorAddressInfoEXT {
        private final long elementCount;

        /// Creates `VkDescriptorAddressInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorAddressInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorAddressInfoEXT`
        public VkDescriptorAddressInfoEXT asSlice(long index) { return new VkDescriptorAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorAddressInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorAddressInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorAddressInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorAddressInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorAddressInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDescriptorAddressInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `address` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long addressAt(long index) { return VkDescriptorAddressInfoEXT.get_address(this.segment(), index); }
        /// Sets `address` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressAt(long index, @CType("VkDeviceAddress") long value) { VkDescriptorAddressInfoEXT.set_address(this.segment(), index, value); return this; }

        /// {@return `range` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long rangeAt(long index) { return VkDescriptorAddressInfoEXT.get_range(this.segment(), index); }
        /// Sets `range` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rangeAt(long index, @CType("VkDeviceSize") long value) { VkDescriptorAddressInfoEXT.set_range(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkFormat") int formatAt(long index) { return VkDescriptorAddressInfoEXT.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkFormat") int value) { VkDescriptorAddressInfoEXT.set_format(this.segment(), index, value); return this; }

    }
}
