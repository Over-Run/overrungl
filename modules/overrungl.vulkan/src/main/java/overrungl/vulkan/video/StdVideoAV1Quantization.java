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
/// struct StdVideoAV1Quantization {
///     (struct StdVideoAV1QuantizationFlags) StdVideoAV1QuantizationFlags flags;
///     uint8_t base_q_idx;
///     int8_t DeltaQYDc;
///     int8_t DeltaQUDc;
///     int8_t DeltaQUAc;
///     int8_t DeltaQVDc;
///     int8_t DeltaQVAc;
///     uint8_t qm_y;
///     uint8_t qm_u;
///     uint8_t qm_v;
/// };
/// ```
public sealed class StdVideoAV1Quantization extends GroupType {
    /// The struct layout of `StdVideoAV1Quantization`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1QuantizationFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("base_q_idx"),
        ValueLayout.JAVA_BYTE.withName("DeltaQYDc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQUDc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQUAc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQVDc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQVAc"),
        ValueLayout.JAVA_BYTE.withName("qm_y"),
        ValueLayout.JAVA_BYTE.withName("qm_u"),
        ValueLayout.JAVA_BYTE.withName("qm_v")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `base_q_idx`.
    public static final long OFFSET_base_q_idx = LAYOUT.byteOffset(PathElement.groupElement("base_q_idx"));
    /// The memory layout of `base_q_idx`.
    public static final MemoryLayout LAYOUT_base_q_idx = LAYOUT.select(PathElement.groupElement("base_q_idx"));
    /// The [VarHandle] of `base_q_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_base_q_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("base_q_idx"));
    /// The byte offset of `DeltaQYDc`.
    public static final long OFFSET_DeltaQYDc = LAYOUT.byteOffset(PathElement.groupElement("DeltaQYDc"));
    /// The memory layout of `DeltaQYDc`.
    public static final MemoryLayout LAYOUT_DeltaQYDc = LAYOUT.select(PathElement.groupElement("DeltaQYDc"));
    /// The [VarHandle] of `DeltaQYDc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_DeltaQYDc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQYDc"));
    /// The byte offset of `DeltaQUDc`.
    public static final long OFFSET_DeltaQUDc = LAYOUT.byteOffset(PathElement.groupElement("DeltaQUDc"));
    /// The memory layout of `DeltaQUDc`.
    public static final MemoryLayout LAYOUT_DeltaQUDc = LAYOUT.select(PathElement.groupElement("DeltaQUDc"));
    /// The [VarHandle] of `DeltaQUDc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_DeltaQUDc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQUDc"));
    /// The byte offset of `DeltaQUAc`.
    public static final long OFFSET_DeltaQUAc = LAYOUT.byteOffset(PathElement.groupElement("DeltaQUAc"));
    /// The memory layout of `DeltaQUAc`.
    public static final MemoryLayout LAYOUT_DeltaQUAc = LAYOUT.select(PathElement.groupElement("DeltaQUAc"));
    /// The [VarHandle] of `DeltaQUAc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_DeltaQUAc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQUAc"));
    /// The byte offset of `DeltaQVDc`.
    public static final long OFFSET_DeltaQVDc = LAYOUT.byteOffset(PathElement.groupElement("DeltaQVDc"));
    /// The memory layout of `DeltaQVDc`.
    public static final MemoryLayout LAYOUT_DeltaQVDc = LAYOUT.select(PathElement.groupElement("DeltaQVDc"));
    /// The [VarHandle] of `DeltaQVDc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_DeltaQVDc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQVDc"));
    /// The byte offset of `DeltaQVAc`.
    public static final long OFFSET_DeltaQVAc = LAYOUT.byteOffset(PathElement.groupElement("DeltaQVAc"));
    /// The memory layout of `DeltaQVAc`.
    public static final MemoryLayout LAYOUT_DeltaQVAc = LAYOUT.select(PathElement.groupElement("DeltaQVAc"));
    /// The [VarHandle] of `DeltaQVAc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_DeltaQVAc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQVAc"));
    /// The byte offset of `qm_y`.
    public static final long OFFSET_qm_y = LAYOUT.byteOffset(PathElement.groupElement("qm_y"));
    /// The memory layout of `qm_y`.
    public static final MemoryLayout LAYOUT_qm_y = LAYOUT.select(PathElement.groupElement("qm_y"));
    /// The [VarHandle] of `qm_y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qm_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qm_y"));
    /// The byte offset of `qm_u`.
    public static final long OFFSET_qm_u = LAYOUT.byteOffset(PathElement.groupElement("qm_u"));
    /// The memory layout of `qm_u`.
    public static final MemoryLayout LAYOUT_qm_u = LAYOUT.select(PathElement.groupElement("qm_u"));
    /// The [VarHandle] of `qm_u` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qm_u = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qm_u"));
    /// The byte offset of `qm_v`.
    public static final long OFFSET_qm_v = LAYOUT.byteOffset(PathElement.groupElement("qm_v"));
    /// The memory layout of `qm_v`.
    public static final MemoryLayout LAYOUT_qm_v = LAYOUT.select(PathElement.groupElement("qm_v"));
    /// The [VarHandle] of `qm_v` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qm_v = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qm_v"));

