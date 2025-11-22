// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance10FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance10FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 maintenance10;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance10FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance10")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maintenance10 = LAYOUT.byteOffset(PathElement.groupElement("maintenance10"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maintenance10 = LAYOUT.select(PathElement.groupElement("maintenance10"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maintenance10 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance10"));

    public VkPhysicalDeviceMaintenance10FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance10FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance10FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance10FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance10FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance10FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR); }
    public static VkPhysicalDeviceMaintenance10FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceMaintenance10FeaturesKHR copyFrom(VkPhysicalDeviceMaintenance10FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance10FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance10FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance10FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance10FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maintenance10At(long index) { return (int) VH_maintenance10.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maintenance10() { return (int) VH_maintenance10.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR maintenance10At(long index, int value) { VH_maintenance10.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR maintenance10(int value) { VH_maintenance10.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maintenance10At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maintenance10, index), LAYOUT_maintenance10); }
    public MemorySegment _maintenance10() { return _maintenance10At(0L); }
    public VkPhysicalDeviceMaintenance10FeaturesKHR _maintenance10At(long index, MemorySegment src) { _maintenance10At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10FeaturesKHR _maintenance10(MemorySegment src) { return _maintenance10At(0L, src); }
}
