// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pageableDeviceLocalMemory;
/// }
/// ```
public final class VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pageableDeviceLocalMemory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pageableDeviceLocalMemory = LAYOUT.byteOffset(PathElement.groupElement("pageableDeviceLocalMemory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pageableDeviceLocalMemory = LAYOUT.select(PathElement.groupElement("pageableDeviceLocalMemory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pageableDeviceLocalMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pageableDeviceLocalMemory"));

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT); }
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT copyFrom(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT at(long index, Consumer<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pageableDeviceLocalMemoryAt(long index) { return (int) VH_pageableDeviceLocalMemory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pageableDeviceLocalMemory() { return (int) VH_pageableDeviceLocalMemory.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pageableDeviceLocalMemoryAt(long index, int value) { VH_pageableDeviceLocalMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pageableDeviceLocalMemory(int value) { VH_pageableDeviceLocalMemory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pageableDeviceLocalMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pageableDeviceLocalMemory, index), LAYOUT_pageableDeviceLocalMemory); }
    public MemorySegment _pageableDeviceLocalMemory() { return _pageableDeviceLocalMemoryAt(0L); }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT _pageableDeviceLocalMemoryAt(long index, MemorySegment src) { _pageableDeviceLocalMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT _pageableDeviceLocalMemory(MemorySegment src) { return _pageableDeviceLocalMemoryAt(0L, src); }
}
