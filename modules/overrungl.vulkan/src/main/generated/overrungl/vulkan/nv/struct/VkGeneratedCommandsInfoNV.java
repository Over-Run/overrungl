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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkGeneratedCommandsInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkPipelineBindPoint pipelineBindPoint;
///     (uint64_t) VkPipeline pipeline;
///     (uint64_t) VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t streamCount;
///     const VkIndirectCommandsStreamNV* pStreams;
///     uint32_t sequencesCount;
///     (uint64_t) VkBuffer preprocessBuffer;
///     (uint64_t) VkDeviceSize preprocessOffset;
///     (uint64_t) VkDeviceSize preprocessSize;
///     (uint64_t) VkBuffer sequencesCountBuffer;
///     (uint64_t) VkDeviceSize sequencesCountOffset;
///     (uint64_t) VkBuffer sequencesIndexBuffer;
///     (uint64_t) VkDeviceSize sequencesIndexOffset;
/// };
/// ```
public final class VkGeneratedCommandsInfoNV extends GroupType {
    /// The struct layout of `VkGeneratedCommandsInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withName("pStreams"),
        ValueLayout.JAVA_INT.withName("sequencesCount"),
        ValueLayout.JAVA_LONG.withName("preprocessBuffer"),
        ValueLayout.JAVA_LONG.withName("preprocessOffset"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.JAVA_LONG.withName("sequencesCountBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesCountOffset"),
        ValueLayout.JAVA_LONG.withName("sequencesIndexBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesIndexOffset")
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
    /// The byte offset of `pipelineBindPoint`.
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    /// The memory layout of `pipelineBindPoint`.
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The byte offset of `pipeline`.
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    /// The memory layout of `pipeline`.
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The byte offset of `indirectCommandsLayout`.
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    /// The memory layout of `indirectCommandsLayout`.
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The byte offset of `streamCount`.
    public static final long OFFSET_streamCount = LAYOUT.byteOffset(PathElement.groupElement("streamCount"));
    /// The memory layout of `streamCount`.
    public static final MemoryLayout LAYOUT_streamCount = LAYOUT.select(PathElement.groupElement("streamCount"));
    /// The [VarHandle] of `streamCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_streamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamCount"));
    /// The byte offset of `pStreams`.
    public static final long OFFSET_pStreams = LAYOUT.byteOffset(PathElement.groupElement("pStreams"));
    /// The memory layout of `pStreams`.
    public static final MemoryLayout LAYOUT_pStreams = LAYOUT.select(PathElement.groupElement("pStreams"));
    /// The [VarHandle] of `pStreams` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStreams"));
    /// The byte offset of `sequencesCount`.
    public static final long OFFSET_sequencesCount = LAYOUT.byteOffset(PathElement.groupElement("sequencesCount"));
    /// The memory layout of `sequencesCount`.
    public static final MemoryLayout LAYOUT_sequencesCount = LAYOUT.select(PathElement.groupElement("sequencesCount"));
    /// The [VarHandle] of `sequencesCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCount"));
    /// The byte offset of `preprocessBuffer`.
    public static final long OFFSET_preprocessBuffer = LAYOUT.byteOffset(PathElement.groupElement("preprocessBuffer"));
    /// The memory layout of `preprocessBuffer`.
    public static final MemoryLayout LAYOUT_preprocessBuffer = LAYOUT.select(PathElement.groupElement("preprocessBuffer"));
    /// The [VarHandle] of `preprocessBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preprocessBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessBuffer"));
    /// The byte offset of `preprocessOffset`.
    public static final long OFFSET_preprocessOffset = LAYOUT.byteOffset(PathElement.groupElement("preprocessOffset"));
    /// The memory layout of `preprocessOffset`.
    public static final MemoryLayout LAYOUT_preprocessOffset = LAYOUT.select(PathElement.groupElement("preprocessOffset"));
    /// The [VarHandle] of `preprocessOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preprocessOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessOffset"));
    /// The byte offset of `preprocessSize`.
    public static final long OFFSET_preprocessSize = LAYOUT.byteOffset(PathElement.groupElement("preprocessSize"));
    /// The memory layout of `preprocessSize`.
    public static final MemoryLayout LAYOUT_preprocessSize = LAYOUT.select(PathElement.groupElement("preprocessSize"));
    /// The [VarHandle] of `preprocessSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preprocessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessSize"));
    /// The byte offset of `sequencesCountBuffer`.
    public static final long OFFSET_sequencesCountBuffer = LAYOUT.byteOffset(PathElement.groupElement("sequencesCountBuffer"));
    /// The memory layout of `sequencesCountBuffer`.
    public static final MemoryLayout LAYOUT_sequencesCountBuffer = LAYOUT.select(PathElement.groupElement("sequencesCountBuffer"));
    /// The [VarHandle] of `sequencesCountBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesCountBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCountBuffer"));
    /// The byte offset of `sequencesCountOffset`.
    public static final long OFFSET_sequencesCountOffset = LAYOUT.byteOffset(PathElement.groupElement("sequencesCountOffset"));
    /// The memory layout of `sequencesCountOffset`.
    public static final MemoryLayout LAYOUT_sequencesCountOffset = LAYOUT.select(PathElement.groupElement("sequencesCountOffset"));
    /// The [VarHandle] of `sequencesCountOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesCountOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCountOffset"));
    /// The byte offset of `sequencesIndexBuffer`.
    public static final long OFFSET_sequencesIndexBuffer = LAYOUT.byteOffset(PathElement.groupElement("sequencesIndexBuffer"));
    /// The memory layout of `sequencesIndexBuffer`.
    public static final MemoryLayout LAYOUT_sequencesIndexBuffer = LAYOUT.select(PathElement.groupElement("sequencesIndexBuffer"));
    /// The [VarHandle] of `sequencesIndexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesIndexBuffer"));
    /// The byte offset of `sequencesIndexOffset`.
    public static final long OFFSET_sequencesIndexOffset = LAYOUT.byteOffset(PathElement.groupElement("sequencesIndexOffset"));
    /// The memory layout of `sequencesIndexOffset`.
    public static final MemoryLayout LAYOUT_sequencesIndexOffset = LAYOUT.select(PathElement.groupElement("sequencesIndexOffset"));
    /// The [VarHandle] of `sequencesIndexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequencesIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesIndexOffset"));

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeneratedCommandsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeneratedCommandsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @param preprocessOffset `preprocessOffset`
    /// @param preprocessSize `preprocessSize`
    /// @param sequencesCountBuffer `sequencesCountBuffer`
    /// @param sequencesCountOffset `sequencesCountOffset`
    /// @param sequencesIndexBuffer `sequencesIndexBuffer`
    /// @param sequencesIndexOffset `sequencesIndexOffset`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset, long preprocessSize, long sequencesCountBuffer, long sequencesCountOffset, long sequencesIndexBuffer, long sequencesIndexOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset).preprocessSize(preprocessSize).sequencesCountBuffer(sequencesCountBuffer).sequencesCountOffset(sequencesCountOffset).sequencesIndexBuffer(sequencesIndexBuffer).sequencesIndexOffset(sequencesIndexOffset);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @param preprocessOffset `preprocessOffset`
    /// @param preprocessSize `preprocessSize`
    /// @param sequencesCountBuffer `sequencesCountBuffer`
    /// @param sequencesCountOffset `sequencesCountOffset`
    /// @param sequencesIndexBuffer `sequencesIndexBuffer`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset, long preprocessSize, long sequencesCountBuffer, long sequencesCountOffset, long sequencesIndexBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset).preprocessSize(preprocessSize).sequencesCountBuffer(sequencesCountBuffer).sequencesCountOffset(sequencesCountOffset).sequencesIndexBuffer(sequencesIndexBuffer);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @param preprocessOffset `preprocessOffset`
    /// @param preprocessSize `preprocessSize`
    /// @param sequencesCountBuffer `sequencesCountBuffer`
    /// @param sequencesCountOffset `sequencesCountOffset`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset, long preprocessSize, long sequencesCountBuffer, long sequencesCountOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset).preprocessSize(preprocessSize).sequencesCountBuffer(sequencesCountBuffer).sequencesCountOffset(sequencesCountOffset);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @param preprocessOffset `preprocessOffset`
    /// @param preprocessSize `preprocessSize`
    /// @param sequencesCountBuffer `sequencesCountBuffer`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset, long preprocessSize, long sequencesCountBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset).preprocessSize(preprocessSize).sequencesCountBuffer(sequencesCountBuffer);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @param preprocessOffset `preprocessOffset`
    /// @param preprocessSize `preprocessSize`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset, long preprocessSize) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset).preprocessSize(preprocessSize);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @param preprocessOffset `preprocessOffset`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer).preprocessOffset(preprocessOffset);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @param preprocessBuffer `preprocessBuffer`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount, long preprocessBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount).preprocessBuffer(preprocessBuffer);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @param sequencesCount `sequencesCount`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams, int sequencesCount) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams).sequencesCount(sequencesCount);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @param pStreams `pStreams`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount, MemorySegment pStreams) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount).pStreams(pStreams);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @param streamCount `streamCount`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int streamCount) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).streamCount(streamCount);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @param indirectCommandsLayout `indirectCommandsLayout`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkGeneratedCommandsInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkGeneratedCommandsInfoNV`
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsInfoNV copyFrom(VkGeneratedCommandsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeneratedCommandsInfoNV reinterpret(long count) { return new VkGeneratedCommandsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGeneratedCommandsInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGeneratedCommandsInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    public int pipelineBindPoint() { return pipelineBindPoint(this.segment(), 0L); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBindPoint(MemorySegment segment, long index, int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pipelineBindPoint(int value) { pipelineBindPoint(this.segment(), 0L, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipeline(MemorySegment segment, long index) { return (long) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    public long pipeline() { return pipeline(this.segment(), 0L); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipeline(MemorySegment segment, long index, long value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pipeline(long value) { pipeline(this.segment(), 0L, value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectCommandsLayout(MemorySegment segment, long index) { return (long) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    public long indirectCommandsLayout() { return indirectCommandsLayout(this.segment(), 0L); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectCommandsLayout(MemorySegment segment, long index, long value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV indirectCommandsLayout(long value) { indirectCommandsLayout(this.segment(), 0L, value); return this; }

    /// {@return `streamCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int streamCount(MemorySegment segment, long index) { return (int) VH_streamCount.get(segment, 0L, index); }
    /// {@return `streamCount`}
    public int streamCount() { return streamCount(this.segment(), 0L); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void streamCount(MemorySegment segment, long index, int value) { VH_streamCount.set(segment, 0L, index, value); }
    /// Sets `streamCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV streamCount(int value) { streamCount(this.segment(), 0L, value); return this; }

    /// {@return `pStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStreams(MemorySegment segment, long index) { return (MemorySegment) VH_pStreams.get(segment, 0L, index); }
    /// {@return `pStreams`}
    public MemorySegment pStreams() { return pStreams(this.segment(), 0L); }
    /// Sets `pStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStreams(MemorySegment segment, long index, MemorySegment value) { VH_pStreams.set(segment, 0L, index, value); }
    /// Sets `pStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pStreams(MemorySegment value) { pStreams(this.segment(), 0L, value); return this; }

    /// {@return `sequencesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sequencesCount(MemorySegment segment, long index) { return (int) VH_sequencesCount.get(segment, 0L, index); }
    /// {@return `sequencesCount`}
    public int sequencesCount() { return sequencesCount(this.segment(), 0L); }
    /// Sets `sequencesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sequencesCount(MemorySegment segment, long index, int value) { VH_sequencesCount.set(segment, 0L, index, value); }
    /// Sets `sequencesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCount(int value) { sequencesCount(this.segment(), 0L, value); return this; }

    /// {@return `preprocessBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long preprocessBuffer(MemorySegment segment, long index) { return (long) VH_preprocessBuffer.get(segment, 0L, index); }
    /// {@return `preprocessBuffer`}
    public long preprocessBuffer() { return preprocessBuffer(this.segment(), 0L); }
    /// Sets `preprocessBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preprocessBuffer(MemorySegment segment, long index, long value) { VH_preprocessBuffer.set(segment, 0L, index, value); }
    /// Sets `preprocessBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessBuffer(long value) { preprocessBuffer(this.segment(), 0L, value); return this; }

    /// {@return `preprocessOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long preprocessOffset(MemorySegment segment, long index) { return (long) VH_preprocessOffset.get(segment, 0L, index); }
    /// {@return `preprocessOffset`}
    public long preprocessOffset() { return preprocessOffset(this.segment(), 0L); }
    /// Sets `preprocessOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preprocessOffset(MemorySegment segment, long index, long value) { VH_preprocessOffset.set(segment, 0L, index, value); }
    /// Sets `preprocessOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessOffset(long value) { preprocessOffset(this.segment(), 0L, value); return this; }

    /// {@return `preprocessSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long preprocessSize(MemorySegment segment, long index) { return (long) VH_preprocessSize.get(segment, 0L, index); }
    /// {@return `preprocessSize`}
    public long preprocessSize() { return preprocessSize(this.segment(), 0L); }
    /// Sets `preprocessSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preprocessSize(MemorySegment segment, long index, long value) { VH_preprocessSize.set(segment, 0L, index, value); }
    /// Sets `preprocessSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessSize(long value) { preprocessSize(this.segment(), 0L, value); return this; }

    /// {@return `sequencesCountBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sequencesCountBuffer(MemorySegment segment, long index) { return (long) VH_sequencesCountBuffer.get(segment, 0L, index); }
    /// {@return `sequencesCountBuffer`}
    public long sequencesCountBuffer() { return sequencesCountBuffer(this.segment(), 0L); }
    /// Sets `sequencesCountBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sequencesCountBuffer(MemorySegment segment, long index, long value) { VH_sequencesCountBuffer.set(segment, 0L, index, value); }
    /// Sets `sequencesCountBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountBuffer(long value) { sequencesCountBuffer(this.segment(), 0L, value); return this; }

    /// {@return `sequencesCountOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sequencesCountOffset(MemorySegment segment, long index) { return (long) VH_sequencesCountOffset.get(segment, 0L, index); }
    /// {@return `sequencesCountOffset`}
    public long sequencesCountOffset() { return sequencesCountOffset(this.segment(), 0L); }
    /// Sets `sequencesCountOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sequencesCountOffset(MemorySegment segment, long index, long value) { VH_sequencesCountOffset.set(segment, 0L, index, value); }
    /// Sets `sequencesCountOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountOffset(long value) { sequencesCountOffset(this.segment(), 0L, value); return this; }

    /// {@return `sequencesIndexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sequencesIndexBuffer(MemorySegment segment, long index) { return (long) VH_sequencesIndexBuffer.get(segment, 0L, index); }
    /// {@return `sequencesIndexBuffer`}
    public long sequencesIndexBuffer() { return sequencesIndexBuffer(this.segment(), 0L); }
    /// Sets `sequencesIndexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sequencesIndexBuffer(MemorySegment segment, long index, long value) { VH_sequencesIndexBuffer.set(segment, 0L, index, value); }
    /// Sets `sequencesIndexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(long value) { sequencesIndexBuffer(this.segment(), 0L, value); return this; }

    /// {@return `sequencesIndexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sequencesIndexOffset(MemorySegment segment, long index) { return (long) VH_sequencesIndexOffset.get(segment, 0L, index); }
    /// {@return `sequencesIndexOffset`}
    public long sequencesIndexOffset() { return sequencesIndexOffset(this.segment(), 0L); }
    /// Sets `sequencesIndexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sequencesIndexOffset(MemorySegment segment, long index, long value) { VH_sequencesIndexOffset.set(segment, 0L, index, value); }
    /// Sets `sequencesIndexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesIndexOffset(long value) { sequencesIndexOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeneratedCommandsInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeneratedCommandsInfoNV`
    public VkGeneratedCommandsInfoNV asSlice(long index) { return new VkGeneratedCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeneratedCommandsInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeneratedCommandsInfoNV`
    public VkGeneratedCommandsInfoNV asSlice(long index, long count) { return new VkGeneratedCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeneratedCommandsInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeneratedCommandsInfoNV at(long index, Consumer<VkGeneratedCommandsInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineBindPointAt(long index) { return pipelineBindPoint(this.segment(), index); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pipelineBindPointAt(long index, int value) { pipelineBindPoint(this.segment(), index, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineAt(long index) { return pipeline(this.segment(), index); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pipelineAt(long index, long value) { pipeline(this.segment(), index, value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param index the index of the struct buffer
    public long indirectCommandsLayoutAt(long index) { return indirectCommandsLayout(this.segment(), index); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV indirectCommandsLayoutAt(long index, long value) { indirectCommandsLayout(this.segment(), index, value); return this; }

    /// {@return `streamCount` at the given index}
    /// @param index the index of the struct buffer
    public int streamCountAt(long index) { return streamCount(this.segment(), index); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV streamCountAt(long index, int value) { streamCount(this.segment(), index, value); return this; }

    /// {@return `pStreams` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStreamsAt(long index) { return pStreams(this.segment(), index); }
    /// Sets `pStreams` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV pStreamsAt(long index, MemorySegment value) { pStreams(this.segment(), index, value); return this; }

    /// {@return `sequencesCount` at the given index}
    /// @param index the index of the struct buffer
    public int sequencesCountAt(long index) { return sequencesCount(this.segment(), index); }
    /// Sets `sequencesCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountAt(long index, int value) { sequencesCount(this.segment(), index, value); return this; }

    /// {@return `preprocessBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long preprocessBufferAt(long index) { return preprocessBuffer(this.segment(), index); }
    /// Sets `preprocessBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessBufferAt(long index, long value) { preprocessBuffer(this.segment(), index, value); return this; }

    /// {@return `preprocessOffset` at the given index}
    /// @param index the index of the struct buffer
    public long preprocessOffsetAt(long index) { return preprocessOffset(this.segment(), index); }
    /// Sets `preprocessOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessOffsetAt(long index, long value) { preprocessOffset(this.segment(), index, value); return this; }

    /// {@return `preprocessSize` at the given index}
    /// @param index the index of the struct buffer
    public long preprocessSizeAt(long index) { return preprocessSize(this.segment(), index); }
    /// Sets `preprocessSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV preprocessSizeAt(long index, long value) { preprocessSize(this.segment(), index, value); return this; }

    /// {@return `sequencesCountBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long sequencesCountBufferAt(long index) { return sequencesCountBuffer(this.segment(), index); }
    /// Sets `sequencesCountBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountBufferAt(long index, long value) { sequencesCountBuffer(this.segment(), index, value); return this; }

    /// {@return `sequencesCountOffset` at the given index}
    /// @param index the index of the struct buffer
    public long sequencesCountOffsetAt(long index) { return sequencesCountOffset(this.segment(), index); }
    /// Sets `sequencesCountOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesCountOffsetAt(long index, long value) { sequencesCountOffset(this.segment(), index, value); return this; }

    /// {@return `sequencesIndexBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long sequencesIndexBufferAt(long index) { return sequencesIndexBuffer(this.segment(), index); }
    /// Sets `sequencesIndexBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesIndexBufferAt(long index, long value) { sequencesIndexBuffer(this.segment(), index, value); return this; }

    /// {@return `sequencesIndexOffset` at the given index}
    /// @param index the index of the struct buffer
    public long sequencesIndexOffsetAt(long index) { return sequencesIndexOffset(this.segment(), index); }
    /// Sets `sequencesIndexOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoNV sequencesIndexOffsetAt(long index, long value) { sequencesIndexOffset(this.segment(), index, value); return this; }

}
