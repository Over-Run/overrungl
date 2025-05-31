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
/// struct VkVideoEncodeAV1RateControlInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeAV1RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t keyFramePeriod;
///     uint32_t consecutiveBipredictiveFrameCount;
///     uint32_t temporalLayerCount;
/// };
/// ```
public sealed class VkVideoEncodeAV1RateControlInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1RateControlInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("keyFramePeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("temporalLayerCount")
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
    /// The byte offset of `gopFrameCount`.
    public static final long OFFSET_gopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
    /// The memory layout of `gopFrameCount`.
    public static final MemoryLayout LAYOUT_gopFrameCount = LAYOUT.select(PathElement.groupElement("gopFrameCount"));
    /// The [VarHandle] of `gopFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    /// The byte offset of `keyFramePeriod`.
    public static final long OFFSET_keyFramePeriod = LAYOUT.byteOffset(PathElement.groupElement("keyFramePeriod"));
    /// The memory layout of `keyFramePeriod`.
    public static final MemoryLayout LAYOUT_keyFramePeriod = LAYOUT.select(PathElement.groupElement("keyFramePeriod"));
    /// The [VarHandle] of `keyFramePeriod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_keyFramePeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("keyFramePeriod"));
    /// The byte offset of `consecutiveBipredictiveFrameCount`.
    public static final long OFFSET_consecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    /// The memory layout of `consecutiveBipredictiveFrameCount`.
    public static final MemoryLayout LAYOUT_consecutiveBipredictiveFrameCount = LAYOUT.select(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    /// The [VarHandle] of `consecutiveBipredictiveFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_consecutiveBipredictiveFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    /// The byte offset of `temporalLayerCount`.
    public static final long OFFSET_temporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("temporalLayerCount"));
    /// The memory layout of `temporalLayerCount`.
    public static final MemoryLayout LAYOUT_temporalLayerCount = LAYOUT.select(PathElement.groupElement("temporalLayerCount"));
    /// The [VarHandle] of `temporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_temporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporalLayerCount"));

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1RateControlInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1RateControlInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1RateControlInfoKHR`
    public static VkVideoEncodeAV1RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1RateControlInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1RateControlInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1RateControlInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR copyFrom(VkVideoEncodeAV1RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeAV1RateControlInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1RateControlInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1RateControlInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `gopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopFrameCount(MemorySegment segment, long index) { return (int) VH_gopFrameCount.get(segment, 0L, index); }
    /// {@return `gopFrameCount`}
    public int gopFrameCount() { return gopFrameCount(this.segment(), 0L); }
    /// Sets `gopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopFrameCount(MemorySegment segment, long index, int value) { VH_gopFrameCount.set(segment, 0L, index, value); }
    /// Sets `gopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCount(int value) { gopFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `keyFramePeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int keyFramePeriod(MemorySegment segment, long index) { return (int) VH_keyFramePeriod.get(segment, 0L, index); }
    /// {@return `keyFramePeriod`}
    public int keyFramePeriod() { return keyFramePeriod(this.segment(), 0L); }
    /// Sets `keyFramePeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void keyFramePeriod(MemorySegment segment, long index, int value) { VH_keyFramePeriod.set(segment, 0L, index, value); }
    /// Sets `keyFramePeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriod(int value) { keyFramePeriod(this.segment(), 0L, value); return this; }

    /// {@return `consecutiveBipredictiveFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int consecutiveBipredictiveFrameCount(MemorySegment segment, long index) { return (int) VH_consecutiveBipredictiveFrameCount.get(segment, 0L, index); }
    /// {@return `consecutiveBipredictiveFrameCount`}
    public int consecutiveBipredictiveFrameCount() { return consecutiveBipredictiveFrameCount(this.segment(), 0L); }
    /// Sets `consecutiveBipredictiveFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void consecutiveBipredictiveFrameCount(MemorySegment segment, long index, int value) { VH_consecutiveBipredictiveFrameCount.set(segment, 0L, index, value); }
    /// Sets `consecutiveBipredictiveFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCount(int value) { consecutiveBipredictiveFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `temporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int temporalLayerCount(MemorySegment segment, long index) { return (int) VH_temporalLayerCount.get(segment, 0L, index); }
    /// {@return `temporalLayerCount`}
    public int temporalLayerCount() { return temporalLayerCount(this.segment(), 0L); }
    /// Sets `temporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void temporalLayerCount(MemorySegment segment, long index, int value) { VH_temporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `temporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCount(int value) { temporalLayerCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeAV1RateControlInfoKHR].
    public static final class Buffer extends VkVideoEncodeAV1RateControlInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1RateControlInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1RateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1RateControlInfoKHR`
        public VkVideoEncodeAV1RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeAV1RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1RateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1RateControlInfoKHR`
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

        /// {@return `gopFrameCount` at the given index}
        /// @param index the index of the struct buffer
        public int gopFrameCountAt(long index) { return gopFrameCount(this.segment(), index); }
        /// Sets `gopFrameCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gopFrameCountAt(long index, int value) { gopFrameCount(this.segment(), index, value); return this; }

        /// {@return `keyFramePeriod` at the given index}
        /// @param index the index of the struct buffer
        public int keyFramePeriodAt(long index) { return keyFramePeriod(this.segment(), index); }
        /// Sets `keyFramePeriod` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer keyFramePeriodAt(long index, int value) { keyFramePeriod(this.segment(), index, value); return this; }

        /// {@return `consecutiveBipredictiveFrameCount` at the given index}
        /// @param index the index of the struct buffer
        public int consecutiveBipredictiveFrameCountAt(long index) { return consecutiveBipredictiveFrameCount(this.segment(), index); }
        /// Sets `consecutiveBipredictiveFrameCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer consecutiveBipredictiveFrameCountAt(long index, int value) { consecutiveBipredictiveFrameCount(this.segment(), index, value); return this; }

        /// {@return `temporalLayerCount` at the given index}
        /// @param index the index of the struct buffer
        public int temporalLayerCountAt(long index) { return temporalLayerCount(this.segment(), index); }
        /// Sets `temporalLayerCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer temporalLayerCountAt(long index, int value) { temporalLayerCount(this.segment(), index, value); return this; }

    }
}
