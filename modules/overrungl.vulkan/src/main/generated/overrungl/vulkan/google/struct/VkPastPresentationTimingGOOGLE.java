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
package overrungl.vulkan.google.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPastPresentationTimingGOOGLE`.
/// ## Layout
/// ```
/// struct VkPastPresentationTimingGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
///     uint64_t actualPresentTime;
///     uint64_t earliestPresentTime;
///     uint64_t presentMargin;
/// };
/// ```
public final class VkPastPresentationTimingGOOGLE extends GroupType {
    /// The struct layout of `VkPastPresentationTimingGOOGLE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime"),
        ValueLayout.JAVA_LONG.withName("actualPresentTime"),
        ValueLayout.JAVA_LONG.withName("earliestPresentTime"),
        ValueLayout.JAVA_LONG.withName("presentMargin")
    );
    /// The byte offset of `presentID`.
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    /// The memory layout of `presentID`.
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The byte offset of `desiredPresentTime`.
    public static final long OFFSET_desiredPresentTime = LAYOUT.byteOffset(PathElement.groupElement("desiredPresentTime"));
    /// The memory layout of `desiredPresentTime`.
    public static final MemoryLayout LAYOUT_desiredPresentTime = LAYOUT.select(PathElement.groupElement("desiredPresentTime"));
    /// The [VarHandle] of `desiredPresentTime` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_desiredPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("desiredPresentTime"));
    /// The byte offset of `actualPresentTime`.
    public static final long OFFSET_actualPresentTime = LAYOUT.byteOffset(PathElement.groupElement("actualPresentTime"));
    /// The memory layout of `actualPresentTime`.
    public static final MemoryLayout LAYOUT_actualPresentTime = LAYOUT.select(PathElement.groupElement("actualPresentTime"));
    /// The [VarHandle] of `actualPresentTime` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_actualPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("actualPresentTime"));
    /// The byte offset of `earliestPresentTime`.
    public static final long OFFSET_earliestPresentTime = LAYOUT.byteOffset(PathElement.groupElement("earliestPresentTime"));
    /// The memory layout of `earliestPresentTime`.
    public static final MemoryLayout LAYOUT_earliestPresentTime = LAYOUT.select(PathElement.groupElement("earliestPresentTime"));
    /// The [VarHandle] of `earliestPresentTime` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_earliestPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earliestPresentTime"));
    /// The byte offset of `presentMargin`.
    public static final long OFFSET_presentMargin = LAYOUT.byteOffset(PathElement.groupElement("presentMargin"));
    /// The memory layout of `presentMargin`.
    public static final MemoryLayout LAYOUT_presentMargin = LAYOUT.select(PathElement.groupElement("presentMargin"));
    /// The [VarHandle] of `presentMargin` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentMargin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMargin"));

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPastPresentationTimingGOOGLE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPastPresentationTimingGOOGLE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPastPresentationTimingGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPastPresentationTimingGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPastPresentationTimingGOOGLE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPastPresentationTimingGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPastPresentationTimingGOOGLE`
    public static VkPastPresentationTimingGOOGLE alloc(SegmentAllocator allocator) { return new VkPastPresentationTimingGOOGLE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPastPresentationTimingGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPastPresentationTimingGOOGLE`
    public static VkPastPresentationTimingGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkPastPresentationTimingGOOGLE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPastPresentationTimingGOOGLE copyFrom(VkPastPresentationTimingGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPastPresentationTimingGOOGLE reinterpret(long count) { return new VkPastPresentationTimingGOOGLE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentID(MemorySegment segment, long index) { return (int) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    public int presentID() { return presentID(this.segment(), 0L); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentID(MemorySegment segment, long index, int value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE presentID(int value) { presentID(this.segment(), 0L, value); return this; }

    /// {@return `desiredPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long desiredPresentTime(MemorySegment segment, long index) { return (long) VH_desiredPresentTime.get(segment, 0L, index); }
    /// {@return `desiredPresentTime`}
    public long desiredPresentTime() { return desiredPresentTime(this.segment(), 0L); }
    /// Sets `desiredPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void desiredPresentTime(MemorySegment segment, long index, long value) { VH_desiredPresentTime.set(segment, 0L, index, value); }
    /// Sets `desiredPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE desiredPresentTime(long value) { desiredPresentTime(this.segment(), 0L, value); return this; }

    /// {@return `actualPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long actualPresentTime(MemorySegment segment, long index) { return (long) VH_actualPresentTime.get(segment, 0L, index); }
    /// {@return `actualPresentTime`}
    public long actualPresentTime() { return actualPresentTime(this.segment(), 0L); }
    /// Sets `actualPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void actualPresentTime(MemorySegment segment, long index, long value) { VH_actualPresentTime.set(segment, 0L, index, value); }
    /// Sets `actualPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE actualPresentTime(long value) { actualPresentTime(this.segment(), 0L, value); return this; }

    /// {@return `earliestPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long earliestPresentTime(MemorySegment segment, long index) { return (long) VH_earliestPresentTime.get(segment, 0L, index); }
    /// {@return `earliestPresentTime`}
    public long earliestPresentTime() { return earliestPresentTime(this.segment(), 0L); }
    /// Sets `earliestPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void earliestPresentTime(MemorySegment segment, long index, long value) { VH_earliestPresentTime.set(segment, 0L, index, value); }
    /// Sets `earliestPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE earliestPresentTime(long value) { earliestPresentTime(this.segment(), 0L, value); return this; }

    /// {@return `presentMargin` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentMargin(MemorySegment segment, long index) { return (long) VH_presentMargin.get(segment, 0L, index); }
    /// {@return `presentMargin`}
    public long presentMargin() { return presentMargin(this.segment(), 0L); }
    /// Sets `presentMargin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentMargin(MemorySegment segment, long index, long value) { VH_presentMargin.set(segment, 0L, index, value); }
    /// Sets `presentMargin` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE presentMargin(long value) { presentMargin(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPastPresentationTimingGOOGLE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPastPresentationTimingGOOGLE`
    public VkPastPresentationTimingGOOGLE asSlice(long index) { return new VkPastPresentationTimingGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPastPresentationTimingGOOGLE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPastPresentationTimingGOOGLE`
    public VkPastPresentationTimingGOOGLE asSlice(long index, long count) { return new VkPastPresentationTimingGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPastPresentationTimingGOOGLE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPastPresentationTimingGOOGLE at(long index, Consumer<VkPastPresentationTimingGOOGLE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `presentID` at the given index}
    /// @param index the index of the struct buffer
    public int presentIDAt(long index) { return presentID(this.segment(), index); }
    /// Sets `presentID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE presentIDAt(long index, int value) { presentID(this.segment(), index, value); return this; }

    /// {@return `desiredPresentTime` at the given index}
    /// @param index the index of the struct buffer
    public long desiredPresentTimeAt(long index) { return desiredPresentTime(this.segment(), index); }
    /// Sets `desiredPresentTime` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE desiredPresentTimeAt(long index, long value) { desiredPresentTime(this.segment(), index, value); return this; }

    /// {@return `actualPresentTime` at the given index}
    /// @param index the index of the struct buffer
    public long actualPresentTimeAt(long index) { return actualPresentTime(this.segment(), index); }
    /// Sets `actualPresentTime` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE actualPresentTimeAt(long index, long value) { actualPresentTime(this.segment(), index, value); return this; }

    /// {@return `earliestPresentTime` at the given index}
    /// @param index the index of the struct buffer
    public long earliestPresentTimeAt(long index) { return earliestPresentTime(this.segment(), index); }
    /// Sets `earliestPresentTime` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE earliestPresentTimeAt(long index, long value) { earliestPresentTime(this.segment(), index, value); return this; }

    /// {@return `presentMargin` at the given index}
    /// @param index the index of the struct buffer
    public long presentMarginAt(long index) { return presentMargin(this.segment(), index); }
    /// Sets `presentMargin` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPastPresentationTimingGOOGLE presentMarginAt(long index, long value) { presentMargin(this.segment(), index, value); return this; }

}
