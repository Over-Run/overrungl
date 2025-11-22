// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineViewportStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineViewportStateCreateFlags flags;
///     uint32_t viewportCount;
///     const VkViewport* pViewports;
///     uint32_t scissorCount;
///     const VkRect2D* pScissors;
/// }
/// ```
public final class VkPipelineViewportStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewports"),
        ValueLayout.JAVA_INT.withName("scissorCount"),
        ValueLayout.ADDRESS.withName("pScissors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    public static final long OFFSET_pViewports = LAYOUT.byteOffset(PathElement.groupElement("pViewports"));
    public static final long OFFSET_scissorCount = LAYOUT.byteOffset(PathElement.groupElement("scissorCount"));
    public static final long OFFSET_pScissors = LAYOUT.byteOffset(PathElement.groupElement("pScissors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    public static final MemoryLayout LAYOUT_pViewports = LAYOUT.select(PathElement.groupElement("pViewports"));
    public static final MemoryLayout LAYOUT_scissorCount = LAYOUT.select(PathElement.groupElement("scissorCount"));
    public static final MemoryLayout LAYOUT_pScissors = LAYOUT.select(PathElement.groupElement("pScissors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    public static final VarHandle VH_pViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewports"));
    public static final VarHandle VH_scissorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scissorCount"));
    public static final VarHandle VH_pScissors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScissors"));

    public VkPipelineViewportStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineViewportStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO); }
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineViewportStateCreateInfo copyFrom(VkPipelineViewportStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportStateCreateInfo reinterpret(long count) { return new VkPipelineViewportStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportStateCreateInfo asSlice(long index) { return new VkPipelineViewportStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportStateCreateInfo asSlice(long index, long count) { return new VkPipelineViewportStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportStateCreateInfo at(long index, Consumer<VkPipelineViewportStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int viewportCountAt(long index) { return (int) VH_viewportCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewportsAt(long index) { return (MemorySegment) VH_pViewports.get(this.segment(), 0L, index); }
    public int scissorCountAt(long index) { return (int) VH_scissorCount.get(this.segment(), 0L, index); }
    public MemorySegment pScissorsAt(long index) { return (MemorySegment) VH_pScissors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int viewportCount() { return (int) VH_viewportCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewports() { return (MemorySegment) VH_pViewports.get(this.segment(), 0L, 0L); }
    public int scissorCount() { return (int) VH_scissorCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pScissors() { return (MemorySegment) VH_pScissors.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo viewportCountAt(long index, int value) { VH_viewportCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo pViewportsAt(long index, MemorySegment value) { VH_pViewports.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo scissorCountAt(long index, int value) { VH_scissorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo pScissorsAt(long index, MemorySegment value) { VH_pScissors.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportStateCreateInfo viewportCount(int value) { VH_viewportCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportStateCreateInfo pViewports(MemorySegment value) { VH_pViewports.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportStateCreateInfo scissorCount(int value) { VH_scissorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportStateCreateInfo pScissors(MemorySegment value) { VH_pScissors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineViewportStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _viewportCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportCount, index), LAYOUT_viewportCount); }
    public MemorySegment _viewportCount() { return _viewportCountAt(0L); }
    public VkPipelineViewportStateCreateInfo _viewportCountAt(long index, MemorySegment src) { _viewportCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _viewportCount(MemorySegment src) { return _viewportCountAt(0L, src); }
    public MemorySegment _pViewportsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewports, index), LAYOUT_pViewports); }
    public MemorySegment _pViewports() { return _pViewportsAt(0L); }
    public VkPipelineViewportStateCreateInfo _pViewportsAt(long index, MemorySegment src) { _pViewportsAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _pViewports(MemorySegment src) { return _pViewportsAt(0L, src); }
    public MemorySegment _scissorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scissorCount, index), LAYOUT_scissorCount); }
    public MemorySegment _scissorCount() { return _scissorCountAt(0L); }
    public VkPipelineViewportStateCreateInfo _scissorCountAt(long index, MemorySegment src) { _scissorCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _scissorCount(MemorySegment src) { return _scissorCountAt(0L, src); }
    public MemorySegment _pScissorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pScissors, index), LAYOUT_pScissors); }
    public MemorySegment _pScissors() { return _pScissorsAt(0L); }
    public VkPipelineViewportStateCreateInfo _pScissorsAt(long index, MemorySegment src) { _pScissorsAt(index).copyFrom(src); return this; }
    public VkPipelineViewportStateCreateInfo _pScissors(MemorySegment src) { return _pScissorsAt(0L, src); }
}
