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

/// Represents `StdVideoH265VideoParameterSet`.
/// ## Layout
/// ```
/// struct StdVideoH265VideoParameterSet {
///     (struct StdVideoH265VpsFlags) StdVideoH265VpsFlags flags;
///     uint8_t vps_video_parameter_set_id;
///     uint8_t vps_max_sub_layers_minus1;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint32_t vps_num_units_in_tick;
///     uint32_t vps_time_scale;
///     uint32_t vps_num_ticks_poc_diff_one_minus1;
///     uint32_t reserved3;
///     const StdVideoH265DecPicBufMgr* pDecPicBufMgr;
///     const StdVideoH265HrdParameters* pHrdParameters;
///     const StdVideoH265ProfileTierLevel* pProfileTierLevel;
/// };
/// ```
public final class StdVideoH265VideoParameterSet extends GroupType {
    /// The struct layout of `StdVideoH265VideoParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265VpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("vps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("vps_max_sub_layers_minus1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_INT.withName("vps_num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("vps_time_scale"),
        ValueLayout.JAVA_INT.withName("vps_num_ticks_poc_diff_one_minus1"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.ADDRESS.withName("pDecPicBufMgr"),
        ValueLayout.ADDRESS.withName("pHrdParameters"),
        ValueLayout.ADDRESS.withName("pProfileTierLevel")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `vps_video_parameter_set_id`.
    public static final long OFFSET_vps_video_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("vps_video_parameter_set_id"));
    /// The memory layout of `vps_video_parameter_set_id`.
    public static final MemoryLayout LAYOUT_vps_video_parameter_set_id = LAYOUT.select(PathElement.groupElement("vps_video_parameter_set_id"));
    /// The [VarHandle] of `vps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_video_parameter_set_id"));
    /// The byte offset of `vps_max_sub_layers_minus1`.
    public static final long OFFSET_vps_max_sub_layers_minus1 = LAYOUT.byteOffset(PathElement.groupElement("vps_max_sub_layers_minus1"));
    /// The memory layout of `vps_max_sub_layers_minus1`.
    public static final MemoryLayout LAYOUT_vps_max_sub_layers_minus1 = LAYOUT.select(PathElement.groupElement("vps_max_sub_layers_minus1"));
    /// The [VarHandle] of `vps_max_sub_layers_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vps_max_sub_layers_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_max_sub_layers_minus1"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The byte offset of `vps_num_units_in_tick`.
    public static final long OFFSET_vps_num_units_in_tick = LAYOUT.byteOffset(PathElement.groupElement("vps_num_units_in_tick"));
    /// The memory layout of `vps_num_units_in_tick`.
    public static final MemoryLayout LAYOUT_vps_num_units_in_tick = LAYOUT.select(PathElement.groupElement("vps_num_units_in_tick"));
    /// The [VarHandle] of `vps_num_units_in_tick` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vps_num_units_in_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_num_units_in_tick"));
    /// The byte offset of `vps_time_scale`.
    public static final long OFFSET_vps_time_scale = LAYOUT.byteOffset(PathElement.groupElement("vps_time_scale"));
    /// The memory layout of `vps_time_scale`.
    public static final MemoryLayout LAYOUT_vps_time_scale = LAYOUT.select(PathElement.groupElement("vps_time_scale"));
    /// The [VarHandle] of `vps_time_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vps_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_time_scale"));
    /// The byte offset of `vps_num_ticks_poc_diff_one_minus1`.
    public static final long OFFSET_vps_num_ticks_poc_diff_one_minus1 = LAYOUT.byteOffset(PathElement.groupElement("vps_num_ticks_poc_diff_one_minus1"));
    /// The memory layout of `vps_num_ticks_poc_diff_one_minus1`.
    public static final MemoryLayout LAYOUT_vps_num_ticks_poc_diff_one_minus1 = LAYOUT.select(PathElement.groupElement("vps_num_ticks_poc_diff_one_minus1"));
    /// The [VarHandle] of `vps_num_ticks_poc_diff_one_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vps_num_ticks_poc_diff_one_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_num_ticks_poc_diff_one_minus1"));
    /// The byte offset of `reserved3`.
    public static final long OFFSET_reserved3 = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
    /// The memory layout of `reserved3`.
    public static final MemoryLayout LAYOUT_reserved3 = LAYOUT.select(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The byte offset of `pDecPicBufMgr`.
    public static final long OFFSET_pDecPicBufMgr = LAYOUT.byteOffset(PathElement.groupElement("pDecPicBufMgr"));
    /// The memory layout of `pDecPicBufMgr`.
    public static final MemoryLayout LAYOUT_pDecPicBufMgr = LAYOUT.select(PathElement.groupElement("pDecPicBufMgr"));
    /// The [VarHandle] of `pDecPicBufMgr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDecPicBufMgr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDecPicBufMgr"));
    /// The byte offset of `pHrdParameters`.
    public static final long OFFSET_pHrdParameters = LAYOUT.byteOffset(PathElement.groupElement("pHrdParameters"));
    /// The memory layout of `pHrdParameters`.
    public static final MemoryLayout LAYOUT_pHrdParameters = LAYOUT.select(PathElement.groupElement("pHrdParameters"));
    /// The [VarHandle] of `pHrdParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHrdParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHrdParameters"));
    /// The byte offset of `pProfileTierLevel`.
    public static final long OFFSET_pProfileTierLevel = LAYOUT.byteOffset(PathElement.groupElement("pProfileTierLevel"));
    /// The memory layout of `pProfileTierLevel`.
    public static final MemoryLayout LAYOUT_pProfileTierLevel = LAYOUT.select(PathElement.groupElement("pProfileTierLevel"));
    /// The [VarHandle] of `pProfileTierLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pProfileTierLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfileTierLevel"));

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265VideoParameterSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VideoParameterSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265VideoParameterSet(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VideoParameterSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265VideoParameterSet(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VideoParameterSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265VideoParameterSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265VideoParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265VideoParameterSet`
    public static StdVideoH265VideoParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH265VideoParameterSet(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265VideoParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265VideoParameterSet`
    public static StdVideoH265VideoParameterSet alloc(SegmentAllocator allocator, long count) { return new StdVideoH265VideoParameterSet(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265VideoParameterSet copyFrom(StdVideoH265VideoParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265VideoParameterSet reinterpret(long count) { return new StdVideoH265VideoParameterSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoH265VideoParameterSet flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH265VideoParameterSet flags(Consumer<overrungl.vulkan.video.StdVideoH265VpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265VpsFlags.of(flags())); return this; }

    /// {@return `vps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte vps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_vps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `vps_video_parameter_set_id`}
    public byte vps_video_parameter_set_id() { return vps_video_parameter_set_id(this.segment(), 0L); }
    /// Sets `vps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vps_video_parameter_set_id(MemorySegment segment, long index, byte value) { VH_vps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `vps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_video_parameter_set_id(byte value) { vps_video_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `vps_max_sub_layers_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte vps_max_sub_layers_minus1(MemorySegment segment, long index) { return (byte) VH_vps_max_sub_layers_minus1.get(segment, 0L, index); }
    /// {@return `vps_max_sub_layers_minus1`}
    public byte vps_max_sub_layers_minus1() { return vps_max_sub_layers_minus1(this.segment(), 0L); }
    /// Sets `vps_max_sub_layers_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vps_max_sub_layers_minus1(MemorySegment segment, long index, byte value) { VH_vps_max_sub_layers_minus1.set(segment, 0L, index, value); }
    /// Sets `vps_max_sub_layers_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1(byte value) { vps_max_sub_layers_minus1(this.segment(), 0L, value); return this; }

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
    public StdVideoH265VideoParameterSet reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    public byte reserved2() { return reserved2(this.segment(), 0L); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved2(byte value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `vps_num_units_in_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vps_num_units_in_tick(MemorySegment segment, long index) { return (int) VH_vps_num_units_in_tick.get(segment, 0L, index); }
    /// {@return `vps_num_units_in_tick`}
    public int vps_num_units_in_tick() { return vps_num_units_in_tick(this.segment(), 0L); }
    /// Sets `vps_num_units_in_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vps_num_units_in_tick(MemorySegment segment, long index, int value) { VH_vps_num_units_in_tick.set(segment, 0L, index, value); }
    /// Sets `vps_num_units_in_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_units_in_tick(int value) { vps_num_units_in_tick(this.segment(), 0L, value); return this; }

    /// {@return `vps_time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vps_time_scale(MemorySegment segment, long index) { return (int) VH_vps_time_scale.get(segment, 0L, index); }
    /// {@return `vps_time_scale`}
    public int vps_time_scale() { return vps_time_scale(this.segment(), 0L); }
    /// Sets `vps_time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vps_time_scale(MemorySegment segment, long index, int value) { VH_vps_time_scale.set(segment, 0L, index, value); }
    /// Sets `vps_time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_time_scale(int value) { vps_time_scale(this.segment(), 0L, value); return this; }

    /// {@return `vps_num_ticks_poc_diff_one_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vps_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index) { return (int) VH_vps_num_ticks_poc_diff_one_minus1.get(segment, 0L, index); }
    /// {@return `vps_num_ticks_poc_diff_one_minus1`}
    public int vps_num_ticks_poc_diff_one_minus1() { return vps_num_ticks_poc_diff_one_minus1(this.segment(), 0L); }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vps_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index, int value) { VH_vps_num_ticks_poc_diff_one_minus1.set(segment, 0L, index, value); }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1(int value) { vps_num_ticks_poc_diff_one_minus1(this.segment(), 0L, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int reserved3(MemorySegment segment, long index) { return (int) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    public int reserved3() { return reserved3(this.segment(), 0L); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved3(MemorySegment segment, long index, int value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved3(int value) { reserved3(this.segment(), 0L, value); return this; }

    /// {@return `pDecPicBufMgr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDecPicBufMgr(MemorySegment segment, long index) { return (MemorySegment) VH_pDecPicBufMgr.get(segment, 0L, index); }
    /// {@return `pDecPicBufMgr`}
    public MemorySegment pDecPicBufMgr() { return pDecPicBufMgr(this.segment(), 0L); }
    /// Sets `pDecPicBufMgr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDecPicBufMgr(MemorySegment segment, long index, MemorySegment value) { VH_pDecPicBufMgr.set(segment, 0L, index, value); }
    /// Sets `pDecPicBufMgr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pDecPicBufMgr(MemorySegment value) { pDecPicBufMgr(this.segment(), 0L, value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHrdParameters(MemorySegment segment, long index) { return (MemorySegment) VH_pHrdParameters.get(segment, 0L, index); }
    /// {@return `pHrdParameters`}
    public MemorySegment pHrdParameters() { return pHrdParameters(this.segment(), 0L); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHrdParameters(MemorySegment segment, long index, MemorySegment value) { VH_pHrdParameters.set(segment, 0L, index, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pHrdParameters(MemorySegment value) { pHrdParameters(this.segment(), 0L, value); return this; }

    /// {@return `pProfileTierLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pProfileTierLevel(MemorySegment segment, long index) { return (MemorySegment) VH_pProfileTierLevel.get(segment, 0L, index); }
    /// {@return `pProfileTierLevel`}
    public MemorySegment pProfileTierLevel() { return pProfileTierLevel(this.segment(), 0L); }
    /// Sets `pProfileTierLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pProfileTierLevel(MemorySegment segment, long index, MemorySegment value) { VH_pProfileTierLevel.set(segment, 0L, index, value); }
    /// Sets `pProfileTierLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pProfileTierLevel(MemorySegment value) { pProfileTierLevel(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoH265VideoParameterSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265VideoParameterSet`
    public StdVideoH265VideoParameterSet asSlice(long index) { return new StdVideoH265VideoParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265VideoParameterSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265VideoParameterSet`
    public StdVideoH265VideoParameterSet asSlice(long index, long count) { return new StdVideoH265VideoParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265VideoParameterSet` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265VideoParameterSet at(long index, Consumer<StdVideoH265VideoParameterSet> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoH265VideoParameterSet flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH265VpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265VpsFlags.of(flagsAt(index))); return this; }

    /// {@return `vps_video_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte vps_video_parameter_set_idAt(long index) { return vps_video_parameter_set_id(this.segment(), index); }
    /// Sets `vps_video_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_video_parameter_set_idAt(long index, byte value) { vps_video_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `vps_max_sub_layers_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte vps_max_sub_layers_minus1At(long index) { return vps_max_sub_layers_minus1(this.segment(), index); }
    /// Sets `vps_max_sub_layers_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1At(long index, byte value) { vps_max_sub_layers_minus1(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved2At(long index) { return reserved2(this.segment(), index); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved2At(long index, byte value) { reserved2(this.segment(), index, value); return this; }

    /// {@return `vps_num_units_in_tick` at the given index}
    /// @param index the index of the struct buffer
    public int vps_num_units_in_tickAt(long index) { return vps_num_units_in_tick(this.segment(), index); }
    /// Sets `vps_num_units_in_tick` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_units_in_tickAt(long index, int value) { vps_num_units_in_tick(this.segment(), index, value); return this; }

    /// {@return `vps_time_scale` at the given index}
    /// @param index the index of the struct buffer
    public int vps_time_scaleAt(long index) { return vps_time_scale(this.segment(), index); }
    /// Sets `vps_time_scale` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_time_scaleAt(long index, int value) { vps_time_scale(this.segment(), index, value); return this; }

    /// {@return `vps_num_ticks_poc_diff_one_minus1` at the given index}
    /// @param index the index of the struct buffer
    public int vps_num_ticks_poc_diff_one_minus1At(long index) { return vps_num_ticks_poc_diff_one_minus1(this.segment(), index); }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1At(long index, int value) { vps_num_ticks_poc_diff_one_minus1(this.segment(), index, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param index the index of the struct buffer
    public int reserved3At(long index) { return reserved3(this.segment(), index); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved3At(long index, int value) { reserved3(this.segment(), index, value); return this; }

    /// {@return `pDecPicBufMgr` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDecPicBufMgrAt(long index) { return pDecPicBufMgr(this.segment(), index); }
    /// Sets `pDecPicBufMgr` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pDecPicBufMgrAt(long index, MemorySegment value) { pDecPicBufMgr(this.segment(), index, value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pHrdParametersAt(long index) { return pHrdParameters(this.segment(), index); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pHrdParametersAt(long index, MemorySegment value) { pHrdParameters(this.segment(), index, value); return this; }

    /// {@return `pProfileTierLevel` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pProfileTierLevelAt(long index) { return pProfileTierLevel(this.segment(), index); }
    /// Sets `pProfileTierLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pProfileTierLevelAt(long index, MemorySegment value) { pProfileTierLevel(this.segment(), index, value); return this; }

}
