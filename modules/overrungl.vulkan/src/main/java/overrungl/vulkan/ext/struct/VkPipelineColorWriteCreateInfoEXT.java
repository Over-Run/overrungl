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
/// ### attachmentCount
/// [VarHandle][#VH_attachmentCount] - [Getter][#attachmentCount()] - [Setter][#attachmentCount(int)]
/// ### pColorWriteEnables
/// [VarHandle][#VH_pColorWriteEnables] - [Getter][#pColorWriteEnables()] - [Setter][#pColorWriteEnables(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineColorWriteCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t attachmentCount;
///     const VkBool32 * pColorWriteEnables;
/// } VkPipelineColorWriteCreateInfoEXT;
/// ```
public final class VkPipelineColorWriteCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineColorWriteCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pColorWriteEnables")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `pColorWriteEnables` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorWriteEnables = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorWriteEnables"));

    /// Creates `VkPipelineColorWriteCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineColorWriteCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineColorWriteCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorWriteCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorWriteCreateInfoEXT(segment); }

    /// Creates `VkPipelineColorWriteCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorWriteCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorWriteCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineColorWriteCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorWriteCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorWriteCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineColorWriteCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorWriteCreateInfoEXT`
    public static VkPipelineColorWriteCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineColorWriteCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineColorWriteCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorWriteCreateInfoEXT`
    public static VkPipelineColorWriteCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorWriteCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineColorWriteCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineColorWriteCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineColorWriteCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineColorWriteCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineColorWriteCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineColorWriteCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineColorWriteCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineColorWriteCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineColorWriteCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineColorWriteCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineColorWriteCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineColorWriteCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment) { return VkPipelineColorWriteCreateInfoEXT.get_attachmentCount(segment, 0L); }
    /// {@return `attachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int attachmentCountAt(long index) { return VkPipelineColorWriteCreateInfoEXT.get_attachmentCount(this.segment(), index); }
    /// {@return `attachmentCount`}
    public @CType("uint32_t") int attachmentCount() { return VkPipelineColorWriteCreateInfoEXT.get_attachmentCount(this.segment()); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineColorWriteCreateInfoEXT.set_attachmentCount(segment, 0L, value); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT attachmentCountAt(long index, @CType("uint32_t") int value) { VkPipelineColorWriteCreateInfoEXT.set_attachmentCount(this.segment(), index, value); return this; }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT attachmentCount(@CType("uint32_t") int value) { VkPipelineColorWriteCreateInfoEXT.set_attachmentCount(this.segment(), value); return this; }

    /// {@return `pColorWriteEnables` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBool32 *") java.lang.foreign.MemorySegment get_pColorWriteEnables(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorWriteEnables.get(segment, 0L, index); }
    /// {@return `pColorWriteEnables`}
    /// @param segment the segment of the struct
    public static @CType("const VkBool32 *") java.lang.foreign.MemorySegment get_pColorWriteEnables(MemorySegment segment) { return VkPipelineColorWriteCreateInfoEXT.get_pColorWriteEnables(segment, 0L); }
    /// {@return `pColorWriteEnables` at the given index}
    /// @param index the index
    public @CType("const VkBool32 *") java.lang.foreign.MemorySegment pColorWriteEnablesAt(long index) { return VkPipelineColorWriteCreateInfoEXT.get_pColorWriteEnables(this.segment(), index); }
    /// {@return `pColorWriteEnables`}
    public @CType("const VkBool32 *") java.lang.foreign.MemorySegment pColorWriteEnables() { return VkPipelineColorWriteCreateInfoEXT.get_pColorWriteEnables(this.segment()); }
    /// Sets `pColorWriteEnables` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorWriteEnables(MemorySegment segment, long index, @CType("const VkBool32 *") java.lang.foreign.MemorySegment value) { VH_pColorWriteEnables.set(segment, 0L, index, value); }
    /// Sets `pColorWriteEnables` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorWriteEnables(MemorySegment segment, @CType("const VkBool32 *") java.lang.foreign.MemorySegment value) { VkPipelineColorWriteCreateInfoEXT.set_pColorWriteEnables(segment, 0L, value); }
    /// Sets `pColorWriteEnables` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnablesAt(long index, @CType("const VkBool32 *") java.lang.foreign.MemorySegment value) { VkPipelineColorWriteCreateInfoEXT.set_pColorWriteEnables(this.segment(), index, value); return this; }
    /// Sets `pColorWriteEnables` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnables(@CType("const VkBool32 *") java.lang.foreign.MemorySegment value) { VkPipelineColorWriteCreateInfoEXT.set_pColorWriteEnables(this.segment(), value); return this; }

}
