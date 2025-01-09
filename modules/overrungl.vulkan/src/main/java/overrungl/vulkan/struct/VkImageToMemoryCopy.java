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
/// ### pHostPointer
/// [VarHandle][#VH_pHostPointer] - [Getter][#pHostPointer()] - [Setter][#pHostPointer(java.lang.foreign.MemorySegment)]
/// ### memoryRowLength
/// [VarHandle][#VH_memoryRowLength] - [Getter][#memoryRowLength()] - [Setter][#memoryRowLength(int)]
/// ### memoryImageHeight
/// [VarHandle][#VH_memoryImageHeight] - [Getter][#memoryImageHeight()] - [Setter][#memoryImageHeight(int)]
/// ### imageSubresource
/// [Byte offset][#OFFSET_imageSubresource] - [Memory layout][#ML_imageSubresource] - [Getter][#imageSubresource()] - [Setter][#imageSubresource(java.lang.foreign.MemorySegment)]
/// ### imageOffset
/// [Byte offset][#OFFSET_imageOffset] - [Memory layout][#ML_imageOffset] - [Getter][#imageOffset()] - [Setter][#imageOffset(java.lang.foreign.MemorySegment)]
/// ### imageExtent
/// [Byte offset][#OFFSET_imageExtent] - [Memory layout][#ML_imageExtent] - [Getter][#imageExtent()] - [Setter][#imageExtent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageToMemoryCopy {
///     VkStructureType sType;
///     const void * pNext;
///     void * pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// } VkImageToMemoryCopy;
/// ```
public final class VkImageToMemoryCopy extends Struct {
    /// The struct layout of `VkImageToMemoryCopy`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pHostPointer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pHostPointer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer"));
    /// The [VarHandle] of `memoryRowLength` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRowLength"));
    /// The [VarHandle] of `memoryImageHeight` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryImageHeight"));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout ML_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    /// The byte offset of `imageOffset`.
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    /// The memory layout of `imageOffset`.
    public static final MemoryLayout ML_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout ML_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkImageToMemoryCopy` with the given segment.
    /// @param segment the memory segment
    public VkImageToMemoryCopy(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageToMemoryCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageToMemoryCopy of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageToMemoryCopy(segment); }

    /// Creates `VkImageToMemoryCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageToMemoryCopy ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageToMemoryCopy(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageToMemoryCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageToMemoryCopy ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageToMemoryCopy(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy alloc(SegmentAllocator allocator) { return new VkImageToMemoryCopy(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy alloc(SegmentAllocator allocator, long count) { return new VkImageToMemoryCopy(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageToMemoryCopy.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageToMemoryCopy.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageToMemoryCopy.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageToMemoryCopy.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy sTypeAt(long index, @CType("VkStructureType") int value) { VkImageToMemoryCopy.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy sType(@CType("VkStructureType") int value) { VkImageToMemoryCopy.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageToMemoryCopy.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageToMemoryCopy.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageToMemoryCopy.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_pNext(this.segment(), value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pHostPointer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pHostPointer.get(segment, 0L, index); }
    /// {@return `pHostPointer`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pHostPointer(MemorySegment segment) { return VkImageToMemoryCopy.get_pHostPointer(segment, 0L); }
    /// {@return `pHostPointer` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pHostPointerAt(long index) { return VkImageToMemoryCopy.get_pHostPointer(this.segment(), index); }
    /// {@return `pHostPointer`}
    public @CType("void *") java.lang.foreign.MemorySegment pHostPointer() { return VkImageToMemoryCopy.get_pHostPointer(this.segment()); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHostPointer(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pHostPointer.set(segment, 0L, index, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHostPointer(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_pHostPointer(segment, 0L, value); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy pHostPointerAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_pHostPointer(this.segment(), index, value); return this; }
    /// Sets `pHostPointer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy pHostPointer(@CType("void *") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_pHostPointer(this.segment(), value); return this; }

    /// {@return `memoryRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryRowLength(MemorySegment segment, long index) { return (int) VH_memoryRowLength.get(segment, 0L, index); }
    /// {@return `memoryRowLength`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryRowLength(MemorySegment segment) { return VkImageToMemoryCopy.get_memoryRowLength(segment, 0L); }
    /// {@return `memoryRowLength` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryRowLengthAt(long index) { return VkImageToMemoryCopy.get_memoryRowLength(this.segment(), index); }
    /// {@return `memoryRowLength`}
    public @CType("uint32_t") int memoryRowLength() { return VkImageToMemoryCopy.get_memoryRowLength(this.segment()); }
    /// Sets `memoryRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryRowLength(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryRowLength.set(segment, 0L, index, value); }
    /// Sets `memoryRowLength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryRowLength(MemorySegment segment, @CType("uint32_t") int value) { VkImageToMemoryCopy.set_memoryRowLength(segment, 0L, value); }
    /// Sets `memoryRowLength` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy memoryRowLengthAt(long index, @CType("uint32_t") int value) { VkImageToMemoryCopy.set_memoryRowLength(this.segment(), index, value); return this; }
    /// Sets `memoryRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy memoryRowLength(@CType("uint32_t") int value) { VkImageToMemoryCopy.set_memoryRowLength(this.segment(), value); return this; }

    /// {@return `memoryImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryImageHeight(MemorySegment segment, long index) { return (int) VH_memoryImageHeight.get(segment, 0L, index); }
    /// {@return `memoryImageHeight`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryImageHeight(MemorySegment segment) { return VkImageToMemoryCopy.get_memoryImageHeight(segment, 0L); }
    /// {@return `memoryImageHeight` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryImageHeightAt(long index) { return VkImageToMemoryCopy.get_memoryImageHeight(this.segment(), index); }
    /// {@return `memoryImageHeight`}
    public @CType("uint32_t") int memoryImageHeight() { return VkImageToMemoryCopy.get_memoryImageHeight(this.segment()); }
    /// Sets `memoryImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryImageHeight(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryImageHeight.set(segment, 0L, index, value); }
    /// Sets `memoryImageHeight` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryImageHeight(MemorySegment segment, @CType("uint32_t") int value) { VkImageToMemoryCopy.set_memoryImageHeight(segment, 0L, value); }
    /// Sets `memoryImageHeight` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy memoryImageHeightAt(long index, @CType("uint32_t") int value) { VkImageToMemoryCopy.set_memoryImageHeight(this.segment(), index, value); return this; }
    /// Sets `memoryImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy memoryImageHeight(@CType("uint32_t") int value) { VkImageToMemoryCopy.set_memoryImageHeight(this.segment(), value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource); }
    /// {@return `imageSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_imageSubresource(MemorySegment segment) { return VkImageToMemoryCopy.get_imageSubresource(segment, 0L); }
    /// {@return `imageSubresource` at the given index}
    /// @param index the index
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment imageSubresourceAt(long index) { return VkImageToMemoryCopy.get_imageSubresource(this.segment(), index); }
    /// {@return `imageSubresource`}
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment imageSubresource() { return VkImageToMemoryCopy.get_imageSubresource(this.segment()); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageSubresource(segment, 0L, value); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageSubresourceAt(long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageSubresource(this.segment(), index, value); return this; }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageSubresource(@CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageSubresource(this.segment(), value); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), ML_imageOffset); }
    /// {@return `imageOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_imageOffset(MemorySegment segment) { return VkImageToMemoryCopy.get_imageOffset(segment, 0L); }
    /// {@return `imageOffset` at the given index}
    /// @param index the index
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment imageOffsetAt(long index) { return VkImageToMemoryCopy.get_imageOffset(this.segment(), index); }
    /// {@return `imageOffset`}
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment imageOffset() { return VkImageToMemoryCopy.get_imageOffset(this.segment()); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageOffset(MemorySegment segment, long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), ML_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageOffset(MemorySegment segment, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageOffset(segment, 0L, value); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageOffsetAt(long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageOffset(this.segment(), index, value); return this; }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageOffset(@CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageOffset(this.segment(), value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent); }
    /// {@return `imageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_imageExtent(MemorySegment segment) { return VkImageToMemoryCopy.get_imageExtent(segment, 0L); }
    /// {@return `imageExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment imageExtentAt(long index) { return VkImageToMemoryCopy.get_imageExtent(this.segment(), index); }
    /// {@return `imageExtent`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment imageExtent() { return VkImageToMemoryCopy.get_imageExtent(this.segment()); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageExtent(segment, 0L, value); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageExtentAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageExtent(this.segment(), index, value); return this; }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageExtent(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageToMemoryCopy.set_imageExtent(this.segment(), value); return this; }

}
