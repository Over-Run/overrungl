// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineFragmentShadingRateStateCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkExtent2D fragmentSize;
///     VkFragmentShadingRateCombinerOpKHR combinerOps[2];
/// }
/// ```
public final class VkPipelineFragmentShadingRateStateCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    public static final long OFFSET_combinerOps = LAYOUT.byteOffset(PathElement.groupElement("combinerOps"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));
    public static final MemoryLayout LAYOUT_combinerOps = LAYOUT.select(PathElement.groupElement("combinerOps"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_fragmentSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_combinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinerOps"), PathElement.sequenceElement());

    public VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR); }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
        return s;
    }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR copyFrom(VkPipelineFragmentShadingRateStateCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR reinterpret(long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR asSlice(long index) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR asSlice(long index, long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR at(long index, Consumer<VkPipelineFragmentShadingRateStateCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentSize$widthAt(long index) { return (int) VH_fragmentSize$width.get(this.segment(), 0L, index); }
    public int fragmentSize$heightAt(long index) { return (int) VH_fragmentSize$height.get(this.segment(), 0L, index); }
    public int combinerOpsAt(long index, long index0) { return (int) VH_combinerOps.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentSize$width() { return (int) VH_fragmentSize$width.get(this.segment(), 0L, 0L); }
    public int fragmentSize$height() { return (int) VH_fragmentSize$height.get(this.segment(), 0L, 0L); }
    public int combinerOps(long index0) { return (int) VH_combinerOps.get(this.segment(), 0L, 0L, index0); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize$widthAt(long index, int value) { VH_fragmentSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize$heightAt(long index, int value) { VH_fragmentSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOpsAt(long index, long index0, int value) { VH_combinerOps.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize$width(int value) { VH_fragmentSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize$height(int value) { VH_fragmentSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(long index0, int value) { VH_combinerOps.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize); }
    public MemorySegment _fragmentSize() { return _fragmentSizeAt(0L); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _fragmentSizeAt(long index, MemorySegment src) { _fragmentSizeAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _fragmentSize(MemorySegment src) { return _fragmentSizeAt(0L, src); }
    public MemorySegment _combinerOpsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_combinerOps, index), LAYOUT_combinerOps); }
    public MemorySegment _combinerOps() { return _combinerOpsAt(0L); }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _combinerOpsAt(long index, MemorySegment src) { _combinerOpsAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateStateCreateInfoKHR _combinerOps(MemorySegment src) { return _combinerOpsAt(0L, src); }
}
