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
/// ### bufferBindCount
/// [VarHandle][#VH_bufferBindCount] - [Getter][#bufferBindCount()] - [Setter][#bufferBindCount(int)]
/// ### pBufferBinds
/// [VarHandle][#VH_pBufferBinds] - [Getter][#pBufferBinds()] - [Setter][#pBufferBinds(java.lang.foreign.MemorySegment)]
/// ### imageOpaqueBindCount
/// [VarHandle][#VH_imageOpaqueBindCount] - [Getter][#imageOpaqueBindCount()] - [Setter][#imageOpaqueBindCount(int)]
/// ### pImageOpaqueBinds
/// [VarHandle][#VH_pImageOpaqueBinds] - [Getter][#pImageOpaqueBinds()] - [Setter][#pImageOpaqueBinds(java.lang.foreign.MemorySegment)]
/// ### imageBindCount
/// [VarHandle][#VH_imageBindCount] - [Getter][#imageBindCount()] - [Setter][#imageBindCount(int)]
/// ### pImageBinds
/// [VarHandle][#VH_pImageBinds] - [Getter][#pImageBinds()] - [Setter][#pImageBinds(java.lang.foreign.MemorySegment)]
/// ### signalSemaphoreCount
/// [VarHandle][#VH_signalSemaphoreCount] - [Getter][#signalSemaphoreCount()] - [Setter][#signalSemaphoreCount(int)]
/// ### pSignalSemaphores
/// [VarHandle][#VH_pSignalSemaphores] - [Getter][#pSignalSemaphores()] - [Setter][#pSignalSemaphores(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindSparseInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore * pWaitSemaphores;
///     uint32_t bufferBindCount;
///     const VkSparseBufferMemoryBindInfo * pBufferBinds;
///     uint32_t imageOpaqueBindCount;
///     const VkSparseImageOpaqueMemoryBindInfo * pImageOpaqueBinds;
///     uint32_t imageBindCount;
///     const VkSparseImageMemoryBindInfo * pImageBinds;
///     uint32_t signalSemaphoreCount;
///     const VkSemaphore * pSignalSemaphores;
/// } VkBindSparseInfo;
/// ```
public sealed class VkBindSparseInfo extends Struct {
    /// The struct layout of `VkBindSparseInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("bufferBindCount"),
        ValueLayout.ADDRESS.withName("pBufferBinds"),
        ValueLayout.JAVA_INT.withName("imageOpaqueBindCount"),
        ValueLayout.ADDRESS.withName("pImageOpaqueBinds"),
        ValueLayout.JAVA_INT.withName("imageBindCount"),
        ValueLayout.ADDRESS.withName("pImageBinds"),
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
    /// The [VarHandle] of `bufferBindCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferBindCount"));
    /// The [VarHandle] of `pBufferBinds` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBufferBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferBinds"));
    /// The [VarHandle] of `imageOpaqueBindCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageOpaqueBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageOpaqueBindCount"));
    /// The [VarHandle] of `pImageOpaqueBinds` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pImageOpaqueBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageOpaqueBinds"));
    /// The [VarHandle] of `imageBindCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageBindCount"));
    /// The [VarHandle] of `pImageBinds` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pImageBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageBinds"));
    /// The [VarHandle] of `signalSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    /// The [VarHandle] of `pSignalSemaphores` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSignalSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphores"));

    /// Creates `VkBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    public VkBindSparseInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindSparseInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindSparseInfo(segment); }

