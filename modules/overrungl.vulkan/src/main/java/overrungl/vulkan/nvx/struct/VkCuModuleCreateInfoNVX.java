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
package overrungl.vulkan.nvx.struct;

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
/// ### dataSize
/// [VarHandle][#VH_dataSize] - [Getter][#dataSize()] - [Setter][#dataSize(long)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCuModuleCreateInfoNVX {
///     VkStructureType sType;
///     const void * pNext;
///     size_t dataSize;
///     const void * pData;
/// } VkCuModuleCreateInfoNVX;
/// ```
public sealed class VkCuModuleCreateInfoNVX extends Struct {
    /// The struct layout of `VkCuModuleCreateInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    public VkCuModuleCreateInfoNVX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleCreateInfoNVX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCuModuleCreateInfoNVX(segment); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleCreateInfoNVX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCuModuleCreateInfoNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCuModuleCreateInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCuModuleCreateInfoNVX`
    public static VkCuModuleCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuModuleCreateInfoNVX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCuModuleCreateInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCuModuleCreateInfoNVX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCuModuleCreateInfoNVX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCuModuleCreateInfoNVX`
    public static VkCuModuleCreateInfoNVX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("size_t") long dataSize, @CType("const void *") MemorySegment pData) { return alloc(allocator).sType(sType).pNext(pNext).dataSize(dataSize).pData(pData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCuModuleCreateInfoNVX copyFrom(VkCuModuleCreateInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCuModuleCreateInfoNVX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCuModuleCreateInfoNVX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCuModuleCreateInfoNVX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX sType(@CType("VkStructureType") int value) { VkCuModuleCreateInfoNVX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCuModuleCreateInfoNVX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCuModuleCreateInfoNVX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCuModuleCreateInfoNVX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX pNext(@CType("const void *") MemorySegment value) { VkCuModuleCreateInfoNVX.set_pNext(this.segment(), value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_dataSize(MemorySegment segment, long index) { return (long) VH_dataSize.get(segment, 0L, index); }
    /// {@return `dataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_dataSize(MemorySegment segment) { return VkCuModuleCreateInfoNVX.get_dataSize(segment, 0L); }
    /// {@return `dataSize`}
    public @CType("size_t") long dataSize() { return VkCuModuleCreateInfoNVX.get_dataSize(this.segment()); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_dataSize.set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, @CType("size_t") long value) { VkCuModuleCreateInfoNVX.set_dataSize(segment, 0L, value); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX dataSize(@CType("size_t") long value) { VkCuModuleCreateInfoNVX.set_dataSize(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pData(MemorySegment segment) { return VkCuModuleCreateInfoNVX.get_pData(segment, 0L); }
    /// {@return `pData`}
    public @CType("const void *") MemorySegment pData() { return VkCuModuleCreateInfoNVX.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCuModuleCreateInfoNVX.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX pData(@CType("const void *") MemorySegment value) { VkCuModuleCreateInfoNVX.set_pData(this.segment(), value); return this; }

    /// A buffer of [VkCuModuleCreateInfoNVX].
    public static final class Buffer extends VkCuModuleCreateInfoNVX {
        private final long elementCount;

        /// Creates `VkCuModuleCreateInfoNVX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCuModuleCreateInfoNVX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCuModuleCreateInfoNVX`
        public VkCuModuleCreateInfoNVX asSlice(long index) { return new VkCuModuleCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCuModuleCreateInfoNVX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCuModuleCreateInfoNVX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCuModuleCreateInfoNVX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCuModuleCreateInfoNVX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCuModuleCreateInfoNVX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCuModuleCreateInfoNVX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `dataSize` at the given index}
        /// @param index the index
        public @CType("size_t") long dataSizeAt(long index) { return VkCuModuleCreateInfoNVX.get_dataSize(this.segment(), index); }
        /// Sets `dataSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataSizeAt(long index, @CType("size_t") long value) { VkCuModuleCreateInfoNVX.set_dataSize(this.segment(), index, value); return this; }

        /// {@return `pData` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pDataAt(long index) { return VkCuModuleCreateInfoNVX.get_pData(this.segment(), index); }
        /// Sets `pData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDataAt(long index, @CType("const void *") MemorySegment value) { VkCuModuleCreateInfoNVX.set_pData(this.segment(), index, value); return this; }

    }
}
