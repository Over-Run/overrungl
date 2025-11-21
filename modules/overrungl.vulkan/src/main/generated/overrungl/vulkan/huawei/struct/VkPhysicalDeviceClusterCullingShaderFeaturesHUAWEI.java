// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 clustercullingShader;
///     VkBool32 multiviewClusterCullingShader;
/// }
/// ```
public final class VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clustercullingShader"),
        ValueLayout.JAVA_INT.withName("multiviewClusterCullingShader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_clustercullingShader = LAYOUT.byteOffset(PathElement.groupElement("clustercullingShader"));
    public static final long OFFSET_multiviewClusterCullingShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewClusterCullingShader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_clustercullingShader = LAYOUT.select(PathElement.groupElement("clustercullingShader"));
    public static final MemoryLayout LAYOUT_multiviewClusterCullingShader = LAYOUT.select(PathElement.groupElement("multiviewClusterCullingShader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_clustercullingShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clustercullingShader"));
    public static final VarHandle VH_multiviewClusterCullingShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewClusterCullingShader"));

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI); }
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI copyFrom(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI at(long index, Consumer<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int clustercullingShaderAt(long index) { return (int) VH_clustercullingShader.get(this.segment(), 0L, index); }
    public int multiviewClusterCullingShaderAt(long index) { return (int) VH_multiviewClusterCullingShader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int clustercullingShader() { return (int) VH_clustercullingShader.get(this.segment(), 0L, 0L); }
    public int multiviewClusterCullingShader() { return (int) VH_multiviewClusterCullingShader.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clustercullingShaderAt(long index, int value) { VH_clustercullingShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI multiviewClusterCullingShaderAt(long index, int value) { VH_multiviewClusterCullingShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clustercullingShader(int value) { VH_clustercullingShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI multiviewClusterCullingShader(int value) { VH_multiviewClusterCullingShader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _clustercullingShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clustercullingShader, index), LAYOUT_clustercullingShader); }
    public MemorySegment _clustercullingShader() { return _clustercullingShaderAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _clustercullingShaderAt(long index, MemorySegment src) { _clustercullingShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _clustercullingShader(MemorySegment src) { return _clustercullingShaderAt(0L, src); }
    public MemorySegment _multiviewClusterCullingShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewClusterCullingShader, index), LAYOUT_multiviewClusterCullingShader); }
    public MemorySegment _multiviewClusterCullingShader() { return _multiviewClusterCullingShaderAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _multiviewClusterCullingShaderAt(long index, MemorySegment src) { _multiviewClusterCullingShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI _multiviewClusterCullingShader(MemorySegment src) { return _multiviewClusterCullingShaderAt(0L, src); }
}
