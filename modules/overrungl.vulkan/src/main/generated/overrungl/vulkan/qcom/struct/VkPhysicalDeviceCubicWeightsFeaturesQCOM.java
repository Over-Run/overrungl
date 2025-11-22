// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCubicWeightsFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCubicWeightsFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 selectableCubicWeights;
/// }
/// ```
public final class VkPhysicalDeviceCubicWeightsFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("selectableCubicWeights")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_selectableCubicWeights = LAYOUT.byteOffset(PathElement.groupElement("selectableCubicWeights"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_selectableCubicWeights = LAYOUT.select(PathElement.groupElement("selectableCubicWeights"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_selectableCubicWeights = LAYOUT.arrayElementVarHandle(PathElement.groupElement("selectableCubicWeights"));

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicWeightsFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicWeightsFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicWeightsFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMFilterCubicWeights.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM); }
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMFilterCubicWeights.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM copyFrom(VkPhysicalDeviceCubicWeightsFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceCubicWeightsFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int selectableCubicWeightsAt(long index) { return (int) VH_selectableCubicWeights.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int selectableCubicWeights() { return (int) VH_selectableCubicWeights.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM selectableCubicWeightsAt(long index, int value) { VH_selectableCubicWeights.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM selectableCubicWeights(int value) { VH_selectableCubicWeights.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _selectableCubicWeightsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_selectableCubicWeights, index), LAYOUT_selectableCubicWeights); }
    public MemorySegment _selectableCubicWeights() { return _selectableCubicWeightsAt(0L); }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM _selectableCubicWeightsAt(long index, MemorySegment src) { _selectableCubicWeightsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM _selectableCubicWeights(MemorySegment src) { return _selectableCubicWeightsAt(0L, src); }
}
