// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportWScalingStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportWScalingStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 viewportWScalingEnable;
///     uint32_t viewportCount;
///     const VkViewportWScalingNV* pViewportWScalings;
/// }
/// ```
public final class VkPipelineViewportWScalingStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewportWScalings")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_viewportWScalingEnable = LAYOUT.byteOffset(PathElement.groupElement("viewportWScalingEnable"));
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    public static final long OFFSET_pViewportWScalings = LAYOUT.byteOffset(PathElement.groupElement("pViewportWScalings"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_viewportWScalingEnable = LAYOUT.select(PathElement.groupElement("viewportWScalingEnable"));
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    public static final MemoryLayout LAYOUT_pViewportWScalings = LAYOUT.select(PathElement.groupElement("pViewportWScalings"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_viewportWScalingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportWScalingEnable"));
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    public static final VarHandle VH_pViewportWScalings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportWScalings"));

    public VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportWScalingStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportWScalingStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportWScalingStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportWScalingStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportWScalingStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportWScalingStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClipSpaceWScaling.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV); }
    public static VkPipelineViewportWScalingStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClipSpaceWScaling.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineViewportWScalingStateCreateInfoNV copyFrom(VkPipelineViewportWScalingStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportWScalingStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportWScalingStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportWScalingStateCreateInfoNV at(long index, Consumer<VkPipelineViewportWScalingStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int viewportWScalingEnableAt(long index) { return (int) VH_viewportWScalingEnable.get(this.segment(), 0L, index); }
    public int viewportCountAt(long index) { return (int) VH_viewportCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewportWScalingsAt(long index) { return (MemorySegment) VH_pViewportWScalings.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int viewportWScalingEnable() { return (int) VH_viewportWScalingEnable.get(this.segment(), 0L, 0L); }
    public int viewportCount() { return (int) VH_viewportCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewportWScalings() { return (MemorySegment) VH_pViewportWScalings.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportWScalingStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnableAt(long index, int value) { VH_viewportWScalingEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCountAt(long index, int value) { VH_viewportCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalingsAt(long index, MemorySegment value) { VH_pViewportWScalings.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnable(int value) { VH_viewportWScalingEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCount(int value) { VH_viewportCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalings(MemorySegment value) { VH_pViewportWScalings.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportWScalingStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportWScalingStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _viewportWScalingEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportWScalingEnable, index), LAYOUT_viewportWScalingEnable); }
    public MemorySegment _viewportWScalingEnable() { return _viewportWScalingEnableAt(0L); }
    public VkPipelineViewportWScalingStateCreateInfoNV _viewportWScalingEnableAt(long index, MemorySegment src) { _viewportWScalingEnableAt(index).copyFrom(src); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV _viewportWScalingEnable(MemorySegment src) { return _viewportWScalingEnableAt(0L, src); }
    public MemorySegment _viewportCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportCount, index), LAYOUT_viewportCount); }
    public MemorySegment _viewportCount() { return _viewportCountAt(0L); }
    public VkPipelineViewportWScalingStateCreateInfoNV _viewportCountAt(long index, MemorySegment src) { _viewportCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV _viewportCount(MemorySegment src) { return _viewportCountAt(0L, src); }
    public MemorySegment _pViewportWScalingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewportWScalings, index), LAYOUT_pViewportWScalings); }
    public MemorySegment _pViewportWScalings() { return _pViewportWScalingsAt(0L); }
    public VkPipelineViewportWScalingStateCreateInfoNV _pViewportWScalingsAt(long index, MemorySegment src) { _pViewportWScalingsAt(index).copyFrom(src); return this; }
    public VkPipelineViewportWScalingStateCreateInfoNV _pViewportWScalings(MemorySegment src) { return _pViewportWScalingsAt(0L, src); }
}
