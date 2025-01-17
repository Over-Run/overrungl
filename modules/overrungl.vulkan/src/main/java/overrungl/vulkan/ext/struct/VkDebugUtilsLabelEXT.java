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
/// ### pLabelName
/// [VarHandle][#VH_pLabelName] - [Getter][#pLabelName()] - [Setter][#pLabelName(java.lang.foreign.MemorySegment)]
/// ### color
/// [Byte offset][#OFFSET_color] - [Memory layout][#ML_color] - [Getter][#color()] - [Setter][#color(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugUtilsLabelEXT {
///     VkStructureType sType;
///     const void * pNext;
///     const char * pLabelName;
///     float[4] color;
/// } VkDebugUtilsLabelEXT;
/// ```
public sealed class VkDebugUtilsLabelEXT extends Struct {
    /// The struct layout of `VkDebugUtilsLabelEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pLabelName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pLabelName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLabelName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLabelName"));
    /// The byte offset of `color`.
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    /// The memory layout of `color`.
    public static final MemoryLayout ML_color = LAYOUT.select(PathElement.groupElement("color"));

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugUtilsLabelEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsLabelEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsLabelEXT(segment); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsLabelEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsLabelEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsLabelEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("const char *") java.lang.foreign.MemorySegment pLabelName, @CType("float[4]") java.lang.foreign.MemorySegment color) { return alloc(allocator).sType(sType).pNext(pNext).pLabelName(pLabelName).color(color); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsLabelEXT copyFrom(VkDebugUtilsLabelEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugUtilsLabelEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugUtilsLabelEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugUtilsLabelEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsLabelEXT sType(@CType("VkStructureType") int value) { VkDebugUtilsLabelEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugUtilsLabelEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugUtilsLabelEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsLabelEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pLabelName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pLabelName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLabelName.get(segment, 0L, index); }
    /// {@return `pLabelName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pLabelName(MemorySegment segment) { return VkDebugUtilsLabelEXT.get_pLabelName(segment, 0L); }
    /// {@return `pLabelName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pLabelName() { return VkDebugUtilsLabelEXT.get_pLabelName(this.segment()); }
    /// Sets `pLabelName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLabelName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pLabelName.set(segment, 0L, index, value); }
    /// Sets `pLabelName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLabelName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_pLabelName(segment, 0L, value); }
    /// Sets `pLabelName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsLabelEXT pLabelName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_pLabelName(this.segment(), value); return this; }

    /// {@return `color` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[4]") java.lang.foreign.MemorySegment get_color(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_color, index), ML_color); }
    /// {@return `color`}
    /// @param segment the segment of the struct
    public static @CType("float[4]") java.lang.foreign.MemorySegment get_color(MemorySegment segment) { return VkDebugUtilsLabelEXT.get_color(segment, 0L); }
    /// {@return `color`}
    public @CType("float[4]") java.lang.foreign.MemorySegment color() { return VkDebugUtilsLabelEXT.get_color(this.segment()); }
    /// Sets `color` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_color(MemorySegment segment, long index, @CType("float[4]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_color, index), ML_color.byteSize()); }
    /// Sets `color` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_color(MemorySegment segment, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_color(segment, 0L, value); }
    /// Sets `color` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsLabelEXT color(@CType("float[4]") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_color(this.segment(), value); return this; }

    /// A buffer of [VkDebugUtilsLabelEXT].
    public static final class Buffer extends VkDebugUtilsLabelEXT {
        private final long elementCount;

        /// Creates `VkDebugUtilsLabelEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugUtilsLabelEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugUtilsLabelEXT`
        public VkDebugUtilsLabelEXT asSlice(long index) { return new VkDebugUtilsLabelEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugUtilsLabelEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugUtilsLabelEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugUtilsLabelEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugUtilsLabelEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugUtilsLabelEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pLabelName` at the given index}
        /// @param index the index
        public @CType("const char *") java.lang.foreign.MemorySegment pLabelNameAt(long index) { return VkDebugUtilsLabelEXT.get_pLabelName(this.segment(), index); }
        /// Sets `pLabelName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLabelNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_pLabelName(this.segment(), index, value); return this; }

        /// {@return `color` at the given index}
        /// @param index the index
        public @CType("float[4]") java.lang.foreign.MemorySegment colorAt(long index) { return VkDebugUtilsLabelEXT.get_color(this.segment(), index); }
        /// Sets `color` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorAt(long index, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkDebugUtilsLabelEXT.set_color(this.segment(), index, value); return this; }

    }
}
