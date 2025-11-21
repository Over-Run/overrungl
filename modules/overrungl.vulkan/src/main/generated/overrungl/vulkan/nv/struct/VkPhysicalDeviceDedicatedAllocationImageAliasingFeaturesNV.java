// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 dedicatedAllocationImageAliasing;
/// }
/// ```
public final class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dedicatedAllocationImageAliasing")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dedicatedAllocationImageAliasing = LAYOUT.byteOffset(PathElement.groupElement("dedicatedAllocationImageAliasing"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dedicatedAllocationImageAliasing = LAYOUT.select(PathElement.groupElement("dedicatedAllocationImageAliasing"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dedicatedAllocationImageAliasing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dedicatedAllocationImageAliasing"));

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDedicatedAllocationImageAliasing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV); }
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDedicatedAllocationImageAliasing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV copyFrom(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV at(long index, Consumer<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dedicatedAllocationImageAliasingAt(long index) { return (int) VH_dedicatedAllocationImageAliasing.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dedicatedAllocationImageAliasing() { return (int) VH_dedicatedAllocationImageAliasing.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasingAt(long index, int value) { VH_dedicatedAllocationImageAliasing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasing(int value) { VH_dedicatedAllocationImageAliasing.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dedicatedAllocationImageAliasingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dedicatedAllocationImageAliasing, index), LAYOUT_dedicatedAllocationImageAliasing); }
    public MemorySegment _dedicatedAllocationImageAliasing() { return _dedicatedAllocationImageAliasingAt(0L); }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV _dedicatedAllocationImageAliasingAt(long index, MemorySegment src) { _dedicatedAllocationImageAliasingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV _dedicatedAllocationImageAliasing(MemorySegment src) { return _dedicatedAllocationImageAliasingAt(0L, src); }
}
