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
/// ### matrix
/// [VarHandle][#VH_matrix] - [Getter][#matrix()] - [Setter][#matrix(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTransformMatrixKHR {
///     float matrix;
/// } VkTransformMatrixKHR;
/// ```
public final class VkTransformMatrixKHR extends Struct {
    /// The struct layout of `VkTransformMatrixKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("matrix")
    );
    /// The [VarHandle] of `matrix` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_matrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix"));

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    public VkTransformMatrixKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTransformMatrixKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTransformMatrixKHR(segment); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTransformMatrixKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTransformMatrixKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTransformMatrixKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTransformMatrixKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkTransformMatrixKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTransformMatrixKHR`
    public static VkTransformMatrixKHR alloc(SegmentAllocator allocator) { return new VkTransformMatrixKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTransformMatrixKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTransformMatrixKHR`
    public static VkTransformMatrixKHR alloc(SegmentAllocator allocator, long count) { return new VkTransformMatrixKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `matrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_matrix(MemorySegment segment, long index) { return (float) VH_matrix.get(segment, 0L, index); }
    /// {@return `matrix`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_matrix(MemorySegment segment) { return VkTransformMatrixKHR.get_matrix(segment, 0L); }
    /// {@return `matrix` at the given index}
    /// @param index the index
    public @CType("float") float matrixAt(long index) { return VkTransformMatrixKHR.get_matrix(this.segment(), index); }
    /// {@return `matrix`}
    public @CType("float") float matrix() { return VkTransformMatrixKHR.get_matrix(this.segment()); }
    /// Sets `matrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_matrix(MemorySegment segment, long index, @CType("float") float value) { VH_matrix.set(segment, 0L, index, value); }
    /// Sets `matrix` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_matrix(MemorySegment segment, @CType("float") float value) { VkTransformMatrixKHR.set_matrix(segment, 0L, value); }
    /// Sets `matrix` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTransformMatrixKHR matrixAt(long index, @CType("float") float value) { VkTransformMatrixKHR.set_matrix(this.segment(), index, value); return this; }
    /// Sets `matrix` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTransformMatrixKHR matrix(@CType("float") float value) { VkTransformMatrixKHR.set_matrix(this.segment(), value); return this; }

}
