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
/// ### useMaxLevelIdc
/// [VarHandle][#VH_useMaxLevelIdc] - [Getter][#useMaxLevelIdc()] - [Setter][#useMaxLevelIdc(int)]
/// ### maxLevelIdc
/// [VarHandle][#VH_maxLevelIdc] - [Getter][#maxLevelIdc()] - [Setter][#maxLevelIdc(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265SessionCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useMaxLevelIdc;
///     StdVideoH265LevelIdc maxLevelIdc;
/// } VkVideoEncodeH265SessionCreateInfoKHR;
/// ```
public final class VkVideoEncodeH265SessionCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265SessionCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useMaxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxLevelIdc"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));

    /// Creates `VkVideoEncodeH265SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265SessionCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionCreateInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265SessionCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265SessionCreateInfoKHR`
    public static VkVideoEncodeH265SessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265SessionCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265SessionCreateInfoKHR`
    public static VkVideoEncodeH265SessionCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265SessionCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265SessionCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265SessionCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265SessionCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265SessionCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265SessionCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useMaxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxLevelIdc(MemorySegment segment, long index) { return (int) VH_useMaxLevelIdc.get(segment, 0L, index); }
    /// {@return `useMaxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxLevelIdc(MemorySegment segment) { return VkVideoEncodeH265SessionCreateInfoKHR.get_useMaxLevelIdc(segment, 0L); }
    /// {@return `useMaxLevelIdc` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMaxLevelIdcAt(long index) { return VkVideoEncodeH265SessionCreateInfoKHR.get_useMaxLevelIdc(this.segment(), index); }
    /// {@return `useMaxLevelIdc`}
    public @CType("VkBool32") int useMaxLevelIdc() { return VkVideoEncodeH265SessionCreateInfoKHR.get_useMaxLevelIdc(this.segment()); }
    /// Sets `useMaxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxLevelIdc(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `useMaxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxLevelIdc(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_useMaxLevelIdc(segment, 0L, value); }
    /// Sets `useMaxLevelIdc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR useMaxLevelIdcAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_useMaxLevelIdc(this.segment(), index, value); return this; }
    /// Sets `useMaxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR useMaxLevelIdc(@CType("VkBool32") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_useMaxLevelIdc(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoEncodeH265SessionCreateInfoKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc` at the given index}
    /// @param index the index
    public @CType("StdVideoH265LevelIdc") int maxLevelIdcAt(long index) { return VkVideoEncodeH265SessionCreateInfoKHR.get_maxLevelIdc(this.segment(), index); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH265LevelIdc") int maxLevelIdc() { return VkVideoEncodeH265SessionCreateInfoKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH265LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR maxLevelIdcAt(long index, @CType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_maxLevelIdc(this.segment(), index, value); return this; }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionCreateInfoKHR maxLevelIdc(@CType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265SessionCreateInfoKHR.set_maxLevelIdc(this.segment(), value); return this; }

}
