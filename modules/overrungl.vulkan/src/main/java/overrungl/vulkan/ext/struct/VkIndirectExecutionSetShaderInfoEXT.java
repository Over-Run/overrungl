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
/// ### shaderCount
/// [VarHandle][#VH_shaderCount] - [Getter][#shaderCount()] - [Setter][#shaderCount(int)]
/// ### pInitialShaders
/// [VarHandle][#VH_pInitialShaders] - [Getter][#pInitialShaders()] - [Setter][#pInitialShaders(java.lang.foreign.MemorySegment)]
/// ### pSetLayoutInfos
/// [VarHandle][#VH_pSetLayoutInfos] - [Getter][#pSetLayoutInfos()] - [Setter][#pSetLayoutInfos(java.lang.foreign.MemorySegment)]
/// ### maxShaderCount
/// [VarHandle][#VH_maxShaderCount] - [Getter][#maxShaderCount()] - [Setter][#maxShaderCount(int)]
/// ### pushConstantRangeCount
/// [VarHandle][#VH_pushConstantRangeCount] - [Getter][#pushConstantRangeCount()] - [Setter][#pushConstantRangeCount(int)]
/// ### pPushConstantRanges
/// [VarHandle][#VH_pPushConstantRanges] - [Getter][#pPushConstantRanges()] - [Setter][#pPushConstantRanges(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectExecutionSetShaderInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t shaderCount;
///     const VkShaderEXT * pInitialShaders;
///     const VkIndirectExecutionSetShaderLayoutInfoEXT * pSetLayoutInfos;
///     uint32_t maxShaderCount;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange * pPushConstantRanges;
/// } VkIndirectExecutionSetShaderInfoEXT;
/// ```
public final class VkIndirectExecutionSetShaderInfoEXT extends Struct {
    /// The struct layout of `VkIndirectExecutionSetShaderInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withName("pInitialShaders"),
        ValueLayout.ADDRESS.withName("pSetLayoutInfos"),
        ValueLayout.JAVA_INT.withName("maxShaderCount"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCount"));
    /// The [VarHandle] of `pInitialShaders` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pInitialShaders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialShaders"));
    /// The [VarHandle] of `pSetLayoutInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetLayoutInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayoutInfos"));
    /// The [VarHandle] of `maxShaderCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxShaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderCount"));
    /// The [VarHandle] of `pushConstantRangeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    /// The [VarHandle] of `pPushConstantRanges` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetShaderInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment); }

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectExecutionSetShaderInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetShaderInfoEXT`
    public static VkIndirectExecutionSetShaderInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetShaderInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetShaderInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetShaderInfoEXT`
    public static VkIndirectExecutionSetShaderInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetShaderInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectExecutionSetShaderInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectExecutionSetShaderInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectExecutionSetShaderInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT sType(@CType("VkStructureType") int value) { VkIndirectExecutionSetShaderInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectExecutionSetShaderInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderCount(MemorySegment segment, long index) { return (int) VH_shaderCount.get(segment, 0L, index); }
    /// {@return `shaderCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderCount(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_shaderCount(segment, 0L); }
    /// {@return `shaderCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderCountAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_shaderCount(this.segment(), index); }
    /// {@return `shaderCount`}
    public @CType("uint32_t") int shaderCount() { return VkIndirectExecutionSetShaderInfoEXT.get_shaderCount(this.segment()); }
    /// Sets `shaderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderCount.set(segment, 0L, index, value); }
    /// Sets `shaderCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_shaderCount(segment, 0L, value); }
    /// Sets `shaderCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT shaderCountAt(long index, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_shaderCount(this.segment(), index, value); return this; }
    /// Sets `shaderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT shaderCount(@CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_shaderCount(this.segment(), value); return this; }

    /// {@return `pInitialShaders` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment get_pInitialShaders(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pInitialShaders.get(segment, 0L, index); }
    /// {@return `pInitialShaders`}
    /// @param segment the segment of the struct
    public static @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment get_pInitialShaders(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_pInitialShaders(segment, 0L); }
    /// {@return `pInitialShaders` at the given index}
    /// @param index the index
    public @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment pInitialShadersAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_pInitialShaders(this.segment(), index); }
    /// {@return `pInitialShaders`}
    public @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment pInitialShaders() { return VkIndirectExecutionSetShaderInfoEXT.get_pInitialShaders(this.segment()); }
    /// Sets `pInitialShaders` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInitialShaders(MemorySegment segment, long index, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VH_pInitialShaders.set(segment, 0L, index, value); }
    /// Sets `pInitialShaders` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInitialShaders(MemorySegment segment, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pInitialShaders(segment, 0L, value); }
    /// Sets `pInitialShaders` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pInitialShadersAt(long index, @CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pInitialShaders(this.segment(), index, value); return this; }
    /// Sets `pInitialShaders` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(@CType("const VkShaderEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pInitialShaders(this.segment(), value); return this; }

    /// {@return `pSetLayoutInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment get_pSetLayoutInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetLayoutInfos.get(segment, 0L, index); }
    /// {@return `pSetLayoutInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment get_pSetLayoutInfos(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_pSetLayoutInfos(segment, 0L); }
    /// {@return `pSetLayoutInfos` at the given index}
    /// @param index the index
    public @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment pSetLayoutInfosAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_pSetLayoutInfos(this.segment(), index); }
    /// {@return `pSetLayoutInfos`}
    public @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment pSetLayoutInfos() { return VkIndirectExecutionSetShaderInfoEXT.get_pSetLayoutInfos(this.segment()); }
    /// Sets `pSetLayoutInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetLayoutInfos(MemorySegment segment, long index, @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pSetLayoutInfos.set(segment, 0L, index, value); }
    /// Sets `pSetLayoutInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetLayoutInfos(MemorySegment segment, @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pSetLayoutInfos(segment, 0L, value); }
    /// Sets `pSetLayoutInfos` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfosAt(long index, @CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pSetLayoutInfos(this.segment(), index, value); return this; }
    /// Sets `pSetLayoutInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(@CType("const VkIndirectExecutionSetShaderLayoutInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pSetLayoutInfos(this.segment(), value); return this; }

