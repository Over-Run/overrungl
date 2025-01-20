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
/// ### dynamicStateCount
/// [VarHandle][#VH_dynamicStateCount] - [Getter][#dynamicStateCount()] - [Setter][#dynamicStateCount(int)]
/// ### pDynamicStates
/// [VarHandle][#VH_pDynamicStates] - [Getter][#pDynamicStates()] - [Setter][#pDynamicStates(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineDynamicStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineDynamicStateCreateFlags flags;
///     uint32_t dynamicStateCount;
///     const VkDynamicState * pDynamicStates;
/// } VkPipelineDynamicStateCreateInfo;
/// ```
public sealed class VkPipelineDynamicStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineDynamicStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("dynamicStateCount"),
        ValueLayout.ADDRESS.withName("pDynamicStates")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `dynamicStateCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicStateCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicStateCount"));
    /// The [VarHandle] of `pDynamicStates` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDynamicStates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicStates"));

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineDynamicStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDynamicStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDynamicStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineDynamicStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineDynamicStateCreateFlags") int flags, @CType("uint32_t") int dynamicStateCount, @CType("const VkDynamicState *") MemorySegment pDynamicStates) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).dynamicStateCount(dynamicStateCount).pDynamicStates(pDynamicStates); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo copyFrom(VkPipelineDynamicStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineDynamicStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineDynamicStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineDynamicStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineDynamicStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineDynamicStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineDynamicStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineDynamicStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo pNext(@CType("const void *") MemorySegment value) { VkPipelineDynamicStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineDynamicStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineDynamicStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineDynamicStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineDynamicStateCreateFlags") int flags() { return VkPipelineDynamicStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineDynamicStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineDynamicStateCreateFlags") int value) { VkPipelineDynamicStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo flags(@CType("VkPipelineDynamicStateCreateFlags") int value) { VkPipelineDynamicStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `dynamicStateCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dynamicStateCount(MemorySegment segment, long index) { return (int) VH_dynamicStateCount.get(segment, 0L, index); }
    /// {@return `dynamicStateCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dynamicStateCount(MemorySegment segment) { return VkPipelineDynamicStateCreateInfo.get_dynamicStateCount(segment, 0L); }
    /// {@return `dynamicStateCount`}
    public @CType("uint32_t") int dynamicStateCount() { return VkPipelineDynamicStateCreateInfo.get_dynamicStateCount(this.segment()); }
    /// Sets `dynamicStateCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicStateCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dynamicStateCount.set(segment, 0L, index, value); }
    /// Sets `dynamicStateCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicStateCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineDynamicStateCreateInfo.set_dynamicStateCount(segment, 0L, value); }
    /// Sets `dynamicStateCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo dynamicStateCount(@CType("uint32_t") int value) { VkPipelineDynamicStateCreateInfo.set_dynamicStateCount(this.segment(), value); return this; }

    /// {@return `pDynamicStates` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDynamicState *") MemorySegment get_pDynamicStates(MemorySegment segment, long index) { return (MemorySegment) VH_pDynamicStates.get(segment, 0L, index); }
    /// {@return `pDynamicStates`}
    /// @param segment the segment of the struct
    public static @CType("const VkDynamicState *") MemorySegment get_pDynamicStates(MemorySegment segment) { return VkPipelineDynamicStateCreateInfo.get_pDynamicStates(segment, 0L); }
    /// {@return `pDynamicStates`}
    public @CType("const VkDynamicState *") MemorySegment pDynamicStates() { return VkPipelineDynamicStateCreateInfo.get_pDynamicStates(this.segment()); }
    /// Sets `pDynamicStates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDynamicStates(MemorySegment segment, long index, @CType("const VkDynamicState *") MemorySegment value) { VH_pDynamicStates.set(segment, 0L, index, value); }
    /// Sets `pDynamicStates` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDynamicStates(MemorySegment segment, @CType("const VkDynamicState *") MemorySegment value) { VkPipelineDynamicStateCreateInfo.set_pDynamicStates(segment, 0L, value); }
    /// Sets `pDynamicStates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo pDynamicStates(@CType("const VkDynamicState *") MemorySegment value) { VkPipelineDynamicStateCreateInfo.set_pDynamicStates(this.segment(), value); return this; }

    /// A buffer of [VkPipelineDynamicStateCreateInfo].
    public static final class Buffer extends VkPipelineDynamicStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineDynamicStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineDynamicStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineDynamicStateCreateInfo`
        public VkPipelineDynamicStateCreateInfo asSlice(long index) { return new VkPipelineDynamicStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineDynamicStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineDynamicStateCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineDynamicStateCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineDynamicStateCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineDynamicStateCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineDynamicStateCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineDynamicStateCreateFlags") int flagsAt(long index) { return VkPipelineDynamicStateCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineDynamicStateCreateFlags") int value) { VkPipelineDynamicStateCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `dynamicStateCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dynamicStateCountAt(long index) { return VkPipelineDynamicStateCreateInfo.get_dynamicStateCount(this.segment(), index); }
        /// Sets `dynamicStateCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dynamicStateCountAt(long index, @CType("uint32_t") int value) { VkPipelineDynamicStateCreateInfo.set_dynamicStateCount(this.segment(), index, value); return this; }

        /// {@return `pDynamicStates` at the given index}
        /// @param index the index
        public @CType("const VkDynamicState *") MemorySegment pDynamicStatesAt(long index) { return VkPipelineDynamicStateCreateInfo.get_pDynamicStates(this.segment(), index); }
        /// Sets `pDynamicStates` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDynamicStatesAt(long index, @CType("const VkDynamicState *") MemorySegment value) { VkPipelineDynamicStateCreateInfo.set_pDynamicStates(this.segment(), index, value); return this; }

    }
}
