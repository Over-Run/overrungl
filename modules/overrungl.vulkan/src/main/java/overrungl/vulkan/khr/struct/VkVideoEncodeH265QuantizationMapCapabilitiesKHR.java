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
/// ### minQpDelta
/// [VarHandle][#VH_minQpDelta] - [Getter][#minQpDelta()] - [Setter][#minQpDelta(int)]
/// ### maxQpDelta
/// [VarHandle][#VH_maxQpDelta] - [Getter][#maxQpDelta()] - [Setter][#maxQpDelta(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265QuantizationMapCapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     int32_t minQpDelta;
///     int32_t maxQpDelta;
/// } VkVideoEncodeH265QuantizationMapCapabilitiesKHR;
/// ```
public final class VkVideoEncodeH265QuantizationMapCapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minQpDelta"),
        ValueLayout.JAVA_INT.withName("maxQpDelta")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minQpDelta` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minQpDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQpDelta"));
    /// The [VarHandle] of `maxQpDelta` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxQpDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQpDelta"));

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `minQpDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_minQpDelta(MemorySegment segment, long index) { return (int) VH_minQpDelta.get(segment, 0L, index); }
    /// {@return `minQpDelta`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_minQpDelta(MemorySegment segment) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_minQpDelta(segment, 0L); }
    /// {@return `minQpDelta` at the given index}
    /// @param index the index
    public @CType("int32_t") int minQpDeltaAt(long index) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_minQpDelta(this.segment(), index); }
    /// {@return `minQpDelta`}
    public @CType("int32_t") int minQpDelta() { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_minQpDelta(this.segment()); }
    /// Sets `minQpDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQpDelta(MemorySegment segment, long index, @CType("int32_t") int value) { VH_minQpDelta.set(segment, 0L, index, value); }
    /// Sets `minQpDelta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQpDelta(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_minQpDelta(segment, 0L, value); }
    /// Sets `minQpDelta` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR minQpDeltaAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_minQpDelta(this.segment(), index, value); return this; }
    /// Sets `minQpDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR minQpDelta(@CType("int32_t") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_minQpDelta(this.segment(), value); return this; }

    /// {@return `maxQpDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_maxQpDelta(MemorySegment segment, long index) { return (int) VH_maxQpDelta.get(segment, 0L, index); }
    /// {@return `maxQpDelta`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_maxQpDelta(MemorySegment segment) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_maxQpDelta(segment, 0L); }
    /// {@return `maxQpDelta` at the given index}
    /// @param index the index
    public @CType("int32_t") int maxQpDeltaAt(long index) { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_maxQpDelta(this.segment(), index); }
    /// {@return `maxQpDelta`}
    public @CType("int32_t") int maxQpDelta() { return VkVideoEncodeH265QuantizationMapCapabilitiesKHR.get_maxQpDelta(this.segment()); }
    /// Sets `maxQpDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQpDelta(MemorySegment segment, long index, @CType("int32_t") int value) { VH_maxQpDelta.set(segment, 0L, index, value); }
    /// Sets `maxQpDelta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQpDelta(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_maxQpDelta(segment, 0L, value); }
    /// Sets `maxQpDelta` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR maxQpDeltaAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_maxQpDelta(this.segment(), index, value); return this; }
    /// Sets `maxQpDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR maxQpDelta(@CType("int32_t") int value) { VkVideoEncodeH265QuantizationMapCapabilitiesKHR.set_maxQpDelta(this.segment(), value); return this; }

}
