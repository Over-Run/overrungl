// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceValueDataINTEL`.
/// ## Layout
/// ```
/// union VkPerformanceValueDataINTEL {
///     uint32_t value32;
///     uint64_t value64;
///     float valueFloat;
///     VkBool32 valueBool;
///     const char* valueString;
/// }
/// ```
public final class VkPerformanceValueDataINTEL extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("value32"),
        ValueLayout.JAVA_LONG.withName("value64"),
        ValueLayout.JAVA_FLOAT.withName("valueFloat"),
        ValueLayout.JAVA_INT.withName("valueBool"),
        ValueLayout.ADDRESS.withName("valueString")
    );
    public static final long OFFSET_value32 = LAYOUT.byteOffset(PathElement.groupElement("value32"));
    public static final long OFFSET_value64 = LAYOUT.byteOffset(PathElement.groupElement("value64"));
    public static final long OFFSET_valueFloat = LAYOUT.byteOffset(PathElement.groupElement("valueFloat"));
    public static final long OFFSET_valueBool = LAYOUT.byteOffset(PathElement.groupElement("valueBool"));
    public static final long OFFSET_valueString = LAYOUT.byteOffset(PathElement.groupElement("valueString"));
    public static final MemoryLayout LAYOUT_value32 = LAYOUT.select(PathElement.groupElement("value32"));
    public static final MemoryLayout LAYOUT_value64 = LAYOUT.select(PathElement.groupElement("value64"));
    public static final MemoryLayout LAYOUT_valueFloat = LAYOUT.select(PathElement.groupElement("valueFloat"));
    public static final MemoryLayout LAYOUT_valueBool = LAYOUT.select(PathElement.groupElement("valueBool"));
    public static final MemoryLayout LAYOUT_valueString = LAYOUT.select(PathElement.groupElement("valueString"));
    public static final VarHandle VH_value32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value32"));
    public static final VarHandle VH_value64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value64"));
    public static final VarHandle VH_valueFloat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueFloat"));
    public static final VarHandle VH_valueBool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueBool"));
    public static final VarHandle VH_valueString = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueString"));

    public VkPerformanceValueDataINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceValueDataINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceValueDataINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceValueDataINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceValueDataINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceValueDataINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceValueDataINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceValueDataINTEL(allocator.allocate(LAYOUT, count), count); }
    public VkPerformanceValueDataINTEL copyFrom(VkPerformanceValueDataINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceValueDataINTEL reinterpret(long count) { return new VkPerformanceValueDataINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceValueDataINTEL asSlice(long index) { return new VkPerformanceValueDataINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceValueDataINTEL asSlice(long index, long count) { return new VkPerformanceValueDataINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceValueDataINTEL at(long index, Consumer<VkPerformanceValueDataINTEL> func) { func.accept(asSlice(index)); return this; }
    public int value32At(long index) { return (int) VH_value32.get(this.segment(), 0L, index); }
    public long value64At(long index) { return (long) VH_value64.get(this.segment(), 0L, index); }
    public float valueFloatAt(long index) { return (float) VH_valueFloat.get(this.segment(), 0L, index); }
    public int valueBoolAt(long index) { return (int) VH_valueBool.get(this.segment(), 0L, index); }
    public MemorySegment valueStringAt(long index) { return (MemorySegment) VH_valueString.get(this.segment(), 0L, index); }
    public int value32() { return (int) VH_value32.get(this.segment(), 0L, 0L); }
    public long value64() { return (long) VH_value64.get(this.segment(), 0L, 0L); }
    public float valueFloat() { return (float) VH_valueFloat.get(this.segment(), 0L, 0L); }
    public int valueBool() { return (int) VH_valueBool.get(this.segment(), 0L, 0L); }
    public MemorySegment valueString() { return (MemorySegment) VH_valueString.get(this.segment(), 0L, 0L); }
    public VkPerformanceValueDataINTEL value32At(long index, int value) { VH_value32.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueDataINTEL value64At(long index, long value) { VH_value64.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueDataINTEL valueFloatAt(long index, float value) { VH_valueFloat.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueDataINTEL valueBoolAt(long index, int value) { VH_valueBool.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueDataINTEL valueStringAt(long index, MemorySegment value) { VH_valueString.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceValueDataINTEL value32(int value) { VH_value32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueDataINTEL value64(long value) { VH_value64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueDataINTEL valueFloat(float value) { VH_valueFloat.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueDataINTEL valueBool(int value) { VH_valueBool.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceValueDataINTEL valueString(MemorySegment value) { VH_valueString.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _value32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_value32, index), LAYOUT_value32); }
    public MemorySegment _value32() { return _value32At(0L); }
    public VkPerformanceValueDataINTEL _value32At(long index, MemorySegment src) { _value32At(index).copyFrom(src); return this; }
    public VkPerformanceValueDataINTEL _value32(MemorySegment src) { return _value32At(0L, src); }
    public MemorySegment _value64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_value64, index), LAYOUT_value64); }
    public MemorySegment _value64() { return _value64At(0L); }
    public VkPerformanceValueDataINTEL _value64At(long index, MemorySegment src) { _value64At(index).copyFrom(src); return this; }
    public VkPerformanceValueDataINTEL _value64(MemorySegment src) { return _value64At(0L, src); }
    public MemorySegment _valueFloatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_valueFloat, index), LAYOUT_valueFloat); }
    public MemorySegment _valueFloat() { return _valueFloatAt(0L); }
    public VkPerformanceValueDataINTEL _valueFloatAt(long index, MemorySegment src) { _valueFloatAt(index).copyFrom(src); return this; }
    public VkPerformanceValueDataINTEL _valueFloat(MemorySegment src) { return _valueFloatAt(0L, src); }
    public MemorySegment _valueBoolAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_valueBool, index), LAYOUT_valueBool); }
    public MemorySegment _valueBool() { return _valueBoolAt(0L); }
    public VkPerformanceValueDataINTEL _valueBoolAt(long index, MemorySegment src) { _valueBoolAt(index).copyFrom(src); return this; }
    public VkPerformanceValueDataINTEL _valueBool(MemorySegment src) { return _valueBoolAt(0L, src); }
    public MemorySegment _valueStringAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_valueString, index), LAYOUT_valueString); }
    public MemorySegment _valueString() { return _valueStringAt(0L); }
    public VkPerformanceValueDataINTEL _valueStringAt(long index, MemorySegment src) { _valueStringAt(index).copyFrom(src); return this; }
    public VkPerformanceValueDataINTEL _valueString(MemorySegment src) { return _valueStringAt(0L, src); }
}
