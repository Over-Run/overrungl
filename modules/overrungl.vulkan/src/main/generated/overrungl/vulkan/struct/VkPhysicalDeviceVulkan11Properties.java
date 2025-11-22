// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan11Properties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan11Properties {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t deviceUUID[VK_UUID_SIZE];
///     uint8_t driverUUID[VK_UUID_SIZE];
///     uint8_t deviceLUID[VK_LUID_SIZE];
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
///     uint32_t subgroupSize;
///     VkShaderStageFlags subgroupSupportedStages;
///     VkSubgroupFeatureFlags subgroupSupportedOperations;
///     VkBool32 subgroupQuadOperationsInAllStages;
///     VkPointClippingBehavior pointClippingBehavior;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
///     VkBool32 protectedNoFault;
///     uint32_t maxPerSetDescriptors;
///     VkDeviceSize maxMemoryAllocationSize;
/// }
/// ```
public final class VkPhysicalDeviceVulkan11Properties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK11.VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedStages"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedOperations"),
        ValueLayout.JAVA_INT.withName("subgroupQuadOperationsInAllStages"),
        ValueLayout.JAVA_INT.withName("pointClippingBehavior"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex"),
        ValueLayout.JAVA_INT.withName("protectedNoFault"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceUUID = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
    public static final long OFFSET_driverUUID = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
    public static final long OFFSET_deviceLUID = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
    public static final long OFFSET_deviceNodeMask = LAYOUT.byteOffset(PathElement.groupElement("deviceNodeMask"));
    public static final long OFFSET_deviceLUIDValid = LAYOUT.byteOffset(PathElement.groupElement("deviceLUIDValid"));
    public static final long OFFSET_subgroupSize = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
    public static final long OFFSET_subgroupSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("subgroupSupportedStages"));
    public static final long OFFSET_subgroupSupportedOperations = LAYOUT.byteOffset(PathElement.groupElement("subgroupSupportedOperations"));
    public static final long OFFSET_subgroupQuadOperationsInAllStages = LAYOUT.byteOffset(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    public static final long OFFSET_pointClippingBehavior = LAYOUT.byteOffset(PathElement.groupElement("pointClippingBehavior"));
    public static final long OFFSET_maxMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
    public static final long OFFSET_maxMultiviewInstanceIndex = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
    public static final long OFFSET_protectedNoFault = LAYOUT.byteOffset(PathElement.groupElement("protectedNoFault"));
    public static final long OFFSET_maxPerSetDescriptors = LAYOUT.byteOffset(PathElement.groupElement("maxPerSetDescriptors"));
    public static final long OFFSET_maxMemoryAllocationSize = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceUUID = LAYOUT.select(PathElement.groupElement("deviceUUID"));
    public static final MemoryLayout LAYOUT_driverUUID = LAYOUT.select(PathElement.groupElement("driverUUID"));
    public static final MemoryLayout LAYOUT_deviceLUID = LAYOUT.select(PathElement.groupElement("deviceLUID"));
    public static final MemoryLayout LAYOUT_deviceNodeMask = LAYOUT.select(PathElement.groupElement("deviceNodeMask"));
    public static final MemoryLayout LAYOUT_deviceLUIDValid = LAYOUT.select(PathElement.groupElement("deviceLUIDValid"));
    public static final MemoryLayout LAYOUT_subgroupSize = LAYOUT.select(PathElement.groupElement("subgroupSize"));
    public static final MemoryLayout LAYOUT_subgroupSupportedStages = LAYOUT.select(PathElement.groupElement("subgroupSupportedStages"));
    public static final MemoryLayout LAYOUT_subgroupSupportedOperations = LAYOUT.select(PathElement.groupElement("subgroupSupportedOperations"));
    public static final MemoryLayout LAYOUT_subgroupQuadOperationsInAllStages = LAYOUT.select(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    public static final MemoryLayout LAYOUT_pointClippingBehavior = LAYOUT.select(PathElement.groupElement("pointClippingBehavior"));
    public static final MemoryLayout LAYOUT_maxMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMultiviewViewCount"));
    public static final MemoryLayout LAYOUT_maxMultiviewInstanceIndex = LAYOUT.select(PathElement.groupElement("maxMultiviewInstanceIndex"));
    public static final MemoryLayout LAYOUT_protectedNoFault = LAYOUT.select(PathElement.groupElement("protectedNoFault"));
    public static final MemoryLayout LAYOUT_maxPerSetDescriptors = LAYOUT.select(PathElement.groupElement("maxPerSetDescriptors"));
    public static final MemoryLayout LAYOUT_maxMemoryAllocationSize = LAYOUT.select(PathElement.groupElement("maxMemoryAllocationSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_driverUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_deviceLUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
    public static final VarHandle VH_deviceNodeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNodeMask"));
    public static final VarHandle VH_deviceLUIDValid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUIDValid"));
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));
    public static final VarHandle VH_subgroupSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSupportedStages"));
    public static final VarHandle VH_subgroupSupportedOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSupportedOperations"));
    public static final VarHandle VH_subgroupQuadOperationsInAllStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    public static final VarHandle VH_pointClippingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointClippingBehavior"));
    public static final VarHandle VH_maxMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount"));
    public static final VarHandle VH_maxMultiviewInstanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));
    public static final VarHandle VH_protectedNoFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedNoFault"));
    public static final VarHandle VH_maxPerSetDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerSetDescriptors"));
    public static final VarHandle VH_maxMemoryAllocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationSize"));

    public VkPhysicalDeviceVulkan11Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan11Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Properties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan11Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan11Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan11Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan11Properties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan11Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan11Properties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan11Properties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES); }
    public static VkPhysicalDeviceVulkan11Properties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceVulkan11Properties copyFrom(VkPhysicalDeviceVulkan11Properties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan11Properties reinterpret(long count) { return new VkPhysicalDeviceVulkan11Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan11Properties asSlice(long index) { return new VkPhysicalDeviceVulkan11Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan11Properties asSlice(long index, long count) { return new VkPhysicalDeviceVulkan11Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan11Properties at(long index, Consumer<VkPhysicalDeviceVulkan11Properties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte deviceUUIDAt(long index, long index0) { return (byte) VH_deviceUUID.get(this.segment(), 0L, index, index0); }
    public byte driverUUIDAt(long index, long index0) { return (byte) VH_driverUUID.get(this.segment(), 0L, index, index0); }
    public byte deviceLUIDAt(long index, long index0) { return (byte) VH_deviceLUID.get(this.segment(), 0L, index, index0); }
    public int deviceNodeMaskAt(long index) { return (int) VH_deviceNodeMask.get(this.segment(), 0L, index); }
    public int deviceLUIDValidAt(long index) { return (int) VH_deviceLUIDValid.get(this.segment(), 0L, index); }
    public int subgroupSizeAt(long index) { return (int) VH_subgroupSize.get(this.segment(), 0L, index); }
    public int subgroupSupportedStagesAt(long index) { return (int) VH_subgroupSupportedStages.get(this.segment(), 0L, index); }
    public int subgroupSupportedOperationsAt(long index) { return (int) VH_subgroupSupportedOperations.get(this.segment(), 0L, index); }
    public int subgroupQuadOperationsInAllStagesAt(long index) { return (int) VH_subgroupQuadOperationsInAllStages.get(this.segment(), 0L, index); }
    public int pointClippingBehaviorAt(long index) { return (int) VH_pointClippingBehavior.get(this.segment(), 0L, index); }
    public int maxMultiviewViewCountAt(long index) { return (int) VH_maxMultiviewViewCount.get(this.segment(), 0L, index); }
    public int maxMultiviewInstanceIndexAt(long index) { return (int) VH_maxMultiviewInstanceIndex.get(this.segment(), 0L, index); }
    public int protectedNoFaultAt(long index) { return (int) VH_protectedNoFault.get(this.segment(), 0L, index); }
    public int maxPerSetDescriptorsAt(long index) { return (int) VH_maxPerSetDescriptors.get(this.segment(), 0L, index); }
    public long maxMemoryAllocationSizeAt(long index) { return (long) VH_maxMemoryAllocationSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte deviceUUID(long index0) { return (byte) VH_deviceUUID.get(this.segment(), 0L, 0L, index0); }
    public byte driverUUID(long index0) { return (byte) VH_driverUUID.get(this.segment(), 0L, 0L, index0); }
    public byte deviceLUID(long index0) { return (byte) VH_deviceLUID.get(this.segment(), 0L, 0L, index0); }
    public int deviceNodeMask() { return (int) VH_deviceNodeMask.get(this.segment(), 0L, 0L); }
    public int deviceLUIDValid() { return (int) VH_deviceLUIDValid.get(this.segment(), 0L, 0L); }
    public int subgroupSize() { return (int) VH_subgroupSize.get(this.segment(), 0L, 0L); }
    public int subgroupSupportedStages() { return (int) VH_subgroupSupportedStages.get(this.segment(), 0L, 0L); }
    public int subgroupSupportedOperations() { return (int) VH_subgroupSupportedOperations.get(this.segment(), 0L, 0L); }
    public int subgroupQuadOperationsInAllStages() { return (int) VH_subgroupQuadOperationsInAllStages.get(this.segment(), 0L, 0L); }
    public int pointClippingBehavior() { return (int) VH_pointClippingBehavior.get(this.segment(), 0L, 0L); }
    public int maxMultiviewViewCount() { return (int) VH_maxMultiviewViewCount.get(this.segment(), 0L, 0L); }
    public int maxMultiviewInstanceIndex() { return (int) VH_maxMultiviewInstanceIndex.get(this.segment(), 0L, 0L); }
    public int protectedNoFault() { return (int) VH_protectedNoFault.get(this.segment(), 0L, 0L); }
    public int maxPerSetDescriptors() { return (int) VH_maxPerSetDescriptors.get(this.segment(), 0L, 0L); }
    public long maxMemoryAllocationSize() { return (long) VH_maxMemoryAllocationSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan11Properties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceUUIDAt(long index, long index0, byte value) { VH_deviceUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceVulkan11Properties driverUUIDAt(long index, long index0, byte value) { VH_driverUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceLUIDAt(long index, long index0, byte value) { VH_deviceLUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceNodeMaskAt(long index, int value) { VH_deviceNodeMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceLUIDValidAt(long index, int value) { VH_deviceLUIDValid.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupSizeAt(long index, int value) { VH_subgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedStagesAt(long index, int value) { VH_subgroupSupportedStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedOperationsAt(long index, int value) { VH_subgroupSupportedOperations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupQuadOperationsInAllStagesAt(long index, int value) { VH_subgroupQuadOperationsInAllStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties pointClippingBehaviorAt(long index, int value) { VH_pointClippingBehavior.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxMultiviewViewCountAt(long index, int value) { VH_maxMultiviewViewCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxMultiviewInstanceIndexAt(long index, int value) { VH_maxMultiviewInstanceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties protectedNoFaultAt(long index, int value) { VH_protectedNoFault.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxPerSetDescriptorsAt(long index, int value) { VH_maxPerSetDescriptors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxMemoryAllocationSizeAt(long index, long value) { VH_maxMemoryAllocationSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Properties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceUUID(long index0, byte value) { VH_deviceUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceVulkan11Properties driverUUID(long index0, byte value) { VH_driverUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceLUID(long index0, byte value) { VH_deviceLUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceNodeMask(int value) { VH_deviceNodeMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties deviceLUIDValid(int value) { VH_deviceLUIDValid.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupSize(int value) { VH_subgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedStages(int value) { VH_subgroupSupportedStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedOperations(int value) { VH_subgroupSupportedOperations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties subgroupQuadOperationsInAllStages(int value) { VH_subgroupQuadOperationsInAllStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties pointClippingBehavior(int value) { VH_pointClippingBehavior.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxMultiviewViewCount(int value) { VH_maxMultiviewViewCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxMultiviewInstanceIndex(int value) { VH_maxMultiviewInstanceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties protectedNoFault(int value) { VH_protectedNoFault.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxPerSetDescriptors(int value) { VH_maxPerSetDescriptors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Properties maxMemoryAllocationSize(long value) { VH_maxMemoryAllocationSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceUUID, index), LAYOUT_deviceUUID); }
    public MemorySegment _deviceUUID() { return _deviceUUIDAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _deviceUUIDAt(long index, MemorySegment src) { _deviceUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _deviceUUID(MemorySegment src) { return _deviceUUIDAt(0L, src); }
    public MemorySegment _driverUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverUUID, index), LAYOUT_driverUUID); }
    public MemorySegment _driverUUID() { return _driverUUIDAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _driverUUIDAt(long index, MemorySegment src) { _driverUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _driverUUID(MemorySegment src) { return _driverUUIDAt(0L, src); }
    public MemorySegment _deviceLUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceLUID, index), LAYOUT_deviceLUID); }
    public MemorySegment _deviceLUID() { return _deviceLUIDAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _deviceLUIDAt(long index, MemorySegment src) { _deviceLUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _deviceLUID(MemorySegment src) { return _deviceLUIDAt(0L, src); }
    public MemorySegment _deviceNodeMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceNodeMask, index), LAYOUT_deviceNodeMask); }
    public MemorySegment _deviceNodeMask() { return _deviceNodeMaskAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _deviceNodeMaskAt(long index, MemorySegment src) { _deviceNodeMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _deviceNodeMask(MemorySegment src) { return _deviceNodeMaskAt(0L, src); }
    public MemorySegment _deviceLUIDValidAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceLUIDValid, index), LAYOUT_deviceLUIDValid); }
    public MemorySegment _deviceLUIDValid() { return _deviceLUIDValidAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _deviceLUIDValidAt(long index, MemorySegment src) { _deviceLUIDValidAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _deviceLUIDValid(MemorySegment src) { return _deviceLUIDValidAt(0L, src); }
    public MemorySegment _subgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSize, index), LAYOUT_subgroupSize); }
    public MemorySegment _subgroupSize() { return _subgroupSizeAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _subgroupSizeAt(long index, MemorySegment src) { _subgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _subgroupSize(MemorySegment src) { return _subgroupSizeAt(0L, src); }
    public MemorySegment _subgroupSupportedStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSupportedStages, index), LAYOUT_subgroupSupportedStages); }
    public MemorySegment _subgroupSupportedStages() { return _subgroupSupportedStagesAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _subgroupSupportedStagesAt(long index, MemorySegment src) { _subgroupSupportedStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _subgroupSupportedStages(MemorySegment src) { return _subgroupSupportedStagesAt(0L, src); }
    public MemorySegment _subgroupSupportedOperationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSupportedOperations, index), LAYOUT_subgroupSupportedOperations); }
    public MemorySegment _subgroupSupportedOperations() { return _subgroupSupportedOperationsAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _subgroupSupportedOperationsAt(long index, MemorySegment src) { _subgroupSupportedOperationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _subgroupSupportedOperations(MemorySegment src) { return _subgroupSupportedOperationsAt(0L, src); }
    public MemorySegment _subgroupQuadOperationsInAllStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupQuadOperationsInAllStages, index), LAYOUT_subgroupQuadOperationsInAllStages); }
    public MemorySegment _subgroupQuadOperationsInAllStages() { return _subgroupQuadOperationsInAllStagesAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _subgroupQuadOperationsInAllStagesAt(long index, MemorySegment src) { _subgroupQuadOperationsInAllStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _subgroupQuadOperationsInAllStages(MemorySegment src) { return _subgroupQuadOperationsInAllStagesAt(0L, src); }
    public MemorySegment _pointClippingBehaviorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pointClippingBehavior, index), LAYOUT_pointClippingBehavior); }
    public MemorySegment _pointClippingBehavior() { return _pointClippingBehaviorAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _pointClippingBehaviorAt(long index, MemorySegment src) { _pointClippingBehaviorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _pointClippingBehavior(MemorySegment src) { return _pointClippingBehaviorAt(0L, src); }
    public MemorySegment _maxMultiviewViewCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiviewViewCount, index), LAYOUT_maxMultiviewViewCount); }
    public MemorySegment _maxMultiviewViewCount() { return _maxMultiviewViewCountAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _maxMultiviewViewCountAt(long index, MemorySegment src) { _maxMultiviewViewCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _maxMultiviewViewCount(MemorySegment src) { return _maxMultiviewViewCountAt(0L, src); }
    public MemorySegment _maxMultiviewInstanceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiviewInstanceIndex, index), LAYOUT_maxMultiviewInstanceIndex); }
    public MemorySegment _maxMultiviewInstanceIndex() { return _maxMultiviewInstanceIndexAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _maxMultiviewInstanceIndexAt(long index, MemorySegment src) { _maxMultiviewInstanceIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _maxMultiviewInstanceIndex(MemorySegment src) { return _maxMultiviewInstanceIndexAt(0L, src); }
    public MemorySegment _protectedNoFaultAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_protectedNoFault, index), LAYOUT_protectedNoFault); }
    public MemorySegment _protectedNoFault() { return _protectedNoFaultAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _protectedNoFaultAt(long index, MemorySegment src) { _protectedNoFaultAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _protectedNoFault(MemorySegment src) { return _protectedNoFaultAt(0L, src); }
    public MemorySegment _maxPerSetDescriptorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerSetDescriptors, index), LAYOUT_maxPerSetDescriptors); }
    public MemorySegment _maxPerSetDescriptors() { return _maxPerSetDescriptorsAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _maxPerSetDescriptorsAt(long index, MemorySegment src) { _maxPerSetDescriptorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _maxPerSetDescriptors(MemorySegment src) { return _maxPerSetDescriptorsAt(0L, src); }
    public MemorySegment _maxMemoryAllocationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMemoryAllocationSize, index), LAYOUT_maxMemoryAllocationSize); }
    public MemorySegment _maxMemoryAllocationSize() { return _maxMemoryAllocationSizeAt(0L); }
    public VkPhysicalDeviceVulkan11Properties _maxMemoryAllocationSizeAt(long index, MemorySegment src) { _maxMemoryAllocationSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Properties _maxMemoryAllocationSize(MemorySegment src) { return _maxMemoryAllocationSizeAt(0L, src); }
}
