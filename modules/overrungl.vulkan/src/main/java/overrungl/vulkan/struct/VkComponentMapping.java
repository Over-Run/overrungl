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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### r
/// [VarHandle][#VH_r] - [Getter][#r()] - [Setter][#r(int)]
/// ### g
/// [VarHandle][#VH_g] - [Getter][#g()] - [Setter][#g(int)]
/// ### b
/// [VarHandle][#VH_b] - [Getter][#b()] - [Setter][#b(int)]
/// ### a
/// [VarHandle][#VH_a] - [Getter][#a()] - [Setter][#a(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkComponentMapping {
///     VkComponentSwizzle r;
///     VkComponentSwizzle g;
///     VkComponentSwizzle b;
///     VkComponentSwizzle a;
/// } VkComponentMapping;
/// ```
public final class VkComponentMapping extends Struct {
    /// The struct layout of `VkComponentMapping`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("r"),
        ValueLayout.JAVA_INT.withName("g"),
        ValueLayout.JAVA_INT.withName("b"),
        ValueLayout.JAVA_INT.withName("a")
    );
    /// The [VarHandle] of `r` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("r"));
    /// The [VarHandle] of `g` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("g"));
    /// The [VarHandle] of `b` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b"));
    /// The [VarHandle] of `a` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("a"));

    /// Creates `VkComponentMapping` with the given segment.
    /// @param segment the memory segment
    public VkComponentMapping(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkComponentMapping` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComponentMapping of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkComponentMapping(segment); }

    /// Creates `VkComponentMapping` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComponentMapping ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkComponentMapping(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkComponentMapping` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComponentMapping ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkComponentMapping(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkComponentMapping` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComponentMapping`
    public static VkComponentMapping alloc(SegmentAllocator allocator) { return new VkComponentMapping(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkComponentMapping` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkComponentMapping`
    public static VkComponentMapping alloc(SegmentAllocator allocator, long count) { return new VkComponentMapping(allocator.allocate(LAYOUT, count)); }

    /// {@return `r` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentSwizzle") int get_r(MemorySegment segment, long index) { return (int) VH_r.get(segment, 0L, index); }
    /// {@return `r`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentSwizzle") int get_r(MemorySegment segment) { return VkComponentMapping.get_r(segment, 0L); }
    /// {@return `r` at the given index}
    /// @param index the index
    public @CType("VkComponentSwizzle") int rAt(long index) { return VkComponentMapping.get_r(this.segment(), index); }
    /// {@return `r`}
    public @CType("VkComponentSwizzle") int r() { return VkComponentMapping.get_r(this.segment()); }
    /// Sets `r` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_r(MemorySegment segment, long index, @CType("VkComponentSwizzle") int value) { VH_r.set(segment, 0L, index, value); }
    /// Sets `r` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_r(MemorySegment segment, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_r(segment, 0L, value); }
    /// Sets `r` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComponentMapping rAt(long index, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_r(this.segment(), index, value); return this; }
    /// Sets `r` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping r(@CType("VkComponentSwizzle") int value) { VkComponentMapping.set_r(this.segment(), value); return this; }

    /// {@return `g` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentSwizzle") int get_g(MemorySegment segment, long index) { return (int) VH_g.get(segment, 0L, index); }
    /// {@return `g`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentSwizzle") int get_g(MemorySegment segment) { return VkComponentMapping.get_g(segment, 0L); }
    /// {@return `g` at the given index}
    /// @param index the index
    public @CType("VkComponentSwizzle") int gAt(long index) { return VkComponentMapping.get_g(this.segment(), index); }
    /// {@return `g`}
    public @CType("VkComponentSwizzle") int g() { return VkComponentMapping.get_g(this.segment()); }
    /// Sets `g` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_g(MemorySegment segment, long index, @CType("VkComponentSwizzle") int value) { VH_g.set(segment, 0L, index, value); }
    /// Sets `g` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_g(MemorySegment segment, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_g(segment, 0L, value); }
    /// Sets `g` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComponentMapping gAt(long index, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_g(this.segment(), index, value); return this; }
    /// Sets `g` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping g(@CType("VkComponentSwizzle") int value) { VkComponentMapping.set_g(this.segment(), value); return this; }

    /// {@return `b` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentSwizzle") int get_b(MemorySegment segment, long index) { return (int) VH_b.get(segment, 0L, index); }
    /// {@return `b`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentSwizzle") int get_b(MemorySegment segment) { return VkComponentMapping.get_b(segment, 0L); }
    /// {@return `b` at the given index}
    /// @param index the index
    public @CType("VkComponentSwizzle") int bAt(long index) { return VkComponentMapping.get_b(this.segment(), index); }
    /// {@return `b`}
    public @CType("VkComponentSwizzle") int b() { return VkComponentMapping.get_b(this.segment()); }
    /// Sets `b` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_b(MemorySegment segment, long index, @CType("VkComponentSwizzle") int value) { VH_b.set(segment, 0L, index, value); }
    /// Sets `b` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_b(MemorySegment segment, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_b(segment, 0L, value); }
    /// Sets `b` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComponentMapping bAt(long index, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_b(this.segment(), index, value); return this; }
    /// Sets `b` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping b(@CType("VkComponentSwizzle") int value) { VkComponentMapping.set_b(this.segment(), value); return this; }

    /// {@return `a` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentSwizzle") int get_a(MemorySegment segment, long index) { return (int) VH_a.get(segment, 0L, index); }
    /// {@return `a`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentSwizzle") int get_a(MemorySegment segment) { return VkComponentMapping.get_a(segment, 0L); }
    /// {@return `a` at the given index}
    /// @param index the index
    public @CType("VkComponentSwizzle") int aAt(long index) { return VkComponentMapping.get_a(this.segment(), index); }
    /// {@return `a`}
    public @CType("VkComponentSwizzle") int a() { return VkComponentMapping.get_a(this.segment()); }
    /// Sets `a` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_a(MemorySegment segment, long index, @CType("VkComponentSwizzle") int value) { VH_a.set(segment, 0L, index, value); }
    /// Sets `a` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_a(MemorySegment segment, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_a(segment, 0L, value); }
    /// Sets `a` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComponentMapping aAt(long index, @CType("VkComponentSwizzle") int value) { VkComponentMapping.set_a(this.segment(), index, value); return this; }
    /// Sets `a` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComponentMapping a(@CType("VkComponentSwizzle") int value) { VkComponentMapping.set_a(this.segment(), value); return this; }

}
