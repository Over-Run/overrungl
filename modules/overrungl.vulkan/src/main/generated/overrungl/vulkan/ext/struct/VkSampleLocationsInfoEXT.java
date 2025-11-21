// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSampleLocationsInfoEXT`.
/// ## Layout
/// ```
/// struct VkSampleLocationsInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSampleCountFlagBits sampleLocationsPerPixel;
///     VkExtent2D sampleLocationGridSize;
///     uint32_t sampleLocationsCount;
///     const VkSampleLocationEXT* pSampleLocations;
/// }
/// ```
public final class VkSampleLocationsInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsPerPixel"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("sampleLocationGridSize"),
        ValueLayout.JAVA_INT.withName("sampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pSampleLocations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sampleLocationsPerPixel = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsPerPixel"));
    public static final long OFFSET_sampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationGridSize"));
    public static final long OFFSET_sampleLocationsCount = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsCount"));
    public static final long OFFSET_pSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pSampleLocations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sampleLocationsPerPixel = LAYOUT.select(PathElement.groupElement("sampleLocationsPerPixel"));
    public static final MemoryLayout LAYOUT_sampleLocationGridSize = LAYOUT.select(PathElement.groupElement("sampleLocationGridSize"));
    public static final MemoryLayout LAYOUT_sampleLocationsCount = LAYOUT.select(PathElement.groupElement("sampleLocationsCount"));
    public static final MemoryLayout LAYOUT_pSampleLocations = LAYOUT.select(PathElement.groupElement("pSampleLocations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleLocationsPerPixel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsPerPixel"));
    public static final VarHandle VH_sampleLocationGridSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_sampleLocationGridSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_sampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsCount"));
    public static final VarHandle VH_pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleLocations"));

    public VkSampleLocationsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSampleLocationsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSampleLocationsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSampleLocationsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSampleLocationsInfoEXT alloc(SegmentAllocator allocator) { return new VkSampleLocationsInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSampleLocationsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSampleLocationsInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSampleLocationsInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT); }
    public static VkSampleLocationsInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT);
        return s;
    }
    public VkSampleLocationsInfoEXT copyFrom(VkSampleLocationsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSampleLocationsInfoEXT reinterpret(long count) { return new VkSampleLocationsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSampleLocationsInfoEXT asSlice(long index) { return new VkSampleLocationsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSampleLocationsInfoEXT asSlice(long index, long count) { return new VkSampleLocationsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSampleLocationsInfoEXT at(long index, Consumer<VkSampleLocationsInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sampleLocationsPerPixelAt(long index) { return (int) VH_sampleLocationsPerPixel.get(this.segment(), 0L, index); }
    public int sampleLocationGridSize$widthAt(long index) { return (int) VH_sampleLocationGridSize$width.get(this.segment(), 0L, index); }
    public int sampleLocationGridSize$heightAt(long index) { return (int) VH_sampleLocationGridSize$height.get(this.segment(), 0L, index); }
    public int sampleLocationsCountAt(long index) { return (int) VH_sampleLocationsCount.get(this.segment(), 0L, index); }
    public MemorySegment pSampleLocationsAt(long index) { return (MemorySegment) VH_pSampleLocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sampleLocationsPerPixel() { return (int) VH_sampleLocationsPerPixel.get(this.segment(), 0L, 0L); }
    public int sampleLocationGridSize$width() { return (int) VH_sampleLocationGridSize$width.get(this.segment(), 0L, 0L); }
    public int sampleLocationGridSize$height() { return (int) VH_sampleLocationGridSize$height.get(this.segment(), 0L, 0L); }
    public int sampleLocationsCount() { return (int) VH_sampleLocationsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSampleLocations() { return (MemorySegment) VH_pSampleLocations.get(this.segment(), 0L, 0L); }
    public VkSampleLocationsInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationsPerPixelAt(long index, int value) { VH_sampleLocationsPerPixel.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationGridSize$widthAt(long index, int value) { VH_sampleLocationGridSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationGridSize$heightAt(long index, int value) { VH_sampleLocationGridSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationsCountAt(long index, int value) { VH_sampleLocationsCount.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT pSampleLocationsAt(long index, MemorySegment value) { VH_pSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationsInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationsInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationsPerPixel(int value) { VH_sampleLocationsPerPixel.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationGridSize$width(int value) { VH_sampleLocationGridSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationGridSize$height(int value) { VH_sampleLocationGridSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationsInfoEXT sampleLocationsCount(int value) { VH_sampleLocationsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationsInfoEXT pSampleLocations(MemorySegment value) { VH_pSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSampleLocationsInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSampleLocationsInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSampleLocationsInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSampleLocationsInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sampleLocationsPerPixelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationsPerPixel, index), LAYOUT_sampleLocationsPerPixel); }
    public MemorySegment _sampleLocationsPerPixel() { return _sampleLocationsPerPixelAt(0L); }
    public VkSampleLocationsInfoEXT _sampleLocationsPerPixelAt(long index, MemorySegment src) { _sampleLocationsPerPixelAt(index).copyFrom(src); return this; }
    public VkSampleLocationsInfoEXT _sampleLocationsPerPixel(MemorySegment src) { return _sampleLocationsPerPixelAt(0L, src); }
    public MemorySegment _sampleLocationGridSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationGridSize, index), LAYOUT_sampleLocationGridSize); }
    public MemorySegment _sampleLocationGridSize() { return _sampleLocationGridSizeAt(0L); }
    public VkSampleLocationsInfoEXT _sampleLocationGridSizeAt(long index, MemorySegment src) { _sampleLocationGridSizeAt(index).copyFrom(src); return this; }
    public VkSampleLocationsInfoEXT _sampleLocationGridSize(MemorySegment src) { return _sampleLocationGridSizeAt(0L, src); }
    public MemorySegment _sampleLocationsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationsCount, index), LAYOUT_sampleLocationsCount); }
    public MemorySegment _sampleLocationsCount() { return _sampleLocationsCountAt(0L); }
    public VkSampleLocationsInfoEXT _sampleLocationsCountAt(long index, MemorySegment src) { _sampleLocationsCountAt(index).copyFrom(src); return this; }
    public VkSampleLocationsInfoEXT _sampleLocationsCount(MemorySegment src) { return _sampleLocationsCountAt(0L, src); }
    public MemorySegment _pSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSampleLocations, index), LAYOUT_pSampleLocations); }
    public MemorySegment _pSampleLocations() { return _pSampleLocationsAt(0L); }
    public VkSampleLocationsInfoEXT _pSampleLocationsAt(long index, MemorySegment src) { _pSampleLocationsAt(index).copyFrom(src); return this; }
    public VkSampleLocationsInfoEXT _pSampleLocations(MemorySegment src) { return _pSampleLocationsAt(0L, src); }
}
