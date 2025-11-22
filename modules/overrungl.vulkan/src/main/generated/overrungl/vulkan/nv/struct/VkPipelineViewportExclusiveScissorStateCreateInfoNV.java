// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportExclusiveScissorStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportExclusiveScissorStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t exclusiveScissorCount;
///     const VkRect2D* pExclusiveScissors;
/// }
/// ```
public final class VkPipelineViewportExclusiveScissorStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exclusiveScissorCount"),
        ValueLayout.ADDRESS.withName("pExclusiveScissors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_exclusiveScissorCount = LAYOUT.byteOffset(PathElement.groupElement("exclusiveScissorCount"));
    public static final long OFFSET_pExclusiveScissors = LAYOUT.byteOffset(PathElement.groupElement("pExclusiveScissors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_exclusiveScissorCount = LAYOUT.select(PathElement.groupElement("exclusiveScissorCount"));
    public static final MemoryLayout LAYOUT_pExclusiveScissors = LAYOUT.select(PathElement.groupElement("pExclusiveScissors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_exclusiveScissorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exclusiveScissorCount"));
    public static final VarHandle VH_pExclusiveScissors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExclusiveScissors"));

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVScissorExclusive.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV); }
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVScissorExclusive.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV copyFrom(VkPipelineViewportExclusiveScissorStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV at(long index, Consumer<VkPipelineViewportExclusiveScissorStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int exclusiveScissorCountAt(long index) { return (int) VH_exclusiveScissorCount.get(this.segment(), 0L, index); }
    public MemorySegment pExclusiveScissorsAt(long index) { return (MemorySegment) VH_pExclusiveScissors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int exclusiveScissorCount() { return (int) VH_exclusiveScissorCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pExclusiveScissors() { return (MemorySegment) VH_pExclusiveScissors.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV exclusiveScissorCountAt(long index, int value) { VH_exclusiveScissorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pExclusiveScissorsAt(long index, MemorySegment value) { VH_pExclusiveScissors.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV exclusiveScissorCount(int value) { VH_exclusiveScissorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pExclusiveScissors(MemorySegment value) { VH_pExclusiveScissors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _exclusiveScissorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exclusiveScissorCount, index), LAYOUT_exclusiveScissorCount); }
    public MemorySegment _exclusiveScissorCount() { return _exclusiveScissorCountAt(0L); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _exclusiveScissorCountAt(long index, MemorySegment src) { _exclusiveScissorCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _exclusiveScissorCount(MemorySegment src) { return _exclusiveScissorCountAt(0L, src); }
    public MemorySegment _pExclusiveScissorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pExclusiveScissors, index), LAYOUT_pExclusiveScissors); }
    public MemorySegment _pExclusiveScissors() { return _pExclusiveScissorsAt(0L); }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _pExclusiveScissorsAt(long index, MemorySegment src) { _pExclusiveScissorsAt(index).copyFrom(src); return this; }
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV _pExclusiveScissors(MemorySegment src) { return _pExclusiveScissorsAt(0L, src); }
}
