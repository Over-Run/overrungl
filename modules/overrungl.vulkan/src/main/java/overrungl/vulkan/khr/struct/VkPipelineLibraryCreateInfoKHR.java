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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### libraryCount
/// [VarHandle][#VH_libraryCount] - [Getter][#libraryCount()] - [Setter][#libraryCount(int)]
/// ### pLibraries
/// [VarHandle][#VH_pLibraries] - [Getter][#pLibraries()] - [Setter][#pLibraries(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineLibraryCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t libraryCount;
///     const VkPipeline * pLibraries;
/// } VkPipelineLibraryCreateInfoKHR;
/// ```
public final class VkPipelineLibraryCreateInfoKHR extends Struct {
    /// The struct layout of `VkPipelineLibraryCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("libraryCount"),
        ValueLayout.ADDRESS.withName("pLibraries")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `libraryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_libraryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("libraryCount"));
    /// The [VarHandle] of `pLibraries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLibraries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraries"));

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineLibraryCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLibraryCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment); }

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLibraryCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineLibraryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLibraryCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineLibraryCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineLibraryCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineLibraryCreateInfoKHR`
    public static VkPipelineLibraryCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineLibraryCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineLibraryCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineLibraryCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineLibraryCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineLibraryCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineLibraryCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR sType(@CType("VkStructureType") int value) { VkPipelineLibraryCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineLibraryCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineLibraryCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineLibraryCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineLibraryCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineLibraryCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineLibraryCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `libraryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_libraryCount(MemorySegment segment, long index) { return (int) VH_libraryCount.get(segment, 0L, index); }
    /// {@return `libraryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_libraryCount(MemorySegment segment) { return VkPipelineLibraryCreateInfoKHR.get_libraryCount(segment, 0L); }
    /// {@return `libraryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int libraryCountAt(long index) { return VkPipelineLibraryCreateInfoKHR.get_libraryCount(this.segment(), index); }
    /// {@return `libraryCount`}
    public @CType("uint32_t") int libraryCount() { return VkPipelineLibraryCreateInfoKHR.get_libraryCount(this.segment()); }
    /// Sets `libraryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_libraryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_libraryCount.set(segment, 0L, index, value); }
    /// Sets `libraryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_libraryCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineLibraryCreateInfoKHR.set_libraryCount(segment, 0L, value); }
    /// Sets `libraryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR libraryCountAt(long index, @CType("uint32_t") int value) { VkPipelineLibraryCreateInfoKHR.set_libraryCount(this.segment(), index, value); return this; }
    /// Sets `libraryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR libraryCount(@CType("uint32_t") int value) { VkPipelineLibraryCreateInfoKHR.set_libraryCount(this.segment(), value); return this; }

    /// {@return `pLibraries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipeline *") java.lang.foreign.MemorySegment get_pLibraries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLibraries.get(segment, 0L, index); }
    /// {@return `pLibraries`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipeline *") java.lang.foreign.MemorySegment get_pLibraries(MemorySegment segment) { return VkPipelineLibraryCreateInfoKHR.get_pLibraries(segment, 0L); }
    /// {@return `pLibraries` at the given index}
    /// @param index the index
    public @CType("const VkPipeline *") java.lang.foreign.MemorySegment pLibrariesAt(long index) { return VkPipelineLibraryCreateInfoKHR.get_pLibraries(this.segment(), index); }
    /// {@return `pLibraries`}
    public @CType("const VkPipeline *") java.lang.foreign.MemorySegment pLibraries() { return VkPipelineLibraryCreateInfoKHR.get_pLibraries(this.segment()); }
    /// Sets `pLibraries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLibraries(MemorySegment segment, long index, @CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VH_pLibraries.set(segment, 0L, index, value); }
    /// Sets `pLibraries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLibraries(MemorySegment segment, @CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VkPipelineLibraryCreateInfoKHR.set_pLibraries(segment, 0L, value); }
    /// Sets `pLibraries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pLibrariesAt(long index, @CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VkPipelineLibraryCreateInfoKHR.set_pLibraries(this.segment(), index, value); return this; }
    /// Sets `pLibraries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLibraryCreateInfoKHR pLibraries(@CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VkPipelineLibraryCreateInfoKHR.set_pLibraries(this.segment(), value); return this; }

}
