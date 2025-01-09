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
/// ### pKeysAndDataInfo
/// [VarHandle][#VH_pKeysAndDataInfo] - [Getter][#pKeysAndDataInfo()] - [Setter][#pKeysAndDataInfo(java.lang.foreign.MemorySegment)]
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(java.lang.foreign.MemorySegment)]
/// ### pPipelineCreateInfo
/// [VarHandle][#VH_pPipelineCreateInfo] - [Getter][#pPipelineCreateInfo()] - [Setter][#pPipelineCreateInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineBinaryCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const VkPipelineBinaryKeysAndDataKHR * pKeysAndDataInfo;
///     VkPipeline pipeline;
///     const VkPipelineCreateInfoKHR * pPipelineCreateInfo;
/// } VkPipelineBinaryCreateInfoKHR;
/// ```
public final class VkPipelineBinaryCreateInfoKHR extends Struct {
    /// The struct layout of `VkPipelineBinaryCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pKeysAndDataInfo"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withName("pPipelineCreateInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pKeysAndDataInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pKeysAndDataInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pKeysAndDataInfo"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `pPipelineCreateInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelineCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreateInfo"));

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment); }

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineBinaryCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryCreateInfoKHR`
    public static VkPipelineBinaryCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryCreateInfoKHR`
    public static VkPipelineBinaryCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineBinaryCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineBinaryCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineBinaryCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineBinaryCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineBinaryCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR sType(@CType("VkStructureType") int value) { VkPipelineBinaryCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineBinaryCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineBinaryCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineBinaryCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pKeysAndDataInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment get_pKeysAndDataInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pKeysAndDataInfo.get(segment, 0L, index); }
    /// {@return `pKeysAndDataInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment get_pKeysAndDataInfo(MemorySegment segment) { return VkPipelineBinaryCreateInfoKHR.get_pKeysAndDataInfo(segment, 0L); }
    /// {@return `pKeysAndDataInfo` at the given index}
    /// @param index the index
    public @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment pKeysAndDataInfoAt(long index) { return VkPipelineBinaryCreateInfoKHR.get_pKeysAndDataInfo(this.segment(), index); }
    /// {@return `pKeysAndDataInfo`}
    public @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment pKeysAndDataInfo() { return VkPipelineBinaryCreateInfoKHR.get_pKeysAndDataInfo(this.segment()); }
    /// Sets `pKeysAndDataInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pKeysAndDataInfo(MemorySegment segment, long index, @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment value) { VH_pKeysAndDataInfo.set(segment, 0L, index, value); }
    /// Sets `pKeysAndDataInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pKeysAndDataInfo(MemorySegment segment, @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pKeysAndDataInfo(segment, 0L, value); }
    /// Sets `pKeysAndDataInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfoAt(long index, @CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pKeysAndDataInfo(this.segment(), index, value); return this; }
    /// Sets `pKeysAndDataInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfo(@CType("const VkPipelineBinaryKeysAndDataKHR *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pKeysAndDataInfo(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment) { return VkPipelineBinaryCreateInfoKHR.get_pipeline(segment, 0L); }
    /// {@return `pipeline` at the given index}
    /// @param index the index
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipelineAt(long index) { return VkPipelineBinaryCreateInfoKHR.get_pipeline(this.segment(), index); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline() { return VkPipelineBinaryCreateInfoKHR.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pipelineAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pipeline(this.segment(), index, value); return this; }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pipeline(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pipeline(this.segment(), value); return this; }

    /// {@return `pPipelineCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment get_pPipelineCreateInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelineCreateInfo.get(segment, 0L, index); }
    /// {@return `pPipelineCreateInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment get_pPipelineCreateInfo(MemorySegment segment) { return VkPipelineBinaryCreateInfoKHR.get_pPipelineCreateInfo(segment, 0L); }
    /// {@return `pPipelineCreateInfo` at the given index}
    /// @param index the index
    public @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment pPipelineCreateInfoAt(long index) { return VkPipelineBinaryCreateInfoKHR.get_pPipelineCreateInfo(this.segment(), index); }
    /// {@return `pPipelineCreateInfo`}
    public @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment pPipelineCreateInfo() { return VkPipelineBinaryCreateInfoKHR.get_pPipelineCreateInfo(this.segment()); }
    /// Sets `pPipelineCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineCreateInfo(MemorySegment segment, long index, @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pPipelineCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pPipelineCreateInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelineCreateInfo(MemorySegment segment, @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pPipelineCreateInfo(segment, 0L, value); }
    /// Sets `pPipelineCreateInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfoAt(long index, @CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pPipelineCreateInfo(this.segment(), index, value); return this; }
    /// Sets `pPipelineCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfo(@CType("const VkPipelineCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryCreateInfoKHR.set_pPipelineCreateInfo(this.segment(), value); return this; }

}
