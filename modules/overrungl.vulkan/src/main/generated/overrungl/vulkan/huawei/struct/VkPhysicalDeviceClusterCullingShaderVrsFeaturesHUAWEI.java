// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 clusterShadingRate;
/// }
/// ```
public final class VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clusterShadingRate")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_clusterShadingRate = LAYOUT.byteOffset(PathElement.groupElement("clusterShadingRate"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_clusterShadingRate = LAYOUT.select(PathElement.groupElement("clusterShadingRate"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_clusterShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterShadingRate"));

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI); }
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI copyFrom(VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI at(long index, Consumer<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int clusterShadingRateAt(long index) { return (int) VH_clusterShadingRate.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int clusterShadingRate() { return (int) VH_clusterShadingRate.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRateAt(long index, int value) { VH_clusterShadingRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRate(int value) { VH_clusterShadingRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _clusterShadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterShadingRate, index), LAYOUT_clusterShadingRate); }
    public MemorySegment _clusterShadingRate() { return _clusterShadingRateAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI _clusterShadingRateAt(long index, MemorySegment src) { _clusterShadingRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI _clusterShadingRate(MemorySegment src) { return _clusterShadingRateAt(0L, src); }
}
