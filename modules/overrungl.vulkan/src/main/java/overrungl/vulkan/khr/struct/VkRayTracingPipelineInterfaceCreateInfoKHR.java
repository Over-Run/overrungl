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
/// ### maxPipelineRayPayloadSize
/// [VarHandle][#VH_maxPipelineRayPayloadSize] - [Getter][#maxPipelineRayPayloadSize()] - [Setter][#maxPipelineRayPayloadSize(int)]
/// ### maxPipelineRayHitAttributeSize
/// [VarHandle][#VH_maxPipelineRayHitAttributeSize] - [Getter][#maxPipelineRayHitAttributeSize()] - [Setter][#maxPipelineRayHitAttributeSize(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRayTracingPipelineInterfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t maxPipelineRayPayloadSize;
///     uint32_t maxPipelineRayHitAttributeSize;
/// } VkRayTracingPipelineInterfaceCreateInfoKHR;
/// ```
public final class VkRayTracingPipelineInterfaceCreateInfoKHR extends Struct {
    /// The struct layout of `VkRayTracingPipelineInterfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayHitAttributeSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxPipelineRayPayloadSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPipelineRayPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayPayloadSize"));
    /// The [VarHandle] of `maxPipelineRayHitAttributeSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPipelineRayHitAttributeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayHitAttributeSize"));

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment); }

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingPipelineInterfaceCreateInfoKHR`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingPipelineInterfaceCreateInfoKHR`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxPipelineRayPayloadSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPipelineRayPayloadSize(MemorySegment segment, long index) { return (int) VH_maxPipelineRayPayloadSize.get(segment, 0L, index); }
    /// {@return `maxPipelineRayPayloadSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPipelineRayPayloadSize(MemorySegment segment) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_maxPipelineRayPayloadSize(segment, 0L); }
    /// {@return `maxPipelineRayPayloadSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPipelineRayPayloadSizeAt(long index) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_maxPipelineRayPayloadSize(this.segment(), index); }
    /// {@return `maxPipelineRayPayloadSize`}
    public @CType("uint32_t") int maxPipelineRayPayloadSize() { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_maxPipelineRayPayloadSize(this.segment()); }
    /// Sets `maxPipelineRayPayloadSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPipelineRayPayloadSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPipelineRayPayloadSize.set(segment, 0L, index, value); }
    /// Sets `maxPipelineRayPayloadSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPipelineRayPayloadSize(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_maxPipelineRayPayloadSize(segment, 0L, value); }
    /// Sets `maxPipelineRayPayloadSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSizeAt(long index, @CType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_maxPipelineRayPayloadSize(this.segment(), index, value); return this; }
    /// Sets `maxPipelineRayPayloadSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSize(@CType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_maxPipelineRayPayloadSize(this.segment(), value); return this; }

    /// {@return `maxPipelineRayHitAttributeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPipelineRayHitAttributeSize(MemorySegment segment, long index) { return (int) VH_maxPipelineRayHitAttributeSize.get(segment, 0L, index); }
    /// {@return `maxPipelineRayHitAttributeSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPipelineRayHitAttributeSize(MemorySegment segment) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_maxPipelineRayHitAttributeSize(segment, 0L); }
    /// {@return `maxPipelineRayHitAttributeSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPipelineRayHitAttributeSizeAt(long index) { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_maxPipelineRayHitAttributeSize(this.segment(), index); }
    /// {@return `maxPipelineRayHitAttributeSize`}
    public @CType("uint32_t") int maxPipelineRayHitAttributeSize() { return VkRayTracingPipelineInterfaceCreateInfoKHR.get_maxPipelineRayHitAttributeSize(this.segment()); }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPipelineRayHitAttributeSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPipelineRayHitAttributeSize.set(segment, 0L, index, value); }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPipelineRayHitAttributeSize(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_maxPipelineRayHitAttributeSize(segment, 0L, value); }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSizeAt(long index, @CType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_maxPipelineRayHitAttributeSize(this.segment(), index, value); return this; }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSize(@CType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.set_maxPipelineRayHitAttributeSize(this.segment(), value); return this; }

}
