// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceCounterResultKHR`.
/// ## Layout
/// ```
/// union VkPerformanceCounterResultKHR {
///     int32_t int32;
///     int64_t int64;
///     uint32_t uint32;
///     uint64_t uint64;
///     float float32;
///     double float64;
/// };
/// ```
public final class VkPerformanceCounterResultKHR extends GroupType {
    /// The union layout of `VkPerformanceCounterResultKHR`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("int32"),
        ValueLayout.JAVA_LONG.withName("int64"),
        ValueLayout.JAVA_INT.withName("uint32"),
        ValueLayout.JAVA_LONG.withName("uint64"),
        ValueLayout.JAVA_FLOAT.withName("float32"),
        ValueLayout.JAVA_DOUBLE.withName("float64")
    );
    /// The byte offset of `int32`.
    public static final long OFFSET_int32 = LAYOUT.byteOffset(PathElement.groupElement("int32"));
    /// The memory layout of `int32`.
    public static final MemoryLayout LAYOUT_int32 = LAYOUT.select(PathElement.groupElement("int32"));
    /// The [VarHandle] of `int32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_int32 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("int32")));
    /// The byte offset of `int64`.
    public static final long OFFSET_int64 = LAYOUT.byteOffset(PathElement.groupElement("int64"));
    /// The memory layout of `int64`.
    public static final MemoryLayout LAYOUT_int64 = LAYOUT.select(PathElement.groupElement("int64"));
    /// The [VarHandle] of `int64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_int64 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("int64")));
    /// The byte offset of `uint32`.
    public static final long OFFSET_uint32 = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
    /// The memory layout of `uint32`.
    public static final MemoryLayout LAYOUT_uint32 = LAYOUT.select(PathElement.groupElement("uint32"));
    /// The [VarHandle] of `uint32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uint32 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint32")));
    /// The byte offset of `uint64`.
    public static final long OFFSET_uint64 = LAYOUT.byteOffset(PathElement.groupElement("uint64"));
    /// The memory layout of `uint64`.
    public static final MemoryLayout LAYOUT_uint64 = LAYOUT.select(PathElement.groupElement("uint64"));
    /// The [VarHandle] of `uint64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uint64 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint64")));
    /// The byte offset of `float32`.
    public static final long OFFSET_float32 = LAYOUT.byteOffset(PathElement.groupElement("float32"));
    /// The memory layout of `float32`.
    public static final MemoryLayout LAYOUT_float32 = LAYOUT.select(PathElement.groupElement("float32"));
    /// The [VarHandle] of `float32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_float32 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("float32")));
    /// The byte offset of `float64`.
    public static final long OFFSET_float64 = LAYOUT.byteOffset(PathElement.groupElement("float64"));
    /// The memory layout of `float64`.
    public static final MemoryLayout LAYOUT_float64 = LAYOUT.select(PathElement.groupElement("float64"));
    /// The [VarHandle] of `float64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_float64 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("float64")));

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkPerformanceCounterResultKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceCounterResultKHR copyFrom(VkPerformanceCounterResultKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPerformanceCounterResultKHR reinterpret(long count) { return new VkPerformanceCounterResultKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `int32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int int32(MemorySegment segment, long index) { return (int) VH_int32.get().get(segment, 0L, index); }
    /// {@return `int32`}
    public int int32() { return int32(this.segment(), 0L); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void int32(MemorySegment segment, long index, int value) { VH_int32.get().set(segment, 0L, index, value); }
    /// Sets `int32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int32(int value) { int32(this.segment(), 0L, value); return this; }

    /// {@return `int64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long int64(MemorySegment segment, long index) { return (long) VH_int64.get().get(segment, 0L, index); }
    /// {@return `int64`}
    public long int64() { return int64(this.segment(), 0L); }
    /// Sets `int64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void int64(MemorySegment segment, long index, long value) { VH_int64.get().set(segment, 0L, index, value); }
    /// Sets `int64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int64(long value) { int64(this.segment(), 0L, value); return this; }

    /// {@return `uint32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int uint32(MemorySegment segment, long index) { return (int) VH_uint32.get().get(segment, 0L, index); }
    /// {@return `uint32`}
    public int uint32() { return uint32(this.segment(), 0L); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void uint32(MemorySegment segment, long index, int value) { VH_uint32.get().set(segment, 0L, index, value); }
    /// Sets `uint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint32(int value) { uint32(this.segment(), 0L, value); return this; }

    /// {@return `uint64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long uint64(MemorySegment segment, long index) { return (long) VH_uint64.get().get(segment, 0L, index); }
    /// {@return `uint64`}
    public long uint64() { return uint64(this.segment(), 0L); }
    /// Sets `uint64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void uint64(MemorySegment segment, long index, long value) { VH_uint64.get().set(segment, 0L, index, value); }
    /// Sets `uint64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint64(long value) { uint64(this.segment(), 0L, value); return this; }

    /// {@return `float32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static float float32(MemorySegment segment, long index) { return (float) VH_float32.get().get(segment, 0L, index); }
    /// {@return `float32`}
    public float float32() { return float32(this.segment(), 0L); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void float32(MemorySegment segment, long index, float value) { VH_float32.get().set(segment, 0L, index, value); }
    /// Sets `float32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float32(float value) { float32(this.segment(), 0L, value); return this; }

    /// {@return `float64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static double float64(MemorySegment segment, long index) { return (double) VH_float64.get().get(segment, 0L, index); }
    /// {@return `float64`}
    public double float64() { return float64(this.segment(), 0L); }
    /// Sets `float64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void float64(MemorySegment segment, long index, double value) { VH_float64.get().set(segment, 0L, index, value); }
    /// Sets `float64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float64(double value) { float64(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPerformanceCounterResultKHR`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkPerformanceCounterResultKHR`
    public VkPerformanceCounterResultKHR asSlice(long index) { return new VkPerformanceCounterResultKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPerformanceCounterResultKHR`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkPerformanceCounterResultKHR`
    public VkPerformanceCounterResultKHR asSlice(long index, long count) { return new VkPerformanceCounterResultKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPerformanceCounterResultKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPerformanceCounterResultKHR at(long index, Consumer<VkPerformanceCounterResultKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `int32` at the given index}
    /// @param index the index of the union buffer
    public int int32At(long index) { return int32(this.segment(), index); }
    /// Sets `int32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int32At(long index, int value) { int32(this.segment(), index, value); return this; }

    /// {@return `int64` at the given index}
    /// @param index the index of the union buffer
    public long int64At(long index) { return int64(this.segment(), index); }
    /// Sets `int64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int64At(long index, long value) { int64(this.segment(), index, value); return this; }

    /// {@return `uint32` at the given index}
    /// @param index the index of the union buffer
    public int uint32At(long index) { return uint32(this.segment(), index); }
    /// Sets `uint32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint32At(long index, int value) { uint32(this.segment(), index, value); return this; }

    /// {@return `uint64` at the given index}
    /// @param index the index of the union buffer
    public long uint64At(long index) { return uint64(this.segment(), index); }
    /// Sets `uint64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint64At(long index, long value) { uint64(this.segment(), index, value); return this; }

    /// {@return `float32` at the given index}
    /// @param index the index of the union buffer
    public float float32At(long index) { return float32(this.segment(), index); }
    /// Sets `float32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float32At(long index, float value) { float32(this.segment(), index, value); return this; }

    /// {@return `float64` at the given index}
    /// @param index the index of the union buffer
    public double float64At(long index) { return float64(this.segment(), index); }
    /// Sets `float64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float64At(long index, double value) { float64(this.segment(), index, value); return this; }

}
