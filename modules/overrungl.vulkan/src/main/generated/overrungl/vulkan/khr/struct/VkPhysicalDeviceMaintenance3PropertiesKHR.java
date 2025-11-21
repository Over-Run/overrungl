// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance3PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance3PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxPerSetDescriptors;
///     VkDeviceSize maxMemoryAllocationSize;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance3PropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxPerSetDescriptors = LAYOUT.byteOffset(PathElement.groupElement("maxPerSetDescriptors"));
    public static final long OFFSET_maxMemoryAllocationSize = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxPerSetDescriptors = LAYOUT.select(PathElement.groupElement("maxPerSetDescriptors"));
    public static final MemoryLayout LAYOUT_maxMemoryAllocationSize = LAYOUT.select(PathElement.groupElement("maxMemoryAllocationSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxPerSetDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerSetDescriptors"));
    public static final VarHandle VH_maxMemoryAllocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationSize"));

    public VkPhysicalDeviceMaintenance3PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance3PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance3PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES); }
    public static VkPhysicalDeviceMaintenance3PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceMaintenance3PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance3PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance3PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance3PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance3PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance3PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxPerSetDescriptorsAt(long index) { return (int) VH_maxPerSetDescriptors.get(this.segment(), 0L, index); }
    public long maxMemoryAllocationSizeAt(long index) { return (long) VH_maxMemoryAllocationSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxPerSetDescriptors() { return (int) VH_maxPerSetDescriptors.get(this.segment(), 0L, 0L); }
    public long maxMemoryAllocationSize() { return (long) VH_maxMemoryAllocationSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR maxPerSetDescriptorsAt(long index, int value) { VH_maxPerSetDescriptors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR maxMemoryAllocationSizeAt(long index, long value) { VH_maxMemoryAllocationSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR maxPerSetDescriptors(int value) { VH_maxPerSetDescriptors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR maxMemoryAllocationSize(long value) { VH_maxMemoryAllocationSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxPerSetDescriptorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerSetDescriptors, index), LAYOUT_maxPerSetDescriptors); }
    public MemorySegment _maxPerSetDescriptors() { return _maxPerSetDescriptorsAt(0L); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _maxPerSetDescriptorsAt(long index, MemorySegment src) { _maxPerSetDescriptorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _maxPerSetDescriptors(MemorySegment src) { return _maxPerSetDescriptorsAt(0L, src); }
    public MemorySegment _maxMemoryAllocationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMemoryAllocationSize, index), LAYOUT_maxMemoryAllocationSize); }
    public MemorySegment _maxMemoryAllocationSize() { return _maxMemoryAllocationSizeAt(0L); }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _maxMemoryAllocationSizeAt(long index, MemorySegment src) { _maxMemoryAllocationSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance3PropertiesKHR _maxMemoryAllocationSize(MemorySegment src) { return _maxMemoryAllocationSizeAt(0L, src); }
}
