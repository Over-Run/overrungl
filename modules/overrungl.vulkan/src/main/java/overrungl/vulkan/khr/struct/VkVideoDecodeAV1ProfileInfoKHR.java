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
/// struct VkVideoDecodeAV1ProfileInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) StdVideoAV1Profile stdProfile;
///     (uint32_t) VkBool32 filmGrainSupport;
/// };
/// ```
public sealed class VkVideoDecodeAV1ProfileInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeAV1ProfileInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfile"),
        ValueLayout.JAVA_INT.withName("filmGrainSupport")
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
    /// The byte offset of `stdProfile`.
    public static final long OFFSET_stdProfile = LAYOUT.byteOffset(PathElement.groupElement("stdProfile"));
    /// The memory layout of `stdProfile`.
    public static final MemoryLayout LAYOUT_stdProfile = LAYOUT.select(PathElement.groupElement("stdProfile"));
    /// The [VarHandle] of `stdProfile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfile"));
    /// The byte offset of `filmGrainSupport`.
    public static final long OFFSET_filmGrainSupport = LAYOUT.byteOffset(PathElement.groupElement("filmGrainSupport"));
    /// The memory layout of `filmGrainSupport`.
    public static final MemoryLayout LAYOUT_filmGrainSupport = LAYOUT.select(PathElement.groupElement("filmGrainSupport"));
    /// The [VarHandle] of `filmGrainSupport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filmGrainSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filmGrainSupport"));

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeAV1ProfileInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1ProfileInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1ProfileInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1ProfileInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR copyFrom(VkVideoDecodeAV1ProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoDecodeAV1ProfileInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeAV1ProfileInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stdProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdProfile(MemorySegment segment, long index) { return (int) VH_stdProfile.get(segment, 0L, index); }
    /// {@return `stdProfile`}
    public int stdProfile() { return stdProfile(this.segment(), 0L); }
    /// Sets `stdProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdProfile(MemorySegment segment, long index, int value) { VH_stdProfile.set(segment, 0L, index, value); }
    /// Sets `stdProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR stdProfile(int value) { stdProfile(this.segment(), 0L, value); return this; }

    /// {@return `filmGrainSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filmGrainSupport(MemorySegment segment, long index) { return (int) VH_filmGrainSupport.get(segment, 0L, index); }
    /// {@return `filmGrainSupport`}
    public int filmGrainSupport() { return filmGrainSupport(this.segment(), 0L); }
    /// Sets `filmGrainSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filmGrainSupport(MemorySegment segment, long index, int value) { VH_filmGrainSupport.set(segment, 0L, index, value); }
    /// Sets `filmGrainSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupport(int value) { filmGrainSupport(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoDecodeAV1ProfileInfoKHR].
    public static final class Buffer extends VkVideoDecodeAV1ProfileInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeAV1ProfileInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeAV1ProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeAV1ProfileInfoKHR`
        public VkVideoDecodeAV1ProfileInfoKHR asSlice(long index) { return new VkVideoDecodeAV1ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeAV1ProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeAV1ProfileInfoKHR`
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

        /// {@return `stdProfile` at the given index}
        /// @param index the index of the struct buffer
        public int stdProfileAt(long index) { return stdProfile(this.segment(), index); }
        /// Sets `stdProfile` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdProfileAt(long index, int value) { stdProfile(this.segment(), index, value); return this; }

        /// {@return `filmGrainSupport` at the given index}
        /// @param index the index of the struct buffer
        public int filmGrainSupportAt(long index) { return filmGrainSupport(this.segment(), index); }
        /// Sets `filmGrainSupport` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filmGrainSupportAt(long index, int value) { filmGrainSupport(this.segment(), index, value); return this; }

    }
}
