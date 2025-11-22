// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceIndexTypeUint8FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceIndexTypeUint8FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 indexTypeUint8;
/// }
/// ```
public final class VkPhysicalDeviceIndexTypeUint8FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indexTypeUint8")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_indexTypeUint8 = LAYOUT.byteOffset(PathElement.groupElement("indexTypeUint8"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_indexTypeUint8 = LAYOUT.select(PathElement.groupElement("indexTypeUint8"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_indexTypeUint8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeUint8"));

    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES); }
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES);
        return s;
    }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR copyFrom(VkPhysicalDeviceIndexTypeUint8FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR at(long index, Consumer<VkPhysicalDeviceIndexTypeUint8FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int indexTypeUint8At(long index) { return (int) VH_indexTypeUint8.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int indexTypeUint8() { return (int) VH_indexTypeUint8.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR indexTypeUint8At(long index, int value) { VH_indexTypeUint8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR indexTypeUint8(int value) { VH_indexTypeUint8.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indexTypeUint8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexTypeUint8, index), LAYOUT_indexTypeUint8); }
    public MemorySegment _indexTypeUint8() { return _indexTypeUint8At(0L); }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR _indexTypeUint8At(long index, MemorySegment src) { _indexTypeUint8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR _indexTypeUint8(MemorySegment src) { return _indexTypeUint8At(0L, src); }
}
