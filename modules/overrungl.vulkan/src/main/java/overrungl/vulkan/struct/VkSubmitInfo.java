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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### waitSemaphoreCount
/// [VarHandle][#VH_waitSemaphoreCount] - [Getter][#waitSemaphoreCount()] - [Setter][#waitSemaphoreCount(int)]
/// ### pWaitSemaphores
/// [VarHandle][#VH_pWaitSemaphores] - [Getter][#pWaitSemaphores()] - [Setter][#pWaitSemaphores(java.lang.foreign.MemorySegment)]
/// ### pWaitDstStageMask
/// [VarHandle][#VH_pWaitDstStageMask] - [Getter][#pWaitDstStageMask()] - [Setter][#pWaitDstStageMask(java.lang.foreign.MemorySegment)]
/// ### commandBufferCount
/// [VarHandle][#VH_commandBufferCount] - [Getter][#commandBufferCount()] - [Setter][#commandBufferCount(int)]
/// ### pCommandBuffers
/// [VarHandle][#VH_pCommandBuffers] - [Getter][#pCommandBuffers()] - [Setter][#pCommandBuffers(java.lang.foreign.MemorySegment)]
/// ### signalSemaphoreCount
/// [VarHandle][#VH_signalSemaphoreCount] - [Getter][#signalSemaphoreCount()] - [Setter][#signalSemaphoreCount(int)]
/// ### pSignalSemaphores
/// [VarHandle][#VH_pSignalSemaphores] - [Getter][#pSignalSemaphores()] - [Setter][#pSignalSemaphores(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore * pWaitSemaphores;
///     const VkPipelineStageFlags * pWaitDstStageMask;
///     uint32_t commandBufferCount;
///     const VkCommandBuffer * pCommandBuffers;
///     uint32_t signalSemaphoreCount;
///     const VkSemaphore * pSignalSemaphores;
/// } VkSubmitInfo;
/// ```
public final class VkSubmitInfo extends Struct {
    /// The struct layout of `VkSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.ADDRESS.withName("pWaitDstStageMask"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withName("pCommandBuffers"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphores")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `waitSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    /// The [VarHandle] of `pWaitSemaphores` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWaitSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphores"));
    /// The [VarHandle] of `pWaitDstStageMask` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWaitDstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitDstStageMask"));
    /// The [VarHandle] of `commandBufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));
    /// The [VarHandle] of `pCommandBuffers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBuffers"));
    /// The [VarHandle] of `signalSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    /// The [VarHandle] of `pSignalSemaphores` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSignalSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphores"));

    /// Creates `VkSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubmitInfo(segment); }

