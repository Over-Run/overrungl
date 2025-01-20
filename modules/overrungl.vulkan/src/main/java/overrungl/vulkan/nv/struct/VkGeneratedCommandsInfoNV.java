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
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(MemorySegment)]
/// ### indirectCommandsLayout
/// [VarHandle][#VH_indirectCommandsLayout] - [Getter][#indirectCommandsLayout()] - [Setter][#indirectCommandsLayout(MemorySegment)]
/// ### streamCount
/// [VarHandle][#VH_streamCount] - [Getter][#streamCount()] - [Setter][#streamCount(int)]
/// ### pStreams
/// [VarHandle][#VH_pStreams] - [Getter][#pStreams()] - [Setter][#pStreams(MemorySegment)]
/// ### sequencesCount
/// [VarHandle][#VH_sequencesCount] - [Getter][#sequencesCount()] - [Setter][#sequencesCount(int)]
/// ### preprocessBuffer
/// [VarHandle][#VH_preprocessBuffer] - [Getter][#preprocessBuffer()] - [Setter][#preprocessBuffer(MemorySegment)]
/// ### preprocessOffset
/// [VarHandle][#VH_preprocessOffset] - [Getter][#preprocessOffset()] - [Setter][#preprocessOffset(long)]
/// ### preprocessSize
/// [VarHandle][#VH_preprocessSize] - [Getter][#preprocessSize()] - [Setter][#preprocessSize(long)]
/// ### sequencesCountBuffer
/// [VarHandle][#VH_sequencesCountBuffer] - [Getter][#sequencesCountBuffer()] - [Setter][#sequencesCountBuffer(MemorySegment)]
/// ### sequencesCountOffset
/// [VarHandle][#VH_sequencesCountOffset] - [Getter][#sequencesCountOffset()] - [Setter][#sequencesCountOffset(long)]
/// ### sequencesIndexBuffer
/// [VarHandle][#VH_sequencesIndexBuffer] - [Getter][#sequencesIndexBuffer()] - [Setter][#sequencesIndexBuffer(MemorySegment)]
/// ### sequencesIndexOffset
/// [VarHandle][#VH_sequencesIndexOffset] - [Getter][#sequencesIndexOffset()] - [Setter][#sequencesIndexOffset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeneratedCommandsInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
///     VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t streamCount;
///     const VkIndirectCommandsStreamNV * pStreams;
///     uint32_t sequencesCount;
///     VkBuffer preprocessBuffer;
///     VkDeviceSize preprocessOffset;
///     VkDeviceSize preprocessSize;
///     VkBuffer sequencesCountBuffer;
///     VkDeviceSize sequencesCountOffset;
///     VkBuffer sequencesIndexBuffer;
///     VkDeviceSize sequencesIndexOffset;
/// } VkGeneratedCommandsInfoNV;
/// ```
public sealed class VkGeneratedCommandsInfoNV extends Struct {
    /// The struct layout of `VkGeneratedCommandsInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withName("pStreams"),
        ValueLayout.JAVA_INT.withName("sequencesCount"),
        ValueLayout.ADDRESS.withName("preprocessBuffer"),
        ValueLayout.JAVA_LONG.withName("preprocessOffset"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.ADDRESS.withName("sequencesCountBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesCountOffset"),
        ValueLayout.ADDRESS.withName("sequencesIndexBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesIndexOffset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `streamCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_streamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamCount"));
    /// The [VarHandle] of `pStreams` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStreams"));
    /// The [VarHandle] of `sequencesCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sequencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCount"));
    /// The [VarHandle] of `preprocessBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preprocessBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessBuffer"));
    /// The [VarHandle] of `preprocessOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_preprocessOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessOffset"));
    /// The [VarHandle] of `preprocessSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_preprocessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessSize"));
    /// The [VarHandle] of `sequencesCountBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesCountBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCountBuffer"));
    /// The [VarHandle] of `sequencesCountOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sequencesCountOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCountOffset"));
    /// The [VarHandle] of `sequencesIndexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesIndexBuffer"));
    /// The [VarHandle] of `sequencesIndexOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sequencesIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesIndexOffset"));

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGeneratedCommandsInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipeline") MemorySegment pipeline, @CType("VkIndirectCommandsLayoutNV") MemorySegment indirectCommandsLayout, @CType("uint32_t") int streamCount, @CType("const VkIndirectCommandsStreamNV *") MemorySegment pStreams, @CType("uint32_t") int sequencesCount, @CType("VkBuffer") MemorySegment preprocessBuffer, @CType("VkDeviceSize") long preprocessOffset, @CType("VkDeviceSize") long preprocessSize, @CType("VkBuffer") MemorySegment sequencesCountBuffer, @CType("VkDeviceSize") long sequencesCountOffset, @CType("VkBuffer") MemorySegment sequencesIndexBuffer, @CType("VkDeviceSize") long sequencesIndexOffset) { return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset).preprocessSize(preprocessSize).sequencesCountBuffer(sequencesCountBuffer).sequencesCountOffset(sequencesCountOffset).sequencesIndexBuffer(sequencesIndexBuffer).sequencesIndexOffset(sequencesIndexOffset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsInfoNV copyFrom(VkGeneratedCommandsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeneratedCommandsInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeneratedCommandsInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sType(@CType("VkStructureType") int value) { VkGeneratedCommandsInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkGeneratedCommandsInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pNext(@CType("const void *") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkGeneratedCommandsInfoNV.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkGeneratedCommandsInfoNV.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkGeneratedCommandsInfoNV.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") MemorySegment get_pipeline(MemorySegment segment, long index) { return (MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") MemorySegment get_pipeline(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_pipeline(segment, 0L); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") MemorySegment pipeline() { return VkGeneratedCommandsInfoNV.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pipeline(@CType("VkPipeline") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pipeline(this.segment(), value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsLayoutNV") MemorySegment get_indirectCommandsLayout(MemorySegment segment, long index) { return (MemorySegment) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsLayoutNV") MemorySegment get_indirectCommandsLayout(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_indirectCommandsLayout(segment, 0L); }
    /// {@return `indirectCommandsLayout`}
    public @CType("VkIndirectCommandsLayoutNV") MemorySegment indirectCommandsLayout() { return VkGeneratedCommandsInfoNV.get_indirectCommandsLayout(this.segment()); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, long index, @CType("VkIndirectCommandsLayoutNV") MemorySegment value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, @CType("VkIndirectCommandsLayoutNV") MemorySegment value) { VkGeneratedCommandsInfoNV.set_indirectCommandsLayout(segment, 0L, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV indirectCommandsLayout(@CType("VkIndirectCommandsLayoutNV") MemorySegment value) { VkGeneratedCommandsInfoNV.set_indirectCommandsLayout(this.segment(), value); return this; }

    /// {@return `streamCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_streamCount(MemorySegment segment, long index) { return (int) VH_streamCount.get(segment, 0L, index); }
    /// {@return `streamCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_streamCount(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_streamCount(segment, 0L); }
    /// {@return `streamCount`}
    public @CType("uint32_t") int streamCount() { return VkGeneratedCommandsInfoNV.get_streamCount(this.segment()); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_streamCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_streamCount.set(segment, 0L, index, value); }
    /// Sets `streamCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_streamCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsInfoNV.set_streamCount(segment, 0L, value); }
    /// Sets `streamCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV streamCount(@CType("uint32_t") int value) { VkGeneratedCommandsInfoNV.set_streamCount(this.segment(), value); return this; }

    /// {@return `pStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsStreamNV *") MemorySegment get_pStreams(MemorySegment segment, long index) { return (MemorySegment) VH_pStreams.get(segment, 0L, index); }
    /// {@return `pStreams`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsStreamNV *") MemorySegment get_pStreams(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_pStreams(segment, 0L); }
    /// {@return `pStreams`}
    public @CType("const VkIndirectCommandsStreamNV *") MemorySegment pStreams() { return VkGeneratedCommandsInfoNV.get_pStreams(this.segment()); }
    /// Sets `pStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStreams(MemorySegment segment, long index, @CType("const VkIndirectCommandsStreamNV *") MemorySegment value) { VH_pStreams.set(segment, 0L, index, value); }
    /// Sets `pStreams` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStreams(MemorySegment segment, @CType("const VkIndirectCommandsStreamNV *") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pStreams(segment, 0L, value); }
    /// Sets `pStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pStreams(@CType("const VkIndirectCommandsStreamNV *") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pStreams(this.segment(), value); return this; }

    /// {@return `sequencesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sequencesCount(MemorySegment segment, long index) { return (int) VH_sequencesCount.get(segment, 0L, index); }
    /// {@return `sequencesCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sequencesCount(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_sequencesCount(segment, 0L); }
    /// {@return `sequencesCount`}
    public @CType("uint32_t") int sequencesCount() { return VkGeneratedCommandsInfoNV.get_sequencesCount(this.segment()); }
    /// Sets `sequencesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sequencesCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sequencesCount.set(segment, 0L, index, value); }
    /// Sets `sequencesCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sequencesCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsInfoNV.set_sequencesCount(segment, 0L, value); }
    /// Sets `sequencesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCount(@CType("uint32_t") int value) { VkGeneratedCommandsInfoNV.set_sequencesCount(this.segment(), value); return this; }

    /// {@return `preprocessBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_preprocessBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_preprocessBuffer.get(segment, 0L, index); }
    /// {@return `preprocessBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_preprocessBuffer(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_preprocessBuffer(segment, 0L); }
    /// {@return `preprocessBuffer`}
    public @CType("VkBuffer") MemorySegment preprocessBuffer() { return VkGeneratedCommandsInfoNV.get_preprocessBuffer(this.segment()); }
    /// Sets `preprocessBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preprocessBuffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_preprocessBuffer.set(segment, 0L, index, value); }
    /// Sets `preprocessBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preprocessBuffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_preprocessBuffer(segment, 0L, value); }
    /// Sets `preprocessBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessBuffer(@CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_preprocessBuffer(this.segment(), value); return this; }

    /// {@return `preprocessOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_preprocessOffset(MemorySegment segment, long index) { return (long) VH_preprocessOffset.get(segment, 0L, index); }
    /// {@return `preprocessOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_preprocessOffset(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_preprocessOffset(segment, 0L); }
    /// {@return `preprocessOffset`}
    public @CType("VkDeviceSize") long preprocessOffset() { return VkGeneratedCommandsInfoNV.get_preprocessOffset(this.segment()); }
    /// Sets `preprocessOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preprocessOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_preprocessOffset.set(segment, 0L, index, value); }
    /// Sets `preprocessOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preprocessOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_preprocessOffset(segment, 0L, value); }
    /// Sets `preprocessOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessOffset(@CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_preprocessOffset(this.segment(), value); return this; }

    /// {@return `preprocessSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_preprocessSize(MemorySegment segment, long index) { return (long) VH_preprocessSize.get(segment, 0L, index); }
    /// {@return `preprocessSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_preprocessSize(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_preprocessSize(segment, 0L); }
    /// {@return `preprocessSize`}
    public @CType("VkDeviceSize") long preprocessSize() { return VkGeneratedCommandsInfoNV.get_preprocessSize(this.segment()); }
    /// Sets `preprocessSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preprocessSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_preprocessSize.set(segment, 0L, index, value); }
    /// Sets `preprocessSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preprocessSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_preprocessSize(segment, 0L, value); }
    /// Sets `preprocessSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessSize(@CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_preprocessSize(this.segment(), value); return this; }

    /// {@return `sequencesCountBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_sequencesCountBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_sequencesCountBuffer.get(segment, 0L, index); }
    /// {@return `sequencesCountBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_sequencesCountBuffer(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_sequencesCountBuffer(segment, 0L); }
    /// {@return `sequencesCountBuffer`}
    public @CType("VkBuffer") MemorySegment sequencesCountBuffer() { return VkGeneratedCommandsInfoNV.get_sequencesCountBuffer(this.segment()); }
    /// Sets `sequencesCountBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sequencesCountBuffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_sequencesCountBuffer.set(segment, 0L, index, value); }
    /// Sets `sequencesCountBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sequencesCountBuffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_sequencesCountBuffer(segment, 0L, value); }
    /// Sets `sequencesCountBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountBuffer(@CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_sequencesCountBuffer(this.segment(), value); return this; }

    /// {@return `sequencesCountOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_sequencesCountOffset(MemorySegment segment, long index) { return (long) VH_sequencesCountOffset.get(segment, 0L, index); }
    /// {@return `sequencesCountOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_sequencesCountOffset(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_sequencesCountOffset(segment, 0L); }
    /// {@return `sequencesCountOffset`}
    public @CType("VkDeviceSize") long sequencesCountOffset() { return VkGeneratedCommandsInfoNV.get_sequencesCountOffset(this.segment()); }
    /// Sets `sequencesCountOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sequencesCountOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_sequencesCountOffset.set(segment, 0L, index, value); }
    /// Sets `sequencesCountOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sequencesCountOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_sequencesCountOffset(segment, 0L, value); }
    /// Sets `sequencesCountOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountOffset(@CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_sequencesCountOffset(this.segment(), value); return this; }

    /// {@return `sequencesIndexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_sequencesIndexBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_sequencesIndexBuffer.get(segment, 0L, index); }
    /// {@return `sequencesIndexBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_sequencesIndexBuffer(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_sequencesIndexBuffer(segment, 0L); }
    /// {@return `sequencesIndexBuffer`}
    public @CType("VkBuffer") MemorySegment sequencesIndexBuffer() { return VkGeneratedCommandsInfoNV.get_sequencesIndexBuffer(this.segment()); }
    /// Sets `sequencesIndexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sequencesIndexBuffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_sequencesIndexBuffer.set(segment, 0L, index, value); }
    /// Sets `sequencesIndexBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sequencesIndexBuffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_sequencesIndexBuffer(segment, 0L, value); }
    /// Sets `sequencesIndexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(@CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_sequencesIndexBuffer(this.segment(), value); return this; }

    /// {@return `sequencesIndexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_sequencesIndexOffset(MemorySegment segment, long index) { return (long) VH_sequencesIndexOffset.get(segment, 0L, index); }
    /// {@return `sequencesIndexOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_sequencesIndexOffset(MemorySegment segment) { return VkGeneratedCommandsInfoNV.get_sequencesIndexOffset(segment, 0L); }
    /// {@return `sequencesIndexOffset`}
    public @CType("VkDeviceSize") long sequencesIndexOffset() { return VkGeneratedCommandsInfoNV.get_sequencesIndexOffset(this.segment()); }
    /// Sets `sequencesIndexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sequencesIndexOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_sequencesIndexOffset.set(segment, 0L, index, value); }
    /// Sets `sequencesIndexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sequencesIndexOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_sequencesIndexOffset(segment, 0L, value); }
    /// Sets `sequencesIndexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesIndexOffset(@CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_sequencesIndexOffset(this.segment(), value); return this; }

    /// A buffer of [VkGeneratedCommandsInfoNV].
    public static final class Buffer extends VkGeneratedCommandsInfoNV {
        private final long elementCount;

        /// Creates `VkGeneratedCommandsInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGeneratedCommandsInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGeneratedCommandsInfoNV`
        public VkGeneratedCommandsInfoNV asSlice(long index) { return new VkGeneratedCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGeneratedCommandsInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGeneratedCommandsInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGeneratedCommandsInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGeneratedCommandsInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkGeneratedCommandsInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pipelineBindPoint` at the given index}
        /// @param index the index
        public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkGeneratedCommandsInfoNV.get_pipelineBindPoint(this.segment(), index); }
        /// Sets `pipelineBindPoint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkGeneratedCommandsInfoNV.set_pipelineBindPoint(this.segment(), index, value); return this; }

        /// {@return `pipeline` at the given index}
        /// @param index the index
        public @CType("VkPipeline") MemorySegment pipelineAt(long index) { return VkGeneratedCommandsInfoNV.get_pipeline(this.segment(), index); }
        /// Sets `pipeline` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAt(long index, @CType("VkPipeline") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pipeline(this.segment(), index, value); return this; }

        /// {@return `indirectCommandsLayout` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsLayoutNV") MemorySegment indirectCommandsLayoutAt(long index) { return VkGeneratedCommandsInfoNV.get_indirectCommandsLayout(this.segment(), index); }
        /// Sets `indirectCommandsLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectCommandsLayoutAt(long index, @CType("VkIndirectCommandsLayoutNV") MemorySegment value) { VkGeneratedCommandsInfoNV.set_indirectCommandsLayout(this.segment(), index, value); return this; }

        /// {@return `streamCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int streamCountAt(long index) { return VkGeneratedCommandsInfoNV.get_streamCount(this.segment(), index); }
        /// Sets `streamCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer streamCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsInfoNV.set_streamCount(this.segment(), index, value); return this; }

        /// {@return `pStreams` at the given index}
        /// @param index the index
        public @CType("const VkIndirectCommandsStreamNV *") MemorySegment pStreamsAt(long index) { return VkGeneratedCommandsInfoNV.get_pStreams(this.segment(), index); }
        /// Sets `pStreams` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStreamsAt(long index, @CType("const VkIndirectCommandsStreamNV *") MemorySegment value) { VkGeneratedCommandsInfoNV.set_pStreams(this.segment(), index, value); return this; }

        /// {@return `sequencesCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sequencesCountAt(long index) { return VkGeneratedCommandsInfoNV.get_sequencesCount(this.segment(), index); }
        /// Sets `sequencesCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sequencesCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsInfoNV.set_sequencesCount(this.segment(), index, value); return this; }

        /// {@return `preprocessBuffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment preprocessBufferAt(long index) { return VkGeneratedCommandsInfoNV.get_preprocessBuffer(this.segment(), index); }
        /// Sets `preprocessBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer preprocessBufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_preprocessBuffer(this.segment(), index, value); return this; }

        /// {@return `preprocessOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long preprocessOffsetAt(long index) { return VkGeneratedCommandsInfoNV.get_preprocessOffset(this.segment(), index); }
        /// Sets `preprocessOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer preprocessOffsetAt(long index, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_preprocessOffset(this.segment(), index, value); return this; }

        /// {@return `preprocessSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long preprocessSizeAt(long index) { return VkGeneratedCommandsInfoNV.get_preprocessSize(this.segment(), index); }
        /// Sets `preprocessSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer preprocessSizeAt(long index, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_preprocessSize(this.segment(), index, value); return this; }

        /// {@return `sequencesCountBuffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment sequencesCountBufferAt(long index) { return VkGeneratedCommandsInfoNV.get_sequencesCountBuffer(this.segment(), index); }
        /// Sets `sequencesCountBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sequencesCountBufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_sequencesCountBuffer(this.segment(), index, value); return this; }

        /// {@return `sequencesCountOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sequencesCountOffsetAt(long index) { return VkGeneratedCommandsInfoNV.get_sequencesCountOffset(this.segment(), index); }
        /// Sets `sequencesCountOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sequencesCountOffsetAt(long index, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_sequencesCountOffset(this.segment(), index, value); return this; }

        /// {@return `sequencesIndexBuffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment sequencesIndexBufferAt(long index) { return VkGeneratedCommandsInfoNV.get_sequencesIndexBuffer(this.segment(), index); }
        /// Sets `sequencesIndexBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sequencesIndexBufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkGeneratedCommandsInfoNV.set_sequencesIndexBuffer(this.segment(), index, value); return this; }

        /// {@return `sequencesIndexOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sequencesIndexOffsetAt(long index) { return VkGeneratedCommandsInfoNV.get_sequencesIndexOffset(this.segment(), index); }
        /// Sets `sequencesIndexOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sequencesIndexOffsetAt(long index, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.set_sequencesIndexOffset(this.segment(), index, value); return this; }

    }
}
