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
/// ### components
/// [Byte offset][#OFFSET_components] - [Memory layout][#ML_components] - [Getter][#components()] - [Setter][#components(MemorySegment)]
/// ### srgb
/// [VarHandle][#VH_srgb] - [Getter][#srgb()] - [Setter][#srgb(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkComponentMapping components;
///     VkBool32 srgb;
/// } VkSamplerBorderColorComponentMappingCreateInfoEXT;
/// ```
public sealed class VkSamplerBorderColorComponentMappingCreateInfoEXT extends Struct {
    /// The struct layout of `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("srgb")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `components`.
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    /// The memory layout of `components`.
    public static final MemoryLayout ML_components = LAYOUT.select(PathElement.groupElement("components"));
    /// The [VarHandle] of `srgb` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srgb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srgb"));

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkComponentMapping") MemorySegment components, @CType("VkBool32") int srgb) { return alloc(allocator).sType(sType).pNext(pNext).components(components).srgb(srgb); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT copyFrom(VkSamplerBorderColorComponentMappingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType(@CType("VkStructureType") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `components` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") MemorySegment get_components(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_components, index), ML_components); }
    /// {@return `components`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") MemorySegment get_components(MemorySegment segment) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_components(segment, 0L); }
    /// {@return `components`}
    public @CType("VkComponentMapping") MemorySegment components() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_components(this.segment()); }
    /// Sets `components` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_components(MemorySegment segment, long index, @CType("VkComponentMapping") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_components, index), ML_components.byteSize()); }
    /// Sets `components` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_components(MemorySegment segment, @CType("VkComponentMapping") MemorySegment value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_components(segment, 0L, value); }
    /// Sets `components` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(@CType("VkComponentMapping") MemorySegment value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_components(this.segment(), value); return this; }

    /// {@return `srgb` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_srgb(MemorySegment segment, long index) { return (int) VH_srgb.get(segment, 0L, index); }
    /// {@return `srgb`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_srgb(MemorySegment segment) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_srgb(segment, 0L); }
    /// {@return `srgb`}
    public @CType("VkBool32") int srgb() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_srgb(this.segment()); }
    /// Sets `srgb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srgb(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_srgb.set(segment, 0L, index, value); }
    /// Sets `srgb` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srgb(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_srgb(segment, 0L, value); }
    /// Sets `srgb` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(@CType("VkBool32") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_srgb(this.segment(), value); return this; }

    /// A buffer of [VkSamplerBorderColorComponentMappingCreateInfoEXT].
    public static final class Buffer extends VkSamplerBorderColorComponentMappingCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`
        public VkSamplerBorderColorComponentMappingCreateInfoEXT asSlice(long index) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `components` at the given index}
        /// @param index the index
        public @CType("VkComponentMapping") MemorySegment componentsAt(long index) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_components(this.segment(), index); }
        /// Sets `components` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer componentsAt(long index, @CType("VkComponentMapping") MemorySegment value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_components(this.segment(), index, value); return this; }

        /// {@return `srgb` at the given index}
        /// @param index the index
        public @CType("VkBool32") int srgbAt(long index) { return VkSamplerBorderColorComponentMappingCreateInfoEXT.get_srgb(this.segment(), index); }
        /// Sets `srgb` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srgbAt(long index, @CType("VkBool32") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.set_srgb(this.segment(), index, value); return this; }

    }
}
