// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGraphicsPipelineCreateInfo`.
/// ## Layout
/// ```
/// struct VkGraphicsPipelineCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
///     const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState;
///     const VkPipelineTessellationStateCreateInfo* pTessellationState;
///     const VkPipelineViewportStateCreateInfo* pViewportState;
///     const VkPipelineRasterizationStateCreateInfo* pRasterizationState;
///     const VkPipelineMultisampleStateCreateInfo* pMultisampleState;
///     const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState;
///     const VkPipelineColorBlendStateCreateInfo* pColorBlendState;
///     const VkPipelineDynamicStateCreateInfo* pDynamicState;
///     VkPipelineLayout layout;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// }
/// ```
public final class VkGraphicsPipelineCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pVertexInputState"),
        ValueLayout.ADDRESS.withName("pInputAssemblyState"),
        ValueLayout.ADDRESS.withName("pTessellationState"),
        ValueLayout.ADDRESS.withName("pViewportState"),
        ValueLayout.ADDRESS.withName("pRasterizationState"),
        ValueLayout.ADDRESS.withName("pMultisampleState"),
        ValueLayout.ADDRESS.withName("pDepthStencilState"),
        ValueLayout.ADDRESS.withName("pColorBlendState"),
        ValueLayout.ADDRESS.withName("pDynamicState"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    public static final long OFFSET_pVertexInputState = LAYOUT.byteOffset(PathElement.groupElement("pVertexInputState"));
    public static final long OFFSET_pInputAssemblyState = LAYOUT.byteOffset(PathElement.groupElement("pInputAssemblyState"));
    public static final long OFFSET_pTessellationState = LAYOUT.byteOffset(PathElement.groupElement("pTessellationState"));
    public static final long OFFSET_pViewportState = LAYOUT.byteOffset(PathElement.groupElement("pViewportState"));
    public static final long OFFSET_pRasterizationState = LAYOUT.byteOffset(PathElement.groupElement("pRasterizationState"));
    public static final long OFFSET_pMultisampleState = LAYOUT.byteOffset(PathElement.groupElement("pMultisampleState"));
    public static final long OFFSET_pDepthStencilState = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilState"));
    public static final long OFFSET_pColorBlendState = LAYOUT.byteOffset(PathElement.groupElement("pColorBlendState"));
    public static final long OFFSET_pDynamicState = LAYOUT.byteOffset(PathElement.groupElement("pDynamicState"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    public static final MemoryLayout LAYOUT_pVertexInputState = LAYOUT.select(PathElement.groupElement("pVertexInputState"));
    public static final MemoryLayout LAYOUT_pInputAssemblyState = LAYOUT.select(PathElement.groupElement("pInputAssemblyState"));
    public static final MemoryLayout LAYOUT_pTessellationState = LAYOUT.select(PathElement.groupElement("pTessellationState"));
    public static final MemoryLayout LAYOUT_pViewportState = LAYOUT.select(PathElement.groupElement("pViewportState"));
    public static final MemoryLayout LAYOUT_pRasterizationState = LAYOUT.select(PathElement.groupElement("pRasterizationState"));
    public static final MemoryLayout LAYOUT_pMultisampleState = LAYOUT.select(PathElement.groupElement("pMultisampleState"));
    public static final MemoryLayout LAYOUT_pDepthStencilState = LAYOUT.select(PathElement.groupElement("pDepthStencilState"));
    public static final MemoryLayout LAYOUT_pColorBlendState = LAYOUT.select(PathElement.groupElement("pColorBlendState"));
    public static final MemoryLayout LAYOUT_pDynamicState = LAYOUT.select(PathElement.groupElement("pDynamicState"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    public static final VarHandle VH_pVertexInputState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexInputState"));
    public static final VarHandle VH_pInputAssemblyState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAssemblyState"));
    public static final VarHandle VH_pTessellationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTessellationState"));
    public static final VarHandle VH_pViewportState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportState"));
    public static final VarHandle VH_pRasterizationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRasterizationState"));
    public static final VarHandle VH_pMultisampleState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMultisampleState"));
    public static final VarHandle VH_pDepthStencilState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilState"));
    public static final VarHandle VH_pColorBlendState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorBlendState"));
    public static final VarHandle VH_pDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicState"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    public VkGraphicsPipelineCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGraphicsPipelineCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkGraphicsPipelineCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGraphicsPipelineCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGraphicsPipelineCreateInfo alloc(SegmentAllocator allocator) { return new VkGraphicsPipelineCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkGraphicsPipelineCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkGraphicsPipelineCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkGraphicsPipelineCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO); }
    public static VkGraphicsPipelineCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO);
        return s;
    }
    public VkGraphicsPipelineCreateInfo copyFrom(VkGraphicsPipelineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGraphicsPipelineCreateInfo reinterpret(long count) { return new VkGraphicsPipelineCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGraphicsPipelineCreateInfo asSlice(long index) { return new VkGraphicsPipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGraphicsPipelineCreateInfo asSlice(long index, long count) { return new VkGraphicsPipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGraphicsPipelineCreateInfo at(long index, Consumer<VkGraphicsPipelineCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stageCountAt(long index) { return (int) VH_stageCount.get(this.segment(), 0L, index); }
    public MemorySegment pStagesAt(long index) { return (MemorySegment) VH_pStages.get(this.segment(), 0L, index); }
    public MemorySegment pVertexInputStateAt(long index) { return (MemorySegment) VH_pVertexInputState.get(this.segment(), 0L, index); }
    public MemorySegment pInputAssemblyStateAt(long index) { return (MemorySegment) VH_pInputAssemblyState.get(this.segment(), 0L, index); }
    public MemorySegment pTessellationStateAt(long index) { return (MemorySegment) VH_pTessellationState.get(this.segment(), 0L, index); }
    public MemorySegment pViewportStateAt(long index) { return (MemorySegment) VH_pViewportState.get(this.segment(), 0L, index); }
    public MemorySegment pRasterizationStateAt(long index) { return (MemorySegment) VH_pRasterizationState.get(this.segment(), 0L, index); }
    public MemorySegment pMultisampleStateAt(long index) { return (MemorySegment) VH_pMultisampleState.get(this.segment(), 0L, index); }
    public MemorySegment pDepthStencilStateAt(long index) { return (MemorySegment) VH_pDepthStencilState.get(this.segment(), 0L, index); }
    public MemorySegment pColorBlendStateAt(long index) { return (MemorySegment) VH_pColorBlendState.get(this.segment(), 0L, index); }
    public MemorySegment pDynamicStateAt(long index) { return (MemorySegment) VH_pDynamicState.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public long renderPassAt(long index) { return (long) VH_renderPass.get(this.segment(), 0L, index); }
    public int subpassAt(long index) { return (int) VH_subpass.get(this.segment(), 0L, index); }
    public long basePipelineHandleAt(long index) { return (long) VH_basePipelineHandle.get(this.segment(), 0L, index); }
    public int basePipelineIndexAt(long index) { return (int) VH_basePipelineIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int stageCount() { return (int) VH_stageCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStages() { return (MemorySegment) VH_pStages.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexInputState() { return (MemorySegment) VH_pVertexInputState.get(this.segment(), 0L, 0L); }
    public MemorySegment pInputAssemblyState() { return (MemorySegment) VH_pInputAssemblyState.get(this.segment(), 0L, 0L); }
    public MemorySegment pTessellationState() { return (MemorySegment) VH_pTessellationState.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewportState() { return (MemorySegment) VH_pViewportState.get(this.segment(), 0L, 0L); }
    public MemorySegment pRasterizationState() { return (MemorySegment) VH_pRasterizationState.get(this.segment(), 0L, 0L); }
    public MemorySegment pMultisampleState() { return (MemorySegment) VH_pMultisampleState.get(this.segment(), 0L, 0L); }
    public MemorySegment pDepthStencilState() { return (MemorySegment) VH_pDepthStencilState.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorBlendState() { return (MemorySegment) VH_pColorBlendState.get(this.segment(), 0L, 0L); }
    public MemorySegment pDynamicState() { return (MemorySegment) VH_pDynamicState.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public long renderPass() { return (long) VH_renderPass.get(this.segment(), 0L, 0L); }
    public int subpass() { return (int) VH_subpass.get(this.segment(), 0L, 0L); }
    public long basePipelineHandle() { return (long) VH_basePipelineHandle.get(this.segment(), 0L, 0L); }
    public int basePipelineIndex() { return (int) VH_basePipelineIndex.get(this.segment(), 0L, 0L); }
    public VkGraphicsPipelineCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo stageCountAt(long index, int value) { VH_stageCount.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pStagesAt(long index, MemorySegment value) { VH_pStages.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pVertexInputStateAt(long index, MemorySegment value) { VH_pVertexInputState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pInputAssemblyStateAt(long index, MemorySegment value) { VH_pInputAssemblyState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pTessellationStateAt(long index, MemorySegment value) { VH_pTessellationState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pViewportStateAt(long index, MemorySegment value) { VH_pViewportState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pRasterizationStateAt(long index, MemorySegment value) { VH_pRasterizationState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pMultisampleStateAt(long index, MemorySegment value) { VH_pMultisampleState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pDepthStencilStateAt(long index, MemorySegment value) { VH_pDepthStencilState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pColorBlendStateAt(long index, MemorySegment value) { VH_pColorBlendState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo pDynamicStateAt(long index, MemorySegment value) { VH_pDynamicState.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo renderPassAt(long index, long value) { VH_renderPass.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo subpassAt(long index, int value) { VH_subpass.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo basePipelineHandleAt(long index, long value) { VH_basePipelineHandle.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo basePipelineIndexAt(long index, int value) { VH_basePipelineIndex.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo stageCount(int value) { VH_stageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pStages(MemorySegment value) { VH_pStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pVertexInputState(MemorySegment value) { VH_pVertexInputState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(MemorySegment value) { VH_pInputAssemblyState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pTessellationState(MemorySegment value) { VH_pTessellationState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pViewportState(MemorySegment value) { VH_pViewportState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pRasterizationState(MemorySegment value) { VH_pRasterizationState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pMultisampleState(MemorySegment value) { VH_pMultisampleState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pDepthStencilState(MemorySegment value) { VH_pDepthStencilState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pColorBlendState(MemorySegment value) { VH_pColorBlendState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo pDynamicState(MemorySegment value) { VH_pDynamicState.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo renderPass(long value) { VH_renderPass.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo subpass(int value) { VH_subpass.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo basePipelineHandle(long value) { VH_basePipelineHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineCreateInfo basePipelineIndex(int value) { VH_basePipelineIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGraphicsPipelineCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGraphicsPipelineCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkGraphicsPipelineCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageCount, index), LAYOUT_stageCount); }
    public MemorySegment _stageCount() { return _stageCountAt(0L); }
    public VkGraphicsPipelineCreateInfo _stageCountAt(long index, MemorySegment src) { _stageCountAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _stageCount(MemorySegment src) { return _stageCountAt(0L, src); }
    public MemorySegment _pStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStages, index), LAYOUT_pStages); }
    public MemorySegment _pStages() { return _pStagesAt(0L); }
    public VkGraphicsPipelineCreateInfo _pStagesAt(long index, MemorySegment src) { _pStagesAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pStages(MemorySegment src) { return _pStagesAt(0L, src); }
    public MemorySegment _pVertexInputStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexInputState, index), LAYOUT_pVertexInputState); }
    public MemorySegment _pVertexInputState() { return _pVertexInputStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pVertexInputStateAt(long index, MemorySegment src) { _pVertexInputStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pVertexInputState(MemorySegment src) { return _pVertexInputStateAt(0L, src); }
    public MemorySegment _pInputAssemblyStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInputAssemblyState, index), LAYOUT_pInputAssemblyState); }
    public MemorySegment _pInputAssemblyState() { return _pInputAssemblyStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pInputAssemblyStateAt(long index, MemorySegment src) { _pInputAssemblyStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pInputAssemblyState(MemorySegment src) { return _pInputAssemblyStateAt(0L, src); }
    public MemorySegment _pTessellationStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTessellationState, index), LAYOUT_pTessellationState); }
    public MemorySegment _pTessellationState() { return _pTessellationStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pTessellationStateAt(long index, MemorySegment src) { _pTessellationStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pTessellationState(MemorySegment src) { return _pTessellationStateAt(0L, src); }
    public MemorySegment _pViewportStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewportState, index), LAYOUT_pViewportState); }
    public MemorySegment _pViewportState() { return _pViewportStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pViewportStateAt(long index, MemorySegment src) { _pViewportStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pViewportState(MemorySegment src) { return _pViewportStateAt(0L, src); }
    public MemorySegment _pRasterizationStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRasterizationState, index), LAYOUT_pRasterizationState); }
    public MemorySegment _pRasterizationState() { return _pRasterizationStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pRasterizationStateAt(long index, MemorySegment src) { _pRasterizationStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pRasterizationState(MemorySegment src) { return _pRasterizationStateAt(0L, src); }
    public MemorySegment _pMultisampleStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMultisampleState, index), LAYOUT_pMultisampleState); }
    public MemorySegment _pMultisampleState() { return _pMultisampleStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pMultisampleStateAt(long index, MemorySegment src) { _pMultisampleStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pMultisampleState(MemorySegment src) { return _pMultisampleStateAt(0L, src); }
    public MemorySegment _pDepthStencilStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDepthStencilState, index), LAYOUT_pDepthStencilState); }
    public MemorySegment _pDepthStencilState() { return _pDepthStencilStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pDepthStencilStateAt(long index, MemorySegment src) { _pDepthStencilStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pDepthStencilState(MemorySegment src) { return _pDepthStencilStateAt(0L, src); }
    public MemorySegment _pColorBlendStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorBlendState, index), LAYOUT_pColorBlendState); }
    public MemorySegment _pColorBlendState() { return _pColorBlendStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pColorBlendStateAt(long index, MemorySegment src) { _pColorBlendStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pColorBlendState(MemorySegment src) { return _pColorBlendStateAt(0L, src); }
    public MemorySegment _pDynamicStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDynamicState, index), LAYOUT_pDynamicState); }
    public MemorySegment _pDynamicState() { return _pDynamicStateAt(0L); }
    public VkGraphicsPipelineCreateInfo _pDynamicStateAt(long index, MemorySegment src) { _pDynamicStateAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _pDynamicState(MemorySegment src) { return _pDynamicStateAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkGraphicsPipelineCreateInfo _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _renderPassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPass, index), LAYOUT_renderPass); }
    public MemorySegment _renderPass() { return _renderPassAt(0L); }
    public VkGraphicsPipelineCreateInfo _renderPassAt(long index, MemorySegment src) { _renderPassAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _renderPass(MemorySegment src) { return _renderPassAt(0L, src); }
    public MemorySegment _subpassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpass, index), LAYOUT_subpass); }
    public MemorySegment _subpass() { return _subpassAt(0L); }
    public VkGraphicsPipelineCreateInfo _subpassAt(long index, MemorySegment src) { _subpassAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _subpass(MemorySegment src) { return _subpassAt(0L, src); }
    public MemorySegment _basePipelineHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineHandle, index), LAYOUT_basePipelineHandle); }
    public MemorySegment _basePipelineHandle() { return _basePipelineHandleAt(0L); }
    public VkGraphicsPipelineCreateInfo _basePipelineHandleAt(long index, MemorySegment src) { _basePipelineHandleAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _basePipelineHandle(MemorySegment src) { return _basePipelineHandleAt(0L, src); }
    public MemorySegment _basePipelineIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineIndex, index), LAYOUT_basePipelineIndex); }
    public MemorySegment _basePipelineIndex() { return _basePipelineIndexAt(0L); }
    public VkGraphicsPipelineCreateInfo _basePipelineIndexAt(long index, MemorySegment src) { _basePipelineIndexAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineCreateInfo _basePipelineIndex(MemorySegment src) { return _basePipelineIndexAt(0L, src); }
}
