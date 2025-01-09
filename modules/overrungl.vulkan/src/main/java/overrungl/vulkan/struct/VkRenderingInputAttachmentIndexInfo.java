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
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachmentInputIndices
/// [VarHandle][#VH_pColorAttachmentInputIndices] - [Getter][#pColorAttachmentInputIndices()] - [Setter][#pColorAttachmentInputIndices(java.lang.foreign.MemorySegment)]
/// ### pDepthInputAttachmentIndex
/// [VarHandle][#VH_pDepthInputAttachmentIndex] - [Getter][#pDepthInputAttachmentIndex()] - [Setter][#pDepthInputAttachmentIndex(java.lang.foreign.MemorySegment)]
/// ### pStencilInputAttachmentIndex
/// [VarHandle][#VH_pStencilInputAttachmentIndex] - [Getter][#pStencilInputAttachmentIndex()] - [Setter][#pStencilInputAttachmentIndex(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderingInputAttachmentIndexInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t colorAttachmentCount;
///     const uint32_t * pColorAttachmentInputIndices;
///     const uint32_t * pDepthInputAttachmentIndex;
///     const uint32_t * pStencilInputAttachmentIndex;
/// } VkRenderingInputAttachmentIndexInfo;
/// ```
public final class VkRenderingInputAttachmentIndexInfo extends Struct {
    /// The struct layout of `VkRenderingInputAttachmentIndexInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentInputIndices"),
        ValueLayout.ADDRESS.withName("pDepthInputAttachmentIndex"),
        ValueLayout.ADDRESS.withName("pStencilInputAttachmentIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachmentInputIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorAttachmentInputIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentInputIndices"));
    /// The [VarHandle] of `pDepthInputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDepthInputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthInputAttachmentIndex"));
    /// The [VarHandle] of `pStencilInputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStencilInputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStencilInputAttachmentIndex"));

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderingInputAttachmentIndexInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInputAttachmentIndexInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment); }

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInputAttachmentIndexInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInputAttachmentIndexInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderingInputAttachmentIndexInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingInputAttachmentIndexInfo`
    public static VkRenderingInputAttachmentIndexInfo alloc(SegmentAllocator allocator) { return new VkRenderingInputAttachmentIndexInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingInputAttachmentIndexInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingInputAttachmentIndexInfo`
    public static VkRenderingInputAttachmentIndexInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingInputAttachmentIndexInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRenderingInputAttachmentIndexInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingInputAttachmentIndexInfo`
    public VkRenderingInputAttachmentIndexInfo asSlice(long index) { return new VkRenderingInputAttachmentIndexInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRenderingInputAttachmentIndexInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingInputAttachmentIndexInfo`
    public VkRenderingInputAttachmentIndexInfo asSlice(long index, long count) { return new VkRenderingInputAttachmentIndexInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderingInputAttachmentIndexInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderingInputAttachmentIndexInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderingInputAttachmentIndexInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderingInputAttachmentIndexInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderingInputAttachmentIndexInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo sType(@CType("VkStructureType") int value) { VkRenderingInputAttachmentIndexInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderingInputAttachmentIndexInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderingInputAttachmentIndexInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderingInputAttachmentIndexInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkRenderingInputAttachmentIndexInfo.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkRenderingInputAttachmentIndexInfo.get_colorAttachmentCount(this.segment(), index); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkRenderingInputAttachmentIndexInfo.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingInputAttachmentIndexInfo.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkRenderingInputAttachmentIndexInfo.set_colorAttachmentCount(this.segment(), index, value); return this; }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCount(@CType("uint32_t") int value) { VkRenderingInputAttachmentIndexInfo.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachmentInputIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pColorAttachmentInputIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorAttachmentInputIndices.get(segment, 0L, index); }
    /// {@return `pColorAttachmentInputIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pColorAttachmentInputIndices(MemorySegment segment) { return VkRenderingInputAttachmentIndexInfo.get_pColorAttachmentInputIndices(segment, 0L); }
    /// {@return `pColorAttachmentInputIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pColorAttachmentInputIndicesAt(long index) { return VkRenderingInputAttachmentIndexInfo.get_pColorAttachmentInputIndices(this.segment(), index); }
    /// {@return `pColorAttachmentInputIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pColorAttachmentInputIndices() { return VkRenderingInputAttachmentIndexInfo.get_pColorAttachmentInputIndices(this.segment()); }
    /// Sets `pColorAttachmentInputIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachmentInputIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pColorAttachmentInputIndices.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentInputIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachmentInputIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pColorAttachmentInputIndices(segment, 0L, value); }
    /// Sets `pColorAttachmentInputIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pColorAttachmentInputIndices(this.segment(), index, value); return this; }
    /// Sets `pColorAttachmentInputIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pColorAttachmentInputIndices(this.segment(), value); return this; }

    /// {@return `pDepthInputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDepthInputAttachmentIndex(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDepthInputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `pDepthInputAttachmentIndex`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDepthInputAttachmentIndex(MemorySegment segment) { return VkRenderingInputAttachmentIndexInfo.get_pDepthInputAttachmentIndex(segment, 0L); }
    /// {@return `pDepthInputAttachmentIndex` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDepthInputAttachmentIndexAt(long index) { return VkRenderingInputAttachmentIndexInfo.get_pDepthInputAttachmentIndex(this.segment(), index); }
    /// {@return `pDepthInputAttachmentIndex`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDepthInputAttachmentIndex() { return VkRenderingInputAttachmentIndexInfo.get_pDepthInputAttachmentIndex(this.segment()); }
    /// Sets `pDepthInputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthInputAttachmentIndex(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pDepthInputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `pDepthInputAttachmentIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthInputAttachmentIndex(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pDepthInputAttachmentIndex(segment, 0L, value); }
    /// Sets `pDepthInputAttachmentIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndexAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pDepthInputAttachmentIndex(this.segment(), index, value); return this; }
    /// Sets `pDepthInputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pDepthInputAttachmentIndex(this.segment(), value); return this; }

    /// {@return `pStencilInputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pStencilInputAttachmentIndex(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStencilInputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `pStencilInputAttachmentIndex`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pStencilInputAttachmentIndex(MemorySegment segment) { return VkRenderingInputAttachmentIndexInfo.get_pStencilInputAttachmentIndex(segment, 0L); }
    /// {@return `pStencilInputAttachmentIndex` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pStencilInputAttachmentIndexAt(long index) { return VkRenderingInputAttachmentIndexInfo.get_pStencilInputAttachmentIndex(this.segment(), index); }
    /// {@return `pStencilInputAttachmentIndex`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pStencilInputAttachmentIndex() { return VkRenderingInputAttachmentIndexInfo.get_pStencilInputAttachmentIndex(this.segment()); }
    /// Sets `pStencilInputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStencilInputAttachmentIndex(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pStencilInputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `pStencilInputAttachmentIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStencilInputAttachmentIndex(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pStencilInputAttachmentIndex(segment, 0L, value); }
    /// Sets `pStencilInputAttachmentIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndexAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pStencilInputAttachmentIndex(this.segment(), index, value); return this; }
    /// Sets `pStencilInputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingInputAttachmentIndexInfo.set_pStencilInputAttachmentIndex(this.segment(), value); return this; }

}
