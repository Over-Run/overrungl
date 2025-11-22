// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoFormatH265QuantizationMapPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatH265QuantizationMapPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeH265CtbSizeFlagsKHR compatibleCtbSizes;
/// }
/// ```
public final class VkVideoFormatH265QuantizationMapPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compatibleCtbSizes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_compatibleCtbSizes = LAYOUT.byteOffset(PathElement.groupElement("compatibleCtbSizes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_compatibleCtbSizes = LAYOUT.select(PathElement.groupElement("compatibleCtbSizes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_compatibleCtbSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleCtbSizes"));

    public VkVideoFormatH265QuantizationMapPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR); }
    public static VkVideoFormatH265QuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR);
        return s;
    }
    public VkVideoFormatH265QuantizationMapPropertiesKHR copyFrom(VkVideoFormatH265QuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR reinterpret(long count) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR at(long index, Consumer<VkVideoFormatH265QuantizationMapPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int compatibleCtbSizesAt(long index) { return (int) VH_compatibleCtbSizes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int compatibleCtbSizes() { return (int) VH_compatibleCtbSizes.get(this.segment(), 0L, 0L); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR compatibleCtbSizesAt(long index, int value) { VH_compatibleCtbSizes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR compatibleCtbSizes(int value) { VH_compatibleCtbSizes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _compatibleCtbSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compatibleCtbSizes, index), LAYOUT_compatibleCtbSizes); }
    public MemorySegment _compatibleCtbSizes() { return _compatibleCtbSizesAt(0L); }
    public VkVideoFormatH265QuantizationMapPropertiesKHR _compatibleCtbSizesAt(long index, MemorySegment src) { _compatibleCtbSizesAt(index).copyFrom(src); return this; }
    public VkVideoFormatH265QuantizationMapPropertiesKHR _compatibleCtbSizes(MemorySegment src) { return _compatibleCtbSizesAt(0L, src); }
}
