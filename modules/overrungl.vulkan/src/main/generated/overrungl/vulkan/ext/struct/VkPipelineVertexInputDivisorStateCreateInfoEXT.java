// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineVertexInputDivisorStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineVertexInputDivisorStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t vertexBindingDivisorCount;
///     const VkVertexInputBindingDivisorDescription* pVertexBindingDivisors;
/// }
/// ```
public final class VkPipelineVertexInputDivisorStateCreateInfoEXT extends GroupType {
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

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT copyFrom(VkPipelineVertexInputDivisorStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT reinterpret(long count) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT asSlice(long index) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT at(long index, Consumer<VkPipelineVertexInputDivisorStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexBindingDivisorCountAt(long index) { return (int) VH_vertexBindingDivisorCount.get(this.segment(), 0L, index); }
    public MemorySegment pVertexBindingDivisorsAt(long index) { return (MemorySegment) VH_pVertexBindingDivisors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexBindingDivisorCount() { return (int) VH_vertexBindingDivisorCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexBindingDivisors() { return (MemorySegment) VH_pVertexBindingDivisors.get(this.segment(), 0L, 0L); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT vertexBindingDivisorCountAt(long index, int value) { VH_vertexBindingDivisorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisorsAt(long index, MemorySegment value) { VH_pVertexBindingDivisors.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT vertexBindingDivisorCount(int value) { VH_vertexBindingDivisorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisors(MemorySegment value) { VH_pVertexBindingDivisors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexBindingDivisorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexBindingDivisorCount, index), LAYOUT_vertexBindingDivisorCount); }
    public MemorySegment _vertexBindingDivisorCount() { return _vertexBindingDivisorCountAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _vertexBindingDivisorCountAt(long index, MemorySegment src) { _vertexBindingDivisorCountAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _vertexBindingDivisorCount(MemorySegment src) { return _vertexBindingDivisorCountAt(0L, src); }
    public MemorySegment _pVertexBindingDivisorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexBindingDivisors, index), LAYOUT_pVertexBindingDivisors); }
    public MemorySegment _pVertexBindingDivisors() { return _pVertexBindingDivisorsAt(0L); }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _pVertexBindingDivisorsAt(long index, MemorySegment src) { _pVertexBindingDivisorsAt(index).copyFrom(src); return this; }
    public VkPipelineVertexInputDivisorStateCreateInfoEXT _pVertexBindingDivisors(MemorySegment src) { return _pVertexBindingDivisorsAt(0L, src); }
}
