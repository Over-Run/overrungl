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
package overrungl.vulkan.valve.struct;

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
/// ### descriptorOffset
/// [VarHandle][#VH_descriptorOffset] - [Getter][#descriptorOffset()] - [Setter][#descriptorOffset(long)]
/// ### descriptorSize
/// [VarHandle][#VH_descriptorSize] - [Getter][#descriptorSize()] - [Setter][#descriptorSize(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetLayoutHostMappingInfoVALVE {
///     VkStructureType sType;
///     void * pNext;
///     size_t descriptorOffset;
///     uint32_t descriptorSize;
/// } VkDescriptorSetLayoutHostMappingInfoVALVE;
/// ```
public sealed class VkDescriptorSetLayoutHostMappingInfoVALVE extends Struct {
    /// The struct layout of `VkDescriptorSetLayoutHostMappingInfoVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorOffset"),
        ValueLayout.JAVA_INT.withName("descriptorSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `descriptorOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_descriptorOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorOffset"));
    /// The [VarHandle] of `descriptorSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSize"));

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("size_t") long descriptorOffset, @CType("uint32_t") int descriptorSize) { return alloc(allocator).sType(sType).pNext(pNext).descriptorOffset(descriptorOffset).descriptorSize(descriptorSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE copyFrom(VkDescriptorSetLayoutHostMappingInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE sType(@CType("VkStructureType") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNext(@CType("void *") MemorySegment value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_pNext(this.segment(), value); return this; }

    /// {@return `descriptorOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_descriptorOffset(MemorySegment segment, long index) { return (long) VH_descriptorOffset.get(segment, 0L, index); }
    /// {@return `descriptorOffset`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_descriptorOffset(MemorySegment segment) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_descriptorOffset(segment, 0L); }
    /// {@return `descriptorOffset`}
    public @CType("size_t") long descriptorOffset() { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_descriptorOffset(this.segment()); }
    /// Sets `descriptorOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorOffset(MemorySegment segment, long index, @CType("size_t") long value) { VH_descriptorOffset.set(segment, 0L, index, value); }
    /// Sets `descriptorOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorOffset(MemorySegment segment, @CType("size_t") long value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_descriptorOffset(segment, 0L, value); }
    /// Sets `descriptorOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffset(@CType("size_t") long value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_descriptorOffset(this.segment(), value); return this; }

    /// {@return `descriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSize(MemorySegment segment, long index) { return (int) VH_descriptorSize.get(segment, 0L, index); }
    /// {@return `descriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSize(MemorySegment segment) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_descriptorSize(segment, 0L); }
    /// {@return `descriptorSize`}
    public @CType("uint32_t") int descriptorSize() { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_descriptorSize(this.segment()); }
    /// Sets `descriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSize.set(segment, 0L, index, value); }
    /// Sets `descriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSize(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_descriptorSize(segment, 0L, value); }
    /// Sets `descriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSize(@CType("uint32_t") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_descriptorSize(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorSetLayoutHostMappingInfoVALVE].
    public static final class Buffer extends VkDescriptorSetLayoutHostMappingInfoVALVE {
        private final long elementCount;

        /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`
        public VkDescriptorSetLayoutHostMappingInfoVALVE asSlice(long index) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_pNext(this.segment(), index, value); return this; }

        /// {@return `descriptorOffset` at the given index}
        /// @param index the index
        public @CType("size_t") long descriptorOffsetAt(long index) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_descriptorOffset(this.segment(), index); }
        /// Sets `descriptorOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorOffsetAt(long index, @CType("size_t") long value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_descriptorOffset(this.segment(), index, value); return this; }

        /// {@return `descriptorSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorSizeAt(long index) { return VkDescriptorSetLayoutHostMappingInfoVALVE.get_descriptorSize(this.segment(), index); }
        /// Sets `descriptorSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSizeAt(long index, @CType("uint32_t") int value) { VkDescriptorSetLayoutHostMappingInfoVALVE.set_descriptorSize(this.segment(), index, value); return this; }

    }
}
