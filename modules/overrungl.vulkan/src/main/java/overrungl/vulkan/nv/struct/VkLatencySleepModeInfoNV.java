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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkLatencySleepModeInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 lowLatencyMode;
///     VkBool32 lowLatencyBoost;
///     uint32_t minimumIntervalUs;
/// };
/// ```
public sealed class VkLatencySleepModeInfoNV extends GroupType {
    /// The struct layout of `VkLatencySleepModeInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lowLatencyMode"),
        ValueLayout.JAVA_INT.withName("lowLatencyBoost"),
        ValueLayout.JAVA_INT.withName("minimumIntervalUs")
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
    /// The byte offset of `lowLatencyMode`.
    public static final long OFFSET_lowLatencyMode = LAYOUT.byteOffset(PathElement.groupElement("lowLatencyMode"));
    /// The memory layout of `lowLatencyMode`.
    public static final MemoryLayout LAYOUT_lowLatencyMode = LAYOUT.select(PathElement.groupElement("lowLatencyMode"));
    /// The [VarHandle] of `lowLatencyMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lowLatencyMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lowLatencyMode"));
    /// The byte offset of `lowLatencyBoost`.
    public static final long OFFSET_lowLatencyBoost = LAYOUT.byteOffset(PathElement.groupElement("lowLatencyBoost"));
    /// The memory layout of `lowLatencyBoost`.
    public static final MemoryLayout LAYOUT_lowLatencyBoost = LAYOUT.select(PathElement.groupElement("lowLatencyBoost"));
    /// The [VarHandle] of `lowLatencyBoost` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lowLatencyBoost = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lowLatencyBoost"));
    /// The byte offset of `minimumIntervalUs`.
    public static final long OFFSET_minimumIntervalUs = LAYOUT.byteOffset(PathElement.groupElement("minimumIntervalUs"));
    /// The memory layout of `minimumIntervalUs`.
    public static final MemoryLayout LAYOUT_minimumIntervalUs = LAYOUT.select(PathElement.groupElement("minimumIntervalUs"));
    /// The [VarHandle] of `minimumIntervalUs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minimumIntervalUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minimumIntervalUs"));

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkLatencySleepModeInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepModeInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepModeInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLatencySleepModeInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySleepModeInfoNV`
    public static VkLatencySleepModeInfoNV alloc(SegmentAllocator allocator) { return new VkLatencySleepModeInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLatencySleepModeInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySleepModeInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencySleepModeInfoNV copyFrom(VkLatencySleepModeInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkLatencySleepModeInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkLatencySleepModeInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `lowLatencyMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lowLatencyMode(MemorySegment segment, long index) { return (int) VH_lowLatencyMode.get(segment, 0L, index); }
    /// {@return `lowLatencyMode`}
    public int lowLatencyMode() { return lowLatencyMode(this.segment(), 0L); }
    /// Sets `lowLatencyMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lowLatencyMode(MemorySegment segment, long index, int value) { VH_lowLatencyMode.set(segment, 0L, index, value); }
    /// Sets `lowLatencyMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV lowLatencyMode(int value) { lowLatencyMode(this.segment(), 0L, value); return this; }

    /// {@return `lowLatencyBoost` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lowLatencyBoost(MemorySegment segment, long index) { return (int) VH_lowLatencyBoost.get(segment, 0L, index); }
    /// {@return `lowLatencyBoost`}
    public int lowLatencyBoost() { return lowLatencyBoost(this.segment(), 0L); }
    /// Sets `lowLatencyBoost` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lowLatencyBoost(MemorySegment segment, long index, int value) { VH_lowLatencyBoost.set(segment, 0L, index, value); }
    /// Sets `lowLatencyBoost` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV lowLatencyBoost(int value) { lowLatencyBoost(this.segment(), 0L, value); return this; }

    /// {@return `minimumIntervalUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minimumIntervalUs(MemorySegment segment, long index) { return (int) VH_minimumIntervalUs.get(segment, 0L, index); }
    /// {@return `minimumIntervalUs`}
    public int minimumIntervalUs() { return minimumIntervalUs(this.segment(), 0L); }
    /// Sets `minimumIntervalUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minimumIntervalUs(MemorySegment segment, long index, int value) { VH_minimumIntervalUs.set(segment, 0L, index, value); }
    /// Sets `minimumIntervalUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV minimumIntervalUs(int value) { minimumIntervalUs(this.segment(), 0L, value); return this; }

    /// A buffer of [VkLatencySleepModeInfoNV].
    public static final class Buffer extends VkLatencySleepModeInfoNV {
        private final long elementCount;

        /// Creates `VkLatencySleepModeInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLatencySleepModeInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLatencySleepModeInfoNV`
        public VkLatencySleepModeInfoNV asSlice(long index) { return new VkLatencySleepModeInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLatencySleepModeInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLatencySleepModeInfoNV`
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

        /// {@return `lowLatencyMode` at the given index}
        /// @param index the index of the struct buffer
        public int lowLatencyModeAt(long index) { return lowLatencyMode(this.segment(), index); }
        /// Sets `lowLatencyMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer lowLatencyModeAt(long index, int value) { lowLatencyMode(this.segment(), index, value); return this; }

        /// {@return `lowLatencyBoost` at the given index}
        /// @param index the index of the struct buffer
        public int lowLatencyBoostAt(long index) { return lowLatencyBoost(this.segment(), index); }
        /// Sets `lowLatencyBoost` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer lowLatencyBoostAt(long index, int value) { lowLatencyBoost(this.segment(), index, value); return this; }

        /// {@return `minimumIntervalUs` at the given index}
        /// @param index the index of the struct buffer
        public int minimumIntervalUsAt(long index) { return minimumIntervalUs(this.segment(), index); }
        /// Sets `minimumIntervalUs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minimumIntervalUsAt(long index, int value) { minimumIntervalUs(this.segment(), index, value); return this; }

    }
}
