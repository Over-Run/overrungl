// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationProvokingVertexStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationProvokingVertexStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkProvokingVertexModeEXT provokingVertexMode;
/// }
/// ```
public final class VkPipelineRasterizationProvokingVertexStateCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_provokingVertexMode = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_provokingVertexMode = LAYOUT.select(PathElement.groupElement("provokingVertexMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_provokingVertexMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("provokingVertexMode"));

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT); }
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT copyFrom(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT reinterpret(long count) { return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT asSlice(long index) { return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT at(long index, Consumer<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int provokingVertexModeAt(long index) { return (int) VH_provokingVertexMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int provokingVertexMode() { return (int) VH_provokingVertexMode.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT provokingVertexModeAt(long index, int value) { VH_provokingVertexMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT provokingVertexMode(int value) { VH_provokingVertexMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _provokingVertexModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_provokingVertexMode, index), LAYOUT_provokingVertexMode); }
    public MemorySegment _provokingVertexMode() { return _provokingVertexModeAt(0L); }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT _provokingVertexModeAt(long index, MemorySegment src) { _provokingVertexModeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT _provokingVertexMode(MemorySegment src) { return _provokingVertexModeAt(0L, src); }
}
