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
/// ### displayMode
/// [VarHandle][#VH_displayMode] - [Getter][#displayMode()] - [Setter][#displayMode(java.lang.foreign.MemorySegment)]
/// ### parameters
/// [Byte offset][#OFFSET_parameters] - [Memory layout][#ML_parameters] - [Getter][#parameters()] - [Setter][#parameters(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayModePropertiesKHR {
///     VkDisplayModeKHR displayMode;
///     VkDisplayModeParametersKHR parameters;
/// } VkDisplayModePropertiesKHR;
/// ```
public final class VkDisplayModePropertiesKHR extends Struct {
    /// The struct layout of `VkDisplayModePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("displayMode"),
        overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    /// The [VarHandle] of `displayMode` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    /// The byte offset of `parameters`.
    public static final long OFFSET_parameters = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
    /// The memory layout of `parameters`.
    public static final MemoryLayout ML_parameters = LAYOUT.select(PathElement.groupElement("parameters"));

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayModePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayModePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModePropertiesKHR`
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayModePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModePropertiesKHR`
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDisplayModePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayModePropertiesKHR`
    public VkDisplayModePropertiesKHR asSlice(long index) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDisplayModePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayModePropertiesKHR`
    public VkDisplayModePropertiesKHR asSlice(long index, long count) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `displayMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment get_displayMode(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_displayMode.get(segment, 0L, index); }
    /// {@return `displayMode`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment get_displayMode(MemorySegment segment) { return VkDisplayModePropertiesKHR.get_displayMode(segment, 0L); }
    /// {@return `displayMode` at the given index}
    /// @param index the index
    public @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment displayModeAt(long index) { return VkDisplayModePropertiesKHR.get_displayMode(this.segment(), index); }
    /// {@return `displayMode`}
    public @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment displayMode() { return VkDisplayModePropertiesKHR.get_displayMode(this.segment()); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayMode(MemorySegment segment, long index, @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VH_displayMode.set(segment, 0L, index, value); }
    /// Sets `displayMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayMode(MemorySegment segment, @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VkDisplayModePropertiesKHR.set_displayMode(segment, 0L, value); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR displayModeAt(long index, @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VkDisplayModePropertiesKHR.set_displayMode(this.segment(), index, value); return this; }
    /// Sets `displayMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR displayMode(@CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VkDisplayModePropertiesKHR.set_displayMode(this.segment(), value); return this; }

    /// {@return `parameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment get_parameters(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parameters, index), ML_parameters); }
    /// {@return `parameters`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment get_parameters(MemorySegment segment) { return VkDisplayModePropertiesKHR.get_parameters(segment, 0L); }
    /// {@return `parameters` at the given index}
    /// @param index the index
    public @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment parametersAt(long index) { return VkDisplayModePropertiesKHR.get_parameters(this.segment(), index); }
    /// {@return `parameters`}
    public @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment parameters() { return VkDisplayModePropertiesKHR.get_parameters(this.segment()); }
    /// Sets `parameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_parameters(MemorySegment segment, long index, @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parameters, index), ML_parameters.byteSize()); }
    /// Sets `parameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_parameters(MemorySegment segment, @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { VkDisplayModePropertiesKHR.set_parameters(segment, 0L, value); }
    /// Sets `parameters` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR parametersAt(long index, @CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { VkDisplayModePropertiesKHR.set_parameters(this.segment(), index, value); return this; }
    /// Sets `parameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR parameters(@CType("VkDisplayModeParametersKHR") java.lang.foreign.MemorySegment value) { VkDisplayModePropertiesKHR.set_parameters(this.segment(), value); return this; }

}
