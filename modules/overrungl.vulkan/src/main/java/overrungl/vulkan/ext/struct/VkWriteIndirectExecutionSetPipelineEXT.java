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
package overrungl.vulkan.ext.struct;

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
/// ### index
/// [VarHandle][#VH_index] - [Getter][#index()] - [Setter][#index(int)]
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWriteIndirectExecutionSetPipelineEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t index;
///     VkPipeline pipeline;
/// } VkWriteIndirectExecutionSetPipelineEXT;
/// ```
public sealed class VkWriteIndirectExecutionSetPipelineEXT extends Struct {
    /// The struct layout of `VkWriteIndirectExecutionSetPipelineEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.ADDRESS.withName("pipeline")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));

    /// Creates `VkWriteIndirectExecutionSetPipelineEXT` with the given segment.
    /// @param segment the memory segment
    public VkWriteIndirectExecutionSetPipelineEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteIndirectExecutionSetPipelineEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetPipelineEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetPipelineEXT(segment); }

    /// Creates `VkWriteIndirectExecutionSetPipelineEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteIndirectExecutionSetPipelineEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetPipelineEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetPipelineEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWriteIndirectExecutionSetPipelineEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkWriteIndirectExecutionSetPipelineEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteIndirectExecutionSetPipelineEXT`
    public static VkWriteIndirectExecutionSetPipelineEXT alloc(SegmentAllocator allocator) { return new VkWriteIndirectExecutionSetPipelineEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteIndirectExecutionSetPipelineEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteIndirectExecutionSetPipelineEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWriteIndirectExecutionSetPipelineEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteIndirectExecutionSetPipelineEXT`
    public static VkWriteIndirectExecutionSetPipelineEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int index, @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline) { return alloc(allocator).sType(sType).pNext(pNext).index(index).pipeline(pipeline); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteIndirectExecutionSetPipelineEXT copyFrom(VkWriteIndirectExecutionSetPipelineEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWriteIndirectExecutionSetPipelineEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWriteIndirectExecutionSetPipelineEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWriteIndirectExecutionSetPipelineEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetPipelineEXT sType(@CType("VkStructureType") int value) { VkWriteIndirectExecutionSetPipelineEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWriteIndirectExecutionSetPipelineEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWriteIndirectExecutionSetPipelineEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetPipelineEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetPipelineEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetPipelineEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_index(MemorySegment segment) { return VkWriteIndirectExecutionSetPipelineEXT.get_index(segment, 0L); }
    /// {@return `index`}
    public @CType("uint32_t") int index() { return VkWriteIndirectExecutionSetPipelineEXT.get_index(this.segment()); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_index(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_index(MemorySegment segment, @CType("uint32_t") int value) { VkWriteIndirectExecutionSetPipelineEXT.set_index(segment, 0L, value); }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetPipelineEXT index(@CType("uint32_t") int value) { VkWriteIndirectExecutionSetPipelineEXT.set_index(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment) { return VkWriteIndirectExecutionSetPipelineEXT.get_pipeline(segment, 0L); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline() { return VkWriteIndirectExecutionSetPipelineEXT.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetPipelineEXT.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetPipelineEXT pipeline(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetPipelineEXT.set_pipeline(this.segment(), value); return this; }

    /// A buffer of [VkWriteIndirectExecutionSetPipelineEXT].
    public static final class Buffer extends VkWriteIndirectExecutionSetPipelineEXT {
        private final long elementCount;

        /// Creates `VkWriteIndirectExecutionSetPipelineEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkWriteIndirectExecutionSetPipelineEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkWriteIndirectExecutionSetPipelineEXT`
        public VkWriteIndirectExecutionSetPipelineEXT asSlice(long index) { return new VkWriteIndirectExecutionSetPipelineEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkWriteIndirectExecutionSetPipelineEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkWriteIndirectExecutionSetPipelineEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkWriteIndirectExecutionSetPipelineEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkWriteIndirectExecutionSetPipelineEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWriteIndirectExecutionSetPipelineEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetPipelineEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `index` at the given index}
        /// @param index the index
        public @CType("uint32_t") int indexAt(long index) { return VkWriteIndirectExecutionSetPipelineEXT.get_index(this.segment(), index); }
        /// Sets `index` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexAt(long index, @CType("uint32_t") int value) { VkWriteIndirectExecutionSetPipelineEXT.set_index(this.segment(), index, value); return this; }

        /// {@return `pipeline` at the given index}
        /// @param index the index
        public @CType("VkPipeline") java.lang.foreign.MemorySegment pipelineAt(long index) { return VkWriteIndirectExecutionSetPipelineEXT.get_pipeline(this.segment(), index); }
        /// Sets `pipeline` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetPipelineEXT.set_pipeline(this.segment(), index, value); return this; }

    }
}
