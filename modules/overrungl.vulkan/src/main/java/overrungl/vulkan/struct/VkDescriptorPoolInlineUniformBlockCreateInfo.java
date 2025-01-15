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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### maxInlineUniformBlockBindings
/// [VarHandle][#VH_maxInlineUniformBlockBindings] - [Getter][#maxInlineUniformBlockBindings()] - [Setter][#maxInlineUniformBlockBindings(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorPoolInlineUniformBlockCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t maxInlineUniformBlockBindings;
/// } VkDescriptorPoolInlineUniformBlockCreateInfo;
/// ```
public sealed class VkDescriptorPoolInlineUniformBlockCreateInfo extends Struct {
    /// The struct layout of `VkDescriptorPoolInlineUniformBlockCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockBindings")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxInlineUniformBlockBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxInlineUniformBlockBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockBindings"));

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxInlineUniformBlockBindings) { return alloc(allocator).sType(sType).pNext(pNext).maxInlineUniformBlockBindings(maxInlineUniformBlockBindings); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo copyFrom(VkDescriptorPoolInlineUniformBlockCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType(@CType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `maxInlineUniformBlockBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxInlineUniformBlockBindings(MemorySegment segment, long index) { return (int) VH_maxInlineUniformBlockBindings.get(segment, 0L, index); }
    /// {@return `maxInlineUniformBlockBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxInlineUniformBlockBindings(MemorySegment segment) { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_maxInlineUniformBlockBindings(segment, 0L); }
    /// {@return `maxInlineUniformBlockBindings`}
    public @CType("uint32_t") int maxInlineUniformBlockBindings() { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_maxInlineUniformBlockBindings(this.segment()); }
    /// Sets `maxInlineUniformBlockBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInlineUniformBlockBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxInlineUniformBlockBindings.set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformBlockBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInlineUniformBlockBindings(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_maxInlineUniformBlockBindings(segment, 0L, value); }
    /// Sets `maxInlineUniformBlockBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(@CType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_maxInlineUniformBlockBindings(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorPoolInlineUniformBlockCreateInfo].
    public static final class Buffer extends VkDescriptorPoolInlineUniformBlockCreateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`
        public VkDescriptorPoolInlineUniformBlockCreateInfo asSlice(long index) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxInlineUniformBlockBindings` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxInlineUniformBlockBindingsAt(long index) { return VkDescriptorPoolInlineUniformBlockCreateInfo.get_maxInlineUniformBlockBindings(this.segment(), index); }
        /// Sets `maxInlineUniformBlockBindings` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxInlineUniformBlockBindingsAt(long index, @CType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.set_maxInlineUniformBlockBindings(this.segment(), index, value); return this; }

    }
}
