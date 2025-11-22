// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D fragmentDensityOffsetGranularity;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentDensityOffsetGranularity")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityOffsetGranularity = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityOffsetGranularity"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityOffsetGranularity = LAYOUT.select(PathElement.groupElement("fragmentDensityOffsetGranularity"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityOffsetGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityOffsetGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_fragmentDensityOffsetGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityOffsetGranularity"), PathElement.groupElement("height"));

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityOffsetGranularity$widthAt(long index) { return (int) VH_fragmentDensityOffsetGranularity$width.get(this.segment(), 0L, index); }
    public int fragmentDensityOffsetGranularity$heightAt(long index) { return (int) VH_fragmentDensityOffsetGranularity$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityOffsetGranularity$width() { return (int) VH_fragmentDensityOffsetGranularity$width.get(this.segment(), 0L, 0L); }
    public int fragmentDensityOffsetGranularity$height() { return (int) VH_fragmentDensityOffsetGranularity$height.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT fragmentDensityOffsetGranularity$widthAt(long index, int value) { VH_fragmentDensityOffsetGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT fragmentDensityOffsetGranularity$heightAt(long index, int value) { VH_fragmentDensityOffsetGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT fragmentDensityOffsetGranularity$width(int value) { VH_fragmentDensityOffsetGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT fragmentDensityOffsetGranularity$height(int value) { VH_fragmentDensityOffsetGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityOffsetGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityOffsetGranularity, index), LAYOUT_fragmentDensityOffsetGranularity); }
    public MemorySegment _fragmentDensityOffsetGranularity() { return _fragmentDensityOffsetGranularityAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT _fragmentDensityOffsetGranularityAt(long index, MemorySegment src) { _fragmentDensityOffsetGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT _fragmentDensityOffsetGranularity(MemorySegment src) { return _fragmentDensityOffsetGranularityAt(0L, src); }
}
