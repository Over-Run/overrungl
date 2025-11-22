// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1LoopRestoration`.
/// ## Layout
/// ```
/// struct StdVideoAV1LoopRestoration {
///     StdVideoAV1FrameRestorationType FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES];
///     uint16_t LoopRestorationSize[STD_VIDEO_AV1_MAX_NUM_PLANES];
/// }
/// ```
public final class StdVideoAV1LoopRestoration extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_NUM_PLANES, ValueLayout.JAVA_INT).withName("FrameRestorationType"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_NUM_PLANES, ValueLayout.JAVA_SHORT).withName("LoopRestorationSize")
    );
    public static final long OFFSET_FrameRestorationType = LAYOUT.byteOffset(PathElement.groupElement("FrameRestorationType"));
    public static final long OFFSET_LoopRestorationSize = LAYOUT.byteOffset(PathElement.groupElement("LoopRestorationSize"));
    public static final MemoryLayout LAYOUT_FrameRestorationType = LAYOUT.select(PathElement.groupElement("FrameRestorationType"));
    public static final MemoryLayout LAYOUT_LoopRestorationSize = LAYOUT.select(PathElement.groupElement("LoopRestorationSize"));
    public static final VarHandle VH_FrameRestorationType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameRestorationType"), PathElement.sequenceElement());
    public static final VarHandle VH_LoopRestorationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("LoopRestorationSize"), PathElement.sequenceElement());

    public StdVideoAV1LoopRestoration(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoAV1LoopRestoration of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopRestoration(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoAV1LoopRestoration ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopRestoration(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoAV1LoopRestoration ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopRestoration(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoAV1LoopRestoration alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopRestoration(allocator.allocate(LAYOUT), 1); }
    public static StdVideoAV1LoopRestoration alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1LoopRestoration(allocator.allocate(LAYOUT, count), count); }
    public StdVideoAV1LoopRestoration copyFrom(StdVideoAV1LoopRestoration src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoAV1LoopRestoration reinterpret(long count) { return new StdVideoAV1LoopRestoration(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoAV1LoopRestoration asSlice(long index) { return new StdVideoAV1LoopRestoration(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoAV1LoopRestoration asSlice(long index, long count) { return new StdVideoAV1LoopRestoration(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoAV1LoopRestoration at(long index, Consumer<StdVideoAV1LoopRestoration> func) { func.accept(asSlice(index)); return this; }
    public int FrameRestorationTypeAt(long index, long index0) { return (int) VH_FrameRestorationType.get(this.segment(), 0L, index, index0); }
    public short LoopRestorationSizeAt(long index, long index0) { return (short) VH_LoopRestorationSize.get(this.segment(), 0L, index, index0); }
    public int FrameRestorationType(long index0) { return (int) VH_FrameRestorationType.get(this.segment(), 0L, 0L, index0); }
    public short LoopRestorationSize(long index0) { return (short) VH_LoopRestorationSize.get(this.segment(), 0L, 0L, index0); }
    public StdVideoAV1LoopRestoration FrameRestorationTypeAt(long index, long index0, int value) { VH_FrameRestorationType.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1LoopRestoration LoopRestorationSizeAt(long index, long index0, short value) { VH_LoopRestorationSize.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1LoopRestoration FrameRestorationType(long index0, int value) { VH_FrameRestorationType.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoAV1LoopRestoration LoopRestorationSize(long index0, short value) { VH_LoopRestorationSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _FrameRestorationTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_FrameRestorationType, index), LAYOUT_FrameRestorationType); }
    public MemorySegment _FrameRestorationType() { return _FrameRestorationTypeAt(0L); }
    public StdVideoAV1LoopRestoration _FrameRestorationTypeAt(long index, MemorySegment src) { _FrameRestorationTypeAt(index).copyFrom(src); return this; }
    public StdVideoAV1LoopRestoration _FrameRestorationType(MemorySegment src) { return _FrameRestorationTypeAt(0L, src); }
    public MemorySegment _LoopRestorationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_LoopRestorationSize, index), LAYOUT_LoopRestorationSize); }
    public MemorySegment _LoopRestorationSize() { return _LoopRestorationSizeAt(0L); }
    public StdVideoAV1LoopRestoration _LoopRestorationSizeAt(long index, MemorySegment src) { _LoopRestorationSizeAt(index).copyFrom(src); return this; }
    public StdVideoAV1LoopRestoration _LoopRestorationSize(MemorySegment src) { return _LoopRestorationSizeAt(0L, src); }
}
