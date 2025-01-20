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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### useMaxLevel
/// [VarHandle][#VH_useMaxLevel] - [Getter][#useMaxLevel()] - [Setter][#useMaxLevel(int)]
/// ### maxLevel
/// [VarHandle][#VH_maxLevel] - [Getter][#maxLevel()] - [Setter][#maxLevel(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1SessionCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useMaxLevel;
///     StdVideoAV1Level maxLevel;
/// } VkVideoEncodeAV1SessionCreateInfoKHR;
/// ```
public sealed class VkVideoEncodeAV1SessionCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1SessionCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevel"),
        ValueLayout.JAVA_INT.withName("maxLevel")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useMaxLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxLevel"));
    /// The [VarHandle] of `maxLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel"));

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1SessionCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1SessionCreateInfoKHR`
    public static VkVideoEncodeAV1SessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1SessionCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1SessionCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1SessionCreateInfoKHR`
    public static VkVideoEncodeAV1SessionCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkBool32") int useMaxLevel, @CType("StdVideoAV1Level") int maxLevel) { return alloc(allocator).sType(sType).pNext(pNext).useMaxLevel(useMaxLevel).maxLevel(maxLevel); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR copyFrom(VkVideoEncodeAV1SessionCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1SessionCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoEncodeAV1SessionCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useMaxLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxLevel(MemorySegment segment, long index) { return (int) VH_useMaxLevel.get(segment, 0L, index); }
    /// {@return `useMaxLevel`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxLevel(MemorySegment segment) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_useMaxLevel(segment, 0L); }
    /// {@return `useMaxLevel`}
    public @CType("VkBool32") int useMaxLevel() { return VkVideoEncodeAV1SessionCreateInfoKHR.get_useMaxLevel(this.segment()); }
    /// Sets `useMaxLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxLevel(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxLevel.set(segment, 0L, index, value); }
    /// Sets `useMaxLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxLevel(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_useMaxLevel(segment, 0L, value); }
    /// Sets `useMaxLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR useMaxLevel(@CType("VkBool32") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_useMaxLevel(this.segment(), value); return this; }

    /// {@return `maxLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1Level") int get_maxLevel(MemorySegment segment, long index) { return (int) VH_maxLevel.get(segment, 0L, index); }
    /// {@return `maxLevel`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1Level") int get_maxLevel(MemorySegment segment) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_maxLevel(segment, 0L); }
    /// {@return `maxLevel`}
    public @CType("StdVideoAV1Level") int maxLevel() { return VkVideoEncodeAV1SessionCreateInfoKHR.get_maxLevel(this.segment()); }
    /// Sets `maxLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevel(MemorySegment segment, long index, @CType("StdVideoAV1Level") int value) { VH_maxLevel.set(segment, 0L, index, value); }
    /// Sets `maxLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevel(MemorySegment segment, @CType("StdVideoAV1Level") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_maxLevel(segment, 0L, value); }
    /// Sets `maxLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR maxLevel(@CType("StdVideoAV1Level") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_maxLevel(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeAV1SessionCreateInfoKHR].
    public static final class Buffer extends VkVideoEncodeAV1SessionCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1SessionCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1SessionCreateInfoKHR`
        public VkVideoEncodeAV1SessionCreateInfoKHR asSlice(long index) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1SessionCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1SessionCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `useMaxLevel` at the given index}
        /// @param index the index
        public @CType("VkBool32") int useMaxLevelAt(long index) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_useMaxLevel(this.segment(), index); }
        /// Sets `useMaxLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer useMaxLevelAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_useMaxLevel(this.segment(), index, value); return this; }

        /// {@return `maxLevel` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1Level") int maxLevelAt(long index) { return VkVideoEncodeAV1SessionCreateInfoKHR.get_maxLevel(this.segment(), index); }
        /// Sets `maxLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelAt(long index, @CType("StdVideoAV1Level") int value) { VkVideoEncodeAV1SessionCreateInfoKHR.set_maxLevel(this.segment(), index, value); return this; }

    }
}
