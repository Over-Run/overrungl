// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingPipeline;
///     VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplay;
///     VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplayMixed;
///     VkBool32 rayTracingPipelineTraceRaysIndirect;
///     VkBool32 rayTraversalPrimitiveCulling;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingPipelineFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingPipeline"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
        ValueLayout.JAVA_INT.withName("rayTraversalPrimitiveCulling")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingPipeline = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipeline"));
    public static final long OFFSET_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    public static final long OFFSET_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    public static final long OFFSET_rayTracingPipelineTraceRaysIndirect = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    public static final long OFFSET_rayTraversalPrimitiveCulling = LAYOUT.byteOffset(PathElement.groupElement("rayTraversalPrimitiveCulling"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingPipeline = LAYOUT.select(PathElement.groupElement("rayTracingPipeline"));
    public static final MemoryLayout LAYOUT_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.select(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    public static final MemoryLayout LAYOUT_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.select(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    public static final MemoryLayout LAYOUT_rayTracingPipelineTraceRaysIndirect = LAYOUT.select(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    public static final MemoryLayout LAYOUT_rayTraversalPrimitiveCulling = LAYOUT.select(PathElement.groupElement("rayTraversalPrimitiveCulling"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipeline"));
    public static final VarHandle VH_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    public static final VarHandle VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    public static final VarHandle VH_rayTracingPipelineTraceRaysIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    public static final VarHandle VH_rayTraversalPrimitiveCulling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTraversalPrimitiveCulling"));

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR); }
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR copyFrom(VkPhysicalDeviceRayTracingPipelineFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR at(long index, Consumer<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingPipelineAt(long index) { return (int) VH_rayTracingPipeline.get(this.segment(), 0L, index); }
    public int rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index) { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplay.get(this.segment(), 0L, index); }
    public int rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index) { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.get(this.segment(), 0L, index); }
    public int rayTracingPipelineTraceRaysIndirectAt(long index) { return (int) VH_rayTracingPipelineTraceRaysIndirect.get(this.segment(), 0L, index); }
    public int rayTraversalPrimitiveCullingAt(long index) { return (int) VH_rayTraversalPrimitiveCulling.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingPipeline() { return (int) VH_rayTracingPipeline.get(this.segment(), 0L, 0L); }
    public int rayTracingPipelineShaderGroupHandleCaptureReplay() { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplay.get(this.segment(), 0L, 0L); }
    public int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.get(this.segment(), 0L, 0L); }
    public int rayTracingPipelineTraceRaysIndirect() { return (int) VH_rayTracingPipelineTraceRaysIndirect.get(this.segment(), 0L, 0L); }
    public int rayTraversalPrimitiveCulling() { return (int) VH_rayTraversalPrimitiveCulling.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineAt(long index, int value) { VH_rayTracingPipeline.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index, int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index, int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirectAt(long index, int value) { VH_rayTracingPipelineTraceRaysIndirect.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCullingAt(long index, int value) { VH_rayTraversalPrimitiveCulling.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(int value) { VH_rayTracingPipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(int value) { VH_rayTracingPipelineTraceRaysIndirect.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCulling(int value) { VH_rayTraversalPrimitiveCulling.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingPipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingPipeline, index), LAYOUT_rayTracingPipeline); }
    public MemorySegment _rayTracingPipeline() { return _rayTracingPipelineAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineAt(long index, MemorySegment src) { _rayTracingPipelineAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipeline(MemorySegment src) { return _rayTracingPipelineAt(0L, src); }
    public MemorySegment _rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingPipelineShaderGroupHandleCaptureReplay, index), LAYOUT_rayTracingPipelineShaderGroupHandleCaptureReplay); }
    public MemorySegment _rayTracingPipelineShaderGroupHandleCaptureReplay() { return _rayTracingPipelineShaderGroupHandleCaptureReplayAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index, MemorySegment src) { _rayTracingPipelineShaderGroupHandleCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment src) { return _rayTracingPipelineShaderGroupHandleCaptureReplayAt(0L, src); }
    public MemorySegment _rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingPipelineShaderGroupHandleCaptureReplayMixed, index), LAYOUT_rayTracingPipelineShaderGroupHandleCaptureReplayMixed); }
    public MemorySegment _rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return _rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index, MemorySegment src) { _rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment src) { return _rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(0L, src); }
    public MemorySegment _rayTracingPipelineTraceRaysIndirectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingPipelineTraceRaysIndirect, index), LAYOUT_rayTracingPipelineTraceRaysIndirect); }
    public MemorySegment _rayTracingPipelineTraceRaysIndirect() { return _rayTracingPipelineTraceRaysIndirectAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineTraceRaysIndirectAt(long index, MemorySegment src) { _rayTracingPipelineTraceRaysIndirectAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTracingPipelineTraceRaysIndirect(MemorySegment src) { return _rayTracingPipelineTraceRaysIndirectAt(0L, src); }
    public MemorySegment _rayTraversalPrimitiveCullingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTraversalPrimitiveCulling, index), LAYOUT_rayTraversalPrimitiveCulling); }
    public MemorySegment _rayTraversalPrimitiveCulling() { return _rayTraversalPrimitiveCullingAt(0L); }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTraversalPrimitiveCullingAt(long index, MemorySegment src) { _rayTraversalPrimitiveCullingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR _rayTraversalPrimitiveCulling(MemorySegment src) { return _rayTraversalPrimitiveCullingAt(0L, src); }
}
