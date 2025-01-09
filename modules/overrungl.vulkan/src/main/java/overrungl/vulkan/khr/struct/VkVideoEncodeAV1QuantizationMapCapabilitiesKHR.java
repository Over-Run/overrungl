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
/// ### minQIndexDelta
/// [VarHandle][#VH_minQIndexDelta] - [Getter][#minQIndexDelta()] - [Setter][#minQIndexDelta(int)]
/// ### maxQIndexDelta
/// [VarHandle][#VH_maxQIndexDelta] - [Getter][#maxQIndexDelta()] - [Setter][#maxQIndexDelta(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1QuantizationMapCapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     int32_t minQIndexDelta;
///     int32_t maxQIndexDelta;
/// } VkVideoEncodeAV1QuantizationMapCapabilitiesKHR;
/// ```
public final class VkVideoEncodeAV1QuantizationMapCapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minQIndexDelta"),
        ValueLayout.JAVA_INT.withName("maxQIndexDelta")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minQIndexDelta` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minQIndexDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndexDelta"));
    /// The [VarHandle] of `maxQIndexDelta` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxQIndexDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndexDelta"));

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `minQIndexDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_minQIndexDelta(MemorySegment segment, long index) { return (int) VH_minQIndexDelta.get(segment, 0L, index); }
    /// {@return `minQIndexDelta`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_minQIndexDelta(MemorySegment segment) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_minQIndexDelta(segment, 0L); }
    /// {@return `minQIndexDelta` at the given index}
    /// @param index the index
    public @CType("int32_t") int minQIndexDeltaAt(long index) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_minQIndexDelta(this.segment(), index); }
    /// {@return `minQIndexDelta`}
    public @CType("int32_t") int minQIndexDelta() { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_minQIndexDelta(this.segment()); }
    /// Sets `minQIndexDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQIndexDelta(MemorySegment segment, long index, @CType("int32_t") int value) { VH_minQIndexDelta.set(segment, 0L, index, value); }
    /// Sets `minQIndexDelta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQIndexDelta(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_minQIndexDelta(segment, 0L, value); }
    /// Sets `minQIndexDelta` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR minQIndexDeltaAt(long index, @CType("int32_t") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_minQIndexDelta(this.segment(), index, value); return this; }
    /// Sets `minQIndexDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR minQIndexDelta(@CType("int32_t") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_minQIndexDelta(this.segment(), value); return this; }

    /// {@return `maxQIndexDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_maxQIndexDelta(MemorySegment segment, long index) { return (int) VH_maxQIndexDelta.get(segment, 0L, index); }
    /// {@return `maxQIndexDelta`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_maxQIndexDelta(MemorySegment segment) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_maxQIndexDelta(segment, 0L); }
    /// {@return `maxQIndexDelta` at the given index}
    /// @param index the index
    public @CType("int32_t") int maxQIndexDeltaAt(long index) { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_maxQIndexDelta(this.segment(), index); }
    /// {@return `maxQIndexDelta`}
    public @CType("int32_t") int maxQIndexDelta() { return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.get_maxQIndexDelta(this.segment()); }
    /// Sets `maxQIndexDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQIndexDelta(MemorySegment segment, long index, @CType("int32_t") int value) { VH_maxQIndexDelta.set(segment, 0L, index, value); }
    /// Sets `maxQIndexDelta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQIndexDelta(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_maxQIndexDelta(segment, 0L, value); }
    /// Sets `maxQIndexDelta` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR maxQIndexDeltaAt(long index, @CType("int32_t") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_maxQIndexDelta(this.segment(), index, value); return this; }
    /// Sets `maxQIndexDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR maxQIndexDelta(@CType("int32_t") int value) { VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.set_maxQIndexDelta(this.segment(), value); return this; }

}