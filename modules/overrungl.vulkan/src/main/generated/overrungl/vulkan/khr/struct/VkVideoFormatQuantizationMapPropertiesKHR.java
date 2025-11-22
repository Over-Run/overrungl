// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoFormatQuantizationMapPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatQuantizationMapPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D quantizationMapTexelSize;
/// }
/// ```
public final class VkVideoFormatQuantizationMapPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapTexelSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_quantizationMapTexelSize = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapTexelSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_quantizationMapTexelSize = LAYOUT.select(PathElement.groupElement("quantizationMapTexelSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_quantizationMapTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMapTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_quantizationMapTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMapTexelSize"), PathElement.groupElement("height"));

    public VkVideoFormatQuantizationMapPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoFormatQuantizationMapPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatQuantizationMapPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoFormatQuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatQuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoFormatQuantizationMapPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatQuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoFormatQuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatQuantizationMapPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoFormatQuantizationMapPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatQuantizationMapPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoFormatQuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR); }
    public static VkVideoFormatQuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR);
        return s;
    }
    public VkVideoFormatQuantizationMapPropertiesKHR copyFrom(VkVideoFormatQuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR reinterpret(long count) { return new VkVideoFormatQuantizationMapPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoFormatQuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatQuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoFormatQuantizationMapPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatQuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoFormatQuantizationMapPropertiesKHR at(long index, Consumer<VkVideoFormatQuantizationMapPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int quantizationMapTexelSize$widthAt(long index) { return (int) VH_quantizationMapTexelSize$width.get(this.segment(), 0L, index); }
    public int quantizationMapTexelSize$heightAt(long index) { return (int) VH_quantizationMapTexelSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int quantizationMapTexelSize$width() { return (int) VH_quantizationMapTexelSize$width.get(this.segment(), 0L, 0L); }
    public int quantizationMapTexelSize$height() { return (int) VH_quantizationMapTexelSize$height.get(this.segment(), 0L, 0L); }
    public VkVideoFormatQuantizationMapPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR quantizationMapTexelSize$widthAt(long index, int value) { VH_quantizationMapTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR quantizationMapTexelSize$heightAt(long index, int value) { VH_quantizationMapTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR quantizationMapTexelSize$width(int value) { VH_quantizationMapTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR quantizationMapTexelSize$height(int value) { VH_quantizationMapTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoFormatQuantizationMapPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoFormatQuantizationMapPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _quantizationMapTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), LAYOUT_quantizationMapTexelSize); }
    public MemorySegment _quantizationMapTexelSize() { return _quantizationMapTexelSizeAt(0L); }
    public VkVideoFormatQuantizationMapPropertiesKHR _quantizationMapTexelSizeAt(long index, MemorySegment src) { _quantizationMapTexelSizeAt(index).copyFrom(src); return this; }
    public VkVideoFormatQuantizationMapPropertiesKHR _quantizationMapTexelSize(MemorySegment src) { return _quantizationMapTexelSizeAt(0L, src); }
}
