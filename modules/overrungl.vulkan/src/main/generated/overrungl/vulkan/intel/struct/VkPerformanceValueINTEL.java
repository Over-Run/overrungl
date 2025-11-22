// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceValueINTEL`.
/// ## Layout
/// ```
/// struct VkPerformanceValueINTEL {
///     VkPerformanceValueTypeINTEL type;
///     VkPerformanceValueDataINTEL data;
/// }
/// ```
public final class VkPerformanceValueINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.intel.union.VkPerformanceValueDataINTEL.LAYOUT.withName("data")
    );
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_data$value32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("value32"));
    public static final VarHandle VH_data$value64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("value64"));
    public static final VarHandle VH_data$valueFloat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("valueFloat"));
    public static final VarHandle VH_data$valueBool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("valueBool"));
    public static final VarHandle VH_data$valueString = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("valueString"));

    public VkPerformanceValueINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceValueINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceValueINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceValueINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceValueINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceValueINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceValueINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceValueINTEL(allocator.allocate(LAYOUT, count), count); }
    public VkPerformanceValueINTEL copyFrom(VkPerformanceValueINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceValueINTEL reinterpret(long count) { return new VkPerformanceValueINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceValueINTEL asSlice(long index) { return new VkPerformanceValueINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceValueINTEL asSlice(long index, long count) { return new VkPerformanceValueINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceValueINTEL at(long index, Consumer<VkPerformanceValueINTEL> func) { func.accept(asSlice(index)); return this; }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int data$value32At(long index) { return (int) VH_data$value32.get(this.segment(), 0L, index); }
    public long data$value64At(long index) { return (long) VH_data$value64.get(this.segment(), 0L, index); }
    public float data$valueFloatAt(long index) { return (float) VH_data$valueFloat.get(this.segment(), 0L, index); }
    public int data$valueBoolAt(long index) { return (int) VH_data$valueBool.get(this.segment(), 0L, index); }
    public MemorySegment data$valueStringAt(long index) { return (MemorySegment) VH_data$valueString.get(this.segment(), 0L, index); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int data$value32() { return (int) VH_data$value32.get(this.segment(), 0L, 0L); }
    public long data$value64() { return (long) VH_data$value64.get(this.segment(), 0L, 0L); }
    public float data$valueFloat() { return (float) VH_data$valueFloat.get(this.segment(), 0L, 0L); }
    public int data$valueBool() { return (int) VH_data$valueBool.get(this.segment(), 0L, 0L); }
    public MemorySegment data$valueString() { return (MemorySegment) VH_data$valueString.get(this.segment(), 0L, 0L); }
    public VkPerformanceValueINTEL typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueINTEL data$value32At(long index, int value) { VH_data$value32.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueINTEL data$value64At(long index, long value) { VH_data$value64.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueINTEL data$valueFloatAt(long index, float value) { VH_data$valueFloat.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueINTEL data$valueBoolAt(long index, int value) { VH_data$valueBool.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueINTEL data$valueStringAt(long index, MemorySegment value) { VH_data$valueString.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueINTEL type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueINTEL data$value32(int value) { VH_data$value32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueINTEL data$value64(long value) { VH_data$value64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueINTEL data$valueFloat(float value) { VH_data$valueFloat.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueINTEL data$valueBool(int value) { VH_data$valueBool.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueINTEL data$valueString(MemorySegment value) { VH_data$valueString.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkPerformanceValueINTEL _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkPerformanceValueINTEL _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkPerformanceValueINTEL _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkPerformanceValueINTEL _data(MemorySegment src) { return _dataAt(0L, src); }
}
