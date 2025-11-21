// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferInheritanceInfo`.
/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkFramebuffer framebuffer;
///     VkBool32 occlusionQueryEnable;
///     VkQueryControlFlags queryFlags;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// }
/// ```
public final class VkCommandBufferInheritanceInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_LONG.withName("framebuffer"),
        ValueLayout.JAVA_INT.withName("occlusionQueryEnable"),
        ValueLayout.JAVA_INT.withName("queryFlags"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    public static final long OFFSET_framebuffer = LAYOUT.byteOffset(PathElement.groupElement("framebuffer"));
    public static final long OFFSET_occlusionQueryEnable = LAYOUT.byteOffset(PathElement.groupElement("occlusionQueryEnable"));
    public static final long OFFSET_queryFlags = LAYOUT.byteOffset(PathElement.groupElement("queryFlags"));
    public static final long OFFSET_pipelineStatistics = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatistics"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    public static final MemoryLayout LAYOUT_framebuffer = LAYOUT.select(PathElement.groupElement("framebuffer"));
    public static final MemoryLayout LAYOUT_occlusionQueryEnable = LAYOUT.select(PathElement.groupElement("occlusionQueryEnable"));
    public static final MemoryLayout LAYOUT_queryFlags = LAYOUT.select(PathElement.groupElement("queryFlags"));
    public static final MemoryLayout LAYOUT_pipelineStatistics = LAYOUT.select(PathElement.groupElement("pipelineStatistics"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    public static final VarHandle VH_occlusionQueryEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryEnable"));
    public static final VarHandle VH_queryFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryFlags"));
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    public VkCommandBufferInheritanceInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferInheritanceInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferInheritanceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferInheritanceInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferInheritanceInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceInfo(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferInheritanceInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferInheritanceInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO); }
    public static VkCommandBufferInheritanceInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO);
        return s;
    }
    public VkCommandBufferInheritanceInfo copyFrom(VkCommandBufferInheritanceInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferInheritanceInfo reinterpret(long count) { return new VkCommandBufferInheritanceInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferInheritanceInfo asSlice(long index) { return new VkCommandBufferInheritanceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferInheritanceInfo asSlice(long index, long count) { return new VkCommandBufferInheritanceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferInheritanceInfo at(long index, Consumer<VkCommandBufferInheritanceInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long renderPassAt(long index) { return (long) VH_renderPass.get(this.segment(), 0L, index); }
    public int subpassAt(long index) { return (int) VH_subpass.get(this.segment(), 0L, index); }
    public long framebufferAt(long index) { return (long) VH_framebuffer.get(this.segment(), 0L, index); }
    public int occlusionQueryEnableAt(long index) { return (int) VH_occlusionQueryEnable.get(this.segment(), 0L, index); }
    public int queryFlagsAt(long index) { return (int) VH_queryFlags.get(this.segment(), 0L, index); }
    public int pipelineStatisticsAt(long index) { return (int) VH_pipelineStatistics.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long renderPass() { return (long) VH_renderPass.get(this.segment(), 0L, 0L); }
    public int subpass() { return (int) VH_subpass.get(this.segment(), 0L, 0L); }
    public long framebuffer() { return (long) VH_framebuffer.get(this.segment(), 0L, 0L); }
    public int occlusionQueryEnable() { return (int) VH_occlusionQueryEnable.get(this.segment(), 0L, 0L); }
    public int queryFlags() { return (int) VH_queryFlags.get(this.segment(), 0L, 0L); }
    public int pipelineStatistics() { return (int) VH_pipelineStatistics.get(this.segment(), 0L, 0L); }
    public VkCommandBufferInheritanceInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo renderPassAt(long index, long value) { VH_renderPass.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo subpassAt(long index, int value) { VH_subpass.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo framebufferAt(long index, long value) { VH_framebuffer.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo occlusionQueryEnableAt(long index, int value) { VH_occlusionQueryEnable.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo queryFlagsAt(long index, int value) { VH_queryFlags.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo pipelineStatisticsAt(long index, int value) { VH_pipelineStatistics.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo renderPass(long value) { VH_renderPass.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo subpass(int value) { VH_subpass.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo framebuffer(long value) { VH_framebuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(int value) { VH_occlusionQueryEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo queryFlags(int value) { VH_queryFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceInfo pipelineStatistics(int value) { VH_pipelineStatistics.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferInheritanceInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferInheritanceInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _renderPassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPass, index), LAYOUT_renderPass); }
    public MemorySegment _renderPass() { return _renderPassAt(0L); }
    public VkCommandBufferInheritanceInfo _renderPassAt(long index, MemorySegment src) { _renderPassAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _renderPass(MemorySegment src) { return _renderPassAt(0L, src); }
    public MemorySegment _subpassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpass, index), LAYOUT_subpass); }
    public MemorySegment _subpass() { return _subpassAt(0L); }
    public VkCommandBufferInheritanceInfo _subpassAt(long index, MemorySegment src) { _subpassAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _subpass(MemorySegment src) { return _subpassAt(0L, src); }
    public MemorySegment _framebufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebuffer, index), LAYOUT_framebuffer); }
    public MemorySegment _framebuffer() { return _framebufferAt(0L); }
    public VkCommandBufferInheritanceInfo _framebufferAt(long index, MemorySegment src) { _framebufferAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _framebuffer(MemorySegment src) { return _framebufferAt(0L, src); }
    public MemorySegment _occlusionQueryEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_occlusionQueryEnable, index), LAYOUT_occlusionQueryEnable); }
    public MemorySegment _occlusionQueryEnable() { return _occlusionQueryEnableAt(0L); }
    public VkCommandBufferInheritanceInfo _occlusionQueryEnableAt(long index, MemorySegment src) { _occlusionQueryEnableAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _occlusionQueryEnable(MemorySegment src) { return _occlusionQueryEnableAt(0L, src); }
    public MemorySegment _queryFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queryFlags, index), LAYOUT_queryFlags); }
    public MemorySegment _queryFlags() { return _queryFlagsAt(0L); }
    public VkCommandBufferInheritanceInfo _queryFlagsAt(long index, MemorySegment src) { _queryFlagsAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _queryFlags(MemorySegment src) { return _queryFlagsAt(0L, src); }
    public MemorySegment _pipelineStatisticsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineStatistics, index), LAYOUT_pipelineStatistics); }
    public MemorySegment _pipelineStatistics() { return _pipelineStatisticsAt(0L); }
    public VkCommandBufferInheritanceInfo _pipelineStatisticsAt(long index, MemorySegment src) { _pipelineStatisticsAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceInfo _pipelineStatistics(MemorySegment src) { return _pipelineStatisticsAt(0L, src); }
}
