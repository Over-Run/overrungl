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
/// ### faultLevel
/// [VarHandle][#VH_faultLevel] - [Getter][#faultLevel()] - [Setter][#faultLevel(int)]
/// ### faultType
/// [VarHandle][#VH_faultType] - [Getter][#faultType()] - [Setter][#faultType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFaultData {
///     VkStructureType sType;
///     void * pNext;
///     VkFaultLevel faultLevel;
///     VkFaultType faultType;
/// } VkFaultData;
/// ```
public sealed class VkFaultData extends Struct {
    /// The struct layout of `VkFaultData`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("faultLevel"),
        ValueLayout.JAVA_INT.withName("faultType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `faultLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_faultLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("faultLevel"));
    /// The [VarHandle] of `faultType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_faultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("faultType"));

    /// Creates `VkFaultData` with the given segment.
    /// @param segment the memory segment
    public VkFaultData(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFaultData` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultData of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFaultData(segment); }

    /// Creates `VkFaultData` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFaultData` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultData ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFaultData(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFaultData` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFaultData` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFaultData`
    public static VkFaultData alloc(SegmentAllocator allocator) { return new VkFaultData(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFaultData` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFaultData`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFaultData` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFaultData`
    public static VkFaultData allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkFaultLevel") int faultLevel, @CType("VkFaultType") int faultType) { return alloc(allocator).sType(sType).pNext(pNext).faultLevel(faultLevel).faultType(faultType); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFaultData copyFrom(VkFaultData src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFaultData.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFaultData.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFaultData.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultData sType(@CType("VkStructureType") int value) { VkFaultData.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkFaultData.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkFaultData.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkFaultData.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultData pNext(@CType("void *") MemorySegment value) { VkFaultData.set_pNext(this.segment(), value); return this; }

    /// {@return `faultLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFaultLevel") int get_faultLevel(MemorySegment segment, long index) { return (int) VH_faultLevel.get(segment, 0L, index); }
    /// {@return `faultLevel`}
    /// @param segment the segment of the struct
    public static @CType("VkFaultLevel") int get_faultLevel(MemorySegment segment) { return VkFaultData.get_faultLevel(segment, 0L); }
    /// {@return `faultLevel`}
    public @CType("VkFaultLevel") int faultLevel() { return VkFaultData.get_faultLevel(this.segment()); }
    /// Sets `faultLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_faultLevel(MemorySegment segment, long index, @CType("VkFaultLevel") int value) { VH_faultLevel.set(segment, 0L, index, value); }
    /// Sets `faultLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_faultLevel(MemorySegment segment, @CType("VkFaultLevel") int value) { VkFaultData.set_faultLevel(segment, 0L, value); }
    /// Sets `faultLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultData faultLevel(@CType("VkFaultLevel") int value) { VkFaultData.set_faultLevel(this.segment(), value); return this; }

    /// {@return `faultType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFaultType") int get_faultType(MemorySegment segment, long index) { return (int) VH_faultType.get(segment, 0L, index); }
    /// {@return `faultType`}
    /// @param segment the segment of the struct
    public static @CType("VkFaultType") int get_faultType(MemorySegment segment) { return VkFaultData.get_faultType(segment, 0L); }
    /// {@return `faultType`}
    public @CType("VkFaultType") int faultType() { return VkFaultData.get_faultType(this.segment()); }
    /// Sets `faultType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_faultType(MemorySegment segment, long index, @CType("VkFaultType") int value) { VH_faultType.set(segment, 0L, index, value); }
    /// Sets `faultType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_faultType(MemorySegment segment, @CType("VkFaultType") int value) { VkFaultData.set_faultType(segment, 0L, value); }
    /// Sets `faultType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultData faultType(@CType("VkFaultType") int value) { VkFaultData.set_faultType(this.segment(), value); return this; }

    /// A buffer of [VkFaultData].
    public static final class Buffer extends VkFaultData {
        private final long elementCount;

        /// Creates `VkFaultData.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFaultData`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFaultData`
        public VkFaultData asSlice(long index) { return new VkFaultData(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFaultData`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFaultData`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkFaultData.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkFaultData.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkFaultData.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkFaultData.set_pNext(this.segment(), index, value); return this; }

        /// {@return `faultLevel` at the given index}
        /// @param index the index
        public @CType("VkFaultLevel") int faultLevelAt(long index) { return VkFaultData.get_faultLevel(this.segment(), index); }
        /// Sets `faultLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer faultLevelAt(long index, @CType("VkFaultLevel") int value) { VkFaultData.set_faultLevel(this.segment(), index, value); return this; }

        /// {@return `faultType` at the given index}
        /// @param index the index
        public @CType("VkFaultType") int faultTypeAt(long index) { return VkFaultData.get_faultType(this.segment(), index); }
        /// Sets `faultType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer faultTypeAt(long index, @CType("VkFaultType") int value) { VkFaultData.set_faultType(this.segment(), index, value); return this; }

    }
}
