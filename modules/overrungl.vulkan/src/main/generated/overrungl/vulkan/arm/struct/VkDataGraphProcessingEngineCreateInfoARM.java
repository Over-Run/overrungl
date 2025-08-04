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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDataGraphProcessingEngineCreateInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t processingEngineCount;
///     VkPhysicalDeviceDataGraphProcessingEngineARM* pProcessingEngines;
/// };
/// ```
public final class VkDataGraphProcessingEngineCreateInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphProcessingEngineCreateInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("processingEngineCount"),
        ValueLayout.ADDRESS.withName("pProcessingEngines")
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
    /// The byte offset of `processingEngineCount`.
    public static final long OFFSET_processingEngineCount = LAYOUT.byteOffset(PathElement.groupElement("processingEngineCount"));
    /// The memory layout of `processingEngineCount`.
    public static final MemoryLayout LAYOUT_processingEngineCount = LAYOUT.select(PathElement.groupElement("processingEngineCount"));
    /// The [VarHandle] of `processingEngineCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_processingEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("processingEngineCount"));
    /// The byte offset of `pProcessingEngines`.
    public static final long OFFSET_pProcessingEngines = LAYOUT.byteOffset(PathElement.groupElement("pProcessingEngines"));
    /// The memory layout of `pProcessingEngines`.
    public static final MemoryLayout LAYOUT_pProcessingEngines = LAYOUT.select(PathElement.groupElement("pProcessingEngines"));
    /// The [VarHandle] of `pProcessingEngines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pProcessingEngines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProcessingEngines"));

    /// Creates `VkDataGraphProcessingEngineCreateInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphProcessingEngineCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphProcessingEngineCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphProcessingEngineCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphProcessingEngineCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphProcessingEngineCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphProcessingEngineCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphProcessingEngineCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphProcessingEngineCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphProcessingEngineCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphProcessingEngineCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphProcessingEngineCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphProcessingEngineCreateInfoARM`
    public static VkDataGraphProcessingEngineCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphProcessingEngineCreateInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphProcessingEngineCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphProcessingEngineCreateInfoARM`
    public static VkDataGraphProcessingEngineCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphProcessingEngineCreateInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM copyFrom(VkDataGraphProcessingEngineCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphProcessingEngineCreateInfoARM reinterpret(long count) { return new VkDataGraphProcessingEngineCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphProcessingEngineCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphProcessingEngineCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `processingEngineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int processingEngineCount(MemorySegment segment, long index) { return (int) VH_processingEngineCount.get(segment, 0L, index); }
    /// {@return `processingEngineCount`}
    public int processingEngineCount() { return processingEngineCount(this.segment(), 0L); }
    /// Sets `processingEngineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void processingEngineCount(MemorySegment segment, long index, int value) { VH_processingEngineCount.set(segment, 0L, index, value); }
    /// Sets `processingEngineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM processingEngineCount(int value) { processingEngineCount(this.segment(), 0L, value); return this; }

    /// {@return `pProcessingEngines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pProcessingEngines(MemorySegment segment, long index) { return (MemorySegment) VH_pProcessingEngines.get(segment, 0L, index); }
    /// {@return `pProcessingEngines`}
    public MemorySegment pProcessingEngines() { return pProcessingEngines(this.segment(), 0L); }
    /// Sets `pProcessingEngines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pProcessingEngines(MemorySegment segment, long index, MemorySegment value) { VH_pProcessingEngines.set(segment, 0L, index, value); }
    /// Sets `pProcessingEngines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEngines(MemorySegment value) { pProcessingEngines(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphProcessingEngineCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphProcessingEngineCreateInfoARM`
    public VkDataGraphProcessingEngineCreateInfoARM asSlice(long index) { return new VkDataGraphProcessingEngineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphProcessingEngineCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphProcessingEngineCreateInfoARM`
    public VkDataGraphProcessingEngineCreateInfoARM asSlice(long index, long count) { return new VkDataGraphProcessingEngineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphProcessingEngineCreateInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM at(long index, Consumer<VkDataGraphProcessingEngineCreateInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `processingEngineCount` at the given index}
    /// @param index the index of the struct buffer
    public int processingEngineCountAt(long index) { return processingEngineCount(this.segment(), index); }
    /// Sets `processingEngineCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM processingEngineCountAt(long index, int value) { processingEngineCount(this.segment(), index, value); return this; }

    /// {@return `pProcessingEngines` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pProcessingEnginesAt(long index) { return pProcessingEngines(this.segment(), index); }
    /// Sets `pProcessingEngines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEnginesAt(long index, MemorySegment value) { pProcessingEngines(this.segment(), index, value); return this; }

}
