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
/// ### waitSemaphoreCount
/// [VarHandle][#VH_waitSemaphoreCount] - [Getter][#waitSemaphoreCount()] - [Setter][#waitSemaphoreCount(int)]
/// ### pWaitSemaphoreDeviceIndices
/// [VarHandle][#VH_pWaitSemaphoreDeviceIndices] - [Getter][#pWaitSemaphoreDeviceIndices()] - [Setter][#pWaitSemaphoreDeviceIndices(MemorySegment)]
/// ### commandBufferCount
/// [VarHandle][#VH_commandBufferCount] - [Getter][#commandBufferCount()] - [Setter][#commandBufferCount(int)]
/// ### pCommandBufferDeviceMasks
/// [VarHandle][#VH_pCommandBufferDeviceMasks] - [Getter][#pCommandBufferDeviceMasks()] - [Setter][#pCommandBufferDeviceMasks(MemorySegment)]
/// ### signalSemaphoreCount
/// [VarHandle][#VH_signalSemaphoreCount] - [Getter][#signalSemaphoreCount()] - [Setter][#signalSemaphoreCount(int)]
/// ### pSignalSemaphoreDeviceIndices
/// [VarHandle][#VH_pSignalSemaphoreDeviceIndices] - [Getter][#pSignalSemaphoreDeviceIndices()] - [Setter][#pSignalSemaphoreDeviceIndices(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t waitSemaphoreCount;
///     const uint32_t * pWaitSemaphoreDeviceIndices;
///     uint32_t commandBufferCount;
///     const uint32_t * pCommandBufferDeviceMasks;
///     uint32_t signalSemaphoreCount;
///     const uint32_t * pSignalSemaphoreDeviceIndices;
/// } VkDeviceGroupSubmitInfo;
/// ```
public sealed class VkDeviceGroupSubmitInfo extends Struct {
    /// The struct layout of `VkDeviceGroupSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreDeviceIndices"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withName("pCommandBufferDeviceMasks"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreDeviceIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `waitSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    /// The [VarHandle] of `pWaitSemaphoreDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    /// The [VarHandle] of `commandBufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));
    /// The [VarHandle] of `pCommandBufferDeviceMasks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCommandBufferDeviceMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferDeviceMasks"));
    /// The [VarHandle] of `signalSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    /// The [VarHandle] of `pSignalSemaphoreDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfo(segment); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceGroupSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupSubmitInfo`
    public static VkDeviceGroupSubmitInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupSubmitInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceGroupSubmitInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupSubmitInfo`
    public static VkDeviceGroupSubmitInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int waitSemaphoreCount, @CType("const uint32_t *") MemorySegment pWaitSemaphoreDeviceIndices, @CType("uint32_t") int commandBufferCount, @CType("const uint32_t *") MemorySegment pCommandBufferDeviceMasks, @CType("uint32_t") int signalSemaphoreCount, @CType("const uint32_t *") MemorySegment pSignalSemaphoreDeviceIndices) { return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices).commandBufferCount(commandBufferCount).pCommandBufferDeviceMasks(pCommandBufferDeviceMasks).signalSemaphoreCount(signalSemaphoreCount).pSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupSubmitInfo copyFrom(VkDeviceGroupSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo sType(@CType("VkStructureType") int value) { VkDeviceGroupSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDeviceGroupSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pNext(@CType("const void *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_waitSemaphoreCount(segment, 0L); }
    /// {@return `waitSemaphoreCount`}
    public @CType("uint32_t") int waitSemaphoreCount() { return VkDeviceGroupSubmitInfo.get_waitSemaphoreCount(this.segment()); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_waitSemaphoreCount(segment, 0L, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo waitSemaphoreCount(@CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_waitSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphoreDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pWaitSemaphoreDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreDeviceIndices.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreDeviceIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pWaitSemaphoreDeviceIndices(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_pWaitSemaphoreDeviceIndices(segment, 0L); }
    /// {@return `pWaitSemaphoreDeviceIndices`}
    public @CType("const uint32_t *") MemorySegment pWaitSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfo.get_pWaitSemaphoreDeviceIndices(this.segment()); }
    /// Sets `pWaitSemaphoreDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphoreDeviceIndices(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pWaitSemaphoreDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreDeviceIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphoreDeviceIndices(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pWaitSemaphoreDeviceIndices(segment, 0L, value); }
    /// Sets `pWaitSemaphoreDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(@CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pWaitSemaphoreDeviceIndices(this.segment(), value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandBufferCount(MemorySegment segment, long index) { return (int) VH_commandBufferCount.get(segment, 0L, index); }
    /// {@return `commandBufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandBufferCount(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_commandBufferCount(segment, 0L); }
    /// {@return `commandBufferCount`}
    public @CType("uint32_t") int commandBufferCount() { return VkDeviceGroupSubmitInfo.get_commandBufferCount(this.segment()); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandBufferCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_commandBufferCount(segment, 0L, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo commandBufferCount(@CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_commandBufferCount(this.segment(), value); return this; }

    /// {@return `pCommandBufferDeviceMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pCommandBufferDeviceMasks(MemorySegment segment, long index) { return (MemorySegment) VH_pCommandBufferDeviceMasks.get(segment, 0L, index); }
    /// {@return `pCommandBufferDeviceMasks`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pCommandBufferDeviceMasks(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_pCommandBufferDeviceMasks(segment, 0L); }
    /// {@return `pCommandBufferDeviceMasks`}
    public @CType("const uint32_t *") MemorySegment pCommandBufferDeviceMasks() { return VkDeviceGroupSubmitInfo.get_pCommandBufferDeviceMasks(this.segment()); }
    /// Sets `pCommandBufferDeviceMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCommandBufferDeviceMasks(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pCommandBufferDeviceMasks.set(segment, 0L, index, value); }
    /// Sets `pCommandBufferDeviceMasks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCommandBufferDeviceMasks(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pCommandBufferDeviceMasks(segment, 0L, value); }
    /// Sets `pCommandBufferDeviceMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(@CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pCommandBufferDeviceMasks(this.segment(), value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_signalSemaphoreCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_signalSemaphoreCount(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_signalSemaphoreCount(segment, 0L); }
    /// {@return `signalSemaphoreCount`}
    public @CType("uint32_t") int signalSemaphoreCount() { return VkDeviceGroupSubmitInfo.get_signalSemaphoreCount(this.segment()); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_signalSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_signalSemaphoreCount(segment, 0L, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo signalSemaphoreCount(@CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_signalSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pSignalSemaphoreDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pSignalSemaphoreDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreDeviceIndices.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreDeviceIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pSignalSemaphoreDeviceIndices(MemorySegment segment) { return VkDeviceGroupSubmitInfo.get_pSignalSemaphoreDeviceIndices(segment, 0L); }
    /// {@return `pSignalSemaphoreDeviceIndices`}
    public @CType("const uint32_t *") MemorySegment pSignalSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfo.get_pSignalSemaphoreDeviceIndices(this.segment()); }
    /// Sets `pSignalSemaphoreDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSignalSemaphoreDeviceIndices(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pSignalSemaphoreDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreDeviceIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSignalSemaphoreDeviceIndices(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pSignalSemaphoreDeviceIndices(segment, 0L, value); }
    /// Sets `pSignalSemaphoreDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndices(@CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pSignalSemaphoreDeviceIndices(this.segment(), value); return this; }

    /// A buffer of [VkDeviceGroupSubmitInfo].
    public static final class Buffer extends VkDeviceGroupSubmitInfo {
        private final long elementCount;

        /// Creates `VkDeviceGroupSubmitInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceGroupSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceGroupSubmitInfo`
        public VkDeviceGroupSubmitInfo asSlice(long index) { return new VkDeviceGroupSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceGroupSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceGroupSubmitInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupSubmitInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupSubmitInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDeviceGroupSubmitInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `waitSemaphoreCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int waitSemaphoreCountAt(long index) { return VkDeviceGroupSubmitInfo.get_waitSemaphoreCount(this.segment(), index); }
        /// Sets `waitSemaphoreCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer waitSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_waitSemaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pWaitSemaphoreDeviceIndices` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pWaitSemaphoreDeviceIndicesAt(long index) { return VkDeviceGroupSubmitInfo.get_pWaitSemaphoreDeviceIndices(this.segment(), index); }
        /// Sets `pWaitSemaphoreDeviceIndices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pWaitSemaphoreDeviceIndicesAt(long index, @CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pWaitSemaphoreDeviceIndices(this.segment(), index, value); return this; }

        /// {@return `commandBufferCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int commandBufferCountAt(long index) { return VkDeviceGroupSubmitInfo.get_commandBufferCount(this.segment(), index); }
        /// Sets `commandBufferCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_commandBufferCount(this.segment(), index, value); return this; }

        /// {@return `pCommandBufferDeviceMasks` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pCommandBufferDeviceMasksAt(long index) { return VkDeviceGroupSubmitInfo.get_pCommandBufferDeviceMasks(this.segment(), index); }
        /// Sets `pCommandBufferDeviceMasks` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCommandBufferDeviceMasksAt(long index, @CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pCommandBufferDeviceMasks(this.segment(), index, value); return this; }

        /// {@return `signalSemaphoreCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int signalSemaphoreCountAt(long index) { return VkDeviceGroupSubmitInfo.get_signalSemaphoreCount(this.segment(), index); }
        /// Sets `signalSemaphoreCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer signalSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupSubmitInfo.set_signalSemaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pSignalSemaphoreDeviceIndices` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pSignalSemaphoreDeviceIndicesAt(long index) { return VkDeviceGroupSubmitInfo.get_pSignalSemaphoreDeviceIndices(this.segment(), index); }
        /// Sets `pSignalSemaphoreDeviceIndices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSignalSemaphoreDeviceIndicesAt(long index, @CType("const uint32_t *") MemorySegment value) { VkDeviceGroupSubmitInfo.set_pSignalSemaphoreDeviceIndices(this.segment(), index, value); return this; }

    }
}
