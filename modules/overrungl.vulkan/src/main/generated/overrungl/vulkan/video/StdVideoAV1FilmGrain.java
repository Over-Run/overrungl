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

/// Represents `StdVideoAV1FilmGrain`.
/// ## Layout
/// ```
/// struct StdVideoAV1FilmGrain {
///     (struct StdVideoAV1FilmGrainFlags) StdVideoAV1FilmGrainFlags flags;
///     uint8_t grain_scaling_minus_8;
///     uint8_t ar_coeff_lag;
///     uint8_t ar_coeff_shift_minus_6;
///     uint8_t grain_scale_shift;
///     uint16_t grain_seed;
///     uint8_t film_grain_params_ref_idx;
///     uint8_t num_y_points;
///     uint8_t point_y_value[14];
///     uint8_t point_y_scaling[14];
///     uint8_t num_cb_points;
///     uint8_t point_cb_value[10];
///     uint8_t point_cb_scaling[10];
///     uint8_t num_cr_points;
///     uint8_t point_cr_value[10];
///     uint8_t point_cr_scaling[10];
///     int8_t ar_coeffs_y_plus_128[24];
///     int8_t ar_coeffs_cb_plus_128[25];
///     int8_t ar_coeffs_cr_plus_128[25];
///     uint8_t cb_mult;
///     uint8_t cb_luma_mult;
///     uint16_t cb_offset;
///     uint8_t cr_mult;
///     uint8_t cr_luma_mult;
///     uint16_t cr_offset;
/// };
/// ```
public final class StdVideoAV1FilmGrain extends GroupType {
    /// The struct layout of `StdVideoAV1FilmGrain`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1FilmGrainFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("grain_scaling_minus_8"),
        ValueLayout.JAVA_BYTE.withName("ar_coeff_lag"),
        ValueLayout.JAVA_BYTE.withName("ar_coeff_shift_minus_6"),
        ValueLayout.JAVA_BYTE.withName("grain_scale_shift"),
        ValueLayout.JAVA_SHORT.withName("grain_seed"),
        ValueLayout.JAVA_BYTE.withName("film_grain_params_ref_idx"),
        ValueLayout.JAVA_BYTE.withName("num_y_points"),
        MemoryLayout.sequenceLayout(14, ValueLayout.JAVA_BYTE).withName("point_y_value"),
        MemoryLayout.sequenceLayout(14, ValueLayout.JAVA_BYTE).withName("point_y_scaling"),
        ValueLayout.JAVA_BYTE.withName("num_cb_points"),
        MemoryLayout.sequenceLayout(10, ValueLayout.JAVA_BYTE).withName("point_cb_value"),
        MemoryLayout.sequenceLayout(10, ValueLayout.JAVA_BYTE).withName("point_cb_scaling"),
        ValueLayout.JAVA_BYTE.withName("num_cr_points"),
        MemoryLayout.sequenceLayout(10, ValueLayout.JAVA_BYTE).withName("point_cr_value"),
        MemoryLayout.sequenceLayout(10, ValueLayout.JAVA_BYTE).withName("point_cr_scaling"),
        MemoryLayout.sequenceLayout(24, ValueLayout.JAVA_BYTE).withName("ar_coeffs_y_plus_128"),
        MemoryLayout.sequenceLayout(25, ValueLayout.JAVA_BYTE).withName("ar_coeffs_cb_plus_128"),
        MemoryLayout.sequenceLayout(25, ValueLayout.JAVA_BYTE).withName("ar_coeffs_cr_plus_128"),
        ValueLayout.JAVA_BYTE.withName("cb_mult"),
        ValueLayout.JAVA_BYTE.withName("cb_luma_mult"),
        ValueLayout.JAVA_SHORT.withName("cb_offset"),
        ValueLayout.JAVA_BYTE.withName("cr_mult"),
        ValueLayout.JAVA_BYTE.withName("cr_luma_mult"),
        ValueLayout.JAVA_SHORT.withName("cr_offset")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `grain_scaling_minus_8`.
    public static final long OFFSET_grain_scaling_minus_8 = LAYOUT.byteOffset(PathElement.groupElement("grain_scaling_minus_8"));
    /// The memory layout of `grain_scaling_minus_8`.
    public static final MemoryLayout LAYOUT_grain_scaling_minus_8 = LAYOUT.select(PathElement.groupElement("grain_scaling_minus_8"));
    /// The [VarHandle] of `grain_scaling_minus_8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_grain_scaling_minus_8 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("grain_scaling_minus_8")));
    /// The byte offset of `ar_coeff_lag`.
    public static final long OFFSET_ar_coeff_lag = LAYOUT.byteOffset(PathElement.groupElement("ar_coeff_lag"));
    /// The memory layout of `ar_coeff_lag`.
    public static final MemoryLayout LAYOUT_ar_coeff_lag = LAYOUT.select(PathElement.groupElement("ar_coeff_lag"));
    /// The [VarHandle] of `ar_coeff_lag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_ar_coeff_lag = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeff_lag")));
    /// The byte offset of `ar_coeff_shift_minus_6`.
    public static final long OFFSET_ar_coeff_shift_minus_6 = LAYOUT.byteOffset(PathElement.groupElement("ar_coeff_shift_minus_6"));
    /// The memory layout of `ar_coeff_shift_minus_6`.
    public static final MemoryLayout LAYOUT_ar_coeff_shift_minus_6 = LAYOUT.select(PathElement.groupElement("ar_coeff_shift_minus_6"));
    /// The [VarHandle] of `ar_coeff_shift_minus_6` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_ar_coeff_shift_minus_6 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeff_shift_minus_6")));
    /// The byte offset of `grain_scale_shift`.
    public static final long OFFSET_grain_scale_shift = LAYOUT.byteOffset(PathElement.groupElement("grain_scale_shift"));
    /// The memory layout of `grain_scale_shift`.
    public static final MemoryLayout LAYOUT_grain_scale_shift = LAYOUT.select(PathElement.groupElement("grain_scale_shift"));
    /// The [VarHandle] of `grain_scale_shift` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_grain_scale_shift = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("grain_scale_shift")));
    /// The byte offset of `grain_seed`.
    public static final long OFFSET_grain_seed = LAYOUT.byteOffset(PathElement.groupElement("grain_seed"));
    /// The memory layout of `grain_seed`.
    public static final MemoryLayout LAYOUT_grain_seed = LAYOUT.select(PathElement.groupElement("grain_seed"));
    /// The [VarHandle] of `grain_seed` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_grain_seed = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("grain_seed")));
    /// The byte offset of `film_grain_params_ref_idx`.
    public static final long OFFSET_film_grain_params_ref_idx = LAYOUT.byteOffset(PathElement.groupElement("film_grain_params_ref_idx"));
    /// The memory layout of `film_grain_params_ref_idx`.
    public static final MemoryLayout LAYOUT_film_grain_params_ref_idx = LAYOUT.select(PathElement.groupElement("film_grain_params_ref_idx"));
    /// The [VarHandle] of `film_grain_params_ref_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_film_grain_params_ref_idx = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("film_grain_params_ref_idx")));
    /// The byte offset of `num_y_points`.
    public static final long OFFSET_num_y_points = LAYOUT.byteOffset(PathElement.groupElement("num_y_points"));
    /// The memory layout of `num_y_points`.
    public static final MemoryLayout LAYOUT_num_y_points = LAYOUT.select(PathElement.groupElement("num_y_points"));
    /// The [VarHandle] of `num_y_points` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_num_y_points = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_y_points")));
    /// The byte offset of `point_y_value`.
    public static final long OFFSET_point_y_value = LAYOUT.byteOffset(PathElement.groupElement("point_y_value"));
    /// The memory layout of `point_y_value`.
    public static final MemoryLayout LAYOUT_point_y_value = LAYOUT.select(PathElement.groupElement("point_y_value"));
    /// The [VarHandle] of `point_y_value` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_point_y_value = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_y_value"), PathElement.sequenceElement()));
    /// The byte offset of `point_y_scaling`.
    public static final long OFFSET_point_y_scaling = LAYOUT.byteOffset(PathElement.groupElement("point_y_scaling"));
    /// The memory layout of `point_y_scaling`.
    public static final MemoryLayout LAYOUT_point_y_scaling = LAYOUT.select(PathElement.groupElement("point_y_scaling"));
    /// The [VarHandle] of `point_y_scaling` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_point_y_scaling = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_y_scaling"), PathElement.sequenceElement()));
    /// The byte offset of `num_cb_points`.
    public static final long OFFSET_num_cb_points = LAYOUT.byteOffset(PathElement.groupElement("num_cb_points"));
    /// The memory layout of `num_cb_points`.
    public static final MemoryLayout LAYOUT_num_cb_points = LAYOUT.select(PathElement.groupElement("num_cb_points"));
    /// The [VarHandle] of `num_cb_points` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_num_cb_points = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_cb_points")));
    /// The byte offset of `point_cb_value`.
    public static final long OFFSET_point_cb_value = LAYOUT.byteOffset(PathElement.groupElement("point_cb_value"));
    /// The memory layout of `point_cb_value`.
    public static final MemoryLayout LAYOUT_point_cb_value = LAYOUT.select(PathElement.groupElement("point_cb_value"));
    /// The [VarHandle] of `point_cb_value` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_point_cb_value = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cb_value"), PathElement.sequenceElement()));
    /// The byte offset of `point_cb_scaling`.
    public static final long OFFSET_point_cb_scaling = LAYOUT.byteOffset(PathElement.groupElement("point_cb_scaling"));
    /// The memory layout of `point_cb_scaling`.
    public static final MemoryLayout LAYOUT_point_cb_scaling = LAYOUT.select(PathElement.groupElement("point_cb_scaling"));
    /// The [VarHandle] of `point_cb_scaling` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_point_cb_scaling = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cb_scaling"), PathElement.sequenceElement()));
    /// The byte offset of `num_cr_points`.
    public static final long OFFSET_num_cr_points = LAYOUT.byteOffset(PathElement.groupElement("num_cr_points"));
    /// The memory layout of `num_cr_points`.
    public static final MemoryLayout LAYOUT_num_cr_points = LAYOUT.select(PathElement.groupElement("num_cr_points"));
    /// The [VarHandle] of `num_cr_points` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_num_cr_points = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_cr_points")));
    /// The byte offset of `point_cr_value`.
    public static final long OFFSET_point_cr_value = LAYOUT.byteOffset(PathElement.groupElement("point_cr_value"));
    /// The memory layout of `point_cr_value`.
    public static final MemoryLayout LAYOUT_point_cr_value = LAYOUT.select(PathElement.groupElement("point_cr_value"));
    /// The [VarHandle] of `point_cr_value` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_point_cr_value = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cr_value"), PathElement.sequenceElement()));
    /// The byte offset of `point_cr_scaling`.
    public static final long OFFSET_point_cr_scaling = LAYOUT.byteOffset(PathElement.groupElement("point_cr_scaling"));
    /// The memory layout of `point_cr_scaling`.
    public static final MemoryLayout LAYOUT_point_cr_scaling = LAYOUT.select(PathElement.groupElement("point_cr_scaling"));
    /// The [VarHandle] of `point_cr_scaling` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_point_cr_scaling = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("point_cr_scaling"), PathElement.sequenceElement()));
    /// The byte offset of `ar_coeffs_y_plus_128`.
    public static final long OFFSET_ar_coeffs_y_plus_128 = LAYOUT.byteOffset(PathElement.groupElement("ar_coeffs_y_plus_128"));
    /// The memory layout of `ar_coeffs_y_plus_128`.
    public static final MemoryLayout LAYOUT_ar_coeffs_y_plus_128 = LAYOUT.select(PathElement.groupElement("ar_coeffs_y_plus_128"));
    /// The [VarHandle] of `ar_coeffs_y_plus_128` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_ar_coeffs_y_plus_128 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeffs_y_plus_128"), PathElement.sequenceElement()));
    /// The byte offset of `ar_coeffs_cb_plus_128`.
    public static final long OFFSET_ar_coeffs_cb_plus_128 = LAYOUT.byteOffset(PathElement.groupElement("ar_coeffs_cb_plus_128"));
    /// The memory layout of `ar_coeffs_cb_plus_128`.
    public static final MemoryLayout LAYOUT_ar_coeffs_cb_plus_128 = LAYOUT.select(PathElement.groupElement("ar_coeffs_cb_plus_128"));
    /// The [VarHandle] of `ar_coeffs_cb_plus_128` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_ar_coeffs_cb_plus_128 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeffs_cb_plus_128"), PathElement.sequenceElement()));
    /// The byte offset of `ar_coeffs_cr_plus_128`.
    public static final long OFFSET_ar_coeffs_cr_plus_128 = LAYOUT.byteOffset(PathElement.groupElement("ar_coeffs_cr_plus_128"));
    /// The memory layout of `ar_coeffs_cr_plus_128`.
    public static final MemoryLayout LAYOUT_ar_coeffs_cr_plus_128 = LAYOUT.select(PathElement.groupElement("ar_coeffs_cr_plus_128"));
    /// The [VarHandle] of `ar_coeffs_cr_plus_128` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_ar_coeffs_cr_plus_128 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ar_coeffs_cr_plus_128"), PathElement.sequenceElement()));
    /// The byte offset of `cb_mult`.
    public static final long OFFSET_cb_mult = LAYOUT.byteOffset(PathElement.groupElement("cb_mult"));
    /// The memory layout of `cb_mult`.
    public static final MemoryLayout LAYOUT_cb_mult = LAYOUT.select(PathElement.groupElement("cb_mult"));
    /// The [VarHandle] of `cb_mult` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cb_mult = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_mult")));
    /// The byte offset of `cb_luma_mult`.
    public static final long OFFSET_cb_luma_mult = LAYOUT.byteOffset(PathElement.groupElement("cb_luma_mult"));
    /// The memory layout of `cb_luma_mult`.
    public static final MemoryLayout LAYOUT_cb_luma_mult = LAYOUT.select(PathElement.groupElement("cb_luma_mult"));
    /// The [VarHandle] of `cb_luma_mult` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cb_luma_mult = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_luma_mult")));
    /// The byte offset of `cb_offset`.
    public static final long OFFSET_cb_offset = LAYOUT.byteOffset(PathElement.groupElement("cb_offset"));
    /// The memory layout of `cb_offset`.
    public static final MemoryLayout LAYOUT_cb_offset = LAYOUT.select(PathElement.groupElement("cb_offset"));
    /// The [VarHandle] of `cb_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cb_offset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cb_offset")));
    /// The byte offset of `cr_mult`.
    public static final long OFFSET_cr_mult = LAYOUT.byteOffset(PathElement.groupElement("cr_mult"));
    /// The memory layout of `cr_mult`.
    public static final MemoryLayout LAYOUT_cr_mult = LAYOUT.select(PathElement.groupElement("cr_mult"));
    /// The [VarHandle] of `cr_mult` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cr_mult = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_mult")));
    /// The byte offset of `cr_luma_mult`.
    public static final long OFFSET_cr_luma_mult = LAYOUT.byteOffset(PathElement.groupElement("cr_luma_mult"));
    /// The memory layout of `cr_luma_mult`.
    public static final MemoryLayout LAYOUT_cr_luma_mult = LAYOUT.select(PathElement.groupElement("cr_luma_mult"));
    /// The [VarHandle] of `cr_luma_mult` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cr_luma_mult = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_luma_mult")));
    /// The byte offset of `cr_offset`.
    public static final long OFFSET_cr_offset = LAYOUT.byteOffset(PathElement.groupElement("cr_offset"));
    /// The memory layout of `cr_offset`.
    public static final MemoryLayout LAYOUT_cr_offset = LAYOUT.select(PathElement.groupElement("cr_offset"));
    /// The [VarHandle] of `cr_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cr_offset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cr_offset")));

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1FilmGrain(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrain of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrain(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrain ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrain(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1FilmGrain` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrain ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrain(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1FilmGrain` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1FilmGrain`
    public static StdVideoAV1FilmGrain alloc(SegmentAllocator allocator) { return new StdVideoAV1FilmGrain(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1FilmGrain` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1FilmGrain`
    public static StdVideoAV1FilmGrain alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1FilmGrain(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1FilmGrain copyFrom(StdVideoAV1FilmGrain src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1FilmGrain reinterpret(long count) { return new StdVideoAV1FilmGrain(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoAV1FilmGrain flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoAV1FilmGrain flags(Consumer<overrungl.vulkan.video.StdVideoAV1FilmGrainFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1FilmGrainFlags.of(flags())); return this; }

    /// {@return `grain_scaling_minus_8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte grain_scaling_minus_8(MemorySegment segment, long index) { return (byte) VH_grain_scaling_minus_8.get().get(segment, 0L, index); }
    /// {@return `grain_scaling_minus_8`}
    public byte grain_scaling_minus_8() { return grain_scaling_minus_8(this.segment(), 0L); }
    /// Sets `grain_scaling_minus_8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void grain_scaling_minus_8(MemorySegment segment, long index, byte value) { VH_grain_scaling_minus_8.get().set(segment, 0L, index, value); }
    /// Sets `grain_scaling_minus_8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_scaling_minus_8(byte value) { grain_scaling_minus_8(this.segment(), 0L, value); return this; }

    /// {@return `ar_coeff_lag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte ar_coeff_lag(MemorySegment segment, long index) { return (byte) VH_ar_coeff_lag.get().get(segment, 0L, index); }
    /// {@return `ar_coeff_lag`}
    public byte ar_coeff_lag() { return ar_coeff_lag(this.segment(), 0L); }
    /// Sets `ar_coeff_lag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ar_coeff_lag(MemorySegment segment, long index, byte value) { VH_ar_coeff_lag.get().set(segment, 0L, index, value); }
    /// Sets `ar_coeff_lag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeff_lag(byte value) { ar_coeff_lag(this.segment(), 0L, value); return this; }

    /// {@return `ar_coeff_shift_minus_6` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte ar_coeff_shift_minus_6(MemorySegment segment, long index) { return (byte) VH_ar_coeff_shift_minus_6.get().get(segment, 0L, index); }
    /// {@return `ar_coeff_shift_minus_6`}
    public byte ar_coeff_shift_minus_6() { return ar_coeff_shift_minus_6(this.segment(), 0L); }
    /// Sets `ar_coeff_shift_minus_6` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ar_coeff_shift_minus_6(MemorySegment segment, long index, byte value) { VH_ar_coeff_shift_minus_6.get().set(segment, 0L, index, value); }
    /// Sets `ar_coeff_shift_minus_6` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeff_shift_minus_6(byte value) { ar_coeff_shift_minus_6(this.segment(), 0L, value); return this; }

    /// {@return `grain_scale_shift` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte grain_scale_shift(MemorySegment segment, long index) { return (byte) VH_grain_scale_shift.get().get(segment, 0L, index); }
    /// {@return `grain_scale_shift`}
    public byte grain_scale_shift() { return grain_scale_shift(this.segment(), 0L); }
    /// Sets `grain_scale_shift` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void grain_scale_shift(MemorySegment segment, long index, byte value) { VH_grain_scale_shift.get().set(segment, 0L, index, value); }
    /// Sets `grain_scale_shift` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_scale_shift(byte value) { grain_scale_shift(this.segment(), 0L, value); return this; }

    /// {@return `grain_seed` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short grain_seed(MemorySegment segment, long index) { return (short) VH_grain_seed.get().get(segment, 0L, index); }
    /// {@return `grain_seed`}
    public short grain_seed() { return grain_seed(this.segment(), 0L); }
    /// Sets `grain_seed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void grain_seed(MemorySegment segment, long index, short value) { VH_grain_seed.get().set(segment, 0L, index, value); }
    /// Sets `grain_seed` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_seed(short value) { grain_seed(this.segment(), 0L, value); return this; }

    /// {@return `film_grain_params_ref_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte film_grain_params_ref_idx(MemorySegment segment, long index) { return (byte) VH_film_grain_params_ref_idx.get().get(segment, 0L, index); }
    /// {@return `film_grain_params_ref_idx`}
    public byte film_grain_params_ref_idx() { return film_grain_params_ref_idx(this.segment(), 0L); }
    /// Sets `film_grain_params_ref_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void film_grain_params_ref_idx(MemorySegment segment, long index, byte value) { VH_film_grain_params_ref_idx.get().set(segment, 0L, index, value); }
    /// Sets `film_grain_params_ref_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain film_grain_params_ref_idx(byte value) { film_grain_params_ref_idx(this.segment(), 0L, value); return this; }

    /// {@return `num_y_points` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_y_points(MemorySegment segment, long index) { return (byte) VH_num_y_points.get().get(segment, 0L, index); }
    /// {@return `num_y_points`}
    public byte num_y_points() { return num_y_points(this.segment(), 0L); }
    /// Sets `num_y_points` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_y_points(MemorySegment segment, long index, byte value) { VH_num_y_points.get().set(segment, 0L, index, value); }
    /// Sets `num_y_points` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_y_points(byte value) { num_y_points(this.segment(), 0L, value); return this; }

    /// {@return `point_y_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment point_y_value(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_point_y_value, index), LAYOUT_point_y_value); }
    /// {@return `point_y_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte point_y_value(MemorySegment segment, long index, long index0) { return (byte) VH_point_y_value.get().get(segment, 0L, index, index0); }
    /// {@return `point_y_value`}
    public MemorySegment point_y_value() { return point_y_value(this.segment(), 0L); }
    /// {@return `point_y_value`}
    /// @param index0 the Index 0 of the array
    public byte point_y_value(long index0) { return point_y_value(this.segment(), 0L, index0); }
    /// Sets `point_y_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void point_y_value(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_point_y_value, index), LAYOUT_point_y_value.byteSize()); }
    /// Sets `point_y_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void point_y_value(MemorySegment segment, long index, long index0, byte value) { VH_point_y_value.get().set(segment, 0L, index, index0, value); }
    /// Sets `point_y_value` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_value(MemorySegment value) { point_y_value(this.segment(), 0L, value); return this; }
    /// Sets `point_y_value` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_value(long index0, byte value) { point_y_value(this.segment(), 0L, index0, value); return this; }

    /// {@return `point_y_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment point_y_scaling(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_point_y_scaling, index), LAYOUT_point_y_scaling); }
    /// {@return `point_y_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte point_y_scaling(MemorySegment segment, long index, long index0) { return (byte) VH_point_y_scaling.get().get(segment, 0L, index, index0); }
    /// {@return `point_y_scaling`}
    public MemorySegment point_y_scaling() { return point_y_scaling(this.segment(), 0L); }
    /// {@return `point_y_scaling`}
    /// @param index0 the Index 0 of the array
    public byte point_y_scaling(long index0) { return point_y_scaling(this.segment(), 0L, index0); }
    /// Sets `point_y_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void point_y_scaling(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_point_y_scaling, index), LAYOUT_point_y_scaling.byteSize()); }
    /// Sets `point_y_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void point_y_scaling(MemorySegment segment, long index, long index0, byte value) { VH_point_y_scaling.get().set(segment, 0L, index, index0, value); }
    /// Sets `point_y_scaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_scaling(MemorySegment value) { point_y_scaling(this.segment(), 0L, value); return this; }
    /// Sets `point_y_scaling` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_scaling(long index0, byte value) { point_y_scaling(this.segment(), 0L, index0, value); return this; }

    /// {@return `num_cb_points` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_cb_points(MemorySegment segment, long index) { return (byte) VH_num_cb_points.get().get(segment, 0L, index); }
    /// {@return `num_cb_points`}
    public byte num_cb_points() { return num_cb_points(this.segment(), 0L); }
    /// Sets `num_cb_points` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_cb_points(MemorySegment segment, long index, byte value) { VH_num_cb_points.get().set(segment, 0L, index, value); }
    /// Sets `num_cb_points` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_cb_points(byte value) { num_cb_points(this.segment(), 0L, value); return this; }

    /// {@return `point_cb_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment point_cb_value(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_point_cb_value, index), LAYOUT_point_cb_value); }
    /// {@return `point_cb_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte point_cb_value(MemorySegment segment, long index, long index0) { return (byte) VH_point_cb_value.get().get(segment, 0L, index, index0); }
    /// {@return `point_cb_value`}
    public MemorySegment point_cb_value() { return point_cb_value(this.segment(), 0L); }
    /// {@return `point_cb_value`}
    /// @param index0 the Index 0 of the array
    public byte point_cb_value(long index0) { return point_cb_value(this.segment(), 0L, index0); }
    /// Sets `point_cb_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void point_cb_value(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_point_cb_value, index), LAYOUT_point_cb_value.byteSize()); }
    /// Sets `point_cb_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void point_cb_value(MemorySegment segment, long index, long index0, byte value) { VH_point_cb_value.get().set(segment, 0L, index, index0, value); }
    /// Sets `point_cb_value` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_value(MemorySegment value) { point_cb_value(this.segment(), 0L, value); return this; }
    /// Sets `point_cb_value` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_value(long index0, byte value) { point_cb_value(this.segment(), 0L, index0, value); return this; }

    /// {@return `point_cb_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment point_cb_scaling(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_point_cb_scaling, index), LAYOUT_point_cb_scaling); }
    /// {@return `point_cb_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte point_cb_scaling(MemorySegment segment, long index, long index0) { return (byte) VH_point_cb_scaling.get().get(segment, 0L, index, index0); }
    /// {@return `point_cb_scaling`}
    public MemorySegment point_cb_scaling() { return point_cb_scaling(this.segment(), 0L); }
    /// {@return `point_cb_scaling`}
    /// @param index0 the Index 0 of the array
    public byte point_cb_scaling(long index0) { return point_cb_scaling(this.segment(), 0L, index0); }
    /// Sets `point_cb_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void point_cb_scaling(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_point_cb_scaling, index), LAYOUT_point_cb_scaling.byteSize()); }
    /// Sets `point_cb_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void point_cb_scaling(MemorySegment segment, long index, long index0, byte value) { VH_point_cb_scaling.get().set(segment, 0L, index, index0, value); }
    /// Sets `point_cb_scaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_scaling(MemorySegment value) { point_cb_scaling(this.segment(), 0L, value); return this; }
    /// Sets `point_cb_scaling` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_scaling(long index0, byte value) { point_cb_scaling(this.segment(), 0L, index0, value); return this; }

    /// {@return `num_cr_points` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_cr_points(MemorySegment segment, long index) { return (byte) VH_num_cr_points.get().get(segment, 0L, index); }
    /// {@return `num_cr_points`}
    public byte num_cr_points() { return num_cr_points(this.segment(), 0L); }
    /// Sets `num_cr_points` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_cr_points(MemorySegment segment, long index, byte value) { VH_num_cr_points.get().set(segment, 0L, index, value); }
    /// Sets `num_cr_points` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_cr_points(byte value) { num_cr_points(this.segment(), 0L, value); return this; }

    /// {@return `point_cr_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment point_cr_value(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_point_cr_value, index), LAYOUT_point_cr_value); }
    /// {@return `point_cr_value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte point_cr_value(MemorySegment segment, long index, long index0) { return (byte) VH_point_cr_value.get().get(segment, 0L, index, index0); }
    /// {@return `point_cr_value`}
    public MemorySegment point_cr_value() { return point_cr_value(this.segment(), 0L); }
    /// {@return `point_cr_value`}
    /// @param index0 the Index 0 of the array
    public byte point_cr_value(long index0) { return point_cr_value(this.segment(), 0L, index0); }
    /// Sets `point_cr_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void point_cr_value(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_point_cr_value, index), LAYOUT_point_cr_value.byteSize()); }
    /// Sets `point_cr_value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void point_cr_value(MemorySegment segment, long index, long index0, byte value) { VH_point_cr_value.get().set(segment, 0L, index, index0, value); }
    /// Sets `point_cr_value` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_value(MemorySegment value) { point_cr_value(this.segment(), 0L, value); return this; }
    /// Sets `point_cr_value` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_value(long index0, byte value) { point_cr_value(this.segment(), 0L, index0, value); return this; }

    /// {@return `point_cr_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment point_cr_scaling(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_point_cr_scaling, index), LAYOUT_point_cr_scaling); }
    /// {@return `point_cr_scaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte point_cr_scaling(MemorySegment segment, long index, long index0) { return (byte) VH_point_cr_scaling.get().get(segment, 0L, index, index0); }
    /// {@return `point_cr_scaling`}
    public MemorySegment point_cr_scaling() { return point_cr_scaling(this.segment(), 0L); }
    /// {@return `point_cr_scaling`}
    /// @param index0 the Index 0 of the array
    public byte point_cr_scaling(long index0) { return point_cr_scaling(this.segment(), 0L, index0); }
    /// Sets `point_cr_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void point_cr_scaling(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_point_cr_scaling, index), LAYOUT_point_cr_scaling.byteSize()); }
    /// Sets `point_cr_scaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void point_cr_scaling(MemorySegment segment, long index, long index0, byte value) { VH_point_cr_scaling.get().set(segment, 0L, index, index0, value); }
    /// Sets `point_cr_scaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_scaling(MemorySegment value) { point_cr_scaling(this.segment(), 0L, value); return this; }
    /// Sets `point_cr_scaling` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_scaling(long index0, byte value) { point_cr_scaling(this.segment(), 0L, index0, value); return this; }

    /// {@return `ar_coeffs_y_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ar_coeffs_y_plus_128(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ar_coeffs_y_plus_128, index), LAYOUT_ar_coeffs_y_plus_128); }
    /// {@return `ar_coeffs_y_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ar_coeffs_y_plus_128(MemorySegment segment, long index, long index0) { return (byte) VH_ar_coeffs_y_plus_128.get().get(segment, 0L, index, index0); }
    /// {@return `ar_coeffs_y_plus_128`}
    public MemorySegment ar_coeffs_y_plus_128() { return ar_coeffs_y_plus_128(this.segment(), 0L); }
    /// {@return `ar_coeffs_y_plus_128`}
    /// @param index0 the Index 0 of the array
    public byte ar_coeffs_y_plus_128(long index0) { return ar_coeffs_y_plus_128(this.segment(), 0L, index0); }
    /// Sets `ar_coeffs_y_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ar_coeffs_y_plus_128(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ar_coeffs_y_plus_128, index), LAYOUT_ar_coeffs_y_plus_128.byteSize()); }
    /// Sets `ar_coeffs_y_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ar_coeffs_y_plus_128(MemorySegment segment, long index, long index0, byte value) { VH_ar_coeffs_y_plus_128.get().set(segment, 0L, index, index0, value); }
    /// Sets `ar_coeffs_y_plus_128` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(MemorySegment value) { ar_coeffs_y_plus_128(this.segment(), 0L, value); return this; }
    /// Sets `ar_coeffs_y_plus_128` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(long index0, byte value) { ar_coeffs_y_plus_128(this.segment(), 0L, index0, value); return this; }

    /// {@return `ar_coeffs_cb_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ar_coeffs_cb_plus_128(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ar_coeffs_cb_plus_128, index), LAYOUT_ar_coeffs_cb_plus_128); }
    /// {@return `ar_coeffs_cb_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ar_coeffs_cb_plus_128(MemorySegment segment, long index, long index0) { return (byte) VH_ar_coeffs_cb_plus_128.get().get(segment, 0L, index, index0); }
    /// {@return `ar_coeffs_cb_plus_128`}
    public MemorySegment ar_coeffs_cb_plus_128() { return ar_coeffs_cb_plus_128(this.segment(), 0L); }
    /// {@return `ar_coeffs_cb_plus_128`}
    /// @param index0 the Index 0 of the array
    public byte ar_coeffs_cb_plus_128(long index0) { return ar_coeffs_cb_plus_128(this.segment(), 0L, index0); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ar_coeffs_cb_plus_128(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ar_coeffs_cb_plus_128, index), LAYOUT_ar_coeffs_cb_plus_128.byteSize()); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ar_coeffs_cb_plus_128(MemorySegment segment, long index, long index0, byte value) { VH_ar_coeffs_cb_plus_128.get().set(segment, 0L, index, index0, value); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(MemorySegment value) { ar_coeffs_cb_plus_128(this.segment(), 0L, value); return this; }
    /// Sets `ar_coeffs_cb_plus_128` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(long index0, byte value) { ar_coeffs_cb_plus_128(this.segment(), 0L, index0, value); return this; }

    /// {@return `ar_coeffs_cr_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ar_coeffs_cr_plus_128(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ar_coeffs_cr_plus_128, index), LAYOUT_ar_coeffs_cr_plus_128); }
    /// {@return `ar_coeffs_cr_plus_128` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ar_coeffs_cr_plus_128(MemorySegment segment, long index, long index0) { return (byte) VH_ar_coeffs_cr_plus_128.get().get(segment, 0L, index, index0); }
    /// {@return `ar_coeffs_cr_plus_128`}
    public MemorySegment ar_coeffs_cr_plus_128() { return ar_coeffs_cr_plus_128(this.segment(), 0L); }
    /// {@return `ar_coeffs_cr_plus_128`}
    /// @param index0 the Index 0 of the array
    public byte ar_coeffs_cr_plus_128(long index0) { return ar_coeffs_cr_plus_128(this.segment(), 0L, index0); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ar_coeffs_cr_plus_128(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ar_coeffs_cr_plus_128, index), LAYOUT_ar_coeffs_cr_plus_128.byteSize()); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ar_coeffs_cr_plus_128(MemorySegment segment, long index, long index0, byte value) { VH_ar_coeffs_cr_plus_128.get().set(segment, 0L, index, index0, value); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(MemorySegment value) { ar_coeffs_cr_plus_128(this.segment(), 0L, value); return this; }
    /// Sets `ar_coeffs_cr_plus_128` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(long index0, byte value) { ar_coeffs_cr_plus_128(this.segment(), 0L, index0, value); return this; }

    /// {@return `cb_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cb_mult(MemorySegment segment, long index) { return (byte) VH_cb_mult.get().get(segment, 0L, index); }
    /// {@return `cb_mult`}
    public byte cb_mult() { return cb_mult(this.segment(), 0L); }
    /// Sets `cb_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cb_mult(MemorySegment segment, long index, byte value) { VH_cb_mult.get().set(segment, 0L, index, value); }
    /// Sets `cb_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_mult(byte value) { cb_mult(this.segment(), 0L, value); return this; }

    /// {@return `cb_luma_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cb_luma_mult(MemorySegment segment, long index) { return (byte) VH_cb_luma_mult.get().get(segment, 0L, index); }
    /// {@return `cb_luma_mult`}
    public byte cb_luma_mult() { return cb_luma_mult(this.segment(), 0L); }
    /// Sets `cb_luma_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cb_luma_mult(MemorySegment segment, long index, byte value) { VH_cb_luma_mult.get().set(segment, 0L, index, value); }
    /// Sets `cb_luma_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_luma_mult(byte value) { cb_luma_mult(this.segment(), 0L, value); return this; }

    /// {@return `cb_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short cb_offset(MemorySegment segment, long index) { return (short) VH_cb_offset.get().get(segment, 0L, index); }
    /// {@return `cb_offset`}
    public short cb_offset() { return cb_offset(this.segment(), 0L); }
    /// Sets `cb_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cb_offset(MemorySegment segment, long index, short value) { VH_cb_offset.get().set(segment, 0L, index, value); }
    /// Sets `cb_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_offset(short value) { cb_offset(this.segment(), 0L, value); return this; }

    /// {@return `cr_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cr_mult(MemorySegment segment, long index) { return (byte) VH_cr_mult.get().get(segment, 0L, index); }
    /// {@return `cr_mult`}
    public byte cr_mult() { return cr_mult(this.segment(), 0L); }
    /// Sets `cr_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cr_mult(MemorySegment segment, long index, byte value) { VH_cr_mult.get().set(segment, 0L, index, value); }
    /// Sets `cr_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_mult(byte value) { cr_mult(this.segment(), 0L, value); return this; }

    /// {@return `cr_luma_mult` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cr_luma_mult(MemorySegment segment, long index) { return (byte) VH_cr_luma_mult.get().get(segment, 0L, index); }
    /// {@return `cr_luma_mult`}
    public byte cr_luma_mult() { return cr_luma_mult(this.segment(), 0L); }
    /// Sets `cr_luma_mult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cr_luma_mult(MemorySegment segment, long index, byte value) { VH_cr_luma_mult.get().set(segment, 0L, index, value); }
    /// Sets `cr_luma_mult` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_luma_mult(byte value) { cr_luma_mult(this.segment(), 0L, value); return this; }

    /// {@return `cr_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short cr_offset(MemorySegment segment, long index) { return (short) VH_cr_offset.get().get(segment, 0L, index); }
    /// {@return `cr_offset`}
    public short cr_offset() { return cr_offset(this.segment(), 0L); }
    /// Sets `cr_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cr_offset(MemorySegment segment, long index, short value) { VH_cr_offset.get().set(segment, 0L, index, value); }
    /// Sets `cr_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_offset(short value) { cr_offset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoAV1FilmGrain`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1FilmGrain`
    public StdVideoAV1FilmGrain asSlice(long index) { return new StdVideoAV1FilmGrain(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1FilmGrain`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1FilmGrain`
    public StdVideoAV1FilmGrain asSlice(long index, long count) { return new StdVideoAV1FilmGrain(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1FilmGrain` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1FilmGrain at(long index, Consumer<StdVideoAV1FilmGrain> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoAV1FilmGrain flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoAV1FilmGrainFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1FilmGrainFlags.of(flagsAt(index))); return this; }

    /// {@return `grain_scaling_minus_8` at the given index}
    /// @param index the index of the struct buffer
    public byte grain_scaling_minus_8At(long index) { return grain_scaling_minus_8(this.segment(), index); }
    /// Sets `grain_scaling_minus_8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_scaling_minus_8At(long index, byte value) { grain_scaling_minus_8(this.segment(), index, value); return this; }

    /// {@return `ar_coeff_lag` at the given index}
    /// @param index the index of the struct buffer
    public byte ar_coeff_lagAt(long index) { return ar_coeff_lag(this.segment(), index); }
    /// Sets `ar_coeff_lag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeff_lagAt(long index, byte value) { ar_coeff_lag(this.segment(), index, value); return this; }

    /// {@return `ar_coeff_shift_minus_6` at the given index}
    /// @param index the index of the struct buffer
    public byte ar_coeff_shift_minus_6At(long index) { return ar_coeff_shift_minus_6(this.segment(), index); }
    /// Sets `ar_coeff_shift_minus_6` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeff_shift_minus_6At(long index, byte value) { ar_coeff_shift_minus_6(this.segment(), index, value); return this; }

    /// {@return `grain_scale_shift` at the given index}
    /// @param index the index of the struct buffer
    public byte grain_scale_shiftAt(long index) { return grain_scale_shift(this.segment(), index); }
    /// Sets `grain_scale_shift` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_scale_shiftAt(long index, byte value) { grain_scale_shift(this.segment(), index, value); return this; }

    /// {@return `grain_seed` at the given index}
    /// @param index the index of the struct buffer
    public short grain_seedAt(long index) { return grain_seed(this.segment(), index); }
    /// Sets `grain_seed` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain grain_seedAt(long index, short value) { grain_seed(this.segment(), index, value); return this; }

    /// {@return `film_grain_params_ref_idx` at the given index}
    /// @param index the index of the struct buffer
    public byte film_grain_params_ref_idxAt(long index) { return film_grain_params_ref_idx(this.segment(), index); }
    /// Sets `film_grain_params_ref_idx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain film_grain_params_ref_idxAt(long index, byte value) { film_grain_params_ref_idx(this.segment(), index, value); return this; }

    /// {@return `num_y_points` at the given index}
    /// @param index the index of the struct buffer
    public byte num_y_pointsAt(long index) { return num_y_points(this.segment(), index); }
    /// Sets `num_y_points` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_y_pointsAt(long index, byte value) { num_y_points(this.segment(), index, value); return this; }

    /// {@return `point_y_value` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment point_y_valueAt(long index) { return point_y_value(this.segment(), index); }
    /// {@return `point_y_value` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte point_y_valueAt(long index, long index0) { return point_y_value(this.segment(), index, index0); }
    /// Sets `point_y_value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_valueAt(long index, MemorySegment value) { point_y_value(this.segment(), index, value); return this; }
    /// Sets `point_y_value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_valueAt(long index, long index0, byte value) { point_y_value(this.segment(), index, index0, value); return this; }

    /// {@return `point_y_scaling` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment point_y_scalingAt(long index) { return point_y_scaling(this.segment(), index); }
    /// {@return `point_y_scaling` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte point_y_scalingAt(long index, long index0) { return point_y_scaling(this.segment(), index, index0); }
    /// Sets `point_y_scaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_scalingAt(long index, MemorySegment value) { point_y_scaling(this.segment(), index, value); return this; }
    /// Sets `point_y_scaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_y_scalingAt(long index, long index0, byte value) { point_y_scaling(this.segment(), index, index0, value); return this; }

    /// {@return `num_cb_points` at the given index}
    /// @param index the index of the struct buffer
    public byte num_cb_pointsAt(long index) { return num_cb_points(this.segment(), index); }
    /// Sets `num_cb_points` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_cb_pointsAt(long index, byte value) { num_cb_points(this.segment(), index, value); return this; }

    /// {@return `point_cb_value` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment point_cb_valueAt(long index) { return point_cb_value(this.segment(), index); }
    /// {@return `point_cb_value` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte point_cb_valueAt(long index, long index0) { return point_cb_value(this.segment(), index, index0); }
    /// Sets `point_cb_value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_valueAt(long index, MemorySegment value) { point_cb_value(this.segment(), index, value); return this; }
    /// Sets `point_cb_value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_valueAt(long index, long index0, byte value) { point_cb_value(this.segment(), index, index0, value); return this; }

    /// {@return `point_cb_scaling` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment point_cb_scalingAt(long index) { return point_cb_scaling(this.segment(), index); }
    /// {@return `point_cb_scaling` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte point_cb_scalingAt(long index, long index0) { return point_cb_scaling(this.segment(), index, index0); }
    /// Sets `point_cb_scaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_scalingAt(long index, MemorySegment value) { point_cb_scaling(this.segment(), index, value); return this; }
    /// Sets `point_cb_scaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cb_scalingAt(long index, long index0, byte value) { point_cb_scaling(this.segment(), index, index0, value); return this; }

    /// {@return `num_cr_points` at the given index}
    /// @param index the index of the struct buffer
    public byte num_cr_pointsAt(long index) { return num_cr_points(this.segment(), index); }
    /// Sets `num_cr_points` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain num_cr_pointsAt(long index, byte value) { num_cr_points(this.segment(), index, value); return this; }

    /// {@return `point_cr_value` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment point_cr_valueAt(long index) { return point_cr_value(this.segment(), index); }
    /// {@return `point_cr_value` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte point_cr_valueAt(long index, long index0) { return point_cr_value(this.segment(), index, index0); }
    /// Sets `point_cr_value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_valueAt(long index, MemorySegment value) { point_cr_value(this.segment(), index, value); return this; }
    /// Sets `point_cr_value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_valueAt(long index, long index0, byte value) { point_cr_value(this.segment(), index, index0, value); return this; }

    /// {@return `point_cr_scaling` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment point_cr_scalingAt(long index) { return point_cr_scaling(this.segment(), index); }
    /// {@return `point_cr_scaling` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte point_cr_scalingAt(long index, long index0) { return point_cr_scaling(this.segment(), index, index0); }
    /// Sets `point_cr_scaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_scalingAt(long index, MemorySegment value) { point_cr_scaling(this.segment(), index, value); return this; }
    /// Sets `point_cr_scaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain point_cr_scalingAt(long index, long index0, byte value) { point_cr_scaling(this.segment(), index, index0, value); return this; }

    /// {@return `ar_coeffs_y_plus_128` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ar_coeffs_y_plus_128At(long index) { return ar_coeffs_y_plus_128(this.segment(), index); }
    /// {@return `ar_coeffs_y_plus_128` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte ar_coeffs_y_plus_128At(long index, long index0) { return ar_coeffs_y_plus_128(this.segment(), index, index0); }
    /// Sets `ar_coeffs_y_plus_128` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128At(long index, MemorySegment value) { ar_coeffs_y_plus_128(this.segment(), index, value); return this; }
    /// Sets `ar_coeffs_y_plus_128` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128At(long index, long index0, byte value) { ar_coeffs_y_plus_128(this.segment(), index, index0, value); return this; }

    /// {@return `ar_coeffs_cb_plus_128` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ar_coeffs_cb_plus_128At(long index) { return ar_coeffs_cb_plus_128(this.segment(), index); }
    /// {@return `ar_coeffs_cb_plus_128` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte ar_coeffs_cb_plus_128At(long index, long index0) { return ar_coeffs_cb_plus_128(this.segment(), index, index0); }
    /// Sets `ar_coeffs_cb_plus_128` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128At(long index, MemorySegment value) { ar_coeffs_cb_plus_128(this.segment(), index, value); return this; }
    /// Sets `ar_coeffs_cb_plus_128` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128At(long index, long index0, byte value) { ar_coeffs_cb_plus_128(this.segment(), index, index0, value); return this; }

    /// {@return `ar_coeffs_cr_plus_128` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ar_coeffs_cr_plus_128At(long index) { return ar_coeffs_cr_plus_128(this.segment(), index); }
    /// {@return `ar_coeffs_cr_plus_128` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte ar_coeffs_cr_plus_128At(long index, long index0) { return ar_coeffs_cr_plus_128(this.segment(), index, index0); }
    /// Sets `ar_coeffs_cr_plus_128` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128At(long index, MemorySegment value) { ar_coeffs_cr_plus_128(this.segment(), index, value); return this; }
    /// Sets `ar_coeffs_cr_plus_128` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128At(long index, long index0, byte value) { ar_coeffs_cr_plus_128(this.segment(), index, index0, value); return this; }

    /// {@return `cb_mult` at the given index}
    /// @param index the index of the struct buffer
    public byte cb_multAt(long index) { return cb_mult(this.segment(), index); }
    /// Sets `cb_mult` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_multAt(long index, byte value) { cb_mult(this.segment(), index, value); return this; }

    /// {@return `cb_luma_mult` at the given index}
    /// @param index the index of the struct buffer
    public byte cb_luma_multAt(long index) { return cb_luma_mult(this.segment(), index); }
    /// Sets `cb_luma_mult` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_luma_multAt(long index, byte value) { cb_luma_mult(this.segment(), index, value); return this; }

    /// {@return `cb_offset` at the given index}
    /// @param index the index of the struct buffer
    public short cb_offsetAt(long index) { return cb_offset(this.segment(), index); }
    /// Sets `cb_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cb_offsetAt(long index, short value) { cb_offset(this.segment(), index, value); return this; }

    /// {@return `cr_mult` at the given index}
    /// @param index the index of the struct buffer
    public byte cr_multAt(long index) { return cr_mult(this.segment(), index); }
    /// Sets `cr_mult` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_multAt(long index, byte value) { cr_mult(this.segment(), index, value); return this; }

    /// {@return `cr_luma_mult` at the given index}
    /// @param index the index of the struct buffer
    public byte cr_luma_multAt(long index) { return cr_luma_mult(this.segment(), index); }
    /// Sets `cr_luma_mult` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_luma_multAt(long index, byte value) { cr_luma_mult(this.segment(), index, value); return this; }

    /// {@return `cr_offset` at the given index}
    /// @param index the index of the struct buffer
    public short cr_offsetAt(long index) { return cr_offset(this.segment(), index); }
    /// Sets `cr_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrain cr_offsetAt(long index, short value) { cr_offset(this.segment(), index, value); return this; }

}
