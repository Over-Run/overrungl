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
package overrungl.vulkan.lunarg.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pfnGetInstanceProcAddr
/// [VarHandle][#VH_pfnGetInstanceProcAddr] - [Getter][#pfnGetInstanceProcAddr()] - [Setter][#pfnGetInstanceProcAddr(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDirectDriverLoadingInfoLUNARG {
///     VkStructureType sType;
///     void * pNext;
///     VkDirectDriverLoadingFlagsLUNARG flags;
///     PFN_vkGetInstanceProcAddrLUNARG pfnGetInstanceProcAddr;
/// } VkDirectDriverLoadingInfoLUNARG;
/// ```
public final class VkDirectDriverLoadingInfoLUNARG extends Struct {
    /// The struct layout of `VkDirectDriverLoadingInfoLUNARG`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pfnGetInstanceProcAddr` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnGetInstanceProcAddr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnGetInstanceProcAddr"));

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    /// @param segment the memory segment
    public VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingInfoLUNARG of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment); }

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingInfoLUNARG ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingInfoLUNARG ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDirectDriverLoadingInfoLUNARG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectDriverLoadingInfoLUNARG`
    public static VkDirectDriverLoadingInfoLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingInfoLUNARG(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDirectDriverLoadingInfoLUNARG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDirectDriverLoadingInfoLUNARG`
    public static VkDirectDriverLoadingInfoLUNARG alloc(SegmentAllocator allocator, long count) { return new VkDirectDriverLoadingInfoLUNARG(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDirectDriverLoadingInfoLUNARG`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDirectDriverLoadingInfoLUNARG`
    public VkDirectDriverLoadingInfoLUNARG asSlice(long index) { return new VkDirectDriverLoadingInfoLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDirectDriverLoadingInfoLUNARG`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDirectDriverLoadingInfoLUNARG`
    public VkDirectDriverLoadingInfoLUNARG asSlice(long index, long count) { return new VkDirectDriverLoadingInfoLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDirectDriverLoadingInfoLUNARG.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDirectDriverLoadingInfoLUNARG.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDirectDriverLoadingInfoLUNARG.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDirectDriverLoadingInfoLUNARG.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG sTypeAt(long index, @CType("VkStructureType") int value) { VkDirectDriverLoadingInfoLUNARG.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG sType(@CType("VkStructureType") int value) { VkDirectDriverLoadingInfoLUNARG.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDirectDriverLoadingInfoLUNARG.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDirectDriverLoadingInfoLUNARG.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDirectDriverLoadingInfoLUNARG.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingInfoLUNARG.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingInfoLUNARG.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingInfoLUNARG.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDirectDriverLoadingFlagsLUNARG") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDirectDriverLoadingFlagsLUNARG") int get_flags(MemorySegment segment) { return VkDirectDriverLoadingInfoLUNARG.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkDirectDriverLoadingFlagsLUNARG") int flagsAt(long index) { return VkDirectDriverLoadingInfoLUNARG.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkDirectDriverLoadingFlagsLUNARG") int flags() { return VkDirectDriverLoadingInfoLUNARG.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDirectDriverLoadingFlagsLUNARG") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDirectDriverLoadingFlagsLUNARG") int value) { VkDirectDriverLoadingInfoLUNARG.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG flagsAt(long index, @CType("VkDirectDriverLoadingFlagsLUNARG") int value) { VkDirectDriverLoadingInfoLUNARG.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG flags(@CType("VkDirectDriverLoadingFlagsLUNARG") int value) { VkDirectDriverLoadingInfoLUNARG.set_flags(this.segment(), value); return this; }

    /// {@return `pfnGetInstanceProcAddr` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment get_pfnGetInstanceProcAddr(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnGetInstanceProcAddr.get(segment, 0L, index); }
    /// {@return `pfnGetInstanceProcAddr`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment get_pfnGetInstanceProcAddr(MemorySegment segment) { return VkDirectDriverLoadingInfoLUNARG.get_pfnGetInstanceProcAddr(segment, 0L); }
    /// {@return `pfnGetInstanceProcAddr` at the given index}
    /// @param index the index
    public @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment pfnGetInstanceProcAddrAt(long index) { return VkDirectDriverLoadingInfoLUNARG.get_pfnGetInstanceProcAddr(this.segment(), index); }
    /// {@return `pfnGetInstanceProcAddr`}
    public @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment pfnGetInstanceProcAddr() { return VkDirectDriverLoadingInfoLUNARG.get_pfnGetInstanceProcAddr(this.segment()); }
    /// Sets `pfnGetInstanceProcAddr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnGetInstanceProcAddr(MemorySegment segment, long index, @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment value) { VH_pfnGetInstanceProcAddr.set(segment, 0L, index, value); }
    /// Sets `pfnGetInstanceProcAddr` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnGetInstanceProcAddr(MemorySegment segment, @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingInfoLUNARG.set_pfnGetInstanceProcAddr(segment, 0L, value); }
    /// Sets `pfnGetInstanceProcAddr` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddrAt(long index, @CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingInfoLUNARG.set_pfnGetInstanceProcAddr(this.segment(), index, value); return this; }
    /// Sets `pfnGetInstanceProcAddr` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddr(@CType("PFN_vkGetInstanceProcAddrLUNARG") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingInfoLUNARG.set_pfnGetInstanceProcAddr(this.segment(), value); return this; }

}