    /// Creates `VkBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindSparseInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindSparseInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindSparseInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindSparseInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo alloc(SegmentAllocator allocator) { return new VkBindSparseInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindSparseInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int waitSemaphoreCount, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphores, @CType("uint32_t") int bufferBindCount, @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment pBufferBinds, @CType("uint32_t") int imageOpaqueBindCount, @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment pImageOpaqueBinds, @CType("uint32_t") int imageBindCount, @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment pImageBinds, @CType("uint32_t") int signalSemaphoreCount, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSignalSemaphores) { return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount).pImageOpaqueBinds(pImageOpaqueBinds).imageBindCount(imageBindCount).pImageBinds(pImageBinds).signalSemaphoreCount(signalSemaphoreCount).pSignalSemaphores(pSignalSemaphores); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindSparseInfo copyFrom(VkBindSparseInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindSparseInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindSparseInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindSparseInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo sType(@CType("VkStructureType") int value) { VkBindSparseInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBindSparseInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBindSparseInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment) { return VkBindSparseInfo.get_waitSemaphoreCount(segment, 0L); }
    /// {@return `waitSemaphoreCount`}
    public @CType("uint32_t") int waitSemaphoreCount() { return VkBindSparseInfo.get_waitSemaphoreCount(this.segment()); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindSparseInfo.set_waitSemaphoreCount(segment, 0L, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo waitSemaphoreCount(@CType("uint32_t") int value) { VkBindSparseInfo.set_waitSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pWaitSemaphores(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWaitSemaphores.get(segment, 0L, index); }
    /// {@return `pWaitSemaphores`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pWaitSemaphores(MemorySegment segment) { return VkBindSparseInfo.get_pWaitSemaphores(segment, 0L); }
    /// {@return `pWaitSemaphores`}
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphores() { return VkBindSparseInfo.get_pWaitSemaphores(this.segment()); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphores(MemorySegment segment, long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VH_pWaitSemaphores.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphores(MemorySegment segment, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pWaitSemaphores(segment, 0L, value); }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pWaitSemaphores(@CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pWaitSemaphores(this.segment(), value); return this; }

    /// {@return `bufferBindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferBindCount(MemorySegment segment, long index) { return (int) VH_bufferBindCount.get(segment, 0L, index); }
    /// {@return `bufferBindCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferBindCount(MemorySegment segment) { return VkBindSparseInfo.get_bufferBindCount(segment, 0L); }
    /// {@return `bufferBindCount`}
    public @CType("uint32_t") int bufferBindCount() { return VkBindSparseInfo.get_bufferBindCount(this.segment()); }
    /// Sets `bufferBindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferBindCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferBindCount.set(segment, 0L, index, value); }
    /// Sets `bufferBindCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferBindCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindSparseInfo.set_bufferBindCount(segment, 0L, value); }
    /// Sets `bufferBindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo bufferBindCount(@CType("uint32_t") int value) { VkBindSparseInfo.set_bufferBindCount(this.segment(), value); return this; }

    /// {@return `pBufferBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment get_pBufferBinds(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBufferBinds.get(segment, 0L, index); }
    /// {@return `pBufferBinds`}
    /// @param segment the segment of the struct
    public static @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment get_pBufferBinds(MemorySegment segment) { return VkBindSparseInfo.get_pBufferBinds(segment, 0L); }
    /// {@return `pBufferBinds`}
    public @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment pBufferBinds() { return VkBindSparseInfo.get_pBufferBinds(this.segment()); }
    /// Sets `pBufferBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBufferBinds(MemorySegment segment, long index, @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VH_pBufferBinds.set(segment, 0L, index, value); }
    /// Sets `pBufferBinds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBufferBinds(MemorySegment segment, @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pBufferBinds(segment, 0L, value); }
    /// Sets `pBufferBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pBufferBinds(@CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pBufferBinds(this.segment(), value); return this; }

    /// {@return `imageOpaqueBindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageOpaqueBindCount(MemorySegment segment, long index) { return (int) VH_imageOpaqueBindCount.get(segment, 0L, index); }
    /// {@return `imageOpaqueBindCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageOpaqueBindCount(MemorySegment segment) { return VkBindSparseInfo.get_imageOpaqueBindCount(segment, 0L); }
    /// {@return `imageOpaqueBindCount`}
    public @CType("uint32_t") int imageOpaqueBindCount() { return VkBindSparseInfo.get_imageOpaqueBindCount(this.segment()); }
    /// Sets `imageOpaqueBindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageOpaqueBindCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageOpaqueBindCount.set(segment, 0L, index, value); }
    /// Sets `imageOpaqueBindCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageOpaqueBindCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindSparseInfo.set_imageOpaqueBindCount(segment, 0L, value); }
    /// Sets `imageOpaqueBindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo imageOpaqueBindCount(@CType("uint32_t") int value) { VkBindSparseInfo.set_imageOpaqueBindCount(this.segment(), value); return this; }

    /// {@return `pImageOpaqueBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment get_pImageOpaqueBinds(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pImageOpaqueBinds.get(segment, 0L, index); }
    /// {@return `pImageOpaqueBinds`}
    /// @param segment the segment of the struct
    public static @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment get_pImageOpaqueBinds(MemorySegment segment) { return VkBindSparseInfo.get_pImageOpaqueBinds(segment, 0L); }
    /// {@return `pImageOpaqueBinds`}
    public @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment pImageOpaqueBinds() { return VkBindSparseInfo.get_pImageOpaqueBinds(this.segment()); }
    /// Sets `pImageOpaqueBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageOpaqueBinds(MemorySegment segment, long index, @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VH_pImageOpaqueBinds.set(segment, 0L, index, value); }
    /// Sets `pImageOpaqueBinds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageOpaqueBinds(MemorySegment segment, @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pImageOpaqueBinds(segment, 0L, value); }
    /// Sets `pImageOpaqueBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pImageOpaqueBinds(@CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pImageOpaqueBinds(this.segment(), value); return this; }

    /// {@return `imageBindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageBindCount(MemorySegment segment, long index) { return (int) VH_imageBindCount.get(segment, 0L, index); }
    /// {@return `imageBindCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageBindCount(MemorySegment segment) { return VkBindSparseInfo.get_imageBindCount(segment, 0L); }
    /// {@return `imageBindCount`}
    public @CType("uint32_t") int imageBindCount() { return VkBindSparseInfo.get_imageBindCount(this.segment()); }
    /// Sets `imageBindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageBindCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageBindCount.set(segment, 0L, index, value); }
    /// Sets `imageBindCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageBindCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindSparseInfo.set_imageBindCount(segment, 0L, value); }
    /// Sets `imageBindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo imageBindCount(@CType("uint32_t") int value) { VkBindSparseInfo.set_imageBindCount(this.segment(), value); return this; }

    /// {@return `pImageBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment get_pImageBinds(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pImageBinds.get(segment, 0L, index); }
    /// {@return `pImageBinds`}
    /// @param segment the segment of the struct
    public static @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment get_pImageBinds(MemorySegment segment) { return VkBindSparseInfo.get_pImageBinds(segment, 0L); }
    /// {@return `pImageBinds`}
    public @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment pImageBinds() { return VkBindSparseInfo.get_pImageBinds(this.segment()); }
    /// Sets `pImageBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageBinds(MemorySegment segment, long index, @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VH_pImageBinds.set(segment, 0L, index, value); }
    /// Sets `pImageBinds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageBinds(MemorySegment segment, @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pImageBinds(segment, 0L, value); }
    /// Sets `pImageBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pImageBinds(@CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pImageBinds(this.segment(), value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_signalSemaphoreCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_signalSemaphoreCount(MemorySegment segment) { return VkBindSparseInfo.get_signalSemaphoreCount(segment, 0L); }
    /// {@return `signalSemaphoreCount`}
    public @CType("uint32_t") int signalSemaphoreCount() { return VkBindSparseInfo.get_signalSemaphoreCount(this.segment()); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_signalSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindSparseInfo.set_signalSemaphoreCount(segment, 0L, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo signalSemaphoreCount(@CType("uint32_t") int value) { VkBindSparseInfo.set_signalSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pSignalSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pSignalSemaphores(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSignalSemaphores.get(segment, 0L, index); }
    /// {@return `pSignalSemaphores`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pSignalSemaphores(MemorySegment segment) { return VkBindSparseInfo.get_pSignalSemaphores(segment, 0L); }
    /// {@return `pSignalSemaphores`}
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSignalSemaphores() { return VkBindSparseInfo.get_pSignalSemaphores(this.segment()); }
    /// Sets `pSignalSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSignalSemaphores(MemorySegment segment, long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VH_pSignalSemaphores.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphores` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSignalSemaphores(MemorySegment segment, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pSignalSemaphores(segment, 0L, value); }
    /// Sets `pSignalSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pSignalSemaphores(@CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pSignalSemaphores(this.segment(), value); return this; }

    /// A buffer of [VkBindSparseInfo].
    public static final class Buffer extends VkBindSparseInfo {
        private final long elementCount;

        /// Creates `VkBindSparseInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindSparseInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindSparseInfo`
        public VkBindSparseInfo asSlice(long index) { return new VkBindSparseInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindSparseInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindSparseInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBindSparseInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBindSparseInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBindSparseInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `waitSemaphoreCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int waitSemaphoreCountAt(long index) { return VkBindSparseInfo.get_waitSemaphoreCount(this.segment(), index); }
        /// Sets `waitSemaphoreCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer waitSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkBindSparseInfo.set_waitSemaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pWaitSemaphores` at the given index}
        /// @param index the index
        public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphoresAt(long index) { return VkBindSparseInfo.get_pWaitSemaphores(this.segment(), index); }
        /// Sets `pWaitSemaphores` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pWaitSemaphoresAt(long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pWaitSemaphores(this.segment(), index, value); return this; }

        /// {@return `bufferBindCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bufferBindCountAt(long index) { return VkBindSparseInfo.get_bufferBindCount(this.segment(), index); }
        /// Sets `bufferBindCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferBindCountAt(long index, @CType("uint32_t") int value) { VkBindSparseInfo.set_bufferBindCount(this.segment(), index, value); return this; }

        /// {@return `pBufferBinds` at the given index}
        /// @param index the index
        public @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment pBufferBindsAt(long index) { return VkBindSparseInfo.get_pBufferBinds(this.segment(), index); }
        /// Sets `pBufferBinds` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pBufferBindsAt(long index, @CType("const VkSparseBufferMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pBufferBinds(this.segment(), index, value); return this; }

        /// {@return `imageOpaqueBindCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int imageOpaqueBindCountAt(long index) { return VkBindSparseInfo.get_imageOpaqueBindCount(this.segment(), index); }
        /// Sets `imageOpaqueBindCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageOpaqueBindCountAt(long index, @CType("uint32_t") int value) { VkBindSparseInfo.set_imageOpaqueBindCount(this.segment(), index, value); return this; }

        /// {@return `pImageOpaqueBinds` at the given index}
        /// @param index the index
        public @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment pImageOpaqueBindsAt(long index) { return VkBindSparseInfo.get_pImageOpaqueBinds(this.segment(), index); }
        /// Sets `pImageOpaqueBinds` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImageOpaqueBindsAt(long index, @CType("const VkSparseImageOpaqueMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pImageOpaqueBinds(this.segment(), index, value); return this; }

        /// {@return `imageBindCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int imageBindCountAt(long index) { return VkBindSparseInfo.get_imageBindCount(this.segment(), index); }
        /// Sets `imageBindCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageBindCountAt(long index, @CType("uint32_t") int value) { VkBindSparseInfo.set_imageBindCount(this.segment(), index, value); return this; }

        /// {@return `pImageBinds` at the given index}
        /// @param index the index
        public @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment pImageBindsAt(long index) { return VkBindSparseInfo.get_pImageBinds(this.segment(), index); }
        /// Sets `pImageBinds` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImageBindsAt(long index, @CType("const VkSparseImageMemoryBindInfo *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pImageBinds(this.segment(), index, value); return this; }

        /// {@return `signalSemaphoreCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int signalSemaphoreCountAt(long index) { return VkBindSparseInfo.get_signalSemaphoreCount(this.segment(), index); }
        /// Sets `signalSemaphoreCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer signalSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkBindSparseInfo.set_signalSemaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pSignalSemaphores` at the given index}
        /// @param index the index
        public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSignalSemaphoresAt(long index) { return VkBindSparseInfo.get_pSignalSemaphores(this.segment(), index); }
        /// Sets `pSignalSemaphores` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSignalSemaphoresAt(long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkBindSparseInfo.set_pSignalSemaphores(this.segment(), index, value); return this; }

    }
}
