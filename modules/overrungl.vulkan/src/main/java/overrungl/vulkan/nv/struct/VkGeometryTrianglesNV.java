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
/// ### vertexData
/// [VarHandle][#VH_vertexData] - [Getter][#vertexData()] - [Setter][#vertexData(java.lang.foreign.MemorySegment)]
/// ### vertexOffset
/// [VarHandle][#VH_vertexOffset] - [Getter][#vertexOffset()] - [Setter][#vertexOffset(long)]
/// ### vertexCount
/// [VarHandle][#VH_vertexCount] - [Getter][#vertexCount()] - [Setter][#vertexCount(int)]
/// ### vertexStride
/// [VarHandle][#VH_vertexStride] - [Getter][#vertexStride()] - [Setter][#vertexStride(long)]
/// ### vertexFormat
/// [VarHandle][#VH_vertexFormat] - [Getter][#vertexFormat()] - [Setter][#vertexFormat(int)]
/// ### indexData
/// [VarHandle][#VH_indexData] - [Getter][#indexData()] - [Setter][#indexData(java.lang.foreign.MemorySegment)]
/// ### indexOffset
/// [VarHandle][#VH_indexOffset] - [Getter][#indexOffset()] - [Setter][#indexOffset(long)]
/// ### indexCount
/// [VarHandle][#VH_indexCount] - [Getter][#indexCount()] - [Setter][#indexCount(int)]
/// ### indexType
/// [VarHandle][#VH_indexType] - [Getter][#indexType()] - [Setter][#indexType(int)]
/// ### transformData
/// [VarHandle][#VH_transformData] - [Getter][#transformData()] - [Setter][#transformData(java.lang.foreign.MemorySegment)]
/// ### transformOffset
/// [VarHandle][#VH_transformOffset] - [Getter][#transformOffset()] - [Setter][#transformOffset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeometryTrianglesNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBuffer vertexData;
///     VkDeviceSize vertexOffset;
///     uint32_t vertexCount;
///     VkDeviceSize vertexStride;
///     VkFormat vertexFormat;
///     VkBuffer indexData;
///     VkDeviceSize indexOffset;
///     uint32_t indexCount;
///     VkIndexType indexType;
///     VkBuffer transformData;
///     VkDeviceSize transformOffset;
/// } VkGeometryTrianglesNV;
/// ```
public final class VkGeometryTrianglesNV extends Struct {
    /// The struct layout of `VkGeometryTrianglesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.ADDRESS.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexOffset"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("indexType"),
        ValueLayout.ADDRESS.withName("transformData"),
        ValueLayout.JAVA_LONG.withName("transformOffset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vertexData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_vertexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"));
    /// The [VarHandle] of `vertexOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));
    /// The [VarHandle] of `vertexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));
    /// The [VarHandle] of `vertexStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    /// The [VarHandle] of `vertexFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    /// The [VarHandle] of `indexData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_indexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"));
    /// The [VarHandle] of `indexOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_indexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexOffset"));
    /// The [VarHandle] of `indexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `transformData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_transformData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformData"));
    /// The [VarHandle] of `transformOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformOffset"));

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    /// @param segment the memory segment
    public VkGeometryTrianglesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryTrianglesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment); }

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryTrianglesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeometryTrianglesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryTrianglesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV alloc(SegmentAllocator allocator) { return new VkGeometryTrianglesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeometryTrianglesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryTrianglesNV`
    public static VkGeometryTrianglesNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryTrianglesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeometryTrianglesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkGeometryTrianglesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeometryTrianglesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeometryTrianglesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkGeometryTrianglesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV sType(@CType("VkStructureType") int value) { VkGeometryTrianglesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGeometryTrianglesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGeometryTrianglesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGeometryTrianglesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_vertexData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_vertexData.get(segment, 0L, index); }
    /// {@return `vertexData`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_vertexData(MemorySegment segment) { return VkGeometryTrianglesNV.get_vertexData(segment, 0L); }
    /// {@return `vertexData` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment vertexDataAt(long index) { return VkGeometryTrianglesNV.get_vertexData(this.segment(), index); }
    /// {@return `vertexData`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment vertexData() { return VkGeometryTrianglesNV.get_vertexData(this.segment()); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexData(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_vertexData.set(segment, 0L, index, value); }
    /// Sets `vertexData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexData(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_vertexData(segment, 0L, value); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexDataAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_vertexData(this.segment(), index, value); return this; }
    /// Sets `vertexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexData(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_vertexData(this.segment(), value); return this; }

    /// {@return `vertexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_vertexOffset(MemorySegment segment, long index) { return (long) VH_vertexOffset.get(segment, 0L, index); }
    /// {@return `vertexOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_vertexOffset(MemorySegment segment) { return VkGeometryTrianglesNV.get_vertexOffset(segment, 0L); }
    /// {@return `vertexOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long vertexOffsetAt(long index) { return VkGeometryTrianglesNV.get_vertexOffset(this.segment(), index); }
    /// {@return `vertexOffset`}
    public @CType("VkDeviceSize") long vertexOffset() { return VkGeometryTrianglesNV.get_vertexOffset(this.segment()); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_vertexOffset.set(segment, 0L, index, value); }
    /// Sets `vertexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_vertexOffset(segment, 0L, value); }
    /// Sets `vertexOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexOffsetAt(long index, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_vertexOffset(this.segment(), index, value); return this; }
    /// Sets `vertexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexOffset(@CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_vertexOffset(this.segment(), value); return this; }

    /// {@return `vertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vertexCount(MemorySegment segment, long index) { return (int) VH_vertexCount.get(segment, 0L, index); }
    /// {@return `vertexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vertexCount(MemorySegment segment) { return VkGeometryTrianglesNV.get_vertexCount(segment, 0L); }
    /// {@return `vertexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vertexCountAt(long index) { return VkGeometryTrianglesNV.get_vertexCount(this.segment(), index); }
    /// {@return `vertexCount`}
    public @CType("uint32_t") int vertexCount() { return VkGeometryTrianglesNV.get_vertexCount(this.segment()); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vertexCount.set(segment, 0L, index, value); }
    /// Sets `vertexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeometryTrianglesNV.set_vertexCount(segment, 0L, value); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexCountAt(long index, @CType("uint32_t") int value) { VkGeometryTrianglesNV.set_vertexCount(this.segment(), index, value); return this; }
    /// Sets `vertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexCount(@CType("uint32_t") int value) { VkGeometryTrianglesNV.set_vertexCount(this.segment(), value); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_vertexStride(MemorySegment segment, long index) { return (long) VH_vertexStride.get(segment, 0L, index); }
    /// {@return `vertexStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_vertexStride(MemorySegment segment) { return VkGeometryTrianglesNV.get_vertexStride(segment, 0L); }
    /// {@return `vertexStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long vertexStrideAt(long index) { return VkGeometryTrianglesNV.get_vertexStride(this.segment(), index); }
    /// {@return `vertexStride`}
    public @CType("VkDeviceSize") long vertexStride() { return VkGeometryTrianglesNV.get_vertexStride(this.segment()); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_vertexStride.set(segment, 0L, index, value); }
    /// Sets `vertexStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_vertexStride(segment, 0L, value); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexStrideAt(long index, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_vertexStride(this.segment(), index, value); return this; }
    /// Sets `vertexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexStride(@CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_vertexStride(this.segment(), value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_vertexFormat(MemorySegment segment, long index) { return (int) VH_vertexFormat.get(segment, 0L, index); }
    /// {@return `vertexFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_vertexFormat(MemorySegment segment) { return VkGeometryTrianglesNV.get_vertexFormat(segment, 0L); }
    /// {@return `vertexFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int vertexFormatAt(long index) { return VkGeometryTrianglesNV.get_vertexFormat(this.segment(), index); }
    /// {@return `vertexFormat`}
    public @CType("VkFormat") int vertexFormat() { return VkGeometryTrianglesNV.get_vertexFormat(this.segment()); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_vertexFormat.set(segment, 0L, index, value); }
    /// Sets `vertexFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexFormat(MemorySegment segment, @CType("VkFormat") int value) { VkGeometryTrianglesNV.set_vertexFormat(segment, 0L, value); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexFormatAt(long index, @CType("VkFormat") int value) { VkGeometryTrianglesNV.set_vertexFormat(this.segment(), index, value); return this; }
    /// Sets `vertexFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV vertexFormat(@CType("VkFormat") int value) { VkGeometryTrianglesNV.set_vertexFormat(this.segment(), value); return this; }

    /// {@return `indexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_indexData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_indexData.get(segment, 0L, index); }
    /// {@return `indexData`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_indexData(MemorySegment segment) { return VkGeometryTrianglesNV.get_indexData(segment, 0L); }
    /// {@return `indexData` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment indexDataAt(long index) { return VkGeometryTrianglesNV.get_indexData(this.segment(), index); }
    /// {@return `indexData`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment indexData() { return VkGeometryTrianglesNV.get_indexData(this.segment()); }
    /// Sets `indexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexData(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_indexData.set(segment, 0L, index, value); }
    /// Sets `indexData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexData(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_indexData(segment, 0L, value); }
    /// Sets `indexData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexDataAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_indexData(this.segment(), index, value); return this; }
    /// Sets `indexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexData(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_indexData(this.segment(), value); return this; }

    /// {@return `indexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_indexOffset(MemorySegment segment, long index) { return (long) VH_indexOffset.get(segment, 0L, index); }
    /// {@return `indexOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_indexOffset(MemorySegment segment) { return VkGeometryTrianglesNV.get_indexOffset(segment, 0L); }
    /// {@return `indexOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long indexOffsetAt(long index) { return VkGeometryTrianglesNV.get_indexOffset(this.segment(), index); }
    /// {@return `indexOffset`}
    public @CType("VkDeviceSize") long indexOffset() { return VkGeometryTrianglesNV.get_indexOffset(this.segment()); }
    /// Sets `indexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_indexOffset.set(segment, 0L, index, value); }
    /// Sets `indexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_indexOffset(segment, 0L, value); }
    /// Sets `indexOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexOffsetAt(long index, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_indexOffset(this.segment(), index, value); return this; }
    /// Sets `indexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexOffset(@CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_indexOffset(this.segment(), value); return this; }

    /// {@return `indexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_indexCount(MemorySegment segment, long index) { return (int) VH_indexCount.get(segment, 0L, index); }
    /// {@return `indexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_indexCount(MemorySegment segment) { return VkGeometryTrianglesNV.get_indexCount(segment, 0L); }
    /// {@return `indexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int indexCountAt(long index) { return VkGeometryTrianglesNV.get_indexCount(this.segment(), index); }
    /// {@return `indexCount`}
    public @CType("uint32_t") int indexCount() { return VkGeometryTrianglesNV.get_indexCount(this.segment()); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_indexCount.set(segment, 0L, index, value); }
    /// Sets `indexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeometryTrianglesNV.set_indexCount(segment, 0L, value); }
    /// Sets `indexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexCountAt(long index, @CType("uint32_t") int value) { VkGeometryTrianglesNV.set_indexCount(this.segment(), index, value); return this; }
    /// Sets `indexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexCount(@CType("uint32_t") int value) { VkGeometryTrianglesNV.set_indexCount(this.segment(), value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    /// @param segment the segment of the struct
    public static @CType("VkIndexType") int get_indexType(MemorySegment segment) { return VkGeometryTrianglesNV.get_indexType(segment, 0L); }
    /// {@return `indexType` at the given index}
    /// @param index the index
    public @CType("VkIndexType") int indexTypeAt(long index) { return VkGeometryTrianglesNV.get_indexType(this.segment(), index); }
    /// {@return `indexType`}
    public @CType("VkIndexType") int indexType() { return VkGeometryTrianglesNV.get_indexType(this.segment()); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, long index, @CType("VkIndexType") int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexType(MemorySegment segment, @CType("VkIndexType") int value) { VkGeometryTrianglesNV.set_indexType(segment, 0L, value); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexTypeAt(long index, @CType("VkIndexType") int value) { VkGeometryTrianglesNV.set_indexType(this.segment(), index, value); return this; }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV indexType(@CType("VkIndexType") int value) { VkGeometryTrianglesNV.set_indexType(this.segment(), value); return this; }

    /// {@return `transformData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_transformData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_transformData.get(segment, 0L, index); }
    /// {@return `transformData`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_transformData(MemorySegment segment) { return VkGeometryTrianglesNV.get_transformData(segment, 0L); }
    /// {@return `transformData` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment transformDataAt(long index) { return VkGeometryTrianglesNV.get_transformData(this.segment(), index); }
    /// {@return `transformData`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment transformData() { return VkGeometryTrianglesNV.get_transformData(this.segment()); }
    /// Sets `transformData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformData(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_transformData.set(segment, 0L, index, value); }
    /// Sets `transformData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformData(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_transformData(segment, 0L, value); }
    /// Sets `transformData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformDataAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_transformData(this.segment(), index, value); return this; }
    /// Sets `transformData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformData(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkGeometryTrianglesNV.set_transformData(this.segment(), value); return this; }

    /// {@return `transformOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_transformOffset(MemorySegment segment, long index) { return (long) VH_transformOffset.get(segment, 0L, index); }
    /// {@return `transformOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_transformOffset(MemorySegment segment) { return VkGeometryTrianglesNV.get_transformOffset(segment, 0L); }
    /// {@return `transformOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long transformOffsetAt(long index) { return VkGeometryTrianglesNV.get_transformOffset(this.segment(), index); }
    /// {@return `transformOffset`}
    public @CType("VkDeviceSize") long transformOffset() { return VkGeometryTrianglesNV.get_transformOffset(this.segment()); }
    /// Sets `transformOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_transformOffset.set(segment, 0L, index, value); }
    /// Sets `transformOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_transformOffset(segment, 0L, value); }
    /// Sets `transformOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformOffsetAt(long index, @CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_transformOffset(this.segment(), index, value); return this; }
    /// Sets `transformOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryTrianglesNV transformOffset(@CType("VkDeviceSize") long value) { VkGeometryTrianglesNV.set_transformOffset(this.segment(), value); return this; }

}
