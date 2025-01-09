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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### parameters
/// [Byte offset][#OFFSET_parameters] - [Memory layout][#ML_parameters] - [Getter][#parameters()] - [Setter][#parameters(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayModeCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDisplayModeCreateFlagsKHR flags;
///     VkDisplayModeParametersKHR parameters;
/// } VkDisplayModeCreateInfoKHR;
/// ```
public final class VkDisplayModeCreateInfoKHR extends Struct {
    /// The struct layout of `VkDisplayModeCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `parameters`.
    public static final long OFFSET_parameters = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
    /// The memory layout of `parameters`.
    public static final MemoryLayout ML_parameters = LAYOUT.select(PathElement.groupElement("parameters"));

    /// Creates `VkDisplayModeCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayModeCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayModeCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeCreateInfoKHR(segment); }

    /// Creates `VkDisplayModeCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayModeCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayModeCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeCreateInfoKHR`
    public static VkDisplayModeCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplayModeCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayModeCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModeCreateInfoKHR`
    public static VkDisplayModeCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayModeCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayModeCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayModeCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayModeCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayModeCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR sType(@CType("VkStructureType") int value) { VkDisplayModeCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDisplayModeCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDisplayModeCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDisplayModeCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayModeCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayModeCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayModeCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModeCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModeCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkDisplayModeCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkDisplayModeCreateFlagsKHR") int flagsAt(long index) { return VkDisplayModeCreateInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkDisplayModeCreateFlagsKHR") int flags() { return VkDisplayModeCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDisplayModeCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDisplayModeCreateFlagsKHR") int value) { VkDisplayModeCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR flagsAt(long index, @CType("VkDisplayModeCreateFlagsKHR") int value) { VkDisplayModeCreateInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR flags(@CType("VkDisplayModeCreateFlagsKHR") int value) { VkDisplayModeCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `parameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment get_parameters(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parameters, index), ML_parameters); }
    /// {@return `parameters`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment get_parameters(MemorySegment segment) { return VkDisplayModeCreateInfoKHR.get_parameters(segment, 0L); }
    /// {@return `parameters` at the given index}
    /// @param index the index
    public @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment parametersAt(long index) { return VkDisplayModeCreateInfoKHR.get_parameters(this.segment(), index); }
    /// {@return `parameters`}
    public @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment parameters() { return VkDisplayModeCreateInfoKHR.get_parameters(this.segment()); }
    /// Sets `parameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_parameters(MemorySegment segment, long index, @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parameters, index), ML_parameters.byteSize()); }
    /// Sets `parameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_parameters(MemorySegment segment, @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { VkDisplayModeCreateInfoKHR.set_parameters(segment, 0L, value); }
    /// Sets `parameters` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR parametersAt(long index, @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { VkDisplayModeCreateInfoKHR.set_parameters(this.segment(), index, value); return this; }
    /// Sets `parameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeCreateInfoKHR parameters(@CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { VkDisplayModeCreateInfoKHR.set_parameters(this.segment(), value); return this; }

}
