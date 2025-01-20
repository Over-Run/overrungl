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
/// ### stageFlags
/// [VarHandle][#VH_stageFlags] - [Getter][#stageFlags()] - [Setter][#stageFlags(int)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(MemorySegment)]
/// ### set
/// [VarHandle][#VH_set] - [Getter][#set()] - [Setter][#set(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindDescriptorBufferEmbeddedSamplersInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t set;
/// } VkBindDescriptorBufferEmbeddedSamplersInfoEXT;
/// ```
public sealed class VkBindDescriptorBufferEmbeddedSamplersInfoEXT extends Struct {
    /// The struct layout of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT alloc(SegmentAllocator allocator) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkShaderStageFlags") int stageFlags, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int set) { return alloc(allocator).sType(sType).pNext(pNext).stageFlags(stageFlags).layout(layout).set(set); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT copyFrom(VkBindDescriptorBufferEmbeddedSamplersInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType(@CType("VkStructureType") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(@CType("const void *") MemorySegment value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlags(@CType("VkShaderStageFlags") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_stageFlags(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment, long index) { return (MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") MemorySegment layout() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") MemorySegment value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layout(@CType("VkPipelineLayout") MemorySegment value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_layout(this.segment(), value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_set(MemorySegment segment) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_set(segment, 0L); }
    /// {@return `set`}
    public @CType("uint32_t") int set() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_set(this.segment()); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_set(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_set(MemorySegment segment, @CType("uint32_t") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_set(segment, 0L, value); }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(@CType("uint32_t") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_set(this.segment(), value); return this; }

    /// A buffer of [VkBindDescriptorBufferEmbeddedSamplersInfoEXT].
    public static final class Buffer extends VkBindDescriptorBufferEmbeddedSamplersInfoEXT {
        private final long elementCount;

        /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT asSlice(long index) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stageFlags` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_stageFlags(this.segment(), index); }
        /// Sets `stageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_stageFlags(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") MemorySegment layoutAt(long index) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") MemorySegment value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_layout(this.segment(), index, value); return this; }

        /// {@return `set` at the given index}
        /// @param index the index
        public @CType("uint32_t") int setAt(long index) { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.get_set(this.segment(), index); }
        /// Sets `set` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer setAt(long index, @CType("uint32_t") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.set_set(this.segment(), index, value); return this; }

    }
}
