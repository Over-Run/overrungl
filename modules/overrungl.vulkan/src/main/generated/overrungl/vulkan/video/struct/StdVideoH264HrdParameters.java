// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH264HrdParameters`.
/// ## Layout
/// ```
/// struct StdVideoH264HrdParameters {
///     uint8_t cpb_cnt_minus1;
///     uint8_t bit_rate_scale;
///     uint8_t cpb_size_scale;
///     uint8_t reserved1;
///     uint32_t bit_rate_value_minus1[STD_VIDEO_H264_CPB_CNT_LIST_SIZE];
///     uint32_t cpb_size_value_minus1[STD_VIDEO_H264_CPB_CNT_LIST_SIZE];
///     uint8_t cbr_flag[STD_VIDEO_H264_CPB_CNT_LIST_SIZE];
///     uint32_t initial_cpb_removal_delay_length_minus1;
///     uint32_t cpb_removal_delay_length_minus1;
///     uint32_t dpb_output_delay_length_minus1;
///     uint32_t time_offset_length;
/// }
/// ```
public final class StdVideoH264HrdParameters extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("cpb_cnt_minus1"),
        ValueLayout.JAVA_BYTE.withName("bit_rate_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_scale"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_INT).withName("bit_rate_value_minus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_INT).withName("cpb_size_value_minus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_BYTE).withName("cbr_flag"),
        ValueLayout.JAVA_INT.withName("initial_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("dpb_output_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("time_offset_length")
    );
    public static final long OFFSET_cpb_cnt_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_cnt_minus1"));
    public static final long OFFSET_bit_rate_scale = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_scale"));
    public static final long OFFSET_cpb_size_scale = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_scale"));
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    public static final long OFFSET_bit_rate_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_value_minus1"));
    public static final long OFFSET_cpb_size_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_value_minus1"));
    public static final long OFFSET_cbr_flag = LAYOUT.byteOffset(PathElement.groupElement("cbr_flag"));
    public static final long OFFSET_initial_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    public static final long OFFSET_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    public static final long OFFSET_dpb_output_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_length_minus1"));
    public static final long OFFSET_time_offset_length = LAYOUT.byteOffset(PathElement.groupElement("time_offset_length"));
    public static final MemoryLayout LAYOUT_cpb_cnt_minus1 = LAYOUT.select(PathElement.groupElement("cpb_cnt_minus1"));
    public static final MemoryLayout LAYOUT_bit_rate_scale = LAYOUT.select(PathElement.groupElement("bit_rate_scale"));
    public static final MemoryLayout LAYOUT_cpb_size_scale = LAYOUT.select(PathElement.groupElement("cpb_size_scale"));
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    public static final MemoryLayout LAYOUT_bit_rate_value_minus1 = LAYOUT.select(PathElement.groupElement("bit_rate_value_minus1"));
    public static final MemoryLayout LAYOUT_cpb_size_value_minus1 = LAYOUT.select(PathElement.groupElement("cpb_size_value_minus1"));
    public static final MemoryLayout LAYOUT_cbr_flag = LAYOUT.select(PathElement.groupElement("cbr_flag"));
    public static final MemoryLayout LAYOUT_initial_cpb_removal_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    public static final MemoryLayout LAYOUT_cpb_removal_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    public static final MemoryLayout LAYOUT_dpb_output_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("dpb_output_delay_length_minus1"));
    public static final MemoryLayout LAYOUT_time_offset_length = LAYOUT.select(PathElement.groupElement("time_offset_length"));
    public static final VarHandle VH_cpb_cnt_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_cnt_minus1"));
    public static final VarHandle VH_bit_rate_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_scale"));
    public static final VarHandle VH_cpb_size_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_scale"));
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    public static final VarHandle VH_bit_rate_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_value_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_cpb_size_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_value_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_cbr_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cbr_flag"), PathElement.sequenceElement());
    public static final VarHandle VH_initial_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    public static final VarHandle VH_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_removal_delay_length_minus1"));
    public static final VarHandle VH_dpb_output_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
    public static final VarHandle VH_time_offset_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_offset_length"));

    public StdVideoH264HrdParameters(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH264HrdParameters of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264HrdParameters(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH264HrdParameters ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264HrdParameters(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH264HrdParameters ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264HrdParameters(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH264HrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH264HrdParameters(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH264HrdParameters alloc(SegmentAllocator allocator, long count) { return new StdVideoH264HrdParameters(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH264HrdParameters copyFrom(StdVideoH264HrdParameters src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH264HrdParameters reinterpret(long count) { return new StdVideoH264HrdParameters(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH264HrdParameters asSlice(long index) { return new StdVideoH264HrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH264HrdParameters asSlice(long index, long count) { return new StdVideoH264HrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH264HrdParameters at(long index, Consumer<StdVideoH264HrdParameters> func) { func.accept(asSlice(index)); return this; }
    public byte cpb_cnt_minus1At(long index) { return (byte) VH_cpb_cnt_minus1.get(this.segment(), 0L, index); }
    public byte bit_rate_scaleAt(long index) { return (byte) VH_bit_rate_scale.get(this.segment(), 0L, index); }
    public byte cpb_size_scaleAt(long index) { return (byte) VH_cpb_size_scale.get(this.segment(), 0L, index); }
    public byte reserved1At(long index) { return (byte) VH_reserved1.get(this.segment(), 0L, index); }
    public int bit_rate_value_minus1At(long index, long index0) { return (int) VH_bit_rate_value_minus1.get(this.segment(), 0L, index, index0); }
    public int cpb_size_value_minus1At(long index, long index0) { return (int) VH_cpb_size_value_minus1.get(this.segment(), 0L, index, index0); }
    public byte cbr_flagAt(long index, long index0) { return (byte) VH_cbr_flag.get(this.segment(), 0L, index, index0); }
    public int initial_cpb_removal_delay_length_minus1At(long index) { return (int) VH_initial_cpb_removal_delay_length_minus1.get(this.segment(), 0L, index); }
    public int cpb_removal_delay_length_minus1At(long index) { return (int) VH_cpb_removal_delay_length_minus1.get(this.segment(), 0L, index); }
    public int dpb_output_delay_length_minus1At(long index) { return (int) VH_dpb_output_delay_length_minus1.get(this.segment(), 0L, index); }
    public int time_offset_lengthAt(long index) { return (int) VH_time_offset_length.get(this.segment(), 0L, index); }
    public byte cpb_cnt_minus1() { return (byte) VH_cpb_cnt_minus1.get(this.segment(), 0L, 0L); }
    public byte bit_rate_scale() { return (byte) VH_bit_rate_scale.get(this.segment(), 0L, 0L); }
    public byte cpb_size_scale() { return (byte) VH_cpb_size_scale.get(this.segment(), 0L, 0L); }
    public byte reserved1() { return (byte) VH_reserved1.get(this.segment(), 0L, 0L); }
    public int bit_rate_value_minus1(long index0) { return (int) VH_bit_rate_value_minus1.get(this.segment(), 0L, 0L, index0); }
    public int cpb_size_value_minus1(long index0) { return (int) VH_cpb_size_value_minus1.get(this.segment(), 0L, 0L, index0); }
    public byte cbr_flag(long index0) { return (byte) VH_cbr_flag.get(this.segment(), 0L, 0L, index0); }
    public int initial_cpb_removal_delay_length_minus1() { return (int) VH_initial_cpb_removal_delay_length_minus1.get(this.segment(), 0L, 0L); }
    public int cpb_removal_delay_length_minus1() { return (int) VH_cpb_removal_delay_length_minus1.get(this.segment(), 0L, 0L); }
    public int dpb_output_delay_length_minus1() { return (int) VH_dpb_output_delay_length_minus1.get(this.segment(), 0L, 0L); }
    public int time_offset_length() { return (int) VH_time_offset_length.get(this.segment(), 0L, 0L); }
    public StdVideoH264HrdParameters cpb_cnt_minus1At(long index, byte value) { VH_cpb_cnt_minus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters bit_rate_scaleAt(long index, byte value) { VH_bit_rate_scale.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters cpb_size_scaleAt(long index, byte value) { VH_cpb_size_scale.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters reserved1At(long index, byte value) { VH_reserved1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters bit_rate_value_minus1At(long index, long index0, int value) { VH_bit_rate_value_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH264HrdParameters cpb_size_value_minus1At(long index, long index0, int value) { VH_cpb_size_value_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH264HrdParameters cbr_flagAt(long index, long index0, byte value) { VH_cbr_flag.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1At(long index, int value) { VH_initial_cpb_removal_delay_length_minus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1At(long index, int value) { VH_cpb_removal_delay_length_minus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters dpb_output_delay_length_minus1At(long index, int value) { VH_dpb_output_delay_length_minus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters time_offset_lengthAt(long index, int value) { VH_time_offset_length.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264HrdParameters cpb_cnt_minus1(byte value) { VH_cpb_cnt_minus1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters bit_rate_scale(byte value) { VH_bit_rate_scale.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters cpb_size_scale(byte value) { VH_cpb_size_scale.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters reserved1(byte value) { VH_reserved1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters bit_rate_value_minus1(long index0, int value) { VH_bit_rate_value_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH264HrdParameters cpb_size_value_minus1(long index0, int value) { VH_cpb_size_value_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH264HrdParameters cbr_flag(long index0, byte value) { VH_cbr_flag.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1(int value) { VH_initial_cpb_removal_delay_length_minus1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1(int value) { VH_cpb_removal_delay_length_minus1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters dpb_output_delay_length_minus1(int value) { VH_dpb_output_delay_length_minus1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264HrdParameters time_offset_length(int value) { VH_time_offset_length.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _cpb_cnt_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cpb_cnt_minus1, index), LAYOUT_cpb_cnt_minus1); }
    public MemorySegment _cpb_cnt_minus1() { return _cpb_cnt_minus1At(0L); }
    public StdVideoH264HrdParameters _cpb_cnt_minus1At(long index, MemorySegment src) { _cpb_cnt_minus1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _cpb_cnt_minus1(MemorySegment src) { return _cpb_cnt_minus1At(0L, src); }
    public MemorySegment _bit_rate_scaleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bit_rate_scale, index), LAYOUT_bit_rate_scale); }
    public MemorySegment _bit_rate_scale() { return _bit_rate_scaleAt(0L); }
    public StdVideoH264HrdParameters _bit_rate_scaleAt(long index, MemorySegment src) { _bit_rate_scaleAt(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _bit_rate_scale(MemorySegment src) { return _bit_rate_scaleAt(0L, src); }
    public MemorySegment _cpb_size_scaleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cpb_size_scale, index), LAYOUT_cpb_size_scale); }
    public MemorySegment _cpb_size_scale() { return _cpb_size_scaleAt(0L); }
    public StdVideoH264HrdParameters _cpb_size_scaleAt(long index, MemorySegment src) { _cpb_size_scaleAt(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _cpb_size_scale(MemorySegment src) { return _cpb_size_scaleAt(0L, src); }
    public MemorySegment _reserved1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    public MemorySegment _reserved1() { return _reserved1At(0L); }
    public StdVideoH264HrdParameters _reserved1At(long index, MemorySegment src) { _reserved1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _reserved1(MemorySegment src) { return _reserved1At(0L, src); }
    public MemorySegment _bit_rate_value_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bit_rate_value_minus1, index), LAYOUT_bit_rate_value_minus1); }
    public MemorySegment _bit_rate_value_minus1() { return _bit_rate_value_minus1At(0L); }
    public StdVideoH264HrdParameters _bit_rate_value_minus1At(long index, MemorySegment src) { _bit_rate_value_minus1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _bit_rate_value_minus1(MemorySegment src) { return _bit_rate_value_minus1At(0L, src); }
    public MemorySegment _cpb_size_value_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cpb_size_value_minus1, index), LAYOUT_cpb_size_value_minus1); }
    public MemorySegment _cpb_size_value_minus1() { return _cpb_size_value_minus1At(0L); }
    public StdVideoH264HrdParameters _cpb_size_value_minus1At(long index, MemorySegment src) { _cpb_size_value_minus1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _cpb_size_value_minus1(MemorySegment src) { return _cpb_size_value_minus1At(0L, src); }
    public MemorySegment _cbr_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cbr_flag, index), LAYOUT_cbr_flag); }
    public MemorySegment _cbr_flag() { return _cbr_flagAt(0L); }
    public StdVideoH264HrdParameters _cbr_flagAt(long index, MemorySegment src) { _cbr_flagAt(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _cbr_flag(MemorySegment src) { return _cbr_flagAt(0L, src); }
    public MemorySegment _initial_cpb_removal_delay_length_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initial_cpb_removal_delay_length_minus1, index), LAYOUT_initial_cpb_removal_delay_length_minus1); }
    public MemorySegment _initial_cpb_removal_delay_length_minus1() { return _initial_cpb_removal_delay_length_minus1At(0L); }
    public StdVideoH264HrdParameters _initial_cpb_removal_delay_length_minus1At(long index, MemorySegment src) { _initial_cpb_removal_delay_length_minus1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _initial_cpb_removal_delay_length_minus1(MemorySegment src) { return _initial_cpb_removal_delay_length_minus1At(0L, src); }
    public MemorySegment _cpb_removal_delay_length_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cpb_removal_delay_length_minus1, index), LAYOUT_cpb_removal_delay_length_minus1); }
    public MemorySegment _cpb_removal_delay_length_minus1() { return _cpb_removal_delay_length_minus1At(0L); }
    public StdVideoH264HrdParameters _cpb_removal_delay_length_minus1At(long index, MemorySegment src) { _cpb_removal_delay_length_minus1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _cpb_removal_delay_length_minus1(MemorySegment src) { return _cpb_removal_delay_length_minus1At(0L, src); }
    public MemorySegment _dpb_output_delay_length_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dpb_output_delay_length_minus1, index), LAYOUT_dpb_output_delay_length_minus1); }
    public MemorySegment _dpb_output_delay_length_minus1() { return _dpb_output_delay_length_minus1At(0L); }
    public StdVideoH264HrdParameters _dpb_output_delay_length_minus1At(long index, MemorySegment src) { _dpb_output_delay_length_minus1At(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _dpb_output_delay_length_minus1(MemorySegment src) { return _dpb_output_delay_length_minus1At(0L, src); }
    public MemorySegment _time_offset_lengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_time_offset_length, index), LAYOUT_time_offset_length); }
    public MemorySegment _time_offset_length() { return _time_offset_lengthAt(0L); }
    public StdVideoH264HrdParameters _time_offset_lengthAt(long index, MemorySegment src) { _time_offset_lengthAt(index).copyFrom(src); return this; }
    public StdVideoH264HrdParameters _time_offset_length(MemorySegment src) { return _time_offset_lengthAt(0L, src); }
}
