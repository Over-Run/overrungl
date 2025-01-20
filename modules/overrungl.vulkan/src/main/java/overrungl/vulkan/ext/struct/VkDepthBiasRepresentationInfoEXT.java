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
/// ### depthBiasRepresentation
/// [VarHandle][#VH_depthBiasRepresentation] - [Getter][#depthBiasRepresentation()] - [Setter][#depthBiasRepresentation(int)]
/// ### depthBiasExact
/// [VarHandle][#VH_depthBiasExact] - [Getter][#depthBiasExact()] - [Setter][#depthBiasExact(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDepthBiasRepresentationInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDepthBiasRepresentationEXT depthBiasRepresentation;
///     VkBool32 depthBiasExact;
/// } VkDepthBiasRepresentationInfoEXT;
/// ```
public sealed class VkDepthBiasRepresentationInfoEXT extends Struct {
    /// The struct layout of `VkDepthBiasRepresentationInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `depthBiasRepresentation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBiasRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasRepresentation"));
    /// The [VarHandle] of `depthBiasExact` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBiasExact = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasExact"));

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDepthBiasRepresentationInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasRepresentationInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasRepresentationInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDepthBiasRepresentationInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthBiasRepresentationInfoEXT`
    public static VkDepthBiasRepresentationInfoEXT alloc(SegmentAllocator allocator) { return new VkDepthBiasRepresentationInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDepthBiasRepresentationInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDepthBiasRepresentationInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDepthBiasRepresentationInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthBiasRepresentationInfoEXT`
    public static VkDepthBiasRepresentationInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDepthBiasRepresentationEXT") int depthBiasRepresentation, @CType("VkBool32") int depthBiasExact) { return alloc(allocator).sType(sType).pNext(pNext).depthBiasRepresentation(depthBiasRepresentation).depthBiasExact(depthBiasExact); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT copyFrom(VkDepthBiasRepresentationInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDepthBiasRepresentationInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDepthBiasRepresentationInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDepthBiasRepresentationInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT sType(@CType("VkStructureType") int value) { VkDepthBiasRepresentationInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDepthBiasRepresentationInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDepthBiasRepresentationInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDepthBiasRepresentationInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT pNext(@CType("const void *") MemorySegment value) { VkDepthBiasRepresentationInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `depthBiasRepresentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDepthBiasRepresentationEXT") int get_depthBiasRepresentation(MemorySegment segment, long index) { return (int) VH_depthBiasRepresentation.get(segment, 0L, index); }
    /// {@return `depthBiasRepresentation`}
    /// @param segment the segment of the struct
    public static @CType("VkDepthBiasRepresentationEXT") int get_depthBiasRepresentation(MemorySegment segment) { return VkDepthBiasRepresentationInfoEXT.get_depthBiasRepresentation(segment, 0L); }
    /// {@return `depthBiasRepresentation`}
    public @CType("VkDepthBiasRepresentationEXT") int depthBiasRepresentation() { return VkDepthBiasRepresentationInfoEXT.get_depthBiasRepresentation(this.segment()); }
    /// Sets `depthBiasRepresentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasRepresentation(MemorySegment segment, long index, @CType("VkDepthBiasRepresentationEXT") int value) { VH_depthBiasRepresentation.set(segment, 0L, index, value); }
    /// Sets `depthBiasRepresentation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasRepresentation(MemorySegment segment, @CType("VkDepthBiasRepresentationEXT") int value) { VkDepthBiasRepresentationInfoEXT.set_depthBiasRepresentation(segment, 0L, value); }
    /// Sets `depthBiasRepresentation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentation(@CType("VkDepthBiasRepresentationEXT") int value) { VkDepthBiasRepresentationInfoEXT.set_depthBiasRepresentation(this.segment(), value); return this; }

    /// {@return `depthBiasExact` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBiasExact(MemorySegment segment, long index) { return (int) VH_depthBiasExact.get(segment, 0L, index); }
    /// {@return `depthBiasExact`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBiasExact(MemorySegment segment) { return VkDepthBiasRepresentationInfoEXT.get_depthBiasExact(segment, 0L); }
    /// {@return `depthBiasExact`}
    public @CType("VkBool32") int depthBiasExact() { return VkDepthBiasRepresentationInfoEXT.get_depthBiasExact(this.segment()); }
    /// Sets `depthBiasExact` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasExact(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBiasExact.set(segment, 0L, index, value); }
    /// Sets `depthBiasExact` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasExact(MemorySegment segment, @CType("VkBool32") int value) { VkDepthBiasRepresentationInfoEXT.set_depthBiasExact(segment, 0L, value); }
    /// Sets `depthBiasExact` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT depthBiasExact(@CType("VkBool32") int value) { VkDepthBiasRepresentationInfoEXT.set_depthBiasExact(this.segment(), value); return this; }

    /// A buffer of [VkDepthBiasRepresentationInfoEXT].
    public static final class Buffer extends VkDepthBiasRepresentationInfoEXT {
        private final long elementCount;

        /// Creates `VkDepthBiasRepresentationInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDepthBiasRepresentationInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDepthBiasRepresentationInfoEXT`
        public VkDepthBiasRepresentationInfoEXT asSlice(long index) { return new VkDepthBiasRepresentationInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDepthBiasRepresentationInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDepthBiasRepresentationInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDepthBiasRepresentationInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDepthBiasRepresentationInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDepthBiasRepresentationInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDepthBiasRepresentationInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `depthBiasRepresentation` at the given index}
        /// @param index the index
        public @CType("VkDepthBiasRepresentationEXT") int depthBiasRepresentationAt(long index) { return VkDepthBiasRepresentationInfoEXT.get_depthBiasRepresentation(this.segment(), index); }
        /// Sets `depthBiasRepresentation` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasRepresentationAt(long index, @CType("VkDepthBiasRepresentationEXT") int value) { VkDepthBiasRepresentationInfoEXT.set_depthBiasRepresentation(this.segment(), index, value); return this; }

        /// {@return `depthBiasExact` at the given index}
        /// @param index the index
        public @CType("VkBool32") int depthBiasExactAt(long index) { return VkDepthBiasRepresentationInfoEXT.get_depthBiasExact(this.segment(), index); }
        /// Sets `depthBiasExact` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasExactAt(long index, @CType("VkBool32") int value) { VkDepthBiasRepresentationInfoEXT.set_depthBiasExact(this.segment(), index, value); return this; }

    }
}
