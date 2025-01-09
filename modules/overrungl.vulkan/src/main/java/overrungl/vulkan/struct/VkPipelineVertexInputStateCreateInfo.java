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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### vertexBindingDescriptionCount
/// [VarHandle][#VH_vertexBindingDescriptionCount] - [Getter][#vertexBindingDescriptionCount()] - [Setter][#vertexBindingDescriptionCount(int)]
/// ### pVertexBindingDescriptions
/// [VarHandle][#VH_pVertexBindingDescriptions] - [Getter][#pVertexBindingDescriptions()] - [Setter][#pVertexBindingDescriptions(java.lang.foreign.MemorySegment)]
/// ### vertexAttributeDescriptionCount
/// [VarHandle][#VH_vertexAttributeDescriptionCount] - [Getter][#vertexAttributeDescriptionCount()] - [Setter][#vertexAttributeDescriptionCount(int)]
/// ### pVertexAttributeDescriptions
/// [VarHandle][#VH_pVertexAttributeDescriptions] - [Getter][#pVertexAttributeDescriptions()] - [Setter][#pVertexAttributeDescriptions(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineVertexInputStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineVertexInputStateCreateFlags flags;
///     uint32_t vertexBindingDescriptionCount;
///     const VkVertexInputBindingDescription * pVertexBindingDescriptions;
///     uint32_t vertexAttributeDescriptionCount;
///     const VkVertexInputAttributeDescription * pVertexAttributeDescriptions;
/// } VkPipelineVertexInputStateCreateInfo;
/// ```
public final class VkPipelineVertexInputStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineVertexInputStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDescriptions"),
        ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount"),
        ValueLayout.ADDRESS.withName("pVertexAttributeDescriptions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `vertexBindingDescriptionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexBindingDescriptionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDescriptionCount"));
    /// The [VarHandle] of `pVertexBindingDescriptions` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVertexBindingDescriptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDescriptions"));
    /// The [VarHandle] of `vertexAttributeDescriptionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexAttributeDescriptionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeDescriptionCount"));
    /// The [VarHandle] of `pVertexAttributeDescriptions` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVertexAttributeDescriptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexAttributeDescriptions"));

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineVertexInputStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment); }

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineVertexInputStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineVertexInputStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineVertexInputStateCreateInfo`
    public VkPipelineVertexInputStateCreateInfo asSlice(long index) { return new VkPipelineVertexInputStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineVertexInputStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineVertexInputStateCreateInfo`
    public VkPipelineVertexInputStateCreateInfo asSlice(long index, long count) { return new VkPipelineVertexInputStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineVertexInputStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineVertexInputStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineVertexInputStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineVertexInputStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineVertexInputStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineVertexInputStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineVertexInputStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineVertexInputStateCreateFlags") int flagsAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineVertexInputStateCreateFlags") int flags() { return VkPipelineVertexInputStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineVertexInputStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineVertexInputStateCreateFlags") int value) { VkPipelineVertexInputStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo flagsAt(long index, @CType("VkPipelineVertexInputStateCreateFlags") int value) { VkPipelineVertexInputStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo flags(@CType("VkPipelineVertexInputStateCreateFlags") int value) { VkPipelineVertexInputStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `vertexBindingDescriptionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexBindingDescriptionCount(MemorySegment segment, long index) { return (int) VH_vertexBindingDescriptionCount.get(segment, 0L, index); }
    /// {@return `vertexBindingDescriptionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexBindingDescriptionCount(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_vertexBindingDescriptionCount(segment, 0L); }
    /// {@return `vertexBindingDescriptionCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vertexBindingDescriptionCountAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_vertexBindingDescriptionCount(this.segment(), index); }
    /// {@return `vertexBindingDescriptionCount`}
    public @CType("uint32_t") int vertexBindingDescriptionCount() { return VkPipelineVertexInputStateCreateInfo.get_vertexBindingDescriptionCount(this.segment()); }
    /// Sets `vertexBindingDescriptionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexBindingDescriptionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexBindingDescriptionCount.set(segment, 0L, index, value); }
    /// Sets `vertexBindingDescriptionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexBindingDescriptionCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineVertexInputStateCreateInfo.set_vertexBindingDescriptionCount(segment, 0L, value); }
    /// Sets `vertexBindingDescriptionCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCountAt(long index, @CType("uint32_t") int value) { VkPipelineVertexInputStateCreateInfo.set_vertexBindingDescriptionCount(this.segment(), index, value); return this; }
    /// Sets `vertexBindingDescriptionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(@CType("uint32_t") int value) { VkPipelineVertexInputStateCreateInfo.set_vertexBindingDescriptionCount(this.segment(), value); return this; }

    /// {@return `pVertexBindingDescriptions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment get_pVertexBindingDescriptions(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVertexBindingDescriptions.get(segment, 0L, index); }
    /// {@return `pVertexBindingDescriptions`}
    /// @param segment the segment of the struct
    public static @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment get_pVertexBindingDescriptions(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_pVertexBindingDescriptions(segment, 0L); }
    /// {@return `pVertexBindingDescriptions` at the given index}
    /// @param index the index
    public @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment pVertexBindingDescriptionsAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_pVertexBindingDescriptions(this.segment(), index); }
    /// {@return `pVertexBindingDescriptions`}
    public @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment pVertexBindingDescriptions() { return VkPipelineVertexInputStateCreateInfo.get_pVertexBindingDescriptions(this.segment()); }
    /// Sets `pVertexBindingDescriptions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexBindingDescriptions(MemorySegment segment, long index, @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment value) { VH_pVertexBindingDescriptions.set(segment, 0L, index, value); }
    /// Sets `pVertexBindingDescriptions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVertexBindingDescriptions(MemorySegment segment, @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pVertexBindingDescriptions(segment, 0L, value); }
    /// Sets `pVertexBindingDescriptions` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptionsAt(long index, @CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pVertexBindingDescriptions(this.segment(), index, value); return this; }
    /// Sets `pVertexBindingDescriptions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(@CType("const VkVertexInputBindingDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pVertexBindingDescriptions(this.segment(), value); return this; }

    /// {@return `vertexAttributeDescriptionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexAttributeDescriptionCount(MemorySegment segment, long index) { return (int) VH_vertexAttributeDescriptionCount.get(segment, 0L, index); }
    /// {@return `vertexAttributeDescriptionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexAttributeDescriptionCount(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_vertexAttributeDescriptionCount(segment, 0L); }
    /// {@return `vertexAttributeDescriptionCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vertexAttributeDescriptionCountAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_vertexAttributeDescriptionCount(this.segment(), index); }
    /// {@return `vertexAttributeDescriptionCount`}
    public @CType("uint32_t") int vertexAttributeDescriptionCount() { return VkPipelineVertexInputStateCreateInfo.get_vertexAttributeDescriptionCount(this.segment()); }
    /// Sets `vertexAttributeDescriptionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexAttributeDescriptionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexAttributeDescriptionCount.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeDescriptionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexAttributeDescriptionCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineVertexInputStateCreateInfo.set_vertexAttributeDescriptionCount(segment, 0L, value); }
    /// Sets `vertexAttributeDescriptionCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCountAt(long index, @CType("uint32_t") int value) { VkPipelineVertexInputStateCreateInfo.set_vertexAttributeDescriptionCount(this.segment(), index, value); return this; }
    /// Sets `vertexAttributeDescriptionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(@CType("uint32_t") int value) { VkPipelineVertexInputStateCreateInfo.set_vertexAttributeDescriptionCount(this.segment(), value); return this; }

    /// {@return `pVertexAttributeDescriptions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment get_pVertexAttributeDescriptions(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVertexAttributeDescriptions.get(segment, 0L, index); }
    /// {@return `pVertexAttributeDescriptions`}
    /// @param segment the segment of the struct
    public static @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment get_pVertexAttributeDescriptions(MemorySegment segment) { return VkPipelineVertexInputStateCreateInfo.get_pVertexAttributeDescriptions(segment, 0L); }
    /// {@return `pVertexAttributeDescriptions` at the given index}
    /// @param index the index
    public @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment pVertexAttributeDescriptionsAt(long index) { return VkPipelineVertexInputStateCreateInfo.get_pVertexAttributeDescriptions(this.segment(), index); }
    /// {@return `pVertexAttributeDescriptions`}
    public @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment pVertexAttributeDescriptions() { return VkPipelineVertexInputStateCreateInfo.get_pVertexAttributeDescriptions(this.segment()); }
    /// Sets `pVertexAttributeDescriptions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexAttributeDescriptions(MemorySegment segment, long index, @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment value) { VH_pVertexAttributeDescriptions.set(segment, 0L, index, value); }
    /// Sets `pVertexAttributeDescriptions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVertexAttributeDescriptions(MemorySegment segment, @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pVertexAttributeDescriptions(segment, 0L, value); }
    /// Sets `pVertexAttributeDescriptions` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptionsAt(long index, @CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pVertexAttributeDescriptions(this.segment(), index, value); return this; }
    /// Sets `pVertexAttributeDescriptions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(@CType("const VkVertexInputAttributeDescription *") java.lang.foreign.MemorySegment value) { VkPipelineVertexInputStateCreateInfo.set_pVertexAttributeDescriptions(this.segment(), value); return this; }

}
