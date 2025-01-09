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
/// ### advancedBlendOp
/// [VarHandle][#VH_advancedBlendOp] - [Getter][#advancedBlendOp()] - [Setter][#advancedBlendOp(int)]
/// ### srcPremultiplied
/// [VarHandle][#VH_srcPremultiplied] - [Getter][#srcPremultiplied()] - [Setter][#srcPremultiplied(int)]
/// ### dstPremultiplied
/// [VarHandle][#VH_dstPremultiplied] - [Getter][#dstPremultiplied()] - [Setter][#dstPremultiplied(int)]
/// ### blendOverlap
/// [VarHandle][#VH_blendOverlap] - [Getter][#blendOverlap()] - [Setter][#blendOverlap(int)]
/// ### clampResults
/// [VarHandle][#VH_clampResults] - [Getter][#clampResults()] - [Setter][#clampResults(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkColorBlendAdvancedEXT {
///     VkBlendOp advancedBlendOp;
///     VkBool32 srcPremultiplied;
///     VkBool32 dstPremultiplied;
///     VkBlendOverlapEXT blendOverlap;
///     VkBool32 clampResults;
/// } VkColorBlendAdvancedEXT;
/// ```
public final class VkColorBlendAdvancedEXT extends Struct {
    /// The struct layout of `VkColorBlendAdvancedEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("advancedBlendOp"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap"),
        ValueLayout.JAVA_INT.withName("clampResults")
    );
    /// The [VarHandle] of `advancedBlendOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendOp"));
    /// The [VarHandle] of `srcPremultiplied` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPremultiplied"));
    /// The [VarHandle] of `dstPremultiplied` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPremultiplied"));
    /// The [VarHandle] of `blendOverlap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blendOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendOverlap"));
    /// The [VarHandle] of `clampResults` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_clampResults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clampResults"));

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    /// @param segment the memory segment
    public VkColorBlendAdvancedEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendAdvancedEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment); }

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendAdvancedEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendAdvancedEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkColorBlendAdvancedEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkColorBlendAdvancedEXT`
    public static VkColorBlendAdvancedEXT alloc(SegmentAllocator allocator) { return new VkColorBlendAdvancedEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkColorBlendAdvancedEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkColorBlendAdvancedEXT`
    public static VkColorBlendAdvancedEXT alloc(SegmentAllocator allocator, long count) { return new VkColorBlendAdvancedEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkColorBlendAdvancedEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkColorBlendAdvancedEXT`
    public VkColorBlendAdvancedEXT asSlice(long index) { return new VkColorBlendAdvancedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkColorBlendAdvancedEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkColorBlendAdvancedEXT`
    public VkColorBlendAdvancedEXT asSlice(long index, long count) { return new VkColorBlendAdvancedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `advancedBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOp") int get_advancedBlendOp(MemorySegment segment, long index) { return (int) VH_advancedBlendOp.get(segment, 0L, index); }
    /// {@return `advancedBlendOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOp") int get_advancedBlendOp(MemorySegment segment) { return VkColorBlendAdvancedEXT.get_advancedBlendOp(segment, 0L); }
    /// {@return `advancedBlendOp` at the given index}
    /// @param index the index
    public @CType("VkBlendOp") int advancedBlendOpAt(long index) { return VkColorBlendAdvancedEXT.get_advancedBlendOp(this.segment(), index); }
    /// {@return `advancedBlendOp`}
    public @CType("VkBlendOp") int advancedBlendOp() { return VkColorBlendAdvancedEXT.get_advancedBlendOp(this.segment()); }
    /// Sets `advancedBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendOp(MemorySegment segment, long index, @CType("VkBlendOp") int value) { VH_advancedBlendOp.set(segment, 0L, index, value); }
    /// Sets `advancedBlendOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendOp(MemorySegment segment, @CType("VkBlendOp") int value) { VkColorBlendAdvancedEXT.set_advancedBlendOp(segment, 0L, value); }
    /// Sets `advancedBlendOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT advancedBlendOpAt(long index, @CType("VkBlendOp") int value) { VkColorBlendAdvancedEXT.set_advancedBlendOp(this.segment(), index, value); return this; }
    /// Sets `advancedBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT advancedBlendOp(@CType("VkBlendOp") int value) { VkColorBlendAdvancedEXT.set_advancedBlendOp(this.segment(), value); return this; }

    /// {@return `srcPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_srcPremultiplied(MemorySegment segment, long index) { return (int) VH_srcPremultiplied.get(segment, 0L, index); }
    /// {@return `srcPremultiplied`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_srcPremultiplied(MemorySegment segment) { return VkColorBlendAdvancedEXT.get_srcPremultiplied(segment, 0L); }
    /// {@return `srcPremultiplied` at the given index}
    /// @param index the index
    public @CType("VkBool32") int srcPremultipliedAt(long index) { return VkColorBlendAdvancedEXT.get_srcPremultiplied(this.segment(), index); }
    /// {@return `srcPremultiplied`}
    public @CType("VkBool32") int srcPremultiplied() { return VkColorBlendAdvancedEXT.get_srcPremultiplied(this.segment()); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcPremultiplied(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_srcPremultiplied.set(segment, 0L, index, value); }
    /// Sets `srcPremultiplied` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcPremultiplied(MemorySegment segment, @CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_srcPremultiplied(segment, 0L, value); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT srcPremultipliedAt(long index, @CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_srcPremultiplied(this.segment(), index, value); return this; }
    /// Sets `srcPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT srcPremultiplied(@CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_srcPremultiplied(this.segment(), value); return this; }

    /// {@return `dstPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dstPremultiplied(MemorySegment segment, long index) { return (int) VH_dstPremultiplied.get(segment, 0L, index); }
    /// {@return `dstPremultiplied`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dstPremultiplied(MemorySegment segment) { return VkColorBlendAdvancedEXT.get_dstPremultiplied(segment, 0L); }
    /// {@return `dstPremultiplied` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dstPremultipliedAt(long index) { return VkColorBlendAdvancedEXT.get_dstPremultiplied(this.segment(), index); }
    /// {@return `dstPremultiplied`}
    public @CType("VkBool32") int dstPremultiplied() { return VkColorBlendAdvancedEXT.get_dstPremultiplied(this.segment()); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstPremultiplied(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dstPremultiplied.set(segment, 0L, index, value); }
    /// Sets `dstPremultiplied` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstPremultiplied(MemorySegment segment, @CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_dstPremultiplied(segment, 0L, value); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT dstPremultipliedAt(long index, @CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_dstPremultiplied(this.segment(), index, value); return this; }
    /// Sets `dstPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT dstPremultiplied(@CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_dstPremultiplied(this.segment(), value); return this; }

    /// {@return `blendOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOverlapEXT") int get_blendOverlap(MemorySegment segment, long index) { return (int) VH_blendOverlap.get(segment, 0L, index); }
    /// {@return `blendOverlap`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOverlapEXT") int get_blendOverlap(MemorySegment segment) { return VkColorBlendAdvancedEXT.get_blendOverlap(segment, 0L); }
    /// {@return `blendOverlap` at the given index}
    /// @param index the index
    public @CType("VkBlendOverlapEXT") int blendOverlapAt(long index) { return VkColorBlendAdvancedEXT.get_blendOverlap(this.segment(), index); }
    /// {@return `blendOverlap`}
    public @CType("VkBlendOverlapEXT") int blendOverlap() { return VkColorBlendAdvancedEXT.get_blendOverlap(this.segment()); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blendOverlap(MemorySegment segment, long index, @CType("VkBlendOverlapEXT") int value) { VH_blendOverlap.set(segment, 0L, index, value); }
    /// Sets `blendOverlap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blendOverlap(MemorySegment segment, @CType("VkBlendOverlapEXT") int value) { VkColorBlendAdvancedEXT.set_blendOverlap(segment, 0L, value); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT blendOverlapAt(long index, @CType("VkBlendOverlapEXT") int value) { VkColorBlendAdvancedEXT.set_blendOverlap(this.segment(), index, value); return this; }
    /// Sets `blendOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT blendOverlap(@CType("VkBlendOverlapEXT") int value) { VkColorBlendAdvancedEXT.set_blendOverlap(this.segment(), value); return this; }

    /// {@return `clampResults` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_clampResults(MemorySegment segment, long index) { return (int) VH_clampResults.get(segment, 0L, index); }
    /// {@return `clampResults`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_clampResults(MemorySegment segment) { return VkColorBlendAdvancedEXT.get_clampResults(segment, 0L); }
    /// {@return `clampResults` at the given index}
    /// @param index the index
    public @CType("VkBool32") int clampResultsAt(long index) { return VkColorBlendAdvancedEXT.get_clampResults(this.segment(), index); }
    /// {@return `clampResults`}
    public @CType("VkBool32") int clampResults() { return VkColorBlendAdvancedEXT.get_clampResults(this.segment()); }
    /// Sets `clampResults` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clampResults(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_clampResults.set(segment, 0L, index, value); }
    /// Sets `clampResults` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clampResults(MemorySegment segment, @CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_clampResults(segment, 0L, value); }
    /// Sets `clampResults` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT clampResultsAt(long index, @CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_clampResults(this.segment(), index, value); return this; }
    /// Sets `clampResults` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT clampResults(@CType("VkBool32") int value) { VkColorBlendAdvancedEXT.set_clampResults(this.segment(), value); return this; }

}
