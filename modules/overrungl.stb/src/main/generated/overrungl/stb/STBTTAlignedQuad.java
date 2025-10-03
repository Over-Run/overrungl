// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `STBTTAlignedQuad`.
/// ## Layout
/// ```
/// struct STBTTAlignedQuad {
///     float x0;
///     float y0;
///     float s0;
///     float t0;
///     float x1;
///     float y1;
///     float s1;
///     float t1;
/// };
/// ```
public final class STBTTAlignedQuad extends GroupType {
    /// The struct layout of `STBTTAlignedQuad`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x0"),
        ValueLayout.JAVA_FLOAT.withName("y0"),
        ValueLayout.JAVA_FLOAT.withName("s0"),
        ValueLayout.JAVA_FLOAT.withName("t0"),
        ValueLayout.JAVA_FLOAT.withName("x1"),
        ValueLayout.JAVA_FLOAT.withName("y1"),
        ValueLayout.JAVA_FLOAT.withName("s1"),
        ValueLayout.JAVA_FLOAT.withName("t1")
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
    /// The byte offset of `s0`.
    public static final long OFFSET_s0 = LAYOUT.byteOffset(PathElement.groupElement("s0"));
    /// The memory layout of `s0`.
    public static final MemoryLayout LAYOUT_s0 = LAYOUT.select(PathElement.groupElement("s0"));
    /// The [VarHandle] of `s0` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_s0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("s0"));
    /// The byte offset of `t0`.
    public static final long OFFSET_t0 = LAYOUT.byteOffset(PathElement.groupElement("t0"));
    /// The memory layout of `t0`.
    public static final MemoryLayout LAYOUT_t0 = LAYOUT.select(PathElement.groupElement("t0"));
    /// The [VarHandle] of `t0` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_t0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("t0"));
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
    /// The byte offset of `s1`.
    public static final long OFFSET_s1 = LAYOUT.byteOffset(PathElement.groupElement("s1"));
    /// The memory layout of `s1`.
    public static final MemoryLayout LAYOUT_s1 = LAYOUT.select(PathElement.groupElement("s1"));
    /// The [VarHandle] of `s1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_s1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("s1"));
    /// The byte offset of `t1`.
    public static final long OFFSET_t1 = LAYOUT.byteOffset(PathElement.groupElement("t1"));
    /// The memory layout of `t1`.
    public static final MemoryLayout LAYOUT_t1 = LAYOUT.select(PathElement.groupElement("t1"));
    /// The [VarHandle] of `t1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_t1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("t1"));

