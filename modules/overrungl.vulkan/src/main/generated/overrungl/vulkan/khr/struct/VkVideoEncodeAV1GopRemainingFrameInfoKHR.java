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
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeAV1GopRemainingFrameInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingIntra;
///     uint32_t gopRemainingPredictive;
///     uint32_t gopRemainingBipredictive;
/// };
/// ```
public sealed class VkVideoEncodeAV1GopRemainingFrameInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1GopRemainingFrameInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingIntra"),
        ValueLayout.JAVA_INT.withName("gopRemainingPredictive"),
        ValueLayout.JAVA_INT.withName("gopRemainingBipredictive")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `useGopRemainingFrames`.
    public static final long OFFSET_useGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("useGopRemainingFrames"));
    /// The memory layout of `useGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_useGopRemainingFrames = LAYOUT.select(PathElement.groupElement("useGopRemainingFrames"));
    /// The [VarHandle] of `useGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useGopRemainingFrames"));
    /// The byte offset of `gopRemainingIntra`.
    public static final long OFFSET_gopRemainingIntra = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingIntra"));
    /// The memory layout of `gopRemainingIntra`.
    public static final MemoryLayout LAYOUT_gopRemainingIntra = LAYOUT.select(PathElement.groupElement("gopRemainingIntra"));
    /// The [VarHandle] of `gopRemainingIntra` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopRemainingIntra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingIntra"));
    /// The byte offset of `gopRemainingPredictive`.
    public static final long OFFSET_gopRemainingPredictive = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingPredictive"));
    /// The memory layout of `gopRemainingPredictive`.
    public static final MemoryLayout LAYOUT_gopRemainingPredictive = LAYOUT.select(PathElement.groupElement("gopRemainingPredictive"));
    /// The [VarHandle] of `gopRemainingPredictive` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopRemainingPredictive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingPredictive"));
    /// The byte offset of `gopRemainingBipredictive`.
    public static final long OFFSET_gopRemainingBipredictive = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingBipredictive"));
    /// The memory layout of `gopRemainingBipredictive`.
    public static final MemoryLayout LAYOUT_gopRemainingBipredictive = LAYOUT.select(PathElement.groupElement("gopRemainingBipredictive"));
    /// The [VarHandle] of `gopRemainingBipredictive` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopRemainingBipredictive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingBipredictive"));

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1GopRemainingFrameInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1GopRemainingFrameInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR copyFrom(VkVideoEncodeAV1GopRemainingFrameInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `useGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_useGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `useGopRemainingFrames`}
    public int useGopRemainingFrames() { return useGopRemainingFrames(this.segment(), 0L); }
    /// Sets `useGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useGopRemainingFrames(MemorySegment segment, long index, int value) { VH_useGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFrames(int value) { useGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `gopRemainingIntra` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopRemainingIntra(MemorySegment segment, long index) { return (int) VH_gopRemainingIntra.get(segment, 0L, index); }
    /// {@return `gopRemainingIntra`}
    public int gopRemainingIntra() { return gopRemainingIntra(this.segment(), 0L); }
    /// Sets `gopRemainingIntra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopRemainingIntra(MemorySegment segment, long index, int value) { VH_gopRemainingIntra.set(segment, 0L, index, value); }
    /// Sets `gopRemainingIntra` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntra(int value) { gopRemainingIntra(this.segment(), 0L, value); return this; }

    /// {@return `gopRemainingPredictive` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopRemainingPredictive(MemorySegment segment, long index) { return (int) VH_gopRemainingPredictive.get(segment, 0L, index); }
    /// {@return `gopRemainingPredictive`}
    public int gopRemainingPredictive() { return gopRemainingPredictive(this.segment(), 0L); }
    /// Sets `gopRemainingPredictive` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopRemainingPredictive(MemorySegment segment, long index, int value) { VH_gopRemainingPredictive.set(segment, 0L, index, value); }
    /// Sets `gopRemainingPredictive` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictive(int value) { gopRemainingPredictive(this.segment(), 0L, value); return this; }

    /// {@return `gopRemainingBipredictive` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopRemainingBipredictive(MemorySegment segment, long index) { return (int) VH_gopRemainingBipredictive.get(segment, 0L, index); }
    /// {@return `gopRemainingBipredictive`}
    public int gopRemainingBipredictive() { return gopRemainingBipredictive(this.segment(), 0L); }
    /// Sets `gopRemainingBipredictive` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopRemainingBipredictive(MemorySegment segment, long index, int value) { VH_gopRemainingBipredictive.set(segment, 0L, index, value); }
    /// Sets `gopRemainingBipredictive` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictive(int value) { gopRemainingBipredictive(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `useGopRemainingFrames` at the given index}
        /// @param index the index of the struct buffer
        public int useGopRemainingFramesAt(long index) { return useGopRemainingFrames(this.segment(), index); }
        /// Sets `useGopRemainingFrames` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer useGopRemainingFramesAt(long index, int value) { useGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `gopRemainingIntra` at the given index}
        /// @param index the index of the struct buffer
        public int gopRemainingIntraAt(long index) { return gopRemainingIntra(this.segment(), index); }
        /// Sets `gopRemainingIntra` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingIntraAt(long index, int value) { gopRemainingIntra(this.segment(), index, value); return this; }

        /// {@return `gopRemainingPredictive` at the given index}
        /// @param index the index of the struct buffer
        public int gopRemainingPredictiveAt(long index) { return gopRemainingPredictive(this.segment(), index); }
        /// Sets `gopRemainingPredictive` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingPredictiveAt(long index, int value) { gopRemainingPredictive(this.segment(), index, value); return this; }

        /// {@return `gopRemainingBipredictive` at the given index}
        /// @param index the index of the struct buffer
        public int gopRemainingBipredictiveAt(long index) { return gopRemainingBipredictive(this.segment(), index); }
        /// Sets `gopRemainingBipredictive` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingBipredictiveAt(long index, int value) { gopRemainingBipredictive(this.segment(), index, value); return this; }

    }
}
