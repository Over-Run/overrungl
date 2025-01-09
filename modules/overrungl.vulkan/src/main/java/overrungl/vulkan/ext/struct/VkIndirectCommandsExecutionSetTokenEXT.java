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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### shaderStages
/// [VarHandle][#VH_shaderStages] - [Getter][#shaderStages()] - [Setter][#shaderStages(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsExecutionSetTokenEXT {
///     VkIndirectExecutionSetInfoTypeEXT type;
///     VkShaderStageFlags shaderStages;
/// } VkIndirectCommandsExecutionSetTokenEXT;
/// ```
public final class VkIndirectCommandsExecutionSetTokenEXT extends Struct {
    /// The struct layout of `VkIndirectCommandsExecutionSetTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("shaderStages")
    );
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `shaderStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsExecutionSetTokenEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsExecutionSetTokenEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment); }

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsExecutionSetTokenEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsExecutionSetTokenEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsExecutionSetTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsExecutionSetTokenEXT`
    public static VkIndirectCommandsExecutionSetTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsExecutionSetTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsExecutionSetTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsExecutionSetTokenEXT`
    public static VkIndirectCommandsExecutionSetTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsExecutionSetTokenEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkIndirectCommandsExecutionSetTokenEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsExecutionSetTokenEXT`
    public VkIndirectCommandsExecutionSetTokenEXT asSlice(long index) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkIndirectCommandsExecutionSetTokenEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsExecutionSetTokenEXT`
    public VkIndirectCommandsExecutionSetTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectExecutionSetInfoTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectExecutionSetInfoTypeEXT") int get_type(MemorySegment segment) { return VkIndirectCommandsExecutionSetTokenEXT.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkIndirectExecutionSetInfoTypeEXT") int typeAt(long index) { return VkIndirectCommandsExecutionSetTokenEXT.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkIndirectExecutionSetInfoTypeEXT") int type() { return VkIndirectCommandsExecutionSetTokenEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectCommandsExecutionSetTokenEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT typeAt(long index, @CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectCommandsExecutionSetTokenEXT.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT type(@CType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectCommandsExecutionSetTokenEXT.set_type(this.segment(), value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_shaderStages(MemorySegment segment, long index) { return (int) VH_shaderStages.get(segment, 0L, index); }
    /// {@return `shaderStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_shaderStages(MemorySegment segment) { return VkIndirectCommandsExecutionSetTokenEXT.get_shaderStages(segment, 0L); }
    /// {@return `shaderStages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int shaderStagesAt(long index) { return VkIndirectCommandsExecutionSetTokenEXT.get_shaderStages(this.segment(), index); }
    /// {@return `shaderStages`}
    public @CType("VkShaderStageFlags") int shaderStages() { return VkIndirectCommandsExecutionSetTokenEXT.get_shaderStages(this.segment()); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_shaderStages.set(segment, 0L, index, value); }
    /// Sets `shaderStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkIndirectCommandsExecutionSetTokenEXT.set_shaderStages(segment, 0L, value); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT shaderStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkIndirectCommandsExecutionSetTokenEXT.set_shaderStages(this.segment(), index, value); return this; }
    /// Sets `shaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT shaderStages(@CType("VkShaderStageFlags") int value) { VkIndirectCommandsExecutionSetTokenEXT.set_shaderStages(this.segment(), value); return this; }

}
