// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRasterizationStateCreateFlags flags;
///     VkBool32 depthClampEnable;
///     VkBool32 rasterizerDiscardEnable;
///     VkPolygonMode polygonMode;
///     VkCullModeFlags cullMode;
///     VkFrontFace frontFace;
///     VkBool32 depthBiasEnable;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
///     float lineWidth;
/// }
/// ```
public final class VkPipelineRasterizationStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthClampEnable"),
        ValueLayout.JAVA_INT.withName("rasterizerDiscardEnable"),
        ValueLayout.JAVA_INT.withName("polygonMode"),
        ValueLayout.JAVA_INT.withName("cullMode"),
        ValueLayout.JAVA_INT.withName("frontFace"),
        ValueLayout.JAVA_INT.withName("depthBiasEnable"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor"),
        ValueLayout.JAVA_FLOAT.withName("lineWidth")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_depthClampEnable = LAYOUT.byteOffset(PathElement.groupElement("depthClampEnable"));
    public static final long OFFSET_rasterizerDiscardEnable = LAYOUT.byteOffset(PathElement.groupElement("rasterizerDiscardEnable"));
    public static final long OFFSET_polygonMode = LAYOUT.byteOffset(PathElement.groupElement("polygonMode"));
    public static final long OFFSET_cullMode = LAYOUT.byteOffset(PathElement.groupElement("cullMode"));
    public static final long OFFSET_frontFace = LAYOUT.byteOffset(PathElement.groupElement("frontFace"));
    public static final long OFFSET_depthBiasEnable = LAYOUT.byteOffset(PathElement.groupElement("depthBiasEnable"));
    public static final long OFFSET_depthBiasConstantFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasConstantFactor"));
    public static final long OFFSET_depthBiasClamp = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
    public static final long OFFSET_depthBiasSlopeFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasSlopeFactor"));
    public static final long OFFSET_lineWidth = LAYOUT.byteOffset(PathElement.groupElement("lineWidth"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_depthClampEnable = LAYOUT.select(PathElement.groupElement("depthClampEnable"));
    public static final MemoryLayout LAYOUT_rasterizerDiscardEnable = LAYOUT.select(PathElement.groupElement("rasterizerDiscardEnable"));
    public static final MemoryLayout LAYOUT_polygonMode = LAYOUT.select(PathElement.groupElement("polygonMode"));
    public static final MemoryLayout LAYOUT_cullMode = LAYOUT.select(PathElement.groupElement("cullMode"));
    public static final MemoryLayout LAYOUT_frontFace = LAYOUT.select(PathElement.groupElement("frontFace"));
    public static final MemoryLayout LAYOUT_depthBiasEnable = LAYOUT.select(PathElement.groupElement("depthBiasEnable"));
    public static final MemoryLayout LAYOUT_depthBiasConstantFactor = LAYOUT.select(PathElement.groupElement("depthBiasConstantFactor"));
    public static final MemoryLayout LAYOUT_depthBiasClamp = LAYOUT.select(PathElement.groupElement("depthBiasClamp"));
    public static final MemoryLayout LAYOUT_depthBiasSlopeFactor = LAYOUT.select(PathElement.groupElement("depthBiasSlopeFactor"));
    public static final MemoryLayout LAYOUT_lineWidth = LAYOUT.select(PathElement.groupElement("lineWidth"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_depthClampEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampEnable"));
    public static final VarHandle VH_rasterizerDiscardEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizerDiscardEnable"));
    public static final VarHandle VH_polygonMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonMode"));
    public static final VarHandle VH_cullMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cullMode"));
    public static final VarHandle VH_frontFace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frontFace"));
    public static final VarHandle VH_depthBiasEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasEnable"));
    public static final VarHandle VH_depthBiasConstantFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasConstantFactor"));
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    public static final VarHandle VH_depthBiasSlopeFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasSlopeFactor"));
    public static final VarHandle VH_lineWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidth"));

    public VkPipelineRasterizationStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO); }
    public static VkPipelineRasterizationStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineRasterizationStateCreateInfo copyFrom(VkPipelineRasterizationStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationStateCreateInfo reinterpret(long count) { return new VkPipelineRasterizationStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationStateCreateInfo asSlice(long index) { return new VkPipelineRasterizationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationStateCreateInfo asSlice(long index, long count) { return new VkPipelineRasterizationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationStateCreateInfo at(long index, Consumer<VkPipelineRasterizationStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int depthClampEnableAt(long index) { return (int) VH_depthClampEnable.get(this.segment(), 0L, index); }
    public int rasterizerDiscardEnableAt(long index) { return (int) VH_rasterizerDiscardEnable.get(this.segment(), 0L, index); }
    public int polygonModeAt(long index) { return (int) VH_polygonMode.get(this.segment(), 0L, index); }
    public int cullModeAt(long index) { return (int) VH_cullMode.get(this.segment(), 0L, index); }
    public int frontFaceAt(long index) { return (int) VH_frontFace.get(this.segment(), 0L, index); }
    public int depthBiasEnableAt(long index) { return (int) VH_depthBiasEnable.get(this.segment(), 0L, index); }
    public float depthBiasConstantFactorAt(long index) { return (float) VH_depthBiasConstantFactor.get(this.segment(), 0L, index); }
    public float depthBiasClampAt(long index) { return (float) VH_depthBiasClamp.get(this.segment(), 0L, index); }
    public float depthBiasSlopeFactorAt(long index) { return (float) VH_depthBiasSlopeFactor.get(this.segment(), 0L, index); }
    public float lineWidthAt(long index) { return (float) VH_lineWidth.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int depthClampEnable() { return (int) VH_depthClampEnable.get(this.segment(), 0L, 0L); }
    public int rasterizerDiscardEnable() { return (int) VH_rasterizerDiscardEnable.get(this.segment(), 0L, 0L); }
    public int polygonMode() { return (int) VH_polygonMode.get(this.segment(), 0L, 0L); }
    public int cullMode() { return (int) VH_cullMode.get(this.segment(), 0L, 0L); }
    public int frontFace() { return (int) VH_frontFace.get(this.segment(), 0L, 0L); }
    public int depthBiasEnable() { return (int) VH_depthBiasEnable.get(this.segment(), 0L, 0L); }
    public float depthBiasConstantFactor() { return (float) VH_depthBiasConstantFactor.get(this.segment(), 0L, 0L); }
    public float depthBiasClamp() { return (float) VH_depthBiasClamp.get(this.segment(), 0L, 0L); }
    public float depthBiasSlopeFactor() { return (float) VH_depthBiasSlopeFactor.get(this.segment(), 0L, 0L); }
    public float lineWidth() { return (float) VH_lineWidth.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthClampEnableAt(long index, int value) { VH_depthClampEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnableAt(long index, int value) { VH_rasterizerDiscardEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo polygonModeAt(long index, int value) { VH_polygonMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo cullModeAt(long index, int value) { VH_cullMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo frontFaceAt(long index, int value) { VH_frontFace.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasEnableAt(long index, int value) { VH_depthBiasEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactorAt(long index, float value) { VH_depthBiasConstantFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasClampAt(long index, float value) { VH_depthBiasClamp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactorAt(long index, float value) { VH_depthBiasSlopeFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo lineWidthAt(long index, float value) { VH_lineWidth.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthClampEnable(int value) { VH_depthClampEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(int value) { VH_rasterizerDiscardEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo polygonMode(int value) { VH_polygonMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo cullMode(int value) { VH_cullMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo frontFace(int value) { VH_frontFace.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasEnable(int value) { VH_depthBiasEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float value) { VH_depthBiasConstantFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float value) { VH_depthBiasClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float value) { VH_depthBiasSlopeFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateCreateInfo lineWidth(float value) { VH_lineWidth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _depthClampEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClampEnable, index), LAYOUT_depthClampEnable); }
    public MemorySegment _depthClampEnable() { return _depthClampEnableAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _depthClampEnableAt(long index, MemorySegment src) { _depthClampEnableAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _depthClampEnable(MemorySegment src) { return _depthClampEnableAt(0L, src); }
    public MemorySegment _rasterizerDiscardEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizerDiscardEnable, index), LAYOUT_rasterizerDiscardEnable); }
    public MemorySegment _rasterizerDiscardEnable() { return _rasterizerDiscardEnableAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _rasterizerDiscardEnableAt(long index, MemorySegment src) { _rasterizerDiscardEnableAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _rasterizerDiscardEnable(MemorySegment src) { return _rasterizerDiscardEnableAt(0L, src); }
    public MemorySegment _polygonModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_polygonMode, index), LAYOUT_polygonMode); }
    public MemorySegment _polygonMode() { return _polygonModeAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _polygonModeAt(long index, MemorySegment src) { _polygonModeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _polygonMode(MemorySegment src) { return _polygonModeAt(0L, src); }
    public MemorySegment _cullModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cullMode, index), LAYOUT_cullMode); }
    public MemorySegment _cullMode() { return _cullModeAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _cullModeAt(long index, MemorySegment src) { _cullModeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _cullMode(MemorySegment src) { return _cullModeAt(0L, src); }
    public MemorySegment _frontFaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frontFace, index), LAYOUT_frontFace); }
    public MemorySegment _frontFace() { return _frontFaceAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _frontFaceAt(long index, MemorySegment src) { _frontFaceAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _frontFace(MemorySegment src) { return _frontFaceAt(0L, src); }
    public MemorySegment _depthBiasEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasEnable, index), LAYOUT_depthBiasEnable); }
    public MemorySegment _depthBiasEnable() { return _depthBiasEnableAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _depthBiasEnableAt(long index, MemorySegment src) { _depthBiasEnableAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _depthBiasEnable(MemorySegment src) { return _depthBiasEnableAt(0L, src); }
    public MemorySegment _depthBiasConstantFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasConstantFactor, index), LAYOUT_depthBiasConstantFactor); }
    public MemorySegment _depthBiasConstantFactor() { return _depthBiasConstantFactorAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _depthBiasConstantFactorAt(long index, MemorySegment src) { _depthBiasConstantFactorAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _depthBiasConstantFactor(MemorySegment src) { return _depthBiasConstantFactorAt(0L, src); }
    public MemorySegment _depthBiasClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasClamp, index), LAYOUT_depthBiasClamp); }
    public MemorySegment _depthBiasClamp() { return _depthBiasClampAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _depthBiasClampAt(long index, MemorySegment src) { _depthBiasClampAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _depthBiasClamp(MemorySegment src) { return _depthBiasClampAt(0L, src); }
    public MemorySegment _depthBiasSlopeFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasSlopeFactor, index), LAYOUT_depthBiasSlopeFactor); }
    public MemorySegment _depthBiasSlopeFactor() { return _depthBiasSlopeFactorAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _depthBiasSlopeFactorAt(long index, MemorySegment src) { _depthBiasSlopeFactorAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _depthBiasSlopeFactor(MemorySegment src) { return _depthBiasSlopeFactorAt(0L, src); }
    public MemorySegment _lineWidthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineWidth, index), LAYOUT_lineWidth); }
    public MemorySegment _lineWidth() { return _lineWidthAt(0L); }
    public VkPipelineRasterizationStateCreateInfo _lineWidthAt(long index, MemorySegment src) { _lineWidthAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateCreateInfo _lineWidth(MemorySegment src) { return _lineWidthAt(0L, src); }
}
