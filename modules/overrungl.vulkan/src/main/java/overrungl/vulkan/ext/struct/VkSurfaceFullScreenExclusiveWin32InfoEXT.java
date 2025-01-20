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
/// ### hmonitor
/// [VarHandle][#VH_hmonitor] - [Getter][#hmonitor()] - [Setter][#hmonitor(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfaceFullScreenExclusiveWin32InfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     HMONITOR hmonitor;
/// } VkSurfaceFullScreenExclusiveWin32InfoEXT;
/// ```
public sealed class VkSurfaceFullScreenExclusiveWin32InfoEXT extends Struct {
    /// The struct layout of `VkSurfaceFullScreenExclusiveWin32InfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("hmonitor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `hmonitor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hmonitor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hmonitor"));

    /// Creates `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceFullScreenExclusiveWin32InfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment); }

    /// Creates `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFullScreenExclusiveWin32InfoEXT`
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT alloc(SegmentAllocator allocator) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFullScreenExclusiveWin32InfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfaceFullScreenExclusiveWin32InfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFullScreenExclusiveWin32InfoEXT`
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("HMONITOR") MemorySegment hmonitor) { return alloc(allocator).sType(sType).pNext(pNext).hmonitor(hmonitor); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceFullScreenExclusiveWin32InfoEXT copyFrom(VkSurfaceFullScreenExclusiveWin32InfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveWin32InfoEXT sType(@CType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveWin32InfoEXT pNext(@CType("const void *") MemorySegment value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `hmonitor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("HMONITOR") MemorySegment get_hmonitor(MemorySegment segment, long index) { return (MemorySegment) VH_hmonitor.get(segment, 0L, index); }
    /// {@return `hmonitor`}
    /// @param segment the segment of the struct
    public static @CType("HMONITOR") MemorySegment get_hmonitor(MemorySegment segment) { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_hmonitor(segment, 0L); }
    /// {@return `hmonitor`}
    public @CType("HMONITOR") MemorySegment hmonitor() { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_hmonitor(this.segment()); }
    /// Sets `hmonitor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hmonitor(MemorySegment segment, long index, @CType("HMONITOR") MemorySegment value) { VH_hmonitor.set(segment, 0L, index, value); }
    /// Sets `hmonitor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hmonitor(MemorySegment segment, @CType("HMONITOR") MemorySegment value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_hmonitor(segment, 0L, value); }
    /// Sets `hmonitor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveWin32InfoEXT hmonitor(@CType("HMONITOR") MemorySegment value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_hmonitor(this.segment(), value); return this; }

    /// A buffer of [VkSurfaceFullScreenExclusiveWin32InfoEXT].
    public static final class Buffer extends VkSurfaceFullScreenExclusiveWin32InfoEXT {
        private final long elementCount;

        /// Creates `VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfaceFullScreenExclusiveWin32InfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfaceFullScreenExclusiveWin32InfoEXT`
        public VkSurfaceFullScreenExclusiveWin32InfoEXT asSlice(long index) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfaceFullScreenExclusiveWin32InfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfaceFullScreenExclusiveWin32InfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `hmonitor` at the given index}
        /// @param index the index
        public @CType("HMONITOR") MemorySegment hmonitorAt(long index) { return VkSurfaceFullScreenExclusiveWin32InfoEXT.get_hmonitor(this.segment(), index); }
        /// Sets `hmonitor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hmonitorAt(long index, @CType("HMONITOR") MemorySegment value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.set_hmonitor(this.segment(), index, value); return this; }

    }
}
