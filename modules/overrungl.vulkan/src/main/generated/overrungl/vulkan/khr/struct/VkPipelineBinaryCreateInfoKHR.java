// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const VkPipelineBinaryKeysAndDataKHR* pKeysAndDataInfo;
///     VkPipeline pipeline;
///     const VkPipelineCreateInfoKHR* pPipelineCreateInfo;
/// }
/// ```
public final class VkPipelineBinaryCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pKeysAndDataInfo"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.ADDRESS.withName("pPipelineCreateInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pKeysAndDataInfo = LAYOUT.byteOffset(PathElement.groupElement("pKeysAndDataInfo"));
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    public static final long OFFSET_pPipelineCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreateInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pKeysAndDataInfo = LAYOUT.select(PathElement.groupElement("pKeysAndDataInfo"));
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    public static final MemoryLayout LAYOUT_pPipelineCreateInfo = LAYOUT.select(PathElement.groupElement("pPipelineCreateInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pKeysAndDataInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pKeysAndDataInfo"));
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    public static final VarHandle VH_pPipelineCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreateInfo"));

    public VkPipelineBinaryCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineBinaryCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR); }
    public static VkPipelineBinaryCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR);
        return s;
    }
    public VkPipelineBinaryCreateInfoKHR copyFrom(VkPipelineBinaryCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryCreateInfoKHR reinterpret(long count) { return new VkPipelineBinaryCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryCreateInfoKHR asSlice(long index) { return new VkPipelineBinaryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryCreateInfoKHR asSlice(long index, long count) { return new VkPipelineBinaryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryCreateInfoKHR at(long index, Consumer<VkPipelineBinaryCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pKeysAndDataInfoAt(long index) { return (MemorySegment) VH_pKeysAndDataInfo.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineCreateInfoAt(long index) { return (MemorySegment) VH_pPipelineCreateInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pKeysAndDataInfo() { return (MemorySegment) VH_pKeysAndDataInfo.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineCreateInfo() { return (MemorySegment) VH_pPipelineCreateInfo.get(this.segment(), 0L, 0L); }
    public VkPipelineBinaryCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfoAt(long index, MemorySegment value) { VH_pKeysAndDataInfo.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfoAt(long index, MemorySegment value) { VH_pPipelineCreateInfo.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfo(MemorySegment value) { VH_pKeysAndDataInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfo(MemorySegment value) { VH_pPipelineCreateInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineBinaryCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineBinaryCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pKeysAndDataInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pKeysAndDataInfo, index), LAYOUT_pKeysAndDataInfo); }
    public MemorySegment _pKeysAndDataInfo() { return _pKeysAndDataInfoAt(0L); }
    public VkPipelineBinaryCreateInfoKHR _pKeysAndDataInfoAt(long index, MemorySegment src) { _pKeysAndDataInfoAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryCreateInfoKHR _pKeysAndDataInfo(MemorySegment src) { return _pKeysAndDataInfoAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkPipelineBinaryCreateInfoKHR _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryCreateInfoKHR _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
    public MemorySegment _pPipelineCreateInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineCreateInfo, index), LAYOUT_pPipelineCreateInfo); }
    public MemorySegment _pPipelineCreateInfo() { return _pPipelineCreateInfoAt(0L); }
    public VkPipelineBinaryCreateInfoKHR _pPipelineCreateInfoAt(long index, MemorySegment src) { _pPipelineCreateInfoAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryCreateInfoKHR _pPipelineCreateInfo(MemorySegment src) { return _pPipelineCreateInfoAt(0L, src); }
}
