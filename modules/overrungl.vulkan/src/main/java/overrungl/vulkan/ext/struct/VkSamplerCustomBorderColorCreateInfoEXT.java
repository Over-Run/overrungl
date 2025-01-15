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
/// ### customBorderColor
/// [Byte offset][#OFFSET_customBorderColor] - [Memory layout][#ML_customBorderColor] - [Getter][#customBorderColor()] - [Setter][#customBorderColor(java.lang.foreign.MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerCustomBorderColorCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkClearColorValue customBorderColor;
///     VkFormat format;
/// } VkSamplerCustomBorderColorCreateInfoEXT;
/// ```
public sealed class VkSamplerCustomBorderColorCreateInfoEXT extends Struct {
    /// The struct layout of `VkSamplerCustomBorderColorCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.union.VkClearColorValue.LAYOUT.withName("customBorderColor"),
        ValueLayout.JAVA_INT.withName("format")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `customBorderColor`.
    public static final long OFFSET_customBorderColor = LAYOUT.byteOffset(PathElement.groupElement("customBorderColor"));
    /// The memory layout of `customBorderColor`.
    public static final MemoryLayout ML_customBorderColor = LAYOUT.select(PathElement.groupElement("customBorderColor"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCustomBorderColorCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCustomBorderColorCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerCustomBorderColorCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkClearColorValue") java.lang.foreign.MemorySegment customBorderColor, @CType("VkFormat") int format) { return alloc(allocator).sType(sType).pNext(pNext).customBorderColor(customBorderColor).format(format); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT copyFrom(VkSamplerCustomBorderColorCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerCustomBorderColorCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerCustomBorderColorCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerCustomBorderColorCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT sType(@CType("VkStructureType") int value) { VkSamplerCustomBorderColorCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSamplerCustomBorderColorCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSamplerCustomBorderColorCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerCustomBorderColorCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerCustomBorderColorCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `customBorderColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkClearColorValue") java.lang.foreign.MemorySegment get_customBorderColor(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_customBorderColor, index), ML_customBorderColor); }
    /// {@return `customBorderColor`}
    /// @param segment the segment of the struct
    public static @CType("VkClearColorValue") java.lang.foreign.MemorySegment get_customBorderColor(MemorySegment segment) { return VkSamplerCustomBorderColorCreateInfoEXT.get_customBorderColor(segment, 0L); }
    /// {@return `customBorderColor`}
    public @CType("VkClearColorValue") java.lang.foreign.MemorySegment customBorderColor() { return VkSamplerCustomBorderColorCreateInfoEXT.get_customBorderColor(this.segment()); }
    /// Sets `customBorderColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_customBorderColor(MemorySegment segment, long index, @CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_customBorderColor, index), ML_customBorderColor.byteSize()); }
    /// Sets `customBorderColor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_customBorderColor(MemorySegment segment, @CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { VkSamplerCustomBorderColorCreateInfoEXT.set_customBorderColor(segment, 0L, value); }
    /// Sets `customBorderColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(@CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { VkSamplerCustomBorderColorCreateInfoEXT.set_customBorderColor(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkSamplerCustomBorderColorCreateInfoEXT.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkSamplerCustomBorderColorCreateInfoEXT.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkSamplerCustomBorderColorCreateInfoEXT.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT format(@CType("VkFormat") int value) { VkSamplerCustomBorderColorCreateInfoEXT.set_format(this.segment(), value); return this; }

    /// A buffer of [VkSamplerCustomBorderColorCreateInfoEXT].
    public static final class Buffer extends VkSamplerCustomBorderColorCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkSamplerCustomBorderColorCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSamplerCustomBorderColorCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSamplerCustomBorderColorCreateInfoEXT`
        public VkSamplerCustomBorderColorCreateInfoEXT asSlice(long index) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSamplerCustomBorderColorCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSamplerCustomBorderColorCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerCustomBorderColorCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerCustomBorderColorCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSamplerCustomBorderColorCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerCustomBorderColorCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `customBorderColor` at the given index}
        /// @param index the index
        public @CType("VkClearColorValue") java.lang.foreign.MemorySegment customBorderColorAt(long index) { return VkSamplerCustomBorderColorCreateInfoEXT.get_customBorderColor(this.segment(), index); }
        /// Sets `customBorderColor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer customBorderColorAt(long index, @CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { VkSamplerCustomBorderColorCreateInfoEXT.set_customBorderColor(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkFormat") int formatAt(long index) { return VkSamplerCustomBorderColorCreateInfoEXT.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkFormat") int value) { VkSamplerCustomBorderColorCreateInfoEXT.set_format(this.segment(), index, value); return this; }

    }
}
