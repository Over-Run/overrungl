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

/// Represents `STBTT__bitmap`.
/// ## Layout
/// ```
/// struct STBTT__bitmap {
///     int w;
///     int h;
///     int stride;
///     unsigned char* pixels;
/// };
/// ```
public final class STBTT__bitmap extends GroupType {
    /// The struct layout of `STBTT__bitmap`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.ADDRESS.withName("pixels")
    );
    /// The byte offset of `w`.
    public static final long OFFSET_w = LAYOUT.byteOffset(PathElement.groupElement("w"));
    /// The memory layout of `w`.
    public static final MemoryLayout LAYOUT_w = LAYOUT.select(PathElement.groupElement("w"));
    /// The [VarHandle] of `w` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("w"));
    /// The byte offset of `h`.
    public static final long OFFSET_h = LAYOUT.byteOffset(PathElement.groupElement("h"));
    /// The memory layout of `h`.
    public static final MemoryLayout LAYOUT_h = LAYOUT.select(PathElement.groupElement("h"));
    /// The [VarHandle] of `h` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("h"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The byte offset of `pixels`.
    public static final long OFFSET_pixels = LAYOUT.byteOffset(PathElement.groupElement("pixels"));
    /// The memory layout of `pixels`.
    public static final MemoryLayout LAYOUT_pixels = LAYOUT.select(PathElement.groupElement("pixels"));
    /// The [VarHandle] of `pixels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixels"));

    /// Creates `STBTT__bitmap` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBTT__bitmap(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBTT__bitmap` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__bitmap of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTT__bitmap(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTT__bitmap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__bitmap ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTT__bitmap(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBTT__bitmap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTT__bitmap ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBTT__bitmap(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTT__bitmap` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTT__bitmap`
    public static STBTT__bitmap alloc(SegmentAllocator allocator) { return new STBTT__bitmap(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBTT__bitmap` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTT__bitmap`
    public static STBTT__bitmap alloc(SegmentAllocator allocator, long count) { return new STBTT__bitmap(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTT__bitmap copyFrom(STBTT__bitmap src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBTT__bitmap reinterpret(long count) { return new STBTT__bitmap(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `w` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int w(MemorySegment segment, long index) { return (int) VH_w.get(segment, 0L, index); }
    /// {@return `w`}
    public int w() { return w(this.segment(), 0L); }
    /// Sets `w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void w(MemorySegment segment, long index, int value) { VH_w.set(segment, 0L, index, value); }
    /// Sets `w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap w(int value) { w(this.segment(), 0L, value); return this; }

    /// {@return `h` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int h(MemorySegment segment, long index) { return (int) VH_h.get(segment, 0L, index); }
    /// {@return `h`}
    public int h() { return h(this.segment(), 0L); }
    /// Sets `h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void h(MemorySegment segment, long index, int value) { VH_h.set(segment, 0L, index, value); }
    /// Sets `h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap h(int value) { h(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// {@return `pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pixels(MemorySegment segment, long index) { return (MemorySegment) VH_pixels.get(segment, 0L, index); }
    /// {@return `pixels`}
    public MemorySegment pixels() { return pixels(this.segment(), 0L); }
    /// Sets `pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pixels(MemorySegment segment, long index, MemorySegment value) { VH_pixels.set(segment, 0L, index, value); }
    /// Sets `pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap pixels(MemorySegment value) { pixels(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBTT__bitmap`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTT__bitmap`
    public STBTT__bitmap asSlice(long index) { return new STBTT__bitmap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBTT__bitmap`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTT__bitmap`
    public STBTT__bitmap asSlice(long index, long count) { return new STBTT__bitmap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBTT__bitmap` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBTT__bitmap at(long index, Consumer<STBTT__bitmap> func) { func.accept(asSlice(index)); return this; }

    /// {@return `w` at the given index}
    /// @param index the index of the struct buffer
    public int wAt(long index) { return w(this.segment(), index); }
    /// Sets `w` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap wAt(long index, int value) { w(this.segment(), index, value); return this; }

    /// {@return `h` at the given index}
    /// @param index the index of the struct buffer
    public int hAt(long index) { return h(this.segment(), index); }
    /// Sets `h` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap hAt(long index, int value) { h(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public int strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

    /// {@return `pixels` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pixelsAt(long index) { return pixels(this.segment(), index); }
    /// Sets `pixels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTT__bitmap pixelsAt(long index, MemorySegment value) { pixels(this.segment(), index, value); return this; }

}
