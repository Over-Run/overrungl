// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewSampleWeightCreateInfoQCOM`.
/// ## Layout
/// ```
/// struct VkImageViewSampleWeightCreateInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkOffset2D filterCenter;
///     VkExtent2D filterSize;
///     uint32_t numPhases;
/// }
/// ```
public final class VkImageViewSampleWeightCreateInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("filterCenter"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("filterSize"),
        ValueLayout.JAVA_INT.withName("numPhases")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_filterCenter = LAYOUT.byteOffset(PathElement.groupElement("filterCenter"));
    public static final long OFFSET_filterSize = LAYOUT.byteOffset(PathElement.groupElement("filterSize"));
    public static final long OFFSET_numPhases = LAYOUT.byteOffset(PathElement.groupElement("numPhases"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_filterCenter = LAYOUT.select(PathElement.groupElement("filterCenter"));
    public static final MemoryLayout LAYOUT_filterSize = LAYOUT.select(PathElement.groupElement("filterSize"));
    public static final MemoryLayout LAYOUT_numPhases = LAYOUT.select(PathElement.groupElement("numPhases"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_filterCenter$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCenter"), PathElement.groupElement("x"));
    public static final VarHandle VH_filterCenter$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCenter"), PathElement.groupElement("y"));
    public static final VarHandle VH_filterSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_filterSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_numPhases = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhases"));

    public VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewSampleWeightCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSampleWeightCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewSampleWeightCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSampleWeightCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewSampleWeightCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSampleWeightCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewSampleWeightCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkImageViewSampleWeightCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewSampleWeightCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkImageViewSampleWeightCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewSampleWeightCreateInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMImageProcessing.VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM); }
    public static VkImageViewSampleWeightCreateInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMImageProcessing.VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM);
        return s;
    }
    public VkImageViewSampleWeightCreateInfoQCOM copyFrom(VkImageViewSampleWeightCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM reinterpret(long count) { return new VkImageViewSampleWeightCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewSampleWeightCreateInfoQCOM asSlice(long index) { return new VkImageViewSampleWeightCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewSampleWeightCreateInfoQCOM asSlice(long index, long count) { return new VkImageViewSampleWeightCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewSampleWeightCreateInfoQCOM at(long index, Consumer<VkImageViewSampleWeightCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int filterCenter$xAt(long index) { return (int) VH_filterCenter$x.get(this.segment(), 0L, index); }
    public int filterCenter$yAt(long index) { return (int) VH_filterCenter$y.get(this.segment(), 0L, index); }
    public int filterSize$widthAt(long index) { return (int) VH_filterSize$width.get(this.segment(), 0L, index); }
    public int filterSize$heightAt(long index) { return (int) VH_filterSize$height.get(this.segment(), 0L, index); }
    public int numPhasesAt(long index) { return (int) VH_numPhases.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int filterCenter$x() { return (int) VH_filterCenter$x.get(this.segment(), 0L, 0L); }
    public int filterCenter$y() { return (int) VH_filterCenter$y.get(this.segment(), 0L, 0L); }
    public int filterSize$width() { return (int) VH_filterSize$width.get(this.segment(), 0L, 0L); }
    public int filterSize$height() { return (int) VH_filterSize$height.get(this.segment(), 0L, 0L); }
    public int numPhases() { return (int) VH_numPhases.get(this.segment(), 0L, 0L); }
    public VkImageViewSampleWeightCreateInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter$xAt(long index, int value) { VH_filterCenter$x.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter$yAt(long index, int value) { VH_filterCenter$y.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterSize$widthAt(long index, int value) { VH_filterSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterSize$heightAt(long index, int value) { VH_filterSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM numPhasesAt(long index, int value) { VH_numPhases.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter$x(int value) { VH_filterCenter$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter$y(int value) { VH_filterCenter$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterSize$width(int value) { VH_filterSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM filterSize$height(int value) { VH_filterSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM numPhases(int value) { VH_numPhases.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewSampleWeightCreateInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewSampleWeightCreateInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _filterCenterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterCenter, index), LAYOUT_filterCenter); }
    public MemorySegment _filterCenter() { return _filterCenterAt(0L); }
    public VkImageViewSampleWeightCreateInfoQCOM _filterCenterAt(long index, MemorySegment src) { _filterCenterAt(index).copyFrom(src); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM _filterCenter(MemorySegment src) { return _filterCenterAt(0L, src); }
    public MemorySegment _filterSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterSize, index), LAYOUT_filterSize); }
    public MemorySegment _filterSize() { return _filterSizeAt(0L); }
    public VkImageViewSampleWeightCreateInfoQCOM _filterSizeAt(long index, MemorySegment src) { _filterSizeAt(index).copyFrom(src); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM _filterSize(MemorySegment src) { return _filterSizeAt(0L, src); }
    public MemorySegment _numPhasesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numPhases, index), LAYOUT_numPhases); }
    public MemorySegment _numPhases() { return _numPhasesAt(0L); }
    public VkImageViewSampleWeightCreateInfoQCOM _numPhasesAt(long index, MemorySegment src) { _numPhasesAt(index).copyFrom(src); return this; }
    public VkImageViewSampleWeightCreateInfoQCOM _numPhases(MemorySegment src) { return _numPhasesAt(0L, src); }
}
