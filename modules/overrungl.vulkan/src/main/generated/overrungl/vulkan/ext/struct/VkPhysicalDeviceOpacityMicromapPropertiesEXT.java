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
/// struct VkPhysicalDeviceOpacityMicromapPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxOpacity2StateSubdivisionLevel;
///     uint32_t maxOpacity4StateSubdivisionLevel;
/// };
/// ```
public final class VkPhysicalDeviceOpacityMicromapPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
        ValueLayout.JAVA_INT.withName("maxOpacity4StateSubdivisionLevel")
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
    /// The byte offset of `maxOpacity2StateSubdivisionLevel`.
    public static final long OFFSET_maxOpacity2StateSubdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    /// The memory layout of `maxOpacity2StateSubdivisionLevel`.
    public static final MemoryLayout LAYOUT_maxOpacity2StateSubdivisionLevel = LAYOUT.select(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    /// The [VarHandle] of `maxOpacity2StateSubdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxOpacity2StateSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    /// The byte offset of `maxOpacity4StateSubdivisionLevel`.
    public static final long OFFSET_maxOpacity4StateSubdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
    /// The memory layout of `maxOpacity4StateSubdivisionLevel`.
    public static final MemoryLayout LAYOUT_maxOpacity4StateSubdivisionLevel = LAYOUT.select(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
    /// The [VarHandle] of `maxOpacity4StateSubdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxOpacity4StateSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT copyFrom(VkPhysicalDeviceOpacityMicromapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxOpacity2StateSubdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxOpacity2StateSubdivisionLevel(MemorySegment segment, long index) { return (int) VH_maxOpacity2StateSubdivisionLevel.get(segment, 0L, index); }
    /// {@return `maxOpacity2StateSubdivisionLevel`}
    public int maxOpacity2StateSubdivisionLevel() { return maxOpacity2StateSubdivisionLevel(this.segment(), 0L); }
    /// Sets `maxOpacity2StateSubdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxOpacity2StateSubdivisionLevel(MemorySegment segment, long index, int value) { VH_maxOpacity2StateSubdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `maxOpacity2StateSubdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity2StateSubdivisionLevel(int value) { maxOpacity2StateSubdivisionLevel(this.segment(), 0L, value); return this; }

    /// {@return `maxOpacity4StateSubdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxOpacity4StateSubdivisionLevel(MemorySegment segment, long index) { return (int) VH_maxOpacity4StateSubdivisionLevel.get(segment, 0L, index); }
    /// {@return `maxOpacity4StateSubdivisionLevel`}
    public int maxOpacity4StateSubdivisionLevel() { return maxOpacity4StateSubdivisionLevel(this.segment(), 0L); }
    /// Sets `maxOpacity4StateSubdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxOpacity4StateSubdivisionLevel(MemorySegment segment, long index, int value) { VH_maxOpacity4StateSubdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `maxOpacity4StateSubdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity4StateSubdivisionLevel(int value) { maxOpacity4StateSubdivisionLevel(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceOpacityMicromapPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT at(long index, Consumer<VkPhysicalDeviceOpacityMicromapPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxOpacity2StateSubdivisionLevel` at the given index}
    /// @param index the index of the struct buffer
    public int maxOpacity2StateSubdivisionLevelAt(long index) { return maxOpacity2StateSubdivisionLevel(this.segment(), index); }
    /// Sets `maxOpacity2StateSubdivisionLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity2StateSubdivisionLevelAt(long index, int value) { maxOpacity2StateSubdivisionLevel(this.segment(), index, value); return this; }

    /// {@return `maxOpacity4StateSubdivisionLevel` at the given index}
    /// @param index the index of the struct buffer
    public int maxOpacity4StateSubdivisionLevelAt(long index) { return maxOpacity4StateSubdivisionLevel(this.segment(), index); }
    /// Sets `maxOpacity4StateSubdivisionLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity4StateSubdivisionLevelAt(long index, int value) { maxOpacity4StateSubdivisionLevel(this.segment(), index, value); return this; }

}
