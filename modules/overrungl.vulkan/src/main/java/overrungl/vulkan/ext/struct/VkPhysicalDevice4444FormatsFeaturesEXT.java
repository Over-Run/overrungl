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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### formatA4R4G4B4
/// [VarHandle][#VH_formatA4R4G4B4] - [Getter][#formatA4R4G4B4()] - [Setter][#formatA4R4G4B4(int)]
/// ### formatA4B4G4R4
/// [VarHandle][#VH_formatA4B4G4R4] - [Getter][#formatA4B4G4R4()] - [Setter][#formatA4B4G4R4(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevice4444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 formatA4R4G4B4;
///     VkBool32 formatA4B4G4R4;
/// } VkPhysicalDevice4444FormatsFeaturesEXT;
/// ```
public sealed class VkPhysicalDevice4444FormatsFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDevice4444FormatsFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatA4R4G4B4"),
        ValueLayout.JAVA_INT.withName("formatA4B4G4R4")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `formatA4R4G4B4` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_formatA4R4G4B4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatA4R4G4B4"));
    /// The [VarHandle] of `formatA4B4G4R4` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_formatA4B4G4R4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatA4B4G4R4"));

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice4444FormatsFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(segment); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice4444FormatsFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice4444FormatsFeaturesEXT`
    public static VkPhysicalDevice4444FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevice4444FormatsFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevice4444FormatsFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice4444FormatsFeaturesEXT`
    public static VkPhysicalDevice4444FormatsFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int formatA4R4G4B4, @CType("VkBool32") int formatA4B4G4R4) { return alloc(allocator).sType(sType).pNext(pNext).formatA4R4G4B4(formatA4R4G4B4).formatA4B4G4R4(formatA4B4G4R4); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT copyFrom(VkPhysicalDevice4444FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevice4444FormatsFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDevice4444FormatsFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `formatA4R4G4B4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_formatA4R4G4B4(MemorySegment segment, long index) { return (int) VH_formatA4R4G4B4.get(segment, 0L, index); }
    /// {@return `formatA4R4G4B4`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_formatA4R4G4B4(MemorySegment segment) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_formatA4R4G4B4(segment, 0L); }
    /// {@return `formatA4R4G4B4`}
    public @CType("VkBool32") int formatA4R4G4B4() { return VkPhysicalDevice4444FormatsFeaturesEXT.get_formatA4R4G4B4(this.segment()); }
    /// Sets `formatA4R4G4B4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatA4R4G4B4(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_formatA4R4G4B4.set(segment, 0L, index, value); }
    /// Sets `formatA4R4G4B4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatA4R4G4B4(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_formatA4R4G4B4(segment, 0L, value); }
    /// Sets `formatA4R4G4B4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(@CType("VkBool32") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_formatA4R4G4B4(this.segment(), value); return this; }

    /// {@return `formatA4B4G4R4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_formatA4B4G4R4(MemorySegment segment, long index) { return (int) VH_formatA4B4G4R4.get(segment, 0L, index); }
    /// {@return `formatA4B4G4R4`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_formatA4B4G4R4(MemorySegment segment) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_formatA4B4G4R4(segment, 0L); }
    /// {@return `formatA4B4G4R4`}
    public @CType("VkBool32") int formatA4B4G4R4() { return VkPhysicalDevice4444FormatsFeaturesEXT.get_formatA4B4G4R4(this.segment()); }
    /// Sets `formatA4B4G4R4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatA4B4G4R4(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_formatA4B4G4R4.set(segment, 0L, index, value); }
    /// Sets `formatA4B4G4R4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatA4B4G4R4(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_formatA4B4G4R4(segment, 0L, value); }
    /// Sets `formatA4B4G4R4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(@CType("VkBool32") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_formatA4B4G4R4(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDevice4444FormatsFeaturesEXT].
    public static final class Buffer extends VkPhysicalDevice4444FormatsFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevice4444FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevice4444FormatsFeaturesEXT`
        public VkPhysicalDevice4444FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDevice4444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevice4444FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevice4444FormatsFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `formatA4R4G4B4` at the given index}
        /// @param index the index
        public @CType("VkBool32") int formatA4R4G4B4At(long index) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_formatA4R4G4B4(this.segment(), index); }
        /// Sets `formatA4R4G4B4` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatA4R4G4B4At(long index, @CType("VkBool32") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_formatA4R4G4B4(this.segment(), index, value); return this; }

        /// {@return `formatA4B4G4R4` at the given index}
        /// @param index the index
        public @CType("VkBool32") int formatA4B4G4R4At(long index) { return VkPhysicalDevice4444FormatsFeaturesEXT.get_formatA4B4G4R4(this.segment(), index); }
        /// Sets `formatA4B4G4R4` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatA4B4G4R4At(long index, @CType("VkBool32") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.set_formatA4B4G4R4(this.segment(), index, value); return this; }

    }
}
