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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeSessionParametersGetInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeSessionParametersGetInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkVideoSessionParametersKHR videoSessionParameters;
/// };
/// ```
public final class VkVideoEncodeSessionParametersGetInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeSessionParametersGetInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("videoSessionParameters")
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
    /// The byte offset of `videoSessionParameters`.
    public static final long OFFSET_videoSessionParameters = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParameters"));
    /// The memory layout of `videoSessionParameters`.
    public static final MemoryLayout LAYOUT_videoSessionParameters = LAYOUT.select(PathElement.groupElement("videoSessionParameters"));
    /// The [VarHandle] of `videoSessionParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSessionParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParameters"));

    /// Creates `VkVideoEncodeSessionParametersGetInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeSessionParametersGetInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeSessionParametersGetInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionParametersGetInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersGetInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeSessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionParametersGetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeSessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionParametersGetInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeSessionParametersGetInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeSessionParametersGetInfoKHR`
    public static VkVideoEncodeSessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionParametersGetInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeSessionParametersGetInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeSessionParametersGetInfoKHR`
    public static VkVideoEncodeSessionParametersGetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionParametersGetInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeSessionParametersGetInfoKHR copyFrom(VkVideoEncodeSessionParametersGetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeSessionParametersGetInfoKHR reinterpret(long count) { return new VkVideoEncodeSessionParametersGetInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeSessionParametersGetInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeSessionParametersGetInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeSessionParametersGetInfoKHR videoSessionParameters(long value) { videoSessionParameters(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeSessionParametersGetInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeSessionParametersGetInfoKHR`
    public VkVideoEncodeSessionParametersGetInfoKHR asSlice(long index) { return new VkVideoEncodeSessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeSessionParametersGetInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeSessionParametersGetInfoKHR`
    public VkVideoEncodeSessionParametersGetInfoKHR asSlice(long index, long count) { return new VkVideoEncodeSessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeSessionParametersGetInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeSessionParametersGetInfoKHR at(long index, Consumer<VkVideoEncodeSessionParametersGetInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersGetInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersGetInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `videoSessionParameters` at the given index}
    /// @param index the index of the struct buffer
    public long videoSessionParametersAt(long index) { return videoSessionParameters(this.segment(), index); }
    /// Sets `videoSessionParameters` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersGetInfoKHR videoSessionParametersAt(long index, long value) { videoSessionParameters(this.segment(), index, value); return this; }

}
