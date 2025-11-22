// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDiscardRectanglePropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDiscardRectanglePropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxDiscardRectangles;
/// }
/// ```
public final class VkPhysicalDeviceDiscardRectanglePropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDiscardRectangles")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxDiscardRectangles = LAYOUT.byteOffset(PathElement.groupElement("maxDiscardRectangles"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxDiscardRectangles = LAYOUT.select(PathElement.groupElement("maxDiscardRectangles"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxDiscardRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDiscardRectangles"));

    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiscardRectanglePropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiscardRectanglePropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiscardRectanglePropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDiscardRectangles.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT); }
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDiscardRectangles.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT copyFrom(VkPhysicalDeviceDiscardRectanglePropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT at(long index, Consumer<VkPhysicalDeviceDiscardRectanglePropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxDiscardRectanglesAt(long index) { return (int) VH_maxDiscardRectangles.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxDiscardRectangles() { return (int) VH_maxDiscardRectangles.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT maxDiscardRectanglesAt(long index, int value) { VH_maxDiscardRectangles.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT maxDiscardRectangles(int value) { VH_maxDiscardRectangles.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxDiscardRectanglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDiscardRectangles, index), LAYOUT_maxDiscardRectangles); }
    public MemorySegment _maxDiscardRectangles() { return _maxDiscardRectanglesAt(0L); }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT _maxDiscardRectanglesAt(long index, MemorySegment src) { _maxDiscardRectanglesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT _maxDiscardRectangles(MemorySegment src) { return _maxDiscardRectanglesAt(0L, src); }
}
