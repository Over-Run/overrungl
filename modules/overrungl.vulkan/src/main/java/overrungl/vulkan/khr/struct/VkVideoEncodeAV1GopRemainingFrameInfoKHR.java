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
/// ### useGopRemainingFrames
/// [VarHandle][#VH_useGopRemainingFrames] - [Getter][#useGopRemainingFrames()] - [Setter][#useGopRemainingFrames(int)]
/// ### gopRemainingIntra
/// [VarHandle][#VH_gopRemainingIntra] - [Getter][#gopRemainingIntra()] - [Setter][#gopRemainingIntra(int)]
/// ### gopRemainingPredictive
/// [VarHandle][#VH_gopRemainingPredictive] - [Getter][#gopRemainingPredictive()] - [Setter][#gopRemainingPredictive(int)]
/// ### gopRemainingBipredictive
/// [VarHandle][#VH_gopRemainingBipredictive] - [Getter][#gopRemainingBipredictive()] - [Setter][#gopRemainingBipredictive(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingIntra;
///     uint32_t gopRemainingPredictive;
///     uint32_t gopRemainingBipredictive;
/// } VkVideoEncodeAV1GopRemainingFrameInfoKHR;
/// ```
public sealed class VkVideoEncodeAV1GopRemainingFrameInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1GopRemainingFrameInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingIntra"),
        ValueLayout.JAVA_INT.withName("gopRemainingPredictive"),
        ValueLayout.JAVA_INT.withName("gopRemainingBipredictive")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useGopRemainingFrames"));
    /// The [VarHandle] of `gopRemainingIntra` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingIntra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingIntra"));
    /// The [VarHandle] of `gopRemainingPredictive` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingPredictive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingPredictive"));
    /// The [VarHandle] of `gopRemainingBipredictive` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingBipredictive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingBipredictive"));

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkBool32") int useGopRemainingFrames, @CType("uint32_t") int gopRemainingIntra, @CType("uint32_t") int gopRemainingPredictive, @CType("uint32_t") int gopRemainingBipredictive) { return alloc(allocator).sType(sType).pNext(pNext).useGopRemainingFrames(useGopRemainingFrames).gopRemainingIntra(gopRemainingIntra).gopRemainingPredictive(gopRemainingPredictive).gopRemainingBipredictive(gopRemainingBipredictive); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR copyFrom(VkVideoEncodeAV1GopRemainingFrameInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_useGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `useGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_useGopRemainingFrames(segment, 0L); }
    /// {@return `useGopRemainingFrames`}
    public @CType("VkBool32") int useGopRemainingFrames() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_useGopRemainingFrames(this.segment()); }
    /// Sets `useGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_useGopRemainingFrames(segment, 0L, value); }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_useGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `gopRemainingIntra` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingIntra(MemorySegment segment, long index) { return (int) VH_gopRemainingIntra.get(segment, 0L, index); }
    /// {@return `gopRemainingIntra`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingIntra(MemorySegment segment) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingIntra(segment, 0L); }
    /// {@return `gopRemainingIntra`}
    public @CType("uint32_t") int gopRemainingIntra() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingIntra(this.segment()); }
    /// Sets `gopRemainingIntra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingIntra(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingIntra.set(segment, 0L, index, value); }
    /// Sets `gopRemainingIntra` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingIntra(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingIntra(segment, 0L, value); }
    /// Sets `gopRemainingIntra` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntra(@CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingIntra(this.segment(), value); return this; }

    /// {@return `gopRemainingPredictive` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingPredictive(MemorySegment segment, long index) { return (int) VH_gopRemainingPredictive.get(segment, 0L, index); }
    /// {@return `gopRemainingPredictive`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingPredictive(MemorySegment segment) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingPredictive(segment, 0L); }
    /// {@return `gopRemainingPredictive`}
    public @CType("uint32_t") int gopRemainingPredictive() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingPredictive(this.segment()); }
    /// Sets `gopRemainingPredictive` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingPredictive(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingPredictive.set(segment, 0L, index, value); }
    /// Sets `gopRemainingPredictive` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingPredictive(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingPredictive(segment, 0L, value); }
    /// Sets `gopRemainingPredictive` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictive(@CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingPredictive(this.segment(), value); return this; }

    /// {@return `gopRemainingBipredictive` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingBipredictive(MemorySegment segment, long index) { return (int) VH_gopRemainingBipredictive.get(segment, 0L, index); }
    /// {@return `gopRemainingBipredictive`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingBipredictive(MemorySegment segment) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingBipredictive(segment, 0L); }
    /// {@return `gopRemainingBipredictive`}
    public @CType("uint32_t") int gopRemainingBipredictive() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingBipredictive(this.segment()); }
    /// Sets `gopRemainingBipredictive` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingBipredictive(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingBipredictive.set(segment, 0L, index, value); }
    /// Sets `gopRemainingBipredictive` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingBipredictive(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingBipredictive(segment, 0L, value); }
    /// Sets `gopRemainingBipredictive` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictive(@CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingBipredictive(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeAV1GopRemainingFrameInfoKHR].
    public static final class Buffer extends VkVideoEncodeAV1GopRemainingFrameInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1GopRemainingFrameInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR asSlice(long index) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1GopRemainingFrameInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `useGopRemainingFrames` at the given index}
        /// @param index the index
        public @CType("VkBool32") int useGopRemainingFramesAt(long index) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_useGopRemainingFrames(this.segment(), index); }
        /// Sets `useGopRemainingFrames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer useGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_useGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `gopRemainingIntra` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopRemainingIntraAt(long index) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingIntra(this.segment(), index); }
        /// Sets `gopRemainingIntra` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingIntraAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingIntra(this.segment(), index, value); return this; }

        /// {@return `gopRemainingPredictive` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopRemainingPredictiveAt(long index) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingPredictive(this.segment(), index); }
        /// Sets `gopRemainingPredictive` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingPredictiveAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingPredictive(this.segment(), index, value); return this; }

        /// {@return `gopRemainingBipredictive` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopRemainingBipredictiveAt(long index) { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.get_gopRemainingBipredictive(this.segment(), index); }
        /// Sets `gopRemainingBipredictive` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingBipredictiveAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.set_gopRemainingBipredictive(this.segment(), index, value); return this; }

    }
}
