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
/// ### stdProfileIdc
/// [VarHandle][#VH_stdProfileIdc] - [Getter][#stdProfileIdc()] - [Setter][#stdProfileIdc(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264ProfileInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     StdVideoH264ProfileIdc stdProfileIdc;
/// } VkVideoEncodeH264ProfileInfoKHR;
/// ```
public final class VkVideoEncodeH264ProfileInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264ProfileInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfileIdc")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stdProfileIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdProfileIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfileIdc"));

    /// Creates `VkVideoEncodeH264ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264ProfileInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264ProfileInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264ProfileInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264ProfileInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264ProfileInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264ProfileInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264ProfileInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264ProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264ProfileInfoKHR`
    public static VkVideoEncodeH264ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264ProfileInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264ProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264ProfileInfoKHR`
    public static VkVideoEncodeH264ProfileInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264ProfileInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264ProfileInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264ProfileInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264ProfileInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264ProfileInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264ProfileInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264ProfileInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264ProfileInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264ProfileInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264ProfileInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264ProfileInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264ProfileInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264ProfileInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264ProfileInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264ProfileInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264ProfileInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264ProfileInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `stdProfileIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264ProfileIdc") int get_stdProfileIdc(MemorySegment segment, long index) { return (int) VH_stdProfileIdc.get(segment, 0L, index); }
    /// {@return `stdProfileIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264ProfileIdc") int get_stdProfileIdc(MemorySegment segment) { return VkVideoEncodeH264ProfileInfoKHR.get_stdProfileIdc(segment, 0L); }
    /// {@return `stdProfileIdc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264ProfileIdc") int stdProfileIdcAt(long index) { return VkVideoEncodeH264ProfileInfoKHR.get_stdProfileIdc(this.segment(), index); }
    /// {@return `stdProfileIdc`}
    public @CType("StdVideoH264ProfileIdc") int stdProfileIdc() { return VkVideoEncodeH264ProfileInfoKHR.get_stdProfileIdc(this.segment()); }
    /// Sets `stdProfileIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdProfileIdc(MemorySegment segment, long index, @CType("StdVideoH264ProfileIdc") int value) { VH_stdProfileIdc.set(segment, 0L, index, value); }
    /// Sets `stdProfileIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdProfileIdc(MemorySegment segment, @CType("StdVideoH264ProfileIdc") int value) { VkVideoEncodeH264ProfileInfoKHR.set_stdProfileIdc(segment, 0L, value); }
    /// Sets `stdProfileIdc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264ProfileInfoKHR stdProfileIdcAt(long index, @CType("StdVideoH264ProfileIdc") int value) { VkVideoEncodeH264ProfileInfoKHR.set_stdProfileIdc(this.segment(), index, value); return this; }
    /// Sets `stdProfileIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264ProfileInfoKHR stdProfileIdc(@CType("StdVideoH264ProfileIdc") int value) { VkVideoEncodeH264ProfileInfoKHR.set_stdProfileIdc(this.segment(), value); return this; }

}
