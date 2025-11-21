// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportShadingRateImageStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 shadingRateImageEnable;
///     uint32_t viewportCount;
///     const VkShadingRatePaletteNV* pShadingRatePalettes;
/// }
/// ```
public final class VkPipelineViewportShadingRateImageStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImageEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePalettes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shadingRateImageEnable = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImageEnable"));
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    public static final long OFFSET_pShadingRatePalettes = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePalettes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shadingRateImageEnable = LAYOUT.select(PathElement.groupElement("shadingRateImageEnable"));
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    public static final MemoryLayout LAYOUT_pShadingRatePalettes = LAYOUT.select(PathElement.groupElement("pShadingRatePalettes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shadingRateImageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImageEnable"));
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    public static final VarHandle VH_pShadingRatePalettes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePalettes"));

    public VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV); }
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV copyFrom(VkPipelineViewportShadingRateImageStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV at(long index, Consumer<VkPipelineViewportShadingRateImageStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shadingRateImageEnableAt(long index) { return (int) VH_shadingRateImageEnable.get(this.segment(), 0L, index); }
    public int viewportCountAt(long index) { return (int) VH_viewportCount.get(this.segment(), 0L, index); }
    public MemorySegment pShadingRatePalettesAt(long index) { return (MemorySegment) VH_pShadingRatePalettes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shadingRateImageEnable() { return (int) VH_shadingRateImageEnable.get(this.segment(), 0L, 0L); }
    public int viewportCount() { return (int) VH_viewportCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pShadingRatePalettes() { return (MemorySegment) VH_pShadingRatePalettes.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnableAt(long index, int value) { VH_shadingRateImageEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCountAt(long index, int value) { VH_viewportCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettesAt(long index, MemorySegment value) { VH_pShadingRatePalettes.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(int value) { VH_shadingRateImageEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(int value) { VH_viewportCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(MemorySegment value) { VH_pShadingRatePalettes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shadingRateImageEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateImageEnable, index), LAYOUT_shadingRateImageEnable); }
    public MemorySegment _shadingRateImageEnable() { return _shadingRateImageEnableAt(0L); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _shadingRateImageEnableAt(long index, MemorySegment src) { _shadingRateImageEnableAt(index).copyFrom(src); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _shadingRateImageEnable(MemorySegment src) { return _shadingRateImageEnableAt(0L, src); }
    public MemorySegment _viewportCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportCount, index), LAYOUT_viewportCount); }
    public MemorySegment _viewportCount() { return _viewportCountAt(0L); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _viewportCountAt(long index, MemorySegment src) { _viewportCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _viewportCount(MemorySegment src) { return _viewportCountAt(0L, src); }
    public MemorySegment _pShadingRatePalettesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pShadingRatePalettes, index), LAYOUT_pShadingRatePalettes); }
    public MemorySegment _pShadingRatePalettes() { return _pShadingRatePalettesAt(0L); }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _pShadingRatePalettesAt(long index, MemorySegment src) { _pShadingRatePalettesAt(index).copyFrom(src); return this; }
    public VkPipelineViewportShadingRateImageStateCreateInfoNV _pShadingRatePalettes(MemorySegment src) { return _pShadingRatePalettesAt(0L, src); }
}
