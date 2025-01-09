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
/// ### deviceFault
/// [VarHandle][#VH_deviceFault] - [Getter][#deviceFault()] - [Setter][#deviceFault(int)]
/// ### deviceFaultVendorBinary
/// [VarHandle][#VH_deviceFaultVendorBinary] - [Getter][#deviceFaultVendorBinary()] - [Setter][#deviceFaultVendorBinary(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFaultFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 deviceFault;
///     VkBool32 deviceFaultVendorBinary;
/// } VkPhysicalDeviceFaultFeaturesEXT;
/// ```
public final class VkPhysicalDeviceFaultFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceFaultFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceFault"),
        ValueLayout.JAVA_INT.withName("deviceFaultVendorBinary")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceFault` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceFault"));
    /// The [VarHandle] of `deviceFaultVendorBinary` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceFaultVendorBinary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceFaultVendorBinary"));

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFaultFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFaultFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFaultFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFaultFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFaultFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFaultFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFaultFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFaultFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFaultFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFaultFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFaultFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFaultFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFaultFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFaultFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFaultFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceFault` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceFault(MemorySegment segment, long index) { return (int) VH_deviceFault.get(segment, 0L, index); }
    /// {@return `deviceFault`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceFault(MemorySegment segment) { return VkPhysicalDeviceFaultFeaturesEXT.get_deviceFault(segment, 0L); }
    /// {@return `deviceFault` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceFaultAt(long index) { return VkPhysicalDeviceFaultFeaturesEXT.get_deviceFault(this.segment(), index); }
    /// {@return `deviceFault`}
    public @CType("VkBool32") int deviceFault() { return VkPhysicalDeviceFaultFeaturesEXT.get_deviceFault(this.segment()); }
    /// Sets `deviceFault` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceFault(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceFault.set(segment, 0L, index, value); }
    /// Sets `deviceFault` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceFault(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_deviceFault(segment, 0L, value); }
    /// Sets `deviceFault` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_deviceFault(this.segment(), index, value); return this; }
    /// Sets `deviceFault` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT deviceFault(@CType("VkBool32") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_deviceFault(this.segment(), value); return this; }

    /// {@return `deviceFaultVendorBinary` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceFaultVendorBinary(MemorySegment segment, long index) { return (int) VH_deviceFaultVendorBinary.get(segment, 0L, index); }
    /// {@return `deviceFaultVendorBinary`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceFaultVendorBinary(MemorySegment segment) { return VkPhysicalDeviceFaultFeaturesEXT.get_deviceFaultVendorBinary(segment, 0L); }
    /// {@return `deviceFaultVendorBinary` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceFaultVendorBinaryAt(long index) { return VkPhysicalDeviceFaultFeaturesEXT.get_deviceFaultVendorBinary(this.segment(), index); }
    /// {@return `deviceFaultVendorBinary`}
    public @CType("VkBool32") int deviceFaultVendorBinary() { return VkPhysicalDeviceFaultFeaturesEXT.get_deviceFaultVendorBinary(this.segment()); }
    /// Sets `deviceFaultVendorBinary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceFaultVendorBinary(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceFaultVendorBinary.set(segment, 0L, index, value); }
    /// Sets `deviceFaultVendorBinary` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceFaultVendorBinary(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_deviceFaultVendorBinary(segment, 0L, value); }
    /// Sets `deviceFaultVendorBinary` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinaryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_deviceFaultVendorBinary(this.segment(), index, value); return this; }
    /// Sets `deviceFaultVendorBinary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinary(@CType("VkBool32") int value) { VkPhysicalDeviceFaultFeaturesEXT.set_deviceFaultVendorBinary(this.segment(), value); return this; }

}
