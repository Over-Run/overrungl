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
package overrungl.vulkan.khr.struct;

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
/// ### displayPlaneProperties
/// [Byte offset][#OFFSET_displayPlaneProperties] - [Memory layout][#ML_displayPlaneProperties] - [Getter][#displayPlaneProperties()] - [Setter][#displayPlaneProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayPlaneProperties2KHR {
///     VkStructureType sType;
///     void * pNext;
///     VkDisplayPlanePropertiesKHR displayPlaneProperties;
/// } VkDisplayPlaneProperties2KHR;
/// ```
public sealed class VkDisplayPlaneProperties2KHR extends Struct {
    /// The struct layout of `VkDisplayPlaneProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayPlanePropertiesKHR.LAYOUT.withName("displayPlaneProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `displayPlaneProperties`.
    public static final long OFFSET_displayPlaneProperties = LAYOUT.byteOffset(PathElement.groupElement("displayPlaneProperties"));
    /// The memory layout of `displayPlaneProperties`.
    public static final MemoryLayout ML_displayPlaneProperties = LAYOUT.select(PathElement.groupElement("displayPlaneProperties"));

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPlaneProperties2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneProperties2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneProperties2KHR(segment); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneProperties2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneProperties2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayPlaneProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneProperties2KHR`
    public static VkDisplayPlaneProperties2KHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneProperties2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPlaneProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlaneProperties2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayPlaneProperties2KHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneProperties2KHR`
    public static VkDisplayPlaneProperties2KHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment displayPlaneProperties) { return alloc(allocator).sType(sType).pNext(pNext).displayPlaneProperties(displayPlaneProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPlaneProperties2KHR copyFrom(VkDisplayPlaneProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayPlaneProperties2KHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayPlaneProperties2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayPlaneProperties2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR sType(@CType("VkStructureType") int value) { VkDisplayPlaneProperties2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDisplayPlaneProperties2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDisplayPlaneProperties2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDisplayPlaneProperties2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDisplayPlaneProperties2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `displayPlaneProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment get_displayPlaneProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPlaneProperties, index), ML_displayPlaneProperties); }
    /// {@return `displayPlaneProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment get_displayPlaneProperties(MemorySegment segment) { return VkDisplayPlaneProperties2KHR.get_displayPlaneProperties(segment, 0L); }
    /// {@return `displayPlaneProperties`}
    public @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment displayPlaneProperties() { return VkDisplayPlaneProperties2KHR.get_displayPlaneProperties(this.segment()); }
    /// Sets `displayPlaneProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayPlaneProperties(MemorySegment segment, long index, @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPlaneProperties, index), ML_displayPlaneProperties.byteSize()); }
    /// Sets `displayPlaneProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayPlaneProperties(MemorySegment segment, @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlaneProperties2KHR.set_displayPlaneProperties(segment, 0L, value); }
    /// Sets `displayPlaneProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR displayPlaneProperties(@CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlaneProperties2KHR.set_displayPlaneProperties(this.segment(), value); return this; }

    /// A buffer of [VkDisplayPlaneProperties2KHR].
    public static final class Buffer extends VkDisplayPlaneProperties2KHR {
        private final long elementCount;

        /// Creates `VkDisplayPlaneProperties2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayPlaneProperties2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayPlaneProperties2KHR`
        public VkDisplayPlaneProperties2KHR asSlice(long index) { return new VkDisplayPlaneProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayPlaneProperties2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayPlaneProperties2KHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayPlaneProperties2KHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayPlaneProperties2KHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDisplayPlaneProperties2KHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDisplayPlaneProperties2KHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `displayPlaneProperties` at the given index}
        /// @param index the index
        public @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment displayPlanePropertiesAt(long index) { return VkDisplayPlaneProperties2KHR.get_displayPlaneProperties(this.segment(), index); }
        /// Sets `displayPlaneProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayPlanePropertiesAt(long index, @CType("VkDisplayPlanePropertiesKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlaneProperties2KHR.set_displayPlaneProperties(this.segment(), index, value); return this; }

    }
}
