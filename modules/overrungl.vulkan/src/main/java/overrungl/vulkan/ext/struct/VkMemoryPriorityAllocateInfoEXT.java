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
/// ### priority
/// [VarHandle][#VH_priority] - [Getter][#priority()] - [Setter][#priority(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryPriorityAllocateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     float priority;
/// } VkMemoryPriorityAllocateInfoEXT;
/// ```
public final class VkMemoryPriorityAllocateInfoEXT extends Struct {
    /// The struct layout of `VkMemoryPriorityAllocateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("priority")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `priority` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_priority = LAYOUT.arrayElementVarHandle(PathElement.groupElement("priority"));

    /// Creates `VkMemoryPriorityAllocateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMemoryPriorityAllocateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryPriorityAllocateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryPriorityAllocateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryPriorityAllocateInfoEXT(segment); }

    /// Creates `VkMemoryPriorityAllocateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryPriorityAllocateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryPriorityAllocateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryPriorityAllocateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryPriorityAllocateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryPriorityAllocateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryPriorityAllocateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryPriorityAllocateInfoEXT`
    public static VkMemoryPriorityAllocateInfoEXT alloc(SegmentAllocator allocator) { return new VkMemoryPriorityAllocateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryPriorityAllocateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryPriorityAllocateInfoEXT`
    public static VkMemoryPriorityAllocateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMemoryPriorityAllocateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryPriorityAllocateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryPriorityAllocateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryPriorityAllocateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryPriorityAllocateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryPriorityAllocateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryPriorityAllocateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryPriorityAllocateInfoEXT sType(@CType("VkStructureType") int value) { VkMemoryPriorityAllocateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryPriorityAllocateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryPriorityAllocateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryPriorityAllocateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryPriorityAllocateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryPriorityAllocateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryPriorityAllocateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryPriorityAllocateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryPriorityAllocateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `priority` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_priority(MemorySegment segment, long index) { return (float) VH_priority.get(segment, 0L, index); }
    /// {@return `priority`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_priority(MemorySegment segment) { return VkMemoryPriorityAllocateInfoEXT.get_priority(segment, 0L); }
    /// {@return `priority` at the given index}
    /// @param index the index
    public @CType("float") float priorityAt(long index) { return VkMemoryPriorityAllocateInfoEXT.get_priority(this.segment(), index); }
    /// {@return `priority`}
    public @CType("float") float priority() { return VkMemoryPriorityAllocateInfoEXT.get_priority(this.segment()); }
    /// Sets `priority` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_priority(MemorySegment segment, long index, @CType("float") float value) { VH_priority.set(segment, 0L, index, value); }
    /// Sets `priority` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_priority(MemorySegment segment, @CType("float") float value) { VkMemoryPriorityAllocateInfoEXT.set_priority(segment, 0L, value); }
    /// Sets `priority` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryPriorityAllocateInfoEXT priorityAt(long index, @CType("float") float value) { VkMemoryPriorityAllocateInfoEXT.set_priority(this.segment(), index, value); return this; }
    /// Sets `priority` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryPriorityAllocateInfoEXT priority(@CType("float") float value) { VkMemoryPriorityAllocateInfoEXT.set_priority(this.segment(), value); return this; }

}