// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteIndirectExecutionSetPipelineEXT`.
/// ## Layout
/// ```
/// struct VkWriteIndirectExecutionSetPipelineEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t index;
///     VkPipeline pipeline;
/// }
/// ```
public final class VkWriteIndirectExecutionSetPipelineEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.JAVA_LONG.withName("pipeline")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));

    public VkWriteIndirectExecutionSetPipelineEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteIndirectExecutionSetPipelineEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetPipelineEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteIndirectExecutionSetPipelineEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetPipelineEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteIndirectExecutionSetPipelineEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetPipelineEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteIndirectExecutionSetPipelineEXT alloc(SegmentAllocator allocator) { return new VkWriteIndirectExecutionSetPipelineEXT(allocator.allocate(LAYOUT), 1); }
    public static VkWriteIndirectExecutionSetPipelineEXT alloc(SegmentAllocator allocator, long count) { return new VkWriteIndirectExecutionSetPipelineEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteIndirectExecutionSetPipelineEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT); }
    public static VkWriteIndirectExecutionSetPipelineEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT);
        return s;
    }
    public VkWriteIndirectExecutionSetPipelineEXT copyFrom(VkWriteIndirectExecutionSetPipelineEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT reinterpret(long count) { return new VkWriteIndirectExecutionSetPipelineEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteIndirectExecutionSetPipelineEXT asSlice(long index) { return new VkWriteIndirectExecutionSetPipelineEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteIndirectExecutionSetPipelineEXT asSlice(long index, long count) { return new VkWriteIndirectExecutionSetPipelineEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteIndirectExecutionSetPipelineEXT at(long index, Consumer<VkWriteIndirectExecutionSetPipelineEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int indexAt(long index) { return (int) VH_index.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int index() { return (int) VH_index.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public VkWriteIndirectExecutionSetPipelineEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT indexAt(long index, int value) { VH_index.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT index(int value) { VH_index.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteIndirectExecutionSetPipelineEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteIndirectExecutionSetPipelineEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_index, index), LAYOUT_index); }
    public MemorySegment _index() { return _indexAt(0L); }
    public VkWriteIndirectExecutionSetPipelineEXT _indexAt(long index, MemorySegment src) { _indexAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT _index(MemorySegment src) { return _indexAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkWriteIndirectExecutionSetPipelineEXT _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetPipelineEXT _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
}
