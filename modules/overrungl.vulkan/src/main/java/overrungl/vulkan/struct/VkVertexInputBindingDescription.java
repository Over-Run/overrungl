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
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(int)]
/// ### inputRate
/// [VarHandle][#VH_inputRate] - [Getter][#inputRate()] - [Setter][#inputRate(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVertexInputBindingDescription {
///     uint32_t binding;
///     uint32_t stride;
///     VkVertexInputRate inputRate;
/// } VkVertexInputBindingDescription;
/// ```
public sealed class VkVertexInputBindingDescription extends Struct {
    /// The struct layout of `VkVertexInputBindingDescription`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The [VarHandle] of `inputRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inputRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputRate"));

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputBindingDescription(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVertexInputBindingDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDescription`
    public static VkVertexInputBindingDescription alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDescription(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputBindingDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDescription`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVertexInputBindingDescription` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDescription`
    public static VkVertexInputBindingDescription allocInit(SegmentAllocator allocator, @CType("uint32_t") int binding, @CType("uint32_t") int stride, @CType("VkVertexInputRate") int inputRate) { return alloc(allocator).binding(binding).stride(stride).inputRate(inputRate); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputBindingDescription copyFrom(VkVertexInputBindingDescription src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkVertexInputBindingDescription.get_binding(segment, 0L); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkVertexInputBindingDescription.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDescription.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription binding(@CType("uint32_t") int value) { VkVertexInputBindingDescription.set_binding(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stride(MemorySegment segment) { return VkVertexInputBindingDescription.get_stride(segment, 0L); }
    /// {@return `stride`}
    public @CType("uint32_t") int stride() { return VkVertexInputBindingDescription.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDescription.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription stride(@CType("uint32_t") int value) { VkVertexInputBindingDescription.set_stride(this.segment(), value); return this; }

    /// {@return `inputRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVertexInputRate") int get_inputRate(MemorySegment segment, long index) { return (int) VH_inputRate.get(segment, 0L, index); }
    /// {@return `inputRate`}
    /// @param segment the segment of the struct
    public static @CType("VkVertexInputRate") int get_inputRate(MemorySegment segment) { return VkVertexInputBindingDescription.get_inputRate(segment, 0L); }
    /// {@return `inputRate`}
    public @CType("VkVertexInputRate") int inputRate() { return VkVertexInputBindingDescription.get_inputRate(this.segment()); }
    /// Sets `inputRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputRate(MemorySegment segment, long index, @CType("VkVertexInputRate") int value) { VH_inputRate.set(segment, 0L, index, value); }
    /// Sets `inputRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputRate(MemorySegment segment, @CType("VkVertexInputRate") int value) { VkVertexInputBindingDescription.set_inputRate(segment, 0L, value); }
    /// Sets `inputRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription inputRate(@CType("VkVertexInputRate") int value) { VkVertexInputBindingDescription.set_inputRate(this.segment(), value); return this; }

    /// A buffer of [VkVertexInputBindingDescription].
    public static final class Buffer extends VkVertexInputBindingDescription {
        private final long elementCount;

        /// Creates `VkVertexInputBindingDescription.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVertexInputBindingDescription`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVertexInputBindingDescription`
        public VkVertexInputBindingDescription asSlice(long index) { return new VkVertexInputBindingDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVertexInputBindingDescription`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVertexInputBindingDescription`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `binding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bindingAt(long index) { return VkVertexInputBindingDescription.get_binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDescription.set_binding(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int strideAt(long index) { return VkVertexInputBindingDescription.get_stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDescription.set_stride(this.segment(), index, value); return this; }

        /// {@return `inputRate` at the given index}
        /// @param index the index
        public @CType("VkVertexInputRate") int inputRateAt(long index) { return VkVertexInputBindingDescription.get_inputRate(this.segment(), index); }
        /// Sets `inputRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer inputRateAt(long index, @CType("VkVertexInputRate") int value) { VkVertexInputBindingDescription.set_inputRate(this.segment(), index, value); return this; }

    }
}
