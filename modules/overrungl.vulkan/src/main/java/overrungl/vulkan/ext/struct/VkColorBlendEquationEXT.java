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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkColorBlendEquationEXT {
///     VkBlendFactor srcColorBlendFactor;
///     VkBlendFactor dstColorBlendFactor;
///     VkBlendOp colorBlendOp;
///     VkBlendFactor srcAlphaBlendFactor;
///     VkBlendFactor dstAlphaBlendFactor;
///     VkBlendOp alphaBlendOp;
/// };
/// ```
public sealed class VkColorBlendEquationEXT extends GroupType {
    /// The struct layout of `VkColorBlendEquationEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp")
    );
    /// The byte offset of `srcColorBlendFactor`.
    public static final long OFFSET_srcColorBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("srcColorBlendFactor"));
    /// The memory layout of `srcColorBlendFactor`.
    public static final MemoryLayout LAYOUT_srcColorBlendFactor = LAYOUT.select(PathElement.groupElement("srcColorBlendFactor"));
    /// The [VarHandle] of `srcColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcColorBlendFactor"));
    /// The byte offset of `dstColorBlendFactor`.
    public static final long OFFSET_dstColorBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("dstColorBlendFactor"));
    /// The memory layout of `dstColorBlendFactor`.
    public static final MemoryLayout LAYOUT_dstColorBlendFactor = LAYOUT.select(PathElement.groupElement("dstColorBlendFactor"));
    /// The [VarHandle] of `dstColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstColorBlendFactor"));
    /// The byte offset of `colorBlendOp`.
    public static final long OFFSET_colorBlendOp = LAYOUT.byteOffset(PathElement.groupElement("colorBlendOp"));
    /// The memory layout of `colorBlendOp`.
    public static final MemoryLayout LAYOUT_colorBlendOp = LAYOUT.select(PathElement.groupElement("colorBlendOp"));
    /// The [VarHandle] of `colorBlendOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorBlendOp"));
    /// The byte offset of `srcAlphaBlendFactor`.
    public static final long OFFSET_srcAlphaBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The memory layout of `srcAlphaBlendFactor`.
    public static final MemoryLayout LAYOUT_srcAlphaBlendFactor = LAYOUT.select(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The [VarHandle] of `srcAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The byte offset of `dstAlphaBlendFactor`.
    public static final long OFFSET_dstAlphaBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The memory layout of `dstAlphaBlendFactor`.
    public static final MemoryLayout LAYOUT_dstAlphaBlendFactor = LAYOUT.select(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The [VarHandle] of `dstAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The byte offset of `alphaBlendOp`.
    public static final long OFFSET_alphaBlendOp = LAYOUT.byteOffset(PathElement.groupElement("alphaBlendOp"));
    /// The memory layout of `alphaBlendOp`.
    public static final MemoryLayout LAYOUT_alphaBlendOp = LAYOUT.select(PathElement.groupElement("alphaBlendOp"));
    /// The [VarHandle] of `alphaBlendOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alphaBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaBlendOp"));

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    /// @param segment the memory segment
    public VkColorBlendEquationEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendEquationEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkColorBlendEquationEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkColorBlendEquationEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkColorBlendEquationEXT`
    public static VkColorBlendEquationEXT alloc(SegmentAllocator allocator) { return new VkColorBlendEquationEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkColorBlendEquationEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkColorBlendEquationEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkColorBlendEquationEXT copyFrom(VkColorBlendEquationEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcColorBlendFactor(MemorySegment segment, long index) { return (int) VH_srcColorBlendFactor.get(segment, 0L, index); }
    /// {@return `srcColorBlendFactor`}
    public int srcColorBlendFactor() { return srcColorBlendFactor(this.segment(), 0L); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcColorBlendFactor(MemorySegment segment, long index, int value) { VH_srcColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT srcColorBlendFactor(int value) { srcColorBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `dstColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstColorBlendFactor(MemorySegment segment, long index) { return (int) VH_dstColorBlendFactor.get(segment, 0L, index); }
    /// {@return `dstColorBlendFactor`}
    public int dstColorBlendFactor() { return dstColorBlendFactor(this.segment(), 0L); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstColorBlendFactor(MemorySegment segment, long index, int value) { VH_dstColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT dstColorBlendFactor(int value) { dstColorBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `colorBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorBlendOp(MemorySegment segment, long index) { return (int) VH_colorBlendOp.get(segment, 0L, index); }
    /// {@return `colorBlendOp`}
    public int colorBlendOp() { return colorBlendOp(this.segment(), 0L); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorBlendOp(MemorySegment segment, long index, int value) { VH_colorBlendOp.set(segment, 0L, index, value); }
    /// Sets `colorBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT colorBlendOp(int value) { colorBlendOp(this.segment(), 0L, value); return this; }

    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_srcAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `srcAlphaBlendFactor`}
    public int srcAlphaBlendFactor() { return srcAlphaBlendFactor(this.segment(), 0L); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAlphaBlendFactor(MemorySegment segment, long index, int value) { VH_srcAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT srcAlphaBlendFactor(int value) { srcAlphaBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_dstAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `dstAlphaBlendFactor`}
    public int dstAlphaBlendFactor() { return dstAlphaBlendFactor(this.segment(), 0L); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAlphaBlendFactor(MemorySegment segment, long index, int value) { VH_dstAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT dstAlphaBlendFactor(int value) { dstAlphaBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `alphaBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alphaBlendOp(MemorySegment segment, long index) { return (int) VH_alphaBlendOp.get(segment, 0L, index); }
    /// {@return `alphaBlendOp`}
    public int alphaBlendOp() { return alphaBlendOp(this.segment(), 0L); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alphaBlendOp(MemorySegment segment, long index, int value) { VH_alphaBlendOp.set(segment, 0L, index, value); }
    /// Sets `alphaBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT alphaBlendOp(int value) { alphaBlendOp(this.segment(), 0L, value); return this; }

    /// A buffer of [VkColorBlendEquationEXT].
    public static final class Buffer extends VkColorBlendEquationEXT {
        private final long elementCount;

        /// Creates `VkColorBlendEquationEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkColorBlendEquationEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkColorBlendEquationEXT`
        public VkColorBlendEquationEXT asSlice(long index) { return new VkColorBlendEquationEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkColorBlendEquationEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkColorBlendEquationEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcColorBlendFactor` at the given index}
        /// @param index the index of the struct buffer
        public int srcColorBlendFactorAt(long index) { return srcColorBlendFactor(this.segment(), index); }
        /// Sets `srcColorBlendFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcColorBlendFactorAt(long index, int value) { srcColorBlendFactor(this.segment(), index, value); return this; }

        /// {@return `dstColorBlendFactor` at the given index}
        /// @param index the index of the struct buffer
        public int dstColorBlendFactorAt(long index) { return dstColorBlendFactor(this.segment(), index); }
        /// Sets `dstColorBlendFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstColorBlendFactorAt(long index, int value) { dstColorBlendFactor(this.segment(), index, value); return this; }

        /// {@return `colorBlendOp` at the given index}
        /// @param index the index of the struct buffer
        public int colorBlendOpAt(long index) { return colorBlendOp(this.segment(), index); }
        /// Sets `colorBlendOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorBlendOpAt(long index, int value) { colorBlendOp(this.segment(), index, value); return this; }

        /// {@return `srcAlphaBlendFactor` at the given index}
        /// @param index the index of the struct buffer
        public int srcAlphaBlendFactorAt(long index) { return srcAlphaBlendFactor(this.segment(), index); }
        /// Sets `srcAlphaBlendFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAlphaBlendFactorAt(long index, int value) { srcAlphaBlendFactor(this.segment(), index, value); return this; }

        /// {@return `dstAlphaBlendFactor` at the given index}
        /// @param index the index of the struct buffer
        public int dstAlphaBlendFactorAt(long index) { return dstAlphaBlendFactor(this.segment(), index); }
        /// Sets `dstAlphaBlendFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAlphaBlendFactorAt(long index, int value) { dstAlphaBlendFactor(this.segment(), index, value); return this; }

        /// {@return `alphaBlendOp` at the given index}
        /// @param index the index of the struct buffer
        public int alphaBlendOpAt(long index) { return alphaBlendOp(this.segment(), index); }
        /// Sets `alphaBlendOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alphaBlendOpAt(long index, int value) { alphaBlendOp(this.segment(), index, value); return this; }

    }
}
