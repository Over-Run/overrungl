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
package overrungl.vulkan.khr.struct;

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
/// ### triStripVertexOrderIndependentOfProvokingVertex
/// [VarHandle][#VH_triStripVertexOrderIndependentOfProvokingVertex] - [Getter][#triStripVertexOrderIndependentOfProvokingVertex()] - [Setter][#triStripVertexOrderIndependentOfProvokingVertex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 triStripVertexOrderIndependentOfProvokingVertex;
/// } VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("triStripVertexOrderIndependentOfProvokingVertex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `triStripVertexOrderIndependentOfProvokingVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_triStripVertexOrderIndependentOfProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triStripVertexOrderIndependentOfProvokingVertex"));

    /// Creates `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int triStripVertexOrderIndependentOfProvokingVertex) { return alloc(allocator).sType(sType).pNext(pNext).triStripVertexOrderIndependentOfProvokingVertex(triStripVertexOrderIndependentOfProvokingVertex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR copyFrom(VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `triStripVertexOrderIndependentOfProvokingVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_triStripVertexOrderIndependentOfProvokingVertex(MemorySegment segment, long index) { return (int) VH_triStripVertexOrderIndependentOfProvokingVertex.get(segment, 0L, index); }
    /// {@return `triStripVertexOrderIndependentOfProvokingVertex`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_triStripVertexOrderIndependentOfProvokingVertex(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_triStripVertexOrderIndependentOfProvokingVertex(segment, 0L); }
    /// {@return `triStripVertexOrderIndependentOfProvokingVertex`}
    public @CType("VkBool32") int triStripVertexOrderIndependentOfProvokingVertex() { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_triStripVertexOrderIndependentOfProvokingVertex(this.segment()); }
    /// Sets `triStripVertexOrderIndependentOfProvokingVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_triStripVertexOrderIndependentOfProvokingVertex(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_triStripVertexOrderIndependentOfProvokingVertex.set(segment, 0L, index, value); }
    /// Sets `triStripVertexOrderIndependentOfProvokingVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_triStripVertexOrderIndependentOfProvokingVertex(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_triStripVertexOrderIndependentOfProvokingVertex(segment, 0L, value); }
    /// Sets `triStripVertexOrderIndependentOfProvokingVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR triStripVertexOrderIndependentOfProvokingVertex(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_triStripVertexOrderIndependentOfProvokingVertex(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`
        public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `triStripVertexOrderIndependentOfProvokingVertex` at the given index}
        /// @param index the index
        public @CType("VkBool32") int triStripVertexOrderIndependentOfProvokingVertexAt(long index) { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.get_triStripVertexOrderIndependentOfProvokingVertex(this.segment(), index); }
        /// Sets `triStripVertexOrderIndependentOfProvokingVertex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer triStripVertexOrderIndependentOfProvokingVertexAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.set_triStripVertexOrderIndependentOfProvokingVertex(this.segment(), index, value); return this; }

    }
}
