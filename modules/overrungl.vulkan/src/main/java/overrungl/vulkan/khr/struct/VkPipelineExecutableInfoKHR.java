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
package overrungl.vulkan.khr.struct;

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
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(MemorySegment)]
/// ### executableIndex
/// [VarHandle][#VH_executableIndex] - [Getter][#executableIndex()] - [Setter][#executableIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineExecutableInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipeline pipeline;
///     uint32_t executableIndex;
/// } VkPipelineExecutableInfoKHR;
/// ```
public sealed class VkPipelineExecutableInfoKHR extends Struct {
    /// The struct layout of `VkPipelineExecutableInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `executableIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_executableIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executableIndex"));

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineExecutableInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static VkPipelineExecutableInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipeline") MemorySegment pipeline, @CType("uint32_t") int executableIndex) { return alloc(allocator).sType(sType).pNext(pNext).pipeline(pipeline).executableIndex(executableIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineExecutableInfoKHR copyFrom(VkPipelineExecutableInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineExecutableInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR sType(@CType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineExecutableInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineExecutableInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pNext(@CType("const void *") MemorySegment value) { VkPipelineExecutableInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") MemorySegment get_pipeline(MemorySegment segment, long index) { return (MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") MemorySegment get_pipeline(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_pipeline(segment, 0L); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") MemorySegment pipeline() { return VkPipelineExecutableInfoKHR.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") MemorySegment value) { VkPipelineExecutableInfoKHR.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pipeline(@CType("VkPipeline") MemorySegment value) { VkPipelineExecutableInfoKHR.set_pipeline(this.segment(), value); return this; }

    /// {@return `executableIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_executableIndex(MemorySegment segment, long index) { return (int) VH_executableIndex.get(segment, 0L, index); }
    /// {@return `executableIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_executableIndex(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_executableIndex(segment, 0L); }
    /// {@return `executableIndex`}
    public @CType("uint32_t") int executableIndex() { return VkPipelineExecutableInfoKHR.get_executableIndex(this.segment()); }
    /// Sets `executableIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_executableIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_executableIndex.set(segment, 0L, index, value); }
    /// Sets `executableIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_executableIndex(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineExecutableInfoKHR.set_executableIndex(segment, 0L, value); }
    /// Sets `executableIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR executableIndex(@CType("uint32_t") int value) { VkPipelineExecutableInfoKHR.set_executableIndex(this.segment(), value); return this; }

    /// A buffer of [VkPipelineExecutableInfoKHR].
    public static final class Buffer extends VkPipelineExecutableInfoKHR {
        private final long elementCount;

        /// Creates `VkPipelineExecutableInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineExecutableInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineExecutableInfoKHR`
        public VkPipelineExecutableInfoKHR asSlice(long index) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineExecutableInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineExecutableInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineExecutableInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineExecutableInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineExecutableInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pipeline` at the given index}
        /// @param index the index
        public @CType("VkPipeline") MemorySegment pipelineAt(long index) { return VkPipelineExecutableInfoKHR.get_pipeline(this.segment(), index); }
        /// Sets `pipeline` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAt(long index, @CType("VkPipeline") MemorySegment value) { VkPipelineExecutableInfoKHR.set_pipeline(this.segment(), index, value); return this; }

        /// {@return `executableIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int executableIndexAt(long index) { return VkPipelineExecutableInfoKHR.get_executableIndex(this.segment(), index); }
        /// Sets `executableIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer executableIndexAt(long index, @CType("uint32_t") int value) { VkPipelineExecutableInfoKHR.set_executableIndex(this.segment(), index, value); return this; }

    }
}
