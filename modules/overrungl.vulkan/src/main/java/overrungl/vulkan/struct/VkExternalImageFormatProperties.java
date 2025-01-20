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
/// ### externalMemoryProperties
/// [Byte offset][#OFFSET_externalMemoryProperties] - [Memory layout][#ML_externalMemoryProperties] - [Getter][#externalMemoryProperties()] - [Setter][#externalMemoryProperties(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExternalImageFormatProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkExternalMemoryProperties externalMemoryProperties;
/// } VkExternalImageFormatProperties;
/// ```
public sealed class VkExternalImageFormatProperties extends Struct {
    /// The struct layout of `VkExternalImageFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExternalMemoryProperties.LAYOUT.withName("externalMemoryProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `externalMemoryProperties`.
    public static final long OFFSET_externalMemoryProperties = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryProperties"));
    /// The memory layout of `externalMemoryProperties`.
    public static final MemoryLayout ML_externalMemoryProperties = LAYOUT.select(PathElement.groupElement("externalMemoryProperties"));

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    public VkExternalImageFormatProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalImageFormatProperties(segment); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalImageFormatProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties alloc(SegmentAllocator allocator) { return new VkExternalImageFormatProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalImageFormatProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkExternalMemoryProperties") MemorySegment externalMemoryProperties) { return alloc(allocator).sType(sType).pNext(pNext).externalMemoryProperties(externalMemoryProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalImageFormatProperties copyFrom(VkExternalImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExternalImageFormatProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExternalImageFormatProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExternalImageFormatProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties sType(@CType("VkStructureType") int value) { VkExternalImageFormatProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkExternalImageFormatProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkExternalImageFormatProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkExternalImageFormatProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties pNext(@CType("void *") MemorySegment value) { VkExternalImageFormatProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `externalMemoryProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryProperties") MemorySegment get_externalMemoryProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_externalMemoryProperties, index), ML_externalMemoryProperties); }
    /// {@return `externalMemoryProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryProperties") MemorySegment get_externalMemoryProperties(MemorySegment segment) { return VkExternalImageFormatProperties.get_externalMemoryProperties(segment, 0L); }
    /// {@return `externalMemoryProperties`}
    public @CType("VkExternalMemoryProperties") MemorySegment externalMemoryProperties() { return VkExternalImageFormatProperties.get_externalMemoryProperties(this.segment()); }
    /// Sets `externalMemoryProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalMemoryProperties(MemorySegment segment, long index, @CType("VkExternalMemoryProperties") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_externalMemoryProperties, index), ML_externalMemoryProperties.byteSize()); }
    /// Sets `externalMemoryProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalMemoryProperties(MemorySegment segment, @CType("VkExternalMemoryProperties") MemorySegment value) { VkExternalImageFormatProperties.set_externalMemoryProperties(segment, 0L, value); }
    /// Sets `externalMemoryProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties externalMemoryProperties(@CType("VkExternalMemoryProperties") MemorySegment value) { VkExternalImageFormatProperties.set_externalMemoryProperties(this.segment(), value); return this; }

    /// A buffer of [VkExternalImageFormatProperties].
    public static final class Buffer extends VkExternalImageFormatProperties {
        private final long elementCount;

        /// Creates `VkExternalImageFormatProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExternalImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExternalImageFormatProperties`
        public VkExternalImageFormatProperties asSlice(long index) { return new VkExternalImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExternalImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExternalImageFormatProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExternalImageFormatProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExternalImageFormatProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkExternalImageFormatProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkExternalImageFormatProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `externalMemoryProperties` at the given index}
        /// @param index the index
        public @CType("VkExternalMemoryProperties") MemorySegment externalMemoryPropertiesAt(long index) { return VkExternalImageFormatProperties.get_externalMemoryProperties(this.segment(), index); }
        /// Sets `externalMemoryProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer externalMemoryPropertiesAt(long index, @CType("VkExternalMemoryProperties") MemorySegment value) { VkExternalImageFormatProperties.set_externalMemoryProperties(this.segment(), index, value); return this; }

    }
}
