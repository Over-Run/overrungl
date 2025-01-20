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
/// ### lineSubPixelPrecisionBits
/// [VarHandle][#VH_lineSubPixelPrecisionBits] - [Getter][#lineSubPixelPrecisionBits()] - [Setter][#lineSubPixelPrecisionBits(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLineRasterizationProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t lineSubPixelPrecisionBits;
/// } VkPhysicalDeviceLineRasterizationProperties;
/// ```
public sealed class VkPhysicalDeviceLineRasterizationProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceLineRasterizationProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineSubPixelPrecisionBits")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `lineSubPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLineRasterizationProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static VkPhysicalDeviceLineRasterizationProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static VkPhysicalDeviceLineRasterizationProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int lineSubPixelPrecisionBits) { return alloc(allocator).sType(sType).pNext(pNext).lineSubPixelPrecisionBits(lineSubPixelPrecisionBits); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties copyFrom(VkPhysicalDeviceLineRasterizationProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceLineRasterizationProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceLineRasterizationProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceLineRasterizationProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceLineRasterizationProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_lineSubPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_lineSubPixelPrecisionBits.get(segment, 0L, index); }
    /// {@return `lineSubPixelPrecisionBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_lineSubPixelPrecisionBits(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationProperties.get_lineSubPixelPrecisionBits(segment, 0L); }
    /// {@return `lineSubPixelPrecisionBits`}
    public @CType("uint32_t") int lineSubPixelPrecisionBits() { return VkPhysicalDeviceLineRasterizationProperties.get_lineSubPixelPrecisionBits(this.segment()); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineSubPixelPrecisionBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_lineSubPixelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineSubPixelPrecisionBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLineRasterizationProperties.set_lineSubPixelPrecisionBits(segment, 0L, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBits(@CType("uint32_t") int value) { VkPhysicalDeviceLineRasterizationProperties.set_lineSubPixelPrecisionBits(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceLineRasterizationProperties].
    public static final class Buffer extends VkPhysicalDeviceLineRasterizationProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceLineRasterizationProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceLineRasterizationProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceLineRasterizationProperties`
        public VkPhysicalDeviceLineRasterizationProperties asSlice(long index) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceLineRasterizationProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceLineRasterizationProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLineRasterizationProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceLineRasterizationProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceLineRasterizationProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `lineSubPixelPrecisionBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int lineSubPixelPrecisionBitsAt(long index) { return VkPhysicalDeviceLineRasterizationProperties.get_lineSubPixelPrecisionBits(this.segment(), index); }
        /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lineSubPixelPrecisionBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLineRasterizationProperties.set_lineSubPixelPrecisionBits(this.segment(), index, value); return this; }

    }
}
