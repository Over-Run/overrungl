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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkTimelineSemaphoreSubmitInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreValueCount;
///     const uint64_t* pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValueCount;
///     const uint64_t* pSignalSemaphoreValues;
/// };
/// ```
public final class VkTimelineSemaphoreSubmitInfo extends GroupType {
    /// The struct layout of `VkTimelineSemaphoreSubmitInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValueCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValueCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreValues")
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
    /// The byte offset of `waitSemaphoreValueCount`.
    public static final long OFFSET_waitSemaphoreValueCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreValueCount"));
    /// The memory layout of `waitSemaphoreValueCount`.
    public static final MemoryLayout LAYOUT_waitSemaphoreValueCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreValueCount"));
    /// The [VarHandle] of `waitSemaphoreValueCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_waitSemaphoreValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreValueCount"));
    /// The byte offset of `pWaitSemaphoreValues`.
    public static final long OFFSET_pWaitSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The memory layout of `pWaitSemaphoreValues`.
    public static final MemoryLayout LAYOUT_pWaitSemaphoreValues = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The [VarHandle] of `pWaitSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The byte offset of `signalSemaphoreValueCount`.
    public static final long OFFSET_signalSemaphoreValueCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreValueCount"));
    /// The memory layout of `signalSemaphoreValueCount`.
    public static final MemoryLayout LAYOUT_signalSemaphoreValueCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreValueCount"));
    /// The [VarHandle] of `signalSemaphoreValueCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphoreValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreValueCount"));
    /// The byte offset of `pSignalSemaphoreValues`.
    public static final long OFFSET_pSignalSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreValues"));
    /// The memory layout of `pSignalSemaphoreValues`.
    public static final MemoryLayout LAYOUT_pSignalSemaphoreValues = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreValues"));
    /// The [VarHandle] of `pSignalSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreValues"));

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTimelineSemaphoreSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTimelineSemaphoreSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTimelineSemaphoreSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTimelineSemaphoreSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTimelineSemaphoreSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTimelineSemaphoreSubmitInfo`
    public static VkTimelineSemaphoreSubmitInfo alloc(SegmentAllocator allocator) { return new VkTimelineSemaphoreSubmitInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTimelineSemaphoreSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTimelineSemaphoreSubmitInfo`
    public static VkTimelineSemaphoreSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkTimelineSemaphoreSubmitInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo copyFrom(VkTimelineSemaphoreSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTimelineSemaphoreSubmitInfo reinterpret(long count) { return new VkTimelineSemaphoreSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTimelineSemaphoreSubmitInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTimelineSemaphoreSubmitInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `waitSemaphoreValueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int waitSemaphoreValueCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreValueCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreValueCount`}
    public int waitSemaphoreValueCount() { return waitSemaphoreValueCount(this.segment(), 0L); }
    /// Sets `waitSemaphoreValueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void waitSemaphoreValueCount(MemorySegment segment, long index, int value) { VH_waitSemaphoreValueCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreValueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(int value) { waitSemaphoreValueCount(this.segment(), 0L, value); return this; }

    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitSemaphoreValues(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreValues`}
    public MemorySegment pWaitSemaphoreValues() { return pWaitSemaphoreValues(this.segment(), 0L); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitSemaphoreValues(MemorySegment segment, long index, MemorySegment value) { VH_pWaitSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(MemorySegment value) { pWaitSemaphoreValues(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphoreValueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int signalSemaphoreValueCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreValueCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreValueCount`}
    public int signalSemaphoreValueCount() { return signalSemaphoreValueCount(this.segment(), 0L); }
    /// Sets `signalSemaphoreValueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphoreValueCount(MemorySegment segment, long index, int value) { VH_signalSemaphoreValueCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreValueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(int value) { signalSemaphoreValueCount(this.segment(), 0L, value); return this; }

    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSignalSemaphoreValues(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreValues`}
    public MemorySegment pSignalSemaphoreValues() { return pSignalSemaphoreValues(this.segment(), 0L); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSignalSemaphoreValues(MemorySegment segment, long index, MemorySegment value) { VH_pSignalSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(MemorySegment value) { pSignalSemaphoreValues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTimelineSemaphoreSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTimelineSemaphoreSubmitInfo`
    public VkTimelineSemaphoreSubmitInfo asSlice(long index) { return new VkTimelineSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTimelineSemaphoreSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTimelineSemaphoreSubmitInfo`
    public VkTimelineSemaphoreSubmitInfo asSlice(long index, long count) { return new VkTimelineSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTimelineSemaphoreSubmitInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo at(long index, Consumer<VkTimelineSemaphoreSubmitInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `waitSemaphoreValueCount` at the given index}
    /// @param index the index of the struct buffer
    public int waitSemaphoreValueCountAt(long index) { return waitSemaphoreValueCount(this.segment(), index); }
    /// Sets `waitSemaphoreValueCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCountAt(long index, int value) { waitSemaphoreValueCount(this.segment(), index, value); return this; }

    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitSemaphoreValuesAt(long index) { return pWaitSemaphoreValues(this.segment(), index); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValuesAt(long index, MemorySegment value) { pWaitSemaphoreValues(this.segment(), index, value); return this; }

    /// {@return `signalSemaphoreValueCount` at the given index}
    /// @param index the index of the struct buffer
    public int signalSemaphoreValueCountAt(long index) { return signalSemaphoreValueCount(this.segment(), index); }
    /// Sets `signalSemaphoreValueCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCountAt(long index, int value) { signalSemaphoreValueCount(this.segment(), index, value); return this; }

    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSignalSemaphoreValuesAt(long index) { return pSignalSemaphoreValues(this.segment(), index); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValuesAt(long index, MemorySegment value) { pSignalSemaphoreValues(this.segment(), index, value); return this; }

}
