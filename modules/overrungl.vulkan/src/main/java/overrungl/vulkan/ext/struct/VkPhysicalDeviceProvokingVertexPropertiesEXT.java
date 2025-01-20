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
/// ### provokingVertexModePerPipeline
/// [VarHandle][#VH_provokingVertexModePerPipeline] - [Getter][#provokingVertexModePerPipeline()] - [Setter][#provokingVertexModePerPipeline(int)]
/// ### transformFeedbackPreservesTriangleFanProvokingVertex
/// [VarHandle][#VH_transformFeedbackPreservesTriangleFanProvokingVertex] - [Getter][#transformFeedbackPreservesTriangleFanProvokingVertex()] - [Setter][#transformFeedbackPreservesTriangleFanProvokingVertex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceProvokingVertexPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 provokingVertexModePerPipeline;
///     VkBool32 transformFeedbackPreservesTriangleFanProvokingVertex;
/// } VkPhysicalDeviceProvokingVertexPropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceProvokingVertexPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexModePerPipeline"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `provokingVertexModePerPipeline` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_provokingVertexModePerPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("provokingVertexModePerPipeline"));
    /// The [VarHandle] of `transformFeedbackPreservesTriangleFanProvokingVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceProvokingVertexPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int provokingVertexModePerPipeline, @CType("VkBool32") int transformFeedbackPreservesTriangleFanProvokingVertex) { return alloc(allocator).sType(sType).pNext(pNext).provokingVertexModePerPipeline(provokingVertexModePerPipeline).transformFeedbackPreservesTriangleFanProvokingVertex(transformFeedbackPreservesTriangleFanProvokingVertex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT copyFrom(VkPhysicalDeviceProvokingVertexPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `provokingVertexModePerPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_provokingVertexModePerPipeline(MemorySegment segment, long index) { return (int) VH_provokingVertexModePerPipeline.get(segment, 0L, index); }
    /// {@return `provokingVertexModePerPipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_provokingVertexModePerPipeline(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_provokingVertexModePerPipeline(segment, 0L); }
    /// {@return `provokingVertexModePerPipeline`}
    public @CType("VkBool32") int provokingVertexModePerPipeline() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_provokingVertexModePerPipeline(this.segment()); }
    /// Sets `provokingVertexModePerPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_provokingVertexModePerPipeline(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_provokingVertexModePerPipeline.set(segment, 0L, index, value); }
    /// Sets `provokingVertexModePerPipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_provokingVertexModePerPipeline(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_provokingVertexModePerPipeline(segment, 0L, value); }
    /// Sets `provokingVertexModePerPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT provokingVertexModePerPipeline(@CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_provokingVertexModePerPipeline(this.segment(), value); return this; }

    /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment segment, long index) { return (int) VH_transformFeedbackPreservesTriangleFanProvokingVertex.get(segment, 0L, index); }
    /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_transformFeedbackPreservesTriangleFanProvokingVertex(segment, 0L); }
    /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex`}
    public @CType("VkBool32") int transformFeedbackPreservesTriangleFanProvokingVertex() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_transformFeedbackPreservesTriangleFanProvokingVertex(this.segment()); }
    /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedbackPreservesTriangleFanProvokingVertex.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_transformFeedbackPreservesTriangleFanProvokingVertex(segment, 0L, value); }
    /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT transformFeedbackPreservesTriangleFanProvokingVertex(@CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceProvokingVertexPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceProvokingVertexPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`
        public VkPhysicalDeviceProvokingVertexPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `provokingVertexModePerPipeline` at the given index}
        /// @param index the index
        public @CType("VkBool32") int provokingVertexModePerPipelineAt(long index) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_provokingVertexModePerPipeline(this.segment(), index); }
        /// Sets `provokingVertexModePerPipeline` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer provokingVertexModePerPipelineAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_provokingVertexModePerPipeline(this.segment(), index, value); return this; }

        /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex` at the given index}
        /// @param index the index
        public @CType("VkBool32") int transformFeedbackPreservesTriangleFanProvokingVertexAt(long index) { return VkPhysicalDeviceProvokingVertexPropertiesEXT.get_transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), index); }
        /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformFeedbackPreservesTriangleFanProvokingVertexAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.set_transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), index, value); return this; }

    }
}
