// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeAV1CapabilityFlagsKHR flags;
///     StdVideoAV1Level maxLevel;
///     VkExtent2D codedPictureAlignment;
///     VkExtent2D maxTiles;
///     VkExtent2D minTileSize;
///     VkExtent2D maxTileSize;
///     VkVideoEncodeAV1SuperblockSizeFlagsKHR superblockSizes;
///     uint32_t maxSingleReferenceCount;
///     uint32_t singleReferenceNameMask;
///     uint32_t maxUnidirectionalCompoundReferenceCount;
///     uint32_t maxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t unidirectionalCompoundReferenceNameMask;
///     uint32_t maxBidirectionalCompoundReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t bidirectionalCompoundReferenceNameMask;
///     uint32_t maxTemporalLayerCount;
///     uint32_t maxSpatialLayerCount;
///     uint32_t maxOperatingPoints;
///     uint32_t minQIndex;
///     uint32_t maxQIndex;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeAV1StdFlagsKHR stdSyntaxFlags;
/// }
/// ```
public final class VkVideoEncodeAV1CapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevel"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("codedPictureAlignment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTiles"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minTileSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTileSize"),
        ValueLayout.JAVA_INT.withName("superblockSizes"),
        ValueLayout.JAVA_INT.withName("maxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("singleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("unidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("bidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("maxSpatialLayerCount"),
        ValueLayout.JAVA_INT.withName("maxOperatingPoints"),
        ValueLayout.JAVA_INT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_maxLevel = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
    public static final long OFFSET_codedPictureAlignment = LAYOUT.byteOffset(PathElement.groupElement("codedPictureAlignment"));
    public static final long OFFSET_maxTiles = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
    public static final long OFFSET_minTileSize = LAYOUT.byteOffset(PathElement.groupElement("minTileSize"));
    public static final long OFFSET_maxTileSize = LAYOUT.byteOffset(PathElement.groupElement("maxTileSize"));
    public static final long OFFSET_superblockSizes = LAYOUT.byteOffset(PathElement.groupElement("superblockSizes"));
    public static final long OFFSET_maxSingleReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSingleReferenceCount"));
    public static final long OFFSET_singleReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("singleReferenceNameMask"));
    public static final long OFFSET_maxUnidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
    public static final long OFFSET_maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
    public static final long OFFSET_unidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
    public static final long OFFSET_maxBidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
    public static final long OFFSET_maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
    public static final long OFFSET_maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
    public static final long OFFSET_bidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
    public static final long OFFSET_maxTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxTemporalLayerCount"));
    public static final long OFFSET_maxSpatialLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxSpatialLayerCount"));
    public static final long OFFSET_maxOperatingPoints = LAYOUT.byteOffset(PathElement.groupElement("maxOperatingPoints"));
    public static final long OFFSET_minQIndex = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
    public static final long OFFSET_maxQIndex = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
    public static final long OFFSET_prefersGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final long OFFSET_requiresGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final long OFFSET_stdSyntaxFlags = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_maxLevel = LAYOUT.select(PathElement.groupElement("maxLevel"));
    public static final MemoryLayout LAYOUT_codedPictureAlignment = LAYOUT.select(PathElement.groupElement("codedPictureAlignment"));
    public static final MemoryLayout LAYOUT_maxTiles = LAYOUT.select(PathElement.groupElement("maxTiles"));
    public static final MemoryLayout LAYOUT_minTileSize = LAYOUT.select(PathElement.groupElement("minTileSize"));
    public static final MemoryLayout LAYOUT_maxTileSize = LAYOUT.select(PathElement.groupElement("maxTileSize"));
    public static final MemoryLayout LAYOUT_superblockSizes = LAYOUT.select(PathElement.groupElement("superblockSizes"));
    public static final MemoryLayout LAYOUT_maxSingleReferenceCount = LAYOUT.select(PathElement.groupElement("maxSingleReferenceCount"));
    public static final MemoryLayout LAYOUT_singleReferenceNameMask = LAYOUT.select(PathElement.groupElement("singleReferenceNameMask"));
    public static final MemoryLayout LAYOUT_maxUnidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
    public static final MemoryLayout LAYOUT_maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
    public static final MemoryLayout LAYOUT_unidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
    public static final MemoryLayout LAYOUT_maxBidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
    public static final MemoryLayout LAYOUT_maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
    public static final MemoryLayout LAYOUT_maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
    public static final MemoryLayout LAYOUT_bidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
    public static final MemoryLayout LAYOUT_maxTemporalLayerCount = LAYOUT.select(PathElement.groupElement("maxTemporalLayerCount"));
    public static final MemoryLayout LAYOUT_maxSpatialLayerCount = LAYOUT.select(PathElement.groupElement("maxSpatialLayerCount"));
    public static final MemoryLayout LAYOUT_maxOperatingPoints = LAYOUT.select(PathElement.groupElement("maxOperatingPoints"));
    public static final MemoryLayout LAYOUT_minQIndex = LAYOUT.select(PathElement.groupElement("minQIndex"));
    public static final MemoryLayout LAYOUT_maxQIndex = LAYOUT.select(PathElement.groupElement("maxQIndex"));
    public static final MemoryLayout LAYOUT_prefersGopRemainingFrames = LAYOUT.select(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_requiresGopRemainingFrames = LAYOUT.select(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_stdSyntaxFlags = LAYOUT.select(PathElement.groupElement("stdSyntaxFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_maxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel"));
    public static final VarHandle VH_codedPictureAlignment$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codedPictureAlignment"), PathElement.groupElement("width"));
    public static final VarHandle VH_codedPictureAlignment$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codedPictureAlignment"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxTiles$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTiles"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxTiles$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTiles"), PathElement.groupElement("height"));
    public static final VarHandle VH_minTileSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTileSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_minTileSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTileSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxTileSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTileSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxTileSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTileSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_superblockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("superblockSizes"));
    public static final VarHandle VH_maxSingleReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSingleReferenceCount"));
    public static final VarHandle VH_singleReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("singleReferenceNameMask"));
    public static final VarHandle VH_maxUnidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
    public static final VarHandle VH_maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
    public static final VarHandle VH_unidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
    public static final VarHandle VH_maxBidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
    public static final VarHandle VH_maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
    public static final VarHandle VH_maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
    public static final VarHandle VH_bidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
    public static final VarHandle VH_maxTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTemporalLayerCount"));
    public static final VarHandle VH_maxSpatialLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSpatialLayerCount"));
    public static final VarHandle VH_maxOperatingPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOperatingPoints"));
    public static final VarHandle VH_minQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndex"));
    public static final VarHandle VH_maxQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndex"));
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    public VkVideoEncodeAV1CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1CapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR); }
    public static VkVideoEncodeAV1CapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeAV1CapabilitiesKHR copyFrom(VkVideoEncodeAV1CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1CapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1CapabilitiesKHR at(long index, Consumer<VkVideoEncodeAV1CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int maxLevelAt(long index) { return (int) VH_maxLevel.get(this.segment(), 0L, index); }
    public int codedPictureAlignment$widthAt(long index) { return (int) VH_codedPictureAlignment$width.get(this.segment(), 0L, index); }
    public int codedPictureAlignment$heightAt(long index) { return (int) VH_codedPictureAlignment$height.get(this.segment(), 0L, index); }
    public int maxTiles$widthAt(long index) { return (int) VH_maxTiles$width.get(this.segment(), 0L, index); }
    public int maxTiles$heightAt(long index) { return (int) VH_maxTiles$height.get(this.segment(), 0L, index); }
    public int minTileSize$widthAt(long index) { return (int) VH_minTileSize$width.get(this.segment(), 0L, index); }
    public int minTileSize$heightAt(long index) { return (int) VH_minTileSize$height.get(this.segment(), 0L, index); }
    public int maxTileSize$widthAt(long index) { return (int) VH_maxTileSize$width.get(this.segment(), 0L, index); }
    public int maxTileSize$heightAt(long index) { return (int) VH_maxTileSize$height.get(this.segment(), 0L, index); }
    public int superblockSizesAt(long index) { return (int) VH_superblockSizes.get(this.segment(), 0L, index); }
    public int maxSingleReferenceCountAt(long index) { return (int) VH_maxSingleReferenceCount.get(this.segment(), 0L, index); }
    public int singleReferenceNameMaskAt(long index) { return (int) VH_singleReferenceNameMask.get(this.segment(), 0L, index); }
    public int maxUnidirectionalCompoundReferenceCountAt(long index) { return (int) VH_maxUnidirectionalCompoundReferenceCount.get(this.segment(), 0L, index); }
    public int maxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return (int) VH_maxUnidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, index); }
    public int unidirectionalCompoundReferenceNameMaskAt(long index) { return (int) VH_unidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, index); }
    public int maxBidirectionalCompoundReferenceCountAt(long index) { return (int) VH_maxBidirectionalCompoundReferenceCount.get(this.segment(), 0L, index); }
    public int maxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return (int) VH_maxBidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, index); }
    public int maxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return (int) VH_maxBidirectionalCompoundGroup2ReferenceCount.get(this.segment(), 0L, index); }
    public int bidirectionalCompoundReferenceNameMaskAt(long index) { return (int) VH_bidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, index); }
    public int maxTemporalLayerCountAt(long index) { return (int) VH_maxTemporalLayerCount.get(this.segment(), 0L, index); }
    public int maxSpatialLayerCountAt(long index) { return (int) VH_maxSpatialLayerCount.get(this.segment(), 0L, index); }
    public int maxOperatingPointsAt(long index) { return (int) VH_maxOperatingPoints.get(this.segment(), 0L, index); }
    public int minQIndexAt(long index) { return (int) VH_minQIndex.get(this.segment(), 0L, index); }
    public int maxQIndexAt(long index) { return (int) VH_maxQIndex.get(this.segment(), 0L, index); }
    public int prefersGopRemainingFramesAt(long index) { return (int) VH_prefersGopRemainingFrames.get(this.segment(), 0L, index); }
    public int requiresGopRemainingFramesAt(long index) { return (int) VH_requiresGopRemainingFrames.get(this.segment(), 0L, index); }
    public int stdSyntaxFlagsAt(long index) { return (int) VH_stdSyntaxFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int maxLevel() { return (int) VH_maxLevel.get(this.segment(), 0L, 0L); }
    public int codedPictureAlignment$width() { return (int) VH_codedPictureAlignment$width.get(this.segment(), 0L, 0L); }
    public int codedPictureAlignment$height() { return (int) VH_codedPictureAlignment$height.get(this.segment(), 0L, 0L); }
    public int maxTiles$width() { return (int) VH_maxTiles$width.get(this.segment(), 0L, 0L); }
    public int maxTiles$height() { return (int) VH_maxTiles$height.get(this.segment(), 0L, 0L); }
    public int minTileSize$width() { return (int) VH_minTileSize$width.get(this.segment(), 0L, 0L); }
    public int minTileSize$height() { return (int) VH_minTileSize$height.get(this.segment(), 0L, 0L); }
    public int maxTileSize$width() { return (int) VH_maxTileSize$width.get(this.segment(), 0L, 0L); }
    public int maxTileSize$height() { return (int) VH_maxTileSize$height.get(this.segment(), 0L, 0L); }
    public int superblockSizes() { return (int) VH_superblockSizes.get(this.segment(), 0L, 0L); }
    public int maxSingleReferenceCount() { return (int) VH_maxSingleReferenceCount.get(this.segment(), 0L, 0L); }
    public int singleReferenceNameMask() { return (int) VH_singleReferenceNameMask.get(this.segment(), 0L, 0L); }
    public int maxUnidirectionalCompoundReferenceCount() { return (int) VH_maxUnidirectionalCompoundReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxUnidirectionalCompoundGroup1ReferenceCount() { return (int) VH_maxUnidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, 0L); }
    public int unidirectionalCompoundReferenceNameMask() { return (int) VH_unidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, 0L); }
    public int maxBidirectionalCompoundReferenceCount() { return (int) VH_maxBidirectionalCompoundReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxBidirectionalCompoundGroup1ReferenceCount() { return (int) VH_maxBidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, 0L); }
    public int maxBidirectionalCompoundGroup2ReferenceCount() { return (int) VH_maxBidirectionalCompoundGroup2ReferenceCount.get(this.segment(), 0L, 0L); }
    public int bidirectionalCompoundReferenceNameMask() { return (int) VH_bidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, 0L); }
    public int maxTemporalLayerCount() { return (int) VH_maxTemporalLayerCount.get(this.segment(), 0L, 0L); }
    public int maxSpatialLayerCount() { return (int) VH_maxSpatialLayerCount.get(this.segment(), 0L, 0L); }
    public int maxOperatingPoints() { return (int) VH_maxOperatingPoints.get(this.segment(), 0L, 0L); }
    public int minQIndex() { return (int) VH_minQIndex.get(this.segment(), 0L, 0L); }
    public int maxQIndex() { return (int) VH_maxQIndex.get(this.segment(), 0L, 0L); }
    public int prefersGopRemainingFrames() { return (int) VH_prefersGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int requiresGopRemainingFrames() { return (int) VH_requiresGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int stdSyntaxFlags() { return (int) VH_stdSyntaxFlags.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1CapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxLevelAt(long index, int value) { VH_maxLevel.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment$widthAt(long index, int value) { VH_codedPictureAlignment$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment$heightAt(long index, int value) { VH_codedPictureAlignment$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles$widthAt(long index, int value) { VH_maxTiles$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles$heightAt(long index, int value) { VH_maxTiles$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize$widthAt(long index, int value) { VH_minTileSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize$heightAt(long index, int value) { VH_minTileSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize$widthAt(long index, int value) { VH_maxTileSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize$heightAt(long index, int value) { VH_maxTileSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR superblockSizesAt(long index, int value) { VH_superblockSizes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxSingleReferenceCountAt(long index, int value) { VH_maxSingleReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR singleReferenceNameMaskAt(long index, int value) { VH_singleReferenceNameMask.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundReferenceCountAt(long index, int value) { VH_maxUnidirectionalCompoundReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { VH_maxUnidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR unidirectionalCompoundReferenceNameMaskAt(long index, int value) { VH_unidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundReferenceCountAt(long index, int value) { VH_maxBidirectionalCompoundReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { VH_maxBidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup2ReferenceCountAt(long index, int value) { VH_maxBidirectionalCompoundGroup2ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR bidirectionalCompoundReferenceNameMaskAt(long index, int value) { VH_bidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTemporalLayerCountAt(long index, int value) { VH_maxTemporalLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxSpatialLayerCountAt(long index, int value) { VH_maxSpatialLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxOperatingPointsAt(long index, int value) { VH_maxOperatingPoints.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR minQIndexAt(long index, int value) { VH_minQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxQIndexAt(long index, int value) { VH_maxQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR prefersGopRemainingFramesAt(long index, int value) { VH_prefersGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR requiresGopRemainingFramesAt(long index, int value) { VH_requiresGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR stdSyntaxFlagsAt(long index, int value) { VH_stdSyntaxFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxLevel(int value) { VH_maxLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment$width(int value) { VH_codedPictureAlignment$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment$height(int value) { VH_codedPictureAlignment$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles$width(int value) { VH_maxTiles$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles$height(int value) { VH_maxTiles$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize$width(int value) { VH_minTileSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize$height(int value) { VH_minTileSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize$width(int value) { VH_maxTileSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize$height(int value) { VH_maxTileSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR superblockSizes(int value) { VH_superblockSizes.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxSingleReferenceCount(int value) { VH_maxSingleReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR singleReferenceNameMask(int value) { VH_singleReferenceNameMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundReferenceCount(int value) { VH_maxUnidirectionalCompoundReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundGroup1ReferenceCount(int value) { VH_maxUnidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR unidirectionalCompoundReferenceNameMask(int value) { VH_unidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundReferenceCount(int value) { VH_maxBidirectionalCompoundReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup1ReferenceCount(int value) { VH_maxBidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup2ReferenceCount(int value) { VH_maxBidirectionalCompoundGroup2ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR bidirectionalCompoundReferenceNameMask(int value) { VH_bidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxTemporalLayerCount(int value) { VH_maxTemporalLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxSpatialLayerCount(int value) { VH_maxSpatialLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxOperatingPoints(int value) { VH_maxOperatingPoints.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR minQIndex(int value) { VH_minQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR maxQIndex(int value) { VH_maxQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR prefersGopRemainingFrames(int value) { VH_prefersGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR requiresGopRemainingFrames(int value) { VH_requiresGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR stdSyntaxFlags(int value) { VH_stdSyntaxFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _maxLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevel, index), LAYOUT_maxLevel); }
    public MemorySegment _maxLevel() { return _maxLevelAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxLevelAt(long index, MemorySegment src) { _maxLevelAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxLevel(MemorySegment src) { return _maxLevelAt(0L, src); }
    public MemorySegment _codedPictureAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_codedPictureAlignment, index), LAYOUT_codedPictureAlignment); }
    public MemorySegment _codedPictureAlignment() { return _codedPictureAlignmentAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _codedPictureAlignmentAt(long index, MemorySegment src) { _codedPictureAlignmentAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _codedPictureAlignment(MemorySegment src) { return _codedPictureAlignmentAt(0L, src); }
    public MemorySegment _maxTilesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTiles, index), LAYOUT_maxTiles); }
    public MemorySegment _maxTiles() { return _maxTilesAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxTilesAt(long index, MemorySegment src) { _maxTilesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxTiles(MemorySegment src) { return _maxTilesAt(0L, src); }
    public MemorySegment _minTileSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minTileSize, index), LAYOUT_minTileSize); }
    public MemorySegment _minTileSize() { return _minTileSizeAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _minTileSizeAt(long index, MemorySegment src) { _minTileSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _minTileSize(MemorySegment src) { return _minTileSizeAt(0L, src); }
    public MemorySegment _maxTileSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTileSize, index), LAYOUT_maxTileSize); }
    public MemorySegment _maxTileSize() { return _maxTileSizeAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxTileSizeAt(long index, MemorySegment src) { _maxTileSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxTileSize(MemorySegment src) { return _maxTileSizeAt(0L, src); }
    public MemorySegment _superblockSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_superblockSizes, index), LAYOUT_superblockSizes); }
    public MemorySegment _superblockSizes() { return _superblockSizesAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _superblockSizesAt(long index, MemorySegment src) { _superblockSizesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _superblockSizes(MemorySegment src) { return _superblockSizesAt(0L, src); }
    public MemorySegment _maxSingleReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSingleReferenceCount, index), LAYOUT_maxSingleReferenceCount); }
    public MemorySegment _maxSingleReferenceCount() { return _maxSingleReferenceCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxSingleReferenceCountAt(long index, MemorySegment src) { _maxSingleReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxSingleReferenceCount(MemorySegment src) { return _maxSingleReferenceCountAt(0L, src); }
    public MemorySegment _singleReferenceNameMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_singleReferenceNameMask, index), LAYOUT_singleReferenceNameMask); }
    public MemorySegment _singleReferenceNameMask() { return _singleReferenceNameMaskAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _singleReferenceNameMaskAt(long index, MemorySegment src) { _singleReferenceNameMaskAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _singleReferenceNameMask(MemorySegment src) { return _singleReferenceNameMaskAt(0L, src); }
    public MemorySegment _maxUnidirectionalCompoundReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxUnidirectionalCompoundReferenceCount, index), LAYOUT_maxUnidirectionalCompoundReferenceCount); }
    public MemorySegment _maxUnidirectionalCompoundReferenceCount() { return _maxUnidirectionalCompoundReferenceCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxUnidirectionalCompoundReferenceCountAt(long index, MemorySegment src) { _maxUnidirectionalCompoundReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxUnidirectionalCompoundReferenceCount(MemorySegment src) { return _maxUnidirectionalCompoundReferenceCountAt(0L, src); }
    public MemorySegment _maxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxUnidirectionalCompoundGroup1ReferenceCount, index), LAYOUT_maxUnidirectionalCompoundGroup1ReferenceCount); }
    public MemorySegment _maxUnidirectionalCompoundGroup1ReferenceCount() { return _maxUnidirectionalCompoundGroup1ReferenceCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxUnidirectionalCompoundGroup1ReferenceCountAt(long index, MemorySegment src) { _maxUnidirectionalCompoundGroup1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment src) { return _maxUnidirectionalCompoundGroup1ReferenceCountAt(0L, src); }
    public MemorySegment _unidirectionalCompoundReferenceNameMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_unidirectionalCompoundReferenceNameMask, index), LAYOUT_unidirectionalCompoundReferenceNameMask); }
    public MemorySegment _unidirectionalCompoundReferenceNameMask() { return _unidirectionalCompoundReferenceNameMaskAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _unidirectionalCompoundReferenceNameMaskAt(long index, MemorySegment src) { _unidirectionalCompoundReferenceNameMaskAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _unidirectionalCompoundReferenceNameMask(MemorySegment src) { return _unidirectionalCompoundReferenceNameMaskAt(0L, src); }
    public MemorySegment _maxBidirectionalCompoundReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBidirectionalCompoundReferenceCount, index), LAYOUT_maxBidirectionalCompoundReferenceCount); }
    public MemorySegment _maxBidirectionalCompoundReferenceCount() { return _maxBidirectionalCompoundReferenceCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxBidirectionalCompoundReferenceCountAt(long index, MemorySegment src) { _maxBidirectionalCompoundReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxBidirectionalCompoundReferenceCount(MemorySegment src) { return _maxBidirectionalCompoundReferenceCountAt(0L, src); }
    public MemorySegment _maxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBidirectionalCompoundGroup1ReferenceCount, index), LAYOUT_maxBidirectionalCompoundGroup1ReferenceCount); }
    public MemorySegment _maxBidirectionalCompoundGroup1ReferenceCount() { return _maxBidirectionalCompoundGroup1ReferenceCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxBidirectionalCompoundGroup1ReferenceCountAt(long index, MemorySegment src) { _maxBidirectionalCompoundGroup1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment src) { return _maxBidirectionalCompoundGroup1ReferenceCountAt(0L, src); }
    public MemorySegment _maxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBidirectionalCompoundGroup2ReferenceCount, index), LAYOUT_maxBidirectionalCompoundGroup2ReferenceCount); }
    public MemorySegment _maxBidirectionalCompoundGroup2ReferenceCount() { return _maxBidirectionalCompoundGroup2ReferenceCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxBidirectionalCompoundGroup2ReferenceCountAt(long index, MemorySegment src) { _maxBidirectionalCompoundGroup2ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment src) { return _maxBidirectionalCompoundGroup2ReferenceCountAt(0L, src); }
    public MemorySegment _bidirectionalCompoundReferenceNameMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bidirectionalCompoundReferenceNameMask, index), LAYOUT_bidirectionalCompoundReferenceNameMask); }
    public MemorySegment _bidirectionalCompoundReferenceNameMask() { return _bidirectionalCompoundReferenceNameMaskAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _bidirectionalCompoundReferenceNameMaskAt(long index, MemorySegment src) { _bidirectionalCompoundReferenceNameMaskAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _bidirectionalCompoundReferenceNameMask(MemorySegment src) { return _bidirectionalCompoundReferenceNameMaskAt(0L, src); }
    public MemorySegment _maxTemporalLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTemporalLayerCount, index), LAYOUT_maxTemporalLayerCount); }
    public MemorySegment _maxTemporalLayerCount() { return _maxTemporalLayerCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxTemporalLayerCountAt(long index, MemorySegment src) { _maxTemporalLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxTemporalLayerCount(MemorySegment src) { return _maxTemporalLayerCountAt(0L, src); }
    public MemorySegment _maxSpatialLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSpatialLayerCount, index), LAYOUT_maxSpatialLayerCount); }
    public MemorySegment _maxSpatialLayerCount() { return _maxSpatialLayerCountAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxSpatialLayerCountAt(long index, MemorySegment src) { _maxSpatialLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxSpatialLayerCount(MemorySegment src) { return _maxSpatialLayerCountAt(0L, src); }
    public MemorySegment _maxOperatingPointsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxOperatingPoints, index), LAYOUT_maxOperatingPoints); }
    public MemorySegment _maxOperatingPoints() { return _maxOperatingPointsAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxOperatingPointsAt(long index, MemorySegment src) { _maxOperatingPointsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxOperatingPoints(MemorySegment src) { return _maxOperatingPointsAt(0L, src); }
    public MemorySegment _minQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQIndex, index), LAYOUT_minQIndex); }
    public MemorySegment _minQIndex() { return _minQIndexAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _minQIndexAt(long index, MemorySegment src) { _minQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _minQIndex(MemorySegment src) { return _minQIndexAt(0L, src); }
    public MemorySegment _maxQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQIndex, index), LAYOUT_maxQIndex); }
    public MemorySegment _maxQIndex() { return _maxQIndexAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _maxQIndexAt(long index, MemorySegment src) { _maxQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _maxQIndex(MemorySegment src) { return _maxQIndexAt(0L, src); }
    public MemorySegment _prefersGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersGopRemainingFrames, index), LAYOUT_prefersGopRemainingFrames); }
    public MemorySegment _prefersGopRemainingFrames() { return _prefersGopRemainingFramesAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _prefersGopRemainingFramesAt(long index, MemorySegment src) { _prefersGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _prefersGopRemainingFrames(MemorySegment src) { return _prefersGopRemainingFramesAt(0L, src); }
    public MemorySegment _requiresGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiresGopRemainingFrames, index), LAYOUT_requiresGopRemainingFrames); }
    public MemorySegment _requiresGopRemainingFrames() { return _requiresGopRemainingFramesAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _requiresGopRemainingFramesAt(long index, MemorySegment src) { _requiresGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _requiresGopRemainingFrames(MemorySegment src) { return _requiresGopRemainingFramesAt(0L, src); }
    public MemorySegment _stdSyntaxFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSyntaxFlags, index), LAYOUT_stdSyntaxFlags); }
    public MemorySegment _stdSyntaxFlags() { return _stdSyntaxFlagsAt(0L); }
    public VkVideoEncodeAV1CapabilitiesKHR _stdSyntaxFlagsAt(long index, MemorySegment src) { _stdSyntaxFlagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1CapabilitiesKHR _stdSyntaxFlags(MemorySegment src) { return _stdSyntaxFlagsAt(0L, src); }
}
