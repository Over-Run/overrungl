// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH264SequenceParameterSet`.
/// ## Layout
/// ```
/// struct StdVideoH264SequenceParameterSet {
///     (struct StdVideoH264SpsFlags) StdVideoH264SpsFlags flags;
///     (int) StdVideoH264ProfileIdc profile_idc;
///     (int) StdVideoH264LevelIdc level_idc;
///     (int) StdVideoH264ChromaFormatIdc chroma_format_idc;
///     uint8_t seq_parameter_set_id;
///     uint8_t bit_depth_luma_minus8;
///     uint8_t bit_depth_chroma_minus8;
///     uint8_t log2_max_frame_num_minus4;
///     (int) StdVideoH264PocType pic_order_cnt_type;
///     int32_t offset_for_non_ref_pic;
///     int32_t offset_for_top_to_bottom_field;
///     uint8_t log2_max_pic_order_cnt_lsb_minus4;
///     uint8_t num_ref_frames_in_pic_order_cnt_cycle;
///     uint8_t max_num_ref_frames;
///     uint8_t reserved1;
///     uint32_t pic_width_in_mbs_minus1;
///     uint32_t pic_height_in_map_units_minus1;
///     uint32_t frame_crop_left_offset;
///     uint32_t frame_crop_right_offset;
///     uint32_t frame_crop_top_offset;
///     uint32_t frame_crop_bottom_offset;
///     uint32_t reserved2;
///     const int32_t* pOffsetForRefFrame;
///     const StdVideoH264ScalingLists* pScalingLists;
///     const StdVideoH264SequenceParameterSetVui* pSequenceParameterSetVui;
/// };
/// ```
public final class StdVideoH264SequenceParameterSet extends GroupType {
    /// The struct layout of `StdVideoH264SequenceParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH264SpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("profile_idc"),
        ValueLayout.JAVA_INT.withName("level_idc"),
        ValueLayout.JAVA_INT.withName("chroma_format_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8"),
        ValueLayout.JAVA_BYTE.withName("log2_max_frame_num_minus4"),
        ValueLayout.JAVA_INT.withName("pic_order_cnt_type"),
        ValueLayout.JAVA_INT.withName("offset_for_non_ref_pic"),
        ValueLayout.JAVA_INT.withName("offset_for_top_to_bottom_field"),
        ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
        ValueLayout.JAVA_BYTE.withName("num_ref_frames_in_pic_order_cnt_cycle"),
        ValueLayout.JAVA_BYTE.withName("max_num_ref_frames"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("pic_width_in_mbs_minus1"),
        ValueLayout.JAVA_INT.withName("pic_height_in_map_units_minus1"),
        ValueLayout.JAVA_INT.withName("frame_crop_left_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_right_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_top_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_bottom_offset"),
        ValueLayout.JAVA_INT.withName("reserved2"),
        ValueLayout.ADDRESS.withName("pOffsetForRefFrame"),
        ValueLayout.ADDRESS.withName("pScalingLists"),
        ValueLayout.ADDRESS.withName("pSequenceParameterSetVui")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `profile_idc`.
    public static final long OFFSET_profile_idc = LAYOUT.byteOffset(PathElement.groupElement("profile_idc"));
    /// The memory layout of `profile_idc`.
    public static final MemoryLayout LAYOUT_profile_idc = LAYOUT.select(PathElement.groupElement("profile_idc"));
    /// The [VarHandle] of `profile_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_profile_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("profile_idc"));
    /// The byte offset of `level_idc`.
    public static final long OFFSET_level_idc = LAYOUT.byteOffset(PathElement.groupElement("level_idc"));
    /// The memory layout of `level_idc`.
    public static final MemoryLayout LAYOUT_level_idc = LAYOUT.select(PathElement.groupElement("level_idc"));
    /// The [VarHandle] of `level_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_level_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("level_idc"));
    /// The byte offset of `chroma_format_idc`.
    public static final long OFFSET_chroma_format_idc = LAYOUT.byteOffset(PathElement.groupElement("chroma_format_idc"));
    /// The memory layout of `chroma_format_idc`.
    public static final MemoryLayout LAYOUT_chroma_format_idc = LAYOUT.select(PathElement.groupElement("chroma_format_idc"));
    /// The [VarHandle] of `chroma_format_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_format_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_format_idc"));
    /// The byte offset of `seq_parameter_set_id`.
    public static final long OFFSET_seq_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
    /// The memory layout of `seq_parameter_set_id`.
    public static final MemoryLayout LAYOUT_seq_parameter_set_id = LAYOUT.select(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The byte offset of `bit_depth_luma_minus8`.
    public static final long OFFSET_bit_depth_luma_minus8 = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The memory layout of `bit_depth_luma_minus8`.
    public static final MemoryLayout LAYOUT_bit_depth_luma_minus8 = LAYOUT.select(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The [VarHandle] of `bit_depth_luma_minus8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bit_depth_luma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The byte offset of `bit_depth_chroma_minus8`.
    public static final long OFFSET_bit_depth_chroma_minus8 = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The memory layout of `bit_depth_chroma_minus8`.
    public static final MemoryLayout LAYOUT_bit_depth_chroma_minus8 = LAYOUT.select(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The [VarHandle] of `bit_depth_chroma_minus8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bit_depth_chroma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The byte offset of `log2_max_frame_num_minus4`.
    public static final long OFFSET_log2_max_frame_num_minus4 = LAYOUT.byteOffset(PathElement.groupElement("log2_max_frame_num_minus4"));
    /// The memory layout of `log2_max_frame_num_minus4`.
    public static final MemoryLayout LAYOUT_log2_max_frame_num_minus4 = LAYOUT.select(PathElement.groupElement("log2_max_frame_num_minus4"));
    /// The [VarHandle] of `log2_max_frame_num_minus4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_max_frame_num_minus4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_frame_num_minus4"));
    /// The byte offset of `pic_order_cnt_type`.
    public static final long OFFSET_pic_order_cnt_type = LAYOUT.byteOffset(PathElement.groupElement("pic_order_cnt_type"));
    /// The memory layout of `pic_order_cnt_type`.
    public static final MemoryLayout LAYOUT_pic_order_cnt_type = LAYOUT.select(PathElement.groupElement("pic_order_cnt_type"));
    /// The [VarHandle] of `pic_order_cnt_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_order_cnt_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_order_cnt_type"));
    /// The byte offset of `offset_for_non_ref_pic`.
    public static final long OFFSET_offset_for_non_ref_pic = LAYOUT.byteOffset(PathElement.groupElement("offset_for_non_ref_pic"));
    /// The memory layout of `offset_for_non_ref_pic`.
    public static final MemoryLayout LAYOUT_offset_for_non_ref_pic = LAYOUT.select(PathElement.groupElement("offset_for_non_ref_pic"));
    /// The [VarHandle] of `offset_for_non_ref_pic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset_for_non_ref_pic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset_for_non_ref_pic"));
    /// The byte offset of `offset_for_top_to_bottom_field`.
    public static final long OFFSET_offset_for_top_to_bottom_field = LAYOUT.byteOffset(PathElement.groupElement("offset_for_top_to_bottom_field"));
    /// The memory layout of `offset_for_top_to_bottom_field`.
    public static final MemoryLayout LAYOUT_offset_for_top_to_bottom_field = LAYOUT.select(PathElement.groupElement("offset_for_top_to_bottom_field"));
    /// The [VarHandle] of `offset_for_top_to_bottom_field` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset_for_top_to_bottom_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset_for_top_to_bottom_field"));
    /// The byte offset of `log2_max_pic_order_cnt_lsb_minus4`.
    public static final long OFFSET_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.byteOffset(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The memory layout of `log2_max_pic_order_cnt_lsb_minus4`.
    public static final MemoryLayout LAYOUT_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.select(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The [VarHandle] of `log2_max_pic_order_cnt_lsb_minus4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The byte offset of `num_ref_frames_in_pic_order_cnt_cycle`.
    public static final long OFFSET_num_ref_frames_in_pic_order_cnt_cycle = LAYOUT.byteOffset(PathElement.groupElement("num_ref_frames_in_pic_order_cnt_cycle"));
    /// The memory layout of `num_ref_frames_in_pic_order_cnt_cycle`.
    public static final MemoryLayout LAYOUT_num_ref_frames_in_pic_order_cnt_cycle = LAYOUT.select(PathElement.groupElement("num_ref_frames_in_pic_order_cnt_cycle"));
    /// The [VarHandle] of `num_ref_frames_in_pic_order_cnt_cycle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_frames_in_pic_order_cnt_cycle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_frames_in_pic_order_cnt_cycle"));
    /// The byte offset of `max_num_ref_frames`.
    public static final long OFFSET_max_num_ref_frames = LAYOUT.byteOffset(PathElement.groupElement("max_num_ref_frames"));
    /// The memory layout of `max_num_ref_frames`.
    public static final MemoryLayout LAYOUT_max_num_ref_frames = LAYOUT.select(PathElement.groupElement("max_num_ref_frames"));
    /// The [VarHandle] of `max_num_ref_frames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_num_ref_frames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_ref_frames"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `pic_width_in_mbs_minus1`.
    public static final long OFFSET_pic_width_in_mbs_minus1 = LAYOUT.byteOffset(PathElement.groupElement("pic_width_in_mbs_minus1"));
    /// The memory layout of `pic_width_in_mbs_minus1`.
    public static final MemoryLayout LAYOUT_pic_width_in_mbs_minus1 = LAYOUT.select(PathElement.groupElement("pic_width_in_mbs_minus1"));
    /// The [VarHandle] of `pic_width_in_mbs_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_width_in_mbs_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_width_in_mbs_minus1"));
    /// The byte offset of `pic_height_in_map_units_minus1`.
    public static final long OFFSET_pic_height_in_map_units_minus1 = LAYOUT.byteOffset(PathElement.groupElement("pic_height_in_map_units_minus1"));
    /// The memory layout of `pic_height_in_map_units_minus1`.
    public static final MemoryLayout LAYOUT_pic_height_in_map_units_minus1 = LAYOUT.select(PathElement.groupElement("pic_height_in_map_units_minus1"));
    /// The [VarHandle] of `pic_height_in_map_units_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_height_in_map_units_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_height_in_map_units_minus1"));
    /// The byte offset of `frame_crop_left_offset`.
    public static final long OFFSET_frame_crop_left_offset = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_left_offset"));
    /// The memory layout of `frame_crop_left_offset`.
    public static final MemoryLayout LAYOUT_frame_crop_left_offset = LAYOUT.select(PathElement.groupElement("frame_crop_left_offset"));
    /// The [VarHandle] of `frame_crop_left_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_crop_left_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_left_offset"));
    /// The byte offset of `frame_crop_right_offset`.
    public static final long OFFSET_frame_crop_right_offset = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_right_offset"));
    /// The memory layout of `frame_crop_right_offset`.
    public static final MemoryLayout LAYOUT_frame_crop_right_offset = LAYOUT.select(PathElement.groupElement("frame_crop_right_offset"));
    /// The [VarHandle] of `frame_crop_right_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_crop_right_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_right_offset"));
    /// The byte offset of `frame_crop_top_offset`.
    public static final long OFFSET_frame_crop_top_offset = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_top_offset"));
    /// The memory layout of `frame_crop_top_offset`.
    public static final MemoryLayout LAYOUT_frame_crop_top_offset = LAYOUT.select(PathElement.groupElement("frame_crop_top_offset"));
    /// The [VarHandle] of `frame_crop_top_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_crop_top_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_top_offset"));
    /// The byte offset of `frame_crop_bottom_offset`.
    public static final long OFFSET_frame_crop_bottom_offset = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_bottom_offset"));
    /// The memory layout of `frame_crop_bottom_offset`.
    public static final MemoryLayout LAYOUT_frame_crop_bottom_offset = LAYOUT.select(PathElement.groupElement("frame_crop_bottom_offset"));
    /// The [VarHandle] of `frame_crop_bottom_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_crop_bottom_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_bottom_offset"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The byte offset of `pOffsetForRefFrame`.
    public static final long OFFSET_pOffsetForRefFrame = LAYOUT.byteOffset(PathElement.groupElement("pOffsetForRefFrame"));
    /// The memory layout of `pOffsetForRefFrame`.
    public static final MemoryLayout LAYOUT_pOffsetForRefFrame = LAYOUT.select(PathElement.groupElement("pOffsetForRefFrame"));
    /// The [VarHandle] of `pOffsetForRefFrame` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pOffsetForRefFrame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOffsetForRefFrame"));
    /// The byte offset of `pScalingLists`.
    public static final long OFFSET_pScalingLists = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
    /// The memory layout of `pScalingLists`.
    public static final MemoryLayout LAYOUT_pScalingLists = LAYOUT.select(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));
    /// The byte offset of `pSequenceParameterSetVui`.
    public static final long OFFSET_pSequenceParameterSetVui = LAYOUT.byteOffset(PathElement.groupElement("pSequenceParameterSetVui"));
    /// The memory layout of `pSequenceParameterSetVui`.
    public static final MemoryLayout LAYOUT_pSequenceParameterSetVui = LAYOUT.select(PathElement.groupElement("pSequenceParameterSetVui"));
    /// The [VarHandle] of `pSequenceParameterSetVui` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSequenceParameterSetVui = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSequenceParameterSetVui"));

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH264SequenceParameterSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSet(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSet(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264SequenceParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SequenceParameterSet`
    public static StdVideoH264SequenceParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH264SequenceParameterSet(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH264SequenceParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SequenceParameterSet`
    public static StdVideoH264SequenceParameterSet alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SequenceParameterSet(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264SequenceParameterSet copyFrom(StdVideoH264SequenceParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH264SequenceParameterSet reinterpret(long count) { return new StdVideoH264SequenceParameterSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoH264SequenceParameterSet flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH264SequenceParameterSet flags(Consumer<overrungl.vulkan.video.StdVideoH264SpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH264SpsFlags.of(flags())); return this; }

    /// {@return `profile_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int profile_idc(MemorySegment segment, long index) { return (int) VH_profile_idc.get(segment, 0L, index); }
    /// {@return `profile_idc`}
    public int profile_idc() { return profile_idc(this.segment(), 0L); }
    /// Sets `profile_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void profile_idc(MemorySegment segment, long index, int value) { VH_profile_idc.set(segment, 0L, index, value); }
    /// Sets `profile_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet profile_idc(int value) { profile_idc(this.segment(), 0L, value); return this; }

    /// {@return `level_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int level_idc(MemorySegment segment, long index) { return (int) VH_level_idc.get(segment, 0L, index); }
    /// {@return `level_idc`}
    public int level_idc() { return level_idc(this.segment(), 0L); }
    /// Sets `level_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void level_idc(MemorySegment segment, long index, int value) { VH_level_idc.set(segment, 0L, index, value); }
    /// Sets `level_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet level_idc(int value) { level_idc(this.segment(), 0L, value); return this; }

    /// {@return `chroma_format_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chroma_format_idc(MemorySegment segment, long index) { return (int) VH_chroma_format_idc.get(segment, 0L, index); }
    /// {@return `chroma_format_idc`}
    public int chroma_format_idc() { return chroma_format_idc(this.segment(), 0L); }
    /// Sets `chroma_format_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_format_idc(MemorySegment segment, long index, int value) { VH_chroma_format_idc.set(segment, 0L, index, value); }
    /// Sets `chroma_format_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet chroma_format_idc(int value) { chroma_format_idc(this.segment(), 0L, value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    public byte seq_parameter_set_id() { return seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet seq_parameter_set_id(byte value) { seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `bit_depth_luma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte bit_depth_luma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_luma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_luma_minus8`}
    public byte bit_depth_luma_minus8() { return bit_depth_luma_minus8(this.segment(), 0L); }
    /// Sets `bit_depth_luma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_depth_luma_minus8(MemorySegment segment, long index, byte value) { VH_bit_depth_luma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_luma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8(byte value) { bit_depth_luma_minus8(this.segment(), 0L, value); return this; }

    /// {@return `bit_depth_chroma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte bit_depth_chroma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_chroma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_chroma_minus8`}
    public byte bit_depth_chroma_minus8() { return bit_depth_chroma_minus8(this.segment(), 0L); }
    /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_depth_chroma_minus8(MemorySegment segment, long index, byte value) { VH_bit_depth_chroma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_chroma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8(byte value) { bit_depth_chroma_minus8(this.segment(), 0L, value); return this; }

    /// {@return `log2_max_frame_num_minus4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_max_frame_num_minus4(MemorySegment segment, long index) { return (byte) VH_log2_max_frame_num_minus4.get(segment, 0L, index); }
    /// {@return `log2_max_frame_num_minus4`}
    public byte log2_max_frame_num_minus4() { return log2_max_frame_num_minus4(this.segment(), 0L); }
    /// Sets `log2_max_frame_num_minus4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_max_frame_num_minus4(MemorySegment segment, long index, byte value) { VH_log2_max_frame_num_minus4.set(segment, 0L, index, value); }
    /// Sets `log2_max_frame_num_minus4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4(byte value) { log2_max_frame_num_minus4(this.segment(), 0L, value); return this; }

    /// {@return `pic_order_cnt_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_order_cnt_type(MemorySegment segment, long index) { return (int) VH_pic_order_cnt_type.get(segment, 0L, index); }
    /// {@return `pic_order_cnt_type`}
    public int pic_order_cnt_type() { return pic_order_cnt_type(this.segment(), 0L); }
    /// Sets `pic_order_cnt_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_order_cnt_type(MemorySegment segment, long index, int value) { VH_pic_order_cnt_type.set(segment, 0L, index, value); }
    /// Sets `pic_order_cnt_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_order_cnt_type(int value) { pic_order_cnt_type(this.segment(), 0L, value); return this; }

    /// {@return `offset_for_non_ref_pic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int offset_for_non_ref_pic(MemorySegment segment, long index) { return (int) VH_offset_for_non_ref_pic.get(segment, 0L, index); }
    /// {@return `offset_for_non_ref_pic`}
    public int offset_for_non_ref_pic() { return offset_for_non_ref_pic(this.segment(), 0L); }
    /// Sets `offset_for_non_ref_pic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset_for_non_ref_pic(MemorySegment segment, long index, int value) { VH_offset_for_non_ref_pic.set(segment, 0L, index, value); }
    /// Sets `offset_for_non_ref_pic` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_non_ref_pic(int value) { offset_for_non_ref_pic(this.segment(), 0L, value); return this; }

    /// {@return `offset_for_top_to_bottom_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int offset_for_top_to_bottom_field(MemorySegment segment, long index) { return (int) VH_offset_for_top_to_bottom_field.get(segment, 0L, index); }
    /// {@return `offset_for_top_to_bottom_field`}
    public int offset_for_top_to_bottom_field() { return offset_for_top_to_bottom_field(this.segment(), 0L); }
    /// Sets `offset_for_top_to_bottom_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset_for_top_to_bottom_field(MemorySegment segment, long index, int value) { VH_offset_for_top_to_bottom_field.set(segment, 0L, index, value); }
    /// Sets `offset_for_top_to_bottom_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_field(int value) { offset_for_top_to_bottom_field(this.segment(), 0L, value); return this; }

    /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index) { return (byte) VH_log2_max_pic_order_cnt_lsb_minus4.get(segment, 0L, index); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4`}
    public byte log2_max_pic_order_cnt_lsb_minus4() { return log2_max_pic_order_cnt_lsb_minus4(this.segment(), 0L); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index, byte value) { VH_log2_max_pic_order_cnt_lsb_minus4.set(segment, 0L, index, value); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(byte value) { log2_max_pic_order_cnt_lsb_minus4(this.segment(), 0L, value); return this; }

    /// {@return `num_ref_frames_in_pic_order_cnt_cycle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_frames_in_pic_order_cnt_cycle(MemorySegment segment, long index) { return (byte) VH_num_ref_frames_in_pic_order_cnt_cycle.get(segment, 0L, index); }
    /// {@return `num_ref_frames_in_pic_order_cnt_cycle`}
    public byte num_ref_frames_in_pic_order_cnt_cycle() { return num_ref_frames_in_pic_order_cnt_cycle(this.segment(), 0L); }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_frames_in_pic_order_cnt_cycle(MemorySegment segment, long index, byte value) { VH_num_ref_frames_in_pic_order_cnt_cycle.set(segment, 0L, index, value); }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycle(byte value) { num_ref_frames_in_pic_order_cnt_cycle(this.segment(), 0L, value); return this; }

    /// {@return `max_num_ref_frames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_num_ref_frames(MemorySegment segment, long index) { return (byte) VH_max_num_ref_frames.get(segment, 0L, index); }
    /// {@return `max_num_ref_frames`}
    public byte max_num_ref_frames() { return max_num_ref_frames(this.segment(), 0L); }
    /// Sets `max_num_ref_frames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_num_ref_frames(MemorySegment segment, long index, byte value) { VH_max_num_ref_frames.set(segment, 0L, index, value); }
    /// Sets `max_num_ref_frames` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet max_num_ref_frames(byte value) { max_num_ref_frames(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `pic_width_in_mbs_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_width_in_mbs_minus1(MemorySegment segment, long index) { return (int) VH_pic_width_in_mbs_minus1.get(segment, 0L, index); }
    /// {@return `pic_width_in_mbs_minus1`}
    public int pic_width_in_mbs_minus1() { return pic_width_in_mbs_minus1(this.segment(), 0L); }
    /// Sets `pic_width_in_mbs_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_width_in_mbs_minus1(MemorySegment segment, long index, int value) { VH_pic_width_in_mbs_minus1.set(segment, 0L, index, value); }
    /// Sets `pic_width_in_mbs_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1(int value) { pic_width_in_mbs_minus1(this.segment(), 0L, value); return this; }

    /// {@return `pic_height_in_map_units_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_height_in_map_units_minus1(MemorySegment segment, long index) { return (int) VH_pic_height_in_map_units_minus1.get(segment, 0L, index); }
    /// {@return `pic_height_in_map_units_minus1`}
    public int pic_height_in_map_units_minus1() { return pic_height_in_map_units_minus1(this.segment(), 0L); }
    /// Sets `pic_height_in_map_units_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_height_in_map_units_minus1(MemorySegment segment, long index, int value) { VH_pic_height_in_map_units_minus1.set(segment, 0L, index, value); }
    /// Sets `pic_height_in_map_units_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1(int value) { pic_height_in_map_units_minus1(this.segment(), 0L, value); return this; }

    /// {@return `frame_crop_left_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_crop_left_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_left_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_left_offset`}
    public int frame_crop_left_offset() { return frame_crop_left_offset(this.segment(), 0L); }
    /// Sets `frame_crop_left_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_crop_left_offset(MemorySegment segment, long index, int value) { VH_frame_crop_left_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_left_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_left_offset(int value) { frame_crop_left_offset(this.segment(), 0L, value); return this; }

    /// {@return `frame_crop_right_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_crop_right_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_right_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_right_offset`}
    public int frame_crop_right_offset() { return frame_crop_right_offset(this.segment(), 0L); }
    /// Sets `frame_crop_right_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_crop_right_offset(MemorySegment segment, long index, int value) { VH_frame_crop_right_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_right_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_right_offset(int value) { frame_crop_right_offset(this.segment(), 0L, value); return this; }

    /// {@return `frame_crop_top_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_crop_top_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_top_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_top_offset`}
    public int frame_crop_top_offset() { return frame_crop_top_offset(this.segment(), 0L); }
    /// Sets `frame_crop_top_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_crop_top_offset(MemorySegment segment, long index, int value) { VH_frame_crop_top_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_top_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_top_offset(int value) { frame_crop_top_offset(this.segment(), 0L, value); return this; }

    /// {@return `frame_crop_bottom_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_crop_bottom_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_bottom_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_bottom_offset`}
    public int frame_crop_bottom_offset() { return frame_crop_bottom_offset(this.segment(), 0L); }
    /// Sets `frame_crop_bottom_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_crop_bottom_offset(MemorySegment segment, long index, int value) { VH_frame_crop_bottom_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_bottom_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_bottom_offset(int value) { frame_crop_bottom_offset(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int reserved2(MemorySegment segment, long index) { return (int) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    public int reserved2() { return reserved2(this.segment(), 0L); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, int value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved2(int value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `pOffsetForRefFrame` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pOffsetForRefFrame(MemorySegment segment, long index) { return (MemorySegment) VH_pOffsetForRefFrame.get(segment, 0L, index); }
    /// {@return `pOffsetForRefFrame`}
    public MemorySegment pOffsetForRefFrame() { return pOffsetForRefFrame(this.segment(), 0L); }
    /// Sets `pOffsetForRefFrame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pOffsetForRefFrame(MemorySegment segment, long index, MemorySegment value) { VH_pOffsetForRefFrame.set(segment, 0L, index, value); }
    /// Sets `pOffsetForRefFrame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pOffsetForRefFrame(MemorySegment value) { pOffsetForRefFrame(this.segment(), 0L, value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pScalingLists(MemorySegment segment, long index) { return (MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    public MemorySegment pScalingLists() { return pScalingLists(this.segment(), 0L); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pScalingLists(MemorySegment segment, long index, MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pScalingLists(MemorySegment value) { pScalingLists(this.segment(), 0L, value); return this; }

    /// {@return `pSequenceParameterSetVui` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSequenceParameterSetVui(MemorySegment segment, long index) { return (MemorySegment) VH_pSequenceParameterSetVui.get(segment, 0L, index); }
    /// {@return `pSequenceParameterSetVui`}
    public MemorySegment pSequenceParameterSetVui() { return pSequenceParameterSetVui(this.segment(), 0L); }
    /// Sets `pSequenceParameterSetVui` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSequenceParameterSetVui(MemorySegment segment, long index, MemorySegment value) { VH_pSequenceParameterSetVui.set(segment, 0L, index, value); }
    /// Sets `pSequenceParameterSetVui` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pSequenceParameterSetVui(MemorySegment value) { pSequenceParameterSetVui(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoH264SequenceParameterSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264SequenceParameterSet`
    public StdVideoH264SequenceParameterSet asSlice(long index) { return new StdVideoH264SequenceParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH264SequenceParameterSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264SequenceParameterSet`
    public StdVideoH264SequenceParameterSet asSlice(long index, long count) { return new StdVideoH264SequenceParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH264SequenceParameterSet` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH264SequenceParameterSet at(long index, Consumer<StdVideoH264SequenceParameterSet> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoH264SequenceParameterSet flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH264SpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH264SpsFlags.of(flagsAt(index))); return this; }

    /// {@return `profile_idc` at the given index}
    /// @param index the index of the struct buffer
    public int profile_idcAt(long index) { return profile_idc(this.segment(), index); }
    /// Sets `profile_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet profile_idcAt(long index, int value) { profile_idc(this.segment(), index, value); return this; }

    /// {@return `level_idc` at the given index}
    /// @param index the index of the struct buffer
    public int level_idcAt(long index) { return level_idc(this.segment(), index); }
    /// Sets `level_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet level_idcAt(long index, int value) { level_idc(this.segment(), index, value); return this; }

    /// {@return `chroma_format_idc` at the given index}
    /// @param index the index of the struct buffer
    public int chroma_format_idcAt(long index) { return chroma_format_idc(this.segment(), index); }
    /// Sets `chroma_format_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet chroma_format_idcAt(long index, int value) { chroma_format_idc(this.segment(), index, value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte seq_parameter_set_idAt(long index) { return seq_parameter_set_id(this.segment(), index); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet seq_parameter_set_idAt(long index, byte value) { seq_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `bit_depth_luma_minus8` at the given index}
    /// @param index the index of the struct buffer
    public byte bit_depth_luma_minus8At(long index) { return bit_depth_luma_minus8(this.segment(), index); }
    /// Sets `bit_depth_luma_minus8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8At(long index, byte value) { bit_depth_luma_minus8(this.segment(), index, value); return this; }

    /// {@return `bit_depth_chroma_minus8` at the given index}
    /// @param index the index of the struct buffer
    public byte bit_depth_chroma_minus8At(long index) { return bit_depth_chroma_minus8(this.segment(), index); }
    /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8At(long index, byte value) { bit_depth_chroma_minus8(this.segment(), index, value); return this; }

    /// {@return `log2_max_frame_num_minus4` at the given index}
    /// @param index the index of the struct buffer
    public byte log2_max_frame_num_minus4At(long index) { return log2_max_frame_num_minus4(this.segment(), index); }
    /// Sets `log2_max_frame_num_minus4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4At(long index, byte value) { log2_max_frame_num_minus4(this.segment(), index, value); return this; }

    /// {@return `pic_order_cnt_type` at the given index}
    /// @param index the index of the struct buffer
    public int pic_order_cnt_typeAt(long index) { return pic_order_cnt_type(this.segment(), index); }
    /// Sets `pic_order_cnt_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_order_cnt_typeAt(long index, int value) { pic_order_cnt_type(this.segment(), index, value); return this; }

    /// {@return `offset_for_non_ref_pic` at the given index}
    /// @param index the index of the struct buffer
    public int offset_for_non_ref_picAt(long index) { return offset_for_non_ref_pic(this.segment(), index); }
    /// Sets `offset_for_non_ref_pic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_non_ref_picAt(long index, int value) { offset_for_non_ref_pic(this.segment(), index, value); return this; }

    /// {@return `offset_for_top_to_bottom_field` at the given index}
    /// @param index the index of the struct buffer
    public int offset_for_top_to_bottom_fieldAt(long index) { return offset_for_top_to_bottom_field(this.segment(), index); }
    /// Sets `offset_for_top_to_bottom_field` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_fieldAt(long index, int value) { offset_for_top_to_bottom_field(this.segment(), index, value); return this; }

    /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
    /// @param index the index of the struct buffer
    public byte log2_max_pic_order_cnt_lsb_minus4At(long index) { return log2_max_pic_order_cnt_lsb_minus4(this.segment(), index); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4At(long index, byte value) { log2_max_pic_order_cnt_lsb_minus4(this.segment(), index, value); return this; }

    /// {@return `num_ref_frames_in_pic_order_cnt_cycle` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_frames_in_pic_order_cnt_cycleAt(long index) { return num_ref_frames_in_pic_order_cnt_cycle(this.segment(), index); }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycleAt(long index, byte value) { num_ref_frames_in_pic_order_cnt_cycle(this.segment(), index, value); return this; }

    /// {@return `max_num_ref_frames` at the given index}
    /// @param index the index of the struct buffer
    public byte max_num_ref_framesAt(long index) { return max_num_ref_frames(this.segment(), index); }
    /// Sets `max_num_ref_frames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet max_num_ref_framesAt(long index, byte value) { max_num_ref_frames(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `pic_width_in_mbs_minus1` at the given index}
    /// @param index the index of the struct buffer
    public int pic_width_in_mbs_minus1At(long index) { return pic_width_in_mbs_minus1(this.segment(), index); }
    /// Sets `pic_width_in_mbs_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1At(long index, int value) { pic_width_in_mbs_minus1(this.segment(), index, value); return this; }

    /// {@return `pic_height_in_map_units_minus1` at the given index}
    /// @param index the index of the struct buffer
    public int pic_height_in_map_units_minus1At(long index) { return pic_height_in_map_units_minus1(this.segment(), index); }
    /// Sets `pic_height_in_map_units_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1At(long index, int value) { pic_height_in_map_units_minus1(this.segment(), index, value); return this; }

    /// {@return `frame_crop_left_offset` at the given index}
    /// @param index the index of the struct buffer
    public int frame_crop_left_offsetAt(long index) { return frame_crop_left_offset(this.segment(), index); }
    /// Sets `frame_crop_left_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_left_offsetAt(long index, int value) { frame_crop_left_offset(this.segment(), index, value); return this; }

    /// {@return `frame_crop_right_offset` at the given index}
    /// @param index the index of the struct buffer
    public int frame_crop_right_offsetAt(long index) { return frame_crop_right_offset(this.segment(), index); }
    /// Sets `frame_crop_right_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_right_offsetAt(long index, int value) { frame_crop_right_offset(this.segment(), index, value); return this; }

    /// {@return `frame_crop_top_offset` at the given index}
    /// @param index the index of the struct buffer
    public int frame_crop_top_offsetAt(long index) { return frame_crop_top_offset(this.segment(), index); }
    /// Sets `frame_crop_top_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_top_offsetAt(long index, int value) { frame_crop_top_offset(this.segment(), index, value); return this; }

    /// {@return `frame_crop_bottom_offset` at the given index}
    /// @param index the index of the struct buffer
    public int frame_crop_bottom_offsetAt(long index) { return frame_crop_bottom_offset(this.segment(), index); }
    /// Sets `frame_crop_bottom_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_bottom_offsetAt(long index, int value) { frame_crop_bottom_offset(this.segment(), index, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param index the index of the struct buffer
    public int reserved2At(long index) { return reserved2(this.segment(), index); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved2At(long index, int value) { reserved2(this.segment(), index, value); return this; }

    /// {@return `pOffsetForRefFrame` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pOffsetForRefFrameAt(long index) { return pOffsetForRefFrame(this.segment(), index); }
    /// Sets `pOffsetForRefFrame` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pOffsetForRefFrameAt(long index, MemorySegment value) { pOffsetForRefFrame(this.segment(), index, value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pScalingListsAt(long index) { return pScalingLists(this.segment(), index); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pScalingListsAt(long index, MemorySegment value) { pScalingLists(this.segment(), index, value); return this; }

    /// {@return `pSequenceParameterSetVui` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSequenceParameterSetVuiAt(long index) { return pSequenceParameterSetVui(this.segment(), index); }
    /// Sets `pSequenceParameterSetVui` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pSequenceParameterSetVuiAt(long index, MemorySegment value) { pSequenceParameterSetVui(this.segment(), index, value); return this; }

}
