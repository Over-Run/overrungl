// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferAllocateInfo`.
/// ## Layout
/// ```
/// struct VkCommandBufferAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkCommandPool commandPool;
///     VkCommandBufferLevel level;
///     uint32_t commandBufferCount;
/// }
/// ```
public final class VkCommandBufferAllocateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("commandPool"),
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_INT.withName("commandBufferCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_commandPool = LAYOUT.byteOffset(PathElement.groupElement("commandPool"));
    public static final long OFFSET_level = LAYOUT.byteOffset(PathElement.groupElement("level"));
    public static final long OFFSET_commandBufferCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_commandPool = LAYOUT.select(PathElement.groupElement("commandPool"));
    public static final MemoryLayout LAYOUT_level = LAYOUT.select(PathElement.groupElement("level"));
    public static final MemoryLayout LAYOUT_commandBufferCount = LAYOUT.select(PathElement.groupElement("commandBufferCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_commandPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPool"));
    public static final VarHandle VH_level = LAYOUT.arrayElementVarHandle(PathElement.groupElement("level"));
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));

    public VkCommandBufferAllocateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferAllocateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferAllocateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferAllocateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferAllocateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferAllocateInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferAllocateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferAllocateInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferAllocateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO); }
    public static VkCommandBufferAllocateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
        return s;
    }
    public VkCommandBufferAllocateInfo copyFrom(VkCommandBufferAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferAllocateInfo reinterpret(long count) { return new VkCommandBufferAllocateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferAllocateInfo asSlice(long index) { return new VkCommandBufferAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferAllocateInfo asSlice(long index, long count) { return new VkCommandBufferAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferAllocateInfo at(long index, Consumer<VkCommandBufferAllocateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long commandPoolAt(long index) { return (long) VH_commandPool.get(this.segment(), 0L, index); }
    public int levelAt(long index) { return (int) VH_level.get(this.segment(), 0L, index); }
    public int commandBufferCountAt(long index) { return (int) VH_commandBufferCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long commandPool() { return (long) VH_commandPool.get(this.segment(), 0L, 0L); }
    public int level() { return (int) VH_level.get(this.segment(), 0L, 0L); }
    public int commandBufferCount() { return (int) VH_commandBufferCount.get(this.segment(), 0L, 0L); }
    public VkCommandBufferAllocateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferAllocateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferAllocateInfo commandPoolAt(long index, long value) { VH_commandPool.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferAllocateInfo levelAt(long index, int value) { VH_level.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferAllocateInfo commandBufferCountAt(long index, int value) { VH_commandBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferAllocateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferAllocateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferAllocateInfo commandPool(long value) { VH_commandPool.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferAllocateInfo level(int value) { VH_level.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferAllocateInfo commandBufferCount(int value) { VH_commandBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferAllocateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferAllocateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferAllocateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferAllocateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _commandPoolAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandPool, index), LAYOUT_commandPool); }
    public MemorySegment _commandPool() { return _commandPoolAt(0L); }
    public VkCommandBufferAllocateInfo _commandPoolAt(long index, MemorySegment src) { _commandPoolAt(index).copyFrom(src); return this; }
    public VkCommandBufferAllocateInfo _commandPool(MemorySegment src) { return _commandPoolAt(0L, src); }
    public MemorySegment _levelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_level, index), LAYOUT_level); }
    public MemorySegment _level() { return _levelAt(0L); }
    public VkCommandBufferAllocateInfo _levelAt(long index, MemorySegment src) { _levelAt(index).copyFrom(src); return this; }
    public VkCommandBufferAllocateInfo _level(MemorySegment src) { return _levelAt(0L, src); }
    public MemorySegment _commandBufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandBufferCount, index), LAYOUT_commandBufferCount); }
    public MemorySegment _commandBufferCount() { return _commandBufferCountAt(0L); }
    public VkCommandBufferAllocateInfo _commandBufferCountAt(long index, MemorySegment src) { _commandBufferCountAt(index).copyFrom(src); return this; }
    public VkCommandBufferAllocateInfo _commandBufferCount(MemorySegment src) { return _commandBufferCountAt(0L, src); }
}
