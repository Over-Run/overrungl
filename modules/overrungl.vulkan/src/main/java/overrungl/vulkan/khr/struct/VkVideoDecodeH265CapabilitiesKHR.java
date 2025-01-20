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
/// ### maxLevelIdc
/// [VarHandle][#VH_maxLevelIdc] - [Getter][#maxLevelIdc()] - [Setter][#maxLevelIdc(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH265CapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     StdVideoH265LevelIdc maxLevelIdc;
/// } VkVideoDecodeH265CapabilitiesKHR;
/// ```
public sealed class VkVideoDecodeH265CapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH265CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH265CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265CapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265CapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeH265CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265CapabilitiesKHR`
    public static VkVideoDecodeH265CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH265CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265CapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeH265CapabilitiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265CapabilitiesKHR`
    public static VkVideoDecodeH265CapabilitiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("StdVideoH265LevelIdc") int maxLevelIdc) { return alloc(allocator).sType(sType).pNext(pNext).maxLevelIdc(maxLevelIdc); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR copyFrom(VkVideoDecodeH265CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH265CapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH265CapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH265CapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH265CapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH265CapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkVideoDecodeH265CapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkVideoDecodeH265CapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR pNext(@CType("void *") MemorySegment value) { VkVideoDecodeH265CapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoDecodeH265CapabilitiesKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH265LevelIdc") int maxLevelIdc() { return VkVideoDecodeH265CapabilitiesKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH265LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH265LevelIdc") int value) { VkVideoDecodeH265CapabilitiesKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR maxLevelIdc(@CType("StdVideoH265LevelIdc") int value) { VkVideoDecodeH265CapabilitiesKHR.set_maxLevelIdc(this.segment(), value); return this; }

    /// A buffer of [VkVideoDecodeH265CapabilitiesKHR].
    public static final class Buffer extends VkVideoDecodeH265CapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeH265CapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeH265CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeH265CapabilitiesKHR`
        public VkVideoDecodeH265CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeH265CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeH265CapabilitiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH265CapabilitiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH265CapabilitiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkVideoDecodeH265CapabilitiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkVideoDecodeH265CapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxLevelIdc` at the given index}
        /// @param index the index
        public @CType("StdVideoH265LevelIdc") int maxLevelIdcAt(long index) { return VkVideoDecodeH265CapabilitiesKHR.get_maxLevelIdc(this.segment(), index); }
        /// Sets `maxLevelIdc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelIdcAt(long index, @CType("StdVideoH265LevelIdc") int value) { VkVideoDecodeH265CapabilitiesKHR.set_maxLevelIdc(this.segment(), index, value); return this; }

    }
}
