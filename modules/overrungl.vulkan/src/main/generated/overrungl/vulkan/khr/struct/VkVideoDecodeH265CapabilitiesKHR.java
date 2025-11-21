// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH265CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     StdVideoH265LevelIdc maxLevelIdc;
/// }
/// ```
public final class VkVideoDecodeH265CapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));

    public VkVideoDecodeH265CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH265CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH265CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH265CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH265CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH265CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH265CapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR); }
    public static VkVideoDecodeH265CapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoDecodeH265CapabilitiesKHR copyFrom(VkVideoDecodeH265CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH265CapabilitiesKHR reinterpret(long count) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH265CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH265CapabilitiesKHR asSlice(long index, long count) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH265CapabilitiesKHR at(long index, Consumer<VkVideoDecodeH265CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxLevelIdcAt(long index) { return (int) VH_maxLevelIdc.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxLevelIdc() { return (int) VH_maxLevelIdc.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH265CapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265CapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265CapabilitiesKHR maxLevelIdcAt(long index, int value) { VH_maxLevelIdc.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265CapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265CapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265CapabilitiesKHR maxLevelIdc(int value) { VH_maxLevelIdc.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH265CapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265CapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH265CapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265CapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxLevelIdcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevelIdc, index), LAYOUT_maxLevelIdc); }
    public MemorySegment _maxLevelIdc() { return _maxLevelIdcAt(0L); }
    public VkVideoDecodeH265CapabilitiesKHR _maxLevelIdcAt(long index, MemorySegment src) { _maxLevelIdcAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265CapabilitiesKHR _maxLevelIdc(MemorySegment src) { return _maxLevelIdcAt(0L, src); }
}
