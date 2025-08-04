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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct STBTTBakedChar {
///     unsigned short x0;
///     unsigned short y0;
///     unsigned short x1;
///     unsigned short y1;
///     float xoff;
///     float yoff;
///     float xadvance;
/// };
/// ```
public final class STBTTBakedChar extends GroupType {
    /// The struct layout of `STBTTBakedChar`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("x0"),
        ValueLayout.JAVA_SHORT.withName("y0"),
        ValueLayout.JAVA_SHORT.withName("x1"),
        ValueLayout.JAVA_SHORT.withName("y1"),
        ValueLayout.JAVA_FLOAT.withName("xoff"),
        ValueLayout.JAVA_FLOAT.withName("yoff"),
        ValueLayout.JAVA_FLOAT.withName("xadvance")
    );
    /// The byte offset of `x0`.
    public static final long OFFSET_x0 = LAYOUT.byteOffset(PathElement.groupElement("x0"));
    /// The memory layout of `x0`.
    public static final MemoryLayout LAYOUT_x0 = LAYOUT.select(PathElement.groupElement("x0"));
    /// The [VarHandle] of `x0` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x0"));
    /// The byte offset of `y0`.
    public static final long OFFSET_y0 = LAYOUT.byteOffset(PathElement.groupElement("y0"));
    /// The memory layout of `y0`.
    public static final MemoryLayout LAYOUT_y0 = LAYOUT.select(PathElement.groupElement("y0"));
    /// The [VarHandle] of `y0` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y0"));
    /// The byte offset of `x1`.
    public static final long OFFSET_x1 = LAYOUT.byteOffset(PathElement.groupElement("x1"));
    /// The memory layout of `x1`.
    public static final MemoryLayout LAYOUT_x1 = LAYOUT.select(PathElement.groupElement("x1"));
    /// The [VarHandle] of `x1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x1"));
    /// The byte offset of `y1`.
    public static final long OFFSET_y1 = LAYOUT.byteOffset(PathElement.groupElement("y1"));
    /// The memory layout of `y1`.
    public static final MemoryLayout LAYOUT_y1 = LAYOUT.select(PathElement.groupElement("y1"));
    /// The [VarHandle] of `y1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y1"));
    /// The byte offset of `xoff`.
    public static final long OFFSET_xoff = LAYOUT.byteOffset(PathElement.groupElement("xoff"));
    /// The memory layout of `xoff`.
    public static final MemoryLayout LAYOUT_xoff = LAYOUT.select(PathElement.groupElement("xoff"));
    /// The [VarHandle] of `xoff` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_xoff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xoff"));
    /// The byte offset of `yoff`.
    public static final long OFFSET_yoff = LAYOUT.byteOffset(PathElement.groupElement("yoff"));
    /// The memory layout of `yoff`.
    public static final MemoryLayout LAYOUT_yoff = LAYOUT.select(PathElement.groupElement("yoff"));
    /// The [VarHandle] of `yoff` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_yoff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yoff"));
    /// The byte offset of `xadvance`.
    public static final long OFFSET_xadvance = LAYOUT.byteOffset(PathElement.groupElement("xadvance"));
    /// The memory layout of `xadvance`.
    public static final MemoryLayout LAYOUT_xadvance = LAYOUT.select(PathElement.groupElement("xadvance"));
    /// The [VarHandle] of `xadvance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_xadvance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xadvance"));

    /// Creates `STBTTBakedChar` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBTTBakedChar(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBTTBakedChar` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTBakedChar of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTBakedChar(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTBakedChar` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTBakedChar ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTBakedChar(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBTTBakedChar` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTBakedChar ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTBakedChar(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTTBakedChar` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTBakedChar`
    public static STBTTBakedChar alloc(SegmentAllocator allocator) { return new STBTTBakedChar(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBTTBakedChar` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTBakedChar`
    public static STBTTBakedChar alloc(SegmentAllocator allocator, long count) { return new STBTTBakedChar(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTBakedChar copyFrom(STBTTBakedChar src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBTTBakedChar reinterpret(long count) { return new STBTTBakedChar(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short x0(MemorySegment segment, long index) { return (short) VH_x0.get(segment, 0L, index); }
    /// {@return `x0`}
    public short x0() { return x0(this.segment(), 0L); }
    /// Sets `x0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x0(MemorySegment segment, long index, short value) { VH_x0.set(segment, 0L, index, value); }
    /// Sets `x0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar x0(short value) { x0(this.segment(), 0L, value); return this; }

    /// {@return `y0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short y0(MemorySegment segment, long index) { return (short) VH_y0.get(segment, 0L, index); }
    /// {@return `y0`}
    public short y0() { return y0(this.segment(), 0L); }
    /// Sets `y0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y0(MemorySegment segment, long index, short value) { VH_y0.set(segment, 0L, index, value); }
    /// Sets `y0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar y0(short value) { y0(this.segment(), 0L, value); return this; }

    /// {@return `x1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short x1(MemorySegment segment, long index) { return (short) VH_x1.get(segment, 0L, index); }
    /// {@return `x1`}
    public short x1() { return x1(this.segment(), 0L); }
    /// Sets `x1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x1(MemorySegment segment, long index, short value) { VH_x1.set(segment, 0L, index, value); }
    /// Sets `x1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar x1(short value) { x1(this.segment(), 0L, value); return this; }

    /// {@return `y1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short y1(MemorySegment segment, long index) { return (short) VH_y1.get(segment, 0L, index); }
    /// {@return `y1`}
    public short y1() { return y1(this.segment(), 0L); }
    /// Sets `y1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y1(MemorySegment segment, long index, short value) { VH_y1.set(segment, 0L, index, value); }
    /// Sets `y1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar y1(short value) { y1(this.segment(), 0L, value); return this; }

    /// {@return `xoff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float xoff(MemorySegment segment, long index) { return (float) VH_xoff.get(segment, 0L, index); }
    /// {@return `xoff`}
    public float xoff() { return xoff(this.segment(), 0L); }
    /// Sets `xoff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xoff(MemorySegment segment, long index, float value) { VH_xoff.set(segment, 0L, index, value); }
    /// Sets `xoff` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar xoff(float value) { xoff(this.segment(), 0L, value); return this; }

    /// {@return `yoff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float yoff(MemorySegment segment, long index) { return (float) VH_yoff.get(segment, 0L, index); }
    /// {@return `yoff`}
    public float yoff() { return yoff(this.segment(), 0L); }
    /// Sets `yoff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void yoff(MemorySegment segment, long index, float value) { VH_yoff.set(segment, 0L, index, value); }
    /// Sets `yoff` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar yoff(float value) { yoff(this.segment(), 0L, value); return this; }

    /// {@return `xadvance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float xadvance(MemorySegment segment, long index) { return (float) VH_xadvance.get(segment, 0L, index); }
    /// {@return `xadvance`}
    public float xadvance() { return xadvance(this.segment(), 0L); }
    /// Sets `xadvance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xadvance(MemorySegment segment, long index, float value) { VH_xadvance.set(segment, 0L, index, value); }
    /// Sets `xadvance` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar xadvance(float value) { xadvance(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBTTBakedChar`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTBakedChar`
    public STBTTBakedChar asSlice(long index) { return new STBTTBakedChar(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBTTBakedChar`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTBakedChar`
    public STBTTBakedChar asSlice(long index, long count) { return new STBTTBakedChar(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBTTBakedChar` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBTTBakedChar at(long index, Consumer<STBTTBakedChar> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x0` at the given index}
    /// @param index the index of the struct buffer
    public short x0At(long index) { return x0(this.segment(), index); }
    /// Sets `x0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar x0At(long index, short value) { x0(this.segment(), index, value); return this; }

    /// {@return `y0` at the given index}
    /// @param index the index of the struct buffer
    public short y0At(long index) { return y0(this.segment(), index); }
    /// Sets `y0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar y0At(long index, short value) { y0(this.segment(), index, value); return this; }

    /// {@return `x1` at the given index}
    /// @param index the index of the struct buffer
    public short x1At(long index) { return x1(this.segment(), index); }
    /// Sets `x1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar x1At(long index, short value) { x1(this.segment(), index, value); return this; }

    /// {@return `y1` at the given index}
    /// @param index the index of the struct buffer
    public short y1At(long index) { return y1(this.segment(), index); }
    /// Sets `y1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar y1At(long index, short value) { y1(this.segment(), index, value); return this; }

    /// {@return `xoff` at the given index}
    /// @param index the index of the struct buffer
    public float xoffAt(long index) { return xoff(this.segment(), index); }
    /// Sets `xoff` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar xoffAt(long index, float value) { xoff(this.segment(), index, value); return this; }

    /// {@return `yoff` at the given index}
    /// @param index the index of the struct buffer
    public float yoffAt(long index) { return yoff(this.segment(), index); }
    /// Sets `yoff` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar yoffAt(long index, float value) { yoff(this.segment(), index, value); return this; }

    /// {@return `xadvance` at the given index}
    /// @param index the index of the struct buffer
    public float xadvanceAt(long index) { return xadvance(this.segment(), index); }
    /// Sets `xadvance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTBakedChar xadvanceAt(long index, float value) { xadvance(this.segment(), index, value); return this; }

}
