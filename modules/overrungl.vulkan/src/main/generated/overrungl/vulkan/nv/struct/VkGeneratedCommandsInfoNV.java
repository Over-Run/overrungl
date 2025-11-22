// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeneratedCommandsInfoNV`.
/// ## Layout
/// ```
/// struct VkGeneratedCommandsInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
///     VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t streamCount;
///     const VkIndirectCommandsStreamNV* pStreams;
///     uint32_t sequencesCount;
///     VkBuffer preprocessBuffer;
///     VkDeviceSize preprocessOffset;
///     VkDeviceSize preprocessSize;
///     VkBuffer sequencesCountBuffer;
///     VkDeviceSize sequencesCountOffset;
///     VkBuffer sequencesIndexBuffer;
///     VkDeviceSize sequencesIndexOffset;
/// }
/// ```
public final class VkGeneratedCommandsInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withName("pStreams"),
        ValueLayout.JAVA_INT.withName("sequencesCount"),
        ValueLayout.JAVA_LONG.withName("preprocessBuffer"),
        ValueLayout.JAVA_LONG.withName("preprocessOffset"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.JAVA_LONG.withName("sequencesCountBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesCountOffset"),
        ValueLayout.JAVA_LONG.withName("sequencesIndexBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesIndexOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    public static final long OFFSET_streamCount = LAYOUT.byteOffset(PathElement.groupElement("streamCount"));
    public static final long OFFSET_pStreams = LAYOUT.byteOffset(PathElement.groupElement("pStreams"));
    public static final long OFFSET_sequencesCount = LAYOUT.byteOffset(PathElement.groupElement("sequencesCount"));
    public static final long OFFSET_preprocessBuffer = LAYOUT.byteOffset(PathElement.groupElement("preprocessBuffer"));
    public static final long OFFSET_preprocessOffset = LAYOUT.byteOffset(PathElement.groupElement("preprocessOffset"));
    public static final long OFFSET_preprocessSize = LAYOUT.byteOffset(PathElement.groupElement("preprocessSize"));
    public static final long OFFSET_sequencesCountBuffer = LAYOUT.byteOffset(PathElement.groupElement("sequencesCountBuffer"));
    public static final long OFFSET_sequencesCountOffset = LAYOUT.byteOffset(PathElement.groupElement("sequencesCountOffset"));
    public static final long OFFSET_sequencesIndexBuffer = LAYOUT.byteOffset(PathElement.groupElement("sequencesIndexBuffer"));
    public static final long OFFSET_sequencesIndexOffset = LAYOUT.byteOffset(PathElement.groupElement("sequencesIndexOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    public static final MemoryLayout LAYOUT_streamCount = LAYOUT.select(PathElement.groupElement("streamCount"));
    public static final MemoryLayout LAYOUT_pStreams = LAYOUT.select(PathElement.groupElement("pStreams"));
    public static final MemoryLayout LAYOUT_sequencesCount = LAYOUT.select(PathElement.groupElement("sequencesCount"));
    public static final MemoryLayout LAYOUT_preprocessBuffer = LAYOUT.select(PathElement.groupElement("preprocessBuffer"));
    public static final MemoryLayout LAYOUT_preprocessOffset = LAYOUT.select(PathElement.groupElement("preprocessOffset"));
    public static final MemoryLayout LAYOUT_preprocessSize = LAYOUT.select(PathElement.groupElement("preprocessSize"));
    public static final MemoryLayout LAYOUT_sequencesCountBuffer = LAYOUT.select(PathElement.groupElement("sequencesCountBuffer"));
    public static final MemoryLayout LAYOUT_sequencesCountOffset = LAYOUT.select(PathElement.groupElement("sequencesCountOffset"));
    public static final MemoryLayout LAYOUT_sequencesIndexBuffer = LAYOUT.select(PathElement.groupElement("sequencesIndexBuffer"));
    public static final MemoryLayout LAYOUT_sequencesIndexOffset = LAYOUT.select(PathElement.groupElement("sequencesIndexOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    public static final VarHandle VH_streamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamCount"));
    public static final VarHandle VH_pStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStreams"));
    public static final VarHandle VH_sequencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCount"));
    public static final VarHandle VH_preprocessBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessBuffer"));
    public static final VarHandle VH_preprocessOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessOffset"));
    public static final VarHandle VH_preprocessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessSize"));
    public static final VarHandle VH_sequencesCountBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCountBuffer"));
    public static final VarHandle VH_sequencesCountOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesCountOffset"));
    public static final VarHandle VH_sequencesIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesIndexBuffer"));
    public static final VarHandle VH_sequencesIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequencesIndexOffset"));

    public VkGeneratedCommandsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeneratedCommandsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeneratedCommandsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeneratedCommandsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeneratedCommandsInfoNV alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkGeneratedCommandsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV); }
    public static VkGeneratedCommandsInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV);
        return s;
    }
    public VkGeneratedCommandsInfoNV copyFrom(VkGeneratedCommandsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeneratedCommandsInfoNV reinterpret(long count) { return new VkGeneratedCommandsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeneratedCommandsInfoNV asSlice(long index) { return new VkGeneratedCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeneratedCommandsInfoNV asSlice(long index, long count) { return new VkGeneratedCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeneratedCommandsInfoNV at(long index, Consumer<VkGeneratedCommandsInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineBindPointAt(long index) { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, index); }
    public long pipelineAt(long index) { return (long) VH_pipeline.get(this.segment(), 0L, index); }
    public long indirectCommandsLayoutAt(long index) { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, index); }
    public int streamCountAt(long index) { return (int) VH_streamCount.get(this.segment(), 0L, index); }
    public MemorySegment pStreamsAt(long index) { return (MemorySegment) VH_pStreams.get(this.segment(), 0L, index); }
    public int sequencesCountAt(long index) { return (int) VH_sequencesCount.get(this.segment(), 0L, index); }
    public long preprocessBufferAt(long index) { return (long) VH_preprocessBuffer.get(this.segment(), 0L, index); }
    public long preprocessOffsetAt(long index) { return (long) VH_preprocessOffset.get(this.segment(), 0L, index); }
    public long preprocessSizeAt(long index) { return (long) VH_preprocessSize.get(this.segment(), 0L, index); }
    public long sequencesCountBufferAt(long index) { return (long) VH_sequencesCountBuffer.get(this.segment(), 0L, index); }
    public long sequencesCountOffsetAt(long index) { return (long) VH_sequencesCountOffset.get(this.segment(), 0L, index); }
    public long sequencesIndexBufferAt(long index) { return (long) VH_sequencesIndexBuffer.get(this.segment(), 0L, index); }
    public long sequencesIndexOffsetAt(long index) { return (long) VH_sequencesIndexOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineBindPoint() { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, 0L); }
    public long pipeline() { return (long) VH_pipeline.get(this.segment(), 0L, 0L); }
    public long indirectCommandsLayout() { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, 0L); }
    public int streamCount() { return (int) VH_streamCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStreams() { return (MemorySegment) VH_pStreams.get(this.segment(), 0L, 0L); }
    public int sequencesCount() { return (int) VH_sequencesCount.get(this.segment(), 0L, 0L); }
    public long preprocessBuffer() { return (long) VH_preprocessBuffer.get(this.segment(), 0L, 0L); }
    public long preprocessOffset() { return (long) VH_preprocessOffset.get(this.segment(), 0L, 0L); }
    public long preprocessSize() { return (long) VH_preprocessSize.get(this.segment(), 0L, 0L); }
    public long sequencesCountBuffer() { return (long) VH_sequencesCountBuffer.get(this.segment(), 0L, 0L); }
    public long sequencesCountOffset() { return (long) VH_sequencesCountOffset.get(this.segment(), 0L, 0L); }
    public long sequencesIndexBuffer() { return (long) VH_sequencesIndexBuffer.get(this.segment(), 0L, 0L); }
    public long sequencesIndexOffset() { return (long) VH_sequencesIndexOffset.get(this.segment(), 0L, 0L); }
    public VkGeneratedCommandsInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV pipelineBindPointAt(long index, int value) { VH_pipelineBindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV pipelineAt(long index, long value) { VH_pipeline.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV indirectCommandsLayoutAt(long index, long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV streamCountAt(long index, int value) { VH_streamCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV pStreamsAt(long index, MemorySegment value) { VH_pStreams.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesCountAt(long index, int value) { VH_sequencesCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV preprocessBufferAt(long index, long value) { VH_preprocessBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV preprocessOffsetAt(long index, long value) { VH_preprocessOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV preprocessSizeAt(long index, long value) { VH_preprocessSize.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesCountBufferAt(long index, long value) { VH_sequencesCountBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesCountOffsetAt(long index, long value) { VH_sequencesCountOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesIndexBufferAt(long index, long value) { VH_sequencesIndexBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesIndexOffsetAt(long index, long value) { VH_sequencesIndexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV pipelineBindPoint(int value) { VH_pipelineBindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV pipeline(long value) { VH_pipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV indirectCommandsLayout(long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV streamCount(int value) { VH_streamCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV pStreams(MemorySegment value) { VH_pStreams.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesCount(int value) { VH_sequencesCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV preprocessBuffer(long value) { VH_preprocessBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV preprocessOffset(long value) { VH_preprocessOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV preprocessSize(long value) { VH_preprocessSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesCountBuffer(long value) { VH_sequencesCountBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesCountOffset(long value) { VH_sequencesCountOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(long value) { VH_sequencesIndexBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoNV sequencesIndexOffset(long value) { VH_sequencesIndexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeneratedCommandsInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeneratedCommandsInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineBindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBindPoint, index), LAYOUT_pipelineBindPoint); }
    public MemorySegment _pipelineBindPoint() { return _pipelineBindPointAt(0L); }
    public VkGeneratedCommandsInfoNV _pipelineBindPointAt(long index, MemorySegment src) { _pipelineBindPointAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _pipelineBindPoint(MemorySegment src) { return _pipelineBindPointAt(0L, src); }
    public MemorySegment _pipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipeline, index), LAYOUT_pipeline); }
    public MemorySegment _pipeline() { return _pipelineAt(0L); }
    public VkGeneratedCommandsInfoNV _pipelineAt(long index, MemorySegment src) { _pipelineAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _pipeline(MemorySegment src) { return _pipelineAt(0L, src); }
    public MemorySegment _indirectCommandsLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectCommandsLayout, index), LAYOUT_indirectCommandsLayout); }
    public MemorySegment _indirectCommandsLayout() { return _indirectCommandsLayoutAt(0L); }
    public VkGeneratedCommandsInfoNV _indirectCommandsLayoutAt(long index, MemorySegment src) { _indirectCommandsLayoutAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _indirectCommandsLayout(MemorySegment src) { return _indirectCommandsLayoutAt(0L, src); }
    public MemorySegment _streamCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_streamCount, index), LAYOUT_streamCount); }
    public MemorySegment _streamCount() { return _streamCountAt(0L); }
    public VkGeneratedCommandsInfoNV _streamCountAt(long index, MemorySegment src) { _streamCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _streamCount(MemorySegment src) { return _streamCountAt(0L, src); }
    public MemorySegment _pStreamsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStreams, index), LAYOUT_pStreams); }
    public MemorySegment _pStreams() { return _pStreamsAt(0L); }
    public VkGeneratedCommandsInfoNV _pStreamsAt(long index, MemorySegment src) { _pStreamsAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _pStreams(MemorySegment src) { return _pStreamsAt(0L, src); }
    public MemorySegment _sequencesCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sequencesCount, index), LAYOUT_sequencesCount); }
    public MemorySegment _sequencesCount() { return _sequencesCountAt(0L); }
    public VkGeneratedCommandsInfoNV _sequencesCountAt(long index, MemorySegment src) { _sequencesCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _sequencesCount(MemorySegment src) { return _sequencesCountAt(0L, src); }
    public MemorySegment _preprocessBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preprocessBuffer, index), LAYOUT_preprocessBuffer); }
    public MemorySegment _preprocessBuffer() { return _preprocessBufferAt(0L); }
    public VkGeneratedCommandsInfoNV _preprocessBufferAt(long index, MemorySegment src) { _preprocessBufferAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _preprocessBuffer(MemorySegment src) { return _preprocessBufferAt(0L, src); }
    public MemorySegment _preprocessOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preprocessOffset, index), LAYOUT_preprocessOffset); }
    public MemorySegment _preprocessOffset() { return _preprocessOffsetAt(0L); }
    public VkGeneratedCommandsInfoNV _preprocessOffsetAt(long index, MemorySegment src) { _preprocessOffsetAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _preprocessOffset(MemorySegment src) { return _preprocessOffsetAt(0L, src); }
    public MemorySegment _preprocessSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preprocessSize, index), LAYOUT_preprocessSize); }
    public MemorySegment _preprocessSize() { return _preprocessSizeAt(0L); }
    public VkGeneratedCommandsInfoNV _preprocessSizeAt(long index, MemorySegment src) { _preprocessSizeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _preprocessSize(MemorySegment src) { return _preprocessSizeAt(0L, src); }
    public MemorySegment _sequencesCountBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sequencesCountBuffer, index), LAYOUT_sequencesCountBuffer); }
    public MemorySegment _sequencesCountBuffer() { return _sequencesCountBufferAt(0L); }
    public VkGeneratedCommandsInfoNV _sequencesCountBufferAt(long index, MemorySegment src) { _sequencesCountBufferAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _sequencesCountBuffer(MemorySegment src) { return _sequencesCountBufferAt(0L, src); }
    public MemorySegment _sequencesCountOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sequencesCountOffset, index), LAYOUT_sequencesCountOffset); }
    public MemorySegment _sequencesCountOffset() { return _sequencesCountOffsetAt(0L); }
    public VkGeneratedCommandsInfoNV _sequencesCountOffsetAt(long index, MemorySegment src) { _sequencesCountOffsetAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _sequencesCountOffset(MemorySegment src) { return _sequencesCountOffsetAt(0L, src); }
    public MemorySegment _sequencesIndexBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sequencesIndexBuffer, index), LAYOUT_sequencesIndexBuffer); }
    public MemorySegment _sequencesIndexBuffer() { return _sequencesIndexBufferAt(0L); }
    public VkGeneratedCommandsInfoNV _sequencesIndexBufferAt(long index, MemorySegment src) { _sequencesIndexBufferAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _sequencesIndexBuffer(MemorySegment src) { return _sequencesIndexBufferAt(0L, src); }
    public MemorySegment _sequencesIndexOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sequencesIndexOffset, index), LAYOUT_sequencesIndexOffset); }
    public MemorySegment _sequencesIndexOffset() { return _sequencesIndexOffsetAt(0L); }
    public VkGeneratedCommandsInfoNV _sequencesIndexOffsetAt(long index, MemorySegment src) { _sequencesIndexOffsetAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoNV _sequencesIndexOffset(MemorySegment src) { return _sequencesIndexOffsetAt(0L, src); }
}
