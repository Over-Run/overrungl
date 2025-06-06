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
/// struct VkInputAttachmentAspectReference {
///     uint32_t subpass;
///     uint32_t inputAttachmentIndex;
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
/// };
/// ```
public sealed class VkInputAttachmentAspectReference extends GroupType {
    /// The struct layout of `VkInputAttachmentAspectReference`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    /// The byte offset of `subpass`.
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    /// The memory layout of `subpass`.
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The byte offset of `inputAttachmentIndex`.
    public static final long OFFSET_inputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentIndex"));
    /// The memory layout of `inputAttachmentIndex`.
    public static final MemoryLayout LAYOUT_inputAttachmentIndex = LAYOUT.select(PathElement.groupElement("inputAttachmentIndex"));
    /// The [VarHandle] of `inputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentIndex"));
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    /// @param segment the memory segment
    public VkInputAttachmentAspectReference(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReference ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReference(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static VkInputAttachmentAspectReference alloc(SegmentAllocator allocator) { return new VkInputAttachmentAspectReference(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpass `subpass`
    /// @param inputAttachmentIndex `inputAttachmentIndex`
    /// @param aspectMask `aspectMask`
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static VkInputAttachmentAspectReference allocInit(SegmentAllocator allocator, int subpass, int inputAttachmentIndex, int aspectMask) {
        return alloc(allocator).subpass(subpass).inputAttachmentIndex(inputAttachmentIndex).aspectMask(aspectMask);
    }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpass `subpass`
    /// @param inputAttachmentIndex `inputAttachmentIndex`
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static VkInputAttachmentAspectReference allocInit(SegmentAllocator allocator, int subpass, int inputAttachmentIndex) {
        return alloc(allocator).subpass(subpass).inputAttachmentIndex(inputAttachmentIndex);
    }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpass `subpass`
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static VkInputAttachmentAspectReference allocInit(SegmentAllocator allocator, int subpass) {
        return alloc(allocator).subpass(subpass);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkInputAttachmentAspectReference copyFrom(VkInputAttachmentAspectReference src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    public int subpass() { return subpass(this.segment(), 0L); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpass(MemorySegment segment, long index, int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference subpass(int value) { subpass(this.segment(), 0L, value); return this; }

    /// {@return `inputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inputAttachmentIndex(MemorySegment segment, long index) { return (int) VH_inputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `inputAttachmentIndex`}
    public int inputAttachmentIndex() { return inputAttachmentIndex(this.segment(), 0L); }
    /// Sets `inputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputAttachmentIndex(MemorySegment segment, long index, int value) { VH_inputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference inputAttachmentIndex(int value) { inputAttachmentIndex(this.segment(), 0L, value); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    public int aspectMask() { return aspectMask(this.segment(), 0L); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectMask(MemorySegment segment, long index, int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// A buffer of [VkInputAttachmentAspectReference].
    public static final class Buffer extends VkInputAttachmentAspectReference {
        private final long elementCount;

        /// Creates `VkInputAttachmentAspectReference.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkInputAttachmentAspectReference`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkInputAttachmentAspectReference`
        public VkInputAttachmentAspectReference asSlice(long index) { return new VkInputAttachmentAspectReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkInputAttachmentAspectReference`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkInputAttachmentAspectReference`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `subpass` at the given index}
        /// @param index the index of the struct buffer
        public int subpassAt(long index) { return subpass(this.segment(), index); }
        /// Sets `subpass` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subpassAt(long index, int value) { subpass(this.segment(), index, value); return this; }

        /// {@return `inputAttachmentIndex` at the given index}
        /// @param index the index of the struct buffer
        public int inputAttachmentIndexAt(long index) { return inputAttachmentIndex(this.segment(), index); }
        /// Sets `inputAttachmentIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer inputAttachmentIndexAt(long index, int value) { inputAttachmentIndex(this.segment(), index, value); return this; }

        /// {@return `aspectMask` at the given index}
        /// @param index the index of the struct buffer
        public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

    }
}
