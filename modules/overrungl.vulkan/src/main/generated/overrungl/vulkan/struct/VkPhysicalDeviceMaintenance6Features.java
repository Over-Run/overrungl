// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance6Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance6Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 maintenance6;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance6Features extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance6")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maintenance6 = LAYOUT.byteOffset(PathElement.groupElement("maintenance6"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maintenance6 = LAYOUT.select(PathElement.groupElement("maintenance6"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maintenance6 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance6"));

    public VkPhysicalDeviceMaintenance6Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance6Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance6Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance6Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance6Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance6Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance6Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance6Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance6Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES); }
    public static VkPhysicalDeviceMaintenance6Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES);
        return s;
    }
    public VkPhysicalDeviceMaintenance6Features copyFrom(VkPhysicalDeviceMaintenance6Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance6Features reinterpret(long count) { return new VkPhysicalDeviceMaintenance6Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance6Features asSlice(long index) { return new VkPhysicalDeviceMaintenance6Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance6Features asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance6Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance6Features at(long index, Consumer<VkPhysicalDeviceMaintenance6Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maintenance6At(long index) { return (int) VH_maintenance6.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maintenance6() { return (int) VH_maintenance6.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance6Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6Features maintenance6At(long index, int value) { VH_maintenance6.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance6Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance6Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance6Features maintenance6(int value) { VH_maintenance6.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance6Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance6Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maintenance6At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maintenance6, index), LAYOUT_maintenance6); }
    public MemorySegment _maintenance6() { return _maintenance6At(0L); }
    public VkPhysicalDeviceMaintenance6Features _maintenance6At(long index, MemorySegment src) { _maintenance6At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance6Features _maintenance6(MemorySegment src) { return _maintenance6At(0L, src); }
}
