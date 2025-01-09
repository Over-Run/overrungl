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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### info
/// [Byte offset][#OFFSET_info] - [Memory layout][#ML_info] - [Getter][#info()] - [Setter][#info(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectExecutionSetCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkIndirectExecutionSetInfoTypeEXT type;
///     VkIndirectExecutionSetInfoEXT info;
/// } VkIndirectExecutionSetCreateInfoEXT;
/// ```
public final class VkIndirectExecutionSetCreateInfoEXT extends Struct {
    /// The struct layout of `VkIndirectExecutionSetCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT.LAYOUT.withName("info")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `info`.
    public static final long OFFSET_info = LAYOUT.byteOffset(PathElement.groupElement("info"));
    /// The memory layout of `info`.
    public static final MemoryLayout ML_info = LAYOUT.select(PathElement.groupElement("info"));

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment); }

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectExecutionSetCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetCreateInfoEXT`
    public static VkIndirectExecutionSetCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetCreateInfoEXT`
    public static VkIndirectExecutionSetCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectExecutionSetCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectExecutionSetCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectExecutionSetCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectExecutionSetCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectExecutionSetCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT sType(@CType("VkStructureType") int value) { VkIndirectExecutionSetCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectExecutionSetCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectExecutionSetCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectExecutionSetCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectExecutionSetInfoTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectExecutionSetInfoTypeEXT") int get_type(MemorySegment segment) { return VkIndirectExecutionSetCreateInfoEXT.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkIndirectExecutionSetInfoTypeEXT") int typeAt(long index) { return VkIndirectExecutionSetCreateInfoEXT.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkIndirectExecutionSetInfoTypeEXT") int type() { return VkIndirectExecutionSetCreateInfoEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectExecutionSetCreateInfoEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT typeAt(long index, @CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectExecutionSetCreateInfoEXT.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT type(@CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectExecutionSetCreateInfoEXT.set_type(this.segment(), value); return this; }

    /// {@return `info` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment get_info(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_info, index), ML_info); }
    /// {@return `info`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment get_info(MemorySegment segment) { return VkIndirectExecutionSetCreateInfoEXT.get_info(segment, 0L); }
    /// {@return `info` at the given index}
    /// @param index the index
    public @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment infoAt(long index) { return VkIndirectExecutionSetCreateInfoEXT.get_info(this.segment(), index); }
    /// {@return `info`}
    public @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment info() { return VkIndirectExecutionSetCreateInfoEXT.get_info(this.segment()); }
    /// Sets `info` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_info(MemorySegment segment, long index, @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_info, index), ML_info.byteSize()); }
    /// Sets `info` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_info(MemorySegment segment, @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetCreateInfoEXT.set_info(segment, 0L, value); }
    /// Sets `info` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT infoAt(long index, @CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetCreateInfoEXT.set_info(this.segment(), index, value); return this; }
    /// Sets `info` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT info(@CType("VkIndirectExecutionSetInfoEXT") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetCreateInfoEXT.set_info(this.segment(), value); return this; }

}
