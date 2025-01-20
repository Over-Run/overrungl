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
/// ### primitivesGeneratedQuery
/// [VarHandle][#VH_primitivesGeneratedQuery] - [Getter][#primitivesGeneratedQuery()] - [Setter][#primitivesGeneratedQuery(int)]
/// ### primitivesGeneratedQueryWithRasterizerDiscard
/// [VarHandle][#VH_primitivesGeneratedQueryWithRasterizerDiscard] - [Getter][#primitivesGeneratedQueryWithRasterizerDiscard()] - [Setter][#primitivesGeneratedQueryWithRasterizerDiscard(int)]
/// ### primitivesGeneratedQueryWithNonZeroStreams
/// [VarHandle][#VH_primitivesGeneratedQueryWithNonZeroStreams] - [Getter][#primitivesGeneratedQueryWithNonZeroStreams()] - [Setter][#primitivesGeneratedQueryWithNonZeroStreams(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 primitivesGeneratedQuery;
///     VkBool32 primitivesGeneratedQueryWithRasterizerDiscard;
///     VkBool32 primitivesGeneratedQueryWithNonZeroStreams;
/// } VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT;
/// ```
public sealed class VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQuery"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithRasterizerDiscard"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithNonZeroStreams")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `primitivesGeneratedQuery` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitivesGeneratedQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQuery"));
    /// The [VarHandle] of `primitivesGeneratedQueryWithRasterizerDiscard` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    /// The [VarHandle] of `primitivesGeneratedQueryWithNonZeroStreams` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int primitivesGeneratedQuery, @CType("VkBool32") int primitivesGeneratedQueryWithRasterizerDiscard, @CType("VkBool32") int primitivesGeneratedQueryWithNonZeroStreams) { return alloc(allocator).sType(sType).pNext(pNext).primitivesGeneratedQuery(primitivesGeneratedQuery).primitivesGeneratedQueryWithRasterizerDiscard(primitivesGeneratedQueryWithRasterizerDiscard).primitivesGeneratedQueryWithNonZeroStreams(primitivesGeneratedQueryWithNonZeroStreams); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT copyFrom(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `primitivesGeneratedQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitivesGeneratedQuery(MemorySegment segment, long index) { return (int) VH_primitivesGeneratedQuery.get(segment, 0L, index); }
    /// {@return `primitivesGeneratedQuery`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitivesGeneratedQuery(MemorySegment segment) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQuery(segment, 0L); }
    /// {@return `primitivesGeneratedQuery`}
    public @CType("VkBool32") int primitivesGeneratedQuery() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQuery(this.segment()); }
    /// Sets `primitivesGeneratedQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitivesGeneratedQuery(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitivesGeneratedQuery.set(segment, 0L, index, value); }
    /// Sets `primitivesGeneratedQuery` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitivesGeneratedQuery(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQuery(segment, 0L, value); }
    /// Sets `primitivesGeneratedQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQuery(@CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQuery(this.segment(), value); return this; }

    /// {@return `primitivesGeneratedQueryWithRasterizerDiscard` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment segment, long index) { return (int) VH_primitivesGeneratedQueryWithRasterizerDiscard.get(segment, 0L, index); }
    /// {@return `primitivesGeneratedQueryWithRasterizerDiscard`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment segment) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQueryWithRasterizerDiscard(segment, 0L); }
    /// {@return `primitivesGeneratedQueryWithRasterizerDiscard`}
    public @CType("VkBool32") int primitivesGeneratedQueryWithRasterizerDiscard() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQueryWithRasterizerDiscard(this.segment()); }
    /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitivesGeneratedQueryWithRasterizerDiscard.set(segment, 0L, index, value); }
    /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQueryWithRasterizerDiscard(segment, 0L, value); }
    /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscard(@CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), value); return this; }

    /// {@return `primitivesGeneratedQueryWithNonZeroStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitivesGeneratedQueryWithNonZeroStreams(MemorySegment segment, long index) { return (int) VH_primitivesGeneratedQueryWithNonZeroStreams.get(segment, 0L, index); }
    /// {@return `primitivesGeneratedQueryWithNonZeroStreams`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitivesGeneratedQueryWithNonZeroStreams(MemorySegment segment) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQueryWithNonZeroStreams(segment, 0L); }
    /// {@return `primitivesGeneratedQueryWithNonZeroStreams`}
    public @CType("VkBool32") int primitivesGeneratedQueryWithNonZeroStreams() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQueryWithNonZeroStreams(this.segment()); }
    /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitivesGeneratedQueryWithNonZeroStreams(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitivesGeneratedQueryWithNonZeroStreams.set(segment, 0L, index, value); }
    /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitivesGeneratedQueryWithNonZeroStreams(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQueryWithNonZeroStreams(segment, 0L, value); }
    /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreams(@CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQueryWithNonZeroStreams(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT].
    public static final class Buffer extends VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `primitivesGeneratedQuery` at the given index}
        /// @param index the index
        public @CType("VkBool32") int primitivesGeneratedQueryAt(long index) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQuery(this.segment(), index); }
        /// Sets `primitivesGeneratedQuery` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitivesGeneratedQueryAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQuery(this.segment(), index, value); return this; }

        /// {@return `primitivesGeneratedQueryWithRasterizerDiscard` at the given index}
        /// @param index the index
        public @CType("VkBool32") int primitivesGeneratedQueryWithRasterizerDiscardAt(long index) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), index); }
        /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitivesGeneratedQueryWithRasterizerDiscardAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), index, value); return this; }

        /// {@return `primitivesGeneratedQueryWithNonZeroStreams` at the given index}
        /// @param index the index
        public @CType("VkBool32") int primitivesGeneratedQueryWithNonZeroStreamsAt(long index) { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.get_primitivesGeneratedQueryWithNonZeroStreams(this.segment(), index); }
        /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitivesGeneratedQueryWithNonZeroStreamsAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.set_primitivesGeneratedQueryWithNonZeroStreams(this.segment(), index, value); return this; }

    }
}
