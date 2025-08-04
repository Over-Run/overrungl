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
/// struct VkVideoEncodeH264SessionParametersFeedbackInfoKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 hasStdSPSOverrides;
///     (uint32_t) VkBool32 hasStdPPSOverrides;
/// };
/// ```
public final class VkVideoEncodeH264SessionParametersFeedbackInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasStdSPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdPPSOverrides")
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
    /// The byte offset of `hasStdSPSOverrides`.
    public static final long OFFSET_hasStdSPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdSPSOverrides"));
    /// The memory layout of `hasStdSPSOverrides`.
    public static final MemoryLayout LAYOUT_hasStdSPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdSPSOverrides"));
    /// The [VarHandle] of `hasStdSPSOverrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hasStdSPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdSPSOverrides"));
    /// The byte offset of `hasStdPPSOverrides`.
    public static final long OFFSET_hasStdPPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdPPSOverrides"));
    /// The memory layout of `hasStdPPSOverrides`.
    public static final MemoryLayout LAYOUT_hasStdPPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdPPSOverrides"));
    /// The [VarHandle] of `hasStdPPSOverrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hasStdPPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdPPSOverrides"));

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR copyFrom(VkVideoEncodeH264SessionParametersFeedbackInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR reinterpret(long count) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasStdSPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdSPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdSPSOverrides`}
    public int hasStdSPSOverrides() { return hasStdSPSOverrides(this.segment(), 0L); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasStdSPSOverrides(MemorySegment segment, long index, int value) { VH_hasStdSPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdSPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdSPSOverrides(int value) { hasStdSPSOverrides(this.segment(), 0L, value); return this; }

    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasStdPPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdPPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdPPSOverrides`}
    public int hasStdPPSOverrides() { return hasStdPPSOverrides(this.segment(), 0L); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasStdPPSOverrides(MemorySegment segment, long index, int value) { VH_hasStdPPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdPPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdPPSOverrides(int value) { hasStdPPSOverrides(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR at(long index, Consumer<VkVideoEncodeH264SessionParametersFeedbackInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param index the index of the struct buffer
    public int hasStdSPSOverridesAt(long index) { return hasStdSPSOverrides(this.segment(), index); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdSPSOverridesAt(long index, int value) { hasStdSPSOverrides(this.segment(), index, value); return this; }

    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param index the index of the struct buffer
    public int hasStdPPSOverridesAt(long index) { return hasStdPPSOverrides(this.segment(), index); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdPPSOverridesAt(long index, int value) { hasStdPPSOverrides(this.segment(), index, value); return this; }

}
