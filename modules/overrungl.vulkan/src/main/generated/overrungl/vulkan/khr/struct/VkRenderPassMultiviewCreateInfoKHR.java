// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassMultiviewCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkRenderPassMultiviewCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t subpassCount;
///     const uint32_t* pViewMasks;
///     uint32_t dependencyCount;
///     const int32_t* pViewOffsets;
///     uint32_t correlationMaskCount;
///     const uint32_t* pCorrelationMasks;
/// }
/// ```
public final class VkRenderPassMultiviewCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pViewMasks"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pViewOffsets"),
        ValueLayout.JAVA_INT.withName("correlationMaskCount"),
        ValueLayout.ADDRESS.withName("pCorrelationMasks")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subpassCount = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
    public static final long OFFSET_pViewMasks = LAYOUT.byteOffset(PathElement.groupElement("pViewMasks"));
    public static final long OFFSET_dependencyCount = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
    public static final long OFFSET_pViewOffsets = LAYOUT.byteOffset(PathElement.groupElement("pViewOffsets"));
    public static final long OFFSET_correlationMaskCount = LAYOUT.byteOffset(PathElement.groupElement("correlationMaskCount"));
    public static final long OFFSET_pCorrelationMasks = LAYOUT.byteOffset(PathElement.groupElement("pCorrelationMasks"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subpassCount = LAYOUT.select(PathElement.groupElement("subpassCount"));
    public static final MemoryLayout LAYOUT_pViewMasks = LAYOUT.select(PathElement.groupElement("pViewMasks"));
    public static final MemoryLayout LAYOUT_dependencyCount = LAYOUT.select(PathElement.groupElement("dependencyCount"));
    public static final MemoryLayout LAYOUT_pViewOffsets = LAYOUT.select(PathElement.groupElement("pViewOffsets"));
    public static final MemoryLayout LAYOUT_correlationMaskCount = LAYOUT.select(PathElement.groupElement("correlationMaskCount"));
    public static final MemoryLayout LAYOUT_pCorrelationMasks = LAYOUT.select(PathElement.groupElement("pCorrelationMasks"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount"));
    public static final VarHandle VH_pViewMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewMasks"));
    public static final VarHandle VH_dependencyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount"));
    public static final VarHandle VH_pViewOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewOffsets"));
    public static final VarHandle VH_correlationMaskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("correlationMaskCount"));
    public static final VarHandle VH_pCorrelationMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCorrelationMasks"));

    public VkRenderPassMultiviewCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassMultiviewCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassMultiviewCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassMultiviewCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassMultiviewCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderPassMultiviewCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassMultiviewCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderPassMultiviewCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassMultiviewCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO); }
    public static VkRenderPassMultiviewCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO);
        return s;
    }
    public VkRenderPassMultiviewCreateInfoKHR copyFrom(VkRenderPassMultiviewCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassMultiviewCreateInfoKHR reinterpret(long count) { return new VkRenderPassMultiviewCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassMultiviewCreateInfoKHR asSlice(long index) { return new VkRenderPassMultiviewCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassMultiviewCreateInfoKHR asSlice(long index, long count) { return new VkRenderPassMultiviewCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassMultiviewCreateInfoKHR at(long index, Consumer<VkRenderPassMultiviewCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int subpassCountAt(long index) { return (int) VH_subpassCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewMasksAt(long index) { return (MemorySegment) VH_pViewMasks.get(this.segment(), 0L, index); }
    public int dependencyCountAt(long index) { return (int) VH_dependencyCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewOffsetsAt(long index) { return (MemorySegment) VH_pViewOffsets.get(this.segment(), 0L, index); }
    public int correlationMaskCountAt(long index) { return (int) VH_correlationMaskCount.get(this.segment(), 0L, index); }
    public MemorySegment pCorrelationMasksAt(long index) { return (MemorySegment) VH_pCorrelationMasks.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int subpassCount() { return (int) VH_subpassCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewMasks() { return (MemorySegment) VH_pViewMasks.get(this.segment(), 0L, 0L); }
    public int dependencyCount() { return (int) VH_dependencyCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewOffsets() { return (MemorySegment) VH_pViewOffsets.get(this.segment(), 0L, 0L); }
    public int correlationMaskCount() { return (int) VH_correlationMaskCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCorrelationMasks() { return (MemorySegment) VH_pCorrelationMasks.get(this.segment(), 0L, 0L); }
    public VkRenderPassMultiviewCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR subpassCountAt(long index, int value) { VH_subpassCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pViewMasksAt(long index, MemorySegment value) { VH_pViewMasks.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR dependencyCountAt(long index, int value) { VH_dependencyCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsetsAt(long index, MemorySegment value) { VH_pViewOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR correlationMaskCountAt(long index, int value) { VH_correlationMaskCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasksAt(long index, MemorySegment value) { VH_pCorrelationMasks.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR subpassCount(int value) { VH_subpassCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pViewMasks(MemorySegment value) { VH_pViewMasks.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR dependencyCount(int value) { VH_dependencyCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsets(MemorySegment value) { VH_pViewOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR correlationMaskCount(int value) { VH_correlationMaskCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasks(MemorySegment value) { VH_pCorrelationMasks.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subpassCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpassCount, index), LAYOUT_subpassCount); }
    public MemorySegment _subpassCount() { return _subpassCountAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _subpassCountAt(long index, MemorySegment src) { _subpassCountAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _subpassCount(MemorySegment src) { return _subpassCountAt(0L, src); }
    public MemorySegment _pViewMasksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewMasks, index), LAYOUT_pViewMasks); }
    public MemorySegment _pViewMasks() { return _pViewMasksAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _pViewMasksAt(long index, MemorySegment src) { _pViewMasksAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _pViewMasks(MemorySegment src) { return _pViewMasksAt(0L, src); }
    public MemorySegment _dependencyCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dependencyCount, index), LAYOUT_dependencyCount); }
    public MemorySegment _dependencyCount() { return _dependencyCountAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _dependencyCountAt(long index, MemorySegment src) { _dependencyCountAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _dependencyCount(MemorySegment src) { return _dependencyCountAt(0L, src); }
    public MemorySegment _pViewOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewOffsets, index), LAYOUT_pViewOffsets); }
    public MemorySegment _pViewOffsets() { return _pViewOffsetsAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _pViewOffsetsAt(long index, MemorySegment src) { _pViewOffsetsAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _pViewOffsets(MemorySegment src) { return _pViewOffsetsAt(0L, src); }
    public MemorySegment _correlationMaskCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_correlationMaskCount, index), LAYOUT_correlationMaskCount); }
    public MemorySegment _correlationMaskCount() { return _correlationMaskCountAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _correlationMaskCountAt(long index, MemorySegment src) { _correlationMaskCountAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _correlationMaskCount(MemorySegment src) { return _correlationMaskCountAt(0L, src); }
    public MemorySegment _pCorrelationMasksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCorrelationMasks, index), LAYOUT_pCorrelationMasks); }
    public MemorySegment _pCorrelationMasks() { return _pCorrelationMasksAt(0L); }
    public VkRenderPassMultiviewCreateInfoKHR _pCorrelationMasksAt(long index, MemorySegment src) { _pCorrelationMasksAt(index).copyFrom(src); return this; }
    public VkRenderPassMultiviewCreateInfoKHR _pCorrelationMasks(MemorySegment src) { return _pCorrelationMasksAt(0L, src); }
}
