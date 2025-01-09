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
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(java.lang.foreign.MemorySegment)]
/// ### executableIndex
/// [VarHandle][#VH_executableIndex] - [Getter][#executableIndex()] - [Setter][#executableIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineExecutableInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipeline pipeline;
///     uint32_t executableIndex;
/// } VkPipelineExecutableInfoKHR;
/// ```
public final class VkPipelineExecutableInfoKHR extends Struct {
    /// The struct layout of `VkPipelineExecutableInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `executableIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_executableIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executableIndex"));

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineExecutableInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineExecutableInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineExecutableInfoKHR`
    public VkPipelineExecutableInfoKHR asSlice(long index) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineExecutableInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineExecutableInfoKHR`
    public VkPipelineExecutableInfoKHR asSlice(long index, long count) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineExecutableInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineExecutableInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR sType(@CType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineExecutableInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineExecutableInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutableInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutableInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutableInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_pipeline(segment, 0L); }
    /// {@return `pipeline` at the given index}
    /// @param index the index
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipelineAt(long index) { return VkPipelineExecutableInfoKHR.get_pipeline(this.segment(), index); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline() { return VkPipelineExecutableInfoKHR.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineExecutableInfoKHR.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pipelineAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineExecutableInfoKHR.set_pipeline(this.segment(), index, value); return this; }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pipeline(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineExecutableInfoKHR.set_pipeline(this.segment(), value); return this; }

    /// {@return `executableIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_executableIndex(MemorySegment segment, long index) { return (int) VH_executableIndex.get(segment, 0L, index); }
    /// {@return `executableIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_executableIndex(MemorySegment segment) { return VkPipelineExecutableInfoKHR.get_executableIndex(segment, 0L); }
    /// {@return `executableIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int executableIndexAt(long index) { return VkPipelineExecutableInfoKHR.get_executableIndex(this.segment(), index); }
    /// {@return `executableIndex`}
    public @CType("uint32_t") int executableIndex() { return VkPipelineExecutableInfoKHR.get_executableIndex(this.segment()); }
    /// Sets `executableIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_executableIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_executableIndex.set(segment, 0L, index, value); }
    /// Sets `executableIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_executableIndex(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineExecutableInfoKHR.set_executableIndex(segment, 0L, value); }
    /// Sets `executableIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR executableIndexAt(long index, @CType("uint32_t") int value) { VkPipelineExecutableInfoKHR.set_executableIndex(this.segment(), index, value); return this; }
    /// Sets `executableIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR executableIndex(@CType("uint32_t") int value) { VkPipelineExecutableInfoKHR.set_executableIndex(this.segment(), value); return this; }

}
