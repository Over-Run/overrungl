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
package overrungl.vulkan.nv.struct;

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
/// ### tokenType
/// [VarHandle][#VH_tokenType] - [Getter][#tokenType()] - [Setter][#tokenType(int)]
/// ### stream
/// [VarHandle][#VH_stream] - [Getter][#stream()] - [Setter][#stream(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(int)]
/// ### vertexBindingUnit
/// [VarHandle][#VH_vertexBindingUnit] - [Getter][#vertexBindingUnit()] - [Setter][#vertexBindingUnit(int)]
/// ### vertexDynamicStride
/// [VarHandle][#VH_vertexDynamicStride] - [Getter][#vertexDynamicStride()] - [Setter][#vertexDynamicStride(int)]
/// ### pushconstantPipelineLayout
/// [VarHandle][#VH_pushconstantPipelineLayout] - [Getter][#pushconstantPipelineLayout()] - [Setter][#pushconstantPipelineLayout(java.lang.foreign.MemorySegment)]
/// ### pushconstantShaderStageFlags
/// [VarHandle][#VH_pushconstantShaderStageFlags] - [Getter][#pushconstantShaderStageFlags()] - [Setter][#pushconstantShaderStageFlags(int)]
/// ### pushconstantOffset
/// [VarHandle][#VH_pushconstantOffset] - [Getter][#pushconstantOffset()] - [Setter][#pushconstantOffset(int)]
/// ### pushconstantSize
/// [VarHandle][#VH_pushconstantSize] - [Getter][#pushconstantSize()] - [Setter][#pushconstantSize(int)]
/// ### indirectStateFlags
/// [VarHandle][#VH_indirectStateFlags] - [Getter][#indirectStateFlags()] - [Setter][#indirectStateFlags(int)]
/// ### indexTypeCount
/// [VarHandle][#VH_indexTypeCount] - [Getter][#indexTypeCount()] - [Setter][#indexTypeCount(int)]
/// ### pIndexTypes
/// [VarHandle][#VH_pIndexTypes] - [Getter][#pIndexTypes()] - [Setter][#pIndexTypes(java.lang.foreign.MemorySegment)]
/// ### pIndexTypeValues
/// [VarHandle][#VH_pIndexTypeValues] - [Getter][#pIndexTypeValues()] - [Setter][#pIndexTypeValues(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsLayoutTokenNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkIndirectCommandsTokenTypeNV tokenType;
///     uint32_t stream;
///     uint32_t offset;
///     uint32_t vertexBindingUnit;
///     VkBool32 vertexDynamicStride;
///     VkPipelineLayout pushconstantPipelineLayout;
///     VkShaderStageFlags pushconstantShaderStageFlags;
///     uint32_t pushconstantOffset;
///     uint32_t pushconstantSize;
///     VkIndirectStateFlagsNV indirectStateFlags;
///     uint32_t indexTypeCount;
///     const VkIndexType * pIndexTypes;
///     const uint32_t * pIndexTypeValues;
/// } VkIndirectCommandsLayoutTokenNV;
/// ```
public sealed class VkIndirectCommandsLayoutTokenNV extends Struct {
    /// The struct layout of `VkIndirectCommandsLayoutTokenNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tokenType"),
        ValueLayout.JAVA_INT.withName("stream"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("vertexBindingUnit"),
        ValueLayout.JAVA_INT.withName("vertexDynamicStride"),
        ValueLayout.ADDRESS.withName("pushconstantPipelineLayout"),
        ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags"),
        ValueLayout.JAVA_INT.withName("pushconstantOffset"),
        ValueLayout.JAVA_INT.withName("pushconstantSize"),
        ValueLayout.JAVA_INT.withName("indirectStateFlags"),
        ValueLayout.JAVA_INT.withName("indexTypeCount"),
        ValueLayout.ADDRESS.withName("pIndexTypes"),
        ValueLayout.ADDRESS.withName("pIndexTypeValues")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `tokenType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tokenType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenType"));
    /// The [VarHandle] of `stream` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stream = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stream"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `vertexBindingUnit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexBindingUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingUnit"));
    /// The [VarHandle] of `vertexDynamicStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexDynamicStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexDynamicStride"));
    /// The [VarHandle] of `pushconstantPipelineLayout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pushconstantPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantPipelineLayout"));
    /// The [VarHandle] of `pushconstantShaderStageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushconstantShaderStageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantShaderStageFlags"));
    /// The [VarHandle] of `pushconstantOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushconstantOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantOffset"));
    /// The [VarHandle] of `pushconstantSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushconstantSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantSize"));
    /// The [VarHandle] of `indirectStateFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indirectStateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectStateFlags"));
    /// The [VarHandle] of `indexTypeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeCount"));
    /// The [VarHandle] of `pIndexTypes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pIndexTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexTypes"));
    /// The [VarHandle] of `pIndexTypeValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pIndexTypeValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexTypeValues"));

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsLayoutTokenNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkIndirectCommandsLayoutTokenNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutTokenNV`
    public static VkIndirectCommandsLayoutTokenNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutTokenNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsLayoutTokenNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutTokenNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsLayoutTokenNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutTokenNV`
    public static VkIndirectCommandsLayoutTokenNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkIndirectCommandsTokenTypeNV") int tokenType, @CType("uint32_t") int stream, @CType("uint32_t") int offset, @CType("uint32_t") int vertexBindingUnit, @CType("VkBool32") int vertexDynamicStride, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment pushconstantPipelineLayout, @CType("VkShaderStageFlags") int pushconstantShaderStageFlags, @CType("uint32_t") int pushconstantOffset, @CType("uint32_t") int pushconstantSize, @CType("VkIndirectStateFlagsNV") int indirectStateFlags, @CType("uint32_t") int indexTypeCount, @CType("const VkIndexType *") java.lang.foreign.MemorySegment pIndexTypes, @CType("const uint32_t *") java.lang.foreign.MemorySegment pIndexTypeValues) { return alloc(allocator).sType(sType).pNext(pNext).tokenType(tokenType).stream(stream).offset(offset).vertexBindingUnit(vertexBindingUnit).vertexDynamicStride(vertexDynamicStride).pushconstantPipelineLayout(pushconstantPipelineLayout).pushconstantShaderStageFlags(pushconstantShaderStageFlags).pushconstantOffset(pushconstantOffset).pushconstantSize(pushconstantSize).indirectStateFlags(indirectStateFlags).indexTypeCount(indexTypeCount).pIndexTypes(pIndexTypes).pIndexTypeValues(pIndexTypeValues); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV copyFrom(VkIndirectCommandsLayoutTokenNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectCommandsLayoutTokenNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV sType(@CType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectCommandsLayoutTokenNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pNext(this.segment(), value); return this; }

    /// {@return `tokenType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsTokenTypeNV") int get_tokenType(MemorySegment segment, long index) { return (int) VH_tokenType.get(segment, 0L, index); }
    /// {@return `tokenType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsTokenTypeNV") int get_tokenType(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_tokenType(segment, 0L); }
    /// {@return `tokenType`}
    public @CType("VkIndirectCommandsTokenTypeNV") int tokenType() { return VkIndirectCommandsLayoutTokenNV.get_tokenType(this.segment()); }
    /// Sets `tokenType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tokenType(MemorySegment segment, long index, @CType("VkIndirectCommandsTokenTypeNV") int value) { VH_tokenType.set(segment, 0L, index, value); }
    /// Sets `tokenType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tokenType(MemorySegment segment, @CType("VkIndirectCommandsTokenTypeNV") int value) { VkIndirectCommandsLayoutTokenNV.set_tokenType(segment, 0L, value); }
    /// Sets `tokenType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV tokenType(@CType("VkIndirectCommandsTokenTypeNV") int value) { VkIndirectCommandsLayoutTokenNV.set_tokenType(this.segment(), value); return this; }

    /// {@return `stream` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stream(MemorySegment segment, long index) { return (int) VH_stream.get(segment, 0L, index); }
    /// {@return `stream`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stream(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_stream(segment, 0L); }
    /// {@return `stream`}
    public @CType("uint32_t") int stream() { return VkIndirectCommandsLayoutTokenNV.get_stream(this.segment()); }
    /// Sets `stream` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stream(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stream.set(segment, 0L, index, value); }
    /// Sets `stream` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stream(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_stream(segment, 0L, value); }
    /// Sets `stream` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV stream(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_stream(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkIndirectCommandsLayoutTokenNV.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV offset(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_offset(this.segment(), value); return this; }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexBindingUnit(MemorySegment segment, long index) { return (int) VH_vertexBindingUnit.get(segment, 0L, index); }
    /// {@return `vertexBindingUnit`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexBindingUnit(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_vertexBindingUnit(segment, 0L); }
    /// {@return `vertexBindingUnit`}
    public @CType("uint32_t") int vertexBindingUnit() { return VkIndirectCommandsLayoutTokenNV.get_vertexBindingUnit(this.segment()); }
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexBindingUnit(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexBindingUnit.set(segment, 0L, index, value); }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexBindingUnit(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_vertexBindingUnit(segment, 0L, value); }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_vertexBindingUnit(this.segment(), value); return this; }

