// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineSampleLocationsStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineSampleLocationsStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 sampleLocationsEnable;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// }
/// ```
public final class VkPipelineSampleLocationsStateCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsEnable"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sampleLocationsEnable = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsEnable"));
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sampleLocationsEnable = LAYOUT.select(PathElement.groupElement("sampleLocationsEnable"));
    public static final MemoryLayout LAYOUT_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleLocationsEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsEnable"));
    public static final VarHandle VH_sampleLocationsInfo$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sType"));
    public static final VarHandle VH_sampleLocationsInfo$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationsPerPixel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationsPerPixel"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationGridSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationGridSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationsCount"));
    public static final VarHandle VH_sampleLocationsInfo$pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("pSampleLocations"));

    public VkPipelineSampleLocationsStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineSampleLocationsStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT); }
    public static VkPipelineSampleLocationsStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineSampleLocationsStateCreateInfoEXT copyFrom(VkPipelineSampleLocationsStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT reinterpret(long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineSampleLocationsStateCreateInfoEXT asSlice(long index) { return new VkPipelineSampleLocationsStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineSampleLocationsStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineSampleLocationsStateCreateInfoEXT at(long index, Consumer<VkPipelineSampleLocationsStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sampleLocationsEnableAt(long index) { return (int) VH_sampleLocationsEnable.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sTypeAt(long index) { return (int) VH_sampleLocationsInfo$sType.get(this.segment(), 0L, index); }
    public MemorySegment sampleLocationsInfo$pNextAt(long index) { return (MemorySegment) VH_sampleLocationsInfo$pNext.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationsPerPixelAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationsPerPixel.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationGridSize$widthAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$width.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationGridSize$heightAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$height.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationsCountAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationsCount.get(this.segment(), 0L, index); }
    public MemorySegment sampleLocationsInfo$pSampleLocationsAt(long index) { return (MemorySegment) VH_sampleLocationsInfo$pSampleLocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sampleLocationsEnable() { return (int) VH_sampleLocationsEnable.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sType() { return (int) VH_sampleLocationsInfo$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment sampleLocationsInfo$pNext() { return (MemorySegment) VH_sampleLocationsInfo$pNext.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationsPerPixel() { return (int) VH_sampleLocationsInfo$sampleLocationsPerPixel.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationGridSize$width() { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$width.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationGridSize$height() { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$height.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationsCount() { return (int) VH_sampleLocationsInfo$sampleLocationsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment sampleLocationsInfo$pSampleLocations() { return (MemorySegment) VH_sampleLocationsInfo$pSampleLocations.get(this.segment(), 0L, 0L); }
    public VkPipelineSampleLocationsStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnableAt(long index, int value) { VH_sampleLocationsEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sTypeAt(long index, int value) { VH_sampleLocationsInfo$sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$pNextAt(long index, MemorySegment value) { VH_sampleLocationsInfo$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationsPerPixelAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationsPerPixel.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationGridSize$widthAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationGridSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationGridSize$heightAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationGridSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationsCountAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationsCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$pSampleLocationsAt(long index, MemorySegment value) { VH_sampleLocationsInfo$pSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnable(int value) { VH_sampleLocationsEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sType(int value) { VH_sampleLocationsInfo$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$pNext(MemorySegment value) { VH_sampleLocationsInfo$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationsPerPixel(int value) { VH_sampleLocationsInfo$sampleLocationsPerPixel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationGridSize$width(int value) { VH_sampleLocationsInfo$sampleLocationGridSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationGridSize$height(int value) { VH_sampleLocationsInfo$sampleLocationGridSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$sampleLocationsCount(int value) { VH_sampleLocationsInfo$sampleLocationsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo$pSampleLocations(MemorySegment value) { VH_sampleLocationsInfo$pSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineSampleLocationsStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineSampleLocationsStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sampleLocationsEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationsEnable, index), LAYOUT_sampleLocationsEnable); }
    public MemorySegment _sampleLocationsEnable() { return _sampleLocationsEnableAt(0L); }
    public VkPipelineSampleLocationsStateCreateInfoEXT _sampleLocationsEnableAt(long index, MemorySegment src) { _sampleLocationsEnableAt(index).copyFrom(src); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT _sampleLocationsEnable(MemorySegment src) { return _sampleLocationsEnableAt(0L, src); }
    public MemorySegment _sampleLocationsInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo); }
    public MemorySegment _sampleLocationsInfo() { return _sampleLocationsInfoAt(0L); }
    public VkPipelineSampleLocationsStateCreateInfoEXT _sampleLocationsInfoAt(long index, MemorySegment src) { _sampleLocationsInfoAt(index).copyFrom(src); return this; }
    public VkPipelineSampleLocationsStateCreateInfoEXT _sampleLocationsInfo(MemorySegment src) { return _sampleLocationsInfoAt(0L, src); }
}
