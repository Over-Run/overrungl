// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCoverageModulationStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineCoverageModulationStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCoverageModulationStateCreateFlagsNV flags;
///     VkCoverageModulationModeNV coverageModulationMode;
///     VkBool32 coverageModulationTableEnable;
///     uint32_t coverageModulationTableCount;
///     const float* pCoverageModulationTable;
/// }
/// ```
public final class VkPipelineCoverageModulationStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageModulationMode"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableCount"),
        ValueLayout.ADDRESS.withName("pCoverageModulationTable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_coverageModulationMode = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationMode"));
    public static final long OFFSET_coverageModulationTableEnable = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationTableEnable"));
    public static final long OFFSET_coverageModulationTableCount = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationTableCount"));
    public static final long OFFSET_pCoverageModulationTable = LAYOUT.byteOffset(PathElement.groupElement("pCoverageModulationTable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_coverageModulationMode = LAYOUT.select(PathElement.groupElement("coverageModulationMode"));
    public static final MemoryLayout LAYOUT_coverageModulationTableEnable = LAYOUT.select(PathElement.groupElement("coverageModulationTableEnable"));
    public static final MemoryLayout LAYOUT_coverageModulationTableCount = LAYOUT.select(PathElement.groupElement("coverageModulationTableCount"));
    public static final MemoryLayout LAYOUT_pCoverageModulationTable = LAYOUT.select(PathElement.groupElement("pCoverageModulationTable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_coverageModulationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationMode"));
    public static final VarHandle VH_coverageModulationTableEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationTableEnable"));
    public static final VarHandle VH_coverageModulationTableCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationTableCount"));
    public static final VarHandle VH_pCoverageModulationTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCoverageModulationTable"));

    public VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCoverageModulationStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCoverageModulationStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCoverageModulationStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCoverageModulationStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageModulationStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCoverageModulationStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineCoverageModulationStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVFramebufferMixedSamples.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV); }
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVFramebufferMixedSamples.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineCoverageModulationStateCreateInfoNV copyFrom(VkPipelineCoverageModulationStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV reinterpret(long count) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCoverageModulationStateCreateInfoNV asSlice(long index) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCoverageModulationStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCoverageModulationStateCreateInfoNV at(long index, Consumer<VkPipelineCoverageModulationStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int coverageModulationModeAt(long index) { return (int) VH_coverageModulationMode.get(this.segment(), 0L, index); }
    public int coverageModulationTableEnableAt(long index) { return (int) VH_coverageModulationTableEnable.get(this.segment(), 0L, index); }
    public int coverageModulationTableCountAt(long index) { return (int) VH_coverageModulationTableCount.get(this.segment(), 0L, index); }
    public MemorySegment pCoverageModulationTableAt(long index) { return (MemorySegment) VH_pCoverageModulationTable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int coverageModulationMode() { return (int) VH_coverageModulationMode.get(this.segment(), 0L, 0L); }
    public int coverageModulationTableEnable() { return (int) VH_coverageModulationTableEnable.get(this.segment(), 0L, 0L); }
    public int coverageModulationTableCount() { return (int) VH_coverageModulationTableCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCoverageModulationTable() { return (MemorySegment) VH_pCoverageModulationTable.get(this.segment(), 0L, 0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationModeAt(long index, int value) { VH_coverageModulationMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnableAt(long index, int value) { VH_coverageModulationTableEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCountAt(long index, int value) { VH_coverageModulationTableCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTableAt(long index, MemorySegment value) { VH_pCoverageModulationTable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(int value) { VH_coverageModulationMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(int value) { VH_coverageModulationTableEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(int value) { VH_coverageModulationTableCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(MemorySegment value) { VH_pCoverageModulationTable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _coverageModulationModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageModulationMode, index), LAYOUT_coverageModulationMode); }
    public MemorySegment _coverageModulationMode() { return _coverageModulationModeAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _coverageModulationModeAt(long index, MemorySegment src) { _coverageModulationModeAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _coverageModulationMode(MemorySegment src) { return _coverageModulationModeAt(0L, src); }
    public MemorySegment _coverageModulationTableEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageModulationTableEnable, index), LAYOUT_coverageModulationTableEnable); }
    public MemorySegment _coverageModulationTableEnable() { return _coverageModulationTableEnableAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _coverageModulationTableEnableAt(long index, MemorySegment src) { _coverageModulationTableEnableAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _coverageModulationTableEnable(MemorySegment src) { return _coverageModulationTableEnableAt(0L, src); }
    public MemorySegment _coverageModulationTableCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageModulationTableCount, index), LAYOUT_coverageModulationTableCount); }
    public MemorySegment _coverageModulationTableCount() { return _coverageModulationTableCountAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _coverageModulationTableCountAt(long index, MemorySegment src) { _coverageModulationTableCountAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _coverageModulationTableCount(MemorySegment src) { return _coverageModulationTableCountAt(0L, src); }
    public MemorySegment _pCoverageModulationTableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCoverageModulationTable, index), LAYOUT_pCoverageModulationTable); }
    public MemorySegment _pCoverageModulationTable() { return _pCoverageModulationTableAt(0L); }
    public VkPipelineCoverageModulationStateCreateInfoNV _pCoverageModulationTableAt(long index, MemorySegment src) { _pCoverageModulationTableAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageModulationStateCreateInfoNV _pCoverageModulationTable(MemorySegment src) { return _pCoverageModulationTableAt(0L, src); }
}
