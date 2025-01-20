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
/// ### maxInlineUniformBlockSize
/// [VarHandle][#VH_maxInlineUniformBlockSize] - [Getter][#maxInlineUniformBlockSize()] - [Setter][#maxInlineUniformBlockSize(int)]
/// ### maxPerStageDescriptorInlineUniformBlocks
/// [VarHandle][#VH_maxPerStageDescriptorInlineUniformBlocks] - [Getter][#maxPerStageDescriptorInlineUniformBlocks()] - [Setter][#maxPerStageDescriptorInlineUniformBlocks(int)]
/// ### maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks] - [Getter][#maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()] - [Setter][#maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int)]
/// ### maxDescriptorSetInlineUniformBlocks
/// [VarHandle][#VH_maxDescriptorSetInlineUniformBlocks] - [Getter][#maxDescriptorSetInlineUniformBlocks()] - [Setter][#maxDescriptorSetInlineUniformBlocks(int)]
/// ### maxDescriptorSetUpdateAfterBindInlineUniformBlocks
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks] - [Getter][#maxDescriptorSetUpdateAfterBindInlineUniformBlocks()] - [Setter][#maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceInlineUniformBlockProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
/// } VkPhysicalDeviceInlineUniformBlockProperties;
/// ```
public sealed class VkPhysicalDeviceInlineUniformBlockProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceInlineUniformBlockProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxInlineUniformBlockSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxInlineUniformBlockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The [VarHandle] of `maxPerStageDescriptorInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));

    /// Creates `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceInlineUniformBlockProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockProperties(segment); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockProperties`
    public static VkPhysicalDeviceInlineUniformBlockProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInlineUniformBlockProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockProperties`
    public static VkPhysicalDeviceInlineUniformBlockProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int maxInlineUniformBlockSize, @CType("uint32_t") int maxPerStageDescriptorInlineUniformBlocks, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, @CType("uint32_t") int maxDescriptorSetInlineUniformBlocks, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInlineUniformBlocks) { return alloc(allocator).sType(sType).pNext(pNext).maxInlineUniformBlockSize(maxInlineUniformBlockSize).maxPerStageDescriptorInlineUniformBlocks(maxPerStageDescriptorInlineUniformBlocks).maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks).maxDescriptorSetInlineUniformBlocks(maxDescriptorSetInlineUniformBlocks).maxDescriptorSetUpdateAfterBindInlineUniformBlocks(maxDescriptorSetUpdateAfterBindInlineUniformBlocks); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties copyFrom(VkPhysicalDeviceInlineUniformBlockProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceInlineUniformBlockProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceInlineUniformBlockProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceInlineUniformBlockProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceInlineUniformBlockProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxInlineUniformBlockSize(MemorySegment segment, long index) { return (int) VH_maxInlineUniformBlockSize.get(segment, 0L, index); }
    /// {@return `maxInlineUniformBlockSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxInlineUniformBlockSize(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxInlineUniformBlockSize(segment, 0L); }
    /// {@return `maxInlineUniformBlockSize`}
    public @CType("uint32_t") int maxInlineUniformBlockSize() { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxInlineUniformBlockSize(this.segment()); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInlineUniformBlockSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxInlineUniformBlockSize.set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformBlockSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInlineUniformBlockSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxInlineUniformBlockSize(segment, 0L, value); }
    /// Sets `maxInlineUniformBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties maxInlineUniformBlockSize(@CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxInlineUniformBlockSize(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxPerStageDescriptorInlineUniformBlocks(segment, 0L); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks`}
    public @CType("uint32_t") int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxPerStageDescriptorInlineUniformBlocks(this.segment()); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxPerStageDescriptorInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties maxPerStageDescriptorInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxPerStageDescriptorInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxDescriptorSetInlineUniformBlocks(segment, 0L); }
    /// {@return `maxDescriptorSetInlineUniformBlocks`}
    public @CType("uint32_t") int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxDescriptorSetInlineUniformBlocks(this.segment()); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxDescriptorSetInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties maxDescriptorSetInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxDescriptorSetInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockProperties maxDescriptorSetUpdateAfterBindInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceInlineUniformBlockProperties].
    public static final class Buffer extends VkPhysicalDeviceInlineUniformBlockProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceInlineUniformBlockProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceInlineUniformBlockProperties`
        public VkPhysicalDeviceInlineUniformBlockProperties asSlice(long index) { return new VkPhysicalDeviceInlineUniformBlockProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceInlineUniformBlockProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceInlineUniformBlockProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxInlineUniformBlockSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxInlineUniformBlockSizeAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxInlineUniformBlockSize(this.segment(), index); }
        /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxInlineUniformBlockSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxInlineUniformBlockSize(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorInlineUniformBlocksAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxPerStageDescriptorInlineUniformBlocks(this.segment(), index); }
        /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxPerStageDescriptorInlineUniformBlocks(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetInlineUniformBlocksAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxDescriptorSetInlineUniformBlocks(this.segment(), index); }
        /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxDescriptorSetInlineUniformBlocks(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return VkPhysicalDeviceInlineUniformBlockProperties.get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceInlineUniformBlockProperties.set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }

    }
}
