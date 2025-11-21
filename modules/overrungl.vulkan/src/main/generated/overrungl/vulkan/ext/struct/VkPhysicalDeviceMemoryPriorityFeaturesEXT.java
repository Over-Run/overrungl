// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryPriorityFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryPriorityFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 memoryPriority;
/// }
/// ```
public final class VkPhysicalDeviceMemoryPriorityFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryPriority")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryPriority = LAYOUT.byteOffset(PathElement.groupElement("memoryPriority"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryPriority = LAYOUT.select(PathElement.groupElement("memoryPriority"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryPriority = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryPriority"));

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT); }
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT copyFrom(VkPhysicalDeviceMemoryPriorityFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMemoryPriorityFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryPriorityAt(long index) { return (int) VH_memoryPriority.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryPriority() { return (int) VH_memoryPriority.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT memoryPriorityAt(long index, int value) { VH_memoryPriority.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT memoryPriority(int value) { VH_memoryPriority.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryPriorityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryPriority, index), LAYOUT_memoryPriority); }
    public MemorySegment _memoryPriority() { return _memoryPriorityAt(0L); }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT _memoryPriorityAt(long index, MemorySegment src) { _memoryPriorityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT _memoryPriority(MemorySegment src) { return _memoryPriorityAt(0L, src); }
}
