// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 subsampledLoads;
///     VkBool32 subsampledCoarseReconstructionEarlyAccess;
///     uint32_t maxSubsampledArrayLayers;
///     uint32_t maxDescriptorSetSubsampledSamplers;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subsampledLoads"),
        ValueLayout.JAVA_INT.withName("subsampledCoarseReconstructionEarlyAccess"),
        ValueLayout.JAVA_INT.withName("maxSubsampledArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSubsampledSamplers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subsampledLoads = LAYOUT.byteOffset(PathElement.groupElement("subsampledLoads"));
    public static final long OFFSET_subsampledCoarseReconstructionEarlyAccess = LAYOUT.byteOffset(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    public static final long OFFSET_maxSubsampledArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxSubsampledArrayLayers"));
    public static final long OFFSET_maxDescriptorSetSubsampledSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subsampledLoads = LAYOUT.select(PathElement.groupElement("subsampledLoads"));
    public static final MemoryLayout LAYOUT_subsampledCoarseReconstructionEarlyAccess = LAYOUT.select(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    public static final MemoryLayout LAYOUT_maxSubsampledArrayLayers = LAYOUT.select(PathElement.groupElement("maxSubsampledArrayLayers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetSubsampledSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subsampledLoads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampledLoads"));
    public static final VarHandle VH_subsampledCoarseReconstructionEarlyAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    public static final VarHandle VH_maxSubsampledArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubsampledArrayLayers"));
    public static final VarHandle VH_maxDescriptorSetSubsampledSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT copyFrom(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int subsampledLoadsAt(long index) { return (int) VH_subsampledLoads.get(this.segment(), 0L, index); }
    public int subsampledCoarseReconstructionEarlyAccessAt(long index) { return (int) VH_subsampledCoarseReconstructionEarlyAccess.get(this.segment(), 0L, index); }
    public int maxSubsampledArrayLayersAt(long index) { return (int) VH_maxSubsampledArrayLayers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetSubsampledSamplersAt(long index) { return (int) VH_maxDescriptorSetSubsampledSamplers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int subsampledLoads() { return (int) VH_subsampledLoads.get(this.segment(), 0L, 0L); }
    public int subsampledCoarseReconstructionEarlyAccess() { return (int) VH_subsampledCoarseReconstructionEarlyAccess.get(this.segment(), 0L, 0L); }
    public int maxSubsampledArrayLayers() { return (int) VH_maxSubsampledArrayLayers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetSubsampledSamplers() { return (int) VH_maxDescriptorSetSubsampledSamplers.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledLoadsAt(long index, int value) { VH_subsampledLoads.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledCoarseReconstructionEarlyAccessAt(long index, int value) { VH_subsampledCoarseReconstructionEarlyAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxSubsampledArrayLayersAt(long index, int value) { VH_maxSubsampledArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxDescriptorSetSubsampledSamplersAt(long index, int value) { VH_maxDescriptorSetSubsampledSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledLoads(int value) { VH_subsampledLoads.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledCoarseReconstructionEarlyAccess(int value) { VH_subsampledCoarseReconstructionEarlyAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxSubsampledArrayLayers(int value) { VH_maxSubsampledArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxDescriptorSetSubsampledSamplers(int value) { VH_maxDescriptorSetSubsampledSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subsampledLoadsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subsampledLoads, index), LAYOUT_subsampledLoads); }
    public MemorySegment _subsampledLoads() { return _subsampledLoadsAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _subsampledLoadsAt(long index, MemorySegment src) { _subsampledLoadsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _subsampledLoads(MemorySegment src) { return _subsampledLoadsAt(0L, src); }
    public MemorySegment _subsampledCoarseReconstructionEarlyAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subsampledCoarseReconstructionEarlyAccess, index), LAYOUT_subsampledCoarseReconstructionEarlyAccess); }
    public MemorySegment _subsampledCoarseReconstructionEarlyAccess() { return _subsampledCoarseReconstructionEarlyAccessAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _subsampledCoarseReconstructionEarlyAccessAt(long index, MemorySegment src) { _subsampledCoarseReconstructionEarlyAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _subsampledCoarseReconstructionEarlyAccess(MemorySegment src) { return _subsampledCoarseReconstructionEarlyAccessAt(0L, src); }
    public MemorySegment _maxSubsampledArrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSubsampledArrayLayers, index), LAYOUT_maxSubsampledArrayLayers); }
    public MemorySegment _maxSubsampledArrayLayers() { return _maxSubsampledArrayLayersAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _maxSubsampledArrayLayersAt(long index, MemorySegment src) { _maxSubsampledArrayLayersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _maxSubsampledArrayLayers(MemorySegment src) { return _maxSubsampledArrayLayersAt(0L, src); }
    public MemorySegment _maxDescriptorSetSubsampledSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetSubsampledSamplers, index), LAYOUT_maxDescriptorSetSubsampledSamplers); }
    public MemorySegment _maxDescriptorSetSubsampledSamplers() { return _maxDescriptorSetSubsampledSamplersAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _maxDescriptorSetSubsampledSamplersAt(long index, MemorySegment src) { _maxDescriptorSetSubsampledSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT _maxDescriptorSetSubsampledSamplers(MemorySegment src) { return _maxDescriptorSetSubsampledSamplersAt(0L, src); }
}
