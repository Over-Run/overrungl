// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeQuantizationMapCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQuantizationMapCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D maxQuantizationMapExtent;
/// }
/// ```
public final class VkVideoEncodeQuantizationMapCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxQuantizationMapExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxQuantizationMapExtent = LAYOUT.byteOffset(PathElement.groupElement("maxQuantizationMapExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxQuantizationMapExtent = LAYOUT.select(PathElement.groupElement("maxQuantizationMapExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxQuantizationMapExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQuantizationMapExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxQuantizationMapExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQuantizationMapExtent"), PathElement.groupElement("height"));

    public VkVideoEncodeQuantizationMapCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_CAPABILITIES_KHR); }
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR copyFrom(VkVideoEncodeQuantizationMapCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR at(long index, Consumer<VkVideoEncodeQuantizationMapCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxQuantizationMapExtent$widthAt(long index) { return (int) VH_maxQuantizationMapExtent$width.get(this.segment(), 0L, index); }
    public int maxQuantizationMapExtent$heightAt(long index) { return (int) VH_maxQuantizationMapExtent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxQuantizationMapExtent$width() { return (int) VH_maxQuantizationMapExtent$width.get(this.segment(), 0L, 0L); }
    public int maxQuantizationMapExtent$height() { return (int) VH_maxQuantizationMapExtent$height.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent$widthAt(long index, int value) { VH_maxQuantizationMapExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent$heightAt(long index, int value) { VH_maxQuantizationMapExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent$width(int value) { VH_maxQuantizationMapExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent$height(int value) { VH_maxQuantizationMapExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxQuantizationMapExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQuantizationMapExtent, index), LAYOUT_maxQuantizationMapExtent); }
    public MemorySegment _maxQuantizationMapExtent() { return _maxQuantizationMapExtentAt(0L); }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR _maxQuantizationMapExtentAt(long index, MemorySegment src) { _maxQuantizationMapExtentAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQuantizationMapCapabilitiesKHR _maxQuantizationMapExtent(MemorySegment src) { return _maxQuantizationMapExtentAt(0L, src); }
}
