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
package overrungl.vulkan.ext.struct;

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
/// ### sampler
/// [VarHandle][#VH_sampler] - [Getter][#sampler()] - [Setter][#sampler(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkSampler sampler;
/// } VkSamplerCaptureDescriptorDataInfoEXT;
/// ```
public final class VkSamplerCaptureDescriptorDataInfoEXT extends Struct {
    /// The struct layout of `VkSamplerCaptureDescriptorDataInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("sampler")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sampler` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSamplerCaptureDescriptorDataInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment); }

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCaptureDescriptorDataInfoEXT`
    public static VkSamplerCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCaptureDescriptorDataInfoEXT`
    public static VkSamplerCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerCaptureDescriptorDataInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerCaptureDescriptorDataInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerCaptureDescriptorDataInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerCaptureDescriptorDataInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerCaptureDescriptorDataInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT sType(@CType("VkStructureType") int value) { VkSamplerCaptureDescriptorDataInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSamplerCaptureDescriptorDataInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSamplerCaptureDescriptorDataInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSamplerCaptureDescriptorDataInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerCaptureDescriptorDataInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerCaptureDescriptorDataInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerCaptureDescriptorDataInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `sampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampler") java.lang.foreign.MemorySegment get_sampler(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_sampler.get(segment, 0L, index); }
    /// {@return `sampler`}
    /// @param segment the segment of the struct
    public static @CType("VkSampler") java.lang.foreign.MemorySegment get_sampler(MemorySegment segment) { return VkSamplerCaptureDescriptorDataInfoEXT.get_sampler(segment, 0L); }
    /// {@return `sampler` at the given index}
    /// @param index the index
    public @CType("VkSampler") java.lang.foreign.MemorySegment samplerAt(long index) { return VkSamplerCaptureDescriptorDataInfoEXT.get_sampler(this.segment(), index); }
    /// {@return `sampler`}
    public @CType("VkSampler") java.lang.foreign.MemorySegment sampler() { return VkSamplerCaptureDescriptorDataInfoEXT.get_sampler(this.segment()); }
    /// Sets `sampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampler(MemorySegment segment, long index, @CType("VkSampler") java.lang.foreign.MemorySegment value) { VH_sampler.set(segment, 0L, index, value); }
    /// Sets `sampler` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampler(MemorySegment segment, @CType("VkSampler") java.lang.foreign.MemorySegment value) { VkSamplerCaptureDescriptorDataInfoEXT.set_sampler(segment, 0L, value); }
    /// Sets `sampler` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT samplerAt(long index, @CType("VkSampler") java.lang.foreign.MemorySegment value) { VkSamplerCaptureDescriptorDataInfoEXT.set_sampler(this.segment(), index, value); return this; }
    /// Sets `sampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT sampler(@CType("VkSampler") java.lang.foreign.MemorySegment value) { VkSamplerCaptureDescriptorDataInfoEXT.set_sampler(this.segment(), value); return this; }

}
