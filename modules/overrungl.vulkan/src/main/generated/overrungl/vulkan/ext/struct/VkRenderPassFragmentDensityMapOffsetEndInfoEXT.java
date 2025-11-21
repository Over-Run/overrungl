// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassFragmentDensityMapOffsetEndInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassFragmentDensityMapOffsetEndInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t fragmentDensityOffsetCount;
///     const VkOffset2D* pFragmentDensityOffsets;
/// }
/// ```
public final class VkRenderPassFragmentDensityMapOffsetEndInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityOffsetCount"),
        ValueLayout.ADDRESS.withName("pFragmentDensityOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityOffsetCount = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityOffsetCount"));
    public static final long OFFSET_pFragmentDensityOffsets = LAYOUT.byteOffset(PathElement.groupElement("pFragmentDensityOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityOffsetCount = LAYOUT.select(PathElement.groupElement("fragmentDensityOffsetCount"));
    public static final MemoryLayout LAYOUT_pFragmentDensityOffsets = LAYOUT.select(PathElement.groupElement("pFragmentDensityOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityOffsetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityOffsetCount"));
    public static final VarHandle VH_pFragmentDensityOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFragmentDensityOffsets"));

    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT); }
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT);
        return s;
    }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT copyFrom(VkRenderPassFragmentDensityMapOffsetEndInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT reinterpret(long count) { return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT asSlice(long index) { return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT asSlice(long index, long count) { return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT at(long index, Consumer<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityOffsetCountAt(long index) { return (int) VH_fragmentDensityOffsetCount.get(this.segment(), 0L, index); }
    public MemorySegment pFragmentDensityOffsetsAt(long index) { return (MemorySegment) VH_pFragmentDensityOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityOffsetCount() { return (int) VH_fragmentDensityOffsetCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pFragmentDensityOffsets() { return (MemorySegment) VH_pFragmentDensityOffsets.get(this.segment(), 0L, 0L); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT fragmentDensityOffsetCountAt(long index, int value) { VH_fragmentDensityOffsetCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pFragmentDensityOffsetsAt(long index, MemorySegment value) { VH_pFragmentDensityOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT fragmentDensityOffsetCount(int value) { VH_fragmentDensityOffsetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pFragmentDensityOffsets(MemorySegment value) { VH_pFragmentDensityOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityOffsetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityOffsetCount, index), LAYOUT_fragmentDensityOffsetCount); }
    public MemorySegment _fragmentDensityOffsetCount() { return _fragmentDensityOffsetCountAt(0L); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _fragmentDensityOffsetCountAt(long index, MemorySegment src) { _fragmentDensityOffsetCountAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _fragmentDensityOffsetCount(MemorySegment src) { return _fragmentDensityOffsetCountAt(0L, src); }
    public MemorySegment _pFragmentDensityOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFragmentDensityOffsets, index), LAYOUT_pFragmentDensityOffsets); }
    public MemorySegment _pFragmentDensityOffsets() { return _pFragmentDensityOffsetsAt(0L); }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _pFragmentDensityOffsetsAt(long index, MemorySegment src) { _pFragmentDensityOffsetsAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT _pFragmentDensityOffsets(MemorySegment src) { return _pFragmentDensityOffsetsAt(0L, src); }
}
