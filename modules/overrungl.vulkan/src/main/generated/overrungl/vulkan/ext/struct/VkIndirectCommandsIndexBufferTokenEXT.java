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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkIndirectCommandsIndexBufferTokenEXT {
///     (int) VkIndirectCommandsInputModeFlagBitsEXT mode;
/// };
/// ```
public final class VkIndirectCommandsIndexBufferTokenEXT extends GroupType {
    /// The struct layout of `VkIndirectCommandsIndexBufferTokenEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsIndexBufferTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param mode `mode`
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static VkIndirectCommandsIndexBufferTokenEXT allocInit(SegmentAllocator allocator, int mode) {
        return alloc(allocator).mode(mode);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT copyFrom(VkIndirectCommandsIndexBufferTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsIndexBufferTokenEXT reinterpret(long count) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsIndexBufferTokenEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsIndexBufferTokenEXT`
    public VkIndirectCommandsIndexBufferTokenEXT asSlice(long index) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsIndexBufferTokenEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsIndexBufferTokenEXT`
    public VkIndirectCommandsIndexBufferTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsIndexBufferTokenEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT at(long index, Consumer<VkIndirectCommandsIndexBufferTokenEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `mode` at the given index}
    /// @param index the index of the struct buffer
    public int modeAt(long index) { return mode(this.segment(), index); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

}
