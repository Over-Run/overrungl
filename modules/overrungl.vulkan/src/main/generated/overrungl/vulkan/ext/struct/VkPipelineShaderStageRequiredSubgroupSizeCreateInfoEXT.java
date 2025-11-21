// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t requiredSubgroupSize;
/// }
/// ```
public final class VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_requiredSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_requiredSubgroupSize = LAYOUT.select(PathElement.groupElement("requiredSubgroupSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_requiredSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSize"));

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO);
        return s;
    }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT copyFrom(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT reinterpret(long count) { return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT asSlice(long index) { return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT asSlice(long index, long count) { return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT at(long index, Consumer<VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int requiredSubgroupSizeAt(long index) { return (int) VH_requiredSubgroupSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int requiredSubgroupSize() { return (int) VH_requiredSubgroupSize.get(this.segment(), 0L, 0L); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT requiredSubgroupSizeAt(long index, int value) { VH_requiredSubgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT requiredSubgroupSize(int value) { VH_requiredSubgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _requiredSubgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiredSubgroupSize, index), LAYOUT_requiredSubgroupSize); }
    public MemorySegment _requiredSubgroupSize() { return _requiredSubgroupSizeAt(0L); }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT _requiredSubgroupSizeAt(long index, MemorySegment src) { _requiredSubgroupSizeAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT _requiredSubgroupSize(MemorySegment src) { return _requiredSubgroupSizeAt(0L, src); }
}
