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
/// struct VkSubpassDependency {
///     uint32_t srcSubpass;
///     uint32_t dstSubpass;
///     ((uint32_t) VkFlags) VkPipelineStageFlags srcStageMask;
///     ((uint32_t) VkFlags) VkPipelineStageFlags dstStageMask;
///     ((uint32_t) VkFlags) VkAccessFlags srcAccessMask;
///     ((uint32_t) VkFlags) VkAccessFlags dstAccessMask;
///     ((uint32_t) VkFlags) VkDependencyFlags dependencyFlags;
/// };
/// ```
public sealed class VkSubpassDependency extends GroupType {
    /// The struct layout of `VkSubpassDependency`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags")
    );
    /// The byte offset of `srcSubpass`.
    public static final long OFFSET_srcSubpass = LAYOUT.byteOffset(PathElement.groupElement("srcSubpass"));
    /// The memory layout of `srcSubpass`.
    public static final MemoryLayout LAYOUT_srcSubpass = LAYOUT.select(PathElement.groupElement("srcSubpass"));
    /// The [VarHandle] of `srcSubpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubpass"));
    /// The byte offset of `dstSubpass`.
    public static final long OFFSET_dstSubpass = LAYOUT.byteOffset(PathElement.groupElement("dstSubpass"));
    /// The memory layout of `dstSubpass`.
    public static final MemoryLayout LAYOUT_dstSubpass = LAYOUT.select(PathElement.groupElement("dstSubpass"));
    /// The [VarHandle] of `dstSubpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubpass"));
    /// The byte offset of `srcStageMask`.
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    /// The memory layout of `srcStageMask`.
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    /// The byte offset of `dstStageMask`.
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    /// The memory layout of `dstStageMask`.
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The byte offset of `dstAccessMask`.
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    /// The memory layout of `dstAccessMask`.
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The byte offset of `dependencyFlags`.
    public static final long OFFSET_dependencyFlags = LAYOUT.byteOffset(PathElement.groupElement("dependencyFlags"));
    /// The memory layout of `dependencyFlags`.
    public static final MemoryLayout LAYOUT_dependencyFlags = LAYOUT.select(PathElement.groupElement("dependencyFlags"));
    /// The [VarHandle] of `dependencyFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));

    /// Creates `VkSubpassDependency` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDependency(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDependency` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassDependency` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDependency(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDependency` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassDependency` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDependency`
    public static VkSubpassDependency alloc(SegmentAllocator allocator) { return new VkSubpassDependency(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDependency` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDependency`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassDependency copyFrom(VkSubpassDependency src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcSubpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcSubpass(MemorySegment segment, long index) { return (int) VH_srcSubpass.get(segment, 0L, index); }
    /// {@return `srcSubpass`}
    public int srcSubpass() { return srcSubpass(this.segment(), 0L); }
    /// Sets `srcSubpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcSubpass(MemorySegment segment, long index, int value) { VH_srcSubpass.set(segment, 0L, index, value); }
    /// Sets `srcSubpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcSubpass(int value) { srcSubpass(this.segment(), 0L, value); return this; }

    /// {@return `dstSubpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstSubpass(MemorySegment segment, long index) { return (int) VH_dstSubpass.get(segment, 0L, index); }
    /// {@return `dstSubpass`}
    public int dstSubpass() { return dstSubpass(this.segment(), 0L); }
    /// Sets `dstSubpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstSubpass(MemorySegment segment, long index, int value) { VH_dstSubpass.set(segment, 0L, index, value); }
    /// Sets `dstSubpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstSubpass(int value) { dstSubpass(this.segment(), 0L, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcStageMask(MemorySegment segment, long index) { return (int) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    public int srcStageMask() { return srcStageMask(this.segment(), 0L); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcStageMask(MemorySegment segment, long index, int value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcStageMask(int value) { srcStageMask(this.segment(), 0L, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstStageMask(MemorySegment segment, long index) { return (int) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    public int dstStageMask() { return dstStageMask(this.segment(), 0L); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstStageMask(MemorySegment segment, long index, int value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstStageMask(int value) { dstStageMask(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public int srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcAccessMask(int value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public int dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstAccessMask(int value) { dstAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dependencyFlags(MemorySegment segment, long index) { return (int) VH_dependencyFlags.get(segment, 0L, index); }
    /// {@return `dependencyFlags`}
    public int dependencyFlags() { return dependencyFlags(this.segment(), 0L); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dependencyFlags(MemorySegment segment, long index, int value) { VH_dependencyFlags.set(segment, 0L, index, value); }
    /// Sets `dependencyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dependencyFlags(int value) { dependencyFlags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSubpassDependency].
    public static final class Buffer extends VkSubpassDependency {
        private final long elementCount;

        /// Creates `VkSubpassDependency.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassDependency`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassDependency`
        public VkSubpassDependency asSlice(long index) { return new VkSubpassDependency(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassDependency`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassDependency`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcSubpass` at the given index}
        /// @param index the index of the struct buffer
        public int srcSubpassAt(long index) { return srcSubpass(this.segment(), index); }
        /// Sets `srcSubpass` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcSubpassAt(long index, int value) { srcSubpass(this.segment(), index, value); return this; }

        /// {@return `dstSubpass` at the given index}
        /// @param index the index of the struct buffer
        public int dstSubpassAt(long index) { return dstSubpass(this.segment(), index); }
        /// Sets `dstSubpass` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstSubpassAt(long index, int value) { dstSubpass(this.segment(), index, value); return this; }

        /// {@return `srcStageMask` at the given index}
        /// @param index the index of the struct buffer
        public int srcStageMaskAt(long index) { return srcStageMask(this.segment(), index); }
        /// Sets `srcStageMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcStageMaskAt(long index, int value) { srcStageMask(this.segment(), index, value); return this; }

        /// {@return `dstStageMask` at the given index}
        /// @param index the index of the struct buffer
        public int dstStageMaskAt(long index) { return dstStageMask(this.segment(), index); }
        /// Sets `dstStageMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstStageMaskAt(long index, int value) { dstStageMask(this.segment(), index, value); return this; }

        /// {@return `srcAccessMask` at the given index}
        /// @param index the index of the struct buffer
        public int srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
        /// Sets `srcAccessMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAccessMaskAt(long index, int value) { srcAccessMask(this.segment(), index, value); return this; }

        /// {@return `dstAccessMask` at the given index}
        /// @param index the index of the struct buffer
        public int dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
        /// Sets `dstAccessMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAccessMaskAt(long index, int value) { dstAccessMask(this.segment(), index, value); return this; }

        /// {@return `dependencyFlags` at the given index}
        /// @param index the index of the struct buffer
        public int dependencyFlagsAt(long index) { return dependencyFlags(this.segment(), index); }
        /// Sets `dependencyFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dependencyFlagsAt(long index, int value) { dependencyFlags(this.segment(), index, value); return this; }

    }
}
