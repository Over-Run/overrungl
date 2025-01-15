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
package overrungl.vulkan.intel.struct;

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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceConfigurationAcquireInfoINTEL {
///     VkStructureType sType;
///     const void * pNext;
///     VkPerformanceConfigurationTypeINTEL type;
/// } VkPerformanceConfigurationAcquireInfoINTEL;
/// ```
public sealed class VkPerformanceConfigurationAcquireInfoINTEL extends Struct {
    /// The struct layout of `VkPerformanceConfigurationAcquireInfoINTEL`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));

    /// Creates `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceConfigurationAcquireInfoINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceConfigurationAcquireInfoINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceConfigurationAcquireInfoINTEL(segment); }

    /// Creates `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceConfigurationAcquireInfoINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceConfigurationAcquireInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceConfigurationAcquireInfoINTEL`
    public static VkPerformanceConfigurationAcquireInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceConfigurationAcquireInfoINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceConfigurationAcquireInfoINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceConfigurationAcquireInfoINTEL` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceConfigurationAcquireInfoINTEL`
    public static VkPerformanceConfigurationAcquireInfoINTEL allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPerformanceConfigurationTypeINTEL") int type) { return alloc(allocator).sType(sType).pNext(pNext).type(type); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceConfigurationAcquireInfoINTEL copyFrom(VkPerformanceConfigurationAcquireInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceConfigurationAcquireInfoINTEL.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceConfigurationAcquireInfoINTEL.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceConfigurationAcquireInfoINTEL.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceConfigurationAcquireInfoINTEL sType(@CType("VkStructureType") int value) { VkPerformanceConfigurationAcquireInfoINTEL.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceConfigurationAcquireInfoINTEL.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPerformanceConfigurationAcquireInfoINTEL.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceConfigurationAcquireInfoINTEL.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceConfigurationAcquireInfoINTEL pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceConfigurationAcquireInfoINTEL.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceConfigurationTypeINTEL") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceConfigurationTypeINTEL") int get_type(MemorySegment segment) { return VkPerformanceConfigurationAcquireInfoINTEL.get_type(segment, 0L); }
    /// {@return `type`}
    public @CType("VkPerformanceConfigurationTypeINTEL") int type() { return VkPerformanceConfigurationAcquireInfoINTEL.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkPerformanceConfigurationTypeINTEL") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkPerformanceConfigurationTypeINTEL") int value) { VkPerformanceConfigurationAcquireInfoINTEL.set_type(segment, 0L, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceConfigurationAcquireInfoINTEL type(@CType("VkPerformanceConfigurationTypeINTEL") int value) { VkPerformanceConfigurationAcquireInfoINTEL.set_type(this.segment(), value); return this; }

    /// A buffer of [VkPerformanceConfigurationAcquireInfoINTEL].
    public static final class Buffer extends VkPerformanceConfigurationAcquireInfoINTEL {
        private final long elementCount;

        /// Creates `VkPerformanceConfigurationAcquireInfoINTEL.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceConfigurationAcquireInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceConfigurationAcquireInfoINTEL`
        public VkPerformanceConfigurationAcquireInfoINTEL asSlice(long index) { return new VkPerformanceConfigurationAcquireInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceConfigurationAcquireInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceConfigurationAcquireInfoINTEL`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceConfigurationAcquireInfoINTEL.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceConfigurationAcquireInfoINTEL.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPerformanceConfigurationAcquireInfoINTEL.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceConfigurationAcquireInfoINTEL.set_pNext(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index
        public @CType("VkPerformanceConfigurationTypeINTEL") int typeAt(long index) { return VkPerformanceConfigurationAcquireInfoINTEL.get_type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, @CType("VkPerformanceConfigurationTypeINTEL") int value) { VkPerformanceConfigurationAcquireInfoINTEL.set_type(this.segment(), index, value); return this; }

    }
}
