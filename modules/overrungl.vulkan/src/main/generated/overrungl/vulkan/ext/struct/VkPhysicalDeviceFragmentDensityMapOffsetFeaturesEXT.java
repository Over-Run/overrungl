// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMapOffset;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityMapOffset = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapOffset = LAYOUT.select(PathElement.groupElement("fragmentDensityMapOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityMapOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapOffset"));

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityMapOffsetAt(long index) { return (int) VH_fragmentDensityMapOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapOffset() { return (int) VH_fragmentDensityMapOffset.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT fragmentDensityMapOffsetAt(long index, int value) { VH_fragmentDensityMapOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT fragmentDensityMapOffset(int value) { VH_fragmentDensityMapOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityMapOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapOffset, index), LAYOUT_fragmentDensityMapOffset); }
    public MemorySegment _fragmentDensityMapOffset() { return _fragmentDensityMapOffsetAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT _fragmentDensityMapOffsetAt(long index, MemorySegment src) { _fragmentDensityMapOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT _fragmentDensityMapOffset(MemorySegment src) { return _fragmentDensityMapOffsetAt(0L, src); }
}
