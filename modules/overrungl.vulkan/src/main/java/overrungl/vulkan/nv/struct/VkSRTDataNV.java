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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sx
/// [VarHandle][#VH_sx] - [Getter][#sx()] - [Setter][#sx(float)]
/// ### a
/// [VarHandle][#VH_a] - [Getter][#a()] - [Setter][#a(float)]
/// ### b
/// [VarHandle][#VH_b] - [Getter][#b()] - [Setter][#b(float)]
/// ### pvx
/// [VarHandle][#VH_pvx] - [Getter][#pvx()] - [Setter][#pvx(float)]
/// ### sy
/// [VarHandle][#VH_sy] - [Getter][#sy()] - [Setter][#sy(float)]
/// ### c
/// [VarHandle][#VH_c] - [Getter][#c()] - [Setter][#c(float)]
/// ### pvy
/// [VarHandle][#VH_pvy] - [Getter][#pvy()] - [Setter][#pvy(float)]
/// ### sz
/// [VarHandle][#VH_sz] - [Getter][#sz()] - [Setter][#sz(float)]
/// ### pvz
/// [VarHandle][#VH_pvz] - [Getter][#pvz()] - [Setter][#pvz(float)]
/// ### qx
/// [VarHandle][#VH_qx] - [Getter][#qx()] - [Setter][#qx(float)]
/// ### qy
/// [VarHandle][#VH_qy] - [Getter][#qy()] - [Setter][#qy(float)]
/// ### qz
/// [VarHandle][#VH_qz] - [Getter][#qz()] - [Setter][#qz(float)]
/// ### qw
/// [VarHandle][#VH_qw] - [Getter][#qw()] - [Setter][#qw(float)]
/// ### tx
/// [VarHandle][#VH_tx] - [Getter][#tx()] - [Setter][#tx(float)]
/// ### ty
/// [VarHandle][#VH_ty] - [Getter][#ty()] - [Setter][#ty(float)]
/// ### tz
/// [VarHandle][#VH_tz] - [Getter][#tz()] - [Setter][#tz(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSRTDataNV {
///     float sx;
///     float a;
///     float b;
///     float pvx;
///     float sy;
///     float c;
///     float pvy;
///     float sz;
///     float pvz;
///     float qx;
///     float qy;
///     float qz;
///     float qw;
///     float tx;
///     float ty;
///     float tz;
/// } VkSRTDataNV;
/// ```
public final class VkSRTDataNV extends Struct {
    /// The struct layout of `VkSRTDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("sx"),
        ValueLayout.JAVA_FLOAT.withName("a"),
        ValueLayout.JAVA_FLOAT.withName("b"),
        ValueLayout.JAVA_FLOAT.withName("pvx"),
        ValueLayout.JAVA_FLOAT.withName("sy"),
        ValueLayout.JAVA_FLOAT.withName("c"),
        ValueLayout.JAVA_FLOAT.withName("pvy"),
        ValueLayout.JAVA_FLOAT.withName("sz"),
        ValueLayout.JAVA_FLOAT.withName("pvz"),
        ValueLayout.JAVA_FLOAT.withName("qx"),
        ValueLayout.JAVA_FLOAT.withName("qy"),
        ValueLayout.JAVA_FLOAT.withName("qz"),
        ValueLayout.JAVA_FLOAT.withName("qw"),
        ValueLayout.JAVA_FLOAT.withName("tx"),
        ValueLayout.JAVA_FLOAT.withName("ty"),
        ValueLayout.JAVA_FLOAT.withName("tz")
    );
    /// The [VarHandle] of `sx` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_sx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sx"));
    /// The [VarHandle] of `a` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("a"));
    /// The [VarHandle] of `b` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b"));
    /// The [VarHandle] of `pvx` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_pvx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvx"));
    /// The [VarHandle] of `sy` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_sy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sy"));
    /// The [VarHandle] of `c` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_c = LAYOUT.arrayElementVarHandle(PathElement.groupElement("c"));
    /// The [VarHandle] of `pvy` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_pvy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvy"));
    /// The [VarHandle] of `sz` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_sz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sz"));
    /// The [VarHandle] of `pvz` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_pvz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvz"));
    /// The [VarHandle] of `qx` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_qx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qx"));
    /// The [VarHandle] of `qy` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_qy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qy"));
    /// The [VarHandle] of `qz` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_qz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qz"));
    /// The [VarHandle] of `qw` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_qw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qw"));
    /// The [VarHandle] of `tx` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_tx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tx"));
    /// The [VarHandle] of `ty` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_ty = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ty"));
    /// The [VarHandle] of `tz` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_tz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tz"));

    /// Creates `VkSRTDataNV` with the given segment.
    /// @param segment the memory segment
    public VkSRTDataNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSRTDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSRTDataNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSRTDataNV(segment); }

    /// Creates `VkSRTDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSRTDataNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSRTDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSRTDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSRTDataNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSRTDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSRTDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSRTDataNV`
    public static VkSRTDataNV alloc(SegmentAllocator allocator) { return new VkSRTDataNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSRTDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSRTDataNV`
    public static VkSRTDataNV alloc(SegmentAllocator allocator, long count) { return new VkSRTDataNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSRTDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSRTDataNV`
    public VkSRTDataNV asSlice(long index) { return new VkSRTDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSRTDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSRTDataNV`
    public VkSRTDataNV asSlice(long index, long count) { return new VkSRTDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_sx(MemorySegment segment, long index) { return (float) VH_sx.get(segment, 0L, index); }
    /// {@return `sx`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_sx(MemorySegment segment) { return VkSRTDataNV.get_sx(segment, 0L); }
    /// {@return `sx` at the given index}
    /// @param index the index
    public @CType("float") float sxAt(long index) { return VkSRTDataNV.get_sx(this.segment(), index); }
    /// {@return `sx`}
    public @CType("float") float sx() { return VkSRTDataNV.get_sx(this.segment()); }
    /// Sets `sx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sx(MemorySegment segment, long index, @CType("float") float value) { VH_sx.set(segment, 0L, index, value); }
    /// Sets `sx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sx(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_sx(segment, 0L, value); }
    /// Sets `sx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sxAt(long index, @CType("float") float value) { VkSRTDataNV.set_sx(this.segment(), index, value); return this; }
    /// Sets `sx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sx(@CType("float") float value) { VkSRTDataNV.set_sx(this.segment(), value); return this; }

    /// {@return `a` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_a(MemorySegment segment, long index) { return (float) VH_a.get(segment, 0L, index); }
    /// {@return `a`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_a(MemorySegment segment) { return VkSRTDataNV.get_a(segment, 0L); }
    /// {@return `a` at the given index}
    /// @param index the index
    public @CType("float") float aAt(long index) { return VkSRTDataNV.get_a(this.segment(), index); }
    /// {@return `a`}
    public @CType("float") float a() { return VkSRTDataNV.get_a(this.segment()); }
    /// Sets `a` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_a(MemorySegment segment, long index, @CType("float") float value) { VH_a.set(segment, 0L, index, value); }
    /// Sets `a` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_a(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_a(segment, 0L, value); }
    /// Sets `a` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV aAt(long index, @CType("float") float value) { VkSRTDataNV.set_a(this.segment(), index, value); return this; }
    /// Sets `a` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV a(@CType("float") float value) { VkSRTDataNV.set_a(this.segment(), value); return this; }

    /// {@return `b` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_b(MemorySegment segment, long index) { return (float) VH_b.get(segment, 0L, index); }
    /// {@return `b`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_b(MemorySegment segment) { return VkSRTDataNV.get_b(segment, 0L); }
    /// {@return `b` at the given index}
    /// @param index the index
    public @CType("float") float bAt(long index) { return VkSRTDataNV.get_b(this.segment(), index); }
    /// {@return `b`}
    public @CType("float") float b() { return VkSRTDataNV.get_b(this.segment()); }
    /// Sets `b` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_b(MemorySegment segment, long index, @CType("float") float value) { VH_b.set(segment, 0L, index, value); }
    /// Sets `b` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_b(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_b(segment, 0L, value); }
    /// Sets `b` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV bAt(long index, @CType("float") float value) { VkSRTDataNV.set_b(this.segment(), index, value); return this; }
    /// Sets `b` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV b(@CType("float") float value) { VkSRTDataNV.set_b(this.segment(), value); return this; }

    /// {@return `pvx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_pvx(MemorySegment segment, long index) { return (float) VH_pvx.get(segment, 0L, index); }
    /// {@return `pvx`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_pvx(MemorySegment segment) { return VkSRTDataNV.get_pvx(segment, 0L); }
    /// {@return `pvx` at the given index}
    /// @param index the index
    public @CType("float") float pvxAt(long index) { return VkSRTDataNV.get_pvx(this.segment(), index); }
    /// {@return `pvx`}
    public @CType("float") float pvx() { return VkSRTDataNV.get_pvx(this.segment()); }
    /// Sets `pvx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pvx(MemorySegment segment, long index, @CType("float") float value) { VH_pvx.set(segment, 0L, index, value); }
    /// Sets `pvx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pvx(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_pvx(segment, 0L, value); }
    /// Sets `pvx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvxAt(long index, @CType("float") float value) { VkSRTDataNV.set_pvx(this.segment(), index, value); return this; }
    /// Sets `pvx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvx(@CType("float") float value) { VkSRTDataNV.set_pvx(this.segment(), value); return this; }

    /// {@return `sy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_sy(MemorySegment segment, long index) { return (float) VH_sy.get(segment, 0L, index); }
    /// {@return `sy`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_sy(MemorySegment segment) { return VkSRTDataNV.get_sy(segment, 0L); }
    /// {@return `sy` at the given index}
    /// @param index the index
    public @CType("float") float syAt(long index) { return VkSRTDataNV.get_sy(this.segment(), index); }
    /// {@return `sy`}
    public @CType("float") float sy() { return VkSRTDataNV.get_sy(this.segment()); }
    /// Sets `sy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sy(MemorySegment segment, long index, @CType("float") float value) { VH_sy.set(segment, 0L, index, value); }
    /// Sets `sy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sy(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_sy(segment, 0L, value); }
    /// Sets `sy` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV syAt(long index, @CType("float") float value) { VkSRTDataNV.set_sy(this.segment(), index, value); return this; }
    /// Sets `sy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sy(@CType("float") float value) { VkSRTDataNV.set_sy(this.segment(), value); return this; }

    /// {@return `c` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_c(MemorySegment segment, long index) { return (float) VH_c.get(segment, 0L, index); }
    /// {@return `c`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_c(MemorySegment segment) { return VkSRTDataNV.get_c(segment, 0L); }
    /// {@return `c` at the given index}
    /// @param index the index
    public @CType("float") float cAt(long index) { return VkSRTDataNV.get_c(this.segment(), index); }
    /// {@return `c`}
    public @CType("float") float c() { return VkSRTDataNV.get_c(this.segment()); }
    /// Sets `c` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_c(MemorySegment segment, long index, @CType("float") float value) { VH_c.set(segment, 0L, index, value); }
    /// Sets `c` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_c(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_c(segment, 0L, value); }
    /// Sets `c` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV cAt(long index, @CType("float") float value) { VkSRTDataNV.set_c(this.segment(), index, value); return this; }
    /// Sets `c` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV c(@CType("float") float value) { VkSRTDataNV.set_c(this.segment(), value); return this; }

    /// {@return `pvy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_pvy(MemorySegment segment, long index) { return (float) VH_pvy.get(segment, 0L, index); }
    /// {@return `pvy`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_pvy(MemorySegment segment) { return VkSRTDataNV.get_pvy(segment, 0L); }
    /// {@return `pvy` at the given index}
    /// @param index the index
    public @CType("float") float pvyAt(long index) { return VkSRTDataNV.get_pvy(this.segment(), index); }
    /// {@return `pvy`}
    public @CType("float") float pvy() { return VkSRTDataNV.get_pvy(this.segment()); }
    /// Sets `pvy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pvy(MemorySegment segment, long index, @CType("float") float value) { VH_pvy.set(segment, 0L, index, value); }
    /// Sets `pvy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pvy(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_pvy(segment, 0L, value); }
    /// Sets `pvy` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvyAt(long index, @CType("float") float value) { VkSRTDataNV.set_pvy(this.segment(), index, value); return this; }
    /// Sets `pvy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvy(@CType("float") float value) { VkSRTDataNV.set_pvy(this.segment(), value); return this; }

    /// {@return `sz` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_sz(MemorySegment segment, long index) { return (float) VH_sz.get(segment, 0L, index); }
    /// {@return `sz`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_sz(MemorySegment segment) { return VkSRTDataNV.get_sz(segment, 0L); }
    /// {@return `sz` at the given index}
    /// @param index the index
    public @CType("float") float szAt(long index) { return VkSRTDataNV.get_sz(this.segment(), index); }
    /// {@return `sz`}
    public @CType("float") float sz() { return VkSRTDataNV.get_sz(this.segment()); }
    /// Sets `sz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sz(MemorySegment segment, long index, @CType("float") float value) { VH_sz.set(segment, 0L, index, value); }
    /// Sets `sz` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sz(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_sz(segment, 0L, value); }
    /// Sets `sz` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV szAt(long index, @CType("float") float value) { VkSRTDataNV.set_sz(this.segment(), index, value); return this; }
    /// Sets `sz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sz(@CType("float") float value) { VkSRTDataNV.set_sz(this.segment(), value); return this; }

    /// {@return `pvz` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_pvz(MemorySegment segment, long index) { return (float) VH_pvz.get(segment, 0L, index); }
    /// {@return `pvz`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_pvz(MemorySegment segment) { return VkSRTDataNV.get_pvz(segment, 0L); }
    /// {@return `pvz` at the given index}
    /// @param index the index
    public @CType("float") float pvzAt(long index) { return VkSRTDataNV.get_pvz(this.segment(), index); }
    /// {@return `pvz`}
    public @CType("float") float pvz() { return VkSRTDataNV.get_pvz(this.segment()); }
    /// Sets `pvz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pvz(MemorySegment segment, long index, @CType("float") float value) { VH_pvz.set(segment, 0L, index, value); }
    /// Sets `pvz` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pvz(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_pvz(segment, 0L, value); }
    /// Sets `pvz` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvzAt(long index, @CType("float") float value) { VkSRTDataNV.set_pvz(this.segment(), index, value); return this; }
    /// Sets `pvz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvz(@CType("float") float value) { VkSRTDataNV.set_pvz(this.segment(), value); return this; }

    /// {@return `qx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_qx(MemorySegment segment, long index) { return (float) VH_qx.get(segment, 0L, index); }
    /// {@return `qx`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_qx(MemorySegment segment) { return VkSRTDataNV.get_qx(segment, 0L); }
    /// {@return `qx` at the given index}
    /// @param index the index
    public @CType("float") float qxAt(long index) { return VkSRTDataNV.get_qx(this.segment(), index); }
    /// {@return `qx`}
    public @CType("float") float qx() { return VkSRTDataNV.get_qx(this.segment()); }
    /// Sets `qx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qx(MemorySegment segment, long index, @CType("float") float value) { VH_qx.set(segment, 0L, index, value); }
    /// Sets `qx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qx(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_qx(segment, 0L, value); }
    /// Sets `qx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qxAt(long index, @CType("float") float value) { VkSRTDataNV.set_qx(this.segment(), index, value); return this; }
    /// Sets `qx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qx(@CType("float") float value) { VkSRTDataNV.set_qx(this.segment(), value); return this; }

    /// {@return `qy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_qy(MemorySegment segment, long index) { return (float) VH_qy.get(segment, 0L, index); }
    /// {@return `qy`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_qy(MemorySegment segment) { return VkSRTDataNV.get_qy(segment, 0L); }
    /// {@return `qy` at the given index}
    /// @param index the index
    public @CType("float") float qyAt(long index) { return VkSRTDataNV.get_qy(this.segment(), index); }
    /// {@return `qy`}
    public @CType("float") float qy() { return VkSRTDataNV.get_qy(this.segment()); }
    /// Sets `qy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qy(MemorySegment segment, long index, @CType("float") float value) { VH_qy.set(segment, 0L, index, value); }
    /// Sets `qy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qy(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_qy(segment, 0L, value); }
    /// Sets `qy` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qyAt(long index, @CType("float") float value) { VkSRTDataNV.set_qy(this.segment(), index, value); return this; }
    /// Sets `qy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qy(@CType("float") float value) { VkSRTDataNV.set_qy(this.segment(), value); return this; }

    /// {@return `qz` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_qz(MemorySegment segment, long index) { return (float) VH_qz.get(segment, 0L, index); }
    /// {@return `qz`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_qz(MemorySegment segment) { return VkSRTDataNV.get_qz(segment, 0L); }
    /// {@return `qz` at the given index}
    /// @param index the index
    public @CType("float") float qzAt(long index) { return VkSRTDataNV.get_qz(this.segment(), index); }
    /// {@return `qz`}
    public @CType("float") float qz() { return VkSRTDataNV.get_qz(this.segment()); }
    /// Sets `qz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qz(MemorySegment segment, long index, @CType("float") float value) { VH_qz.set(segment, 0L, index, value); }
    /// Sets `qz` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qz(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_qz(segment, 0L, value); }
    /// Sets `qz` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qzAt(long index, @CType("float") float value) { VkSRTDataNV.set_qz(this.segment(), index, value); return this; }
    /// Sets `qz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qz(@CType("float") float value) { VkSRTDataNV.set_qz(this.segment(), value); return this; }

    /// {@return `qw` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_qw(MemorySegment segment, long index) { return (float) VH_qw.get(segment, 0L, index); }
    /// {@return `qw`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_qw(MemorySegment segment) { return VkSRTDataNV.get_qw(segment, 0L); }
    /// {@return `qw` at the given index}
    /// @param index the index
    public @CType("float") float qwAt(long index) { return VkSRTDataNV.get_qw(this.segment(), index); }
    /// {@return `qw`}
    public @CType("float") float qw() { return VkSRTDataNV.get_qw(this.segment()); }
    /// Sets `qw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qw(MemorySegment segment, long index, @CType("float") float value) { VH_qw.set(segment, 0L, index, value); }
    /// Sets `qw` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qw(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_qw(segment, 0L, value); }
    /// Sets `qw` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qwAt(long index, @CType("float") float value) { VkSRTDataNV.set_qw(this.segment(), index, value); return this; }
    /// Sets `qw` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qw(@CType("float") float value) { VkSRTDataNV.set_qw(this.segment(), value); return this; }

    /// {@return `tx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_tx(MemorySegment segment, long index) { return (float) VH_tx.get(segment, 0L, index); }
    /// {@return `tx`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_tx(MemorySegment segment) { return VkSRTDataNV.get_tx(segment, 0L); }
    /// {@return `tx` at the given index}
    /// @param index the index
    public @CType("float") float txAt(long index) { return VkSRTDataNV.get_tx(this.segment(), index); }
    /// {@return `tx`}
    public @CType("float") float tx() { return VkSRTDataNV.get_tx(this.segment()); }
    /// Sets `tx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tx(MemorySegment segment, long index, @CType("float") float value) { VH_tx.set(segment, 0L, index, value); }
    /// Sets `tx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tx(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_tx(segment, 0L, value); }
    /// Sets `tx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV txAt(long index, @CType("float") float value) { VkSRTDataNV.set_tx(this.segment(), index, value); return this; }
    /// Sets `tx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tx(@CType("float") float value) { VkSRTDataNV.set_tx(this.segment(), value); return this; }

    /// {@return `ty` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_ty(MemorySegment segment, long index) { return (float) VH_ty.get(segment, 0L, index); }
    /// {@return `ty`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_ty(MemorySegment segment) { return VkSRTDataNV.get_ty(segment, 0L); }
    /// {@return `ty` at the given index}
    /// @param index the index
    public @CType("float") float tyAt(long index) { return VkSRTDataNV.get_ty(this.segment(), index); }
    /// {@return `ty`}
    public @CType("float") float ty() { return VkSRTDataNV.get_ty(this.segment()); }
    /// Sets `ty` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ty(MemorySegment segment, long index, @CType("float") float value) { VH_ty.set(segment, 0L, index, value); }
    /// Sets `ty` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ty(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_ty(segment, 0L, value); }
    /// Sets `ty` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tyAt(long index, @CType("float") float value) { VkSRTDataNV.set_ty(this.segment(), index, value); return this; }
    /// Sets `ty` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV ty(@CType("float") float value) { VkSRTDataNV.set_ty(this.segment(), value); return this; }

    /// {@return `tz` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_tz(MemorySegment segment, long index) { return (float) VH_tz.get(segment, 0L, index); }
    /// {@return `tz`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_tz(MemorySegment segment) { return VkSRTDataNV.get_tz(segment, 0L); }
    /// {@return `tz` at the given index}
    /// @param index the index
    public @CType("float") float tzAt(long index) { return VkSRTDataNV.get_tz(this.segment(), index); }
    /// {@return `tz`}
    public @CType("float") float tz() { return VkSRTDataNV.get_tz(this.segment()); }
    /// Sets `tz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tz(MemorySegment segment, long index, @CType("float") float value) { VH_tz.set(segment, 0L, index, value); }
    /// Sets `tz` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tz(MemorySegment segment, @CType("float") float value) { VkSRTDataNV.set_tz(segment, 0L, value); }
    /// Sets `tz` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tzAt(long index, @CType("float") float value) { VkSRTDataNV.set_tz(this.segment(), index, value); return this; }
    /// Sets `tz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tz(@CType("float") float value) { VkSRTDataNV.set_tz(this.segment(), value); return this; }

}
