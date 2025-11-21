// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassSampleLocationsEXT`.
/// ## Layout
/// ```
/// struct VkSubpassSampleLocationsEXT {
///     uint32_t subpassIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// }
/// ```
public final class VkSubpassSampleLocationsEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpassIndex"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long OFFSET_subpassIndex = LAYOUT.byteOffset(PathElement.groupElement("subpassIndex"));
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    public static final MemoryLayout LAYOUT_subpassIndex = LAYOUT.select(PathElement.groupElement("subpassIndex"));
    public static final MemoryLayout LAYOUT_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));
    public static final VarHandle VH_subpassIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassIndex"));
    public static final VarHandle VH_sampleLocationsInfo$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sType"));
    public static final VarHandle VH_sampleLocationsInfo$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationsPerPixel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationsPerPixel"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationGridSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationGridSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationsCount"));
    public static final VarHandle VH_sampleLocationsInfo$pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("pSampleLocations"));

    public VkSubpassSampleLocationsEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassSampleLocationsEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassSampleLocationsEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassSampleLocationsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassSampleLocationsEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassSampleLocationsEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassSampleLocationsEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassSampleLocationsEXT alloc(SegmentAllocator allocator) { return new VkSubpassSampleLocationsEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassSampleLocationsEXT alloc(SegmentAllocator allocator, long count) { return new VkSubpassSampleLocationsEXT(allocator.allocate(LAYOUT, count), count); }
    public VkSubpassSampleLocationsEXT copyFrom(VkSubpassSampleLocationsEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassSampleLocationsEXT reinterpret(long count) { return new VkSubpassSampleLocationsEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassSampleLocationsEXT asSlice(long index) { return new VkSubpassSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassSampleLocationsEXT asSlice(long index, long count) { return new VkSubpassSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassSampleLocationsEXT at(long index, Consumer<VkSubpassSampleLocationsEXT> func) { func.accept(asSlice(index)); return this; }
    public int subpassIndexAt(long index) { return (int) VH_subpassIndex.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sTypeAt(long index) { return (int) VH_sampleLocationsInfo$sType.get(this.segment(), 0L, index); }
    public MemorySegment sampleLocationsInfo$pNextAt(long index) { return (MemorySegment) VH_sampleLocationsInfo$pNext.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationsPerPixelAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationsPerPixel.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationGridSize$widthAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$width.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationGridSize$heightAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$height.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationsCountAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationsCount.get(this.segment(), 0L, index); }
    public MemorySegment sampleLocationsInfo$pSampleLocationsAt(long index) { return (MemorySegment) VH_sampleLocationsInfo$pSampleLocations.get(this.segment(), 0L, index); }
    public int subpassIndex() { return (int) VH_subpassIndex.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sType() { return (int) VH_sampleLocationsInfo$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment sampleLocationsInfo$pNext() { return (MemorySegment) VH_sampleLocationsInfo$pNext.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationsPerPixel() { return (int) VH_sampleLocationsInfo$sampleLocationsPerPixel.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationGridSize$width() { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$width.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationGridSize$height() { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$height.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationsCount() { return (int) VH_sampleLocationsInfo$sampleLocationsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment sampleLocationsInfo$pSampleLocations() { return (MemorySegment) VH_sampleLocationsInfo$pSampleLocations.get(this.segment(), 0L, 0L); }
    public VkSubpassSampleLocationsEXT subpassIndexAt(long index, int value) { VH_subpassIndex.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sTypeAt(long index, int value) { VH_sampleLocationsInfo$sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$pNextAt(long index, MemorySegment value) { VH_sampleLocationsInfo$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationsPerPixelAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationsPerPixel.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$widthAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationGridSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$heightAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationGridSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationsCountAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationsCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$pSampleLocationsAt(long index, MemorySegment value) { VH_sampleLocationsInfo$pSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassSampleLocationsEXT subpassIndex(int value) { VH_subpassIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sType(int value) { VH_sampleLocationsInfo$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$pNext(MemorySegment value) { VH_sampleLocationsInfo$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationsPerPixel(int value) { VH_sampleLocationsInfo$sampleLocationsPerPixel.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$width(int value) { VH_sampleLocationsInfo$sampleLocationGridSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$height(int value) { VH_sampleLocationsInfo$sampleLocationGridSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$sampleLocationsCount(int value) { VH_sampleLocationsInfo$sampleLocationsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassSampleLocationsEXT sampleLocationsInfo$pSampleLocations(MemorySegment value) { VH_sampleLocationsInfo$pSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _subpassIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpassIndex, index), LAYOUT_subpassIndex); }
    public MemorySegment _subpassIndex() { return _subpassIndexAt(0L); }
    public VkSubpassSampleLocationsEXT _subpassIndexAt(long index, MemorySegment src) { _subpassIndexAt(index).copyFrom(src); return this; }
    public VkSubpassSampleLocationsEXT _subpassIndex(MemorySegment src) { return _subpassIndexAt(0L, src); }
    public MemorySegment _sampleLocationsInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo); }
    public MemorySegment _sampleLocationsInfo() { return _sampleLocationsInfoAt(0L); }
    public VkSubpassSampleLocationsEXT _sampleLocationsInfoAt(long index, MemorySegment src) { _sampleLocationsInfoAt(index).copyFrom(src); return this; }
    public VkSubpassSampleLocationsEXT _sampleLocationsInfo(MemorySegment src) { return _sampleLocationsInfoAt(0L, src); }
}
