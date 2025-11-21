// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceQueueCreateInfo`.
/// ## Layout
/// ```
/// struct VkDeviceQueueCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceQueueCreateFlags flags;
///     uint32_t queueFamilyIndex;
///     uint32_t queueCount;
///     const float* pQueuePriorities;
/// }
/// ```
public final class VkDeviceQueueCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.ADDRESS.withName("pQueuePriorities")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    public static final long OFFSET_queueCount = LAYOUT.byteOffset(PathElement.groupElement("queueCount"));
    public static final long OFFSET_pQueuePriorities = LAYOUT.byteOffset(PathElement.groupElement("pQueuePriorities"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    public static final MemoryLayout LAYOUT_queueCount = LAYOUT.select(PathElement.groupElement("queueCount"));
    public static final MemoryLayout LAYOUT_pQueuePriorities = LAYOUT.select(PathElement.groupElement("pQueuePriorities"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    public static final VarHandle VH_queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCount"));
    public static final VarHandle VH_pQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueuePriorities"));

    public VkDeviceQueueCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceQueueCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceQueueCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceQueueCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceQueueCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceQueueCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceQueueCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceQueueCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceQueueCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO); }
    public static VkDeviceQueueCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
        return s;
    }
    public VkDeviceQueueCreateInfo copyFrom(VkDeviceQueueCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceQueueCreateInfo reinterpret(long count) { return new VkDeviceQueueCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceQueueCreateInfo asSlice(long index) { return new VkDeviceQueueCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceQueueCreateInfo asSlice(long index, long count) { return new VkDeviceQueueCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceQueueCreateInfo at(long index, Consumer<VkDeviceQueueCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int queueFamilyIndexAt(long index) { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, index); }
    public int queueCountAt(long index) { return (int) VH_queueCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueuePrioritiesAt(long index) { return (MemorySegment) VH_pQueuePriorities.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndex() { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int queueCount() { return (int) VH_queueCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueuePriorities() { return (MemorySegment) VH_pQueuePriorities.get(this.segment(), 0L, 0L); }
    public VkDeviceQueueCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueCreateInfo queueFamilyIndexAt(long index, int value) { VH_queueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueCreateInfo queueCountAt(long index, int value) { VH_queueCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueCreateInfo pQueuePrioritiesAt(long index, MemorySegment value) { VH_pQueuePriorities.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueCreateInfo queueFamilyIndex(int value) { VH_queueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueCreateInfo queueCount(int value) { VH_queueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueCreateInfo pQueuePriorities(MemorySegment value) { VH_pQueuePriorities.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceQueueCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceQueueCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceQueueCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceQueueCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceQueueCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceQueueCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _queueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndex, index), LAYOUT_queueFamilyIndex); }
    public MemorySegment _queueFamilyIndex() { return _queueFamilyIndexAt(0L); }
    public VkDeviceQueueCreateInfo _queueFamilyIndexAt(long index, MemorySegment src) { _queueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkDeviceQueueCreateInfo _queueFamilyIndex(MemorySegment src) { return _queueFamilyIndexAt(0L, src); }
    public MemorySegment _queueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueCount, index), LAYOUT_queueCount); }
    public MemorySegment _queueCount() { return _queueCountAt(0L); }
    public VkDeviceQueueCreateInfo _queueCountAt(long index, MemorySegment src) { _queueCountAt(index).copyFrom(src); return this; }
    public VkDeviceQueueCreateInfo _queueCount(MemorySegment src) { return _queueCountAt(0L, src); }
    public MemorySegment _pQueuePrioritiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueuePriorities, index), LAYOUT_pQueuePriorities); }
    public MemorySegment _pQueuePriorities() { return _pQueuePrioritiesAt(0L); }
    public VkDeviceQueueCreateInfo _pQueuePrioritiesAt(long index, MemorySegment src) { _pQueuePrioritiesAt(index).copyFrom(src); return this; }
    public VkDeviceQueueCreateInfo _pQueuePriorities(MemorySegment src) { return _pQueuePrioritiesAt(0L, src); }
}
