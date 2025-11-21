// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerYcbcrConversionCreateInfo`.
/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat format;
///     VkSamplerYcbcrModelConversion ycbcrModel;
///     VkSamplerYcbcrRange ycbcrRange;
///     VkComponentMapping components;
///     VkChromaLocation xChromaOffset;
///     VkChromaLocation yChromaOffset;
///     VkFilter chromaFilter;
///     VkBool32 forceExplicitReconstruction;
/// }
/// ```
public final class VkSamplerYcbcrConversionCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("ycbcrModel"),
        ValueLayout.JAVA_INT.withName("ycbcrRange"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("xChromaOffset"),
        ValueLayout.JAVA_INT.withName("yChromaOffset"),
        ValueLayout.JAVA_INT.withName("chromaFilter"),
        ValueLayout.JAVA_INT.withName("forceExplicitReconstruction")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_ycbcrModel = LAYOUT.byteOffset(PathElement.groupElement("ycbcrModel"));
    public static final long OFFSET_ycbcrRange = LAYOUT.byteOffset(PathElement.groupElement("ycbcrRange"));
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    public static final long OFFSET_xChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffset"));
    public static final long OFFSET_yChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffset"));
    public static final long OFFSET_chromaFilter = LAYOUT.byteOffset(PathElement.groupElement("chromaFilter"));
    public static final long OFFSET_forceExplicitReconstruction = LAYOUT.byteOffset(PathElement.groupElement("forceExplicitReconstruction"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_ycbcrModel = LAYOUT.select(PathElement.groupElement("ycbcrModel"));
    public static final MemoryLayout LAYOUT_ycbcrRange = LAYOUT.select(PathElement.groupElement("ycbcrRange"));
    public static final MemoryLayout LAYOUT_components = LAYOUT.select(PathElement.groupElement("components"));
    public static final MemoryLayout LAYOUT_xChromaOffset = LAYOUT.select(PathElement.groupElement("xChromaOffset"));
    public static final MemoryLayout LAYOUT_yChromaOffset = LAYOUT.select(PathElement.groupElement("yChromaOffset"));
    public static final MemoryLayout LAYOUT_chromaFilter = LAYOUT.select(PathElement.groupElement("chromaFilter"));
    public static final MemoryLayout LAYOUT_forceExplicitReconstruction = LAYOUT.select(PathElement.groupElement("forceExplicitReconstruction"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_ycbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrModel"));
    public static final VarHandle VH_ycbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrRange"));
    public static final VarHandle VH_components$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("r"));
    public static final VarHandle VH_components$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("g"));
    public static final VarHandle VH_components$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("b"));
    public static final VarHandle VH_components$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("a"));
    public static final VarHandle VH_xChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffset"));
    public static final VarHandle VH_yChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffset"));
    public static final VarHandle VH_chromaFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaFilter"));
    public static final VarHandle VH_forceExplicitReconstruction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("forceExplicitReconstruction"));

    public VkSamplerYcbcrConversionCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerYcbcrConversionCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerYcbcrConversionCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerYcbcrConversionCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerYcbcrConversionCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerYcbcrConversionCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerYcbcrConversionCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO); }
    public static VkSamplerYcbcrConversionCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
        return s;
    }
    public VkSamplerYcbcrConversionCreateInfo copyFrom(VkSamplerYcbcrConversionCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerYcbcrConversionCreateInfo reinterpret(long count) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerYcbcrConversionCreateInfo asSlice(long index) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerYcbcrConversionCreateInfo asSlice(long index, long count) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerYcbcrConversionCreateInfo at(long index, Consumer<VkSamplerYcbcrConversionCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int ycbcrModelAt(long index) { return (int) VH_ycbcrModel.get(this.segment(), 0L, index); }
    public int ycbcrRangeAt(long index) { return (int) VH_ycbcrRange.get(this.segment(), 0L, index); }
    public int components$rAt(long index) { return (int) VH_components$r.get(this.segment(), 0L, index); }
    public int components$gAt(long index) { return (int) VH_components$g.get(this.segment(), 0L, index); }
    public int components$bAt(long index) { return (int) VH_components$b.get(this.segment(), 0L, index); }
    public int components$aAt(long index) { return (int) VH_components$a.get(this.segment(), 0L, index); }
    public int xChromaOffsetAt(long index) { return (int) VH_xChromaOffset.get(this.segment(), 0L, index); }
    public int yChromaOffsetAt(long index) { return (int) VH_yChromaOffset.get(this.segment(), 0L, index); }
    public int chromaFilterAt(long index) { return (int) VH_chromaFilter.get(this.segment(), 0L, index); }
    public int forceExplicitReconstructionAt(long index) { return (int) VH_forceExplicitReconstruction.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int ycbcrModel() { return (int) VH_ycbcrModel.get(this.segment(), 0L, 0L); }
    public int ycbcrRange() { return (int) VH_ycbcrRange.get(this.segment(), 0L, 0L); }
    public int components$r() { return (int) VH_components$r.get(this.segment(), 0L, 0L); }
    public int components$g() { return (int) VH_components$g.get(this.segment(), 0L, 0L); }
    public int components$b() { return (int) VH_components$b.get(this.segment(), 0L, 0L); }
    public int components$a() { return (int) VH_components$a.get(this.segment(), 0L, 0L); }
    public int xChromaOffset() { return (int) VH_xChromaOffset.get(this.segment(), 0L, 0L); }
    public int yChromaOffset() { return (int) VH_yChromaOffset.get(this.segment(), 0L, 0L); }
    public int chromaFilter() { return (int) VH_chromaFilter.get(this.segment(), 0L, 0L); }
    public int forceExplicitReconstruction() { return (int) VH_forceExplicitReconstruction.get(this.segment(), 0L, 0L); }
    public VkSamplerYcbcrConversionCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo ycbcrModelAt(long index, int value) { VH_ycbcrModel.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo ycbcrRangeAt(long index, int value) { VH_ycbcrRange.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$rAt(long index, int value) { VH_components$r.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$gAt(long index, int value) { VH_components$g.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$bAt(long index, int value) { VH_components$b.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$aAt(long index, int value) { VH_components$a.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo xChromaOffsetAt(long index, int value) { VH_xChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo yChromaOffsetAt(long index, int value) { VH_yChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo chromaFilterAt(long index, int value) { VH_chromaFilter.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstructionAt(long index, int value) { VH_forceExplicitReconstruction.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(int value) { VH_ycbcrModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(int value) { VH_ycbcrRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$r(int value) { VH_components$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$g(int value) { VH_components$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$b(int value) { VH_components$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo components$a(int value) { VH_components$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(int value) { VH_xChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(int value) { VH_yChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(int value) { VH_chromaFilter.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(int value) { VH_forceExplicitReconstruction.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _ycbcrModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ycbcrModel, index), LAYOUT_ycbcrModel); }
    public MemorySegment _ycbcrModel() { return _ycbcrModelAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _ycbcrModelAt(long index, MemorySegment src) { _ycbcrModelAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _ycbcrModel(MemorySegment src) { return _ycbcrModelAt(0L, src); }
    public MemorySegment _ycbcrRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ycbcrRange, index), LAYOUT_ycbcrRange); }
    public MemorySegment _ycbcrRange() { return _ycbcrRangeAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _ycbcrRangeAt(long index, MemorySegment src) { _ycbcrRangeAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _ycbcrRange(MemorySegment src) { return _ycbcrRangeAt(0L, src); }
    public MemorySegment _componentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_components, index), LAYOUT_components); }
    public MemorySegment _components() { return _componentsAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _componentsAt(long index, MemorySegment src) { _componentsAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _components(MemorySegment src) { return _componentsAt(0L, src); }
    public MemorySegment _xChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_xChromaOffset, index), LAYOUT_xChromaOffset); }
    public MemorySegment _xChromaOffset() { return _xChromaOffsetAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _xChromaOffsetAt(long index, MemorySegment src) { _xChromaOffsetAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _xChromaOffset(MemorySegment src) { return _xChromaOffsetAt(0L, src); }
    public MemorySegment _yChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_yChromaOffset, index), LAYOUT_yChromaOffset); }
    public MemorySegment _yChromaOffset() { return _yChromaOffsetAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _yChromaOffsetAt(long index, MemorySegment src) { _yChromaOffsetAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _yChromaOffset(MemorySegment src) { return _yChromaOffsetAt(0L, src); }
    public MemorySegment _chromaFilterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chromaFilter, index), LAYOUT_chromaFilter); }
    public MemorySegment _chromaFilter() { return _chromaFilterAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _chromaFilterAt(long index, MemorySegment src) { _chromaFilterAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _chromaFilter(MemorySegment src) { return _chromaFilterAt(0L, src); }
    public MemorySegment _forceExplicitReconstructionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_forceExplicitReconstruction, index), LAYOUT_forceExplicitReconstruction); }
    public MemorySegment _forceExplicitReconstruction() { return _forceExplicitReconstructionAt(0L); }
    public VkSamplerYcbcrConversionCreateInfo _forceExplicitReconstructionAt(long index, MemorySegment src) { _forceExplicitReconstructionAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionCreateInfo _forceExplicitReconstruction(MemorySegment src) { return _forceExplicitReconstructionAt(0L, src); }
}
