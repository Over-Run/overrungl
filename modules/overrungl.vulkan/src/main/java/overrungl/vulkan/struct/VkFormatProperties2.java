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
/// ### formatProperties
/// [Byte offset][#OFFSET_formatProperties] - [Memory layout][#ML_formatProperties] - [Getter][#formatProperties()] - [Setter][#formatProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFormatProperties2 {
///     VkStructureType sType;
///     void * pNext;
///     VkFormatProperties formatProperties;
/// } VkFormatProperties2;
/// ```
public sealed class VkFormatProperties2 extends Struct {
    /// The struct layout of `VkFormatProperties2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkFormatProperties.LAYOUT.withName("formatProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `formatProperties`.
    public static final long OFFSET_formatProperties = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
    /// The memory layout of `formatProperties`.
    public static final MemoryLayout ML_formatProperties = LAYOUT.select(PathElement.groupElement("formatProperties"));

    /// Creates `VkFormatProperties2` with the given segment.
    /// @param segment the memory segment
    public VkFormatProperties2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFormatProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties2(segment); }

    /// Creates `VkFormatProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFormatProperties2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties2`
    public static VkFormatProperties2 alloc(SegmentAllocator allocator) { return new VkFormatProperties2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFormatProperties2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFormatProperties2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFormatProperties2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties2`
    public static VkFormatProperties2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkFormatProperties") java.lang.foreign.MemorySegment formatProperties) { return alloc(allocator).sType(sType).pNext(pNext).formatProperties(formatProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFormatProperties2 copyFrom(VkFormatProperties2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFormatProperties2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFormatProperties2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFormatProperties2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2 sType(@CType("VkStructureType") int value) { VkFormatProperties2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkFormatProperties2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkFormatProperties2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkFormatProperties2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkFormatProperties2.set_pNext(this.segment(), value); return this; }

    /// {@return `formatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatProperties") java.lang.foreign.MemorySegment get_formatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_formatProperties, index), ML_formatProperties); }
    /// {@return `formatProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatProperties") java.lang.foreign.MemorySegment get_formatProperties(MemorySegment segment) { return VkFormatProperties2.get_formatProperties(segment, 0L); }
    /// {@return `formatProperties`}
    public @CType("VkFormatProperties") java.lang.foreign.MemorySegment formatProperties() { return VkFormatProperties2.get_formatProperties(this.segment()); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatProperties(MemorySegment segment, long index, @CType("VkFormatProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_formatProperties, index), ML_formatProperties.byteSize()); }
    /// Sets `formatProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatProperties(MemorySegment segment, @CType("VkFormatProperties") java.lang.foreign.MemorySegment value) { VkFormatProperties2.set_formatProperties(segment, 0L, value); }
    /// Sets `formatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2 formatProperties(@CType("VkFormatProperties") java.lang.foreign.MemorySegment value) { VkFormatProperties2.set_formatProperties(this.segment(), value); return this; }

    /// A buffer of [VkFormatProperties2].
    public static final class Buffer extends VkFormatProperties2 {
        private final long elementCount;

        /// Creates `VkFormatProperties2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFormatProperties2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFormatProperties2`
        public VkFormatProperties2 asSlice(long index) { return new VkFormatProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFormatProperties2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFormatProperties2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkFormatProperties2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkFormatProperties2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkFormatProperties2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkFormatProperties2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `formatProperties` at the given index}
        /// @param index the index
        public @CType("VkFormatProperties") java.lang.foreign.MemorySegment formatPropertiesAt(long index) { return VkFormatProperties2.get_formatProperties(this.segment(), index); }
        /// Sets `formatProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatPropertiesAt(long index, @CType("VkFormatProperties") java.lang.foreign.MemorySegment value) { VkFormatProperties2.set_formatProperties(this.segment(), index, value); return this; }

    }
}
