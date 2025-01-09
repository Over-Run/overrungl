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
/// ### useGopRemainingFrames
/// [VarHandle][#VH_useGopRemainingFrames] - [Getter][#useGopRemainingFrames()] - [Setter][#useGopRemainingFrames(int)]
/// ### gopRemainingI
/// [VarHandle][#VH_gopRemainingI] - [Getter][#gopRemainingI()] - [Setter][#gopRemainingI(int)]
/// ### gopRemainingP
/// [VarHandle][#VH_gopRemainingP] - [Getter][#gopRemainingP()] - [Setter][#gopRemainingP(int)]
/// ### gopRemainingB
/// [VarHandle][#VH_gopRemainingB] - [Getter][#gopRemainingB()] - [Setter][#gopRemainingB(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingI;
///     uint32_t gopRemainingP;
///     uint32_t gopRemainingB;
/// } VkVideoEncodeH264GopRemainingFrameInfoKHR;
/// ```
public final class VkVideoEncodeH264GopRemainingFrameInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264GopRemainingFrameInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingI"),
        ValueLayout.JAVA_INT.withName("gopRemainingP"),
        ValueLayout.JAVA_INT.withName("gopRemainingB")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useGopRemainingFrames"));
    /// The [VarHandle] of `gopRemainingI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingI"));
    /// The [VarHandle] of `gopRemainingP` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingP"));
    /// The [VarHandle] of `gopRemainingB` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopRemainingB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingB"));

    /// Creates `VkVideoEncodeH264GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264GopRemainingFrameInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264GopRemainingFrameInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264GopRemainingFrameInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264GopRemainingFrameInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264GopRemainingFrameInfoKHR`
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264GopRemainingFrameInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264GopRemainingFrameInfoKHR`
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_useGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `useGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_useGopRemainingFrames(segment, 0L); }
    /// {@return `useGopRemainingFrames` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useGopRemainingFramesAt(long index) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_useGopRemainingFrames(this.segment(), index); }
    /// {@return `useGopRemainingFrames`}
    public @CType("VkBool32") int useGopRemainingFrames() { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_useGopRemainingFrames(this.segment()); }
    /// Sets `useGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_useGopRemainingFrames(segment, 0L, value); }
    /// Sets `useGopRemainingFrames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR useGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_useGopRemainingFrames(this.segment(), index, value); return this; }
    /// Sets `useGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR useGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_useGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `gopRemainingI` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingI(MemorySegment segment, long index) { return (int) VH_gopRemainingI.get(segment, 0L, index); }
    /// {@return `gopRemainingI`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingI(MemorySegment segment) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingI(segment, 0L); }
    /// {@return `gopRemainingI` at the given index}
    /// @param index the index
    public @CType("uint32_t") int gopRemainingIAt(long index) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingI(this.segment(), index); }
    /// {@return `gopRemainingI`}
    public @CType("uint32_t") int gopRemainingI() { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingI(this.segment()); }
    /// Sets `gopRemainingI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingI(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingI.set(segment, 0L, index, value); }
    /// Sets `gopRemainingI` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingI(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingI(segment, 0L, value); }
    /// Sets `gopRemainingI` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingIAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingI(this.segment(), index, value); return this; }
    /// Sets `gopRemainingI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingI(@CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingI(this.segment(), value); return this; }

    /// {@return `gopRemainingP` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingP(MemorySegment segment, long index) { return (int) VH_gopRemainingP.get(segment, 0L, index); }
    /// {@return `gopRemainingP`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingP(MemorySegment segment) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingP(segment, 0L); }
    /// {@return `gopRemainingP` at the given index}
    /// @param index the index
    public @CType("uint32_t") int gopRemainingPAt(long index) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingP(this.segment(), index); }
    /// {@return `gopRemainingP`}
    public @CType("uint32_t") int gopRemainingP() { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingP(this.segment()); }
    /// Sets `gopRemainingP` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingP(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingP.set(segment, 0L, index, value); }
    /// Sets `gopRemainingP` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingP(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingP(segment, 0L, value); }
    /// Sets `gopRemainingP` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingPAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingP(this.segment(), index, value); return this; }
    /// Sets `gopRemainingP` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingP(@CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingP(this.segment(), value); return this; }

    /// {@return `gopRemainingB` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopRemainingB(MemorySegment segment, long index) { return (int) VH_gopRemainingB.get(segment, 0L, index); }
    /// {@return `gopRemainingB`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopRemainingB(MemorySegment segment) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingB(segment, 0L); }
    /// {@return `gopRemainingB` at the given index}
    /// @param index the index
    public @CType("uint32_t") int gopRemainingBAt(long index) { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingB(this.segment(), index); }
    /// {@return `gopRemainingB`}
    public @CType("uint32_t") int gopRemainingB() { return VkVideoEncodeH264GopRemainingFrameInfoKHR.get_gopRemainingB(this.segment()); }
    /// Sets `gopRemainingB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopRemainingB(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopRemainingB.set(segment, 0L, index, value); }
    /// Sets `gopRemainingB` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopRemainingB(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingB(segment, 0L, value); }
    /// Sets `gopRemainingB` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingBAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingB(this.segment(), index, value); return this; }
    /// Sets `gopRemainingB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingB(@CType("uint32_t") int value) { VkVideoEncodeH264GopRemainingFrameInfoKHR.set_gopRemainingB(this.segment(), value); return this; }

}
