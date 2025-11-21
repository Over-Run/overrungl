// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDependencyInfo`.
/// ## Layout
/// ```
/// struct VkDependencyInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDependencyFlags dependencyFlags;
///     uint32_t memoryBarrierCount;
///     const VkMemoryBarrier2* pMemoryBarriers;
///     uint32_t bufferMemoryBarrierCount;
///     const VkBufferMemoryBarrier2* pBufferMemoryBarriers;
///     uint32_t imageMemoryBarrierCount;
///     const VkImageMemoryBarrier2* pImageMemoryBarriers;
/// }
/// ```
public final class VkDependencyInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("memoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("bufferMemoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pBufferMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("imageMemoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pImageMemoryBarriers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dependencyFlags = LAYOUT.byteOffset(PathElement.groupElement("dependencyFlags"));
    public static final long OFFSET_memoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("memoryBarrierCount"));
    public static final long OFFSET_pMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pMemoryBarriers"));
    public static final long OFFSET_bufferMemoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("bufferMemoryBarrierCount"));
    public static final long OFFSET_pBufferMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pBufferMemoryBarriers"));
    public static final long OFFSET_imageMemoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("imageMemoryBarrierCount"));
    public static final long OFFSET_pImageMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pImageMemoryBarriers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dependencyFlags = LAYOUT.select(PathElement.groupElement("dependencyFlags"));
    public static final MemoryLayout LAYOUT_memoryBarrierCount = LAYOUT.select(PathElement.groupElement("memoryBarrierCount"));
    public static final MemoryLayout LAYOUT_pMemoryBarriers = LAYOUT.select(PathElement.groupElement("pMemoryBarriers"));
    public static final MemoryLayout LAYOUT_bufferMemoryBarrierCount = LAYOUT.select(PathElement.groupElement("bufferMemoryBarrierCount"));
    public static final MemoryLayout LAYOUT_pBufferMemoryBarriers = LAYOUT.select(PathElement.groupElement("pBufferMemoryBarriers"));
    public static final MemoryLayout LAYOUT_imageMemoryBarrierCount = LAYOUT.select(PathElement.groupElement("imageMemoryBarrierCount"));
    public static final MemoryLayout LAYOUT_pImageMemoryBarriers = LAYOUT.select(PathElement.groupElement("pImageMemoryBarriers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));
    public static final VarHandle VH_memoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBarrierCount"));
    public static final VarHandle VH_pMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMemoryBarriers"));
    public static final VarHandle VH_bufferMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferMemoryBarrierCount"));
    public static final VarHandle VH_pBufferMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferMemoryBarriers"));
    public static final VarHandle VH_imageMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMemoryBarrierCount"));
    public static final VarHandle VH_pImageMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageMemoryBarriers"));

    public VkDependencyInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDependencyInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDependencyInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDependencyInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDependencyInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDependencyInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDependencyInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDependencyInfo alloc(SegmentAllocator allocator) { return new VkDependencyInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDependencyInfo alloc(SegmentAllocator allocator, long count) { return new VkDependencyInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDependencyInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
    public static VkDependencyInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO);
        return s;
    }
    public VkDependencyInfo copyFrom(VkDependencyInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDependencyInfo reinterpret(long count) { return new VkDependencyInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDependencyInfo asSlice(long index) { return new VkDependencyInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDependencyInfo asSlice(long index, long count) { return new VkDependencyInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDependencyInfo at(long index, Consumer<VkDependencyInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dependencyFlagsAt(long index) { return (int) VH_dependencyFlags.get(this.segment(), 0L, index); }
    public int memoryBarrierCountAt(long index) { return (int) VH_memoryBarrierCount.get(this.segment(), 0L, index); }
    public MemorySegment pMemoryBarriersAt(long index) { return (MemorySegment) VH_pMemoryBarriers.get(this.segment(), 0L, index); }
    public int bufferMemoryBarrierCountAt(long index) { return (int) VH_bufferMemoryBarrierCount.get(this.segment(), 0L, index); }
    public MemorySegment pBufferMemoryBarriersAt(long index) { return (MemorySegment) VH_pBufferMemoryBarriers.get(this.segment(), 0L, index); }
    public int imageMemoryBarrierCountAt(long index) { return (int) VH_imageMemoryBarrierCount.get(this.segment(), 0L, index); }
    public MemorySegment pImageMemoryBarriersAt(long index) { return (MemorySegment) VH_pImageMemoryBarriers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dependencyFlags() { return (int) VH_dependencyFlags.get(this.segment(), 0L, 0L); }
    public int memoryBarrierCount() { return (int) VH_memoryBarrierCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pMemoryBarriers() { return (MemorySegment) VH_pMemoryBarriers.get(this.segment(), 0L, 0L); }
    public int bufferMemoryBarrierCount() { return (int) VH_bufferMemoryBarrierCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBufferMemoryBarriers() { return (MemorySegment) VH_pBufferMemoryBarriers.get(this.segment(), 0L, 0L); }
    public int imageMemoryBarrierCount() { return (int) VH_imageMemoryBarrierCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageMemoryBarriers() { return (MemorySegment) VH_pImageMemoryBarriers.get(this.segment(), 0L, 0L); }
    public VkDependencyInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo dependencyFlagsAt(long index, int value) { VH_dependencyFlags.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo memoryBarrierCountAt(long index, int value) { VH_memoryBarrierCount.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo pMemoryBarriersAt(long index, MemorySegment value) { VH_pMemoryBarriers.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo bufferMemoryBarrierCountAt(long index, int value) { VH_bufferMemoryBarrierCount.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo pBufferMemoryBarriersAt(long index, MemorySegment value) { VH_pBufferMemoryBarriers.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo imageMemoryBarrierCountAt(long index, int value) { VH_imageMemoryBarrierCount.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo pImageMemoryBarriersAt(long index, MemorySegment value) { VH_pImageMemoryBarriers.set(this.segment(), 0L, index, value); return this; }
    public VkDependencyInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo dependencyFlags(int value) { VH_dependencyFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo memoryBarrierCount(int value) { VH_memoryBarrierCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo pMemoryBarriers(MemorySegment value) { VH_pMemoryBarriers.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo bufferMemoryBarrierCount(int value) { VH_bufferMemoryBarrierCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo pBufferMemoryBarriers(MemorySegment value) { VH_pBufferMemoryBarriers.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo imageMemoryBarrierCount(int value) { VH_imageMemoryBarrierCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDependencyInfo pImageMemoryBarriers(MemorySegment value) { VH_pImageMemoryBarriers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDependencyInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDependencyInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dependencyFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dependencyFlags, index), LAYOUT_dependencyFlags); }
    public MemorySegment _dependencyFlags() { return _dependencyFlagsAt(0L); }
    public VkDependencyInfo _dependencyFlagsAt(long index, MemorySegment src) { _dependencyFlagsAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _dependencyFlags(MemorySegment src) { return _dependencyFlagsAt(0L, src); }
    public MemorySegment _memoryBarrierCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryBarrierCount, index), LAYOUT_memoryBarrierCount); }
    public MemorySegment _memoryBarrierCount() { return _memoryBarrierCountAt(0L); }
    public VkDependencyInfo _memoryBarrierCountAt(long index, MemorySegment src) { _memoryBarrierCountAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _memoryBarrierCount(MemorySegment src) { return _memoryBarrierCountAt(0L, src); }
    public MemorySegment _pMemoryBarriersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMemoryBarriers, index), LAYOUT_pMemoryBarriers); }
    public MemorySegment _pMemoryBarriers() { return _pMemoryBarriersAt(0L); }
    public VkDependencyInfo _pMemoryBarriersAt(long index, MemorySegment src) { _pMemoryBarriersAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _pMemoryBarriers(MemorySegment src) { return _pMemoryBarriersAt(0L, src); }
    public MemorySegment _bufferMemoryBarrierCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferMemoryBarrierCount, index), LAYOUT_bufferMemoryBarrierCount); }
    public MemorySegment _bufferMemoryBarrierCount() { return _bufferMemoryBarrierCountAt(0L); }
    public VkDependencyInfo _bufferMemoryBarrierCountAt(long index, MemorySegment src) { _bufferMemoryBarrierCountAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _bufferMemoryBarrierCount(MemorySegment src) { return _bufferMemoryBarrierCountAt(0L, src); }
    public MemorySegment _pBufferMemoryBarriersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBufferMemoryBarriers, index), LAYOUT_pBufferMemoryBarriers); }
    public MemorySegment _pBufferMemoryBarriers() { return _pBufferMemoryBarriersAt(0L); }
    public VkDependencyInfo _pBufferMemoryBarriersAt(long index, MemorySegment src) { _pBufferMemoryBarriersAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _pBufferMemoryBarriers(MemorySegment src) { return _pBufferMemoryBarriersAt(0L, src); }
    public MemorySegment _imageMemoryBarrierCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageMemoryBarrierCount, index), LAYOUT_imageMemoryBarrierCount); }
    public MemorySegment _imageMemoryBarrierCount() { return _imageMemoryBarrierCountAt(0L); }
    public VkDependencyInfo _imageMemoryBarrierCountAt(long index, MemorySegment src) { _imageMemoryBarrierCountAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _imageMemoryBarrierCount(MemorySegment src) { return _imageMemoryBarrierCountAt(0L, src); }
    public MemorySegment _pImageMemoryBarriersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageMemoryBarriers, index), LAYOUT_pImageMemoryBarriers); }
    public MemorySegment _pImageMemoryBarriers() { return _pImageMemoryBarriersAt(0L); }
    public VkDependencyInfo _pImageMemoryBarriersAt(long index, MemorySegment src) { _pImageMemoryBarriersAt(index).copyFrom(src); return this; }
    public VkDependencyInfo _pImageMemoryBarriers(MemorySegment src) { return _pImageMemoryBarriersAt(0L, src); }
}
