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
/// ### imageFormatProperties
/// [Byte offset][#OFFSET_imageFormatProperties] - [Memory layout][#ML_imageFormatProperties] - [Getter][#imageFormatProperties()] - [Setter][#imageFormatProperties(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageFormatProperties2 {
///     VkStructureType sType;
///     void * pNext;
///     VkImageFormatProperties imageFormatProperties;
/// } VkImageFormatProperties2;
/// ```
public sealed class VkImageFormatProperties2 extends Struct {
    /// The struct layout of `VkImageFormatProperties2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageFormatProperties.LAYOUT.withName("imageFormatProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `imageFormatProperties`.
    public static final long OFFSET_imageFormatProperties = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
    /// The memory layout of `imageFormatProperties`.
    public static final MemoryLayout ML_imageFormatProperties = LAYOUT.select(PathElement.groupElement("imageFormatProperties"));

    /// Creates `VkImageFormatProperties2` with the given segment.
    /// @param segment the memory segment
    public VkImageFormatProperties2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageFormatProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatProperties2(segment); }

    /// Creates `VkImageFormatProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageFormatProperties2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatProperties2`
    public static VkImageFormatProperties2 alloc(SegmentAllocator allocator) { return new VkImageFormatProperties2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageFormatProperties2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatProperties2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageFormatProperties2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatProperties2`
    public static VkImageFormatProperties2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkImageFormatProperties") MemorySegment imageFormatProperties) { return alloc(allocator).sType(sType).pNext(pNext).imageFormatProperties(imageFormatProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageFormatProperties2 copyFrom(VkImageFormatProperties2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageFormatProperties2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageFormatProperties2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageFormatProperties2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2 sType(@CType("VkStructureType") int value) { VkImageFormatProperties2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageFormatProperties2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkImageFormatProperties2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkImageFormatProperties2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2 pNext(@CType("void *") MemorySegment value) { VkImageFormatProperties2.set_pNext(this.segment(), value); return this; }

    /// {@return `imageFormatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageFormatProperties") MemorySegment get_imageFormatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageFormatProperties, index), ML_imageFormatProperties); }
    /// {@return `imageFormatProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkImageFormatProperties") MemorySegment get_imageFormatProperties(MemorySegment segment) { return VkImageFormatProperties2.get_imageFormatProperties(segment, 0L); }
    /// {@return `imageFormatProperties`}
    public @CType("VkImageFormatProperties") MemorySegment imageFormatProperties() { return VkImageFormatProperties2.get_imageFormatProperties(this.segment()); }
    /// Sets `imageFormatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageFormatProperties(MemorySegment segment, long index, @CType("VkImageFormatProperties") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageFormatProperties, index), ML_imageFormatProperties.byteSize()); }
    /// Sets `imageFormatProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageFormatProperties(MemorySegment segment, @CType("VkImageFormatProperties") MemorySegment value) { VkImageFormatProperties2.set_imageFormatProperties(segment, 0L, value); }
    /// Sets `imageFormatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2 imageFormatProperties(@CType("VkImageFormatProperties") MemorySegment value) { VkImageFormatProperties2.set_imageFormatProperties(this.segment(), value); return this; }

    /// A buffer of [VkImageFormatProperties2].
    public static final class Buffer extends VkImageFormatProperties2 {
        private final long elementCount;

        /// Creates `VkImageFormatProperties2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageFormatProperties2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageFormatProperties2`
        public VkImageFormatProperties2 asSlice(long index) { return new VkImageFormatProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageFormatProperties2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageFormatProperties2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageFormatProperties2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageFormatProperties2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkImageFormatProperties2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkImageFormatProperties2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `imageFormatProperties` at the given index}
        /// @param index the index
        public @CType("VkImageFormatProperties") MemorySegment imageFormatPropertiesAt(long index) { return VkImageFormatProperties2.get_imageFormatProperties(this.segment(), index); }
        /// Sets `imageFormatProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageFormatPropertiesAt(long index, @CType("VkImageFormatProperties") MemorySegment value) { VkImageFormatProperties2.set_imageFormatProperties(this.segment(), index, value); return this; }

    }
}
