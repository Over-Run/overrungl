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

/// Represents `StdVideoVP9ColorConfig`.
/// ## Layout
/// ```
/// struct StdVideoVP9ColorConfig {
///     (struct StdVideoVP9ColorConfigFlags) StdVideoVP9ColorConfigFlags flags;
///     uint8_t BitDepth;
///     uint8_t subsampling_x;
///     uint8_t subsampling_y;
///     uint8_t reserved1;
///     (int) StdVideoVP9ColorSpace color_space;
/// };
/// ```
public final class StdVideoVP9ColorConfig extends GroupType {
    /// The struct layout of `StdVideoVP9ColorConfig`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoVP9ColorConfigFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("BitDepth"),
        ValueLayout.JAVA_BYTE.withName("subsampling_x"),
        ValueLayout.JAVA_BYTE.withName("subsampling_y"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("color_space")
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
    /// The byte offset of `color_space`.
    public static final long OFFSET_color_space = LAYOUT.byteOffset(PathElement.groupElement("color_space"));
    /// The memory layout of `color_space`.
    public static final MemoryLayout LAYOUT_color_space = LAYOUT.select(PathElement.groupElement("color_space"));
    /// The [VarHandle] of `color_space` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_color_space = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color_space"));

    /// Creates `StdVideoVP9ColorConfig` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoVP9ColorConfig(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoVP9ColorConfig` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9ColorConfig of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9ColorConfig(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoVP9ColorConfig` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9ColorConfig ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9ColorConfig(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoVP9ColorConfig` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9ColorConfig ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9ColorConfig(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoVP9ColorConfig` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoVP9ColorConfig`
    public static StdVideoVP9ColorConfig alloc(SegmentAllocator allocator) { return new StdVideoVP9ColorConfig(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoVP9ColorConfig` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoVP9ColorConfig`
    public static StdVideoVP9ColorConfig alloc(SegmentAllocator allocator, long count) { return new StdVideoVP9ColorConfig(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoVP9ColorConfig copyFrom(StdVideoVP9ColorConfig src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoVP9ColorConfig reinterpret(long count) { return new StdVideoVP9ColorConfig(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoVP9ColorConfig flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoVP9ColorConfig flags(Consumer<overrungl.vulkan.video.StdVideoVP9ColorConfigFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9ColorConfigFlags.of(flags())); return this; }

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
    public StdVideoVP9ColorConfig BitDepth(byte value) { BitDepth(this.segment(), 0L, value); return this; }

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
    public StdVideoVP9ColorConfig subsampling_x(byte value) { subsampling_x(this.segment(), 0L, value); return this; }

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
    public StdVideoVP9ColorConfig subsampling_y(byte value) { subsampling_y(this.segment(), 0L, value); return this; }

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
    public StdVideoVP9ColorConfig reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `color_space` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int color_space(MemorySegment segment, long index) { return (int) VH_color_space.get(segment, 0L, index); }
    /// {@return `color_space`}
    public int color_space() { return color_space(this.segment(), 0L); }
    /// Sets `color_space` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void color_space(MemorySegment segment, long index, int value) { VH_color_space.set(segment, 0L, index, value); }
    /// Sets `color_space` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig color_space(int value) { color_space(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoVP9ColorConfig`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoVP9ColorConfig`
    public StdVideoVP9ColorConfig asSlice(long index) { return new StdVideoVP9ColorConfig(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoVP9ColorConfig`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoVP9ColorConfig`
    public StdVideoVP9ColorConfig asSlice(long index, long count) { return new StdVideoVP9ColorConfig(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoVP9ColorConfig` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoVP9ColorConfig at(long index, Consumer<StdVideoVP9ColorConfig> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoVP9ColorConfig flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoVP9ColorConfigFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9ColorConfigFlags.of(flagsAt(index))); return this; }

    /// {@return `BitDepth` at the given index}
    /// @param index the index of the struct buffer
    public byte BitDepthAt(long index) { return BitDepth(this.segment(), index); }
    /// Sets `BitDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig BitDepthAt(long index, byte value) { BitDepth(this.segment(), index, value); return this; }

    /// {@return `subsampling_x` at the given index}
    /// @param index the index of the struct buffer
    public byte subsampling_xAt(long index) { return subsampling_x(this.segment(), index); }
    /// Sets `subsampling_x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig subsampling_xAt(long index, byte value) { subsampling_x(this.segment(), index, value); return this; }

    /// {@return `subsampling_y` at the given index}
    /// @param index the index of the struct buffer
    public byte subsampling_yAt(long index) { return subsampling_y(this.segment(), index); }
    /// Sets `subsampling_y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig subsampling_yAt(long index, byte value) { subsampling_y(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `color_space` at the given index}
    /// @param index the index of the struct buffer
    public int color_spaceAt(long index) { return color_space(this.segment(), index); }
    /// Sets `color_space` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9ColorConfig color_spaceAt(long index, int value) { color_space(this.segment(), index, value); return this; }

}
