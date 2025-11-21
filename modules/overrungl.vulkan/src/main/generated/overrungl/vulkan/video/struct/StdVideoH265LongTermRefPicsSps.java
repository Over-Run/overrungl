// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265LongTermRefPicsSps`.
/// ## Layout
/// ```
/// struct StdVideoH265LongTermRefPicsSps {
///     uint32_t used_by_curr_pic_lt_sps_flag;
///     uint32_t lt_ref_pic_poc_lsb_sps[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS];
/// }
/// ```
public final class StdVideoH265LongTermRefPicsSps extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("used_by_curr_pic_lt_sps_flag"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS, ValueLayout.JAVA_INT).withName("lt_ref_pic_poc_lsb_sps")
    );
    public static final long OFFSET_used_by_curr_pic_lt_sps_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    public static final long OFFSET_lt_ref_pic_poc_lsb_sps = LAYOUT.byteOffset(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"));
    public static final MemoryLayout LAYOUT_used_by_curr_pic_lt_sps_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    public static final MemoryLayout LAYOUT_lt_ref_pic_poc_lsb_sps = LAYOUT.select(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"));
    public static final VarHandle VH_used_by_curr_pic_lt_sps_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
    public static final VarHandle VH_lt_ref_pic_poc_lsb_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"), PathElement.sequenceElement());

    public StdVideoH265LongTermRefPicsSps(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH265LongTermRefPicsSps of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265LongTermRefPicsSps(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH265LongTermRefPicsSps ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265LongTermRefPicsSps(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH265LongTermRefPicsSps ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265LongTermRefPicsSps(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH265LongTermRefPicsSps alloc(SegmentAllocator allocator) { return new StdVideoH265LongTermRefPicsSps(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH265LongTermRefPicsSps alloc(SegmentAllocator allocator, long count) { return new StdVideoH265LongTermRefPicsSps(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH265LongTermRefPicsSps copyFrom(StdVideoH265LongTermRefPicsSps src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH265LongTermRefPicsSps reinterpret(long count) { return new StdVideoH265LongTermRefPicsSps(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH265LongTermRefPicsSps asSlice(long index) { return new StdVideoH265LongTermRefPicsSps(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH265LongTermRefPicsSps asSlice(long index, long count) { return new StdVideoH265LongTermRefPicsSps(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH265LongTermRefPicsSps at(long index, Consumer<StdVideoH265LongTermRefPicsSps> func) { func.accept(asSlice(index)); return this; }
    public int used_by_curr_pic_lt_sps_flagAt(long index) { return (int) VH_used_by_curr_pic_lt_sps_flag.get(this.segment(), 0L, index); }
    public int lt_ref_pic_poc_lsb_spsAt(long index, long index0) { return (int) VH_lt_ref_pic_poc_lsb_sps.get(this.segment(), 0L, index, index0); }
    public int used_by_curr_pic_lt_sps_flag() { return (int) VH_used_by_curr_pic_lt_sps_flag.get(this.segment(), 0L, 0L); }
    public int lt_ref_pic_poc_lsb_sps(long index0) { return (int) VH_lt_ref_pic_poc_lsb_sps.get(this.segment(), 0L, 0L, index0); }
    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flagAt(long index, int value) { VH_used_by_curr_pic_lt_sps_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_spsAt(long index, long index0, int value) { VH_lt_ref_pic_poc_lsb_sps.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(int value) { VH_used_by_curr_pic_lt_sps_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(long index0, int value) { VH_lt_ref_pic_poc_lsb_sps.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _used_by_curr_pic_lt_sps_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_used_by_curr_pic_lt_sps_flag, index), LAYOUT_used_by_curr_pic_lt_sps_flag); }
    public MemorySegment _used_by_curr_pic_lt_sps_flag() { return _used_by_curr_pic_lt_sps_flagAt(0L); }
    public StdVideoH265LongTermRefPicsSps _used_by_curr_pic_lt_sps_flagAt(long index, MemorySegment src) { _used_by_curr_pic_lt_sps_flagAt(index).copyFrom(src); return this; }
    public StdVideoH265LongTermRefPicsSps _used_by_curr_pic_lt_sps_flag(MemorySegment src) { return _used_by_curr_pic_lt_sps_flagAt(0L, src); }
    public MemorySegment _lt_ref_pic_poc_lsb_spsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lt_ref_pic_poc_lsb_sps, index), LAYOUT_lt_ref_pic_poc_lsb_sps); }
    public MemorySegment _lt_ref_pic_poc_lsb_sps() { return _lt_ref_pic_poc_lsb_spsAt(0L); }
    public StdVideoH265LongTermRefPicsSps _lt_ref_pic_poc_lsb_spsAt(long index, MemorySegment src) { _lt_ref_pic_poc_lsb_spsAt(index).copyFrom(src); return this; }
    public StdVideoH265LongTermRefPicsSps _lt_ref_pic_poc_lsb_sps(MemorySegment src) { return _lt_ref_pic_poc_lsb_spsAt(0L, src); }
}
