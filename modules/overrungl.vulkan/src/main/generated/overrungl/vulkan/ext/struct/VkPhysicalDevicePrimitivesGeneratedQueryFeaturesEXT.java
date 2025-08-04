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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 primitivesGeneratedQuery;
///     (uint32_t) VkBool32 primitivesGeneratedQueryWithRasterizerDiscard;
///     (uint32_t) VkBool32 primitivesGeneratedQueryWithNonZeroStreams;
/// };
/// ```
public final class VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQuery"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithRasterizerDiscard"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithNonZeroStreams")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `primitivesGeneratedQuery`.
    public static final long OFFSET_primitivesGeneratedQuery = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQuery"));
    /// The memory layout of `primitivesGeneratedQuery`.
    public static final MemoryLayout LAYOUT_primitivesGeneratedQuery = LAYOUT.select(PathElement.groupElement("primitivesGeneratedQuery"));
    /// The [VarHandle] of `primitivesGeneratedQuery` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitivesGeneratedQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQuery"));
    /// The byte offset of `primitivesGeneratedQueryWithRasterizerDiscard`.
    public static final long OFFSET_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    /// The memory layout of `primitivesGeneratedQueryWithRasterizerDiscard`.
    public static final MemoryLayout LAYOUT_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.select(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    /// The [VarHandle] of `primitivesGeneratedQueryWithRasterizerDiscard` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    /// The byte offset of `primitivesGeneratedQueryWithNonZeroStreams`.
    public static final long OFFSET_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));
    /// The memory layout of `primitivesGeneratedQueryWithNonZeroStreams`.
    public static final MemoryLayout LAYOUT_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.select(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));
    /// The [VarHandle] of `primitivesGeneratedQueryWithNonZeroStreams` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT copyFrom(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `primitivesGeneratedQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitivesGeneratedQuery(MemorySegment segment, long index) { return (int) VH_primitivesGeneratedQuery.get(segment, 0L, index); }
    /// {@return `primitivesGeneratedQuery`}
    public int primitivesGeneratedQuery() { return primitivesGeneratedQuery(this.segment(), 0L); }
    /// Sets `primitivesGeneratedQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitivesGeneratedQuery(MemorySegment segment, long index, int value) { VH_primitivesGeneratedQuery.set(segment, 0L, index, value); }
    /// Sets `primitivesGeneratedQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQuery(int value) { primitivesGeneratedQuery(this.segment(), 0L, value); return this; }

    /// {@return `primitivesGeneratedQueryWithRasterizerDiscard` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment segment, long index) { return (int) VH_primitivesGeneratedQueryWithRasterizerDiscard.get(segment, 0L, index); }
    /// {@return `primitivesGeneratedQueryWithRasterizerDiscard`}
    public int primitivesGeneratedQueryWithRasterizerDiscard() { return primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), 0L); }
    /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment segment, long index, int value) { VH_primitivesGeneratedQueryWithRasterizerDiscard.set(segment, 0L, index, value); }
    /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscard(int value) { primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), 0L, value); return this; }

    /// {@return `primitivesGeneratedQueryWithNonZeroStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitivesGeneratedQueryWithNonZeroStreams(MemorySegment segment, long index) { return (int) VH_primitivesGeneratedQueryWithNonZeroStreams.get(segment, 0L, index); }
    /// {@return `primitivesGeneratedQueryWithNonZeroStreams`}
    public int primitivesGeneratedQueryWithNonZeroStreams() { return primitivesGeneratedQueryWithNonZeroStreams(this.segment(), 0L); }
    /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitivesGeneratedQueryWithNonZeroStreams(MemorySegment segment, long index, int value) { VH_primitivesGeneratedQueryWithNonZeroStreams.set(segment, 0L, index, value); }
    /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreams(int value) { primitivesGeneratedQueryWithNonZeroStreams(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT at(long index, Consumer<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `primitivesGeneratedQuery` at the given index}
    /// @param index the index of the struct buffer
    public int primitivesGeneratedQueryAt(long index) { return primitivesGeneratedQuery(this.segment(), index); }
    /// Sets `primitivesGeneratedQuery` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryAt(long index, int value) { primitivesGeneratedQuery(this.segment(), index, value); return this; }

    /// {@return `primitivesGeneratedQueryWithRasterizerDiscard` at the given index}
    /// @param index the index of the struct buffer
    public int primitivesGeneratedQueryWithRasterizerDiscardAt(long index) { return primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), index); }
    /// Sets `primitivesGeneratedQueryWithRasterizerDiscard` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscardAt(long index, int value) { primitivesGeneratedQueryWithRasterizerDiscard(this.segment(), index, value); return this; }

    /// {@return `primitivesGeneratedQueryWithNonZeroStreams` at the given index}
    /// @param index the index of the struct buffer
    public int primitivesGeneratedQueryWithNonZeroStreamsAt(long index) { return primitivesGeneratedQueryWithNonZeroStreams(this.segment(), index); }
    /// Sets `primitivesGeneratedQueryWithNonZeroStreams` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreamsAt(long index, int value) { primitivesGeneratedQueryWithNonZeroStreams(this.segment(), index, value); return this; }

}
