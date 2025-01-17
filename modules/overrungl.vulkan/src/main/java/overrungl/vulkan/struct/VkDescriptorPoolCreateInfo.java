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
/// ### maxSets
/// [VarHandle][#VH_maxSets] - [Getter][#maxSets()] - [Setter][#maxSets(int)]
/// ### poolSizeCount
/// [VarHandle][#VH_poolSizeCount] - [Getter][#poolSizeCount()] - [Setter][#poolSizeCount(int)]
/// ### pPoolSizes
/// [VarHandle][#VH_pPoolSizes] - [Getter][#pPoolSizes()] - [Setter][#pPoolSizes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorPoolCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorPoolCreateFlags flags;
///     uint32_t maxSets;
///     uint32_t poolSizeCount;
///     const VkDescriptorPoolSize * pPoolSizes;
/// } VkDescriptorPoolCreateInfo;
/// ```
public sealed class VkDescriptorPoolCreateInfo extends Struct {
    /// The struct layout of `VkDescriptorPoolCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxSets"),
        ValueLayout.JAVA_INT.withName("poolSizeCount"),
        ValueLayout.ADDRESS.withName("pPoolSizes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `maxSets` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSets"));
    /// The [VarHandle] of `poolSizeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_poolSizeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolSizeCount"));
    /// The [VarHandle] of `pPoolSizes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPoolSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPoolSizes"));

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorPoolCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolCreateInfo(segment); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorPoolCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolCreateInfo`
    public static VkDescriptorPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorPoolCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorPoolCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorPoolCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorPoolCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolCreateInfo`
    public static VkDescriptorPoolCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDescriptorPoolCreateFlags") int flags, @CType("uint32_t") int maxSets, @CType("uint32_t") int poolSizeCount, @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment pPoolSizes) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).maxSets(maxSets).poolSizeCount(poolSizeCount).pPoolSizes(pPoolSizes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorPoolCreateInfo copyFrom(VkDescriptorPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorPoolCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorPoolCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorPoolCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo sType(@CType("VkStructureType") int value) { VkDescriptorPoolCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorPoolCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorPoolCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorPoolCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorPoolCreateFlags") int get_flags(MemorySegment segment) { return VkDescriptorPoolCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDescriptorPoolCreateFlags") int flags() { return VkDescriptorPoolCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDescriptorPoolCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDescriptorPoolCreateFlags") int value) { VkDescriptorPoolCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo flags(@CType("VkDescriptorPoolCreateFlags") int value) { VkDescriptorPoolCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `maxSets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSets(MemorySegment segment, long index) { return (int) VH_maxSets.get(segment, 0L, index); }
    /// {@return `maxSets`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSets(MemorySegment segment) { return VkDescriptorPoolCreateInfo.get_maxSets(segment, 0L); }
    /// {@return `maxSets`}
    public @CType("uint32_t") int maxSets() { return VkDescriptorPoolCreateInfo.get_maxSets(this.segment()); }
    /// Sets `maxSets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSets(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSets.set(segment, 0L, index, value); }
    /// Sets `maxSets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSets(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorPoolCreateInfo.set_maxSets(segment, 0L, value); }
    /// Sets `maxSets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo maxSets(@CType("uint32_t") int value) { VkDescriptorPoolCreateInfo.set_maxSets(this.segment(), value); return this; }

    /// {@return `poolSizeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_poolSizeCount(MemorySegment segment, long index) { return (int) VH_poolSizeCount.get(segment, 0L, index); }
    /// {@return `poolSizeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_poolSizeCount(MemorySegment segment) { return VkDescriptorPoolCreateInfo.get_poolSizeCount(segment, 0L); }
    /// {@return `poolSizeCount`}
    public @CType("uint32_t") int poolSizeCount() { return VkDescriptorPoolCreateInfo.get_poolSizeCount(this.segment()); }
    /// Sets `poolSizeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_poolSizeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_poolSizeCount.set(segment, 0L, index, value); }
    /// Sets `poolSizeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_poolSizeCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorPoolCreateInfo.set_poolSizeCount(segment, 0L, value); }
    /// Sets `poolSizeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo poolSizeCount(@CType("uint32_t") int value) { VkDescriptorPoolCreateInfo.set_poolSizeCount(this.segment(), value); return this; }

    /// {@return `pPoolSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment get_pPoolSizes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPoolSizes.get(segment, 0L, index); }
    /// {@return `pPoolSizes`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment get_pPoolSizes(MemorySegment segment) { return VkDescriptorPoolCreateInfo.get_pPoolSizes(segment, 0L); }
    /// {@return `pPoolSizes`}
    public @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment pPoolSizes() { return VkDescriptorPoolCreateInfo.get_pPoolSizes(this.segment()); }
    /// Sets `pPoolSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPoolSizes(MemorySegment segment, long index, @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment value) { VH_pPoolSizes.set(segment, 0L, index, value); }
    /// Sets `pPoolSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPoolSizes(MemorySegment segment, @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolCreateInfo.set_pPoolSizes(segment, 0L, value); }
    /// Sets `pPoolSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo pPoolSizes(@CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolCreateInfo.set_pPoolSizes(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorPoolCreateInfo].
    public static final class Buffer extends VkDescriptorPoolCreateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorPoolCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorPoolCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorPoolCreateInfo`
        public VkDescriptorPoolCreateInfo asSlice(long index) { return new VkDescriptorPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorPoolCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorPoolCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorPoolCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorPoolCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorPoolCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDescriptorPoolCreateFlags") int flagsAt(long index) { return VkDescriptorPoolCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDescriptorPoolCreateFlags") int value) { VkDescriptorPoolCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `maxSets` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSetsAt(long index) { return VkDescriptorPoolCreateInfo.get_maxSets(this.segment(), index); }
        /// Sets `maxSets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSetsAt(long index, @CType("uint32_t") int value) { VkDescriptorPoolCreateInfo.set_maxSets(this.segment(), index, value); return this; }

        /// {@return `poolSizeCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int poolSizeCountAt(long index) { return VkDescriptorPoolCreateInfo.get_poolSizeCount(this.segment(), index); }
        /// Sets `poolSizeCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer poolSizeCountAt(long index, @CType("uint32_t") int value) { VkDescriptorPoolCreateInfo.set_poolSizeCount(this.segment(), index, value); return this; }

        /// {@return `pPoolSizes` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment pPoolSizesAt(long index) { return VkDescriptorPoolCreateInfo.get_pPoolSizes(this.segment(), index); }
        /// Sets `pPoolSizes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPoolSizesAt(long index, @CType("const VkDescriptorPoolSize *") java.lang.foreign.MemorySegment value) { VkDescriptorPoolCreateInfo.set_pPoolSizes(this.segment(), index, value); return this; }

    }
}
