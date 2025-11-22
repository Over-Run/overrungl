// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExecutionGraphPipelineScratchSizeAMDX`.
/// ## Layout
/// ```
/// struct VkExecutionGraphPipelineScratchSizeAMDX {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize minSize;
///     VkDeviceSize maxSize;
///     VkDeviceSize sizeGranularity;
/// }
/// ```
public final class VkExecutionGraphPipelineScratchSizeAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minSize"),
        ValueLayout.JAVA_LONG.withName("maxSize"),
        ValueLayout.JAVA_LONG.withName("sizeGranularity")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minSize = LAYOUT.byteOffset(PathElement.groupElement("minSize"));
    public static final long OFFSET_maxSize = LAYOUT.byteOffset(PathElement.groupElement("maxSize"));
    public static final long OFFSET_sizeGranularity = LAYOUT.byteOffset(PathElement.groupElement("sizeGranularity"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minSize = LAYOUT.select(PathElement.groupElement("minSize"));
    public static final MemoryLayout LAYOUT_maxSize = LAYOUT.select(PathElement.groupElement("maxSize"));
    public static final MemoryLayout LAYOUT_sizeGranularity = LAYOUT.select(PathElement.groupElement("sizeGranularity"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSize"));
    public static final VarHandle VH_maxSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSize"));
    public static final VarHandle VH_sizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sizeGranularity"));

    public VkExecutionGraphPipelineScratchSizeAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExecutionGraphPipelineScratchSizeAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkExecutionGraphPipelineScratchSizeAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExecutionGraphPipelineScratchSizeAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExecutionGraphPipelineScratchSizeAMDX alloc(SegmentAllocator allocator) { return new VkExecutionGraphPipelineScratchSizeAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkExecutionGraphPipelineScratchSizeAMDX alloc(SegmentAllocator allocator, long count) { return new VkExecutionGraphPipelineScratchSizeAMDX(allocator.allocate(LAYOUT, count), count); }
    public static VkExecutionGraphPipelineScratchSizeAMDX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX); }
    public static VkExecutionGraphPipelineScratchSizeAMDX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX);
        return s;
    }
    public VkExecutionGraphPipelineScratchSizeAMDX copyFrom(VkExecutionGraphPipelineScratchSizeAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX reinterpret(long count) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExecutionGraphPipelineScratchSizeAMDX asSlice(long index) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExecutionGraphPipelineScratchSizeAMDX asSlice(long index, long count) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExecutionGraphPipelineScratchSizeAMDX at(long index, Consumer<VkExecutionGraphPipelineScratchSizeAMDX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long minSizeAt(long index) { return (long) VH_minSize.get(this.segment(), 0L, index); }
    public long maxSizeAt(long index) { return (long) VH_maxSize.get(this.segment(), 0L, index); }
    public long sizeGranularityAt(long index) { return (long) VH_sizeGranularity.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long minSize() { return (long) VH_minSize.get(this.segment(), 0L, 0L); }
    public long maxSize() { return (long) VH_maxSize.get(this.segment(), 0L, 0L); }
    public long sizeGranularity() { return (long) VH_sizeGranularity.get(this.segment(), 0L, 0L); }
    public VkExecutionGraphPipelineScratchSizeAMDX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX minSizeAt(long index, long value) { VH_minSize.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX maxSizeAt(long index, long value) { VH_maxSize.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularityAt(long index, long value) { VH_sizeGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX minSize(long value) { VH_minSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX maxSize(long value) { VH_maxSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularity(long value) { VH_sizeGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExecutionGraphPipelineScratchSizeAMDX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExecutionGraphPipelineScratchSizeAMDX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSize, index), LAYOUT_minSize); }
    public MemorySegment _minSize() { return _minSizeAt(0L); }
    public VkExecutionGraphPipelineScratchSizeAMDX _minSizeAt(long index, MemorySegment src) { _minSizeAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX _minSize(MemorySegment src) { return _minSizeAt(0L, src); }
    public MemorySegment _maxSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSize, index), LAYOUT_maxSize); }
    public MemorySegment _maxSize() { return _maxSizeAt(0L); }
    public VkExecutionGraphPipelineScratchSizeAMDX _maxSizeAt(long index, MemorySegment src) { _maxSizeAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX _maxSize(MemorySegment src) { return _maxSizeAt(0L, src); }
    public MemorySegment _sizeGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sizeGranularity, index), LAYOUT_sizeGranularity); }
    public MemorySegment _sizeGranularity() { return _sizeGranularityAt(0L); }
    public VkExecutionGraphPipelineScratchSizeAMDX _sizeGranularityAt(long index, MemorySegment src) { _sizeGranularityAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineScratchSizeAMDX _sizeGranularity(MemorySegment src) { return _sizeGranularityAt(0L, src); }
}
