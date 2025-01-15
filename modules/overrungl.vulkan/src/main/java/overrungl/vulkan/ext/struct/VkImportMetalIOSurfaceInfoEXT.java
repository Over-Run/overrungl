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
/// ### ioSurface
/// [VarHandle][#VH_ioSurface] - [Getter][#ioSurface()] - [Setter][#ioSurface(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMetalIOSurfaceInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     IOSurfaceRef ioSurface;
/// } VkImportMetalIOSurfaceInfoEXT;
/// ```
public sealed class VkImportMetalIOSurfaceInfoEXT extends Struct {
    /// The struct layout of `VkImportMetalIOSurfaceInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("ioSurface")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `ioSurface` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ioSurface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ioSurface"));

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImportMetalIOSurfaceInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalIOSurfaceInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportMetalIOSurfaceInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalIOSurfaceInfoEXT`
    public static VkImportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMetalIOSurfaceInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalIOSurfaceInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMetalIOSurfaceInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalIOSurfaceInfoEXT`
    public static VkImportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("IOSurfaceRef") java.lang.foreign.MemorySegment ioSurface) { return alloc(allocator).sType(sType).pNext(pNext).ioSurface(ioSurface); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT copyFrom(VkImportMetalIOSurfaceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMetalIOSurfaceInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMetalIOSurfaceInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMetalIOSurfaceInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT sType(@CType("VkStructureType") int value) { VkImportMetalIOSurfaceInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportMetalIOSurfaceInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportMetalIOSurfaceInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalIOSurfaceInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalIOSurfaceInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `ioSurface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("IOSurfaceRef") java.lang.foreign.MemorySegment get_ioSurface(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ioSurface.get(segment, 0L, index); }
    /// {@return `ioSurface`}
    /// @param segment the segment of the struct
    public static @CType("IOSurfaceRef") java.lang.foreign.MemorySegment get_ioSurface(MemorySegment segment) { return VkImportMetalIOSurfaceInfoEXT.get_ioSurface(segment, 0L); }
    /// {@return `ioSurface`}
    public @CType("IOSurfaceRef") java.lang.foreign.MemorySegment ioSurface() { return VkImportMetalIOSurfaceInfoEXT.get_ioSurface(this.segment()); }
    /// Sets `ioSurface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ioSurface(MemorySegment segment, long index, @CType("IOSurfaceRef") java.lang.foreign.MemorySegment value) { VH_ioSurface.set(segment, 0L, index, value); }
    /// Sets `ioSurface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ioSurface(MemorySegment segment, @CType("IOSurfaceRef") java.lang.foreign.MemorySegment value) { VkImportMetalIOSurfaceInfoEXT.set_ioSurface(segment, 0L, value); }
    /// Sets `ioSurface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT ioSurface(@CType("IOSurfaceRef") java.lang.foreign.MemorySegment value) { VkImportMetalIOSurfaceInfoEXT.set_ioSurface(this.segment(), value); return this; }

    /// A buffer of [VkImportMetalIOSurfaceInfoEXT].
    public static final class Buffer extends VkImportMetalIOSurfaceInfoEXT {
        private final long elementCount;

        /// Creates `VkImportMetalIOSurfaceInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportMetalIOSurfaceInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportMetalIOSurfaceInfoEXT`
        public VkImportMetalIOSurfaceInfoEXT asSlice(long index) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportMetalIOSurfaceInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportMetalIOSurfaceInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMetalIOSurfaceInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMetalIOSurfaceInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportMetalIOSurfaceInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalIOSurfaceInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `ioSurface` at the given index}
        /// @param index the index
        public @CType("IOSurfaceRef") java.lang.foreign.MemorySegment ioSurfaceAt(long index) { return VkImportMetalIOSurfaceInfoEXT.get_ioSurface(this.segment(), index); }
        /// Sets `ioSurface` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ioSurfaceAt(long index, @CType("IOSurfaceRef") java.lang.foreign.MemorySegment value) { VkImportMetalIOSurfaceInfoEXT.set_ioSurface(this.segment(), index, value); return this; }

    }
}
