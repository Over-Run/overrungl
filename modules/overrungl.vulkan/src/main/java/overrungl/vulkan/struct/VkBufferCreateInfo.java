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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ### sharingMode
/// [VarHandle][#VH_sharingMode] - [Getter][#sharingMode()] - [Setter][#sharingMode(int)]
/// ### queueFamilyIndexCount
/// [VarHandle][#VH_queueFamilyIndexCount] - [Getter][#queueFamilyIndexCount()] - [Setter][#queueFamilyIndexCount(int)]
/// ### pQueueFamilyIndices
/// [VarHandle][#VH_pQueueFamilyIndices] - [Getter][#pQueueFamilyIndices()] - [Setter][#pQueueFamilyIndices(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkBufferCreateFlags flags;
///     VkDeviceSize size;
///     VkBufferUsageFlags usage;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t * pQueueFamilyIndices;
/// } VkBufferCreateInfo;
/// ```
public sealed class VkBufferCreateInfo extends Struct {
    /// The struct layout of `VkBufferCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The [VarHandle] of `sharingMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));

    /// Creates `VkBufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkBufferCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCreateInfo(segment); }

    /// Creates `VkBufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCreateInfo`
    public static VkBufferCreateInfo alloc(SegmentAllocator allocator) { return new VkBufferCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCreateInfo`
    public static VkBufferCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBufferCreateFlags") int flags, @CType("VkDeviceSize") long size, @CType("VkBufferUsageFlags") int usage, @CType("VkSharingMode") int sharingMode, @CType("uint32_t") int queueFamilyIndexCount, @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndices) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).size(size).usage(usage).sharingMode(sharingMode).queueFamilyIndexCount(queueFamilyIndexCount).pQueueFamilyIndices(pQueueFamilyIndices); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCreateInfo copyFrom(VkBufferCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo sType(@CType("VkStructureType") int value) { VkBufferCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBufferCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBufferCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferCreateFlags") int get_flags(MemorySegment segment) { return VkBufferCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkBufferCreateFlags") int flags() { return VkBufferCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkBufferCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkBufferCreateFlags") int value) { VkBufferCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo flags(@CType("VkBufferCreateFlags") int value) { VkBufferCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkBufferCreateInfo.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkBufferCreateInfo.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCreateInfo.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo size(@CType("VkDeviceSize") long value) { VkBufferCreateInfo.set_size(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferUsageFlags") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferUsageFlags") int get_usage(MemorySegment segment) { return VkBufferCreateInfo.get_usage(segment, 0L); }
    /// {@return `usage`}
    public @CType("VkBufferUsageFlags") int usage() { return VkBufferCreateInfo.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkBufferUsageFlags") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkBufferUsageFlags") int value) { VkBufferCreateInfo.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo usage(@CType("VkBufferUsageFlags") int value) { VkBufferCreateInfo.set_usage(this.segment(), value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSharingMode") int get_sharingMode(MemorySegment segment, long index) { return (int) VH_sharingMode.get(segment, 0L, index); }
    /// {@return `sharingMode`}
    /// @param segment the segment of the struct
    public static @CType("VkSharingMode") int get_sharingMode(MemorySegment segment) { return VkBufferCreateInfo.get_sharingMode(segment, 0L); }
    /// {@return `sharingMode`}
    public @CType("VkSharingMode") int sharingMode() { return VkBufferCreateInfo.get_sharingMode(this.segment()); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sharingMode(MemorySegment segment, long index, @CType("VkSharingMode") int value) { VH_sharingMode.set(segment, 0L, index, value); }
    /// Sets `sharingMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sharingMode(MemorySegment segment, @CType("VkSharingMode") int value) { VkBufferCreateInfo.set_sharingMode(segment, 0L, value); }
    /// Sets `sharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo sharingMode(@CType("VkSharingMode") int value) { VkBufferCreateInfo.set_sharingMode(this.segment(), value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment) { return VkBufferCreateInfo.get_queueFamilyIndexCount(segment, 0L); }
    /// {@return `queueFamilyIndexCount`}
    public @CType("uint32_t") int queueFamilyIndexCount() { return VkBufferCreateInfo.get_queueFamilyIndexCount(this.segment()); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCreateInfo.set_queueFamilyIndexCount(segment, 0L, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo queueFamilyIndexCount(@CType("uint32_t") int value) { VkBufferCreateInfo.set_queueFamilyIndexCount(this.segment(), value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment) { return VkBufferCreateInfo.get_pQueueFamilyIndices(segment, 0L); }
    /// {@return `pQueueFamilyIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndices() { return VkBufferCreateInfo.get_pQueueFamilyIndices(this.segment()); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBufferCreateInfo.set_pQueueFamilyIndices(segment, 0L, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCreateInfo pQueueFamilyIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBufferCreateInfo.set_pQueueFamilyIndices(this.segment(), value); return this; }

    /// A buffer of [VkBufferCreateInfo].
    public static final class Buffer extends VkBufferCreateInfo {
        private final long elementCount;

        /// Creates `VkBufferCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferCreateInfo`
        public VkBufferCreateInfo asSlice(long index) { return new VkBufferCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBufferCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkBufferCreateFlags") int flagsAt(long index) { return VkBufferCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkBufferCreateFlags") int value) { VkBufferCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkBufferCreateInfo.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkBufferCreateInfo.set_size(this.segment(), index, value); return this; }

        /// {@return `usage` at the given index}
        /// @param index the index
        public @CType("VkBufferUsageFlags") int usageAt(long index) { return VkBufferCreateInfo.get_usage(this.segment(), index); }
        /// Sets `usage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer usageAt(long index, @CType("VkBufferUsageFlags") int value) { VkBufferCreateInfo.set_usage(this.segment(), index, value); return this; }

        /// {@return `sharingMode` at the given index}
        /// @param index the index
        public @CType("VkSharingMode") int sharingModeAt(long index) { return VkBufferCreateInfo.get_sharingMode(this.segment(), index); }
        /// Sets `sharingMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sharingModeAt(long index, @CType("VkSharingMode") int value) { VkBufferCreateInfo.set_sharingMode(this.segment(), index, value); return this; }

        /// {@return `queueFamilyIndexCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int queueFamilyIndexCountAt(long index) { return VkBufferCreateInfo.get_queueFamilyIndexCount(this.segment(), index); }
        /// Sets `queueFamilyIndexCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueFamilyIndexCountAt(long index, @CType("uint32_t") int value) { VkBufferCreateInfo.set_queueFamilyIndexCount(this.segment(), index, value); return this; }

        /// {@return `pQueueFamilyIndices` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndicesAt(long index) { return VkBufferCreateInfo.get_pQueueFamilyIndices(this.segment(), index); }
        /// Sets `pQueueFamilyIndices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pQueueFamilyIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBufferCreateInfo.set_pQueueFamilyIndices(this.segment(), index, value); return this; }

    }
}
