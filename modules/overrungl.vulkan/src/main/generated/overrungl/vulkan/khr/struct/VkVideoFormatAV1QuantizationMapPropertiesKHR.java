// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoFormatAV1QuantizationMapPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatAV1QuantizationMapPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeAV1SuperblockSizeFlagsKHR compatibleSuperblockSizes;
/// }
/// ```
public final class VkVideoFormatAV1QuantizationMapPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compatibleSuperblockSizes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_compatibleSuperblockSizes = LAYOUT.byteOffset(PathElement.groupElement("compatibleSuperblockSizes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_compatibleSuperblockSizes = LAYOUT.select(PathElement.groupElement("compatibleSuperblockSizes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_compatibleSuperblockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleSuperblockSizes"));

    public VkVideoFormatAV1QuantizationMapPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR); }
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR);
        return s;
    }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR copyFrom(VkVideoFormatAV1QuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR reinterpret(long count) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR at(long index, Consumer<VkVideoFormatAV1QuantizationMapPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int compatibleSuperblockSizesAt(long index) { return (int) VH_compatibleSuperblockSizes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int compatibleSuperblockSizes() { return (int) VH_compatibleSuperblockSizes.get(this.segment(), 0L, 0L); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR compatibleSuperblockSizesAt(long index, int value) { VH_compatibleSuperblockSizes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR compatibleSuperblockSizes(int value) { VH_compatibleSuperblockSizes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _compatibleSuperblockSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compatibleSuperblockSizes, index), LAYOUT_compatibleSuperblockSizes); }
    public MemorySegment _compatibleSuperblockSizes() { return _compatibleSuperblockSizesAt(0L); }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR _compatibleSuperblockSizesAt(long index, MemorySegment src) { _compatibleSuperblockSizesAt(index).copyFrom(src); return this; }
    public VkVideoFormatAV1QuantizationMapPropertiesKHR _compatibleSuperblockSizes(MemorySegment src) { return _compatibleSuperblockSizesAt(0L, src); }
}
