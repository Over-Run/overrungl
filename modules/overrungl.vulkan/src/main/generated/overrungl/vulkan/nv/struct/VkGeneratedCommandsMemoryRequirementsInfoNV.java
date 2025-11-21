// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeneratedCommandsMemoryRequirementsInfoNV`.
/// ## Layout
/// ```
/// struct VkGeneratedCommandsMemoryRequirementsInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
///     VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t maxSequencesCount;
/// }
/// ```
public final class VkGeneratedCommandsMemoryRequirementsInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("maxSequencesCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    public static final long OFFSET_maxSequencesCount = LAYOUT.byteOffset(PathElement.groupElement("maxSequencesCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    public static final MemoryLayout LAYOUT_maxSequencesCount = LAYOUT.select(PathElement.groupElement("maxSequencesCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    public static final VarHandle VH_maxSequencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequencesCount"));

    public VkGeneratedCommandsMemoryRequirementsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV); }
    public static VkGeneratedCommandsMemoryRequirementsInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV);
        return s;
    }
    public VkGeneratedCommandsMemoryRequirementsInfoNV copyFrom(VkGeneratedCommandsMemoryRequirementsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV reinterpret(long count) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV asSlice(long index) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV asSlice(long index, long count) { return new VkGeneratedCommandsMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV at(long index, Consumer<VkGeneratedCommandsMemoryRequirementsInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineBindPointAt(long index) { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public long indirectCommandsLayoutAt(long index) { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, index); }
    public int maxSequencesCountAt(long index) { return (int) VH_maxSequencesCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineBindPoint() { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public long indirectCommandsLayout() { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, 0L); }
    public int maxSequencesCount() { return (int) VH_maxSequencesCount.get(this.segment(), 0L, 0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPointAt(long index, int value) { VH_pipelineBindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayoutAt(long index, long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCountAt(long index, int value) { VH_maxSequencesCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPoint(int value) { VH_pipelineBindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayout(long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCount(int value) { VH_maxSequencesCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineBindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBindPoint, index), LAYOUT_pipelineBindPoint); }
    public MemorySegment _pipelineBindPoint() { return _pipelineBindPointAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _pipelineBindPointAt(long index, MemorySegment src) { _pipelineBindPointAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _pipelineBindPoint(MemorySegment src) { return _pipelineBindPointAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
    public MemorySegment _indirectCommandsLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectCommandsLayout, index), LAYOUT_indirectCommandsLayout); }
    public MemorySegment _indirectCommandsLayout() { return _indirectCommandsLayoutAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _indirectCommandsLayoutAt(long index, MemorySegment src) { _indirectCommandsLayoutAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _indirectCommandsLayout(MemorySegment src) { return _indirectCommandsLayoutAt(0L, src); }
    public MemorySegment _maxSequencesCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSequencesCount, index), LAYOUT_maxSequencesCount); }
    public MemorySegment _maxSequencesCount() { return _maxSequencesCountAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _maxSequencesCountAt(long index, MemorySegment src) { _maxSequencesCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoNV _maxSequencesCount(MemorySegment src) { return _maxSequencesCountAt(0L, src); }
}
