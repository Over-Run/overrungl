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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pLayer
/// [VarHandle][#VH_pLayer] - [Getter][#pLayer()] - [Setter][#pLayer(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMetalSurfaceCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkMetalSurfaceCreateFlagsEXT flags;
///     const CAMetalLayer * pLayer;
/// } VkMetalSurfaceCreateInfoEXT;
/// ```
public sealed class VkMetalSurfaceCreateInfoEXT extends Struct {
    /// The struct layout of `VkMetalSurfaceCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pLayer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pLayer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayer"));

    /// Creates `VkMetalSurfaceCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMetalSurfaceCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMetalSurfaceCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMetalSurfaceCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMetalSurfaceCreateInfoEXT(segment); }

    /// Creates `VkMetalSurfaceCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMetalSurfaceCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMetalSurfaceCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMetalSurfaceCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMetalSurfaceCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMetalSurfaceCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMetalSurfaceCreateInfoEXT`
    public static VkMetalSurfaceCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkMetalSurfaceCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMetalSurfaceCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMetalSurfaceCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMetalSurfaceCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMetalSurfaceCreateInfoEXT`
    public static VkMetalSurfaceCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkMetalSurfaceCreateFlagsEXT") int flags, @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment pLayer) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pLayer(pLayer); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMetalSurfaceCreateInfoEXT copyFrom(VkMetalSurfaceCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMetalSurfaceCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMetalSurfaceCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMetalSurfaceCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMetalSurfaceCreateInfoEXT sType(@CType("VkStructureType") int value) { VkMetalSurfaceCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMetalSurfaceCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMetalSurfaceCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMetalSurfaceCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMetalSurfaceCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMetalSurfaceCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMetalSurfaceCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkMetalSurfaceCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkMetalSurfaceCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkMetalSurfaceCreateFlagsEXT") int flags() { return VkMetalSurfaceCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkMetalSurfaceCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkMetalSurfaceCreateFlagsEXT") int value) { VkMetalSurfaceCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMetalSurfaceCreateInfoEXT flags(@CType("VkMetalSurfaceCreateFlagsEXT") int value) { VkMetalSurfaceCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `pLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment get_pLayer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLayer.get(segment, 0L, index); }
    /// {@return `pLayer`}
    /// @param segment the segment of the struct
    public static @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment get_pLayer(MemorySegment segment) { return VkMetalSurfaceCreateInfoEXT.get_pLayer(segment, 0L); }
    /// {@return `pLayer`}
    public @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment pLayer() { return VkMetalSurfaceCreateInfoEXT.get_pLayer(this.segment()); }
    /// Sets `pLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLayer(MemorySegment segment, long index, @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment value) { VH_pLayer.set(segment, 0L, index, value); }
    /// Sets `pLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLayer(MemorySegment segment, @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment value) { VkMetalSurfaceCreateInfoEXT.set_pLayer(segment, 0L, value); }
    /// Sets `pLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMetalSurfaceCreateInfoEXT pLayer(@CType("const CAMetalLayer *") java.lang.foreign.MemorySegment value) { VkMetalSurfaceCreateInfoEXT.set_pLayer(this.segment(), value); return this; }

    /// A buffer of [VkMetalSurfaceCreateInfoEXT].
    public static final class Buffer extends VkMetalSurfaceCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkMetalSurfaceCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMetalSurfaceCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMetalSurfaceCreateInfoEXT`
        public VkMetalSurfaceCreateInfoEXT asSlice(long index) { return new VkMetalSurfaceCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMetalSurfaceCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMetalSurfaceCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMetalSurfaceCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMetalSurfaceCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMetalSurfaceCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMetalSurfaceCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkMetalSurfaceCreateFlagsEXT") int flagsAt(long index) { return VkMetalSurfaceCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkMetalSurfaceCreateFlagsEXT") int value) { VkMetalSurfaceCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `pLayer` at the given index}
        /// @param index the index
        public @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment pLayerAt(long index) { return VkMetalSurfaceCreateInfoEXT.get_pLayer(this.segment(), index); }
        /// Sets `pLayer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLayerAt(long index, @CType("const CAMetalLayer *") java.lang.foreign.MemorySegment value) { VkMetalSurfaceCreateInfoEXT.set_pLayer(this.segment(), index, value); return this; }

    }
}
