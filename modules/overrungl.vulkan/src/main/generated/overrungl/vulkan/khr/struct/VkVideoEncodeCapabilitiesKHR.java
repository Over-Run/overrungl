// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeCapabilityFlagsKHR flags;
///     VkVideoEncodeRateControlModeFlagsKHR rateControlModes;
///     uint32_t maxRateControlLayers;
///     uint64_t maxBitrate;
///     uint32_t maxQualityLevels;
///     VkExtent2D encodeInputPictureGranularity;
///     VkVideoEncodeFeedbackFlagsKHR supportedEncodeFeedbackFlags;
/// }
/// ```
public final class VkVideoEncodeCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlModes"),
        ValueLayout.JAVA_INT.withName("maxRateControlLayers"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("maxQualityLevels"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("encodeInputPictureGranularity"),
        ValueLayout.JAVA_INT.withName("supportedEncodeFeedbackFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_rateControlModes = LAYOUT.byteOffset(PathElement.groupElement("rateControlModes"));
    public static final long OFFSET_maxRateControlLayers = LAYOUT.byteOffset(PathElement.groupElement("maxRateControlLayers"));
    public static final long OFFSET_maxBitrate = LAYOUT.byteOffset(PathElement.groupElement("maxBitrate"));
    public static final long OFFSET_maxQualityLevels = LAYOUT.byteOffset(PathElement.groupElement("maxQualityLevels"));
    public static final long OFFSET_encodeInputPictureGranularity = LAYOUT.byteOffset(PathElement.groupElement("encodeInputPictureGranularity"));
    public static final long OFFSET_supportedEncodeFeedbackFlags = LAYOUT.byteOffset(PathElement.groupElement("supportedEncodeFeedbackFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_rateControlModes = LAYOUT.select(PathElement.groupElement("rateControlModes"));
    public static final MemoryLayout LAYOUT_maxRateControlLayers = LAYOUT.select(PathElement.groupElement("maxRateControlLayers"));
    public static final MemoryLayout LAYOUT_maxBitrate = LAYOUT.select(PathElement.groupElement("maxBitrate"));
    public static final MemoryLayout LAYOUT_maxQualityLevels = LAYOUT.select(PathElement.groupElement("maxQualityLevels"));
    public static final MemoryLayout LAYOUT_encodeInputPictureGranularity = LAYOUT.select(PathElement.groupElement("encodeInputPictureGranularity"));
    public static final MemoryLayout LAYOUT_supportedEncodeFeedbackFlags = LAYOUT.select(PathElement.groupElement("supportedEncodeFeedbackFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_rateControlModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlModes"));
    public static final VarHandle VH_maxRateControlLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRateControlLayers"));
    public static final VarHandle VH_maxBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBitrate"));
    public static final VarHandle VH_maxQualityLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQualityLevels"));
    public static final VarHandle VH_encodeInputPictureGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("encodeInputPictureGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_encodeInputPictureGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("encodeInputPictureGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_supportedEncodeFeedbackFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedEncodeFeedbackFlags"));

    public VkVideoEncodeCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeCapabilitiesKHR copyFrom(VkVideoEncodeCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeCapabilitiesKHR at(long index, Consumer<VkVideoEncodeCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int rateControlModesAt(long index) { return (int) VH_rateControlModes.get(this.segment(), 0L, index); }
    public int maxRateControlLayersAt(long index) { return (int) VH_maxRateControlLayers.get(this.segment(), 0L, index); }
    public long maxBitrateAt(long index) { return (long) VH_maxBitrate.get(this.segment(), 0L, index); }
    public int maxQualityLevelsAt(long index) { return (int) VH_maxQualityLevels.get(this.segment(), 0L, index); }
    public int encodeInputPictureGranularity$widthAt(long index) { return (int) VH_encodeInputPictureGranularity$width.get(this.segment(), 0L, index); }
    public int encodeInputPictureGranularity$heightAt(long index) { return (int) VH_encodeInputPictureGranularity$height.get(this.segment(), 0L, index); }
    public int supportedEncodeFeedbackFlagsAt(long index) { return (int) VH_supportedEncodeFeedbackFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int rateControlModes() { return (int) VH_rateControlModes.get(this.segment(), 0L, 0L); }
    public int maxRateControlLayers() { return (int) VH_maxRateControlLayers.get(this.segment(), 0L, 0L); }
    public long maxBitrate() { return (long) VH_maxBitrate.get(this.segment(), 0L, 0L); }
    public int maxQualityLevels() { return (int) VH_maxQualityLevels.get(this.segment(), 0L, 0L); }
    public int encodeInputPictureGranularity$width() { return (int) VH_encodeInputPictureGranularity$width.get(this.segment(), 0L, 0L); }
    public int encodeInputPictureGranularity$height() { return (int) VH_encodeInputPictureGranularity$height.get(this.segment(), 0L, 0L); }
    public int supportedEncodeFeedbackFlags() { return (int) VH_supportedEncodeFeedbackFlags.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR rateControlModesAt(long index, int value) { VH_rateControlModes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayersAt(long index, int value) { VH_maxRateControlLayers.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR maxBitrateAt(long index, long value) { VH_maxBitrate.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR maxQualityLevelsAt(long index, int value) { VH_maxQualityLevels.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity$widthAt(long index, int value) { VH_encodeInputPictureGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity$heightAt(long index, int value) { VH_encodeInputPictureGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlagsAt(long index, int value) { VH_supportedEncodeFeedbackFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR rateControlModes(int value) { VH_rateControlModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayers(int value) { VH_maxRateControlLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR maxBitrate(long value) { VH_maxBitrate.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR maxQualityLevels(int value) { VH_maxQualityLevels.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity$width(int value) { VH_encodeInputPictureGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity$height(int value) { VH_encodeInputPictureGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlags(int value) { VH_supportedEncodeFeedbackFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _rateControlModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rateControlModes, index), LAYOUT_rateControlModes); }
    public MemorySegment _rateControlModes() { return _rateControlModesAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _rateControlModesAt(long index, MemorySegment src) { _rateControlModesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _rateControlModes(MemorySegment src) { return _rateControlModesAt(0L, src); }
    public MemorySegment _maxRateControlLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRateControlLayers, index), LAYOUT_maxRateControlLayers); }
    public MemorySegment _maxRateControlLayers() { return _maxRateControlLayersAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _maxRateControlLayersAt(long index, MemorySegment src) { _maxRateControlLayersAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _maxRateControlLayers(MemorySegment src) { return _maxRateControlLayersAt(0L, src); }
    public MemorySegment _maxBitrateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBitrate, index), LAYOUT_maxBitrate); }
    public MemorySegment _maxBitrate() { return _maxBitrateAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _maxBitrateAt(long index, MemorySegment src) { _maxBitrateAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _maxBitrate(MemorySegment src) { return _maxBitrateAt(0L, src); }
    public MemorySegment _maxQualityLevelsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQualityLevels, index), LAYOUT_maxQualityLevels); }
    public MemorySegment _maxQualityLevels() { return _maxQualityLevelsAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _maxQualityLevelsAt(long index, MemorySegment src) { _maxQualityLevelsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _maxQualityLevels(MemorySegment src) { return _maxQualityLevelsAt(0L, src); }
    public MemorySegment _encodeInputPictureGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_encodeInputPictureGranularity, index), LAYOUT_encodeInputPictureGranularity); }
    public MemorySegment _encodeInputPictureGranularity() { return _encodeInputPictureGranularityAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _encodeInputPictureGranularityAt(long index, MemorySegment src) { _encodeInputPictureGranularityAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _encodeInputPictureGranularity(MemorySegment src) { return _encodeInputPictureGranularityAt(0L, src); }
    public MemorySegment _supportedEncodeFeedbackFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedEncodeFeedbackFlags, index), LAYOUT_supportedEncodeFeedbackFlags); }
    public MemorySegment _supportedEncodeFeedbackFlags() { return _supportedEncodeFeedbackFlagsAt(0L); }
    public VkVideoEncodeCapabilitiesKHR _supportedEncodeFeedbackFlagsAt(long index, MemorySegment src) { _supportedEncodeFeedbackFlagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeCapabilitiesKHR _supportedEncodeFeedbackFlags(MemorySegment src) { return _supportedEncodeFeedbackFlagsAt(0L, src); }
}
