// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t maxGeometryCount;
///     uint64_t maxInstanceCount;
///     uint64_t maxPrimitiveCount;
///     uint32_t maxPerStageDescriptorAccelerationStructures;
///     uint32_t maxPerStageDescriptorUpdateAfterBindAccelerationStructures;
///     uint32_t maxDescriptorSetAccelerationStructures;
///     uint32_t maxDescriptorSetUpdateAfterBindAccelerationStructures;
///     uint32_t minAccelerationStructureScratchOffsetAlignment;
/// }
/// ```
public final class VkPhysicalDeviceAccelerationStructurePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("maxGeometryCount"),
        ValueLayout.JAVA_LONG.withName("maxInstanceCount"),
        ValueLayout.JAVA_LONG.withName("maxPrimitiveCount"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxGeometryCount = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryCount"));
    public static final long OFFSET_maxInstanceCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceCount"));
    public static final long OFFSET_maxPrimitiveCount = LAYOUT.byteOffset(PathElement.groupElement("maxPrimitiveCount"));
    public static final long OFFSET_maxPerStageDescriptorAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    public static final long OFFSET_maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    public static final long OFFSET_minAccelerationStructureScratchOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxGeometryCount = LAYOUT.select(PathElement.groupElement("maxGeometryCount"));
    public static final MemoryLayout LAYOUT_maxInstanceCount = LAYOUT.select(PathElement.groupElement("maxInstanceCount"));
    public static final MemoryLayout LAYOUT_maxPrimitiveCount = LAYOUT.select(PathElement.groupElement("maxPrimitiveCount"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    public static final MemoryLayout LAYOUT_minAccelerationStructureScratchOffsetAlignment = LAYOUT.select(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryCount"));
    public static final VarHandle VH_maxInstanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceCount"));
    public static final VarHandle VH_maxPrimitiveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPrimitiveCount"));
    public static final VarHandle VH_maxPerStageDescriptorAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    public static final VarHandle VH_maxDescriptorSetAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    public static final VarHandle VH_minAccelerationStructureScratchOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR); }
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR copyFrom(VkPhysicalDeviceAccelerationStructurePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR at(long index, Consumer<VkPhysicalDeviceAccelerationStructurePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long maxGeometryCountAt(long index) { return (long) VH_maxGeometryCount.get(this.segment(), 0L, index); }
    public long maxInstanceCountAt(long index) { return (long) VH_maxInstanceCount.get(this.segment(), 0L, index); }
    public long maxPrimitiveCountAt(long index) { return (long) VH_maxPrimitiveCount.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorAccelerationStructuresAt(long index) { return (int) VH_maxPerStageDescriptorAccelerationStructures.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.get(this.segment(), 0L, index); }
    public int maxDescriptorSetAccelerationStructuresAt(long index) { return (int) VH_maxDescriptorSetAccelerationStructures.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.get(this.segment(), 0L, index); }
    public int minAccelerationStructureScratchOffsetAlignmentAt(long index) { return (int) VH_minAccelerationStructureScratchOffsetAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long maxGeometryCount() { return (long) VH_maxGeometryCount.get(this.segment(), 0L, 0L); }
    public long maxInstanceCount() { return (long) VH_maxInstanceCount.get(this.segment(), 0L, 0L); }
    public long maxPrimitiveCount() { return (long) VH_maxPrimitiveCount.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorAccelerationStructures() { return (int) VH_maxPerStageDescriptorAccelerationStructures.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return (int) VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetAccelerationStructures() { return (int) VH_maxDescriptorSetAccelerationStructures.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return (int) VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.get(this.segment(), 0L, 0L); }
    public int minAccelerationStructureScratchOffsetAlignment() { return (int) VH_minAccelerationStructureScratchOffsetAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxGeometryCountAt(long index, long value) { VH_maxGeometryCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxInstanceCountAt(long index, long value) { VH_maxInstanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPrimitiveCountAt(long index, long value) { VH_maxPrimitiveCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorAccelerationStructuresAt(long index, int value) { VH_maxPerStageDescriptorAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetAccelerationStructuresAt(long index, int value) { VH_maxDescriptorSetAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignmentAt(long index, int value) { VH_minAccelerationStructureScratchOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxGeometryCount(long value) { VH_maxGeometryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxInstanceCount(long value) { VH_maxInstanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPrimitiveCount(long value) { VH_maxPrimitiveCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorAccelerationStructures(int value) { VH_maxPerStageDescriptorAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorUpdateAfterBindAccelerationStructures(int value) { VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetAccelerationStructures(int value) { VH_maxDescriptorSetAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetUpdateAfterBindAccelerationStructures(int value) { VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignment(int value) { VH_minAccelerationStructureScratchOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxGeometryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryCount, index), LAYOUT_maxGeometryCount); }
    public MemorySegment _maxGeometryCount() { return _maxGeometryCountAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxGeometryCountAt(long index, MemorySegment src) { _maxGeometryCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxGeometryCount(MemorySegment src) { return _maxGeometryCountAt(0L, src); }
    public MemorySegment _maxInstanceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInstanceCount, index), LAYOUT_maxInstanceCount); }
    public MemorySegment _maxInstanceCount() { return _maxInstanceCountAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxInstanceCountAt(long index, MemorySegment src) { _maxInstanceCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxInstanceCount(MemorySegment src) { return _maxInstanceCountAt(0L, src); }
    public MemorySegment _maxPrimitiveCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPrimitiveCount, index), LAYOUT_maxPrimitiveCount); }
    public MemorySegment _maxPrimitiveCount() { return _maxPrimitiveCountAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxPrimitiveCountAt(long index, MemorySegment src) { _maxPrimitiveCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxPrimitiveCount(MemorySegment src) { return _maxPrimitiveCountAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorAccelerationStructures, index), LAYOUT_maxPerStageDescriptorAccelerationStructures); }
    public MemorySegment _maxPerStageDescriptorAccelerationStructures() { return _maxPerStageDescriptorAccelerationStructuresAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxPerStageDescriptorAccelerationStructuresAt(long index, MemorySegment src) { _maxPerStageDescriptorAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxPerStageDescriptorAccelerationStructures(MemorySegment src) { return _maxPerStageDescriptorAccelerationStructuresAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindAccelerationStructures, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindAccelerationStructures); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return _maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(0L, src); }
    public MemorySegment _maxDescriptorSetAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetAccelerationStructures, index), LAYOUT_maxDescriptorSetAccelerationStructures); }
    public MemorySegment _maxDescriptorSetAccelerationStructures() { return _maxDescriptorSetAccelerationStructuresAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxDescriptorSetAccelerationStructuresAt(long index, MemorySegment src) { _maxDescriptorSetAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxDescriptorSetAccelerationStructures(MemorySegment src) { return _maxDescriptorSetAccelerationStructuresAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindAccelerationStructures, index), LAYOUT_maxDescriptorSetUpdateAfterBindAccelerationStructures); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindAccelerationStructures() { return _maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(0L, src); }
    public MemorySegment _minAccelerationStructureScratchOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minAccelerationStructureScratchOffsetAlignment, index), LAYOUT_minAccelerationStructureScratchOffsetAlignment); }
    public MemorySegment _minAccelerationStructureScratchOffsetAlignment() { return _minAccelerationStructureScratchOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _minAccelerationStructureScratchOffsetAlignmentAt(long index, MemorySegment src) { _minAccelerationStructureScratchOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR _minAccelerationStructureScratchOffsetAlignment(MemorySegment src) { return _minAccelerationStructureScratchOffsetAlignmentAt(0L, src); }
}
