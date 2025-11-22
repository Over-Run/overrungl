// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance6PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance6PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     VkBool32 fragmentShadingRateClampCombinerInputs;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance6PropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    public static final long OFFSET_maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    public static final long OFFSET_fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_blockTexelViewCompatibleMultipleLayers = LAYOUT.select(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    public static final MemoryLayout LAYOUT_maxCombinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateClampCombinerInputs = LAYOUT.select(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_blockTexelViewCompatibleMultipleLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    public static final VarHandle VH_maxCombinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    public static final VarHandle VH_fragmentShadingRateClampCombinerInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));

    public VkPhysicalDeviceMaintenance6PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES); }
    public static VkPhysicalDeviceMaintenance6PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceMaintenance6PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance6PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance6PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int blockTexelViewCompatibleMultipleLayersAt(long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(this.segment(), 0L, index); }
    public int maxCombinedImageSamplerDescriptorCountAt(long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(this.segment(), 0L, index); }
    public int fragmentShadingRateClampCombinerInputsAt(long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int blockTexelViewCompatibleMultipleLayers() { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(this.segment(), 0L, 0L); }
    public int maxCombinedImageSamplerDescriptorCount() { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateClampCombinerInputs() { return (int) VH_fragmentShadingRateClampCombinerInputs.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR blockTexelViewCompatibleMultipleLayersAt(long index, int value) { VH_blockTexelViewCompatibleMultipleLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR maxCombinedImageSamplerDescriptorCountAt(long index, int value) { VH_maxCombinedImageSamplerDescriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR fragmentShadingRateClampCombinerInputsAt(long index, int value) { VH_fragmentShadingRateClampCombinerInputs.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR blockTexelViewCompatibleMultipleLayers(int value) { VH_blockTexelViewCompatibleMultipleLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR maxCombinedImageSamplerDescriptorCount(int value) { VH_maxCombinedImageSamplerDescriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR fragmentShadingRateClampCombinerInputs(int value) { VH_fragmentShadingRateClampCombinerInputs.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _blockTexelViewCompatibleMultipleLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blockTexelViewCompatibleMultipleLayers, index), LAYOUT_blockTexelViewCompatibleMultipleLayers); }
    public MemorySegment _blockTexelViewCompatibleMultipleLayers() { return _blockTexelViewCompatibleMultipleLayersAt(0L); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _blockTexelViewCompatibleMultipleLayersAt(long index, MemorySegment src) { _blockTexelViewCompatibleMultipleLayersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _blockTexelViewCompatibleMultipleLayers(MemorySegment src) { return _blockTexelViewCompatibleMultipleLayersAt(0L, src); }
    public MemorySegment _maxCombinedImageSamplerDescriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCombinedImageSamplerDescriptorCount, index), LAYOUT_maxCombinedImageSamplerDescriptorCount); }
    public MemorySegment _maxCombinedImageSamplerDescriptorCount() { return _maxCombinedImageSamplerDescriptorCountAt(0L); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _maxCombinedImageSamplerDescriptorCountAt(long index, MemorySegment src) { _maxCombinedImageSamplerDescriptorCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _maxCombinedImageSamplerDescriptorCount(MemorySegment src) { return _maxCombinedImageSamplerDescriptorCountAt(0L, src); }
    public MemorySegment _fragmentShadingRateClampCombinerInputsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateClampCombinerInputs, index), LAYOUT_fragmentShadingRateClampCombinerInputs); }
    public MemorySegment _fragmentShadingRateClampCombinerInputs() { return _fragmentShadingRateClampCombinerInputsAt(0L); }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _fragmentShadingRateClampCombinerInputsAt(long index, MemorySegment src) { _fragmentShadingRateClampCombinerInputsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6PropertiesKHR _fragmentShadingRateClampCombinerInputs(MemorySegment src) { return _fragmentShadingRateClampCombinerInputsAt(0L, src); }
}
