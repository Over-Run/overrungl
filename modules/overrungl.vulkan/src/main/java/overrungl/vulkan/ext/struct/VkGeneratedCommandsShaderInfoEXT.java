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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### shaderCount
/// [VarHandle][#VH_shaderCount] - [Getter][#shaderCount()] - [Setter][#shaderCount(int)]
/// ### pShaders
/// [VarHandle][#VH_pShaders] - [Getter][#pShaders()] - [Setter][#pShaders(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeneratedCommandsShaderInfoEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t shaderCount;
///     const VkShaderEXT * pShaders;
/// } VkGeneratedCommandsShaderInfoEXT;
/// ```
public sealed class VkGeneratedCommandsShaderInfoEXT extends Struct {
    /// The struct layout of `VkGeneratedCommandsShaderInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withName("pShaders")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCount"));
    /// The [VarHandle] of `pShaders` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pShaders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaders"));

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkGeneratedCommandsShaderInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsShaderInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsShaderInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGeneratedCommandsShaderInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsShaderInfoEXT`
    public static VkGeneratedCommandsShaderInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsShaderInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeneratedCommandsShaderInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsShaderInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeneratedCommandsShaderInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsShaderInfoEXT`
    public static VkGeneratedCommandsShaderInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int shaderCount, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment pShaders) { return alloc(allocator).sType(sType).pNext(pNext).shaderCount(shaderCount).pShaders(pShaders); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT copyFrom(VkGeneratedCommandsShaderInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeneratedCommandsShaderInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeneratedCommandsShaderInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeneratedCommandsShaderInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT sType(@CType("VkStructureType") int value) { VkGeneratedCommandsShaderInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGeneratedCommandsShaderInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkGeneratedCommandsShaderInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsShaderInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsShaderInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderCount(MemorySegment segment, long index) { return (int) VH_shaderCount.get(segment, 0L, index); }
    /// {@return `shaderCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderCount(MemorySegment segment) { return VkGeneratedCommandsShaderInfoEXT.get_shaderCount(segment, 0L); }
    /// {@return `shaderCount`}
    public @CType("uint32_t") int shaderCount() { return VkGeneratedCommandsShaderInfoEXT.get_shaderCount(this.segment()); }
    /// Sets `shaderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderCount.set(segment, 0L, index, value); }
    /// Sets `shaderCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsShaderInfoEXT.set_shaderCount(segment, 0L, value); }
    /// Sets `shaderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT shaderCount(@CType("uint32_t") int value) { VkGeneratedCommandsShaderInfoEXT.set_shaderCount(this.segment(), value); return this; }

    /// {@return `pShaders` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment get_pShaders(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pShaders.get(segment, 0L, index); }
    /// {@return `pShaders`}
    /// @param segment the segment of the struct
    public static @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment get_pShaders(MemorySegment segment) { return VkGeneratedCommandsShaderInfoEXT.get_pShaders(segment, 0L); }
    /// {@return `pShaders`}
    public @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment pShaders() { return VkGeneratedCommandsShaderInfoEXT.get_pShaders(this.segment()); }
    /// Sets `pShaders` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pShaders(MemorySegment segment, long index, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VH_pShaders.set(segment, 0L, index, value); }
    /// Sets `pShaders` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pShaders(MemorySegment segment, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsShaderInfoEXT.set_pShaders(segment, 0L, value); }
    /// Sets `pShaders` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT pShaders(@CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsShaderInfoEXT.set_pShaders(this.segment(), value); return this; }

    /// A buffer of [VkGeneratedCommandsShaderInfoEXT].
    public static final class Buffer extends VkGeneratedCommandsShaderInfoEXT {
        private final long elementCount;

        /// Creates `VkGeneratedCommandsShaderInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGeneratedCommandsShaderInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGeneratedCommandsShaderInfoEXT`
        public VkGeneratedCommandsShaderInfoEXT asSlice(long index) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGeneratedCommandsShaderInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGeneratedCommandsShaderInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGeneratedCommandsShaderInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGeneratedCommandsShaderInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGeneratedCommandsShaderInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsShaderInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderCountAt(long index) { return VkGeneratedCommandsShaderInfoEXT.get_shaderCount(this.segment(), index); }
        /// Sets `shaderCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsShaderInfoEXT.set_shaderCount(this.segment(), index, value); return this; }

        /// {@return `pShaders` at the given index}
        /// @param index the index
        public @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment pShadersAt(long index) { return VkGeneratedCommandsShaderInfoEXT.get_pShaders(this.segment(), index); }
        /// Sets `pShaders` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pShadersAt(long index, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsShaderInfoEXT.set_pShaders(this.segment(), index, value); return this; }

    }
}
