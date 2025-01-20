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
package overrungl.vulkan.struct;

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
/// ### storageBuffers
/// [VarHandle][#VH_storageBuffers] - [Getter][#storageBuffers()] - [Setter][#storageBuffers(int)]
/// ### uniformBuffers
/// [VarHandle][#VH_uniformBuffers] - [Getter][#uniformBuffers()] - [Setter][#uniformBuffers(int)]
/// ### vertexInputs
/// [VarHandle][#VH_vertexInputs] - [Getter][#vertexInputs()] - [Setter][#vertexInputs(int)]
/// ### images
/// [VarHandle][#VH_images] - [Getter][#images()] - [Setter][#images(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRobustnessCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineRobustnessBufferBehavior storageBuffers;
///     VkPipelineRobustnessBufferBehavior uniformBuffers;
///     VkPipelineRobustnessBufferBehavior vertexInputs;
///     VkPipelineRobustnessImageBehavior images;
/// } VkPipelineRobustnessCreateInfo;
/// ```
public sealed class VkPipelineRobustnessCreateInfo extends Struct {
    /// The struct layout of `VkPipelineRobustnessCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `storageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffers"));
    /// The [VarHandle] of `uniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBuffers"));
    /// The [VarHandle] of `vertexInputs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexInputs"));
    /// The [VarHandle] of `images` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_images = LAYOUT.arrayElementVarHandle(PathElement.groupElement("images"));

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRobustnessCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRobustnessCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRobustnessCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineRobustnessCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRobustnessCreateInfo`
    public static VkPipelineRobustnessCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRobustnessCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRobustnessCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRobustnessCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineRobustnessCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRobustnessCreateInfo`
    public static VkPipelineRobustnessCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineRobustnessBufferBehavior") int storageBuffers, @CType("VkPipelineRobustnessBufferBehavior") int uniformBuffers, @CType("VkPipelineRobustnessBufferBehavior") int vertexInputs, @CType("VkPipelineRobustnessImageBehavior") int images) { return alloc(allocator).sType(sType).pNext(pNext).storageBuffers(storageBuffers).uniformBuffers(uniformBuffers).vertexInputs(vertexInputs).images(images); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRobustnessCreateInfo copyFrom(VkPipelineRobustnessCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRobustnessCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRobustnessCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRobustnessCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineRobustnessCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRobustnessCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineRobustnessCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineRobustnessCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo pNext(@CType("const void *") MemorySegment value) { VkPipelineRobustnessCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `storageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_storageBuffers(MemorySegment segment, long index) { return (int) VH_storageBuffers.get(segment, 0L, index); }
    /// {@return `storageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_storageBuffers(MemorySegment segment) { return VkPipelineRobustnessCreateInfo.get_storageBuffers(segment, 0L); }
    /// {@return `storageBuffers`}
    public @CType("VkPipelineRobustnessBufferBehavior") int storageBuffers() { return VkPipelineRobustnessCreateInfo.get_storageBuffers(this.segment()); }
    /// Sets `storageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageBuffers(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_storageBuffers.set(segment, 0L, index, value); }
    /// Sets `storageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageBuffers(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_storageBuffers(segment, 0L, value); }
    /// Sets `storageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo storageBuffers(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_storageBuffers(this.segment(), value); return this; }

    /// {@return `uniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_uniformBuffers(MemorySegment segment, long index) { return (int) VH_uniformBuffers.get(segment, 0L, index); }
    /// {@return `uniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_uniformBuffers(MemorySegment segment) { return VkPipelineRobustnessCreateInfo.get_uniformBuffers(segment, 0L); }
    /// {@return `uniformBuffers`}
    public @CType("VkPipelineRobustnessBufferBehavior") int uniformBuffers() { return VkPipelineRobustnessCreateInfo.get_uniformBuffers(this.segment()); }
    /// Sets `uniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformBuffers(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_uniformBuffers.set(segment, 0L, index, value); }
    /// Sets `uniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformBuffers(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_uniformBuffers(segment, 0L, value); }
    /// Sets `uniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo uniformBuffers(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_uniformBuffers(this.segment(), value); return this; }