    /// {@return `vertexDynamicStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexDynamicStride(MemorySegment segment, long index) { return (int) VH_vertexDynamicStride.get(segment, 0L, index); }
    /// {@return `vertexDynamicStride`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexDynamicStride(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_vertexDynamicStride(segment, 0L); }
    /// {@return `vertexDynamicStride`}
    public @CType("VkBool32") int vertexDynamicStride() { return VkIndirectCommandsLayoutTokenNV.get_vertexDynamicStride(this.segment()); }
    /// Sets `vertexDynamicStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexDynamicStride(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexDynamicStride.set(segment, 0L, index, value); }
    /// Sets `vertexDynamicStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexDynamicStride(MemorySegment segment, @CType("VkBool32") int value) { VkIndirectCommandsLayoutTokenNV.set_vertexDynamicStride(segment, 0L, value); }
    /// Sets `vertexDynamicStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(@CType("VkBool32") int value) { VkIndirectCommandsLayoutTokenNV.set_vertexDynamicStride(this.segment(), value); return this; }

    /// {@return `pushconstantPipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_pushconstantPipelineLayout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pushconstantPipelineLayout.get(segment, 0L, index); }
    /// {@return `pushconstantPipelineLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_pushconstantPipelineLayout(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantPipelineLayout(segment, 0L); }
    /// {@return `pushconstantPipelineLayout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment pushconstantPipelineLayout() { return VkIndirectCommandsLayoutTokenNV.get_pushconstantPipelineLayout(this.segment()); }
    /// Sets `pushconstantPipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushconstantPipelineLayout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_pushconstantPipelineLayout.set(segment, 0L, index, value); }
    /// Sets `pushconstantPipelineLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushconstantPipelineLayout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantPipelineLayout(segment, 0L, value); }
    /// Sets `pushconstantPipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantPipelineLayout(this.segment(), value); return this; }

