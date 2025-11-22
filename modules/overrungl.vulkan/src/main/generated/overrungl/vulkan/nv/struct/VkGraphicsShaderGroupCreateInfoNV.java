// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGraphicsShaderGroupCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkGraphicsShaderGroupCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
///     const VkPipelineTessellationStateCreateInfo* pTessellationState;
/// }
/// ```
public final class VkGraphicsShaderGroupCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pVertexInputState"),
        ValueLayout.ADDRESS.withName("pTessellationState")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    public static final long OFFSET_pVertexInputState = LAYOUT.byteOffset(PathElement.groupElement("pVertexInputState"));
    public static final long OFFSET_pTessellationState = LAYOUT.byteOffset(PathElement.groupElement("pTessellationState"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    public static final MemoryLayout LAYOUT_pVertexInputState = LAYOUT.select(PathElement.groupElement("pVertexInputState"));
    public static final MemoryLayout LAYOUT_pTessellationState = LAYOUT.select(PathElement.groupElement("pTessellationState"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    public static final VarHandle VH_pVertexInputState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexInputState"));
    public static final VarHandle VH_pTessellationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTessellationState"));

    public VkGraphicsShaderGroupCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGraphicsShaderGroupCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGraphicsShaderGroupCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGraphicsShaderGroupCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGraphicsShaderGroupCreateInfoNV alloc(SegmentAllocator allocator) { return new VkGraphicsShaderGroupCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkGraphicsShaderGroupCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGraphicsShaderGroupCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV); }
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV);
        return s;
    }
    public VkGraphicsShaderGroupCreateInfoNV copyFrom(VkGraphicsShaderGroupCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGraphicsShaderGroupCreateInfoNV reinterpret(long count) { return new VkGraphicsShaderGroupCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGraphicsShaderGroupCreateInfoNV asSlice(long index) { return new VkGraphicsShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGraphicsShaderGroupCreateInfoNV asSlice(long index, long count) { return new VkGraphicsShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGraphicsShaderGroupCreateInfoNV at(long index, Consumer<VkGraphicsShaderGroupCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageCountAt(long index) { return (int) VH_stageCount.get(this.segment(), 0L, index); }
    public MemorySegment pStagesAt(long index) { return (MemorySegment) VH_pStages.get(this.segment(), 0L, index); }
    public MemorySegment pVertexInputStateAt(long index) { return (MemorySegment) VH_pVertexInputState.get(this.segment(), 0L, index); }
    public MemorySegment pTessellationStateAt(long index) { return (MemorySegment) VH_pTessellationState.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stageCount() { return (int) VH_stageCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStages() { return (MemorySegment) VH_pStages.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexInputState() { return (MemorySegment) VH_pVertexInputState.get(this.segment(), 0L, 0L); }
    public MemorySegment pTessellationState() { return (MemorySegment) VH_pTessellationState.get(this.segment(), 0L, 0L); }
    public VkGraphicsShaderGroupCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV stageCountAt(long index, int value) { VH_stageCount.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pStagesAt(long index, MemorySegment value) { VH_pStages.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputStateAt(long index, MemorySegment value) { VH_pVertexInputState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pTessellationStateAt(long index, MemorySegment value) { VH_pTessellationState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV stageCount(int value) { VH_stageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pStages(MemorySegment value) { VH_pStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputState(MemorySegment value) { VH_pVertexInputState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsShaderGroupCreateInfoNV pTessellationState(MemorySegment value) { VH_pTessellationState.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGraphicsShaderGroupCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGraphicsShaderGroupCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGraphicsShaderGroupCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGraphicsShaderGroupCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageCount, index), LAYOUT_stageCount); }
    public MemorySegment _stageCount() { return _stageCountAt(0L); }
    public VkGraphicsShaderGroupCreateInfoNV _stageCountAt(long index, MemorySegment src) { _stageCountAt(index).copyFrom(src); return this; }
    public VkGraphicsShaderGroupCreateInfoNV _stageCount(MemorySegment src) { return _stageCountAt(0L, src); }
    public MemorySegment _pStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStages, index), LAYOUT_pStages); }
    public MemorySegment _pStages() { return _pStagesAt(0L); }
    public VkGraphicsShaderGroupCreateInfoNV _pStagesAt(long index, MemorySegment src) { _pStagesAt(index).copyFrom(src); return this; }
    public VkGraphicsShaderGroupCreateInfoNV _pStages(MemorySegment src) { return _pStagesAt(0L, src); }
    public MemorySegment _pVertexInputStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexInputState, index), LAYOUT_pVertexInputState); }
    public MemorySegment _pVertexInputState() { return _pVertexInputStateAt(0L); }
    public VkGraphicsShaderGroupCreateInfoNV _pVertexInputStateAt(long index, MemorySegment src) { _pVertexInputStateAt(index).copyFrom(src); return this; }
    public VkGraphicsShaderGroupCreateInfoNV _pVertexInputState(MemorySegment src) { return _pVertexInputStateAt(0L, src); }
    public MemorySegment _pTessellationStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTessellationState, index), LAYOUT_pTessellationState); }
    public MemorySegment _pTessellationState() { return _pTessellationStateAt(0L); }
    public VkGraphicsShaderGroupCreateInfoNV _pTessellationStateAt(long index, MemorySegment src) { _pTessellationStateAt(index).copyFrom(src); return this; }
    public VkGraphicsShaderGroupCreateInfoNV _pTessellationState(MemorySegment src) { return _pTessellationStateAt(0L, src); }
}
