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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExportMetalIOSurfaceInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImage image;
///     (struct __IOSurface *) IOSurfaceRef ioSurface;
/// };
/// ```
public final class VkExportMetalIOSurfaceInfoEXT extends GroupType {
    /// The struct layout of `VkExportMetalIOSurfaceInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.ADDRESS.withName("ioSurface")
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
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The byte offset of `ioSurface`.
    public static final long OFFSET_ioSurface = LAYOUT.byteOffset(PathElement.groupElement("ioSurface"));
    /// The memory layout of `ioSurface`.
    public static final MemoryLayout LAYOUT_ioSurface = LAYOUT.select(PathElement.groupElement("ioSurface"));
    /// The [VarHandle] of `ioSurface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ioSurface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ioSurface"));

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExportMetalIOSurfaceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalIOSurfaceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @param ioSurface `ioSurface`
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image, MemorySegment ioSurface) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image).ioSurface(ioSurface);
    }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image);
    }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExportMetalIOSurfaceInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExportMetalIOSurfaceInfoEXT`
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT copyFrom(VkExportMetalIOSurfaceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExportMetalIOSurfaceInfoEXT reinterpret(long count) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExportMetalIOSurfaceInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMetalIOSurfaceInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long image(MemorySegment segment, long index) { return (long) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    public long image() { return image(this.segment(), 0L); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image(MemorySegment segment, long index, long value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT image(long value) { image(this.segment(), 0L, value); return this; }

    /// {@return `ioSurface` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ioSurface(MemorySegment segment, long index) { return (MemorySegment) VH_ioSurface.get(segment, 0L, index); }
    /// {@return `ioSurface`}
    public MemorySegment ioSurface() { return ioSurface(this.segment(), 0L); }
    /// Sets `ioSurface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ioSurface(MemorySegment segment, long index, MemorySegment value) { VH_ioSurface.set(segment, 0L, index, value); }
    /// Sets `ioSurface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT ioSurface(MemorySegment value) { ioSurface(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExportMetalIOSurfaceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportMetalIOSurfaceInfoEXT`
    public VkExportMetalIOSurfaceInfoEXT asSlice(long index) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExportMetalIOSurfaceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportMetalIOSurfaceInfoEXT`
    public VkExportMetalIOSurfaceInfoEXT asSlice(long index, long count) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExportMetalIOSurfaceInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT at(long index, Consumer<VkExportMetalIOSurfaceInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `image` at the given index}
    /// @param index the index of the struct buffer
    public long imageAt(long index) { return image(this.segment(), index); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT imageAt(long index, long value) { image(this.segment(), index, value); return this; }

    /// {@return `ioSurface` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ioSurfaceAt(long index) { return ioSurface(this.segment(), index); }
    /// Sets `ioSurface` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalIOSurfaceInfoEXT ioSurfaceAt(long index, MemorySegment value) { ioSurface(this.segment(), index, value); return this; }

}
