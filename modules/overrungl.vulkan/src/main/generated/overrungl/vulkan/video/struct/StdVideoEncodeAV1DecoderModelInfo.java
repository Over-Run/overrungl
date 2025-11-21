// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeAV1DecoderModelInfo`.
/// ## Layout
/// ```
/// struct StdVideoEncodeAV1DecoderModelInfo {
///     uint8_t buffer_delay_length_minus_1;
///     uint8_t buffer_removal_time_length_minus_1;
///     uint8_t frame_presentation_time_length_minus_1;
///     uint8_t reserved1;
///     uint32_t num_units_in_decoding_tick;
/// }
/// ```
public final class StdVideoEncodeAV1DecoderModelInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("buffer_delay_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("buffer_removal_time_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("frame_presentation_time_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("num_units_in_decoding_tick")
    );
    public static final long OFFSET_buffer_delay_length_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("buffer_delay_length_minus_1"));
    public static final long OFFSET_buffer_removal_time_length_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("buffer_removal_time_length_minus_1"));
    public static final long OFFSET_frame_presentation_time_length_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("frame_presentation_time_length_minus_1"));
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    public static final long OFFSET_num_units_in_decoding_tick = LAYOUT.byteOffset(PathElement.groupElement("num_units_in_decoding_tick"));
    public static final MemoryLayout LAYOUT_buffer_delay_length_minus_1 = LAYOUT.select(PathElement.groupElement("buffer_delay_length_minus_1"));
    public static final MemoryLayout LAYOUT_buffer_removal_time_length_minus_1 = LAYOUT.select(PathElement.groupElement("buffer_removal_time_length_minus_1"));
    public static final MemoryLayout LAYOUT_frame_presentation_time_length_minus_1 = LAYOUT.select(PathElement.groupElement("frame_presentation_time_length_minus_1"));
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    public static final MemoryLayout LAYOUT_num_units_in_decoding_tick = LAYOUT.select(PathElement.groupElement("num_units_in_decoding_tick"));
    public static final VarHandle VH_buffer_delay_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer_delay_length_minus_1"));
    public static final VarHandle VH_buffer_removal_time_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer_removal_time_length_minus_1"));
    public static final VarHandle VH_frame_presentation_time_length_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_presentation_time_length_minus_1"));
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    public static final VarHandle VH_num_units_in_decoding_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_units_in_decoding_tick"));

    public StdVideoEncodeAV1DecoderModelInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeAV1DecoderModelInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1DecoderModelInfo(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeAV1DecoderModelInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1DecoderModelInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeAV1DecoderModelInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1DecoderModelInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeAV1DecoderModelInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1DecoderModelInfo(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeAV1DecoderModelInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1DecoderModelInfo(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeAV1DecoderModelInfo copyFrom(StdVideoEncodeAV1DecoderModelInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeAV1DecoderModelInfo reinterpret(long count) { return new StdVideoEncodeAV1DecoderModelInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeAV1DecoderModelInfo asSlice(long index) { return new StdVideoEncodeAV1DecoderModelInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeAV1DecoderModelInfo asSlice(long index, long count) { return new StdVideoEncodeAV1DecoderModelInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeAV1DecoderModelInfo at(long index, Consumer<StdVideoEncodeAV1DecoderModelInfo> func) { func.accept(asSlice(index)); return this; }
    public byte buffer_delay_length_minus_1At(long index) { return (byte) VH_buffer_delay_length_minus_1.get(this.segment(), 0L, index); }
    public byte buffer_removal_time_length_minus_1At(long index) { return (byte) VH_buffer_removal_time_length_minus_1.get(this.segment(), 0L, index); }
    public byte frame_presentation_time_length_minus_1At(long index) { return (byte) VH_frame_presentation_time_length_minus_1.get(this.segment(), 0L, index); }
    public byte reserved1At(long index) { return (byte) VH_reserved1.get(this.segment(), 0L, index); }
    public int num_units_in_decoding_tickAt(long index) { return (int) VH_num_units_in_decoding_tick.get(this.segment(), 0L, index); }
    public byte buffer_delay_length_minus_1() { return (byte) VH_buffer_delay_length_minus_1.get(this.segment(), 0L, 0L); }
    public byte buffer_removal_time_length_minus_1() { return (byte) VH_buffer_removal_time_length_minus_1.get(this.segment(), 0L, 0L); }
    public byte frame_presentation_time_length_minus_1() { return (byte) VH_frame_presentation_time_length_minus_1.get(this.segment(), 0L, 0L); }
    public byte reserved1() { return (byte) VH_reserved1.get(this.segment(), 0L, 0L); }
    public int num_units_in_decoding_tick() { return (int) VH_num_units_in_decoding_tick.get(this.segment(), 0L, 0L); }
    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1At(long index, byte value) { VH_buffer_delay_length_minus_1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1At(long index, byte value) { VH_buffer_removal_time_length_minus_1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1At(long index, byte value) { VH_frame_presentation_time_length_minus_1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo reserved1At(long index, byte value) { VH_reserved1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tickAt(long index, int value) { VH_num_units_in_decoding_tick.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1(byte value) { VH_buffer_delay_length_minus_1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1(byte value) { VH_buffer_removal_time_length_minus_1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1(byte value) { VH_frame_presentation_time_length_minus_1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo reserved1(byte value) { VH_reserved1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tick(int value) { VH_num_units_in_decoding_tick.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _buffer_delay_length_minus_1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer_delay_length_minus_1, index), LAYOUT_buffer_delay_length_minus_1); }
    public MemorySegment _buffer_delay_length_minus_1() { return _buffer_delay_length_minus_1At(0L); }
    public StdVideoEncodeAV1DecoderModelInfo _buffer_delay_length_minus_1At(long index, MemorySegment src) { _buffer_delay_length_minus_1At(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1DecoderModelInfo _buffer_delay_length_minus_1(MemorySegment src) { return _buffer_delay_length_minus_1At(0L, src); }
    public MemorySegment _buffer_removal_time_length_minus_1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer_removal_time_length_minus_1, index), LAYOUT_buffer_removal_time_length_minus_1); }
    public MemorySegment _buffer_removal_time_length_minus_1() { return _buffer_removal_time_length_minus_1At(0L); }
    public StdVideoEncodeAV1DecoderModelInfo _buffer_removal_time_length_minus_1At(long index, MemorySegment src) { _buffer_removal_time_length_minus_1At(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1DecoderModelInfo _buffer_removal_time_length_minus_1(MemorySegment src) { return _buffer_removal_time_length_minus_1At(0L, src); }
    public MemorySegment _frame_presentation_time_length_minus_1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frame_presentation_time_length_minus_1, index), LAYOUT_frame_presentation_time_length_minus_1); }
    public MemorySegment _frame_presentation_time_length_minus_1() { return _frame_presentation_time_length_minus_1At(0L); }
    public StdVideoEncodeAV1DecoderModelInfo _frame_presentation_time_length_minus_1At(long index, MemorySegment src) { _frame_presentation_time_length_minus_1At(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1DecoderModelInfo _frame_presentation_time_length_minus_1(MemorySegment src) { return _frame_presentation_time_length_minus_1At(0L, src); }
    public MemorySegment _reserved1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    public MemorySegment _reserved1() { return _reserved1At(0L); }
    public StdVideoEncodeAV1DecoderModelInfo _reserved1At(long index, MemorySegment src) { _reserved1At(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1DecoderModelInfo _reserved1(MemorySegment src) { return _reserved1At(0L, src); }
    public MemorySegment _num_units_in_decoding_tickAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_num_units_in_decoding_tick, index), LAYOUT_num_units_in_decoding_tick); }
    public MemorySegment _num_units_in_decoding_tick() { return _num_units_in_decoding_tickAt(0L); }
    public StdVideoEncodeAV1DecoderModelInfo _num_units_in_decoding_tickAt(long index, MemorySegment src) { _num_units_in_decoding_tickAt(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1DecoderModelInfo _num_units_in_decoding_tick(MemorySegment src) { return _num_units_in_decoding_tickAt(0L, src); }
}
