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
/// ### index
/// [VarHandle][#VH_index] - [Getter][#index()] - [Setter][#index(int)]
/// ### shader
/// [VarHandle][#VH_shader] - [Getter][#shader()] - [Setter][#shader(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWriteIndirectExecutionSetShaderEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t index;
///     VkShaderEXT shader;
/// } VkWriteIndirectExecutionSetShaderEXT;
/// ```
public final class VkWriteIndirectExecutionSetShaderEXT extends Struct {
    /// The struct layout of `VkWriteIndirectExecutionSetShaderEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.ADDRESS.withName("shader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));
    /// The [VarHandle] of `shader` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_shader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shader"));

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    /// @param segment the memory segment
    public VkWriteIndirectExecutionSetShaderEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetShaderEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment); }

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetShaderEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetShaderEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT alloc(SegmentAllocator allocator) { return new VkWriteIndirectExecutionSetShaderEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT alloc(SegmentAllocator allocator, long count) { return new VkWriteIndirectExecutionSetShaderEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkWriteIndirectExecutionSetShaderEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWriteIndirectExecutionSetShaderEXT`
    public VkWriteIndirectExecutionSetShaderEXT asSlice(long index) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkWriteIndirectExecutionSetShaderEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWriteIndirectExecutionSetShaderEXT`
    public VkWriteIndirectExecutionSetShaderEXT asSlice(long index, long count) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWriteIndirectExecutionSetShaderEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkWriteIndirectExecutionSetShaderEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWriteIndirectExecutionSetShaderEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWriteIndirectExecutionSetShaderEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkWriteIndirectExecutionSetShaderEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT sType(@CType("VkStructureType") int value) { VkWriteIndirectExecutionSetShaderEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWriteIndirectExecutionSetShaderEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWriteIndirectExecutionSetShaderEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWriteIndirectExecutionSetShaderEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetShaderEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetShaderEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetShaderEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_index(MemorySegment segment) { return VkWriteIndirectExecutionSetShaderEXT.get_index(segment, 0L); }
    /// {@return `index` at the given index}
    /// @param index the index
    public @CType("uint32_t") int indexAt(long index) { return VkWriteIndirectExecutionSetShaderEXT.get_index(this.segment(), index); }
    /// {@return `index`}
    public @CType("uint32_t") int index() { return VkWriteIndirectExecutionSetShaderEXT.get_index(this.segment()); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_index(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_index(MemorySegment segment, @CType("uint32_t") int value) { VkWriteIndirectExecutionSetShaderEXT.set_index(segment, 0L, value); }
    /// Sets `index` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT indexAt(long index, @CType("uint32_t") int value) { VkWriteIndirectExecutionSetShaderEXT.set_index(this.segment(), index, value); return this; }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT index(@CType("uint32_t") int value) { VkWriteIndirectExecutionSetShaderEXT.set_index(this.segment(), value); return this; }

    /// {@return `shader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderEXT") java.lang.foreign.MemorySegment get_shader(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_shader.get(segment, 0L, index); }
    /// {@return `shader`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderEXT") java.lang.foreign.MemorySegment get_shader(MemorySegment segment) { return VkWriteIndirectExecutionSetShaderEXT.get_shader(segment, 0L); }
    /// {@return `shader` at the given index}
    /// @param index the index
    public @CType("VkShaderEXT") java.lang.foreign.MemorySegment shaderAt(long index) { return VkWriteIndirectExecutionSetShaderEXT.get_shader(this.segment(), index); }
    /// {@return `shader`}
    public @CType("VkShaderEXT") java.lang.foreign.MemorySegment shader() { return VkWriteIndirectExecutionSetShaderEXT.get_shader(this.segment()); }
    /// Sets `shader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shader(MemorySegment segment, long index, @CType("VkShaderEXT") java.lang.foreign.MemorySegment value) { VH_shader.set(segment, 0L, index, value); }
    /// Sets `shader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shader(MemorySegment segment, @CType("VkShaderEXT") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetShaderEXT.set_shader(segment, 0L, value); }
    /// Sets `shader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT shaderAt(long index, @CType("VkShaderEXT") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetShaderEXT.set_shader(this.segment(), index, value); return this; }
    /// Sets `shader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT shader(@CType("VkShaderEXT") java.lang.foreign.MemorySegment value) { VkWriteIndirectExecutionSetShaderEXT.set_shader(this.segment(), value); return this; }

}
