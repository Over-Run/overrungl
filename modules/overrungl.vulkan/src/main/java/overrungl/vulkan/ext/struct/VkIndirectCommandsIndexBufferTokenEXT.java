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
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsIndexBufferTokenEXT {
///     VkIndirectCommandsInputModeFlagBitsEXT mode;
/// } VkIndirectCommandsIndexBufferTokenEXT;
/// ```
public final class VkIndirectCommandsIndexBufferTokenEXT extends Struct {
    /// The struct layout of `VkIndirectCommandsIndexBufferTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsIndexBufferTokenEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsInputModeFlagBitsEXT") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsInputModeFlagBitsEXT") int get_mode(MemorySegment segment) { return VkIndirectCommandsIndexBufferTokenEXT.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkIndirectCommandsInputModeFlagBitsEXT") int modeAt(long index) { return VkIndirectCommandsIndexBufferTokenEXT.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkIndirectCommandsInputModeFlagBitsEXT") int mode() { return VkIndirectCommandsIndexBufferTokenEXT.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkIndirectCommandsInputModeFlagBitsEXT") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkIndirectCommandsInputModeFlagBitsEXT") int value) { VkIndirectCommandsIndexBufferTokenEXT.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT modeAt(long index, @CType("VkIndirectCommandsInputModeFlagBitsEXT") int value) { VkIndirectCommandsIndexBufferTokenEXT.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT mode(@CType("VkIndirectCommandsInputModeFlagBitsEXT") int value) { VkIndirectCommandsIndexBufferTokenEXT.set_mode(this.segment(), value); return this; }

}
