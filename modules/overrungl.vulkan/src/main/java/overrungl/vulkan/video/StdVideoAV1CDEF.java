/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoAV1CDEF {
///     uint8_t cdef_damping_minus_3;
///     uint8_t cdef_bits;
///     uint8_t cdef_y_pri_strength[8];
///     uint8_t cdef_y_sec_strength[8];
///     uint8_t cdef_uv_pri_strength[8];
///     uint8_t cdef_uv_sec_strength[8];
/// };
/// ```
public sealed class StdVideoAV1CDEF extends GroupType {
    /// The struct layout of `StdVideoAV1CDEF`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("cdef_damping_minus_3"),
        ValueLayout.JAVA_BYTE.withName("cdef_bits"),
        MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_BYTE).withName("cdef_y_pri_strength"),
        MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_BYTE).withName("cdef_y_sec_strength"),
        MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_BYTE).withName("cdef_uv_pri_strength"),
        MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_BYTE).withName("cdef_uv_sec_strength")
    );
    /// The byte offset of `cdef_damping_minus_3`.
    public static final long OFFSET_cdef_damping_minus_3 = LAYOUT.byteOffset(PathElement.groupElement("cdef_damping_minus_3"));
    /// The memory layout of `cdef_damping_minus_3`.
    public static final MemoryLayout LAYOUT_cdef_damping_minus_3 = LAYOUT.select(PathElement.groupElement("cdef_damping_minus_3"));
    /// The [VarHandle] of `cdef_damping_minus_3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cdef_damping_minus_3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_damping_minus_3"));
    /// The byte offset of `cdef_bits`.
    public static final long OFFSET_cdef_bits = LAYOUT.byteOffset(PathElement.groupElement("cdef_bits"));
    /// The memory layout of `cdef_bits`.
    public static final MemoryLayout LAYOUT_cdef_bits = LAYOUT.select(PathElement.groupElement("cdef_bits"));
    /// The [VarHandle] of `cdef_bits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cdef_bits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_bits"));
    /// The byte offset of `cdef_y_pri_strength`.
    public static final long OFFSET_cdef_y_pri_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_y_pri_strength"));
    /// The memory layout of `cdef_y_pri_strength`.
    public static final MemoryLayout LAYOUT_cdef_y_pri_strength = LAYOUT.select(PathElement.groupElement("cdef_y_pri_strength"));
    /// The [VarHandle] of `cdef_y_pri_strength` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cdef_y_pri_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_y_pri_strength"), PathElement.sequenceElement());
    /// The byte offset of `cdef_y_sec_strength`.
    public static final long OFFSET_cdef_y_sec_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_y_sec_strength"));
    /// The memory layout of `cdef_y_sec_strength`.
    public static final MemoryLayout LAYOUT_cdef_y_sec_strength = LAYOUT.select(PathElement.groupElement("cdef_y_sec_strength"));
    /// The [VarHandle] of `cdef_y_sec_strength` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cdef_y_sec_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_y_sec_strength"), PathElement.sequenceElement());
    /// The byte offset of `cdef_uv_pri_strength`.
    public static final long OFFSET_cdef_uv_pri_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_uv_pri_strength"));
    /// The memory layout of `cdef_uv_pri_strength`.
    public static final MemoryLayout LAYOUT_cdef_uv_pri_strength = LAYOUT.select(PathElement.groupElement("cdef_uv_pri_strength"));
    /// The [VarHandle] of `cdef_uv_pri_strength` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cdef_uv_pri_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_uv_pri_strength"), PathElement.sequenceElement());
    /// The byte offset of `cdef_uv_sec_strength`.
    public static final long OFFSET_cdef_uv_sec_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_uv_sec_strength"));
    /// The memory layout of `cdef_uv_sec_strength`.
    public static final MemoryLayout LAYOUT_cdef_uv_sec_strength = LAYOUT.select(PathElement.groupElement("cdef_uv_sec_strength"));
    /// The [VarHandle] of `cdef_uv_sec_strength` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cdef_uv_sec_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_uv_sec_strength"), PathElement.sequenceElement());

    /// Creates `StdVideoAV1CDEF` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1CDEF(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1CDEF` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1CDEF` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1CDEF ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoAV1CDEF` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1CDEF` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1CDEF`
    public static StdVideoAV1CDEF alloc(SegmentAllocator allocator) { return new StdVideoAV1CDEF(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1CDEF` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1CDEF`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1CDEF copyFrom(StdVideoAV1CDEF src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `cdef_damping_minus_3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cdef_damping_minus_3(MemorySegment segment, long index) { return (byte) VH_cdef_damping_minus_3.get(segment, 0L, index); }
    /// {@return `cdef_damping_minus_3`}
    public byte cdef_damping_minus_3() { return cdef_damping_minus_3(this.segment(), 0L); }
    /// Sets `cdef_damping_minus_3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cdef_damping_minus_3(MemorySegment segment, long index, byte value) { VH_cdef_damping_minus_3.set(segment, 0L, index, value); }
    /// Sets `cdef_damping_minus_3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_damping_minus_3(byte value) { cdef_damping_minus_3(this.segment(), 0L, value); return this; }

    /// {@return `cdef_bits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cdef_bits(MemorySegment segment, long index) { return (byte) VH_cdef_bits.get(segment, 0L, index); }
    /// {@return `cdef_bits`}
    public byte cdef_bits() { return cdef_bits(this.segment(), 0L); }
    /// Sets `cdef_bits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cdef_bits(MemorySegment segment, long index, byte value) { VH_cdef_bits.set(segment, 0L, index, value); }
    /// Sets `cdef_bits` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_bits(byte value) { cdef_bits(this.segment(), 0L, value); return this; }

    /// {@return `cdef_y_pri_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cdef_y_pri_strength(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cdef_y_pri_strength, index), LAYOUT_cdef_y_pri_strength); }
    /// {@return `cdef_y_pri_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cdef_y_pri_strength(MemorySegment segment, long index, long index0) { return (byte) VH_cdef_y_pri_strength.get(segment, 0L, index, index0); }
    /// {@return `cdef_y_pri_strength`}
    public MemorySegment cdef_y_pri_strength() { return cdef_y_pri_strength(this.segment(), 0L); }
    /// {@return `cdef_y_pri_strength`}
    /// @param index0 the Index 0 of the array
    public byte cdef_y_pri_strength(long index0) { return cdef_y_pri_strength(this.segment(), 0L, index0); }
    /// Sets `cdef_y_pri_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cdef_y_pri_strength(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cdef_y_pri_strength, index), LAYOUT_cdef_y_pri_strength.byteSize()); }
    /// Sets `cdef_y_pri_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cdef_y_pri_strength(MemorySegment segment, long index, long index0, byte value) { VH_cdef_y_pri_strength.set(segment, 0L, index, index0, value); }
    /// Sets `cdef_y_pri_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_pri_strength(MemorySegment value) { cdef_y_pri_strength(this.segment(), 0L, value); return this; }
    /// Sets `cdef_y_pri_strength` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_pri_strength(long index0, byte value) { cdef_y_pri_strength(this.segment(), 0L, index0, value); return this; }

    /// {@return `cdef_y_sec_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cdef_y_sec_strength(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cdef_y_sec_strength, index), LAYOUT_cdef_y_sec_strength); }
    /// {@return `cdef_y_sec_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cdef_y_sec_strength(MemorySegment segment, long index, long index0) { return (byte) VH_cdef_y_sec_strength.get(segment, 0L, index, index0); }
    /// {@return `cdef_y_sec_strength`}
    public MemorySegment cdef_y_sec_strength() { return cdef_y_sec_strength(this.segment(), 0L); }
    /// {@return `cdef_y_sec_strength`}
    /// @param index0 the Index 0 of the array
    public byte cdef_y_sec_strength(long index0) { return cdef_y_sec_strength(this.segment(), 0L, index0); }
    /// Sets `cdef_y_sec_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cdef_y_sec_strength(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cdef_y_sec_strength, index), LAYOUT_cdef_y_sec_strength.byteSize()); }
    /// Sets `cdef_y_sec_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cdef_y_sec_strength(MemorySegment segment, long index, long index0, byte value) { VH_cdef_y_sec_strength.set(segment, 0L, index, index0, value); }
    /// Sets `cdef_y_sec_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_sec_strength(MemorySegment value) { cdef_y_sec_strength(this.segment(), 0L, value); return this; }
    /// Sets `cdef_y_sec_strength` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_sec_strength(long index0, byte value) { cdef_y_sec_strength(this.segment(), 0L, index0, value); return this; }

    /// {@return `cdef_uv_pri_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cdef_uv_pri_strength(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cdef_uv_pri_strength, index), LAYOUT_cdef_uv_pri_strength); }
    /// {@return `cdef_uv_pri_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cdef_uv_pri_strength(MemorySegment segment, long index, long index0) { return (byte) VH_cdef_uv_pri_strength.get(segment, 0L, index, index0); }
    /// {@return `cdef_uv_pri_strength`}
    public MemorySegment cdef_uv_pri_strength() { return cdef_uv_pri_strength(this.segment(), 0L); }
    /// {@return `cdef_uv_pri_strength`}
    /// @param index0 the Index 0 of the array
    public byte cdef_uv_pri_strength(long index0) { return cdef_uv_pri_strength(this.segment(), 0L, index0); }
    /// Sets `cdef_uv_pri_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cdef_uv_pri_strength(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cdef_uv_pri_strength, index), LAYOUT_cdef_uv_pri_strength.byteSize()); }
    /// Sets `cdef_uv_pri_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cdef_uv_pri_strength(MemorySegment segment, long index, long index0, byte value) { VH_cdef_uv_pri_strength.set(segment, 0L, index, index0, value); }
    /// Sets `cdef_uv_pri_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_pri_strength(MemorySegment value) { cdef_uv_pri_strength(this.segment(), 0L, value); return this; }
    /// Sets `cdef_uv_pri_strength` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_pri_strength(long index0, byte value) { cdef_uv_pri_strength(this.segment(), 0L, index0, value); return this; }

    /// {@return `cdef_uv_sec_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cdef_uv_sec_strength(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cdef_uv_sec_strength, index), LAYOUT_cdef_uv_sec_strength); }
    /// {@return `cdef_uv_sec_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cdef_uv_sec_strength(MemorySegment segment, long index, long index0) { return (byte) VH_cdef_uv_sec_strength.get(segment, 0L, index, index0); }
    /// {@return `cdef_uv_sec_strength`}
    public MemorySegment cdef_uv_sec_strength() { return cdef_uv_sec_strength(this.segment(), 0L); }
    /// {@return `cdef_uv_sec_strength`}
    /// @param index0 the Index 0 of the array
    public byte cdef_uv_sec_strength(long index0) { return cdef_uv_sec_strength(this.segment(), 0L, index0); }
    /// Sets `cdef_uv_sec_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cdef_uv_sec_strength(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cdef_uv_sec_strength, index), LAYOUT_cdef_uv_sec_strength.byteSize()); }
    /// Sets `cdef_uv_sec_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cdef_uv_sec_strength(MemorySegment segment, long index, long index0, byte value) { VH_cdef_uv_sec_strength.set(segment, 0L, index, index0, value); }
    /// Sets `cdef_uv_sec_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_sec_strength(MemorySegment value) { cdef_uv_sec_strength(this.segment(), 0L, value); return this; }
    /// Sets `cdef_uv_sec_strength` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_sec_strength(long index0, byte value) { cdef_uv_sec_strength(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [StdVideoAV1CDEF].
    public static final class Buffer extends StdVideoAV1CDEF {
        private final long elementCount;

        /// Creates `StdVideoAV1CDEF.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1CDEF`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1CDEF`
        public StdVideoAV1CDEF asSlice(long index) { return new StdVideoAV1CDEF(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1CDEF`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1CDEF`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `cdef_damping_minus_3` at the given index}
        /// @param index the index of the struct buffer
        public byte cdef_damping_minus_3At(long index) { return cdef_damping_minus_3(this.segment(), index); }
        /// Sets `cdef_damping_minus_3` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cdef_damping_minus_3At(long index, byte value) { cdef_damping_minus_3(this.segment(), index, value); return this; }

        /// {@return `cdef_bits` at the given index}
        /// @param index the index of the struct buffer
        public byte cdef_bitsAt(long index) { return cdef_bits(this.segment(), index); }
        /// Sets `cdef_bits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cdef_bitsAt(long index, byte value) { cdef_bits(this.segment(), index, value); return this; }

        /// {@return `cdef_y_pri_strength` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cdef_y_pri_strengthAt(long index) { return cdef_y_pri_strength(this.segment(), index); }
        /// {@return `cdef_y_pri_strength` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte cdef_y_pri_strengthAt(long index, long index0) { return cdef_y_pri_strength(this.segment(), index, index0); }
        /// Sets `cdef_y_pri_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cdef_y_pri_strengthAt(long index, MemorySegment value) { cdef_y_pri_strength(this.segment(), index, value); return this; }
        /// Sets `cdef_y_pri_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cdef_y_pri_strengthAt(long index, long index0, byte value) { cdef_y_pri_strength(this.segment(), index, index0, value); return this; }

        /// {@return `cdef_y_sec_strength` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cdef_y_sec_strengthAt(long index) { return cdef_y_sec_strength(this.segment(), index); }
        /// {@return `cdef_y_sec_strength` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte cdef_y_sec_strengthAt(long index, long index0) { return cdef_y_sec_strength(this.segment(), index, index0); }
        /// Sets `cdef_y_sec_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cdef_y_sec_strengthAt(long index, MemorySegment value) { cdef_y_sec_strength(this.segment(), index, value); return this; }
        /// Sets `cdef_y_sec_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cdef_y_sec_strengthAt(long index, long index0, byte value) { cdef_y_sec_strength(this.segment(), index, index0, value); return this; }

        /// {@return `cdef_uv_pri_strength` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cdef_uv_pri_strengthAt(long index) { return cdef_uv_pri_strength(this.segment(), index); }
        /// {@return `cdef_uv_pri_strength` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte cdef_uv_pri_strengthAt(long index, long index0) { return cdef_uv_pri_strength(this.segment(), index, index0); }
        /// Sets `cdef_uv_pri_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cdef_uv_pri_strengthAt(long index, MemorySegment value) { cdef_uv_pri_strength(this.segment(), index, value); return this; }
        /// Sets `cdef_uv_pri_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cdef_uv_pri_strengthAt(long index, long index0, byte value) { cdef_uv_pri_strength(this.segment(), index, index0, value); return this; }

        /// {@return `cdef_uv_sec_strength` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cdef_uv_sec_strengthAt(long index) { return cdef_uv_sec_strength(this.segment(), index); }
        /// {@return `cdef_uv_sec_strength` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte cdef_uv_sec_strengthAt(long index, long index0) { return cdef_uv_sec_strength(this.segment(), index, index0); }
        /// Sets `cdef_uv_sec_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cdef_uv_sec_strengthAt(long index, MemorySegment value) { cdef_uv_sec_strength(this.segment(), index, value); return this; }
        /// Sets `cdef_uv_sec_strength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cdef_uv_sec_strengthAt(long index, long index0, byte value) { cdef_uv_sec_strength(this.segment(), index, index0, value); return this; }

    }
}
