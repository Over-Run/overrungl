// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 globalPriorityQuery;
/// }
/// ```
public final class VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriorityQuery")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_globalPriorityQuery = LAYOUT.byteOffset(PathElement.groupElement("globalPriorityQuery"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_globalPriorityQuery = LAYOUT.select(PathElement.groupElement("globalPriorityQuery"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_globalPriorityQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalPriorityQuery"));

    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES); }
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES);
        return s;
    }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT copyFrom(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT at(long index, Consumer<VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int globalPriorityQueryAt(long index) { return (int) VH_globalPriorityQuery.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int globalPriorityQuery() { return (int) VH_globalPriorityQuery.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT globalPriorityQueryAt(long index, int value) { VH_globalPriorityQuery.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT globalPriorityQuery(int value) { VH_globalPriorityQuery.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _globalPriorityQueryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_globalPriorityQuery, index), LAYOUT_globalPriorityQuery); }
    public MemorySegment _globalPriorityQuery() { return _globalPriorityQueryAt(0L); }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT _globalPriorityQueryAt(long index, MemorySegment src) { _globalPriorityQueryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT _globalPriorityQuery(MemorySegment src) { return _globalPriorityQueryAt(0L, src); }
}