    /// Creates `VkSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo alloc(SegmentAllocator allocator) { return new VkSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkSubmitInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubmitInfo`
    public VkSubmitInfo asSlice(long index) { return new VkSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubmitInfo`
    public VkSubmitInfo asSlice(long index, long count) { return new VkSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSubmitInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkSubmitInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo sType(@CType("VkStructureType") int value) { VkSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSubmitInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment) { return VkSubmitInfo.get_waitSemaphoreCount(segment, 0L); }
    /// {@return `waitSemaphoreCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int waitSemaphoreCountAt(long index) { return VkSubmitInfo.get_waitSemaphoreCount(this.segment(), index); }
    /// {@return `waitSemaphoreCount`}
    public @CType("uint32_t") int waitSemaphoreCount() { return VkSubmitInfo.get_waitSemaphoreCount(this.segment()); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubmitInfo.set_waitSemaphoreCount(segment, 0L, value); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo waitSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkSubmitInfo.set_waitSemaphoreCount(this.segment(), index, value); return this; }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo waitSemaphoreCount(@CType("uint32_t") int value) { VkSubmitInfo.set_waitSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pWaitSemaphores(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWaitSemaphores.get(segment, 0L, index); }
    /// {@return `pWaitSemaphores`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pWaitSemaphores(MemorySegment segment) { return VkSubmitInfo.get_pWaitSemaphores(segment, 0L); }
    /// {@return `pWaitSemaphores` at the given index}
    /// @param index the index
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphoresAt(long index) { return VkSubmitInfo.get_pWaitSemaphores(this.segment(), index); }
    /// {@return `pWaitSemaphores`}
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphores() { return VkSubmitInfo.get_pWaitSemaphores(this.segment()); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphores(MemorySegment segment, long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VH_pWaitSemaphores.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphores(MemorySegment segment, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pWaitSemaphores(segment, 0L, value); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitSemaphoresAt(long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pWaitSemaphores(this.segment(), index, value); return this; }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitSemaphores(@CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pWaitSemaphores(this.segment(), value); return this; }

    /// {@return `pWaitDstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment get_pWaitDstStageMask(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWaitDstStageMask.get(segment, 0L, index); }
    /// {@return `pWaitDstStageMask`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment get_pWaitDstStageMask(MemorySegment segment) { return VkSubmitInfo.get_pWaitDstStageMask(segment, 0L); }
    /// {@return `pWaitDstStageMask` at the given index}
    /// @param index the index
    public @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment pWaitDstStageMaskAt(long index) { return VkSubmitInfo.get_pWaitDstStageMask(this.segment(), index); }
    /// {@return `pWaitDstStageMask`}
    public @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment pWaitDstStageMask() { return VkSubmitInfo.get_pWaitDstStageMask(this.segment()); }
    /// Sets `pWaitDstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitDstStageMask(MemorySegment segment, long index, @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment value) { VH_pWaitDstStageMask.set(segment, 0L, index, value); }
    /// Sets `pWaitDstStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitDstStageMask(MemorySegment segment, @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pWaitDstStageMask(segment, 0L, value); }
    /// Sets `pWaitDstStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitDstStageMaskAt(long index, @CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pWaitDstStageMask(this.segment(), index, value); return this; }
    /// Sets `pWaitDstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitDstStageMask(@CType("const VkPipelineStageFlags *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pWaitDstStageMask(this.segment(), value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandBufferCount(MemorySegment segment, long index) { return (int) VH_commandBufferCount.get(segment, 0L, index); }
    /// {@return `commandBufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandBufferCount(MemorySegment segment) { return VkSubmitInfo.get_commandBufferCount(segment, 0L); }
    /// {@return `commandBufferCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int commandBufferCountAt(long index) { return VkSubmitInfo.get_commandBufferCount(this.segment(), index); }
    /// {@return `commandBufferCount`}
    public @CType("uint32_t") int commandBufferCount() { return VkSubmitInfo.get_commandBufferCount(this.segment()); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandBufferCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubmitInfo.set_commandBufferCount(segment, 0L, value); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo commandBufferCountAt(long index, @CType("uint32_t") int value) { VkSubmitInfo.set_commandBufferCount(this.segment(), index, value); return this; }
    /// Sets `commandBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo commandBufferCount(@CType("uint32_t") int value) { VkSubmitInfo.set_commandBufferCount(this.segment(), value); return this; }

    /// {@return `pCommandBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment get_pCommandBuffers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCommandBuffers.get(segment, 0L, index); }
    /// {@return `pCommandBuffers`}
    /// @param segment the segment of the struct
    public static @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment get_pCommandBuffers(MemorySegment segment) { return VkSubmitInfo.get_pCommandBuffers(segment, 0L); }
    /// {@return `pCommandBuffers` at the given index}
    /// @param index the index
    public @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment pCommandBuffersAt(long index) { return VkSubmitInfo.get_pCommandBuffers(this.segment(), index); }
    /// {@return `pCommandBuffers`}
    public @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment pCommandBuffers() { return VkSubmitInfo.get_pCommandBuffers(this.segment()); }
    /// Sets `pCommandBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCommandBuffers(MemorySegment segment, long index, @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment value) { VH_pCommandBuffers.set(segment, 0L, index, value); }
    /// Sets `pCommandBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCommandBuffers(MemorySegment segment, @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pCommandBuffers(segment, 0L, value); }
    /// Sets `pCommandBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pCommandBuffersAt(long index, @CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pCommandBuffers(this.segment(), index, value); return this; }
    /// Sets `pCommandBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pCommandBuffers(@CType("const VkCommandBuffer *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pCommandBuffers(this.segment(), value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_signalSemaphoreCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_signalSemaphoreCount(MemorySegment segment) { return VkSubmitInfo.get_signalSemaphoreCount(segment, 0L); }
    /// {@return `signalSemaphoreCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int signalSemaphoreCountAt(long index) { return VkSubmitInfo.get_signalSemaphoreCount(this.segment(), index); }
    /// {@return `signalSemaphoreCount`}
    public @CType("uint32_t") int signalSemaphoreCount() { return VkSubmitInfo.get_signalSemaphoreCount(this.segment()); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_signalSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubmitInfo.set_signalSemaphoreCount(segment, 0L, value); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo signalSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkSubmitInfo.set_signalSemaphoreCount(this.segment(), index, value); return this; }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo signalSemaphoreCount(@CType("uint32_t") int value) { VkSubmitInfo.set_signalSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pSignalSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pSignalSemaphores(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSignalSemaphores.get(segment, 0L, index); }
    /// {@return `pSignalSemaphores`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pSignalSemaphores(MemorySegment segment) { return VkSubmitInfo.get_pSignalSemaphores(segment, 0L); }
    /// {@return `pSignalSemaphores` at the given index}
    /// @param index the index
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSignalSemaphoresAt(long index) { return VkSubmitInfo.get_pSignalSemaphores(this.segment(), index); }
    /// {@return `pSignalSemaphores`}
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSignalSemaphores() { return VkSubmitInfo.get_pSignalSemaphores(this.segment()); }
    /// Sets `pSignalSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSignalSemaphores(MemorySegment segment, long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VH_pSignalSemaphores.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphores` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSignalSemaphores(MemorySegment segment, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pSignalSemaphores(segment, 0L, value); }
    /// Sets `pSignalSemaphores` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pSignalSemaphoresAt(long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pSignalSemaphores(this.segment(), index, value); return this; }
    /// Sets `pSignalSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pSignalSemaphores(@CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSubmitInfo.set_pSignalSemaphores(this.segment(), value); return this; }

}
