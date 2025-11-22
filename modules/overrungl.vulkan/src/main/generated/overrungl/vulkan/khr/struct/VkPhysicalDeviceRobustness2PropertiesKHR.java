// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRobustness2PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRobustness2PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize robustStorageBufferAccessSizeAlignment;
///     VkDeviceSize robustUniformBufferAccessSizeAlignment;
/// }
/// ```
public final class VkPhysicalDeviceRobustness2PropertiesKHR extends GroupType {
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

    public VkPhysicalDeviceRobustness2PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRobustness2PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR); }
    public static VkPhysicalDeviceRobustness2PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceRobustness2PropertiesKHR copyFrom(VkPhysicalDeviceRobustness2PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceRobustness2PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRobustness2PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceRobustness2PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRobustness2PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRobustness2PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRobustness2PropertiesKHR at(long index, Consumer<VkPhysicalDeviceRobustness2PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long robustStorageBufferAccessSizeAlignmentAt(long index) { return (long) VH_robustStorageBufferAccessSizeAlignment.get(this.segment(), 0L, index); }
    public long robustUniformBufferAccessSizeAlignmentAt(long index) { return (long) VH_robustUniformBufferAccessSizeAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long robustStorageBufferAccessSizeAlignment() { return (long) VH_robustStorageBufferAccessSizeAlignment.get(this.segment(), 0L, 0L); }
    public long robustUniformBufferAccessSizeAlignment() { return (long) VH_robustUniformBufferAccessSizeAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRobustness2PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR robustStorageBufferAccessSizeAlignmentAt(long index, long value) { VH_robustStorageBufferAccessSizeAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR robustUniformBufferAccessSizeAlignmentAt(long index, long value) { VH_robustUniformBufferAccessSizeAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR robustStorageBufferAccessSizeAlignment(long value) { VH_robustStorageBufferAccessSizeAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR robustUniformBufferAccessSizeAlignment(long value) { VH_robustUniformBufferAccessSizeAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _robustStorageBufferAccessSizeAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustStorageBufferAccessSizeAlignment, index), LAYOUT_robustStorageBufferAccessSizeAlignment); }
    public MemorySegment _robustStorageBufferAccessSizeAlignment() { return _robustStorageBufferAccessSizeAlignmentAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesKHR _robustStorageBufferAccessSizeAlignmentAt(long index, MemorySegment src) { _robustStorageBufferAccessSizeAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR _robustStorageBufferAccessSizeAlignment(MemorySegment src) { return _robustStorageBufferAccessSizeAlignmentAt(0L, src); }
    public MemorySegment _robustUniformBufferAccessSizeAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustUniformBufferAccessSizeAlignment, index), LAYOUT_robustUniformBufferAccessSizeAlignment); }
    public MemorySegment _robustUniformBufferAccessSizeAlignment() { return _robustUniformBufferAccessSizeAlignmentAt(0L); }
    public VkPhysicalDeviceRobustness2PropertiesKHR _robustUniformBufferAccessSizeAlignmentAt(long index, MemorySegment src) { _robustUniformBufferAccessSizeAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2PropertiesKHR _robustUniformBufferAccessSizeAlignment(MemorySegment src) { return _robustUniformBufferAccessSizeAlignmentAt(0L, src); }
}
