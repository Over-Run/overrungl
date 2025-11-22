// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineExecutableInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineExecutableInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipeline pipeline;
///     uint32_t executableIndex;
/// }
/// ```
public final class VkPipelineExecutableInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    public static final long OFFSET_executableIndex = LAYOUT.byteOffset(PathElement.groupElement("executableIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    public static final MemoryLayout LAYOUT_executableIndex = LAYOUT.select(PathElement.groupElement("executableIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    public static final VarHandle VH_executableIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executableIndex"));

    public VkPipelineExecutableInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineExecutableInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineExecutableInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR); }
    public static VkPipelineExecutableInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR);
        return s;
    }
    public VkPipelineExecutableInfoKHR copyFrom(VkPipelineExecutableInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineExecutableInfoKHR reinterpret(long count) { return new VkPipelineExecutableInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineExecutableInfoKHR asSlice(long index) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineExecutableInfoKHR asSlice(long index, long count) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineExecutableInfoKHR at(long index, Consumer<VkPipelineExecutableInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public int executableIndexAt(long index) { return (int) VH_executableIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public int executableIndex() { return (int) VH_executableIndex.get(this.segment(), 0L, 0L); }
    public VkPipelineExecutableInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInfoKHR pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInfoKHR executableIndexAt(long index, int value) { VH_executableIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInfoKHR pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInfoKHR executableIndex(int value) { VH_executableIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineExecutableInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineExecutableInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkPipelineExecutableInfoKHR _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInfoKHR _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
    public MemorySegment _executableIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_executableIndex, index), LAYOUT_executableIndex); }
    public MemorySegment _executableIndex() { return _executableIndexAt(0L); }
    public VkPipelineExecutableInfoKHR _executableIndexAt(long index, MemorySegment src) { _executableIndexAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInfoKHR _executableIndex(MemorySegment src) { return _executableIndexAt(0L, src); }
}
