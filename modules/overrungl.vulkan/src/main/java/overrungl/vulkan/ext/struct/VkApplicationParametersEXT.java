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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkApplicationParametersEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint32_t key;
///     uint64_t value;
/// };
/// ```
public sealed class VkApplicationParametersEXT extends GroupType {
    /// The struct layout of `VkApplicationParametersEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("key"),
        ValueLayout.JAVA_LONG.withName("value")
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
    /// The byte offset of `vendorID`.
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    /// The memory layout of `vendorID`.
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The byte offset of `deviceID`.
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    /// The memory layout of `deviceID`.
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The byte offset of `key`.
    public static final long OFFSET_key = LAYOUT.byteOffset(PathElement.groupElement("key"));
    /// The memory layout of `key`.
    public static final MemoryLayout LAYOUT_key = LAYOUT.select(PathElement.groupElement("key"));
    /// The [VarHandle] of `key` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_key = LAYOUT.arrayElementVarHandle(PathElement.groupElement("key"));
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment the memory segment
    public VkApplicationParametersEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationParametersEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationParametersEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationParametersEXT`
    public static VkApplicationParametersEXT alloc(SegmentAllocator allocator) { return new VkApplicationParametersEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkApplicationParametersEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkApplicationParametersEXT copyFrom(VkApplicationParametersEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkApplicationParametersEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkApplicationParametersEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    public int vendorID() { return vendorID(this.segment(), 0L); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorID(MemorySegment segment, long index, int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT vendorID(int value) { vendorID(this.segment(), 0L, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    public int deviceID() { return deviceID(this.segment(), 0L); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceID(MemorySegment segment, long index, int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT deviceID(int value) { deviceID(this.segment(), 0L, value); return this; }

    /// {@return `key` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int key(MemorySegment segment, long index) { return (int) VH_key.get(segment, 0L, index); }
    /// {@return `key`}
    public int key() { return key(this.segment(), 0L); }
    /// Sets `key` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void key(MemorySegment segment, long index, int value) { VH_key.set(segment, 0L, index, value); }
    /// Sets `key` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT key(int value) { key(this.segment(), 0L, value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public long value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT value(long value) { value(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index of the struct buffer
        public int vendorIDAt(long index) { return vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, int value) { vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index of the struct buffer
        public int deviceIDAt(long index) { return deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, int value) { deviceID(this.segment(), index, value); return this; }

        /// {@return `key` at the given index}
        /// @param index the index of the struct buffer
        public int keyAt(long index) { return key(this.segment(), index); }
        /// Sets `key` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer keyAt(long index, int value) { key(this.segment(), index, value); return this; }

        /// {@return `value` at the given index}
        /// @param index the index of the struct buffer
        public long valueAt(long index) { return value(this.segment(), index); }
        /// Sets `value` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer valueAt(long index, long value) { value(this.segment(), index, value); return this; }

    }
}
