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
/// ### binaryCount
/// [VarHandle][#VH_binaryCount] - [Getter][#binaryCount()] - [Setter][#binaryCount(int)]
/// ### pPipelineBinaryKeys
/// [VarHandle][#VH_pPipelineBinaryKeys] - [Getter][#pPipelineBinaryKeys()] - [Setter][#pPipelineBinaryKeys(MemorySegment)]
/// ### pPipelineBinaryData
/// [VarHandle][#VH_pPipelineBinaryData] - [Getter][#pPipelineBinaryData()] - [Setter][#pPipelineBinaryData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineBinaryKeysAndDataKHR {
///     uint32_t binaryCount;
///     const VkPipelineBinaryKeyKHR * pPipelineBinaryKeys;
///     const VkPipelineBinaryDataKHR * pPipelineBinaryData;
/// } VkPipelineBinaryKeysAndDataKHR;
/// ```
public sealed class VkPipelineBinaryKeysAndDataKHR extends Struct {
    /// The struct layout of `VkPipelineBinaryKeysAndDataKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withName("pPipelineBinaryKeys"),
        ValueLayout.ADDRESS.withName("pPipelineBinaryData")
    );
    /// The [VarHandle] of `binaryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binaryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binaryCount"));
    /// The [VarHandle] of `pPipelineBinaryKeys` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineBinaryKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaryKeys"));
    /// The [VarHandle] of `pPipelineBinaryData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineBinaryData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaryData"));

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryKeysAndDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeysAndDataKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeysAndDataKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryKeysAndDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineBinaryKeysAndDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryKeysAndDataKHR`
    public static VkPipelineBinaryKeysAndDataKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryKeysAndDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryKeysAndDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryKeysAndDataKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineBinaryKeysAndDataKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryKeysAndDataKHR`
    public static VkPipelineBinaryKeysAndDataKHR allocInit(SegmentAllocator allocator, @CType("uint32_t") int binaryCount, @CType("const VkPipelineBinaryKeyKHR *") MemorySegment pPipelineBinaryKeys, @CType("const VkPipelineBinaryDataKHR *") MemorySegment pPipelineBinaryData) { return alloc(allocator).binaryCount(binaryCount).pPipelineBinaryKeys(pPipelineBinaryKeys).pPipelineBinaryData(pPipelineBinaryData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR copyFrom(VkPipelineBinaryKeysAndDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `binaryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binaryCount(MemorySegment segment, long index) { return (int) VH_binaryCount.get(segment, 0L, index); }
    /// {@return `binaryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binaryCount(MemorySegment segment) { return VkPipelineBinaryKeysAndDataKHR.get_binaryCount(segment, 0L); }
    /// {@return `binaryCount`}
    public @CType("uint32_t") int binaryCount() { return VkPipelineBinaryKeysAndDataKHR.get_binaryCount(this.segment()); }
    /// Sets `binaryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binaryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binaryCount.set(segment, 0L, index, value); }
    /// Sets `binaryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binaryCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineBinaryKeysAndDataKHR.set_binaryCount(segment, 0L, value); }
    /// Sets `binaryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR binaryCount(@CType("uint32_t") int value) { VkPipelineBinaryKeysAndDataKHR.set_binaryCount(this.segment(), value); return this; }

    /// {@return `pPipelineBinaryKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineBinaryKeyKHR *") MemorySegment get_pPipelineBinaryKeys(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineBinaryKeys.get(segment, 0L, index); }
    /// {@return `pPipelineBinaryKeys`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineBinaryKeyKHR *") MemorySegment get_pPipelineBinaryKeys(MemorySegment segment) { return VkPipelineBinaryKeysAndDataKHR.get_pPipelineBinaryKeys(segment, 0L); }
    /// {@return `pPipelineBinaryKeys`}
    public @CType("const VkPipelineBinaryKeyKHR *") MemorySegment pPipelineBinaryKeys() { return VkPipelineBinaryKeysAndDataKHR.get_pPipelineBinaryKeys(this.segment()); }
    /// Sets `pPipelineBinaryKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineBinaryKeys(MemorySegment segment, long index, @CType("const VkPipelineBinaryKeyKHR *") MemorySegment value) { VH_pPipelineBinaryKeys.set(segment, 0L, index, value); }
    /// Sets `pPipelineBinaryKeys` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelineBinaryKeys(MemorySegment segment, @CType("const VkPipelineBinaryKeyKHR *") MemorySegment value) { VkPipelineBinaryKeysAndDataKHR.set_pPipelineBinaryKeys(segment, 0L, value); }
    /// Sets `pPipelineBinaryKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeys(@CType("const VkPipelineBinaryKeyKHR *") MemorySegment value) { VkPipelineBinaryKeysAndDataKHR.set_pPipelineBinaryKeys(this.segment(), value); return this; }

    /// {@return `pPipelineBinaryData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineBinaryDataKHR *") MemorySegment get_pPipelineBinaryData(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineBinaryData.get(segment, 0L, index); }
    /// {@return `pPipelineBinaryData`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineBinaryDataKHR *") MemorySegment get_pPipelineBinaryData(MemorySegment segment) { return VkPipelineBinaryKeysAndDataKHR.get_pPipelineBinaryData(segment, 0L); }
    /// {@return `pPipelineBinaryData`}
    public @CType("const VkPipelineBinaryDataKHR *") MemorySegment pPipelineBinaryData() { return VkPipelineBinaryKeysAndDataKHR.get_pPipelineBinaryData(this.segment()); }
    /// Sets `pPipelineBinaryData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineBinaryData(MemorySegment segment, long index, @CType("const VkPipelineBinaryDataKHR *") MemorySegment value) { VH_pPipelineBinaryData.set(segment, 0L, index, value); }
    /// Sets `pPipelineBinaryData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelineBinaryData(MemorySegment segment, @CType("const VkPipelineBinaryDataKHR *") MemorySegment value) { VkPipelineBinaryKeysAndDataKHR.set_pPipelineBinaryData(segment, 0L, value); }
    /// Sets `pPipelineBinaryData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryData(@CType("const VkPipelineBinaryDataKHR *") MemorySegment value) { VkPipelineBinaryKeysAndDataKHR.set_pPipelineBinaryData(this.segment(), value); return this; }

    /// A buffer of [VkPipelineBinaryKeysAndDataKHR].
    public static final class Buffer extends VkPipelineBinaryKeysAndDataKHR {
        private final long elementCount;

        /// Creates `VkPipelineBinaryKeysAndDataKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineBinaryKeysAndDataKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineBinaryKeysAndDataKHR`
        public VkPipelineBinaryKeysAndDataKHR asSlice(long index) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineBinaryKeysAndDataKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineBinaryKeysAndDataKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `binaryCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int binaryCountAt(long index) { return VkPipelineBinaryKeysAndDataKHR.get_binaryCount(this.segment(), index); }
        /// Sets `binaryCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer binaryCountAt(long index, @CType("uint32_t") int value) { VkPipelineBinaryKeysAndDataKHR.set_binaryCount(this.segment(), index, value); return this; }

        /// {@return `pPipelineBinaryKeys` at the given index}
        /// @param index the index
        public @CType("const VkPipelineBinaryKeyKHR *") MemorySegment pPipelineBinaryKeysAt(long index) { return VkPipelineBinaryKeysAndDataKHR.get_pPipelineBinaryKeys(this.segment(), index); }
        /// Sets `pPipelineBinaryKeys` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineBinaryKeysAt(long index, @CType("const VkPipelineBinaryKeyKHR *") MemorySegment value) { VkPipelineBinaryKeysAndDataKHR.set_pPipelineBinaryKeys(this.segment(), index, value); return this; }

        /// {@return `pPipelineBinaryData` at the given index}
        /// @param index the index
        public @CType("const VkPipelineBinaryDataKHR *") MemorySegment pPipelineBinaryDataAt(long index) { return VkPipelineBinaryKeysAndDataKHR.get_pPipelineBinaryData(this.segment(), index); }
        /// Sets `pPipelineBinaryData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineBinaryDataAt(long index, @CType("const VkPipelineBinaryDataKHR *") MemorySegment value) { VkPipelineBinaryKeysAndDataKHR.set_pPipelineBinaryData(this.segment(), index, value); return this; }

    }
}
