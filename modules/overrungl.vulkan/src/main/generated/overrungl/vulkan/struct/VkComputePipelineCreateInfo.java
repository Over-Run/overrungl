// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkComputePipelineCreateInfo`.
/// ## Layout
/// ```
/// struct VkComputePipelineCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     VkPipelineShaderStageCreateInfo stage;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// }
/// ```
public final class VkComputePipelineCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.struct.VkPipelineShaderStageCreateInfo.LAYOUT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_stage$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("sType"));
    public static final VarHandle VH_stage$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_stage$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("flags"));
    public static final VarHandle VH_stage$stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("stage"));
    public static final VarHandle VH_stage$module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("module"));
    public static final VarHandle VH_stage$pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("pName"));
    public static final VarHandle VH_stage$pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"), PathElement.groupElement("pSpecializationInfo"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    public VkComputePipelineCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkComputePipelineCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkComputePipelineCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkComputePipelineCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkComputePipelineCreateInfo alloc(SegmentAllocator allocator) { return new VkComputePipelineCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkComputePipelineCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkComputePipelineCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkComputePipelineCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO); }
    public static VkComputePipelineCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO);
        return s;
    }
    public VkComputePipelineCreateInfo copyFrom(VkComputePipelineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkComputePipelineCreateInfo reinterpret(long count) { return new VkComputePipelineCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkComputePipelineCreateInfo asSlice(long index) { return new VkComputePipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkComputePipelineCreateInfo asSlice(long index, long count) { return new VkComputePipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkComputePipelineCreateInfo at(long index, Consumer<VkComputePipelineCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stage$sTypeAt(long index) { return (int) VH_stage$sType.get(this.segment(), 0L, index); }
    public MemorySegment stage$pNextAt(long index) { return (MemorySegment) VH_stage$pNext.get(this.segment(), 0L, index); }
    public int stage$flagsAt(long index) { return (int) VH_stage$flags.get(this.segment(), 0L, index); }
    public int stage$stageAt(long index) { return (int) VH_stage$stage.get(this.segment(), 0L, index); }
    public long stage$moduleAt(long index) { return (long) VH_stage$module.get(this.segment(), 0L, index); }
    public MemorySegment stage$pNameAt(long index) { return (MemorySegment) VH_stage$pName.get(this.segment(), 0L, index); }
    public MemorySegment stage$pSpecializationInfoAt(long index) { return (MemorySegment) VH_stage$pSpecializationInfo.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public long basePipelineHandleAt(long index) { return (long) VH_basePipelineHandle.get(this.segment(), 0L, index); }
    public int basePipelineIndexAt(long index) { return (int) VH_basePipelineIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int stage$sType() { return (int) VH_stage$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment stage$pNext() { return (MemorySegment) VH_stage$pNext.get(this.segment(), 0L, 0L); }
    public int stage$flags() { return (int) VH_stage$flags.get(this.segment(), 0L, 0L); }
    public int stage$stage() { return (int) VH_stage$stage.get(this.segment(), 0L, 0L); }
    public long stage$module() { return (long) VH_stage$module.get(this.segment(), 0L, 0L); }
    public MemorySegment stage$pName() { return (MemorySegment) VH_stage$pName.get(this.segment(), 0L, 0L); }
    public MemorySegment stage$pSpecializationInfo() { return (MemorySegment) VH_stage$pSpecializationInfo.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public long basePipelineHandle() { return (long) VH_basePipelineHandle.get(this.segment(), 0L, 0L); }
    public int basePipelineIndex() { return (int) VH_basePipelineIndex.get(this.segment(), 0L, 0L); }
    public VkComputePipelineCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$sTypeAt(long index, int value) { VH_stage$sType.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$pNextAt(long index, MemorySegment value) { VH_stage$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$flagsAt(long index, int value) { VH_stage$flags.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$stageAt(long index, int value) { VH_stage$stage.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$moduleAt(long index, long value) { VH_stage$module.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$pNameAt(long index, MemorySegment value) { VH_stage$pName.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo stage$pSpecializationInfoAt(long index, MemorySegment value) { VH_stage$pSpecializationInfo.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo basePipelineHandleAt(long index, long value) { VH_basePipelineHandle.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo basePipelineIndexAt(long index, int value) { VH_basePipelineIndex.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$sType(int value) { VH_stage$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$pNext(MemorySegment value) { VH_stage$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$flags(int value) { VH_stage$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$stage(int value) { VH_stage$stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$module(long value) { VH_stage$module.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$pName(MemorySegment value) { VH_stage$pName.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo stage$pSpecializationInfo(MemorySegment value) { VH_stage$pSpecializationInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo basePipelineHandle(long value) { VH_basePipelineHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineCreateInfo basePipelineIndex(int value) { VH_basePipelineIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkComputePipelineCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkComputePipelineCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkComputePipelineCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkComputePipelineCreateInfo _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkComputePipelineCreateInfo _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _basePipelineHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineHandle, index), LAYOUT_basePipelineHandle); }
    public MemorySegment _basePipelineHandle() { return _basePipelineHandleAt(0L); }
    public VkComputePipelineCreateInfo _basePipelineHandleAt(long index, MemorySegment src) { _basePipelineHandleAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _basePipelineHandle(MemorySegment src) { return _basePipelineHandleAt(0L, src); }
    public MemorySegment _basePipelineIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineIndex, index), LAYOUT_basePipelineIndex); }
    public MemorySegment _basePipelineIndex() { return _basePipelineIndexAt(0L); }
    public VkComputePipelineCreateInfo _basePipelineIndexAt(long index, MemorySegment src) { _basePipelineIndexAt(index).copyFrom(src); return this; }
    public VkComputePipelineCreateInfo _basePipelineIndex(MemorySegment src) { return _basePipelineIndexAt(0L, src); }
}
