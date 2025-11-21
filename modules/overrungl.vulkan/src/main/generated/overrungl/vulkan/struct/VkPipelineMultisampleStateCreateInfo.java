// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineMultisampleStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineMultisampleStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineMultisampleStateCreateFlags flags;
///     VkSampleCountFlagBits rasterizationSamples;
///     VkBool32 sampleShadingEnable;
///     float minSampleShading;
///     const VkSampleMask* pSampleMask;
///     VkBool32 alphaToCoverageEnable;
///     VkBool32 alphaToOneEnable;
/// }
/// ```
public final class VkPipelineMultisampleStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("sampleShadingEnable"),
        ValueLayout.JAVA_FLOAT.withName("minSampleShading"),
        ValueLayout.ADDRESS.withName("pSampleMask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("alphaToOneEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_rasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
    public static final long OFFSET_sampleShadingEnable = LAYOUT.byteOffset(PathElement.groupElement("sampleShadingEnable"));
    public static final long OFFSET_minSampleShading = LAYOUT.byteOffset(PathElement.groupElement("minSampleShading"));
    public static final long OFFSET_pSampleMask = LAYOUT.byteOffset(PathElement.groupElement("pSampleMask"));
    public static final long OFFSET_alphaToCoverageEnable = LAYOUT.byteOffset(PathElement.groupElement("alphaToCoverageEnable"));
    public static final long OFFSET_alphaToOneEnable = LAYOUT.byteOffset(PathElement.groupElement("alphaToOneEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_rasterizationSamples = LAYOUT.select(PathElement.groupElement("rasterizationSamples"));
    public static final MemoryLayout LAYOUT_sampleShadingEnable = LAYOUT.select(PathElement.groupElement("sampleShadingEnable"));
    public static final MemoryLayout LAYOUT_minSampleShading = LAYOUT.select(PathElement.groupElement("minSampleShading"));
    public static final MemoryLayout LAYOUT_pSampleMask = LAYOUT.select(PathElement.groupElement("pSampleMask"));
    public static final MemoryLayout LAYOUT_alphaToCoverageEnable = LAYOUT.select(PathElement.groupElement("alphaToCoverageEnable"));
    public static final MemoryLayout LAYOUT_alphaToOneEnable = LAYOUT.select(PathElement.groupElement("alphaToOneEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));
    public static final VarHandle VH_sampleShadingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleShadingEnable"));
    public static final VarHandle VH_minSampleShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSampleShading"));
    public static final VarHandle VH_pSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleMask"));
    public static final VarHandle VH_alphaToCoverageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToCoverageEnable"));
    public static final VarHandle VH_alphaToOneEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToOneEnable"));

    public VkPipelineMultisampleStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineMultisampleStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineMultisampleStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineMultisampleStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineMultisampleStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineMultisampleStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineMultisampleStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineMultisampleStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineMultisampleStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO); }
    public static VkPipelineMultisampleStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineMultisampleStateCreateInfo copyFrom(VkPipelineMultisampleStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineMultisampleStateCreateInfo reinterpret(long count) { return new VkPipelineMultisampleStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineMultisampleStateCreateInfo asSlice(long index) { return new VkPipelineMultisampleStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineMultisampleStateCreateInfo asSlice(long index, long count) { return new VkPipelineMultisampleStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineMultisampleStateCreateInfo at(long index, Consumer<VkPipelineMultisampleStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int rasterizationSamplesAt(long index) { return (int) VH_rasterizationSamples.get(this.segment(), 0L, index); }
    public int sampleShadingEnableAt(long index) { return (int) VH_sampleShadingEnable.get(this.segment(), 0L, index); }
    public float minSampleShadingAt(long index) { return (float) VH_minSampleShading.get(this.segment(), 0L, index); }
    public MemorySegment pSampleMaskAt(long index) { return (MemorySegment) VH_pSampleMask.get(this.segment(), 0L, index); }
    public int alphaToCoverageEnableAt(long index) { return (int) VH_alphaToCoverageEnable.get(this.segment(), 0L, index); }
    public int alphaToOneEnableAt(long index) { return (int) VH_alphaToOneEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int rasterizationSamples() { return (int) VH_rasterizationSamples.get(this.segment(), 0L, 0L); }
    public int sampleShadingEnable() { return (int) VH_sampleShadingEnable.get(this.segment(), 0L, 0L); }
    public float minSampleShading() { return (float) VH_minSampleShading.get(this.segment(), 0L, 0L); }
    public MemorySegment pSampleMask() { return (MemorySegment) VH_pSampleMask.get(this.segment(), 0L, 0L); }
    public int alphaToCoverageEnable() { return (int) VH_alphaToCoverageEnable.get(this.segment(), 0L, 0L); }
    public int alphaToOneEnable() { return (int) VH_alphaToOneEnable.get(this.segment(), 0L, 0L); }
    public VkPipelineMultisampleStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo rasterizationSamplesAt(long index, int value) { VH_rasterizationSamples.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnableAt(long index, int value) { VH_sampleShadingEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo minSampleShadingAt(long index, float value) { VH_minSampleShading.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo pSampleMaskAt(long index, MemorySegment value) { VH_pSampleMask.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnableAt(long index, int value) { VH_alphaToCoverageEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnableAt(long index, int value) { VH_alphaToOneEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineMultisampleStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo rasterizationSamples(int value) { VH_rasterizationSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(int value) { VH_sampleShadingEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo minSampleShading(float value) { VH_minSampleShading.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo pSampleMask(MemorySegment value) { VH_pSampleMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(int value) { VH_alphaToCoverageEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(int value) { VH_alphaToOneEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _rasterizationSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationSamples, index), LAYOUT_rasterizationSamples); }
    public MemorySegment _rasterizationSamples() { return _rasterizationSamplesAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _rasterizationSamplesAt(long index, MemorySegment src) { _rasterizationSamplesAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _rasterizationSamples(MemorySegment src) { return _rasterizationSamplesAt(0L, src); }
    public MemorySegment _sampleShadingEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleShadingEnable, index), LAYOUT_sampleShadingEnable); }
    public MemorySegment _sampleShadingEnable() { return _sampleShadingEnableAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _sampleShadingEnableAt(long index, MemorySegment src) { _sampleShadingEnableAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _sampleShadingEnable(MemorySegment src) { return _sampleShadingEnableAt(0L, src); }
    public MemorySegment _minSampleShadingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSampleShading, index), LAYOUT_minSampleShading); }
    public MemorySegment _minSampleShading() { return _minSampleShadingAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _minSampleShadingAt(long index, MemorySegment src) { _minSampleShadingAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _minSampleShading(MemorySegment src) { return _minSampleShadingAt(0L, src); }
    public MemorySegment _pSampleMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSampleMask, index), LAYOUT_pSampleMask); }
    public MemorySegment _pSampleMask() { return _pSampleMaskAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _pSampleMaskAt(long index, MemorySegment src) { _pSampleMaskAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _pSampleMask(MemorySegment src) { return _pSampleMaskAt(0L, src); }
    public MemorySegment _alphaToCoverageEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_alphaToCoverageEnable, index), LAYOUT_alphaToCoverageEnable); }
    public MemorySegment _alphaToCoverageEnable() { return _alphaToCoverageEnableAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _alphaToCoverageEnableAt(long index, MemorySegment src) { _alphaToCoverageEnableAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _alphaToCoverageEnable(MemorySegment src) { return _alphaToCoverageEnableAt(0L, src); }
    public MemorySegment _alphaToOneEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_alphaToOneEnable, index), LAYOUT_alphaToOneEnable); }
    public MemorySegment _alphaToOneEnable() { return _alphaToOneEnableAt(0L); }
    public VkPipelineMultisampleStateCreateInfo _alphaToOneEnableAt(long index, MemorySegment src) { _alphaToOneEnableAt(index).copyFrom(src); return this; }
    public VkPipelineMultisampleStateCreateInfo _alphaToOneEnable(MemorySegment src) { return _alphaToOneEnableAt(0L, src); }
}
