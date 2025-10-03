// This file is auto-generated. DO NOT EDIT!
//@formatter:off
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
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCreateFlags flags;
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
///     (uint64_t) VkPipelineLayout layout;
///     (uint64_t) VkRenderPass renderPass;
///     uint32_t subpass;
///     (uint64_t) VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// };
/// ```
public final class VkGraphicsPipelineCreateInfo extends GroupType {
    /// The struct layout of `VkGraphicsPipelineCreateInfo`.
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `stageCount`.
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    /// The memory layout of `stageCount`.
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    /// The [VarHandle] of `stageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stageCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount")));
    /// The byte offset of `pStages`.
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    /// The memory layout of `pStages`.
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    /// The [VarHandle] of `pStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages")));
    /// The byte offset of `pVertexInputState`.
    public static final long OFFSET_pVertexInputState = LAYOUT.byteOffset(PathElement.groupElement("pVertexInputState"));
    /// The memory layout of `pVertexInputState`.
    public static final MemoryLayout LAYOUT_pVertexInputState = LAYOUT.select(PathElement.groupElement("pVertexInputState"));
    /// The [VarHandle] of `pVertexInputState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pVertexInputState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexInputState")));
    /// The byte offset of `pInputAssemblyState`.
    public static final long OFFSET_pInputAssemblyState = LAYOUT.byteOffset(PathElement.groupElement("pInputAssemblyState"));
    /// The memory layout of `pInputAssemblyState`.
    public static final MemoryLayout LAYOUT_pInputAssemblyState = LAYOUT.select(PathElement.groupElement("pInputAssemblyState"));
    /// The [VarHandle] of `pInputAssemblyState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pInputAssemblyState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAssemblyState")));
    /// The byte offset of `pTessellationState`.
    public static final long OFFSET_pTessellationState = LAYOUT.byteOffset(PathElement.groupElement("pTessellationState"));
    /// The memory layout of `pTessellationState`.
    public static final MemoryLayout LAYOUT_pTessellationState = LAYOUT.select(PathElement.groupElement("pTessellationState"));
    /// The [VarHandle] of `pTessellationState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pTessellationState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTessellationState")));
    /// The byte offset of `pViewportState`.
    public static final long OFFSET_pViewportState = LAYOUT.byteOffset(PathElement.groupElement("pViewportState"));
    /// The memory layout of `pViewportState`.
    public static final MemoryLayout LAYOUT_pViewportState = LAYOUT.select(PathElement.groupElement("pViewportState"));
    /// The [VarHandle] of `pViewportState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pViewportState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportState")));
    /// The byte offset of `pRasterizationState`.
    public static final long OFFSET_pRasterizationState = LAYOUT.byteOffset(PathElement.groupElement("pRasterizationState"));
    /// The memory layout of `pRasterizationState`.
    public static final MemoryLayout LAYOUT_pRasterizationState = LAYOUT.select(PathElement.groupElement("pRasterizationState"));
    /// The [VarHandle] of `pRasterizationState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pRasterizationState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRasterizationState")));
    /// The byte offset of `pMultisampleState`.
    public static final long OFFSET_pMultisampleState = LAYOUT.byteOffset(PathElement.groupElement("pMultisampleState"));
    /// The memory layout of `pMultisampleState`.
    public static final MemoryLayout LAYOUT_pMultisampleState = LAYOUT.select(PathElement.groupElement("pMultisampleState"));
    /// The [VarHandle] of `pMultisampleState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pMultisampleState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMultisampleState")));
    /// The byte offset of `pDepthStencilState`.
    public static final long OFFSET_pDepthStencilState = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilState"));
    /// The memory layout of `pDepthStencilState`.
    public static final MemoryLayout LAYOUT_pDepthStencilState = LAYOUT.select(PathElement.groupElement("pDepthStencilState"));
    /// The [VarHandle] of `pDepthStencilState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDepthStencilState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilState")));
    /// The byte offset of `pColorBlendState`.
    public static final long OFFSET_pColorBlendState = LAYOUT.byteOffset(PathElement.groupElement("pColorBlendState"));
    /// The memory layout of `pColorBlendState`.
    public static final MemoryLayout LAYOUT_pColorBlendState = LAYOUT.select(PathElement.groupElement("pColorBlendState"));
    /// The [VarHandle] of `pColorBlendState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pColorBlendState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorBlendState")));
    /// The byte offset of `pDynamicState`.
    public static final long OFFSET_pDynamicState = LAYOUT.byteOffset(PathElement.groupElement("pDynamicState"));
    /// The memory layout of `pDynamicState`.
    public static final MemoryLayout LAYOUT_pDynamicState = LAYOUT.select(PathElement.groupElement("pDynamicState"));
    /// The [VarHandle] of `pDynamicState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDynamicState = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicState")));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout")));
    /// The byte offset of `renderPass`.
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    /// The memory layout of `renderPass`.
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_renderPass = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass")));
    /// The byte offset of `subpass`.
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    /// The memory layout of `subpass`.
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subpass = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass")));
    /// The byte offset of `basePipelineHandle`.
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    /// The memory layout of `basePipelineHandle`.
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_basePipelineHandle = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle")));
    /// The byte offset of `basePipelineIndex`.
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    /// The memory layout of `basePipelineIndex`.
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_basePipelineIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex")));

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGraphicsPipelineCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGraphicsPipelineCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsPipelineCreateInfo`
    public static VkGraphicsPipelineCreateInfo alloc(SegmentAllocator allocator) { return new VkGraphicsPipelineCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGraphicsPipelineCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGraphicsPipelineCreateInfo`
    public static VkGraphicsPipelineCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkGraphicsPipelineCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGraphicsPipelineCreateInfo copyFrom(VkGraphicsPipelineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGraphicsPipelineCreateInfo reinterpret(long count) { return new VkGraphicsPipelineCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get().get(segment, 0L, index); }
    /// {@return `stageCount`}
    public int stageCount() { return stageCount(this.segment(), 0L); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageCount(MemorySegment segment, long index, int value) { VH_stageCount.get().set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo stageCount(int value) { stageCount(this.segment(), 0L, value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStages(MemorySegment segment, long index) { return (MemorySegment) VH_pStages.get().get(segment, 0L, index); }
    /// {@return `pStages`}
    public MemorySegment pStages() { return pStages(this.segment(), 0L); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStages(MemorySegment segment, long index, MemorySegment value) { VH_pStages.get().set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pStages(MemorySegment value) { pStages(this.segment(), 0L, value); return this; }

    /// {@return `pVertexInputState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVertexInputState(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexInputState.get().get(segment, 0L, index); }
    /// {@return `pVertexInputState`}
    public MemorySegment pVertexInputState() { return pVertexInputState(this.segment(), 0L); }
    /// Sets `pVertexInputState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVertexInputState(MemorySegment segment, long index, MemorySegment value) { VH_pVertexInputState.get().set(segment, 0L, index, value); }
    /// Sets `pVertexInputState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pVertexInputState(MemorySegment value) { pVertexInputState(this.segment(), 0L, value); return this; }

    /// {@return `pInputAssemblyState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pInputAssemblyState(MemorySegment segment, long index) { return (MemorySegment) VH_pInputAssemblyState.get().get(segment, 0L, index); }
    /// {@return `pInputAssemblyState`}
    public MemorySegment pInputAssemblyState() { return pInputAssemblyState(this.segment(), 0L); }
    /// Sets `pInputAssemblyState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pInputAssemblyState(MemorySegment segment, long index, MemorySegment value) { VH_pInputAssemblyState.get().set(segment, 0L, index, value); }
    /// Sets `pInputAssemblyState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(MemorySegment value) { pInputAssemblyState(this.segment(), 0L, value); return this; }

    /// {@return `pTessellationState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTessellationState(MemorySegment segment, long index) { return (MemorySegment) VH_pTessellationState.get().get(segment, 0L, index); }
    /// {@return `pTessellationState`}
    public MemorySegment pTessellationState() { return pTessellationState(this.segment(), 0L); }
    /// Sets `pTessellationState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTessellationState(MemorySegment segment, long index, MemorySegment value) { VH_pTessellationState.get().set(segment, 0L, index, value); }
    /// Sets `pTessellationState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pTessellationState(MemorySegment value) { pTessellationState(this.segment(), 0L, value); return this; }

    /// {@return `pViewportState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewportState(MemorySegment segment, long index) { return (MemorySegment) VH_pViewportState.get().get(segment, 0L, index); }
    /// {@return `pViewportState`}
    public MemorySegment pViewportState() { return pViewportState(this.segment(), 0L); }
    /// Sets `pViewportState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewportState(MemorySegment segment, long index, MemorySegment value) { VH_pViewportState.get().set(segment, 0L, index, value); }
    /// Sets `pViewportState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pViewportState(MemorySegment value) { pViewportState(this.segment(), 0L, value); return this; }

    /// {@return `pRasterizationState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRasterizationState(MemorySegment segment, long index) { return (MemorySegment) VH_pRasterizationState.get().get(segment, 0L, index); }
    /// {@return `pRasterizationState`}
    public MemorySegment pRasterizationState() { return pRasterizationState(this.segment(), 0L); }
    /// Sets `pRasterizationState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRasterizationState(MemorySegment segment, long index, MemorySegment value) { VH_pRasterizationState.get().set(segment, 0L, index, value); }
    /// Sets `pRasterizationState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pRasterizationState(MemorySegment value) { pRasterizationState(this.segment(), 0L, value); return this; }

    /// {@return `pMultisampleState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMultisampleState(MemorySegment segment, long index) { return (MemorySegment) VH_pMultisampleState.get().get(segment, 0L, index); }
    /// {@return `pMultisampleState`}
    public MemorySegment pMultisampleState() { return pMultisampleState(this.segment(), 0L); }
    /// Sets `pMultisampleState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMultisampleState(MemorySegment segment, long index, MemorySegment value) { VH_pMultisampleState.get().set(segment, 0L, index, value); }
    /// Sets `pMultisampleState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pMultisampleState(MemorySegment value) { pMultisampleState(this.segment(), 0L, value); return this; }

    /// {@return `pDepthStencilState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDepthStencilState(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthStencilState.get().get(segment, 0L, index); }
    /// {@return `pDepthStencilState`}
    public MemorySegment pDepthStencilState() { return pDepthStencilState(this.segment(), 0L); }
    /// Sets `pDepthStencilState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDepthStencilState(MemorySegment segment, long index, MemorySegment value) { VH_pDepthStencilState.get().set(segment, 0L, index, value); }
    /// Sets `pDepthStencilState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pDepthStencilState(MemorySegment value) { pDepthStencilState(this.segment(), 0L, value); return this; }

    /// {@return `pColorBlendState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorBlendState(MemorySegment segment, long index) { return (MemorySegment) VH_pColorBlendState.get().get(segment, 0L, index); }
    /// {@return `pColorBlendState`}
    public MemorySegment pColorBlendState() { return pColorBlendState(this.segment(), 0L); }
    /// Sets `pColorBlendState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorBlendState(MemorySegment segment, long index, MemorySegment value) { VH_pColorBlendState.get().set(segment, 0L, index, value); }
    /// Sets `pColorBlendState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pColorBlendState(MemorySegment value) { pColorBlendState(this.segment(), 0L, value); return this; }

    /// {@return `pDynamicState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDynamicState(MemorySegment segment, long index) { return (MemorySegment) VH_pDynamicState.get().get(segment, 0L, index); }
    /// {@return `pDynamicState`}
    public MemorySegment pDynamicState() { return pDynamicState(this.segment(), 0L); }
    /// Sets `pDynamicState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDynamicState(MemorySegment segment, long index, MemorySegment value) { VH_pDynamicState.get().set(segment, 0L, index, value); }
    /// Sets `pDynamicState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pDynamicState(MemorySegment value) { pDynamicState(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get().get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.get().set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderPass(MemorySegment segment, long index) { return (long) VH_renderPass.get().get(segment, 0L, index); }
    /// {@return `renderPass`}
    public long renderPass() { return renderPass(this.segment(), 0L); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderPass(MemorySegment segment, long index, long value) { VH_renderPass.get().set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo renderPass(long value) { renderPass(this.segment(), 0L, value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpass(MemorySegment segment, long index) { return (int) VH_subpass.get().get(segment, 0L, index); }
    /// {@return `subpass`}
    public int subpass() { return subpass(this.segment(), 0L); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpass(MemorySegment segment, long index, int value) { VH_subpass.get().set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo subpass(int value) { subpass(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long basePipelineHandle(MemorySegment segment, long index) { return (long) VH_basePipelineHandle.get().get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    public long basePipelineHandle() { return basePipelineHandle(this.segment(), 0L); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineHandle(MemorySegment segment, long index, long value) { VH_basePipelineHandle.get().set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo basePipelineHandle(long value) { basePipelineHandle(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get().get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    public int basePipelineIndex() { return basePipelineIndex(this.segment(), 0L); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineIndex(MemorySegment segment, long index, int value) { VH_basePipelineIndex.get().set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo basePipelineIndex(int value) { basePipelineIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGraphicsPipelineCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGraphicsPipelineCreateInfo`
    public VkGraphicsPipelineCreateInfo asSlice(long index) { return new VkGraphicsPipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGraphicsPipelineCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGraphicsPipelineCreateInfo`
    public VkGraphicsPipelineCreateInfo asSlice(long index, long count) { return new VkGraphicsPipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGraphicsPipelineCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGraphicsPipelineCreateInfo at(long index, Consumer<VkGraphicsPipelineCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param index the index of the struct buffer
    public int stageCountAt(long index) { return stageCount(this.segment(), index); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo stageCountAt(long index, int value) { stageCount(this.segment(), index, value); return this; }

    /// {@return `pStages` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStagesAt(long index) { return pStages(this.segment(), index); }
    /// Sets `pStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pStagesAt(long index, MemorySegment value) { pStages(this.segment(), index, value); return this; }

    /// {@return `pVertexInputState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVertexInputStateAt(long index) { return pVertexInputState(this.segment(), index); }
    /// Sets `pVertexInputState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pVertexInputStateAt(long index, MemorySegment value) { pVertexInputState(this.segment(), index, value); return this; }

    /// {@return `pInputAssemblyState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pInputAssemblyStateAt(long index) { return pInputAssemblyState(this.segment(), index); }
    /// Sets `pInputAssemblyState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pInputAssemblyStateAt(long index, MemorySegment value) { pInputAssemblyState(this.segment(), index, value); return this; }

    /// {@return `pTessellationState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTessellationStateAt(long index) { return pTessellationState(this.segment(), index); }
    /// Sets `pTessellationState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pTessellationStateAt(long index, MemorySegment value) { pTessellationState(this.segment(), index, value); return this; }

    /// {@return `pViewportState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewportStateAt(long index) { return pViewportState(this.segment(), index); }
    /// Sets `pViewportState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pViewportStateAt(long index, MemorySegment value) { pViewportState(this.segment(), index, value); return this; }

    /// {@return `pRasterizationState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRasterizationStateAt(long index) { return pRasterizationState(this.segment(), index); }
    /// Sets `pRasterizationState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pRasterizationStateAt(long index, MemorySegment value) { pRasterizationState(this.segment(), index, value); return this; }

    /// {@return `pMultisampleState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMultisampleStateAt(long index) { return pMultisampleState(this.segment(), index); }
    /// Sets `pMultisampleState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pMultisampleStateAt(long index, MemorySegment value) { pMultisampleState(this.segment(), index, value); return this; }

    /// {@return `pDepthStencilState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDepthStencilStateAt(long index) { return pDepthStencilState(this.segment(), index); }
    /// Sets `pDepthStencilState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pDepthStencilStateAt(long index, MemorySegment value) { pDepthStencilState(this.segment(), index, value); return this; }

    /// {@return `pColorBlendState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pColorBlendStateAt(long index) { return pColorBlendState(this.segment(), index); }
    /// Sets `pColorBlendState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pColorBlendStateAt(long index, MemorySegment value) { pColorBlendState(this.segment(), index, value); return this; }

    /// {@return `pDynamicState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDynamicStateAt(long index) { return pDynamicState(this.segment(), index); }
    /// Sets `pDynamicState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pDynamicStateAt(long index, MemorySegment value) { pDynamicState(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param index the index of the struct buffer
    public long renderPassAt(long index) { return renderPass(this.segment(), index); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo renderPassAt(long index, long value) { renderPass(this.segment(), index, value); return this; }

    /// {@return `subpass` at the given index}
    /// @param index the index of the struct buffer
    public int subpassAt(long index) { return subpass(this.segment(), index); }
    /// Sets `subpass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo subpassAt(long index, int value) { subpass(this.segment(), index, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param index the index of the struct buffer
    public long basePipelineHandleAt(long index) { return basePipelineHandle(this.segment(), index); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo basePipelineHandleAt(long index, long value) { basePipelineHandle(this.segment(), index, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param index the index of the struct buffer
    public int basePipelineIndexAt(long index) { return basePipelineIndex(this.segment(), index); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo basePipelineIndexAt(long index, int value) { basePipelineIndex(this.segment(), index, value); return this; }

}
