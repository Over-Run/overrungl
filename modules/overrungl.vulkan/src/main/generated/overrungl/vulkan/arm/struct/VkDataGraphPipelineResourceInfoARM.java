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
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDataGraphPipelineResourceInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t descriptorSet;
///     uint32_t binding;
///     uint32_t arrayElement;
/// };
/// ```
public sealed class VkDataGraphPipelineResourceInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineResourceInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSet"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("arrayElement")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `descriptorSet`.
    public static final long OFFSET_descriptorSet = LAYOUT.byteOffset(PathElement.groupElement("descriptorSet"));
    /// The memory layout of `descriptorSet`.
    public static final MemoryLayout LAYOUT_descriptorSet = LAYOUT.select(PathElement.groupElement("descriptorSet"));
    /// The [VarHandle] of `descriptorSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSet"));
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `arrayElement`.
    public static final long OFFSET_arrayElement = LAYOUT.byteOffset(PathElement.groupElement("arrayElement"));
    /// The memory layout of `arrayElement`.
    public static final MemoryLayout LAYOUT_arrayElement = LAYOUT.select(PathElement.groupElement("arrayElement"));
    /// The [VarHandle] of `arrayElement` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_arrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayElement"));

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkDataGraphPipelineResourceInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineResourceInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineResourceInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorSet `descriptorSet`
    /// @param binding `binding`
    /// @param arrayElement `arrayElement`
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int descriptorSet, int binding, int arrayElement) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorSet(descriptorSet).binding(binding).arrayElement(arrayElement);
    }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorSet `descriptorSet`
    /// @param binding `binding`
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int descriptorSet, int binding) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorSet(descriptorSet).binding(binding);
    }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorSet `descriptorSet`
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int descriptorSet) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorSet(descriptorSet);
    }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM copyFrom(VkDataGraphPipelineResourceInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSet(MemorySegment segment, long index) { return (int) VH_descriptorSet.get(segment, 0L, index); }
    /// {@return `descriptorSet`}
    public int descriptorSet() { return descriptorSet(this.segment(), 0L); }
    /// Sets `descriptorSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSet(MemorySegment segment, long index, int value) { VH_descriptorSet.set(segment, 0L, index, value); }
    /// Sets `descriptorSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM descriptorSet(int value) { descriptorSet(this.segment(), 0L, value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `arrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int arrayElement(MemorySegment segment, long index) { return (int) VH_arrayElement.get(segment, 0L, index); }
    /// {@return `arrayElement`}
    public int arrayElement() { return arrayElement(this.segment(), 0L); }
    /// Sets `arrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayElement(MemorySegment segment, long index, int value) { VH_arrayElement.set(segment, 0L, index, value); }
    /// Sets `arrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM arrayElement(int value) { arrayElement(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDataGraphPipelineResourceInfoARM].
    public static final class Buffer extends VkDataGraphPipelineResourceInfoARM {
        private final long elementCount;

        /// Creates `VkDataGraphPipelineResourceInfoARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDataGraphPipelineResourceInfoARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDataGraphPipelineResourceInfoARM`
        public VkDataGraphPipelineResourceInfoARM asSlice(long index) { return new VkDataGraphPipelineResourceInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDataGraphPipelineResourceInfoARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDataGraphPipelineResourceInfoARM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `descriptorSet` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorSetAt(long index) { return descriptorSet(this.segment(), index); }
        /// Sets `descriptorSet` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetAt(long index, int value) { descriptorSet(this.segment(), index, value); return this; }

        /// {@return `binding` at the given index}
        /// @param index the index of the struct buffer
        public int bindingAt(long index) { return binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

        /// {@return `arrayElement` at the given index}
        /// @param index the index of the struct buffer
        public int arrayElementAt(long index) { return arrayElement(this.segment(), index); }
        /// Sets `arrayElement` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer arrayElementAt(long index, int value) { arrayElement(this.segment(), index, value); return this; }

    }
}
