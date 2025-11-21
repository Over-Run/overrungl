// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkExtent2D quantizationMapTexelSize;
/// }
/// ```
public final class VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR extends GroupType {
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

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR copyFrom(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR at(long index, Consumer<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int quantizationMapTexelSize$widthAt(long index) { return (int) VH_quantizationMapTexelSize$width.get(this.segment(), 0L, index); }
    public int quantizationMapTexelSize$heightAt(long index) { return (int) VH_quantizationMapTexelSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int quantizationMapTexelSize$width() { return (int) VH_quantizationMapTexelSize$width.get(this.segment(), 0L, 0L); }
    public int quantizationMapTexelSize$height() { return (int) VH_quantizationMapTexelSize$height.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize$widthAt(long index, int value) { VH_quantizationMapTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize$heightAt(long index, int value) { VH_quantizationMapTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize$width(int value) { VH_quantizationMapTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize$height(int value) { VH_quantizationMapTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _quantizationMapTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), LAYOUT_quantizationMapTexelSize); }
    public MemorySegment _quantizationMapTexelSize() { return _quantizationMapTexelSizeAt(0L); }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR _quantizationMapTexelSizeAt(long index, MemorySegment src) { _quantizationMapTexelSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR _quantizationMapTexelSize(MemorySegment src) { return _quantizationMapTexelSizeAt(0L, src); }
}
