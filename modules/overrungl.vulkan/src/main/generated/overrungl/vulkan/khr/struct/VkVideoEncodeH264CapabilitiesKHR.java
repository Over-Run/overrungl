// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeH264CapabilityFlagsKHR flags;
///     StdVideoH264LevelIdc maxLevelIdc;
///     uint32_t maxSliceCount;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxTemporalLayerCount;
///     VkBool32 expectDyadicTemporalLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags;
/// }
/// ```
public final class VkVideoEncodeH264CapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceCount"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalLayerPattern"),
        ValueLayout.JAVA_INT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    public static final long OFFSET_maxSliceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSliceCount"));
    public static final long OFFSET_maxPPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    public static final long OFFSET_maxBPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    public static final long OFFSET_maxL1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxL1ReferenceCount"));
    public static final long OFFSET_maxTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxTemporalLayerCount"));
    public static final long OFFSET_expectDyadicTemporalLayerPattern = LAYOUT.byteOffset(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    public static final long OFFSET_prefersGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final long OFFSET_requiresGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final long OFFSET_stdSyntaxFlags = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    public static final MemoryLayout LAYOUT_maxSliceCount = LAYOUT.select(PathElement.groupElement("maxSliceCount"));
    public static final MemoryLayout LAYOUT_maxPPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxBPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxL1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxL1ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxTemporalLayerCount = LAYOUT.select(PathElement.groupElement("maxTemporalLayerCount"));
    public static final MemoryLayout LAYOUT_expectDyadicTemporalLayerPattern = LAYOUT.select(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
    public static final MemoryLayout LAYOUT_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    public static final MemoryLayout LAYOUT_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    public static final MemoryLayout LAYOUT_prefersGopRemainingFrames = LAYOUT.select(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_requiresGopRemainingFrames = LAYOUT.select(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_stdSyntaxFlags = LAYOUT.select(PathElement.groupElement("stdSyntaxFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    public static final VarHandle VH_maxSliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSliceCount"));
    public static final VarHandle VH_maxPPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    public static final VarHandle VH_maxBPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    public static final VarHandle VH_maxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxL1ReferenceCount"));
    public static final VarHandle VH_maxTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTemporalLayerCount"));
    public static final VarHandle VH_expectDyadicTemporalLayerPattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
    public static final VarHandle VH_minQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"));
    public static final VarHandle VH_maxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"));
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    public VkVideoEncodeH264CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264CapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR); }
    public static VkVideoEncodeH264CapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeH264CapabilitiesKHR copyFrom(VkVideoEncodeH264CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264CapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeH264CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264CapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264CapabilitiesKHR at(long index, Consumer<VkVideoEncodeH264CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int maxLevelIdcAt(long index) { return (int) VH_maxLevelIdc.get(this.segment(), 0L, index); }
    public int maxSliceCountAt(long index) { return (int) VH_maxSliceCount.get(this.segment(), 0L, index); }
    public int maxPPictureL0ReferenceCountAt(long index) { return (int) VH_maxPPictureL0ReferenceCount.get(this.segment(), 0L, index); }
    public int maxBPictureL0ReferenceCountAt(long index) { return (int) VH_maxBPictureL0ReferenceCount.get(this.segment(), 0L, index); }
    public int maxL1ReferenceCountAt(long index) { return (int) VH_maxL1ReferenceCount.get(this.segment(), 0L, index); }
    public int maxTemporalLayerCountAt(long index) { return (int) VH_maxTemporalLayerCount.get(this.segment(), 0L, index); }
    public int expectDyadicTemporalLayerPatternAt(long index) { return (int) VH_expectDyadicTemporalLayerPattern.get(this.segment(), 0L, index); }
    public int minQpAt(long index) { return (int) VH_minQp.get(this.segment(), 0L, index); }
    public int maxQpAt(long index) { return (int) VH_maxQp.get(this.segment(), 0L, index); }
    public int prefersGopRemainingFramesAt(long index) { return (int) VH_prefersGopRemainingFrames.get(this.segment(), 0L, index); }
    public int requiresGopRemainingFramesAt(long index) { return (int) VH_requiresGopRemainingFrames.get(this.segment(), 0L, index); }
    public int stdSyntaxFlagsAt(long index) { return (int) VH_stdSyntaxFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int maxLevelIdc() { return (int) VH_maxLevelIdc.get(this.segment(), 0L, 0L); }
    public int maxSliceCount() { return (int) VH_maxSliceCount.get(this.segment(), 0L, 0L); }
    public int maxPPictureL0ReferenceCount() { return (int) VH_maxPPictureL0ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxBPictureL0ReferenceCount() { return (int) VH_maxBPictureL0ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxL1ReferenceCount() { return (int) VH_maxL1ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxTemporalLayerCount() { return (int) VH_maxTemporalLayerCount.get(this.segment(), 0L, 0L); }
    public int expectDyadicTemporalLayerPattern() { return (int) VH_expectDyadicTemporalLayerPattern.get(this.segment(), 0L, 0L); }
    public int minQp() { return (int) VH_minQp.get(this.segment(), 0L, 0L); }
    public int maxQp() { return (int) VH_maxQp.get(this.segment(), 0L, 0L); }
    public int prefersGopRemainingFrames() { return (int) VH_prefersGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int requiresGopRemainingFrames() { return (int) VH_requiresGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int stdSyntaxFlags() { return (int) VH_stdSyntaxFlags.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264CapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxLevelIdcAt(long index, int value) { VH_maxLevelIdc.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxSliceCountAt(long index, int value) { VH_maxSliceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxPPictureL0ReferenceCountAt(long index, int value) { VH_maxPPictureL0ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxBPictureL0ReferenceCountAt(long index, int value) { VH_maxBPictureL0ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxL1ReferenceCountAt(long index, int value) { VH_maxL1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxTemporalLayerCountAt(long index, int value) { VH_maxTemporalLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR expectDyadicTemporalLayerPatternAt(long index, int value) { VH_expectDyadicTemporalLayerPattern.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR minQpAt(long index, int value) { VH_minQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxQpAt(long index, int value) { VH_maxQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR prefersGopRemainingFramesAt(long index, int value) { VH_prefersGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR requiresGopRemainingFramesAt(long index, int value) { VH_requiresGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR stdSyntaxFlagsAt(long index, int value) { VH_stdSyntaxFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxLevelIdc(int value) { VH_maxLevelIdc.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxSliceCount(int value) { VH_maxSliceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxPPictureL0ReferenceCount(int value) { VH_maxPPictureL0ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxBPictureL0ReferenceCount(int value) { VH_maxBPictureL0ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxL1ReferenceCount(int value) { VH_maxL1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxTemporalLayerCount(int value) { VH_maxTemporalLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR expectDyadicTemporalLayerPattern(int value) { VH_expectDyadicTemporalLayerPattern.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR minQp(int value) { VH_minQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR maxQp(int value) { VH_maxQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR prefersGopRemainingFrames(int value) { VH_prefersGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR requiresGopRemainingFrames(int value) { VH_requiresGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264CapabilitiesKHR stdSyntaxFlags(int value) { VH_stdSyntaxFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _maxLevelIdcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevelIdc, index), LAYOUT_maxLevelIdc); }
    public MemorySegment _maxLevelIdc() { return _maxLevelIdcAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxLevelIdcAt(long index, MemorySegment src) { _maxLevelIdcAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxLevelIdc(MemorySegment src) { return _maxLevelIdcAt(0L, src); }
    public MemorySegment _maxSliceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSliceCount, index), LAYOUT_maxSliceCount); }
    public MemorySegment _maxSliceCount() { return _maxSliceCountAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxSliceCountAt(long index, MemorySegment src) { _maxSliceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxSliceCount(MemorySegment src) { return _maxSliceCountAt(0L, src); }
    public MemorySegment _maxPPictureL0ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPPictureL0ReferenceCount, index), LAYOUT_maxPPictureL0ReferenceCount); }
    public MemorySegment _maxPPictureL0ReferenceCount() { return _maxPPictureL0ReferenceCountAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxPPictureL0ReferenceCountAt(long index, MemorySegment src) { _maxPPictureL0ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxPPictureL0ReferenceCount(MemorySegment src) { return _maxPPictureL0ReferenceCountAt(0L, src); }
    public MemorySegment _maxBPictureL0ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBPictureL0ReferenceCount, index), LAYOUT_maxBPictureL0ReferenceCount); }
    public MemorySegment _maxBPictureL0ReferenceCount() { return _maxBPictureL0ReferenceCountAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxBPictureL0ReferenceCountAt(long index, MemorySegment src) { _maxBPictureL0ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxBPictureL0ReferenceCount(MemorySegment src) { return _maxBPictureL0ReferenceCountAt(0L, src); }
    public MemorySegment _maxL1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxL1ReferenceCount, index), LAYOUT_maxL1ReferenceCount); }
    public MemorySegment _maxL1ReferenceCount() { return _maxL1ReferenceCountAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxL1ReferenceCountAt(long index, MemorySegment src) { _maxL1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxL1ReferenceCount(MemorySegment src) { return _maxL1ReferenceCountAt(0L, src); }
    public MemorySegment _maxTemporalLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTemporalLayerCount, index), LAYOUT_maxTemporalLayerCount); }
    public MemorySegment _maxTemporalLayerCount() { return _maxTemporalLayerCountAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxTemporalLayerCountAt(long index, MemorySegment src) { _maxTemporalLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxTemporalLayerCount(MemorySegment src) { return _maxTemporalLayerCountAt(0L, src); }
    public MemorySegment _expectDyadicTemporalLayerPatternAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_expectDyadicTemporalLayerPattern, index), LAYOUT_expectDyadicTemporalLayerPattern); }
    public MemorySegment _expectDyadicTemporalLayerPattern() { return _expectDyadicTemporalLayerPatternAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _expectDyadicTemporalLayerPatternAt(long index, MemorySegment src) { _expectDyadicTemporalLayerPatternAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _expectDyadicTemporalLayerPattern(MemorySegment src) { return _expectDyadicTemporalLayerPatternAt(0L, src); }
    public MemorySegment _minQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQp, index), LAYOUT_minQp); }
    public MemorySegment _minQp() { return _minQpAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _minQpAt(long index, MemorySegment src) { _minQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _minQp(MemorySegment src) { return _minQpAt(0L, src); }
    public MemorySegment _maxQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQp, index), LAYOUT_maxQp); }
    public MemorySegment _maxQp() { return _maxQpAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _maxQpAt(long index, MemorySegment src) { _maxQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _maxQp(MemorySegment src) { return _maxQpAt(0L, src); }
    public MemorySegment _prefersGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersGopRemainingFrames, index), LAYOUT_prefersGopRemainingFrames); }
    public MemorySegment _prefersGopRemainingFrames() { return _prefersGopRemainingFramesAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _prefersGopRemainingFramesAt(long index, MemorySegment src) { _prefersGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _prefersGopRemainingFrames(MemorySegment src) { return _prefersGopRemainingFramesAt(0L, src); }
    public MemorySegment _requiresGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiresGopRemainingFrames, index), LAYOUT_requiresGopRemainingFrames); }
    public MemorySegment _requiresGopRemainingFrames() { return _requiresGopRemainingFramesAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _requiresGopRemainingFramesAt(long index, MemorySegment src) { _requiresGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _requiresGopRemainingFrames(MemorySegment src) { return _requiresGopRemainingFramesAt(0L, src); }
    public MemorySegment _stdSyntaxFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSyntaxFlags, index), LAYOUT_stdSyntaxFlags); }
    public MemorySegment _stdSyntaxFlags() { return _stdSyntaxFlagsAt(0L); }
    public VkVideoEncodeH264CapabilitiesKHR _stdSyntaxFlagsAt(long index, MemorySegment src) { _stdSyntaxFlagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264CapabilitiesKHR _stdSyntaxFlags(MemorySegment src) { return _stdSyntaxFlagsAt(0L, src); }
}
