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
/// struct VkComponentMapping {
///     (int) VkComponentSwizzle r;
///     (int) VkComponentSwizzle g;
///     (int) VkComponentSwizzle b;
///     (int) VkComponentSwizzle a;
/// };
/// ```
public sealed class VkComponentMapping extends GroupType {
    /// The struct layout of `VkComponentMapping`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("r"),
        ValueLayout.JAVA_INT.withName("g"),
        ValueLayout.JAVA_INT.withName("b"),
        ValueLayout.JAVA_INT.withName("a")
    );
    /// The byte offset of `r`.
    public static final long OFFSET_r = LAYOUT.byteOffset(PathElement.groupElement("r"));
    /// The memory layout of `r`.
    public static final MemoryLayout LAYOUT_r = LAYOUT.select(PathElement.groupElement("r"));
    /// The [VarHandle] of `r` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("r"));
    /// The byte offset of `g`.
    public static final long OFFSET_g = LAYOUT.byteOffset(PathElement.groupElement("g"));
    /// The memory layout of `g`.
    public static final MemoryLayout LAYOUT_g = LAYOUT.select(PathElement.groupElement("g"));
    /// The [VarHandle] of `g` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("g"));
    /// The byte offset of `b`.
    public static final long OFFSET_b = LAYOUT.byteOffset(PathElement.groupElement("b"));
    /// The memory layout of `b`.
    public static final MemoryLayout LAYOUT_b = LAYOUT.select(PathElement.groupElement("b"));
    /// The [VarHandle] of `b` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b"));
    /// The byte offset of `a`.
    public static final long OFFSET_a = LAYOUT.byteOffset(PathElement.groupElement("a"));
    /// The memory layout of `a`.
    public static final MemoryLayout LAYOUT_a = LAYOUT.select(PathElement.groupElement("a"));
    /// The [VarHandle] of `a` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("a"));

    /// Creates `VkComponentMapping` with the given segment.
    /// @param segment the memory segment
    public VkComponentMapping(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkComponentMapping` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkComponentMapping` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComponentMapping ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComponentMapping(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkComponentMapping` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkComponentMapping` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComponentMapping`
    public static VkComponentMapping alloc(SegmentAllocator allocator) { return new VkComponentMapping(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkComponentMapping` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkComponentMapping`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkComponentMapping copyFrom(VkComponentMapping src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `r` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int r(MemorySegment segment, long index) { return (int) VH_r.get(segment, 0L, index); }
    /// {@return `r`}
    public int r() { return r(this.segment(), 0L); }
    /// Sets `r` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void r(MemorySegment segment, long index, int value) { VH_r.set(segment, 0L, index, value); }
    /// Sets `r` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping r(int value) { r(this.segment(), 0L, value); return this; }

    /// {@return `g` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int g(MemorySegment segment, long index) { return (int) VH_g.get(segment, 0L, index); }
    /// {@return `g`}
    public int g() { return g(this.segment(), 0L); }
    /// Sets `g` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void g(MemorySegment segment, long index, int value) { VH_g.set(segment, 0L, index, value); }
    /// Sets `g` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping g(int value) { g(this.segment(), 0L, value); return this; }

    /// {@return `b` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int b(MemorySegment segment, long index) { return (int) VH_b.get(segment, 0L, index); }
    /// {@return `b`}
    public int b() { return b(this.segment(), 0L); }
    /// Sets `b` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void b(MemorySegment segment, long index, int value) { VH_b.set(segment, 0L, index, value); }
    /// Sets `b` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping b(int value) { b(this.segment(), 0L, value); return this; }

    /// {@return `a` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int a(MemorySegment segment, long index) { return (int) VH_a.get(segment, 0L, index); }
    /// {@return `a`}
    public int a() { return a(this.segment(), 0L); }
    /// Sets `a` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void a(MemorySegment segment, long index, int value) { VH_a.set(segment, 0L, index, value); }
    /// Sets `a` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping a(int value) { a(this.segment(), 0L, value); return this; }

    /// A buffer of [VkComponentMapping].
    public static final class Buffer extends VkComponentMapping {
        private final long elementCount;

        /// Creates `VkComponentMapping.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkComponentMapping`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkComponentMapping`
        public VkComponentMapping asSlice(long index) { return new VkComponentMapping(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkComponentMapping`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkComponentMapping`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `r` at the given index}
        /// @param index the index of the struct buffer
        public int rAt(long index) { return r(this.segment(), index); }
        /// Sets `r` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rAt(long index, int value) { r(this.segment(), index, value); return this; }

        /// {@return `g` at the given index}
        /// @param index the index of the struct buffer
        public int gAt(long index) { return g(this.segment(), index); }
        /// Sets `g` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gAt(long index, int value) { g(this.segment(), index, value); return this; }

        /// {@return `b` at the given index}
        /// @param index the index of the struct buffer
        public int bAt(long index) { return b(this.segment(), index); }
        /// Sets `b` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bAt(long index, int value) { b(this.segment(), index, value); return this; }

        /// {@return `a` at the given index}
        /// @param index the index of the struct buffer
        public int aAt(long index) { return a(this.segment(), index); }
        /// Sets `a` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer aAt(long index, int value) { a(this.segment(), index, value); return this; }

    }
}
