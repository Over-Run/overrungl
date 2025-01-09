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
/// ### setLayoutCount
/// [VarHandle][#VH_setLayoutCount] - [Getter][#setLayoutCount()] - [Setter][#setLayoutCount(int)]
/// ### pSetLayouts
/// [VarHandle][#VH_pSetLayouts] - [Getter][#pSetLayouts()] - [Setter][#pSetLayouts(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectExecutionSetShaderLayoutInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout * pSetLayouts;
/// } VkIndirectExecutionSetShaderLayoutInfoEXT;
/// ```
public final class VkIndirectExecutionSetShaderLayoutInfoEXT extends Struct {
    /// The struct layout of `VkIndirectExecutionSetShaderLayoutInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `setLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetShaderLayoutInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment); }

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public VkIndirectExecutionSetShaderLayoutInfoEXT asSlice(long index) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public VkIndirectExecutionSetShaderLayoutInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT sType(@CType("VkStructureType") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `setLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_setLayoutCount(MemorySegment segment, long index) { return (int) VH_setLayoutCount.get(segment, 0L, index); }
    /// {@return `setLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_setLayoutCount(MemorySegment segment) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_setLayoutCount(segment, 0L); }
    /// {@return `setLayoutCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int setLayoutCountAt(long index) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_setLayoutCount(this.segment(), index); }
    /// {@return `setLayoutCount`}
    public @CType("uint32_t") int setLayoutCount() { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_setLayoutCount(this.segment()); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_setLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_setLayoutCount.set(segment, 0L, index, value); }
    /// Sets `setLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_setLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_setLayoutCount(segment, 0L, value); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCountAt(long index, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_setLayoutCount(this.segment(), index, value); return this; }
    /// Sets `setLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCount(@CType("uint32_t") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_setLayoutCount(this.segment(), value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_pSetLayouts(segment, 0L); }
    /// {@return `pSetLayouts` at the given index}
    /// @param index the index
    public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayoutsAt(long index) { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_pSetLayouts(this.segment(), index); }
    /// {@return `pSetLayouts`}
    public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayouts() { return VkIndirectExecutionSetShaderLayoutInfoEXT.get_pSetLayouts(this.segment()); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_pSetLayouts(segment, 0L, value); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayoutsAt(long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_pSetLayouts(this.segment(), index, value); return this; }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayouts(@CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderLayoutInfoEXT.set_pSetLayouts(this.segment(), value); return this; }

}
