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
/// ### pVersionData
/// [VarHandle][#VH_pVersionData] - [Getter][#pVersionData()] - [Setter][#pVersionData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureVersionInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const uint8_t * pVersionData;
/// } VkAccelerationStructureVersionInfoKHR;
/// ```
public sealed class VkAccelerationStructureVersionInfoKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureVersionInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVersionData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pVersionData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVersionData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVersionData"));

    /// Creates `VkAccelerationStructureVersionInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureVersionInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureVersionInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureVersionInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureVersionInfoKHR(segment); }

    /// Creates `VkAccelerationStructureVersionInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureVersionInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureVersionInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureVersionInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureVersionInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureVersionInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureVersionInfoKHR`
    public static VkAccelerationStructureVersionInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureVersionInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureVersionInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureVersionInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureVersionInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureVersionInfoKHR`
    public static VkAccelerationStructureVersionInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("const uint8_t *") MemorySegment pVersionData) { return alloc(allocator).sType(sType).pNext(pNext).pVersionData(pVersionData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureVersionInfoKHR copyFrom(VkAccelerationStructureVersionInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureVersionInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureVersionInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureVersionInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureVersionInfoKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureVersionInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureVersionInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkAccelerationStructureVersionInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkAccelerationStructureVersionInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureVersionInfoKHR pNext(@CType("const void *") MemorySegment value) { VkAccelerationStructureVersionInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pVersionData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint8_t *") MemorySegment get_pVersionData(MemorySegment segment, long index) { return (MemorySegment) VH_pVersionData.get(segment, 0L, index); }
    /// {@return `pVersionData`}
    /// @param segment the segment of the struct
    public static @CType("const uint8_t *") MemorySegment get_pVersionData(MemorySegment segment) { return VkAccelerationStructureVersionInfoKHR.get_pVersionData(segment, 0L); }
    /// {@return `pVersionData`}
    public @CType("const uint8_t *") MemorySegment pVersionData() { return VkAccelerationStructureVersionInfoKHR.get_pVersionData(this.segment()); }
    /// Sets `pVersionData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVersionData(MemorySegment segment, long index, @CType("const uint8_t *") MemorySegment value) { VH_pVersionData.set(segment, 0L, index, value); }
    /// Sets `pVersionData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVersionData(MemorySegment segment, @CType("const uint8_t *") MemorySegment value) { VkAccelerationStructureVersionInfoKHR.set_pVersionData(segment, 0L, value); }
    /// Sets `pVersionData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureVersionInfoKHR pVersionData(@CType("const uint8_t *") MemorySegment value) { VkAccelerationStructureVersionInfoKHR.set_pVersionData(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureVersionInfoKHR].
    public static final class Buffer extends VkAccelerationStructureVersionInfoKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureVersionInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureVersionInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureVersionInfoKHR`
        public VkAccelerationStructureVersionInfoKHR asSlice(long index) { return new VkAccelerationStructureVersionInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureVersionInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureVersionInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureVersionInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureVersionInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkAccelerationStructureVersionInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkAccelerationStructureVersionInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pVersionData` at the given index}
        /// @param index the index
        public @CType("const uint8_t *") MemorySegment pVersionDataAt(long index) { return VkAccelerationStructureVersionInfoKHR.get_pVersionData(this.segment(), index); }
        /// Sets `pVersionData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pVersionDataAt(long index, @CType("const uint8_t *") MemorySegment value) { VkAccelerationStructureVersionInfoKHR.set_pVersionData(this.segment(), index, value); return this; }

    }
}
