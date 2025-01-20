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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(MemorySegment)]
/// ### vendorFaultCode
/// [VarHandle][#VH_vendorFaultCode] - [Getter][#vendorFaultCode()] - [Setter][#vendorFaultCode(long)]
/// ### vendorFaultData
/// [VarHandle][#VH_vendorFaultData] - [Getter][#vendorFaultData()] - [Setter][#vendorFaultData(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceFaultVendorInfoEXT {
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     uint64_t vendorFaultCode;
///     uint64_t vendorFaultData;
/// } VkDeviceFaultVendorInfoEXT;
/// ```
public sealed class VkDeviceFaultVendorInfoEXT extends Struct {
    /// The struct layout of `VkDeviceFaultVendorInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `vendorFaultCode` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_vendorFaultCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultCode"));
    /// The [VarHandle] of `vendorFaultData` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_vendorFaultData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultData"));

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultVendorInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT allocInit(SegmentAllocator allocator, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description, @CType("uint64_t") long vendorFaultCode, @CType("uint64_t") long vendorFaultData) { return alloc(allocator).description(description).vendorFaultCode(vendorFaultCode).vendorFaultData(vendorFaultData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT copyFrom(VkDeviceFaultVendorInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment) { return VkDeviceFaultVendorInfoEXT.get_description(segment, 0L); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description() { return VkDeviceFaultVendorInfoEXT.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkDeviceFaultVendorInfoEXT.set_description(segment, 0L, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkDeviceFaultVendorInfoEXT.set_description(this.segment(), value); return this; }

    /// {@return `vendorFaultCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_vendorFaultCode(MemorySegment segment, long index) { return (long) VH_vendorFaultCode.get(segment, 0L, index); }
    /// {@return `vendorFaultCode`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_vendorFaultCode(MemorySegment segment) { return VkDeviceFaultVendorInfoEXT.get_vendorFaultCode(segment, 0L); }
    /// {@return `vendorFaultCode`}
    public @CType("uint64_t") long vendorFaultCode() { return VkDeviceFaultVendorInfoEXT.get_vendorFaultCode(this.segment()); }
    /// Sets `vendorFaultCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorFaultCode(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_vendorFaultCode.set(segment, 0L, index, value); }
    /// Sets `vendorFaultCode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorFaultCode(MemorySegment segment, @CType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.set_vendorFaultCode(segment, 0L, value); }
    /// Sets `vendorFaultCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultCode(@CType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.set_vendorFaultCode(this.segment(), value); return this; }

    /// {@return `vendorFaultData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_vendorFaultData(MemorySegment segment, long index) { return (long) VH_vendorFaultData.get(segment, 0L, index); }
    /// {@return `vendorFaultData`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_vendorFaultData(MemorySegment segment) { return VkDeviceFaultVendorInfoEXT.get_vendorFaultData(segment, 0L); }
    /// {@return `vendorFaultData`}
    public @CType("uint64_t") long vendorFaultData() { return VkDeviceFaultVendorInfoEXT.get_vendorFaultData(this.segment()); }
    /// Sets `vendorFaultData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorFaultData(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_vendorFaultData.set(segment, 0L, index, value); }
    /// Sets `vendorFaultData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorFaultData(MemorySegment segment, @CType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.set_vendorFaultData(segment, 0L, value); }
    /// Sets `vendorFaultData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultData(@CType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.set_vendorFaultData(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment descriptionAt(long index) { return VkDeviceFaultVendorInfoEXT.get_description(this.segment(), index); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkDeviceFaultVendorInfoEXT.set_description(this.segment(), index, value); return this; }

        /// {@return `vendorFaultCode` at the given index}
        /// @param index the index
        public @CType("uint64_t") long vendorFaultCodeAt(long index) { return VkDeviceFaultVendorInfoEXT.get_vendorFaultCode(this.segment(), index); }
        /// Sets `vendorFaultCode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorFaultCodeAt(long index, @CType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.set_vendorFaultCode(this.segment(), index, value); return this; }

        /// {@return `vendorFaultData` at the given index}
        /// @param index the index
        public @CType("uint64_t") long vendorFaultDataAt(long index) { return VkDeviceFaultVendorInfoEXT.get_vendorFaultData(this.segment(), index); }
        /// Sets `vendorFaultData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorFaultDataAt(long index, @CType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.set_vendorFaultData(this.segment(), index, value); return this; }

    }
}