    /// {@return `pushconstantShaderStageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_pushconstantShaderStageFlags(MemorySegment segment, long index) { return (int) VH_pushconstantShaderStageFlags.get(segment, 0L, index); }
    /// {@return `pushconstantShaderStageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_pushconstantShaderStageFlags(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantShaderStageFlags(segment, 0L); }
    /// {@return `pushconstantShaderStageFlags`}
    public @CType("VkShaderStageFlags") int pushconstantShaderStageFlags() { return VkIndirectCommandsLayoutTokenNV.get_pushconstantShaderStageFlags(this.segment()); }
    /// Sets `pushconstantShaderStageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushconstantShaderStageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_pushconstantShaderStageFlags.set(segment, 0L, index, value); }
    /// Sets `pushconstantShaderStageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushconstantShaderStageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantShaderStageFlags(segment, 0L, value); }
    /// Sets `pushconstantShaderStageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(@CType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantShaderStageFlags(this.segment(), value); return this; }

    /// {@return `pushconstantOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pushconstantOffset(MemorySegment segment, long index) { return (int) VH_pushconstantOffset.get(segment, 0L, index); }
    /// {@return `pushconstantOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pushconstantOffset(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantOffset(segment, 0L); }
    /// {@return `pushconstantOffset`}
    public @CType("uint32_t") int pushconstantOffset() { return VkIndirectCommandsLayoutTokenNV.get_pushconstantOffset(this.segment()); }
    /// Sets `pushconstantOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushconstantOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pushconstantOffset.set(segment, 0L, index, value); }
    /// Sets `pushconstantOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushconstantOffset(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantOffset(segment, 0L, value); }
    /// Sets `pushconstantOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantOffset(this.segment(), value); return this; }

