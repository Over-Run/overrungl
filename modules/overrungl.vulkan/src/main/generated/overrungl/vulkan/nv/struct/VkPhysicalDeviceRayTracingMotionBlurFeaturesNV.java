// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingMotionBlurFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingMotionBlur;
///     VkBool32 rayTracingMotionBlurPipelineTraceRaysIndirect;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingMotionBlurFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlur"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingMotionBlur = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMotionBlur"));
    public static final long OFFSET_rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingMotionBlur = LAYOUT.select(PathElement.groupElement("rayTracingMotionBlur"));
    public static final MemoryLayout LAYOUT_rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.select(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingMotionBlur = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMotionBlur"));
    public static final VarHandle VH_rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));

    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingMotionBlur.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV); }
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingMotionBlur.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV copyFrom(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV at(long index, Consumer<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingMotionBlurAt(long index) { return (int) VH_rayTracingMotionBlur.get(this.segment(), 0L, index); }
    public int rayTracingMotionBlurPipelineTraceRaysIndirectAt(long index) { return (int) VH_rayTracingMotionBlurPipelineTraceRaysIndirect.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingMotionBlur() { return (int) VH_rayTracingMotionBlur.get(this.segment(), 0L, 0L); }
    public int rayTracingMotionBlurPipelineTraceRaysIndirect() { return (int) VH_rayTracingMotionBlurPipelineTraceRaysIndirect.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurAt(long index, int value) { VH_rayTracingMotionBlur.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurPipelineTraceRaysIndirectAt(long index, int value) { VH_rayTracingMotionBlurPipelineTraceRaysIndirect.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlur(int value) { VH_rayTracingMotionBlur.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurPipelineTraceRaysIndirect(int value) { VH_rayTracingMotionBlurPipelineTraceRaysIndirect.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingMotionBlurAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingMotionBlur, index), LAYOUT_rayTracingMotionBlur); }
    public MemorySegment _rayTracingMotionBlur() { return _rayTracingMotionBlurAt(0L); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _rayTracingMotionBlurAt(long index, MemorySegment src) { _rayTracingMotionBlurAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _rayTracingMotionBlur(MemorySegment src) { return _rayTracingMotionBlurAt(0L, src); }
    public MemorySegment _rayTracingMotionBlurPipelineTraceRaysIndirectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingMotionBlurPipelineTraceRaysIndirect, index), LAYOUT_rayTracingMotionBlurPipelineTraceRaysIndirect); }
    public MemorySegment _rayTracingMotionBlurPipelineTraceRaysIndirect() { return _rayTracingMotionBlurPipelineTraceRaysIndirectAt(0L); }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _rayTracingMotionBlurPipelineTraceRaysIndirectAt(long index, MemorySegment src) { _rayTracingMotionBlurPipelineTraceRaysIndirectAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV _rayTracingMotionBlurPipelineTraceRaysIndirect(MemorySegment src) { return _rayTracingMotionBlurPipelineTraceRaysIndirectAt(0L, src); }
}
