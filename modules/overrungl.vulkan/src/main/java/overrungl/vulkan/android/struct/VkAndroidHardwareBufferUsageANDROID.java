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
package overrungl.vulkan.android.struct;

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
/// ### androidHardwareBufferUsage
/// [VarHandle][#VH_androidHardwareBufferUsage] - [Getter][#androidHardwareBufferUsage()] - [Setter][#androidHardwareBufferUsage(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAndroidHardwareBufferUsageANDROID {
///     VkStructureType sType;
///     void * pNext;
///     uint64_t androidHardwareBufferUsage;
/// } VkAndroidHardwareBufferUsageANDROID;
/// ```
public sealed class VkAndroidHardwareBufferUsageANDROID extends Struct {
    /// The struct layout of `VkAndroidHardwareBufferUsageANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("androidHardwareBufferUsage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `androidHardwareBufferUsage` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_androidHardwareBufferUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("androidHardwareBufferUsage"));

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    /// @param segment the memory segment
    public VkAndroidHardwareBufferUsageANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferUsageANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferUsageANDROID(segment); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferUsageANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferUsageANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static VkAndroidHardwareBufferUsageANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferUsageANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static VkAndroidHardwareBufferUsageANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint64_t") long androidHardwareBufferUsage) { return alloc(allocator).sType(sType).pNext(pNext).androidHardwareBufferUsage(androidHardwareBufferUsage); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferUsageANDROID copyFrom(VkAndroidHardwareBufferUsageANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAndroidHardwareBufferUsageANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAndroidHardwareBufferUsageANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAndroidHardwareBufferUsageANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferUsageANDROID sType(@CType("VkStructureType") int value) { VkAndroidHardwareBufferUsageANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkAndroidHardwareBufferUsageANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkAndroidHardwareBufferUsageANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkAndroidHardwareBufferUsageANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferUsageANDROID pNext(@CType("void *") MemorySegment value) { VkAndroidHardwareBufferUsageANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `androidHardwareBufferUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_androidHardwareBufferUsage(MemorySegment segment, long index) { return (long) VH_androidHardwareBufferUsage.get(segment, 0L, index); }
    /// {@return `androidHardwareBufferUsage`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_androidHardwareBufferUsage(MemorySegment segment) { return VkAndroidHardwareBufferUsageANDROID.get_androidHardwareBufferUsage(segment, 0L); }
    /// {@return `androidHardwareBufferUsage`}
    public @CType("uint64_t") long androidHardwareBufferUsage() { return VkAndroidHardwareBufferUsageANDROID.get_androidHardwareBufferUsage(this.segment()); }
    /// Sets `androidHardwareBufferUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_androidHardwareBufferUsage(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_androidHardwareBufferUsage.set(segment, 0L, index, value); }
    /// Sets `androidHardwareBufferUsage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_androidHardwareBufferUsage(MemorySegment segment, @CType("uint64_t") long value) { VkAndroidHardwareBufferUsageANDROID.set_androidHardwareBufferUsage(segment, 0L, value); }
    /// Sets `androidHardwareBufferUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferUsageANDROID androidHardwareBufferUsage(@CType("uint64_t") long value) { VkAndroidHardwareBufferUsageANDROID.set_androidHardwareBufferUsage(this.segment(), value); return this; }

    /// A buffer of [VkAndroidHardwareBufferUsageANDROID].
    public static final class Buffer extends VkAndroidHardwareBufferUsageANDROID {
        private final long elementCount;

        /// Creates `VkAndroidHardwareBufferUsageANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAndroidHardwareBufferUsageANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAndroidHardwareBufferUsageANDROID`
        public VkAndroidHardwareBufferUsageANDROID asSlice(long index) { return new VkAndroidHardwareBufferUsageANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAndroidHardwareBufferUsageANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAndroidHardwareBufferUsageANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAndroidHardwareBufferUsageANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAndroidHardwareBufferUsageANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkAndroidHardwareBufferUsageANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkAndroidHardwareBufferUsageANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `androidHardwareBufferUsage` at the given index}
        /// @param index the index
        public @CType("uint64_t") long androidHardwareBufferUsageAt(long index) { return VkAndroidHardwareBufferUsageANDROID.get_androidHardwareBufferUsage(this.segment(), index); }
        /// Sets `androidHardwareBufferUsage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer androidHardwareBufferUsageAt(long index, @CType("uint64_t") long value) { VkAndroidHardwareBufferUsageANDROID.set_androidHardwareBufferUsage(this.segment(), index, value); return this; }

    }
}
