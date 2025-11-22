// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMapMemoryPlacedPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMapMemoryPlacedPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize minPlacedMemoryMapAlignment;
/// }
/// ```
public final class VkPhysicalDeviceMapMemoryPlacedPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minPlacedMemoryMapAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minPlacedMemoryMapAlignment = LAYOUT.byteOffset(PathElement.groupElement("minPlacedMemoryMapAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minPlacedMemoryMapAlignment = LAYOUT.select(PathElement.groupElement("minPlacedMemoryMapAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minPlacedMemoryMapAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minPlacedMemoryMapAlignment"));

    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT); }
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT copyFrom(VkPhysicalDeviceMapMemoryPlacedPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT at(long index, Consumer<VkPhysicalDeviceMapMemoryPlacedPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long minPlacedMemoryMapAlignmentAt(long index) { return (long) VH_minPlacedMemoryMapAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long minPlacedMemoryMapAlignment() { return (long) VH_minPlacedMemoryMapAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT minPlacedMemoryMapAlignmentAt(long index, long value) { VH_minPlacedMemoryMapAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT minPlacedMemoryMapAlignment(long value) { VH_minPlacedMemoryMapAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minPlacedMemoryMapAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minPlacedMemoryMapAlignment, index), LAYOUT_minPlacedMemoryMapAlignment); }
    public MemorySegment _minPlacedMemoryMapAlignment() { return _minPlacedMemoryMapAlignmentAt(0L); }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT _minPlacedMemoryMapAlignmentAt(long index, MemorySegment src) { _minPlacedMemoryMapAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT _minPlacedMemoryMapAlignment(MemorySegment src) { return _minPlacedMemoryMapAlignmentAt(0L, src); }
}
