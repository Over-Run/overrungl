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
package overrungl.vulkan.nvx.struct;

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
/// ### perViewAttributes
/// [VarHandle][#VH_perViewAttributes] - [Getter][#perViewAttributes()] - [Setter][#perViewAttributes(int)]
/// ### perViewAttributesPositionXOnly
/// [VarHandle][#VH_perViewAttributesPositionXOnly] - [Getter][#perViewAttributesPositionXOnly()] - [Setter][#perViewAttributesPositionXOnly(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMultiviewPerViewAttributesInfoNVX {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 perViewAttributes;
///     VkBool32 perViewAttributesPositionXOnly;
/// } VkMultiviewPerViewAttributesInfoNVX;
/// ```
public sealed class VkMultiviewPerViewAttributesInfoNVX extends Struct {
    /// The struct layout of `VkMultiviewPerViewAttributesInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewAttributes"),
        ValueLayout.JAVA_INT.withName("perViewAttributesPositionXOnly")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `perViewAttributes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_perViewAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewAttributes"));
    /// The [VarHandle] of `perViewAttributesPositionXOnly` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_perViewAttributesPositionXOnly = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewAttributesPositionXOnly"));

    /// Creates `VkMultiviewPerViewAttributesInfoNVX` with the given segment.
    /// @param segment the memory segment
    public VkMultiviewPerViewAttributesInfoNVX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultiviewPerViewAttributesInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiviewPerViewAttributesInfoNVX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiviewPerViewAttributesInfoNVX(segment); }

    /// Creates `VkMultiviewPerViewAttributesInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMultiviewPerViewAttributesInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiviewPerViewAttributesInfoNVX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiviewPerViewAttributesInfoNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMultiviewPerViewAttributesInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMultiviewPerViewAttributesInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiviewPerViewAttributesInfoNVX`
    public static VkMultiviewPerViewAttributesInfoNVX alloc(SegmentAllocator allocator) { return new VkMultiviewPerViewAttributesInfoNVX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultiviewPerViewAttributesInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultiviewPerViewAttributesInfoNVX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMultiviewPerViewAttributesInfoNVX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiviewPerViewAttributesInfoNVX`
    public static VkMultiviewPerViewAttributesInfoNVX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int perViewAttributes, @CType("VkBool32") int perViewAttributesPositionXOnly) { return alloc(allocator).sType(sType).pNext(pNext).perViewAttributes(perViewAttributes).perViewAttributesPositionXOnly(perViewAttributesPositionXOnly); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMultiviewPerViewAttributesInfoNVX copyFrom(VkMultiviewPerViewAttributesInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMultiviewPerViewAttributesInfoNVX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMultiviewPerViewAttributesInfoNVX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMultiviewPerViewAttributesInfoNVX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewAttributesInfoNVX sType(@CType("VkStructureType") int value) { VkMultiviewPerViewAttributesInfoNVX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMultiviewPerViewAttributesInfoNVX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMultiviewPerViewAttributesInfoNVX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewAttributesInfoNVX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewAttributesInfoNVX pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewAttributesInfoNVX.set_pNext(this.segment(), value); return this; }

    /// {@return `perViewAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_perViewAttributes(MemorySegment segment, long index) { return (int) VH_perViewAttributes.get(segment, 0L, index); }
    /// {@return `perViewAttributes`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_perViewAttributes(MemorySegment segment) { return VkMultiviewPerViewAttributesInfoNVX.get_perViewAttributes(segment, 0L); }
    /// {@return `perViewAttributes`}
    public @CType("VkBool32") int perViewAttributes() { return VkMultiviewPerViewAttributesInfoNVX.get_perViewAttributes(this.segment()); }
    /// Sets `perViewAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_perViewAttributes(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_perViewAttributes.set(segment, 0L, index, value); }
    /// Sets `perViewAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_perViewAttributes(MemorySegment segment, @CType("VkBool32") int value) { VkMultiviewPerViewAttributesInfoNVX.set_perViewAttributes(segment, 0L, value); }
    /// Sets `perViewAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributes(@CType("VkBool32") int value) { VkMultiviewPerViewAttributesInfoNVX.set_perViewAttributes(this.segment(), value); return this; }

    /// {@return `perViewAttributesPositionXOnly` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_perViewAttributesPositionXOnly(MemorySegment segment, long index) { return (int) VH_perViewAttributesPositionXOnly.get(segment, 0L, index); }
    /// {@return `perViewAttributesPositionXOnly`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_perViewAttributesPositionXOnly(MemorySegment segment) { return VkMultiviewPerViewAttributesInfoNVX.get_perViewAttributesPositionXOnly(segment, 0L); }
    /// {@return `perViewAttributesPositionXOnly`}
    public @CType("VkBool32") int perViewAttributesPositionXOnly() { return VkMultiviewPerViewAttributesInfoNVX.get_perViewAttributesPositionXOnly(this.segment()); }
    /// Sets `perViewAttributesPositionXOnly` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_perViewAttributesPositionXOnly(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_perViewAttributesPositionXOnly.set(segment, 0L, index, value); }
    /// Sets `perViewAttributesPositionXOnly` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_perViewAttributesPositionXOnly(MemorySegment segment, @CType("VkBool32") int value) { VkMultiviewPerViewAttributesInfoNVX.set_perViewAttributesPositionXOnly(segment, 0L, value); }
    /// Sets `perViewAttributesPositionXOnly` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesPositionXOnly(@CType("VkBool32") int value) { VkMultiviewPerViewAttributesInfoNVX.set_perViewAttributesPositionXOnly(this.segment(), value); return this; }

    /// A buffer of [VkMultiviewPerViewAttributesInfoNVX].
    public static final class Buffer extends VkMultiviewPerViewAttributesInfoNVX {
        private final long elementCount;

        /// Creates `VkMultiviewPerViewAttributesInfoNVX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMultiviewPerViewAttributesInfoNVX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMultiviewPerViewAttributesInfoNVX`
        public VkMultiviewPerViewAttributesInfoNVX asSlice(long index) { return new VkMultiviewPerViewAttributesInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMultiviewPerViewAttributesInfoNVX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMultiviewPerViewAttributesInfoNVX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMultiviewPerViewAttributesInfoNVX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMultiviewPerViewAttributesInfoNVX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMultiviewPerViewAttributesInfoNVX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewAttributesInfoNVX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `perViewAttributes` at the given index}
        /// @param index the index
        public @CType("VkBool32") int perViewAttributesAt(long index) { return VkMultiviewPerViewAttributesInfoNVX.get_perViewAttributes(this.segment(), index); }
        /// Sets `perViewAttributes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer perViewAttributesAt(long index, @CType("VkBool32") int value) { VkMultiviewPerViewAttributesInfoNVX.set_perViewAttributes(this.segment(), index, value); return this; }

        /// {@return `perViewAttributesPositionXOnly` at the given index}
        /// @param index the index
        public @CType("VkBool32") int perViewAttributesPositionXOnlyAt(long index) { return VkMultiviewPerViewAttributesInfoNVX.get_perViewAttributesPositionXOnly(this.segment(), index); }
        /// Sets `perViewAttributesPositionXOnly` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer perViewAttributesPositionXOnlyAt(long index, @CType("VkBool32") int value) { VkMultiviewPerViewAttributesInfoNVX.set_perViewAttributesPositionXOnly(this.segment(), index, value); return this; }

    }
}
