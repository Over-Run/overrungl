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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### subresourceLayout
/// [Byte offset][#OFFSET_subresourceLayout] - [Memory layout][#ML_subresourceLayout] - [Getter][#subresourceLayout()] - [Setter][#subresourceLayout(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubresourceLayout2 {
///     VkStructureType sType;
///     void * pNext;
///     VkSubresourceLayout subresourceLayout;
/// } VkSubresourceLayout2;
/// ```
public sealed class VkSubresourceLayout2 extends Struct {
    /// The struct layout of `VkSubresourceLayout2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSubresourceLayout.LAYOUT.withName("subresourceLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `subresourceLayout`.
    public static final long OFFSET_subresourceLayout = LAYOUT.byteOffset(PathElement.groupElement("subresourceLayout"));
    /// The memory layout of `subresourceLayout`.
    public static final MemoryLayout ML_subresourceLayout = LAYOUT.select(PathElement.groupElement("subresourceLayout"));

    /// Creates `VkSubresourceLayout2` with the given segment.
    /// @param segment the memory segment
    public VkSubresourceLayout2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubresourceLayout2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubresourceLayout2(segment); }

    /// Creates `VkSubresourceLayout2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubresourceLayout2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubresourceLayout2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubresourceLayout2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubresourceLayout2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubresourceLayout2`
    public static VkSubresourceLayout2 alloc(SegmentAllocator allocator) { return new VkSubresourceLayout2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubresourceLayout2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubresourceLayout2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubresourceLayout2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubresourceLayout2`
    public static VkSubresourceLayout2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkSubresourceLayout") MemorySegment subresourceLayout) { return alloc(allocator).sType(sType).pNext(pNext).subresourceLayout(subresourceLayout); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubresourceLayout2 copyFrom(VkSubresourceLayout2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubresourceLayout2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubresourceLayout2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubresourceLayout2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout2 sType(@CType("VkStructureType") int value) { VkSubresourceLayout2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkSubresourceLayout2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkSubresourceLayout2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkSubresourceLayout2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout2 pNext(@CType("void *") MemorySegment value) { VkSubresourceLayout2.set_pNext(this.segment(), value); return this; }

    /// {@return `subresourceLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubresourceLayout") MemorySegment get_subresourceLayout(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceLayout, index), ML_subresourceLayout); }
    /// {@return `subresourceLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkSubresourceLayout") MemorySegment get_subresourceLayout(MemorySegment segment) { return VkSubresourceLayout2.get_subresourceLayout(segment, 0L); }
    /// {@return `subresourceLayout`}
    public @CType("VkSubresourceLayout") MemorySegment subresourceLayout() { return VkSubresourceLayout2.get_subresourceLayout(this.segment()); }
    /// Sets `subresourceLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subresourceLayout(MemorySegment segment, long index, @CType("VkSubresourceLayout") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceLayout, index), ML_subresourceLayout.byteSize()); }
    /// Sets `subresourceLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subresourceLayout(MemorySegment segment, @CType("VkSubresourceLayout") MemorySegment value) { VkSubresourceLayout2.set_subresourceLayout(segment, 0L, value); }
    /// Sets `subresourceLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout2 subresourceLayout(@CType("VkSubresourceLayout") MemorySegment value) { VkSubresourceLayout2.set_subresourceLayout(this.segment(), value); return this; }

    /// A buffer of [VkSubresourceLayout2].
    public static final class Buffer extends VkSubresourceLayout2 {
        private final long elementCount;

        /// Creates `VkSubresourceLayout2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubresourceLayout2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubresourceLayout2`
        public VkSubresourceLayout2 asSlice(long index) { return new VkSubresourceLayout2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubresourceLayout2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubresourceLayout2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSubresourceLayout2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSubresourceLayout2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkSubresourceLayout2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkSubresourceLayout2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `subresourceLayout` at the given index}
        /// @param index the index
        public @CType("VkSubresourceLayout") MemorySegment subresourceLayoutAt(long index) { return VkSubresourceLayout2.get_subresourceLayout(this.segment(), index); }
        /// Sets `subresourceLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subresourceLayoutAt(long index, @CType("VkSubresourceLayout") MemorySegment value) { VkSubresourceLayout2.set_subresourceLayout(this.segment(), index, value); return this; }

    }
}
