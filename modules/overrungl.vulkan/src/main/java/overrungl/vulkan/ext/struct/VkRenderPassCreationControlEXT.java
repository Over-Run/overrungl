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
/// ### disallowMerging
/// [VarHandle][#VH_disallowMerging] - [Getter][#disallowMerging()] - [Setter][#disallowMerging(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassCreationControlEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 disallowMerging;
/// } VkRenderPassCreationControlEXT;
/// ```
public sealed class VkRenderPassCreationControlEXT extends Struct {
    /// The struct layout of `VkRenderPassCreationControlEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disallowMerging")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `disallowMerging` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disallowMerging = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disallowMerging"));

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassCreationControlEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationControlEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreationControlEXT(segment); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationControlEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreationControlEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static VkRenderPassCreationControlEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationControlEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static VkRenderPassCreationControlEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkBool32") int disallowMerging) { return alloc(allocator).sType(sType).pNext(pNext).disallowMerging(disallowMerging); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreationControlEXT copyFrom(VkRenderPassCreationControlEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassCreationControlEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassCreationControlEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassCreationControlEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationControlEXT sType(@CType("VkStructureType") int value) { VkRenderPassCreationControlEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassCreationControlEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkRenderPassCreationControlEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkRenderPassCreationControlEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationControlEXT pNext(@CType("const void *") MemorySegment value) { VkRenderPassCreationControlEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `disallowMerging` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_disallowMerging(MemorySegment segment, long index) { return (int) VH_disallowMerging.get(segment, 0L, index); }
    /// {@return `disallowMerging`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_disallowMerging(MemorySegment segment) { return VkRenderPassCreationControlEXT.get_disallowMerging(segment, 0L); }
    /// {@return `disallowMerging`}
    public @CType("VkBool32") int disallowMerging() { return VkRenderPassCreationControlEXT.get_disallowMerging(this.segment()); }
    /// Sets `disallowMerging` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disallowMerging(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_disallowMerging.set(segment, 0L, index, value); }
    /// Sets `disallowMerging` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disallowMerging(MemorySegment segment, @CType("VkBool32") int value) { VkRenderPassCreationControlEXT.set_disallowMerging(segment, 0L, value); }
    /// Sets `disallowMerging` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationControlEXT disallowMerging(@CType("VkBool32") int value) { VkRenderPassCreationControlEXT.set_disallowMerging(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassCreationControlEXT].
    public static final class Buffer extends VkRenderPassCreationControlEXT {
        private final long elementCount;

        /// Creates `VkRenderPassCreationControlEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassCreationControlEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassCreationControlEXT`
        public VkRenderPassCreationControlEXT asSlice(long index) { return new VkRenderPassCreationControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassCreationControlEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassCreationControlEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassCreationControlEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassCreationControlEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkRenderPassCreationControlEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkRenderPassCreationControlEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `disallowMerging` at the given index}
        /// @param index the index
        public @CType("VkBool32") int disallowMergingAt(long index) { return VkRenderPassCreationControlEXT.get_disallowMerging(this.segment(), index); }
        /// Sets `disallowMerging` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer disallowMergingAt(long index, @CType("VkBool32") int value) { VkRenderPassCreationControlEXT.set_disallowMerging(this.segment(), index, value); return this; }

    }
}
