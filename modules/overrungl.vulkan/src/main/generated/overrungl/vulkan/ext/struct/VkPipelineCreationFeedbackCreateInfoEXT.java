// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCreationFeedbackCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineCreationFeedbackCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreationFeedback* pPipelineCreationFeedback;
///     uint32_t pipelineStageCreationFeedbackCount;
///     VkPipelineCreationFeedback* pPipelineStageCreationFeedbacks;
/// }
/// ```
public final class VkPipelineCreationFeedbackCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPipelineCreationFeedback"),
        ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
        ValueLayout.ADDRESS.withName("pPipelineStageCreationFeedbacks")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pPipelineCreationFeedback = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreationFeedback"));
    public static final long OFFSET_pipelineStageCreationFeedbackCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    public static final long OFFSET_pPipelineStageCreationFeedbacks = LAYOUT.byteOffset(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pPipelineCreationFeedback = LAYOUT.select(PathElement.groupElement("pPipelineCreationFeedback"));
    public static final MemoryLayout LAYOUT_pipelineStageCreationFeedbackCount = LAYOUT.select(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    public static final MemoryLayout LAYOUT_pPipelineStageCreationFeedbacks = LAYOUT.select(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pPipelineCreationFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreationFeedback"));
    public static final VarHandle VH_pipelineStageCreationFeedbackCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    public static final VarHandle VH_pPipelineStageCreationFeedbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineStageCreationFeedbacks"));

    public VkPipelineCreationFeedbackCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCreationFeedbackCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineCreationFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO); }
    public static VkPipelineCreationFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO);
        return s;
    }
    public VkPipelineCreationFeedbackCreateInfoEXT copyFrom(VkPipelineCreationFeedbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT reinterpret(long count) { return new VkPipelineCreationFeedbackCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCreationFeedbackCreateInfoEXT asSlice(long index) { return new VkPipelineCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCreationFeedbackCreateInfoEXT asSlice(long index, long count) { return new VkPipelineCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCreationFeedbackCreateInfoEXT at(long index, Consumer<VkPipelineCreationFeedbackCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineCreationFeedbackAt(long index) { return (MemorySegment) VH_pPipelineCreationFeedback.get(this.segment(), 0L, index); }
    public int pipelineStageCreationFeedbackCountAt(long index) { return (int) VH_pipelineStageCreationFeedbackCount.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineStageCreationFeedbacksAt(long index) { return (MemorySegment) VH_pPipelineStageCreationFeedbacks.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineCreationFeedback() { return (MemorySegment) VH_pPipelineCreationFeedback.get(this.segment(), 0L, 0L); }
    public int pipelineStageCreationFeedbackCount() { return (int) VH_pipelineStageCreationFeedbackCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineStageCreationFeedbacks() { return (MemorySegment) VH_pPipelineStageCreationFeedbacks.get(this.segment(), 0L, 0L); }
    public VkPipelineCreationFeedbackCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedbackAt(long index, MemorySegment value) { VH_pPipelineCreationFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pipelineStageCreationFeedbackCountAt(long index, int value) { VH_pipelineStageCreationFeedbackCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacksAt(long index, MemorySegment value) { VH_pPipelineStageCreationFeedbacks.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedback(MemorySegment value) { VH_pPipelineCreationFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pipelineStageCreationFeedbackCount(int value) { VH_pipelineStageCreationFeedbackCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacks(MemorySegment value) { VH_pPipelineStageCreationFeedbacks.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineCreationFeedbackCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineCreationFeedbackCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pPipelineCreationFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineCreationFeedback, index), LAYOUT_pPipelineCreationFeedback); }
    public MemorySegment _pPipelineCreationFeedback() { return _pPipelineCreationFeedbackAt(0L); }
    public VkPipelineCreationFeedbackCreateInfoEXT _pPipelineCreationFeedbackAt(long index, MemorySegment src) { _pPipelineCreationFeedbackAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT _pPipelineCreationFeedback(MemorySegment src) { return _pPipelineCreationFeedbackAt(0L, src); }
    public MemorySegment _pipelineStageCreationFeedbackCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineStageCreationFeedbackCount, index), LAYOUT_pipelineStageCreationFeedbackCount); }
    public MemorySegment _pipelineStageCreationFeedbackCount() { return _pipelineStageCreationFeedbackCountAt(0L); }
    public VkPipelineCreationFeedbackCreateInfoEXT _pipelineStageCreationFeedbackCountAt(long index, MemorySegment src) { _pipelineStageCreationFeedbackCountAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT _pipelineStageCreationFeedbackCount(MemorySegment src) { return _pipelineStageCreationFeedbackCountAt(0L, src); }
    public MemorySegment _pPipelineStageCreationFeedbacksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineStageCreationFeedbacks, index), LAYOUT_pPipelineStageCreationFeedbacks); }
    public MemorySegment _pPipelineStageCreationFeedbacks() { return _pPipelineStageCreationFeedbacksAt(0L); }
    public VkPipelineCreationFeedbackCreateInfoEXT _pPipelineStageCreationFeedbacksAt(long index, MemorySegment src) { _pPipelineStageCreationFeedbacksAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackCreateInfoEXT _pPipelineStageCreationFeedbacks(MemorySegment src) { return _pPipelineStageCreationFeedbacksAt(0L, src); }
}
