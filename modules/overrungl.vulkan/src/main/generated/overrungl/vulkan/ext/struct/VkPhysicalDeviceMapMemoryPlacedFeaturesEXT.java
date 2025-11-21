// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMapMemoryPlacedFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMapMemoryPlacedFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 memoryMapPlaced;
///     VkBool32 memoryMapRangePlaced;
///     VkBool32 memoryUnmapReserve;
/// }
/// ```
public final class VkPhysicalDeviceMapMemoryPlacedFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryMapPlaced"),
        ValueLayout.JAVA_INT.withName("memoryMapRangePlaced"),
        ValueLayout.JAVA_INT.withName("memoryUnmapReserve")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryMapPlaced = LAYOUT.byteOffset(PathElement.groupElement("memoryMapPlaced"));
    public static final long OFFSET_memoryMapRangePlaced = LAYOUT.byteOffset(PathElement.groupElement("memoryMapRangePlaced"));
    public static final long OFFSET_memoryUnmapReserve = LAYOUT.byteOffset(PathElement.groupElement("memoryUnmapReserve"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryMapPlaced = LAYOUT.select(PathElement.groupElement("memoryMapPlaced"));
    public static final MemoryLayout LAYOUT_memoryMapRangePlaced = LAYOUT.select(PathElement.groupElement("memoryMapRangePlaced"));
    public static final MemoryLayout LAYOUT_memoryUnmapReserve = LAYOUT.select(PathElement.groupElement("memoryUnmapReserve"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryMapPlaced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryMapPlaced"));
    public static final VarHandle VH_memoryMapRangePlaced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryMapRangePlaced"));
    public static final VarHandle VH_memoryUnmapReserve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryUnmapReserve"));

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT); }
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT copyFrom(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryMapPlacedAt(long index) { return (int) VH_memoryMapPlaced.get(this.segment(), 0L, index); }
    public int memoryMapRangePlacedAt(long index) { return (int) VH_memoryMapRangePlaced.get(this.segment(), 0L, index); }
    public int memoryUnmapReserveAt(long index) { return (int) VH_memoryUnmapReserve.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryMapPlaced() { return (int) VH_memoryMapPlaced.get(this.segment(), 0L, 0L); }
    public int memoryMapRangePlaced() { return (int) VH_memoryMapRangePlaced.get(this.segment(), 0L, 0L); }
    public int memoryUnmapReserve() { return (int) VH_memoryUnmapReserve.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlacedAt(long index, int value) { VH_memoryMapPlaced.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlacedAt(long index, int value) { VH_memoryMapRangePlaced.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserveAt(long index, int value) { VH_memoryUnmapReserve.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlaced(int value) { VH_memoryMapPlaced.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlaced(int value) { VH_memoryMapRangePlaced.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserve(int value) { VH_memoryUnmapReserve.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryMapPlacedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryMapPlaced, index), LAYOUT_memoryMapPlaced); }
    public MemorySegment _memoryMapPlaced() { return _memoryMapPlacedAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _memoryMapPlacedAt(long index, MemorySegment src) { _memoryMapPlacedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _memoryMapPlaced(MemorySegment src) { return _memoryMapPlacedAt(0L, src); }
    public MemorySegment _memoryMapRangePlacedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryMapRangePlaced, index), LAYOUT_memoryMapRangePlaced); }
    public MemorySegment _memoryMapRangePlaced() { return _memoryMapRangePlacedAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _memoryMapRangePlacedAt(long index, MemorySegment src) { _memoryMapRangePlacedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _memoryMapRangePlaced(MemorySegment src) { return _memoryMapRangePlacedAt(0L, src); }
    public MemorySegment _memoryUnmapReserveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryUnmapReserve, index), LAYOUT_memoryUnmapReserve); }
    public MemorySegment _memoryUnmapReserve() { return _memoryUnmapReserveAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _memoryUnmapReserveAt(long index, MemorySegment src) { _memoryUnmapReserveAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT _memoryUnmapReserve(MemorySegment src) { return _memoryUnmapReserveAt(0L, src); }
}
