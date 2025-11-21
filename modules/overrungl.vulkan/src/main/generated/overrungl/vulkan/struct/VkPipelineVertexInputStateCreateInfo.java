// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineVertexInputStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineVertexInputStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineVertexInputStateCreateFlags flags;
///     uint32_t vertexBindingDescriptionCount;
///     const VkVertexInputBindingDescription* pVertexBindingDescriptions;
///     uint32_t vertexAttributeDescriptionCount;
///     const VkVertexInputAttributeDescription* pVertexAttributeDescriptions;
/// }
/// ```
public final class VkPipelineVertexInputStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDescriptions"),
        ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount"),
        ValueLayout.ADDRESS.withName("pVertexAttributeDescriptions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_vertexBindingDescriptionCount = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDescriptionCount"));
    public static final long OFFSET_pVertexBindingDescriptions = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDescriptions"));
    public static final long OFFSET_vertexAttributeDescriptionCount = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeDescriptionCount"));
    public static final long OFFSET_pVertexAttributeDescriptions = LAYOUT.byteOffset(PathElement.groupElement("pVertexAttributeDescriptions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_vertexBindingDescriptionCount = LAYOUT.select(PathElement.groupElement("vertexBindingDescriptionCount"));
    public static final MemoryLayout LAYOUT_pVertexBindingDescriptions = LAYOUT.select(PathElement.groupElement("pVertexBindingDescriptions"));
    public static final MemoryLayout LAYOUT_vertexAttributeDescriptionCount = LAYOUT.select(PathElement.groupElement("vertexAttributeDescriptionCount"));
    public static final MemoryLayout LAYOUT_pVertexAttributeDescriptions = LAYOUT.select(PathElement.groupElement("pVertexAttributeDescriptions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_vertexBindingDescriptionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDescriptionCount"));
    public static final VarHandle VH_pVertexBindingDescriptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDescriptions"));
    public static final VarHandle VH_vertexAttributeDescriptionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeDescriptionCount"));
    public static final VarHandle VH_pVertexAttributeDescriptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexAttributeDescriptions"));

    public VkPipelineVertexInputStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineVertexInputStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineVertexInputStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineVertexInputStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineVertexInputStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineVertexInputStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineVertexInputStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO); }
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineVertexInputStateCreateInfo copyFrom(VkPipelineVertexInputStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineVertexInputStateCreateInfo reinterpret(long count) { return new VkPipelineVertexInputStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineVertexInputStateCreateInfo asSlice(long index) { return new VkPipelineVertexInputStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineVertexInputStateCreateInfo asSlice(long index, long count) { return new VkPipelineVertexInputStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineVertexInputStateCreateInfo at(long index, Consumer<VkPipelineVertexInputStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int vertexBindingDescriptionCountAt(long index) { return (int) VH_vertexBindingDescriptionCount.get(this.segment(), 0L, index); }
    public MemorySegment pVertexBindingDescriptionsAt(long index) { return (MemorySegment) VH_pVertexBindingDescriptions.get(this.segment(), 0L, index); }
    public int vertexAttributeDescriptionCountAt(long index) { return (int) VH_vertexAttributeDescriptionCount.get(this.segment(), 0L, index); }
    public MemorySegment pVertexAttributeDescriptionsAt(long index) { return (MemorySegment) VH_pVertexAttributeDescriptions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int vertexBindingDescriptionCount() { return (int) VH_vertexBindingDescriptionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexBindingDescriptions() { return (MemorySegment) VH_pVertexBindingDescriptions.get(this.segment(), 0L, 0L); }
    public int vertexAttributeDescriptionCount() { return (int) VH_vertexAttributeDescriptionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexAttributeDescriptions() { return (MemorySegment) VH_pVertexAttributeDescriptions.get(this.segment(), 0L, 0L); }
    public VkPipelineVertexInputStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCountAt(long index, int value) { VH_vertexBindingDescriptionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptionsAt(long index, MemorySegment value) { VH_pVertexBindingDescriptions.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCountAt(long index, int value) { VH_vertexAttributeDescriptionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptionsAt(long index, MemorySegment value) { VH_pVertexAttributeDescriptions.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(int value) { VH_vertexBindingDescriptionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(MemorySegment value) { VH_pVertexBindingDescriptions.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(int value) { VH_vertexAttributeDescriptionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(MemorySegment value) { VH_pVertexAttributeDescriptions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _vertexBindingDescriptionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexBindingDescriptionCount, index), LAYOUT_vertexBindingDescriptionCount); }
    public MemorySegment _vertexBindingDescriptionCount() { return _vertexBindingDescriptionCountAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _vertexBindingDescriptionCountAt(long index, MemorySegment src) { _vertexBindingDescriptionCountAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _vertexBindingDescriptionCount(MemorySegment src) { return _vertexBindingDescriptionCountAt(0L, src); }
    public MemorySegment _pVertexBindingDescriptionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexBindingDescriptions, index), LAYOUT_pVertexBindingDescriptions); }
    public MemorySegment _pVertexBindingDescriptions() { return _pVertexBindingDescriptionsAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _pVertexBindingDescriptionsAt(long index, MemorySegment src) { _pVertexBindingDescriptionsAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _pVertexBindingDescriptions(MemorySegment src) { return _pVertexBindingDescriptionsAt(0L, src); }
    public MemorySegment _vertexAttributeDescriptionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeDescriptionCount, index), LAYOUT_vertexAttributeDescriptionCount); }
    public MemorySegment _vertexAttributeDescriptionCount() { return _vertexAttributeDescriptionCountAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _vertexAttributeDescriptionCountAt(long index, MemorySegment src) { _vertexAttributeDescriptionCountAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _vertexAttributeDescriptionCount(MemorySegment src) { return _vertexAttributeDescriptionCountAt(0L, src); }
    public MemorySegment _pVertexAttributeDescriptionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexAttributeDescriptions, index), LAYOUT_pVertexAttributeDescriptions); }
    public MemorySegment _pVertexAttributeDescriptions() { return _pVertexAttributeDescriptionsAt(0L); }
    public VkPipelineVertexInputStateCreateInfo _pVertexAttributeDescriptionsAt(long index, MemorySegment src) { _pVertexAttributeDescriptionsAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputStateCreateInfo _pVertexAttributeDescriptions(MemorySegment src) { return _pVertexAttributeDescriptionsAt(0L, src); }
}
