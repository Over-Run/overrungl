// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubgroupSizeControlProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubgroupSizeControlProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t minSubgroupSize;
///     uint32_t maxSubgroupSize;
///     uint32_t maxComputeWorkgroupSubgroups;
///     VkShaderStageFlags requiredSubgroupSizeStages;
/// }
/// ```
public final class VkPhysicalDeviceSubgroupSizeControlProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("minSubgroupSize"));
    public static final long OFFSET_maxSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxSubgroupSize"));
    public static final long OFFSET_maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    public static final long OFFSET_requiredSubgroupSizeStages = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSizeStages"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minSubgroupSize = LAYOUT.select(PathElement.groupElement("minSubgroupSize"));
    public static final MemoryLayout LAYOUT_maxSubgroupSize = LAYOUT.select(PathElement.groupElement("maxSubgroupSize"));
    public static final MemoryLayout LAYOUT_maxComputeWorkgroupSubgroups = LAYOUT.select(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    public static final MemoryLayout LAYOUT_requiredSubgroupSizeStages = LAYOUT.select(PathElement.groupElement("requiredSubgroupSizeStages"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSubgroupSize"));
    public static final VarHandle VH_maxSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubgroupSize"));
    public static final VarHandle VH_maxComputeWorkgroupSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    public static final VarHandle VH_requiredSubgroupSizeStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSizeStages"));

    public VkPhysicalDeviceSubgroupSizeControlProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupSizeControlProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES); }
    public static VkPhysicalDeviceSubgroupSizeControlProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceSubgroupSizeControlProperties copyFrom(VkPhysicalDeviceSubgroupSizeControlProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties reinterpret(long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSubgroupSizeControlProperties asSlice(long index) { return new VkPhysicalDeviceSubgroupSizeControlProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSubgroupSizeControlProperties asSlice(long index, long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSubgroupSizeControlProperties at(long index, Consumer<VkPhysicalDeviceSubgroupSizeControlProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minSubgroupSizeAt(long index) { return (int) VH_minSubgroupSize.get(this.segment(), 0L, index); }
    public int maxSubgroupSizeAt(long index) { return (int) VH_maxSubgroupSize.get(this.segment(), 0L, index); }
    public int maxComputeWorkgroupSubgroupsAt(long index) { return (int) VH_maxComputeWorkgroupSubgroups.get(this.segment(), 0L, index); }
    public int requiredSubgroupSizeStagesAt(long index) { return (int) VH_requiredSubgroupSizeStages.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minSubgroupSize() { return (int) VH_minSubgroupSize.get(this.segment(), 0L, 0L); }
    public int maxSubgroupSize() { return (int) VH_maxSubgroupSize.get(this.segment(), 0L, 0L); }
    public int maxComputeWorkgroupSubgroups() { return (int) VH_maxComputeWorkgroupSubgroups.get(this.segment(), 0L, 0L); }
    public int requiredSubgroupSizeStages() { return (int) VH_requiredSubgroupSizeStages.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSizeAt(long index, int value) { VH_minSubgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSizeAt(long index, int value) { VH_maxSubgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroupsAt(long index, int value) { VH_maxComputeWorkgroupSubgroups.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStagesAt(long index, int value) { VH_requiredSubgroupSizeStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSize(int value) { VH_minSubgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSize(int value) { VH_maxSubgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroups(int value) { VH_maxComputeWorkgroupSubgroups.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStages(int value) { VH_requiredSubgroupSizeStages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minSubgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSubgroupSize, index), LAYOUT_minSubgroupSize); }
    public MemorySegment _minSubgroupSize() { return _minSubgroupSizeAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties _minSubgroupSizeAt(long index, MemorySegment src) { _minSubgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties _minSubgroupSize(MemorySegment src) { return _minSubgroupSizeAt(0L, src); }
    public MemorySegment _maxSubgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSubgroupSize, index), LAYOUT_maxSubgroupSize); }
    public MemorySegment _maxSubgroupSize() { return _maxSubgroupSizeAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties _maxSubgroupSizeAt(long index, MemorySegment src) { _maxSubgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties _maxSubgroupSize(MemorySegment src) { return _maxSubgroupSizeAt(0L, src); }
    public MemorySegment _maxComputeWorkgroupSubgroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxComputeWorkgroupSubgroups, index), LAYOUT_maxComputeWorkgroupSubgroups); }
    public MemorySegment _maxComputeWorkgroupSubgroups() { return _maxComputeWorkgroupSubgroupsAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties _maxComputeWorkgroupSubgroupsAt(long index, MemorySegment src) { _maxComputeWorkgroupSubgroupsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties _maxComputeWorkgroupSubgroups(MemorySegment src) { return _maxComputeWorkgroupSubgroupsAt(0L, src); }
    public MemorySegment _requiredSubgroupSizeStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiredSubgroupSizeStages, index), LAYOUT_requiredSubgroupSizeStages); }
    public MemorySegment _requiredSubgroupSizeStages() { return _requiredSubgroupSizeStagesAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlProperties _requiredSubgroupSizeStagesAt(long index, MemorySegment src) { _requiredSubgroupSizeStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlProperties _requiredSubgroupSizeStages(MemorySegment src) { return _requiredSubgroupSizeStagesAt(0L, src); }
}
