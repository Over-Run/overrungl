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
package overrungl.vulkan.arm.struct;

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
/// ### stripeArea
/// [Byte offset][#OFFSET_stripeArea] - [Memory layout][#ML_stripeArea] - [Getter][#stripeArea()] - [Setter][#stripeArea(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassStripeInfoARM {
///     VkStructureType sType;
///     const void * pNext;
///     VkRect2D stripeArea;
/// } VkRenderPassStripeInfoARM;
/// ```
public sealed class VkRenderPassStripeInfoARM extends Struct {
    /// The struct layout of `VkRenderPassStripeInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("stripeArea")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `stripeArea`.
    public static final long OFFSET_stripeArea = LAYOUT.byteOffset(PathElement.groupElement("stripeArea"));
    /// The memory layout of `stripeArea`.
    public static final MemoryLayout ML_stripeArea = LAYOUT.select(PathElement.groupElement("stripeArea"));

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassStripeInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeInfoARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeInfoARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassStripeInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeInfoARM`
    public static VkRenderPassStripeInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassStripeInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassStripeInfoARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassStripeInfoARM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeInfoARM`
    public static VkRenderPassStripeInfoARM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkRect2D") java.lang.foreign.MemorySegment stripeArea) { return alloc(allocator).sType(sType).pNext(pNext).stripeArea(stripeArea); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassStripeInfoARM copyFrom(VkRenderPassStripeInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassStripeInfoARM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassStripeInfoARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassStripeInfoARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM sType(@CType("VkStructureType") int value) { VkRenderPassStripeInfoARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassStripeInfoARM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassStripeInfoARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeInfoARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeInfoARM.set_pNext(this.segment(), value); return this; }

    /// {@return `stripeArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_stripeArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_stripeArea, index), ML_stripeArea); }
    /// {@return `stripeArea`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_stripeArea(MemorySegment segment) { return VkRenderPassStripeInfoARM.get_stripeArea(segment, 0L); }
    /// {@return `stripeArea`}
    public @CType("VkRect2D") java.lang.foreign.MemorySegment stripeArea() { return VkRenderPassStripeInfoARM.get_stripeArea(this.segment()); }
    /// Sets `stripeArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stripeArea(MemorySegment segment, long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_stripeArea, index), ML_stripeArea.byteSize()); }
    /// Sets `stripeArea` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stripeArea(MemorySegment segment, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderPassStripeInfoARM.set_stripeArea(segment, 0L, value); }
    /// Sets `stripeArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM stripeArea(@CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderPassStripeInfoARM.set_stripeArea(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassStripeInfoARM].
    public static final class Buffer extends VkRenderPassStripeInfoARM {
        private final long elementCount;

        /// Creates `VkRenderPassStripeInfoARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassStripeInfoARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassStripeInfoARM`
        public VkRenderPassStripeInfoARM asSlice(long index) { return new VkRenderPassStripeInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassStripeInfoARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassStripeInfoARM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassStripeInfoARM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassStripeInfoARM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassStripeInfoARM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeInfoARM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stripeArea` at the given index}
        /// @param index the index
        public @CType("VkRect2D") java.lang.foreign.MemorySegment stripeAreaAt(long index) { return VkRenderPassStripeInfoARM.get_stripeArea(this.segment(), index); }
        /// Sets `stripeArea` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stripeAreaAt(long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderPassStripeInfoARM.set_stripeArea(this.segment(), index, value); return this; }

    }
}
