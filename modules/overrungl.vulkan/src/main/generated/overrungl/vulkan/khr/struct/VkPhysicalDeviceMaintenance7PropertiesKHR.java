// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance7PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance7PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 robustFragmentShadingRateAttachmentAccess;
///     VkBool32 separateDepthStencilAttachmentAccess;
///     uint32_t maxDescriptorSetTotalUniformBuffersDynamic;
///     uint32_t maxDescriptorSetTotalStorageBuffersDynamic;
///     uint32_t maxDescriptorSetTotalBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalBuffersDynamic;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance7PropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustFragmentShadingRateAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_robustFragmentShadingRateAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    public static final long OFFSET_separateDepthStencilAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    public static final long OFFSET_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetTotalBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_robustFragmentShadingRateAttachmentAccess = LAYOUT.select(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    public static final MemoryLayout LAYOUT_separateDepthStencilAttachmentAccess = LAYOUT.select(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetTotalBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_robustFragmentShadingRateAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    public static final VarHandle VH_separateDepthStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    public static final VarHandle VH_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetTotalBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));

    public VkPhysicalDeviceMaintenance7PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR); }
    public static VkPhysicalDeviceMaintenance7PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceMaintenance7PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance7PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance7PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int robustFragmentShadingRateAttachmentAccessAt(long index) { return (int) VH_robustFragmentShadingRateAttachmentAccess.get(this.segment(), 0L, index); }
    public int separateDepthStencilAttachmentAccessAt(long index) { return (int) VH_separateDepthStencilAttachmentAccess.get(this.segment(), 0L, index); }
    public int maxDescriptorSetTotalUniformBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetTotalUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetTotalStorageBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetTotalStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetTotalBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetTotalBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int robustFragmentShadingRateAttachmentAccess() { return (int) VH_robustFragmentShadingRateAttachmentAccess.get(this.segment(), 0L, 0L); }
    public int separateDepthStencilAttachmentAccess() { return (int) VH_separateDepthStencilAttachmentAccess.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetTotalUniformBuffersDynamic() { return (int) VH_maxDescriptorSetTotalUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetTotalStorageBuffersDynamic() { return (int) VH_maxDescriptorSetTotalStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetTotalBuffersDynamic() { return (int) VH_maxDescriptorSetTotalBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccessAt(long index, int value) { VH_robustFragmentShadingRateAttachmentAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccessAt(long index, int value) { VH_separateDepthStencilAttachmentAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetTotalUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetTotalStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetTotalBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccess(int value) { VH_robustFragmentShadingRateAttachmentAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccess(int value) { VH_separateDepthStencilAttachmentAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamic(int value) { VH_maxDescriptorSetTotalUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamic(int value) { VH_maxDescriptorSetTotalStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamic(int value) { VH_maxDescriptorSetTotalBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _robustFragmentShadingRateAttachmentAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustFragmentShadingRateAttachmentAccess, index), LAYOUT_robustFragmentShadingRateAttachmentAccess); }
    public MemorySegment _robustFragmentShadingRateAttachmentAccess() { return _robustFragmentShadingRateAttachmentAccessAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _robustFragmentShadingRateAttachmentAccessAt(long index, MemorySegment src) { _robustFragmentShadingRateAttachmentAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _robustFragmentShadingRateAttachmentAccess(MemorySegment src) { return _robustFragmentShadingRateAttachmentAccessAt(0L, src); }
    public MemorySegment _separateDepthStencilAttachmentAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_separateDepthStencilAttachmentAccess, index), LAYOUT_separateDepthStencilAttachmentAccess); }
    public MemorySegment _separateDepthStencilAttachmentAccess() { return _separateDepthStencilAttachmentAccessAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _separateDepthStencilAttachmentAccessAt(long index, MemorySegment src) { _separateDepthStencilAttachmentAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _separateDepthStencilAttachmentAccess(MemorySegment src) { return _separateDepthStencilAttachmentAccessAt(0L, src); }
    public MemorySegment _maxDescriptorSetTotalUniformBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetTotalUniformBuffersDynamic, index), LAYOUT_maxDescriptorSetTotalUniformBuffersDynamic); }
    public MemorySegment _maxDescriptorSetTotalUniformBuffersDynamic() { return _maxDescriptorSetTotalUniformBuffersDynamicAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetTotalUniformBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetTotalUniformBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment src) { return _maxDescriptorSetTotalUniformBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetTotalStorageBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetTotalStorageBuffersDynamic, index), LAYOUT_maxDescriptorSetTotalStorageBuffersDynamic); }
    public MemorySegment _maxDescriptorSetTotalStorageBuffersDynamic() { return _maxDescriptorSetTotalStorageBuffersDynamicAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetTotalStorageBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetTotalStorageBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment src) { return _maxDescriptorSetTotalStorageBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetTotalBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetTotalBuffersDynamic, index), LAYOUT_maxDescriptorSetTotalBuffersDynamic); }
    public MemorySegment _maxDescriptorSetTotalBuffersDynamic() { return _maxDescriptorSetTotalBuffersDynamicAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetTotalBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetTotalBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetTotalBuffersDynamic(MemorySegment src) { return _maxDescriptorSetTotalBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(0L); }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance7PropertiesKHR _maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(0L, src); }
}
