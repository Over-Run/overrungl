// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineShaderStageCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineShaderStageCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineShaderStageCreateFlags flags;
///     VkShaderStageFlagBits stage;
///     VkShaderModule module;
///     const char* pName;
///     const VkSpecializationInfo* pSpecializationInfo;
/// }
/// ```
public final class VkPipelineShaderStageCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("module"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    public static final long OFFSET_module = LAYOUT.byteOffset(PathElement.groupElement("module"));
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    public static final long OFFSET_pSpecializationInfo = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    public static final MemoryLayout LAYOUT_module = LAYOUT.select(PathElement.groupElement("module"));
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    public static final MemoryLayout LAYOUT_pSpecializationInfo = LAYOUT.select(PathElement.groupElement("pSpecializationInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));

    public VkPipelineShaderStageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineShaderStageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineShaderStageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineShaderStageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineShaderStageCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineShaderStageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineShaderStageCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO); }
    public static VkPipelineShaderStageCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO);
        return s;
    }
    public VkPipelineShaderStageCreateInfo copyFrom(VkPipelineShaderStageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineShaderStageCreateInfo reinterpret(long count) { return new VkPipelineShaderStageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineShaderStageCreateInfo asSlice(long index) { return new VkPipelineShaderStageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineShaderStageCreateInfo asSlice(long index, long count) { return new VkPipelineShaderStageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineShaderStageCreateInfo at(long index, Consumer<VkPipelineShaderStageCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stageAt(long index) { return (int) VH_stage.get(this.segment(), 0L, index); }
    public long moduleAt(long index) { return (long) VH_module.get(this.segment(), 0L, index); }
    public MemorySegment pNameAt(long index) { return (MemorySegment) VH_pName.get(this.segment(), 0L, index); }
    public MemorySegment pSpecializationInfoAt(long index) { return (MemorySegment) VH_pSpecializationInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int stage() { return (int) VH_stage.get(this.segment(), 0L, 0L); }
    public long module() { return (long) VH_module.get(this.segment(), 0L, 0L); }
    public MemorySegment pName() { return (MemorySegment) VH_pName.get(this.segment(), 0L, 0L); }
    public MemorySegment pSpecializationInfo() { return (MemorySegment) VH_pSpecializationInfo.get(this.segment(), 0L, 0L); }
    public VkPipelineShaderStageCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo stageAt(long index, int value) { VH_stage.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo moduleAt(long index, long value) { VH_module.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo pNameAt(long index, MemorySegment value) { VH_pName.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo pSpecializationInfoAt(long index, MemorySegment value) { VH_pSpecializationInfo.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageCreateInfo stage(int value) { VH_stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageCreateInfo module(long value) { VH_module.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageCreateInfo pName(MemorySegment value) { VH_pName.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageCreateInfo pSpecializationInfo(MemorySegment value) { VH_pSpecializationInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineShaderStageCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineShaderStageCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineShaderStageCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkPipelineShaderStageCreateInfo _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _moduleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_module, index), LAYOUT_module); }
    public MemorySegment _module() { return _moduleAt(0L); }
    public VkPipelineShaderStageCreateInfo _moduleAt(long index, MemorySegment src) { _moduleAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _module(MemorySegment src) { return _moduleAt(0L, src); }
    public MemorySegment _pNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pName, index), LAYOUT_pName); }
    public MemorySegment _pName() { return _pNameAt(0L); }
    public VkPipelineShaderStageCreateInfo _pNameAt(long index, MemorySegment src) { _pNameAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _pName(MemorySegment src) { return _pNameAt(0L, src); }
    public MemorySegment _pSpecializationInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSpecializationInfo, index), LAYOUT_pSpecializationInfo); }
    public MemorySegment _pSpecializationInfo() { return _pSpecializationInfoAt(0L); }
    public VkPipelineShaderStageCreateInfo _pSpecializationInfoAt(long index, MemorySegment src) { _pSpecializationInfoAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageCreateInfo _pSpecializationInfo(MemorySegment src) { return _pSpecializationInfoAt(0L, src); }
}
