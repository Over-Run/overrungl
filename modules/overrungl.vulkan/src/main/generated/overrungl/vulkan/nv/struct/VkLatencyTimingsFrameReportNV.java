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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLatencyTimingsFrameReportNV`.
/// ## Layout
/// ```
/// struct VkLatencyTimingsFrameReportNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t presentID;
///     uint64_t inputSampleTimeUs;
///     uint64_t simStartTimeUs;
///     uint64_t simEndTimeUs;
///     uint64_t renderSubmitStartTimeUs;
///     uint64_t renderSubmitEndTimeUs;
///     uint64_t presentStartTimeUs;
///     uint64_t presentEndTimeUs;
///     uint64_t driverStartTimeUs;
///     uint64_t driverEndTimeUs;
///     uint64_t osRenderQueueStartTimeUs;
///     uint64_t osRenderQueueEndTimeUs;
///     uint64_t gpuRenderStartTimeUs;
///     uint64_t gpuRenderEndTimeUs;
/// };
/// ```
public final class VkLatencyTimingsFrameReportNV extends GroupType {
    /// The struct layout of `VkLatencyTimingsFrameReportNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("inputSampleTimeUs"),
        ValueLayout.JAVA_LONG.withName("simStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("simEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("renderSubmitStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("renderSubmitEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("presentStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("presentEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("driverStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("driverEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("osRenderQueueStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("osRenderQueueEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("gpuRenderStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("gpuRenderEndTimeUs")
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
    /// The byte offset of `presentID`.
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    /// The memory layout of `presentID`.
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The byte offset of `inputSampleTimeUs`.
    public static final long OFFSET_inputSampleTimeUs = LAYOUT.byteOffset(PathElement.groupElement("inputSampleTimeUs"));
    /// The memory layout of `inputSampleTimeUs`.
    public static final MemoryLayout LAYOUT_inputSampleTimeUs = LAYOUT.select(PathElement.groupElement("inputSampleTimeUs"));
    /// The [VarHandle] of `inputSampleTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputSampleTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputSampleTimeUs"));
    /// The byte offset of `simStartTimeUs`.
    public static final long OFFSET_simStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("simStartTimeUs"));
    /// The memory layout of `simStartTimeUs`.
    public static final MemoryLayout LAYOUT_simStartTimeUs = LAYOUT.select(PathElement.groupElement("simStartTimeUs"));
    /// The [VarHandle] of `simStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_simStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simStartTimeUs"));
    /// The byte offset of `simEndTimeUs`.
    public static final long OFFSET_simEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("simEndTimeUs"));
    /// The memory layout of `simEndTimeUs`.
    public static final MemoryLayout LAYOUT_simEndTimeUs = LAYOUT.select(PathElement.groupElement("simEndTimeUs"));
    /// The [VarHandle] of `simEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_simEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simEndTimeUs"));
    /// The byte offset of `renderSubmitStartTimeUs`.
    public static final long OFFSET_renderSubmitStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("renderSubmitStartTimeUs"));
    /// The memory layout of `renderSubmitStartTimeUs`.
    public static final MemoryLayout LAYOUT_renderSubmitStartTimeUs = LAYOUT.select(PathElement.groupElement("renderSubmitStartTimeUs"));
    /// The [VarHandle] of `renderSubmitStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderSubmitStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderSubmitStartTimeUs"));
    /// The byte offset of `renderSubmitEndTimeUs`.
    public static final long OFFSET_renderSubmitEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("renderSubmitEndTimeUs"));
    /// The memory layout of `renderSubmitEndTimeUs`.
    public static final MemoryLayout LAYOUT_renderSubmitEndTimeUs = LAYOUT.select(PathElement.groupElement("renderSubmitEndTimeUs"));
    /// The [VarHandle] of `renderSubmitEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderSubmitEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderSubmitEndTimeUs"));
    /// The byte offset of `presentStartTimeUs`.
    public static final long OFFSET_presentStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("presentStartTimeUs"));
    /// The memory layout of `presentStartTimeUs`.
    public static final MemoryLayout LAYOUT_presentStartTimeUs = LAYOUT.select(PathElement.groupElement("presentStartTimeUs"));
    /// The [VarHandle] of `presentStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStartTimeUs"));
    /// The byte offset of `presentEndTimeUs`.
    public static final long OFFSET_presentEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("presentEndTimeUs"));
    /// The memory layout of `presentEndTimeUs`.
    public static final MemoryLayout LAYOUT_presentEndTimeUs = LAYOUT.select(PathElement.groupElement("presentEndTimeUs"));
    /// The [VarHandle] of `presentEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentEndTimeUs"));
    /// The byte offset of `driverStartTimeUs`.
    public static final long OFFSET_driverStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("driverStartTimeUs"));
    /// The memory layout of `driverStartTimeUs`.
    public static final MemoryLayout LAYOUT_driverStartTimeUs = LAYOUT.select(PathElement.groupElement("driverStartTimeUs"));
    /// The [VarHandle] of `driverStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverStartTimeUs"));
    /// The byte offset of `driverEndTimeUs`.
    public static final long OFFSET_driverEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("driverEndTimeUs"));
    /// The memory layout of `driverEndTimeUs`.
    public static final MemoryLayout LAYOUT_driverEndTimeUs = LAYOUT.select(PathElement.groupElement("driverEndTimeUs"));
    /// The [VarHandle] of `driverEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverEndTimeUs"));
    /// The byte offset of `osRenderQueueStartTimeUs`.
    public static final long OFFSET_osRenderQueueStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("osRenderQueueStartTimeUs"));
    /// The memory layout of `osRenderQueueStartTimeUs`.
    public static final MemoryLayout LAYOUT_osRenderQueueStartTimeUs = LAYOUT.select(PathElement.groupElement("osRenderQueueStartTimeUs"));
    /// The [VarHandle] of `osRenderQueueStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_osRenderQueueStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("osRenderQueueStartTimeUs"));
    /// The byte offset of `osRenderQueueEndTimeUs`.
    public static final long OFFSET_osRenderQueueEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("osRenderQueueEndTimeUs"));
    /// The memory layout of `osRenderQueueEndTimeUs`.
    public static final MemoryLayout LAYOUT_osRenderQueueEndTimeUs = LAYOUT.select(PathElement.groupElement("osRenderQueueEndTimeUs"));
    /// The [VarHandle] of `osRenderQueueEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_osRenderQueueEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("osRenderQueueEndTimeUs"));
    /// The byte offset of `gpuRenderStartTimeUs`.
    public static final long OFFSET_gpuRenderStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("gpuRenderStartTimeUs"));
    /// The memory layout of `gpuRenderStartTimeUs`.
    public static final MemoryLayout LAYOUT_gpuRenderStartTimeUs = LAYOUT.select(PathElement.groupElement("gpuRenderStartTimeUs"));
    /// The [VarHandle] of `gpuRenderStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gpuRenderStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpuRenderStartTimeUs"));
    /// The byte offset of `gpuRenderEndTimeUs`.
    public static final long OFFSET_gpuRenderEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("gpuRenderEndTimeUs"));
    /// The memory layout of `gpuRenderEndTimeUs`.
    public static final MemoryLayout LAYOUT_gpuRenderEndTimeUs = LAYOUT.select(PathElement.groupElement("gpuRenderEndTimeUs"));
    /// The [VarHandle] of `gpuRenderEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gpuRenderEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpuRenderEndTimeUs"));

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkLatencyTimingsFrameReportNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencyTimingsFrameReportNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencyTimingsFrameReportNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencyTimingsFrameReportNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkLatencyTimingsFrameReportNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencyTimingsFrameReportNV`
    public static VkLatencyTimingsFrameReportNV alloc(SegmentAllocator allocator) { return new VkLatencyTimingsFrameReportNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkLatencyTimingsFrameReportNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencyTimingsFrameReportNV`
    public static VkLatencyTimingsFrameReportNV alloc(SegmentAllocator allocator, long count) { return new VkLatencyTimingsFrameReportNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencyTimingsFrameReportNV copyFrom(VkLatencyTimingsFrameReportNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkLatencyTimingsFrameReportNV reinterpret(long count) { return new VkLatencyTimingsFrameReportNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkLatencyTimingsFrameReportNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkLatencyTimingsFrameReportNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentID(MemorySegment segment, long index) { return (long) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    public long presentID() { return presentID(this.segment(), 0L); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentID(MemorySegment segment, long index, long value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentID(long value) { presentID(this.segment(), 0L, value); return this; }

    /// {@return `inputSampleTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long inputSampleTimeUs(MemorySegment segment, long index) { return (long) VH_inputSampleTimeUs.get(segment, 0L, index); }
    /// {@return `inputSampleTimeUs`}
    public long inputSampleTimeUs() { return inputSampleTimeUs(this.segment(), 0L); }
    /// Sets `inputSampleTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputSampleTimeUs(MemorySegment segment, long index, long value) { VH_inputSampleTimeUs.set(segment, 0L, index, value); }
    /// Sets `inputSampleTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV inputSampleTimeUs(long value) { inputSampleTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `simStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long simStartTimeUs(MemorySegment segment, long index) { return (long) VH_simStartTimeUs.get(segment, 0L, index); }
    /// {@return `simStartTimeUs`}
    public long simStartTimeUs() { return simStartTimeUs(this.segment(), 0L); }
    /// Sets `simStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void simStartTimeUs(MemorySegment segment, long index, long value) { VH_simStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `simStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV simStartTimeUs(long value) { simStartTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `simEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long simEndTimeUs(MemorySegment segment, long index) { return (long) VH_simEndTimeUs.get(segment, 0L, index); }
    /// {@return `simEndTimeUs`}
    public long simEndTimeUs() { return simEndTimeUs(this.segment(), 0L); }
    /// Sets `simEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void simEndTimeUs(MemorySegment segment, long index, long value) { VH_simEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `simEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV simEndTimeUs(long value) { simEndTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `renderSubmitStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderSubmitStartTimeUs(MemorySegment segment, long index) { return (long) VH_renderSubmitStartTimeUs.get(segment, 0L, index); }
    /// {@return `renderSubmitStartTimeUs`}
    public long renderSubmitStartTimeUs() { return renderSubmitStartTimeUs(this.segment(), 0L); }
    /// Sets `renderSubmitStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderSubmitStartTimeUs(MemorySegment segment, long index, long value) { VH_renderSubmitStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `renderSubmitStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV renderSubmitStartTimeUs(long value) { renderSubmitStartTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `renderSubmitEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderSubmitEndTimeUs(MemorySegment segment, long index) { return (long) VH_renderSubmitEndTimeUs.get(segment, 0L, index); }
    /// {@return `renderSubmitEndTimeUs`}
    public long renderSubmitEndTimeUs() { return renderSubmitEndTimeUs(this.segment(), 0L); }
    /// Sets `renderSubmitEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderSubmitEndTimeUs(MemorySegment segment, long index, long value) { VH_renderSubmitEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `renderSubmitEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV renderSubmitEndTimeUs(long value) { renderSubmitEndTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `presentStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentStartTimeUs(MemorySegment segment, long index) { return (long) VH_presentStartTimeUs.get(segment, 0L, index); }
    /// {@return `presentStartTimeUs`}
    public long presentStartTimeUs() { return presentStartTimeUs(this.segment(), 0L); }
    /// Sets `presentStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentStartTimeUs(MemorySegment segment, long index, long value) { VH_presentStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `presentStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentStartTimeUs(long value) { presentStartTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `presentEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentEndTimeUs(MemorySegment segment, long index) { return (long) VH_presentEndTimeUs.get(segment, 0L, index); }
    /// {@return `presentEndTimeUs`}
    public long presentEndTimeUs() { return presentEndTimeUs(this.segment(), 0L); }
    /// Sets `presentEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentEndTimeUs(MemorySegment segment, long index, long value) { VH_presentEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `presentEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentEndTimeUs(long value) { presentEndTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `driverStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long driverStartTimeUs(MemorySegment segment, long index) { return (long) VH_driverStartTimeUs.get(segment, 0L, index); }
    /// {@return `driverStartTimeUs`}
    public long driverStartTimeUs() { return driverStartTimeUs(this.segment(), 0L); }
    /// Sets `driverStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverStartTimeUs(MemorySegment segment, long index, long value) { VH_driverStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `driverStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV driverStartTimeUs(long value) { driverStartTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `driverEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long driverEndTimeUs(MemorySegment segment, long index) { return (long) VH_driverEndTimeUs.get(segment, 0L, index); }
    /// {@return `driverEndTimeUs`}
    public long driverEndTimeUs() { return driverEndTimeUs(this.segment(), 0L); }
    /// Sets `driverEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverEndTimeUs(MemorySegment segment, long index, long value) { VH_driverEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `driverEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV driverEndTimeUs(long value) { driverEndTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `osRenderQueueStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long osRenderQueueStartTimeUs(MemorySegment segment, long index) { return (long) VH_osRenderQueueStartTimeUs.get(segment, 0L, index); }
    /// {@return `osRenderQueueStartTimeUs`}
    public long osRenderQueueStartTimeUs() { return osRenderQueueStartTimeUs(this.segment(), 0L); }
    /// Sets `osRenderQueueStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void osRenderQueueStartTimeUs(MemorySegment segment, long index, long value) { VH_osRenderQueueStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `osRenderQueueStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV osRenderQueueStartTimeUs(long value) { osRenderQueueStartTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `osRenderQueueEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long osRenderQueueEndTimeUs(MemorySegment segment, long index) { return (long) VH_osRenderQueueEndTimeUs.get(segment, 0L, index); }
    /// {@return `osRenderQueueEndTimeUs`}
    public long osRenderQueueEndTimeUs() { return osRenderQueueEndTimeUs(this.segment(), 0L); }
    /// Sets `osRenderQueueEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void osRenderQueueEndTimeUs(MemorySegment segment, long index, long value) { VH_osRenderQueueEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `osRenderQueueEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV osRenderQueueEndTimeUs(long value) { osRenderQueueEndTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `gpuRenderStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long gpuRenderStartTimeUs(MemorySegment segment, long index) { return (long) VH_gpuRenderStartTimeUs.get(segment, 0L, index); }
    /// {@return `gpuRenderStartTimeUs`}
    public long gpuRenderStartTimeUs() { return gpuRenderStartTimeUs(this.segment(), 0L); }
    /// Sets `gpuRenderStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gpuRenderStartTimeUs(MemorySegment segment, long index, long value) { VH_gpuRenderStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `gpuRenderStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV gpuRenderStartTimeUs(long value) { gpuRenderStartTimeUs(this.segment(), 0L, value); return this; }

    /// {@return `gpuRenderEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long gpuRenderEndTimeUs(MemorySegment segment, long index) { return (long) VH_gpuRenderEndTimeUs.get(segment, 0L, index); }
    /// {@return `gpuRenderEndTimeUs`}
    public long gpuRenderEndTimeUs() { return gpuRenderEndTimeUs(this.segment(), 0L); }
    /// Sets `gpuRenderEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gpuRenderEndTimeUs(MemorySegment segment, long index, long value) { VH_gpuRenderEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `gpuRenderEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV gpuRenderEndTimeUs(long value) { gpuRenderEndTimeUs(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkLatencyTimingsFrameReportNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLatencyTimingsFrameReportNV`
    public VkLatencyTimingsFrameReportNV asSlice(long index) { return new VkLatencyTimingsFrameReportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkLatencyTimingsFrameReportNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLatencyTimingsFrameReportNV`
    public VkLatencyTimingsFrameReportNV asSlice(long index, long count) { return new VkLatencyTimingsFrameReportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkLatencyTimingsFrameReportNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkLatencyTimingsFrameReportNV at(long index, Consumer<VkLatencyTimingsFrameReportNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentID` at the given index}
    /// @param index the index of the struct buffer
    public long presentIDAt(long index) { return presentID(this.segment(), index); }
    /// Sets `presentID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentIDAt(long index, long value) { presentID(this.segment(), index, value); return this; }

    /// {@return `inputSampleTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long inputSampleTimeUsAt(long index) { return inputSampleTimeUs(this.segment(), index); }
    /// Sets `inputSampleTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV inputSampleTimeUsAt(long index, long value) { inputSampleTimeUs(this.segment(), index, value); return this; }

    /// {@return `simStartTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long simStartTimeUsAt(long index) { return simStartTimeUs(this.segment(), index); }
    /// Sets `simStartTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV simStartTimeUsAt(long index, long value) { simStartTimeUs(this.segment(), index, value); return this; }

    /// {@return `simEndTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long simEndTimeUsAt(long index) { return simEndTimeUs(this.segment(), index); }
    /// Sets `simEndTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV simEndTimeUsAt(long index, long value) { simEndTimeUs(this.segment(), index, value); return this; }

    /// {@return `renderSubmitStartTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long renderSubmitStartTimeUsAt(long index) { return renderSubmitStartTimeUs(this.segment(), index); }
    /// Sets `renderSubmitStartTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV renderSubmitStartTimeUsAt(long index, long value) { renderSubmitStartTimeUs(this.segment(), index, value); return this; }

    /// {@return `renderSubmitEndTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long renderSubmitEndTimeUsAt(long index) { return renderSubmitEndTimeUs(this.segment(), index); }
    /// Sets `renderSubmitEndTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV renderSubmitEndTimeUsAt(long index, long value) { renderSubmitEndTimeUs(this.segment(), index, value); return this; }

    /// {@return `presentStartTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long presentStartTimeUsAt(long index) { return presentStartTimeUs(this.segment(), index); }
    /// Sets `presentStartTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentStartTimeUsAt(long index, long value) { presentStartTimeUs(this.segment(), index, value); return this; }

    /// {@return `presentEndTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long presentEndTimeUsAt(long index) { return presentEndTimeUs(this.segment(), index); }
    /// Sets `presentEndTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentEndTimeUsAt(long index, long value) { presentEndTimeUs(this.segment(), index, value); return this; }

    /// {@return `driverStartTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long driverStartTimeUsAt(long index) { return driverStartTimeUs(this.segment(), index); }
    /// Sets `driverStartTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV driverStartTimeUsAt(long index, long value) { driverStartTimeUs(this.segment(), index, value); return this; }

    /// {@return `driverEndTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long driverEndTimeUsAt(long index) { return driverEndTimeUs(this.segment(), index); }
    /// Sets `driverEndTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV driverEndTimeUsAt(long index, long value) { driverEndTimeUs(this.segment(), index, value); return this; }

    /// {@return `osRenderQueueStartTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long osRenderQueueStartTimeUsAt(long index) { return osRenderQueueStartTimeUs(this.segment(), index); }
    /// Sets `osRenderQueueStartTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV osRenderQueueStartTimeUsAt(long index, long value) { osRenderQueueStartTimeUs(this.segment(), index, value); return this; }

    /// {@return `osRenderQueueEndTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long osRenderQueueEndTimeUsAt(long index) { return osRenderQueueEndTimeUs(this.segment(), index); }
    /// Sets `osRenderQueueEndTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV osRenderQueueEndTimeUsAt(long index, long value) { osRenderQueueEndTimeUs(this.segment(), index, value); return this; }

    /// {@return `gpuRenderStartTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long gpuRenderStartTimeUsAt(long index) { return gpuRenderStartTimeUs(this.segment(), index); }
    /// Sets `gpuRenderStartTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV gpuRenderStartTimeUsAt(long index, long value) { gpuRenderStartTimeUs(this.segment(), index, value); return this; }

    /// {@return `gpuRenderEndTimeUs` at the given index}
    /// @param index the index of the struct buffer
    public long gpuRenderEndTimeUsAt(long index) { return gpuRenderEndTimeUs(this.segment(), index); }
    /// Sets `gpuRenderEndTimeUs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV gpuRenderEndTimeUsAt(long index, long value) { gpuRenderEndTimeUs(this.segment(), index, value); return this; }

}
