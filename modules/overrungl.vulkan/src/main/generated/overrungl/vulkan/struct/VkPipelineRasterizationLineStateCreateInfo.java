// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationLineStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationLineStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkLineRasterizationMode lineRasterizationMode;
///     VkBool32 stippledLineEnable;
///     uint32_t lineStippleFactor;
///     uint16_t lineStipplePattern;
/// }
/// ```
public final class VkPipelineRasterizationLineStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("stippledLineEnable"),
        ValueLayout.JAVA_INT.withName("lineStippleFactor"),
        ValueLayout.JAVA_SHORT.withName("lineStipplePattern")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_lineRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("lineRasterizationMode"));
    public static final long OFFSET_stippledLineEnable = LAYOUT.byteOffset(PathElement.groupElement("stippledLineEnable"));
    public static final long OFFSET_lineStippleFactor = LAYOUT.byteOffset(PathElement.groupElement("lineStippleFactor"));
    public static final long OFFSET_lineStipplePattern = LAYOUT.byteOffset(PathElement.groupElement("lineStipplePattern"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_lineRasterizationMode = LAYOUT.select(PathElement.groupElement("lineRasterizationMode"));
    public static final MemoryLayout LAYOUT_stippledLineEnable = LAYOUT.select(PathElement.groupElement("stippledLineEnable"));
    public static final MemoryLayout LAYOUT_lineStippleFactor = LAYOUT.select(PathElement.groupElement("lineStippleFactor"));
    public static final MemoryLayout LAYOUT_lineStipplePattern = LAYOUT.select(PathElement.groupElement("lineStipplePattern"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_lineRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineRasterizationMode"));
    public static final VarHandle VH_stippledLineEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledLineEnable"));
    public static final VarHandle VH_lineStippleFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineStippleFactor"));
    public static final VarHandle VH_lineStipplePattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineStipplePattern"));

    public VkPipelineRasterizationLineStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationLineStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationLineStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationLineStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationLineStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationLineStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationLineStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationLineStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationLineStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
    public static VkPipelineRasterizationLineStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineRasterizationLineStateCreateInfo copyFrom(VkPipelineRasterizationLineStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationLineStateCreateInfo reinterpret(long count) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationLineStateCreateInfo asSlice(long index) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationLineStateCreateInfo asSlice(long index, long count) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationLineStateCreateInfo at(long index, Consumer<VkPipelineRasterizationLineStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int lineRasterizationModeAt(long index) { return (int) VH_lineRasterizationMode.get(this.segment(), 0L, index); }
    public int stippledLineEnableAt(long index) { return (int) VH_stippledLineEnable.get(this.segment(), 0L, index); }
    public int lineStippleFactorAt(long index) { return (int) VH_lineStippleFactor.get(this.segment(), 0L, index); }
    public short lineStipplePatternAt(long index) { return (short) VH_lineStipplePattern.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int lineRasterizationMode() { return (int) VH_lineRasterizationMode.get(this.segment(), 0L, 0L); }
    public int stippledLineEnable() { return (int) VH_stippledLineEnable.get(this.segment(), 0L, 0L); }
    public int lineStippleFactor() { return (int) VH_lineStippleFactor.get(this.segment(), 0L, 0L); }
    public short lineStipplePattern() { return (short) VH_lineStipplePattern.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationLineStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationModeAt(long index, int value) { VH_lineRasterizationMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnableAt(long index, int value) { VH_stippledLineEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactorAt(long index, int value) { VH_lineStippleFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePatternAt(long index, short value) { VH_lineStipplePattern.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(int value) { VH_lineRasterizationMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(int value) { VH_stippledLineEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(int value) { VH_lineStippleFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(short value) { VH_lineStipplePattern.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationLineStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationLineStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationLineStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationLineStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _lineRasterizationModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineRasterizationMode, index), LAYOUT_lineRasterizationMode); }
    public MemorySegment _lineRasterizationMode() { return _lineRasterizationModeAt(0L); }
    public VkPipelineRasterizationLineStateCreateInfo _lineRasterizationModeAt(long index, MemorySegment src) { _lineRasterizationModeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationLineStateCreateInfo _lineRasterizationMode(MemorySegment src) { return _lineRasterizationModeAt(0L, src); }
    public MemorySegment _stippledLineEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledLineEnable, index), LAYOUT_stippledLineEnable); }
    public MemorySegment _stippledLineEnable() { return _stippledLineEnableAt(0L); }
    public VkPipelineRasterizationLineStateCreateInfo _stippledLineEnableAt(long index, MemorySegment src) { _stippledLineEnableAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationLineStateCreateInfo _stippledLineEnable(MemorySegment src) { return _stippledLineEnableAt(0L, src); }
    public MemorySegment _lineStippleFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineStippleFactor, index), LAYOUT_lineStippleFactor); }
    public MemorySegment _lineStippleFactor() { return _lineStippleFactorAt(0L); }
    public VkPipelineRasterizationLineStateCreateInfo _lineStippleFactorAt(long index, MemorySegment src) { _lineStippleFactorAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationLineStateCreateInfo _lineStippleFactor(MemorySegment src) { return _lineStippleFactorAt(0L, src); }
    public MemorySegment _lineStipplePatternAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineStipplePattern, index), LAYOUT_lineStipplePattern); }
    public MemorySegment _lineStipplePattern() { return _lineStipplePatternAt(0L); }
    public VkPipelineRasterizationLineStateCreateInfo _lineStipplePatternAt(long index, MemorySegment src) { _lineStipplePatternAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationLineStateCreateInfo _lineStipplePattern(MemorySegment src) { return _lineStipplePatternAt(0L, src); }
}
