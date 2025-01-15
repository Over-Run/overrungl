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
/// ### stdProfileIdc
/// [VarHandle][#VH_stdProfileIdc] - [Getter][#stdProfileIdc()] - [Setter][#stdProfileIdc(int)]
/// ### pictureLayout
/// [VarHandle][#VH_pictureLayout] - [Getter][#pictureLayout()] - [Setter][#pictureLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH264ProfileInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     StdVideoH264ProfileIdc stdProfileIdc;
///     VkVideoDecodeH264PictureLayoutFlagBitsKHR pictureLayout;
/// } VkVideoDecodeH264ProfileInfoKHR;
/// ```
public sealed class VkVideoDecodeH264ProfileInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH264ProfileInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfileIdc"),
        ValueLayout.JAVA_INT.withName("pictureLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stdProfileIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdProfileIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfileIdc"));
    /// The [VarHandle] of `pictureLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pictureLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pictureLayout"));

    /// Creates `VkVideoDecodeH264ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH264ProfileInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH264ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264ProfileInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264ProfileInfoKHR(segment); }

    /// Creates `VkVideoDecodeH264ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH264ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264ProfileInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264ProfileInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH264ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeH264ProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264ProfileInfoKHR`
    public static VkVideoDecodeH264ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264ProfileInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH264ProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264ProfileInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeH264ProfileInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264ProfileInfoKHR`
    public static VkVideoDecodeH264ProfileInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("StdVideoH264ProfileIdc") int stdProfileIdc, @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int pictureLayout) { return alloc(allocator).sType(sType).pNext(pNext).stdProfileIdc(stdProfileIdc).pictureLayout(pictureLayout); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH264ProfileInfoKHR copyFrom(VkVideoDecodeH264ProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH264ProfileInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH264ProfileInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH264ProfileInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264ProfileInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH264ProfileInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH264ProfileInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeH264ProfileInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264ProfileInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264ProfileInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264ProfileInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `stdProfileIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264ProfileIdc") int get_stdProfileIdc(MemorySegment segment, long index) { return (int) VH_stdProfileIdc.get(segment, 0L, index); }
    /// {@return `stdProfileIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264ProfileIdc") int get_stdProfileIdc(MemorySegment segment) { return VkVideoDecodeH264ProfileInfoKHR.get_stdProfileIdc(segment, 0L); }
    /// {@return `stdProfileIdc`}
    public @CType("StdVideoH264ProfileIdc") int stdProfileIdc() { return VkVideoDecodeH264ProfileInfoKHR.get_stdProfileIdc(this.segment()); }
    /// Sets `stdProfileIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdProfileIdc(MemorySegment segment, long index, @CType("StdVideoH264ProfileIdc") int value) { VH_stdProfileIdc.set(segment, 0L, index, value); }
    /// Sets `stdProfileIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdProfileIdc(MemorySegment segment, @CType("StdVideoH264ProfileIdc") int value) { VkVideoDecodeH264ProfileInfoKHR.set_stdProfileIdc(segment, 0L, value); }
    /// Sets `stdProfileIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264ProfileInfoKHR stdProfileIdc(@CType("StdVideoH264ProfileIdc") int value) { VkVideoDecodeH264ProfileInfoKHR.set_stdProfileIdc(this.segment(), value); return this; }

    /// {@return `pictureLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int get_pictureLayout(MemorySegment segment, long index) { return (int) VH_pictureLayout.get(segment, 0L, index); }
    /// {@return `pictureLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int get_pictureLayout(MemorySegment segment) { return VkVideoDecodeH264ProfileInfoKHR.get_pictureLayout(segment, 0L); }
    /// {@return `pictureLayout`}
    public @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int pictureLayout() { return VkVideoDecodeH264ProfileInfoKHR.get_pictureLayout(this.segment()); }
    /// Sets `pictureLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pictureLayout(MemorySegment segment, long index, @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) { VH_pictureLayout.set(segment, 0L, index, value); }
    /// Sets `pictureLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pictureLayout(MemorySegment segment, @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) { VkVideoDecodeH264ProfileInfoKHR.set_pictureLayout(segment, 0L, value); }
    /// Sets `pictureLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264ProfileInfoKHR pictureLayout(@CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) { VkVideoDecodeH264ProfileInfoKHR.set_pictureLayout(this.segment(), value); return this; }

    /// A buffer of [VkVideoDecodeH264ProfileInfoKHR].
    public static final class Buffer extends VkVideoDecodeH264ProfileInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeH264ProfileInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeH264ProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeH264ProfileInfoKHR`
        public VkVideoDecodeH264ProfileInfoKHR asSlice(long index) { return new VkVideoDecodeH264ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeH264ProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeH264ProfileInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH264ProfileInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH264ProfileInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeH264ProfileInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264ProfileInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stdProfileIdc` at the given index}
        /// @param index the index
        public @CType("StdVideoH264ProfileIdc") int stdProfileIdcAt(long index) { return VkVideoDecodeH264ProfileInfoKHR.get_stdProfileIdc(this.segment(), index); }
        /// Sets `stdProfileIdc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stdProfileIdcAt(long index, @CType("StdVideoH264ProfileIdc") int value) { VkVideoDecodeH264ProfileInfoKHR.set_stdProfileIdc(this.segment(), index, value); return this; }

        /// {@return `pictureLayout` at the given index}
        /// @param index the index
        public @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int pictureLayoutAt(long index) { return VkVideoDecodeH264ProfileInfoKHR.get_pictureLayout(this.segment(), index); }
        /// Sets `pictureLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pictureLayoutAt(long index, @CType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) { VkVideoDecodeH264ProfileInfoKHR.set_pictureLayout(this.segment(), index, value); return this; }

    }
}
