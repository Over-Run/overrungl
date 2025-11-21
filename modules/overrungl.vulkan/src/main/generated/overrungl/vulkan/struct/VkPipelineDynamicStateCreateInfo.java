// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineDynamicStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineDynamicStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineDynamicStateCreateFlags flags;
///     uint32_t dynamicStateCount;
///     const VkDynamicState* pDynamicStates;
/// }
/// ```
public final class VkPipelineDynamicStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("dynamicStateCount"),
        ValueLayout.ADDRESS.withName("pDynamicStates")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_dynamicStateCount = LAYOUT.byteOffset(PathElement.groupElement("dynamicStateCount"));
    public static final long OFFSET_pDynamicStates = LAYOUT.byteOffset(PathElement.groupElement("pDynamicStates"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_dynamicStateCount = LAYOUT.select(PathElement.groupElement("dynamicStateCount"));
    public static final MemoryLayout LAYOUT_pDynamicStates = LAYOUT.select(PathElement.groupElement("pDynamicStates"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_dynamicStateCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicStateCount"));
    public static final VarHandle VH_pDynamicStates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicStates"));

    public VkPipelineDynamicStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineDynamicStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineDynamicStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineDynamicStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineDynamicStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineDynamicStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineDynamicStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineDynamicStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO); }
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineDynamicStateCreateInfo copyFrom(VkPipelineDynamicStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineDynamicStateCreateInfo reinterpret(long count) { return new VkPipelineDynamicStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineDynamicStateCreateInfo asSlice(long index) { return new VkPipelineDynamicStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineDynamicStateCreateInfo asSlice(long index, long count) { return new VkPipelineDynamicStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineDynamicStateCreateInfo at(long index, Consumer<VkPipelineDynamicStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int dynamicStateCountAt(long index) { return (int) VH_dynamicStateCount.get(this.segment(), 0L, index); }
    public MemorySegment pDynamicStatesAt(long index) { return (MemorySegment) VH_pDynamicStates.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int dynamicStateCount() { return (int) VH_dynamicStateCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDynamicStates() { return (MemorySegment) VH_pDynamicStates.get(this.segment(), 0L, 0L); }
    public VkPipelineDynamicStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDynamicStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDynamicStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDynamicStateCreateInfo dynamicStateCountAt(long index, int value) { VH_dynamicStateCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDynamicStateCreateInfo pDynamicStatesAt(long index, MemorySegment value) { VH_pDynamicStates.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDynamicStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDynamicStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDynamicStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDynamicStateCreateInfo dynamicStateCount(int value) { VH_dynamicStateCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDynamicStateCreateInfo pDynamicStates(MemorySegment value) { VH_pDynamicStates.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineDynamicStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineDynamicStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineDynamicStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineDynamicStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineDynamicStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineDynamicStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _dynamicStateCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicStateCount, index), LAYOUT_dynamicStateCount); }
    public MemorySegment _dynamicStateCount() { return _dynamicStateCountAt(0L); }
    public VkPipelineDynamicStateCreateInfo _dynamicStateCountAt(long index, MemorySegment src) { _dynamicStateCountAt(index).copyFrom(src); return this; }
    public VkPipelineDynamicStateCreateInfo _dynamicStateCount(MemorySegment src) { return _dynamicStateCountAt(0L, src); }
    public MemorySegment _pDynamicStatesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDynamicStates, index), LAYOUT_pDynamicStates); }
    public MemorySegment _pDynamicStates() { return _pDynamicStatesAt(0L); }
    public VkPipelineDynamicStateCreateInfo _pDynamicStatesAt(long index, MemorySegment src) { _pDynamicStatesAt(index).copyFrom(src); return this; }
    public VkPipelineDynamicStateCreateInfo _pDynamicStates(MemorySegment src) { return _pDynamicStatesAt(0L, src); }
}
