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
package overrungl.vulkan.qcom.struct;

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
/// ### fragmentDensityOffsetCount
/// [VarHandle][#VH_fragmentDensityOffsetCount] - [Getter][#fragmentDensityOffsetCount()] - [Setter][#fragmentDensityOffsetCount(int)]
/// ### pFragmentDensityOffsets
/// [VarHandle][#VH_pFragmentDensityOffsets] - [Getter][#pFragmentDensityOffsets()] - [Setter][#pFragmentDensityOffsets(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t fragmentDensityOffsetCount;
///     const VkOffset2D * pFragmentDensityOffsets;
/// } VkSubpassFragmentDensityMapOffsetEndInfoQCOM;
/// ```
public sealed class VkSubpassFragmentDensityMapOffsetEndInfoQCOM extends Struct {
    /// The struct layout of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityOffsetCount"),
        ValueLayout.ADDRESS.withName("pFragmentDensityOffsets")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fragmentDensityOffsetCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityOffsetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityOffsetCount"));
    /// The [VarHandle] of `pFragmentDensityOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFragmentDensityOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFragmentDensityOffsets"));

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM alloc(SegmentAllocator allocator) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int fragmentDensityOffsetCount, @CType("const VkOffset2D *") MemorySegment pFragmentDensityOffsets) { return alloc(allocator).sType(sType).pNext(pNext).fragmentDensityOffsetCount(fragmentDensityOffsetCount).pFragmentDensityOffsets(pFragmentDensityOffsets); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM copyFrom(VkSubpassFragmentDensityMapOffsetEndInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType(@CType("VkStructureType") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNext(@CType("const void *") MemorySegment value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentDensityOffsetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_fragmentDensityOffsetCount(MemorySegment segment, long index) { return (int) VH_fragmentDensityOffsetCount.get(segment, 0L, index); }
    /// {@return `fragmentDensityOffsetCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_fragmentDensityOffsetCount(MemorySegment segment) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_fragmentDensityOffsetCount(segment, 0L); }
    /// {@return `fragmentDensityOffsetCount`}
    public @CType("uint32_t") int fragmentDensityOffsetCount() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_fragmentDensityOffsetCount(this.segment()); }
    /// Sets `fragmentDensityOffsetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityOffsetCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_fragmentDensityOffsetCount.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityOffsetCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityOffsetCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_fragmentDensityOffsetCount(segment, 0L, value); }
    /// Sets `fragmentDensityOffsetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM fragmentDensityOffsetCount(@CType("uint32_t") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_fragmentDensityOffsetCount(this.segment(), value); return this; }

    /// {@return `pFragmentDensityOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkOffset2D *") MemorySegment get_pFragmentDensityOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pFragmentDensityOffsets.get(segment, 0L, index); }
    /// {@return `pFragmentDensityOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const VkOffset2D *") MemorySegment get_pFragmentDensityOffsets(MemorySegment segment) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_pFragmentDensityOffsets(segment, 0L); }
    /// {@return `pFragmentDensityOffsets`}
    public @CType("const VkOffset2D *") MemorySegment pFragmentDensityOffsets() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_pFragmentDensityOffsets(this.segment()); }
    /// Sets `pFragmentDensityOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFragmentDensityOffsets(MemorySegment segment, long index, @CType("const VkOffset2D *") MemorySegment value) { VH_pFragmentDensityOffsets.set(segment, 0L, index, value); }
    /// Sets `pFragmentDensityOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFragmentDensityOffsets(MemorySegment segment, @CType("const VkOffset2D *") MemorySegment value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_pFragmentDensityOffsets(segment, 0L, value); }
    /// Sets `pFragmentDensityOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsets(@CType("const VkOffset2D *") MemorySegment value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_pFragmentDensityOffsets(this.segment(), value); return this; }

    /// A buffer of [VkSubpassFragmentDensityMapOffsetEndInfoQCOM].
    public static final class Buffer extends VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
        private final long elementCount;

        /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM asSlice(long index) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `fragmentDensityOffsetCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int fragmentDensityOffsetCountAt(long index) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_fragmentDensityOffsetCount(this.segment(), index); }
        /// Sets `fragmentDensityOffsetCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityOffsetCountAt(long index, @CType("uint32_t") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_fragmentDensityOffsetCount(this.segment(), index, value); return this; }

        /// {@return `pFragmentDensityOffsets` at the given index}
        /// @param index the index
        public @CType("const VkOffset2D *") MemorySegment pFragmentDensityOffsetsAt(long index) { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.get_pFragmentDensityOffsets(this.segment(), index); }
        /// Sets `pFragmentDensityOffsets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pFragmentDensityOffsetsAt(long index, @CType("const VkOffset2D *") MemorySegment value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.set_pFragmentDensityOffsets(this.segment(), index, value); return this; }

    }
}
