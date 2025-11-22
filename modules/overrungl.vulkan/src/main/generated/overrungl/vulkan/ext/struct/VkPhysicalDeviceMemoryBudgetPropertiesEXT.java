// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize heapBudget[VK_MAX_MEMORY_HEAPS];
///     VkDeviceSize heapUsage[VK_MAX_MEMORY_HEAPS];
/// }
/// ```
public final class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapUsage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_heapBudget = LAYOUT.byteOffset(PathElement.groupElement("heapBudget"));
    public static final long OFFSET_heapUsage = LAYOUT.byteOffset(PathElement.groupElement("heapUsage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_heapBudget = LAYOUT.select(PathElement.groupElement("heapBudget"));
    public static final MemoryLayout LAYOUT_heapUsage = LAYOUT.select(PathElement.groupElement("heapUsage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_heapBudget = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapBudget"), PathElement.sequenceElement());
    public static final VarHandle VH_heapUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapUsage"), PathElement.sequenceElement());

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryBudget.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT); }
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryBudget.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT copyFrom(VkPhysicalDeviceMemoryBudgetPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT at(long index, Consumer<VkPhysicalDeviceMemoryBudgetPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long heapBudgetAt(long index, long index0) { return (long) VH_heapBudget.get(this.segment(), 0L, index, index0); }
    public long heapUsageAt(long index, long index0) { return (long) VH_heapUsage.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long heapBudget(long index0) { return (long) VH_heapBudget.get(this.segment(), 0L, 0L, index0); }
    public long heapUsage(long index0) { return (long) VH_heapUsage.get(this.segment(), 0L, 0L, index0); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudgetAt(long index, long index0, long value) { VH_heapBudget.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsageAt(long index, long index0, long value) { VH_heapUsage.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudget(long index0, long value) { VH_heapBudget.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsage(long index0, long value) { VH_heapUsage.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _heapBudgetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_heapBudget, index), LAYOUT_heapBudget); }
    public MemorySegment _heapBudget() { return _heapBudgetAt(0L); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _heapBudgetAt(long index, MemorySegment src) { _heapBudgetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _heapBudget(MemorySegment src) { return _heapBudgetAt(0L, src); }
    public MemorySegment _heapUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_heapUsage, index), LAYOUT_heapUsage); }
    public MemorySegment _heapUsage() { return _heapUsageAt(0L); }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _heapUsageAt(long index, MemorySegment src) { _heapUsageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT _heapUsage(MemorySegment src) { return _heapUsageAt(0L, src); }
}
