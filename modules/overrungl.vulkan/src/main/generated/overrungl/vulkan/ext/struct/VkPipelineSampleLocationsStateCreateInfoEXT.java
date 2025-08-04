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
/// struct VkPipelineSampleLocationsStateCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 sampleLocationsEnable;
///     (struct VkSampleLocationsInfoEXT) VkSampleLocationsInfoEXT sampleLocationsInfo;
/// };
/// ```
public final class VkPipelineSampleLocationsStateCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineSampleLocationsStateCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsEnable"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
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
    /// The byte offset of `sampleLocationsEnable`.
    public static final long OFFSET_sampleLocationsEnable = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsEnable"));
    /// The memory layout of `sampleLocationsEnable`.
    public static final MemoryLayout LAYOUT_sampleLocationsEnable = LAYOUT.select(PathElement.groupElement("sampleLocationsEnable"));
    /// The [VarHandle] of `sampleLocationsEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleLocationsEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsEnable"));
    /// The byte offset of `sampleLocationsInfo`.
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    /// The memory layout of `sampleLocationsInfo`.
    public static final MemoryLayout LAYOUT_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineSampleLocationsStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineSampleLocationsStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineSampleLocationsStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineSampleLocationsStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineSampleLocationsStateCreateInfoEXT`
    public static VkPipelineSampleLocationsStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineSampleLocationsStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineSampleLocationsStateCreateInfoEXT`
    public static VkPipelineSampleLocationsStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT copyFrom(VkPipelineSampleLocationsStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineSampleLocationsStateCreateInfoEXT reinterpret(long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineSampleLocationsStateCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineSampleLocationsStateCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationsEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleLocationsEnable(MemorySegment segment, long index) { return (int) VH_sampleLocationsEnable.get(segment, 0L, index); }
    /// {@return `sampleLocationsEnable`}
    public int sampleLocationsEnable() { return sampleLocationsEnable(this.segment(), 0L); }
    /// Sets `sampleLocationsEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationsEnable(MemorySegment segment, long index, int value) { VH_sampleLocationsEnable.set(segment, 0L, index, value); }
    /// Sets `sampleLocationsEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnable(int value) { sampleLocationsEnable(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sampleLocationsInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo); }
    /// {@return `sampleLocationsInfo`}
    public MemorySegment sampleLocationsInfo() { return sampleLocationsInfo(this.segment(), 0L); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationsInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo.byteSize()); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(MemorySegment value) { sampleLocationsInfo(this.segment(), 0L, value); return this; }
    /// Accepts `sampleLocationsInfo` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(Consumer<overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.of(sampleLocationsInfo())); return this; }

    /// Creates a slice of `VkPipelineSampleLocationsStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineSampleLocationsStateCreateInfoEXT`
    public VkPipelineSampleLocationsStateCreateInfoEXT asSlice(long index) { return new VkPipelineSampleLocationsStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineSampleLocationsStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineSampleLocationsStateCreateInfoEXT`
    public VkPipelineSampleLocationsStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineSampleLocationsStateCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT at(long index, Consumer<VkPipelineSampleLocationsStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sampleLocationsEnable` at the given index}
    /// @param index the index of the struct buffer
    public int sampleLocationsEnableAt(long index) { return sampleLocationsEnable(this.segment(), index); }
    /// Sets `sampleLocationsEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnableAt(long index, int value) { sampleLocationsEnable(this.segment(), index, value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment sampleLocationsInfoAt(long index) { return sampleLocationsInfo(this.segment(), index); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfoAt(long index, MemorySegment value) { sampleLocationsInfo(this.segment(), index, value); return this; }
    /// Accepts `sampleLocationsInfo` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfoAt(long index, Consumer<overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.of(sampleLocationsInfoAt(index))); return this; }

}
