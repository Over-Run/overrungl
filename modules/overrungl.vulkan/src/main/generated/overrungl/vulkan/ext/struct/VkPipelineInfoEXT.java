// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipeline pipeline;
/// }
/// ```
public final class VkPipelineInfoEXT extends GroupType {
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

    public VkPipelineInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR); }
    public static VkPipelineInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR);
        return s;
    }
    public VkPipelineInfoEXT copyFrom(VkPipelineInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineInfoEXT reinterpret(long count) { return new VkPipelineInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineInfoEXT asSlice(long index) { return new VkPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineInfoEXT asSlice(long index, long count) { return new VkPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineInfoEXT at(long index, Consumer<VkPipelineInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public VkPipelineInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInfoEXT pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineInfoEXT pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkPipelineInfoEXT _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkPipelineInfoEXT _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
}
