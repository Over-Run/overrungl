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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### initialPipeline
/// [VarHandle][#VH_initialPipeline] - [Getter][#initialPipeline()] - [Setter][#initialPipeline(MemorySegment)]
/// ### maxPipelineCount
/// [VarHandle][#VH_maxPipelineCount] - [Getter][#maxPipelineCount()] - [Setter][#maxPipelineCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectExecutionSetPipelineInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipeline initialPipeline;
///     uint32_t maxPipelineCount;
/// } VkIndirectExecutionSetPipelineInfoEXT;
/// ```
public sealed class VkIndirectExecutionSetPipelineInfoEXT extends Struct {
    /// The struct layout of `VkIndirectExecutionSetPipelineInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("initialPipeline"),
        ValueLayout.JAVA_INT.withName("maxPipelineCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `initialPipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialPipeline"));
    /// The [VarHandle] of `maxPipelineCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineCount"));

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetPipelineInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetPipelineInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetPipelineInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static VkIndirectExecutionSetPipelineInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetPipelineInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static VkIndirectExecutionSetPipelineInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipeline") MemorySegment initialPipeline, @CType("uint32_t") int maxPipelineCount) { return alloc(allocator).sType(sType).pNext(pNext).initialPipeline(initialPipeline).maxPipelineCount(maxPipelineCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT copyFrom(VkIndirectExecutionSetPipelineInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectExecutionSetPipelineInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT sType(@CType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkIndirectExecutionSetPipelineInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT pNext(@CType("const void *") MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `initialPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") MemorySegment get_initialPipeline(MemorySegment segment, long index) { return (MemorySegment) VH_initialPipeline.get(segment, 0L, index); }
    /// {@return `initialPipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") MemorySegment get_initialPipeline(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_initialPipeline(segment, 0L); }
    /// {@return `initialPipeline`}
    public @CType("VkPipeline") MemorySegment initialPipeline() { return VkIndirectExecutionSetPipelineInfoEXT.get_initialPipeline(this.segment()); }
    /// Sets `initialPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialPipeline(MemorySegment segment, long index, @CType("VkPipeline") MemorySegment value) { VH_initialPipeline.set(segment, 0L, index, value); }
    /// Sets `initialPipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialPipeline(MemorySegment segment, @CType("VkPipeline") MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_initialPipeline(segment, 0L, value); }
    /// Sets `initialPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(@CType("VkPipeline") MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_initialPipeline(this.segment(), value); return this; }

    /// {@return `maxPipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPipelineCount(MemorySegment segment, long index) { return (int) VH_maxPipelineCount.get(segment, 0L, index); }
    /// {@return `maxPipelineCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPipelineCount(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_maxPipelineCount(segment, 0L); }
    /// {@return `maxPipelineCount`}
    public @CType("uint32_t") int maxPipelineCount() { return VkIndirectExecutionSetPipelineInfoEXT.get_maxPipelineCount(this.segment()); }
    /// Sets `maxPipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPipelineCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPipelineCount.set(segment, 0L, index, value); }
    /// Sets `maxPipelineCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPipelineCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_maxPipelineCount(segment, 0L, value); }
    /// Sets `maxPipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(@CType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_maxPipelineCount(this.segment(), value); return this; }

    /// A buffer of [VkIndirectExecutionSetPipelineInfoEXT].
    public static final class Buffer extends VkIndirectExecutionSetPipelineInfoEXT {
        private final long elementCount;

        /// Creates `VkIndirectExecutionSetPipelineInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectExecutionSetPipelineInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectExecutionSetPipelineInfoEXT`
        public VkIndirectExecutionSetPipelineInfoEXT asSlice(long index) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectExecutionSetPipelineInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectExecutionSetPipelineInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `initialPipeline` at the given index}
        /// @param index the index
        public @CType("VkPipeline") MemorySegment initialPipelineAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_initialPipeline(this.segment(), index); }
        /// Sets `initialPipeline` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer initialPipelineAt(long index, @CType("VkPipeline") MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_initialPipeline(this.segment(), index, value); return this; }

        /// {@return `maxPipelineCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPipelineCountAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_maxPipelineCount(this.segment(), index); }
        /// Sets `maxPipelineCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPipelineCountAt(long index, @CType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_maxPipelineCount(this.segment(), index, value); return this; }

    }
}
