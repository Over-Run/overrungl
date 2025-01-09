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
/// ### videoUsageHints
/// [VarHandle][#VH_videoUsageHints] - [Getter][#videoUsageHints()] - [Setter][#videoUsageHints(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeUsageInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoDecodeUsageFlagsKHR videoUsageHints;
/// } VkVideoDecodeUsageInfoKHR;
/// ```
public final class VkVideoDecodeUsageInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeUsageInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoUsageHints")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `videoUsageHints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_videoUsageHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoUsageHints"));

    /// Creates `VkVideoDecodeUsageInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeUsageInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeUsageInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeUsageInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeUsageInfoKHR(segment); }

    /// Creates `VkVideoDecodeUsageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeUsageInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeUsageInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeUsageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeUsageInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeUsageInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeUsageInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeUsageInfoKHR`
    public static VkVideoDecodeUsageInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeUsageInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeUsageInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeUsageInfoKHR`
    public static VkVideoDecodeUsageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeUsageInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeUsageInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeUsageInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeUsageInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeUsageInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeUsageInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeUsageInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeUsageInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeUsageInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeUsageInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeUsageInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeUsageInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeUsageInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeUsageInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeUsageInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeUsageInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeUsageInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `videoUsageHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoDecodeUsageFlagsKHR") int get_videoUsageHints(MemorySegment segment, long index) { return (int) VH_videoUsageHints.get(segment, 0L, index); }
    /// {@return `videoUsageHints`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoDecodeUsageFlagsKHR") int get_videoUsageHints(MemorySegment segment) { return VkVideoDecodeUsageInfoKHR.get_videoUsageHints(segment, 0L); }
    /// {@return `videoUsageHints` at the given index}
    /// @param index the index
    public @CType("VkVideoDecodeUsageFlagsKHR") int videoUsageHintsAt(long index) { return VkVideoDecodeUsageInfoKHR.get_videoUsageHints(this.segment(), index); }
    /// {@return `videoUsageHints`}
    public @CType("VkVideoDecodeUsageFlagsKHR") int videoUsageHints() { return VkVideoDecodeUsageInfoKHR.get_videoUsageHints(this.segment()); }
    /// Sets `videoUsageHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoUsageHints(MemorySegment segment, long index, @CType("VkVideoDecodeUsageFlagsKHR") int value) { VH_videoUsageHints.set(segment, 0L, index, value); }
    /// Sets `videoUsageHints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoUsageHints(MemorySegment segment, @CType("VkVideoDecodeUsageFlagsKHR") int value) { VkVideoDecodeUsageInfoKHR.set_videoUsageHints(segment, 0L, value); }
    /// Sets `videoUsageHints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeUsageInfoKHR videoUsageHintsAt(long index, @CType("VkVideoDecodeUsageFlagsKHR") int value) { VkVideoDecodeUsageInfoKHR.set_videoUsageHints(this.segment(), index, value); return this; }
    /// Sets `videoUsageHints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeUsageInfoKHR videoUsageHints(@CType("VkVideoDecodeUsageFlagsKHR") int value) { VkVideoDecodeUsageInfoKHR.set_videoUsageHints(this.segment(), value); return this; }

}
