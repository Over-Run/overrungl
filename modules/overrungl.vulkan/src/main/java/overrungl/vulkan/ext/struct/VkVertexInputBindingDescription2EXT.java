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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### binding
/// [VarHandle][#VH_binding] - [Getter][#binding()] - [Setter][#binding(int)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(int)]
/// ### inputRate
/// [VarHandle][#VH_inputRate] - [Getter][#inputRate()] - [Setter][#inputRate(int)]
/// ### divisor
/// [VarHandle][#VH_divisor] - [Getter][#divisor()] - [Setter][#divisor(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVertexInputBindingDescription2EXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t binding;
///     uint32_t stride;
///     VkVertexInputRate inputRate;
///     uint32_t divisor;
/// } VkVertexInputBindingDescription2EXT;
/// ```
public sealed class VkVertexInputBindingDescription2EXT extends Struct {
    /// The struct layout of `VkVertexInputBindingDescription2EXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The [VarHandle] of `inputRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inputRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputRate"));
    /// The [VarHandle] of `divisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_divisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor"));

    /// Creates `VkVertexInputBindingDescription2EXT` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputBindingDescription2EXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputBindingDescription2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription2EXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDescription2EXT(segment); }

    /// Creates `VkVertexInputBindingDescription2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputBindingDescription2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription2EXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputBindingDescription2EXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVertexInputBindingDescription2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVertexInputBindingDescription2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDescription2EXT`
    public static VkVertexInputBindingDescription2EXT alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDescription2EXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputBindingDescription2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDescription2EXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVertexInputBindingDescription2EXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDescription2EXT`
    public static VkVertexInputBindingDescription2EXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int binding, @CType("uint32_t") int stride, @CType("VkVertexInputRate") int inputRate, @CType("uint32_t") int divisor) { return alloc(allocator).sType(sType).pNext(pNext).binding(binding).stride(stride).inputRate(inputRate).divisor(divisor); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputBindingDescription2EXT copyFrom(VkVertexInputBindingDescription2EXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVertexInputBindingDescription2EXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVertexInputBindingDescription2EXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVertexInputBindingDescription2EXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription2EXT sType(@CType("VkStructureType") int value) { VkVertexInputBindingDescription2EXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVertexInputBindingDescription2EXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVertexInputBindingDescription2EXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVertexInputBindingDescription2EXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription2EXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVertexInputBindingDescription2EXT.set_pNext(this.segment(), value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkVertexInputBindingDescription2EXT.get_binding(segment, 0L); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkVertexInputBindingDescription2EXT.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription2EXT binding(@CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_binding(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stride(MemorySegment segment) { return VkVertexInputBindingDescription2EXT.get_stride(segment, 0L); }
    /// {@return `stride`}
    public @CType("uint32_t") int stride() { return VkVertexInputBindingDescription2EXT.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription2EXT stride(@CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_stride(this.segment(), value); return this; }

    /// {@return `inputRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVertexInputRate") int get_inputRate(MemorySegment segment, long index) { return (int) VH_inputRate.get(segment, 0L, index); }
    /// {@return `inputRate`}
    /// @param segment the segment of the struct
    public static @CType("VkVertexInputRate") int get_inputRate(MemorySegment segment) { return VkVertexInputBindingDescription2EXT.get_inputRate(segment, 0L); }
    /// {@return `inputRate`}
    public @CType("VkVertexInputRate") int inputRate() { return VkVertexInputBindingDescription2EXT.get_inputRate(this.segment()); }
    /// Sets `inputRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputRate(MemorySegment segment, long index, @CType("VkVertexInputRate") int value) { VH_inputRate.set(segment, 0L, index, value); }
    /// Sets `inputRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputRate(MemorySegment segment, @CType("VkVertexInputRate") int value) { VkVertexInputBindingDescription2EXT.set_inputRate(segment, 0L, value); }
    /// Sets `inputRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription2EXT inputRate(@CType("VkVertexInputRate") int value) { VkVertexInputBindingDescription2EXT.set_inputRate(this.segment(), value); return this; }

    /// {@return `divisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_divisor(MemorySegment segment, long index) { return (int) VH_divisor.get(segment, 0L, index); }
    /// {@return `divisor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_divisor(MemorySegment segment) { return VkVertexInputBindingDescription2EXT.get_divisor(segment, 0L); }
    /// {@return `divisor`}
    public @CType("uint32_t") int divisor() { return VkVertexInputBindingDescription2EXT.get_divisor(this.segment()); }
    /// Sets `divisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_divisor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_divisor.set(segment, 0L, index, value); }
    /// Sets `divisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_divisor(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_divisor(segment, 0L, value); }
    /// Sets `divisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription2EXT divisor(@CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_divisor(this.segment(), value); return this; }

    /// A buffer of [VkVertexInputBindingDescription2EXT].
    public static final class Buffer extends VkVertexInputBindingDescription2EXT {
        private final long elementCount;

        /// Creates `VkVertexInputBindingDescription2EXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVertexInputBindingDescription2EXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVertexInputBindingDescription2EXT`
        public VkVertexInputBindingDescription2EXT asSlice(long index) { return new VkVertexInputBindingDescription2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVertexInputBindingDescription2EXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVertexInputBindingDescription2EXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVertexInputBindingDescription2EXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVertexInputBindingDescription2EXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVertexInputBindingDescription2EXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVertexInputBindingDescription2EXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `binding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bindingAt(long index) { return VkVertexInputBindingDescription2EXT.get_binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_binding(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int strideAt(long index) { return VkVertexInputBindingDescription2EXT.get_stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_stride(this.segment(), index, value); return this; }

        /// {@return `inputRate` at the given index}
        /// @param index the index
        public @CType("VkVertexInputRate") int inputRateAt(long index) { return VkVertexInputBindingDescription2EXT.get_inputRate(this.segment(), index); }
        /// Sets `inputRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer inputRateAt(long index, @CType("VkVertexInputRate") int value) { VkVertexInputBindingDescription2EXT.set_inputRate(this.segment(), index, value); return this; }

        /// {@return `divisor` at the given index}
        /// @param index the index
        public @CType("uint32_t") int divisorAt(long index) { return VkVertexInputBindingDescription2EXT.get_divisor(this.segment(), index); }
        /// Sets `divisor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer divisorAt(long index, @CType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.set_divisor(this.segment(), index, value); return this; }

    }
}
