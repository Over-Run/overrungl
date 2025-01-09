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
/// ### signalSemaphore
/// [VarHandle][#VH_signalSemaphore] - [Getter][#signalSemaphore()] - [Setter][#signalSemaphore(java.lang.foreign.MemorySegment)]
/// ### value
/// [VarHandle][#VH_value] - [Getter][#value()] - [Setter][#value(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLatencySleepInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphore signalSemaphore;
///     uint64_t value;
/// } VkLatencySleepInfoNV;
/// ```
public final class VkLatencySleepInfoNV extends Struct {
    /// The struct layout of `VkLatencySleepInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("signalSemaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `signalSemaphore` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_signalSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphore"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkLatencySleepInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment); }

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV alloc(SegmentAllocator allocator) { return new VkLatencySleepInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySleepInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkLatencySleepInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLatencySleepInfoNV`
    public VkLatencySleepInfoNV asSlice(long index) { return new VkLatencySleepInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkLatencySleepInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLatencySleepInfoNV`
    public VkLatencySleepInfoNV asSlice(long index, long count) { return new VkLatencySleepInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLatencySleepInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkLatencySleepInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkLatencySleepInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkLatencySleepInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkLatencySleepInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV sType(@CType("VkStructureType") int value) { VkLatencySleepInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkLatencySleepInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkLatencySleepInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkLatencySleepInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLatencySleepInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLatencySleepInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkLatencySleepInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `signalSemaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_signalSemaphore(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_signalSemaphore.get(segment, 0L, index); }
    /// {@return `signalSemaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_signalSemaphore(MemorySegment segment) { return VkLatencySleepInfoNV.get_signalSemaphore(segment, 0L); }
    /// {@return `signalSemaphore` at the given index}
    /// @param index the index
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment signalSemaphoreAt(long index) { return VkLatencySleepInfoNV.get_signalSemaphore(this.segment(), index); }
    /// {@return `signalSemaphore`}
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment signalSemaphore() { return VkLatencySleepInfoNV.get_signalSemaphore(this.segment()); }
    /// Sets `signalSemaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphore(MemorySegment segment, long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VH_signalSemaphore.set(segment, 0L, index, value); }
    /// Sets `signalSemaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphore(MemorySegment segment, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkLatencySleepInfoNV.set_signalSemaphore(segment, 0L, value); }
    /// Sets `signalSemaphore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV signalSemaphoreAt(long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkLatencySleepInfoNV.set_signalSemaphore(this.segment(), index, value); return this; }
    /// Sets `signalSemaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV signalSemaphore(@CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkLatencySleepInfoNV.set_signalSemaphore(this.segment(), value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_value(MemorySegment segment) { return VkLatencySleepInfoNV.get_value(segment, 0L); }
    /// {@return `value` at the given index}
    /// @param index the index
    public @CType("uint64_t") long valueAt(long index) { return VkLatencySleepInfoNV.get_value(this.segment(), index); }
    /// {@return `value`}
    public @CType("uint64_t") long value() { return VkLatencySleepInfoNV.get_value(this.segment()); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_value(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_value(MemorySegment segment, @CType("uint64_t") long value) { VkLatencySleepInfoNV.set_value(segment, 0L, value); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV valueAt(long index, @CType("uint64_t") long value) { VkLatencySleepInfoNV.set_value(this.segment(), index, value); return this; }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV value(@CType("uint64_t") long value) { VkLatencySleepInfoNV.set_value(this.segment(), value); return this; }

}
