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
/// ### currentDisplay
/// [VarHandle][#VH_currentDisplay] - [Getter][#currentDisplay()] - [Setter][#currentDisplay(java.lang.foreign.MemorySegment)]
/// ### currentStackIndex
/// [VarHandle][#VH_currentStackIndex] - [Getter][#currentStackIndex()] - [Setter][#currentStackIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayPlanePropertiesKHR {
///     VkDisplayKHR currentDisplay;
///     uint32_t currentStackIndex;
/// } VkDisplayPlanePropertiesKHR;
/// ```
public final class VkDisplayPlanePropertiesKHR extends Struct {
    /// The struct layout of `VkDisplayPlanePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );
    /// The [VarHandle] of `currentDisplay` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_currentDisplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentDisplay"));
    /// The [VarHandle] of `currentStackIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_currentStackIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentStackIndex"));

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPlanePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlanePropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment); }

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlanePropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlanePropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayPlanePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlanePropertiesKHR`
    public static VkDisplayPlanePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPlanePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPlanePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlanePropertiesKHR`
    public static VkDisplayPlanePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlanePropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDisplayPlanePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayPlanePropertiesKHR`
    public VkDisplayPlanePropertiesKHR asSlice(long index) { return new VkDisplayPlanePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDisplayPlanePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayPlanePropertiesKHR`
    public VkDisplayPlanePropertiesKHR asSlice(long index, long count) { return new VkDisplayPlanePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `currentDisplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayKHR") java.lang.foreign.MemorySegment get_currentDisplay(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_currentDisplay.get(segment, 0L, index); }
    /// {@return `currentDisplay`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayKHR") java.lang.foreign.MemorySegment get_currentDisplay(MemorySegment segment) { return VkDisplayPlanePropertiesKHR.get_currentDisplay(segment, 0L); }
    /// {@return `currentDisplay` at the given index}
    /// @param index the index
    public @CType("VkDisplayKHR") java.lang.foreign.MemorySegment currentDisplayAt(long index) { return VkDisplayPlanePropertiesKHR.get_currentDisplay(this.segment(), index); }
    /// {@return `currentDisplay`}
    public @CType("VkDisplayKHR") java.lang.foreign.MemorySegment currentDisplay() { return VkDisplayPlanePropertiesKHR.get_currentDisplay(this.segment()); }
    /// Sets `currentDisplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_currentDisplay(MemorySegment segment, long index, @CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VH_currentDisplay.set(segment, 0L, index, value); }
    /// Sets `currentDisplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_currentDisplay(MemorySegment segment, @CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlanePropertiesKHR.set_currentDisplay(segment, 0L, value); }
    /// Sets `currentDisplay` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPlanePropertiesKHR currentDisplayAt(long index, @CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlanePropertiesKHR.set_currentDisplay(this.segment(), index, value); return this; }
    /// Sets `currentDisplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlanePropertiesKHR currentDisplay(@CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlanePropertiesKHR.set_currentDisplay(this.segment(), value); return this; }

    /// {@return `currentStackIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_currentStackIndex(MemorySegment segment, long index) { return (int) VH_currentStackIndex.get(segment, 0L, index); }
    /// {@return `currentStackIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_currentStackIndex(MemorySegment segment) { return VkDisplayPlanePropertiesKHR.get_currentStackIndex(segment, 0L); }
    /// {@return `currentStackIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int currentStackIndexAt(long index) { return VkDisplayPlanePropertiesKHR.get_currentStackIndex(this.segment(), index); }
    /// {@return `currentStackIndex`}
    public @CType("uint32_t") int currentStackIndex() { return VkDisplayPlanePropertiesKHR.get_currentStackIndex(this.segment()); }
    /// Sets `currentStackIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_currentStackIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_currentStackIndex.set(segment, 0L, index, value); }
    /// Sets `currentStackIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_currentStackIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDisplayPlanePropertiesKHR.set_currentStackIndex(segment, 0L, value); }
    /// Sets `currentStackIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPlanePropertiesKHR currentStackIndexAt(long index, @CType("uint32_t") int value) { VkDisplayPlanePropertiesKHR.set_currentStackIndex(this.segment(), index, value); return this; }
    /// Sets `currentStackIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlanePropertiesKHR currentStackIndex(@CType("uint32_t") int value) { VkDisplayPlanePropertiesKHR.set_currentStackIndex(this.segment(), value); return this; }

}
