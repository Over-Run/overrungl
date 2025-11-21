// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeVectorPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeVectorPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkShaderStageFlags cooperativeVectorSupportedStages;
///     VkBool32 cooperativeVectorTrainingFloat16Accumulation;
///     VkBool32 cooperativeVectorTrainingFloat32Accumulation;
///     uint32_t maxCooperativeVectorComponents;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeVectorPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorSupportedStages"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTrainingFloat16Accumulation"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTrainingFloat32Accumulation"),
        ValueLayout.JAVA_INT.withName("maxCooperativeVectorComponents")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cooperativeVectorSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorSupportedStages"));
    public static final long OFFSET_cooperativeVectorTrainingFloat16Accumulation = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
    public static final long OFFSET_cooperativeVectorTrainingFloat32Accumulation = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
    public static final long OFFSET_maxCooperativeVectorComponents = LAYOUT.byteOffset(PathElement.groupElement("maxCooperativeVectorComponents"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cooperativeVectorSupportedStages = LAYOUT.select(PathElement.groupElement("cooperativeVectorSupportedStages"));
    public static final MemoryLayout LAYOUT_cooperativeVectorTrainingFloat16Accumulation = LAYOUT.select(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
    public static final MemoryLayout LAYOUT_cooperativeVectorTrainingFloat32Accumulation = LAYOUT.select(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
    public static final MemoryLayout LAYOUT_maxCooperativeVectorComponents = LAYOUT.select(PathElement.groupElement("maxCooperativeVectorComponents"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cooperativeVectorSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorSupportedStages"));
    public static final VarHandle VH_cooperativeVectorTrainingFloat16Accumulation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
    public static final VarHandle VH_cooperativeVectorTrainingFloat32Accumulation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
    public static final VarHandle VH_maxCooperativeVectorComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCooperativeVectorComponents"));

    public VkPhysicalDeviceCooperativeVectorPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV); }
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV copyFrom(VkPhysicalDeviceCooperativeVectorPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV at(long index, Consumer<VkPhysicalDeviceCooperativeVectorPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeVectorSupportedStagesAt(long index) { return (int) VH_cooperativeVectorSupportedStages.get(this.segment(), 0L, index); }
    public int cooperativeVectorTrainingFloat16AccumulationAt(long index) { return (int) VH_cooperativeVectorTrainingFloat16Accumulation.get(this.segment(), 0L, index); }
    public int cooperativeVectorTrainingFloat32AccumulationAt(long index) { return (int) VH_cooperativeVectorTrainingFloat32Accumulation.get(this.segment(), 0L, index); }
    public int maxCooperativeVectorComponentsAt(long index) { return (int) VH_maxCooperativeVectorComponents.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeVectorSupportedStages() { return (int) VH_cooperativeVectorSupportedStages.get(this.segment(), 0L, 0L); }
    public int cooperativeVectorTrainingFloat16Accumulation() { return (int) VH_cooperativeVectorTrainingFloat16Accumulation.get(this.segment(), 0L, 0L); }
    public int cooperativeVectorTrainingFloat32Accumulation() { return (int) VH_cooperativeVectorTrainingFloat32Accumulation.get(this.segment(), 0L, 0L); }
    public int maxCooperativeVectorComponents() { return (int) VH_maxCooperativeVectorComponents.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorSupportedStagesAt(long index, int value) { VH_cooperativeVectorSupportedStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat16AccumulationAt(long index, int value) { VH_cooperativeVectorTrainingFloat16Accumulation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat32AccumulationAt(long index, int value) { VH_cooperativeVectorTrainingFloat32Accumulation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV maxCooperativeVectorComponentsAt(long index, int value) { VH_maxCooperativeVectorComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorSupportedStages(int value) { VH_cooperativeVectorSupportedStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat16Accumulation(int value) { VH_cooperativeVectorTrainingFloat16Accumulation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat32Accumulation(int value) { VH_cooperativeVectorTrainingFloat32Accumulation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV maxCooperativeVectorComponents(int value) { VH_maxCooperativeVectorComponents.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeVectorSupportedStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeVectorSupportedStages, index), LAYOUT_cooperativeVectorSupportedStages); }
    public MemorySegment _cooperativeVectorSupportedStages() { return _cooperativeVectorSupportedStagesAt(0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _cooperativeVectorSupportedStagesAt(long index, MemorySegment src) { _cooperativeVectorSupportedStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _cooperativeVectorSupportedStages(MemorySegment src) { return _cooperativeVectorSupportedStagesAt(0L, src); }
    public MemorySegment _cooperativeVectorTrainingFloat16AccumulationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeVectorTrainingFloat16Accumulation, index), LAYOUT_cooperativeVectorTrainingFloat16Accumulation); }
    public MemorySegment _cooperativeVectorTrainingFloat16Accumulation() { return _cooperativeVectorTrainingFloat16AccumulationAt(0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _cooperativeVectorTrainingFloat16AccumulationAt(long index, MemorySegment src) { _cooperativeVectorTrainingFloat16AccumulationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _cooperativeVectorTrainingFloat16Accumulation(MemorySegment src) { return _cooperativeVectorTrainingFloat16AccumulationAt(0L, src); }
    public MemorySegment _cooperativeVectorTrainingFloat32AccumulationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeVectorTrainingFloat32Accumulation, index), LAYOUT_cooperativeVectorTrainingFloat32Accumulation); }
    public MemorySegment _cooperativeVectorTrainingFloat32Accumulation() { return _cooperativeVectorTrainingFloat32AccumulationAt(0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _cooperativeVectorTrainingFloat32AccumulationAt(long index, MemorySegment src) { _cooperativeVectorTrainingFloat32AccumulationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _cooperativeVectorTrainingFloat32Accumulation(MemorySegment src) { return _cooperativeVectorTrainingFloat32AccumulationAt(0L, src); }
    public MemorySegment _maxCooperativeVectorComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCooperativeVectorComponents, index), LAYOUT_maxCooperativeVectorComponents); }
    public MemorySegment _maxCooperativeVectorComponents() { return _maxCooperativeVectorComponentsAt(0L); }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _maxCooperativeVectorComponentsAt(long index, MemorySegment src) { _maxCooperativeVectorComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorPropertiesNV _maxCooperativeVectorComponents(MemorySegment src) { return _maxCooperativeVectorComponentsAt(0L, src); }
}
