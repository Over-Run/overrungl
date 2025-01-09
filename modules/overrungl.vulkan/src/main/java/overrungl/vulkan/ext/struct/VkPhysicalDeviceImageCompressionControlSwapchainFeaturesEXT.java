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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### imageCompressionControlSwapchain
/// [VarHandle][#VH_imageCompressionControlSwapchain] - [Getter][#imageCompressionControlSwapchain()] - [Setter][#imageCompressionControlSwapchain(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 imageCompressionControlSwapchain;
/// } VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT;
/// ```
public final class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionControlSwapchain")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageCompressionControlSwapchain` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageCompressionControlSwapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionControlSwapchain"));

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `imageCompressionControlSwapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imageCompressionControlSwapchain(MemorySegment segment, long index) { return (int) VH_imageCompressionControlSwapchain.get(segment, 0L, index); }
    /// {@return `imageCompressionControlSwapchain`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imageCompressionControlSwapchain(MemorySegment segment) { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_imageCompressionControlSwapchain(segment, 0L); }
    /// {@return `imageCompressionControlSwapchain` at the given index}
    /// @param index the index
    public @CType("VkBool32") int imageCompressionControlSwapchainAt(long index) { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_imageCompressionControlSwapchain(this.segment(), index); }
    /// {@return `imageCompressionControlSwapchain`}
    public @CType("VkBool32") int imageCompressionControlSwapchain() { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.get_imageCompressionControlSwapchain(this.segment()); }
    /// Sets `imageCompressionControlSwapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCompressionControlSwapchain(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imageCompressionControlSwapchain.set(segment, 0L, index, value); }
    /// Sets `imageCompressionControlSwapchain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCompressionControlSwapchain(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_imageCompressionControlSwapchain(segment, 0L, value); }
    /// Sets `imageCompressionControlSwapchain` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchainAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_imageCompressionControlSwapchain(this.segment(), index, value); return this; }
    /// Sets `imageCompressionControlSwapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchain(@CType("VkBool32") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.set_imageCompressionControlSwapchain(this.segment(), value); return this; }

}
