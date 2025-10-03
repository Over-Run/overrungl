// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkViewportSwizzleNV`.
/// ## Layout
/// ```
/// struct VkViewportSwizzleNV {
///     (int) VkViewportCoordinateSwizzleNV x;
///     (int) VkViewportCoordinateSwizzleNV y;
///     (int) VkViewportCoordinateSwizzleNV z;
///     (int) VkViewportCoordinateSwizzleNV w;
/// };
/// ```
public final class VkViewportSwizzleNV extends GroupType {
    /// The struct layout of `VkViewportSwizzleNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z"),
        ValueLayout.JAVA_INT.withName("w")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_x = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("x")));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_y = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("y")));
    /// The byte offset of `z`.
    public static final long OFFSET_z = LAYOUT.byteOffset(PathElement.groupElement("z"));
    /// The memory layout of `z`.
    public static final MemoryLayout LAYOUT_z = LAYOUT.select(PathElement.groupElement("z"));
    /// The [VarHandle] of `z` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_z = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("z")));
    /// The byte offset of `w`.
    public static final long OFFSET_w = LAYOUT.byteOffset(PathElement.groupElement("w"));
    /// The memory layout of `w`.
    public static final MemoryLayout LAYOUT_w = LAYOUT.select(PathElement.groupElement("w"));
    /// The [VarHandle] of `w` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_w = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("w")));

    /// Creates `VkViewportSwizzleNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkViewportSwizzleNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkViewportSwizzleNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportSwizzleNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkViewportSwizzleNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportSwizzleNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkViewportSwizzleNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportSwizzleNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkViewportSwizzleNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewportSwizzleNV`
    public static VkViewportSwizzleNV alloc(SegmentAllocator allocator) { return new VkViewportSwizzleNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkViewportSwizzleNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewportSwizzleNV`
    public static VkViewportSwizzleNV alloc(SegmentAllocator allocator, long count) { return new VkViewportSwizzleNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkViewportSwizzleNV copyFrom(VkViewportSwizzleNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkViewportSwizzleNV reinterpret(long count) { return new VkViewportSwizzleNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int x(MemorySegment segment, long index) { return (int) VH_x.get().get(segment, 0L, index); }
    /// {@return `x`}
    public int x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, int value) { VH_x.get().set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV x(int value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int y(MemorySegment segment, long index) { return (int) VH_y.get().get(segment, 0L, index); }
    /// {@return `y`}
    public int y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, int value) { VH_y.get().set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV y(int value) { y(this.segment(), 0L, value); return this; }

    /// {@return `z` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int z(MemorySegment segment, long index) { return (int) VH_z.get().get(segment, 0L, index); }
    /// {@return `z`}
    public int z() { return z(this.segment(), 0L); }
    /// Sets `z` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void z(MemorySegment segment, long index, int value) { VH_z.get().set(segment, 0L, index, value); }
    /// Sets `z` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV z(int value) { z(this.segment(), 0L, value); return this; }

    /// {@return `w` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int w(MemorySegment segment, long index) { return (int) VH_w.get().get(segment, 0L, index); }
    /// {@return `w`}
    public int w() { return w(this.segment(), 0L); }
    /// Sets `w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void w(MemorySegment segment, long index, int value) { VH_w.get().set(segment, 0L, index, value); }
    /// Sets `w` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV w(int value) { w(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkViewportSwizzleNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkViewportSwizzleNV`
    public VkViewportSwizzleNV asSlice(long index) { return new VkViewportSwizzleNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkViewportSwizzleNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkViewportSwizzleNV`
    public VkViewportSwizzleNV asSlice(long index, long count) { return new VkViewportSwizzleNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkViewportSwizzleNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkViewportSwizzleNV at(long index, Consumer<VkViewportSwizzleNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x` at the given index}
    /// @param index the index of the struct buffer
    public int xAt(long index) { return x(this.segment(), index); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV xAt(long index, int value) { x(this.segment(), index, value); return this; }

    /// {@return `y` at the given index}
    /// @param index the index of the struct buffer
    public int yAt(long index) { return y(this.segment(), index); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV yAt(long index, int value) { y(this.segment(), index, value); return this; }

    /// {@return `z` at the given index}
    /// @param index the index of the struct buffer
    public int zAt(long index) { return z(this.segment(), index); }
    /// Sets `z` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV zAt(long index, int value) { z(this.segment(), index, value); return this; }

    /// {@return `w` at the given index}
    /// @param index the index of the struct buffer
    public int wAt(long index) { return w(this.segment(), index); }
    /// Sets `w` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViewportSwizzleNV wAt(long index, int value) { w(this.segment(), index, value); return this; }

}
