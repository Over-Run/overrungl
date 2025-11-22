// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectExecutionSetPipelineInfoEXT`.
/// ## Layout
/// ```
/// struct VkIndirectExecutionSetPipelineInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipeline initialPipeline;
///     uint32_t maxPipelineCount;
/// }
/// ```
public final class VkIndirectExecutionSetPipelineInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("initialPipeline"),
        ValueLayout.JAVA_INT.withName("maxPipelineCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_initialPipeline = LAYOUT.byteOffset(PathElement.groupElement("initialPipeline"));
    public static final long OFFSET_maxPipelineCount = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_initialPipeline = LAYOUT.select(PathElement.groupElement("initialPipeline"));
    public static final MemoryLayout LAYOUT_maxPipelineCount = LAYOUT.select(PathElement.groupElement("maxPipelineCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_initialPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialPipeline"));
    public static final VarHandle VH_maxPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineCount"));

    public VkIndirectExecutionSetPipelineInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectExecutionSetPipelineInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectExecutionSetPipelineInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectExecutionSetPipelineInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectExecutionSetPipelineInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetPipelineInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectExecutionSetPipelineInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetPipelineInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectExecutionSetPipelineInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT); }
    public static VkIndirectExecutionSetPipelineInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT);
        return s;
    }
    public VkIndirectExecutionSetPipelineInfoEXT copyFrom(VkIndirectExecutionSetPipelineInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectExecutionSetPipelineInfoEXT asSlice(long index) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectExecutionSetPipelineInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectExecutionSetPipelineInfoEXT at(long index, Consumer<VkIndirectExecutionSetPipelineInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long initialPipelineAt(long index) { return (long) VH_initialPipeline.get(this.segment(), 0L, index); }
    public int maxPipelineCountAt(long index) { return (int) VH_maxPipelineCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long initialPipeline() { return (long) VH_initialPipeline.get(this.segment(), 0L, 0L); }
    public int maxPipelineCount() { return (int) VH_maxPipelineCount.get(this.segment(), 0L, 0L); }
    public VkIndirectExecutionSetPipelineInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT initialPipelineAt(long index, long value) { VH_initialPipeline.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCountAt(long index, int value) { VH_maxPipelineCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(long value) { VH_initialPipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(int value) { VH_maxPipelineCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectExecutionSetPipelineInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectExecutionSetPipelineInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _initialPipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialPipeline, index), LAYOUT_initialPipeline); }
    public MemorySegment _initialPipeline() { return _initialPipelineAt(0L); }
    public VkIndirectExecutionSetPipelineInfoEXT _initialPipelineAt(long index, MemorySegment src) { _initialPipelineAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT _initialPipeline(MemorySegment src) { return _initialPipelineAt(0L, src); }
    public MemorySegment _maxPipelineCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPipelineCount, index), LAYOUT_maxPipelineCount); }
    public MemorySegment _maxPipelineCount() { return _maxPipelineCountAt(0L); }
    public VkIndirectExecutionSetPipelineInfoEXT _maxPipelineCountAt(long index, MemorySegment src) { _maxPipelineCountAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetPipelineInfoEXT _maxPipelineCount(MemorySegment src) { return _maxPipelineCountAt(0L, src); }
}
