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
/// struct VkPhysicalDeviceMapMemoryPlacedFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 memoryMapPlaced;
///     (uint32_t) VkBool32 memoryMapRangePlaced;
///     (uint32_t) VkBool32 memoryUnmapReserve;
/// };
/// ```
public final class VkPhysicalDeviceMapMemoryPlacedFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryMapPlaced"),
        ValueLayout.JAVA_INT.withName("memoryMapRangePlaced"),
        ValueLayout.JAVA_INT.withName("memoryUnmapReserve")
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
    /// The byte offset of `memoryMapPlaced`.
    public static final long OFFSET_memoryMapPlaced = LAYOUT.byteOffset(PathElement.groupElement("memoryMapPlaced"));
    /// The memory layout of `memoryMapPlaced`.
    public static final MemoryLayout LAYOUT_memoryMapPlaced = LAYOUT.select(PathElement.groupElement("memoryMapPlaced"));
    /// The [VarHandle] of `memoryMapPlaced` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryMapPlaced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryMapPlaced"));
    /// The byte offset of `memoryMapRangePlaced`.
    public static final long OFFSET_memoryMapRangePlaced = LAYOUT.byteOffset(PathElement.groupElement("memoryMapRangePlaced"));
    /// The memory layout of `memoryMapRangePlaced`.
    public static final MemoryLayout LAYOUT_memoryMapRangePlaced = LAYOUT.select(PathElement.groupElement("memoryMapRangePlaced"));
    /// The [VarHandle] of `memoryMapRangePlaced` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryMapRangePlaced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryMapRangePlaced"));
    /// The byte offset of `memoryUnmapReserve`.
    public static final long OFFSET_memoryUnmapReserve = LAYOUT.byteOffset(PathElement.groupElement("memoryUnmapReserve"));
    /// The memory layout of `memoryUnmapReserve`.
    public static final MemoryLayout LAYOUT_memoryUnmapReserve = LAYOUT.select(PathElement.groupElement("memoryUnmapReserve"));
    /// The [VarHandle] of `memoryUnmapReserve` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryUnmapReserve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryUnmapReserve"));

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT copyFrom(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memoryMapPlaced` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryMapPlaced(MemorySegment segment, long index) { return (int) VH_memoryMapPlaced.get(segment, 0L, index); }
    /// {@return `memoryMapPlaced`}
    public int memoryMapPlaced() { return memoryMapPlaced(this.segment(), 0L); }
    /// Sets `memoryMapPlaced` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryMapPlaced(MemorySegment segment, long index, int value) { VH_memoryMapPlaced.set(segment, 0L, index, value); }
    /// Sets `memoryMapPlaced` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlaced(int value) { memoryMapPlaced(this.segment(), 0L, value); return this; }

    /// {@return `memoryMapRangePlaced` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryMapRangePlaced(MemorySegment segment, long index) { return (int) VH_memoryMapRangePlaced.get(segment, 0L, index); }
    /// {@return `memoryMapRangePlaced`}
    public int memoryMapRangePlaced() { return memoryMapRangePlaced(this.segment(), 0L); }
    /// Sets `memoryMapRangePlaced` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryMapRangePlaced(MemorySegment segment, long index, int value) { VH_memoryMapRangePlaced.set(segment, 0L, index, value); }
    /// Sets `memoryMapRangePlaced` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlaced(int value) { memoryMapRangePlaced(this.segment(), 0L, value); return this; }

    /// {@return `memoryUnmapReserve` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryUnmapReserve(MemorySegment segment, long index) { return (int) VH_memoryUnmapReserve.get(segment, 0L, index); }
    /// {@return `memoryUnmapReserve`}
    public int memoryUnmapReserve() { return memoryUnmapReserve(this.segment(), 0L); }
    /// Sets `memoryUnmapReserve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryUnmapReserve(MemorySegment segment, long index, int value) { VH_memoryUnmapReserve.set(segment, 0L, index, value); }
    /// Sets `memoryUnmapReserve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserve(int value) { memoryUnmapReserve(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `memoryMapPlaced` at the given index}
    /// @param index the index of the struct buffer
    public int memoryMapPlacedAt(long index) { return memoryMapPlaced(this.segment(), index); }
    /// Sets `memoryMapPlaced` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlacedAt(long index, int value) { memoryMapPlaced(this.segment(), index, value); return this; }

    /// {@return `memoryMapRangePlaced` at the given index}
    /// @param index the index of the struct buffer
    public int memoryMapRangePlacedAt(long index) { return memoryMapRangePlaced(this.segment(), index); }
    /// Sets `memoryMapRangePlaced` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlacedAt(long index, int value) { memoryMapRangePlaced(this.segment(), index, value); return this; }

    /// {@return `memoryUnmapReserve` at the given index}
    /// @param index the index of the struct buffer
    public int memoryUnmapReserveAt(long index) { return memoryUnmapReserve(this.segment(), index); }
    /// Sets `memoryUnmapReserve` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserveAt(long index, int value) { memoryUnmapReserve(this.segment(), index, value); return this; }

}
