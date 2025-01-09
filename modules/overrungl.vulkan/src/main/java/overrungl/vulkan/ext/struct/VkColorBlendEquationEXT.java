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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### srcColorBlendFactor
/// [VarHandle][#VH_srcColorBlendFactor] - [Getter][#srcColorBlendFactor()] - [Setter][#srcColorBlendFactor(int)]
/// ### dstColorBlendFactor
/// [VarHandle][#VH_dstColorBlendFactor] - [Getter][#dstColorBlendFactor()] - [Setter][#dstColorBlendFactor(int)]
/// ### colorBlendOp
/// [VarHandle][#VH_colorBlendOp] - [Getter][#colorBlendOp()] - [Setter][#colorBlendOp(int)]
/// ### srcAlphaBlendFactor
/// [VarHandle][#VH_srcAlphaBlendFactor] - [Getter][#srcAlphaBlendFactor()] - [Setter][#srcAlphaBlendFactor(int)]
/// ### dstAlphaBlendFactor
/// [VarHandle][#VH_dstAlphaBlendFactor] - [Getter][#dstAlphaBlendFactor()] - [Setter][#dstAlphaBlendFactor(int)]
/// ### alphaBlendOp
/// [VarHandle][#VH_alphaBlendOp] - [Getter][#alphaBlendOp()] - [Setter][#alphaBlendOp(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkColorBlendEquationEXT {
///     VkBlendFactor srcColorBlendFactor;
///     VkBlendFactor dstColorBlendFactor;
///     VkBlendOp colorBlendOp;
///     VkBlendFactor srcAlphaBlendFactor;
///     VkBlendFactor dstAlphaBlendFactor;
///     VkBlendOp alphaBlendOp;
/// } VkColorBlendEquationEXT;
/// ```
public final class VkColorBlendEquationEXT extends Struct {
    /// The struct layout of `VkColorBlendEquationEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp")
    );
    /// The [VarHandle] of `srcColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcColorBlendFactor"));
    /// The [VarHandle] of `dstColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstColorBlendFactor"));
    /// The [VarHandle] of `colorBlendOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorBlendOp"));
    /// The [VarHandle] of `srcAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The [VarHandle] of `dstAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The [VarHandle] of `alphaBlendOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alphaBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaBlendOp"));

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    /// @param segment the memory segment
    public VkColorBlendEquationEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendEquationEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkColorBlendEquationEXT(segment); }

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendEquationEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkColorBlendEquationEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkColorBlendEquationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendEquationEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkColorBlendEquationEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkColorBlendEquationEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkColorBlendEquationEXT`
    public static VkColorBlendEquationEXT alloc(SegmentAllocator allocator) { return new VkColorBlendEquationEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkColorBlendEquationEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkColorBlendEquationEXT`
    public static VkColorBlendEquationEXT alloc(SegmentAllocator allocator, long count) { return new VkColorBlendEquationEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `srcColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_srcColorBlendFactor(MemorySegment segment, long index) { return (int) VH_srcColorBlendFactor.get(segment, 0L, index); }
    /// {@return `srcColorBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_srcColorBlendFactor(MemorySegment segment) { return VkColorBlendEquationEXT.get_srcColorBlendFactor(segment, 0L); }
    /// {@return `srcColorBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int srcColorBlendFactorAt(long index) { return VkColorBlendEquationEXT.get_srcColorBlendFactor(this.segment(), index); }
    /// {@return `srcColorBlendFactor`}
    public @CType("VkBlendFactor") int srcColorBlendFactor() { return VkColorBlendEquationEXT.get_srcColorBlendFactor(this.segment()); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcColorBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_srcColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcColorBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcColorBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_srcColorBlendFactor(segment, 0L, value); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT srcColorBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_srcColorBlendFactor(this.segment(), index, value); return this; }
    /// Sets `srcColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT srcColorBlendFactor(@CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_srcColorBlendFactor(this.segment(), value); return this; }

    /// {@return `dstColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_dstColorBlendFactor(MemorySegment segment, long index) { return (int) VH_dstColorBlendFactor.get(segment, 0L, index); }
    /// {@return `dstColorBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_dstColorBlendFactor(MemorySegment segment) { return VkColorBlendEquationEXT.get_dstColorBlendFactor(segment, 0L); }
    /// {@return `dstColorBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int dstColorBlendFactorAt(long index) { return VkColorBlendEquationEXT.get_dstColorBlendFactor(this.segment(), index); }
    /// {@return `dstColorBlendFactor`}
    public @CType("VkBlendFactor") int dstColorBlendFactor() { return VkColorBlendEquationEXT.get_dstColorBlendFactor(this.segment()); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstColorBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_dstColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstColorBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstColorBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_dstColorBlendFactor(segment, 0L, value); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT dstColorBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_dstColorBlendFactor(this.segment(), index, value); return this; }
    /// Sets `dstColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT dstColorBlendFactor(@CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_dstColorBlendFactor(this.segment(), value); return this; }

    /// {@return `colorBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOp") int get_colorBlendOp(MemorySegment segment, long index) { return (int) VH_colorBlendOp.get(segment, 0L, index); }
    /// {@return `colorBlendOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOp") int get_colorBlendOp(MemorySegment segment) { return VkColorBlendEquationEXT.get_colorBlendOp(segment, 0L); }
    /// {@return `colorBlendOp` at the given index}
    /// @param index the index
    public @CType("VkBlendOp") int colorBlendOpAt(long index) { return VkColorBlendEquationEXT.get_colorBlendOp(this.segment(), index); }
    /// {@return `colorBlendOp`}
    public @CType("VkBlendOp") int colorBlendOp() { return VkColorBlendEquationEXT.get_colorBlendOp(this.segment()); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorBlendOp(MemorySegment segment, long index, @CType("VkBlendOp") int value) { VH_colorBlendOp.set(segment, 0L, index, value); }
    /// Sets `colorBlendOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorBlendOp(MemorySegment segment, @CType("VkBlendOp") int value) { VkColorBlendEquationEXT.set_colorBlendOp(segment, 0L, value); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT colorBlendOpAt(long index, @CType("VkBlendOp") int value) { VkColorBlendEquationEXT.set_colorBlendOp(this.segment(), index, value); return this; }
    /// Sets `colorBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT colorBlendOp(@CType("VkBlendOp") int value) { VkColorBlendEquationEXT.set_colorBlendOp(this.segment(), value); return this; }

    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_srcAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_srcAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `srcAlphaBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_srcAlphaBlendFactor(MemorySegment segment) { return VkColorBlendEquationEXT.get_srcAlphaBlendFactor(segment, 0L); }
    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int srcAlphaBlendFactorAt(long index) { return VkColorBlendEquationEXT.get_srcAlphaBlendFactor(this.segment(), index); }
    /// {@return `srcAlphaBlendFactor`}
    public @CType("VkBlendFactor") int srcAlphaBlendFactor() { return VkColorBlendEquationEXT.get_srcAlphaBlendFactor(this.segment()); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAlphaBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_srcAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcAlphaBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAlphaBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_srcAlphaBlendFactor(segment, 0L, value); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT srcAlphaBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_srcAlphaBlendFactor(this.segment(), index, value); return this; }
    /// Sets `srcAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT srcAlphaBlendFactor(@CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_srcAlphaBlendFactor(this.segment(), value); return this; }

    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_dstAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_dstAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `dstAlphaBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_dstAlphaBlendFactor(MemorySegment segment) { return VkColorBlendEquationEXT.get_dstAlphaBlendFactor(segment, 0L); }
    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int dstAlphaBlendFactorAt(long index) { return VkColorBlendEquationEXT.get_dstAlphaBlendFactor(this.segment(), index); }
    /// {@return `dstAlphaBlendFactor`}
    public @CType("VkBlendFactor") int dstAlphaBlendFactor() { return VkColorBlendEquationEXT.get_dstAlphaBlendFactor(this.segment()); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAlphaBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_dstAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstAlphaBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAlphaBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_dstAlphaBlendFactor(segment, 0L, value); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT dstAlphaBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_dstAlphaBlendFactor(this.segment(), index, value); return this; }
    /// Sets `dstAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT dstAlphaBlendFactor(@CType("VkBlendFactor") int value) { VkColorBlendEquationEXT.set_dstAlphaBlendFactor(this.segment(), value); return this; }

    /// {@return `alphaBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOp") int get_alphaBlendOp(MemorySegment segment, long index) { return (int) VH_alphaBlendOp.get(segment, 0L, index); }
    /// {@return `alphaBlendOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOp") int get_alphaBlendOp(MemorySegment segment) { return VkColorBlendEquationEXT.get_alphaBlendOp(segment, 0L); }
    /// {@return `alphaBlendOp` at the given index}
    /// @param index the index
    public @CType("VkBlendOp") int alphaBlendOpAt(long index) { return VkColorBlendEquationEXT.get_alphaBlendOp(this.segment(), index); }
    /// {@return `alphaBlendOp`}
    public @CType("VkBlendOp") int alphaBlendOp() { return VkColorBlendEquationEXT.get_alphaBlendOp(this.segment()); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alphaBlendOp(MemorySegment segment, long index, @CType("VkBlendOp") int value) { VH_alphaBlendOp.set(segment, 0L, index, value); }
    /// Sets `alphaBlendOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alphaBlendOp(MemorySegment segment, @CType("VkBlendOp") int value) { VkColorBlendEquationEXT.set_alphaBlendOp(segment, 0L, value); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT alphaBlendOpAt(long index, @CType("VkBlendOp") int value) { VkColorBlendEquationEXT.set_alphaBlendOp(this.segment(), index, value); return this; }
    /// Sets `alphaBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendEquationEXT alphaBlendOp(@CType("VkBlendOp") int value) { VkColorBlendEquationEXT.set_alphaBlendOp(this.segment(), value); return this; }

}
