// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH264CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     StdVideoH264LevelIdc maxLevelIdc;
///     VkOffset2D fieldOffsetGranularity;
/// }
/// ```
public final class VkVideoDecodeH264CapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("fieldOffsetGranularity")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    public static final long OFFSET_fieldOffsetGranularity = LAYOUT.byteOffset(PathElement.groupElement("fieldOffsetGranularity"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    public static final MemoryLayout LAYOUT_fieldOffsetGranularity = LAYOUT.select(PathElement.groupElement("fieldOffsetGranularity"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    public static final VarHandle VH_fieldOffsetGranularity$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fieldOffsetGranularity"), PathElement.groupElement("x"));
    public static final VarHandle VH_fieldOffsetGranularity$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fieldOffsetGranularity"), PathElement.groupElement("y"));

    public VkVideoDecodeH264CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH264CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH264CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH264CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH264CapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR); }
    public static VkVideoDecodeH264CapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoDecodeH264CapabilitiesKHR copyFrom(VkVideoDecodeH264CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH264CapabilitiesKHR reinterpret(long count) { return new VkVideoDecodeH264CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH264CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH264CapabilitiesKHR asSlice(long index, long count) { return new VkVideoDecodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH264CapabilitiesKHR at(long index, Consumer<VkVideoDecodeH264CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxLevelIdcAt(long index) { return (int) VH_maxLevelIdc.get(this.segment(), 0L, index); }
    public int fieldOffsetGranularity$xAt(long index) { return (int) VH_fieldOffsetGranularity$x.get(this.segment(), 0L, index); }
    public int fieldOffsetGranularity$yAt(long index) { return (int) VH_fieldOffsetGranularity$y.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxLevelIdc() { return (int) VH_maxLevelIdc.get(this.segment(), 0L, 0L); }
    public int fieldOffsetGranularity$x() { return (int) VH_fieldOffsetGranularity$x.get(this.segment(), 0L, 0L); }
    public int fieldOffsetGranularity$y() { return (int) VH_fieldOffsetGranularity$y.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH264CapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdcAt(long index, int value) { VH_maxLevelIdc.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity$xAt(long index, int value) { VH_fieldOffsetGranularity$x.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity$yAt(long index, int value) { VH_fieldOffsetGranularity$y.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdc(int value) { VH_maxLevelIdc.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity$x(int value) { VH_fieldOffsetGranularity$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity$y(int value) { VH_fieldOffsetGranularity$y.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH264CapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264CapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH264CapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264CapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxLevelIdcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevelIdc, index), LAYOUT_maxLevelIdc); }
    public MemorySegment _maxLevelIdc() { return _maxLevelIdcAt(0L); }
    public VkVideoDecodeH264CapabilitiesKHR _maxLevelIdcAt(long index, MemorySegment src) { _maxLevelIdcAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264CapabilitiesKHR _maxLevelIdc(MemorySegment src) { return _maxLevelIdcAt(0L, src); }
    public MemorySegment _fieldOffsetGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), LAYOUT_fieldOffsetGranularity); }
    public MemorySegment _fieldOffsetGranularity() { return _fieldOffsetGranularityAt(0L); }
    public VkVideoDecodeH264CapabilitiesKHR _fieldOffsetGranularityAt(long index, MemorySegment src) { _fieldOffsetGranularityAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264CapabilitiesKHR _fieldOffsetGranularity(MemorySegment src) { return _fieldOffsetGranularityAt(0L, src); }
}
