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

/// Represents `StdVideoVP9LoopFilter`.
/// ## Layout
/// ```
/// struct StdVideoVP9LoopFilter {
///     (struct StdVideoVP9LoopFilterFlags) StdVideoVP9LoopFilterFlags flags;
///     uint8_t loop_filter_level;
///     uint8_t loop_filter_sharpness;
///     uint8_t update_ref_delta;
///     int8_t loop_filter_ref_deltas[4];
///     uint8_t update_mode_delta;
///     int8_t loop_filter_mode_deltas[2];
/// };
/// ```
public final class StdVideoVP9LoopFilter extends GroupType {
    /// The struct layout of `StdVideoVP9LoopFilter`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoVP9LoopFilterFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_level"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_sharpness"),
        ValueLayout.JAVA_BYTE.withName("update_ref_delta"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_BYTE).withName("loop_filter_ref_deltas"),
        ValueLayout.JAVA_BYTE.withName("update_mode_delta"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_BYTE).withName("loop_filter_mode_deltas")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `loop_filter_level`.
    public static final long OFFSET_loop_filter_level = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_level"));
    /// The memory layout of `loop_filter_level`.
    public static final MemoryLayout LAYOUT_loop_filter_level = LAYOUT.select(PathElement.groupElement("loop_filter_level"));
    /// The [VarHandle] of `loop_filter_level` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_loop_filter_level = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_level")));
    /// The byte offset of `loop_filter_sharpness`.
    public static final long OFFSET_loop_filter_sharpness = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_sharpness"));
    /// The memory layout of `loop_filter_sharpness`.
    public static final MemoryLayout LAYOUT_loop_filter_sharpness = LAYOUT.select(PathElement.groupElement("loop_filter_sharpness"));
    /// The [VarHandle] of `loop_filter_sharpness` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_loop_filter_sharpness = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_sharpness")));
    /// The byte offset of `update_ref_delta`.
    public static final long OFFSET_update_ref_delta = LAYOUT.byteOffset(PathElement.groupElement("update_ref_delta"));
    /// The memory layout of `update_ref_delta`.
    public static final MemoryLayout LAYOUT_update_ref_delta = LAYOUT.select(PathElement.groupElement("update_ref_delta"));
    /// The [VarHandle] of `update_ref_delta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_update_ref_delta = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_ref_delta")));
    /// The byte offset of `loop_filter_ref_deltas`.
    public static final long OFFSET_loop_filter_ref_deltas = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_ref_deltas"));
    /// The memory layout of `loop_filter_ref_deltas`.
    public static final MemoryLayout LAYOUT_loop_filter_ref_deltas = LAYOUT.select(PathElement.groupElement("loop_filter_ref_deltas"));
    /// The [VarHandle] of `loop_filter_ref_deltas` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_loop_filter_ref_deltas = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_ref_deltas"), PathElement.sequenceElement()));
    /// The byte offset of `update_mode_delta`.
    public static final long OFFSET_update_mode_delta = LAYOUT.byteOffset(PathElement.groupElement("update_mode_delta"));
    /// The memory layout of `update_mode_delta`.
    public static final MemoryLayout LAYOUT_update_mode_delta = LAYOUT.select(PathElement.groupElement("update_mode_delta"));
    /// The [VarHandle] of `update_mode_delta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_update_mode_delta = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_mode_delta")));
    /// The byte offset of `loop_filter_mode_deltas`.
    public static final long OFFSET_loop_filter_mode_deltas = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_mode_deltas"));
    /// The memory layout of `loop_filter_mode_deltas`.
    public static final MemoryLayout LAYOUT_loop_filter_mode_deltas = LAYOUT.select(PathElement.groupElement("loop_filter_mode_deltas"));
    /// The [VarHandle] of `loop_filter_mode_deltas` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_loop_filter_mode_deltas = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_mode_deltas"), PathElement.sequenceElement()));

