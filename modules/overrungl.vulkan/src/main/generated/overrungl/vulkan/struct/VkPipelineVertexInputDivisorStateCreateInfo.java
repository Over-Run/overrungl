// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineVertexInputDivisorStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineVertexInputDivisorStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t vertexBindingDivisorCount;
///     const VkVertexInputBindingDivisorDescription* pVertexBindingDivisors;
/// }
/// ```
public final class VkPipelineVertexInputDivisorStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDivisors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexBindingDivisorCount = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDivisorCount"));
    public static final long OFFSET_pVertexBindingDivisors = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDivisors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexBindingDivisorCount = LAYOUT.select(PathElement.groupElement("vertexBindingDivisorCount"));
    public static final MemoryLayout LAYOUT_pVertexBindingDivisors = LAYOUT.select(PathElement.groupElement("pVertexBindingDivisors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexBindingDivisorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDivisorCount"));
    public static final VarHandle VH_pVertexBindingDivisors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDivisors"));

    public VkPipelineVertexInputDivisorStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineVertexInputDivisorStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineVertexInputDivisorStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineVertexInputDivisorStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineVertexInputDivisorStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputDivisorStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineVertexInputDivisorStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineVertexInputDivisorStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineVertexInputDivisorStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
    public static VkPipelineVertexInputDivisorStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineVertexInputDivisorStateCreateInfo copyFrom(VkPipelineVertexInputDivisorStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo reinterpret(long count) { return new VkPipelineVertexInputDivisorStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineVertexInputDivisorStateCreateInfo asSlice(long index) { return new VkPipelineVertexInputDivisorStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineVertexInputDivisorStateCreateInfo asSlice(long index, long count) { return new VkPipelineVertexInputDivisorStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineVertexInputDivisorStateCreateInfo at(long index, Consumer<VkPipelineVertexInputDivisorStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexBindingDivisorCountAt(long index) { return (int) VH_vertexBindingDivisorCount.get(this.segment(), 0L, index); }
    public MemorySegment pVertexBindingDivisorsAt(long index) { return (MemorySegment) VH_pVertexBindingDivisors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexBindingDivisorCount() { return (int) VH_vertexBindingDivisorCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexBindingDivisors() { return (MemorySegment) VH_pVertexBindingDivisors.get(this.segment(), 0L, 0L); }
    public VkPipelineVertexInputDivisorStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo vertexBindingDivisorCountAt(long index, int value) { VH_vertexBindingDivisorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisorsAt(long index, MemorySegment value) { VH_pVertexBindingDivisors.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo vertexBindingDivisorCount(int value) { VH_vertexBindingDivisorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(MemorySegment value) { VH_pVertexBindingDivisors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexBindingDivisorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexBindingDivisorCount, index), LAYOUT_vertexBindingDivisorCount); }
    public MemorySegment _vertexBindingDivisorCount() { return _vertexBindingDivisorCountAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfo _vertexBindingDivisorCountAt(long index, MemorySegment src) { _vertexBindingDivisorCountAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo _vertexBindingDivisorCount(MemorySegment src) { return _vertexBindingDivisorCountAt(0L, src); }
    public MemorySegment _pVertexBindingDivisorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexBindingDivisors, index), LAYOUT_pVertexBindingDivisors); }
    public MemorySegment _pVertexBindingDivisors() { return _pVertexBindingDivisorsAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfo _pVertexBindingDivisorsAt(long index, MemorySegment src) { _pVertexBindingDivisorsAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfo _pVertexBindingDivisors(MemorySegment src) { return _pVertexBindingDivisorsAt(0L, src); }
}
