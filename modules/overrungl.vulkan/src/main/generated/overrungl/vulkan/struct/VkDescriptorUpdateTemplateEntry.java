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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDescriptorUpdateTemplateEntry {
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     (int) VkDescriptorType descriptorType;
///     size_t offset;
///     size_t stride;
/// };
/// ```
public sealed class VkDescriptorUpdateTemplateEntry extends GroupType {
    /// The struct layout of `VkDescriptorUpdateTemplateEntry`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        CanonicalTypes.SIZE_T.withName("offset"),
        CanonicalTypes.SIZE_T.withName("stride")
    );
    /// The byte offset of `dstBinding`.
    public static final long OFFSET_dstBinding = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
    /// The memory layout of `dstBinding`.
    public static final MemoryLayout LAYOUT_dstBinding = LAYOUT.select(PathElement.groupElement("dstBinding"));
    /// The [VarHandle] of `dstBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    /// The byte offset of `dstArrayElement`.
    public static final long OFFSET_dstArrayElement = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
    /// The memory layout of `dstArrayElement`.
    public static final MemoryLayout LAYOUT_dstArrayElement = LAYOUT.select(PathElement.groupElement("dstArrayElement"));
    /// The [VarHandle] of `dstArrayElement` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    /// The byte offset of `descriptorCount`.
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    /// The memory layout of `descriptorCount`.
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    /// The byte offset of `descriptorType`.
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    /// The memory layout of `descriptorType`.
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorUpdateTemplateEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntry(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry alloc(SegmentAllocator allocator) { return new VkDescriptorUpdateTemplateEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param dstBinding `dstBinding`
    /// @param dstArrayElement `dstArrayElement`
    /// @param descriptorCount `descriptorCount`
    /// @param descriptorType `descriptorType`
    /// @param offset `offset`
    /// @param stride `stride`
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry allocInit(SegmentAllocator allocator, int dstBinding, int dstArrayElement, int descriptorCount, int descriptorType, long offset, long stride) {
        return alloc(allocator).dstBinding(dstBinding).dstArrayElement(dstArrayElement).descriptorCount(descriptorCount).descriptorType(descriptorType).offset(offset).stride(stride);
    }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param dstBinding `dstBinding`
    /// @param dstArrayElement `dstArrayElement`
    /// @param descriptorCount `descriptorCount`
    /// @param descriptorType `descriptorType`
    /// @param offset `offset`
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry allocInit(SegmentAllocator allocator, int dstBinding, int dstArrayElement, int descriptorCount, int descriptorType, long offset) {
        return alloc(allocator).dstBinding(dstBinding).dstArrayElement(dstArrayElement).descriptorCount(descriptorCount).descriptorType(descriptorType).offset(offset);
    }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param dstBinding `dstBinding`
    /// @param dstArrayElement `dstArrayElement`
    /// @param descriptorCount `descriptorCount`
    /// @param descriptorType `descriptorType`
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry allocInit(SegmentAllocator allocator, int dstBinding, int dstArrayElement, int descriptorCount, int descriptorType) {
        return alloc(allocator).dstBinding(dstBinding).dstArrayElement(dstArrayElement).descriptorCount(descriptorCount).descriptorType(descriptorType);
    }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param dstBinding `dstBinding`
    /// @param dstArrayElement `dstArrayElement`
    /// @param descriptorCount `descriptorCount`
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry allocInit(SegmentAllocator allocator, int dstBinding, int dstArrayElement, int descriptorCount) {
        return alloc(allocator).dstBinding(dstBinding).dstArrayElement(dstArrayElement).descriptorCount(descriptorCount);
    }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param dstBinding `dstBinding`
    /// @param dstArrayElement `dstArrayElement`
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry allocInit(SegmentAllocator allocator, int dstBinding, int dstArrayElement) {
        return alloc(allocator).dstBinding(dstBinding).dstArrayElement(dstArrayElement);
    }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param dstBinding `dstBinding`
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry allocInit(SegmentAllocator allocator, int dstBinding) {
        return alloc(allocator).dstBinding(dstBinding);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry copyFrom(VkDescriptorUpdateTemplateEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `dstBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstBinding(MemorySegment segment, long index) { return (int) VH_dstBinding.get(segment, 0L, index); }
    /// {@return `dstBinding`}
    public int dstBinding() { return dstBinding(this.segment(), 0L); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstBinding(MemorySegment segment, long index, int value) { VH_dstBinding.set(segment, 0L, index, value); }
    /// Sets `dstBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry dstBinding(int value) { dstBinding(this.segment(), 0L, value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstArrayElement(MemorySegment segment, long index) { return (int) VH_dstArrayElement.get(segment, 0L, index); }
    /// {@return `dstArrayElement`}
    public int dstArrayElement() { return dstArrayElement(this.segment(), 0L); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstArrayElement(MemorySegment segment, long index, int value) { VH_dstArrayElement.set(segment, 0L, index, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry dstArrayElement(int value) { dstArrayElement(this.segment(), 0L, value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    public int descriptorCount() { return descriptorCount(this.segment(), 0L); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorCount(MemorySegment segment, long index, int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry descriptorCount(int value) { descriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    public int descriptorType() { return descriptorType(this.segment(), 0L); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorType(MemorySegment segment, long index, int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry descriptorType(int value) { descriptorType(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long offset(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_offset.get(segment, 0L, index)); }
    /// {@return `offset`}
    public long offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, long value) { VH_offset.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry offset(long value) { offset(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long stride(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_stride.get(segment, 0L, index)); }
    /// {@return `stride`}
    public long stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, long value) { VH_stride.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry stride(long value) { stride(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDescriptorUpdateTemplateEntry].
    public static final class Buffer extends VkDescriptorUpdateTemplateEntry {
        private final long elementCount;

        /// Creates `VkDescriptorUpdateTemplateEntry.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorUpdateTemplateEntry`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorUpdateTemplateEntry`
        public VkDescriptorUpdateTemplateEntry asSlice(long index) { return new VkDescriptorUpdateTemplateEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorUpdateTemplateEntry`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorUpdateTemplateEntry`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `dstBinding` at the given index}
        /// @param index the index of the struct buffer
        public int dstBindingAt(long index) { return dstBinding(this.segment(), index); }
        /// Sets `dstBinding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstBindingAt(long index, int value) { dstBinding(this.segment(), index, value); return this; }

        /// {@return `dstArrayElement` at the given index}
        /// @param index the index of the struct buffer
        public int dstArrayElementAt(long index) { return dstArrayElement(this.segment(), index); }
        /// Sets `dstArrayElement` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstArrayElementAt(long index, int value) { dstArrayElement(this.segment(), index, value); return this; }

        /// {@return `descriptorCount` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorCountAt(long index) { return descriptorCount(this.segment(), index); }
        /// Sets `descriptorCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorCountAt(long index, int value) { descriptorCount(this.segment(), index, value); return this; }

        /// {@return `descriptorType` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorTypeAt(long index) { return descriptorType(this.segment(), index); }
        /// Sets `descriptorType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorTypeAt(long index, int value) { descriptorType(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index of the struct buffer
        public long offsetAt(long index) { return offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index of the struct buffer
        public long strideAt(long index) { return stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, long value) { stride(this.segment(), index, value); return this; }

    }
}
