// This file is auto-generated. DO NOT EDIT!
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
/// }
/// ```
public final class VkPerformanceCounterResultKHR extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("int32"),
        ValueLayout.JAVA_LONG.withName("int64"),
        ValueLayout.JAVA_INT.withName("uint32"),
        ValueLayout.JAVA_LONG.withName("uint64"),
        ValueLayout.JAVA_FLOAT.withName("float32"),
        ValueLayout.JAVA_DOUBLE.withName("float64")
    );
    public static final long OFFSET_int32 = LAYOUT.byteOffset(PathElement.groupElement("int32"));
    public static final long OFFSET_int64 = LAYOUT.byteOffset(PathElement.groupElement("int64"));
    public static final long OFFSET_uint32 = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
    public static final long OFFSET_uint64 = LAYOUT.byteOffset(PathElement.groupElement("uint64"));
    public static final long OFFSET_float32 = LAYOUT.byteOffset(PathElement.groupElement("float32"));
    public static final long OFFSET_float64 = LAYOUT.byteOffset(PathElement.groupElement("float64"));
    public static final MemoryLayout LAYOUT_int32 = LAYOUT.select(PathElement.groupElement("int32"));
    public static final MemoryLayout LAYOUT_int64 = LAYOUT.select(PathElement.groupElement("int64"));
    public static final MemoryLayout LAYOUT_uint32 = LAYOUT.select(PathElement.groupElement("uint32"));
    public static final MemoryLayout LAYOUT_uint64 = LAYOUT.select(PathElement.groupElement("uint64"));
    public static final MemoryLayout LAYOUT_float32 = LAYOUT.select(PathElement.groupElement("float32"));
    public static final MemoryLayout LAYOUT_float64 = LAYOUT.select(PathElement.groupElement("float64"));
    public static final VarHandle VH_int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int32"));
    public static final VarHandle VH_int64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int64"));
    public static final VarHandle VH_uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint32"));
    public static final VarHandle VH_uint64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint64"));
    public static final VarHandle VH_float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float32"));
    public static final VarHandle VH_float64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float64"));

    public VkPerformanceCounterResultKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceCounterResultKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT, count), count); }
    public VkPerformanceCounterResultKHR copyFrom(VkPerformanceCounterResultKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceCounterResultKHR reinterpret(long count) { return new VkPerformanceCounterResultKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceCounterResultKHR asSlice(long index) { return new VkPerformanceCounterResultKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceCounterResultKHR asSlice(long index, long count) { return new VkPerformanceCounterResultKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceCounterResultKHR at(long index, Consumer<VkPerformanceCounterResultKHR> func) { func.accept(asSlice(index)); return this; }
    public int int32At(long index) { return (int) VH_int32.get(this.segment(), 0L, index); }
    public long int64At(long index) { return (long) VH_int64.get(this.segment(), 0L, index); }
    public int uint32At(long index) { return (int) VH_uint32.get(this.segment(), 0L, index); }
    public long uint64At(long index) { return (long) VH_uint64.get(this.segment(), 0L, index); }
    public float float32At(long index) { return (float) VH_float32.get(this.segment(), 0L, index); }
    public double float64At(long index) { return (double) VH_float64.get(this.segment(), 0L, index); }
    public int int32() { return (int) VH_int32.get(this.segment(), 0L, 0L); }
    public long int64() { return (long) VH_int64.get(this.segment(), 0L, 0L); }
    public int uint32() { return (int) VH_uint32.get(this.segment(), 0L, 0L); }
    public long uint64() { return (long) VH_uint64.get(this.segment(), 0L, 0L); }
    public float float32() { return (float) VH_float32.get(this.segment(), 0L, 0L); }
    public double float64() { return (double) VH_float64.get(this.segment(), 0L, 0L); }
    public VkPerformanceCounterResultKHR int32At(long index, int value) { VH_int32.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterResultKHR int64At(long index, long value) { VH_int64.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterResultKHR uint32At(long index, int value) { VH_uint32.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterResultKHR uint64At(long index, long value) { VH_uint64.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterResultKHR float32At(long index, float value) { VH_float32.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterResultKHR float64At(long index, double value) { VH_float64.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterResultKHR int32(int value) { VH_int32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterResultKHR int64(long value) { VH_int64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterResultKHR uint32(int value) { VH_uint32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterResultKHR uint64(long value) { VH_uint64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterResultKHR float32(float value) { VH_float32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterResultKHR float64(double value) { VH_float64.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _int32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_int32, index), LAYOUT_int32); }
    public MemorySegment _int32() { return _int32At(0L); }
    public VkPerformanceCounterResultKHR _int32At(long index, MemorySegment src) { _int32At(index).copyFrom(src); return this; }
    public VkPerformanceCounterResultKHR _int32(MemorySegment src) { return _int32At(0L, src); }
    public MemorySegment _int64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_int64, index), LAYOUT_int64); }
    public MemorySegment _int64() { return _int64At(0L); }
    public VkPerformanceCounterResultKHR _int64At(long index, MemorySegment src) { _int64At(index).copyFrom(src); return this; }
    public VkPerformanceCounterResultKHR _int64(MemorySegment src) { return _int64At(0L, src); }
    public MemorySegment _uint32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uint32, index), LAYOUT_uint32); }
    public MemorySegment _uint32() { return _uint32At(0L); }
    public VkPerformanceCounterResultKHR _uint32At(long index, MemorySegment src) { _uint32At(index).copyFrom(src); return this; }
    public VkPerformanceCounterResultKHR _uint32(MemorySegment src) { return _uint32At(0L, src); }
    public MemorySegment _uint64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uint64, index), LAYOUT_uint64); }
    public MemorySegment _uint64() { return _uint64At(0L); }
    public VkPerformanceCounterResultKHR _uint64At(long index, MemorySegment src) { _uint64At(index).copyFrom(src); return this; }
    public VkPerformanceCounterResultKHR _uint64(MemorySegment src) { return _uint64At(0L, src); }
    public MemorySegment _float32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_float32, index), LAYOUT_float32); }
    public MemorySegment _float32() { return _float32At(0L); }
    public VkPerformanceCounterResultKHR _float32At(long index, MemorySegment src) { _float32At(index).copyFrom(src); return this; }
    public VkPerformanceCounterResultKHR _float32(MemorySegment src) { return _float32At(0L, src); }
    public MemorySegment _float64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_float64, index), LAYOUT_float64); }
    public MemorySegment _float64() { return _float64At(0L); }
    public VkPerformanceCounterResultKHR _float64At(long index, MemorySegment src) { _float64At(index).copyFrom(src); return this; }
    public VkPerformanceCounterResultKHR _float64(MemorySegment src) { return _float64At(0L, src); }
}
