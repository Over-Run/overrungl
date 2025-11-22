// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkSampleCountFlags sampleLocationSampleCounts;
///     VkExtent2D maxSampleLocationGridSize;
///     float sampleLocationCoordinateRange[2];
///     uint32_t sampleLocationSubPixelBits;
///     VkBool32 variableSampleLocations;
/// }
/// ```
public final class VkPhysicalDeviceSampleLocationsPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationSampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("sampleLocationCoordinateRange"),
        ValueLayout.JAVA_INT.withName("sampleLocationSubPixelBits"),
        ValueLayout.JAVA_INT.withName("variableSampleLocations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sampleLocationSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationSampleCounts"));
    public static final long OFFSET_maxSampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
    public static final long OFFSET_sampleLocationCoordinateRange = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCoordinateRange"));
    public static final long OFFSET_sampleLocationSubPixelBits = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationSubPixelBits"));
    public static final long OFFSET_variableSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("variableSampleLocations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sampleLocationSampleCounts = LAYOUT.select(PathElement.groupElement("sampleLocationSampleCounts"));
    public static final MemoryLayout LAYOUT_maxSampleLocationGridSize = LAYOUT.select(PathElement.groupElement("maxSampleLocationGridSize"));
    public static final MemoryLayout LAYOUT_sampleLocationCoordinateRange = LAYOUT.select(PathElement.groupElement("sampleLocationCoordinateRange"));
    public static final MemoryLayout LAYOUT_sampleLocationSubPixelBits = LAYOUT.select(PathElement.groupElement("sampleLocationSubPixelBits"));
    public static final MemoryLayout LAYOUT_variableSampleLocations = LAYOUT.select(PathElement.groupElement("variableSampleLocations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleLocationSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationSampleCounts"));
    public static final VarHandle VH_maxSampleLocationGridSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleLocationGridSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxSampleLocationGridSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleLocationGridSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_sampleLocationCoordinateRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationCoordinateRange"), PathElement.sequenceElement());
    public static final VarHandle VH_sampleLocationSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationSubPixelBits"));
    public static final VarHandle VH_variableSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variableSampleLocations"));

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT); }
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT copyFrom(VkPhysicalDeviceSampleLocationsPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT at(long index, Consumer<VkPhysicalDeviceSampleLocationsPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sampleLocationSampleCountsAt(long index) { return (int) VH_sampleLocationSampleCounts.get(this.segment(), 0L, index); }
    public int maxSampleLocationGridSize$widthAt(long index) { return (int) VH_maxSampleLocationGridSize$width.get(this.segment(), 0L, index); }
    public int maxSampleLocationGridSize$heightAt(long index) { return (int) VH_maxSampleLocationGridSize$height.get(this.segment(), 0L, index); }
    public float sampleLocationCoordinateRangeAt(long index, long index0) { return (float) VH_sampleLocationCoordinateRange.get(this.segment(), 0L, index, index0); }
    public int sampleLocationSubPixelBitsAt(long index) { return (int) VH_sampleLocationSubPixelBits.get(this.segment(), 0L, index); }
    public int variableSampleLocationsAt(long index) { return (int) VH_variableSampleLocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sampleLocationSampleCounts() { return (int) VH_sampleLocationSampleCounts.get(this.segment(), 0L, 0L); }
    public int maxSampleLocationGridSize$width() { return (int) VH_maxSampleLocationGridSize$width.get(this.segment(), 0L, 0L); }
    public int maxSampleLocationGridSize$height() { return (int) VH_maxSampleLocationGridSize$height.get(this.segment(), 0L, 0L); }
    public float sampleLocationCoordinateRange(long index0) { return (float) VH_sampleLocationCoordinateRange.get(this.segment(), 0L, 0L, index0); }
    public int sampleLocationSubPixelBits() { return (int) VH_sampleLocationSubPixelBits.get(this.segment(), 0L, 0L); }
    public int variableSampleLocations() { return (int) VH_variableSampleLocations.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCountsAt(long index, int value) { VH_sampleLocationSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize$widthAt(long index, int value) { VH_maxSampleLocationGridSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize$heightAt(long index, int value) { VH_maxSampleLocationGridSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRangeAt(long index, long index0, float value) { VH_sampleLocationCoordinateRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBitsAt(long index, int value) { VH_sampleLocationSubPixelBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocationsAt(long index, int value) { VH_variableSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCounts(int value) { VH_sampleLocationSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize$width(int value) { VH_maxSampleLocationGridSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize$height(int value) { VH_maxSampleLocationGridSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRange(long index0, float value) { VH_sampleLocationCoordinateRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBits(int value) { VH_sampleLocationSubPixelBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocations(int value) { VH_variableSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sampleLocationSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationSampleCounts, index), LAYOUT_sampleLocationSampleCounts); }
    public MemorySegment _sampleLocationSampleCounts() { return _sampleLocationSampleCountsAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sampleLocationSampleCountsAt(long index, MemorySegment src) { _sampleLocationSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sampleLocationSampleCounts(MemorySegment src) { return _sampleLocationSampleCountsAt(0L, src); }
    public MemorySegment _maxSampleLocationGridSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), LAYOUT_maxSampleLocationGridSize); }
    public MemorySegment _maxSampleLocationGridSize() { return _maxSampleLocationGridSizeAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _maxSampleLocationGridSizeAt(long index, MemorySegment src) { _maxSampleLocationGridSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _maxSampleLocationGridSize(MemorySegment src) { return _maxSampleLocationGridSizeAt(0L, src); }
    public MemorySegment _sampleLocationCoordinateRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationCoordinateRange, index), LAYOUT_sampleLocationCoordinateRange); }
    public MemorySegment _sampleLocationCoordinateRange() { return _sampleLocationCoordinateRangeAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sampleLocationCoordinateRangeAt(long index, MemorySegment src) { _sampleLocationCoordinateRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sampleLocationCoordinateRange(MemorySegment src) { return _sampleLocationCoordinateRangeAt(0L, src); }
    public MemorySegment _sampleLocationSubPixelBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationSubPixelBits, index), LAYOUT_sampleLocationSubPixelBits); }
    public MemorySegment _sampleLocationSubPixelBits() { return _sampleLocationSubPixelBitsAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sampleLocationSubPixelBitsAt(long index, MemorySegment src) { _sampleLocationSubPixelBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _sampleLocationSubPixelBits(MemorySegment src) { return _sampleLocationSubPixelBitsAt(0L, src); }
    public MemorySegment _variableSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_variableSampleLocations, index), LAYOUT_variableSampleLocations); }
    public MemorySegment _variableSampleLocations() { return _variableSampleLocationsAt(0L); }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _variableSampleLocationsAt(long index, MemorySegment src) { _variableSampleLocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSampleLocationsPropertiesEXT _variableSampleLocations(MemorySegment src) { return _variableSampleLocationsAt(0L, src); }
}
