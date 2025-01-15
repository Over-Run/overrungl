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
/// ### legacyVertexAttributes
/// [VarHandle][#VH_legacyVertexAttributes] - [Getter][#legacyVertexAttributes()] - [Setter][#legacyVertexAttributes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 legacyVertexAttributes;
/// } VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("legacyVertexAttributes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `legacyVertexAttributes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_legacyVertexAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("legacyVertexAttributes"));

    /// Creates `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int legacyVertexAttributes) { return alloc(allocator).sType(sType).pNext(pNext).legacyVertexAttributes(legacyVertexAttributes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT copyFrom(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `legacyVertexAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_legacyVertexAttributes(MemorySegment segment, long index) { return (int) VH_legacyVertexAttributes.get(segment, 0L, index); }
    /// {@return `legacyVertexAttributes`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_legacyVertexAttributes(MemorySegment segment) { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_legacyVertexAttributes(segment, 0L); }
    /// {@return `legacyVertexAttributes`}
    public @CType("VkBool32") int legacyVertexAttributes() { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_legacyVertexAttributes(this.segment()); }
    /// Sets `legacyVertexAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_legacyVertexAttributes(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_legacyVertexAttributes.set(segment, 0L, index, value); }
    /// Sets `legacyVertexAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_legacyVertexAttributes(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_legacyVertexAttributes(segment, 0L, value); }
    /// Sets `legacyVertexAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT legacyVertexAttributes(@CType("VkBool32") int value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_legacyVertexAttributes(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`
        public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `legacyVertexAttributes` at the given index}
        /// @param index the index
        public @CType("VkBool32") int legacyVertexAttributesAt(long index) { return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.get_legacyVertexAttributes(this.segment(), index); }
        /// Sets `legacyVertexAttributes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer legacyVertexAttributesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.set_legacyVertexAttributes(this.segment(), index, value); return this; }

    }
}
