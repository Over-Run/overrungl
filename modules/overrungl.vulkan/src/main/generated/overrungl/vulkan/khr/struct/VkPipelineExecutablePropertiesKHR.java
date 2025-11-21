// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineExecutablePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPipelineExecutablePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkShaderStageFlags stages;
///     char name[VK_MAX_DESCRIPTION_SIZE];
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     uint32_t subgroupSize;
/// }
/// ```
public final class VkPipelineExecutablePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stages"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("subgroupSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stages = LAYOUT.byteOffset(PathElement.groupElement("stages"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_subgroupSize = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stages = LAYOUT.select(PathElement.groupElement("stages"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_subgroupSize = LAYOUT.select(PathElement.groupElement("subgroupSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stages"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));

    public VkPipelineExecutablePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineExecutablePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutablePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineExecutablePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutablePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineExecutablePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutablePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineExecutablePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutablePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineExecutablePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutablePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineExecutablePropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR); }
    public static VkPipelineExecutablePropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR);
        return s;
    }
    public VkPipelineExecutablePropertiesKHR copyFrom(VkPipelineExecutablePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineExecutablePropertiesKHR reinterpret(long count) { return new VkPipelineExecutablePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineExecutablePropertiesKHR asSlice(long index) { return new VkPipelineExecutablePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineExecutablePropertiesKHR asSlice(long index, long count) { return new VkPipelineExecutablePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineExecutablePropertiesKHR at(long index, Consumer<VkPipelineExecutablePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stagesAt(long index) { return (int) VH_stages.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public int subgroupSizeAt(long index) { return (int) VH_subgroupSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stages() { return (int) VH_stages.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public int subgroupSize() { return (int) VH_subgroupSize.get(this.segment(), 0L, 0L); }
    public VkPipelineExecutablePropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutablePropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutablePropertiesKHR stagesAt(long index, int value) { VH_stages.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutablePropertiesKHR nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineExecutablePropertiesKHR descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineExecutablePropertiesKHR subgroupSizeAt(long index, int value) { VH_subgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutablePropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutablePropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutablePropertiesKHR stages(int value) { VH_stages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutablePropertiesKHR name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPipelineExecutablePropertiesKHR description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPipelineExecutablePropertiesKHR subgroupSize(int value) { VH_subgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineExecutablePropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineExecutablePropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineExecutablePropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineExecutablePropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stages, index), LAYOUT_stages); }
    public MemorySegment _stages() { return _stagesAt(0L); }
    public VkPipelineExecutablePropertiesKHR _stagesAt(long index, MemorySegment src) { _stagesAt(index).copyFrom(src); return this; }
    public VkPipelineExecutablePropertiesKHR _stages(MemorySegment src) { return _stagesAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPipelineExecutablePropertiesKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPipelineExecutablePropertiesKHR _name(MemorySegment src) { return _nameAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkPipelineExecutablePropertiesKHR _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkPipelineExecutablePropertiesKHR _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _subgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSize, index), LAYOUT_subgroupSize); }
    public MemorySegment _subgroupSize() { return _subgroupSizeAt(0L); }
    public VkPipelineExecutablePropertiesKHR _subgroupSizeAt(long index, MemorySegment src) { _subgroupSizeAt(index).copyFrom(src); return this; }
    public VkPipelineExecutablePropertiesKHR _subgroupSize(MemorySegment src) { return _subgroupSizeAt(0L, src); }
}
