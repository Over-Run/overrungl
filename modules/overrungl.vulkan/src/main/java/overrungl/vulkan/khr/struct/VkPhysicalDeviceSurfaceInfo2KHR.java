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
/// ### surface
/// [VarHandle][#VH_surface] - [Getter][#surface()] - [Setter][#surface(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSurfaceInfo2KHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkSurfaceKHR surface;
/// } VkPhysicalDeviceSurfaceInfo2KHR;
/// ```
public sealed class VkPhysicalDeviceSurfaceInfo2KHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceSurfaceInfo2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("surface")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSurfaceInfo2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSurfaceInfo2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSurfaceInfo2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSurfaceInfo2KHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSurfaceInfo2KHR`
    public static VkPhysicalDeviceSurfaceInfo2KHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSurfaceKHR") MemorySegment surface) { return alloc(allocator).sType(sType).pNext(pNext).surface(surface); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR copyFrom(VkPhysicalDeviceSurfaceInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSurfaceInfo2KHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSurfaceInfo2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSurfaceInfo2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSurfaceInfo2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSurfaceInfo2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPhysicalDeviceSurfaceInfo2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPhysicalDeviceSurfaceInfo2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(@CType("const void *") MemorySegment value) { VkPhysicalDeviceSurfaceInfo2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceKHR") MemorySegment get_surface(MemorySegment segment, long index) { return (MemorySegment) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceKHR") MemorySegment get_surface(MemorySegment segment) { return VkPhysicalDeviceSurfaceInfo2KHR.get_surface(segment, 0L); }
    /// {@return `surface`}
    public @CType("VkSurfaceKHR") MemorySegment surface() { return VkPhysicalDeviceSurfaceInfo2KHR.get_surface(this.segment()); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surface(MemorySegment segment, long index, @CType("VkSurfaceKHR") MemorySegment value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surface(MemorySegment segment, @CType("VkSurfaceKHR") MemorySegment value) { VkPhysicalDeviceSurfaceInfo2KHR.set_surface(segment, 0L, value); }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSurfaceInfo2KHR surface(@CType("VkSurfaceKHR") MemorySegment value) { VkPhysicalDeviceSurfaceInfo2KHR.set_surface(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceSurfaceInfo2KHR].
    public static final class Buffer extends VkPhysicalDeviceSurfaceInfo2KHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceSurfaceInfo2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceSurfaceInfo2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceSurfaceInfo2KHR`
        public VkPhysicalDeviceSurfaceInfo2KHR asSlice(long index) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceSurfaceInfo2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceSurfaceInfo2KHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSurfaceInfo2KHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSurfaceInfo2KHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceSurfaceInfo2KHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPhysicalDeviceSurfaceInfo2KHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `surface` at the given index}
        /// @param index the index
        public @CType("VkSurfaceKHR") MemorySegment surfaceAt(long index) { return VkPhysicalDeviceSurfaceInfo2KHR.get_surface(this.segment(), index); }
        /// Sets `surface` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer surfaceAt(long index, @CType("VkSurfaceKHR") MemorySegment value) { VkPhysicalDeviceSurfaceInfo2KHR.set_surface(this.segment(), index, value); return this; }

    }
}
