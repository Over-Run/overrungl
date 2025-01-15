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
/// ### provokingVertexLast
/// [VarHandle][#VH_provokingVertexLast] - [Getter][#provokingVertexLast()] - [Setter][#provokingVertexLast(int)]
/// ### transformFeedbackPreservesProvokingVertex
/// [VarHandle][#VH_transformFeedbackPreservesProvokingVertex] - [Getter][#transformFeedbackPreservesProvokingVertex()] - [Setter][#transformFeedbackPreservesProvokingVertex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceProvokingVertexFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 provokingVertexLast;
///     VkBool32 transformFeedbackPreservesProvokingVertex;
/// } VkPhysicalDeviceProvokingVertexFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceProvokingVertexFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceProvokingVertexFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexLast"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `provokingVertexLast` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_provokingVertexLast = LAYOUT.arrayElementVarHandle(PathElement.groupElement("provokingVertexLast"));
    /// The [VarHandle] of `transformFeedbackPreservesProvokingVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedbackPreservesProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));

    /// Creates `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProvokingVertexFeaturesEXT`
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProvokingVertexFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProvokingVertexFeaturesEXT`
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int provokingVertexLast, @CType("VkBool32") int transformFeedbackPreservesProvokingVertex) { return alloc(allocator).sType(sType).pNext(pNext).provokingVertexLast(provokingVertexLast).transformFeedbackPreservesProvokingVertex(transformFeedbackPreservesProvokingVertex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexFeaturesEXT copyFrom(VkPhysicalDeviceProvokingVertexFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `provokingVertexLast` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_provokingVertexLast(MemorySegment segment, long index) { return (int) VH_provokingVertexLast.get(segment, 0L, index); }
    /// {@return `provokingVertexLast`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_provokingVertexLast(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_provokingVertexLast(segment, 0L); }
    /// {@return `provokingVertexLast`}
    public @CType("VkBool32") int provokingVertexLast() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_provokingVertexLast(this.segment()); }
    /// Sets `provokingVertexLast` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_provokingVertexLast(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_provokingVertexLast.set(segment, 0L, index, value); }
    /// Sets `provokingVertexLast` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_provokingVertexLast(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_provokingVertexLast(segment, 0L, value); }
    /// Sets `provokingVertexLast` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexFeaturesEXT provokingVertexLast(@CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_provokingVertexLast(this.segment(), value); return this; }

    /// {@return `transformFeedbackPreservesProvokingVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedbackPreservesProvokingVertex(MemorySegment segment, long index) { return (int) VH_transformFeedbackPreservesProvokingVertex.get(segment, 0L, index); }
    /// {@return `transformFeedbackPreservesProvokingVertex`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedbackPreservesProvokingVertex(MemorySegment segment) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_transformFeedbackPreservesProvokingVertex(segment, 0L); }
    /// {@return `transformFeedbackPreservesProvokingVertex`}
    public @CType("VkBool32") int transformFeedbackPreservesProvokingVertex() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_transformFeedbackPreservesProvokingVertex(this.segment()); }
    /// Sets `transformFeedbackPreservesProvokingVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedbackPreservesProvokingVertex(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedbackPreservesProvokingVertex.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackPreservesProvokingVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedbackPreservesProvokingVertex(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_transformFeedbackPreservesProvokingVertex(segment, 0L, value); }
    /// Sets `transformFeedbackPreservesProvokingVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexFeaturesEXT transformFeedbackPreservesProvokingVertex(@CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_transformFeedbackPreservesProvokingVertex(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceProvokingVertexFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceProvokingVertexFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceProvokingVertexFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceProvokingVertexFeaturesEXT`
        public VkPhysicalDeviceProvokingVertexFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceProvokingVertexFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceProvokingVertexFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `provokingVertexLast` at the given index}
        /// @param index the index
        public @CType("VkBool32") int provokingVertexLastAt(long index) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_provokingVertexLast(this.segment(), index); }
        /// Sets `provokingVertexLast` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer provokingVertexLastAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_provokingVertexLast(this.segment(), index, value); return this; }

        /// {@return `transformFeedbackPreservesProvokingVertex` at the given index}
        /// @param index the index
        public @CType("VkBool32") int transformFeedbackPreservesProvokingVertexAt(long index) { return VkPhysicalDeviceProvokingVertexFeaturesEXT.get_transformFeedbackPreservesProvokingVertex(this.segment(), index); }
        /// Sets `transformFeedbackPreservesProvokingVertex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformFeedbackPreservesProvokingVertexAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.set_transformFeedbackPreservesProvokingVertex(this.segment(), index, value); return this; }

    }
}
