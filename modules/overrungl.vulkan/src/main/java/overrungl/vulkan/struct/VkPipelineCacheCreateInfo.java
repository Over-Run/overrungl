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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### initialDataSize
/// [VarHandle][#VH_initialDataSize] - [Getter][#initialDataSize()] - [Setter][#initialDataSize(long)]
/// ### pInitialData
/// [VarHandle][#VH_pInitialData] - [Getter][#pInitialData()] - [Setter][#pInitialData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCacheCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCacheCreateFlags flags;
///     size_t initialDataSize;
///     const void * pInitialData;
/// } VkPipelineCacheCreateInfo;
/// ```
public sealed class VkPipelineCacheCreateInfo extends Struct {
    /// The struct layout of `VkPipelineCacheCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `initialDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_initialDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialDataSize"));
    /// The [VarHandle] of `pInitialData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pInitialData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialData"));

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCacheCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineCacheCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheCreateInfo`
    public static VkPipelineCacheCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineCacheCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCacheCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCacheCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheCreateInfo`
    public static VkPipelineCacheCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineCacheCreateFlags") int flags, @CType("size_t") long initialDataSize, @CType("const void *") MemorySegment pInitialData) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).initialDataSize(initialDataSize).pInitialData(pInitialData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheCreateInfo copyFrom(VkPipelineCacheCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineCacheCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineCacheCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineCacheCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineCacheCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineCacheCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineCacheCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineCacheCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo pNext(@CType("const void *") MemorySegment value) { VkPipelineCacheCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCacheCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCacheCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineCacheCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCacheCreateFlags") int flags() { return VkPipelineCacheCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCacheCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCacheCreateFlags") int value) { VkPipelineCacheCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo flags(@CType("VkPipelineCacheCreateFlags") int value) { VkPipelineCacheCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `initialDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_initialDataSize(MemorySegment segment, long index) { return (long) VH_initialDataSize.get(segment, 0L, index); }
    /// {@return `initialDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_initialDataSize(MemorySegment segment) { return VkPipelineCacheCreateInfo.get_initialDataSize(segment, 0L); }
    /// {@return `initialDataSize`}
    public @CType("size_t") long initialDataSize() { return VkPipelineCacheCreateInfo.get_initialDataSize(this.segment()); }
    /// Sets `initialDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_initialDataSize.set(segment, 0L, index, value); }
    /// Sets `initialDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialDataSize(MemorySegment segment, @CType("size_t") long value) { VkPipelineCacheCreateInfo.set_initialDataSize(segment, 0L, value); }
    /// Sets `initialDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo initialDataSize(@CType("size_t") long value) { VkPipelineCacheCreateInfo.set_initialDataSize(this.segment(), value); return this; }

    /// {@return `pInitialData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pInitialData(MemorySegment segment, long index) { return (MemorySegment) VH_pInitialData.get(segment, 0L, index); }
    /// {@return `pInitialData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pInitialData(MemorySegment segment) { return VkPipelineCacheCreateInfo.get_pInitialData(segment, 0L); }
    /// {@return `pInitialData`}
    public @CType("const void *") MemorySegment pInitialData() { return VkPipelineCacheCreateInfo.get_pInitialData(this.segment()); }
    /// Sets `pInitialData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInitialData(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pInitialData.set(segment, 0L, index, value); }
    /// Sets `pInitialData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInitialData(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineCacheCreateInfo.set_pInitialData(segment, 0L, value); }
    /// Sets `pInitialData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo pInitialData(@CType("const void *") MemorySegment value) { VkPipelineCacheCreateInfo.set_pInitialData(this.segment(), value); return this; }

    /// A buffer of [VkPipelineCacheCreateInfo].
    public static final class Buffer extends VkPipelineCacheCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineCacheCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCacheCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCacheCreateInfo`
        public VkPipelineCacheCreateInfo asSlice(long index) { return new VkPipelineCacheCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCacheCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCacheCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineCacheCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineCacheCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineCacheCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineCacheCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCacheCreateFlags") int flagsAt(long index) { return VkPipelineCacheCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCacheCreateFlags") int value) { VkPipelineCacheCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `initialDataSize` at the given index}
        /// @param index the index
        public @CType("size_t") long initialDataSizeAt(long index) { return VkPipelineCacheCreateInfo.get_initialDataSize(this.segment(), index); }
        /// Sets `initialDataSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer initialDataSizeAt(long index, @CType("size_t") long value) { VkPipelineCacheCreateInfo.set_initialDataSize(this.segment(), index, value); return this; }

        /// {@return `pInitialData` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pInitialDataAt(long index) { return VkPipelineCacheCreateInfo.get_pInitialData(this.segment(), index); }
        /// Sets `pInitialData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pInitialDataAt(long index, @CType("const void *") MemorySegment value) { VkPipelineCacheCreateInfo.set_pInitialData(this.segment(), index, value); return this; }

    }
}
