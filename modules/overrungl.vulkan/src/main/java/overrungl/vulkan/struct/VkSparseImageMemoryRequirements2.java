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
/// ### memoryRequirements
/// [Byte offset][#OFFSET_memoryRequirements] - [Memory layout][#ML_memoryRequirements] - [Getter][#memoryRequirements()] - [Setter][#memoryRequirements(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseImageMemoryRequirements2 {
///     VkStructureType sType;
///     void * pNext;
///     VkSparseImageMemoryRequirements memoryRequirements;
/// } VkSparseImageMemoryRequirements2;
/// ```
public sealed class VkSparseImageMemoryRequirements2 extends Struct {
    /// The struct layout of `VkSparseImageMemoryRequirements2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSparseImageMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `memoryRequirements`.
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    /// The memory layout of `memoryRequirements`.
    public static final MemoryLayout ML_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));

    /// Creates `VkSparseImageMemoryRequirements2` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageMemoryRequirements2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageMemoryRequirements2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements2(segment); }

    /// Creates `VkSparseImageMemoryRequirements2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseImageMemoryRequirements2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageMemoryRequirements2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSparseImageMemoryRequirements2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryRequirements2`
    public static VkSparseImageMemoryRequirements2 alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryRequirements2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageMemoryRequirements2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageMemoryRequirements2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSparseImageMemoryRequirements2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryRequirements2`
    public static VkSparseImageMemoryRequirements2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment memoryRequirements) { return alloc(allocator).sType(sType).pNext(pNext).memoryRequirements(memoryRequirements); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseImageMemoryRequirements2 copyFrom(VkSparseImageMemoryRequirements2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSparseImageMemoryRequirements2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSparseImageMemoryRequirements2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSparseImageMemoryRequirements2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements2 sType(@CType("VkStructureType") int value) { VkSparseImageMemoryRequirements2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSparseImageMemoryRequirements2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSparseImageMemoryRequirements2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements2 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements2.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment get_memoryRequirements(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), ML_memoryRequirements); }
    /// {@return `memoryRequirements`}
    /// @param segment the segment of the struct
    public static @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment get_memoryRequirements(MemorySegment segment) { return VkSparseImageMemoryRequirements2.get_memoryRequirements(segment, 0L); }
    /// {@return `memoryRequirements`}
    public @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment memoryRequirements() { return VkSparseImageMemoryRequirements2.get_memoryRequirements(this.segment()); }
    /// Sets `memoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryRequirements(MemorySegment segment, long index, @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryRequirements, index), ML_memoryRequirements.byteSize()); }
    /// Sets `memoryRequirements` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryRequirements(MemorySegment segment, @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements2.set_memoryRequirements(segment, 0L, value); }
    /// Sets `memoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements2 memoryRequirements(@CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements2.set_memoryRequirements(this.segment(), value); return this; }

    /// A buffer of [VkSparseImageMemoryRequirements2].
    public static final class Buffer extends VkSparseImageMemoryRequirements2 {
        private final long elementCount;

        /// Creates `VkSparseImageMemoryRequirements2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSparseImageMemoryRequirements2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSparseImageMemoryRequirements2`
        public VkSparseImageMemoryRequirements2 asSlice(long index) { return new VkSparseImageMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSparseImageMemoryRequirements2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSparseImageMemoryRequirements2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSparseImageMemoryRequirements2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSparseImageMemoryRequirements2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSparseImageMemoryRequirements2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `memoryRequirements` at the given index}
        /// @param index the index
        public @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment memoryRequirementsAt(long index) { return VkSparseImageMemoryRequirements2.get_memoryRequirements(this.segment(), index); }
        /// Sets `memoryRequirements` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryRequirementsAt(long index, @CType("VkSparseImageMemoryRequirements") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements2.set_memoryRequirements(this.segment(), index, value); return this; }

    }
}
