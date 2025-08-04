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
/// struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxTransformFeedbackStreams;
///     uint32_t maxTransformFeedbackBuffers;
///     (uint64_t) VkDeviceSize maxTransformFeedbackBufferSize;
///     uint32_t maxTransformFeedbackStreamDataSize;
///     uint32_t maxTransformFeedbackBufferDataSize;
///     uint32_t maxTransformFeedbackBufferDataStride;
///     (uint32_t) VkBool32 transformFeedbackQueries;
///     (uint32_t) VkBool32 transformFeedbackStreamsLinesTriangles;
///     (uint32_t) VkBool32 transformFeedbackRasterizationStreamSelect;
///     (uint32_t) VkBool32 transformFeedbackDraw;
/// };
/// ```
public final class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTransformFeedbackPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreams"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBuffers"),
        ValueLayout.JAVA_LONG.withName("maxTransformFeedbackBufferSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreamDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataStride"),
        ValueLayout.JAVA_INT.withName("transformFeedbackQueries"),
        ValueLayout.JAVA_INT.withName("transformFeedbackStreamsLinesTriangles"),
        ValueLayout.JAVA_INT.withName("transformFeedbackRasterizationStreamSelect"),
        ValueLayout.JAVA_INT.withName("transformFeedbackDraw")
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
    /// The byte offset of `maxTransformFeedbackStreams`.
    public static final long OFFSET_maxTransformFeedbackStreams = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackStreams"));
    /// The memory layout of `maxTransformFeedbackStreams`.
    public static final MemoryLayout LAYOUT_maxTransformFeedbackStreams = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackStreams"));
    /// The [VarHandle] of `maxTransformFeedbackStreams` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTransformFeedbackStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackStreams"));
    /// The byte offset of `maxTransformFeedbackBuffers`.
    public static final long OFFSET_maxTransformFeedbackBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBuffers"));
    /// The memory layout of `maxTransformFeedbackBuffers`.
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBuffers = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBuffers"));
    /// The [VarHandle] of `maxTransformFeedbackBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTransformFeedbackBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBuffers"));
    /// The byte offset of `maxTransformFeedbackBufferSize`.
    public static final long OFFSET_maxTransformFeedbackBufferSize = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    /// The memory layout of `maxTransformFeedbackBufferSize`.
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBufferSize = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    /// The [VarHandle] of `maxTransformFeedbackBufferSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTransformFeedbackBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    /// The byte offset of `maxTransformFeedbackStreamDataSize`.
    public static final long OFFSET_maxTransformFeedbackStreamDataSize = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    /// The memory layout of `maxTransformFeedbackStreamDataSize`.
    public static final MemoryLayout LAYOUT_maxTransformFeedbackStreamDataSize = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    /// The [VarHandle] of `maxTransformFeedbackStreamDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTransformFeedbackStreamDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    /// The byte offset of `maxTransformFeedbackBufferDataSize`.
    public static final long OFFSET_maxTransformFeedbackBufferDataSize = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    /// The memory layout of `maxTransformFeedbackBufferDataSize`.
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBufferDataSize = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    /// The [VarHandle] of `maxTransformFeedbackBufferDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTransformFeedbackBufferDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    /// The byte offset of `maxTransformFeedbackBufferDataStride`.
    public static final long OFFSET_maxTransformFeedbackBufferDataStride = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    /// The memory layout of `maxTransformFeedbackBufferDataStride`.
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBufferDataStride = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    /// The [VarHandle] of `maxTransformFeedbackBufferDataStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTransformFeedbackBufferDataStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    /// The byte offset of `transformFeedbackQueries`.
    public static final long OFFSET_transformFeedbackQueries = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackQueries"));
    /// The memory layout of `transformFeedbackQueries`.
    public static final MemoryLayout LAYOUT_transformFeedbackQueries = LAYOUT.select(PathElement.groupElement("transformFeedbackQueries"));
    /// The [VarHandle] of `transformFeedbackQueries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformFeedbackQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackQueries"));
    /// The byte offset of `transformFeedbackStreamsLinesTriangles`.
    public static final long OFFSET_transformFeedbackStreamsLinesTriangles = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    /// The memory layout of `transformFeedbackStreamsLinesTriangles`.
    public static final MemoryLayout LAYOUT_transformFeedbackStreamsLinesTriangles = LAYOUT.select(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    /// The [VarHandle] of `transformFeedbackStreamsLinesTriangles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformFeedbackStreamsLinesTriangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    /// The byte offset of `transformFeedbackRasterizationStreamSelect`.
    public static final long OFFSET_transformFeedbackRasterizationStreamSelect = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    /// The memory layout of `transformFeedbackRasterizationStreamSelect`.
    public static final MemoryLayout LAYOUT_transformFeedbackRasterizationStreamSelect = LAYOUT.select(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    /// The [VarHandle] of `transformFeedbackRasterizationStreamSelect` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformFeedbackRasterizationStreamSelect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    /// The byte offset of `transformFeedbackDraw`.
    public static final long OFFSET_transformFeedbackDraw = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackDraw"));
    /// The memory layout of `transformFeedbackDraw`.
    public static final MemoryLayout LAYOUT_transformFeedbackDraw = LAYOUT.select(PathElement.groupElement("transformFeedbackDraw"));
    /// The [VarHandle] of `transformFeedbackDraw` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformFeedbackDraw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackDraw"));

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackPropertiesEXT`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackPropertiesEXT`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT copyFrom(VkPhysicalDeviceTransformFeedbackPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxTransformFeedbackStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTransformFeedbackStreams(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackStreams.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackStreams`}
    public int maxTransformFeedbackStreams() { return maxTransformFeedbackStreams(this.segment(), 0L); }
    /// Sets `maxTransformFeedbackStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTransformFeedbackStreams(MemorySegment segment, long index, int value) { VH_maxTransformFeedbackStreams.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreams(int value) { maxTransformFeedbackStreams(this.segment(), 0L, value); return this; }

    /// {@return `maxTransformFeedbackBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTransformFeedbackBuffers(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackBuffers.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBuffers`}
    public int maxTransformFeedbackBuffers() { return maxTransformFeedbackBuffers(this.segment(), 0L); }
    /// Sets `maxTransformFeedbackBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTransformFeedbackBuffers(MemorySegment segment, long index, int value) { VH_maxTransformFeedbackBuffers.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffers(int value) { maxTransformFeedbackBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxTransformFeedbackBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTransformFeedbackBufferSize(MemorySegment segment, long index) { return (long) VH_maxTransformFeedbackBufferSize.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBufferSize`}
    public long maxTransformFeedbackBufferSize() { return maxTransformFeedbackBufferSize(this.segment(), 0L); }
    /// Sets `maxTransformFeedbackBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTransformFeedbackBufferSize(MemorySegment segment, long index, long value) { VH_maxTransformFeedbackBufferSize.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSize(long value) { maxTransformFeedbackBufferSize(this.segment(), 0L, value); return this; }

    /// {@return `maxTransformFeedbackStreamDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTransformFeedbackStreamDataSize(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackStreamDataSize.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackStreamDataSize`}
    public int maxTransformFeedbackStreamDataSize() { return maxTransformFeedbackStreamDataSize(this.segment(), 0L); }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTransformFeedbackStreamDataSize(MemorySegment segment, long index, int value) { VH_maxTransformFeedbackStreamDataSize.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSize(int value) { maxTransformFeedbackStreamDataSize(this.segment(), 0L, value); return this; }

    /// {@return `maxTransformFeedbackBufferDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTransformFeedbackBufferDataSize(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackBufferDataSize.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBufferDataSize`}
    public int maxTransformFeedbackBufferDataSize() { return maxTransformFeedbackBufferDataSize(this.segment(), 0L); }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTransformFeedbackBufferDataSize(MemorySegment segment, long index, int value) { VH_maxTransformFeedbackBufferDataSize.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSize(int value) { maxTransformFeedbackBufferDataSize(this.segment(), 0L, value); return this; }

    /// {@return `maxTransformFeedbackBufferDataStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTransformFeedbackBufferDataStride(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackBufferDataStride.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBufferDataStride`}
    public int maxTransformFeedbackBufferDataStride() { return maxTransformFeedbackBufferDataStride(this.segment(), 0L); }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTransformFeedbackBufferDataStride(MemorySegment segment, long index, int value) { VH_maxTransformFeedbackBufferDataStride.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStride(int value) { maxTransformFeedbackBufferDataStride(this.segment(), 0L, value); return this; }

    /// {@return `transformFeedbackQueries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformFeedbackQueries(MemorySegment segment, long index) { return (int) VH_transformFeedbackQueries.get(segment, 0L, index); }
    /// {@return `transformFeedbackQueries`}
    public int transformFeedbackQueries() { return transformFeedbackQueries(this.segment(), 0L); }
    /// Sets `transformFeedbackQueries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformFeedbackQueries(MemorySegment segment, long index, int value) { VH_transformFeedbackQueries.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackQueries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueries(int value) { transformFeedbackQueries(this.segment(), 0L, value); return this; }

    /// {@return `transformFeedbackStreamsLinesTriangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformFeedbackStreamsLinesTriangles(MemorySegment segment, long index) { return (int) VH_transformFeedbackStreamsLinesTriangles.get(segment, 0L, index); }
    /// {@return `transformFeedbackStreamsLinesTriangles`}
    public int transformFeedbackStreamsLinesTriangles() { return transformFeedbackStreamsLinesTriangles(this.segment(), 0L); }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformFeedbackStreamsLinesTriangles(MemorySegment segment, long index, int value) { VH_transformFeedbackStreamsLinesTriangles.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTriangles(int value) { transformFeedbackStreamsLinesTriangles(this.segment(), 0L, value); return this; }

    /// {@return `transformFeedbackRasterizationStreamSelect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformFeedbackRasterizationStreamSelect(MemorySegment segment, long index) { return (int) VH_transformFeedbackRasterizationStreamSelect.get(segment, 0L, index); }
    /// {@return `transformFeedbackRasterizationStreamSelect`}
    public int transformFeedbackRasterizationStreamSelect() { return transformFeedbackRasterizationStreamSelect(this.segment(), 0L); }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformFeedbackRasterizationStreamSelect(MemorySegment segment, long index, int value) { VH_transformFeedbackRasterizationStreamSelect.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelect(int value) { transformFeedbackRasterizationStreamSelect(this.segment(), 0L, value); return this; }

    /// {@return `transformFeedbackDraw` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformFeedbackDraw(MemorySegment segment, long index) { return (int) VH_transformFeedbackDraw.get(segment, 0L, index); }
    /// {@return `transformFeedbackDraw`}
    public int transformFeedbackDraw() { return transformFeedbackDraw(this.segment(), 0L); }
    /// Sets `transformFeedbackDraw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformFeedbackDraw(MemorySegment segment, long index, int value) { VH_transformFeedbackDraw.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackDraw` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDraw(int value) { transformFeedbackDraw(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTransformFeedbackPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTransformFeedbackPropertiesEXT`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTransformFeedbackPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTransformFeedbackPropertiesEXT`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTransformFeedbackPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT at(long index, Consumer<VkPhysicalDeviceTransformFeedbackPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxTransformFeedbackStreams` at the given index}
    /// @param index the index of the struct buffer
    public int maxTransformFeedbackStreamsAt(long index) { return maxTransformFeedbackStreams(this.segment(), index); }
    /// Sets `maxTransformFeedbackStreams` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamsAt(long index, int value) { maxTransformFeedbackStreams(this.segment(), index, value); return this; }

    /// {@return `maxTransformFeedbackBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int maxTransformFeedbackBuffersAt(long index) { return maxTransformFeedbackBuffers(this.segment(), index); }
    /// Sets `maxTransformFeedbackBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffersAt(long index, int value) { maxTransformFeedbackBuffers(this.segment(), index, value); return this; }

    /// {@return `maxTransformFeedbackBufferSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxTransformFeedbackBufferSizeAt(long index) { return maxTransformFeedbackBufferSize(this.segment(), index); }
    /// Sets `maxTransformFeedbackBufferSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSizeAt(long index, long value) { maxTransformFeedbackBufferSize(this.segment(), index, value); return this; }

    /// {@return `maxTransformFeedbackStreamDataSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxTransformFeedbackStreamDataSizeAt(long index) { return maxTransformFeedbackStreamDataSize(this.segment(), index); }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSizeAt(long index, int value) { maxTransformFeedbackStreamDataSize(this.segment(), index, value); return this; }

    /// {@return `maxTransformFeedbackBufferDataSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxTransformFeedbackBufferDataSizeAt(long index) { return maxTransformFeedbackBufferDataSize(this.segment(), index); }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSizeAt(long index, int value) { maxTransformFeedbackBufferDataSize(this.segment(), index, value); return this; }

    /// {@return `maxTransformFeedbackBufferDataStride` at the given index}
    /// @param index the index of the struct buffer
    public int maxTransformFeedbackBufferDataStrideAt(long index) { return maxTransformFeedbackBufferDataStride(this.segment(), index); }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStrideAt(long index, int value) { maxTransformFeedbackBufferDataStride(this.segment(), index, value); return this; }

    /// {@return `transformFeedbackQueries` at the given index}
    /// @param index the index of the struct buffer
    public int transformFeedbackQueriesAt(long index) { return transformFeedbackQueries(this.segment(), index); }
    /// Sets `transformFeedbackQueries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueriesAt(long index, int value) { transformFeedbackQueries(this.segment(), index, value); return this; }

    /// {@return `transformFeedbackStreamsLinesTriangles` at the given index}
    /// @param index the index of the struct buffer
    public int transformFeedbackStreamsLinesTrianglesAt(long index) { return transformFeedbackStreamsLinesTriangles(this.segment(), index); }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTrianglesAt(long index, int value) { transformFeedbackStreamsLinesTriangles(this.segment(), index, value); return this; }

    /// {@return `transformFeedbackRasterizationStreamSelect` at the given index}
    /// @param index the index of the struct buffer
    public int transformFeedbackRasterizationStreamSelectAt(long index) { return transformFeedbackRasterizationStreamSelect(this.segment(), index); }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelectAt(long index, int value) { transformFeedbackRasterizationStreamSelect(this.segment(), index, value); return this; }

    /// {@return `transformFeedbackDraw` at the given index}
    /// @param index the index of the struct buffer
    public int transformFeedbackDrawAt(long index) { return transformFeedbackDraw(this.segment(), index); }
    /// Sets `transformFeedbackDraw` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDrawAt(long index, int value) { transformFeedbackDraw(this.segment(), index, value); return this; }

}