    /// Creates `StdVideoAV1Quantization` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1Quantization(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1Quantization` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1Quantization` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Quantization ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Quantization(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1Quantization` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1Quantization` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1Quantization`
    public static StdVideoAV1Quantization alloc(SegmentAllocator allocator) { return new StdVideoAV1Quantization(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1Quantization` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1Quantization`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1Quantization copyFrom(StdVideoAV1Quantization src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public StdVideoAV1Quantization flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `base_q_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte base_q_idx(MemorySegment segment, long index) { return (byte) VH_base_q_idx.get(segment, 0L, index); }
    /// {@return `base_q_idx`}
    public byte base_q_idx() { return base_q_idx(this.segment(), 0L); }
    /// Sets `base_q_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void base_q_idx(MemorySegment segment, long index, byte value) { VH_base_q_idx.set(segment, 0L, index, value); }
    /// Sets `base_q_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization base_q_idx(byte value) { base_q_idx(this.segment(), 0L, value); return this; }

    /// {@return `DeltaQYDc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte DeltaQYDc(MemorySegment segment, long index) { return (byte) VH_DeltaQYDc.get(segment, 0L, index); }
    /// {@return `DeltaQYDc`}
    public byte DeltaQYDc() { return DeltaQYDc(this.segment(), 0L); }
    /// Sets `DeltaQYDc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void DeltaQYDc(MemorySegment segment, long index, byte value) { VH_DeltaQYDc.set(segment, 0L, index, value); }
    /// Sets `DeltaQYDc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQYDc(byte value) { DeltaQYDc(this.segment(), 0L, value); return this; }

    /// {@return `DeltaQUDc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte DeltaQUDc(MemorySegment segment, long index) { return (byte) VH_DeltaQUDc.get(segment, 0L, index); }
    /// {@return `DeltaQUDc`}
    public byte DeltaQUDc() { return DeltaQUDc(this.segment(), 0L); }
    /// Sets `DeltaQUDc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void DeltaQUDc(MemorySegment segment, long index, byte value) { VH_DeltaQUDc.set(segment, 0L, index, value); }
    /// Sets `DeltaQUDc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQUDc(byte value) { DeltaQUDc(this.segment(), 0L, value); return this; }

    /// {@return `DeltaQUAc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte DeltaQUAc(MemorySegment segment, long index) { return (byte) VH_DeltaQUAc.get(segment, 0L, index); }
    /// {@return `DeltaQUAc`}
    public byte DeltaQUAc() { return DeltaQUAc(this.segment(), 0L); }
    /// Sets `DeltaQUAc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void DeltaQUAc(MemorySegment segment, long index, byte value) { VH_DeltaQUAc.set(segment, 0L, index, value); }
    /// Sets `DeltaQUAc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQUAc(byte value) { DeltaQUAc(this.segment(), 0L, value); return this; }

    /// {@return `DeltaQVDc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte DeltaQVDc(MemorySegment segment, long index) { return (byte) VH_DeltaQVDc.get(segment, 0L, index); }
    /// {@return `DeltaQVDc`}
    public byte DeltaQVDc() { return DeltaQVDc(this.segment(), 0L); }
    /// Sets `DeltaQVDc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void DeltaQVDc(MemorySegment segment, long index, byte value) { VH_DeltaQVDc.set(segment, 0L, index, value); }
    /// Sets `DeltaQVDc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQVDc(byte value) { DeltaQVDc(this.segment(), 0L, value); return this; }

    /// {@return `DeltaQVAc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte DeltaQVAc(MemorySegment segment, long index) { return (byte) VH_DeltaQVAc.get(segment, 0L, index); }
    /// {@return `DeltaQVAc`}
    public byte DeltaQVAc() { return DeltaQVAc(this.segment(), 0L); }
    /// Sets `DeltaQVAc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void DeltaQVAc(MemorySegment segment, long index, byte value) { VH_DeltaQVAc.set(segment, 0L, index, value); }
    /// Sets `DeltaQVAc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQVAc(byte value) { DeltaQVAc(this.segment(), 0L, value); return this; }

    /// {@return `qm_y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte qm_y(MemorySegment segment, long index) { return (byte) VH_qm_y.get(segment, 0L, index); }
    /// {@return `qm_y`}
    public byte qm_y() { return qm_y(this.segment(), 0L); }
    /// Sets `qm_y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qm_y(MemorySegment segment, long index, byte value) { VH_qm_y.set(segment, 0L, index, value); }
    /// Sets `qm_y` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_y(byte value) { qm_y(this.segment(), 0L, value); return this; }

    /// {@return `qm_u` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte qm_u(MemorySegment segment, long index) { return (byte) VH_qm_u.get(segment, 0L, index); }
    /// {@return `qm_u`}
    public byte qm_u() { return qm_u(this.segment(), 0L); }
    /// Sets `qm_u` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qm_u(MemorySegment segment, long index, byte value) { VH_qm_u.set(segment, 0L, index, value); }
    /// Sets `qm_u` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_u(byte value) { qm_u(this.segment(), 0L, value); return this; }

    /// {@return `qm_v` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte qm_v(MemorySegment segment, long index) { return (byte) VH_qm_v.get(segment, 0L, index); }
    /// {@return `qm_v`}
    public byte qm_v() { return qm_v(this.segment(), 0L); }
    /// Sets `qm_v` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qm_v(MemorySegment segment, long index, byte value) { VH_qm_v.set(segment, 0L, index, value); }
    /// Sets `qm_v` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_v(byte value) { qm_v(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoAV1Quantization].
    public static final class Buffer extends StdVideoAV1Quantization {
        private final long elementCount;

        /// Creates `StdVideoAV1Quantization.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1Quantization`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1Quantization`
        public StdVideoAV1Quantization asSlice(long index) { return new StdVideoAV1Quantization(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1Quantization`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1Quantization`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `base_q_idx` at the given index}
        /// @param index the index of the struct buffer
        public byte base_q_idxAt(long index) { return base_q_idx(this.segment(), index); }
        /// Sets `base_q_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer base_q_idxAt(long index, byte value) { base_q_idx(this.segment(), index, value); return this; }

        /// {@return `DeltaQYDc` at the given index}
        /// @param index the index of the struct buffer
        public byte DeltaQYDcAt(long index) { return DeltaQYDc(this.segment(), index); }
        /// Sets `DeltaQYDc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer DeltaQYDcAt(long index, byte value) { DeltaQYDc(this.segment(), index, value); return this; }

        /// {@return `DeltaQUDc` at the given index}
        /// @param index the index of the struct buffer
        public byte DeltaQUDcAt(long index) { return DeltaQUDc(this.segment(), index); }
        /// Sets `DeltaQUDc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer DeltaQUDcAt(long index, byte value) { DeltaQUDc(this.segment(), index, value); return this; }

        /// {@return `DeltaQUAc` at the given index}
        /// @param index the index of the struct buffer
        public byte DeltaQUAcAt(long index) { return DeltaQUAc(this.segment(), index); }
        /// Sets `DeltaQUAc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer DeltaQUAcAt(long index, byte value) { DeltaQUAc(this.segment(), index, value); return this; }

        /// {@return `DeltaQVDc` at the given index}
        /// @param index the index of the struct buffer
        public byte DeltaQVDcAt(long index) { return DeltaQVDc(this.segment(), index); }
        /// Sets `DeltaQVDc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer DeltaQVDcAt(long index, byte value) { DeltaQVDc(this.segment(), index, value); return this; }

        /// {@return `DeltaQVAc` at the given index}
        /// @param index the index of the struct buffer
        public byte DeltaQVAcAt(long index) { return DeltaQVAc(this.segment(), index); }
        /// Sets `DeltaQVAc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer DeltaQVAcAt(long index, byte value) { DeltaQVAc(this.segment(), index, value); return this; }

        /// {@return `qm_y` at the given index}
        /// @param index the index of the struct buffer
        public byte qm_yAt(long index) { return qm_y(this.segment(), index); }
        /// Sets `qm_y` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer qm_yAt(long index, byte value) { qm_y(this.segment(), index, value); return this; }

        /// {@return `qm_u` at the given index}
        /// @param index the index of the struct buffer
        public byte qm_uAt(long index) { return qm_u(this.segment(), index); }
        /// Sets `qm_u` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer qm_uAt(long index, byte value) { qm_u(this.segment(), index, value); return this; }

        /// {@return `qm_v` at the given index}
        /// @param index the index of the struct buffer
        public byte qm_vAt(long index) { return qm_v(this.segment(), index); }
        /// Sets `qm_v` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer qm_vAt(long index, byte value) { qm_v(this.segment(), index, value); return this; }

    }
}
