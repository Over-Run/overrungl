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
package overrungl.vulkan.nv.struct;

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
/// ### presentID
/// [VarHandle][#VH_presentID] - [Getter][#presentID()] - [Setter][#presentID(long)]
/// ### inputSampleTimeUs
/// [VarHandle][#VH_inputSampleTimeUs] - [Getter][#inputSampleTimeUs()] - [Setter][#inputSampleTimeUs(long)]
/// ### simStartTimeUs
/// [VarHandle][#VH_simStartTimeUs] - [Getter][#simStartTimeUs()] - [Setter][#simStartTimeUs(long)]
/// ### simEndTimeUs
/// [VarHandle][#VH_simEndTimeUs] - [Getter][#simEndTimeUs()] - [Setter][#simEndTimeUs(long)]
/// ### renderSubmitStartTimeUs
/// [VarHandle][#VH_renderSubmitStartTimeUs] - [Getter][#renderSubmitStartTimeUs()] - [Setter][#renderSubmitStartTimeUs(long)]
/// ### renderSubmitEndTimeUs
/// [VarHandle][#VH_renderSubmitEndTimeUs] - [Getter][#renderSubmitEndTimeUs()] - [Setter][#renderSubmitEndTimeUs(long)]
/// ### presentStartTimeUs
/// [VarHandle][#VH_presentStartTimeUs] - [Getter][#presentStartTimeUs()] - [Setter][#presentStartTimeUs(long)]
/// ### presentEndTimeUs
/// [VarHandle][#VH_presentEndTimeUs] - [Getter][#presentEndTimeUs()] - [Setter][#presentEndTimeUs(long)]
/// ### driverStartTimeUs
/// [VarHandle][#VH_driverStartTimeUs] - [Getter][#driverStartTimeUs()] - [Setter][#driverStartTimeUs(long)]
/// ### driverEndTimeUs
/// [VarHandle][#VH_driverEndTimeUs] - [Getter][#driverEndTimeUs()] - [Setter][#driverEndTimeUs(long)]
/// ### osRenderQueueStartTimeUs
/// [VarHandle][#VH_osRenderQueueStartTimeUs] - [Getter][#osRenderQueueStartTimeUs()] - [Setter][#osRenderQueueStartTimeUs(long)]
/// ### osRenderQueueEndTimeUs
/// [VarHandle][#VH_osRenderQueueEndTimeUs] - [Getter][#osRenderQueueEndTimeUs()] - [Setter][#osRenderQueueEndTimeUs(long)]
/// ### gpuRenderStartTimeUs
/// [VarHandle][#VH_gpuRenderStartTimeUs] - [Getter][#gpuRenderStartTimeUs()] - [Setter][#gpuRenderStartTimeUs(long)]
/// ### gpuRenderEndTimeUs
/// [VarHandle][#VH_gpuRenderEndTimeUs] - [Getter][#gpuRenderEndTimeUs()] - [Setter][#gpuRenderEndTimeUs(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLatencyTimingsFrameReportNV {
///     VkStructureType sType;
///     const void * pNext;
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
/// } VkLatencyTimingsFrameReportNV;
/// ```
public sealed class VkLatencyTimingsFrameReportNV extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `inputSampleTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_inputSampleTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputSampleTimeUs"));
    /// The [VarHandle] of `simStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_simStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simStartTimeUs"));
    /// The [VarHandle] of `simEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_simEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simEndTimeUs"));
    /// The [VarHandle] of `renderSubmitStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_renderSubmitStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderSubmitStartTimeUs"));
    /// The [VarHandle] of `renderSubmitEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_renderSubmitEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderSubmitEndTimeUs"));
    /// The [VarHandle] of `presentStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_presentStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStartTimeUs"));
    /// The [VarHandle] of `presentEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_presentEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentEndTimeUs"));
    /// The [VarHandle] of `driverStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_driverStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverStartTimeUs"));
    /// The [VarHandle] of `driverEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_driverEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverEndTimeUs"));
    /// The [VarHandle] of `osRenderQueueStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_osRenderQueueStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("osRenderQueueStartTimeUs"));
    /// The [VarHandle] of `osRenderQueueEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_osRenderQueueEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("osRenderQueueEndTimeUs"));
    /// The [VarHandle] of `gpuRenderStartTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_gpuRenderStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpuRenderStartTimeUs"));
    /// The [VarHandle] of `gpuRenderEndTimeUs` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_gpuRenderEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpuRenderEndTimeUs"));

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    /// @param segment the memory segment
    public VkLatencyTimingsFrameReportNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencyTimingsFrameReportNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencyTimingsFrameReportNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLatencyTimingsFrameReportNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLatencyTimingsFrameReportNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencyTimingsFrameReportNV`
    public static VkLatencyTimingsFrameReportNV alloc(SegmentAllocator allocator) { return new VkLatencyTimingsFrameReportNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLatencyTimingsFrameReportNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencyTimingsFrameReportNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLatencyTimingsFrameReportNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencyTimingsFrameReportNV`
    public static VkLatencyTimingsFrameReportNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint64_t") long presentID, @CType("uint64_t") long inputSampleTimeUs, @CType("uint64_t") long simStartTimeUs, @CType("uint64_t") long simEndTimeUs, @CType("uint64_t") long renderSubmitStartTimeUs, @CType("uint64_t") long renderSubmitEndTimeUs, @CType("uint64_t") long presentStartTimeUs, @CType("uint64_t") long presentEndTimeUs, @CType("uint64_t") long driverStartTimeUs, @CType("uint64_t") long driverEndTimeUs, @CType("uint64_t") long osRenderQueueStartTimeUs, @CType("uint64_t") long osRenderQueueEndTimeUs, @CType("uint64_t") long gpuRenderStartTimeUs, @CType("uint64_t") long gpuRenderEndTimeUs) { return alloc(allocator).sType(sType).pNext(pNext).presentID(presentID).inputSampleTimeUs(inputSampleTimeUs).simStartTimeUs(simStartTimeUs).simEndTimeUs(simEndTimeUs).renderSubmitStartTimeUs(renderSubmitStartTimeUs).renderSubmitEndTimeUs(renderSubmitEndTimeUs).presentStartTimeUs(presentStartTimeUs).presentEndTimeUs(presentEndTimeUs).driverStartTimeUs(driverStartTimeUs).driverEndTimeUs(driverEndTimeUs).osRenderQueueStartTimeUs(osRenderQueueStartTimeUs).osRenderQueueEndTimeUs(osRenderQueueEndTimeUs).gpuRenderStartTimeUs(gpuRenderStartTimeUs).gpuRenderEndTimeUs(gpuRenderEndTimeUs); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencyTimingsFrameReportNV copyFrom(VkLatencyTimingsFrameReportNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkLatencyTimingsFrameReportNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkLatencyTimingsFrameReportNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV sType(@CType("VkStructureType") int value) { VkLatencyTimingsFrameReportNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkLatencyTimingsFrameReportNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkLatencyTimingsFrameReportNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV pNext(@CType("const void *") MemorySegment value) { VkLatencyTimingsFrameReportNV.set_pNext(this.segment(), value); return this; }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_presentID(MemorySegment segment, long index) { return (long) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_presentID(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_presentID(segment, 0L); }
    /// {@return `presentID`}
    public @CType("uint64_t") long presentID() { return VkLatencyTimingsFrameReportNV.get_presentID(this.segment()); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentID(segment, 0L, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentID(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentID(this.segment(), value); return this; }

    /// {@return `inputSampleTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_inputSampleTimeUs(MemorySegment segment, long index) { return (long) VH_inputSampleTimeUs.get(segment, 0L, index); }
    /// {@return `inputSampleTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_inputSampleTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_inputSampleTimeUs(segment, 0L); }
    /// {@return `inputSampleTimeUs`}
    public @CType("uint64_t") long inputSampleTimeUs() { return VkLatencyTimingsFrameReportNV.get_inputSampleTimeUs(this.segment()); }
    /// Sets `inputSampleTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputSampleTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_inputSampleTimeUs.set(segment, 0L, index, value); }
    /// Sets `inputSampleTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputSampleTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_inputSampleTimeUs(segment, 0L, value); }
    /// Sets `inputSampleTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV inputSampleTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_inputSampleTimeUs(this.segment(), value); return this; }

    /// {@return `simStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_simStartTimeUs(MemorySegment segment, long index) { return (long) VH_simStartTimeUs.get(segment, 0L, index); }
    /// {@return `simStartTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_simStartTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_simStartTimeUs(segment, 0L); }
    /// {@return `simStartTimeUs`}
    public @CType("uint64_t") long simStartTimeUs() { return VkLatencyTimingsFrameReportNV.get_simStartTimeUs(this.segment()); }
    /// Sets `simStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_simStartTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_simStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `simStartTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_simStartTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_simStartTimeUs(segment, 0L, value); }
    /// Sets `simStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV simStartTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_simStartTimeUs(this.segment(), value); return this; }

    /// {@return `simEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_simEndTimeUs(MemorySegment segment, long index) { return (long) VH_simEndTimeUs.get(segment, 0L, index); }
    /// {@return `simEndTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_simEndTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_simEndTimeUs(segment, 0L); }
    /// {@return `simEndTimeUs`}
    public @CType("uint64_t") long simEndTimeUs() { return VkLatencyTimingsFrameReportNV.get_simEndTimeUs(this.segment()); }
    /// Sets `simEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_simEndTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_simEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `simEndTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_simEndTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_simEndTimeUs(segment, 0L, value); }
    /// Sets `simEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV simEndTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_simEndTimeUs(this.segment(), value); return this; }

    /// {@return `renderSubmitStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_renderSubmitStartTimeUs(MemorySegment segment, long index) { return (long) VH_renderSubmitStartTimeUs.get(segment, 0L, index); }
    /// {@return `renderSubmitStartTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_renderSubmitStartTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_renderSubmitStartTimeUs(segment, 0L); }
    /// {@return `renderSubmitStartTimeUs`}
    public @CType("uint64_t") long renderSubmitStartTimeUs() { return VkLatencyTimingsFrameReportNV.get_renderSubmitStartTimeUs(this.segment()); }
    /// Sets `renderSubmitStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderSubmitStartTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_renderSubmitStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `renderSubmitStartTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderSubmitStartTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_renderSubmitStartTimeUs(segment, 0L, value); }
    /// Sets `renderSubmitStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV renderSubmitStartTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_renderSubmitStartTimeUs(this.segment(), value); return this; }

    /// {@return `renderSubmitEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_renderSubmitEndTimeUs(MemorySegment segment, long index) { return (long) VH_renderSubmitEndTimeUs.get(segment, 0L, index); }
    /// {@return `renderSubmitEndTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_renderSubmitEndTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_renderSubmitEndTimeUs(segment, 0L); }
    /// {@return `renderSubmitEndTimeUs`}
    public @CType("uint64_t") long renderSubmitEndTimeUs() { return VkLatencyTimingsFrameReportNV.get_renderSubmitEndTimeUs(this.segment()); }
    /// Sets `renderSubmitEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderSubmitEndTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_renderSubmitEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `renderSubmitEndTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderSubmitEndTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_renderSubmitEndTimeUs(segment, 0L, value); }
    /// Sets `renderSubmitEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV renderSubmitEndTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_renderSubmitEndTimeUs(this.segment(), value); return this; }

    /// {@return `presentStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_presentStartTimeUs(MemorySegment segment, long index) { return (long) VH_presentStartTimeUs.get(segment, 0L, index); }
    /// {@return `presentStartTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_presentStartTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_presentStartTimeUs(segment, 0L); }
    /// {@return `presentStartTimeUs`}
    public @CType("uint64_t") long presentStartTimeUs() { return VkLatencyTimingsFrameReportNV.get_presentStartTimeUs(this.segment()); }
    /// Sets `presentStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentStartTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_presentStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `presentStartTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentStartTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentStartTimeUs(segment, 0L, value); }
    /// Sets `presentStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentStartTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentStartTimeUs(this.segment(), value); return this; }

    /// {@return `presentEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_presentEndTimeUs(MemorySegment segment, long index) { return (long) VH_presentEndTimeUs.get(segment, 0L, index); }
    /// {@return `presentEndTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_presentEndTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_presentEndTimeUs(segment, 0L); }
    /// {@return `presentEndTimeUs`}
    public @CType("uint64_t") long presentEndTimeUs() { return VkLatencyTimingsFrameReportNV.get_presentEndTimeUs(this.segment()); }
    /// Sets `presentEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentEndTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_presentEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `presentEndTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentEndTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentEndTimeUs(segment, 0L, value); }
    /// Sets `presentEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV presentEndTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentEndTimeUs(this.segment(), value); return this; }

    /// {@return `driverStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_driverStartTimeUs(MemorySegment segment, long index) { return (long) VH_driverStartTimeUs.get(segment, 0L, index); }
    /// {@return `driverStartTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_driverStartTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_driverStartTimeUs(segment, 0L); }
    /// {@return `driverStartTimeUs`}
    public @CType("uint64_t") long driverStartTimeUs() { return VkLatencyTimingsFrameReportNV.get_driverStartTimeUs(this.segment()); }
    /// Sets `driverStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverStartTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_driverStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `driverStartTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverStartTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_driverStartTimeUs(segment, 0L, value); }
    /// Sets `driverStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV driverStartTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_driverStartTimeUs(this.segment(), value); return this; }

    /// {@return `driverEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_driverEndTimeUs(MemorySegment segment, long index) { return (long) VH_driverEndTimeUs.get(segment, 0L, index); }
    /// {@return `driverEndTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_driverEndTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_driverEndTimeUs(segment, 0L); }
    /// {@return `driverEndTimeUs`}
    public @CType("uint64_t") long driverEndTimeUs() { return VkLatencyTimingsFrameReportNV.get_driverEndTimeUs(this.segment()); }
    /// Sets `driverEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverEndTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_driverEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `driverEndTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverEndTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_driverEndTimeUs(segment, 0L, value); }
    /// Sets `driverEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV driverEndTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_driverEndTimeUs(this.segment(), value); return this; }

    /// {@return `osRenderQueueStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_osRenderQueueStartTimeUs(MemorySegment segment, long index) { return (long) VH_osRenderQueueStartTimeUs.get(segment, 0L, index); }
    /// {@return `osRenderQueueStartTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_osRenderQueueStartTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_osRenderQueueStartTimeUs(segment, 0L); }
    /// {@return `osRenderQueueStartTimeUs`}
    public @CType("uint64_t") long osRenderQueueStartTimeUs() { return VkLatencyTimingsFrameReportNV.get_osRenderQueueStartTimeUs(this.segment()); }
    /// Sets `osRenderQueueStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_osRenderQueueStartTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_osRenderQueueStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `osRenderQueueStartTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_osRenderQueueStartTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_osRenderQueueStartTimeUs(segment, 0L, value); }
    /// Sets `osRenderQueueStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV osRenderQueueStartTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_osRenderQueueStartTimeUs(this.segment(), value); return this; }

    /// {@return `osRenderQueueEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_osRenderQueueEndTimeUs(MemorySegment segment, long index) { return (long) VH_osRenderQueueEndTimeUs.get(segment, 0L, index); }
    /// {@return `osRenderQueueEndTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_osRenderQueueEndTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_osRenderQueueEndTimeUs(segment, 0L); }
    /// {@return `osRenderQueueEndTimeUs`}
    public @CType("uint64_t") long osRenderQueueEndTimeUs() { return VkLatencyTimingsFrameReportNV.get_osRenderQueueEndTimeUs(this.segment()); }
    /// Sets `osRenderQueueEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_osRenderQueueEndTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_osRenderQueueEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `osRenderQueueEndTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_osRenderQueueEndTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_osRenderQueueEndTimeUs(segment, 0L, value); }
    /// Sets `osRenderQueueEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV osRenderQueueEndTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_osRenderQueueEndTimeUs(this.segment(), value); return this; }

    /// {@return `gpuRenderStartTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_gpuRenderStartTimeUs(MemorySegment segment, long index) { return (long) VH_gpuRenderStartTimeUs.get(segment, 0L, index); }
    /// {@return `gpuRenderStartTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_gpuRenderStartTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_gpuRenderStartTimeUs(segment, 0L); }
    /// {@return `gpuRenderStartTimeUs`}
    public @CType("uint64_t") long gpuRenderStartTimeUs() { return VkLatencyTimingsFrameReportNV.get_gpuRenderStartTimeUs(this.segment()); }
    /// Sets `gpuRenderStartTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gpuRenderStartTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_gpuRenderStartTimeUs.set(segment, 0L, index, value); }
    /// Sets `gpuRenderStartTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gpuRenderStartTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_gpuRenderStartTimeUs(segment, 0L, value); }
    /// Sets `gpuRenderStartTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV gpuRenderStartTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_gpuRenderStartTimeUs(this.segment(), value); return this; }

    /// {@return `gpuRenderEndTimeUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_gpuRenderEndTimeUs(MemorySegment segment, long index) { return (long) VH_gpuRenderEndTimeUs.get(segment, 0L, index); }
    /// {@return `gpuRenderEndTimeUs`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_gpuRenderEndTimeUs(MemorySegment segment) { return VkLatencyTimingsFrameReportNV.get_gpuRenderEndTimeUs(segment, 0L); }
    /// {@return `gpuRenderEndTimeUs`}
    public @CType("uint64_t") long gpuRenderEndTimeUs() { return VkLatencyTimingsFrameReportNV.get_gpuRenderEndTimeUs(this.segment()); }
    /// Sets `gpuRenderEndTimeUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gpuRenderEndTimeUs(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_gpuRenderEndTimeUs.set(segment, 0L, index, value); }
    /// Sets `gpuRenderEndTimeUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gpuRenderEndTimeUs(MemorySegment segment, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_gpuRenderEndTimeUs(segment, 0L, value); }
    /// Sets `gpuRenderEndTimeUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencyTimingsFrameReportNV gpuRenderEndTimeUs(@CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_gpuRenderEndTimeUs(this.segment(), value); return this; }

    /// A buffer of [VkLatencyTimingsFrameReportNV].
    public static final class Buffer extends VkLatencyTimingsFrameReportNV {
        private final long elementCount;

        /// Creates `VkLatencyTimingsFrameReportNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLatencyTimingsFrameReportNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLatencyTimingsFrameReportNV`
        public VkLatencyTimingsFrameReportNV asSlice(long index) { return new VkLatencyTimingsFrameReportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLatencyTimingsFrameReportNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLatencyTimingsFrameReportNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkLatencyTimingsFrameReportNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkLatencyTimingsFrameReportNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkLatencyTimingsFrameReportNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkLatencyTimingsFrameReportNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `presentID` at the given index}
        /// @param index the index
        public @CType("uint64_t") long presentIDAt(long index) { return VkLatencyTimingsFrameReportNV.get_presentID(this.segment(), index); }
        /// Sets `presentID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentIDAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentID(this.segment(), index, value); return this; }

        /// {@return `inputSampleTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long inputSampleTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_inputSampleTimeUs(this.segment(), index); }
        /// Sets `inputSampleTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer inputSampleTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_inputSampleTimeUs(this.segment(), index, value); return this; }

        /// {@return `simStartTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long simStartTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_simStartTimeUs(this.segment(), index); }
        /// Sets `simStartTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer simStartTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_simStartTimeUs(this.segment(), index, value); return this; }

        /// {@return `simEndTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long simEndTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_simEndTimeUs(this.segment(), index); }
        /// Sets `simEndTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer simEndTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_simEndTimeUs(this.segment(), index, value); return this; }

        /// {@return `renderSubmitStartTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long renderSubmitStartTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_renderSubmitStartTimeUs(this.segment(), index); }
        /// Sets `renderSubmitStartTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderSubmitStartTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_renderSubmitStartTimeUs(this.segment(), index, value); return this; }

        /// {@return `renderSubmitEndTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long renderSubmitEndTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_renderSubmitEndTimeUs(this.segment(), index); }
        /// Sets `renderSubmitEndTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderSubmitEndTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_renderSubmitEndTimeUs(this.segment(), index, value); return this; }

        /// {@return `presentStartTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long presentStartTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_presentStartTimeUs(this.segment(), index); }
        /// Sets `presentStartTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentStartTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentStartTimeUs(this.segment(), index, value); return this; }

        /// {@return `presentEndTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long presentEndTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_presentEndTimeUs(this.segment(), index); }
        /// Sets `presentEndTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentEndTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_presentEndTimeUs(this.segment(), index, value); return this; }

        /// {@return `driverStartTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long driverStartTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_driverStartTimeUs(this.segment(), index); }
        /// Sets `driverStartTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverStartTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_driverStartTimeUs(this.segment(), index, value); return this; }

        /// {@return `driverEndTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long driverEndTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_driverEndTimeUs(this.segment(), index); }
        /// Sets `driverEndTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverEndTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_driverEndTimeUs(this.segment(), index, value); return this; }

        /// {@return `osRenderQueueStartTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long osRenderQueueStartTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_osRenderQueueStartTimeUs(this.segment(), index); }
        /// Sets `osRenderQueueStartTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer osRenderQueueStartTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_osRenderQueueStartTimeUs(this.segment(), index, value); return this; }

        /// {@return `osRenderQueueEndTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long osRenderQueueEndTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_osRenderQueueEndTimeUs(this.segment(), index); }
        /// Sets `osRenderQueueEndTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer osRenderQueueEndTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_osRenderQueueEndTimeUs(this.segment(), index, value); return this; }

        /// {@return `gpuRenderStartTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long gpuRenderStartTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_gpuRenderStartTimeUs(this.segment(), index); }
        /// Sets `gpuRenderStartTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gpuRenderStartTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_gpuRenderStartTimeUs(this.segment(), index, value); return this; }

        /// {@return `gpuRenderEndTimeUs` at the given index}
        /// @param index the index
        public @CType("uint64_t") long gpuRenderEndTimeUsAt(long index) { return VkLatencyTimingsFrameReportNV.get_gpuRenderEndTimeUs(this.segment(), index); }
        /// Sets `gpuRenderEndTimeUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gpuRenderEndTimeUsAt(long index, @CType("uint64_t") long value) { VkLatencyTimingsFrameReportNV.set_gpuRenderEndTimeUs(this.segment(), index, value); return this; }

    }
}
