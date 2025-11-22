// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
/// ## Layout
/// ```
/// struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t fragmentDensityOffsetCount;
///     const VkOffset2D* pFragmentDensityOffsets;
/// }
/// ```
public final class VkSubpassFragmentDensityMapOffsetEndInfoQCOM extends GroupType {
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

    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM alloc(SegmentAllocator allocator) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT); }
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT);
        return s;
    }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM copyFrom(VkSubpassFragmentDensityMapOffsetEndInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM reinterpret(long count) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM asSlice(long index) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM asSlice(long index, long count) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM at(long index, Consumer<VkSubpassFragmentDensityMapOffsetEndInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityOffsetCountAt(long index) { return (int) VH_fragmentDensityOffsetCount.get(this.segment(), 0L, index); }
    public MemorySegment pFragmentDensityOffsetsAt(long index) { return (MemorySegment) VH_pFragmentDensityOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityOffsetCount() { return (int) VH_fragmentDensityOffsetCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pFragmentDensityOffsets() { return (MemorySegment) VH_pFragmentDensityOffsets.get(this.segment(), 0L, 0L); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM fragmentDensityOffsetCountAt(long index, int value) { VH_fragmentDensityOffsetCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsetsAt(long index, MemorySegment value) { VH_pFragmentDensityOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM fragmentDensityOffsetCount(int value) { VH_fragmentDensityOffsetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsets(MemorySegment value) { VH_pFragmentDensityOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityOffsetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityOffsetCount, index), LAYOUT_fragmentDensityOffsetCount); }
    public MemorySegment _fragmentDensityOffsetCount() { return _fragmentDensityOffsetCountAt(0L); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _fragmentDensityOffsetCountAt(long index, MemorySegment src) { _fragmentDensityOffsetCountAt(index).copyFrom(src); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _fragmentDensityOffsetCount(MemorySegment src) { return _fragmentDensityOffsetCountAt(0L, src); }
    public MemorySegment _pFragmentDensityOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFragmentDensityOffsets, index), LAYOUT_pFragmentDensityOffsets); }
    public MemorySegment _pFragmentDensityOffsets() { return _pFragmentDensityOffsetsAt(0L); }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _pFragmentDensityOffsetsAt(long index, MemorySegment src) { _pFragmentDensityOffsetsAt(index).copyFrom(src); return this; }
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM _pFragmentDensityOffsets(MemorySegment src) { return _pFragmentDensityOffsetsAt(0L, src); }
}
