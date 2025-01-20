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
/// ### modes
/// [VarHandle][#VH_modes] - [Getter][#modes()] - [Setter][#modes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupSwapchainCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceGroupPresentModeFlagsKHR modes;
/// } VkDeviceGroupSwapchainCreateInfoKHR;
/// ```
public sealed class VkDeviceGroupSwapchainCreateInfoKHR extends Struct {
    /// The struct layout of `VkDeviceGroupSwapchainCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("modes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `modes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_modes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modes"));

    /// Creates `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupSwapchainCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSwapchainCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupSwapchainCreateInfoKHR(segment); }

    /// Creates `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupSwapchainCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupSwapchainCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupSwapchainCreateInfoKHR`
    public static VkDeviceGroupSwapchainCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupSwapchainCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupSwapchainCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceGroupSwapchainCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupSwapchainCreateInfoKHR`
    public static VkDeviceGroupSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDeviceGroupPresentModeFlagsKHR") int modes) { return alloc(allocator).sType(sType).pNext(pNext).modes(modes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupSwapchainCreateInfoKHR copyFrom(VkDeviceGroupSwapchainCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupSwapchainCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupSwapchainCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupSwapchainCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSwapchainCreateInfoKHR sType(@CType("VkStructureType") int value) { VkDeviceGroupSwapchainCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupSwapchainCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDeviceGroupSwapchainCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceGroupSwapchainCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSwapchainCreateInfoKHR pNext(@CType("const void *") MemorySegment value) { VkDeviceGroupSwapchainCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `modes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceGroupPresentModeFlagsKHR") int get_modes(MemorySegment segment, long index) { return (int) VH_modes.get(segment, 0L, index); }
    /// {@return `modes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceGroupPresentModeFlagsKHR") int get_modes(MemorySegment segment) { return VkDeviceGroupSwapchainCreateInfoKHR.get_modes(segment, 0L); }
    /// {@return `modes`}
    public @CType("VkDeviceGroupPresentModeFlagsKHR") int modes() { return VkDeviceGroupSwapchainCreateInfoKHR.get_modes(this.segment()); }
    /// Sets `modes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_modes(MemorySegment segment, long index, @CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VH_modes.set(segment, 0L, index, value); }
    /// Sets `modes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_modes(MemorySegment segment, @CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupSwapchainCreateInfoKHR.set_modes(segment, 0L, value); }
    /// Sets `modes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupSwapchainCreateInfoKHR modes(@CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupSwapchainCreateInfoKHR.set_modes(this.segment(), value); return this; }

    /// A buffer of [VkDeviceGroupSwapchainCreateInfoKHR].
    public static final class Buffer extends VkDeviceGroupSwapchainCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkDeviceGroupSwapchainCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceGroupSwapchainCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceGroupSwapchainCreateInfoKHR`
        public VkDeviceGroupSwapchainCreateInfoKHR asSlice(long index) { return new VkDeviceGroupSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceGroupSwapchainCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceGroupSwapchainCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupSwapchainCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupSwapchainCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDeviceGroupSwapchainCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDeviceGroupSwapchainCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `modes` at the given index}
        /// @param index the index
        public @CType("VkDeviceGroupPresentModeFlagsKHR") int modesAt(long index) { return VkDeviceGroupSwapchainCreateInfoKHR.get_modes(this.segment(), index); }
        /// Sets `modes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer modesAt(long index, @CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupSwapchainCreateInfoKHR.set_modes(this.segment(), index, value); return this; }

    }
}
