// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1Segmentation`.
/// ## Layout
/// ```
/// struct StdVideoAV1Segmentation {
///     uint8_t FeatureEnabled[STD_VIDEO_AV1_MAX_SEGMENTS];
///     int16_t FeatureData[STD_VIDEO_AV1_MAX_SEGMENTS][STD_VIDEO_AV1_SEG_LVL_MAX];
/// }
/// ```
public final class StdVideoAV1Segmentation extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_SEGMENTS, ValueLayout.JAVA_BYTE).withName("FeatureEnabled"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_SEGMENTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_SEG_LVL_MAX, ValueLayout.JAVA_SHORT)).withName("FeatureData")
    );
    public static final long OFFSET_FeatureEnabled = LAYOUT.byteOffset(PathElement.groupElement("FeatureEnabled"));
    public static final long OFFSET_FeatureData = LAYOUT.byteOffset(PathElement.groupElement("FeatureData"));
    public static final MemoryLayout LAYOUT_FeatureEnabled = LAYOUT.select(PathElement.groupElement("FeatureEnabled"));
    public static final MemoryLayout LAYOUT_FeatureData = LAYOUT.select(PathElement.groupElement("FeatureData"));
    public static final VarHandle VH_FeatureEnabled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FeatureEnabled"), PathElement.sequenceElement());
    public static final VarHandle VH_FeatureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FeatureData"), PathElement.sequenceElement(), PathElement.sequenceElement());

    public StdVideoAV1Segmentation(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoAV1Segmentation of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoAV1Segmentation ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoAV1Segmentation ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoAV1Segmentation alloc(SegmentAllocator allocator) { return new StdVideoAV1Segmentation(allocator.allocate(LAYOUT), 1); }
    public static StdVideoAV1Segmentation alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1Segmentation(allocator.allocate(LAYOUT, count), count); }
    public StdVideoAV1Segmentation copyFrom(StdVideoAV1Segmentation src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoAV1Segmentation reinterpret(long count) { return new StdVideoAV1Segmentation(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoAV1Segmentation asSlice(long index) { return new StdVideoAV1Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoAV1Segmentation asSlice(long index, long count) { return new StdVideoAV1Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoAV1Segmentation at(long index, Consumer<StdVideoAV1Segmentation> func) { func.accept(asSlice(index)); return this; }
    public byte FeatureEnabledAt(long index, long index0) { return (byte) VH_FeatureEnabled.get(this.segment(), 0L, index, index0); }
    public short FeatureDataAt(long index, long index0, long index1) { return (short) VH_FeatureData.get(this.segment(), 0L, index, index0, index1); }
    public byte FeatureEnabled(long index0) { return (byte) VH_FeatureEnabled.get(this.segment(), 0L, 0L, index0); }
    public short FeatureData(long index0, long index1) { return (short) VH_FeatureData.get(this.segment(), 0L, 0L, index0, index1); }
    public StdVideoAV1Segmentation FeatureEnabledAt(long index, long index0, byte value) { VH_FeatureEnabled.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1Segmentation FeatureDataAt(long index, long index0, long index1, short value) { VH_FeatureData.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoAV1Segmentation FeatureEnabled(long index0, byte value) { VH_FeatureEnabled.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoAV1Segmentation FeatureData(long index0, long index1, short value) { VH_FeatureData.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public MemorySegment _FeatureEnabledAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_FeatureEnabled, index), LAYOUT_FeatureEnabled); }
    public MemorySegment _FeatureEnabled() { return _FeatureEnabledAt(0L); }
    public StdVideoAV1Segmentation _FeatureEnabledAt(long index, MemorySegment src) { _FeatureEnabledAt(index).copyFrom(src); return this; }
    public StdVideoAV1Segmentation _FeatureEnabled(MemorySegment src) { return _FeatureEnabledAt(0L, src); }
    public MemorySegment _FeatureDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_FeatureData, index), LAYOUT_FeatureData); }
    public MemorySegment _FeatureData() { return _FeatureDataAt(0L); }
    public StdVideoAV1Segmentation _FeatureDataAt(long index, MemorySegment src) { _FeatureDataAt(index).copyFrom(src); return this; }
    public StdVideoAV1Segmentation _FeatureData(MemorySegment src) { return _FeatureDataAt(0L, src); }
}
