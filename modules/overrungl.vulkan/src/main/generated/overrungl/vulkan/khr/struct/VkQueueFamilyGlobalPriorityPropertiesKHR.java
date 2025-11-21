// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyGlobalPriorityPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyGlobalPriorityPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t priorityCount;
///     VkQueueGlobalPriority priorities[VK_MAX_GLOBAL_PRIORITY_SIZE];
/// }
/// ```
public final class VkQueueFamilyGlobalPriorityPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("priorityCount"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK14.VK_MAX_GLOBAL_PRIORITY_SIZE, ValueLayout.JAVA_INT).withName("priorities")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_priorityCount = LAYOUT.byteOffset(PathElement.groupElement("priorityCount"));
    public static final long OFFSET_priorities = LAYOUT.byteOffset(PathElement.groupElement("priorities"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_priorityCount = LAYOUT.select(PathElement.groupElement("priorityCount"));
    public static final MemoryLayout LAYOUT_priorities = LAYOUT.select(PathElement.groupElement("priorities"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_priorityCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("priorityCount"));
    public static final VarHandle VH_priorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("priorities"), PathElement.sequenceElement());

    public VkQueueFamilyGlobalPriorityPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyGlobalPriorityPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyGlobalPriorityPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyGlobalPriorityPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES); }
    public static VkQueueFamilyGlobalPriorityPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES);
        return s;
    }
    public VkQueueFamilyGlobalPriorityPropertiesKHR copyFrom(VkQueueFamilyGlobalPriorityPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR reinterpret(long count) { return new VkQueueFamilyGlobalPriorityPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR asSlice(long index) { return new VkQueueFamilyGlobalPriorityPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyGlobalPriorityPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR at(long index, Consumer<VkQueueFamilyGlobalPriorityPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int priorityCountAt(long index) { return (int) VH_priorityCount.get(this.segment(), 0L, index); }
    public int prioritiesAt(long index, long index0) { return (int) VH_priorities.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int priorityCount() { return (int) VH_priorityCount.get(this.segment(), 0L, 0L); }
    public int priorities(long index0) { return (int) VH_priorities.get(this.segment(), 0L, 0L, index0); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR priorityCountAt(long index, int value) { VH_priorityCount.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR prioritiesAt(long index, long index0, int value) { VH_priorities.set(this.segment(), 0L, index, index0, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR priorityCount(int value) { VH_priorityCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR priorities(long index0, int value) { VH_priorities.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _priorityCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_priorityCount, index), LAYOUT_priorityCount); }
    public MemorySegment _priorityCount() { return _priorityCountAt(0L); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _priorityCountAt(long index, MemorySegment src) { _priorityCountAt(index).copyFrom(src); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _priorityCount(MemorySegment src) { return _priorityCountAt(0L, src); }
    public MemorySegment _prioritiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_priorities, index), LAYOUT_priorities); }
    public MemorySegment _priorities() { return _prioritiesAt(0L); }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _prioritiesAt(long index, MemorySegment src) { _prioritiesAt(index).copyFrom(src); return this; }
    public VkQueueFamilyGlobalPriorityPropertiesKHR _priorities(MemorySegment src) { return _prioritiesAt(0L, src); }
}
