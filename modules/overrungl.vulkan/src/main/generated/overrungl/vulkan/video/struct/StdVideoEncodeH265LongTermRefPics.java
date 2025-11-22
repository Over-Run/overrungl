// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH265LongTermRefPics`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH265LongTermRefPics {
///     uint8_t num_long_term_sps;
///     uint8_t num_long_term_pics;
///     uint8_t lt_idx_sps[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS];
///     uint8_t poc_lsb_lt[STD_VIDEO_H265_MAX_LONG_TERM_PICS];
///     uint16_t used_by_curr_pic_lt_flag;
///     uint8_t delta_poc_msb_present_flag[STD_VIDEO_H265_MAX_DELTA_POC];
///     uint8_t delta_poc_msb_cycle_lt[STD_VIDEO_H265_MAX_DELTA_POC];
/// }
/// ```
public final class StdVideoEncodeH265LongTermRefPics extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("num_long_term_sps"),
        ValueLayout.JAVA_BYTE.withName("num_long_term_pics"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS, ValueLayout.JAVA_BYTE).withName("lt_idx_sps"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_MAX_LONG_TERM_PICS, ValueLayout.JAVA_BYTE).withName("poc_lsb_lt"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_lt_flag"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_MAX_DELTA_POC, ValueLayout.JAVA_BYTE).withName("delta_poc_msb_present_flag"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_MAX_DELTA_POC, ValueLayout.JAVA_BYTE).withName("delta_poc_msb_cycle_lt")
    );
    public static final long OFFSET_num_long_term_sps = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_sps"));
    public static final long OFFSET_num_long_term_pics = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_pics"));
    public static final long OFFSET_lt_idx_sps = LAYOUT.byteOffset(PathElement.groupElement("lt_idx_sps"));
    public static final long OFFSET_poc_lsb_lt = LAYOUT.byteOffset(PathElement.groupElement("poc_lsb_lt"));
    public static final long OFFSET_used_by_curr_pic_lt_flag = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    public static final long OFFSET_delta_poc_msb_present_flag = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_msb_present_flag"));
    public static final long OFFSET_delta_poc_msb_cycle_lt = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_msb_cycle_lt"));
    public static final MemoryLayout LAYOUT_num_long_term_sps = LAYOUT.select(PathElement.groupElement("num_long_term_sps"));
    public static final MemoryLayout LAYOUT_num_long_term_pics = LAYOUT.select(PathElement.groupElement("num_long_term_pics"));
    public static final MemoryLayout LAYOUT_lt_idx_sps = LAYOUT.select(PathElement.groupElement("lt_idx_sps"));
    public static final MemoryLayout LAYOUT_poc_lsb_lt = LAYOUT.select(PathElement.groupElement("poc_lsb_lt"));
    public static final MemoryLayout LAYOUT_used_by_curr_pic_lt_flag = LAYOUT.select(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    public static final MemoryLayout LAYOUT_delta_poc_msb_present_flag = LAYOUT.select(PathElement.groupElement("delta_poc_msb_present_flag"));
    public static final MemoryLayout LAYOUT_delta_poc_msb_cycle_lt = LAYOUT.select(PathElement.groupElement("delta_poc_msb_cycle_lt"));
    public static final VarHandle VH_num_long_term_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_sps"));
    public static final VarHandle VH_num_long_term_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_long_term_pics"));
    public static final VarHandle VH_lt_idx_sps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lt_idx_sps"), PathElement.sequenceElement());
    public static final VarHandle VH_poc_lsb_lt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poc_lsb_lt"), PathElement.sequenceElement());
    public static final VarHandle VH_used_by_curr_pic_lt_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_by_curr_pic_lt_flag"));
    public static final VarHandle VH_delta_poc_msb_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_msb_present_flag"), PathElement.sequenceElement());
    public static final VarHandle VH_delta_poc_msb_cycle_lt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_poc_msb_cycle_lt"), PathElement.sequenceElement());

    public StdVideoEncodeH265LongTermRefPics(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeH265LongTermRefPics of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeH265LongTermRefPics ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeH265LongTermRefPics ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265LongTermRefPics(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeH265LongTermRefPics alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265LongTermRefPics(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeH265LongTermRefPics alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265LongTermRefPics(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeH265LongTermRefPics copyFrom(StdVideoEncodeH265LongTermRefPics src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeH265LongTermRefPics reinterpret(long count) { return new StdVideoEncodeH265LongTermRefPics(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeH265LongTermRefPics asSlice(long index) { return new StdVideoEncodeH265LongTermRefPics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeH265LongTermRefPics asSlice(long index, long count) { return new StdVideoEncodeH265LongTermRefPics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeH265LongTermRefPics at(long index, Consumer<StdVideoEncodeH265LongTermRefPics> func) { func.accept(asSlice(index)); return this; }
    public byte num_long_term_spsAt(long index) { return (byte) VH_num_long_term_sps.get(this.segment(), 0L, index); }
    public byte num_long_term_picsAt(long index) { return (byte) VH_num_long_term_pics.get(this.segment(), 0L, index); }
    public byte lt_idx_spsAt(long index, long index0) { return (byte) VH_lt_idx_sps.get(this.segment(), 0L, index, index0); }
    public byte poc_lsb_ltAt(long index, long index0) { return (byte) VH_poc_lsb_lt.get(this.segment(), 0L, index, index0); }
    public short used_by_curr_pic_lt_flagAt(long index) { return (short) VH_used_by_curr_pic_lt_flag.get(this.segment(), 0L, index); }
    public byte delta_poc_msb_present_flagAt(long index, long index0) { return (byte) VH_delta_poc_msb_present_flag.get(this.segment(), 0L, index, index0); }
    public byte delta_poc_msb_cycle_ltAt(long index, long index0) { return (byte) VH_delta_poc_msb_cycle_lt.get(this.segment(), 0L, index, index0); }
    public byte num_long_term_sps() { return (byte) VH_num_long_term_sps.get(this.segment(), 0L, 0L); }
    public byte num_long_term_pics() { return (byte) VH_num_long_term_pics.get(this.segment(), 0L, 0L); }
    public byte lt_idx_sps(long index0) { return (byte) VH_lt_idx_sps.get(this.segment(), 0L, 0L, index0); }
    public byte poc_lsb_lt(long index0) { return (byte) VH_poc_lsb_lt.get(this.segment(), 0L, 0L, index0); }
    public short used_by_curr_pic_lt_flag() { return (short) VH_used_by_curr_pic_lt_flag.get(this.segment(), 0L, 0L); }
    public byte delta_poc_msb_present_flag(long index0) { return (byte) VH_delta_poc_msb_present_flag.get(this.segment(), 0L, 0L, index0); }
    public byte delta_poc_msb_cycle_lt(long index0) { return (byte) VH_delta_poc_msb_cycle_lt.get(this.segment(), 0L, 0L, index0); }
    public StdVideoEncodeH265LongTermRefPics num_long_term_spsAt(long index, byte value) { VH_num_long_term_sps.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265LongTermRefPics num_long_term_picsAt(long index, byte value) { VH_num_long_term_pics.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265LongTermRefPics lt_idx_spsAt(long index, long index0, byte value) { VH_lt_idx_sps.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics poc_lsb_ltAt(long index, long index0, byte value) { VH_poc_lsb_lt.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flagAt(long index, short value) { VH_used_by_curr_pic_lt_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flagAt(long index, long index0, byte value) { VH_delta_poc_msb_present_flag.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_ltAt(long index, long index0, byte value) { VH_delta_poc_msb_cycle_lt.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics num_long_term_sps(byte value) { VH_num_long_term_sps.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH265LongTermRefPics num_long_term_pics(byte value) { VH_num_long_term_pics.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(long index0, byte value) { VH_lt_idx_sps.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(long index0, byte value) { VH_poc_lsb_lt.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flag(short value) { VH_used_by_curr_pic_lt_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(long index0, byte value) { VH_delta_poc_msb_present_flag.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(long index0, byte value) { VH_delta_poc_msb_cycle_lt.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _num_long_term_spsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_num_long_term_sps, index), LAYOUT_num_long_term_sps); }
    public MemorySegment _num_long_term_sps() { return _num_long_term_spsAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _num_long_term_spsAt(long index, MemorySegment src) { _num_long_term_spsAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _num_long_term_sps(MemorySegment src) { return _num_long_term_spsAt(0L, src); }
    public MemorySegment _num_long_term_picsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_num_long_term_pics, index), LAYOUT_num_long_term_pics); }
    public MemorySegment _num_long_term_pics() { return _num_long_term_picsAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _num_long_term_picsAt(long index, MemorySegment src) { _num_long_term_picsAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _num_long_term_pics(MemorySegment src) { return _num_long_term_picsAt(0L, src); }
    public MemorySegment _lt_idx_spsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lt_idx_sps, index), LAYOUT_lt_idx_sps); }
    public MemorySegment _lt_idx_sps() { return _lt_idx_spsAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _lt_idx_spsAt(long index, MemorySegment src) { _lt_idx_spsAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _lt_idx_sps(MemorySegment src) { return _lt_idx_spsAt(0L, src); }
    public MemorySegment _poc_lsb_ltAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_poc_lsb_lt, index), LAYOUT_poc_lsb_lt); }
    public MemorySegment _poc_lsb_lt() { return _poc_lsb_ltAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _poc_lsb_ltAt(long index, MemorySegment src) { _poc_lsb_ltAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _poc_lsb_lt(MemorySegment src) { return _poc_lsb_ltAt(0L, src); }
    public MemorySegment _used_by_curr_pic_lt_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_used_by_curr_pic_lt_flag, index), LAYOUT_used_by_curr_pic_lt_flag); }
    public MemorySegment _used_by_curr_pic_lt_flag() { return _used_by_curr_pic_lt_flagAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _used_by_curr_pic_lt_flagAt(long index, MemorySegment src) { _used_by_curr_pic_lt_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _used_by_curr_pic_lt_flag(MemorySegment src) { return _used_by_curr_pic_lt_flagAt(0L, src); }
    public MemorySegment _delta_poc_msb_present_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_delta_poc_msb_present_flag, index), LAYOUT_delta_poc_msb_present_flag); }
    public MemorySegment _delta_poc_msb_present_flag() { return _delta_poc_msb_present_flagAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _delta_poc_msb_present_flagAt(long index, MemorySegment src) { _delta_poc_msb_present_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _delta_poc_msb_present_flag(MemorySegment src) { return _delta_poc_msb_present_flagAt(0L, src); }
    public MemorySegment _delta_poc_msb_cycle_ltAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_delta_poc_msb_cycle_lt, index), LAYOUT_delta_poc_msb_cycle_lt); }
    public MemorySegment _delta_poc_msb_cycle_lt() { return _delta_poc_msb_cycle_ltAt(0L); }
    public StdVideoEncodeH265LongTermRefPics _delta_poc_msb_cycle_ltAt(long index, MemorySegment src) { _delta_poc_msb_cycle_ltAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265LongTermRefPics _delta_poc_msb_cycle_lt(MemorySegment src) { return _delta_poc_msb_cycle_ltAt(0L, src); }
}
