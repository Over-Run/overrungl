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
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDescriptorSetBindingReferenceVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSetLayout descriptorSetLayout;
///     uint32_t binding;
/// };
/// ```
public sealed class VkDescriptorSetBindingReferenceVALVE extends GroupType {
    /// The struct layout of `VkDescriptorSetBindingReferenceVALVE`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("binding")
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
    /// The byte offset of `descriptorSetLayout`.
    public static final long OFFSET_descriptorSetLayout = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayout"));
    /// The memory layout of `descriptorSetLayout`.
    public static final MemoryLayout LAYOUT_descriptorSetLayout = LAYOUT.select(PathElement.groupElement("descriptorSetLayout"));
    /// The [VarHandle] of `descriptorSetLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayout"));
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetBindingReferenceVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetBindingReferenceVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetBindingReferenceVALVE`
    public static VkDescriptorSetBindingReferenceVALVE alloc(SegmentAllocator allocator) { return new VkDescriptorSetBindingReferenceVALVE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetBindingReferenceVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetBindingReferenceVALVE`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE copyFrom(VkDescriptorSetBindingReferenceVALVE src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDescriptorSetBindingReferenceVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetBindingReferenceVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorSetLayout(MemorySegment segment, long index) { return (long) VH_descriptorSetLayout.get(segment, 0L, index); }
    /// {@return `descriptorSetLayout`}
    public long descriptorSetLayout() { return descriptorSetLayout(this.segment(), 0L); }
    /// Sets `descriptorSetLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetLayout(MemorySegment segment, long index, long value) { VH_descriptorSetLayout.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayout(long value) { descriptorSetLayout(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetBindingReferenceVALVE binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDescriptorSetBindingReferenceVALVE].
    public static final class Buffer extends VkDescriptorSetBindingReferenceVALVE {
        private final long elementCount;

        /// Creates `VkDescriptorSetBindingReferenceVALVE.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetBindingReferenceVALVE`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetBindingReferenceVALVE`
        public VkDescriptorSetBindingReferenceVALVE asSlice(long index) { return new VkDescriptorSetBindingReferenceVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetBindingReferenceVALVE`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetBindingReferenceVALVE`
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

        /// {@return `descriptorSetLayout` at the given index}
        /// @param index the index of the struct buffer
        public long descriptorSetLayoutAt(long index) { return descriptorSetLayout(this.segment(), index); }
        /// Sets `descriptorSetLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetLayoutAt(long index, long value) { descriptorSetLayout(this.segment(), index, value); return this; }

        /// {@return `binding` at the given index}
        /// @param index the index of the struct buffer
        public int bindingAt(long index) { return binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    }
}
