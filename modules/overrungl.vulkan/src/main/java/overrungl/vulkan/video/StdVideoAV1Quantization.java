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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### base_q_idx
/// [VarHandle][#VH_base_q_idx] - [Getter][#base_q_idx()] - [Setter][#base_q_idx(byte)]
/// ### DeltaQYDc
/// [VarHandle][#VH_DeltaQYDc] - [Getter][#DeltaQYDc()] - [Setter][#DeltaQYDc(byte)]
/// ### DeltaQUDc
/// [VarHandle][#VH_DeltaQUDc] - [Getter][#DeltaQUDc()] - [Setter][#DeltaQUDc(byte)]
/// ### DeltaQUAc
/// [VarHandle][#VH_DeltaQUAc] - [Getter][#DeltaQUAc()] - [Setter][#DeltaQUAc(byte)]
/// ### DeltaQVDc
/// [VarHandle][#VH_DeltaQVDc] - [Getter][#DeltaQVDc()] - [Setter][#DeltaQVDc(byte)]
/// ### DeltaQVAc
/// [VarHandle][#VH_DeltaQVAc] - [Getter][#DeltaQVAc()] - [Setter][#DeltaQVAc(byte)]
/// ### qm_y
/// [VarHandle][#VH_qm_y] - [Getter][#qm_y()] - [Setter][#qm_y(byte)]
/// ### qm_u
/// [VarHandle][#VH_qm_u] - [Getter][#qm_u()] - [Setter][#qm_u(byte)]
/// ### qm_v
/// [VarHandle][#VH_qm_v] - [Getter][#qm_v()] - [Setter][#qm_v(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1Quantization {
///     StdVideoAV1QuantizationFlags flags;
///     uint8_t base_q_idx;
///     int8_t DeltaQYDc;
///     int8_t DeltaQUDc;
///     int8_t DeltaQUAc;
///     int8_t DeltaQVDc;
///     int8_t DeltaQVAc;
///     uint8_t qm_y;
///     uint8_t qm_u;
///     uint8_t qm_v;
/// } StdVideoAV1Quantization;
/// ```
public final class StdVideoAV1Quantization extends Struct {
    /// The struct layout of `StdVideoAV1Quantization`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1QuantizationFlags.LAYOUT.withName("flags"),
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
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `base_q_idx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_base_q_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("base_q_idx"));
    /// The [VarHandle] of `DeltaQYDc` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_DeltaQYDc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQYDc"));
    /// The [VarHandle] of `DeltaQUDc` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_DeltaQUDc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQUDc"));
    /// The [VarHandle] of `DeltaQUAc` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_DeltaQUAc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQUAc"));
    /// The [VarHandle] of `DeltaQVDc` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_DeltaQVDc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQVDc"));
    /// The [VarHandle] of `DeltaQVAc` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_DeltaQVAc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DeltaQVAc"));
    /// The [VarHandle] of `qm_y` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_qm_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qm_y"));
    /// The [VarHandle] of `qm_u` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_qm_u = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qm_u"));
    /// The [VarHandle] of `qm_v` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_qm_v = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qm_v"));

    /// Creates `StdVideoAV1Quantization` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1Quantization(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1Quantization` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Quantization of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1Quantization(segment); }

    /// Creates `StdVideoAV1Quantization` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Quantization ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1Quantization(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1Quantization` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Quantization ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1Quantization(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1Quantization` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1Quantization`
    public static StdVideoAV1Quantization alloc(SegmentAllocator allocator) { return new StdVideoAV1Quantization(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1Quantization` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1Quantization`
    public static StdVideoAV1Quantization alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1Quantization(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1Quantization.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoAV1Quantization.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment flags() { return StdVideoAV1Quantization.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1Quantization.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization flagsAt(long index, @CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1Quantization.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization flags(@CType("StdVideoAV1QuantizationFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1Quantization.set_flags(this.segment(), value); return this; }

    /// {@return `base_q_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_base_q_idx(MemorySegment segment, long index) { return (byte) VH_base_q_idx.get(segment, 0L, index); }
    /// {@return `base_q_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_base_q_idx(MemorySegment segment) { return StdVideoAV1Quantization.get_base_q_idx(segment, 0L); }
    /// {@return `base_q_idx` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte base_q_idxAt(long index) { return StdVideoAV1Quantization.get_base_q_idx(this.segment(), index); }
    /// {@return `base_q_idx`}
    public @CType("uint8_t") byte base_q_idx() { return StdVideoAV1Quantization.get_base_q_idx(this.segment()); }
    /// Sets `base_q_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_base_q_idx(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_base_q_idx.set(segment, 0L, index, value); }
    /// Sets `base_q_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_base_q_idx(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_base_q_idx(segment, 0L, value); }
    /// Sets `base_q_idx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization base_q_idxAt(long index, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_base_q_idx(this.segment(), index, value); return this; }
    /// Sets `base_q_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization base_q_idx(@CType("uint8_t") byte value) { StdVideoAV1Quantization.set_base_q_idx(this.segment(), value); return this; }

    /// {@return `DeltaQYDc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_DeltaQYDc(MemorySegment segment, long index) { return (byte) VH_DeltaQYDc.get(segment, 0L, index); }
    /// {@return `DeltaQYDc`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_DeltaQYDc(MemorySegment segment) { return StdVideoAV1Quantization.get_DeltaQYDc(segment, 0L); }
    /// {@return `DeltaQYDc` at the given index}
    /// @param index the index
    public @CType("int8_t") byte DeltaQYDcAt(long index) { return StdVideoAV1Quantization.get_DeltaQYDc(this.segment(), index); }
    /// {@return `DeltaQYDc`}
    public @CType("int8_t") byte DeltaQYDc() { return StdVideoAV1Quantization.get_DeltaQYDc(this.segment()); }
    /// Sets `DeltaQYDc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_DeltaQYDc(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_DeltaQYDc.set(segment, 0L, index, value); }
    /// Sets `DeltaQYDc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_DeltaQYDc(MemorySegment segment, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQYDc(segment, 0L, value); }
    /// Sets `DeltaQYDc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQYDcAt(long index, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQYDc(this.segment(), index, value); return this; }
    /// Sets `DeltaQYDc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQYDc(@CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQYDc(this.segment(), value); return this; }

    /// {@return `DeltaQUDc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_DeltaQUDc(MemorySegment segment, long index) { return (byte) VH_DeltaQUDc.get(segment, 0L, index); }
    /// {@return `DeltaQUDc`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_DeltaQUDc(MemorySegment segment) { return StdVideoAV1Quantization.get_DeltaQUDc(segment, 0L); }
    /// {@return `DeltaQUDc` at the given index}
    /// @param index the index
    public @CType("int8_t") byte DeltaQUDcAt(long index) { return StdVideoAV1Quantization.get_DeltaQUDc(this.segment(), index); }
    /// {@return `DeltaQUDc`}
    public @CType("int8_t") byte DeltaQUDc() { return StdVideoAV1Quantization.get_DeltaQUDc(this.segment()); }
    /// Sets `DeltaQUDc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_DeltaQUDc(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_DeltaQUDc.set(segment, 0L, index, value); }
    /// Sets `DeltaQUDc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_DeltaQUDc(MemorySegment segment, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQUDc(segment, 0L, value); }
    /// Sets `DeltaQUDc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQUDcAt(long index, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQUDc(this.segment(), index, value); return this; }
    /// Sets `DeltaQUDc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQUDc(@CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQUDc(this.segment(), value); return this; }

    /// {@return `DeltaQUAc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_DeltaQUAc(MemorySegment segment, long index) { return (byte) VH_DeltaQUAc.get(segment, 0L, index); }
    /// {@return `DeltaQUAc`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_DeltaQUAc(MemorySegment segment) { return StdVideoAV1Quantization.get_DeltaQUAc(segment, 0L); }
    /// {@return `DeltaQUAc` at the given index}
    /// @param index the index
    public @CType("int8_t") byte DeltaQUAcAt(long index) { return StdVideoAV1Quantization.get_DeltaQUAc(this.segment(), index); }
    /// {@return `DeltaQUAc`}
    public @CType("int8_t") byte DeltaQUAc() { return StdVideoAV1Quantization.get_DeltaQUAc(this.segment()); }
    /// Sets `DeltaQUAc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_DeltaQUAc(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_DeltaQUAc.set(segment, 0L, index, value); }
    /// Sets `DeltaQUAc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_DeltaQUAc(MemorySegment segment, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQUAc(segment, 0L, value); }
    /// Sets `DeltaQUAc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQUAcAt(long index, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQUAc(this.segment(), index, value); return this; }
    /// Sets `DeltaQUAc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQUAc(@CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQUAc(this.segment(), value); return this; }

    /// {@return `DeltaQVDc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_DeltaQVDc(MemorySegment segment, long index) { return (byte) VH_DeltaQVDc.get(segment, 0L, index); }
    /// {@return `DeltaQVDc`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_DeltaQVDc(MemorySegment segment) { return StdVideoAV1Quantization.get_DeltaQVDc(segment, 0L); }
    /// {@return `DeltaQVDc` at the given index}
    /// @param index the index
    public @CType("int8_t") byte DeltaQVDcAt(long index) { return StdVideoAV1Quantization.get_DeltaQVDc(this.segment(), index); }
    /// {@return `DeltaQVDc`}
    public @CType("int8_t") byte DeltaQVDc() { return StdVideoAV1Quantization.get_DeltaQVDc(this.segment()); }
    /// Sets `DeltaQVDc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_DeltaQVDc(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_DeltaQVDc.set(segment, 0L, index, value); }
    /// Sets `DeltaQVDc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_DeltaQVDc(MemorySegment segment, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQVDc(segment, 0L, value); }
    /// Sets `DeltaQVDc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQVDcAt(long index, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQVDc(this.segment(), index, value); return this; }
    /// Sets `DeltaQVDc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQVDc(@CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQVDc(this.segment(), value); return this; }

    /// {@return `DeltaQVAc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_DeltaQVAc(MemorySegment segment, long index) { return (byte) VH_DeltaQVAc.get(segment, 0L, index); }
    /// {@return `DeltaQVAc`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_DeltaQVAc(MemorySegment segment) { return StdVideoAV1Quantization.get_DeltaQVAc(segment, 0L); }
    /// {@return `DeltaQVAc` at the given index}
    /// @param index the index
    public @CType("int8_t") byte DeltaQVAcAt(long index) { return StdVideoAV1Quantization.get_DeltaQVAc(this.segment(), index); }
    /// {@return `DeltaQVAc`}
    public @CType("int8_t") byte DeltaQVAc() { return StdVideoAV1Quantization.get_DeltaQVAc(this.segment()); }
    /// Sets `DeltaQVAc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_DeltaQVAc(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_DeltaQVAc.set(segment, 0L, index, value); }
    /// Sets `DeltaQVAc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_DeltaQVAc(MemorySegment segment, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQVAc(segment, 0L, value); }
    /// Sets `DeltaQVAc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQVAcAt(long index, @CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQVAc(this.segment(), index, value); return this; }
    /// Sets `DeltaQVAc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization DeltaQVAc(@CType("int8_t") byte value) { StdVideoAV1Quantization.set_DeltaQVAc(this.segment(), value); return this; }

    /// {@return `qm_y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_qm_y(MemorySegment segment, long index) { return (byte) VH_qm_y.get(segment, 0L, index); }
    /// {@return `qm_y`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_qm_y(MemorySegment segment) { return StdVideoAV1Quantization.get_qm_y(segment, 0L); }
    /// {@return `qm_y` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte qm_yAt(long index) { return StdVideoAV1Quantization.get_qm_y(this.segment(), index); }
    /// {@return `qm_y`}
    public @CType("uint8_t") byte qm_y() { return StdVideoAV1Quantization.get_qm_y(this.segment()); }
    /// Sets `qm_y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qm_y(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_qm_y.set(segment, 0L, index, value); }
    /// Sets `qm_y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qm_y(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_y(segment, 0L, value); }
    /// Sets `qm_y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_yAt(long index, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_y(this.segment(), index, value); return this; }
    /// Sets `qm_y` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_y(@CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_y(this.segment(), value); return this; }

    /// {@return `qm_u` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_qm_u(MemorySegment segment, long index) { return (byte) VH_qm_u.get(segment, 0L, index); }
    /// {@return `qm_u`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_qm_u(MemorySegment segment) { return StdVideoAV1Quantization.get_qm_u(segment, 0L); }
    /// {@return `qm_u` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte qm_uAt(long index) { return StdVideoAV1Quantization.get_qm_u(this.segment(), index); }
    /// {@return `qm_u`}
    public @CType("uint8_t") byte qm_u() { return StdVideoAV1Quantization.get_qm_u(this.segment()); }
    /// Sets `qm_u` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qm_u(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_qm_u.set(segment, 0L, index, value); }
    /// Sets `qm_u` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qm_u(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_u(segment, 0L, value); }
    /// Sets `qm_u` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_uAt(long index, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_u(this.segment(), index, value); return this; }
    /// Sets `qm_u` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_u(@CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_u(this.segment(), value); return this; }

    /// {@return `qm_v` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_qm_v(MemorySegment segment, long index) { return (byte) VH_qm_v.get(segment, 0L, index); }
    /// {@return `qm_v`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_qm_v(MemorySegment segment) { return StdVideoAV1Quantization.get_qm_v(segment, 0L); }
    /// {@return `qm_v` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte qm_vAt(long index) { return StdVideoAV1Quantization.get_qm_v(this.segment(), index); }
    /// {@return `qm_v`}
    public @CType("uint8_t") byte qm_v() { return StdVideoAV1Quantization.get_qm_v(this.segment()); }
    /// Sets `qm_v` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qm_v(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_qm_v.set(segment, 0L, index, value); }
    /// Sets `qm_v` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qm_v(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_v(segment, 0L, value); }
    /// Sets `qm_v` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_vAt(long index, @CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_v(this.segment(), index, value); return this; }
    /// Sets `qm_v` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Quantization qm_v(@CType("uint8_t") byte value) { StdVideoAV1Quantization.set_qm_v(this.segment(), value); return this; }

}
