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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeUsageInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeUsageFlagsKHR videoUsageHints;
///     ((uint32_t) VkFlags) VkVideoEncodeContentFlagsKHR videoContentHints;
///     (int) VkVideoEncodeTuningModeKHR tuningMode;
/// };
/// ```
public final class VkVideoEncodeUsageInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeUsageInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoUsageHints"),
        ValueLayout.JAVA_INT.withName("videoContentHints"),
        ValueLayout.JAVA_INT.withName("tuningMode")
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
    /// The byte offset of `videoUsageHints`.
    public static final long OFFSET_videoUsageHints = LAYOUT.byteOffset(PathElement.groupElement("videoUsageHints"));
    /// The memory layout of `videoUsageHints`.
    public static final MemoryLayout LAYOUT_videoUsageHints = LAYOUT.select(PathElement.groupElement("videoUsageHints"));
    /// The [VarHandle] of `videoUsageHints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoUsageHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoUsageHints"));
    /// The byte offset of `videoContentHints`.
    public static final long OFFSET_videoContentHints = LAYOUT.byteOffset(PathElement.groupElement("videoContentHints"));
    /// The memory layout of `videoContentHints`.
    public static final MemoryLayout LAYOUT_videoContentHints = LAYOUT.select(PathElement.groupElement("videoContentHints"));
    /// The [VarHandle] of `videoContentHints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoContentHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoContentHints"));
    /// The byte offset of `tuningMode`.
    public static final long OFFSET_tuningMode = LAYOUT.byteOffset(PathElement.groupElement("tuningMode"));
    /// The memory layout of `tuningMode`.
    public static final MemoryLayout LAYOUT_tuningMode = LAYOUT.select(PathElement.groupElement("tuningMode"));
    /// The [VarHandle] of `tuningMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tuningMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tuningMode"));

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeUsageInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeUsageInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeUsageInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeUsageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeUsageInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeUsageInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeUsageInfoKHR`
    public static VkVideoEncodeUsageInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeUsageInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeUsageInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeUsageInfoKHR`
    public static VkVideoEncodeUsageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeUsageInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR copyFrom(VkVideoEncodeUsageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeUsageInfoKHR reinterpret(long count) { return new VkVideoEncodeUsageInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeUsageInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeUsageInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `videoUsageHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int videoUsageHints(MemorySegment segment, long index) { return (int) VH_videoUsageHints.get(segment, 0L, index); }
    /// {@return `videoUsageHints`}
    public int videoUsageHints() { return videoUsageHints(this.segment(), 0L); }
    /// Sets `videoUsageHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoUsageHints(MemorySegment segment, long index, int value) { VH_videoUsageHints.set(segment, 0L, index, value); }
    /// Sets `videoUsageHints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR videoUsageHints(int value) { videoUsageHints(this.segment(), 0L, value); return this; }

    /// {@return `videoContentHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int videoContentHints(MemorySegment segment, long index) { return (int) VH_videoContentHints.get(segment, 0L, index); }
    /// {@return `videoContentHints`}
    public int videoContentHints() { return videoContentHints(this.segment(), 0L); }
    /// Sets `videoContentHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoContentHints(MemorySegment segment, long index, int value) { VH_videoContentHints.set(segment, 0L, index, value); }
    /// Sets `videoContentHints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR videoContentHints(int value) { videoContentHints(this.segment(), 0L, value); return this; }

    /// {@return `tuningMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tuningMode(MemorySegment segment, long index) { return (int) VH_tuningMode.get(segment, 0L, index); }
    /// {@return `tuningMode`}
    public int tuningMode() { return tuningMode(this.segment(), 0L); }
    /// Sets `tuningMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tuningMode(MemorySegment segment, long index, int value) { VH_tuningMode.set(segment, 0L, index, value); }
    /// Sets `tuningMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR tuningMode(int value) { tuningMode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeUsageInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeUsageInfoKHR`
    public VkVideoEncodeUsageInfoKHR asSlice(long index) { return new VkVideoEncodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeUsageInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeUsageInfoKHR`
    public VkVideoEncodeUsageInfoKHR asSlice(long index, long count) { return new VkVideoEncodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeUsageInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR at(long index, Consumer<VkVideoEncodeUsageInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `videoUsageHints` at the given index}
    /// @param index the index of the struct buffer
    public int videoUsageHintsAt(long index) { return videoUsageHints(this.segment(), index); }
    /// Sets `videoUsageHints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR videoUsageHintsAt(long index, int value) { videoUsageHints(this.segment(), index, value); return this; }

    /// {@return `videoContentHints` at the given index}
    /// @param index the index of the struct buffer
    public int videoContentHintsAt(long index) { return videoContentHints(this.segment(), index); }
    /// Sets `videoContentHints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR videoContentHintsAt(long index, int value) { videoContentHints(this.segment(), index, value); return this; }

    /// {@return `tuningMode` at the given index}
    /// @param index the index of the struct buffer
    public int tuningModeAt(long index) { return tuningMode(this.segment(), index); }
    /// Sets `tuningMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeUsageInfoKHR tuningModeAt(long index, int value) { tuningMode(this.segment(), index, value); return this; }

}
