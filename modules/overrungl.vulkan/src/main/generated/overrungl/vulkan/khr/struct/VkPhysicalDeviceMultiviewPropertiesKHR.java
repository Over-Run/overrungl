// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiviewPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
/// }
/// ```
public final class VkPhysicalDeviceMultiviewPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
    public static final long OFFSET_maxMultiviewInstanceIndex = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMultiviewViewCount"));
    public static final MemoryLayout LAYOUT_maxMultiviewInstanceIndex = LAYOUT.select(PathElement.groupElement("maxMultiviewInstanceIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount"));
    public static final VarHandle VH_maxMultiviewInstanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));

    public VkPhysicalDeviceMultiviewPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES); }
    public static VkPhysicalDeviceMultiviewPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceMultiviewPropertiesKHR copyFrom(VkPhysicalDeviceMultiviewPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMultiviewPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiviewPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMultiviewPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiviewPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiviewPropertiesKHR at(long index, Consumer<VkPhysicalDeviceMultiviewPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxMultiviewViewCountAt(long index) { return (int) VH_maxMultiviewViewCount.get(this.segment(), 0L, index); }
    public int maxMultiviewInstanceIndexAt(long index) { return (int) VH_maxMultiviewInstanceIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxMultiviewViewCount() { return (int) VH_maxMultiviewViewCount.get(this.segment(), 0L, 0L); }
    public int maxMultiviewInstanceIndex() { return (int) VH_maxMultiviewInstanceIndex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiviewPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewViewCountAt(long index, int value) { VH_maxMultiviewViewCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewInstanceIndexAt(long index, int value) { VH_maxMultiviewInstanceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewViewCount(int value) { VH_maxMultiviewViewCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewInstanceIndex(int value) { VH_maxMultiviewInstanceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiviewPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiviewPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxMultiviewViewCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiviewViewCount, index), LAYOUT_maxMultiviewViewCount); }
    public MemorySegment _maxMultiviewViewCount() { return _maxMultiviewViewCountAt(0L); }
    public VkPhysicalDeviceMultiviewPropertiesKHR _maxMultiviewViewCountAt(long index, MemorySegment src) { _maxMultiviewViewCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR _maxMultiviewViewCount(MemorySegment src) { return _maxMultiviewViewCountAt(0L, src); }
    public MemorySegment _maxMultiviewInstanceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiviewInstanceIndex, index), LAYOUT_maxMultiviewInstanceIndex); }
    public MemorySegment _maxMultiviewInstanceIndex() { return _maxMultiviewInstanceIndexAt(0L); }
    public VkPhysicalDeviceMultiviewPropertiesKHR _maxMultiviewInstanceIndexAt(long index, MemorySegment src) { _maxMultiviewInstanceIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPropertiesKHR _maxMultiviewInstanceIndex(MemorySegment src) { return _maxMultiviewInstanceIndexAt(0L, src); }
}
