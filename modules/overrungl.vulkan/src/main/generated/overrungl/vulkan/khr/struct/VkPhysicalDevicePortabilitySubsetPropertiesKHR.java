// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePortabilitySubsetPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePortabilitySubsetPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t minVertexInputBindingStrideAlignment;
/// }
/// ```
public final class VkPhysicalDevicePortabilitySubsetPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minVertexInputBindingStrideAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minVertexInputBindingStrideAlignment = LAYOUT.byteOffset(PathElement.groupElement("minVertexInputBindingStrideAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minVertexInputBindingStrideAlignment = LAYOUT.select(PathElement.groupElement("minVertexInputBindingStrideAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minVertexInputBindingStrideAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minVertexInputBindingStrideAlignment"));

    public VkPhysicalDevicePortabilitySubsetPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES_KHR); }
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR copyFrom(VkPhysicalDevicePortabilitySubsetPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR reinterpret(long count) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR asSlice(long index) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR at(long index, Consumer<VkPhysicalDevicePortabilitySubsetPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minVertexInputBindingStrideAlignmentAt(long index) { return (int) VH_minVertexInputBindingStrideAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minVertexInputBindingStrideAlignment() { return (int) VH_minVertexInputBindingStrideAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR minVertexInputBindingStrideAlignmentAt(long index, int value) { VH_minVertexInputBindingStrideAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR minVertexInputBindingStrideAlignment(int value) { VH_minVertexInputBindingStrideAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minVertexInputBindingStrideAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minVertexInputBindingStrideAlignment, index), LAYOUT_minVertexInputBindingStrideAlignment); }
    public MemorySegment _minVertexInputBindingStrideAlignment() { return _minVertexInputBindingStrideAlignmentAt(0L); }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR _minVertexInputBindingStrideAlignmentAt(long index, MemorySegment src) { _minVertexInputBindingStrideAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR _minVertexInputBindingStrideAlignment(MemorySegment src) { return _minVertexInputBindingStrideAlignmentAt(0L, src); }
}
