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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### pipelineIdentifier
/// [Byte offset][#OFFSET_pipelineIdentifier] - [Memory layout][#ML_pipelineIdentifier] - [Getter][#pipelineIdentifier()] - [Setter][#pipelineIdentifier(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelinePropertiesIdentifierEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint8_t[VK_UUID_SIZE] pipelineIdentifier;
/// } VkPipelinePropertiesIdentifierEXT;
/// ```
public sealed class VkPipelinePropertiesIdentifierEXT extends Struct {
    /// The struct layout of `VkPipelinePropertiesIdentifierEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `pipelineIdentifier`.
    public static final long OFFSET_pipelineIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelineIdentifier"));
    /// The memory layout of `pipelineIdentifier`.
    public static final MemoryLayout ML_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelinePropertiesIdentifierEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePropertiesIdentifierEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePropertiesIdentifierEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelinePropertiesIdentifierEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelinePropertiesIdentifierEXT`
    public static VkPipelinePropertiesIdentifierEXT alloc(SegmentAllocator allocator) { return new VkPipelinePropertiesIdentifierEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelinePropertiesIdentifierEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelinePropertiesIdentifierEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelinePropertiesIdentifierEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelinePropertiesIdentifierEXT`
    public static VkPipelinePropertiesIdentifierEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifier) { return alloc(allocator).sType(sType).pNext(pNext).pipelineIdentifier(pipelineIdentifier); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT copyFrom(VkPipelinePropertiesIdentifierEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelinePropertiesIdentifierEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelinePropertiesIdentifierEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelinePropertiesIdentifierEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT sType(@CType("VkStructureType") int value) { VkPipelinePropertiesIdentifierEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelinePropertiesIdentifierEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPipelinePropertiesIdentifierEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelinePropertiesIdentifierEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPipelinePropertiesIdentifierEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineIdentifier(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineIdentifier, index), ML_pipelineIdentifier); }
    /// {@return `pipelineIdentifier`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineIdentifier(MemorySegment segment) { return VkPipelinePropertiesIdentifierEXT.get_pipelineIdentifier(segment, 0L); }
    /// {@return `pipelineIdentifier`}
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifier() { return VkPipelinePropertiesIdentifierEXT.get_pipelineIdentifier(this.segment()); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineIdentifier(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineIdentifier, index), ML_pipelineIdentifier.byteSize()); }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineIdentifier(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelinePropertiesIdentifierEXT.set_pipelineIdentifier(segment, 0L, value); }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(@CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelinePropertiesIdentifierEXT.set_pipelineIdentifier(this.segment(), value); return this; }

    /// A buffer of [VkPipelinePropertiesIdentifierEXT].
    public static final class Buffer extends VkPipelinePropertiesIdentifierEXT {
        private final long elementCount;

        /// Creates `VkPipelinePropertiesIdentifierEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelinePropertiesIdentifierEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelinePropertiesIdentifierEXT`
        public VkPipelinePropertiesIdentifierEXT asSlice(long index) { return new VkPipelinePropertiesIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelinePropertiesIdentifierEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelinePropertiesIdentifierEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelinePropertiesIdentifierEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelinePropertiesIdentifierEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelinePropertiesIdentifierEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelinePropertiesIdentifierEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pipelineIdentifier` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifierAt(long index) { return VkPipelinePropertiesIdentifierEXT.get_pipelineIdentifier(this.segment(), index); }
        /// Sets `pipelineIdentifier` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineIdentifierAt(long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelinePropertiesIdentifierEXT.set_pipelineIdentifier(this.segment(), index, value); return this; }

    }
}
