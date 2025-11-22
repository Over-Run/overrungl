// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeQuantizationMapInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQuantizationMapInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView quantizationMap;
///     VkExtent2D quantizationMapExtent;
/// }
/// ```
public final class VkVideoEncodeQuantizationMapInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("quantizationMap"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_quantizationMap = LAYOUT.byteOffset(PathElement.groupElement("quantizationMap"));
    public static final long OFFSET_quantizationMapExtent = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_quantizationMap = LAYOUT.select(PathElement.groupElement("quantizationMap"));
    public static final MemoryLayout LAYOUT_quantizationMapExtent = LAYOUT.select(PathElement.groupElement("quantizationMapExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_quantizationMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMap"));
    public static final VarHandle VH_quantizationMapExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMapExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_quantizationMapExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMapExtent"), PathElement.groupElement("height"));

    public VkVideoEncodeQuantizationMapInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeQuantizationMapInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeQuantizationMapInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeQuantizationMapInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeQuantizationMapInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeQuantizationMapInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeQuantizationMapInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR); }
    public static VkVideoEncodeQuantizationMapInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR);
        return s;
    }
    public VkVideoEncodeQuantizationMapInfoKHR copyFrom(VkVideoEncodeQuantizationMapInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR reinterpret(long count) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeQuantizationMapInfoKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeQuantizationMapInfoKHR asSlice(long index, long count) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeQuantizationMapInfoKHR at(long index, Consumer<VkVideoEncodeQuantizationMapInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long quantizationMapAt(long index) { return (long) VH_quantizationMap.get(this.segment(), 0L, index); }
    public int quantizationMapExtent$widthAt(long index) { return (int) VH_quantizationMapExtent$width.get(this.segment(), 0L, index); }
    public int quantizationMapExtent$heightAt(long index) { return (int) VH_quantizationMapExtent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long quantizationMap() { return (long) VH_quantizationMap.get(this.segment(), 0L, 0L); }
    public int quantizationMapExtent$width() { return (int) VH_quantizationMapExtent$width.get(this.segment(), 0L, 0L); }
    public int quantizationMapExtent$height() { return (int) VH_quantizationMapExtent$height.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeQuantizationMapInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapAt(long index, long value) { VH_quantizationMap.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent$widthAt(long index, int value) { VH_quantizationMapExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent$heightAt(long index, int value) { VH_quantizationMapExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(long value) { VH_quantizationMap.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent$width(int value) { VH_quantizationMapExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent$height(int value) { VH_quantizationMapExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeQuantizationMapInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeQuantizationMapInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _quantizationMapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quantizationMap, index), LAYOUT_quantizationMap); }
    public MemorySegment _quantizationMap() { return _quantizationMapAt(0L); }
    public VkVideoEncodeQuantizationMapInfoKHR _quantizationMapAt(long index, MemorySegment src) { _quantizationMapAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR _quantizationMap(MemorySegment src) { return _quantizationMapAt(0L, src); }
    public MemorySegment _quantizationMapExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quantizationMapExtent, index), LAYOUT_quantizationMapExtent); }
    public MemorySegment _quantizationMapExtent() { return _quantizationMapExtentAt(0L); }
    public VkVideoEncodeQuantizationMapInfoKHR _quantizationMapExtentAt(long index, MemorySegment src) { _quantizationMapExtentAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapInfoKHR _quantizationMapExtent(MemorySegment src) { return _quantizationMapExtentAt(0L, src); }
}
