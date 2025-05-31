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
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSwapchainCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkSwapchainCreateFlagsKHR flags;
///     (uint64_t) VkSurfaceKHR surface;
///     uint32_t minImageCount;
///     (int) VkFormat imageFormat;
///     (int) VkColorSpaceKHR imageColorSpace;
///     (struct VkExtent2D) VkExtent2D imageExtent;
///     uint32_t imageArrayLayers;
///     ((uint32_t) VkFlags) VkImageUsageFlags imageUsage;
///     (int) VkSharingMode imageSharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
///     (int) VkSurfaceTransformFlagBitsKHR preTransform;
///     (int) VkCompositeAlphaFlagBitsKHR compositeAlpha;
///     (int) VkPresentModeKHR presentMode;
///     (uint32_t) VkBool32 clipped;
///     (uint64_t) VkSwapchainKHR oldSwapchain;
/// };
/// ```
public sealed class VkSwapchainCreateInfoKHR extends GroupType {
    /// The struct layout of `VkSwapchainCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("surface"),
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
        ValueLayout.JAVA_LONG.withName("oldSwapchain")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `surface`.
    public static final long OFFSET_surface = LAYOUT.byteOffset(PathElement.groupElement("surface"));
    /// The memory layout of `surface`.
    public static final MemoryLayout LAYOUT_surface = LAYOUT.select(PathElement.groupElement("surface"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));
    /// The byte offset of `minImageCount`.
    public static final long OFFSET_minImageCount = LAYOUT.byteOffset(PathElement.groupElement("minImageCount"));
    /// The memory layout of `minImageCount`.
    public static final MemoryLayout LAYOUT_minImageCount = LAYOUT.select(PathElement.groupElement("minImageCount"));
    /// The [VarHandle] of `minImageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageCount"));
    /// The byte offset of `imageFormat`.
    public static final long OFFSET_imageFormat = LAYOUT.byteOffset(PathElement.groupElement("imageFormat"));
    /// The memory layout of `imageFormat`.
    public static final MemoryLayout LAYOUT_imageFormat = LAYOUT.select(PathElement.groupElement("imageFormat"));
    /// The [VarHandle] of `imageFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormat"));
    /// The byte offset of `imageColorSpace`.
    public static final long OFFSET_imageColorSpace = LAYOUT.byteOffset(PathElement.groupElement("imageColorSpace"));
    /// The memory layout of `imageColorSpace`.
    public static final MemoryLayout LAYOUT_imageColorSpace = LAYOUT.select(PathElement.groupElement("imageColorSpace"));
    /// The [VarHandle] of `imageColorSpace` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageColorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageColorSpace"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    /// The byte offset of `imageArrayLayers`.
    public static final long OFFSET_imageArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("imageArrayLayers"));
    /// The memory layout of `imageArrayLayers`.
    public static final MemoryLayout LAYOUT_imageArrayLayers = LAYOUT.select(PathElement.groupElement("imageArrayLayers"));
    /// The [VarHandle] of `imageArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageArrayLayers"));
    /// The byte offset of `imageUsage`.
    public static final long OFFSET_imageUsage = LAYOUT.byteOffset(PathElement.groupElement("imageUsage"));
    /// The memory layout of `imageUsage`.
    public static final MemoryLayout LAYOUT_imageUsage = LAYOUT.select(PathElement.groupElement("imageUsage"));
    /// The [VarHandle] of `imageUsage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsage"));
    /// The byte offset of `imageSharingMode`.
    public static final long OFFSET_imageSharingMode = LAYOUT.byteOffset(PathElement.groupElement("imageSharingMode"));
    /// The memory layout of `imageSharingMode`.
    public static final MemoryLayout LAYOUT_imageSharingMode = LAYOUT.select(PathElement.groupElement("imageSharingMode"));
    /// The [VarHandle] of `imageSharingMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageSharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSharingMode"));
    /// The byte offset of `queueFamilyIndexCount`.
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    /// The memory layout of `queueFamilyIndexCount`.
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The byte offset of `pQueueFamilyIndices`.
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    /// The memory layout of `pQueueFamilyIndices`.
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));
    /// The byte offset of `preTransform`.
    public static final long OFFSET_preTransform = LAYOUT.byteOffset(PathElement.groupElement("preTransform"));
    /// The memory layout of `preTransform`.
    public static final MemoryLayout LAYOUT_preTransform = LAYOUT.select(PathElement.groupElement("preTransform"));
    /// The [VarHandle] of `preTransform` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preTransform"));
    /// The byte offset of `compositeAlpha`.
    public static final long OFFSET_compositeAlpha = LAYOUT.byteOffset(PathElement.groupElement("compositeAlpha"));
    /// The memory layout of `compositeAlpha`.
    public static final MemoryLayout LAYOUT_compositeAlpha = LAYOUT.select(PathElement.groupElement("compositeAlpha"));
    /// The [VarHandle] of `compositeAlpha` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compositeAlpha"));
    /// The byte offset of `presentMode`.
    public static final long OFFSET_presentMode = LAYOUT.byteOffset(PathElement.groupElement("presentMode"));
    /// The memory layout of `presentMode`.
    public static final MemoryLayout LAYOUT_presentMode = LAYOUT.select(PathElement.groupElement("presentMode"));
    /// The [VarHandle] of `presentMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMode"));
    /// The byte offset of `clipped`.
    public static final long OFFSET_clipped = LAYOUT.byteOffset(PathElement.groupElement("clipped"));
    /// The memory layout of `clipped`.
    public static final MemoryLayout LAYOUT_clipped = LAYOUT.select(PathElement.groupElement("clipped"));
    /// The [VarHandle] of `clipped` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clipped = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clipped"));
    /// The byte offset of `oldSwapchain`.
    public static final long OFFSET_oldSwapchain = LAYOUT.byteOffset(PathElement.groupElement("oldSwapchain"));
    /// The memory layout of `oldSwapchain`.
    public static final MemoryLayout LAYOUT_oldSwapchain = LAYOUT.select(PathElement.groupElement("oldSwapchain"));
    /// The [VarHandle] of `oldSwapchain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_oldSwapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldSwapchain"));

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSwapchainCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSwapchainCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainCreateInfoKHR`
    public static VkSwapchainCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainCreateInfoKHR copyFrom(VkSwapchainCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long surface(MemorySegment segment, long index) { return (long) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    public long surface() { return surface(this.segment(), 0L); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void surface(MemorySegment segment, long index, long value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR surface(long value) { surface(this.segment(), 0L, value); return this; }

    /// {@return `minImageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minImageCount(MemorySegment segment, long index) { return (int) VH_minImageCount.get(segment, 0L, index); }
    /// {@return `minImageCount`}
    public int minImageCount() { return minImageCount(this.segment(), 0L); }
    /// Sets `minImageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minImageCount(MemorySegment segment, long index, int value) { VH_minImageCount.set(segment, 0L, index, value); }
    /// Sets `minImageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR minImageCount(int value) { minImageCount(this.segment(), 0L, value); return this; }

    /// {@return `imageFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageFormat(MemorySegment segment, long index) { return (int) VH_imageFormat.get(segment, 0L, index); }
    /// {@return `imageFormat`}
    public int imageFormat() { return imageFormat(this.segment(), 0L); }
    /// Sets `imageFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageFormat(MemorySegment segment, long index, int value) { VH_imageFormat.set(segment, 0L, index, value); }
    /// Sets `imageFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageFormat(int value) { imageFormat(this.segment(), 0L, value); return this; }

    /// {@return `imageColorSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageColorSpace(MemorySegment segment, long index) { return (int) VH_imageColorSpace.get(segment, 0L, index); }
    /// {@return `imageColorSpace`}
    public int imageColorSpace() { return imageColorSpace(this.segment(), 0L); }
    /// Sets `imageColorSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageColorSpace(MemorySegment segment, long index, int value) { VH_imageColorSpace.set(segment, 0L, index, value); }
    /// Sets `imageColorSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageColorSpace(int value) { imageColorSpace(this.segment(), 0L, value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    /// {@return `imageExtent`}
    public MemorySegment imageExtent() { return imageExtent(this.segment(), 0L); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageExtent(MemorySegment value) { imageExtent(this.segment(), 0L, value); return this; }

    /// {@return `imageArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageArrayLayers(MemorySegment segment, long index) { return (int) VH_imageArrayLayers.get(segment, 0L, index); }
    /// {@return `imageArrayLayers`}
    public int imageArrayLayers() { return imageArrayLayers(this.segment(), 0L); }
    /// Sets `imageArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageArrayLayers(MemorySegment segment, long index, int value) { VH_imageArrayLayers.set(segment, 0L, index, value); }
    /// Sets `imageArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageArrayLayers(int value) { imageArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `imageUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageUsage(MemorySegment segment, long index) { return (int) VH_imageUsage.get(segment, 0L, index); }
    /// {@return `imageUsage`}
    public int imageUsage() { return imageUsage(this.segment(), 0L); }
    /// Sets `imageUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageUsage(MemorySegment segment, long index, int value) { VH_imageUsage.set(segment, 0L, index, value); }
    /// Sets `imageUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageUsage(int value) { imageUsage(this.segment(), 0L, value); return this; }

    /// {@return `imageSharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageSharingMode(MemorySegment segment, long index) { return (int) VH_imageSharingMode.get(segment, 0L, index); }
    /// {@return `imageSharingMode`}
    public int imageSharingMode() { return imageSharingMode(this.segment(), 0L); }
    /// Sets `imageSharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageSharingMode(MemorySegment segment, long index, int value) { VH_imageSharingMode.set(segment, 0L, index, value); }
    /// Sets `imageSharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR imageSharingMode(int value) { imageSharingMode(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    public int queueFamilyIndexCount() { return queueFamilyIndexCount(this.segment(), 0L); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndexCount(MemorySegment segment, long index, int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(int value) { queueFamilyIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQueueFamilyIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    public MemorySegment pQueueFamilyIndices() { return pQueueFamilyIndices(this.segment(), 0L); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQueueFamilyIndices(MemorySegment segment, long index, MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(MemorySegment value) { pQueueFamilyIndices(this.segment(), 0L, value); return this; }

    /// {@return `preTransform` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preTransform(MemorySegment segment, long index) { return (int) VH_preTransform.get(segment, 0L, index); }
    /// {@return `preTransform`}
    public int preTransform() { return preTransform(this.segment(), 0L); }
    /// Sets `preTransform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preTransform(MemorySegment segment, long index, int value) { VH_preTransform.set(segment, 0L, index, value); }
    /// Sets `preTransform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR preTransform(int value) { preTransform(this.segment(), 0L, value); return this; }

    /// {@return `compositeAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compositeAlpha(MemorySegment segment, long index) { return (int) VH_compositeAlpha.get(segment, 0L, index); }
    /// {@return `compositeAlpha`}
    public int compositeAlpha() { return compositeAlpha(this.segment(), 0L); }
    /// Sets `compositeAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compositeAlpha(MemorySegment segment, long index, int value) { VH_compositeAlpha.set(segment, 0L, index, value); }
    /// Sets `compositeAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR compositeAlpha(int value) { compositeAlpha(this.segment(), 0L, value); return this; }

    /// {@return `presentMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentMode(MemorySegment segment, long index) { return (int) VH_presentMode.get(segment, 0L, index); }
    /// {@return `presentMode`}
    public int presentMode() { return presentMode(this.segment(), 0L); }
    /// Sets `presentMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentMode(MemorySegment segment, long index, int value) { VH_presentMode.set(segment, 0L, index, value); }
    /// Sets `presentMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR presentMode(int value) { presentMode(this.segment(), 0L, value); return this; }

    /// {@return `clipped` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clipped(MemorySegment segment, long index) { return (int) VH_clipped.get(segment, 0L, index); }
    /// {@return `clipped`}
    public int clipped() { return clipped(this.segment(), 0L); }
    /// Sets `clipped` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clipped(MemorySegment segment, long index, int value) { VH_clipped.set(segment, 0L, index, value); }
    /// Sets `clipped` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR clipped(int value) { clipped(this.segment(), 0L, value); return this; }

    /// {@return `oldSwapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long oldSwapchain(MemorySegment segment, long index) { return (long) VH_oldSwapchain.get(segment, 0L, index); }
    /// {@return `oldSwapchain`}
    public long oldSwapchain() { return oldSwapchain(this.segment(), 0L); }
    /// Sets `oldSwapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void oldSwapchain(MemorySegment segment, long index, long value) { VH_oldSwapchain.set(segment, 0L, index, value); }
    /// Sets `oldSwapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainCreateInfoKHR oldSwapchain(long value) { oldSwapchain(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSwapchainCreateInfoKHR].
    public static final class Buffer extends VkSwapchainCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkSwapchainCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSwapchainCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSwapchainCreateInfoKHR`
        public VkSwapchainCreateInfoKHR asSlice(long index) { return new VkSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSwapchainCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSwapchainCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `surface` at the given index}
        /// @param index the index of the struct buffer
        public long surfaceAt(long index) { return surface(this.segment(), index); }
        /// Sets `surface` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer surfaceAt(long index, long value) { surface(this.segment(), index, value); return this; }

        /// {@return `minImageCount` at the given index}
        /// @param index the index of the struct buffer
        public int minImageCountAt(long index) { return minImageCount(this.segment(), index); }
        /// Sets `minImageCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minImageCountAt(long index, int value) { minImageCount(this.segment(), index, value); return this; }

        /// {@return `imageFormat` at the given index}
        /// @param index the index of the struct buffer
        public int imageFormatAt(long index) { return imageFormat(this.segment(), index); }
        /// Sets `imageFormat` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageFormatAt(long index, int value) { imageFormat(this.segment(), index, value); return this; }

        /// {@return `imageColorSpace` at the given index}
        /// @param index the index of the struct buffer
        public int imageColorSpaceAt(long index) { return imageColorSpace(this.segment(), index); }
        /// Sets `imageColorSpace` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageColorSpaceAt(long index, int value) { imageColorSpace(this.segment(), index, value); return this; }

        /// {@return `imageExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageExtentAt(long index) { return imageExtent(this.segment(), index); }
        /// Sets `imageExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageExtentAt(long index, MemorySegment value) { imageExtent(this.segment(), index, value); return this; }

        /// {@return `imageArrayLayers` at the given index}
        /// @param index the index of the struct buffer
        public int imageArrayLayersAt(long index) { return imageArrayLayers(this.segment(), index); }
        /// Sets `imageArrayLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageArrayLayersAt(long index, int value) { imageArrayLayers(this.segment(), index, value); return this; }

        /// {@return `imageUsage` at the given index}
        /// @param index the index of the struct buffer
        public int imageUsageAt(long index) { return imageUsage(this.segment(), index); }
        /// Sets `imageUsage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageUsageAt(long index, int value) { imageUsage(this.segment(), index, value); return this; }

        /// {@return `imageSharingMode` at the given index}
        /// @param index the index of the struct buffer
        public int imageSharingModeAt(long index) { return imageSharingMode(this.segment(), index); }
        /// Sets `imageSharingMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageSharingModeAt(long index, int value) { imageSharingMode(this.segment(), index, value); return this; }

        /// {@return `queueFamilyIndexCount` at the given index}
        /// @param index the index of the struct buffer
        public int queueFamilyIndexCountAt(long index) { return queueFamilyIndexCount(this.segment(), index); }
        /// Sets `queueFamilyIndexCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer queueFamilyIndexCountAt(long index, int value) { queueFamilyIndexCount(this.segment(), index, value); return this; }

        /// {@return `pQueueFamilyIndices` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pQueueFamilyIndicesAt(long index) { return pQueueFamilyIndices(this.segment(), index); }
        /// Sets `pQueueFamilyIndices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pQueueFamilyIndicesAt(long index, MemorySegment value) { pQueueFamilyIndices(this.segment(), index, value); return this; }

        /// {@return `preTransform` at the given index}
        /// @param index the index of the struct buffer
        public int preTransformAt(long index) { return preTransform(this.segment(), index); }
        /// Sets `preTransform` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preTransformAt(long index, int value) { preTransform(this.segment(), index, value); return this; }

        /// {@return `compositeAlpha` at the given index}
        /// @param index the index of the struct buffer
        public int compositeAlphaAt(long index) { return compositeAlpha(this.segment(), index); }
        /// Sets `compositeAlpha` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer compositeAlphaAt(long index, int value) { compositeAlpha(this.segment(), index, value); return this; }

        /// {@return `presentMode` at the given index}
        /// @param index the index of the struct buffer
        public int presentModeAt(long index) { return presentMode(this.segment(), index); }
        /// Sets `presentMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer presentModeAt(long index, int value) { presentMode(this.segment(), index, value); return this; }

        /// {@return `clipped` at the given index}
        /// @param index the index of the struct buffer
        public int clippedAt(long index) { return clipped(this.segment(), index); }
        /// Sets `clipped` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer clippedAt(long index, int value) { clipped(this.segment(), index, value); return this; }

        /// {@return `oldSwapchain` at the given index}
        /// @param index the index of the struct buffer
        public long oldSwapchainAt(long index) { return oldSwapchain(this.segment(), index); }
        /// Sets `oldSwapchain` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer oldSwapchainAt(long index, long value) { oldSwapchain(this.segment(), index, value); return this; }

    }
}
