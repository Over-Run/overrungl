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
package overrungl.vulkan.khr.struct;

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
/// ### pStdPictureInfo
/// [VarHandle][#VH_pStdPictureInfo] - [Getter][#pStdPictureInfo()] - [Setter][#pStdPictureInfo(java.lang.foreign.MemorySegment)]
/// ### sliceCount
/// [VarHandle][#VH_sliceCount] - [Getter][#sliceCount()] - [Setter][#sliceCount(int)]
/// ### pSliceOffsets
/// [VarHandle][#VH_pSliceOffsets] - [Getter][#pSliceOffsets()] - [Setter][#pSliceOffsets(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH264PictureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const StdVideoDecodeH264PictureInfo * pStdPictureInfo;
///     uint32_t sliceCount;
///     const uint32_t * pSliceOffsets;
/// } VkVideoDecodeH264PictureInfoKHR;
/// ```
public final class VkVideoDecodeH264PictureInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH264PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceCount"),
        ValueLayout.ADDRESS.withName("pSliceOffsets")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `sliceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceCount"));
    /// The [VarHandle] of `pSliceOffsets` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSliceOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSliceOffsets"));

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH264PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264PictureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment); }

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264PictureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264PictureInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264PictureInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoDecodeH264PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH264PictureInfoKHR`
    public VkVideoDecodeH264PictureInfoKHR asSlice(long index) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoDecodeH264PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH264PictureInfoKHR`
    public VkVideoDecodeH264PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH264PictureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH264PictureInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH264PictureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH264PictureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH264PictureInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH264PictureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH264PictureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeH264PictureInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeH264PictureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment) { return VkVideoDecodeH264PictureInfoKHR.get_pStdPictureInfo(segment, 0L); }
    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfoAt(long index) { return VkVideoDecodeH264PictureInfoKHR.get_pStdPictureInfo(this.segment(), index); }
    /// {@return `pStdPictureInfo`}
    public @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfo() { return VkVideoDecodeH264PictureInfoKHR.get_pStdPictureInfo(this.segment()); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, long index, @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pStdPictureInfo(segment, 0L, value); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfoAt(long index, @CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pStdPictureInfo(this.segment(), index, value); return this; }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfo(@CType("const StdVideoDecodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pStdPictureInfo(this.segment(), value); return this; }

    /// {@return `sliceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sliceCount(MemorySegment segment, long index) { return (int) VH_sliceCount.get(segment, 0L, index); }
    /// {@return `sliceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sliceCount(MemorySegment segment) { return VkVideoDecodeH264PictureInfoKHR.get_sliceCount(segment, 0L); }
    /// {@return `sliceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sliceCountAt(long index) { return VkVideoDecodeH264PictureInfoKHR.get_sliceCount(this.segment(), index); }
    /// {@return `sliceCount`}
    public @CType("uint32_t") int sliceCount() { return VkVideoDecodeH264PictureInfoKHR.get_sliceCount(this.segment()); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sliceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sliceCount.set(segment, 0L, index, value); }
    /// Sets `sliceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sliceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeH264PictureInfoKHR.set_sliceCount(segment, 0L, value); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sliceCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeH264PictureInfoKHR.set_sliceCount(this.segment(), index, value); return this; }
    /// Sets `sliceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sliceCount(@CType("uint32_t") int value) { VkVideoDecodeH264PictureInfoKHR.set_sliceCount(this.segment(), value); return this; }

    /// {@return `pSliceOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pSliceOffsets(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSliceOffsets.get(segment, 0L, index); }
    /// {@return `pSliceOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pSliceOffsets(MemorySegment segment) { return VkVideoDecodeH264PictureInfoKHR.get_pSliceOffsets(segment, 0L); }
    /// {@return `pSliceOffsets` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pSliceOffsetsAt(long index) { return VkVideoDecodeH264PictureInfoKHR.get_pSliceOffsets(this.segment(), index); }
    /// {@return `pSliceOffsets`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pSliceOffsets() { return VkVideoDecodeH264PictureInfoKHR.get_pSliceOffsets(this.segment()); }
    /// Sets `pSliceOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSliceOffsets(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pSliceOffsets.set(segment, 0L, index, value); }
    /// Sets `pSliceOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSliceOffsets(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pSliceOffsets(segment, 0L, value); }
    /// Sets `pSliceOffsets` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsetsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pSliceOffsets(this.segment(), index, value); return this; }
    /// Sets `pSliceOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsets(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264PictureInfoKHR.set_pSliceOffsets(this.segment(), value); return this; }

}
