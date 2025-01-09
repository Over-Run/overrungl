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
/// ### binding
/// [VarHandle][#VH_binding] - [Getter][#binding()] - [Setter][#binding(int)]
/// ### divisor
/// [VarHandle][#VH_divisor] - [Getter][#divisor()] - [Setter][#divisor(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVertexInputBindingDivisorDescription {
///     uint32_t binding;
///     uint32_t divisor;
/// } VkVertexInputBindingDivisorDescription;
/// ```
public final class VkVertexInputBindingDivisorDescription extends Struct {
    /// The struct layout of `VkVertexInputBindingDivisorDescription`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The [VarHandle] of `divisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_divisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor"));

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputBindingDivisorDescription(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescription of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescription(segment); }

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescription ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVertexInputBindingDivisorDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescription ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVertexInputBindingDivisorDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDivisorDescription`
    public static VkVertexInputBindingDivisorDescription alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDivisorDescription(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputBindingDivisorDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDivisorDescription`
    public static VkVertexInputBindingDivisorDescription alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDivisorDescription(allocator.allocate(LAYOUT, count)); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkVertexInputBindingDivisorDescription.get_binding(segment, 0L); }
    /// {@return `binding` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindingAt(long index) { return VkVertexInputBindingDivisorDescription.get_binding(this.segment(), index); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkVertexInputBindingDivisorDescription.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDivisorDescription.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescription bindingAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDivisorDescription.set_binding(this.segment(), index, value); return this; }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescription binding(@CType("uint32_t") int value) { VkVertexInputBindingDivisorDescription.set_binding(this.segment(), value); return this; }

    /// {@return `divisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_divisor(MemorySegment segment, long index) { return (int) VH_divisor.get(segment, 0L, index); }
    /// {@return `divisor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_divisor(MemorySegment segment) { return VkVertexInputBindingDivisorDescription.get_divisor(segment, 0L); }
    /// {@return `divisor` at the given index}
    /// @param index the index
    public @CType("uint32_t") int divisorAt(long index) { return VkVertexInputBindingDivisorDescription.get_divisor(this.segment(), index); }
    /// {@return `divisor`}
    public @CType("uint32_t") int divisor() { return VkVertexInputBindingDivisorDescription.get_divisor(this.segment()); }
    /// Sets `divisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_divisor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_divisor.set(segment, 0L, index, value); }
    /// Sets `divisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_divisor(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDivisorDescription.set_divisor(segment, 0L, value); }
    /// Sets `divisor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescription divisorAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDivisorDescription.set_divisor(this.segment(), index, value); return this; }
    /// Sets `divisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescription divisor(@CType("uint32_t") int value) { VkVertexInputBindingDivisorDescription.set_divisor(this.segment(), value); return this; }

}
