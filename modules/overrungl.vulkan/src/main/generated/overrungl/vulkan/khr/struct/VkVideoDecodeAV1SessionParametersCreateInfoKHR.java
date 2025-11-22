// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeAV1SessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeAV1SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoAV1SequenceHeader* pStdSequenceHeader;
/// }
/// ```
public final class VkVideoDecodeAV1SessionParametersCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSequenceHeader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdSequenceHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSequenceHeader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdSequenceHeader = LAYOUT.select(PathElement.groupElement("pStdSequenceHeader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdSequenceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSequenceHeader"));

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1SessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeAv1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeAv1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR copyFrom(VkVideoDecodeAV1SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR at(long index, Consumer<VkVideoDecodeAV1SessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdSequenceHeaderAt(long index) { return (MemorySegment) VH_pStdSequenceHeader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSequenceHeader() { return (MemorySegment) VH_pStdSequenceHeader.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pStdSequenceHeaderAt(long index, MemorySegment value) { VH_pStdSequenceHeader.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(MemorySegment value) { VH_pStdSequenceHeader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdSequenceHeaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSequenceHeader, index), LAYOUT_pStdSequenceHeader); }
    public MemorySegment _pStdSequenceHeader() { return _pStdSequenceHeaderAt(0L); }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR _pStdSequenceHeaderAt(long index, MemorySegment src) { _pStdSequenceHeaderAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR _pStdSequenceHeader(MemorySegment src) { return _pStdSequenceHeaderAt(0L, src); }
}
