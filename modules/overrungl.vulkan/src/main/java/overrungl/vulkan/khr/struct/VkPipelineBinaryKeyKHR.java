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
import static overrungl.vulkan.khr.VKKHRPipelineBinary.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### keySize
/// [VarHandle][#VH_keySize] - [Getter][#keySize()] - [Setter][#keySize(int)]
/// ### key
/// [Byte offset][#OFFSET_key] - [Memory layout][#ML_key] - [Getter][#key()] - [Setter][#key(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineBinaryKeyKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t keySize;
///     uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR] key;
/// } VkPipelineBinaryKeyKHR;
/// ```
public sealed class VkPipelineBinaryKeyKHR extends Struct {
    /// The struct layout of `VkPipelineBinaryKeyKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("keySize"),
        MemoryLayout.sequenceLayout(VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR, ValueLayout.JAVA_BYTE).withName("key")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `keySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_keySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("keySize"));
    /// The byte offset of `key`.
    public static final long OFFSET_key = LAYOUT.byteOffset(PathElement.groupElement("key"));
    /// The memory layout of `key`.
    public static final MemoryLayout ML_key = LAYOUT.select(PathElement.groupElement("key"));

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryKeyKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeyKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeyKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineBinaryKeyKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryKeyKHR`
    public static VkPipelineBinaryKeyKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryKeyKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryKeyKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryKeyKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineBinaryKeyKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryKeyKHR`
    public static VkPipelineBinaryKeyKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int keySize, @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment key) { return alloc(allocator).sType(sType).pNext(pNext).keySize(keySize).key(key); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryKeyKHR copyFrom(VkPipelineBinaryKeyKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineBinaryKeyKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineBinaryKeyKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineBinaryKeyKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR sType(@CType("VkStructureType") int value) { VkPipelineBinaryKeyKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineBinaryKeyKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPipelineBinaryKeyKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPipelineBinaryKeyKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR pNext(@CType("void *") MemorySegment value) { VkPipelineBinaryKeyKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `keySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_keySize(MemorySegment segment, long index) { return (int) VH_keySize.get(segment, 0L, index); }
    /// {@return `keySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_keySize(MemorySegment segment) { return VkPipelineBinaryKeyKHR.get_keySize(segment, 0L); }
    /// {@return `keySize`}
    public @CType("uint32_t") int keySize() { return VkPipelineBinaryKeyKHR.get_keySize(this.segment()); }
    /// Sets `keySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_keySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_keySize.set(segment, 0L, index, value); }
    /// Sets `keySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_keySize(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineBinaryKeyKHR.set_keySize(segment, 0L, value); }
    /// Sets `keySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR keySize(@CType("uint32_t") int value) { VkPipelineBinaryKeyKHR.set_keySize(this.segment(), value); return this; }

    /// {@return `key` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment get_key(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_key, index), ML_key); }
    /// {@return `key`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment get_key(MemorySegment segment) { return VkPipelineBinaryKeyKHR.get_key(segment, 0L); }
    /// {@return `key`}
    public @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment key() { return VkPipelineBinaryKeyKHR.get_key(this.segment()); }
    /// Sets `key` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_key(MemorySegment segment, long index, @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_key, index), ML_key.byteSize()); }
    /// Sets `key` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_key(MemorySegment segment, @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment value) { VkPipelineBinaryKeyKHR.set_key(segment, 0L, value); }
    /// Sets `key` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR key(@CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment value) { VkPipelineBinaryKeyKHR.set_key(this.segment(), value); return this; }

    /// A buffer of [VkPipelineBinaryKeyKHR].
    public static final class Buffer extends VkPipelineBinaryKeyKHR {
        private final long elementCount;

        /// Creates `VkPipelineBinaryKeyKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineBinaryKeyKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineBinaryKeyKHR`
        public VkPipelineBinaryKeyKHR asSlice(long index) { return new VkPipelineBinaryKeyKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineBinaryKeyKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineBinaryKeyKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineBinaryKeyKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineBinaryKeyKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPipelineBinaryKeyKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPipelineBinaryKeyKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `keySize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int keySizeAt(long index) { return VkPipelineBinaryKeyKHR.get_keySize(this.segment(), index); }
        /// Sets `keySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer keySizeAt(long index, @CType("uint32_t") int value) { VkPipelineBinaryKeyKHR.set_keySize(this.segment(), index, value); return this; }

        /// {@return `key` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment keyAt(long index) { return VkPipelineBinaryKeyKHR.get_key(this.segment(), index); }
        /// Sets `key` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer keyAt(long index, @CType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") MemorySegment value) { VkPipelineBinaryKeyKHR.set_key(this.segment(), index, value); return this; }

    }
}
