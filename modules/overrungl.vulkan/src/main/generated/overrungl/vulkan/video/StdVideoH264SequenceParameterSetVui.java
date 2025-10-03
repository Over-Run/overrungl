// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH264SequenceParameterSetVui`.
/// ## Layout
/// ```
/// struct StdVideoH264SequenceParameterSetVui {
///     (struct StdVideoH264SpsVuiFlags) StdVideoH264SpsVuiFlags flags;
///     (int) StdVideoH264AspectRatioIdc aspect_ratio_idc;
///     uint16_t sar_width;
///     uint16_t sar_height;
///     uint8_t video_format;
///     uint8_t colour_primaries;
///     uint8_t transfer_characteristics;
///     uint8_t matrix_coefficients;
///     uint32_t num_units_in_tick;
///     uint32_t time_scale;
///     uint8_t max_num_reorder_frames;
///     uint8_t max_dec_frame_buffering;
///     uint8_t chroma_sample_loc_type_top_field;
///     uint8_t chroma_sample_loc_type_bottom_field;
///     uint32_t reserved1;
///     const StdVideoH264HrdParameters* pHrdParameters;
/// };
/// ```
public final class StdVideoH264SequenceParameterSetVui extends GroupType {
    /// The struct layout of `StdVideoH264SequenceParameterSetVui`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH264SpsVuiFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("aspect_ratio_idc"),
        ValueLayout.JAVA_SHORT.withName("sar_width"),
        ValueLayout.JAVA_SHORT.withName("sar_height"),
        ValueLayout.JAVA_BYTE.withName("video_format"),
        ValueLayout.JAVA_BYTE.withName("colour_primaries"),
        ValueLayout.JAVA_BYTE.withName("transfer_characteristics"),
        ValueLayout.JAVA_BYTE.withName("matrix_coefficients"),
        ValueLayout.JAVA_INT.withName("num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("time_scale"),
        ValueLayout.JAVA_BYTE.withName("max_num_reorder_frames"),
        ValueLayout.JAVA_BYTE.withName("max_dec_frame_buffering"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        ValueLayout.JAVA_INT.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pHrdParameters")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `aspect_ratio_idc`.
    public static final long OFFSET_aspect_ratio_idc = LAYOUT.byteOffset(PathElement.groupElement("aspect_ratio_idc"));
    /// The memory layout of `aspect_ratio_idc`.
    public static final MemoryLayout LAYOUT_aspect_ratio_idc = LAYOUT.select(PathElement.groupElement("aspect_ratio_idc"));
    /// The [VarHandle] of `aspect_ratio_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_aspect_ratio_idc = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspect_ratio_idc")));
    /// The byte offset of `sar_width`.
    public static final long OFFSET_sar_width = LAYOUT.byteOffset(PathElement.groupElement("sar_width"));
    /// The memory layout of `sar_width`.
    public static final MemoryLayout LAYOUT_sar_width = LAYOUT.select(PathElement.groupElement("sar_width"));
    /// The [VarHandle] of `sar_width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sar_width = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sar_width")));
    /// The byte offset of `sar_height`.
    public static final long OFFSET_sar_height = LAYOUT.byteOffset(PathElement.groupElement("sar_height"));
    /// The memory layout of `sar_height`.
    public static final MemoryLayout LAYOUT_sar_height = LAYOUT.select(PathElement.groupElement("sar_height"));
    /// The [VarHandle] of `sar_height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sar_height = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sar_height")));
    /// The byte offset of `video_format`.
    public static final long OFFSET_video_format = LAYOUT.byteOffset(PathElement.groupElement("video_format"));
    /// The memory layout of `video_format`.
    public static final MemoryLayout LAYOUT_video_format = LAYOUT.select(PathElement.groupElement("video_format"));
    /// The [VarHandle] of `video_format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_video_format = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("video_format")));
    /// The byte offset of `colour_primaries`.
    public static final long OFFSET_colour_primaries = LAYOUT.byteOffset(PathElement.groupElement("colour_primaries"));
    /// The memory layout of `colour_primaries`.
    public static final MemoryLayout LAYOUT_colour_primaries = LAYOUT.select(PathElement.groupElement("colour_primaries"));
    /// The [VarHandle] of `colour_primaries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_colour_primaries = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("colour_primaries")));
    /// The byte offset of `transfer_characteristics`.
    public static final long OFFSET_transfer_characteristics = LAYOUT.byteOffset(PathElement.groupElement("transfer_characteristics"));
    /// The memory layout of `transfer_characteristics`.
    public static final MemoryLayout LAYOUT_transfer_characteristics = LAYOUT.select(PathElement.groupElement("transfer_characteristics"));
    /// The [VarHandle] of `transfer_characteristics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_transfer_characteristics = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("transfer_characteristics")));
    /// The byte offset of `matrix_coefficients`.
    public static final long OFFSET_matrix_coefficients = LAYOUT.byteOffset(PathElement.groupElement("matrix_coefficients"));
    /// The memory layout of `matrix_coefficients`.
    public static final MemoryLayout LAYOUT_matrix_coefficients = LAYOUT.select(PathElement.groupElement("matrix_coefficients"));
    /// The [VarHandle] of `matrix_coefficients` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_matrix_coefficients = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix_coefficients")));
    /// The byte offset of `num_units_in_tick`.
    public static final long OFFSET_num_units_in_tick = LAYOUT.byteOffset(PathElement.groupElement("num_units_in_tick"));
    /// The memory layout of `num_units_in_tick`.
    public static final MemoryLayout LAYOUT_num_units_in_tick = LAYOUT.select(PathElement.groupElement("num_units_in_tick"));
    /// The [VarHandle] of `num_units_in_tick` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_num_units_in_tick = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_units_in_tick")));
    /// The byte offset of `time_scale`.
    public static final long OFFSET_time_scale = LAYOUT.byteOffset(PathElement.groupElement("time_scale"));
    /// The memory layout of `time_scale`.
    public static final MemoryLayout LAYOUT_time_scale = LAYOUT.select(PathElement.groupElement("time_scale"));
    /// The [VarHandle] of `time_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_time_scale = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_scale")));
    /// The byte offset of `max_num_reorder_frames`.
    public static final long OFFSET_max_num_reorder_frames = LAYOUT.byteOffset(PathElement.groupElement("max_num_reorder_frames"));
    /// The memory layout of `max_num_reorder_frames`.
    public static final MemoryLayout LAYOUT_max_num_reorder_frames = LAYOUT.select(PathElement.groupElement("max_num_reorder_frames"));
    /// The [VarHandle] of `max_num_reorder_frames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_max_num_reorder_frames = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_reorder_frames")));
    /// The byte offset of `max_dec_frame_buffering`.
    public static final long OFFSET_max_dec_frame_buffering = LAYOUT.byteOffset(PathElement.groupElement("max_dec_frame_buffering"));
    /// The memory layout of `max_dec_frame_buffering`.
    public static final MemoryLayout LAYOUT_max_dec_frame_buffering = LAYOUT.select(PathElement.groupElement("max_dec_frame_buffering"));
    /// The [VarHandle] of `max_dec_frame_buffering` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_max_dec_frame_buffering = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_dec_frame_buffering")));
    /// The byte offset of `chroma_sample_loc_type_top_field`.
    public static final long OFFSET_chroma_sample_loc_type_top_field = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The memory layout of `chroma_sample_loc_type_top_field`.
    public static final MemoryLayout LAYOUT_chroma_sample_loc_type_top_field = LAYOUT.select(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The [VarHandle] of `chroma_sample_loc_type_top_field` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_chroma_sample_loc_type_top_field = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_top_field")));
    /// The byte offset of `chroma_sample_loc_type_bottom_field`.
    public static final long OFFSET_chroma_sample_loc_type_bottom_field = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The memory layout of `chroma_sample_loc_type_bottom_field`.
    public static final MemoryLayout LAYOUT_chroma_sample_loc_type_bottom_field = LAYOUT.select(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The [VarHandle] of `chroma_sample_loc_type_bottom_field` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_chroma_sample_loc_type_bottom_field = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_bottom_field")));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_reserved1 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1")));
    /// The byte offset of `pHrdParameters`.
    public static final long OFFSET_pHrdParameters = LAYOUT.byteOffset(PathElement.groupElement("pHrdParameters"));
    /// The memory layout of `pHrdParameters`.
    public static final MemoryLayout LAYOUT_pHrdParameters = LAYOUT.select(PathElement.groupElement("pHrdParameters"));
    /// The [VarHandle] of `pHrdParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pHrdParameters = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHrdParameters")));

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH264SequenceParameterSetVui(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSetVui of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSetVui(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSetVui ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSetVui(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSetVui ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSetVui(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264SequenceParameterSetVui` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SequenceParameterSetVui`
    public static StdVideoH264SequenceParameterSetVui alloc(SegmentAllocator allocator) { return new StdVideoH264SequenceParameterSetVui(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH264SequenceParameterSetVui` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SequenceParameterSetVui`
    public static StdVideoH264SequenceParameterSetVui alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SequenceParameterSetVui(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui copyFrom(StdVideoH264SequenceParameterSetVui src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH264SequenceParameterSetVui reinterpret(long count) { return new StdVideoH264SequenceParameterSetVui(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui flags(Consumer<overrungl.vulkan.video.StdVideoH264SpsVuiFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH264SpsVuiFlags.of(flags())); return this; }

    /// {@return `aspect_ratio_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspect_ratio_idc(MemorySegment segment, long index) { return (int) VH_aspect_ratio_idc.get().get(segment, 0L, index); }
    /// {@return `aspect_ratio_idc`}
    public int aspect_ratio_idc() { return aspect_ratio_idc(this.segment(), 0L); }
    /// Sets `aspect_ratio_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspect_ratio_idc(MemorySegment segment, long index, int value) { VH_aspect_ratio_idc.get().set(segment, 0L, index, value); }
    /// Sets `aspect_ratio_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui aspect_ratio_idc(int value) { aspect_ratio_idc(this.segment(), 0L, value); return this; }

    /// {@return `sar_width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short sar_width(MemorySegment segment, long index) { return (short) VH_sar_width.get().get(segment, 0L, index); }
    /// {@return `sar_width`}
    public short sar_width() { return sar_width(this.segment(), 0L); }
    /// Sets `sar_width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sar_width(MemorySegment segment, long index, short value) { VH_sar_width.get().set(segment, 0L, index, value); }
    /// Sets `sar_width` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui sar_width(short value) { sar_width(this.segment(), 0L, value); return this; }

    /// {@return `sar_height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short sar_height(MemorySegment segment, long index) { return (short) VH_sar_height.get().get(segment, 0L, index); }
    /// {@return `sar_height`}
    public short sar_height() { return sar_height(this.segment(), 0L); }
    /// Sets `sar_height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sar_height(MemorySegment segment, long index, short value) { VH_sar_height.get().set(segment, 0L, index, value); }
    /// Sets `sar_height` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui sar_height(short value) { sar_height(this.segment(), 0L, value); return this; }

    /// {@return `video_format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte video_format(MemorySegment segment, long index) { return (byte) VH_video_format.get().get(segment, 0L, index); }
    /// {@return `video_format`}
    public byte video_format() { return video_format(this.segment(), 0L); }
    /// Sets `video_format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void video_format(MemorySegment segment, long index, byte value) { VH_video_format.get().set(segment, 0L, index, value); }
    /// Sets `video_format` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui video_format(byte value) { video_format(this.segment(), 0L, value); return this; }

    /// {@return `colour_primaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte colour_primaries(MemorySegment segment, long index) { return (byte) VH_colour_primaries.get().get(segment, 0L, index); }
    /// {@return `colour_primaries`}
    public byte colour_primaries() { return colour_primaries(this.segment(), 0L); }
    /// Sets `colour_primaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colour_primaries(MemorySegment segment, long index, byte value) { VH_colour_primaries.get().set(segment, 0L, index, value); }
    /// Sets `colour_primaries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui colour_primaries(byte value) { colour_primaries(this.segment(), 0L, value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte transfer_characteristics(MemorySegment segment, long index) { return (byte) VH_transfer_characteristics.get().get(segment, 0L, index); }
    /// {@return `transfer_characteristics`}
    public byte transfer_characteristics() { return transfer_characteristics(this.segment(), 0L); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transfer_characteristics(MemorySegment segment, long index, byte value) { VH_transfer_characteristics.get().set(segment, 0L, index, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui transfer_characteristics(byte value) { transfer_characteristics(this.segment(), 0L, value); return this; }

    /// {@return `matrix_coefficients` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte matrix_coefficients(MemorySegment segment, long index) { return (byte) VH_matrix_coefficients.get().get(segment, 0L, index); }
    /// {@return `matrix_coefficients`}
    public byte matrix_coefficients() { return matrix_coefficients(this.segment(), 0L); }
    /// Sets `matrix_coefficients` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void matrix_coefficients(MemorySegment segment, long index, byte value) { VH_matrix_coefficients.get().set(segment, 0L, index, value); }
    /// Sets `matrix_coefficients` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui matrix_coefficients(byte value) { matrix_coefficients(this.segment(), 0L, value); return this; }

    /// {@return `num_units_in_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int num_units_in_tick(MemorySegment segment, long index) { return (int) VH_num_units_in_tick.get().get(segment, 0L, index); }
    /// {@return `num_units_in_tick`}
    public int num_units_in_tick() { return num_units_in_tick(this.segment(), 0L); }
    /// Sets `num_units_in_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_units_in_tick(MemorySegment segment, long index, int value) { VH_num_units_in_tick.get().set(segment, 0L, index, value); }
    /// Sets `num_units_in_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui num_units_in_tick(int value) { num_units_in_tick(this.segment(), 0L, value); return this; }

    /// {@return `time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int time_scale(MemorySegment segment, long index) { return (int) VH_time_scale.get().get(segment, 0L, index); }
    /// {@return `time_scale`}
    public int time_scale() { return time_scale(this.segment(), 0L); }
    /// Sets `time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void time_scale(MemorySegment segment, long index, int value) { VH_time_scale.get().set(segment, 0L, index, value); }
    /// Sets `time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui time_scale(int value) { time_scale(this.segment(), 0L, value); return this; }

    /// {@return `max_num_reorder_frames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_num_reorder_frames(MemorySegment segment, long index) { return (byte) VH_max_num_reorder_frames.get().get(segment, 0L, index); }
    /// {@return `max_num_reorder_frames`}
    public byte max_num_reorder_frames() { return max_num_reorder_frames(this.segment(), 0L); }
    /// Sets `max_num_reorder_frames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_num_reorder_frames(MemorySegment segment, long index, byte value) { VH_max_num_reorder_frames.get().set(segment, 0L, index, value); }
    /// Sets `max_num_reorder_frames` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui max_num_reorder_frames(byte value) { max_num_reorder_frames(this.segment(), 0L, value); return this; }

    /// {@return `max_dec_frame_buffering` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_dec_frame_buffering(MemorySegment segment, long index) { return (byte) VH_max_dec_frame_buffering.get().get(segment, 0L, index); }
    /// {@return `max_dec_frame_buffering`}
    public byte max_dec_frame_buffering() { return max_dec_frame_buffering(this.segment(), 0L); }
    /// Sets `max_dec_frame_buffering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_dec_frame_buffering(MemorySegment segment, long index, byte value) { VH_max_dec_frame_buffering.get().set(segment, 0L, index, value); }
    /// Sets `max_dec_frame_buffering` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui max_dec_frame_buffering(byte value) { max_dec_frame_buffering(this.segment(), 0L, value); return this; }

    /// {@return `chroma_sample_loc_type_top_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_sample_loc_type_top_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_top_field.get().get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_top_field`}
    public byte chroma_sample_loc_type_top_field() { return chroma_sample_loc_type_top_field(this.segment(), 0L); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_sample_loc_type_top_field(MemorySegment segment, long index, byte value) { VH_chroma_sample_loc_type_top_field.get().set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_top_field(byte value) { chroma_sample_loc_type_top_field(this.segment(), 0L, value); return this; }

    /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_sample_loc_type_bottom_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_bottom_field.get().get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_bottom_field`}
    public byte chroma_sample_loc_type_bottom_field() { return chroma_sample_loc_type_bottom_field(this.segment(), 0L); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_sample_loc_type_bottom_field(MemorySegment segment, long index, byte value) { VH_chroma_sample_loc_type_bottom_field.get().set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_bottom_field(byte value) { chroma_sample_loc_type_bottom_field(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int reserved1(MemorySegment segment, long index) { return (int) VH_reserved1.get().get(segment, 0L, index); }
    /// {@return `reserved1`}
    public int reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, int value) { VH_reserved1.get().set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui reserved1(int value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHrdParameters(MemorySegment segment, long index) { return (MemorySegment) VH_pHrdParameters.get().get(segment, 0L, index); }
    /// {@return `pHrdParameters`}
    public MemorySegment pHrdParameters() { return pHrdParameters(this.segment(), 0L); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHrdParameters(MemorySegment segment, long index, MemorySegment value) { VH_pHrdParameters.get().set(segment, 0L, index, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui pHrdParameters(MemorySegment value) { pHrdParameters(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoH264SequenceParameterSetVui`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264SequenceParameterSetVui`
    public StdVideoH264SequenceParameterSetVui asSlice(long index) { return new StdVideoH264SequenceParameterSetVui(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH264SequenceParameterSetVui`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264SequenceParameterSetVui`
    public StdVideoH264SequenceParameterSetVui asSlice(long index, long count) { return new StdVideoH264SequenceParameterSetVui(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH264SequenceParameterSetVui` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui at(long index, Consumer<StdVideoH264SequenceParameterSetVui> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH264SpsVuiFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH264SpsVuiFlags.of(flagsAt(index))); return this; }

    /// {@return `aspect_ratio_idc` at the given index}
    /// @param index the index of the struct buffer
    public int aspect_ratio_idcAt(long index) { return aspect_ratio_idc(this.segment(), index); }
    /// Sets `aspect_ratio_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui aspect_ratio_idcAt(long index, int value) { aspect_ratio_idc(this.segment(), index, value); return this; }

    /// {@return `sar_width` at the given index}
    /// @param index the index of the struct buffer
    public short sar_widthAt(long index) { return sar_width(this.segment(), index); }
    /// Sets `sar_width` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui sar_widthAt(long index, short value) { sar_width(this.segment(), index, value); return this; }

    /// {@return `sar_height` at the given index}
    /// @param index the index of the struct buffer
    public short sar_heightAt(long index) { return sar_height(this.segment(), index); }
    /// Sets `sar_height` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui sar_heightAt(long index, short value) { sar_height(this.segment(), index, value); return this; }

    /// {@return `video_format` at the given index}
    /// @param index the index of the struct buffer
    public byte video_formatAt(long index) { return video_format(this.segment(), index); }
    /// Sets `video_format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui video_formatAt(long index, byte value) { video_format(this.segment(), index, value); return this; }

    /// {@return `colour_primaries` at the given index}
    /// @param index the index of the struct buffer
    public byte colour_primariesAt(long index) { return colour_primaries(this.segment(), index); }
    /// Sets `colour_primaries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui colour_primariesAt(long index, byte value) { colour_primaries(this.segment(), index, value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param index the index of the struct buffer
    public byte transfer_characteristicsAt(long index) { return transfer_characteristics(this.segment(), index); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui transfer_characteristicsAt(long index, byte value) { transfer_characteristics(this.segment(), index, value); return this; }

    /// {@return `matrix_coefficients` at the given index}
    /// @param index the index of the struct buffer
    public byte matrix_coefficientsAt(long index) { return matrix_coefficients(this.segment(), index); }
    /// Sets `matrix_coefficients` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui matrix_coefficientsAt(long index, byte value) { matrix_coefficients(this.segment(), index, value); return this; }

    /// {@return `num_units_in_tick` at the given index}
    /// @param index the index of the struct buffer
    public int num_units_in_tickAt(long index) { return num_units_in_tick(this.segment(), index); }
    /// Sets `num_units_in_tick` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui num_units_in_tickAt(long index, int value) { num_units_in_tick(this.segment(), index, value); return this; }

    /// {@return `time_scale` at the given index}
    /// @param index the index of the struct buffer
    public int time_scaleAt(long index) { return time_scale(this.segment(), index); }
    /// Sets `time_scale` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui time_scaleAt(long index, int value) { time_scale(this.segment(), index, value); return this; }

    /// {@return `max_num_reorder_frames` at the given index}
    /// @param index the index of the struct buffer
    public byte max_num_reorder_framesAt(long index) { return max_num_reorder_frames(this.segment(), index); }
    /// Sets `max_num_reorder_frames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui max_num_reorder_framesAt(long index, byte value) { max_num_reorder_frames(this.segment(), index, value); return this; }

    /// {@return `max_dec_frame_buffering` at the given index}
    /// @param index the index of the struct buffer
    public byte max_dec_frame_bufferingAt(long index) { return max_dec_frame_buffering(this.segment(), index); }
    /// Sets `max_dec_frame_buffering` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui max_dec_frame_bufferingAt(long index, byte value) { max_dec_frame_buffering(this.segment(), index, value); return this; }

    /// {@return `chroma_sample_loc_type_top_field` at the given index}
    /// @param index the index of the struct buffer
    public byte chroma_sample_loc_type_top_fieldAt(long index) { return chroma_sample_loc_type_top_field(this.segment(), index); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_top_fieldAt(long index, byte value) { chroma_sample_loc_type_top_field(this.segment(), index, value); return this; }

    /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
    /// @param index the index of the struct buffer
    public byte chroma_sample_loc_type_bottom_fieldAt(long index) { return chroma_sample_loc_type_bottom_field(this.segment(), index); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_bottom_fieldAt(long index, byte value) { chroma_sample_loc_type_bottom_field(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public int reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui reserved1At(long index, int value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pHrdParametersAt(long index) { return pHrdParameters(this.segment(), index); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui pHrdParametersAt(long index, MemorySegment value) { pHrdParameters(this.segment(), index, value); return this; }

}
