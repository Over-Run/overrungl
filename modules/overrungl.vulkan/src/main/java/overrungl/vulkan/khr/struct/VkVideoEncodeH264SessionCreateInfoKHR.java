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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### useMaxLevelIdc
/// [VarHandle][#VH_useMaxLevelIdc] - [Getter][#useMaxLevelIdc()] - [Setter][#useMaxLevelIdc(int)]
/// ### maxLevelIdc
/// [VarHandle][#VH_maxLevelIdc] - [Getter][#maxLevelIdc()] - [Setter][#maxLevelIdc(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264SessionCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useMaxLevelIdc;
///     StdVideoH264LevelIdc maxLevelIdc;
/// } VkVideoEncodeH264SessionCreateInfoKHR;
/// ```
public sealed class VkVideoEncodeH264SessionCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264SessionCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useMaxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxLevelIdc"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));

    /// Creates `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264SessionCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionCreateInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionCreateInfoKHR`
    public static VkVideoEncodeH264SessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264SessionCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionCreateInfoKHR`
    public static VkVideoEncodeH264SessionCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int useMaxLevelIdc, @CType("StdVideoH264LevelIdc") int maxLevelIdc) { return alloc(allocator).sType(sType).pNext(pNext).useMaxLevelIdc(useMaxLevelIdc).maxLevelIdc(maxLevelIdc); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264SessionCreateInfoKHR copyFrom(VkVideoEncodeH264SessionCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264SessionCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264SessionCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264SessionCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264SessionCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useMaxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxLevelIdc(MemorySegment segment, long index) { return (int) VH_useMaxLevelIdc.get(segment, 0L, index); }
    /// {@return `useMaxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxLevelIdc(MemorySegment segment) { return VkVideoEncodeH264SessionCreateInfoKHR.get_useMaxLevelIdc(segment, 0L); }
    /// {@return `useMaxLevelIdc`}
    public @CType("VkBool32") int useMaxLevelIdc() { return VkVideoEncodeH264SessionCreateInfoKHR.get_useMaxLevelIdc(this.segment()); }
    /// Sets `useMaxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxLevelIdc(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `useMaxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxLevelIdc(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_useMaxLevelIdc(segment, 0L, value); }
    /// Sets `useMaxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionCreateInfoKHR useMaxLevelIdc(@CType("VkBool32") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_useMaxLevelIdc(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoEncodeH264SessionCreateInfoKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH264LevelIdc") int maxLevelIdc() { return VkVideoEncodeH264SessionCreateInfoKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH264LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionCreateInfoKHR maxLevelIdc(@CType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_maxLevelIdc(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH264SessionCreateInfoKHR].
    public static final class Buffer extends VkVideoEncodeH264SessionCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264SessionCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264SessionCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264SessionCreateInfoKHR`
        public VkVideoEncodeH264SessionCreateInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264SessionCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264SessionCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264SessionCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264SessionCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `useMaxLevelIdc` at the given index}
        /// @param index the index
        public @CType("VkBool32") int useMaxLevelIdcAt(long index) { return VkVideoEncodeH264SessionCreateInfoKHR.get_useMaxLevelIdc(this.segment(), index); }
        /// Sets `useMaxLevelIdc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer useMaxLevelIdcAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_useMaxLevelIdc(this.segment(), index, value); return this; }

        /// {@return `maxLevelIdc` at the given index}
        /// @param index the index
        public @CType("StdVideoH264LevelIdc") int maxLevelIdcAt(long index) { return VkVideoEncodeH264SessionCreateInfoKHR.get_maxLevelIdc(this.segment(), index); }
        /// Sets `maxLevelIdc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelIdcAt(long index, @CType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264SessionCreateInfoKHR.set_maxLevelIdc(this.segment(), index, value); return this; }

    }
}
