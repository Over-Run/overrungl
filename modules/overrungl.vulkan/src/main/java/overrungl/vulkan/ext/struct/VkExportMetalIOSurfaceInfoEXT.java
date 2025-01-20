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
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(MemorySegment)]
/// ### ioSurface
/// [VarHandle][#VH_ioSurface] - [Getter][#ioSurface()] - [Setter][#ioSurface(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportMetalIOSurfaceInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkImage image;
///     IOSurfaceRef ioSurface;
/// } VkExportMetalIOSurfaceInfoEXT;
/// ```
public sealed class VkExportMetalIOSurfaceInfoEXT extends Struct {
    /// The struct layout of `VkExportMetalIOSurfaceInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("ioSurface")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The [VarHandle] of `ioSurface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ioSurface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ioSurface"));

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalIOSurfaceInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalIOSurfaceInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkImage") MemorySegment image, @CType("IOSurfaceRef") MemorySegment ioSurface) { return alloc(allocator).sType(sType).pNext(pNext).image(image).ioSurface(ioSurface); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT copyFrom(VkExportMetalIOSurfaceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalIOSurfaceInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportMetalIOSurfaceInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportMetalIOSurfaceInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalIOSurfaceInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalIOSurfaceInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkExportMetalIOSurfaceInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT pNext(@CType("const void *") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") MemorySegment get_image(MemorySegment segment, long index) { return (MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") MemorySegment get_image(MemorySegment segment) { return VkExportMetalIOSurfaceInfoEXT.get_image(segment, 0L); }
    /// {@return `image`}
    public @CType("VkImage") MemorySegment image() { return VkExportMetalIOSurfaceInfoEXT.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_image(segment, 0L, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT image(@CType("VkImage") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_image(this.segment(), value); return this; }

    /// {@return `ioSurface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("IOSurfaceRef") MemorySegment get_ioSurface(MemorySegment segment, long index) { return (MemorySegment) VH_ioSurface.get(segment, 0L, index); }
    /// {@return `ioSurface`}
    /// @param segment the segment of the struct
    public static @CType("IOSurfaceRef") MemorySegment get_ioSurface(MemorySegment segment) { return VkExportMetalIOSurfaceInfoEXT.get_ioSurface(segment, 0L); }
    /// {@return `ioSurface`}
    public @CType("IOSurfaceRef") MemorySegment ioSurface() { return VkExportMetalIOSurfaceInfoEXT.get_ioSurface(this.segment()); }
    /// Sets `ioSurface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ioSurface(MemorySegment segment, long index, @CType("IOSurfaceRef") MemorySegment value) { VH_ioSurface.set(segment, 0L, index, value); }
    /// Sets `ioSurface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ioSurface(MemorySegment segment, @CType("IOSurfaceRef") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_ioSurface(segment, 0L, value); }
    /// Sets `ioSurface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT ioSurface(@CType("IOSurfaceRef") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_ioSurface(this.segment(), value); return this; }

    /// A buffer of [VkExportMetalIOSurfaceInfoEXT].
    public static final class Buffer extends VkExportMetalIOSurfaceInfoEXT {
        private final long elementCount;

        /// Creates `VkExportMetalIOSurfaceInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportMetalIOSurfaceInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportMetalIOSurfaceInfoEXT`
        public VkExportMetalIOSurfaceInfoEXT asSlice(long index) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportMetalIOSurfaceInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportMetalIOSurfaceInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalIOSurfaceInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalIOSurfaceInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkExportMetalIOSurfaceInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `image` at the given index}
        /// @param index the index
        public @CType("VkImage") MemorySegment imageAt(long index) { return VkExportMetalIOSurfaceInfoEXT.get_image(this.segment(), index); }
        /// Sets `image` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageAt(long index, @CType("VkImage") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_image(this.segment(), index, value); return this; }

        /// {@return `ioSurface` at the given index}
        /// @param index the index
        public @CType("IOSurfaceRef") MemorySegment ioSurfaceAt(long index) { return VkExportMetalIOSurfaceInfoEXT.get_ioSurface(this.segment(), index); }
        /// Sets `ioSurface` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ioSurfaceAt(long index, @CType("IOSurfaceRef") MemorySegment value) { VkExportMetalIOSurfaceInfoEXT.set_ioSurface(this.segment(), index, value); return this; }

    }
}
