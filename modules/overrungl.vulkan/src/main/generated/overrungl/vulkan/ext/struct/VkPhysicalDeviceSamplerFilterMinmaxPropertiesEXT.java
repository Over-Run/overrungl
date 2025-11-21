// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 filterMinmaxSingleComponentFormats;
///     VkBool32 filterMinmaxImageComponentMapping;
/// }
/// ```
public final class VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
        ValueLayout.JAVA_INT.withName("filterMinmaxImageComponentMapping")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_filterMinmaxSingleComponentFormats = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    public static final long OFFSET_filterMinmaxImageComponentMapping = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_filterMinmaxSingleComponentFormats = LAYOUT.select(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    public static final MemoryLayout LAYOUT_filterMinmaxImageComponentMapping = LAYOUT.select(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_filterMinmaxSingleComponentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    public static final VarHandle VH_filterMinmaxImageComponentMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));

    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES); }
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT copyFrom(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT at(long index, Consumer<VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int filterMinmaxSingleComponentFormatsAt(long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(this.segment(), 0L, index); }
    public int filterMinmaxImageComponentMappingAt(long index) { return (int) VH_filterMinmaxImageComponentMapping.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int filterMinmaxSingleComponentFormats() { return (int) VH_filterMinmaxSingleComponentFormats.get(this.segment(), 0L, 0L); }
    public int filterMinmaxImageComponentMapping() { return (int) VH_filterMinmaxImageComponentMapping.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT filterMinmaxSingleComponentFormatsAt(long index, int value) { VH_filterMinmaxSingleComponentFormats.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT filterMinmaxImageComponentMappingAt(long index, int value) { VH_filterMinmaxImageComponentMapping.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT filterMinmaxSingleComponentFormats(int value) { VH_filterMinmaxSingleComponentFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT filterMinmaxImageComponentMapping(int value) { VH_filterMinmaxImageComponentMapping.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _filterMinmaxSingleComponentFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterMinmaxSingleComponentFormats, index), LAYOUT_filterMinmaxSingleComponentFormats); }
    public MemorySegment _filterMinmaxSingleComponentFormats() { return _filterMinmaxSingleComponentFormatsAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _filterMinmaxSingleComponentFormatsAt(long index, MemorySegment src) { _filterMinmaxSingleComponentFormatsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _filterMinmaxSingleComponentFormats(MemorySegment src) { return _filterMinmaxSingleComponentFormatsAt(0L, src); }
    public MemorySegment _filterMinmaxImageComponentMappingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterMinmaxImageComponentMapping, index), LAYOUT_filterMinmaxImageComponentMapping); }
    public MemorySegment _filterMinmaxImageComponentMapping() { return _filterMinmaxImageComponentMappingAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _filterMinmaxImageComponentMappingAt(long index, MemorySegment src) { _filterMinmaxImageComponentMappingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT _filterMinmaxImageComponentMapping(MemorySegment src) { return _filterMinmaxImageComponentMappingAt(0L, src); }
}
