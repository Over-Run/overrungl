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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBufferCollectionBufferCreateInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkBufferCollectionFUCHSIA collection;
///     uint32_t index;
/// };
/// ```
public final class VkBufferCollectionBufferCreateInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkBufferCollectionBufferCreateInfoFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
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
    /// The byte offset of `collection`.
    public static final long OFFSET_collection = LAYOUT.byteOffset(PathElement.groupElement("collection"));
    /// The memory layout of `collection`.
    public static final MemoryLayout LAYOUT_collection = LAYOUT.select(PathElement.groupElement("collection"));
    /// The [VarHandle] of `collection` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_collection = LAYOUT.arrayElementVarHandle(PathElement.groupElement("collection"));
    /// The byte offset of `index`.
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    /// The memory layout of `index`.
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));

    /// Creates `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBufferCollectionBufferCreateInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionBufferCreateInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionBufferCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionBufferCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionBufferCreateInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferCollectionBufferCreateInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param collection `collection`
    /// @param index `index`
    /// @return the allocated `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long collection, int index) {
        return alloc(allocator).sType(sType).pNext(pNext).collection(collection).index(index);
    }

    /// Allocates a `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param collection `collection`
    /// @return the allocated `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long collection) {
        return alloc(allocator).sType(sType).pNext(pNext).collection(collection);
    }

    /// Allocates a `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBufferCollectionBufferCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA copyFrom(VkBufferCollectionBufferCreateInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBufferCollectionBufferCreateInfoFUCHSIA reinterpret(long count) { return new VkBufferCollectionBufferCreateInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBufferCollectionBufferCreateInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionBufferCreateInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `collection` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long collection(MemorySegment segment, long index) { return (long) VH_collection.get(segment, 0L, index); }
    /// {@return `collection`}
    public long collection() { return collection(this.segment(), 0L); }
    /// Sets `collection` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void collection(MemorySegment segment, long index, long value) { VH_collection.set(segment, 0L, index, value); }
    /// Sets `collection` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA collection(long value) { collection(this.segment(), 0L, value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    public int index() { return index(this.segment(), 0L); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void index(MemorySegment segment, long index, int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA index(int value) { index(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBufferCollectionBufferCreateInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public VkBufferCollectionBufferCreateInfoFUCHSIA asSlice(long index) { return new VkBufferCollectionBufferCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBufferCollectionBufferCreateInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferCollectionBufferCreateInfoFUCHSIA`
    public VkBufferCollectionBufferCreateInfoFUCHSIA asSlice(long index, long count) { return new VkBufferCollectionBufferCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBufferCollectionBufferCreateInfoFUCHSIA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA at(long index, Consumer<VkBufferCollectionBufferCreateInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `collection` at the given index}
    /// @param index the index of the struct buffer
    public long collectionAt(long index) { return collection(this.segment(), index); }
    /// Sets `collection` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA collectionAt(long index, long value) { collection(this.segment(), index, value); return this; }

    /// {@return `index` at the given index}
    /// @param index the index of the struct buffer
    public int indexAt(long index) { return index(this.segment(), index); }
    /// Sets `index` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionBufferCreateInfoFUCHSIA indexAt(long index, int value) { index(this.segment(), index, value); return this; }

}
