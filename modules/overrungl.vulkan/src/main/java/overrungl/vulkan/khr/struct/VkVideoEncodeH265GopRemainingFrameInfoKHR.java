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
/// ### useGopRemainingFrames
/// [VarHandle][#VH_useGopRemainingFrames] - [Getter][#useGopRemainingFrames()] - [Setter][#useGopRemainingFrames(int)]
/// ### gopRemainingI
/// [VarHandle][#VH_gopRemainingI] - [Getter][#gopRemainingI()] - [Setter][#gopRemainingI(int)]
/// ### gopRemainingP
/// [VarHandle][#VH_gopRemainingP] - [Getter][#gopRemainingP()] - [Setter][#gopRemainingP(int)]
/// ### gopRemainingB
/// [VarHandle][#VH_gopRemainingB] - [Getter][#gopRemainingB()] - [Setter][#gopRemainingB(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingI;
///     uint32_t gopRemainingP;
///     uint32_t gopRemainingB;
/// } VkVideoEncodeH265GopRemainingFrameInfoKHR;
/// ```
public sealed class VkVideoEncodeH265GopRemainingFrameInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265GopRemainingFrameInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingI"),
        ValueLayout.JAVA_INT.withName("gopRemainingP"),
        ValueLayout.JAVA_INT.withName("gopRemainingB")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useGopRemainingFrames"));
    /// The [VarHandle] of `gopRemainingI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingI"));
    /// The [VarHandle] of `gopRemainingP` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingP"));
    /// The [VarHandle] of `gopRemainingB` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingB"));

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265GopRemainingFrameInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265GopRemainingFrameInfoKHR`
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265GopRemainingFrameInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265GopRemainingFrameInfoKHR`
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int useGopRemainingFrames, @CType("uint32_t") int gopRemainingI, @CType("uint32_t") int gopRemainingP, @CType("uint32_t") int gopRemainingB) { return alloc(allocator).sType(sType).pNext(pNext).useGopRemainingFrames(useGopRemainingFrames).gopRemainingI(gopRemainingI).gopRemainingP(gopRemainingP).gopRemainingB(gopRemainingB); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR copyFrom(VkVideoEncodeH265GopRemainingFrameInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_useGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `useGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_useGopRemainingFrames(segment, 0L); }
    /// {@return `useGopRemainingFrames`}
    public @CType("VkBool32") int useGopRemainingFrames() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_useGopRemainingFrames(this.segment()); }
    /// Sets `useGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_useGopRemainingFrames(segment, 0L, value); }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR useGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_useGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `gopRemainingI` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingI(MemorySegment segment, long index) { return (int) VH_gopRemainingI.get(segment, 0L, index); }
    /// {@return `gopRemainingI`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingI(MemorySegment segment) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingI(segment, 0L); }
    /// {@return `gopRemainingI`}
    public @CType("uint32_t") int gopRemainingI() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingI(this.segment()); }
    /// Sets `gopRemainingI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingI(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingI.set(segment, 0L, index, value); }
    /// Sets `gopRemainingI` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingI(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingI(segment, 0L, value); }
    /// Sets `gopRemainingI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingI(@CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingI(this.segment(), value); return this; }

    /// {@return `gopRemainingP` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingP(MemorySegment segment, long index) { return (int) VH_gopRemainingP.get(segment, 0L, index); }
    /// {@return `gopRemainingP`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingP(MemorySegment segment) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingP(segment, 0L); }
    /// {@return `gopRemainingP`}
    public @CType("uint32_t") int gopRemainingP() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingP(this.segment()); }
    /// Sets `gopRemainingP` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingP(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingP.set(segment, 0L, index, value); }
    /// Sets `gopRemainingP` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingP(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingP(segment, 0L, value); }
    /// Sets `gopRemainingP` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingP(@CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingP(this.segment(), value); return this; }

    /// {@return `gopRemainingB` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingB(MemorySegment segment, long index) { return (int) VH_gopRemainingB.get(segment, 0L, index); }
    /// {@return `gopRemainingB`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingB(MemorySegment segment) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingB(segment, 0L); }
    /// {@return `gopRemainingB`}
    public @CType("uint32_t") int gopRemainingB() { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingB(this.segment()); }
    /// Sets `gopRemainingB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingB(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingB.set(segment, 0L, index, value); }
    /// Sets `gopRemainingB` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingB(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingB(segment, 0L, value); }
    /// Sets `gopRemainingB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingB(@CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingB(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH265GopRemainingFrameInfoKHR].
    public static final class Buffer extends VkVideoEncodeH265GopRemainingFrameInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265GopRemainingFrameInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265GopRemainingFrameInfoKHR`
        public VkVideoEncodeH265GopRemainingFrameInfoKHR asSlice(long index) { return new VkVideoEncodeH265GopRemainingFrameInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265GopRemainingFrameInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265GopRemainingFrameInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `useGopRemainingFrames` at the given index}
        /// @param index the index
        public @CType("VkBool32") int useGopRemainingFramesAt(long index) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_useGopRemainingFrames(this.segment(), index); }
        /// Sets `useGopRemainingFrames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer useGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_useGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `gopRemainingI` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopRemainingIAt(long index) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingI(this.segment(), index); }
        /// Sets `gopRemainingI` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingIAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingI(this.segment(), index, value); return this; }

        /// {@return `gopRemainingP` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopRemainingPAt(long index) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingP(this.segment(), index); }
        /// Sets `gopRemainingP` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingPAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingP(this.segment(), index, value); return this; }

        /// {@return `gopRemainingB` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopRemainingBAt(long index) { return VkVideoEncodeH265GopRemainingFrameInfoKHR.get_gopRemainingB(this.segment(), index); }
        /// Sets `gopRemainingB` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingBAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoKHR.set_gopRemainingB(this.segment(), index, value); return this; }

    }
}
