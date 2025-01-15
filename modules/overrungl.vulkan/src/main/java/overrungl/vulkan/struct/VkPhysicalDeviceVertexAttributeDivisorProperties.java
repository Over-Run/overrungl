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
/// ### maxVertexAttribDivisor
/// [VarHandle][#VH_maxVertexAttribDivisor] - [Getter][#maxVertexAttribDivisor()] - [Setter][#maxVertexAttribDivisor(int)]
/// ### supportsNonZeroFirstInstance
/// [VarHandle][#VH_supportsNonZeroFirstInstance] - [Getter][#supportsNonZeroFirstInstance()] - [Setter][#supportsNonZeroFirstInstance(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVertexAttributeDivisorProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxVertexAttribDivisor;
///     VkBool32 supportsNonZeroFirstInstance;
/// } VkPhysicalDeviceVertexAttributeDivisorProperties;
/// ```
public sealed class VkPhysicalDeviceVertexAttributeDivisorProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceVertexAttributeDivisorProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxVertexAttribDivisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The [VarHandle] of `supportsNonZeroFirstInstance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVertexAttributeDivisorProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorProperties(segment); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxVertexAttribDivisor, @CType("VkBool32") int supportsNonZeroFirstInstance) { return alloc(allocator).sType(sType).pNext(pNext).maxVertexAttribDivisor(maxVertexAttribDivisor).supportsNonZeroFirstInstance(supportsNonZeroFirstInstance); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties copyFrom(VkPhysicalDeviceVertexAttributeDivisorProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexAttribDivisor(MemorySegment segment, long index) { return (int) VH_maxVertexAttribDivisor.get(segment, 0L, index); }
    /// {@return `maxVertexAttribDivisor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexAttribDivisor(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_maxVertexAttribDivisor(segment, 0L); }
    /// {@return `maxVertexAttribDivisor`}
    public @CType("uint32_t") int maxVertexAttribDivisor() { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_maxVertexAttribDivisor(this.segment()); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexAttribDivisor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexAttribDivisor.set(segment, 0L, index, value); }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexAttribDivisor(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_maxVertexAttribDivisor(segment, 0L, value); }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties maxVertexAttribDivisor(@CType("uint32_t") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_maxVertexAttribDivisor(this.segment(), value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_supportsNonZeroFirstInstance(MemorySegment segment, long index) { return (int) VH_supportsNonZeroFirstInstance.get(segment, 0L, index); }
    /// {@return `supportsNonZeroFirstInstance`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_supportsNonZeroFirstInstance(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_supportsNonZeroFirstInstance(segment, 0L); }
    /// {@return `supportsNonZeroFirstInstance`}
    public @CType("VkBool32") int supportsNonZeroFirstInstance() { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_supportsNonZeroFirstInstance(this.segment()); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportsNonZeroFirstInstance(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_supportsNonZeroFirstInstance.set(segment, 0L, index, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportsNonZeroFirstInstance(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_supportsNonZeroFirstInstance(segment, 0L, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties supportsNonZeroFirstInstance(@CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_supportsNonZeroFirstInstance(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceVertexAttributeDivisorProperties].
    public static final class Buffer extends VkPhysicalDeviceVertexAttributeDivisorProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`
        public VkPhysicalDeviceVertexAttributeDivisorProperties asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxVertexAttribDivisor` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexAttribDivisorAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_maxVertexAttribDivisor(this.segment(), index); }
        /// Sets `maxVertexAttribDivisor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexAttribDivisorAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_maxVertexAttribDivisor(this.segment(), index, value); return this; }

        /// {@return `supportsNonZeroFirstInstance` at the given index}
        /// @param index the index
        public @CType("VkBool32") int supportsNonZeroFirstInstanceAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorProperties.get_supportsNonZeroFirstInstance(this.segment(), index); }
        /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportsNonZeroFirstInstanceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorProperties.set_supportsNonZeroFirstInstance(this.segment(), index, value); return this; }

    }
}
