// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags2KHR flags;
///     VkPipelineLayout layout;
///     uint32_t resourceInfoCount;
///     const VkDataGraphPipelineResourceInfoARM* pResourceInfos;
/// }
/// ```
public final class VkDataGraphPipelineCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("resourceInfoCount"),
        ValueLayout.ADDRESS.withName("pResourceInfos")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_resourceInfoCount = LAYOUT.byteOffset(PathElement.groupElement("resourceInfoCount"));
    public static final long OFFSET_pResourceInfos = LAYOUT.byteOffset(PathElement.groupElement("pResourceInfos"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_resourceInfoCount = LAYOUT.select(PathElement.groupElement("resourceInfoCount"));
    public static final MemoryLayout LAYOUT_pResourceInfos = LAYOUT.select(PathElement.groupElement("pResourceInfos"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_resourceInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceInfoCount"));
    public static final VarHandle VH_pResourceInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResourceInfos"));

    public VkDataGraphPipelineCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM); }
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineCreateInfoARM copyFrom(VkDataGraphPipelineCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineCreateInfoARM at(long index, Consumer<VkDataGraphPipelineCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long flagsAt(long index) { return (long) VH_flags.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int resourceInfoCountAt(long index) { return (int) VH_resourceInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pResourceInfosAt(long index) { return (MemorySegment) VH_pResourceInfos.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long flags() { return (long) VH_flags.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int resourceInfoCount() { return (int) VH_resourceInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pResourceInfos() { return (MemorySegment) VH_pResourceInfos.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCreateInfoARM flagsAt(long index, long value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCreateInfoARM layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCreateInfoARM resourceInfoCountAt(long index, int value) { VH_resourceInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCreateInfoARM pResourceInfosAt(long index, MemorySegment value) { VH_pResourceInfos.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCreateInfoARM flags(long value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCreateInfoARM layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCreateInfoARM resourceInfoCount(int value) { VH_resourceInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCreateInfoARM pResourceInfos(MemorySegment value) { VH_pResourceInfos.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDataGraphPipelineCreateInfoARM _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCreateInfoARM _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkDataGraphPipelineCreateInfoARM _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCreateInfoARM _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _resourceInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resourceInfoCount, index), LAYOUT_resourceInfoCount); }
    public MemorySegment _resourceInfoCount() { return _resourceInfoCountAt(0L); }
    public VkDataGraphPipelineCreateInfoARM _resourceInfoCountAt(long index, MemorySegment src) { _resourceInfoCountAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCreateInfoARM _resourceInfoCount(MemorySegment src) { return _resourceInfoCountAt(0L, src); }
    public MemorySegment _pResourceInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pResourceInfos, index), LAYOUT_pResourceInfos); }
    public MemorySegment _pResourceInfos() { return _pResourceInfosAt(0L); }
    public VkDataGraphPipelineCreateInfoARM _pResourceInfosAt(long index, MemorySegment src) { _pResourceInfosAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCreateInfoARM _pResourceInfos(MemorySegment src) { return _pResourceInfosAt(0L, src); }
}
