// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance4Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance4Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 maintenance4;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance4Features extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance4")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maintenance4 = LAYOUT.byteOffset(PathElement.groupElement("maintenance4"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maintenance4 = LAYOUT.select(PathElement.groupElement("maintenance4"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maintenance4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance4"));

    public VkPhysicalDeviceMaintenance4Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance4Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance4Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance4Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance4Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance4Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance4Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance4Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance4Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES); }
    public static VkPhysicalDeviceMaintenance4Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES);
        return s;
    }
    public VkPhysicalDeviceMaintenance4Features copyFrom(VkPhysicalDeviceMaintenance4Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance4Features reinterpret(long count) { return new VkPhysicalDeviceMaintenance4Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance4Features asSlice(long index) { return new VkPhysicalDeviceMaintenance4Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance4Features asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance4Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance4Features at(long index, Consumer<VkPhysicalDeviceMaintenance4Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maintenance4At(long index) { return (int) VH_maintenance4.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maintenance4() { return (int) VH_maintenance4.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance4Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance4Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance4Features maintenance4At(long index, int value) { VH_maintenance4.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance4Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance4Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance4Features maintenance4(int value) { VH_maintenance4.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance4Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance4Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance4Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance4Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maintenance4At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maintenance4, index), LAYOUT_maintenance4); }
    public MemorySegment _maintenance4() { return _maintenance4At(0L); }
    public VkPhysicalDeviceMaintenance4Features _maintenance4At(long index, MemorySegment src) { _maintenance4At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance4Features _maintenance4(MemorySegment src) { return _maintenance4At(0L, src); }
}
