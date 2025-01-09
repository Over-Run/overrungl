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
/// ### swapchain
/// [VarHandle][#VH_swapchain] - [Getter][#swapchain()] - [Setter][#swapchain(java.lang.foreign.MemorySegment)]
/// ### imageIndex
/// [VarHandle][#VH_imageIndex] - [Getter][#imageIndex()] - [Setter][#imageIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindImageMemorySwapchainInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkSwapchainKHR swapchain;
///     uint32_t imageIndex;
/// } VkBindImageMemorySwapchainInfoKHR;
/// ```
public final class VkBindImageMemorySwapchainInfoKHR extends Struct {
    /// The struct layout of `VkBindImageMemorySwapchainInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchain` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    /// The [VarHandle] of `imageIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageIndex"));

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR alloc(SegmentAllocator allocator) { return new VkBindImageMemorySwapchainInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBindImageMemorySwapchainInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindImageMemorySwapchainInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBindImageMemorySwapchainInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindImageMemorySwapchainInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindImageMemorySwapchainInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkBindImageMemorySwapchainInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR sType(@CType("VkStructureType") int value) { VkBindImageMemorySwapchainInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBindImageMemorySwapchainInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBindImageMemorySwapchainInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBindImageMemorySwapchainInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindImageMemorySwapchainInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindImageMemorySwapchainInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBindImageMemorySwapchainInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment get_swapchain(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_swapchain.get(segment, 0L, index); }
    /// {@return `swapchain`}
    /// @param segment the segment of the struct
    public static @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment get_swapchain(MemorySegment segment) { return VkBindImageMemorySwapchainInfoKHR.get_swapchain(segment, 0L); }
    /// {@return `swapchain` at the given index}
    /// @param index the index
    public @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment swapchainAt(long index) { return VkBindImageMemorySwapchainInfoKHR.get_swapchain(this.segment(), index); }
    /// {@return `swapchain`}
    public @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment swapchain() { return VkBindImageMemorySwapchainInfoKHR.get_swapchain(this.segment()); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchain(MemorySegment segment, long index, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VH_swapchain.set(segment, 0L, index, value); }
    /// Sets `swapchain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchain(MemorySegment segment, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkBindImageMemorySwapchainInfoKHR.set_swapchain(segment, 0L, value); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR swapchainAt(long index, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkBindImageMemorySwapchainInfoKHR.set_swapchain(this.segment(), index, value); return this; }
    /// Sets `swapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR swapchain(@CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkBindImageMemorySwapchainInfoKHR.set_swapchain(this.segment(), value); return this; }

    /// {@return `imageIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageIndex(MemorySegment segment, long index) { return (int) VH_imageIndex.get(segment, 0L, index); }
    /// {@return `imageIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageIndex(MemorySegment segment) { return VkBindImageMemorySwapchainInfoKHR.get_imageIndex(segment, 0L); }
    /// {@return `imageIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int imageIndexAt(long index) { return VkBindImageMemorySwapchainInfoKHR.get_imageIndex(this.segment(), index); }
    /// {@return `imageIndex`}
    public @CType("uint32_t") int imageIndex() { return VkBindImageMemorySwapchainInfoKHR.get_imageIndex(this.segment()); }
    /// Sets `imageIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageIndex.set(segment, 0L, index, value); }
    /// Sets `imageIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBindImageMemorySwapchainInfoKHR.set_imageIndex(segment, 0L, value); }
    /// Sets `imageIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR imageIndexAt(long index, @CType("uint32_t") int value) { VkBindImageMemorySwapchainInfoKHR.set_imageIndex(this.segment(), index, value); return this; }
    /// Sets `imageIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR imageIndex(@CType("uint32_t") int value) { VkBindImageMemorySwapchainInfoKHR.set_imageIndex(this.segment(), value); return this; }

}
