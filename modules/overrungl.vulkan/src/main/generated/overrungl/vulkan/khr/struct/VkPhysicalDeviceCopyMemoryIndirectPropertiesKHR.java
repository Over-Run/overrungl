// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkQueueFlags supportedQueues;
/// }
/// ```
public final class VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedQueues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportedQueues = LAYOUT.byteOffset(PathElement.groupElement("supportedQueues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportedQueues = LAYOUT.select(PathElement.groupElement("supportedQueues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportedQueues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedQueues"));

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR); }
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR copyFrom(VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR at(long index, Consumer<VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportedQueuesAt(long index) { return (int) VH_supportedQueues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportedQueues() { return (int) VH_supportedQueues.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR supportedQueuesAt(long index, int value) { VH_supportedQueues.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR supportedQueues(int value) { VH_supportedQueues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportedQueuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedQueues, index), LAYOUT_supportedQueues); }
    public MemorySegment _supportedQueues() { return _supportedQueuesAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR _supportedQueuesAt(long index, MemorySegment src) { _supportedQueuesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR _supportedQueues(MemorySegment src) { return _supportedQueuesAt(0L, src); }
}
