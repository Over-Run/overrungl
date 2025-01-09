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
/// ### stdVPSCount
/// [VarHandle][#VH_stdVPSCount] - [Getter][#stdVPSCount()] - [Setter][#stdVPSCount(int)]
/// ### pStdVPSs
/// [VarHandle][#VH_pStdVPSs] - [Getter][#pStdVPSs()] - [Setter][#pStdVPSs(java.lang.foreign.MemorySegment)]
/// ### stdSPSCount
/// [VarHandle][#VH_stdSPSCount] - [Getter][#stdSPSCount()] - [Setter][#stdSPSCount(int)]
/// ### pStdSPSs
/// [VarHandle][#VH_pStdSPSs] - [Getter][#pStdSPSs()] - [Setter][#pStdSPSs(java.lang.foreign.MemorySegment)]
/// ### stdPPSCount
/// [VarHandle][#VH_stdPPSCount] - [Getter][#stdPPSCount()] - [Setter][#stdPPSCount(int)]
/// ### pStdPPSs
/// [VarHandle][#VH_pStdPPSs] - [Getter][#pStdPPSs()] - [Setter][#pStdPPSs(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH265SessionParametersAddInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t stdVPSCount;
///     const StdVideoH265VideoParameterSet * pStdVPSs;
///     uint32_t stdSPSCount;
///     const StdVideoH265SequenceParameterSet * pStdSPSs;
///     uint32_t stdPPSCount;
///     const StdVideoH265PictureParameterSet * pStdPPSs;
/// } VkVideoDecodeH265SessionParametersAddInfoKHR;
/// ```
public final class VkVideoDecodeH265SessionParametersAddInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH265SessionParametersAddInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdVPSCount"),
        ValueLayout.ADDRESS.withName("pStdVPSs"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withName("pStdPPSs")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stdVPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdVPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdVPSCount"));
    /// The [VarHandle] of `pStdVPSs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdVPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdVPSs"));
    /// The [VarHandle] of `stdSPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSCount"));
    /// The [VarHandle] of `pStdSPSs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdSPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPSs"));
    /// The [VarHandle] of `stdPPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSCount"));
    /// The [VarHandle] of `pStdPPSs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPSs"));

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH265SessionParametersAddInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment); }

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public VkVideoDecodeH265SessionParametersAddInfoKHR asSlice(long index) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public VkVideoDecodeH265SessionParametersAddInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `stdVPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdVPSCount(MemorySegment segment, long index) { return (int) VH_stdVPSCount.get(segment, 0L, index); }
    /// {@return `stdVPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdVPSCount(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdVPSCount(segment, 0L); }
    /// {@return `stdVPSCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stdVPSCountAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdVPSCount(this.segment(), index); }
    /// {@return `stdVPSCount`}
    public @CType("uint32_t") int stdVPSCount() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdVPSCount(this.segment()); }
    /// Sets `stdVPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdVPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdVPSCount.set(segment, 0L, index, value); }
    /// Sets `stdVPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdVPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdVPSCount(segment, 0L, value); }
    /// Sets `stdVPSCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdVPSCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdVPSCount(this.segment(), index, value); return this; }
    /// Sets `stdVPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdVPSCount(@CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdVPSCount(this.segment(), value); return this; }

    /// {@return `pStdVPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment get_pStdVPSs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdVPSs.get(segment, 0L, index); }
    /// {@return `pStdVPSs`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment get_pStdVPSs(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdVPSs(segment, 0L); }
    /// {@return `pStdVPSs` at the given index}
    /// @param index the index
    public @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment pStdVPSsAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdVPSs(this.segment(), index); }
    /// {@return `pStdVPSs`}
    public @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment pStdVPSs() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdVPSs(this.segment()); }
    /// Sets `pStdVPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdVPSs(MemorySegment segment, long index, @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment value) { VH_pStdVPSs.set(segment, 0L, index, value); }
    /// Sets `pStdVPSs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdVPSs(MemorySegment segment, @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdVPSs(segment, 0L, value); }
    /// Sets `pStdVPSs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSsAt(long index, @CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdVPSs(this.segment(), index, value); return this; }
    /// Sets `pStdVPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSs(@CType("const StdVideoH265VideoParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdVPSs(this.segment(), value); return this; }

    /// {@return `stdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdSPSCount(MemorySegment segment, long index) { return (int) VH_stdSPSCount.get(segment, 0L, index); }
    /// {@return `stdSPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdSPSCount(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdSPSCount(segment, 0L); }
    /// {@return `stdSPSCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stdSPSCountAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdSPSCount(this.segment(), index); }
    /// {@return `stdSPSCount`}
    public @CType("uint32_t") int stdSPSCount() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdSPSCount(this.segment()); }
    /// Sets `stdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdSPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdSPSCount.set(segment, 0L, index, value); }
    /// Sets `stdSPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdSPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdSPSCount(segment, 0L, value); }
    /// Sets `stdSPSCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdSPSCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdSPSCount(this.segment(), index, value); return this; }
    /// Sets `stdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdSPSCount(@CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdSPSCount(this.segment(), value); return this; }

    /// {@return `pStdSPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment get_pStdSPSs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdSPSs.get(segment, 0L, index); }
    /// {@return `pStdSPSs`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment get_pStdSPSs(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdSPSs(segment, 0L); }
    /// {@return `pStdSPSs` at the given index}
    /// @param index the index
    public @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment pStdSPSsAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdSPSs(this.segment(), index); }
    /// {@return `pStdSPSs`}
    public @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment pStdSPSs() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdSPSs(this.segment()); }
    /// Sets `pStdSPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdSPSs(MemorySegment segment, long index, @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VH_pStdSPSs.set(segment, 0L, index, value); }
    /// Sets `pStdSPSs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdSPSs(MemorySegment segment, @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdSPSs(segment, 0L, value); }
    /// Sets `pStdSPSs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSsAt(long index, @CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdSPSs(this.segment(), index, value); return this; }
    /// Sets `pStdSPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSs(@CType("const StdVideoH265SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdSPSs(this.segment(), value); return this; }

    /// {@return `stdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdPPSCount(MemorySegment segment, long index) { return (int) VH_stdPPSCount.get(segment, 0L, index); }
    /// {@return `stdPPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdPPSCount(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdPPSCount(segment, 0L); }
    /// {@return `stdPPSCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stdPPSCountAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdPPSCount(this.segment(), index); }
    /// {@return `stdPPSCount`}
    public @CType("uint32_t") int stdPPSCount() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_stdPPSCount(this.segment()); }
    /// Sets `stdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdPPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdPPSCount.set(segment, 0L, index, value); }
    /// Sets `stdPPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdPPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdPPSCount(segment, 0L, value); }
    /// Sets `stdPPSCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdPPSCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdPPSCount(this.segment(), index, value); return this; }
    /// Sets `stdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdPPSCount(@CType("uint32_t") int value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_stdPPSCount(this.segment(), value); return this; }

    /// {@return `pStdPPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment get_pStdPPSs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPPSs.get(segment, 0L, index); }
    /// {@return `pStdPPSs`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment get_pStdPPSs(MemorySegment segment) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdPPSs(segment, 0L); }
    /// {@return `pStdPPSs` at the given index}
    /// @param index the index
    public @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment pStdPPSsAt(long index) { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdPPSs(this.segment(), index); }
    /// {@return `pStdPPSs`}
    public @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment pStdPPSs() { return VkVideoDecodeH265SessionParametersAddInfoKHR.get_pStdPPSs(this.segment()); }
    /// Sets `pStdPPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPPSs(MemorySegment segment, long index, @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment value) { VH_pStdPPSs.set(segment, 0L, index, value); }
    /// Sets `pStdPPSs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPPSs(MemorySegment segment, @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdPPSs(segment, 0L, value); }
    /// Sets `pStdPPSs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSsAt(long index, @CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdPPSs(this.segment(), index, value); return this; }
    /// Sets `pStdPPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSs(@CType("const StdVideoH265PictureParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH265SessionParametersAddInfoKHR.set_pStdPPSs(this.segment(), value); return this; }

}
