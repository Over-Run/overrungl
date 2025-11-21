// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubgroupProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubgroupProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t subgroupSize;
///     VkShaderStageFlags supportedStages;
///     VkSubgroupFeatureFlags supportedOperations;
///     VkBool32 quadOperationsInAllStages;
/// }
/// ```
public final class VkPhysicalDeviceSubgroupProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("supportedStages"),
        ValueLayout.JAVA_INT.withName("supportedOperations"),
        ValueLayout.JAVA_INT.withName("quadOperationsInAllStages")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subgroupSize = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
    public static final long OFFSET_supportedStages = LAYOUT.byteOffset(PathElement.groupElement("supportedStages"));
    public static final long OFFSET_supportedOperations = LAYOUT.byteOffset(PathElement.groupElement("supportedOperations"));
    public static final long OFFSET_quadOperationsInAllStages = LAYOUT.byteOffset(PathElement.groupElement("quadOperationsInAllStages"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subgroupSize = LAYOUT.select(PathElement.groupElement("subgroupSize"));
    public static final MemoryLayout LAYOUT_supportedStages = LAYOUT.select(PathElement.groupElement("supportedStages"));
    public static final MemoryLayout LAYOUT_supportedOperations = LAYOUT.select(PathElement.groupElement("supportedOperations"));
    public static final MemoryLayout LAYOUT_quadOperationsInAllStages = LAYOUT.select(PathElement.groupElement("quadOperationsInAllStages"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));
    public static final VarHandle VH_supportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStages"));
    public static final VarHandle VH_supportedOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedOperations"));
    public static final VarHandle VH_quadOperationsInAllStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadOperationsInAllStages"));

    public VkPhysicalDeviceSubgroupProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSubgroupProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSubgroupProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSubgroupProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSubgroupProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSubgroupProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSubgroupProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES); }
    public static VkPhysicalDeviceSubgroupProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceSubgroupProperties copyFrom(VkPhysicalDeviceSubgroupProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSubgroupProperties reinterpret(long count) { return new VkPhysicalDeviceSubgroupProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSubgroupProperties asSlice(long index) { return new VkPhysicalDeviceSubgroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSubgroupProperties asSlice(long index, long count) { return new VkPhysicalDeviceSubgroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSubgroupProperties at(long index, Consumer<VkPhysicalDeviceSubgroupProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int subgroupSizeAt(long index) { return (int) VH_subgroupSize.get(this.segment(), 0L, index); }
    public int supportedStagesAt(long index) { return (int) VH_supportedStages.get(this.segment(), 0L, index); }
    public int supportedOperationsAt(long index) { return (int) VH_supportedOperations.get(this.segment(), 0L, index); }
    public int quadOperationsInAllStagesAt(long index) { return (int) VH_quadOperationsInAllStages.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int subgroupSize() { return (int) VH_subgroupSize.get(this.segment(), 0L, 0L); }
    public int supportedStages() { return (int) VH_supportedStages.get(this.segment(), 0L, 0L); }
    public int supportedOperations() { return (int) VH_supportedOperations.get(this.segment(), 0L, 0L); }
    public int quadOperationsInAllStages() { return (int) VH_quadOperationsInAllStages.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSubgroupProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupProperties subgroupSizeAt(long index, int value) { VH_subgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupProperties supportedStagesAt(long index, int value) { VH_supportedStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupProperties supportedOperationsAt(long index, int value) { VH_supportedOperations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStagesAt(long index, int value) { VH_quadOperationsInAllStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupProperties subgroupSize(int value) { VH_subgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupProperties supportedStages(int value) { VH_supportedStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupProperties supportedOperations(int value) { VH_supportedOperations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStages(int value) { VH_quadOperationsInAllStages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSubgroupProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSubgroupProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSize, index), LAYOUT_subgroupSize); }
    public MemorySegment _subgroupSize() { return _subgroupSizeAt(0L); }
    public VkPhysicalDeviceSubgroupProperties _subgroupSizeAt(long index, MemorySegment src) { _subgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupProperties _subgroupSize(MemorySegment src) { return _subgroupSizeAt(0L, src); }
    public MemorySegment _supportedStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedStages, index), LAYOUT_supportedStages); }
    public MemorySegment _supportedStages() { return _supportedStagesAt(0L); }
    public VkPhysicalDeviceSubgroupProperties _supportedStagesAt(long index, MemorySegment src) { _supportedStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupProperties _supportedStages(MemorySegment src) { return _supportedStagesAt(0L, src); }
    public MemorySegment _supportedOperationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedOperations, index), LAYOUT_supportedOperations); }
    public MemorySegment _supportedOperations() { return _supportedOperationsAt(0L); }
    public VkPhysicalDeviceSubgroupProperties _supportedOperationsAt(long index, MemorySegment src) { _supportedOperationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupProperties _supportedOperations(MemorySegment src) { return _supportedOperationsAt(0L, src); }
    public MemorySegment _quadOperationsInAllStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quadOperationsInAllStages, index), LAYOUT_quadOperationsInAllStages); }
    public MemorySegment _quadOperationsInAllStages() { return _quadOperationsInAllStagesAt(0L); }
    public VkPhysicalDeviceSubgroupProperties _quadOperationsInAllStagesAt(long index, MemorySegment src) { _quadOperationsInAllStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupProperties _quadOperationsInAllStages(MemorySegment src) { return _quadOperationsInAllStagesAt(0L, src); }
}
