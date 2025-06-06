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
/// struct VkDeviceFaultVendorInfoEXT {
///     char description[256];
///     uint64_t vendorFaultCode;
///     uint64_t vendorFaultData;
/// };
/// ```
public sealed class VkDeviceFaultVendorInfoEXT extends GroupType {
    /// The struct layout of `VkDeviceFaultVendorInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The byte offset of `vendorFaultCode`.
    public static final long OFFSET_vendorFaultCode = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultCode"));
    /// The memory layout of `vendorFaultCode`.
    public static final MemoryLayout LAYOUT_vendorFaultCode = LAYOUT.select(PathElement.groupElement("vendorFaultCode"));
    /// The [VarHandle] of `vendorFaultCode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorFaultCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultCode"));
    /// The byte offset of `vendorFaultData`.
    public static final long OFFSET_vendorFaultData = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultData"));
    /// The memory layout of `vendorFaultData`.
    public static final MemoryLayout LAYOUT_vendorFaultData = LAYOUT.select(PathElement.groupElement("vendorFaultData"));
    /// The [VarHandle] of `vendorFaultData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorFaultData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultData"));

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultVendorInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param description `description`
    /// @param vendorFaultCode `vendorFaultCode`
    /// @param vendorFaultData `vendorFaultData`
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT allocInit(SegmentAllocator allocator, MemorySegment description, long vendorFaultCode, long vendorFaultData) {
        return alloc(allocator).description(description).vendorFaultCode(vendorFaultCode).vendorFaultData(vendorFaultData);
    }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param description `description`
    /// @param vendorFaultCode `vendorFaultCode`
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT allocInit(SegmentAllocator allocator, MemorySegment description, long vendorFaultCode) {
        return alloc(allocator).description(description).vendorFaultCode(vendorFaultCode);
    }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param description `description`
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT allocInit(SegmentAllocator allocator, MemorySegment description) {
        return alloc(allocator).description(description);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT copyFrom(VkDeviceFaultVendorInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// {@return `vendorFaultCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vendorFaultCode(MemorySegment segment, long index) { return (long) VH_vendorFaultCode.get(segment, 0L, index); }
    /// {@return `vendorFaultCode`}
    public long vendorFaultCode() { return vendorFaultCode(this.segment(), 0L); }
    /// Sets `vendorFaultCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorFaultCode(MemorySegment segment, long index, long value) { VH_vendorFaultCode.set(segment, 0L, index, value); }
    /// Sets `vendorFaultCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultCode(long value) { vendorFaultCode(this.segment(), 0L, value); return this; }

    /// {@return `vendorFaultData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vendorFaultData(MemorySegment segment, long index) { return (long) VH_vendorFaultData.get(segment, 0L, index); }
    /// {@return `vendorFaultData`}
    public long vendorFaultData() { return vendorFaultData(this.segment(), 0L); }
    /// Sets `vendorFaultData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorFaultData(MemorySegment segment, long index, long value) { VH_vendorFaultData.set(segment, 0L, index, value); }
    /// Sets `vendorFaultData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultData(long value) { vendorFaultData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceFaultVendorInfoEXT].
    public static final class Buffer extends VkDeviceFaultVendorInfoEXT {
        private final long elementCount;

        /// Creates `VkDeviceFaultVendorInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceFaultVendorInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceFaultVendorInfoEXT`
        public VkDeviceFaultVendorInfoEXT asSlice(long index) { return new VkDeviceFaultVendorInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceFaultVendorInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceFaultVendorInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `description` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
        /// {@return `description` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
        /// Sets `description` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

        /// {@return `vendorFaultCode` at the given index}
        /// @param index the index of the struct buffer
        public long vendorFaultCodeAt(long index) { return vendorFaultCode(this.segment(), index); }
        /// Sets `vendorFaultCode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorFaultCodeAt(long index, long value) { vendorFaultCode(this.segment(), index, value); return this; }

        /// {@return `vendorFaultData` at the given index}
        /// @param index the index of the struct buffer
        public long vendorFaultDataAt(long index) { return vendorFaultData(this.segment(), index); }
        /// Sets `vendorFaultData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorFaultDataAt(long index, long value) { vendorFaultData(this.segment(), index, value); return this; }

    }
}
