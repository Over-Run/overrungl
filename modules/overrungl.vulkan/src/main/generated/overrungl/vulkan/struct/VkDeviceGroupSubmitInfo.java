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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupSubmitInfo`.
/// ## Layout
/// ```
/// struct VkDeviceGroupSubmitInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const uint32_t* pWaitSemaphoreDeviceIndices;
///     uint32_t commandBufferCount;
///     const uint32_t* pCommandBufferDeviceMasks;
///     uint32_t signalSemaphoreCount;
///     const uint32_t* pSignalSemaphoreDeviceIndices;
/// };
/// ```
public final class VkDeviceGroupSubmitInfo extends GroupType {
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `waitSemaphoreCount`.
    public static final long OFFSET_waitSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
    /// The memory layout of `waitSemaphoreCount`.
    public static final MemoryLayout LAYOUT_waitSemaphoreCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreCount"));
    /// The [VarHandle] of `waitSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    /// The byte offset of `pWaitSemaphoreDeviceIndices`.
    public static final long OFFSET_pWaitSemaphoreDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    /// The memory layout of `pWaitSemaphoreDeviceIndices`.
    public static final MemoryLayout LAYOUT_pWaitSemaphoreDeviceIndices = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    /// The [VarHandle] of `pWaitSemaphoreDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    /// The byte offset of `commandBufferCount`.
    public static final long OFFSET_commandBufferCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
    /// The memory layout of `commandBufferCount`.
    public static final MemoryLayout LAYOUT_commandBufferCount = LAYOUT.select(PathElement.groupElement("commandBufferCount"));
    /// The [VarHandle] of `commandBufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));
    /// The byte offset of `pCommandBufferDeviceMasks`.
    public static final long OFFSET_pCommandBufferDeviceMasks = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferDeviceMasks"));
    /// The memory layout of `pCommandBufferDeviceMasks`.
    public static final MemoryLayout LAYOUT_pCommandBufferDeviceMasks = LAYOUT.select(PathElement.groupElement("pCommandBufferDeviceMasks"));
    /// The [VarHandle] of `pCommandBufferDeviceMasks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCommandBufferDeviceMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferDeviceMasks"));
    /// The byte offset of `signalSemaphoreCount`.
    public static final long OFFSET_signalSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
    /// The memory layout of `signalSemaphoreCount`.
    public static final MemoryLayout LAYOUT_signalSemaphoreCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreCount"));
    /// The [VarHandle] of `signalSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    /// The byte offset of `pSignalSemaphoreDeviceIndices`.
    public static final long OFFSET_pSignalSemaphoreDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
    /// The memory layout of `pSignalSemaphoreDeviceIndices`.
    public static final MemoryLayout LAYOUT_pSignalSemaphoreDeviceIndices = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
    /// The [VarHandle] of `pSignalSemaphoreDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceGroupSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceGroupSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceGroupSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupSubmitInfo`
    public static VkDeviceGroupSubmitInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupSubmitInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceGroupSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupSubmitInfo`
    public static VkDeviceGroupSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupSubmitInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupSubmitInfo copyFrom(VkDeviceGroupSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceGroupSubmitInfo reinterpret(long count) { return new VkDeviceGroupSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int waitSemaphoreCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreCount`}
    public int waitSemaphoreCount() { return waitSemaphoreCount(this.segment(), 0L); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void waitSemaphoreCount(MemorySegment segment, long index, int value) { VH_waitSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo waitSemaphoreCount(int value) { waitSemaphoreCount(this.segment(), 0L, value); return this; }

    /// {@return `pWaitSemaphoreDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitSemaphoreDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreDeviceIndices.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreDeviceIndices`}
    public MemorySegment pWaitSemaphoreDeviceIndices() { return pWaitSemaphoreDeviceIndices(this.segment(), 0L); }
    /// Sets `pWaitSemaphoreDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitSemaphoreDeviceIndices(MemorySegment segment, long index, MemorySegment value) { VH_pWaitSemaphoreDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(MemorySegment value) { pWaitSemaphoreDeviceIndices(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferCount(MemorySegment segment, long index) { return (int) VH_commandBufferCount.get(segment, 0L, index); }
    /// {@return `commandBufferCount`}
    public int commandBufferCount() { return commandBufferCount(this.segment(), 0L); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferCount(MemorySegment segment, long index, int value) { VH_commandBufferCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo commandBufferCount(int value) { commandBufferCount(this.segment(), 0L, value); return this; }

    /// {@return `pCommandBufferDeviceMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCommandBufferDeviceMasks(MemorySegment segment, long index) { return (MemorySegment) VH_pCommandBufferDeviceMasks.get(segment, 0L, index); }
    /// {@return `pCommandBufferDeviceMasks`}
    public MemorySegment pCommandBufferDeviceMasks() { return pCommandBufferDeviceMasks(this.segment(), 0L); }
    /// Sets `pCommandBufferDeviceMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCommandBufferDeviceMasks(MemorySegment segment, long index, MemorySegment value) { VH_pCommandBufferDeviceMasks.set(segment, 0L, index, value); }
    /// Sets `pCommandBufferDeviceMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(MemorySegment value) { pCommandBufferDeviceMasks(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int signalSemaphoreCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreCount`}
    public int signalSemaphoreCount() { return signalSemaphoreCount(this.segment(), 0L); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphoreCount(MemorySegment segment, long index, int value) { VH_signalSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo signalSemaphoreCount(int value) { signalSemaphoreCount(this.segment(), 0L, value); return this; }

    /// {@return `pSignalSemaphoreDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSignalSemaphoreDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreDeviceIndices.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreDeviceIndices`}
    public MemorySegment pSignalSemaphoreDeviceIndices() { return pSignalSemaphoreDeviceIndices(this.segment(), 0L); }
    /// Sets `pSignalSemaphoreDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSignalSemaphoreDeviceIndices(MemorySegment segment, long index, MemorySegment value) { VH_pSignalSemaphoreDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndices(MemorySegment value) { pSignalSemaphoreDeviceIndices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceGroupSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceGroupSubmitInfo`
    public VkDeviceGroupSubmitInfo asSlice(long index) { return new VkDeviceGroupSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceGroupSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceGroupSubmitInfo`
    public VkDeviceGroupSubmitInfo asSlice(long index, long count) { return new VkDeviceGroupSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceGroupSubmitInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceGroupSubmitInfo at(long index, Consumer<VkDeviceGroupSubmitInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param index the index of the struct buffer
    public int waitSemaphoreCountAt(long index) { return waitSemaphoreCount(this.segment(), index); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo waitSemaphoreCountAt(long index, int value) { waitSemaphoreCount(this.segment(), index, value); return this; }

    /// {@return `pWaitSemaphoreDeviceIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitSemaphoreDeviceIndicesAt(long index) { return pWaitSemaphoreDeviceIndices(this.segment(), index); }
    /// Sets `pWaitSemaphoreDeviceIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndicesAt(long index, MemorySegment value) { pWaitSemaphoreDeviceIndices(this.segment(), index, value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param index the index of the struct buffer
    public int commandBufferCountAt(long index) { return commandBufferCount(this.segment(), index); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo commandBufferCountAt(long index, int value) { commandBufferCount(this.segment(), index, value); return this; }

    /// {@return `pCommandBufferDeviceMasks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCommandBufferDeviceMasksAt(long index) { return pCommandBufferDeviceMasks(this.segment(), index); }
    /// Sets `pCommandBufferDeviceMasks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasksAt(long index, MemorySegment value) { pCommandBufferDeviceMasks(this.segment(), index, value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param index the index of the struct buffer
    public int signalSemaphoreCountAt(long index) { return signalSemaphoreCount(this.segment(), index); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo signalSemaphoreCountAt(long index, int value) { signalSemaphoreCount(this.segment(), index, value); return this; }

    /// {@return `pSignalSemaphoreDeviceIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSignalSemaphoreDeviceIndicesAt(long index) { return pSignalSemaphoreDeviceIndices(this.segment(), index); }
    /// Sets `pSignalSemaphoreDeviceIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndicesAt(long index, MemorySegment value) { pSignalSemaphoreDeviceIndices(this.segment(), index, value); return this; }

}
