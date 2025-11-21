// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRayRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint32_t shaderGroupHandleCaptureReplaySize;
///     uint32_t maxRayDispatchInvocationCount;
///     uint32_t shaderGroupHandleAlignment;
///     uint32_t maxRayHitAttributeSize;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRayRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleCaptureReplaySize"),
        ValueLayout.JAVA_INT.withName("maxRayDispatchInvocationCount"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleAlignment"),
        ValueLayout.JAVA_INT.withName("maxRayHitAttributeSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderGroupHandleSize = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleSize"));
    public static final long OFFSET_maxRayRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxRayRecursionDepth"));
    public static final long OFFSET_maxShaderGroupStride = LAYOUT.byteOffset(PathElement.groupElement("maxShaderGroupStride"));
    public static final long OFFSET_shaderGroupBaseAlignment = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupBaseAlignment"));
    public static final long OFFSET_shaderGroupHandleCaptureReplaySize = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    public static final long OFFSET_maxRayDispatchInvocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxRayDispatchInvocationCount"));
    public static final long OFFSET_shaderGroupHandleAlignment = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleAlignment"));
    public static final long OFFSET_maxRayHitAttributeSize = LAYOUT.byteOffset(PathElement.groupElement("maxRayHitAttributeSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderGroupHandleSize = LAYOUT.select(PathElement.groupElement("shaderGroupHandleSize"));
    public static final MemoryLayout LAYOUT_maxRayRecursionDepth = LAYOUT.select(PathElement.groupElement("maxRayRecursionDepth"));
    public static final MemoryLayout LAYOUT_maxShaderGroupStride = LAYOUT.select(PathElement.groupElement("maxShaderGroupStride"));
    public static final MemoryLayout LAYOUT_shaderGroupBaseAlignment = LAYOUT.select(PathElement.groupElement("shaderGroupBaseAlignment"));
    public static final MemoryLayout LAYOUT_shaderGroupHandleCaptureReplaySize = LAYOUT.select(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    public static final MemoryLayout LAYOUT_maxRayDispatchInvocationCount = LAYOUT.select(PathElement.groupElement("maxRayDispatchInvocationCount"));
    public static final MemoryLayout LAYOUT_shaderGroupHandleAlignment = LAYOUT.select(PathElement.groupElement("shaderGroupHandleAlignment"));
    public static final MemoryLayout LAYOUT_maxRayHitAttributeSize = LAYOUT.select(PathElement.groupElement("maxRayHitAttributeSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderGroupHandleSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleSize"));
    public static final VarHandle VH_maxRayRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayRecursionDepth"));
    public static final VarHandle VH_maxShaderGroupStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderGroupStride"));
    public static final VarHandle VH_shaderGroupBaseAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
    public static final VarHandle VH_shaderGroupHandleCaptureReplaySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    public static final VarHandle VH_maxRayDispatchInvocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayDispatchInvocationCount"));
    public static final VarHandle VH_shaderGroupHandleAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleAlignment"));
    public static final VarHandle VH_maxRayHitAttributeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayHitAttributeSize"));

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR); }
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR copyFrom(VkPhysicalDeviceRayTracingPipelinePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR at(long index, Consumer<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderGroupHandleSizeAt(long index) { return (int) VH_shaderGroupHandleSize.get(this.segment(), 0L, index); }
    public int maxRayRecursionDepthAt(long index) { return (int) VH_maxRayRecursionDepth.get(this.segment(), 0L, index); }
    public int maxShaderGroupStrideAt(long index) { return (int) VH_maxShaderGroupStride.get(this.segment(), 0L, index); }
    public int shaderGroupBaseAlignmentAt(long index) { return (int) VH_shaderGroupBaseAlignment.get(this.segment(), 0L, index); }
    public int shaderGroupHandleCaptureReplaySizeAt(long index) { return (int) VH_shaderGroupHandleCaptureReplaySize.get(this.segment(), 0L, index); }
    public int maxRayDispatchInvocationCountAt(long index) { return (int) VH_maxRayDispatchInvocationCount.get(this.segment(), 0L, index); }
    public int shaderGroupHandleAlignmentAt(long index) { return (int) VH_shaderGroupHandleAlignment.get(this.segment(), 0L, index); }
    public int maxRayHitAttributeSizeAt(long index) { return (int) VH_maxRayHitAttributeSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderGroupHandleSize() { return (int) VH_shaderGroupHandleSize.get(this.segment(), 0L, 0L); }
    public int maxRayRecursionDepth() { return (int) VH_maxRayRecursionDepth.get(this.segment(), 0L, 0L); }
    public int maxShaderGroupStride() { return (int) VH_maxShaderGroupStride.get(this.segment(), 0L, 0L); }
    public int shaderGroupBaseAlignment() { return (int) VH_shaderGroupBaseAlignment.get(this.segment(), 0L, 0L); }
    public int shaderGroupHandleCaptureReplaySize() { return (int) VH_shaderGroupHandleCaptureReplaySize.get(this.segment(), 0L, 0L); }
    public int maxRayDispatchInvocationCount() { return (int) VH_maxRayDispatchInvocationCount.get(this.segment(), 0L, 0L); }
    public int shaderGroupHandleAlignment() { return (int) VH_shaderGroupHandleAlignment.get(this.segment(), 0L, 0L); }
    public int maxRayHitAttributeSize() { return (int) VH_maxRayHitAttributeSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleSizeAt(long index, int value) { VH_shaderGroupHandleSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayRecursionDepthAt(long index, int value) { VH_maxRayRecursionDepth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxShaderGroupStrideAt(long index, int value) { VH_maxShaderGroupStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupBaseAlignmentAt(long index, int value) { VH_shaderGroupBaseAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleCaptureReplaySizeAt(long index, int value) { VH_shaderGroupHandleCaptureReplaySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayDispatchInvocationCountAt(long index, int value) { VH_maxRayDispatchInvocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleAlignmentAt(long index, int value) { VH_shaderGroupHandleAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayHitAttributeSizeAt(long index, int value) { VH_maxRayHitAttributeSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleSize(int value) { VH_shaderGroupHandleSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayRecursionDepth(int value) { VH_maxRayRecursionDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxShaderGroupStride(int value) { VH_maxShaderGroupStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupBaseAlignment(int value) { VH_shaderGroupBaseAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleCaptureReplaySize(int value) { VH_shaderGroupHandleCaptureReplaySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayDispatchInvocationCount(int value) { VH_maxRayDispatchInvocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleAlignment(int value) { VH_shaderGroupHandleAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayHitAttributeSize(int value) { VH_maxRayHitAttributeSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderGroupHandleSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderGroupHandleSize, index), LAYOUT_shaderGroupHandleSize); }
    public MemorySegment _shaderGroupHandleSize() { return _shaderGroupHandleSizeAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupHandleSizeAt(long index, MemorySegment src) { _shaderGroupHandleSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupHandleSize(MemorySegment src) { return _shaderGroupHandleSizeAt(0L, src); }
    public MemorySegment _maxRayRecursionDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRayRecursionDepth, index), LAYOUT_maxRayRecursionDepth); }
    public MemorySegment _maxRayRecursionDepth() { return _maxRayRecursionDepthAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxRayRecursionDepthAt(long index, MemorySegment src) { _maxRayRecursionDepthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxRayRecursionDepth(MemorySegment src) { return _maxRayRecursionDepthAt(0L, src); }
    public MemorySegment _maxShaderGroupStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxShaderGroupStride, index), LAYOUT_maxShaderGroupStride); }
    public MemorySegment _maxShaderGroupStride() { return _maxShaderGroupStrideAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxShaderGroupStrideAt(long index, MemorySegment src) { _maxShaderGroupStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxShaderGroupStride(MemorySegment src) { return _maxShaderGroupStrideAt(0L, src); }
    public MemorySegment _shaderGroupBaseAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderGroupBaseAlignment, index), LAYOUT_shaderGroupBaseAlignment); }
    public MemorySegment _shaderGroupBaseAlignment() { return _shaderGroupBaseAlignmentAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupBaseAlignmentAt(long index, MemorySegment src) { _shaderGroupBaseAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupBaseAlignment(MemorySegment src) { return _shaderGroupBaseAlignmentAt(0L, src); }
    public MemorySegment _shaderGroupHandleCaptureReplaySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderGroupHandleCaptureReplaySize, index), LAYOUT_shaderGroupHandleCaptureReplaySize); }
    public MemorySegment _shaderGroupHandleCaptureReplaySize() { return _shaderGroupHandleCaptureReplaySizeAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupHandleCaptureReplaySizeAt(long index, MemorySegment src) { _shaderGroupHandleCaptureReplaySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupHandleCaptureReplaySize(MemorySegment src) { return _shaderGroupHandleCaptureReplaySizeAt(0L, src); }
    public MemorySegment _maxRayDispatchInvocationCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRayDispatchInvocationCount, index), LAYOUT_maxRayDispatchInvocationCount); }
    public MemorySegment _maxRayDispatchInvocationCount() { return _maxRayDispatchInvocationCountAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxRayDispatchInvocationCountAt(long index, MemorySegment src) { _maxRayDispatchInvocationCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxRayDispatchInvocationCount(MemorySegment src) { return _maxRayDispatchInvocationCountAt(0L, src); }
    public MemorySegment _shaderGroupHandleAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderGroupHandleAlignment, index), LAYOUT_shaderGroupHandleAlignment); }
    public MemorySegment _shaderGroupHandleAlignment() { return _shaderGroupHandleAlignmentAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupHandleAlignmentAt(long index, MemorySegment src) { _shaderGroupHandleAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _shaderGroupHandleAlignment(MemorySegment src) { return _shaderGroupHandleAlignmentAt(0L, src); }
    public MemorySegment _maxRayHitAttributeSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRayHitAttributeSize, index), LAYOUT_maxRayHitAttributeSize); }
    public MemorySegment _maxRayHitAttributeSize() { return _maxRayHitAttributeSizeAt(0L); }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxRayHitAttributeSizeAt(long index, MemorySegment src) { _maxRayHitAttributeSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR _maxRayHitAttributeSize(MemorySegment src) { return _maxRayHitAttributeSizeAt(0L, src); }
}
