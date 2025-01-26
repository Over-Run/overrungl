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
/// struct VkVideoEncodeH265GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingI;
///     uint32_t gopRemainingP;
///     uint32_t gopRemainingB;
/// };
/// ```
public sealed class VkVideoEncodeH265GopRemainingFrameInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265GopRemainingFrameInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingI"),
        ValueLayout.JAVA_INT.withName("gopRemainingP"),
        ValueLayout.JAVA_INT.withName("gopRemainingB")
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
    /// The byte offset of `gopRemainingI`.
    public static final long OFFSET_gopRemainingI = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingI"));
    /// The memory layout of `gopRemainingI`.
    public static final MemoryLayout LAYOUT_gopRemainingI = LAYOUT.select(PathElement.groupElement("gopRemainingI"));
    /// The [VarHandle] of `gopRemainingI` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopRemainingI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingI"));
    /// The byte offset of `gopRemainingP`.
    public static final long OFFSET_gopRemainingP = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingP"));
    /// The memory layout of `gopRemainingP`.
    public static final MemoryLayout LAYOUT_gopRemainingP = LAYOUT.select(PathElement.groupElement("gopRemainingP"));
    /// The [VarHandle] of `gopRemainingP` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopRemainingP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingP"));
    /// The byte offset of `gopRemainingB`.
    public static final long OFFSET_gopRemainingB = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingB"));
    /// The memory layout of `gopRemainingB`.
    public static final MemoryLayout LAYOUT_gopRemainingB = LAYOUT.select(PathElement.groupElement("gopRemainingB"));
    /// The [VarHandle] of `gopRemainingB` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopRemainingB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingB"));

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265GopRemainingFrameInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265GopRemainingFrameInfoKHR`
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265GopRemainingFrameInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265GopRemainingFrameInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR copyFrom(VkVideoEncodeH265GopRemainingFrameInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH265GopRemainingFrameInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265GopRemainingFrameInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265GopRemainingFrameInfoKHR useGopRemainingFrames(int value) { useGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `gopRemainingI` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopRemainingI(MemorySegment segment, long index) { return (int) VH_gopRemainingI.get(segment, 0L, index); }
    /// {@return `gopRemainingI`}
    public int gopRemainingI() { return gopRemainingI(this.segment(), 0L); }
    /// Sets `gopRemainingI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopRemainingI(MemorySegment segment, long index, int value) { VH_gopRemainingI.set(segment, 0L, index, value); }
    /// Sets `gopRemainingI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingI(int value) { gopRemainingI(this.segment(), 0L, value); return this; }

    /// {@return `gopRemainingP` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopRemainingP(MemorySegment segment, long index) { return (int) VH_gopRemainingP.get(segment, 0L, index); }
    /// {@return `gopRemainingP`}
    public int gopRemainingP() { return gopRemainingP(this.segment(), 0L); }
    /// Sets `gopRemainingP` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopRemainingP(MemorySegment segment, long index, int value) { VH_gopRemainingP.set(segment, 0L, index, value); }
    /// Sets `gopRemainingP` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingP(int value) { gopRemainingP(this.segment(), 0L, value); return this; }

    /// {@return `gopRemainingB` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopRemainingB(MemorySegment segment, long index) { return (int) VH_gopRemainingB.get(segment, 0L, index); }
    /// {@return `gopRemainingB`}
    public int gopRemainingB() { return gopRemainingB(this.segment(), 0L); }
    /// Sets `gopRemainingB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopRemainingB(MemorySegment segment, long index, int value) { VH_gopRemainingB.set(segment, 0L, index, value); }
    /// Sets `gopRemainingB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingB(int value) { gopRemainingB(this.segment(), 0L, value); return this; }

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

        /// {@return `gopRemainingI` at the given index}
        /// @param index the index of the struct buffer
        public int gopRemainingIAt(long index) { return gopRemainingI(this.segment(), index); }
        /// Sets `gopRemainingI` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingIAt(long index, int value) { gopRemainingI(this.segment(), index, value); return this; }

        /// {@return `gopRemainingP` at the given index}
        /// @param index the index of the struct buffer
        public int gopRemainingPAt(long index) { return gopRemainingP(this.segment(), index); }
        /// Sets `gopRemainingP` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingPAt(long index, int value) { gopRemainingP(this.segment(), index, value); return this; }

        /// {@return `gopRemainingB` at the given index}
        /// @param index the index of the struct buffer
        public int gopRemainingBAt(long index) { return gopRemainingB(this.segment(), index); }
        /// Sets `gopRemainingB` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopRemainingBAt(long index, int value) { gopRemainingB(this.segment(), index, value); return this; }

    }
}