    /// {@return `maxShaderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxShaderCount(MemorySegment segment, long index) { return (int) VH_maxShaderCount.get(segment, 0L, index); }
    /// {@return `maxShaderCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxShaderCount(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_maxShaderCount(segment, 0L); }
    /// {@return `maxShaderCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxShaderCountAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_maxShaderCount(this.segment(), index); }
    /// {@return `maxShaderCount`}
    public @CType("uint32_t") int maxShaderCount() { return VkIndirectExecutionSetShaderInfoEXT.get_maxShaderCount(this.segment()); }
    /// Sets `maxShaderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxShaderCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxShaderCount.set(segment, 0L, index, value); }
    /// Sets `maxShaderCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxShaderCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_maxShaderCount(segment, 0L, value); }
    /// Sets `maxShaderCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCountAt(long index, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_maxShaderCount(this.segment(), index, value); return this; }
    /// Sets `maxShaderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(@CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_maxShaderCount(this.segment(), value); return this; }

    /// {@return `pushConstantRangeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pushConstantRangeCount(MemorySegment segment, long index) { return (int) VH_pushConstantRangeCount.get(segment, 0L, index); }
    /// {@return `pushConstantRangeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pushConstantRangeCount(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_pushConstantRangeCount(segment, 0L); }
    /// {@return `pushConstantRangeCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pushConstantRangeCountAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_pushConstantRangeCount(this.segment(), index); }
    /// {@return `pushConstantRangeCount`}
    public @CType("uint32_t") int pushConstantRangeCount() { return VkIndirectExecutionSetShaderInfoEXT.get_pushConstantRangeCount(this.segment()); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushConstantRangeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pushConstantRangeCount.set(segment, 0L, index, value); }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushConstantRangeCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_pushConstantRangeCount(segment, 0L, value); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pushConstantRangeCountAt(long index, @CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_pushConstantRangeCount(this.segment(), index, value); return this; }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pushConstantRangeCount(@CType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.set_pushConstantRangeCount(this.segment(), value); return this; }

    /// {@return `pPushConstantRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment get_pPushConstantRanges(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPushConstantRanges.get(segment, 0L, index); }
    /// {@return `pPushConstantRanges`}
    /// @param segment the segment of the struct
    public static @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment get_pPushConstantRanges(MemorySegment segment) { return VkIndirectExecutionSetShaderInfoEXT.get_pPushConstantRanges(segment, 0L); }
    /// {@return `pPushConstantRanges` at the given index}
    /// @param index the index
    public @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRangesAt(long index) { return VkIndirectExecutionSetShaderInfoEXT.get_pPushConstantRanges(this.segment(), index); }
    /// {@return `pPushConstantRanges`}
    public @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRanges() { return VkIndirectExecutionSetShaderInfoEXT.get_pPushConstantRanges(this.segment()); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPushConstantRanges(MemorySegment segment, long index, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VH_pPushConstantRanges.set(segment, 0L, index, value); }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPushConstantRanges(MemorySegment segment, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pPushConstantRanges(segment, 0L, value); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRangesAt(long index, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pPushConstantRanges(this.segment(), index, value); return this; }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(@CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetShaderInfoEXT.set_pPushConstantRanges(this.segment(), value); return this; }

}
