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
/// ### videoUsageHints
/// [VarHandle][#VH_videoUsageHints] - [Getter][#videoUsageHints()] - [Setter][#videoUsageHints(int)]
/// ### videoContentHints
/// [VarHandle][#VH_videoContentHints] - [Getter][#videoContentHints()] - [Setter][#videoContentHints(int)]
/// ### tuningMode
/// [VarHandle][#VH_tuningMode] - [Getter][#tuningMode()] - [Setter][#tuningMode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeUsageInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoEncodeUsageFlagsKHR videoUsageHints;
///     VkVideoEncodeContentFlagsKHR videoContentHints;
///     VkVideoEncodeTuningModeKHR tuningMode;
/// } VkVideoEncodeUsageInfoKHR;
/// ```
public sealed class VkVideoEncodeUsageInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeUsageInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoUsageHints"),
        ValueLayout.JAVA_INT.withName("videoContentHints"),
        ValueLayout.JAVA_INT.withName("tuningMode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `videoUsageHints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_videoUsageHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoUsageHints"));
    /// The [VarHandle] of `videoContentHints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_videoContentHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoContentHints"));
    /// The [VarHandle] of `tuningMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tuningMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tuningMode"));

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeUsageInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeUsageInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeUsageInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeUsageInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeUsageInfoKHR`
    public static VkVideoEncodeUsageInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeUsageInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeUsageInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeUsageInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeUsageInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeUsageInfoKHR`
    public static VkVideoEncodeUsageInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkVideoEncodeUsageFlagsKHR") int videoUsageHints, @CType("VkVideoEncodeContentFlagsKHR") int videoContentHints, @CType("VkVideoEncodeTuningModeKHR") int tuningMode) { return alloc(allocator).sType(sType).pNext(pNext).videoUsageHints(videoUsageHints).videoContentHints(videoContentHints).tuningMode(tuningMode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR copyFrom(VkVideoEncodeUsageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeUsageInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeUsageInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeUsageInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeUsageInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeUsageInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoEncodeUsageInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoEncodeUsageInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoEncodeUsageInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `videoUsageHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeUsageFlagsKHR") int get_videoUsageHints(MemorySegment segment, long index) { return (int) VH_videoUsageHints.get(segment, 0L, index); }
    /// {@return `videoUsageHints`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeUsageFlagsKHR") int get_videoUsageHints(MemorySegment segment) { return VkVideoEncodeUsageInfoKHR.get_videoUsageHints(segment, 0L); }
    /// {@return `videoUsageHints`}
    public @CType("VkVideoEncodeUsageFlagsKHR") int videoUsageHints() { return VkVideoEncodeUsageInfoKHR.get_videoUsageHints(this.segment()); }
    /// Sets `videoUsageHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoUsageHints(MemorySegment segment, long index, @CType("VkVideoEncodeUsageFlagsKHR") int value) { VH_videoUsageHints.set(segment, 0L, index, value); }
    /// Sets `videoUsageHints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoUsageHints(MemorySegment segment, @CType("VkVideoEncodeUsageFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.set_videoUsageHints(segment, 0L, value); }
    /// Sets `videoUsageHints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR videoUsageHints(@CType("VkVideoEncodeUsageFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.set_videoUsageHints(this.segment(), value); return this; }

    /// {@return `videoContentHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeContentFlagsKHR") int get_videoContentHints(MemorySegment segment, long index) { return (int) VH_videoContentHints.get(segment, 0L, index); }
    /// {@return `videoContentHints`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeContentFlagsKHR") int get_videoContentHints(MemorySegment segment) { return VkVideoEncodeUsageInfoKHR.get_videoContentHints(segment, 0L); }
    /// {@return `videoContentHints`}
    public @CType("VkVideoEncodeContentFlagsKHR") int videoContentHints() { return VkVideoEncodeUsageInfoKHR.get_videoContentHints(this.segment()); }
    /// Sets `videoContentHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoContentHints(MemorySegment segment, long index, @CType("VkVideoEncodeContentFlagsKHR") int value) { VH_videoContentHints.set(segment, 0L, index, value); }
    /// Sets `videoContentHints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoContentHints(MemorySegment segment, @CType("VkVideoEncodeContentFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.set_videoContentHints(segment, 0L, value); }
    /// Sets `videoContentHints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR videoContentHints(@CType("VkVideoEncodeContentFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.set_videoContentHints(this.segment(), value); return this; }

    /// {@return `tuningMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeTuningModeKHR") int get_tuningMode(MemorySegment segment, long index) { return (int) VH_tuningMode.get(segment, 0L, index); }
    /// {@return `tuningMode`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeTuningModeKHR") int get_tuningMode(MemorySegment segment) { return VkVideoEncodeUsageInfoKHR.get_tuningMode(segment, 0L); }
    /// {@return `tuningMode`}
    public @CType("VkVideoEncodeTuningModeKHR") int tuningMode() { return VkVideoEncodeUsageInfoKHR.get_tuningMode(this.segment()); }
    /// Sets `tuningMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tuningMode(MemorySegment segment, long index, @CType("VkVideoEncodeTuningModeKHR") int value) { VH_tuningMode.set(segment, 0L, index, value); }
    /// Sets `tuningMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tuningMode(MemorySegment segment, @CType("VkVideoEncodeTuningModeKHR") int value) { VkVideoEncodeUsageInfoKHR.set_tuningMode(segment, 0L, value); }
    /// Sets `tuningMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR tuningMode(@CType("VkVideoEncodeTuningModeKHR") int value) { VkVideoEncodeUsageInfoKHR.set_tuningMode(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeUsageInfoKHR].
    public static final class Buffer extends VkVideoEncodeUsageInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeUsageInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeUsageInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeUsageInfoKHR`
        public VkVideoEncodeUsageInfoKHR asSlice(long index) { return new VkVideoEncodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeUsageInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeUsageInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeUsageInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeUsageInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoEncodeUsageInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoEncodeUsageInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `videoUsageHints` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeUsageFlagsKHR") int videoUsageHintsAt(long index) { return VkVideoEncodeUsageInfoKHR.get_videoUsageHints(this.segment(), index); }
        /// Sets `videoUsageHints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoUsageHintsAt(long index, @CType("VkVideoEncodeUsageFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.set_videoUsageHints(this.segment(), index, value); return this; }

        /// {@return `videoContentHints` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeContentFlagsKHR") int videoContentHintsAt(long index) { return VkVideoEncodeUsageInfoKHR.get_videoContentHints(this.segment(), index); }
        /// Sets `videoContentHints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoContentHintsAt(long index, @CType("VkVideoEncodeContentFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.set_videoContentHints(this.segment(), index, value); return this; }

        /// {@return `tuningMode` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeTuningModeKHR") int tuningModeAt(long index) { return VkVideoEncodeUsageInfoKHR.get_tuningMode(this.segment(), index); }
        /// Sets `tuningMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tuningModeAt(long index, @CType("VkVideoEncodeTuningModeKHR") int value) { VkVideoEncodeUsageInfoKHR.set_tuningMode(this.segment(), index, value); return this; }

    }
}
