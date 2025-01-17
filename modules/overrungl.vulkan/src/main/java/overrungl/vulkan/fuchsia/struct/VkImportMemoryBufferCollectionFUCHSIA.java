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
package overrungl.vulkan.fuchsia.struct;

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
/// ### collection
/// [VarHandle][#VH_collection] - [Getter][#collection()] - [Setter][#collection(java.lang.foreign.MemorySegment)]
/// ### index
/// [VarHandle][#VH_index] - [Getter][#index()] - [Setter][#index(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMemoryBufferCollectionFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkBufferCollectionFUCHSIA collection;
///     uint32_t index;
/// } VkImportMemoryBufferCollectionFUCHSIA;
/// ```
public sealed class VkImportMemoryBufferCollectionFUCHSIA extends Struct {
    /// The struct layout of `VkImportMemoryBufferCollectionFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `collection` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_collection = LAYOUT.arrayElementVarHandle(PathElement.groupElement("collection"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));

    /// Creates `VkImportMemoryBufferCollectionFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImportMemoryBufferCollectionFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMemoryBufferCollectionFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryBufferCollectionFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryBufferCollectionFUCHSIA(segment); }

    /// Creates `VkImportMemoryBufferCollectionFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMemoryBufferCollectionFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryBufferCollectionFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryBufferCollectionFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMemoryBufferCollectionFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportMemoryBufferCollectionFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryBufferCollectionFUCHSIA`
    public static VkImportMemoryBufferCollectionFUCHSIA alloc(SegmentAllocator allocator) { return new VkImportMemoryBufferCollectionFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMemoryBufferCollectionFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMemoryBufferCollectionFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMemoryBufferCollectionFUCHSIA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryBufferCollectionFUCHSIA`
    public static VkImportMemoryBufferCollectionFUCHSIA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment collection, @CType("uint32_t") int index) { return alloc(allocator).sType(sType).pNext(pNext).collection(collection).index(index); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMemoryBufferCollectionFUCHSIA copyFrom(VkImportMemoryBufferCollectionFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMemoryBufferCollectionFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMemoryBufferCollectionFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMemoryBufferCollectionFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryBufferCollectionFUCHSIA sType(@CType("VkStructureType") int value) { VkImportMemoryBufferCollectionFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportMemoryBufferCollectionFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportMemoryBufferCollectionFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMemoryBufferCollectionFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryBufferCollectionFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMemoryBufferCollectionFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `collection` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment get_collection(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_collection.get(segment, 0L, index); }
    /// {@return `collection`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment get_collection(MemorySegment segment) { return VkImportMemoryBufferCollectionFUCHSIA.get_collection(segment, 0L); }
    /// {@return `collection`}
    public @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment collection() { return VkImportMemoryBufferCollectionFUCHSIA.get_collection(this.segment()); }
    /// Sets `collection` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_collection(MemorySegment segment, long index, @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment value) { VH_collection.set(segment, 0L, index, value); }
    /// Sets `collection` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_collection(MemorySegment segment, @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment value) { VkImportMemoryBufferCollectionFUCHSIA.set_collection(segment, 0L, value); }
    /// Sets `collection` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryBufferCollectionFUCHSIA collection(@CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment value) { VkImportMemoryBufferCollectionFUCHSIA.set_collection(this.segment(), value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_index(MemorySegment segment) { return VkImportMemoryBufferCollectionFUCHSIA.get_index(segment, 0L); }
    /// {@return `index`}
    public @CType("uint32_t") int index() { return VkImportMemoryBufferCollectionFUCHSIA.get_index(this.segment()); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_index(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_index(MemorySegment segment, @CType("uint32_t") int value) { VkImportMemoryBufferCollectionFUCHSIA.set_index(segment, 0L, value); }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryBufferCollectionFUCHSIA index(@CType("uint32_t") int value) { VkImportMemoryBufferCollectionFUCHSIA.set_index(this.segment(), value); return this; }

    /// A buffer of [VkImportMemoryBufferCollectionFUCHSIA].
    public static final class Buffer extends VkImportMemoryBufferCollectionFUCHSIA {
        private final long elementCount;

        /// Creates `VkImportMemoryBufferCollectionFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportMemoryBufferCollectionFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportMemoryBufferCollectionFUCHSIA`
        public VkImportMemoryBufferCollectionFUCHSIA asSlice(long index) { return new VkImportMemoryBufferCollectionFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportMemoryBufferCollectionFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportMemoryBufferCollectionFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMemoryBufferCollectionFUCHSIA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMemoryBufferCollectionFUCHSIA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportMemoryBufferCollectionFUCHSIA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMemoryBufferCollectionFUCHSIA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `collection` at the given index}
        /// @param index the index
        public @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment collectionAt(long index) { return VkImportMemoryBufferCollectionFUCHSIA.get_collection(this.segment(), index); }
        /// Sets `collection` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer collectionAt(long index, @CType("VkBufferCollectionFUCHSIA") java.lang.foreign.MemorySegment value) { VkImportMemoryBufferCollectionFUCHSIA.set_collection(this.segment(), index, value); return this; }

        /// {@return `index` at the given index}
        /// @param index the index
        public @CType("uint32_t") int indexAt(long index) { return VkImportMemoryBufferCollectionFUCHSIA.get_index(this.segment(), index); }
        /// Sets `index` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexAt(long index, @CType("uint32_t") int value) { VkImportMemoryBufferCollectionFUCHSIA.set_index(this.segment(), index, value); return this; }

    }
}
