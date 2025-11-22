// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint64_t maxGeometryCount;
///     uint64_t maxInstanceCount;
///     uint64_t maxTriangleCount;
///     uint32_t maxDescriptorSetAccelerationStructures;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_LONG.withName("maxGeometryCount"),
        ValueLayout.JAVA_LONG.withName("maxInstanceCount"),
        ValueLayout.JAVA_LONG.withName("maxTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderGroupHandleSize = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleSize"));
    public static final long OFFSET_maxRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxRecursionDepth"));
    public static final long OFFSET_maxShaderGroupStride = LAYOUT.byteOffset(PathElement.groupElement("maxShaderGroupStride"));
    public static final long OFFSET_shaderGroupBaseAlignment = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupBaseAlignment"));
    public static final long OFFSET_maxGeometryCount = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryCount"));
    public static final long OFFSET_maxInstanceCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceCount"));
    public static final long OFFSET_maxTriangleCount = LAYOUT.byteOffset(PathElement.groupElement("maxTriangleCount"));
    public static final long OFFSET_maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderGroupHandleSize = LAYOUT.select(PathElement.groupElement("shaderGroupHandleSize"));
    public static final MemoryLayout LAYOUT_maxRecursionDepth = LAYOUT.select(PathElement.groupElement("maxRecursionDepth"));
    public static final MemoryLayout LAYOUT_maxShaderGroupStride = LAYOUT.select(PathElement.groupElement("maxShaderGroupStride"));
    public static final MemoryLayout LAYOUT_shaderGroupBaseAlignment = LAYOUT.select(PathElement.groupElement("shaderGroupBaseAlignment"));
    public static final MemoryLayout LAYOUT_maxGeometryCount = LAYOUT.select(PathElement.groupElement("maxGeometryCount"));
    public static final MemoryLayout LAYOUT_maxInstanceCount = LAYOUT.select(PathElement.groupElement("maxInstanceCount"));
    public static final MemoryLayout LAYOUT_maxTriangleCount = LAYOUT.select(PathElement.groupElement("maxTriangleCount"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderGroupHandleSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleSize"));
    public static final VarHandle VH_maxRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRecursionDepth"));
    public static final VarHandle VH_maxShaderGroupStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderGroupStride"));
    public static final VarHandle VH_shaderGroupBaseAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
    public static final VarHandle VH_maxGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryCount"));
    public static final VarHandle VH_maxInstanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceCount"));
    public static final VarHandle VH_maxTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTriangleCount"));
    public static final VarHandle VH_maxDescriptorSetAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));

    public VkPhysicalDeviceRayTracingPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV); }
    public static VkPhysicalDeviceRayTracingPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceRayTracingPropertiesNV copyFrom(VkPhysicalDeviceRayTracingPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingPropertiesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingPropertiesNV at(long index, Consumer<VkPhysicalDeviceRayTracingPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderGroupHandleSizeAt(long index) { return (int) VH_shaderGroupHandleSize.get(this.segment(), 0L, index); }
    public int maxRecursionDepthAt(long index) { return (int) VH_maxRecursionDepth.get(this.segment(), 0L, index); }
    public int maxShaderGroupStrideAt(long index) { return (int) VH_maxShaderGroupStride.get(this.segment(), 0L, index); }
    public int shaderGroupBaseAlignmentAt(long index) { return (int) VH_shaderGroupBaseAlignment.get(this.segment(), 0L, index); }
    public long maxGeometryCountAt(long index) { return (long) VH_maxGeometryCount.get(this.segment(), 0L, index); }
    public long maxInstanceCountAt(long index) { return (long) VH_maxInstanceCount.get(this.segment(), 0L, index); }
    public long maxTriangleCountAt(long index) { return (long) VH_maxTriangleCount.get(this.segment(), 0L, index); }
    public int maxDescriptorSetAccelerationStructuresAt(long index) { return (int) VH_maxDescriptorSetAccelerationStructures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderGroupHandleSize() { return (int) VH_shaderGroupHandleSize.get(this.segment(), 0L, 0L); }
    public int maxRecursionDepth() { return (int) VH_maxRecursionDepth.get(this.segment(), 0L, 0L); }
    public int maxShaderGroupStride() { return (int) VH_maxShaderGroupStride.get(this.segment(), 0L, 0L); }
    public int shaderGroupBaseAlignment() { return (int) VH_shaderGroupBaseAlignment.get(this.segment(), 0L, 0L); }
    public long maxGeometryCount() { return (long) VH_maxGeometryCount.get(this.segment(), 0L, 0L); }
    public long maxInstanceCount() { return (long) VH_maxInstanceCount.get(this.segment(), 0L, 0L); }
    public long maxTriangleCount() { return (long) VH_maxTriangleCount.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetAccelerationStructures() { return (int) VH_maxDescriptorSetAccelerationStructures.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupHandleSizeAt(long index, int value) { VH_shaderGroupHandleSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxRecursionDepthAt(long index, int value) { VH_maxRecursionDepth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxShaderGroupStrideAt(long index, int value) { VH_maxShaderGroupStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupBaseAlignmentAt(long index, int value) { VH_shaderGroupBaseAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxGeometryCountAt(long index, long value) { VH_maxGeometryCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxInstanceCountAt(long index, long value) { VH_maxInstanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxTriangleCountAt(long index, long value) { VH_maxTriangleCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxDescriptorSetAccelerationStructuresAt(long index, int value) { VH_maxDescriptorSetAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupHandleSize(int value) { VH_shaderGroupHandleSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxRecursionDepth(int value) { VH_maxRecursionDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxShaderGroupStride(int value) { VH_maxShaderGroupStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupBaseAlignment(int value) { VH_shaderGroupBaseAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxGeometryCount(long value) { VH_maxGeometryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxInstanceCount(long value) { VH_maxInstanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxTriangleCount(long value) { VH_maxTriangleCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV maxDescriptorSetAccelerationStructures(int value) { VH_maxDescriptorSetAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderGroupHandleSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderGroupHandleSize, index), LAYOUT_shaderGroupHandleSize); }
    public MemorySegment _shaderGroupHandleSize() { return _shaderGroupHandleSizeAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _shaderGroupHandleSizeAt(long index, MemorySegment src) { _shaderGroupHandleSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _shaderGroupHandleSize(MemorySegment src) { return _shaderGroupHandleSizeAt(0L, src); }
    public MemorySegment _maxRecursionDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRecursionDepth, index), LAYOUT_maxRecursionDepth); }
    public MemorySegment _maxRecursionDepth() { return _maxRecursionDepthAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxRecursionDepthAt(long index, MemorySegment src) { _maxRecursionDepthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxRecursionDepth(MemorySegment src) { return _maxRecursionDepthAt(0L, src); }
    public MemorySegment _maxShaderGroupStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxShaderGroupStride, index), LAYOUT_maxShaderGroupStride); }
    public MemorySegment _maxShaderGroupStride() { return _maxShaderGroupStrideAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxShaderGroupStrideAt(long index, MemorySegment src) { _maxShaderGroupStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxShaderGroupStride(MemorySegment src) { return _maxShaderGroupStrideAt(0L, src); }
    public MemorySegment _shaderGroupBaseAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderGroupBaseAlignment, index), LAYOUT_shaderGroupBaseAlignment); }
    public MemorySegment _shaderGroupBaseAlignment() { return _shaderGroupBaseAlignmentAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _shaderGroupBaseAlignmentAt(long index, MemorySegment src) { _shaderGroupBaseAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _shaderGroupBaseAlignment(MemorySegment src) { return _shaderGroupBaseAlignmentAt(0L, src); }
    public MemorySegment _maxGeometryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryCount, index), LAYOUT_maxGeometryCount); }
    public MemorySegment _maxGeometryCount() { return _maxGeometryCountAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxGeometryCountAt(long index, MemorySegment src) { _maxGeometryCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxGeometryCount(MemorySegment src) { return _maxGeometryCountAt(0L, src); }
    public MemorySegment _maxInstanceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInstanceCount, index), LAYOUT_maxInstanceCount); }
    public MemorySegment _maxInstanceCount() { return _maxInstanceCountAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxInstanceCountAt(long index, MemorySegment src) { _maxInstanceCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxInstanceCount(MemorySegment src) { return _maxInstanceCountAt(0L, src); }
    public MemorySegment _maxTriangleCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTriangleCount, index), LAYOUT_maxTriangleCount); }
    public MemorySegment _maxTriangleCount() { return _maxTriangleCountAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxTriangleCountAt(long index, MemorySegment src) { _maxTriangleCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxTriangleCount(MemorySegment src) { return _maxTriangleCountAt(0L, src); }
    public MemorySegment _maxDescriptorSetAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetAccelerationStructures, index), LAYOUT_maxDescriptorSetAccelerationStructures); }
    public MemorySegment _maxDescriptorSetAccelerationStructures() { return _maxDescriptorSetAccelerationStructuresAt(0L); }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxDescriptorSetAccelerationStructuresAt(long index, MemorySegment src) { _maxDescriptorSetAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPropertiesNV _maxDescriptorSetAccelerationStructures(MemorySegment src) { return _maxDescriptorSetAccelerationStructuresAt(0L, src); }
}
