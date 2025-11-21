// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkanMemoryModelFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkanMemoryModelFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 vulkanMemoryModel;
///     VkBool32 vulkanMemoryModelDeviceScope;
///     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
/// }
/// ```
public final class VkPhysicalDeviceVulkanMemoryModelFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vulkanMemoryModel = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
    public static final long OFFSET_vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    public static final long OFFSET_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vulkanMemoryModel = LAYOUT.select(PathElement.groupElement("vulkanMemoryModel"));
    public static final MemoryLayout LAYOUT_vulkanMemoryModelDeviceScope = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    public static final MemoryLayout LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));

    public VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVulkanMemoryModelFeatures copyFrom(VkPhysicalDeviceVulkanMemoryModelFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures reinterpret(long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures asSlice(long index) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures asSlice(long index, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures at(long index, Consumer<VkPhysicalDeviceVulkanMemoryModelFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vulkanMemoryModelAt(long index) { return (int) VH_vulkanMemoryModel.get(this.segment(), 0L, index); }
    public int vulkanMemoryModelDeviceScopeAt(long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(this.segment(), 0L, index); }
    public int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vulkanMemoryModel() { return (int) VH_vulkanMemoryModel.get(this.segment(), 0L, 0L); }
    public int vulkanMemoryModelDeviceScope() { return (int) VH_vulkanMemoryModelDeviceScope.get(this.segment(), 0L, 0L); }
    public int vulkanMemoryModelAvailabilityVisibilityChains() { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAt(long index, int value) { VH_vulkanMemoryModel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScopeAt(long index, int value) { VH_vulkanMemoryModelDeviceScope.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(int value) { VH_vulkanMemoryModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(int value) { VH_vulkanMemoryModelDeviceScope.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vulkanMemoryModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vulkanMemoryModel, index), LAYOUT_vulkanMemoryModel); }
    public MemorySegment _vulkanMemoryModel() { return _vulkanMemoryModelAt(0L); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _vulkanMemoryModelAt(long index, MemorySegment src) { _vulkanMemoryModelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _vulkanMemoryModel(MemorySegment src) { return _vulkanMemoryModelAt(0L, src); }
    public MemorySegment _vulkanMemoryModelDeviceScopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vulkanMemoryModelDeviceScope, index), LAYOUT_vulkanMemoryModelDeviceScope); }
    public MemorySegment _vulkanMemoryModelDeviceScope() { return _vulkanMemoryModelDeviceScopeAt(0L); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _vulkanMemoryModelDeviceScopeAt(long index, MemorySegment src) { _vulkanMemoryModelDeviceScopeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _vulkanMemoryModelDeviceScope(MemorySegment src) { return _vulkanMemoryModelDeviceScopeAt(0L, src); }
    public MemorySegment _vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vulkanMemoryModelAvailabilityVisibilityChains, index), LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains); }
    public MemorySegment _vulkanMemoryModelAvailabilityVisibilityChains() { return _vulkanMemoryModelAvailabilityVisibilityChainsAt(0L); }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, MemorySegment src) { _vulkanMemoryModelAvailabilityVisibilityChainsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkanMemoryModelFeatures _vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment src) { return _vulkanMemoryModelAvailabilityVisibilityChainsAt(0L, src); }
}
