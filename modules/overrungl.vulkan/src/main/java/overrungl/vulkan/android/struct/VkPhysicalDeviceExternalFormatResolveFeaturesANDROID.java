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
package overrungl.vulkan.android.struct;

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
/// ### externalFormatResolve
/// [VarHandle][#VH_externalFormatResolve] - [Getter][#externalFormatResolve()] - [Setter][#externalFormatResolve(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExternalFormatResolveFeaturesANDROID {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 externalFormatResolve;
/// } VkPhysicalDeviceExternalFormatResolveFeaturesANDROID;
/// ```
public final class VkPhysicalDeviceExternalFormatResolveFeaturesANDROID extends Struct {
    /// The struct layout of `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalFormatResolve")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `externalFormatResolve` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalFormatResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolve"));

    /// Creates `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment); }

    /// Creates `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID asSlice(long index) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID asSlice(long index, long count) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `externalFormatResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_externalFormatResolve(MemorySegment segment, long index) { return (int) VH_externalFormatResolve.get(segment, 0L, index); }
    /// {@return `externalFormatResolve`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_externalFormatResolve(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_externalFormatResolve(segment, 0L); }
    /// {@return `externalFormatResolve` at the given index}
    /// @param index the index
    public @CType("VkBool32") int externalFormatResolveAt(long index) { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_externalFormatResolve(this.segment(), index); }
    /// {@return `externalFormatResolve`}
    public @CType("VkBool32") int externalFormatResolve() { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.get_externalFormatResolve(this.segment()); }
    /// Sets `externalFormatResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormatResolve(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_externalFormatResolve.set(segment, 0L, index, value); }
    /// Sets `externalFormatResolve` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormatResolve(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_externalFormatResolve(segment, 0L, value); }
    /// Sets `externalFormatResolve` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID externalFormatResolveAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_externalFormatResolve(this.segment(), index, value); return this; }
    /// Sets `externalFormatResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID externalFormatResolve(@CType("VkBool32") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.set_externalFormatResolve(this.segment(), value); return this; }

}
