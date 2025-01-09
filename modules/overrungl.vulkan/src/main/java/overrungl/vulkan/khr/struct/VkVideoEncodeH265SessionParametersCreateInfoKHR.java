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
/// ### maxStdVPSCount
/// [VarHandle][#VH_maxStdVPSCount] - [Getter][#maxStdVPSCount()] - [Setter][#maxStdVPSCount(int)]
/// ### maxStdSPSCount
/// [VarHandle][#VH_maxStdSPSCount] - [Getter][#maxStdSPSCount()] - [Setter][#maxStdSPSCount(int)]
/// ### maxStdPPSCount
/// [VarHandle][#VH_maxStdPPSCount] - [Getter][#maxStdPPSCount()] - [Setter][#maxStdPPSCount(int)]
/// ### pParametersAddInfo
/// [VarHandle][#VH_pParametersAddInfo] - [Getter][#pParametersAddInfo()] - [Setter][#pParametersAddInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t maxStdVPSCount;
///     uint32_t maxStdSPSCount;
///     uint32_t maxStdPPSCount;
///     const VkVideoEncodeH265SessionParametersAddInfoKHR * pParametersAddInfo;
/// } VkVideoEncodeH265SessionParametersCreateInfoKHR;
/// ```
public final class VkVideoEncodeH265SessionParametersCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxStdVPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdSPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdPPSCount"),
        ValueLayout.ADDRESS.withName("pParametersAddInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxStdVPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxStdVPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdVPSCount"));
    /// The [VarHandle] of `maxStdSPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxStdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdSPSCount"));
    /// The [VarHandle] of `maxStdPPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxStdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdPPSCount"));
    /// The [VarHandle] of `pParametersAddInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pParametersAddInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParametersAddInfo"));

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265SessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxStdVPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxStdVPSCount(MemorySegment segment, long index) { return (int) VH_maxStdVPSCount.get(segment, 0L, index); }
    /// {@return `maxStdVPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxStdVPSCount(MemorySegment segment) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdVPSCount(segment, 0L); }
    /// {@return `maxStdVPSCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxStdVPSCountAt(long index) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdVPSCount(this.segment(), index); }
    /// {@return `maxStdVPSCount`}
    public @CType("uint32_t") int maxStdVPSCount() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdVPSCount(this.segment()); }
    /// Sets `maxStdVPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxStdVPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxStdVPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdVPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxStdVPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdVPSCount(segment, 0L, value); }
    /// Sets `maxStdVPSCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdVPSCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdVPSCount(this.segment(), index, value); return this; }
    /// Sets `maxStdVPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdVPSCount(@CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdVPSCount(this.segment(), value); return this; }

    /// {@return `maxStdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxStdSPSCount(MemorySegment segment, long index) { return (int) VH_maxStdSPSCount.get(segment, 0L, index); }
    /// {@return `maxStdSPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxStdSPSCount(MemorySegment segment) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdSPSCount(segment, 0L); }
    /// {@return `maxStdSPSCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxStdSPSCountAt(long index) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdSPSCount(this.segment(), index); }
    /// {@return `maxStdSPSCount`}
    public @CType("uint32_t") int maxStdSPSCount() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdSPSCount(this.segment()); }
    /// Sets `maxStdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxStdSPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxStdSPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdSPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxStdSPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdSPSCount(segment, 0L, value); }
    /// Sets `maxStdSPSCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdSPSCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdSPSCount(this.segment(), index, value); return this; }
    /// Sets `maxStdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdSPSCount(@CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdSPSCount(this.segment(), value); return this; }

    /// {@return `maxStdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxStdPPSCount(MemorySegment segment, long index) { return (int) VH_maxStdPPSCount.get(segment, 0L, index); }
    /// {@return `maxStdPPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxStdPPSCount(MemorySegment segment) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdPPSCount(segment, 0L); }
    /// {@return `maxStdPPSCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxStdPPSCountAt(long index) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdPPSCount(this.segment(), index); }
    /// {@return `maxStdPPSCount`}
    public @CType("uint32_t") int maxStdPPSCount() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_maxStdPPSCount(this.segment()); }
    /// Sets `maxStdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxStdPPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxStdPPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdPPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxStdPPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdPPSCount(segment, 0L, value); }
    /// Sets `maxStdPPSCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdPPSCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdPPSCount(this.segment(), index, value); return this; }
    /// Sets `maxStdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdPPSCount(@CType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_maxStdPPSCount(this.segment(), value); return this; }

    /// {@return `pParametersAddInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment get_pParametersAddInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pParametersAddInfo.get(segment, 0L, index); }
    /// {@return `pParametersAddInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment get_pParametersAddInfo(MemorySegment segment) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_pParametersAddInfo(segment, 0L); }
    /// {@return `pParametersAddInfo` at the given index}
    /// @param index the index
    public @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment pParametersAddInfoAt(long index) { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_pParametersAddInfo(this.segment(), index); }
    /// {@return `pParametersAddInfo`}
    public @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment pParametersAddInfo() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.get_pParametersAddInfo(this.segment()); }
    /// Sets `pParametersAddInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pParametersAddInfo(MemorySegment segment, long index, @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pParametersAddInfo.set(segment, 0L, index, value); }
    /// Sets `pParametersAddInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pParametersAddInfo(MemorySegment segment, @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_pParametersAddInfo(segment, 0L, value); }
    /// Sets `pParametersAddInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pParametersAddInfoAt(long index, @CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_pParametersAddInfo(this.segment(), index, value); return this; }
    /// Sets `pParametersAddInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pParametersAddInfo(@CType("const VkVideoEncodeH265SessionParametersAddInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.set_pParametersAddInfo(this.segment(), value); return this; }

}
