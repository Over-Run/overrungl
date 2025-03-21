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
/// struct VkPhysicalDeviceInlineUniformBlockFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 inlineUniformBlock;
///     (uint32_t) VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
/// };
/// ```
public sealed class VkPhysicalDeviceInlineUniformBlockFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceInlineUniformBlockFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind")
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
    /// The byte offset of `inlineUniformBlock`.
    public static final long OFFSET_inlineUniformBlock = LAYOUT.byteOffset(PathElement.groupElement("inlineUniformBlock"));
    /// The memory layout of `inlineUniformBlock`.
    public static final MemoryLayout LAYOUT_inlineUniformBlock = LAYOUT.select(PathElement.groupElement("inlineUniformBlock"));
    /// The [VarHandle] of `inlineUniformBlock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inlineUniformBlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inlineUniformBlock"));
    /// The byte offset of `descriptorBindingInlineUniformBlockUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    /// The memory layout of `descriptorBindingInlineUniformBlockUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingInlineUniformBlockUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceInlineUniformBlockFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeatures(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockFeatures`
    public static VkPhysicalDeviceInlineUniformBlockFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInlineUniformBlockFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures copyFrom(VkPhysicalDeviceInlineUniformBlockFeatures src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceInlineUniformBlockFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceInlineUniformBlockFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `inlineUniformBlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inlineUniformBlock(MemorySegment segment, long index) { return (int) VH_inlineUniformBlock.get(segment, 0L, index); }
    /// {@return `inlineUniformBlock`}
    public int inlineUniformBlock() { return inlineUniformBlock(this.segment(), 0L); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inlineUniformBlock(MemorySegment segment, long index, int value) { VH_inlineUniformBlock.set(segment, 0L, index, value); }
    /// Sets `inlineUniformBlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures inlineUniformBlock(int value) { inlineUniformBlock(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind`}
    public int descriptorBindingInlineUniformBlockUpdateAfterBind() { return descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures descriptorBindingInlineUniformBlockUpdateAfterBind(int value) { descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceInlineUniformBlockFeatures].
    public static final class Buffer extends VkPhysicalDeviceInlineUniformBlockFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceInlineUniformBlockFeatures`
        public VkPhysicalDeviceInlineUniformBlockFeatures asSlice(long index) { return new VkPhysicalDeviceInlineUniformBlockFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceInlineUniformBlockFeatures`
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

        /// {@return `inlineUniformBlock` at the given index}
        /// @param index the index of the struct buffer
        public int inlineUniformBlockAt(long index) { return inlineUniformBlock(this.segment(), index); }
        /// Sets `inlineUniformBlock` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer inlineUniformBlockAt(long index, int value) { inlineUniformBlock(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, int value) { descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index, value); return this; }

    }
}
