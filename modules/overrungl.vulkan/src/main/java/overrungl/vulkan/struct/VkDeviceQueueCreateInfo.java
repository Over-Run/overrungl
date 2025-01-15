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
/// ### queueFamilyIndex
/// [VarHandle][#VH_queueFamilyIndex] - [Getter][#queueFamilyIndex()] - [Setter][#queueFamilyIndex(int)]
/// ### queueCount
/// [VarHandle][#VH_queueCount] - [Getter][#queueCount()] - [Setter][#queueCount(int)]
/// ### pQueuePriorities
/// [VarHandle][#VH_pQueuePriorities] - [Getter][#pQueuePriorities()] - [Setter][#pQueuePriorities(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceQueueCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceQueueCreateFlags flags;
///     uint32_t queueFamilyIndex;
///     uint32_t queueCount;
///     const float * pQueuePriorities;
/// } VkDeviceQueueCreateInfo;
/// ```
public sealed class VkDeviceQueueCreateInfo extends Struct {
    /// The struct layout of `VkDeviceQueueCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.ADDRESS.withName("pQueuePriorities")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `queueCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCount"));
    /// The [VarHandle] of `pQueuePriorities` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueuePriorities"));

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceQueueCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueCreateInfo(segment); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceQueueCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueCreateInfo`
    public static VkDeviceQueueCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceQueueCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceQueueCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceQueueCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceQueueCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueCreateInfo`
    public static VkDeviceQueueCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceQueueCreateFlags") int flags, @CType("uint32_t") int queueFamilyIndex, @CType("uint32_t") int queueCount, @CType("const float *") java.lang.foreign.MemorySegment pQueuePriorities) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).queueFamilyIndex(queueFamilyIndex).queueCount(queueCount).pQueuePriorities(pQueuePriorities); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceQueueCreateInfo copyFrom(VkDeviceQueueCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceQueueCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceQueueCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceQueueCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo sType(@CType("VkStructureType") int value) { VkDeviceQueueCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceQueueCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceQueueCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceQueueCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceQueueCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceQueueCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceQueueCreateFlags") int get_flags(MemorySegment segment) { return VkDeviceQueueCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDeviceQueueCreateFlags") int flags() { return VkDeviceQueueCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDeviceQueueCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo flags(@CType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment) { return VkDeviceQueueCreateInfo.get_queueFamilyIndex(segment, 0L); }
    /// {@return `queueFamilyIndex`}
    public @CType("uint32_t") int queueFamilyIndex() { return VkDeviceQueueCreateInfo.get_queueFamilyIndex(this.segment()); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceQueueCreateInfo.set_queueFamilyIndex(segment, 0L, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo queueFamilyIndex(@CType("uint32_t") int value) { VkDeviceQueueCreateInfo.set_queueFamilyIndex(this.segment(), value); return this; }

    /// {@return `queueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueCount(MemorySegment segment, long index) { return (int) VH_queueCount.get(segment, 0L, index); }
    /// {@return `queueCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueCount(MemorySegment segment) { return VkDeviceQueueCreateInfo.get_queueCount(segment, 0L); }
    /// {@return `queueCount`}
    public @CType("uint32_t") int queueCount() { return VkDeviceQueueCreateInfo.get_queueCount(this.segment()); }
    /// Sets `queueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueCount.set(segment, 0L, index, value); }
    /// Sets `queueCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceQueueCreateInfo.set_queueCount(segment, 0L, value); }
    /// Sets `queueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo queueCount(@CType("uint32_t") int value) { VkDeviceQueueCreateInfo.set_queueCount(this.segment(), value); return this; }

    /// {@return `pQueuePriorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const float *") java.lang.foreign.MemorySegment get_pQueuePriorities(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueuePriorities.get(segment, 0L, index); }
    /// {@return `pQueuePriorities`}
    /// @param segment the segment of the struct
    public static @CType("const float *") java.lang.foreign.MemorySegment get_pQueuePriorities(MemorySegment segment) { return VkDeviceQueueCreateInfo.get_pQueuePriorities(segment, 0L); }
    /// {@return `pQueuePriorities`}
    public @CType("const float *") java.lang.foreign.MemorySegment pQueuePriorities() { return VkDeviceQueueCreateInfo.get_pQueuePriorities(this.segment()); }
    /// Sets `pQueuePriorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueuePriorities(MemorySegment segment, long index, @CType("const float *") java.lang.foreign.MemorySegment value) { VH_pQueuePriorities.set(segment, 0L, index, value); }
    /// Sets `pQueuePriorities` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueuePriorities(MemorySegment segment, @CType("const float *") java.lang.foreign.MemorySegment value) { VkDeviceQueueCreateInfo.set_pQueuePriorities(segment, 0L, value); }
    /// Sets `pQueuePriorities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo pQueuePriorities(@CType("const float *") java.lang.foreign.MemorySegment value) { VkDeviceQueueCreateInfo.set_pQueuePriorities(this.segment(), value); return this; }

    /// A buffer of [VkDeviceQueueCreateInfo].
    public static final class Buffer extends VkDeviceQueueCreateInfo {
        private final long elementCount;

        /// Creates `VkDeviceQueueCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceQueueCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceQueueCreateInfo`
        public VkDeviceQueueCreateInfo asSlice(long index) { return new VkDeviceQueueCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceQueueCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceQueueCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceQueueCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceQueueCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceQueueCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceQueueCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDeviceQueueCreateFlags") int flagsAt(long index) { return VkDeviceQueueCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `queueFamilyIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int queueFamilyIndexAt(long index) { return VkDeviceQueueCreateInfo.get_queueFamilyIndex(this.segment(), index); }
        /// Sets `queueFamilyIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkDeviceQueueCreateInfo.set_queueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `queueCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int queueCountAt(long index) { return VkDeviceQueueCreateInfo.get_queueCount(this.segment(), index); }
        /// Sets `queueCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueCountAt(long index, @CType("uint32_t") int value) { VkDeviceQueueCreateInfo.set_queueCount(this.segment(), index, value); return this; }

        /// {@return `pQueuePriorities` at the given index}
        /// @param index the index
        public @CType("const float *") java.lang.foreign.MemorySegment pQueuePrioritiesAt(long index) { return VkDeviceQueueCreateInfo.get_pQueuePriorities(this.segment(), index); }
        /// Sets `pQueuePriorities` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pQueuePrioritiesAt(long index, @CType("const float *") java.lang.foreign.MemorySegment value) { VkDeviceQueueCreateInfo.set_pQueuePriorities(this.segment(), index, value); return this; }

    }
}
