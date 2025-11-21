// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDataGraphFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 dataGraph;
///     VkBool32 dataGraphUpdateAfterBind;
///     VkBool32 dataGraphSpecializationConstants;
///     VkBool32 dataGraphDescriptorBuffer;
///     VkBool32 dataGraphShaderModule;
/// }
/// ```
public final class VkPhysicalDeviceDataGraphFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataGraph"),
        ValueLayout.JAVA_INT.withName("dataGraphUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("dataGraphSpecializationConstants"),
        ValueLayout.JAVA_INT.withName("dataGraphDescriptorBuffer"),
        ValueLayout.JAVA_INT.withName("dataGraphShaderModule")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dataGraph = LAYOUT.byteOffset(PathElement.groupElement("dataGraph"));
    public static final long OFFSET_dataGraphUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("dataGraphUpdateAfterBind"));
    public static final long OFFSET_dataGraphSpecializationConstants = LAYOUT.byteOffset(PathElement.groupElement("dataGraphSpecializationConstants"));
    public static final long OFFSET_dataGraphDescriptorBuffer = LAYOUT.byteOffset(PathElement.groupElement("dataGraphDescriptorBuffer"));
    public static final long OFFSET_dataGraphShaderModule = LAYOUT.byteOffset(PathElement.groupElement("dataGraphShaderModule"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dataGraph = LAYOUT.select(PathElement.groupElement("dataGraph"));
    public static final MemoryLayout LAYOUT_dataGraphUpdateAfterBind = LAYOUT.select(PathElement.groupElement("dataGraphUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_dataGraphSpecializationConstants = LAYOUT.select(PathElement.groupElement("dataGraphSpecializationConstants"));
    public static final MemoryLayout LAYOUT_dataGraphDescriptorBuffer = LAYOUT.select(PathElement.groupElement("dataGraphDescriptorBuffer"));
    public static final MemoryLayout LAYOUT_dataGraphShaderModule = LAYOUT.select(PathElement.groupElement("dataGraphShaderModule"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dataGraph = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraph"));
    public static final VarHandle VH_dataGraphUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphUpdateAfterBind"));
    public static final VarHandle VH_dataGraphSpecializationConstants = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphSpecializationConstants"));
    public static final VarHandle VH_dataGraphDescriptorBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphDescriptorBuffer"));
    public static final VarHandle VH_dataGraphShaderModule = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphShaderModule"));

    public VkPhysicalDeviceDataGraphFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDataGraphFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDataGraphFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDataGraphFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDataGraphFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDataGraphFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDataGraphFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM); }
    public static VkPhysicalDeviceDataGraphFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDeviceDataGraphFeaturesARM copyFrom(VkPhysicalDeviceDataGraphFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceDataGraphFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDataGraphFeaturesARM asSlice(long index) { return new VkPhysicalDeviceDataGraphFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDataGraphFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDataGraphFeaturesARM at(long index, Consumer<VkPhysicalDeviceDataGraphFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dataGraphAt(long index) { return (int) VH_dataGraph.get(this.segment(), 0L, index); }
    public int dataGraphUpdateAfterBindAt(long index) { return (int) VH_dataGraphUpdateAfterBind.get(this.segment(), 0L, index); }
    public int dataGraphSpecializationConstantsAt(long index) { return (int) VH_dataGraphSpecializationConstants.get(this.segment(), 0L, index); }
    public int dataGraphDescriptorBufferAt(long index) { return (int) VH_dataGraphDescriptorBuffer.get(this.segment(), 0L, index); }
    public int dataGraphShaderModuleAt(long index) { return (int) VH_dataGraphShaderModule.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dataGraph() { return (int) VH_dataGraph.get(this.segment(), 0L, 0L); }
    public int dataGraphUpdateAfterBind() { return (int) VH_dataGraphUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int dataGraphSpecializationConstants() { return (int) VH_dataGraphSpecializationConstants.get(this.segment(), 0L, 0L); }
    public int dataGraphDescriptorBuffer() { return (int) VH_dataGraphDescriptorBuffer.get(this.segment(), 0L, 0L); }
    public int dataGraphShaderModule() { return (int) VH_dataGraphShaderModule.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphAt(long index, int value) { VH_dataGraph.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBindAt(long index, int value) { VH_dataGraphUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstantsAt(long index, int value) { VH_dataGraphSpecializationConstants.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBufferAt(long index, int value) { VH_dataGraphDescriptorBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModuleAt(long index, int value) { VH_dataGraphShaderModule.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraph(int value) { VH_dataGraph.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBind(int value) { VH_dataGraphUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstants(int value) { VH_dataGraphSpecializationConstants.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBuffer(int value) { VH_dataGraphDescriptorBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModule(int value) { VH_dataGraphShaderModule.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dataGraphAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraph, index), LAYOUT_dataGraph); }
    public MemorySegment _dataGraph() { return _dataGraphAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphAt(long index, MemorySegment src) { _dataGraphAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraph(MemorySegment src) { return _dataGraphAt(0L, src); }
    public MemorySegment _dataGraphUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphUpdateAfterBind, index), LAYOUT_dataGraphUpdateAfterBind); }
    public MemorySegment _dataGraphUpdateAfterBind() { return _dataGraphUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphUpdateAfterBindAt(long index, MemorySegment src) { _dataGraphUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphUpdateAfterBind(MemorySegment src) { return _dataGraphUpdateAfterBindAt(0L, src); }
    public MemorySegment _dataGraphSpecializationConstantsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphSpecializationConstants, index), LAYOUT_dataGraphSpecializationConstants); }
    public MemorySegment _dataGraphSpecializationConstants() { return _dataGraphSpecializationConstantsAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphSpecializationConstantsAt(long index, MemorySegment src) { _dataGraphSpecializationConstantsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphSpecializationConstants(MemorySegment src) { return _dataGraphSpecializationConstantsAt(0L, src); }
    public MemorySegment _dataGraphDescriptorBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphDescriptorBuffer, index), LAYOUT_dataGraphDescriptorBuffer); }
    public MemorySegment _dataGraphDescriptorBuffer() { return _dataGraphDescriptorBufferAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphDescriptorBufferAt(long index, MemorySegment src) { _dataGraphDescriptorBufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphDescriptorBuffer(MemorySegment src) { return _dataGraphDescriptorBufferAt(0L, src); }
    public MemorySegment _dataGraphShaderModuleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphShaderModule, index), LAYOUT_dataGraphShaderModule); }
    public MemorySegment _dataGraphShaderModule() { return _dataGraphShaderModuleAt(0L); }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphShaderModuleAt(long index, MemorySegment src) { _dataGraphShaderModuleAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphFeaturesARM _dataGraphShaderModule(MemorySegment src) { return _dataGraphShaderModuleAt(0L, src); }
}
