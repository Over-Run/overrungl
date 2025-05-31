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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBufferCollectionImageCreateInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkBufferCollectionFUCHSIA collection;
///     uint32_t index;
/// };
/// ```
public sealed class VkBufferCollectionImageCreateInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkBufferCollectionImageCreateInfoFUCHSIA`.
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

    /// Creates `VkBufferCollectionImageCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferCollectionImageCreateInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCollectionImageCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCollectionImageCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionImageCreateInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionImageCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBufferCollectionImageCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferCollectionImageCreateInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCollectionImageCreateInfoFUCHSIA`
    public static VkBufferCollectionImageCreateInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionImageCreateInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCollectionImageCreateInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCollectionImageCreateInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCollectionImageCreateInfoFUCHSIA copyFrom(VkBufferCollectionImageCreateInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkBufferCollectionImageCreateInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionImageCreateInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionImageCreateInfoFUCHSIA collection(long value) { collection(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionImageCreateInfoFUCHSIA index(int value) { index(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBufferCollectionImageCreateInfoFUCHSIA].
    public static final class Buffer extends VkBufferCollectionImageCreateInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkBufferCollectionImageCreateInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferCollectionImageCreateInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferCollectionImageCreateInfoFUCHSIA`
        public VkBufferCollectionImageCreateInfoFUCHSIA asSlice(long index) { return new VkBufferCollectionImageCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferCollectionImageCreateInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferCollectionImageCreateInfoFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `collection` at the given index}
        /// @param index the index of the struct buffer
        public long collectionAt(long index) { return collection(this.segment(), index); }
        /// Sets `collection` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer collectionAt(long index, long value) { collection(this.segment(), index, value); return this; }

        /// {@return `index` at the given index}
        /// @param index the index of the struct buffer
        public int indexAt(long index) { return index(this.segment(), index); }
        /// Sets `index` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer indexAt(long index, int value) { index(this.segment(), index, value); return this; }

    }
}
