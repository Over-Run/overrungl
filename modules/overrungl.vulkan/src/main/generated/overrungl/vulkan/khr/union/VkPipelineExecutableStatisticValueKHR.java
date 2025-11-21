// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineExecutableStatisticValueKHR`.
/// ## Layout
/// ```
/// union VkPipelineExecutableStatisticValueKHR {
///     VkBool32 b32;
///     int64_t i64;
///     uint64_t u64;
///     double f64;
/// }
/// ```
public final class VkPipelineExecutableStatisticValueKHR extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("b32"),
        ValueLayout.JAVA_LONG.withName("i64"),
        ValueLayout.JAVA_LONG.withName("u64"),
        ValueLayout.JAVA_DOUBLE.withName("f64")
    );
    public static final long OFFSET_b32 = LAYOUT.byteOffset(PathElement.groupElement("b32"));
    public static final long OFFSET_i64 = LAYOUT.byteOffset(PathElement.groupElement("i64"));
    public static final long OFFSET_u64 = LAYOUT.byteOffset(PathElement.groupElement("u64"));
    public static final long OFFSET_f64 = LAYOUT.byteOffset(PathElement.groupElement("f64"));
    public static final MemoryLayout LAYOUT_b32 = LAYOUT.select(PathElement.groupElement("b32"));
    public static final MemoryLayout LAYOUT_i64 = LAYOUT.select(PathElement.groupElement("i64"));
    public static final MemoryLayout LAYOUT_u64 = LAYOUT.select(PathElement.groupElement("u64"));
    public static final MemoryLayout LAYOUT_f64 = LAYOUT.select(PathElement.groupElement("f64"));
    public static final VarHandle VH_b32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b32"));
    public static final VarHandle VH_i64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("i64"));
    public static final VarHandle VH_u64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("u64"));
    public static final VarHandle VH_f64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("f64"));

    public VkPipelineExecutableStatisticValueKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineExecutableStatisticValueKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineExecutableStatisticValueKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineExecutableStatisticValueKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineExecutableStatisticValueKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableStatisticValueKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineExecutableStatisticValueKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableStatisticValueKHR(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineExecutableStatisticValueKHR copyFrom(VkPipelineExecutableStatisticValueKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineExecutableStatisticValueKHR reinterpret(long count) { return new VkPipelineExecutableStatisticValueKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineExecutableStatisticValueKHR asSlice(long index) { return new VkPipelineExecutableStatisticValueKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineExecutableStatisticValueKHR asSlice(long index, long count) { return new VkPipelineExecutableStatisticValueKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineExecutableStatisticValueKHR at(long index, Consumer<VkPipelineExecutableStatisticValueKHR> func) { func.accept(asSlice(index)); return this; }
    public int b32At(long index) { return (int) VH_b32.get(this.segment(), 0L, index); }
    public long i64At(long index) { return (long) VH_i64.get(this.segment(), 0L, index); }
    public long u64At(long index) { return (long) VH_u64.get(this.segment(), 0L, index); }
    public double f64At(long index) { return (double) VH_f64.get(this.segment(), 0L, index); }
    public int b32() { return (int) VH_b32.get(this.segment(), 0L, 0L); }
    public long i64() { return (long) VH_i64.get(this.segment(), 0L, 0L); }
    public long u64() { return (long) VH_u64.get(this.segment(), 0L, 0L); }
    public double f64() { return (double) VH_f64.get(this.segment(), 0L, 0L); }
    public VkPipelineExecutableStatisticValueKHR b32At(long index, int value) { VH_b32.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticValueKHR i64At(long index, long value) { VH_i64.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticValueKHR u64At(long index, long value) { VH_u64.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticValueKHR f64At(long index, double value) { VH_f64.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticValueKHR b32(int value) { VH_b32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticValueKHR i64(long value) { VH_i64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticValueKHR u64(long value) { VH_u64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticValueKHR f64(double value) { VH_f64.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _b32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_b32, index), LAYOUT_b32); }
    public MemorySegment _b32() { return _b32At(0L); }
    public VkPipelineExecutableStatisticValueKHR _b32At(long index, MemorySegment src) { _b32At(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticValueKHR _b32(MemorySegment src) { return _b32At(0L, src); }
    public MemorySegment _i64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_i64, index), LAYOUT_i64); }
    public MemorySegment _i64() { return _i64At(0L); }
    public VkPipelineExecutableStatisticValueKHR _i64At(long index, MemorySegment src) { _i64At(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticValueKHR _i64(MemorySegment src) { return _i64At(0L, src); }
    public MemorySegment _u64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_u64, index), LAYOUT_u64); }
    public MemorySegment _u64() { return _u64At(0L); }
    public VkPipelineExecutableStatisticValueKHR _u64At(long index, MemorySegment src) { _u64At(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticValueKHR _u64(MemorySegment src) { return _u64At(0L, src); }
    public MemorySegment _f64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_f64, index), LAYOUT_f64); }
    public MemorySegment _f64() { return _f64At(0L); }
    public VkPipelineExecutableStatisticValueKHR _f64At(long index, MemorySegment src) { _f64At(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticValueKHR _f64(MemorySegment src) { return _f64At(0L, src); }
}
