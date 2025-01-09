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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### colorSpace
/// [VarHandle][#VH_colorSpace] - [Getter][#colorSpace()] - [Setter][#colorSpace(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfaceFormatKHR {
///     VkFormat format;
///     VkColorSpaceKHR colorSpace;
/// } VkSurfaceFormatKHR;
/// ```
public final class VkSurfaceFormatKHR extends Struct {
    /// The struct layout of `VkSurfaceFormatKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `colorSpace` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpace"));

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceFormatKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSurfaceFormatKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFormatKHR`
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceFormatKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFormatKHR`
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSurfaceFormatKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfaceFormatKHR`
    public VkSurfaceFormatKHR asSlice(long index) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSurfaceFormatKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfaceFormatKHR`
    public VkSurfaceFormatKHR asSlice(long index, long count) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkSurfaceFormatKHR.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkSurfaceFormatKHR.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkSurfaceFormatKHR.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkSurfaceFormatKHR.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR formatAt(long index, @CType("VkFormat") int value) { VkSurfaceFormatKHR.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR format(@CType("VkFormat") int value) { VkSurfaceFormatKHR.set_format(this.segment(), value); return this; }

    /// {@return `colorSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkColorSpaceKHR") int get_colorSpace(MemorySegment segment, long index) { return (int) VH_colorSpace.get(segment, 0L, index); }
    /// {@return `colorSpace`}
    /// @param segment the segment of the struct
    public static @CType("VkColorSpaceKHR") int get_colorSpace(MemorySegment segment) { return VkSurfaceFormatKHR.get_colorSpace(segment, 0L); }
    /// {@return `colorSpace` at the given index}
    /// @param index the index
    public @CType("VkColorSpaceKHR") int colorSpaceAt(long index) { return VkSurfaceFormatKHR.get_colorSpace(this.segment(), index); }
    /// {@return `colorSpace`}
    public @CType("VkColorSpaceKHR") int colorSpace() { return VkSurfaceFormatKHR.get_colorSpace(this.segment()); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorSpace(MemorySegment segment, long index, @CType("VkColorSpaceKHR") int value) { VH_colorSpace.set(segment, 0L, index, value); }
    /// Sets `colorSpace` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorSpace(MemorySegment segment, @CType("VkColorSpaceKHR") int value) { VkSurfaceFormatKHR.set_colorSpace(segment, 0L, value); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR colorSpaceAt(long index, @CType("VkColorSpaceKHR") int value) { VkSurfaceFormatKHR.set_colorSpace(this.segment(), index, value); return this; }
    /// Sets `colorSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR colorSpace(@CType("VkColorSpaceKHR") int value) { VkSurfaceFormatKHR.set_colorSpace(this.segment(), value); return this; }

}
