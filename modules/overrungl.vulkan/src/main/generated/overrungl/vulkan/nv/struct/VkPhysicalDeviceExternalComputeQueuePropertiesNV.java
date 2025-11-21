// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalComputeQueuePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalComputeQueuePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t externalDataSize;
///     uint32_t maxExternalQueues;
/// }
/// ```
public final class VkPhysicalDeviceExternalComputeQueuePropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalDataSize"),
        ValueLayout.JAVA_INT.withName("maxExternalQueues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_externalDataSize = LAYOUT.byteOffset(PathElement.groupElement("externalDataSize"));
    public static final long OFFSET_maxExternalQueues = LAYOUT.byteOffset(PathElement.groupElement("maxExternalQueues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_externalDataSize = LAYOUT.select(PathElement.groupElement("externalDataSize"));
    public static final MemoryLayout LAYOUT_maxExternalQueues = LAYOUT.select(PathElement.groupElement("maxExternalQueues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_externalDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalDataSize"));
    public static final VarHandle VH_maxExternalQueues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExternalQueues"));

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExternalComputeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV); }
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExternalComputeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV copyFrom(VkPhysicalDeviceExternalComputeQueuePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV reinterpret(long count) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV asSlice(long index) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV at(long index, Consumer<VkPhysicalDeviceExternalComputeQueuePropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int externalDataSizeAt(long index) { return (int) VH_externalDataSize.get(this.segment(), 0L, index); }
    public int maxExternalQueuesAt(long index) { return (int) VH_maxExternalQueues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int externalDataSize() { return (int) VH_externalDataSize.get(this.segment(), 0L, 0L); }
    public int maxExternalQueues() { return (int) VH_maxExternalQueues.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV externalDataSizeAt(long index, int value) { VH_externalDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV maxExternalQueuesAt(long index, int value) { VH_maxExternalQueues.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV externalDataSize(int value) { VH_externalDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV maxExternalQueues(int value) { VH_maxExternalQueues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalDataSize, index), LAYOUT_externalDataSize); }
    public MemorySegment _externalDataSize() { return _externalDataSizeAt(0L); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _externalDataSizeAt(long index, MemorySegment src) { _externalDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _externalDataSize(MemorySegment src) { return _externalDataSizeAt(0L, src); }
    public MemorySegment _maxExternalQueuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExternalQueues, index), LAYOUT_maxExternalQueues); }
    public MemorySegment _maxExternalQueues() { return _maxExternalQueuesAt(0L); }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _maxExternalQueuesAt(long index, MemorySegment src) { _maxExternalQueuesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV _maxExternalQueues(MemorySegment src) { return _maxExternalQueuesAt(0L, src); }
}
