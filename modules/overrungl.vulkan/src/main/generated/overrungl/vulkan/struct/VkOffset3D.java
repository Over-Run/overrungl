// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOffset3D`.
/// ## Layout
/// ```
/// struct VkOffset3D {
///     int32_t x;
///     int32_t y;
///     int32_t z;
/// };
/// ```
public final class VkOffset3D extends GroupType {
    /// The struct layout of `VkOffset3D`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The byte offset of `z`.
    public static final long OFFSET_z = LAYOUT.byteOffset(PathElement.groupElement("z"));
    /// The memory layout of `z`.
    public static final MemoryLayout LAYOUT_z = LAYOUT.select(PathElement.groupElement("z"));
    /// The [VarHandle] of `z` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));

    /// Creates `VkOffset3D` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkOffset3D(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkOffset3D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset3D of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOffset3D(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOffset3D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset3D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOffset3D(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkOffset3D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOffset3D ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOffset3D(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkOffset3D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOffset3D`
    public static VkOffset3D alloc(SegmentAllocator allocator) { return new VkOffset3D(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkOffset3D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOffset3D`
    public static VkOffset3D alloc(SegmentAllocator allocator, long count) { return new VkOffset3D(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOffset3D copyFrom(VkOffset3D src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkOffset3D reinterpret(long count) { return new VkOffset3D(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public int x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset3D x(int value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public int y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset3D y(int value) { y(this.segment(), 0L, value); return this; }

    /// {@return `z` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int z(MemorySegment segment, long index) { return (int) VH_z.get(segment, 0L, index); }
    /// {@return `z`}
    public int z() { return z(this.segment(), 0L); }
    /// Sets `z` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void z(MemorySegment segment, long index, int value) { VH_z.set(segment, 0L, index, value); }
    /// Sets `z` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOffset3D z(int value) { z(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkOffset3D`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkOffset3D`
    public VkOffset3D asSlice(long index) { return new VkOffset3D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkOffset3D`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkOffset3D`
    public VkOffset3D asSlice(long index, long count) { return new VkOffset3D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkOffset3D` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkOffset3D at(long index, Consumer<VkOffset3D> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x` at the given index}
    /// @param index the index of the struct buffer
    public int xAt(long index) { return x(this.segment(), index); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOffset3D xAt(long index, int value) { x(this.segment(), index, value); return this; }

    /// {@return `y` at the given index}
    /// @param index the index of the struct buffer
    public int yAt(long index) { return y(this.segment(), index); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOffset3D yAt(long index, int value) { y(this.segment(), index, value); return this; }

    /// {@return `z` at the given index}
    /// @param index the index of the struct buffer
    public int zAt(long index) { return z(this.segment(), index); }
    /// Sets `z` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOffset3D zAt(long index, int value) { z(this.segment(), index, value); return this; }

}
