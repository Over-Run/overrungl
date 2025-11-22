// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupRotate;
///     VkBool32 shaderSubgroupRotateClustered;
/// }
/// ```
public final class VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderSubgroupRotate = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotate"));
    public static final long OFFSET_shaderSubgroupRotateClustered = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotateClustered"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderSubgroupRotate = LAYOUT.select(PathElement.groupElement("shaderSubgroupRotate"));
    public static final MemoryLayout LAYOUT_shaderSubgroupRotateClustered = LAYOUT.select(PathElement.groupElement("shaderSubgroupRotateClustered"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderSubgroupRotate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotate"));
    public static final VarHandle VH_shaderSubgroupRotateClustered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotateClustered"));

    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR copyFrom(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSubgroupRotateAt(long index) { return (int) VH_shaderSubgroupRotate.get(this.segment(), 0L, index); }
    public int shaderSubgroupRotateClusteredAt(long index) { return (int) VH_shaderSubgroupRotateClustered.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupRotate() { return (int) VH_shaderSubgroupRotate.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupRotateClustered() { return (int) VH_shaderSubgroupRotateClustered.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateAt(long index, int value) { VH_shaderSubgroupRotate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateClusteredAt(long index, int value) { VH_shaderSubgroupRotateClustered.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotate(int value) { VH_shaderSubgroupRotate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateClustered(int value) { VH_shaderSubgroupRotateClustered.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSubgroupRotateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupRotate, index), LAYOUT_shaderSubgroupRotate); }
    public MemorySegment _shaderSubgroupRotate() { return _shaderSubgroupRotateAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _shaderSubgroupRotateAt(long index, MemorySegment src) { _shaderSubgroupRotateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _shaderSubgroupRotate(MemorySegment src) { return _shaderSubgroupRotateAt(0L, src); }
    public MemorySegment _shaderSubgroupRotateClusteredAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupRotateClustered, index), LAYOUT_shaderSubgroupRotateClustered); }
    public MemorySegment _shaderSubgroupRotateClustered() { return _shaderSubgroupRotateClusteredAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _shaderSubgroupRotateClusteredAt(long index, MemorySegment src) { _shaderSubgroupRotateClusteredAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR _shaderSubgroupRotateClustered(MemorySegment src) { return _shaderSubgroupRotateClusteredAt(0L, src); }
}
