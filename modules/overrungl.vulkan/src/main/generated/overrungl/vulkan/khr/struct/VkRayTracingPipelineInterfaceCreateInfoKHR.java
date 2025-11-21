// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRayTracingPipelineInterfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkRayTracingPipelineInterfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxPipelineRayPayloadSize;
///     uint32_t maxPipelineRayHitAttributeSize;
/// }
/// ```
public final class VkRayTracingPipelineInterfaceCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayHitAttributeSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxPipelineRayPayloadSize = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayPayloadSize"));
    public static final long OFFSET_maxPipelineRayHitAttributeSize = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayHitAttributeSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxPipelineRayPayloadSize = LAYOUT.select(PathElement.groupElement("maxPipelineRayPayloadSize"));
    public static final MemoryLayout LAYOUT_maxPipelineRayHitAttributeSize = LAYOUT.select(PathElement.groupElement("maxPipelineRayHitAttributeSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxPipelineRayPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayPayloadSize"));
    public static final VarHandle VH_maxPipelineRayHitAttributeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayHitAttributeSize"));

    public VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR); }
    public static VkRayTracingPipelineInterfaceCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
        return s;
    }
    public VkRayTracingPipelineInterfaceCreateInfoKHR copyFrom(VkRayTracingPipelineInterfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR reinterpret(long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR asSlice(long index) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR asSlice(long index, long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR at(long index, Consumer<VkRayTracingPipelineInterfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxPipelineRayPayloadSizeAt(long index) { return (int) VH_maxPipelineRayPayloadSize.get(this.segment(), 0L, index); }
    public int maxPipelineRayHitAttributeSizeAt(long index) { return (int) VH_maxPipelineRayHitAttributeSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxPipelineRayPayloadSize() { return (int) VH_maxPipelineRayPayloadSize.get(this.segment(), 0L, 0L); }
    public int maxPipelineRayHitAttributeSize() { return (int) VH_maxPipelineRayHitAttributeSize.get(this.segment(), 0L, 0L); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSizeAt(long index, int value) { VH_maxPipelineRayPayloadSize.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSizeAt(long index, int value) { VH_maxPipelineRayHitAttributeSize.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSize(int value) { VH_maxPipelineRayPayloadSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSize(int value) { VH_maxPipelineRayHitAttributeSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxPipelineRayPayloadSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPipelineRayPayloadSize, index), LAYOUT_maxPipelineRayPayloadSize); }
    public MemorySegment _maxPipelineRayPayloadSize() { return _maxPipelineRayPayloadSizeAt(0L); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _maxPipelineRayPayloadSizeAt(long index, MemorySegment src) { _maxPipelineRayPayloadSizeAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _maxPipelineRayPayloadSize(MemorySegment src) { return _maxPipelineRayPayloadSizeAt(0L, src); }
    public MemorySegment _maxPipelineRayHitAttributeSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPipelineRayHitAttributeSize, index), LAYOUT_maxPipelineRayHitAttributeSize); }
    public MemorySegment _maxPipelineRayHitAttributeSize() { return _maxPipelineRayHitAttributeSizeAt(0L); }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _maxPipelineRayHitAttributeSizeAt(long index, MemorySegment src) { _maxPipelineRayHitAttributeSizeAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineInterfaceCreateInfoKHR _maxPipelineRayHitAttributeSize(MemorySegment src) { return _maxPipelineRayHitAttributeSizeAt(0L, src); }
}
