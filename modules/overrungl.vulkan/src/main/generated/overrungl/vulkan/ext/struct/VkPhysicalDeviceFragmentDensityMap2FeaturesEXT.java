// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMap2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMapDeferred;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMap2FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDeferred")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityMapDeferred = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapDeferred"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapDeferred = LAYOUT.select(PathElement.groupElement("fragmentDensityMapDeferred"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityMapDeferred = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapDeferred"));

    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT copyFrom(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMap2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityMapDeferredAt(long index) { return (int) VH_fragmentDensityMapDeferred.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapDeferred() { return (int) VH_fragmentDensityMapDeferred.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT fragmentDensityMapDeferredAt(long index, int value) { VH_fragmentDensityMapDeferred.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT fragmentDensityMapDeferred(int value) { VH_fragmentDensityMapDeferred.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityMapDeferredAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapDeferred, index), LAYOUT_fragmentDensityMapDeferred); }
    public MemorySegment _fragmentDensityMapDeferred() { return _fragmentDensityMapDeferredAt(0L); }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT _fragmentDensityMapDeferredAt(long index, MemorySegment src) { _fragmentDensityMapDeferredAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT _fragmentDensityMapDeferred(MemorySegment src) { return _fragmentDensityMapDeferredAt(0L, src); }
}
