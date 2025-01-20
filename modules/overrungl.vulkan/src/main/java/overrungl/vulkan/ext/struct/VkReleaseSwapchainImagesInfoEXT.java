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
package overrungl.vulkan.ext.struct;

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
/// ### swapchain
/// [VarHandle][#VH_swapchain] - [Getter][#swapchain()] - [Setter][#swapchain(MemorySegment)]
/// ### imageIndexCount
/// [VarHandle][#VH_imageIndexCount] - [Getter][#imageIndexCount()] - [Setter][#imageIndexCount(int)]
/// ### pImageIndices
/// [VarHandle][#VH_pImageIndices] - [Getter][#pImageIndices()] - [Setter][#pImageIndices(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkReleaseSwapchainImagesInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkSwapchainKHR swapchain;
///     uint32_t imageIndexCount;
///     const uint32_t * pImageIndices;
/// } VkReleaseSwapchainImagesInfoEXT;
/// ```
public sealed class VkReleaseSwapchainImagesInfoEXT extends Struct {
    /// The struct layout of `VkReleaseSwapchainImagesInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndexCount"),
        ValueLayout.ADDRESS.withName("pImageIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    /// The [VarHandle] of `imageIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageIndexCount"));
    /// The [VarHandle] of `pImageIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageIndices"));

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkReleaseSwapchainImagesInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseSwapchainImagesInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoEXT(segment); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseSwapchainImagesInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkReleaseSwapchainImagesInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkReleaseSwapchainImagesInfoEXT`
    public static VkReleaseSwapchainImagesInfoEXT alloc(SegmentAllocator allocator) { return new VkReleaseSwapchainImagesInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkReleaseSwapchainImagesInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkReleaseSwapchainImagesInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkReleaseSwapchainImagesInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkReleaseSwapchainImagesInfoEXT`
    public static VkReleaseSwapchainImagesInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("uint32_t") int imageIndexCount, @CType("const uint32_t *") MemorySegment pImageIndices) { return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).imageIndexCount(imageIndexCount).pImageIndices(pImageIndices); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT copyFrom(VkReleaseSwapchainImagesInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkReleaseSwapchainImagesInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkReleaseSwapchainImagesInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkReleaseSwapchainImagesInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT sType(@CType("VkStructureType") int value) { VkReleaseSwapchainImagesInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkReleaseSwapchainImagesInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkReleaseSwapchainImagesInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT pNext(@CType("const void *") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSwapchainKHR") MemorySegment get_swapchain(MemorySegment segment, long index) { return (MemorySegment) VH_swapchain.get(segment, 0L, index); }
    /// {@return `swapchain`}
    /// @param segment the segment of the struct
    public static @CType("VkSwapchainKHR") MemorySegment get_swapchain(MemorySegment segment) { return VkReleaseSwapchainImagesInfoEXT.get_swapchain(segment, 0L); }
    /// {@return `swapchain`}
    public @CType("VkSwapchainKHR") MemorySegment swapchain() { return VkReleaseSwapchainImagesInfoEXT.get_swapchain(this.segment()); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchain(MemorySegment segment, long index, @CType("VkSwapchainKHR") MemorySegment value) { VH_swapchain.set(segment, 0L, index, value); }
    /// Sets `swapchain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchain(MemorySegment segment, @CType("VkSwapchainKHR") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_swapchain(segment, 0L, value); }
    /// Sets `swapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT swapchain(@CType("VkSwapchainKHR") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_swapchain(this.segment(), value); return this; }

    /// {@return `imageIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageIndexCount(MemorySegment segment, long index) { return (int) VH_imageIndexCount.get(segment, 0L, index); }
    /// {@return `imageIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageIndexCount(MemorySegment segment) { return VkReleaseSwapchainImagesInfoEXT.get_imageIndexCount(segment, 0L); }
    /// {@return `imageIndexCount`}
    public @CType("uint32_t") int imageIndexCount() { return VkReleaseSwapchainImagesInfoEXT.get_imageIndexCount(this.segment()); }
    /// Sets `imageIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageIndexCount.set(segment, 0L, index, value); }
    /// Sets `imageIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkReleaseSwapchainImagesInfoEXT.set_imageIndexCount(segment, 0L, value); }
    /// Sets `imageIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT imageIndexCount(@CType("uint32_t") int value) { VkReleaseSwapchainImagesInfoEXT.set_imageIndexCount(this.segment(), value); return this; }

    /// {@return `pImageIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pImageIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pImageIndices.get(segment, 0L, index); }
    /// {@return `pImageIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pImageIndices(MemorySegment segment) { return VkReleaseSwapchainImagesInfoEXT.get_pImageIndices(segment, 0L); }
    /// {@return `pImageIndices`}
    public @CType("const uint32_t *") MemorySegment pImageIndices() { return VkReleaseSwapchainImagesInfoEXT.get_pImageIndices(this.segment()); }
    /// Sets `pImageIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageIndices(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pImageIndices.set(segment, 0L, index, value); }
    /// Sets `pImageIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageIndices(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_pImageIndices(segment, 0L, value); }
    /// Sets `pImageIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT pImageIndices(@CType("const uint32_t *") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_pImageIndices(this.segment(), value); return this; }

    /// A buffer of [VkReleaseSwapchainImagesInfoEXT].
    public static final class Buffer extends VkReleaseSwapchainImagesInfoEXT {
        private final long elementCount;

        /// Creates `VkReleaseSwapchainImagesInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkReleaseSwapchainImagesInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkReleaseSwapchainImagesInfoEXT`
        public VkReleaseSwapchainImagesInfoEXT asSlice(long index) { return new VkReleaseSwapchainImagesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkReleaseSwapchainImagesInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkReleaseSwapchainImagesInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkReleaseSwapchainImagesInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkReleaseSwapchainImagesInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkReleaseSwapchainImagesInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `swapchain` at the given index}
        /// @param index the index
        public @CType("VkSwapchainKHR") MemorySegment swapchainAt(long index) { return VkReleaseSwapchainImagesInfoEXT.get_swapchain(this.segment(), index); }
        /// Sets `swapchain` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer swapchainAt(long index, @CType("VkSwapchainKHR") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_swapchain(this.segment(), index, value); return this; }

        /// {@return `imageIndexCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int imageIndexCountAt(long index) { return VkReleaseSwapchainImagesInfoEXT.get_imageIndexCount(this.segment(), index); }
        /// Sets `imageIndexCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageIndexCountAt(long index, @CType("uint32_t") int value) { VkReleaseSwapchainImagesInfoEXT.set_imageIndexCount(this.segment(), index, value); return this; }

        /// {@return `pImageIndices` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pImageIndicesAt(long index) { return VkReleaseSwapchainImagesInfoEXT.get_pImageIndices(this.segment(), index); }
        /// Sets `pImageIndices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImageIndicesAt(long index, @CType("const uint32_t *") MemorySegment value) { VkReleaseSwapchainImagesInfoEXT.set_pImageIndices(this.segment(), index, value); return this; }

    }
}
