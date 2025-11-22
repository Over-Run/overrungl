// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize extendedSparseAddressSpaceSize;
///     VkImageUsageFlags extendedSparseImageUsageFlags;
///     VkBufferUsageFlags extendedSparseBufferUsageFlags;
/// }
/// ```
public final class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags"),
        ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_extendedSparseAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    public static final long OFFSET_extendedSparseImageUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseImageUsageFlags"));
    public static final long OFFSET_extendedSparseBufferUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseBufferUsageFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_extendedSparseAddressSpaceSize = LAYOUT.select(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    public static final MemoryLayout LAYOUT_extendedSparseImageUsageFlags = LAYOUT.select(PathElement.groupElement("extendedSparseImageUsageFlags"));
    public static final MemoryLayout LAYOUT_extendedSparseBufferUsageFlags = LAYOUT.select(PathElement.groupElement("extendedSparseBufferUsageFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_extendedSparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    public static final VarHandle VH_extendedSparseImageUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseImageUsageFlags"));
    public static final VarHandle VH_extendedSparseBufferUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseBufferUsageFlags"));

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV); }
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV copyFrom(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV reinterpret(long count) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV asSlice(long index) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV at(long index, Consumer<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long extendedSparseAddressSpaceSizeAt(long index) { return (long) VH_extendedSparseAddressSpaceSize.get(this.segment(), 0L, index); }
    public int extendedSparseImageUsageFlagsAt(long index) { return (int) VH_extendedSparseImageUsageFlags.get(this.segment(), 0L, index); }
    public int extendedSparseBufferUsageFlagsAt(long index) { return (int) VH_extendedSparseBufferUsageFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long extendedSparseAddressSpaceSize() { return (long) VH_extendedSparseAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public int extendedSparseImageUsageFlags() { return (int) VH_extendedSparseImageUsageFlags.get(this.segment(), 0L, 0L); }
    public int extendedSparseBufferUsageFlags() { return (int) VH_extendedSparseBufferUsageFlags.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseAddressSpaceSizeAt(long index, long value) { VH_extendedSparseAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseImageUsageFlagsAt(long index, int value) { VH_extendedSparseImageUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseBufferUsageFlagsAt(long index, int value) { VH_extendedSparseBufferUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseAddressSpaceSize(long value) { VH_extendedSparseAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseImageUsageFlags(int value) { VH_extendedSparseImageUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseBufferUsageFlags(int value) { VH_extendedSparseBufferUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _extendedSparseAddressSpaceSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedSparseAddressSpaceSize, index), LAYOUT_extendedSparseAddressSpaceSize); }
    public MemorySegment _extendedSparseAddressSpaceSize() { return _extendedSparseAddressSpaceSizeAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _extendedSparseAddressSpaceSizeAt(long index, MemorySegment src) { _extendedSparseAddressSpaceSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _extendedSparseAddressSpaceSize(MemorySegment src) { return _extendedSparseAddressSpaceSizeAt(0L, src); }
    public MemorySegment _extendedSparseImageUsageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedSparseImageUsageFlags, index), LAYOUT_extendedSparseImageUsageFlags); }
    public MemorySegment _extendedSparseImageUsageFlags() { return _extendedSparseImageUsageFlagsAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _extendedSparseImageUsageFlagsAt(long index, MemorySegment src) { _extendedSparseImageUsageFlagsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _extendedSparseImageUsageFlags(MemorySegment src) { return _extendedSparseImageUsageFlagsAt(0L, src); }
    public MemorySegment _extendedSparseBufferUsageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedSparseBufferUsageFlags, index), LAYOUT_extendedSparseBufferUsageFlags); }
    public MemorySegment _extendedSparseBufferUsageFlags() { return _extendedSparseBufferUsageFlagsAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _extendedSparseBufferUsageFlagsAt(long index, MemorySegment src) { _extendedSparseBufferUsageFlagsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV _extendedSparseBufferUsageFlags(MemorySegment src) { return _extendedSparseBufferUsageFlagsAt(0L, src); }
}
