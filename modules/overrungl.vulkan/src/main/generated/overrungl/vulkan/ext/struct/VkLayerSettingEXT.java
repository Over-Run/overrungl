// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLayerSettingEXT`.
/// ## Layout
/// ```
/// struct VkLayerSettingEXT {
///     const char* pLayerName;
///     const char* pSettingName;
///     VkLayerSettingTypeEXT type;
///     uint32_t valueCount;
///     const void* pValues;
/// }
/// ```
public final class VkLayerSettingEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pLayerName"),
        ValueLayout.ADDRESS.withName("pSettingName"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("valueCount"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    public static final long OFFSET_pLayerName = LAYOUT.byteOffset(PathElement.groupElement("pLayerName"));
    public static final long OFFSET_pSettingName = LAYOUT.byteOffset(PathElement.groupElement("pSettingName"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_valueCount = LAYOUT.byteOffset(PathElement.groupElement("valueCount"));
    public static final long OFFSET_pValues = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
    public static final MemoryLayout LAYOUT_pLayerName = LAYOUT.select(PathElement.groupElement("pLayerName"));
    public static final MemoryLayout LAYOUT_pSettingName = LAYOUT.select(PathElement.groupElement("pSettingName"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_valueCount = LAYOUT.select(PathElement.groupElement("valueCount"));
    public static final MemoryLayout LAYOUT_pValues = LAYOUT.select(PathElement.groupElement("pValues"));
    public static final VarHandle VH_pLayerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayerName"));
    public static final VarHandle VH_pSettingName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSettingName"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_valueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueCount"));
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    public VkLayerSettingEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLayerSettingEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkLayerSettingEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLayerSettingEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLayerSettingEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingEXT(allocator.allocate(LAYOUT), 1); }
    public static VkLayerSettingEXT alloc(SegmentAllocator allocator, long count) { return new VkLayerSettingEXT(allocator.allocate(LAYOUT, count), count); }
    public VkLayerSettingEXT copyFrom(VkLayerSettingEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLayerSettingEXT reinterpret(long count) { return new VkLayerSettingEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLayerSettingEXT asSlice(long index) { return new VkLayerSettingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLayerSettingEXT asSlice(long index, long count) { return new VkLayerSettingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLayerSettingEXT at(long index, Consumer<VkLayerSettingEXT> func) { func.accept(asSlice(index)); return this; }
    public MemorySegment pLayerNameAt(long index) { return (MemorySegment) VH_pLayerName.get(this.segment(), 0L, index); }
    public MemorySegment pSettingNameAt(long index) { return (MemorySegment) VH_pSettingName.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int valueCountAt(long index) { return (int) VH_valueCount.get(this.segment(), 0L, index); }
    public MemorySegment pValuesAt(long index) { return (MemorySegment) VH_pValues.get(this.segment(), 0L, index); }
    public MemorySegment pLayerName() { return (MemorySegment) VH_pLayerName.get(this.segment(), 0L, 0L); }
    public MemorySegment pSettingName() { return (MemorySegment) VH_pSettingName.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int valueCount() { return (int) VH_valueCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pValues() { return (MemorySegment) VH_pValues.get(this.segment(), 0L, 0L); }
    public VkLayerSettingEXT pLayerNameAt(long index, MemorySegment value) { VH_pLayerName.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingEXT pSettingNameAt(long index, MemorySegment value) { VH_pSettingName.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingEXT valueCountAt(long index, int value) { VH_valueCount.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingEXT pValuesAt(long index, MemorySegment value) { VH_pValues.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingEXT pLayerName(MemorySegment value) { VH_pLayerName.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingEXT pSettingName(MemorySegment value) { VH_pSettingName.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingEXT valueCount(int value) { VH_valueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingEXT pValues(MemorySegment value) { VH_pValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pLayerNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLayerName, index), LAYOUT_pLayerName); }
    public MemorySegment _pLayerName() { return _pLayerNameAt(0L); }
    public VkLayerSettingEXT _pLayerNameAt(long index, MemorySegment src) { _pLayerNameAt(index).copyFrom(src); return this; }
    public VkLayerSettingEXT _pLayerName(MemorySegment src) { return _pLayerNameAt(0L, src); }
    public MemorySegment _pSettingNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSettingName, index), LAYOUT_pSettingName); }
    public MemorySegment _pSettingName() { return _pSettingNameAt(0L); }
    public VkLayerSettingEXT _pSettingNameAt(long index, MemorySegment src) { _pSettingNameAt(index).copyFrom(src); return this; }
    public VkLayerSettingEXT _pSettingName(MemorySegment src) { return _pSettingNameAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkLayerSettingEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkLayerSettingEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _valueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_valueCount, index), LAYOUT_valueCount); }
    public MemorySegment _valueCount() { return _valueCountAt(0L); }
    public VkLayerSettingEXT _valueCountAt(long index, MemorySegment src) { _valueCountAt(index).copyFrom(src); return this; }
    public VkLayerSettingEXT _valueCount(MemorySegment src) { return _valueCountAt(0L, src); }
    public MemorySegment _pValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pValues, index), LAYOUT_pValues); }
    public MemorySegment _pValues() { return _pValuesAt(0L); }
    public VkLayerSettingEXT _pValuesAt(long index, MemorySegment src) { _pValuesAt(index).copyFrom(src); return this; }
    public VkLayerSettingEXT _pValues(MemorySegment src) { return _pValuesAt(0L, src); }
}
