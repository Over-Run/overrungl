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
/// struct VkVideoDecodeH264InlineSessionParametersInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const StdVideoH264SequenceParameterSet* pStdSPS;
///     const StdVideoH264PictureParameterSet* pStdPPS;
/// };
/// ```
public final class VkVideoDecodeH264InlineSessionParametersInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH264InlineSessionParametersInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSPS"),
        ValueLayout.ADDRESS.withName("pStdPPS")
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
    /// The byte offset of `pStdSPS`.
    public static final long OFFSET_pStdSPS = LAYOUT.byteOffset(PathElement.groupElement("pStdSPS"));
    /// The memory layout of `pStdSPS`.
    public static final MemoryLayout LAYOUT_pStdSPS = LAYOUT.select(PathElement.groupElement("pStdSPS"));
    /// The [VarHandle] of `pStdSPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPS"));
    /// The byte offset of `pStdPPS`.
    public static final long OFFSET_pStdPPS = LAYOUT.byteOffset(PathElement.groupElement("pStdPPS"));
    /// The memory layout of `pStdPPS`.
    public static final MemoryLayout LAYOUT_pStdPPS = LAYOUT.select(PathElement.groupElement("pStdPPS"));
    /// The [VarHandle] of `pStdPPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPS"));

    /// Creates `VkVideoDecodeH264InlineSessionParametersInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeH264InlineSessionParametersInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeH264InlineSessionParametersInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH264InlineSessionParametersInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeH264InlineSessionParametersInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeH264InlineSessionParametersInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264InlineSessionParametersInfoKHR`
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264InlineSessionParametersInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeH264InlineSessionParametersInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264InlineSessionParametersInfoKHR`
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264InlineSessionParametersInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR copyFrom(VkVideoDecodeH264InlineSessionParametersInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeH264InlineSessionParametersInfoKHR reinterpret(long count) { return new VkVideoDecodeH264InlineSessionParametersInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeH264InlineSessionParametersInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pStdSPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdSPS(MemorySegment segment, long index) { return (MemorySegment) VH_pStdSPS.get(segment, 0L, index); }
    /// {@return `pStdSPS`}
    public MemorySegment pStdSPS() { return pStdSPS(this.segment(), 0L); }
    /// Sets `pStdSPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdSPS(MemorySegment segment, long index, MemorySegment value) { VH_pStdSPS.set(segment, 0L, index, value); }
    /// Sets `pStdSPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdSPS(MemorySegment value) { pStdSPS(this.segment(), 0L, value); return this; }

    /// {@return `pStdPPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdPPS(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPPS.get(segment, 0L, index); }
    /// {@return `pStdPPS`}
    public MemorySegment pStdPPS() { return pStdPPS(this.segment(), 0L); }
    /// Sets `pStdPPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdPPS(MemorySegment segment, long index, MemorySegment value) { VH_pStdPPS.set(segment, 0L, index, value); }
    /// Sets `pStdPPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdPPS(MemorySegment value) { pStdPPS(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeH264InlineSessionParametersInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH264InlineSessionParametersInfoKHR`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR asSlice(long index) { return new VkVideoDecodeH264InlineSessionParametersInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeH264InlineSessionParametersInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH264InlineSessionParametersInfoKHR`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH264InlineSessionParametersInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeH264InlineSessionParametersInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR at(long index, Consumer<VkVideoDecodeH264InlineSessionParametersInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pStdSPS` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdSPSAt(long index) { return pStdSPS(this.segment(), index); }
    /// Sets `pStdSPS` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdSPSAt(long index, MemorySegment value) { pStdSPS(this.segment(), index, value); return this; }

    /// {@return `pStdPPS` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPPSAt(long index) { return pStdPPS(this.segment(), index); }
    /// Sets `pStdPPS` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdPPSAt(long index, MemorySegment value) { pStdPPS(this.segment(), index, value); return this; }

}
