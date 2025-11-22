// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkCoarseSampleOrderTypeNV sampleOrderType;
///     uint32_t customSampleOrderCount;
///     const VkCoarseSampleOrderCustomNV* pCustomSampleOrders;
/// }
/// ```
public final class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleOrderType"),
        ValueLayout.JAVA_INT.withName("customSampleOrderCount"),
        ValueLayout.ADDRESS.withName("pCustomSampleOrders")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sampleOrderType = LAYOUT.byteOffset(PathElement.groupElement("sampleOrderType"));
    public static final long OFFSET_customSampleOrderCount = LAYOUT.byteOffset(PathElement.groupElement("customSampleOrderCount"));
    public static final long OFFSET_pCustomSampleOrders = LAYOUT.byteOffset(PathElement.groupElement("pCustomSampleOrders"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sampleOrderType = LAYOUT.select(PathElement.groupElement("sampleOrderType"));
    public static final MemoryLayout LAYOUT_customSampleOrderCount = LAYOUT.select(PathElement.groupElement("customSampleOrderCount"));
    public static final MemoryLayout LAYOUT_pCustomSampleOrders = LAYOUT.select(PathElement.groupElement("pCustomSampleOrders"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleOrderType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleOrderType"));
    public static final VarHandle VH_customSampleOrderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customSampleOrderCount"));
    public static final VarHandle VH_pCustomSampleOrders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCustomSampleOrders"));

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV); }
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV copyFrom(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV at(long index, Consumer<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sampleOrderTypeAt(long index) { return (int) VH_sampleOrderType.get(this.segment(), 0L, index); }
    public int customSampleOrderCountAt(long index) { return (int) VH_customSampleOrderCount.get(this.segment(), 0L, index); }
    public MemorySegment pCustomSampleOrdersAt(long index) { return (MemorySegment) VH_pCustomSampleOrders.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sampleOrderType() { return (int) VH_sampleOrderType.get(this.segment(), 0L, 0L); }
    public int customSampleOrderCount() { return (int) VH_customSampleOrderCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCustomSampleOrders() { return (MemorySegment) VH_pCustomSampleOrders.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderTypeAt(long index, int value) { VH_sampleOrderType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCountAt(long index, int value) { VH_customSampleOrderCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrdersAt(long index, MemorySegment value) { VH_pCustomSampleOrders.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(int value) { VH_sampleOrderType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCount(int value) { VH_customSampleOrderCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(MemorySegment value) { VH_pCustomSampleOrders.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sampleOrderTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleOrderType, index), LAYOUT_sampleOrderType); }
    public MemorySegment _sampleOrderType() { return _sampleOrderTypeAt(0L); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _sampleOrderTypeAt(long index, MemorySegment src) { _sampleOrderTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _sampleOrderType(MemorySegment src) { return _sampleOrderTypeAt(0L, src); }
    public MemorySegment _customSampleOrderCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_customSampleOrderCount, index), LAYOUT_customSampleOrderCount); }
    public MemorySegment _customSampleOrderCount() { return _customSampleOrderCountAt(0L); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _customSampleOrderCountAt(long index, MemorySegment src) { _customSampleOrderCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _customSampleOrderCount(MemorySegment src) { return _customSampleOrderCountAt(0L, src); }
    public MemorySegment _pCustomSampleOrdersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCustomSampleOrders, index), LAYOUT_pCustomSampleOrders); }
    public MemorySegment _pCustomSampleOrders() { return _pCustomSampleOrdersAt(0L); }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _pCustomSampleOrdersAt(long index, MemorySegment src) { _pCustomSampleOrdersAt(index).copyFrom(src); return this; }
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV _pCustomSampleOrders(MemorySegment src) { return _pCustomSampleOrdersAt(0L, src); }
}
