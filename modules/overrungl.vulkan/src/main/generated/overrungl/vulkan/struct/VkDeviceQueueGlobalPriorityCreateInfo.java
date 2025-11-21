// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceQueueGlobalPriorityCreateInfo`.
/// ## Layout
/// ```
/// struct VkDeviceQueueGlobalPriorityCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueueGlobalPriority globalPriority;
/// }
/// ```
public final class VkDeviceQueueGlobalPriorityCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriority")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_globalPriority = LAYOUT.byteOffset(PathElement.groupElement("globalPriority"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_globalPriority = LAYOUT.select(PathElement.groupElement("globalPriority"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_globalPriority = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalPriority"));

    public VkDeviceQueueGlobalPriorityCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceQueueGlobalPriorityCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueGlobalPriorityCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceQueueGlobalPriorityCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueGlobalPriorityCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceQueueGlobalPriorityCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueGlobalPriorityCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceQueueGlobalPriorityCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceQueueGlobalPriorityCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceQueueGlobalPriorityCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceQueueGlobalPriorityCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceQueueGlobalPriorityCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO); }
    public static VkDeviceQueueGlobalPriorityCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO);
        return s;
    }
    public VkDeviceQueueGlobalPriorityCreateInfo copyFrom(VkDeviceQueueGlobalPriorityCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo reinterpret(long count) { return new VkDeviceQueueGlobalPriorityCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceQueueGlobalPriorityCreateInfo asSlice(long index) { return new VkDeviceQueueGlobalPriorityCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceQueueGlobalPriorityCreateInfo asSlice(long index, long count) { return new VkDeviceQueueGlobalPriorityCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceQueueGlobalPriorityCreateInfo at(long index, Consumer<VkDeviceQueueGlobalPriorityCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int globalPriorityAt(long index) { return (int) VH_globalPriority.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int globalPriority() { return (int) VH_globalPriority.get(this.segment(), 0L, 0L); }
    public VkDeviceQueueGlobalPriorityCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo globalPriorityAt(long index, int value) { VH_globalPriority.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo globalPriority(int value) { VH_globalPriority.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceQueueGlobalPriorityCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceQueueGlobalPriorityCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _globalPriorityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_globalPriority, index), LAYOUT_globalPriority); }
    public MemorySegment _globalPriority() { return _globalPriorityAt(0L); }
    public VkDeviceQueueGlobalPriorityCreateInfo _globalPriorityAt(long index, MemorySegment src) { _globalPriorityAt(index).copyFrom(src); return this; }
    public VkDeviceQueueGlobalPriorityCreateInfo _globalPriority(MemorySegment src) { return _globalPriorityAt(0L, src); }
}
