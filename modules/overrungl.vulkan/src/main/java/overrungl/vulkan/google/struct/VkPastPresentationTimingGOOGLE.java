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
package overrungl.vulkan.google.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### presentID
/// [VarHandle][#VH_presentID] - [Getter][#presentID()] - [Setter][#presentID(int)]
/// ### desiredPresentTime
/// [VarHandle][#VH_desiredPresentTime] - [Getter][#desiredPresentTime()] - [Setter][#desiredPresentTime(long)]
/// ### actualPresentTime
/// [VarHandle][#VH_actualPresentTime] - [Getter][#actualPresentTime()] - [Setter][#actualPresentTime(long)]
/// ### earliestPresentTime
/// [VarHandle][#VH_earliestPresentTime] - [Getter][#earliestPresentTime()] - [Setter][#earliestPresentTime(long)]
/// ### presentMargin
/// [VarHandle][#VH_presentMargin] - [Getter][#presentMargin()] - [Setter][#presentMargin(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPastPresentationTimingGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
///     uint64_t actualPresentTime;
///     uint64_t earliestPresentTime;
///     uint64_t presentMargin;
/// } VkPastPresentationTimingGOOGLE;
/// ```
public sealed class VkPastPresentationTimingGOOGLE extends Struct {
    /// The struct layout of `VkPastPresentationTimingGOOGLE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime"),
        ValueLayout.JAVA_LONG.withName("actualPresentTime"),
        ValueLayout.JAVA_LONG.withName("earliestPresentTime"),
        ValueLayout.JAVA_LONG.withName("presentMargin")
    );
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `desiredPresentTime` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_desiredPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("desiredPresentTime"));
    /// The [VarHandle] of `actualPresentTime` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_actualPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("actualPresentTime"));
    /// The [VarHandle] of `earliestPresentTime` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_earliestPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earliestPresentTime"));
    /// The [VarHandle] of `presentMargin` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_presentMargin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMargin"));

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    /// @param segment the memory segment
    public VkPastPresentationTimingGOOGLE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPastPresentationTimingGOOGLE of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPastPresentationTimingGOOGLE ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPastPresentationTimingGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPastPresentationTimingGOOGLE`
    public static VkPastPresentationTimingGOOGLE alloc(SegmentAllocator allocator) { return new VkPastPresentationTimingGOOGLE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPastPresentationTimingGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPastPresentationTimingGOOGLE`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPastPresentationTimingGOOGLE` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPastPresentationTimingGOOGLE`
    public static VkPastPresentationTimingGOOGLE allocInit(SegmentAllocator allocator, @CType("uint32_t") int presentID, @CType("uint64_t") long desiredPresentTime, @CType("uint64_t") long actualPresentTime, @CType("uint64_t") long earliestPresentTime, @CType("uint64_t") long presentMargin) { return alloc(allocator).presentID(presentID).desiredPresentTime(desiredPresentTime).actualPresentTime(actualPresentTime).earliestPresentTime(earliestPresentTime).presentMargin(presentMargin); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPastPresentationTimingGOOGLE copyFrom(VkPastPresentationTimingGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_presentID(MemorySegment segment, long index) { return (int) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_presentID(MemorySegment segment) { return VkPastPresentationTimingGOOGLE.get_presentID(segment, 0L); }
    /// {@return `presentID`}
    public @CType("uint32_t") int presentID() { return VkPastPresentationTimingGOOGLE.get_presentID(this.segment()); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, @CType("uint32_t") int value) { VkPastPresentationTimingGOOGLE.set_presentID(segment, 0L, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE presentID(@CType("uint32_t") int value) { VkPastPresentationTimingGOOGLE.set_presentID(this.segment(), value); return this; }

    /// {@return `desiredPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_desiredPresentTime(MemorySegment segment, long index) { return (long) VH_desiredPresentTime.get(segment, 0L, index); }
    /// {@return `desiredPresentTime`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_desiredPresentTime(MemorySegment segment) { return VkPastPresentationTimingGOOGLE.get_desiredPresentTime(segment, 0L); }
    /// {@return `desiredPresentTime`}
    public @CType("uint64_t") long desiredPresentTime() { return VkPastPresentationTimingGOOGLE.get_desiredPresentTime(this.segment()); }
    /// Sets `desiredPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_desiredPresentTime(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_desiredPresentTime.set(segment, 0L, index, value); }
    /// Sets `desiredPresentTime` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_desiredPresentTime(MemorySegment segment, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_desiredPresentTime(segment, 0L, value); }
    /// Sets `desiredPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE desiredPresentTime(@CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_desiredPresentTime(this.segment(), value); return this; }

    /// {@return `actualPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_actualPresentTime(MemorySegment segment, long index) { return (long) VH_actualPresentTime.get(segment, 0L, index); }
    /// {@return `actualPresentTime`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_actualPresentTime(MemorySegment segment) { return VkPastPresentationTimingGOOGLE.get_actualPresentTime(segment, 0L); }
    /// {@return `actualPresentTime`}
    public @CType("uint64_t") long actualPresentTime() { return VkPastPresentationTimingGOOGLE.get_actualPresentTime(this.segment()); }
    /// Sets `actualPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_actualPresentTime(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_actualPresentTime.set(segment, 0L, index, value); }
    /// Sets `actualPresentTime` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_actualPresentTime(MemorySegment segment, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_actualPresentTime(segment, 0L, value); }
    /// Sets `actualPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE actualPresentTime(@CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_actualPresentTime(this.segment(), value); return this; }

    /// {@return `earliestPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_earliestPresentTime(MemorySegment segment, long index) { return (long) VH_earliestPresentTime.get(segment, 0L, index); }
    /// {@return `earliestPresentTime`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_earliestPresentTime(MemorySegment segment) { return VkPastPresentationTimingGOOGLE.get_earliestPresentTime(segment, 0L); }
    /// {@return `earliestPresentTime`}
    public @CType("uint64_t") long earliestPresentTime() { return VkPastPresentationTimingGOOGLE.get_earliestPresentTime(this.segment()); }
    /// Sets `earliestPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_earliestPresentTime(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_earliestPresentTime.set(segment, 0L, index, value); }
    /// Sets `earliestPresentTime` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_earliestPresentTime(MemorySegment segment, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_earliestPresentTime(segment, 0L, value); }
    /// Sets `earliestPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE earliestPresentTime(@CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_earliestPresentTime(this.segment(), value); return this; }

    /// {@return `presentMargin` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_presentMargin(MemorySegment segment, long index) { return (long) VH_presentMargin.get(segment, 0L, index); }
    /// {@return `presentMargin`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_presentMargin(MemorySegment segment) { return VkPastPresentationTimingGOOGLE.get_presentMargin(segment, 0L); }
    /// {@return `presentMargin`}
    public @CType("uint64_t") long presentMargin() { return VkPastPresentationTimingGOOGLE.get_presentMargin(this.segment()); }
    /// Sets `presentMargin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentMargin(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_presentMargin.set(segment, 0L, index, value); }
    /// Sets `presentMargin` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentMargin(MemorySegment segment, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_presentMargin(segment, 0L, value); }
    /// Sets `presentMargin` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE presentMargin(@CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_presentMargin(this.segment(), value); return this; }

    /// A buffer of [VkPastPresentationTimingGOOGLE].
    public static final class Buffer extends VkPastPresentationTimingGOOGLE {
        private final long elementCount;

        /// Creates `VkPastPresentationTimingGOOGLE.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPastPresentationTimingGOOGLE`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPastPresentationTimingGOOGLE`
        public VkPastPresentationTimingGOOGLE asSlice(long index) { return new VkPastPresentationTimingGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPastPresentationTimingGOOGLE`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPastPresentationTimingGOOGLE`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `presentID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int presentIDAt(long index) { return VkPastPresentationTimingGOOGLE.get_presentID(this.segment(), index); }
        /// Sets `presentID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentIDAt(long index, @CType("uint32_t") int value) { VkPastPresentationTimingGOOGLE.set_presentID(this.segment(), index, value); return this; }

        /// {@return `desiredPresentTime` at the given index}
        /// @param index the index
        public @CType("uint64_t") long desiredPresentTimeAt(long index) { return VkPastPresentationTimingGOOGLE.get_desiredPresentTime(this.segment(), index); }
        /// Sets `desiredPresentTime` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer desiredPresentTimeAt(long index, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_desiredPresentTime(this.segment(), index, value); return this; }

        /// {@return `actualPresentTime` at the given index}
        /// @param index the index
        public @CType("uint64_t") long actualPresentTimeAt(long index) { return VkPastPresentationTimingGOOGLE.get_actualPresentTime(this.segment(), index); }
        /// Sets `actualPresentTime` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer actualPresentTimeAt(long index, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_actualPresentTime(this.segment(), index, value); return this; }

        /// {@return `earliestPresentTime` at the given index}
        /// @param index the index
        public @CType("uint64_t") long earliestPresentTimeAt(long index) { return VkPastPresentationTimingGOOGLE.get_earliestPresentTime(this.segment(), index); }
        /// Sets `earliestPresentTime` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer earliestPresentTimeAt(long index, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_earliestPresentTime(this.segment(), index, value); return this; }

        /// {@return `presentMargin` at the given index}
        /// @param index the index
        public @CType("uint64_t") long presentMarginAt(long index) { return VkPastPresentationTimingGOOGLE.get_presentMargin(this.segment(), index); }
        /// Sets `presentMargin` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentMarginAt(long index, @CType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.set_presentMargin(this.segment(), index, value); return this; }

    }
}
