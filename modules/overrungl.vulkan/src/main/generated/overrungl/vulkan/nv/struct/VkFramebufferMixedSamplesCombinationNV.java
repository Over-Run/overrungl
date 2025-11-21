// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFramebufferMixedSamplesCombinationNV`.
/// ## Layout
/// ```
/// struct VkFramebufferMixedSamplesCombinationNV {
///     VkStructureType sType;
///     void* pNext;
///     VkCoverageReductionModeNV coverageReductionMode;
///     VkSampleCountFlagBits rasterizationSamples;
///     VkSampleCountFlags depthStencilSamples;
///     VkSampleCountFlags colorSamples;
/// }
/// ```
public final class VkFramebufferMixedSamplesCombinationNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilSamples"),
        ValueLayout.JAVA_INT.withName("colorSamples")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_coverageReductionMode = LAYOUT.byteOffset(PathElement.groupElement("coverageReductionMode"));
    public static final long OFFSET_rasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
    public static final long OFFSET_depthStencilSamples = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSamples"));
    public static final long OFFSET_colorSamples = LAYOUT.byteOffset(PathElement.groupElement("colorSamples"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_coverageReductionMode = LAYOUT.select(PathElement.groupElement("coverageReductionMode"));
    public static final MemoryLayout LAYOUT_rasterizationSamples = LAYOUT.select(PathElement.groupElement("rasterizationSamples"));
    public static final MemoryLayout LAYOUT_depthStencilSamples = LAYOUT.select(PathElement.groupElement("depthStencilSamples"));
    public static final MemoryLayout LAYOUT_colorSamples = LAYOUT.select(PathElement.groupElement("colorSamples"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_coverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageReductionMode"));
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));
    public static final VarHandle VH_depthStencilSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSamples"));
    public static final VarHandle VH_colorSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSamples"));

    public VkFramebufferMixedSamplesCombinationNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFramebufferMixedSamplesCombinationNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkFramebufferMixedSamplesCombinationNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFramebufferMixedSamplesCombinationNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferMixedSamplesCombinationNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFramebufferMixedSamplesCombinationNV alloc(SegmentAllocator allocator) { return new VkFramebufferMixedSamplesCombinationNV(allocator.allocate(LAYOUT), 1); }
    public static VkFramebufferMixedSamplesCombinationNV alloc(SegmentAllocator allocator, long count) { return new VkFramebufferMixedSamplesCombinationNV(allocator.allocate(LAYOUT, count), count); }
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCoverageReductionMode.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV); }
    public static VkFramebufferMixedSamplesCombinationNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCoverageReductionMode.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
        return s;
    }
    public VkFramebufferMixedSamplesCombinationNV copyFrom(VkFramebufferMixedSamplesCombinationNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFramebufferMixedSamplesCombinationNV reinterpret(long count) { return new VkFramebufferMixedSamplesCombinationNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFramebufferMixedSamplesCombinationNV asSlice(long index) { return new VkFramebufferMixedSamplesCombinationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFramebufferMixedSamplesCombinationNV asSlice(long index, long count) { return new VkFramebufferMixedSamplesCombinationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFramebufferMixedSamplesCombinationNV at(long index, Consumer<VkFramebufferMixedSamplesCombinationNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int coverageReductionModeAt(long index) { return (int) VH_coverageReductionMode.get(this.segment(), 0L, index); }
    public int rasterizationSamplesAt(long index) { return (int) VH_rasterizationSamples.get(this.segment(), 0L, index); }
    public int depthStencilSamplesAt(long index) { return (int) VH_depthStencilSamples.get(this.segment(), 0L, index); }
    public int colorSamplesAt(long index) { return (int) VH_colorSamples.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int coverageReductionMode() { return (int) VH_coverageReductionMode.get(this.segment(), 0L, 0L); }
    public int rasterizationSamples() { return (int) VH_rasterizationSamples.get(this.segment(), 0L, 0L); }
    public int depthStencilSamples() { return (int) VH_depthStencilSamples.get(this.segment(), 0L, 0L); }
    public int colorSamples() { return (int) VH_colorSamples.get(this.segment(), 0L, 0L); }
    public VkFramebufferMixedSamplesCombinationNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV coverageReductionModeAt(long index, int value) { VH_coverageReductionMode.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamplesAt(long index, int value) { VH_rasterizationSamples.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamplesAt(long index, int value) { VH_depthStencilSamples.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV colorSamplesAt(long index, int value) { VH_colorSamples.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV coverageReductionMode(int value) { VH_coverageReductionMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamples(int value) { VH_rasterizationSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamples(int value) { VH_depthStencilSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferMixedSamplesCombinationNV colorSamples(int value) { VH_colorSamples.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFramebufferMixedSamplesCombinationNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFramebufferMixedSamplesCombinationNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFramebufferMixedSamplesCombinationNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFramebufferMixedSamplesCombinationNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _coverageReductionModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageReductionMode, index), LAYOUT_coverageReductionMode); }
    public MemorySegment _coverageReductionMode() { return _coverageReductionModeAt(0L); }
    public VkFramebufferMixedSamplesCombinationNV _coverageReductionModeAt(long index, MemorySegment src) { _coverageReductionModeAt(index).copyFrom(src); return this; }
    public VkFramebufferMixedSamplesCombinationNV _coverageReductionMode(MemorySegment src) { return _coverageReductionModeAt(0L, src); }
    public MemorySegment _rasterizationSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationSamples, index), LAYOUT_rasterizationSamples); }
    public MemorySegment _rasterizationSamples() { return _rasterizationSamplesAt(0L); }
    public VkFramebufferMixedSamplesCombinationNV _rasterizationSamplesAt(long index, MemorySegment src) { _rasterizationSamplesAt(index).copyFrom(src); return this; }
    public VkFramebufferMixedSamplesCombinationNV _rasterizationSamples(MemorySegment src) { return _rasterizationSamplesAt(0L, src); }
    public MemorySegment _depthStencilSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthStencilSamples, index), LAYOUT_depthStencilSamples); }
    public MemorySegment _depthStencilSamples() { return _depthStencilSamplesAt(0L); }
    public VkFramebufferMixedSamplesCombinationNV _depthStencilSamplesAt(long index, MemorySegment src) { _depthStencilSamplesAt(index).copyFrom(src); return this; }
    public VkFramebufferMixedSamplesCombinationNV _depthStencilSamples(MemorySegment src) { return _depthStencilSamplesAt(0L, src); }
    public MemorySegment _colorSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorSamples, index), LAYOUT_colorSamples); }
    public MemorySegment _colorSamples() { return _colorSamplesAt(0L); }
    public VkFramebufferMixedSamplesCombinationNV _colorSamplesAt(long index, MemorySegment src) { _colorSamplesAt(index).copyFrom(src); return this; }
    public VkFramebufferMixedSamplesCombinationNV _colorSamples(MemorySegment src) { return _colorSamplesAt(0L, src); }
}
