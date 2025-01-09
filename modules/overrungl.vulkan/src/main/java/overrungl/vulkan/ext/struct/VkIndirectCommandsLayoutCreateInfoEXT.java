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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### shaderStages
/// [VarHandle][#VH_shaderStages] - [Getter][#shaderStages()] - [Setter][#shaderStages(int)]
/// ### indirectStride
/// [VarHandle][#VH_indirectStride] - [Getter][#indirectStride()] - [Setter][#indirectStride(int)]
/// ### pipelineLayout
/// [VarHandle][#VH_pipelineLayout] - [Getter][#pipelineLayout()] - [Setter][#pipelineLayout(java.lang.foreign.MemorySegment)]
/// ### tokenCount
/// [VarHandle][#VH_tokenCount] - [Getter][#tokenCount()] - [Setter][#tokenCount(int)]
/// ### pTokens
/// [VarHandle][#VH_pTokens] - [Getter][#pTokens()] - [Setter][#pTokens(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsLayoutCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkIndirectCommandsLayoutUsageFlagsEXT flags;
///     VkShaderStageFlags shaderStages;
///     uint32_t indirectStride;
///     VkPipelineLayout pipelineLayout;
///     uint32_t tokenCount;
///     const VkIndirectCommandsLayoutTokenEXT * pTokens;
/// } VkIndirectCommandsLayoutCreateInfoEXT;
/// ```
public final class VkIndirectCommandsLayoutCreateInfoEXT extends Struct {
    /// The struct layout of `VkIndirectCommandsLayoutCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.JAVA_INT.withName("indirectStride"),
        ValueLayout.ADDRESS.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withName("pTokens")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `shaderStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));
    /// The [VarHandle] of `indirectStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indirectStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectStride"));
    /// The [VarHandle] of `pipelineLayout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayout"));
    /// The [VarHandle] of `tokenCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenCount"));
    /// The [VarHandle] of `pTokens` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTokens = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTokens"));

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsLayoutCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectCommandsLayoutCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT sType(@CType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectCommandsLayoutCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int get_flags(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int flagsAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int flags() { return VkIndirectCommandsLayoutCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT flagsAt(long index, @CType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT flags(@CType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_shaderStages(MemorySegment segment, long index) { return (int) VH_shaderStages.get(segment, 0L, index); }
    /// {@return `shaderStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_shaderStages(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_shaderStages(segment, 0L); }
    /// {@return `shaderStages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int shaderStagesAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_shaderStages(this.segment(), index); }
    /// {@return `shaderStages`}
    public @CType("VkShaderStageFlags") int shaderStages() { return VkIndirectCommandsLayoutCreateInfoEXT.get_shaderStages(this.segment()); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_shaderStages.set(segment, 0L, index, value); }
    /// Sets `shaderStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_shaderStages(segment, 0L, value); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_shaderStages(this.segment(), index, value); return this; }
    /// Sets `shaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(@CType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_shaderStages(this.segment(), value); return this; }

    /// {@return `indirectStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_indirectStride(MemorySegment segment, long index) { return (int) VH_indirectStride.get(segment, 0L, index); }
    /// {@return `indirectStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_indirectStride(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_indirectStride(segment, 0L); }
    /// {@return `indirectStride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int indirectStrideAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_indirectStride(this.segment(), index); }
    /// {@return `indirectStride`}
    public @CType("uint32_t") int indirectStride() { return VkIndirectCommandsLayoutCreateInfoEXT.get_indirectStride(this.segment()); }
    /// Sets `indirectStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_indirectStride.set(segment, 0L, index, value); }
    /// Sets `indirectStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectStride(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_indirectStride(segment, 0L, value); }
    /// Sets `indirectStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStrideAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_indirectStride(this.segment(), index, value); return this; }
    /// Sets `indirectStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(@CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_indirectStride(this.segment(), value); return this; }

    /// {@return `pipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_pipelineLayout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipelineLayout.get(segment, 0L, index); }
    /// {@return `pipelineLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_pipelineLayout(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_pipelineLayout(segment, 0L); }
    /// {@return `pipelineLayout` at the given index}
    /// @param index the index
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment pipelineLayoutAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_pipelineLayout(this.segment(), index); }
    /// {@return `pipelineLayout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment pipelineLayout() { return VkIndirectCommandsLayoutCreateInfoEXT.get_pipelineLayout(this.segment()); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineLayout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_pipelineLayout.set(segment, 0L, index, value); }
    /// Sets `pipelineLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineLayout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pipelineLayout(segment, 0L, value); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pipelineLayout(this.segment(), index, value); return this; }
    /// Sets `pipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pipelineLayout(this.segment(), value); return this; }

    /// {@return `tokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_tokenCount(MemorySegment segment, long index) { return (int) VH_tokenCount.get(segment, 0L, index); }
    /// {@return `tokenCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_tokenCount(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_tokenCount(segment, 0L); }
    /// {@return `tokenCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int tokenCountAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_tokenCount(this.segment(), index); }
    /// {@return `tokenCount`}
    public @CType("uint32_t") int tokenCount() { return VkIndirectCommandsLayoutCreateInfoEXT.get_tokenCount(this.segment()); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tokenCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_tokenCount.set(segment, 0L, index, value); }
    /// Sets `tokenCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tokenCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_tokenCount(segment, 0L, value); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCountAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_tokenCount(this.segment(), index, value); return this; }
    /// Sets `tokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCount(@CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.set_tokenCount(this.segment(), value); return this; }

    /// {@return `pTokens` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment get_pTokens(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTokens.get(segment, 0L, index); }
    /// {@return `pTokens`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment get_pTokens(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoEXT.get_pTokens(segment, 0L); }
    /// {@return `pTokens` at the given index}
    /// @param index the index
    public @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment pTokensAt(long index) { return VkIndirectCommandsLayoutCreateInfoEXT.get_pTokens(this.segment(), index); }
    /// {@return `pTokens`}
    public @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment pTokens() { return VkIndirectCommandsLayoutCreateInfoEXT.get_pTokens(this.segment()); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTokens(MemorySegment segment, long index, @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment value) { VH_pTokens.set(segment, 0L, index, value); }
    /// Sets `pTokens` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTokens(MemorySegment segment, @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pTokens(segment, 0L, value); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pTokensAt(long index, @CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pTokens(this.segment(), index, value); return this; }
    /// Sets `pTokens` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(@CType("const VkIndirectCommandsLayoutTokenEXT *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoEXT.set_pTokens(this.segment(), value); return this; }

}