    /// Creates `StdVideoVP9LoopFilter` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoVP9LoopFilter(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoVP9LoopFilter` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9LoopFilter of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9LoopFilter(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoVP9LoopFilter` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9LoopFilter ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9LoopFilter(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoVP9LoopFilter` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9LoopFilter ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9LoopFilter(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoVP9LoopFilter` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoVP9LoopFilter`
    public static StdVideoVP9LoopFilter alloc(SegmentAllocator allocator) { return new StdVideoVP9LoopFilter(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoVP9LoopFilter` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoVP9LoopFilter`
    public static StdVideoVP9LoopFilter alloc(SegmentAllocator allocator, long count) { return new StdVideoVP9LoopFilter(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoVP9LoopFilter copyFrom(StdVideoVP9LoopFilter src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoVP9LoopFilter reinterpret(long count) { return new StdVideoVP9LoopFilter(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoVP9LoopFilter flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoVP9LoopFilter flags(Consumer<overrungl.vulkan.video.StdVideoVP9LoopFilterFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9LoopFilterFlags.of(flags())); return this; }

    /// {@return `loop_filter_level` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte loop_filter_level(MemorySegment segment, long index) { return (byte) VH_loop_filter_level.get().get(segment, 0L, index); }
    /// {@return `loop_filter_level`}
    public byte loop_filter_level() { return loop_filter_level(this.segment(), 0L); }
    /// Sets `loop_filter_level` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_level(MemorySegment segment, long index, byte value) { VH_loop_filter_level.get().set(segment, 0L, index, value); }
    /// Sets `loop_filter_level` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_level(byte value) { loop_filter_level(this.segment(), 0L, value); return this; }

    /// {@return `loop_filter_sharpness` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte loop_filter_sharpness(MemorySegment segment, long index) { return (byte) VH_loop_filter_sharpness.get().get(segment, 0L, index); }
    /// {@return `loop_filter_sharpness`}
    public byte loop_filter_sharpness() { return loop_filter_sharpness(this.segment(), 0L); }
    /// Sets `loop_filter_sharpness` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_sharpness(MemorySegment segment, long index, byte value) { VH_loop_filter_sharpness.get().set(segment, 0L, index, value); }
    /// Sets `loop_filter_sharpness` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_sharpness(byte value) { loop_filter_sharpness(this.segment(), 0L, value); return this; }

    /// {@return `update_ref_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte update_ref_delta(MemorySegment segment, long index) { return (byte) VH_update_ref_delta.get().get(segment, 0L, index); }
    /// {@return `update_ref_delta`}
    public byte update_ref_delta() { return update_ref_delta(this.segment(), 0L); }
    /// Sets `update_ref_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void update_ref_delta(MemorySegment segment, long index, byte value) { VH_update_ref_delta.get().set(segment, 0L, index, value); }
    /// Sets `update_ref_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter update_ref_delta(byte value) { update_ref_delta(this.segment(), 0L, value); return this; }

    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment loop_filter_ref_deltas(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_loop_filter_ref_deltas, index), LAYOUT_loop_filter_ref_deltas); }
    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte loop_filter_ref_deltas(MemorySegment segment, long index, long index0) { return (byte) VH_loop_filter_ref_deltas.get().get(segment, 0L, index, index0); }
    /// {@return `loop_filter_ref_deltas`}
    public MemorySegment loop_filter_ref_deltas() { return loop_filter_ref_deltas(this.segment(), 0L); }
    /// {@return `loop_filter_ref_deltas`}
    /// @param index0 the Index 0 of the array
    public byte loop_filter_ref_deltas(long index0) { return loop_filter_ref_deltas(this.segment(), 0L, index0); }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_ref_deltas(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_loop_filter_ref_deltas, index), LAYOUT_loop_filter_ref_deltas.byteSize()); }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void loop_filter_ref_deltas(MemorySegment segment, long index, long index0, byte value) { VH_loop_filter_ref_deltas.get().set(segment, 0L, index, index0, value); }
    /// Sets `loop_filter_ref_deltas` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_ref_deltas(MemorySegment value) { loop_filter_ref_deltas(this.segment(), 0L, value); return this; }
    /// Sets `loop_filter_ref_deltas` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_ref_deltas(long index0, byte value) { loop_filter_ref_deltas(this.segment(), 0L, index0, value); return this; }

    /// {@return `update_mode_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte update_mode_delta(MemorySegment segment, long index) { return (byte) VH_update_mode_delta.get().get(segment, 0L, index); }
    /// {@return `update_mode_delta`}
    public byte update_mode_delta() { return update_mode_delta(this.segment(), 0L); }
    /// Sets `update_mode_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void update_mode_delta(MemorySegment segment, long index, byte value) { VH_update_mode_delta.get().set(segment, 0L, index, value); }
    /// Sets `update_mode_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter update_mode_delta(byte value) { update_mode_delta(this.segment(), 0L, value); return this; }

    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment loop_filter_mode_deltas(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_loop_filter_mode_deltas, index), LAYOUT_loop_filter_mode_deltas); }
    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte loop_filter_mode_deltas(MemorySegment segment, long index, long index0) { return (byte) VH_loop_filter_mode_deltas.get().get(segment, 0L, index, index0); }
    /// {@return `loop_filter_mode_deltas`}
    public MemorySegment loop_filter_mode_deltas() { return loop_filter_mode_deltas(this.segment(), 0L); }
    /// {@return `loop_filter_mode_deltas`}
    /// @param index0 the Index 0 of the array
    public byte loop_filter_mode_deltas(long index0) { return loop_filter_mode_deltas(this.segment(), 0L, index0); }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_mode_deltas(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_loop_filter_mode_deltas, index), LAYOUT_loop_filter_mode_deltas.byteSize()); }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void loop_filter_mode_deltas(MemorySegment segment, long index, long index0, byte value) { VH_loop_filter_mode_deltas.get().set(segment, 0L, index, index0, value); }
    /// Sets `loop_filter_mode_deltas` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_mode_deltas(MemorySegment value) { loop_filter_mode_deltas(this.segment(), 0L, value); return this; }
    /// Sets `loop_filter_mode_deltas` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_mode_deltas(long index0, byte value) { loop_filter_mode_deltas(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoVP9LoopFilter`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoVP9LoopFilter`
    public StdVideoVP9LoopFilter asSlice(long index) { return new StdVideoVP9LoopFilter(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoVP9LoopFilter`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoVP9LoopFilter`
    public StdVideoVP9LoopFilter asSlice(long index, long count) { return new StdVideoVP9LoopFilter(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoVP9LoopFilter` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoVP9LoopFilter at(long index, Consumer<StdVideoVP9LoopFilter> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoVP9LoopFilter flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoVP9LoopFilterFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9LoopFilterFlags.of(flagsAt(index))); return this; }

    /// {@return `loop_filter_level` at the given index}
    /// @param index the index of the struct buffer
    public byte loop_filter_levelAt(long index) { return loop_filter_level(this.segment(), index); }
    /// Sets `loop_filter_level` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_levelAt(long index, byte value) { loop_filter_level(this.segment(), index, value); return this; }

    /// {@return `loop_filter_sharpness` at the given index}
    /// @param index the index of the struct buffer
    public byte loop_filter_sharpnessAt(long index) { return loop_filter_sharpness(this.segment(), index); }
    /// Sets `loop_filter_sharpness` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_sharpnessAt(long index, byte value) { loop_filter_sharpness(this.segment(), index, value); return this; }

    /// {@return `update_ref_delta` at the given index}
    /// @param index the index of the struct buffer
    public byte update_ref_deltaAt(long index) { return update_ref_delta(this.segment(), index); }
    /// Sets `update_ref_delta` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter update_ref_deltaAt(long index, byte value) { update_ref_delta(this.segment(), index, value); return this; }

    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment loop_filter_ref_deltasAt(long index) { return loop_filter_ref_deltas(this.segment(), index); }
    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte loop_filter_ref_deltasAt(long index, long index0) { return loop_filter_ref_deltas(this.segment(), index, index0); }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_ref_deltasAt(long index, MemorySegment value) { loop_filter_ref_deltas(this.segment(), index, value); return this; }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_ref_deltasAt(long index, long index0, byte value) { loop_filter_ref_deltas(this.segment(), index, index0, value); return this; }

    /// {@return `update_mode_delta` at the given index}
    /// @param index the index of the struct buffer
    public byte update_mode_deltaAt(long index) { return update_mode_delta(this.segment(), index); }
    /// Sets `update_mode_delta` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter update_mode_deltaAt(long index, byte value) { update_mode_delta(this.segment(), index, value); return this; }

    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment loop_filter_mode_deltasAt(long index) { return loop_filter_mode_deltas(this.segment(), index); }
    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte loop_filter_mode_deltasAt(long index, long index0) { return loop_filter_mode_deltas(this.segment(), index, index0); }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_mode_deltasAt(long index, MemorySegment value) { loop_filter_mode_deltas(this.segment(), index, value); return this; }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9LoopFilter loop_filter_mode_deltasAt(long index, long index0, byte value) { loop_filter_mode_deltas(this.segment(), index, index0, value); return this; }

}
