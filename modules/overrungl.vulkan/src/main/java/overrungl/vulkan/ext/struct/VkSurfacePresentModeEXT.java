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
/// ### presentMode
/// [VarHandle][#VH_presentMode] - [Getter][#presentMode()] - [Setter][#presentMode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfacePresentModeEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkPresentModeKHR presentMode;
/// } VkSurfacePresentModeEXT;
/// ```
public sealed class VkSurfacePresentModeEXT extends Struct {
    /// The struct layout of `VkSurfacePresentModeEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentMode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `presentMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMode"));

    /// Creates `VkSurfacePresentModeEXT` with the given segment.
    /// @param segment the memory segment
    public VkSurfacePresentModeEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfacePresentModeEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfacePresentModeEXT(segment); }

    /// Creates `VkSurfacePresentModeEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfacePresentModeEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfacePresentModeEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfacePresentModeEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSurfacePresentModeEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentModeEXT`
    public static VkSurfacePresentModeEXT alloc(SegmentAllocator allocator) { return new VkSurfacePresentModeEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfacePresentModeEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfacePresentModeEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfacePresentModeEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentModeEXT`
    public static VkSurfacePresentModeEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkPresentModeKHR") int presentMode) { return alloc(allocator).sType(sType).pNext(pNext).presentMode(presentMode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfacePresentModeEXT copyFrom(VkSurfacePresentModeEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfacePresentModeEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfacePresentModeEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfacePresentModeEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeEXT sType(@CType("VkStructureType") int value) { VkSurfacePresentModeEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSurfacePresentModeEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSurfacePresentModeEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfacePresentModeEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSurfacePresentModeEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `presentMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentModeKHR") int get_presentMode(MemorySegment segment, long index) { return (int) VH_presentMode.get(segment, 0L, index); }
    /// {@return `presentMode`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentModeKHR") int get_presentMode(MemorySegment segment) { return VkSurfacePresentModeEXT.get_presentMode(segment, 0L); }
    /// {@return `presentMode`}
    public @CType("VkPresentModeKHR") int presentMode() { return VkSurfacePresentModeEXT.get_presentMode(this.segment()); }
    /// Sets `presentMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentMode(MemorySegment segment, long index, @CType("VkPresentModeKHR") int value) { VH_presentMode.set(segment, 0L, index, value); }
    /// Sets `presentMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentMode(MemorySegment segment, @CType("VkPresentModeKHR") int value) { VkSurfacePresentModeEXT.set_presentMode(segment, 0L, value); }
    /// Sets `presentMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeEXT presentMode(@CType("VkPresentModeKHR") int value) { VkSurfacePresentModeEXT.set_presentMode(this.segment(), value); return this; }

    /// A buffer of [VkSurfacePresentModeEXT].
    public static final class Buffer extends VkSurfacePresentModeEXT {
        private final long elementCount;

        /// Creates `VkSurfacePresentModeEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfacePresentModeEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfacePresentModeEXT`
        public VkSurfacePresentModeEXT asSlice(long index) { return new VkSurfacePresentModeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfacePresentModeEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfacePresentModeEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfacePresentModeEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfacePresentModeEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSurfacePresentModeEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfacePresentModeEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `presentMode` at the given index}
        /// @param index the index
        public @CType("VkPresentModeKHR") int presentModeAt(long index) { return VkSurfacePresentModeEXT.get_presentMode(this.segment(), index); }
        /// Sets `presentMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentModeAt(long index, @CType("VkPresentModeKHR") int value) { VkSurfacePresentModeEXT.set_presentMode(this.segment(), index, value); return this; }

    }
}
