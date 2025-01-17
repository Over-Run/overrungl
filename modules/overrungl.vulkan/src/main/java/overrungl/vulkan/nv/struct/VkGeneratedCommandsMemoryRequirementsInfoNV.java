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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(java.lang.foreign.MemorySegment)]
/// ### indirectCommandsLayout
/// [VarHandle][#VH_indirectCommandsLayout] - [Getter][#indirectCommandsLayout()] - [Setter][#indirectCommandsLayout(java.lang.foreign.MemorySegment)]
/// ### maxSequencesCount
/// [VarHandle][#VH_maxSequencesCount] - [Getter][#maxSequencesCount()] - [Setter][#maxSequencesCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeneratedCommandsMemoryRequirementsInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
///     VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t maxSequencesCount;
/// } VkGeneratedCommandsMemoryRequirementsInfoNV;
/// ```
public sealed class VkGeneratedCommandsMemoryRequirementsInfoNV extends Struct {
    /// The struct layout of `VkGeneratedCommandsMemoryRequirementsInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("maxSequencesCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `maxSequencesCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSequencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequencesCount"));

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGeneratedCommandsMemoryRequirementsInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoNV(segment); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoNV`
    public static VkGeneratedCommandsMemoryRequirementsInfoNV alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoNV`
    public static VkGeneratedCommandsMemoryRequirementsInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline, @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment indirectCommandsLayout, @CType("uint32_t") int maxSequencesCount) { return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline).indirectCommandsLayout(indirectCommandsLayout).maxSequencesCount(maxSequencesCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV copyFrom(VkGeneratedCommandsMemoryRequirementsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV sType(@CType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pipeline(segment, 0L); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline() { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipeline(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pipeline(this.segment(), value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment get_indirectCommandsLayout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment get_indirectCommandsLayout(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_indirectCommandsLayout(segment, 0L); }
    /// {@return `indirectCommandsLayout`}
    public @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment indirectCommandsLayout() { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_indirectCommandsLayout(this.segment()); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, long index, @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_indirectCommandsLayout(segment, 0L, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayout(@CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_indirectCommandsLayout(this.segment(), value); return this; }

    /// {@return `maxSequencesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSequencesCount(MemorySegment segment, long index) { return (int) VH_maxSequencesCount.get(segment, 0L, index); }
    /// {@return `maxSequencesCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSequencesCount(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_maxSequencesCount(segment, 0L); }
    /// {@return `maxSequencesCount`}
    public @CType("uint32_t") int maxSequencesCount() { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_maxSequencesCount(this.segment()); }
    /// Sets `maxSequencesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSequencesCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSequencesCount.set(segment, 0L, index, value); }
    /// Sets `maxSequencesCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSequencesCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_maxSequencesCount(segment, 0L, value); }
    /// Sets `maxSequencesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCount(@CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_maxSequencesCount(this.segment(), value); return this; }

    /// A buffer of [VkGeneratedCommandsMemoryRequirementsInfoNV].
    public static final class Buffer extends VkGeneratedCommandsMemoryRequirementsInfoNV {
        private final long elementCount;

        /// Creates `VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGeneratedCommandsMemoryRequirementsInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGeneratedCommandsMemoryRequirementsInfoNV`
        public VkGeneratedCommandsMemoryRequirementsInfoNV asSlice(long index) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGeneratedCommandsMemoryRequirementsInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGeneratedCommandsMemoryRequirementsInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pipelineBindPoint` at the given index}
        /// @param index the index
        public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pipelineBindPoint(this.segment(), index); }
        /// Sets `pipelineBindPoint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pipelineBindPoint(this.segment(), index, value); return this; }

        /// {@return `pipeline` at the given index}
        /// @param index the index
        public @CType("VkPipeline") java.lang.foreign.MemorySegment pipelineAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_pipeline(this.segment(), index); }
        /// Sets `pipeline` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_pipeline(this.segment(), index, value); return this; }

        /// {@return `indirectCommandsLayout` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment indirectCommandsLayoutAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_indirectCommandsLayout(this.segment(), index); }
        /// Sets `indirectCommandsLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectCommandsLayoutAt(long index, @CType("VkIndirectCommandsLayoutNV") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_indirectCommandsLayout(this.segment(), index, value); return this; }

        /// {@return `maxSequencesCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSequencesCountAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoNV.get_maxSequencesCount(this.segment(), index); }
        /// Sets `maxSequencesCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSequencesCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.set_maxSequencesCount(this.segment(), index, value); return this; }

    }
}
