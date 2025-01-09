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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### surface
/// [VarHandle][#VH_surface] - [Getter][#surface()] - [Setter][#surface(java.lang.foreign.MemorySegment)]
/// ### minImageCount
/// [VarHandle][#VH_minImageCount] - [Getter][#minImageCount()] - [Setter][#minImageCount(int)]
/// ### imageFormat
/// [VarHandle][#VH_imageFormat] - [Getter][#imageFormat()] - [Setter][#imageFormat(int)]
/// ### imageColorSpace
/// [VarHandle][#VH_imageColorSpace] - [Getter][#imageColorSpace()] - [Setter][#imageColorSpace(int)]
/// ### imageExtent
/// [Byte offset][#OFFSET_imageExtent] - [Memory layout][#ML_imageExtent] - [Getter][#imageExtent()] - [Setter][#imageExtent(java.lang.foreign.MemorySegment)]
/// ### imageArrayLayers
/// [VarHandle][#VH_imageArrayLayers] - [Getter][#imageArrayLayers()] - [Setter][#imageArrayLayers(int)]
/// ### imageUsage
/// [VarHandle][#VH_imageUsage] - [Getter][#imageUsage()] - [Setter][#imageUsage(int)]
/// ### imageSharingMode
/// [VarHandle][#VH_imageSharingMode] - [Getter][#imageSharingMode()] - [Setter][#imageSharingMode(int)]
/// ### queueFamilyIndexCount
/// [VarHandle][#VH_queueFamilyIndexCount] - [Getter][#queueFamilyIndexCount()] - [Setter][#queueFamilyIndexCount(int)]
/// ### pQueueFamilyIndices
/// [VarHandle][#VH_pQueueFamilyIndices] - [Getter][#pQueueFamilyIndices()] - [Setter][#pQueueFamilyIndices(java.lang.foreign.MemorySegment)]
/// ### preTransform
/// [VarHandle][#VH_preTransform] - [Getter][#preTransform()] - [Setter][#preTransform(int)]
/// ### compositeAlpha
/// [VarHandle][#VH_compositeAlpha] - [Getter][#compositeAlpha()] - [Setter][#compositeAlpha(int)]
/// ### presentMode
/// [VarHandle][#VH_presentMode] - [Getter][#presentMode()] - [Setter][#presentMode(int)]
/// ### clipped
/// [VarHandle][#VH_clipped] - [Getter][#clipped()] - [Setter][#clipped(int)]
/// ### oldSwapchain
/// [VarHandle][#VH_oldSwapchain] - [Getter][#oldSwapchain()] - [Setter][#oldSwapchain(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSwapchainCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkSwapchainCreateFlagsKHR flags;
///     VkSurfaceKHR surface;
///     uint32_t minImageCount;
///     VkFormat imageFormat;
///     VkColorSpaceKHR imageColorSpace;
///     VkExtent2D imageExtent;
///     uint32_t imageArrayLayers;
///     VkImageUsageFlags imageUsage;
///     VkSharingMode imageSharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t * pQueueFamilyIndices;
///     VkSurfaceTransformFlagBitsKHR preTransform;
///     VkCompositeAlphaFlagBitsKHR compositeAlpha;
///     VkPresentModeKHR presentMode;
///     VkBool32 clipped;
///     VkSwapchainKHR oldSwapchain;
/// } VkSwapchainCreateInfoKHR;
/// ```
public final class VkSwapchainCreateInfoKHR extends Struct {
    /// The struct layout of `VkSwapchainCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("surface"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("imageColorSpace"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("imageExtent"),
        ValueLayout.JAVA_INT.withName("imageArrayLayers"),
        ValueLayout.JAVA_INT.withName("imageUsage"),
        ValueLayout.JAVA_INT.withName("imageSharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices"),
        ValueLayout.JAVA_INT.withName("preTransform"),
        ValueLayout.JAVA_INT.withName("compositeAlpha"),
        ValueLayout.JAVA_INT.withName("presentMode"),
        ValueLayout.JAVA_INT.withName("clipped"),
        ValueLayout.ADDRESS.withName("oldSwapchain")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));
    /// The [VarHandle] of `minImageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageCount"));
    /// The [VarHandle] of `imageFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormat"));
    /// The [VarHandle] of `imageColorSpace` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageColorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageColorSpace"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout ML_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    /// The [VarHandle] of `imageArrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageArrayLayers"));
    /// The [VarHandle] of `imageUsage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsage"));
    /// The [VarHandle] of `imageSharingMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageSharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSharingMode"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));
    /// The [VarHandle] of `preTransform` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preTransform"));
    /// The [VarHandle] of `compositeAlpha` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compositeAlpha"));
    /// The [VarHandle] of `presentMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMode"));
    /// The [VarHandle] of `clipped` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_clipped = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clipped"));
    /// The [VarHandle] of `oldSwapchain` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_oldSwapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldSwapchain"));

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment); }

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSwapchainCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainCreateInfoKHR`
    public static VkSwapchainCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainCreateInfoKHR`
    public static VkSwapchainCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSwapchainCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSwapchainCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSwapchainCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSwapchainCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkSwapchainCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR sType(@CType("VkStructureType") int value) { VkSwapchainCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSwapchainCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSwapchainCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSwapchainCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSwapchainCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkSwapchainCreateFlagsKHR") int flagsAt(long index) { return VkSwapchainCreateInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkSwapchainCreateFlagsKHR") int flags() { return VkSwapchainCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSwapchainCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSwapchainCreateFlagsKHR") int value) { VkSwapchainCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR flagsAt(long index, @CType("VkSwapchainCreateFlagsKHR") int value) { VkSwapchainCreateInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR flags(@CType("VkSwapchainCreateFlagsKHR") int value) { VkSwapchainCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment get_surface(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment get_surface(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_surface(segment, 0L); }
    /// {@return `surface` at the given index}
    /// @param index the index
    public @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment surfaceAt(long index) { return VkSwapchainCreateInfoKHR.get_surface(this.segment(), index); }
    /// {@return `surface`}
    public @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment surface() { return VkSwapchainCreateInfoKHR.get_surface(this.segment()); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surface(MemorySegment segment, long index, @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surface(MemorySegment segment, @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_surface(segment, 0L, value); }
    /// Sets `surface` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR surfaceAt(long index, @CType("VkSurfaceKHR") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_surface(this.segment(), index, value); return this; }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR surface(@CType("VkSurfaceKHR") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_surface(this.segment(), value); return this; }

    /// {@return `minImageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minImageCount(MemorySegment segment, long index) { return (int) VH_minImageCount.get(segment, 0L, index); }
    /// {@return `minImageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minImageCount(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_minImageCount(segment, 0L); }
    /// {@return `minImageCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minImageCountAt(long index) { return VkSwapchainCreateInfoKHR.get_minImageCount(this.segment(), index); }
    /// {@return `minImageCount`}
    public @CType("uint32_t") int minImageCount() { return VkSwapchainCreateInfoKHR.get_minImageCount(this.segment()); }
    /// Sets `minImageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minImageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minImageCount.set(segment, 0L, index, value); }
    /// Sets `minImageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minImageCount(MemorySegment segment, @CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_minImageCount(segment, 0L, value); }
    /// Sets `minImageCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR minImageCountAt(long index, @CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_minImageCount(this.segment(), index, value); return this; }
    /// Sets `minImageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR minImageCount(@CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_minImageCount(this.segment(), value); return this; }

    /// {@return `imageFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_imageFormat(MemorySegment segment, long index) { return (int) VH_imageFormat.get(segment, 0L, index); }
    /// {@return `imageFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_imageFormat(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_imageFormat(segment, 0L); }
    /// {@return `imageFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int imageFormatAt(long index) { return VkSwapchainCreateInfoKHR.get_imageFormat(this.segment(), index); }
    /// {@return `imageFormat`}
    public @CType("VkFormat") int imageFormat() { return VkSwapchainCreateInfoKHR.get_imageFormat(this.segment()); }
    /// Sets `imageFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_imageFormat.set(segment, 0L, index, value); }
    /// Sets `imageFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageFormat(MemorySegment segment, @CType("VkFormat") int value) { VkSwapchainCreateInfoKHR.set_imageFormat(segment, 0L, value); }
    /// Sets `imageFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageFormatAt(long index, @CType("VkFormat") int value) { VkSwapchainCreateInfoKHR.set_imageFormat(this.segment(), index, value); return this; }
    /// Sets `imageFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageFormat(@CType("VkFormat") int value) { VkSwapchainCreateInfoKHR.set_imageFormat(this.segment(), value); return this; }

    /// {@return `imageColorSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkColorSpaceKHR") int get_imageColorSpace(MemorySegment segment, long index) { return (int) VH_imageColorSpace.get(segment, 0L, index); }
    /// {@return `imageColorSpace`}
    /// @param segment the segment of the struct
    public static @CType("VkColorSpaceKHR") int get_imageColorSpace(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_imageColorSpace(segment, 0L); }
    /// {@return `imageColorSpace` at the given index}
    /// @param index the index
    public @CType("VkColorSpaceKHR") int imageColorSpaceAt(long index) { return VkSwapchainCreateInfoKHR.get_imageColorSpace(this.segment(), index); }
    /// {@return `imageColorSpace`}
    public @CType("VkColorSpaceKHR") int imageColorSpace() { return VkSwapchainCreateInfoKHR.get_imageColorSpace(this.segment()); }
    /// Sets `imageColorSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageColorSpace(MemorySegment segment, long index, @CType("VkColorSpaceKHR") int value) { VH_imageColorSpace.set(segment, 0L, index, value); }
    /// Sets `imageColorSpace` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageColorSpace(MemorySegment segment, @CType("VkColorSpaceKHR") int value) { VkSwapchainCreateInfoKHR.set_imageColorSpace(segment, 0L, value); }
    /// Sets `imageColorSpace` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageColorSpaceAt(long index, @CType("VkColorSpaceKHR") int value) { VkSwapchainCreateInfoKHR.set_imageColorSpace(this.segment(), index, value); return this; }
    /// Sets `imageColorSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageColorSpace(@CType("VkColorSpaceKHR") int value) { VkSwapchainCreateInfoKHR.set_imageColorSpace(this.segment(), value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent); }
    /// {@return `imageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_imageExtent(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_imageExtent(segment, 0L); }
    /// {@return `imageExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment imageExtentAt(long index) { return VkSwapchainCreateInfoKHR.get_imageExtent(this.segment(), index); }
    /// {@return `imageExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment imageExtent() { return VkSwapchainCreateInfoKHR.get_imageExtent(this.segment()); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_imageExtent(segment, 0L, value); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_imageExtent(this.segment(), index, value); return this; }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_imageExtent(this.segment(), value); return this; }

    /// {@return `imageArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageArrayLayers(MemorySegment segment, long index) { return (int) VH_imageArrayLayers.get(segment, 0L, index); }
    /// {@return `imageArrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageArrayLayers(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_imageArrayLayers(segment, 0L); }
    /// {@return `imageArrayLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int imageArrayLayersAt(long index) { return VkSwapchainCreateInfoKHR.get_imageArrayLayers(this.segment(), index); }
    /// {@return `imageArrayLayers`}
    public @CType("uint32_t") int imageArrayLayers() { return VkSwapchainCreateInfoKHR.get_imageArrayLayers(this.segment()); }
    /// Sets `imageArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageArrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageArrayLayers.set(segment, 0L, index, value); }
    /// Sets `imageArrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageArrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_imageArrayLayers(segment, 0L, value); }
    /// Sets `imageArrayLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageArrayLayersAt(long index, @CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_imageArrayLayers(this.segment(), index, value); return this; }
    /// Sets `imageArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageArrayLayers(@CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_imageArrayLayers(this.segment(), value); return this; }

    /// {@return `imageUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_imageUsage(MemorySegment segment, long index) { return (int) VH_imageUsage.get(segment, 0L, index); }
    /// {@return `imageUsage`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_imageUsage(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_imageUsage(segment, 0L); }
    /// {@return `imageUsage` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int imageUsageAt(long index) { return VkSwapchainCreateInfoKHR.get_imageUsage(this.segment(), index); }
    /// {@return `imageUsage`}
    public @CType("VkImageUsageFlags") int imageUsage() { return VkSwapchainCreateInfoKHR.get_imageUsage(this.segment()); }
    /// Sets `imageUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageUsage(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_imageUsage.set(segment, 0L, index, value); }
    /// Sets `imageUsage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageUsage(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkSwapchainCreateInfoKHR.set_imageUsage(segment, 0L, value); }
    /// Sets `imageUsage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageUsageAt(long index, @CType("VkImageUsageFlags") int value) { VkSwapchainCreateInfoKHR.set_imageUsage(this.segment(), index, value); return this; }
    /// Sets `imageUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageUsage(@CType("VkImageUsageFlags") int value) { VkSwapchainCreateInfoKHR.set_imageUsage(this.segment(), value); return this; }

    /// {@return `imageSharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSharingMode") int get_imageSharingMode(MemorySegment segment, long index) { return (int) VH_imageSharingMode.get(segment, 0L, index); }
    /// {@return `imageSharingMode`}
    /// @param segment the segment of the struct
    public static @CType("VkSharingMode") int get_imageSharingMode(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_imageSharingMode(segment, 0L); }
    /// {@return `imageSharingMode` at the given index}
    /// @param index the index
    public @CType("VkSharingMode") int imageSharingModeAt(long index) { return VkSwapchainCreateInfoKHR.get_imageSharingMode(this.segment(), index); }
    /// {@return `imageSharingMode`}
    public @CType("VkSharingMode") int imageSharingMode() { return VkSwapchainCreateInfoKHR.get_imageSharingMode(this.segment()); }
    /// Sets `imageSharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageSharingMode(MemorySegment segment, long index, @CType("VkSharingMode") int value) { VH_imageSharingMode.set(segment, 0L, index, value); }
    /// Sets `imageSharingMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageSharingMode(MemorySegment segment, @CType("VkSharingMode") int value) { VkSwapchainCreateInfoKHR.set_imageSharingMode(segment, 0L, value); }
    /// Sets `imageSharingMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageSharingModeAt(long index, @CType("VkSharingMode") int value) { VkSwapchainCreateInfoKHR.set_imageSharingMode(this.segment(), index, value); return this; }
    /// Sets `imageSharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageSharingMode(@CType("VkSharingMode") int value) { VkSwapchainCreateInfoKHR.set_imageSharingMode(this.segment(), value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_queueFamilyIndexCount(segment, 0L); }
    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueFamilyIndexCountAt(long index) { return VkSwapchainCreateInfoKHR.get_queueFamilyIndexCount(this.segment(), index); }
    /// {@return `queueFamilyIndexCount`}
    public @CType("uint32_t") int queueFamilyIndexCount() { return VkSwapchainCreateInfoKHR.get_queueFamilyIndexCount(this.segment()); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_queueFamilyIndexCount(segment, 0L, value); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR queueFamilyIndexCountAt(long index, @CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_queueFamilyIndexCount(this.segment(), index, value); return this; }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(@CType("uint32_t") int value) { VkSwapchainCreateInfoKHR.set_queueFamilyIndexCount(this.segment(), value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_pQueueFamilyIndices(segment, 0L); }
    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndicesAt(long index) { return VkSwapchainCreateInfoKHR.get_pQueueFamilyIndices(this.segment(), index); }
    /// {@return `pQueueFamilyIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndices() { return VkSwapchainCreateInfoKHR.get_pQueueFamilyIndices(this.segment()); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_pQueueFamilyIndices(segment, 0L, value); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR pQueueFamilyIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_pQueueFamilyIndices(this.segment(), index, value); return this; }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_pQueueFamilyIndices(this.segment(), value); return this; }

    /// {@return `preTransform` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_preTransform(MemorySegment segment, long index) { return (int) VH_preTransform.get(segment, 0L, index); }
    /// {@return `preTransform`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_preTransform(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_preTransform(segment, 0L); }
    /// {@return `preTransform` at the given index}
    /// @param index the index
    public @CType("VkSurfaceTransformFlagBitsKHR") int preTransformAt(long index) { return VkSwapchainCreateInfoKHR.get_preTransform(this.segment(), index); }
    /// {@return `preTransform`}
    public @CType("VkSurfaceTransformFlagBitsKHR") int preTransform() { return VkSwapchainCreateInfoKHR.get_preTransform(this.segment()); }
    /// Sets `preTransform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preTransform(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VH_preTransform.set(segment, 0L, index, value); }
    /// Sets `preTransform` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preTransform(MemorySegment segment, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.set_preTransform(segment, 0L, value); }
    /// Sets `preTransform` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR preTransformAt(long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.set_preTransform(this.segment(), index, value); return this; }
    /// Sets `preTransform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR preTransform(@CType("VkSurfaceTransformFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.set_preTransform(this.segment(), value); return this; }

    /// {@return `compositeAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCompositeAlphaFlagBitsKHR") int get_compositeAlpha(MemorySegment segment, long index) { return (int) VH_compositeAlpha.get(segment, 0L, index); }
    /// {@return `compositeAlpha`}
    /// @param segment the segment of the struct
    public static @CType("VkCompositeAlphaFlagBitsKHR") int get_compositeAlpha(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_compositeAlpha(segment, 0L); }
    /// {@return `compositeAlpha` at the given index}
    /// @param index the index
    public @CType("VkCompositeAlphaFlagBitsKHR") int compositeAlphaAt(long index) { return VkSwapchainCreateInfoKHR.get_compositeAlpha(this.segment(), index); }
    /// {@return `compositeAlpha`}
    public @CType("VkCompositeAlphaFlagBitsKHR") int compositeAlpha() { return VkSwapchainCreateInfoKHR.get_compositeAlpha(this.segment()); }
    /// Sets `compositeAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compositeAlpha(MemorySegment segment, long index, @CType("VkCompositeAlphaFlagBitsKHR") int value) { VH_compositeAlpha.set(segment, 0L, index, value); }
    /// Sets `compositeAlpha` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compositeAlpha(MemorySegment segment, @CType("VkCompositeAlphaFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.set_compositeAlpha(segment, 0L, value); }
    /// Sets `compositeAlpha` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR compositeAlphaAt(long index, @CType("VkCompositeAlphaFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.set_compositeAlpha(this.segment(), index, value); return this; }
    /// Sets `compositeAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR compositeAlpha(@CType("VkCompositeAlphaFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.set_compositeAlpha(this.segment(), value); return this; }

    /// {@return `presentMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentModeKHR") int get_presentMode(MemorySegment segment, long index) { return (int) VH_presentMode.get(segment, 0L, index); }
    /// {@return `presentMode`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentModeKHR") int get_presentMode(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_presentMode(segment, 0L); }
    /// {@return `presentMode` at the given index}
    /// @param index the index
    public @CType("VkPresentModeKHR") int presentModeAt(long index) { return VkSwapchainCreateInfoKHR.get_presentMode(this.segment(), index); }
    /// {@return `presentMode`}
    public @CType("VkPresentModeKHR") int presentMode() { return VkSwapchainCreateInfoKHR.get_presentMode(this.segment()); }
    /// Sets `presentMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentMode(MemorySegment segment, long index, @CType("VkPresentModeKHR") int value) { VH_presentMode.set(segment, 0L, index, value); }
    /// Sets `presentMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentMode(MemorySegment segment, @CType("VkPresentModeKHR") int value) { VkSwapchainCreateInfoKHR.set_presentMode(segment, 0L, value); }
    /// Sets `presentMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR presentModeAt(long index, @CType("VkPresentModeKHR") int value) { VkSwapchainCreateInfoKHR.set_presentMode(this.segment(), index, value); return this; }
    /// Sets `presentMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR presentMode(@CType("VkPresentModeKHR") int value) { VkSwapchainCreateInfoKHR.set_presentMode(this.segment(), value); return this; }

    /// {@return `clipped` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_clipped(MemorySegment segment, long index) { return (int) VH_clipped.get(segment, 0L, index); }
    /// {@return `clipped`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_clipped(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_clipped(segment, 0L); }
    /// {@return `clipped` at the given index}
    /// @param index the index
    public @CType("VkBool32") int clippedAt(long index) { return VkSwapchainCreateInfoKHR.get_clipped(this.segment(), index); }
    /// {@return `clipped`}
    public @CType("VkBool32") int clipped() { return VkSwapchainCreateInfoKHR.get_clipped(this.segment()); }
    /// Sets `clipped` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clipped(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_clipped.set(segment, 0L, index, value); }
    /// Sets `clipped` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clipped(MemorySegment segment, @CType("VkBool32") int value) { VkSwapchainCreateInfoKHR.set_clipped(segment, 0L, value); }
    /// Sets `clipped` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR clippedAt(long index, @CType("VkBool32") int value) { VkSwapchainCreateInfoKHR.set_clipped(this.segment(), index, value); return this; }
    /// Sets `clipped` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR clipped(@CType("VkBool32") int value) { VkSwapchainCreateInfoKHR.set_clipped(this.segment(), value); return this; }

    /// {@return `oldSwapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment get_oldSwapchain(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_oldSwapchain.get(segment, 0L, index); }
    /// {@return `oldSwapchain`}
    /// @param segment the segment of the struct
    public static @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment get_oldSwapchain(MemorySegment segment) { return VkSwapchainCreateInfoKHR.get_oldSwapchain(segment, 0L); }
    /// {@return `oldSwapchain` at the given index}
    /// @param index the index
    public @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment oldSwapchainAt(long index) { return VkSwapchainCreateInfoKHR.get_oldSwapchain(this.segment(), index); }
    /// {@return `oldSwapchain`}
    public @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment oldSwapchain() { return VkSwapchainCreateInfoKHR.get_oldSwapchain(this.segment()); }
    /// Sets `oldSwapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_oldSwapchain(MemorySegment segment, long index, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VH_oldSwapchain.set(segment, 0L, index, value); }
    /// Sets `oldSwapchain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_oldSwapchain(MemorySegment segment, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_oldSwapchain(segment, 0L, value); }
    /// Sets `oldSwapchain` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR oldSwapchainAt(long index, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_oldSwapchain(this.segment(), index, value); return this; }
    /// Sets `oldSwapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR oldSwapchain(@CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkSwapchainCreateInfoKHR.set_oldSwapchain(this.segment(), value); return this; }

}
