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
/// ### identifierSize
/// [VarHandle][#VH_identifierSize] - [Getter][#identifierSize()] - [Setter][#identifierSize(int)]
/// ### pIdentifier
/// [VarHandle][#VH_pIdentifier] - [Getter][#pIdentifier()] - [Setter][#pIdentifier(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineShaderStageModuleIdentifierCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t identifierSize;
///     const uint8_t * pIdentifier;
/// } VkPipelineShaderStageModuleIdentifierCreateInfoEXT;
/// ```
public sealed class VkPipelineShaderStageModuleIdentifierCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.ADDRESS.withName("pIdentifier")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `identifierSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    /// The [VarHandle] of `pIdentifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIdentifier"));

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int identifierSize, @CType("const uint8_t *") MemorySegment pIdentifier) { return alloc(allocator).sType(sType).pNext(pNext).identifierSize(identifierSize).pIdentifier(pIdentifier); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT copyFrom(VkPipelineShaderStageModuleIdentifierCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_identifierSize(MemorySegment segment, long index) { return (int) VH_identifierSize.get(segment, 0L, index); }
    /// {@return `identifierSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_identifierSize(MemorySegment segment) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_identifierSize(segment, 0L); }
    /// {@return `identifierSize`}
    public @CType("uint32_t") int identifierSize() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_identifierSize(this.segment()); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identifierSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_identifierSize.set(segment, 0L, index, value); }
    /// Sets `identifierSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identifierSize(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_identifierSize(segment, 0L, value); }
    /// Sets `identifierSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT identifierSize(@CType("uint32_t") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_identifierSize(this.segment(), value); return this; }

    /// {@return `pIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint8_t *") MemorySegment get_pIdentifier(MemorySegment segment, long index) { return (MemorySegment) VH_pIdentifier.get(segment, 0L, index); }
    /// {@return `pIdentifier`}
    /// @param segment the segment of the struct
    public static @CType("const uint8_t *") MemorySegment get_pIdentifier(MemorySegment segment) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_pIdentifier(segment, 0L); }
    /// {@return `pIdentifier`}
    public @CType("const uint8_t *") MemorySegment pIdentifier() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_pIdentifier(this.segment()); }
    /// Sets `pIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pIdentifier(MemorySegment segment, long index, @CType("const uint8_t *") MemorySegment value) { VH_pIdentifier.set(segment, 0L, index, value); }
    /// Sets `pIdentifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pIdentifier(MemorySegment segment, @CType("const uint8_t *") MemorySegment value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_pIdentifier(segment, 0L, value); }
    /// Sets `pIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifier(@CType("const uint8_t *") MemorySegment value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_pIdentifier(this.segment(), value); return this; }

    /// A buffer of [VkPipelineShaderStageModuleIdentifierCreateInfoEXT].
    public static final class Buffer extends VkPipelineShaderStageModuleIdentifierCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT asSlice(long index) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `identifierSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int identifierSizeAt(long index) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_identifierSize(this.segment(), index); }
        /// Sets `identifierSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer identifierSizeAt(long index, @CType("uint32_t") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_identifierSize(this.segment(), index, value); return this; }

        /// {@return `pIdentifier` at the given index}
        /// @param index the index
        public @CType("const uint8_t *") MemorySegment pIdentifierAt(long index) { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.get_pIdentifier(this.segment(), index); }
        /// Sets `pIdentifier` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pIdentifierAt(long index, @CType("const uint8_t *") MemorySegment value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.set_pIdentifier(this.segment(), index, value); return this; }

    }
}
