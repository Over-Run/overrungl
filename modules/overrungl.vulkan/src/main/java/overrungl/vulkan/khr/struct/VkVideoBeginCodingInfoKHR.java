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
/// struct VkVideoBeginCodingInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoBeginCodingFlagsKHR flags;
///     (uint64_t) VkVideoSessionKHR videoSession;
///     (uint64_t) VkVideoSessionParametersKHR videoSessionParameters;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR* pReferenceSlots;
/// };
/// ```
public sealed class VkVideoBeginCodingInfoKHR extends GroupType {
    /// The struct layout of `VkVideoBeginCodingInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("videoSession"),
        ValueLayout.JAVA_LONG.withName("videoSessionParameters"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `videoSession`.
    public static final long OFFSET_videoSession = LAYOUT.byteOffset(PathElement.groupElement("videoSession"));
    /// The memory layout of `videoSession`.
    public static final MemoryLayout LAYOUT_videoSession = LAYOUT.select(PathElement.groupElement("videoSession"));
    /// The [VarHandle] of `videoSession` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSession = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSession"));
    /// The byte offset of `videoSessionParameters`.
    public static final long OFFSET_videoSessionParameters = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParameters"));
    /// The memory layout of `videoSessionParameters`.
    public static final MemoryLayout LAYOUT_videoSessionParameters = LAYOUT.select(PathElement.groupElement("videoSessionParameters"));
    /// The [VarHandle] of `videoSessionParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSessionParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParameters"));
    /// The byte offset of `referenceSlotCount`.
    public static final long OFFSET_referenceSlotCount = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
    /// The memory layout of `referenceSlotCount`.
    public static final MemoryLayout LAYOUT_referenceSlotCount = LAYOUT.select(PathElement.groupElement("referenceSlotCount"));
    /// The [VarHandle] of `referenceSlotCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    /// The byte offset of `pReferenceSlots`.
    public static final long OFFSET_pReferenceSlots = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
    /// The memory layout of `pReferenceSlots`.
    public static final MemoryLayout LAYOUT_pReferenceSlots = LAYOUT.select(PathElement.groupElement("pReferenceSlots"));
    /// The [VarHandle] of `pReferenceSlots` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoBeginCodingInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoBeginCodingInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoBeginCodingInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoBeginCodingInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoBeginCodingInfoKHR`
    public static VkVideoBeginCodingInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoBeginCodingInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoBeginCodingInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoBeginCodingInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoBeginCodingInfoKHR copyFrom(VkVideoBeginCodingInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoBeginCodingInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoBeginCodingInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `videoSession` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long videoSession(MemorySegment segment, long index) { return (long) VH_videoSession.get(segment, 0L, index); }
    /// {@return `videoSession`}
    public long videoSession() { return videoSession(this.segment(), 0L); }
    /// Sets `videoSession` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoSession(MemorySegment segment, long index, long value) { VH_videoSession.set(segment, 0L, index, value); }
    /// Sets `videoSession` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR videoSession(long value) { videoSession(this.segment(), 0L, value); return this; }

    /// {@return `videoSessionParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long videoSessionParameters(MemorySegment segment, long index) { return (long) VH_videoSessionParameters.get(segment, 0L, index); }
    /// {@return `videoSessionParameters`}
    public long videoSessionParameters() { return videoSessionParameters(this.segment(), 0L); }
    /// Sets `videoSessionParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoSessionParameters(MemorySegment segment, long index, long value) { VH_videoSessionParameters.set(segment, 0L, index, value); }
    /// Sets `videoSessionParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR videoSessionParameters(long value) { videoSessionParameters(this.segment(), 0L, value); return this; }

    /// {@return `referenceSlotCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int referenceSlotCount(MemorySegment segment, long index) { return (int) VH_referenceSlotCount.get(segment, 0L, index); }
    /// {@return `referenceSlotCount`}
    public int referenceSlotCount() { return referenceSlotCount(this.segment(), 0L); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void referenceSlotCount(MemorySegment segment, long index, int value) { VH_referenceSlotCount.set(segment, 0L, index, value); }
    /// Sets `referenceSlotCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR referenceSlotCount(int value) { referenceSlotCount(this.segment(), 0L, value); return this; }

    /// {@return `pReferenceSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pReferenceSlots(MemorySegment segment, long index) { return (MemorySegment) VH_pReferenceSlots.get(segment, 0L, index); }
    /// {@return `pReferenceSlots`}
    public MemorySegment pReferenceSlots() { return pReferenceSlots(this.segment(), 0L); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pReferenceSlots(MemorySegment segment, long index, MemorySegment value) { VH_pReferenceSlots.set(segment, 0L, index, value); }
    /// Sets `pReferenceSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR pReferenceSlots(MemorySegment value) { pReferenceSlots(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoBeginCodingInfoKHR].
    public static final class Buffer extends VkVideoBeginCodingInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoBeginCodingInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoBeginCodingInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoBeginCodingInfoKHR`
        public VkVideoBeginCodingInfoKHR asSlice(long index) { return new VkVideoBeginCodingInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoBeginCodingInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoBeginCodingInfoKHR`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `videoSession` at the given index}
        /// @param index the index of the struct buffer
        public long videoSessionAt(long index) { return videoSession(this.segment(), index); }
        /// Sets `videoSession` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer videoSessionAt(long index, long value) { videoSession(this.segment(), index, value); return this; }

        /// {@return `videoSessionParameters` at the given index}
        /// @param index the index of the struct buffer
        public long videoSessionParametersAt(long index) { return videoSessionParameters(this.segment(), index); }
        /// Sets `videoSessionParameters` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer videoSessionParametersAt(long index, long value) { videoSessionParameters(this.segment(), index, value); return this; }

        /// {@return `referenceSlotCount` at the given index}
        /// @param index the index of the struct buffer
        public int referenceSlotCountAt(long index) { return referenceSlotCount(this.segment(), index); }
        /// Sets `referenceSlotCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer referenceSlotCountAt(long index, int value) { referenceSlotCount(this.segment(), index, value); return this; }

        /// {@return `pReferenceSlots` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pReferenceSlotsAt(long index) { return pReferenceSlots(this.segment(), index); }
        /// Sets `pReferenceSlots` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pReferenceSlotsAt(long index, MemorySegment value) { pReferenceSlots(this.segment(), index, value); return this; }

    }
}
