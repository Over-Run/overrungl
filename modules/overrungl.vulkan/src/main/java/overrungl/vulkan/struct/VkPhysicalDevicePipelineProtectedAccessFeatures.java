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
package overrungl.vulkan.struct;

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
/// ### pipelineProtectedAccess
/// [VarHandle][#VH_pipelineProtectedAccess] - [Getter][#pipelineProtectedAccess()] - [Setter][#pipelineProtectedAccess(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePipelineProtectedAccessFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 pipelineProtectedAccess;
/// } VkPhysicalDevicePipelineProtectedAccessFeatures;
/// ```
public final class VkPhysicalDevicePipelineProtectedAccessFeatures extends Struct {
    /// The struct layout of `VkPhysicalDevicePipelineProtectedAccessFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineProtectedAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineProtectedAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineProtectedAccess"));

    /// Creates `VkPhysicalDevicePipelineProtectedAccessFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePipelineProtectedAccessFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePipelineProtectedAccessFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineProtectedAccessFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(segment); }

    /// Creates `VkPhysicalDevicePipelineProtectedAccessFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineProtectedAccessFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePipelineProtectedAccessFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineProtectedAccessFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePipelineProtectedAccessFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelineProtectedAccessFeatures`
    public static VkPhysicalDevicePipelineProtectedAccessFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePipelineProtectedAccessFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelineProtectedAccessFeatures`
    public static VkPhysicalDevicePipelineProtectedAccessFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDevicePipelineProtectedAccessFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePipelineProtectedAccessFeatures`
    public VkPhysicalDevicePipelineProtectedAccessFeatures asSlice(long index) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDevicePipelineProtectedAccessFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePipelineProtectedAccessFeatures`
    public VkPhysicalDevicePipelineProtectedAccessFeatures asSlice(long index, long count) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineProtectedAccessFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineProtectedAccessFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineProtectedAccessFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineProtectedAccessFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineProtectedAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineProtectedAccess(MemorySegment segment, long index) { return (int) VH_pipelineProtectedAccess.get(segment, 0L, index); }
    /// {@return `pipelineProtectedAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineProtectedAccess(MemorySegment segment) { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_pipelineProtectedAccess(segment, 0L); }
    /// {@return `pipelineProtectedAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineProtectedAccessAt(long index) { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_pipelineProtectedAccess(this.segment(), index); }
    /// {@return `pipelineProtectedAccess`}
    public @CType("VkBool32") int pipelineProtectedAccess() { return VkPhysicalDevicePipelineProtectedAccessFeatures.get_pipelineProtectedAccess(this.segment()); }
    /// Sets `pipelineProtectedAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineProtectedAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineProtectedAccess.set(segment, 0L, index, value); }
    /// Sets `pipelineProtectedAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineProtectedAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_pipelineProtectedAccess(segment, 0L, value); }
    /// Sets `pipelineProtectedAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_pipelineProtectedAccess(this.segment(), index, value); return this; }
    /// Sets `pipelineProtectedAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccess(@CType("VkBool32") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.set_pipelineProtectedAccess(this.segment(), value); return this; }

}
