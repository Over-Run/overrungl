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
/// ### decodeModeSharedExponent
/// [VarHandle][#VH_decodeModeSharedExponent] - [Getter][#decodeModeSharedExponent()] - [Setter][#decodeModeSharedExponent(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceASTCDecodeFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 decodeModeSharedExponent;
/// } VkPhysicalDeviceASTCDecodeFeaturesEXT;
/// ```
public final class VkPhysicalDeviceASTCDecodeFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeModeSharedExponent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `decodeModeSharedExponent` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_decodeModeSharedExponent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decodeModeSharedExponent"));

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceASTCDecodeFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `decodeModeSharedExponent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_decodeModeSharedExponent(MemorySegment segment, long index) { return (int) VH_decodeModeSharedExponent.get(segment, 0L, index); }
    /// {@return `decodeModeSharedExponent`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_decodeModeSharedExponent(MemorySegment segment) { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_decodeModeSharedExponent(segment, 0L); }
    /// {@return `decodeModeSharedExponent` at the given index}
    /// @param index the index
    public @CType("VkBool32") int decodeModeSharedExponentAt(long index) { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_decodeModeSharedExponent(this.segment(), index); }
    /// {@return `decodeModeSharedExponent`}
    public @CType("VkBool32") int decodeModeSharedExponent() { return VkPhysicalDeviceASTCDecodeFeaturesEXT.get_decodeModeSharedExponent(this.segment()); }
    /// Sets `decodeModeSharedExponent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_decodeModeSharedExponent(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_decodeModeSharedExponent.set(segment, 0L, index, value); }
    /// Sets `decodeModeSharedExponent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_decodeModeSharedExponent(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_decodeModeSharedExponent(segment, 0L, value); }
    /// Sets `decodeModeSharedExponent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_decodeModeSharedExponent(this.segment(), index, value); return this; }
    /// Sets `decodeModeSharedExponent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponent(@CType("VkBool32") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.set_decodeModeSharedExponent(this.segment(), value); return this; }

}