    /// {@return `pushconstantSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pushconstantSize(MemorySegment segment, long index) { return (int) VH_pushconstantSize.get(segment, 0L, index); }
    /// {@return `pushconstantSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pushconstantSize(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantSize(segment, 0L); }
    /// {@return `pushconstantSize`}
    public @CType("uint32_t") int pushconstantSize() { return VkIndirectCommandsLayoutTokenNV.get_pushconstantSize(this.segment()); }
    /// Sets `pushconstantSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushconstantSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pushconstantSize.set(segment, 0L, index, value); }
    /// Sets `pushconstantSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushconstantSize(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantSize(segment, 0L, value); }
    /// Sets `pushconstantSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantSize(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantSize(this.segment(), value); return this; }

    /// {@return `indirectStateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectStateFlagsNV") int get_indirectStateFlags(MemorySegment segment, long index) { return (int) VH_indirectStateFlags.get(segment, 0L, index); }
    /// {@return `indirectStateFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectStateFlagsNV") int get_indirectStateFlags(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_indirectStateFlags(segment, 0L); }
    /// {@return `indirectStateFlags`}
    public @CType("VkIndirectStateFlagsNV") int indirectStateFlags() { return VkIndirectCommandsLayoutTokenNV.get_indirectStateFlags(this.segment()); }
    /// Sets `indirectStateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectStateFlags(MemorySegment segment, long index, @CType("VkIndirectStateFlagsNV") int value) { VH_indirectStateFlags.set(segment, 0L, index, value); }
    /// Sets `indirectStateFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectStateFlags(MemorySegment segment, @CType("VkIndirectStateFlagsNV") int value) { VkIndirectCommandsLayoutTokenNV.set_indirectStateFlags(segment, 0L, value); }
    /// Sets `indirectStateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(@CType("VkIndirectStateFlagsNV") int value) { VkIndirectCommandsLayoutTokenNV.set_indirectStateFlags(this.segment(), value); return this; }

    /// {@return `indexTypeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_indexTypeCount(MemorySegment segment, long index) { return (int) VH_indexTypeCount.get(segment, 0L, index); }
    /// {@return `indexTypeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_indexTypeCount(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_indexTypeCount(segment, 0L); }
    /// {@return `indexTypeCount`}
    public @CType("uint32_t") int indexTypeCount() { return VkIndirectCommandsLayoutTokenNV.get_indexTypeCount(this.segment()); }
    /// Sets `indexTypeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexTypeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_indexTypeCount.set(segment, 0L, index, value); }
    /// Sets `indexTypeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexTypeCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_indexTypeCount(segment, 0L, value); }
    /// Sets `indexTypeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV indexTypeCount(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_indexTypeCount(this.segment(), value); return this; }

    /// {@return `pIndexTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndexType *") java.lang.foreign.MemorySegment get_pIndexTypes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pIndexTypes.get(segment, 0L, index); }
    /// {@return `pIndexTypes`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndexType *") java.lang.foreign.MemorySegment get_pIndexTypes(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pIndexTypes(segment, 0L); }
    /// {@return `pIndexTypes`}
    public @CType("const VkIndexType *") java.lang.foreign.MemorySegment pIndexTypes() { return VkIndirectCommandsLayoutTokenNV.get_pIndexTypes(this.segment()); }
    /// Sets `pIndexTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pIndexTypes(MemorySegment segment, long index, @CType("const VkIndexType *") java.lang.foreign.MemorySegment value) { VH_pIndexTypes.set(segment, 0L, index, value); }
    /// Sets `pIndexTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pIndexTypes(MemorySegment segment, @CType("const VkIndexType *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pIndexTypes(segment, 0L, value); }
    /// Sets `pIndexTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pIndexTypes(@CType("const VkIndexType *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pIndexTypes(this.segment(), value); return this; }

    /// {@return `pIndexTypeValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pIndexTypeValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pIndexTypeValues.get(segment, 0L, index); }
    /// {@return `pIndexTypeValues`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pIndexTypeValues(MemorySegment segment) { return VkIndirectCommandsLayoutTokenNV.get_pIndexTypeValues(segment, 0L); }
    /// {@return `pIndexTypeValues`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pIndexTypeValues() { return VkIndirectCommandsLayoutTokenNV.get_pIndexTypeValues(this.segment()); }
    /// Sets `pIndexTypeValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pIndexTypeValues(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pIndexTypeValues.set(segment, 0L, index, value); }
    /// Sets `pIndexTypeValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pIndexTypeValues(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pIndexTypeValues(segment, 0L, value); }
    /// Sets `pIndexTypeValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pIndexTypeValues(this.segment(), value); return this; }

