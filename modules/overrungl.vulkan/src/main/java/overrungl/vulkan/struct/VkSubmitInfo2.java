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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### waitSemaphoreInfoCount
/// [VarHandle][#VH_waitSemaphoreInfoCount] - [Getter][#waitSemaphoreInfoCount()] - [Setter][#waitSemaphoreInfoCount(int)]
/// ### pWaitSemaphoreInfos
/// [VarHandle][#VH_pWaitSemaphoreInfos] - [Getter][#pWaitSemaphoreInfos()] - [Setter][#pWaitSemaphoreInfos(MemorySegment)]
/// ### commandBufferInfoCount
/// [VarHandle][#VH_commandBufferInfoCount] - [Getter][#commandBufferInfoCount()] - [Setter][#commandBufferInfoCount(int)]
/// ### pCommandBufferInfos
/// [VarHandle][#VH_pCommandBufferInfos] - [Getter][#pCommandBufferInfos()] - [Setter][#pCommandBufferInfos(MemorySegment)]
/// ### signalSemaphoreInfoCount
/// [VarHandle][#VH_signalSemaphoreInfoCount] - [Getter][#signalSemaphoreInfoCount()] - [Setter][#signalSemaphoreInfoCount(int)]
/// ### pSignalSemaphoreInfos
/// [VarHandle][#VH_pSignalSemaphoreInfos] - [Getter][#pSignalSemaphoreInfos()] - [Setter][#pSignalSemaphoreInfos(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubmitInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkSubmitFlags flags;
///     uint32_t waitSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo * pWaitSemaphoreInfos;
///     uint32_t commandBufferInfoCount;
///     const VkCommandBufferSubmitInfo * pCommandBufferInfos;
///     uint32_t signalSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo * pSignalSemaphoreInfos;
/// } VkSubmitInfo2;
/// ```
public sealed class VkSubmitInfo2 extends Struct {
    /// The struct layout of `VkSubmitInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreInfos"),
        ValueLayout.JAVA_INT.withName("commandBufferInfoCount"),
        ValueLayout.ADDRESS.withName("pCommandBufferInfos"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreInfos")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `waitSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_waitSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The [VarHandle] of `pWaitSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The [VarHandle] of `commandBufferInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandBufferInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferInfoCount"));
    /// The [VarHandle] of `pCommandBufferInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCommandBufferInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferInfos"));
    /// The [VarHandle] of `signalSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_signalSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The [VarHandle] of `pSignalSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreInfos"));

    /// Creates `VkSubmitInfo2` with the given segment.
    /// @param segment the memory segment
    public VkSubmitInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubmitInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubmitInfo2(segment); }

    /// Creates `VkSubmitInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubmitInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubmitInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubmitInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubmitInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubmitInfo2`
    public static VkSubmitInfo2 alloc(SegmentAllocator allocator) { return new VkSubmitInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubmitInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubmitInfo2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubmitInfo2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubmitInfo2`
    public static VkSubmitInfo2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSubmitFlags") int flags, @CType("uint32_t") int waitSemaphoreInfoCount, @CType("const VkSemaphoreSubmitInfo *") MemorySegment pWaitSemaphoreInfos, @CType("uint32_t") int commandBufferInfoCount, @CType("const VkCommandBufferSubmitInfo *") MemorySegment pCommandBufferInfos, @CType("uint32_t") int signalSemaphoreInfoCount, @CType("const VkSemaphoreSubmitInfo *") MemorySegment pSignalSemaphoreInfos) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount).pWaitSemaphoreInfos(pWaitSemaphoreInfos).commandBufferInfoCount(commandBufferInfoCount).pCommandBufferInfos(pCommandBufferInfos).signalSemaphoreInfoCount(signalSemaphoreInfoCount).pSignalSemaphoreInfos(pSignalSemaphoreInfos); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubmitInfo2 copyFrom(VkSubmitInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubmitInfo2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubmitInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubmitInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 sType(@CType("VkStructureType") int value) { VkSubmitInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSubmitInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSubmitInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSubmitInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pNext(@CType("const void *") MemorySegment value) { VkSubmitInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubmitFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSubmitFlags") int get_flags(MemorySegment segment) { return VkSubmitInfo2.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkSubmitFlags") int flags() { return VkSubmitInfo2.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSubmitFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSubmitFlags") int value) { VkSubmitInfo2.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 flags(@CType("VkSubmitFlags") int value) { VkSubmitInfo2.set_flags(this.segment(), value); return this; }

    /// {@return `waitSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreInfoCount(MemorySegment segment) { return VkSubmitInfo2.get_waitSemaphoreInfoCount(segment, 0L); }
    /// {@return `waitSemaphoreInfoCount`}
    public @CType("uint32_t") int waitSemaphoreInfoCount() { return VkSubmitInfo2.get_waitSemaphoreInfoCount(this.segment()); }
    /// Sets `waitSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubmitInfo2.set_waitSemaphoreInfoCount(segment, 0L, value); }
    /// Sets `waitSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 waitSemaphoreInfoCount(@CType("uint32_t") int value) { VkSubmitInfo2.set_waitSemaphoreInfoCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphoreSubmitInfo *") MemorySegment get_pWaitSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphoreSubmitInfo *") MemorySegment get_pWaitSemaphoreInfos(MemorySegment segment) { return VkSubmitInfo2.get_pWaitSemaphoreInfos(segment, 0L); }
    /// {@return `pWaitSemaphoreInfos`}
    public @CType("const VkSemaphoreSubmitInfo *") MemorySegment pWaitSemaphoreInfos() { return VkSubmitInfo2.get_pWaitSemaphoreInfos(this.segment()); }
    /// Sets `pWaitSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphoreInfos(MemorySegment segment, long index, @CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VH_pWaitSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphoreInfos(MemorySegment segment, @CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pWaitSemaphoreInfos(segment, 0L, value); }
    /// Sets `pWaitSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pWaitSemaphoreInfos(@CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pWaitSemaphoreInfos(this.segment(), value); return this; }

    /// {@return `commandBufferInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandBufferInfoCount(MemorySegment segment, long index) { return (int) VH_commandBufferInfoCount.get(segment, 0L, index); }
    /// {@return `commandBufferInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandBufferInfoCount(MemorySegment segment) { return VkSubmitInfo2.get_commandBufferInfoCount(segment, 0L); }
    /// {@return `commandBufferInfoCount`}
    public @CType("uint32_t") int commandBufferInfoCount() { return VkSubmitInfo2.get_commandBufferInfoCount(this.segment()); }
    /// Sets `commandBufferInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandBufferInfoCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubmitInfo2.set_commandBufferInfoCount(segment, 0L, value); }
    /// Sets `commandBufferInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 commandBufferInfoCount(@CType("uint32_t") int value) { VkSubmitInfo2.set_commandBufferInfoCount(this.segment(), value); return this; }

    /// {@return `pCommandBufferInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkCommandBufferSubmitInfo *") MemorySegment get_pCommandBufferInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pCommandBufferInfos.get(segment, 0L, index); }
    /// {@return `pCommandBufferInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkCommandBufferSubmitInfo *") MemorySegment get_pCommandBufferInfos(MemorySegment segment) { return VkSubmitInfo2.get_pCommandBufferInfos(segment, 0L); }
    /// {@return `pCommandBufferInfos`}
    public @CType("const VkCommandBufferSubmitInfo *") MemorySegment pCommandBufferInfos() { return VkSubmitInfo2.get_pCommandBufferInfos(this.segment()); }
    /// Sets `pCommandBufferInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCommandBufferInfos(MemorySegment segment, long index, @CType("const VkCommandBufferSubmitInfo *") MemorySegment value) { VH_pCommandBufferInfos.set(segment, 0L, index, value); }
    /// Sets `pCommandBufferInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCommandBufferInfos(MemorySegment segment, @CType("const VkCommandBufferSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pCommandBufferInfos(segment, 0L, value); }
    /// Sets `pCommandBufferInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pCommandBufferInfos(@CType("const VkCommandBufferSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pCommandBufferInfos(this.segment(), value); return this; }

    /// {@return `signalSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_signalSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_signalSemaphoreInfoCount(MemorySegment segment) { return VkSubmitInfo2.get_signalSemaphoreInfoCount(segment, 0L); }
    /// {@return `signalSemaphoreInfoCount`}
    public @CType("uint32_t") int signalSemaphoreInfoCount() { return VkSubmitInfo2.get_signalSemaphoreInfoCount(this.segment()); }
    /// Sets `signalSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphoreInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_signalSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphoreInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubmitInfo2.set_signalSemaphoreInfoCount(segment, 0L, value); }
    /// Sets `signalSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 signalSemaphoreInfoCount(@CType("uint32_t") int value) { VkSubmitInfo2.set_signalSemaphoreInfoCount(this.segment(), value); return this; }

    /// {@return `pSignalSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphoreSubmitInfo *") MemorySegment get_pSignalSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphoreSubmitInfo *") MemorySegment get_pSignalSemaphoreInfos(MemorySegment segment) { return VkSubmitInfo2.get_pSignalSemaphoreInfos(segment, 0L); }
    /// {@return `pSignalSemaphoreInfos`}
    public @CType("const VkSemaphoreSubmitInfo *") MemorySegment pSignalSemaphoreInfos() { return VkSubmitInfo2.get_pSignalSemaphoreInfos(this.segment()); }
    /// Sets `pSignalSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSignalSemaphoreInfos(MemorySegment segment, long index, @CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VH_pSignalSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSignalSemaphoreInfos(MemorySegment segment, @CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pSignalSemaphoreInfos(segment, 0L, value); }
    /// Sets `pSignalSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pSignalSemaphoreInfos(@CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pSignalSemaphoreInfos(this.segment(), value); return this; }

    /// A buffer of [VkSubmitInfo2].
    public static final class Buffer extends VkSubmitInfo2 {
        private final long elementCount;

        /// Creates `VkSubmitInfo2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubmitInfo2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubmitInfo2`
        public VkSubmitInfo2 asSlice(long index) { return new VkSubmitInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubmitInfo2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubmitInfo2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSubmitInfo2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSubmitInfo2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSubmitInfo2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSubmitInfo2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkSubmitFlags") int flagsAt(long index) { return VkSubmitInfo2.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkSubmitFlags") int value) { VkSubmitInfo2.set_flags(this.segment(), index, value); return this; }

        /// {@return `waitSemaphoreInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int waitSemaphoreInfoCountAt(long index) { return VkSubmitInfo2.get_waitSemaphoreInfoCount(this.segment(), index); }
        /// Sets `waitSemaphoreInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer waitSemaphoreInfoCountAt(long index, @CType("uint32_t") int value) { VkSubmitInfo2.set_waitSemaphoreInfoCount(this.segment(), index, value); return this; }

        /// {@return `pWaitSemaphoreInfos` at the given index}
        /// @param index the index
        public @CType("const VkSemaphoreSubmitInfo *") MemorySegment pWaitSemaphoreInfosAt(long index) { return VkSubmitInfo2.get_pWaitSemaphoreInfos(this.segment(), index); }
        /// Sets `pWaitSemaphoreInfos` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pWaitSemaphoreInfosAt(long index, @CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pWaitSemaphoreInfos(this.segment(), index, value); return this; }

        /// {@return `commandBufferInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int commandBufferInfoCountAt(long index) { return VkSubmitInfo2.get_commandBufferInfoCount(this.segment(), index); }
        /// Sets `commandBufferInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferInfoCountAt(long index, @CType("uint32_t") int value) { VkSubmitInfo2.set_commandBufferInfoCount(this.segment(), index, value); return this; }

        /// {@return `pCommandBufferInfos` at the given index}
        /// @param index the index
        public @CType("const VkCommandBufferSubmitInfo *") MemorySegment pCommandBufferInfosAt(long index) { return VkSubmitInfo2.get_pCommandBufferInfos(this.segment(), index); }
        /// Sets `pCommandBufferInfos` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCommandBufferInfosAt(long index, @CType("const VkCommandBufferSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pCommandBufferInfos(this.segment(), index, value); return this; }

        /// {@return `signalSemaphoreInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int signalSemaphoreInfoCountAt(long index) { return VkSubmitInfo2.get_signalSemaphoreInfoCount(this.segment(), index); }
        /// Sets `signalSemaphoreInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer signalSemaphoreInfoCountAt(long index, @CType("uint32_t") int value) { VkSubmitInfo2.set_signalSemaphoreInfoCount(this.segment(), index, value); return this; }

        /// {@return `pSignalSemaphoreInfos` at the given index}
        /// @param index the index
        public @CType("const VkSemaphoreSubmitInfo *") MemorySegment pSignalSemaphoreInfosAt(long index) { return VkSubmitInfo2.get_pSignalSemaphoreInfos(this.segment(), index); }
        /// Sets `pSignalSemaphoreInfos` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSignalSemaphoreInfosAt(long index, @CType("const VkSemaphoreSubmitInfo *") MemorySegment value) { VkSubmitInfo2.set_pSignalSemaphoreInfos(this.segment(), index, value); return this; }

    }
}
