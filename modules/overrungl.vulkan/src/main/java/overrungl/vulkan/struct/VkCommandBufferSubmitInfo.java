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
/// ### commandBuffer
/// [VarHandle][#VH_commandBuffer] - [Getter][#commandBuffer()] - [Setter][#commandBuffer(MemorySegment)]
/// ### deviceMask
/// [VarHandle][#VH_deviceMask] - [Getter][#deviceMask()] - [Setter][#deviceMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkCommandBuffer commandBuffer;
///     uint32_t deviceMask;
/// } VkCommandBufferSubmitInfo;
/// ```
public sealed class VkCommandBufferSubmitInfo extends Struct {
    /// The struct layout of `VkCommandBufferSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandBuffer"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `commandBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBuffer"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCommandBufferSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferSubmitInfo`
    public static VkCommandBufferSubmitInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferSubmitInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandBufferSubmitInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferSubmitInfo`
    public static VkCommandBufferSubmitInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int deviceMask) { return alloc(allocator).sType(sType).pNext(pNext).commandBuffer(commandBuffer).deviceMask(deviceMask); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferSubmitInfo copyFrom(VkCommandBufferSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo sType(@CType("VkStructureType") int value) { VkCommandBufferSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCommandBufferSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCommandBufferSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo pNext(@CType("const void *") MemorySegment value) { VkCommandBufferSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `commandBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCommandBuffer") MemorySegment get_commandBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_commandBuffer.get(segment, 0L, index); }
    /// {@return `commandBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkCommandBuffer") MemorySegment get_commandBuffer(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_commandBuffer(segment, 0L); }
    /// {@return `commandBuffer`}
    public @CType("VkCommandBuffer") MemorySegment commandBuffer() { return VkCommandBufferSubmitInfo.get_commandBuffer(this.segment()); }
    /// Sets `commandBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBuffer(MemorySegment segment, long index, @CType("VkCommandBuffer") MemorySegment value) { VH_commandBuffer.set(segment, 0L, index, value); }
    /// Sets `commandBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBuffer(MemorySegment segment, @CType("VkCommandBuffer") MemorySegment value) { VkCommandBufferSubmitInfo.set_commandBuffer(segment, 0L, value); }
    /// Sets `commandBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo commandBuffer(@CType("VkCommandBuffer") MemorySegment value) { VkCommandBufferSubmitInfo.set_commandBuffer(this.segment(), value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_deviceMask(segment, 0L); }
    /// {@return `deviceMask`}
    public @CType("uint32_t") int deviceMask() { return VkCommandBufferSubmitInfo.get_deviceMask(this.segment()); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, @CType("uint32_t") int value) { VkCommandBufferSubmitInfo.set_deviceMask(segment, 0L, value); }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo deviceMask(@CType("uint32_t") int value) { VkCommandBufferSubmitInfo.set_deviceMask(this.segment(), value); return this; }

    /// A buffer of [VkCommandBufferSubmitInfo].
    public static final class Buffer extends VkCommandBufferSubmitInfo {
        private final long elementCount;

        /// Creates `VkCommandBufferSubmitInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandBufferSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandBufferSubmitInfo`
        public VkCommandBufferSubmitInfo asSlice(long index) { return new VkCommandBufferSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandBufferSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandBufferSubmitInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferSubmitInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferSubmitInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCommandBufferSubmitInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCommandBufferSubmitInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `commandBuffer` at the given index}
        /// @param index the index
        public @CType("VkCommandBuffer") MemorySegment commandBufferAt(long index) { return VkCommandBufferSubmitInfo.get_commandBuffer(this.segment(), index); }
        /// Sets `commandBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferAt(long index, @CType("VkCommandBuffer") MemorySegment value) { VkCommandBufferSubmitInfo.set_commandBuffer(this.segment(), index, value); return this; }

        /// {@return `deviceMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceMaskAt(long index) { return VkCommandBufferSubmitInfo.get_deviceMask(this.segment(), index); }
        /// Sets `deviceMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceMaskAt(long index, @CType("uint32_t") int value) { VkCommandBufferSubmitInfo.set_deviceMask(this.segment(), index, value); return this; }

    }
}
