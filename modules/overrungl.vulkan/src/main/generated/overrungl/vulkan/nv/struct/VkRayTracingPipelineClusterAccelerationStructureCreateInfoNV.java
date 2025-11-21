// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 allowClusterAccelerationStructure;
/// }
/// ```
public final class VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("allowClusterAccelerationStructure")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_allowClusterAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("allowClusterAccelerationStructure"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_allowClusterAccelerationStructure = LAYOUT.select(PathElement.groupElement("allowClusterAccelerationStructure"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_allowClusterAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allowClusterAccelerationStructure"));

    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV); }
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
        return s;
    }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV copyFrom(VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV reinterpret(long count) { return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV asSlice(long index) { return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV asSlice(long index, long count) { return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV at(long index, Consumer<VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int allowClusterAccelerationStructureAt(long index) { return (int) VH_allowClusterAccelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int allowClusterAccelerationStructure() { return (int) VH_allowClusterAccelerationStructure.get(this.segment(), 0L, 0L); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV allowClusterAccelerationStructureAt(long index, int value) { VH_allowClusterAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV allowClusterAccelerationStructure(int value) { VH_allowClusterAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _allowClusterAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_allowClusterAccelerationStructure, index), LAYOUT_allowClusterAccelerationStructure); }
    public MemorySegment _allowClusterAccelerationStructure() { return _allowClusterAccelerationStructureAt(0L); }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV _allowClusterAccelerationStructureAt(long index, MemorySegment src) { _allowClusterAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV _allowClusterAccelerationStructure(MemorySegment src) { return _allowClusterAccelerationStructureAt(0L, src); }
}
