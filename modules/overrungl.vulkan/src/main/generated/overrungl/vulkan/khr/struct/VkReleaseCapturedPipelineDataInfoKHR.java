// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkReleaseCapturedPipelineDataInfoKHR`.
/// ## Layout
/// ```
/// struct VkReleaseCapturedPipelineDataInfoKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPipeline pipeline;
/// }
/// ```
public final class VkReleaseCapturedPipelineDataInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("pipeline")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));

    public VkReleaseCapturedPipelineDataInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkReleaseCapturedPipelineDataInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseCapturedPipelineDataInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkReleaseCapturedPipelineDataInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseCapturedPipelineDataInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkReleaseCapturedPipelineDataInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseCapturedPipelineDataInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkReleaseCapturedPipelineDataInfoKHR alloc(SegmentAllocator allocator) { return new VkReleaseCapturedPipelineDataInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkReleaseCapturedPipelineDataInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkReleaseCapturedPipelineDataInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkReleaseCapturedPipelineDataInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR); }
    public static VkReleaseCapturedPipelineDataInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR);
        return s;
    }
    public VkReleaseCapturedPipelineDataInfoKHR copyFrom(VkReleaseCapturedPipelineDataInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR reinterpret(long count) { return new VkReleaseCapturedPipelineDataInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkReleaseCapturedPipelineDataInfoKHR asSlice(long index) { return new VkReleaseCapturedPipelineDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkReleaseCapturedPipelineDataInfoKHR asSlice(long index, long count) { return new VkReleaseCapturedPipelineDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkReleaseCapturedPipelineDataInfoKHR at(long index, Consumer<VkReleaseCapturedPipelineDataInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public VkReleaseCapturedPipelineDataInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkReleaseCapturedPipelineDataInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkReleaseCapturedPipelineDataInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkReleaseCapturedPipelineDataInfoKHR _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkReleaseCapturedPipelineDataInfoKHR _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
}
