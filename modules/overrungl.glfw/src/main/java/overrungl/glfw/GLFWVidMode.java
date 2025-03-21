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
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct GLFWVidMode {
///     int width;
///     int height;
///     int redBits;
///     int greenBits;
///     int blueBits;
///     int refreshRate;
/// };
/// ```
public sealed class GLFWVidMode extends GroupType {
    /// The struct layout of `GLFWVidMode`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("redBits"),
        ValueLayout.JAVA_INT.withName("greenBits"),
        ValueLayout.JAVA_INT.withName("blueBits"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `redBits`.
    public static final long OFFSET_redBits = LAYOUT.byteOffset(PathElement.groupElement("redBits"));
    /// The memory layout of `redBits`.
    public static final MemoryLayout LAYOUT_redBits = LAYOUT.select(PathElement.groupElement("redBits"));
    /// The [VarHandle] of `redBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_redBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("redBits"));
    /// The byte offset of `greenBits`.
    public static final long OFFSET_greenBits = LAYOUT.byteOffset(PathElement.groupElement("greenBits"));
    /// The memory layout of `greenBits`.
    public static final MemoryLayout LAYOUT_greenBits = LAYOUT.select(PathElement.groupElement("greenBits"));
    /// The [VarHandle] of `greenBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_greenBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("greenBits"));
    /// The byte offset of `blueBits`.
    public static final long OFFSET_blueBits = LAYOUT.byteOffset(PathElement.groupElement("blueBits"));
    /// The memory layout of `blueBits`.
    public static final MemoryLayout LAYOUT_blueBits = LAYOUT.select(PathElement.groupElement("blueBits"));
    /// The [VarHandle] of `blueBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blueBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blueBits"));
    /// The byte offset of `refreshRate`.
    public static final long OFFSET_refreshRate = LAYOUT.byteOffset(PathElement.groupElement("refreshRate"));
    /// The memory layout of `refreshRate`.
    public static final MemoryLayout LAYOUT_refreshRate = LAYOUT.select(PathElement.groupElement("refreshRate"));
    /// The [VarHandle] of `refreshRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshRate"));

    /// Creates `GLFWVidMode` with the given segment.
    /// @param segment the memory segment
    public GLFWVidMode(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `GLFWVidMode` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWVidMode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWVidMode ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWVidMode(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `GLFWVidMode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `GLFWVidMode` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWVidMode`
    public static GLFWVidMode alloc(SegmentAllocator allocator) { return new GLFWVidMode(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWVidMode` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWVidMode`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWVidMode copyFrom(GLFWVidMode src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `redBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int redBits(MemorySegment segment, long index) { return (int) VH_redBits.get(segment, 0L, index); }
    /// {@return `redBits`}
    public int redBits() { return redBits(this.segment(), 0L); }
    /// Sets `redBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void redBits(MemorySegment segment, long index, int value) { VH_redBits.set(segment, 0L, index, value); }
    /// Sets `redBits` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode redBits(int value) { redBits(this.segment(), 0L, value); return this; }

    /// {@return `greenBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int greenBits(MemorySegment segment, long index) { return (int) VH_greenBits.get(segment, 0L, index); }
    /// {@return `greenBits`}
    public int greenBits() { return greenBits(this.segment(), 0L); }
    /// Sets `greenBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void greenBits(MemorySegment segment, long index, int value) { VH_greenBits.set(segment, 0L, index, value); }
    /// Sets `greenBits` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode greenBits(int value) { greenBits(this.segment(), 0L, value); return this; }

    /// {@return `blueBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blueBits(MemorySegment segment, long index) { return (int) VH_blueBits.get(segment, 0L, index); }
    /// {@return `blueBits`}
    public int blueBits() { return blueBits(this.segment(), 0L); }
    /// Sets `blueBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blueBits(MemorySegment segment, long index, int value) { VH_blueBits.set(segment, 0L, index, value); }
    /// Sets `blueBits` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode blueBits(int value) { blueBits(this.segment(), 0L, value); return this; }

    /// {@return `refreshRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int refreshRate(MemorySegment segment, long index) { return (int) VH_refreshRate.get(segment, 0L, index); }
    /// {@return `refreshRate`}
    public int refreshRate() { return refreshRate(this.segment(), 0L); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refreshRate(MemorySegment segment, long index, int value) { VH_refreshRate.set(segment, 0L, index, value); }
    /// Sets `refreshRate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWVidMode refreshRate(int value) { refreshRate(this.segment(), 0L, value); return this; }

    /// A buffer of [GLFWVidMode].
    public static final class Buffer extends GLFWVidMode {
        private final long elementCount;

        /// Creates `GLFWVidMode.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `GLFWVidMode`.
        /// @param index the index of the struct buffer
        /// @return the slice of `GLFWVidMode`
        public GLFWVidMode asSlice(long index) { return new GLFWVidMode(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `GLFWVidMode`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `GLFWVidMode`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `width` at the given index}
        /// @param index the index of the struct buffer
        public int widthAt(long index) { return width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, int value) { width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index of the struct buffer
        public int heightAt(long index) { return height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, int value) { height(this.segment(), index, value); return this; }

        /// {@return `redBits` at the given index}
        /// @param index the index of the struct buffer
        public int redBitsAt(long index) { return redBits(this.segment(), index); }
        /// Sets `redBits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer redBitsAt(long index, int value) { redBits(this.segment(), index, value); return this; }

        /// {@return `greenBits` at the given index}
        /// @param index the index of the struct buffer
        public int greenBitsAt(long index) { return greenBits(this.segment(), index); }
        /// Sets `greenBits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer greenBitsAt(long index, int value) { greenBits(this.segment(), index, value); return this; }

        /// {@return `blueBits` at the given index}
        /// @param index the index of the struct buffer
        public int blueBitsAt(long index) { return blueBits(this.segment(), index); }
        /// Sets `blueBits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blueBitsAt(long index, int value) { blueBits(this.segment(), index, value); return this; }

        /// {@return `refreshRate` at the given index}
        /// @param index the index of the struct buffer
        public int refreshRateAt(long index) { return refreshRate(this.segment(), index); }
        /// Sets `refreshRate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer refreshRateAt(long index, int value) { refreshRate(this.segment(), index, value); return this; }

    }
}
