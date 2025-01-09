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
/// ### primitiveTopologyListRestart
/// [VarHandle][#VH_primitiveTopologyListRestart] - [Getter][#primitiveTopologyListRestart()] - [Setter][#primitiveTopologyListRestart(int)]
/// ### primitiveTopologyPatchListRestart
/// [VarHandle][#VH_primitiveTopologyPatchListRestart] - [Getter][#primitiveTopologyPatchListRestart()] - [Setter][#primitiveTopologyPatchListRestart(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 primitiveTopologyListRestart;
///     VkBool32 primitiveTopologyPatchListRestart;
/// } VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT;
/// ```
public final class VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyListRestart"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyPatchListRestart")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `primitiveTopologyListRestart` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveTopologyListRestart = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveTopologyListRestart"));
    /// The [VarHandle] of `primitiveTopologyPatchListRestart` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveTopologyPatchListRestart = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveTopologyPatchListRestart"));

    /// Creates `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment); }

    /// Creates `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT`
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT`
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `primitiveTopologyListRestart` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveTopologyListRestart(MemorySegment segment, long index) { return (int) VH_primitiveTopologyListRestart.get(segment, 0L, index); }
    /// {@return `primitiveTopologyListRestart`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveTopologyListRestart(MemorySegment segment) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_primitiveTopologyListRestart(segment, 0L); }
    /// {@return `primitiveTopologyListRestart` at the given index}
    /// @param index the index
    public @CType("VkBool32") int primitiveTopologyListRestartAt(long index) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_primitiveTopologyListRestart(this.segment(), index); }
    /// {@return `primitiveTopologyListRestart`}
    public @CType("VkBool32") int primitiveTopologyListRestart() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_primitiveTopologyListRestart(this.segment()); }
    /// Sets `primitiveTopologyListRestart` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveTopologyListRestart(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveTopologyListRestart.set(segment, 0L, index, value); }
    /// Sets `primitiveTopologyListRestart` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveTopologyListRestart(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_primitiveTopologyListRestart(segment, 0L, value); }
    /// Sets `primitiveTopologyListRestart` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyListRestartAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_primitiveTopologyListRestart(this.segment(), index, value); return this; }
    /// Sets `primitiveTopologyListRestart` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyListRestart(@CType("VkBool32") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_primitiveTopologyListRestart(this.segment(), value); return this; }

    /// {@return `primitiveTopologyPatchListRestart` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveTopologyPatchListRestart(MemorySegment segment, long index) { return (int) VH_primitiveTopologyPatchListRestart.get(segment, 0L, index); }
    /// {@return `primitiveTopologyPatchListRestart`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveTopologyPatchListRestart(MemorySegment segment) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_primitiveTopologyPatchListRestart(segment, 0L); }
    /// {@return `primitiveTopologyPatchListRestart` at the given index}
    /// @param index the index
    public @CType("VkBool32") int primitiveTopologyPatchListRestartAt(long index) { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_primitiveTopologyPatchListRestart(this.segment(), index); }
    /// {@return `primitiveTopologyPatchListRestart`}
    public @CType("VkBool32") int primitiveTopologyPatchListRestart() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.get_primitiveTopologyPatchListRestart(this.segment()); }
    /// Sets `primitiveTopologyPatchListRestart` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveTopologyPatchListRestart(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveTopologyPatchListRestart.set(segment, 0L, index, value); }
    /// Sets `primitiveTopologyPatchListRestart` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveTopologyPatchListRestart(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_primitiveTopologyPatchListRestart(segment, 0L, value); }
    /// Sets `primitiveTopologyPatchListRestart` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyPatchListRestartAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_primitiveTopologyPatchListRestart(this.segment(), index, value); return this; }
    /// Sets `primitiveTopologyPatchListRestart` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyPatchListRestart(@CType("VkBool32") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.set_primitiveTopologyPatchListRestart(this.segment(), value); return this; }

}
