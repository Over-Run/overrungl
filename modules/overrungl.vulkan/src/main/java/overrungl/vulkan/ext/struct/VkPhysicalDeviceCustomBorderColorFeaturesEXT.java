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
package overrungl.vulkan.ext.struct;

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
/// ### customBorderColors
/// [VarHandle][#VH_customBorderColors] - [Getter][#customBorderColors()] - [Setter][#customBorderColors(int)]
/// ### customBorderColorWithoutFormat
/// [VarHandle][#VH_customBorderColorWithoutFormat] - [Getter][#customBorderColorWithoutFormat()] - [Setter][#customBorderColorWithoutFormat(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCustomBorderColorFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 customBorderColors;
///     VkBool32 customBorderColorWithoutFormat;
/// } VkPhysicalDeviceCustomBorderColorFeaturesEXT;
/// ```
public final class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceCustomBorderColorFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customBorderColors"),
        ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `customBorderColors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_customBorderColors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColors"));
    /// The [VarHandle] of `customBorderColorWithoutFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_customBorderColorWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColorWithoutFormat"));

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCustomBorderColorFeaturesEXT`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCustomBorderColorFeaturesEXT`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `customBorderColors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_customBorderColors(MemorySegment segment, long index) { return (int) VH_customBorderColors.get(segment, 0L, index); }
    /// {@return `customBorderColors`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_customBorderColors(MemorySegment segment) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_customBorderColors(segment, 0L); }
    /// {@return `customBorderColors` at the given index}
    /// @param index the index
    public @CType("VkBool32") int customBorderColorsAt(long index) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_customBorderColors(this.segment(), index); }
    /// {@return `customBorderColors`}
    public @CType("VkBool32") int customBorderColors() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_customBorderColors(this.segment()); }
    /// Sets `customBorderColors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_customBorderColors(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_customBorderColors.set(segment, 0L, index, value); }
    /// Sets `customBorderColors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_customBorderColors(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_customBorderColors(segment, 0L, value); }
    /// Sets `customBorderColors` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_customBorderColors(this.segment(), index, value); return this; }
    /// Sets `customBorderColors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(@CType("VkBool32") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_customBorderColors(this.segment(), value); return this; }

    /// {@return `customBorderColorWithoutFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_customBorderColorWithoutFormat(MemorySegment segment, long index) { return (int) VH_customBorderColorWithoutFormat.get(segment, 0L, index); }
    /// {@return `customBorderColorWithoutFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_customBorderColorWithoutFormat(MemorySegment segment) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_customBorderColorWithoutFormat(segment, 0L); }
    /// {@return `customBorderColorWithoutFormat` at the given index}
    /// @param index the index
    public @CType("VkBool32") int customBorderColorWithoutFormatAt(long index) { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_customBorderColorWithoutFormat(this.segment(), index); }
    /// {@return `customBorderColorWithoutFormat`}
    public @CType("VkBool32") int customBorderColorWithoutFormat() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.get_customBorderColorWithoutFormat(this.segment()); }
    /// Sets `customBorderColorWithoutFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_customBorderColorWithoutFormat(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_customBorderColorWithoutFormat.set(segment, 0L, index, value); }
    /// Sets `customBorderColorWithoutFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_customBorderColorWithoutFormat(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_customBorderColorWithoutFormat(segment, 0L, value); }
    /// Sets `customBorderColorWithoutFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormatAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_customBorderColorWithoutFormat(this.segment(), index, value); return this; }
    /// Sets `customBorderColorWithoutFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(@CType("VkBool32") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.set_customBorderColorWithoutFormat(this.segment(), value); return this; }

}
