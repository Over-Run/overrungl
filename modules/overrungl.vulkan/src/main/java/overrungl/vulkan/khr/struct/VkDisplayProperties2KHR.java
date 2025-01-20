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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### displayProperties
/// [Byte offset][#OFFSET_displayProperties] - [Memory layout][#ML_displayProperties] - [Getter][#displayProperties()] - [Setter][#displayProperties(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayProperties2KHR {
///     VkStructureType sType;
///     void * pNext;
///     VkDisplayPropertiesKHR displayProperties;
/// } VkDisplayProperties2KHR;
/// ```
public sealed class VkDisplayProperties2KHR extends Struct {
    /// The struct layout of `VkDisplayProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayPropertiesKHR.LAYOUT.withName("displayProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `displayProperties`.
    public static final long OFFSET_displayProperties = LAYOUT.byteOffset(PathElement.groupElement("displayProperties"));
    /// The memory layout of `displayProperties`.
    public static final MemoryLayout ML_displayProperties = LAYOUT.select(PathElement.groupElement("displayProperties"));

    /// Creates `VkDisplayProperties2KHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayProperties2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayProperties2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayProperties2KHR(segment); }

    /// Creates `VkDisplayProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayProperties2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayProperties2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayProperties2KHR`
    public static VkDisplayProperties2KHR alloc(SegmentAllocator allocator) { return new VkDisplayProperties2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayProperties2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayProperties2KHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayProperties2KHR`
    public static VkDisplayProperties2KHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDisplayPropertiesKHR") MemorySegment displayProperties) { return alloc(allocator).sType(sType).pNext(pNext).displayProperties(displayProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayProperties2KHR copyFrom(VkDisplayProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayProperties2KHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayProperties2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayProperties2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayProperties2KHR sType(@CType("VkStructureType") int value) { VkDisplayProperties2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkDisplayProperties2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkDisplayProperties2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkDisplayProperties2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayProperties2KHR pNext(@CType("void *") MemorySegment value) { VkDisplayProperties2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `displayProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayPropertiesKHR") MemorySegment get_displayProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayProperties, index), ML_displayProperties); }
    /// {@return `displayProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayPropertiesKHR") MemorySegment get_displayProperties(MemorySegment segment) { return VkDisplayProperties2KHR.get_displayProperties(segment, 0L); }
    /// {@return `displayProperties`}
    public @CType("VkDisplayPropertiesKHR") MemorySegment displayProperties() { return VkDisplayProperties2KHR.get_displayProperties(this.segment()); }
    /// Sets `displayProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayProperties(MemorySegment segment, long index, @CType("VkDisplayPropertiesKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayProperties, index), ML_displayProperties.byteSize()); }
    /// Sets `displayProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayProperties(MemorySegment segment, @CType("VkDisplayPropertiesKHR") MemorySegment value) { VkDisplayProperties2KHR.set_displayProperties(segment, 0L, value); }
    /// Sets `displayProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayProperties2KHR displayProperties(@CType("VkDisplayPropertiesKHR") MemorySegment value) { VkDisplayProperties2KHR.set_displayProperties(this.segment(), value); return this; }

    /// A buffer of [VkDisplayProperties2KHR].
    public static final class Buffer extends VkDisplayProperties2KHR {
        private final long elementCount;

        /// Creates `VkDisplayProperties2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayProperties2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayProperties2KHR`
        public VkDisplayProperties2KHR asSlice(long index) { return new VkDisplayProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayProperties2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayProperties2KHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayProperties2KHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayProperties2KHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkDisplayProperties2KHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkDisplayProperties2KHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `displayProperties` at the given index}
        /// @param index the index
        public @CType("VkDisplayPropertiesKHR") MemorySegment displayPropertiesAt(long index) { return VkDisplayProperties2KHR.get_displayProperties(this.segment(), index); }
        /// Sets `displayProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayPropertiesAt(long index, @CType("VkDisplayPropertiesKHR") MemorySegment value) { VkDisplayProperties2KHR.set_displayProperties(this.segment(), index, value); return this; }

    }
}
