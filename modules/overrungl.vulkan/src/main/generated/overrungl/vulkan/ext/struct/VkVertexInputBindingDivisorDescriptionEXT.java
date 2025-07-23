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
/// struct VkVertexInputBindingDivisorDescriptionEXT {
///     uint32_t binding;
///     uint32_t divisor;
/// };
/// ```
public final class VkVertexInputBindingDivisorDescriptionEXT extends GroupType {
    /// The struct layout of `VkVertexInputBindingDivisorDescriptionEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `divisor`.
    public static final long OFFSET_divisor = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
    /// The memory layout of `divisor`.
    public static final MemoryLayout LAYOUT_divisor = LAYOUT.select(PathElement.groupElement("divisor"));
    /// The [VarHandle] of `divisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_divisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor"));

    /// Creates `VkVertexInputBindingDivisorDescriptionEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVertexInputBindingDivisorDescriptionEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVertexInputBindingDivisorDescriptionEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescriptionEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputBindingDivisorDescriptionEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescriptionEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVertexInputBindingDivisorDescriptionEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescriptionEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVertexInputBindingDivisorDescriptionEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDivisorDescriptionEXT`
    public static VkVertexInputBindingDivisorDescriptionEXT alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDivisorDescriptionEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVertexInputBindingDivisorDescriptionEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDivisorDescriptionEXT`
    public static VkVertexInputBindingDivisorDescriptionEXT alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDivisorDescriptionEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVertexInputBindingDivisorDescriptionEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param binding `binding`
    /// @param divisor `divisor`
    /// @return the allocated `VkVertexInputBindingDivisorDescriptionEXT`
    public static VkVertexInputBindingDivisorDescriptionEXT allocInit(SegmentAllocator allocator, int binding, int divisor) {
        return alloc(allocator).binding(binding).divisor(divisor);
    }

    /// Allocates a `VkVertexInputBindingDivisorDescriptionEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param binding `binding`
    /// @return the allocated `VkVertexInputBindingDivisorDescriptionEXT`
    public static VkVertexInputBindingDivisorDescriptionEXT allocInit(SegmentAllocator allocator, int binding) {
        return alloc(allocator).binding(binding);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionEXT copyFrom(VkVertexInputBindingDivisorDescriptionEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVertexInputBindingDivisorDescriptionEXT reinterpret(long count) { return new VkVertexInputBindingDivisorDescriptionEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionEXT binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `divisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int divisor(MemorySegment segment, long index) { return (int) VH_divisor.get(segment, 0L, index); }
    /// {@return `divisor`}
    public int divisor() { return divisor(this.segment(), 0L); }
    /// Sets `divisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void divisor(MemorySegment segment, long index, int value) { VH_divisor.set(segment, 0L, index, value); }
    /// Sets `divisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionEXT divisor(int value) { divisor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVertexInputBindingDivisorDescriptionEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVertexInputBindingDivisorDescriptionEXT`
    public VkVertexInputBindingDivisorDescriptionEXT asSlice(long index) { return new VkVertexInputBindingDivisorDescriptionEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVertexInputBindingDivisorDescriptionEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVertexInputBindingDivisorDescriptionEXT`
    public VkVertexInputBindingDivisorDescriptionEXT asSlice(long index, long count) { return new VkVertexInputBindingDivisorDescriptionEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVertexInputBindingDivisorDescriptionEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionEXT at(long index, Consumer<VkVertexInputBindingDivisorDescriptionEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `binding` at the given index}
    /// @param index the index of the struct buffer
    public int bindingAt(long index) { return binding(this.segment(), index); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionEXT bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    /// {@return `divisor` at the given index}
    /// @param index the index of the struct buffer
    public int divisorAt(long index) { return divisor(this.segment(), index); }
    /// Sets `divisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionEXT divisorAt(long index, int value) { divisor(this.segment(), index, value); return this; }

}
