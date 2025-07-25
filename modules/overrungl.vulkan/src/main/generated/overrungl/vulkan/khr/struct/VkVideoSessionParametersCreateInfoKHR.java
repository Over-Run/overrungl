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
/// struct VkVideoSessionParametersCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoSessionParametersCreateFlagsKHR flags;
///     (uint64_t) VkVideoSessionParametersKHR videoSessionParametersTemplate;
///     (uint64_t) VkVideoSessionKHR videoSession;
/// };
/// ```
public final class VkVideoSessionParametersCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoSessionParametersCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("videoSessionParametersTemplate"),
        ValueLayout.JAVA_LONG.withName("videoSession")
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
    /// The byte offset of `videoSessionParametersTemplate`.
    public static final long OFFSET_videoSessionParametersTemplate = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParametersTemplate"));
    /// The memory layout of `videoSessionParametersTemplate`.
    public static final MemoryLayout LAYOUT_videoSessionParametersTemplate = LAYOUT.select(PathElement.groupElement("videoSessionParametersTemplate"));
    /// The [VarHandle] of `videoSessionParametersTemplate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSessionParametersTemplate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParametersTemplate"));
    /// The byte offset of `videoSession`.
    public static final long OFFSET_videoSession = LAYOUT.byteOffset(PathElement.groupElement("videoSession"));
    /// The memory layout of `videoSession`.
    public static final MemoryLayout LAYOUT_videoSession = LAYOUT.select(PathElement.groupElement("videoSession"));
    /// The [VarHandle] of `videoSession` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSession = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSession"));

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoSessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param videoSessionParametersTemplate `videoSessionParametersTemplate`
    /// @param videoSession `videoSession`
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long videoSessionParametersTemplate, long videoSession) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).videoSessionParametersTemplate(videoSessionParametersTemplate).videoSession(videoSession);
    }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param videoSessionParametersTemplate `videoSessionParametersTemplate`
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long videoSessionParametersTemplate) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).videoSessionParametersTemplate(videoSessionParametersTemplate);
    }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR copyFrom(VkVideoSessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoSessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoSessionParametersCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoSessionParametersCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoSessionParametersCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `videoSessionParametersTemplate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long videoSessionParametersTemplate(MemorySegment segment, long index) { return (long) VH_videoSessionParametersTemplate.get(segment, 0L, index); }
    /// {@return `videoSessionParametersTemplate`}
    public long videoSessionParametersTemplate() { return videoSessionParametersTemplate(this.segment(), 0L); }
    /// Sets `videoSessionParametersTemplate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoSessionParametersTemplate(MemorySegment segment, long index, long value) { VH_videoSessionParametersTemplate.set(segment, 0L, index, value); }
    /// Sets `videoSessionParametersTemplate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(long value) { videoSessionParametersTemplate(this.segment(), 0L, value); return this; }

    /// {@return `videoSession` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long videoSession(MemorySegment segment, long index) { return (long) VH_videoSession.get(segment, 0L, index); }
    /// {@return `videoSession`}
    public long videoSession() { return videoSession(this.segment(), 0L); }
    /// Sets `videoSession` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoSession(MemorySegment segment, long index, long value) { VH_videoSession.set(segment, 0L, index, value); }
    /// Sets `videoSession` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR videoSession(long value) { videoSession(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoSessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoSessionParametersCreateInfoKHR`
    public VkVideoSessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoSessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoSessionParametersCreateInfoKHR`
    public VkVideoSessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoSessionParametersCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR at(long index, Consumer<VkVideoSessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `videoSessionParametersTemplate` at the given index}
    /// @param index the index of the struct buffer
    public long videoSessionParametersTemplateAt(long index) { return videoSessionParametersTemplate(this.segment(), index); }
    /// Sets `videoSessionParametersTemplate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplateAt(long index, long value) { videoSessionParametersTemplate(this.segment(), index, value); return this; }

    /// {@return `videoSession` at the given index}
    /// @param index the index of the struct buffer
    public long videoSessionAt(long index) { return videoSession(this.segment(), index); }
    /// Sets `videoSession` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR videoSessionAt(long index, long value) { videoSession(this.segment(), index, value); return this; }

}
