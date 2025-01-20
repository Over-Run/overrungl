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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### pStdPictureInfo
/// [VarHandle][#VH_pStdPictureInfo] - [Getter][#pStdPictureInfo()] - [Setter][#pStdPictureInfo(MemorySegment)]
/// ### sliceSegmentCount
/// [VarHandle][#VH_sliceSegmentCount] - [Getter][#sliceSegmentCount()] - [Setter][#sliceSegmentCount(int)]
/// ### pSliceSegmentOffsets
/// [VarHandle][#VH_pSliceSegmentOffsets] - [Getter][#pSliceSegmentOffsets()] - [Setter][#pSliceSegmentOffsets(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH265PictureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const StdVideoDecodeH265PictureInfo * pStdPictureInfo;
///     uint32_t sliceSegmentCount;
///     const uint32_t * pSliceSegmentOffsets;
/// } VkVideoDecodeH265PictureInfoKHR;
/// ```
public sealed class VkVideoDecodeH265PictureInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH265PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceSegmentCount"),
        ValueLayout.ADDRESS.withName("pSliceSegmentOffsets")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `sliceSegmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sliceSegmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceSegmentCount"));
    /// The [VarHandle] of `pSliceSegmentOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSliceSegmentOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSliceSegmentOffsets"));

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH265PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265PictureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265PictureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeH265PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265PictureInfoKHR`
    public static VkVideoDecodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH265PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265PictureInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeH265PictureInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265PictureInfoKHR`
    public static VkVideoDecodeH265PictureInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment pStdPictureInfo, @CType("uint32_t") int sliceSegmentCount, @CType("const uint32_t *") MemorySegment pSliceSegmentOffsets) { return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).sliceSegmentCount(sliceSegmentCount).pSliceSegmentOffsets(pSliceSegmentOffsets); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR copyFrom(VkVideoDecodeH265PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH265PictureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH265PictureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH265PictureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH265PictureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH265PictureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoDecodeH265PictureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment get_pStdPictureInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment get_pStdPictureInfo(MemorySegment segment) { return VkVideoDecodeH265PictureInfoKHR.get_pStdPictureInfo(segment, 0L); }
    /// {@return `pStdPictureInfo`}
    public @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment pStdPictureInfo() { return VkVideoDecodeH265PictureInfoKHR.get_pStdPictureInfo(this.segment()); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, long index, @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pStdPictureInfo(segment, 0L, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfo(@CType("const StdVideoDecodeH265PictureInfo *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pStdPictureInfo(this.segment(), value); return this; }

    /// {@return `sliceSegmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sliceSegmentCount(MemorySegment segment, long index) { return (int) VH_sliceSegmentCount.get(segment, 0L, index); }
    /// {@return `sliceSegmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sliceSegmentCount(MemorySegment segment) { return VkVideoDecodeH265PictureInfoKHR.get_sliceSegmentCount(segment, 0L); }
    /// {@return `sliceSegmentCount`}
    public @CType("uint32_t") int sliceSegmentCount() { return VkVideoDecodeH265PictureInfoKHR.get_sliceSegmentCount(this.segment()); }
    /// Sets `sliceSegmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sliceSegmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sliceSegmentCount.set(segment, 0L, index, value); }
    /// Sets `sliceSegmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sliceSegmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeH265PictureInfoKHR.set_sliceSegmentCount(segment, 0L, value); }
    /// Sets `sliceSegmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR sliceSegmentCount(@CType("uint32_t") int value) { VkVideoDecodeH265PictureInfoKHR.set_sliceSegmentCount(this.segment(), value); return this; }

    /// {@return `pSliceSegmentOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pSliceSegmentOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pSliceSegmentOffsets.get(segment, 0L, index); }
    /// {@return `pSliceSegmentOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pSliceSegmentOffsets(MemorySegment segment) { return VkVideoDecodeH265PictureInfoKHR.get_pSliceSegmentOffsets(segment, 0L); }
    /// {@return `pSliceSegmentOffsets`}
    public @CType("const uint32_t *") MemorySegment pSliceSegmentOffsets() { return VkVideoDecodeH265PictureInfoKHR.get_pSliceSegmentOffsets(this.segment()); }
    /// Sets `pSliceSegmentOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSliceSegmentOffsets(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pSliceSegmentOffsets.set(segment, 0L, index, value); }
    /// Sets `pSliceSegmentOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSliceSegmentOffsets(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pSliceSegmentOffsets(segment, 0L, value); }
    /// Sets `pSliceSegmentOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsets(@CType("const uint32_t *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pSliceSegmentOffsets(this.segment(), value); return this; }

    /// A buffer of [VkVideoDecodeH265PictureInfoKHR].
    public static final class Buffer extends VkVideoDecodeH265PictureInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeH265PictureInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeH265PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeH265PictureInfoKHR`
        public VkVideoDecodeH265PictureInfoKHR asSlice(long index) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeH265PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeH265PictureInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH265PictureInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH265PictureInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoDecodeH265PictureInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pStdPictureInfo` at the given index}
        /// @param index the index
        public @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment pStdPictureInfoAt(long index) { return VkVideoDecodeH265PictureInfoKHR.get_pStdPictureInfo(this.segment(), index); }
        /// Sets `pStdPictureInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStdPictureInfoAt(long index, @CType("const StdVideoDecodeH265PictureInfo *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pStdPictureInfo(this.segment(), index, value); return this; }

        /// {@return `sliceSegmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sliceSegmentCountAt(long index) { return VkVideoDecodeH265PictureInfoKHR.get_sliceSegmentCount(this.segment(), index); }
        /// Sets `sliceSegmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sliceSegmentCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeH265PictureInfoKHR.set_sliceSegmentCount(this.segment(), index, value); return this; }

        /// {@return `pSliceSegmentOffsets` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pSliceSegmentOffsetsAt(long index) { return VkVideoDecodeH265PictureInfoKHR.get_pSliceSegmentOffsets(this.segment(), index); }
        /// Sets `pSliceSegmentOffsets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSliceSegmentOffsetsAt(long index, @CType("const uint32_t *") MemorySegment value) { VkVideoDecodeH265PictureInfoKHR.set_pSliceSegmentOffsets(this.segment(), index, value); return this; }

    }
}
