// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSubgroupRotateFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSubgroupRotateFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupRotate;
///     VkBool32 shaderSubgroupRotateClustered;
/// }
/// ```
public final class VkPhysicalDeviceShaderSubgroupRotateFeatures extends GroupType {
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

    public VkPhysicalDeviceShaderSubgroupRotateFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES); }
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures copyFrom(VkPhysicalDeviceShaderSubgroupRotateFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures reinterpret(long count) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures asSlice(long index) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures asSlice(long index, long count) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures at(long index, Consumer<VkPhysicalDeviceShaderSubgroupRotateFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSubgroupRotateAt(long index) { return (int) VH_shaderSubgroupRotate.get(this.segment(), 0L, index); }
    public int shaderSubgroupRotateClusteredAt(long index) { return (int) VH_shaderSubgroupRotateClustered.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupRotate() { return (int) VH_shaderSubgroupRotate.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupRotateClustered() { return (int) VH_shaderSubgroupRotateClustered.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateAt(long index, int value) { VH_shaderSubgroupRotate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClusteredAt(long index, int value) { VH_shaderSubgroupRotateClustered.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotate(int value) { VH_shaderSubgroupRotate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClustered(int value) { VH_shaderSubgroupRotateClustered.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSubgroupRotateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupRotate, index), LAYOUT_shaderSubgroupRotate); }
    public MemorySegment _shaderSubgroupRotate() { return _shaderSubgroupRotateAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _shaderSubgroupRotateAt(long index, MemorySegment src) { _shaderSubgroupRotateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _shaderSubgroupRotate(MemorySegment src) { return _shaderSubgroupRotateAt(0L, src); }
    public MemorySegment _shaderSubgroupRotateClusteredAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupRotateClustered, index), LAYOUT_shaderSubgroupRotateClustered); }
    public MemorySegment _shaderSubgroupRotateClustered() { return _shaderSubgroupRotateClusteredAt(0L); }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _shaderSubgroupRotateClusteredAt(long index, MemorySegment src) { _shaderSubgroupRotateClusteredAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupRotateFeatures _shaderSubgroupRotateClustered(MemorySegment src) { return _shaderSubgroupRotateClusteredAt(0L, src); }
}
