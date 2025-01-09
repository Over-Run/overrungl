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
package overrungl.vulkan.nv.struct;

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
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### pipeline
/// [VarHandle][#VH_pipeline] - [Getter][#pipeline()] - [Setter][#pipeline(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineIndirectDeviceAddressInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
/// } VkPipelineIndirectDeviceAddressInfoNV;
/// ```
public final class VkPipelineIndirectDeviceAddressInfoNV extends Struct {
    /// The struct layout of `VkPipelineIndirectDeviceAddressInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipeline")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineIndirectDeviceAddressInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineIndirectDeviceAddressInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineIndirectDeviceAddressInfoNV(segment); }

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineIndirectDeviceAddressInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineIndirectDeviceAddressInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineIndirectDeviceAddressInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineIndirectDeviceAddressInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineIndirectDeviceAddressInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineIndirectDeviceAddressInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineIndirectDeviceAddressInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineIndirectDeviceAddressInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineIndirectDeviceAddressInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineIndirectDeviceAddressInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineIndirectDeviceAddressInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV sType(@CType("VkStructureType") int value) { VkPipelineIndirectDeviceAddressInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineIndirectDeviceAddressInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineIndirectDeviceAddressInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineIndirectDeviceAddressInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineIndirectDeviceAddressInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineIndirectDeviceAddressInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineIndirectDeviceAddressInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkPipelineIndirectDeviceAddressInfoNV.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint` at the given index}
    /// @param index the index
    public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkPipelineIndirectDeviceAddressInfoNV.get_pipelineBindPoint(this.segment(), index); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkPipelineIndirectDeviceAddressInfoNV.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkPipelineIndirectDeviceAddressInfoNV.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkPipelineIndirectDeviceAddressInfoNV.set_pipelineBindPoint(this.segment(), index, value); return this; }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkPipelineIndirectDeviceAddressInfoNV.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_pipeline(MemorySegment segment) { return VkPipelineIndirectDeviceAddressInfoNV.get_pipeline(segment, 0L); }
    /// {@return `pipeline` at the given index}
    /// @param index the index
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipelineAt(long index) { return VkPipelineIndirectDeviceAddressInfoNV.get_pipeline(this.segment(), index); }
    /// {@return `pipeline`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment pipeline() { return VkPipelineIndirectDeviceAddressInfoNV.get_pipeline(this.segment()); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipeline(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineIndirectDeviceAddressInfoNV.set_pipeline(segment, 0L, value); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pipelineAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineIndirectDeviceAddressInfoNV.set_pipeline(this.segment(), index, value); return this; }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pipeline(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkPipelineIndirectDeviceAddressInfoNV.set_pipeline(this.segment(), value); return this; }

}