    /// A buffer of [VkIndirectCommandsLayoutTokenNV].
    public static final class Buffer extends VkIndirectCommandsLayoutTokenNV {
        private final long elementCount;

        /// Creates `VkIndirectCommandsLayoutTokenNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectCommandsLayoutTokenNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectCommandsLayoutTokenNV`
        public VkIndirectCommandsLayoutTokenNV asSlice(long index) { return new VkIndirectCommandsLayoutTokenNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectCommandsLayoutTokenNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectCommandsLayoutTokenNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `tokenType` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsTokenTypeNV") int tokenTypeAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_tokenType(this.segment(), index); }
        /// Sets `tokenType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tokenTypeAt(long index, @CType("VkIndirectCommandsTokenTypeNV") int value) { VkIndirectCommandsLayoutTokenNV.set_tokenType(this.segment(), index, value); return this; }

        /// {@return `stream` at the given index}
        /// @param index the index
        public @CType("uint32_t") int streamAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_stream(this.segment(), index); }
        /// Sets `stream` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer streamAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_stream(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int offsetAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_offset(this.segment(), index, value); return this; }

        /// {@return `vertexBindingUnit` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vertexBindingUnitAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_vertexBindingUnit(this.segment(), index); }
        /// Sets `vertexBindingUnit` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexBindingUnitAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_vertexBindingUnit(this.segment(), index, value); return this; }

        /// {@return `vertexDynamicStride` at the given index}
        /// @param index the index
        public @CType("VkBool32") int vertexDynamicStrideAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_vertexDynamicStride(this.segment(), index); }
        /// Sets `vertexDynamicStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexDynamicStrideAt(long index, @CType("VkBool32") int value) { VkIndirectCommandsLayoutTokenNV.set_vertexDynamicStride(this.segment(), index, value); return this; }

        /// {@return `pushconstantPipelineLayout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment pushconstantPipelineLayoutAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantPipelineLayout(this.segment(), index); }
        /// Sets `pushconstantPipelineLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pushconstantPipelineLayoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantPipelineLayout(this.segment(), index, value); return this; }

        /// {@return `pushconstantShaderStageFlags` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int pushconstantShaderStageFlagsAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantShaderStageFlags(this.segment(), index); }
        /// Sets `pushconstantShaderStageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pushconstantShaderStageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantShaderStageFlags(this.segment(), index, value); return this; }

        /// {@return `pushconstantOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pushconstantOffsetAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantOffset(this.segment(), index); }
        /// Sets `pushconstantOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pushconstantOffsetAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantOffset(this.segment(), index, value); return this; }

        /// {@return `pushconstantSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pushconstantSizeAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pushconstantSize(this.segment(), index); }
        /// Sets `pushconstantSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pushconstantSizeAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_pushconstantSize(this.segment(), index, value); return this; }

        /// {@return `indirectStateFlags` at the given index}
        /// @param index the index
        public @CType("VkIndirectStateFlagsNV") int indirectStateFlagsAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_indirectStateFlags(this.segment(), index); }
        /// Sets `indirectStateFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectStateFlagsAt(long index, @CType("VkIndirectStateFlagsNV") int value) { VkIndirectCommandsLayoutTokenNV.set_indirectStateFlags(this.segment(), index, value); return this; }

        /// {@return `indexTypeCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int indexTypeCountAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_indexTypeCount(this.segment(), index); }
        /// Sets `indexTypeCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexTypeCountAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.set_indexTypeCount(this.segment(), index, value); return this; }

        /// {@return `pIndexTypes` at the given index}
        /// @param index the index
        public @CType("const VkIndexType *") java.lang.foreign.MemorySegment pIndexTypesAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pIndexTypes(this.segment(), index); }
        /// Sets `pIndexTypes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pIndexTypesAt(long index, @CType("const VkIndexType *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pIndexTypes(this.segment(), index, value); return this; }

        /// {@return `pIndexTypeValues` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pIndexTypeValuesAt(long index) { return VkIndirectCommandsLayoutTokenNV.get_pIndexTypeValues(this.segment(), index); }
        /// Sets `pIndexTypeValues` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pIndexTypeValuesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutTokenNV.set_pIndexTypeValues(this.segment(), index, value); return this; }

    }
}
