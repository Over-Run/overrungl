// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1GlobalMotion`.
/// ## Layout
/// ```
/// struct StdVideoAV1GlobalMotion {
///     uint8_t GmType[STD_VIDEO_AV1_NUM_REF_FRAMES];
///     int32_t gm_params[STD_VIDEO_AV1_NUM_REF_FRAMES][STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS];
/// }
/// ```
public final class StdVideoAV1GlobalMotion extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_NUM_REF_FRAMES, ValueLayout.JAVA_BYTE).withName("GmType"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_NUM_REF_FRAMES, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS, ValueLayout.JAVA_INT)).withName("gm_params")
    );
    public static final long OFFSET_GmType = LAYOUT.byteOffset(PathElement.groupElement("GmType"));
    public static final long OFFSET_gm_params = LAYOUT.byteOffset(PathElement.groupElement("gm_params"));
    public static final MemoryLayout LAYOUT_GmType = LAYOUT.select(PathElement.groupElement("GmType"));
    public static final MemoryLayout LAYOUT_gm_params = LAYOUT.select(PathElement.groupElement("gm_params"));
    public static final VarHandle VH_GmType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("GmType"), PathElement.sequenceElement());
    public static final VarHandle VH_gm_params = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gm_params"), PathElement.sequenceElement(), PathElement.sequenceElement());

    public StdVideoAV1GlobalMotion(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoAV1GlobalMotion of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1GlobalMotion(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoAV1GlobalMotion ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1GlobalMotion(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoAV1GlobalMotion ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1GlobalMotion(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoAV1GlobalMotion alloc(SegmentAllocator allocator) { return new StdVideoAV1GlobalMotion(allocator.allocate(LAYOUT), 1); }
    public static StdVideoAV1GlobalMotion alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1GlobalMotion(allocator.allocate(LAYOUT, count), count); }
    public StdVideoAV1GlobalMotion copyFrom(StdVideoAV1GlobalMotion src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoAV1GlobalMotion reinterpret(long count) { return new StdVideoAV1GlobalMotion(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoAV1GlobalMotion asSlice(long index) { return new StdVideoAV1GlobalMotion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoAV1GlobalMotion asSlice(long index, long count) { return new StdVideoAV1GlobalMotion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoAV1GlobalMotion at(long index, Consumer<StdVideoAV1GlobalMotion> func) { func.accept(asSlice(index)); return this; }
    public byte GmTypeAt(long index, long index0) { return (byte) VH_GmType.get(this.segment(), 0L, index, index0); }
    public int gm_paramsAt(long index, long index0, long index1) { return (int) VH_gm_params.get(this.segment(), 0L, index, index0, index1); }
    public byte GmType(long index0) { return (byte) VH_GmType.get(this.segment(), 0L, 0L, index0); }
    public int gm_params(long index0, long index1) { return (int) VH_gm_params.get(this.segment(), 0L, 0L, index0, index1); }
    public StdVideoAV1GlobalMotion GmTypeAt(long index, long index0, byte value) { VH_GmType.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1GlobalMotion gm_paramsAt(long index, long index0, long index1, int value) { VH_gm_params.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoAV1GlobalMotion GmType(long index0, byte value) { VH_GmType.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoAV1GlobalMotion gm_params(long index0, long index1, int value) { VH_gm_params.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public MemorySegment _GmTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_GmType, index), LAYOUT_GmType); }
    public MemorySegment _GmType() { return _GmTypeAt(0L); }
    public StdVideoAV1GlobalMotion _GmTypeAt(long index, MemorySegment src) { _GmTypeAt(index).copyFrom(src); return this; }
    public StdVideoAV1GlobalMotion _GmType(MemorySegment src) { return _GmTypeAt(0L, src); }
    public MemorySegment _gm_paramsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gm_params, index), LAYOUT_gm_params); }
    public MemorySegment _gm_params() { return _gm_paramsAt(0L); }
    public StdVideoAV1GlobalMotion _gm_paramsAt(long index, MemorySegment src) { _gm_paramsAt(index).copyFrom(src); return this; }
    public StdVideoAV1GlobalMotion _gm_params(MemorySegment src) { return _gm_paramsAt(0L, src); }
}
