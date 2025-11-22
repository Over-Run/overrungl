// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoProfileInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoProfileInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoCodecOperationFlagBitsKHR videoCodecOperation;
///     VkVideoChromaSubsamplingFlagsKHR chromaSubsampling;
///     VkVideoComponentBitDepthFlagsKHR lumaBitDepth;
///     VkVideoComponentBitDepthFlagsKHR chromaBitDepth;
/// }
/// ```
public final class VkVideoProfileInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoCodecOperation"),
        ValueLayout.JAVA_INT.withName("chromaSubsampling"),
        ValueLayout.JAVA_INT.withName("lumaBitDepth"),
        ValueLayout.JAVA_INT.withName("chromaBitDepth")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoCodecOperation = LAYOUT.byteOffset(PathElement.groupElement("videoCodecOperation"));
    public static final long OFFSET_chromaSubsampling = LAYOUT.byteOffset(PathElement.groupElement("chromaSubsampling"));
    public static final long OFFSET_lumaBitDepth = LAYOUT.byteOffset(PathElement.groupElement("lumaBitDepth"));
    public static final long OFFSET_chromaBitDepth = LAYOUT.byteOffset(PathElement.groupElement("chromaBitDepth"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoCodecOperation = LAYOUT.select(PathElement.groupElement("videoCodecOperation"));
    public static final MemoryLayout LAYOUT_chromaSubsampling = LAYOUT.select(PathElement.groupElement("chromaSubsampling"));
    public static final MemoryLayout LAYOUT_lumaBitDepth = LAYOUT.select(PathElement.groupElement("lumaBitDepth"));
    public static final MemoryLayout LAYOUT_chromaBitDepth = LAYOUT.select(PathElement.groupElement("chromaBitDepth"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoCodecOperation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoCodecOperation"));
    public static final VarHandle VH_chromaSubsampling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaSubsampling"));
    public static final VarHandle VH_lumaBitDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lumaBitDepth"));
    public static final VarHandle VH_chromaBitDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaBitDepth"));

    public VkVideoProfileInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoProfileInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoProfileInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoProfileInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoProfileInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoProfileInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoProfileInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoProfileInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR); }
    public static VkVideoProfileInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR);
        return s;
    }
    public VkVideoProfileInfoKHR copyFrom(VkVideoProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoProfileInfoKHR reinterpret(long count) { return new VkVideoProfileInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoProfileInfoKHR asSlice(long index) { return new VkVideoProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoProfileInfoKHR asSlice(long index, long count) { return new VkVideoProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoProfileInfoKHR at(long index, Consumer<VkVideoProfileInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoCodecOperationAt(long index) { return (int) VH_videoCodecOperation.get(this.segment(), 0L, index); }
    public int chromaSubsamplingAt(long index) { return (int) VH_chromaSubsampling.get(this.segment(), 0L, index); }
    public int lumaBitDepthAt(long index) { return (int) VH_lumaBitDepth.get(this.segment(), 0L, index); }
    public int chromaBitDepthAt(long index) { return (int) VH_chromaBitDepth.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoCodecOperation() { return (int) VH_videoCodecOperation.get(this.segment(), 0L, 0L); }
    public int chromaSubsampling() { return (int) VH_chromaSubsampling.get(this.segment(), 0L, 0L); }
    public int lumaBitDepth() { return (int) VH_lumaBitDepth.get(this.segment(), 0L, 0L); }
    public int chromaBitDepth() { return (int) VH_chromaBitDepth.get(this.segment(), 0L, 0L); }
    public VkVideoProfileInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileInfoKHR videoCodecOperationAt(long index, int value) { VH_videoCodecOperation.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileInfoKHR chromaSubsamplingAt(long index, int value) { VH_chromaSubsampling.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileInfoKHR lumaBitDepthAt(long index, int value) { VH_lumaBitDepth.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileInfoKHR chromaBitDepthAt(long index, int value) { VH_chromaBitDepth.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileInfoKHR videoCodecOperation(int value) { VH_videoCodecOperation.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileInfoKHR chromaSubsampling(int value) { VH_chromaSubsampling.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileInfoKHR lumaBitDepth(int value) { VH_lumaBitDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileInfoKHR chromaBitDepth(int value) { VH_chromaBitDepth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoProfileInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoProfileInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoProfileInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoProfileInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoCodecOperationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoCodecOperation, index), LAYOUT_videoCodecOperation); }
    public MemorySegment _videoCodecOperation() { return _videoCodecOperationAt(0L); }
    public VkVideoProfileInfoKHR _videoCodecOperationAt(long index, MemorySegment src) { _videoCodecOperationAt(index).copyFrom(src); return this; }
    public VkVideoProfileInfoKHR _videoCodecOperation(MemorySegment src) { return _videoCodecOperationAt(0L, src); }
    public MemorySegment _chromaSubsamplingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chromaSubsampling, index), LAYOUT_chromaSubsampling); }
    public MemorySegment _chromaSubsampling() { return _chromaSubsamplingAt(0L); }
    public VkVideoProfileInfoKHR _chromaSubsamplingAt(long index, MemorySegment src) { _chromaSubsamplingAt(index).copyFrom(src); return this; }
    public VkVideoProfileInfoKHR _chromaSubsampling(MemorySegment src) { return _chromaSubsamplingAt(0L, src); }
    public MemorySegment _lumaBitDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lumaBitDepth, index), LAYOUT_lumaBitDepth); }
    public MemorySegment _lumaBitDepth() { return _lumaBitDepthAt(0L); }
    public VkVideoProfileInfoKHR _lumaBitDepthAt(long index, MemorySegment src) { _lumaBitDepthAt(index).copyFrom(src); return this; }
    public VkVideoProfileInfoKHR _lumaBitDepth(MemorySegment src) { return _lumaBitDepthAt(0L, src); }
    public MemorySegment _chromaBitDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chromaBitDepth, index), LAYOUT_chromaBitDepth); }
    public MemorySegment _chromaBitDepth() { return _chromaBitDepthAt(0L); }
    public VkVideoProfileInfoKHR _chromaBitDepthAt(long index, MemorySegment src) { _chromaBitDepthAt(index).copyFrom(src); return this; }
    public VkVideoProfileInfoKHR _chromaBitDepth(MemorySegment src) { return _chromaBitDepthAt(0L, src); }
}
