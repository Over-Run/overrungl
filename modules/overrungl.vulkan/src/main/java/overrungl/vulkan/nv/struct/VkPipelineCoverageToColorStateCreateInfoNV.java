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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### coverageToColorEnable
/// [VarHandle][#VH_coverageToColorEnable] - [Getter][#coverageToColorEnable()] - [Setter][#coverageToColorEnable(int)]
/// ### coverageToColorLocation
/// [VarHandle][#VH_coverageToColorLocation] - [Getter][#coverageToColorLocation()] - [Setter][#coverageToColorLocation(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCoverageToColorStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCoverageToColorStateCreateFlagsNV flags;
///     VkBool32 coverageToColorEnable;
///     uint32_t coverageToColorLocation;
/// } VkPipelineCoverageToColorStateCreateInfoNV;
/// ```
public final class VkPipelineCoverageToColorStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineCoverageToColorStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("coverageToColorLocation")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `coverageToColorEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageToColorEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageToColorEnable"));
    /// The [VarHandle] of `coverageToColorLocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageToColorLocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageToColorLocation"));

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCoverageToColorStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageToColorStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment); }

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageToColorStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageToColorStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCoverageToColorStateCreateInfoNV`
    public static VkPipelineCoverageToColorStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageToColorStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCoverageToColorStateCreateInfoNV`
    public static VkPipelineCoverageToColorStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineCoverageToColorStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineCoverageToColorStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineCoverageToColorStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineCoverageToColorStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineCoverageToColorStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineCoverageToColorStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineCoverageToColorStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCoverageToColorStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCoverageToColorStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCoverageToColorStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int get_flags(MemorySegment segment) { return VkPipelineCoverageToColorStateCreateInfoNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int flagsAt(long index) { return VkPipelineCoverageToColorStateCreateInfoNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int flags() { return VkPipelineCoverageToColorStateCreateInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV flagsAt(long index, @CType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV flags(@CType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `coverageToColorEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_coverageToColorEnable(MemorySegment segment, long index) { return (int) VH_coverageToColorEnable.get(segment, 0L, index); }
    /// {@return `coverageToColorEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_coverageToColorEnable(MemorySegment segment) { return VkPipelineCoverageToColorStateCreateInfoNV.get_coverageToColorEnable(segment, 0L); }
    /// {@return `coverageToColorEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int coverageToColorEnableAt(long index) { return VkPipelineCoverageToColorStateCreateInfoNV.get_coverageToColorEnable(this.segment(), index); }
    /// {@return `coverageToColorEnable`}
    public @CType("VkBool32") int coverageToColorEnable() { return VkPipelineCoverageToColorStateCreateInfoNV.get_coverageToColorEnable(this.segment()); }
    /// Sets `coverageToColorEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageToColorEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_coverageToColorEnable.set(segment, 0L, index, value); }
    /// Sets `coverageToColorEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageToColorEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_coverageToColorEnable(segment, 0L, value); }
    /// Sets `coverageToColorEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnableAt(long index, @CType("VkBool32") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_coverageToColorEnable(this.segment(), index, value); return this; }
    /// Sets `coverageToColorEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(@CType("VkBool32") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_coverageToColorEnable(this.segment(), value); return this; }

    /// {@return `coverageToColorLocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_coverageToColorLocation(MemorySegment segment, long index) { return (int) VH_coverageToColorLocation.get(segment, 0L, index); }
    /// {@return `coverageToColorLocation`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_coverageToColorLocation(MemorySegment segment) { return VkPipelineCoverageToColorStateCreateInfoNV.get_coverageToColorLocation(segment, 0L); }
    /// {@return `coverageToColorLocation` at the given index}
    /// @param index the index
    public @CType("uint32_t") int coverageToColorLocationAt(long index) { return VkPipelineCoverageToColorStateCreateInfoNV.get_coverageToColorLocation(this.segment(), index); }
    /// {@return `coverageToColorLocation`}
    public @CType("uint32_t") int coverageToColorLocation() { return VkPipelineCoverageToColorStateCreateInfoNV.get_coverageToColorLocation(this.segment()); }
    /// Sets `coverageToColorLocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageToColorLocation(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_coverageToColorLocation.set(segment, 0L, index, value); }
    /// Sets `coverageToColorLocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageToColorLocation(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_coverageToColorLocation(segment, 0L, value); }
    /// Sets `coverageToColorLocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocationAt(long index, @CType("uint32_t") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_coverageToColorLocation(this.segment(), index, value); return this; }
    /// Sets `coverageToColorLocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(@CType("uint32_t") int value) { VkPipelineCoverageToColorStateCreateInfoNV.set_coverageToColorLocation(this.segment(), value); return this; }

}
