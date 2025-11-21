// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDataGraphModelFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphModelFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 dataGraphModel;
/// }
/// ```
public final class VkPhysicalDeviceDataGraphModelFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataGraphModel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dataGraphModel = LAYOUT.byteOffset(PathElement.groupElement("dataGraphModel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dataGraphModel = LAYOUT.select(PathElement.groupElement("dataGraphModel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dataGraphModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphModel"));

    public VkPhysicalDeviceDataGraphModelFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphModelFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphModelFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphModelFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMDataGraphModel.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM); }
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMDataGraphModel.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM copyFrom(VkPhysicalDeviceDataGraphModelFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceDataGraphModelFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dataGraphModelAt(long index) { return (int) VH_dataGraphModel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dataGraphModel() { return (int) VH_dataGraphModel.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM dataGraphModelAt(long index, int value) { VH_dataGraphModel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM dataGraphModel(int value) { VH_dataGraphModel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dataGraphModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphModel, index), LAYOUT_dataGraphModel); }
    public MemorySegment _dataGraphModel() { return _dataGraphModelAt(0L); }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM _dataGraphModelAt(long index, MemorySegment src) { _dataGraphModelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM _dataGraphModel(MemorySegment src) { return _dataGraphModelAt(0L, src); }
}
