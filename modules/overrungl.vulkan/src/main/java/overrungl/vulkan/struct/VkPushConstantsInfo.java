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
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(MemorySegment)]
/// ### stageFlags
/// [VarHandle][#VH_stageFlags] - [Getter][#stageFlags()] - [Setter][#stageFlags(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(int)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(int)]
/// ### pValues
/// [VarHandle][#VH_pValues] - [Getter][#pValues()] - [Setter][#pValues(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPushConstantsInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineLayout layout;
///     VkShaderStageFlags stageFlags;
///     uint32_t offset;
///     uint32_t size;
///     const void * pValues;
/// } VkPushConstantsInfo;
/// ```
public sealed class VkPushConstantsInfo extends Struct {
    /// The struct layout of `VkPushConstantsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `pValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    /// Creates `VkPushConstantsInfo` with the given segment.
    /// @param segment the memory segment
    public VkPushConstantsInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantsInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushConstantsInfo(segment); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantsInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushConstantsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPushConstantsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushConstantsInfo`
    public static VkPushConstantsInfo alloc(SegmentAllocator allocator) { return new VkPushConstantsInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPushConstantsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushConstantsInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPushConstantsInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushConstantsInfo`
    public static VkPushConstantsInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineLayout") MemorySegment layout, @CType("VkShaderStageFlags") int stageFlags, @CType("uint32_t") int offset, @CType("uint32_t") int size, @CType("const void *") MemorySegment pValues) { return alloc(allocator).sType(sType).pNext(pNext).layout(layout).stageFlags(stageFlags).offset(offset).size(size).pValues(pValues); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPushConstantsInfo copyFrom(VkPushConstantsInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPushConstantsInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPushConstantsInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPushConstantsInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo sType(@CType("VkStructureType") int value) { VkPushConstantsInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPushConstantsInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPushConstantsInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPushConstantsInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo pNext(@CType("const void *") MemorySegment value) { VkPushConstantsInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment, long index) { return (MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment) { return VkPushConstantsInfo.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") MemorySegment layout() { return VkPushConstantsInfo.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") MemorySegment value) { VkPushConstantsInfo.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo layout(@CType("VkPipelineLayout") MemorySegment value) { VkPushConstantsInfo.set_layout(this.segment(), value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkPushConstantsInfo.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkPushConstantsInfo.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPushConstantsInfo.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo stageFlags(@CType("VkShaderStageFlags") int value) { VkPushConstantsInfo.set_stageFlags(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkPushConstantsInfo.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkPushConstantsInfo.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkPushConstantsInfo.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo offset(@CType("uint32_t") int value) { VkPushConstantsInfo.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_size(MemorySegment segment) { return VkPushConstantsInfo.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("uint32_t") int size() { return VkPushConstantsInfo.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("uint32_t") int value) { VkPushConstantsInfo.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo size(@CType("uint32_t") int value) { VkPushConstantsInfo.set_size(this.segment(), value); return this; }

    /// {@return `pValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pValues(MemorySegment segment, long index) { return (MemorySegment) VH_pValues.get(segment, 0L, index); }
    /// {@return `pValues`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pValues(MemorySegment segment) { return VkPushConstantsInfo.get_pValues(segment, 0L); }
    /// {@return `pValues`}
    public @CType("const void *") MemorySegment pValues() { return VkPushConstantsInfo.get_pValues(this.segment()); }
    /// Sets `pValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pValues(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pValues.set(segment, 0L, index, value); }
    /// Sets `pValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pValues(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPushConstantsInfo.set_pValues(segment, 0L, value); }
    /// Sets `pValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo pValues(@CType("const void *") MemorySegment value) { VkPushConstantsInfo.set_pValues(this.segment(), value); return this; }

    /// A buffer of [VkPushConstantsInfo].
    public static final class Buffer extends VkPushConstantsInfo {
        private final long elementCount;

        /// Creates `VkPushConstantsInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPushConstantsInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPushConstantsInfo`
        public VkPushConstantsInfo asSlice(long index) { return new VkPushConstantsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPushConstantsInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPushConstantsInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPushConstantsInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPushConstantsInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPushConstantsInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPushConstantsInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") MemorySegment layoutAt(long index) { return VkPushConstantsInfo.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") MemorySegment value) { VkPushConstantsInfo.set_layout(this.segment(), index, value); return this; }

        /// {@return `stageFlags` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkPushConstantsInfo.get_stageFlags(this.segment(), index); }
        /// Sets `stageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkPushConstantsInfo.set_stageFlags(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int offsetAt(long index) { return VkPushConstantsInfo.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("uint32_t") int value) { VkPushConstantsInfo.set_offset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sizeAt(long index) { return VkPushConstantsInfo.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("uint32_t") int value) { VkPushConstantsInfo.set_size(this.segment(), index, value); return this; }

        /// {@return `pValues` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pValuesAt(long index) { return VkPushConstantsInfo.get_pValues(this.segment(), index); }
        /// Sets `pValues` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pValuesAt(long index, @CType("const void *") MemorySegment value) { VkPushConstantsInfo.set_pValues(this.segment(), index, value); return this; }

    }
}