    /// {@return `vertexInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_vertexInputs(MemorySegment segment, long index) { return (int) VH_vertexInputs.get(segment, 0L, index); }
    /// {@return `vertexInputs`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_vertexInputs(MemorySegment segment) { return VkPipelineRobustnessCreateInfo.get_vertexInputs(segment, 0L); }
    /// {@return `vertexInputs`}
    public @CType("VkPipelineRobustnessBufferBehavior") int vertexInputs() { return VkPipelineRobustnessCreateInfo.get_vertexInputs(this.segment()); }
    /// Sets `vertexInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexInputs(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_vertexInputs.set(segment, 0L, index, value); }
    /// Sets `vertexInputs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexInputs(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_vertexInputs(segment, 0L, value); }
    /// Sets `vertexInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo vertexInputs(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_vertexInputs(this.segment(), value); return this; }

    /// {@return `images` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessImageBehavior") int get_images(MemorySegment segment, long index) { return (int) VH_images.get(segment, 0L, index); }
    /// {@return `images`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessImageBehavior") int get_images(MemorySegment segment) { return VkPipelineRobustnessCreateInfo.get_images(segment, 0L); }
    /// {@return `images`}
    public @CType("VkPipelineRobustnessImageBehavior") int images() { return VkPipelineRobustnessCreateInfo.get_images(this.segment()); }
    /// Sets `images` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_images(MemorySegment segment, long index, @CType("VkPipelineRobustnessImageBehavior") int value) { VH_images.set(segment, 0L, index, value); }
    /// Sets `images` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_images(MemorySegment segment, @CType("VkPipelineRobustnessImageBehavior") int value) { VkPipelineRobustnessCreateInfo.set_images(segment, 0L, value); }
    /// Sets `images` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo images(@CType("VkPipelineRobustnessImageBehavior") int value) { VkPipelineRobustnessCreateInfo.set_images(this.segment(), value); return this; }

    /// A buffer of [VkPipelineRobustnessCreateInfo].
    public static final class Buffer extends VkPipelineRobustnessCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineRobustnessCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineRobustnessCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineRobustnessCreateInfo`
        public VkPipelineRobustnessCreateInfo asSlice(long index) { return new VkPipelineRobustnessCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineRobustnessCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineRobustnessCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRobustnessCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRobustnessCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineRobustnessCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineRobustnessCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `storageBuffers` at the given index}
        /// @param index the index
        public @CType("VkPipelineRobustnessBufferBehavior") int storageBuffersAt(long index) { return VkPipelineRobustnessCreateInfo.get_storageBuffers(this.segment(), index); }
        /// Sets `storageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageBuffersAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_storageBuffers(this.segment(), index, value); return this; }

        /// {@return `uniformBuffers` at the given index}
        /// @param index the index
        public @CType("VkPipelineRobustnessBufferBehavior") int uniformBuffersAt(long index) { return VkPipelineRobustnessCreateInfo.get_uniformBuffers(this.segment(), index); }
        /// Sets `uniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniformBuffersAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_uniformBuffers(this.segment(), index, value); return this; }

        /// {@return `vertexInputs` at the given index}
        /// @param index the index
        public @CType("VkPipelineRobustnessBufferBehavior") int vertexInputsAt(long index) { return VkPipelineRobustnessCreateInfo.get_vertexInputs(this.segment(), index); }
        /// Sets `vertexInputs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexInputsAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.set_vertexInputs(this.segment(), index, value); return this; }

        /// {@return `images` at the given index}
        /// @param index the index
        public @CType("VkPipelineRobustnessImageBehavior") int imagesAt(long index) { return VkPipelineRobustnessCreateInfo.get_images(this.segment(), index); }
        /// Sets `images` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imagesAt(long index, @CType("VkPipelineRobustnessImageBehavior") int value) { VkPipelineRobustnessCreateInfo.set_images(this.segment(), index, value); return this; }

    }
}
