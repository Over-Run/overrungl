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
/// ### displayModeProperties
/// [Byte offset][#OFFSET_displayModeProperties] - [Memory layout][#ML_displayModeProperties] - [Getter][#displayModeProperties()] - [Setter][#displayModeProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayModeProperties2KHR {
///     VkStructureType sType;
///     void * pNext;
///     VkDisplayModePropertiesKHR displayModeProperties;
/// } VkDisplayModeProperties2KHR;
/// ```
public sealed class VkDisplayModeProperties2KHR extends Struct {
    /// The struct layout of `VkDisplayModeProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayModePropertiesKHR.LAYOUT.withName("displayModeProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `displayModeProperties`.
    public static final long OFFSET_displayModeProperties = LAYOUT.byteOffset(PathElement.groupElement("displayModeProperties"));
    /// The memory layout of `displayModeProperties`.
    public static final MemoryLayout ML_displayModeProperties = LAYOUT.select(PathElement.groupElement("displayModeProperties"));

    /// Creates `VkDisplayModeProperties2KHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayModeProperties2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayModeProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeProperties2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeProperties2KHR(segment); }

    /// Creates `VkDisplayModeProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayModeProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeProperties2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayModeProperties2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayModeProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayModeProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeProperties2KHR`
    public static VkDisplayModeProperties2KHR alloc(SegmentAllocator allocator) { return new VkDisplayModeProperties2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayModeProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModeProperties2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayModeProperties2KHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeProperties2KHR`
    public static VkDisplayModeProperties2KHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment displayModeProperties) { return alloc(allocator).sType(sType).pNext(pNext).displayModeProperties(displayModeProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayModeProperties2KHR copyFrom(VkDisplayModeProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayModeProperties2KHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayModeProperties2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayModeProperties2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeProperties2KHR sType(@CType("VkStructureType") int value) { VkDisplayModeProperties2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDisplayModeProperties2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDisplayModeProperties2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDisplayModeProperties2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeProperties2KHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDisplayModeProperties2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `displayModeProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment get_displayModeProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayModeProperties, index), ML_displayModeProperties); }
    /// {@return `displayModeProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment get_displayModeProperties(MemorySegment segment) { return VkDisplayModeProperties2KHR.get_displayModeProperties(segment, 0L); }
    /// {@return `displayModeProperties`}
    public @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment displayModeProperties() { return VkDisplayModeProperties2KHR.get_displayModeProperties(this.segment()); }
    /// Sets `displayModeProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayModeProperties(MemorySegment segment, long index, @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayModeProperties, index), ML_displayModeProperties.byteSize()); }
    /// Sets `displayModeProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayModeProperties(MemorySegment segment, @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment value) { VkDisplayModeProperties2KHR.set_displayModeProperties(segment, 0L, value); }
    /// Sets `displayModeProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeProperties2KHR displayModeProperties(@CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment value) { VkDisplayModeProperties2KHR.set_displayModeProperties(this.segment(), value); return this; }

    /// A buffer of [VkDisplayModeProperties2KHR].
    public static final class Buffer extends VkDisplayModeProperties2KHR {
        private final long elementCount;

        /// Creates `VkDisplayModeProperties2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayModeProperties2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayModeProperties2KHR`
        public VkDisplayModeProperties2KHR asSlice(long index) { return new VkDisplayModeProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayModeProperties2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayModeProperties2KHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayModeProperties2KHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayModeProperties2KHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDisplayModeProperties2KHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDisplayModeProperties2KHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `displayModeProperties` at the given index}
        /// @param index the index
        public @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment displayModePropertiesAt(long index) { return VkDisplayModeProperties2KHR.get_displayModeProperties(this.segment(), index); }
        /// Sets `displayModeProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayModePropertiesAt(long index, @CType("VkDisplayModePropertiesKHR") java.lang.foreign.MemorySegment value) { VkDisplayModeProperties2KHR.set_displayModeProperties(this.segment(), index, value); return this; }

    }
}
