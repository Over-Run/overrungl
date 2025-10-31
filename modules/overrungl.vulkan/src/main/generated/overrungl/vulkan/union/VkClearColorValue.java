// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClearColorValue`.
/// ## Layout
/// ```
/// union VkClearColorValue {
///     float float32[4];
///     int32_t int32[4];
///     uint32_t uint32[4];
/// };
/// ```
public final class VkClearColorValue extends GroupType {
    /// The union layout of `VkClearColorValue`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("float32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("int32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("uint32")
    );
    /// The byte offset of `float32`.
    public static final long OFFSET_float32 = LAYOUT.byteOffset(PathElement.groupElement("float32"));
    /// The memory layout of `float32`.
    public static final MemoryLayout LAYOUT_float32 = LAYOUT.select(PathElement.groupElement("float32"));
    /// The [VarHandle] of `float32` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float32"), PathElement.sequenceElement());
    /// The byte offset of `int32`.
    public static final long OFFSET_int32 = LAYOUT.byteOffset(PathElement.groupElement("int32"));
    /// The memory layout of `int32`.
    public static final MemoryLayout LAYOUT_int32 = LAYOUT.select(PathElement.groupElement("int32"));
    /// The [VarHandle] of `int32` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int32"), PathElement.sequenceElement());
    /// The byte offset of `uint32`.
    public static final long OFFSET_uint32 = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
    /// The memory layout of `uint32`.
    public static final MemoryLayout LAYOUT_uint32 = LAYOUT.select(PathElement.groupElement("uint32"));
    /// The [VarHandle] of `uint32` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint32"), PathElement.sequenceElement());

    /// Creates `VkClearColorValue` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkClearColorValue(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClearColorValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearColorValue of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearColorValue(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearColorValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearColorValue ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearColorValue(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClearColorValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearColorValue ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearColorValue(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClearColorValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearColorValue`
    public static VkClearColorValue alloc(SegmentAllocator allocator) { return new VkClearColorValue(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClearColorValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearColorValue`
    public static VkClearColorValue alloc(SegmentAllocator allocator, long count) { return new VkClearColorValue(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearColorValue copyFrom(VkClearColorValue src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClearColorValue reinterpret(long count) { return new VkClearColorValue(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `float32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment float32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_float32, index), LAYOUT_float32); }
    /// {@return `float32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    public static float float32(MemorySegment segment, long index, long index0) { return (float) VH_float32.get(segment, 0L, index, index0); }
    /// {@return `float32`}
    public MemorySegment float32() { return float32(this.segment(), 0L); }
    /// {@return `float32`}
    /// @param index0 the Index 0 of the array
    public float float32(long index0) { return float32(this.segment(), 0L, index0); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void float32(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_float32, index), LAYOUT_float32.byteSize()); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void float32(MemorySegment segment, long index, long index0, float value) { VH_float32.set(segment, 0L, index, index0, value); }
    /// Sets `float32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32(MemorySegment value) { float32(this.segment(), 0L, value); return this; }
    /// Sets `float32` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32(long index0, float value) { float32(this.segment(), 0L, index0, value); return this; }

    /// {@return `int32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment int32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_int32, index), LAYOUT_int32); }
    /// {@return `int32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    public static int int32(MemorySegment segment, long index, long index0) { return (int) VH_int32.get(segment, 0L, index, index0); }
    /// {@return `int32`}
    public MemorySegment int32() { return int32(this.segment(), 0L); }
    /// {@return `int32`}
    /// @param index0 the Index 0 of the array
    public int int32(long index0) { return int32(this.segment(), 0L, index0); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void int32(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_int32, index), LAYOUT_int32.byteSize()); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void int32(MemorySegment segment, long index, long index0, int value) { VH_int32.set(segment, 0L, index, index0, value); }
    /// Sets `int32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32(MemorySegment value) { int32(this.segment(), 0L, value); return this; }
    /// Sets `int32` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32(long index0, int value) { int32(this.segment(), 0L, index0, value); return this; }

    /// {@return `uint32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment uint32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_uint32, index), LAYOUT_uint32); }
    /// {@return `uint32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    public static int uint32(MemorySegment segment, long index, long index0) { return (int) VH_uint32.get(segment, 0L, index, index0); }
    /// {@return `uint32`}
    public MemorySegment uint32() { return uint32(this.segment(), 0L); }
    /// {@return `uint32`}
    /// @param index0 the Index 0 of the array
    public int uint32(long index0) { return uint32(this.segment(), 0L, index0); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void uint32(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_uint32, index), LAYOUT_uint32.byteSize()); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void uint32(MemorySegment segment, long index, long index0, int value) { VH_uint32.set(segment, 0L, index, index0, value); }
    /// Sets `uint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32(MemorySegment value) { uint32(this.segment(), 0L, value); return this; }
    /// Sets `uint32` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32(long index0, int value) { uint32(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkClearColorValue`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkClearColorValue`
    public VkClearColorValue asSlice(long index) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClearColorValue`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkClearColorValue`
    public VkClearColorValue asSlice(long index, long count) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClearColorValue` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClearColorValue at(long index, Consumer<VkClearColorValue> func) { func.accept(asSlice(index)); return this; }

    /// {@return `float32` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment float32At(long index) { return float32(this.segment(), index); }
    /// {@return `float32` at the given index}
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
        public float float32At(long index, long index0) { return float32(this.segment(), index, index0); }
    /// Sets `float32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32At(long index, MemorySegment value) { float32(this.segment(), index, value); return this; }
    /// Sets `float32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32At(long index, long index0, float value) { float32(this.segment(), index, index0, value); return this; }

    /// {@return `int32` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment int32At(long index) { return int32(this.segment(), index); }
    /// {@return `int32` at the given index}
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
        public int int32At(long index, long index0) { return int32(this.segment(), index, index0); }
    /// Sets `int32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32At(long index, MemorySegment value) { int32(this.segment(), index, value); return this; }
    /// Sets `int32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32At(long index, long index0, int value) { int32(this.segment(), index, index0, value); return this; }

    /// {@return `uint32` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment uint32At(long index) { return uint32(this.segment(), index); }
    /// {@return `uint32` at the given index}
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
        public int uint32At(long index, long index0) { return uint32(this.segment(), index, index0); }
    /// Sets `uint32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32At(long index, MemorySegment value) { uint32(this.segment(), index, value); return this; }
    /// Sets `uint32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32At(long index, long index0, int value) { uint32(this.segment(), index, index0, value); return this; }

}
