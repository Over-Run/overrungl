// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeH265CapabilityFlagsKHR flags;
///     StdVideoH265LevelIdc maxLevelIdc;
///     uint32_t maxSliceSegmentCount;
///     VkExtent2D maxTiles;
///     VkVideoEncodeH265CtbSizeFlagsKHR ctbSizes;
///     VkVideoEncodeH265TransformBlockSizeFlagsKHR transformBlockSizes;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxSubLayerCount;
///     VkBool32 expectDyadicTemporalSubLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH265StdFlagsKHR stdSyntaxFlags;
/// }
/// ```
public final class VkVideoEncodeH265CapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceSegmentCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTiles"),
        ValueLayout.JAVA_INT.withName("ctbSizes"),
        ValueLayout.JAVA_INT.withName("transformBlockSizes"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxSubLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalSubLayerPattern"),
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
    public static final long OFFSET_maxSliceSegmentCount = LAYOUT.byteOffset(PathElement.groupElement("maxSliceSegmentCount"));
    public static final long OFFSET_maxTiles = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
    public static final long OFFSET_ctbSizes = LAYOUT.byteOffset(PathElement.groupElement("ctbSizes"));
    public static final long OFFSET_transformBlockSizes = LAYOUT.byteOffset(PathElement.groupElement("transformBlockSizes"));
    public static final long OFFSET_maxPPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    public static final long OFFSET_maxBPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    public static final long OFFSET_maxL1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxL1ReferenceCount"));
    public static final long OFFSET_maxSubLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxSubLayerCount"));
    public static final long OFFSET_expectDyadicTemporalSubLayerPattern = LAYOUT.byteOffset(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    public static final long OFFSET_prefersGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final long OFFSET_requiresGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final long OFFSET_stdSyntaxFlags = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    public static final MemoryLayout LAYOUT_maxSliceSegmentCount = LAYOUT.select(PathElement.groupElement("maxSliceSegmentCount"));
    public static final MemoryLayout LAYOUT_maxTiles = LAYOUT.select(PathElement.groupElement("maxTiles"));
    public static final MemoryLayout LAYOUT_ctbSizes = LAYOUT.select(PathElement.groupElement("ctbSizes"));
    public static final MemoryLayout LAYOUT_transformBlockSizes = LAYOUT.select(PathElement.groupElement("transformBlockSizes"));
    public static final MemoryLayout LAYOUT_maxPPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxBPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxL1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxL1ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxSubLayerCount = LAYOUT.select(PathElement.groupElement("maxSubLayerCount"));
    public static final MemoryLayout LAYOUT_expectDyadicTemporalSubLayerPattern = LAYOUT.select(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    public static final MemoryLayout LAYOUT_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    public static final MemoryLayout LAYOUT_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    public static final MemoryLayout LAYOUT_prefersGopRemainingFrames = LAYOUT.select(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_requiresGopRemainingFrames = LAYOUT.select(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_stdSyntaxFlags = LAYOUT.select(PathElement.groupElement("stdSyntaxFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    public static final VarHandle VH_maxSliceSegmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSliceSegmentCount"));
    public static final VarHandle VH_maxTiles$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTiles"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxTiles$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTiles"), PathElement.groupElement("height"));
    public static final VarHandle VH_ctbSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ctbSizes"));
    public static final VarHandle VH_transformBlockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformBlockSizes"));
    public static final VarHandle VH_maxPPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    public static final VarHandle VH_maxBPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    public static final VarHandle VH_maxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxL1ReferenceCount"));
    public static final VarHandle VH_maxSubLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubLayerCount"));
    public static final VarHandle VH_expectDyadicTemporalSubLayerPattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    public static final VarHandle VH_minQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"));
    public static final VarHandle VH_maxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"));
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    public VkVideoEncodeH265CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH265CapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR); }
    public static VkVideoEncodeH265CapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeH265CapabilitiesKHR copyFrom(VkVideoEncodeH265CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265CapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265CapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265CapabilitiesKHR at(long index, Consumer<VkVideoEncodeH265CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int maxLevelIdcAt(long index) { return (int) VH_maxLevelIdc.get(this.segment(), 0L, index); }
    public int maxSliceSegmentCountAt(long index) { return (int) VH_maxSliceSegmentCount.get(this.segment(), 0L, index); }
    public int maxTiles$widthAt(long index) { return (int) VH_maxTiles$width.get(this.segment(), 0L, index); }
    public int maxTiles$heightAt(long index) { return (int) VH_maxTiles$height.get(this.segment(), 0L, index); }
    public int ctbSizesAt(long index) { return (int) VH_ctbSizes.get(this.segment(), 0L, index); }
    public int transformBlockSizesAt(long index) { return (int) VH_transformBlockSizes.get(this.segment(), 0L, index); }
    public int maxPPictureL0ReferenceCountAt(long index) { return (int) VH_maxPPictureL0ReferenceCount.get(this.segment(), 0L, index); }
    public int maxBPictureL0ReferenceCountAt(long index) { return (int) VH_maxBPictureL0ReferenceCount.get(this.segment(), 0L, index); }
    public int maxL1ReferenceCountAt(long index) { return (int) VH_maxL1ReferenceCount.get(this.segment(), 0L, index); }
    public int maxSubLayerCountAt(long index) { return (int) VH_maxSubLayerCount.get(this.segment(), 0L, index); }
    public int expectDyadicTemporalSubLayerPatternAt(long index) { return (int) VH_expectDyadicTemporalSubLayerPattern.get(this.segment(), 0L, index); }
    public int minQpAt(long index) { return (int) VH_minQp.get(this.segment(), 0L, index); }
    public int maxQpAt(long index) { return (int) VH_maxQp.get(this.segment(), 0L, index); }
    public int prefersGopRemainingFramesAt(long index) { return (int) VH_prefersGopRemainingFrames.get(this.segment(), 0L, index); }
    public int requiresGopRemainingFramesAt(long index) { return (int) VH_requiresGopRemainingFrames.get(this.segment(), 0L, index); }
    public int stdSyntaxFlagsAt(long index) { return (int) VH_stdSyntaxFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int maxLevelIdc() { return (int) VH_maxLevelIdc.get(this.segment(), 0L, 0L); }
    public int maxSliceSegmentCount() { return (int) VH_maxSliceSegmentCount.get(this.segment(), 0L, 0L); }
    public int maxTiles$width() { return (int) VH_maxTiles$width.get(this.segment(), 0L, 0L); }
    public int maxTiles$height() { return (int) VH_maxTiles$height.get(this.segment(), 0L, 0L); }
    public int ctbSizes() { return (int) VH_ctbSizes.get(this.segment(), 0L, 0L); }
    public int transformBlockSizes() { return (int) VH_transformBlockSizes.get(this.segment(), 0L, 0L); }
    public int maxPPictureL0ReferenceCount() { return (int) VH_maxPPictureL0ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxBPictureL0ReferenceCount() { return (int) VH_maxBPictureL0ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxL1ReferenceCount() { return (int) VH_maxL1ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxSubLayerCount() { return (int) VH_maxSubLayerCount.get(this.segment(), 0L, 0L); }
    public int expectDyadicTemporalSubLayerPattern() { return (int) VH_expectDyadicTemporalSubLayerPattern.get(this.segment(), 0L, 0L); }
    public int minQp() { return (int) VH_minQp.get(this.segment(), 0L, 0L); }
    public int maxQp() { return (int) VH_maxQp.get(this.segment(), 0L, 0L); }
    public int prefersGopRemainingFrames() { return (int) VH_prefersGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int requiresGopRemainingFrames() { return (int) VH_requiresGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int stdSyntaxFlags() { return (int) VH_stdSyntaxFlags.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265CapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdcAt(long index, int value) { VH_maxLevelIdc.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCountAt(long index, int value) { VH_maxSliceSegmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxTiles$widthAt(long index, int value) { VH_maxTiles$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxTiles$heightAt(long index, int value) { VH_maxTiles$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR ctbSizesAt(long index, int value) { VH_ctbSizes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizesAt(long index, int value) { VH_transformBlockSizes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCountAt(long index, int value) { VH_maxPPictureL0ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCountAt(long index, int value) { VH_maxBPictureL0ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCountAt(long index, int value) { VH_maxL1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCountAt(long index, int value) { VH_maxSubLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPatternAt(long index, int value) { VH_expectDyadicTemporalSubLayerPattern.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR minQpAt(long index, int value) { VH_minQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxQpAt(long index, int value) { VH_maxQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFramesAt(long index, int value) { VH_prefersGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFramesAt(long index, int value) { VH_requiresGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlagsAt(long index, int value) { VH_stdSyntaxFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdc(int value) { VH_maxLevelIdc.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCount(int value) { VH_maxSliceSegmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxTiles$width(int value) { VH_maxTiles$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxTiles$height(int value) { VH_maxTiles$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR ctbSizes(int value) { VH_ctbSizes.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizes(int value) { VH_transformBlockSizes.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCount(int value) { VH_maxPPictureL0ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCount(int value) { VH_maxBPictureL0ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCount(int value) { VH_maxL1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCount(int value) { VH_maxSubLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPattern(int value) { VH_expectDyadicTemporalSubLayerPattern.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR minQp(int value) { VH_minQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR maxQp(int value) { VH_maxQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFrames(int value) { VH_prefersGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFrames(int value) { VH_requiresGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlags(int value) { VH_stdSyntaxFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _maxLevelIdcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevelIdc, index), LAYOUT_maxLevelIdc); }
    public MemorySegment _maxLevelIdc() { return _maxLevelIdcAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxLevelIdcAt(long index, MemorySegment src) { _maxLevelIdcAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxLevelIdc(MemorySegment src) { return _maxLevelIdcAt(0L, src); }
    public MemorySegment _maxSliceSegmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSliceSegmentCount, index), LAYOUT_maxSliceSegmentCount); }
    public MemorySegment _maxSliceSegmentCount() { return _maxSliceSegmentCountAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxSliceSegmentCountAt(long index, MemorySegment src) { _maxSliceSegmentCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxSliceSegmentCount(MemorySegment src) { return _maxSliceSegmentCountAt(0L, src); }
    public MemorySegment _maxTilesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTiles, index), LAYOUT_maxTiles); }
    public MemorySegment _maxTiles() { return _maxTilesAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxTilesAt(long index, MemorySegment src) { _maxTilesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxTiles(MemorySegment src) { return _maxTilesAt(0L, src); }
    public MemorySegment _ctbSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ctbSizes, index), LAYOUT_ctbSizes); }
    public MemorySegment _ctbSizes() { return _ctbSizesAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _ctbSizesAt(long index, MemorySegment src) { _ctbSizesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _ctbSizes(MemorySegment src) { return _ctbSizesAt(0L, src); }
    public MemorySegment _transformBlockSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformBlockSizes, index), LAYOUT_transformBlockSizes); }
    public MemorySegment _transformBlockSizes() { return _transformBlockSizesAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _transformBlockSizesAt(long index, MemorySegment src) { _transformBlockSizesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _transformBlockSizes(MemorySegment src) { return _transformBlockSizesAt(0L, src); }
    public MemorySegment _maxPPictureL0ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPPictureL0ReferenceCount, index), LAYOUT_maxPPictureL0ReferenceCount); }
    public MemorySegment _maxPPictureL0ReferenceCount() { return _maxPPictureL0ReferenceCountAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxPPictureL0ReferenceCountAt(long index, MemorySegment src) { _maxPPictureL0ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxPPictureL0ReferenceCount(MemorySegment src) { return _maxPPictureL0ReferenceCountAt(0L, src); }
    public MemorySegment _maxBPictureL0ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBPictureL0ReferenceCount, index), LAYOUT_maxBPictureL0ReferenceCount); }
    public MemorySegment _maxBPictureL0ReferenceCount() { return _maxBPictureL0ReferenceCountAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxBPictureL0ReferenceCountAt(long index, MemorySegment src) { _maxBPictureL0ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxBPictureL0ReferenceCount(MemorySegment src) { return _maxBPictureL0ReferenceCountAt(0L, src); }
    public MemorySegment _maxL1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxL1ReferenceCount, index), LAYOUT_maxL1ReferenceCount); }
    public MemorySegment _maxL1ReferenceCount() { return _maxL1ReferenceCountAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxL1ReferenceCountAt(long index, MemorySegment src) { _maxL1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxL1ReferenceCount(MemorySegment src) { return _maxL1ReferenceCountAt(0L, src); }
    public MemorySegment _maxSubLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSubLayerCount, index), LAYOUT_maxSubLayerCount); }
    public MemorySegment _maxSubLayerCount() { return _maxSubLayerCountAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxSubLayerCountAt(long index, MemorySegment src) { _maxSubLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxSubLayerCount(MemorySegment src) { return _maxSubLayerCountAt(0L, src); }
    public MemorySegment _expectDyadicTemporalSubLayerPatternAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_expectDyadicTemporalSubLayerPattern, index), LAYOUT_expectDyadicTemporalSubLayerPattern); }
    public MemorySegment _expectDyadicTemporalSubLayerPattern() { return _expectDyadicTemporalSubLayerPatternAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _expectDyadicTemporalSubLayerPatternAt(long index, MemorySegment src) { _expectDyadicTemporalSubLayerPatternAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _expectDyadicTemporalSubLayerPattern(MemorySegment src) { return _expectDyadicTemporalSubLayerPatternAt(0L, src); }
    public MemorySegment _minQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQp, index), LAYOUT_minQp); }
    public MemorySegment _minQp() { return _minQpAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _minQpAt(long index, MemorySegment src) { _minQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _minQp(MemorySegment src) { return _minQpAt(0L, src); }
    public MemorySegment _maxQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQp, index), LAYOUT_maxQp); }
    public MemorySegment _maxQp() { return _maxQpAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _maxQpAt(long index, MemorySegment src) { _maxQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _maxQp(MemorySegment src) { return _maxQpAt(0L, src); }
    public MemorySegment _prefersGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersGopRemainingFrames, index), LAYOUT_prefersGopRemainingFrames); }
    public MemorySegment _prefersGopRemainingFrames() { return _prefersGopRemainingFramesAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _prefersGopRemainingFramesAt(long index, MemorySegment src) { _prefersGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _prefersGopRemainingFrames(MemorySegment src) { return _prefersGopRemainingFramesAt(0L, src); }
    public MemorySegment _requiresGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiresGopRemainingFrames, index), LAYOUT_requiresGopRemainingFrames); }
    public MemorySegment _requiresGopRemainingFrames() { return _requiresGopRemainingFramesAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _requiresGopRemainingFramesAt(long index, MemorySegment src) { _requiresGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _requiresGopRemainingFrames(MemorySegment src) { return _requiresGopRemainingFramesAt(0L, src); }
    public MemorySegment _stdSyntaxFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSyntaxFlags, index), LAYOUT_stdSyntaxFlags); }
    public MemorySegment _stdSyntaxFlags() { return _stdSyntaxFlagsAt(0L); }
    public VkVideoEncodeH265CapabilitiesKHR _stdSyntaxFlagsAt(long index, MemorySegment src) { _stdSyntaxFlagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265CapabilitiesKHR _stdSyntaxFlags(MemorySegment src) { return _stdSyntaxFlagsAt(0L, src); }
}
