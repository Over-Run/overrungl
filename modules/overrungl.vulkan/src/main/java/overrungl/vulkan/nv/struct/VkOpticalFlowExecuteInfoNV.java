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
package overrungl.vulkan.nv.struct;

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
/// ### regionCount
/// [VarHandle][#VH_regionCount] - [Getter][#regionCount()] - [Setter][#regionCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkOpticalFlowExecuteInfoNV {
///     VkStructureType sType;
///     void * pNext;
///     VkOpticalFlowExecuteFlagsNV flags;
///     uint32_t regionCount;
///     const VkRect2D * pRegions;
/// } VkOpticalFlowExecuteInfoNV;
/// ```
public sealed class VkOpticalFlowExecuteInfoNV extends Struct {
    /// The struct layout of `VkOpticalFlowExecuteInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkOpticalFlowExecuteInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowExecuteInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowExecuteInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkOpticalFlowExecuteInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowExecuteInfoNV`
    public static VkOpticalFlowExecuteInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowExecuteInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOpticalFlowExecuteInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowExecuteInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkOpticalFlowExecuteInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowExecuteInfoNV`
    public static VkOpticalFlowExecuteInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkOpticalFlowExecuteFlagsNV") int flags, @CType("uint32_t") int regionCount, @CType("const VkRect2D *") MemorySegment pRegions) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).regionCount(regionCount).pRegions(pRegions); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV copyFrom(VkOpticalFlowExecuteInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkOpticalFlowExecuteInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV sType(@CType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkOpticalFlowExecuteInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV pNext(@CType("void *") MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowExecuteFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowExecuteFlagsNV") int get_flags(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkOpticalFlowExecuteFlagsNV") int flags() { return VkOpticalFlowExecuteInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkOpticalFlowExecuteFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV flags(@CType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_regionCount(segment, 0L); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkOpticalFlowExecuteInfoNV.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkOpticalFlowExecuteInfoNV.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV regionCount(@CType("uint32_t") int value) { VkOpticalFlowExecuteInfoNV.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") MemorySegment get_pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") MemorySegment get_pRegions(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_pRegions(segment, 0L); }
    /// {@return `pRegions`}
    public @CType("const VkRect2D *") MemorySegment pRegions() { return VkOpticalFlowExecuteInfoNV.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkRect2D *") MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkRect2D *") MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV pRegions(@CType("const VkRect2D *") MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pRegions(this.segment(), value); return this; }

    /// A buffer of [VkOpticalFlowExecuteInfoNV].
    public static final class Buffer extends VkOpticalFlowExecuteInfoNV {
        private final long elementCount;

        /// Creates `VkOpticalFlowExecuteInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkOpticalFlowExecuteInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkOpticalFlowExecuteInfoNV`
        public VkOpticalFlowExecuteInfoNV asSlice(long index) { return new VkOpticalFlowExecuteInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkOpticalFlowExecuteInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkOpticalFlowExecuteInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkOpticalFlowExecuteInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkOpticalFlowExecuteInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkOpticalFlowExecuteFlagsNV") int flagsAt(long index) { return VkOpticalFlowExecuteInfoNV.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.set_flags(this.segment(), index, value); return this; }

        /// {@return `regionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int regionCountAt(long index) { return VkOpticalFlowExecuteInfoNV.get_regionCount(this.segment(), index); }
        /// Sets `regionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer regionCountAt(long index, @CType("uint32_t") int value) { VkOpticalFlowExecuteInfoNV.set_regionCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index
        public @CType("const VkRect2D *") MemorySegment pRegionsAt(long index) { return VkOpticalFlowExecuteInfoNV.get_pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, @CType("const VkRect2D *") MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pRegions(this.segment(), index, value); return this; }

    }
}
