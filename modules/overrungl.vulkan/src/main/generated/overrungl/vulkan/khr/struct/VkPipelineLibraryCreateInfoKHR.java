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
/// struct VkPipelineLibraryCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t libraryCount;
///     const VkPipeline* pLibraries;
/// };
/// ```
public final class VkPipelineLibraryCreateInfoKHR extends GroupType {
    /// The struct layout of `VkPipelineLibraryCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("libraryCount"),
        ValueLayout.ADDRESS.withName("pLibraries")
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
    /// The byte offset of `libraryCount`.
    public static final long OFFSET_libraryCount = LAYOUT.byteOffset(PathElement.groupElement("libraryCount"));
    /// The memory layout of `libraryCount`.
    public static final MemoryLayout LAYOUT_libraryCount = LAYOUT.select(PathElement.groupElement("libraryCount"));
    /// The [VarHandle] of `libraryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_libraryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("libraryCount"));
    /// The byte offset of `pLibraries`.
    public static final long OFFSET_pLibraries = LAYOUT.byteOffset(PathElement.groupElement("pLibraries"));
    /// The memory layout of `pLibraries`.
    public static final MemoryLayout LAYOUT_pLibraries = LAYOUT.select(PathElement.groupElement("pLibraries"));
    /// The [VarHandle] of `pLibraries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLibraries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraries"));

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineLibraryCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLibraryCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLibraryCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLibraryCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineLibraryCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineLibraryCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param libraryCount `libraryCount`
    /// @param pLibraries `pLibraries`
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int libraryCount, MemorySegment pLibraries) {
        return alloc(allocator).sType(sType).pNext(pNext).libraryCount(libraryCount).pLibraries(pLibraries);
    }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param libraryCount `libraryCount`
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int libraryCount) {
        return alloc(allocator).sType(sType).pNext(pNext).libraryCount(libraryCount);
    }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR copyFrom(VkPipelineLibraryCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineLibraryCreateInfoKHR reinterpret(long count) { return new VkPipelineLibraryCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineLibraryCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineLibraryCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `libraryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int libraryCount(MemorySegment segment, long index) { return (int) VH_libraryCount.get(segment, 0L, index); }
    /// {@return `libraryCount`}
    public int libraryCount() { return libraryCount(this.segment(), 0L); }
    /// Sets `libraryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void libraryCount(MemorySegment segment, long index, int value) { VH_libraryCount.set(segment, 0L, index, value); }
    /// Sets `libraryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR libraryCount(int value) { libraryCount(this.segment(), 0L, value); return this; }

    /// {@return `pLibraries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLibraries(MemorySegment segment, long index) { return (MemorySegment) VH_pLibraries.get(segment, 0L, index); }
    /// {@return `pLibraries`}
    public MemorySegment pLibraries() { return pLibraries(this.segment(), 0L); }
    /// Sets `pLibraries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLibraries(MemorySegment segment, long index, MemorySegment value) { VH_pLibraries.set(segment, 0L, index, value); }
    /// Sets `pLibraries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pLibraries(MemorySegment value) { pLibraries(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineLibraryCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineLibraryCreateInfoKHR`
    public VkPipelineLibraryCreateInfoKHR asSlice(long index) { return new VkPipelineLibraryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineLibraryCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineLibraryCreateInfoKHR`
    public VkPipelineLibraryCreateInfoKHR asSlice(long index, long count) { return new VkPipelineLibraryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineLibraryCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR at(long index, Consumer<VkPipelineLibraryCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `libraryCount` at the given index}
    /// @param index the index of the struct buffer
    public int libraryCountAt(long index) { return libraryCount(this.segment(), index); }
    /// Sets `libraryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR libraryCountAt(long index, int value) { libraryCount(this.segment(), index, value); return this; }

    /// {@return `pLibraries` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pLibrariesAt(long index) { return pLibraries(this.segment(), index); }
    /// Sets `pLibraries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pLibrariesAt(long index, MemorySegment value) { pLibraries(this.segment(), index, value); return this; }

}
