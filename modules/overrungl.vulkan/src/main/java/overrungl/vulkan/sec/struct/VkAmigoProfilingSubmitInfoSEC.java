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
package overrungl.vulkan.sec.struct;

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
/// ### firstDrawTimestamp
/// [VarHandle][#VH_firstDrawTimestamp] - [Getter][#firstDrawTimestamp()] - [Setter][#firstDrawTimestamp(long)]
/// ### swapBufferTimestamp
/// [VarHandle][#VH_swapBufferTimestamp] - [Getter][#swapBufferTimestamp()] - [Setter][#swapBufferTimestamp(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAmigoProfilingSubmitInfoSEC {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t firstDrawTimestamp;
///     uint64_t swapBufferTimestamp;
/// } VkAmigoProfilingSubmitInfoSEC;
/// ```
public final class VkAmigoProfilingSubmitInfoSEC extends Struct {
    /// The struct layout of `VkAmigoProfilingSubmitInfoSEC`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("firstDrawTimestamp"),
        ValueLayout.JAVA_LONG.withName("swapBufferTimestamp")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `firstDrawTimestamp` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_firstDrawTimestamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstDrawTimestamp"));
    /// The [VarHandle] of `swapBufferTimestamp` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_swapBufferTimestamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapBufferTimestamp"));

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    /// @param segment the memory segment
    public VkAmigoProfilingSubmitInfoSEC(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAmigoProfilingSubmitInfoSEC of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment); }

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAmigoProfilingSubmitInfoSEC ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAmigoProfilingSubmitInfoSEC ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAmigoProfilingSubmitInfoSEC` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAmigoProfilingSubmitInfoSEC`
    public static VkAmigoProfilingSubmitInfoSEC alloc(SegmentAllocator allocator) { return new VkAmigoProfilingSubmitInfoSEC(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAmigoProfilingSubmitInfoSEC` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAmigoProfilingSubmitInfoSEC`
    public static VkAmigoProfilingSubmitInfoSEC alloc(SegmentAllocator allocator, long count) { return new VkAmigoProfilingSubmitInfoSEC(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAmigoProfilingSubmitInfoSEC`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAmigoProfilingSubmitInfoSEC`
    public VkAmigoProfilingSubmitInfoSEC asSlice(long index) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAmigoProfilingSubmitInfoSEC`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAmigoProfilingSubmitInfoSEC`
    public VkAmigoProfilingSubmitInfoSEC asSlice(long index, long count) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAmigoProfilingSubmitInfoSEC.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAmigoProfilingSubmitInfoSEC.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAmigoProfilingSubmitInfoSEC.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAmigoProfilingSubmitInfoSEC.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC sTypeAt(long index, @CType("VkStructureType") int value) { VkAmigoProfilingSubmitInfoSEC.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC sType(@CType("VkStructureType") int value) { VkAmigoProfilingSubmitInfoSEC.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAmigoProfilingSubmitInfoSEC.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAmigoProfilingSubmitInfoSEC.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAmigoProfilingSubmitInfoSEC.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAmigoProfilingSubmitInfoSEC.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAmigoProfilingSubmitInfoSEC.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAmigoProfilingSubmitInfoSEC.set_pNext(this.segment(), value); return this; }

    /// {@return `firstDrawTimestamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_firstDrawTimestamp(MemorySegment segment, long index) { return (long) VH_firstDrawTimestamp.get(segment, 0L, index); }
    /// {@return `firstDrawTimestamp`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_firstDrawTimestamp(MemorySegment segment) { return VkAmigoProfilingSubmitInfoSEC.get_firstDrawTimestamp(segment, 0L); }
    /// {@return `firstDrawTimestamp` at the given index}
    /// @param index the index
    public @CType("uint64_t") long firstDrawTimestampAt(long index) { return VkAmigoProfilingSubmitInfoSEC.get_firstDrawTimestamp(this.segment(), index); }
    /// {@return `firstDrawTimestamp`}
    public @CType("uint64_t") long firstDrawTimestamp() { return VkAmigoProfilingSubmitInfoSEC.get_firstDrawTimestamp(this.segment()); }
    /// Sets `firstDrawTimestamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstDrawTimestamp(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_firstDrawTimestamp.set(segment, 0L, index, value); }
    /// Sets `firstDrawTimestamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstDrawTimestamp(MemorySegment segment, @CType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.set_firstDrawTimestamp(segment, 0L, value); }
    /// Sets `firstDrawTimestamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestampAt(long index, @CType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.set_firstDrawTimestamp(this.segment(), index, value); return this; }
    /// Sets `firstDrawTimestamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestamp(@CType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.set_firstDrawTimestamp(this.segment(), value); return this; }

    /// {@return `swapBufferTimestamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_swapBufferTimestamp(MemorySegment segment, long index) { return (long) VH_swapBufferTimestamp.get(segment, 0L, index); }
    /// {@return `swapBufferTimestamp`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_swapBufferTimestamp(MemorySegment segment) { return VkAmigoProfilingSubmitInfoSEC.get_swapBufferTimestamp(segment, 0L); }
    /// {@return `swapBufferTimestamp` at the given index}
    /// @param index the index
    public @CType("uint64_t") long swapBufferTimestampAt(long index) { return VkAmigoProfilingSubmitInfoSEC.get_swapBufferTimestamp(this.segment(), index); }
    /// {@return `swapBufferTimestamp`}
    public @CType("uint64_t") long swapBufferTimestamp() { return VkAmigoProfilingSubmitInfoSEC.get_swapBufferTimestamp(this.segment()); }
    /// Sets `swapBufferTimestamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapBufferTimestamp(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_swapBufferTimestamp.set(segment, 0L, index, value); }
    /// Sets `swapBufferTimestamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapBufferTimestamp(MemorySegment segment, @CType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.set_swapBufferTimestamp(segment, 0L, value); }
    /// Sets `swapBufferTimestamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestampAt(long index, @CType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.set_swapBufferTimestamp(this.segment(), index, value); return this; }
    /// Sets `swapBufferTimestamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestamp(@CType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.set_swapBufferTimestamp(this.segment(), value); return this; }

}
