// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGraphicsPipelineShaderGroupsCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t groupCount;
///     const VkGraphicsShaderGroupCreateInfoNV* pGroups;
///     uint32_t pipelineCount;
///     const VkPipeline* pPipelines;
/// }
/// ```
public final class VkGraphicsPipelineShaderGroupsCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("pipelineCount"),
        ValueLayout.ADDRESS.withName("pPipelines")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_groupCount = LAYOUT.byteOffset(PathElement.groupElement("groupCount"));
    public static final long OFFSET_pGroups = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
    public static final long OFFSET_pipelineCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineCount"));
    public static final long OFFSET_pPipelines = LAYOUT.byteOffset(PathElement.groupElement("pPipelines"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_groupCount = LAYOUT.select(PathElement.groupElement("groupCount"));
    public static final MemoryLayout LAYOUT_pGroups = LAYOUT.select(PathElement.groupElement("pGroups"));
    public static final MemoryLayout LAYOUT_pipelineCount = LAYOUT.select(PathElement.groupElement("pipelineCount"));
    public static final MemoryLayout LAYOUT_pPipelines = LAYOUT.select(PathElement.groupElement("pPipelines"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_groupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCount"));
    public static final VarHandle VH_pGroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGroups"));
    public static final VarHandle VH_pipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCount"));
    public static final VarHandle VH_pPipelines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelines"));

    public VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV alloc(SegmentAllocator allocator) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV); }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
        return s;
    }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV copyFrom(VkGraphicsPipelineShaderGroupsCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV reinterpret(long count) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV asSlice(long index) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV asSlice(long index, long count) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV at(long index, Consumer<VkGraphicsPipelineShaderGroupsCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int groupCountAt(long index) { return (int) VH_groupCount.get(this.segment(), 0L, index); }
    public MemorySegment pGroupsAt(long index) { return (MemorySegment) VH_pGroups.get(this.segment(), 0L, index); }
    public int pipelineCountAt(long index) { return (int) VH_pipelineCount.get(this.segment(), 0L, index); }
    public MemorySegment pPipelinesAt(long index) { return (MemorySegment) VH_pPipelines.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int groupCount() { return (int) VH_groupCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pGroups() { return (MemorySegment) VH_pGroups.get(this.segment(), 0L, 0L); }
    public int pipelineCount() { return (int) VH_pipelineCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelines() { return (MemorySegment) VH_pPipelines.get(this.segment(), 0L, 0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV groupCountAt(long index, int value) { VH_groupCount.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroupsAt(long index, MemorySegment value) { VH_pGroups.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pipelineCountAt(long index, int value) { VH_pipelineCount.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelinesAt(long index, MemorySegment value) { VH_pPipelines.set(this.segment(), 0L, index, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV groupCount(int value) { VH_groupCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(MemorySegment value) { VH_pGroups.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pipelineCount(int value) { VH_pipelineCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(MemorySegment value) { VH_pPipelines.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _groupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupCount, index), LAYOUT_groupCount); }
    public MemorySegment _groupCount() { return _groupCountAt(0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _groupCountAt(long index, MemorySegment src) { _groupCountAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _groupCount(MemorySegment src) { return _groupCountAt(0L, src); }
    public MemorySegment _pGroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pGroups, index), LAYOUT_pGroups); }
    public MemorySegment _pGroups() { return _pGroupsAt(0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pGroupsAt(long index, MemorySegment src) { _pGroupsAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pGroups(MemorySegment src) { return _pGroupsAt(0L, src); }
    public MemorySegment _pipelineCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCount, index), LAYOUT_pipelineCount); }
    public MemorySegment _pipelineCount() { return _pipelineCountAt(0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pipelineCountAt(long index, MemorySegment src) { _pipelineCountAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pipelineCount(MemorySegment src) { return _pipelineCountAt(0L, src); }
    public MemorySegment _pPipelinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelines, index), LAYOUT_pPipelines); }
    public MemorySegment _pPipelines() { return _pPipelinesAt(0L); }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pPipelinesAt(long index, MemorySegment src) { _pPipelinesAt(index).copyFrom(src); return this; }
    public VkGraphicsPipelineShaderGroupsCreateInfoNV _pPipelines(MemorySegment src) { return _pPipelinesAt(0L, src); }
}
