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
/// ### vendorID
/// [VarHandle][#VH_vendorID] - [Getter][#vendorID()] - [Setter][#vendorID(int)]
/// ### deviceID
/// [VarHandle][#VH_deviceID] - [Getter][#deviceID()] - [Setter][#deviceID(int)]
/// ### key
/// [VarHandle][#VH_key] - [Getter][#key()] - [Setter][#key(int)]
/// ### value
/// [VarHandle][#VH_value] - [Getter][#value()] - [Setter][#value(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkApplicationParametersEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint32_t key;
///     uint64_t value;
/// } VkApplicationParametersEXT;
/// ```
public sealed class VkApplicationParametersEXT extends Struct {
    /// The struct layout of `VkApplicationParametersEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("key"),
        ValueLayout.JAVA_LONG.withName("value")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `key` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_key = LAYOUT.arrayElementVarHandle(PathElement.groupElement("key"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment the memory segment
    public VkApplicationParametersEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationParametersEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkApplicationParametersEXT(segment); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationParametersEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkApplicationParametersEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationParametersEXT`
    public static VkApplicationParametersEXT alloc(SegmentAllocator allocator) { return new VkApplicationParametersEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkApplicationParametersEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationParametersEXT`
    public static VkApplicationParametersEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int vendorID, @CType("uint32_t") int deviceID, @CType("uint32_t") int key, @CType("uint64_t") long value) { return alloc(allocator).sType(sType).pNext(pNext).vendorID(vendorID).deviceID(deviceID).key(key).value(value); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkApplicationParametersEXT copyFrom(VkApplicationParametersEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkApplicationParametersEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkApplicationParametersEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkApplicationParametersEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT sType(@CType("VkStructureType") int value) { VkApplicationParametersEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkApplicationParametersEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkApplicationParametersEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkApplicationParametersEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT pNext(@CType("const void *") MemorySegment value) { VkApplicationParametersEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment) { return VkApplicationParametersEXT.get_vendorID(segment, 0L); }
    /// {@return `vendorID`}
    public @CType("uint32_t") int vendorID() { return VkApplicationParametersEXT.get_vendorID(this.segment()); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, @CType("uint32_t") int value) { VkApplicationParametersEXT.set_vendorID(segment, 0L, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT vendorID(@CType("uint32_t") int value) { VkApplicationParametersEXT.set_vendorID(this.segment(), value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment) { return VkApplicationParametersEXT.get_deviceID(segment, 0L); }
    /// {@return `deviceID`}
    public @CType("uint32_t") int deviceID() { return VkApplicationParametersEXT.get_deviceID(this.segment()); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, @CType("uint32_t") int value) { VkApplicationParametersEXT.set_deviceID(segment, 0L, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT deviceID(@CType("uint32_t") int value) { VkApplicationParametersEXT.set_deviceID(this.segment(), value); return this; }

    /// {@return `key` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_key(MemorySegment segment, long index) { return (int) VH_key.get(segment, 0L, index); }
    /// {@return `key`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_key(MemorySegment segment) { return VkApplicationParametersEXT.get_key(segment, 0L); }
    /// {@return `key`}
    public @CType("uint32_t") int key() { return VkApplicationParametersEXT.get_key(this.segment()); }
    /// Sets `key` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_key(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_key.set(segment, 0L, index, value); }
    /// Sets `key` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_key(MemorySegment segment, @CType("uint32_t") int value) { VkApplicationParametersEXT.set_key(segment, 0L, value); }
    /// Sets `key` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT key(@CType("uint32_t") int value) { VkApplicationParametersEXT.set_key(this.segment(), value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_value(MemorySegment segment) { return VkApplicationParametersEXT.get_value(segment, 0L); }
    /// {@return `value`}
    public @CType("uint64_t") long value() { return VkApplicationParametersEXT.get_value(this.segment()); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_value(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_value(MemorySegment segment, @CType("uint64_t") long value) { VkApplicationParametersEXT.set_value(segment, 0L, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT value(@CType("uint64_t") long value) { VkApplicationParametersEXT.set_value(this.segment(), value); return this; }

    /// A buffer of [VkApplicationParametersEXT].
    public static final class Buffer extends VkApplicationParametersEXT {
        private final long elementCount;

        /// Creates `VkApplicationParametersEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkApplicationParametersEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkApplicationParametersEXT`
        public VkApplicationParametersEXT asSlice(long index) { return new VkApplicationParametersEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkApplicationParametersEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkApplicationParametersEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkApplicationParametersEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkApplicationParametersEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkApplicationParametersEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkApplicationParametersEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vendorIDAt(long index) { return VkApplicationParametersEXT.get_vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, @CType("uint32_t") int value) { VkApplicationParametersEXT.set_vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceIDAt(long index) { return VkApplicationParametersEXT.get_deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, @CType("uint32_t") int value) { VkApplicationParametersEXT.set_deviceID(this.segment(), index, value); return this; }

        /// {@return `key` at the given index}
        /// @param index the index
        public @CType("uint32_t") int keyAt(long index) { return VkApplicationParametersEXT.get_key(this.segment(), index); }
        /// Sets `key` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer keyAt(long index, @CType("uint32_t") int value) { VkApplicationParametersEXT.set_key(this.segment(), index, value); return this; }

        /// {@return `value` at the given index}
        /// @param index the index
        public @CType("uint64_t") long valueAt(long index) { return VkApplicationParametersEXT.get_value(this.segment(), index); }
        /// Sets `value` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer valueAt(long index, @CType("uint64_t") long value) { VkApplicationParametersEXT.set_value(this.segment(), index, value); return this; }

    }
}
