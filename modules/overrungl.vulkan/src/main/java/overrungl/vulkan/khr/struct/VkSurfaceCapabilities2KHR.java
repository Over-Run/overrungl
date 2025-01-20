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
/// ### surfaceCapabilities
/// [Byte offset][#OFFSET_surfaceCapabilities] - [Memory layout][#ML_surfaceCapabilities] - [Getter][#surfaceCapabilities()] - [Setter][#surfaceCapabilities(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfaceCapabilities2KHR {
///     VkStructureType sType;
///     void * pNext;
///     VkSurfaceCapabilitiesKHR surfaceCapabilities;
/// } VkSurfaceCapabilities2KHR;
/// ```
public sealed class VkSurfaceCapabilities2KHR extends Struct {
    /// The struct layout of `VkSurfaceCapabilities2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkSurfaceCapabilitiesKHR.LAYOUT.withName("surfaceCapabilities")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `surfaceCapabilities`.
    public static final long OFFSET_surfaceCapabilities = LAYOUT.byteOffset(PathElement.groupElement("surfaceCapabilities"));
    /// The memory layout of `surfaceCapabilities`.
    public static final MemoryLayout ML_surfaceCapabilities = LAYOUT.select(PathElement.groupElement("surfaceCapabilities"));

    /// Creates `VkSurfaceCapabilities2KHR` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceCapabilities2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceCapabilities2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilities2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceCapabilities2KHR(segment); }

    /// Creates `VkSurfaceCapabilities2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceCapabilities2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilities2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceCapabilities2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceCapabilities2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSurfaceCapabilities2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceCapabilities2KHR`
    public static VkSurfaceCapabilities2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilities2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceCapabilities2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceCapabilities2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfaceCapabilities2KHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceCapabilities2KHR`
    public static VkSurfaceCapabilities2KHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkSurfaceCapabilitiesKHR") MemorySegment surfaceCapabilities) { return alloc(allocator).sType(sType).pNext(pNext).surfaceCapabilities(surfaceCapabilities); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceCapabilities2KHR copyFrom(VkSurfaceCapabilities2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfaceCapabilities2KHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfaceCapabilities2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfaceCapabilities2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2KHR sType(@CType("VkStructureType") int value) { VkSurfaceCapabilities2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkSurfaceCapabilities2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkSurfaceCapabilities2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkSurfaceCapabilities2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2KHR pNext(@CType("void *") MemorySegment value) { VkSurfaceCapabilities2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `surfaceCapabilities` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceCapabilitiesKHR") MemorySegment get_surfaceCapabilities(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_surfaceCapabilities, index), ML_surfaceCapabilities); }
    /// {@return `surfaceCapabilities`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceCapabilitiesKHR") MemorySegment get_surfaceCapabilities(MemorySegment segment) { return VkSurfaceCapabilities2KHR.get_surfaceCapabilities(segment, 0L); }
    /// {@return `surfaceCapabilities`}
    public @CType("VkSurfaceCapabilitiesKHR") MemorySegment surfaceCapabilities() { return VkSurfaceCapabilities2KHR.get_surfaceCapabilities(this.segment()); }
    /// Sets `surfaceCapabilities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surfaceCapabilities(MemorySegment segment, long index, @CType("VkSurfaceCapabilitiesKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_surfaceCapabilities, index), ML_surfaceCapabilities.byteSize()); }
    /// Sets `surfaceCapabilities` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surfaceCapabilities(MemorySegment segment, @CType("VkSurfaceCapabilitiesKHR") MemorySegment value) { VkSurfaceCapabilities2KHR.set_surfaceCapabilities(segment, 0L, value); }
    /// Sets `surfaceCapabilities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2KHR surfaceCapabilities(@CType("VkSurfaceCapabilitiesKHR") MemorySegment value) { VkSurfaceCapabilities2KHR.set_surfaceCapabilities(this.segment(), value); return this; }

    /// A buffer of [VkSurfaceCapabilities2KHR].
    public static final class Buffer extends VkSurfaceCapabilities2KHR {
        private final long elementCount;

        /// Creates `VkSurfaceCapabilities2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfaceCapabilities2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfaceCapabilities2KHR`
        public VkSurfaceCapabilities2KHR asSlice(long index) { return new VkSurfaceCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfaceCapabilities2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfaceCapabilities2KHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfaceCapabilities2KHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfaceCapabilities2KHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkSurfaceCapabilities2KHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkSurfaceCapabilities2KHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `surfaceCapabilities` at the given index}
        /// @param index the index
        public @CType("VkSurfaceCapabilitiesKHR") MemorySegment surfaceCapabilitiesAt(long index) { return VkSurfaceCapabilities2KHR.get_surfaceCapabilities(this.segment(), index); }
        /// Sets `surfaceCapabilities` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer surfaceCapabilitiesAt(long index, @CType("VkSurfaceCapabilitiesKHR") MemorySegment value) { VkSurfaceCapabilities2KHR.set_surfaceCapabilities(this.segment(), index, value); return this; }

    }
}
