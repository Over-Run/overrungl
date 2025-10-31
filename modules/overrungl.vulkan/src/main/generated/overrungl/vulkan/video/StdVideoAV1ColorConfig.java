// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1ColorConfig`.
/// ## Layout
/// ```
/// struct StdVideoAV1ColorConfig {
///     (struct StdVideoAV1ColorConfigFlags) StdVideoAV1ColorConfigFlags flags;
///     uint8_t BitDepth;
///     uint8_t subsampling_x;
///     uint8_t subsampling_y;
///     uint8_t reserved1;
///     (int) StdVideoAV1ColorPrimaries color_primaries;
///     (int) StdVideoAV1TransferCharacteristics transfer_characteristics;
///     (int) StdVideoAV1MatrixCoefficients matrix_coefficients;
///     (int) StdVideoAV1ChromaSamplePosition chroma_sample_position;
/// };
/// ```
public final class StdVideoAV1ColorConfig extends GroupType {
    /// The struct layout of `StdVideoAV1ColorConfig`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1ColorConfigFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("BitDepth"),
        ValueLayout.JAVA_BYTE.withName("subsampling_x"),
        ValueLayout.JAVA_BYTE.withName("subsampling_y"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("color_primaries"),
        ValueLayout.JAVA_INT.withName("transfer_characteristics"),
        ValueLayout.JAVA_INT.withName("matrix_coefficients"),
        ValueLayout.JAVA_INT.withName("chroma_sample_position")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `BitDepth`.
    public static final long OFFSET_BitDepth = LAYOUT.byteOffset(PathElement.groupElement("BitDepth"));
    /// The memory layout of `BitDepth`.
    public static final MemoryLayout LAYOUT_BitDepth = LAYOUT.select(PathElement.groupElement("BitDepth"));
    /// The [VarHandle] of `BitDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_BitDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BitDepth"));
    /// The byte offset of `subsampling_x`.
    public static final long OFFSET_subsampling_x = LAYOUT.byteOffset(PathElement.groupElement("subsampling_x"));
    /// The memory layout of `subsampling_x`.
    public static final MemoryLayout LAYOUT_subsampling_x = LAYOUT.select(PathElement.groupElement("subsampling_x"));
    /// The [VarHandle] of `subsampling_x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subsampling_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampling_x"));
    /// The byte offset of `subsampling_y`.
    public static final long OFFSET_subsampling_y = LAYOUT.byteOffset(PathElement.groupElement("subsampling_y"));
    /// The memory layout of `subsampling_y`.
    public static final MemoryLayout LAYOUT_subsampling_y = LAYOUT.select(PathElement.groupElement("subsampling_y"));
    /// The [VarHandle] of `subsampling_y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subsampling_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampling_y"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `color_primaries`.
    public static final long OFFSET_color_primaries = LAYOUT.byteOffset(PathElement.groupElement("color_primaries"));
    /// The memory layout of `color_primaries`.
    public static final MemoryLayout LAYOUT_color_primaries = LAYOUT.select(PathElement.groupElement("color_primaries"));
    /// The [VarHandle] of `color_primaries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_color_primaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color_primaries"));
    /// The byte offset of `transfer_characteristics`.
    public static final long OFFSET_transfer_characteristics = LAYOUT.byteOffset(PathElement.groupElement("transfer_characteristics"));
    /// The memory layout of `transfer_characteristics`.
    public static final MemoryLayout LAYOUT_transfer_characteristics = LAYOUT.select(PathElement.groupElement("transfer_characteristics"));
    /// The [VarHandle] of `transfer_characteristics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transfer_characteristics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transfer_characteristics"));
    /// The byte offset of `matrix_coefficients`.
    public static final long OFFSET_matrix_coefficients = LAYOUT.byteOffset(PathElement.groupElement("matrix_coefficients"));
    /// The memory layout of `matrix_coefficients`.
    public static final MemoryLayout LAYOUT_matrix_coefficients = LAYOUT.select(PathElement.groupElement("matrix_coefficients"));
    /// The [VarHandle] of `matrix_coefficients` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_matrix_coefficients = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix_coefficients"));
    /// The byte offset of `chroma_sample_position`.
    public static final long OFFSET_chroma_sample_position = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_position"));
    /// The memory layout of `chroma_sample_position`.
    public static final MemoryLayout LAYOUT_chroma_sample_position = LAYOUT.select(PathElement.groupElement("chroma_sample_position"));
    /// The [VarHandle] of `chroma_sample_position` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_sample_position = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_position"));

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1ColorConfig(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfig of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1ColorConfig(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfig ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1ColorConfig(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1ColorConfig` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfig ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1ColorConfig(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1ColorConfig` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1ColorConfig`
    public static StdVideoAV1ColorConfig alloc(SegmentAllocator allocator) { return new StdVideoAV1ColorConfig(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1ColorConfig` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1ColorConfig`
    public static StdVideoAV1ColorConfig alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1ColorConfig(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1ColorConfig copyFrom(StdVideoAV1ColorConfig src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1ColorConfig reinterpret(long count) { return new StdVideoAV1ColorConfig(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoAV1ColorConfig flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoAV1ColorConfig flags(Consumer<overrungl.vulkan.video.StdVideoAV1ColorConfigFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1ColorConfigFlags.of(flags())); return this; }

    /// {@return `BitDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte BitDepth(MemorySegment segment, long index) { return (byte) VH_BitDepth.get(segment, 0L, index); }
    /// {@return `BitDepth`}
    public byte BitDepth() { return BitDepth(this.segment(), 0L); }
    /// Sets `BitDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void BitDepth(MemorySegment segment, long index, byte value) { VH_BitDepth.set(segment, 0L, index, value); }
    /// Sets `BitDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig BitDepth(byte value) { BitDepth(this.segment(), 0L, value); return this; }

    /// {@return `subsampling_x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte subsampling_x(MemorySegment segment, long index) { return (byte) VH_subsampling_x.get(segment, 0L, index); }
    /// {@return `subsampling_x`}
    public byte subsampling_x() { return subsampling_x(this.segment(), 0L); }
    /// Sets `subsampling_x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subsampling_x(MemorySegment segment, long index, byte value) { VH_subsampling_x.set(segment, 0L, index, value); }
    /// Sets `subsampling_x` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig subsampling_x(byte value) { subsampling_x(this.segment(), 0L, value); return this; }

    /// {@return `subsampling_y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte subsampling_y(MemorySegment segment, long index) { return (byte) VH_subsampling_y.get(segment, 0L, index); }
    /// {@return `subsampling_y`}
    public byte subsampling_y() { return subsampling_y(this.segment(), 0L); }
    /// Sets `subsampling_y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subsampling_y(MemorySegment segment, long index, byte value) { VH_subsampling_y.set(segment, 0L, index, value); }
    /// Sets `subsampling_y` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig subsampling_y(byte value) { subsampling_y(this.segment(), 0L, value); return this; }

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
    public StdVideoAV1ColorConfig reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `color_primaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int color_primaries(MemorySegment segment, long index) { return (int) VH_color_primaries.get(segment, 0L, index); }
    /// {@return `color_primaries`}
    public int color_primaries() { return color_primaries(this.segment(), 0L); }
    /// Sets `color_primaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void color_primaries(MemorySegment segment, long index, int value) { VH_color_primaries.set(segment, 0L, index, value); }
    /// Sets `color_primaries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig color_primaries(int value) { color_primaries(this.segment(), 0L, value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transfer_characteristics(MemorySegment segment, long index) { return (int) VH_transfer_characteristics.get(segment, 0L, index); }
    /// {@return `transfer_characteristics`}
    public int transfer_characteristics() { return transfer_characteristics(this.segment(), 0L); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transfer_characteristics(MemorySegment segment, long index, int value) { VH_transfer_characteristics.set(segment, 0L, index, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig transfer_characteristics(int value) { transfer_characteristics(this.segment(), 0L, value); return this; }

    /// {@return `matrix_coefficients` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int matrix_coefficients(MemorySegment segment, long index) { return (int) VH_matrix_coefficients.get(segment, 0L, index); }
    /// {@return `matrix_coefficients`}
    public int matrix_coefficients() { return matrix_coefficients(this.segment(), 0L); }
    /// Sets `matrix_coefficients` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void matrix_coefficients(MemorySegment segment, long index, int value) { VH_matrix_coefficients.set(segment, 0L, index, value); }
    /// Sets `matrix_coefficients` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig matrix_coefficients(int value) { matrix_coefficients(this.segment(), 0L, value); return this; }

    /// {@return `chroma_sample_position` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chroma_sample_position(MemorySegment segment, long index) { return (int) VH_chroma_sample_position.get(segment, 0L, index); }
    /// {@return `chroma_sample_position`}
    public int chroma_sample_position() { return chroma_sample_position(this.segment(), 0L); }
    /// Sets `chroma_sample_position` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_sample_position(MemorySegment segment, long index, int value) { VH_chroma_sample_position.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_position` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig chroma_sample_position(int value) { chroma_sample_position(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoAV1ColorConfig`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1ColorConfig`
    public StdVideoAV1ColorConfig asSlice(long index) { return new StdVideoAV1ColorConfig(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1ColorConfig`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1ColorConfig`
    public StdVideoAV1ColorConfig asSlice(long index, long count) { return new StdVideoAV1ColorConfig(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1ColorConfig` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1ColorConfig at(long index, Consumer<StdVideoAV1ColorConfig> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoAV1ColorConfig flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoAV1ColorConfigFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1ColorConfigFlags.of(flagsAt(index))); return this; }

    /// {@return `BitDepth` at the given index}
    /// @param index the index of the struct buffer
    public byte BitDepthAt(long index) { return BitDepth(this.segment(), index); }
    /// Sets `BitDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig BitDepthAt(long index, byte value) { BitDepth(this.segment(), index, value); return this; }

    /// {@return `subsampling_x` at the given index}
    /// @param index the index of the struct buffer
    public byte subsampling_xAt(long index) { return subsampling_x(this.segment(), index); }
    /// Sets `subsampling_x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig subsampling_xAt(long index, byte value) { subsampling_x(this.segment(), index, value); return this; }

    /// {@return `subsampling_y` at the given index}
    /// @param index the index of the struct buffer
    public byte subsampling_yAt(long index) { return subsampling_y(this.segment(), index); }
    /// Sets `subsampling_y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig subsampling_yAt(long index, byte value) { subsampling_y(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `color_primaries` at the given index}
    /// @param index the index of the struct buffer
    public int color_primariesAt(long index) { return color_primaries(this.segment(), index); }
    /// Sets `color_primaries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig color_primariesAt(long index, int value) { color_primaries(this.segment(), index, value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param index the index of the struct buffer
    public int transfer_characteristicsAt(long index) { return transfer_characteristics(this.segment(), index); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig transfer_characteristicsAt(long index, int value) { transfer_characteristics(this.segment(), index, value); return this; }

    /// {@return `matrix_coefficients` at the given index}
    /// @param index the index of the struct buffer
    public int matrix_coefficientsAt(long index) { return matrix_coefficients(this.segment(), index); }
    /// Sets `matrix_coefficients` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig matrix_coefficientsAt(long index, int value) { matrix_coefficients(this.segment(), index, value); return this; }

    /// {@return `chroma_sample_position` at the given index}
    /// @param index the index of the struct buffer
    public int chroma_sample_positionAt(long index) { return chroma_sample_position(this.segment(), index); }
    /// Sets `chroma_sample_position` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfig chroma_sample_positionAt(long index, int value) { chroma_sample_position(this.segment(), index, value); return this; }

}
