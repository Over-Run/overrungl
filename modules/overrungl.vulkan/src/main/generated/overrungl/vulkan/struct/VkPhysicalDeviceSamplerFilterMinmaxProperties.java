// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 filterMinmaxSingleComponentFormats;
///     VkBool32 filterMinmaxImageComponentMapping;
/// }
/// ```
public final class VkPhysicalDeviceSamplerFilterMinmaxProperties extends GroupType {
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

    public VkPhysicalDeviceSamplerFilterMinmaxProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES); }
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties copyFrom(VkPhysicalDeviceSamplerFilterMinmaxProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties reinterpret(long count) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties asSlice(long index) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties asSlice(long index, long count) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties at(long index, Consumer<VkPhysicalDeviceSamplerFilterMinmaxProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int filterMinmaxSingleComponentFormatsAt(long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(this.segment(), 0L, index); }
    public int filterMinmaxImageComponentMappingAt(long index) { return (int) VH_filterMinmaxImageComponentMapping.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int filterMinmaxSingleComponentFormats() { return (int) VH_filterMinmaxSingleComponentFormats.get(this.segment(), 0L, 0L); }
    public int filterMinmaxImageComponentMapping() { return (int) VH_filterMinmaxImageComponentMapping.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxSingleComponentFormatsAt(long index, int value) { VH_filterMinmaxSingleComponentFormats.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxImageComponentMappingAt(long index, int value) { VH_filterMinmaxImageComponentMapping.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxSingleComponentFormats(int value) { VH_filterMinmaxSingleComponentFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxImageComponentMapping(int value) { VH_filterMinmaxImageComponentMapping.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _filterMinmaxSingleComponentFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterMinmaxSingleComponentFormats, index), LAYOUT_filterMinmaxSingleComponentFormats); }
    public MemorySegment _filterMinmaxSingleComponentFormats() { return _filterMinmaxSingleComponentFormatsAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _filterMinmaxSingleComponentFormatsAt(long index, MemorySegment src) { _filterMinmaxSingleComponentFormatsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _filterMinmaxSingleComponentFormats(MemorySegment src) { return _filterMinmaxSingleComponentFormatsAt(0L, src); }
    public MemorySegment _filterMinmaxImageComponentMappingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterMinmaxImageComponentMapping, index), LAYOUT_filterMinmaxImageComponentMapping); }
    public MemorySegment _filterMinmaxImageComponentMapping() { return _filterMinmaxImageComponentMappingAt(0L); }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _filterMinmaxImageComponentMappingAt(long index, MemorySegment src) { _filterMinmaxImageComponentMappingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerFilterMinmaxProperties _filterMinmaxImageComponentMapping(MemorySegment src) { return _filterMinmaxImageComponentMappingAt(0L, src); }
}
