// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiviewProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
/// }
/// ```
public final class VkPhysicalDeviceMultiviewProperties extends GroupType {
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

    public VkPhysicalDeviceMultiviewProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiviewProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiviewProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiviewProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiviewProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiviewProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiviewProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES); }
    public static VkPhysicalDeviceMultiviewProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceMultiviewProperties copyFrom(VkPhysicalDeviceMultiviewProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiviewProperties reinterpret(long count) { return new VkPhysicalDeviceMultiviewProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiviewProperties asSlice(long index) { return new VkPhysicalDeviceMultiviewProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiviewProperties asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiviewProperties at(long index, Consumer<VkPhysicalDeviceMultiviewProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxMultiviewViewCountAt(long index) { return (int) VH_maxMultiviewViewCount.get(this.segment(), 0L, index); }
    public int maxMultiviewInstanceIndexAt(long index) { return (int) VH_maxMultiviewInstanceIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxMultiviewViewCount() { return (int) VH_maxMultiviewViewCount.get(this.segment(), 0L, 0L); }
    public int maxMultiviewInstanceIndex() { return (int) VH_maxMultiviewInstanceIndex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiviewProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewProperties maxMultiviewViewCountAt(long index, int value) { VH_maxMultiviewViewCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewProperties maxMultiviewInstanceIndexAt(long index, int value) { VH_maxMultiviewInstanceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewProperties maxMultiviewViewCount(int value) { VH_maxMultiviewViewCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewProperties maxMultiviewInstanceIndex(int value) { VH_maxMultiviewInstanceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiviewProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiviewProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxMultiviewViewCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiviewViewCount, index), LAYOUT_maxMultiviewViewCount); }
    public MemorySegment _maxMultiviewViewCount() { return _maxMultiviewViewCountAt(0L); }
    public VkPhysicalDeviceMultiviewProperties _maxMultiviewViewCountAt(long index, MemorySegment src) { _maxMultiviewViewCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewProperties _maxMultiviewViewCount(MemorySegment src) { return _maxMultiviewViewCountAt(0L, src); }
    public MemorySegment _maxMultiviewInstanceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiviewInstanceIndex, index), LAYOUT_maxMultiviewInstanceIndex); }
    public MemorySegment _maxMultiviewInstanceIndex() { return _maxMultiviewInstanceIndexAt(0L); }
    public VkPhysicalDeviceMultiviewProperties _maxMultiviewInstanceIndexAt(long index, MemorySegment src) { _maxMultiviewInstanceIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewProperties _maxMultiviewInstanceIndex(MemorySegment src) { return _maxMultiviewInstanceIndexAt(0L, src); }
}