    /// Creates `STBTTAlignedQuad` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBTTAlignedQuad(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBTTAlignedQuad` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTAlignedQuad of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTAlignedQuad(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTAlignedQuad` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTAlignedQuad ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTAlignedQuad(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBTTAlignedQuad` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTAlignedQuad ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTAlignedQuad(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTTAlignedQuad` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTAlignedQuad`
    public static STBTTAlignedQuad alloc(SegmentAllocator allocator) { return new STBTTAlignedQuad(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBTTAlignedQuad` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTAlignedQuad`
    public static STBTTAlignedQuad alloc(SegmentAllocator allocator, long count) { return new STBTTAlignedQuad(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTAlignedQuad copyFrom(STBTTAlignedQuad src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBTTAlignedQuad reinterpret(long count) { return new STBTTAlignedQuad(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float x0(MemorySegment segment, long index) { return (float) VH_x0.get(segment, 0L, index); }
    /// {@return `x0`}
    public float x0() { return x0(this.segment(), 0L); }
    /// Sets `x0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x0(MemorySegment segment, long index, float value) { VH_x0.set(segment, 0L, index, value); }
    /// Sets `x0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x0(float value) { x0(this.segment(), 0L, value); return this; }

    /// {@return `y0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float y0(MemorySegment segment, long index) { return (float) VH_y0.get(segment, 0L, index); }
    /// {@return `y0`}
    public float y0() { return y0(this.segment(), 0L); }
    /// Sets `y0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y0(MemorySegment segment, long index, float value) { VH_y0.set(segment, 0L, index, value); }
    /// Sets `y0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y0(float value) { y0(this.segment(), 0L, value); return this; }

    /// {@return `s0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float s0(MemorySegment segment, long index) { return (float) VH_s0.get(segment, 0L, index); }
    /// {@return `s0`}
    public float s0() { return s0(this.segment(), 0L); }
    /// Sets `s0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void s0(MemorySegment segment, long index, float value) { VH_s0.set(segment, 0L, index, value); }
    /// Sets `s0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s0(float value) { s0(this.segment(), 0L, value); return this; }

    /// {@return `t0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float t0(MemorySegment segment, long index) { return (float) VH_t0.get(segment, 0L, index); }
    /// {@return `t0`}
    public float t0() { return t0(this.segment(), 0L); }
    /// Sets `t0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void t0(MemorySegment segment, long index, float value) { VH_t0.set(segment, 0L, index, value); }
    /// Sets `t0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t0(float value) { t0(this.segment(), 0L, value); return this; }

    /// {@return `x1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float x1(MemorySegment segment, long index) { return (float) VH_x1.get(segment, 0L, index); }
    /// {@return `x1`}
    public float x1() { return x1(this.segment(), 0L); }
    /// Sets `x1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x1(MemorySegment segment, long index, float value) { VH_x1.set(segment, 0L, index, value); }
    /// Sets `x1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x1(float value) { x1(this.segment(), 0L, value); return this; }

    /// {@return `y1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float y1(MemorySegment segment, long index) { return (float) VH_y1.get(segment, 0L, index); }
    /// {@return `y1`}
    public float y1() { return y1(this.segment(), 0L); }
    /// Sets `y1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y1(MemorySegment segment, long index, float value) { VH_y1.set(segment, 0L, index, value); }
    /// Sets `y1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y1(float value) { y1(this.segment(), 0L, value); return this; }

    /// {@return `s1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float s1(MemorySegment segment, long index) { return (float) VH_s1.get(segment, 0L, index); }
    /// {@return `s1`}
    public float s1() { return s1(this.segment(), 0L); }
    /// Sets `s1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void s1(MemorySegment segment, long index, float value) { VH_s1.set(segment, 0L, index, value); }
    /// Sets `s1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s1(float value) { s1(this.segment(), 0L, value); return this; }

    /// {@return `t1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float t1(MemorySegment segment, long index) { return (float) VH_t1.get(segment, 0L, index); }
    /// {@return `t1`}
    public float t1() { return t1(this.segment(), 0L); }
    /// Sets `t1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void t1(MemorySegment segment, long index, float value) { VH_t1.set(segment, 0L, index, value); }
    /// Sets `t1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t1(float value) { t1(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBTTAlignedQuad`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTAlignedQuad`
    public STBTTAlignedQuad asSlice(long index) { return new STBTTAlignedQuad(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBTTAlignedQuad`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTAlignedQuad`
    public STBTTAlignedQuad asSlice(long index, long count) { return new STBTTAlignedQuad(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBTTAlignedQuad` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBTTAlignedQuad at(long index, Consumer<STBTTAlignedQuad> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x0` at the given index}
    /// @param index the index of the struct buffer
    public float x0At(long index) { return x0(this.segment(), index); }
    /// Sets `x0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x0At(long index, float value) { x0(this.segment(), index, value); return this; }

    /// {@return `y0` at the given index}
    /// @param index the index of the struct buffer
    public float y0At(long index) { return y0(this.segment(), index); }
    /// Sets `y0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y0At(long index, float value) { y0(this.segment(), index, value); return this; }

    /// {@return `s0` at the given index}
    /// @param index the index of the struct buffer
    public float s0At(long index) { return s0(this.segment(), index); }
    /// Sets `s0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s0At(long index, float value) { s0(this.segment(), index, value); return this; }

    /// {@return `t0` at the given index}
    /// @param index the index of the struct buffer
    public float t0At(long index) { return t0(this.segment(), index); }
    /// Sets `t0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t0At(long index, float value) { t0(this.segment(), index, value); return this; }

    /// {@return `x1` at the given index}
    /// @param index the index of the struct buffer
    public float x1At(long index) { return x1(this.segment(), index); }
    /// Sets `x1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad x1At(long index, float value) { x1(this.segment(), index, value); return this; }

    /// {@return `y1` at the given index}
    /// @param index the index of the struct buffer
    public float y1At(long index) { return y1(this.segment(), index); }
    /// Sets `y1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad y1At(long index, float value) { y1(this.segment(), index, value); return this; }

    /// {@return `s1` at the given index}
    /// @param index the index of the struct buffer
    public float s1At(long index) { return s1(this.segment(), index); }
    /// Sets `s1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad s1At(long index, float value) { s1(this.segment(), index, value); return this; }

    /// {@return `t1` at the given index}
    /// @param index the index of the struct buffer
    public float t1At(long index) { return t1(this.segment(), index); }
    /// Sets `t1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTAlignedQuad t1At(long index, float value) { t1(this.segment(), index, value); return this; }

}
