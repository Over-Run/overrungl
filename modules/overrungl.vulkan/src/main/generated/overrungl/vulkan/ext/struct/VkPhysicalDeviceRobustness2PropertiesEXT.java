// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRobustness2PropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRobustness2PropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize robustStorageBufferAccessSizeAlignment;
///     VkDeviceSize robustUniformBufferAccessSizeAlignment;
/// }
/// ```
public final class VkPhysicalDeviceRobustness2PropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
        ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_robustStorageBufferAccessSizeAlignment = LAYOUT.byteOffset(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    public static final long OFFSET_robustUniformBufferAccessSizeAlignment = LAYOUT.byteOffset(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_robustStorageBufferAccessSizeAlignment = LAYOUT.select(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    public static final MemoryLayout LAYOUT_robustUniformBufferAccessSizeAlignment = LAYOUT.select(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_robustStorageBufferAccessSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    public static final VarHandle VH_robustUniformBufferAccessSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));

    public VkPhysicalDeviceRobustness2PropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2PropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRobustness2PropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR); }
    public static VkPhysicalDeviceRobustness2PropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceRobustness2PropertiesEXT copyFrom(VkPhysicalDeviceRobustness2PropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceRobustness2PropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRobustness2PropertiesEXT asSlice(long index) { return new VkPhysicalDeviceRobustness2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRobustness2PropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceRobustness2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRobustness2PropertiesEXT at(long index, Consumer<VkPhysicalDeviceRobustness2PropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long robustStorageBufferAccessSizeAlignmentAt(long index) { return (long) VH_robustStorageBufferAccessSizeAlignment.get(this.segment(), 0L, index); }
    public long robustUniformBufferAccessSizeAlignmentAt(long index) { return (long) VH_robustUniformBufferAccessSizeAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long robustStorageBufferAccessSizeAlignment() { return (long) VH_robustStorageBufferAccessSizeAlignment.get(this.segment(), 0L, 0L); }
    public long robustUniformBufferAccessSizeAlignment() { return (long) VH_robustUniformBufferAccessSizeAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRobustness2PropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT robustStorageBufferAccessSizeAlignmentAt(long index, long value) { VH_robustStorageBufferAccessSizeAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT robustUniformBufferAccessSizeAlignmentAt(long index, long value) { VH_robustUniformBufferAccessSizeAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT robustStorageBufferAccessSizeAlignment(long value) { VH_robustStorageBufferAccessSizeAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT robustUniformBufferAccessSizeAlignment(long value) { VH_robustUniformBufferAccessSizeAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _robustStorageBufferAccessSizeAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustStorageBufferAccessSizeAlignment, index), LAYOUT_robustStorageBufferAccessSizeAlignment); }
    public MemorySegment _robustStorageBufferAccessSizeAlignment() { return _robustStorageBufferAccessSizeAlignmentAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesEXT _robustStorageBufferAccessSizeAlignmentAt(long index, MemorySegment src) { _robustStorageBufferAccessSizeAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT _robustStorageBufferAccessSizeAlignment(MemorySegment src) { return _robustStorageBufferAccessSizeAlignmentAt(0L, src); }
    public MemorySegment _robustUniformBufferAccessSizeAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustUniformBufferAccessSizeAlignment, index), LAYOUT_robustUniformBufferAccessSizeAlignment); }
    public MemorySegment _robustUniformBufferAccessSizeAlignment() { return _robustUniformBufferAccessSizeAlignmentAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesEXT _robustUniformBufferAccessSizeAlignmentAt(long index, MemorySegment src) { _robustUniformBufferAccessSizeAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesEXT _robustUniformBufferAccessSizeAlignment(MemorySegment src) { return _robustUniformBufferAccessSizeAlignmentAt(0L, src); }
}
