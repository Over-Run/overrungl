// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePointClippingPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePointClippingPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPointClippingBehavior pointClippingBehavior;
/// }
/// ```
public final class VkPhysicalDevicePointClippingPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pointClippingBehavior")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pointClippingBehavior = LAYOUT.byteOffset(PathElement.groupElement("pointClippingBehavior"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pointClippingBehavior = LAYOUT.select(PathElement.groupElement("pointClippingBehavior"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pointClippingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointClippingBehavior"));

    public VkPhysicalDevicePointClippingPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePointClippingPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePointClippingPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePointClippingPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePointClippingPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePointClippingPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePointClippingPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePointClippingPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePointClippingPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePointClippingPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePointClippingPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePointClippingPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES); }
    public static VkPhysicalDevicePointClippingPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES);
        return s;
    }
    public VkPhysicalDevicePointClippingPropertiesKHR copyFrom(VkPhysicalDevicePointClippingPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR reinterpret(long count) { return new VkPhysicalDevicePointClippingPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePointClippingPropertiesKHR asSlice(long index) { return new VkPhysicalDevicePointClippingPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePointClippingPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDevicePointClippingPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePointClippingPropertiesKHR at(long index, Consumer<VkPhysicalDevicePointClippingPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pointClippingBehaviorAt(long index) { return (int) VH_pointClippingBehavior.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pointClippingBehavior() { return (int) VH_pointClippingBehavior.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePointClippingPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR pointClippingBehaviorAt(long index, int value) { VH_pointClippingBehavior.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR pointClippingBehavior(int value) { VH_pointClippingBehavior.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePointClippingPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePointClippingPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pointClippingBehaviorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pointClippingBehavior, index), LAYOUT_pointClippingBehavior); }
    public MemorySegment _pointClippingBehavior() { return _pointClippingBehaviorAt(0L); }
    public VkPhysicalDevicePointClippingPropertiesKHR _pointClippingBehaviorAt(long index, MemorySegment src) { _pointClippingBehaviorAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePointClippingPropertiesKHR _pointClippingBehavior(MemorySegment src) { return _pointClippingBehaviorAt(0L, src); }
}
