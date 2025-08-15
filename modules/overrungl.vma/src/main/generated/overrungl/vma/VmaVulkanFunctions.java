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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaVulkanFunctions`.
/// ## Layout
/// ```
/// struct VmaVulkanFunctions {
///     (void*) PFN_vkGetInstanceProcAddr vkGetInstanceProcAddr;
///     (void*) PFN_vkGetDeviceProcAddr vkGetDeviceProcAddr;
///     (void*) PFN_vkGetPhysicalDeviceProperties vkGetPhysicalDeviceProperties;
///     (void*) PFN_vkGetPhysicalDeviceMemoryProperties vkGetPhysicalDeviceMemoryProperties;
///     (void*) PFN_vkAllocateMemory vkAllocateMemory;
///     (void*) PFN_vkFreeMemory vkFreeMemory;
///     (void*) PFN_vkMapMemory vkMapMemory;
///     (void*) PFN_vkUnmapMemory vkUnmapMemory;
///     (void*) PFN_vkFlushMappedMemoryRanges vkFlushMappedMemoryRanges;
///     (void*) PFN_vkInvalidateMappedMemoryRanges vkInvalidateMappedMemoryRanges;
///     (void*) PFN_vkBindBufferMemory vkBindBufferMemory;
///     (void*) PFN_vkBindImageMemory vkBindImageMemory;
///     (void*) PFN_vkGetBufferMemoryRequirements vkGetBufferMemoryRequirements;
///     (void*) PFN_vkGetImageMemoryRequirements vkGetImageMemoryRequirements;
///     (void*) PFN_vkCreateBuffer vkCreateBuffer;
///     (void*) PFN_vkDestroyBuffer vkDestroyBuffer;
///     (void*) PFN_vkCreateImage vkCreateImage;
///     (void*) PFN_vkDestroyImage vkDestroyImage;
///     (void*) PFN_vkCmdCopyBuffer vkCmdCopyBuffer;
///     (void*) PFN_vkGetBufferMemoryRequirements2KHR vkGetBufferMemoryRequirements2KHR;
///     (void*) PFN_vkGetImageMemoryRequirements2KHR vkGetImageMemoryRequirements2KHR;
///     (void*) PFN_vkBindBufferMemory2KHR vkBindBufferMemory2KHR;
///     (void*) PFN_vkBindImageMemory2KHR vkBindImageMemory2KHR;
///     (void*) PFN_vkGetPhysicalDeviceMemoryProperties2KHR vkGetPhysicalDeviceMemoryProperties2KHR;
///     (void*) PFN_vkGetDeviceBufferMemoryRequirementsKHR vkGetDeviceBufferMemoryRequirements;
///     (void*) PFN_vkGetDeviceImageMemoryRequirementsKHR vkGetDeviceImageMemoryRequirements;
///     (void*) PFN_vkGetMemoryWin32HandleKHR vkGetMemoryWin32HandleKHR;
/// };
/// ```
public final class VmaVulkanFunctions extends GroupType {
    /// The struct layout of `VmaVulkanFunctions`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("vkGetInstanceProcAddr"),
        ValueLayout.ADDRESS.withName("vkGetDeviceProcAddr"),
        ValueLayout.ADDRESS.withName("vkGetPhysicalDeviceProperties"),
        ValueLayout.ADDRESS.withName("vkGetPhysicalDeviceMemoryProperties"),
        ValueLayout.ADDRESS.withName("vkAllocateMemory"),
        ValueLayout.ADDRESS.withName("vkFreeMemory"),
        ValueLayout.ADDRESS.withName("vkMapMemory"),
        ValueLayout.ADDRESS.withName("vkUnmapMemory"),
        ValueLayout.ADDRESS.withName("vkFlushMappedMemoryRanges"),
        ValueLayout.ADDRESS.withName("vkInvalidateMappedMemoryRanges"),
        ValueLayout.ADDRESS.withName("vkBindBufferMemory"),
        ValueLayout.ADDRESS.withName("vkBindImageMemory"),
        ValueLayout.ADDRESS.withName("vkGetBufferMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkGetImageMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkCreateBuffer"),
        ValueLayout.ADDRESS.withName("vkDestroyBuffer"),
        ValueLayout.ADDRESS.withName("vkCreateImage"),
        ValueLayout.ADDRESS.withName("vkDestroyImage"),
        ValueLayout.ADDRESS.withName("vkCmdCopyBuffer"),
        ValueLayout.ADDRESS.withName("vkGetBufferMemoryRequirements2KHR"),
        ValueLayout.ADDRESS.withName("vkGetImageMemoryRequirements2KHR"),
        ValueLayout.ADDRESS.withName("vkBindBufferMemory2KHR"),
        ValueLayout.ADDRESS.withName("vkBindImageMemory2KHR"),
        ValueLayout.ADDRESS.withName("vkGetPhysicalDeviceMemoryProperties2KHR"),
        ValueLayout.ADDRESS.withName("vkGetDeviceBufferMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkGetDeviceImageMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkGetMemoryWin32HandleKHR")
    );
    /// The byte offset of `vkGetInstanceProcAddr`.
    public static final long OFFSET_vkGetInstanceProcAddr = LAYOUT.byteOffset(PathElement.groupElement("vkGetInstanceProcAddr"));
    /// The memory layout of `vkGetInstanceProcAddr`.
    public static final MemoryLayout LAYOUT_vkGetInstanceProcAddr = LAYOUT.select(PathElement.groupElement("vkGetInstanceProcAddr"));
    /// The [VarHandle] of `vkGetInstanceProcAddr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetInstanceProcAddr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetInstanceProcAddr"));
    /// The byte offset of `vkGetDeviceProcAddr`.
    public static final long OFFSET_vkGetDeviceProcAddr = LAYOUT.byteOffset(PathElement.groupElement("vkGetDeviceProcAddr"));
    /// The memory layout of `vkGetDeviceProcAddr`.
    public static final MemoryLayout LAYOUT_vkGetDeviceProcAddr = LAYOUT.select(PathElement.groupElement("vkGetDeviceProcAddr"));
    /// The [VarHandle] of `vkGetDeviceProcAddr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetDeviceProcAddr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetDeviceProcAddr"));
    /// The byte offset of `vkGetPhysicalDeviceProperties`.
    public static final long OFFSET_vkGetPhysicalDeviceProperties = LAYOUT.byteOffset(PathElement.groupElement("vkGetPhysicalDeviceProperties"));
    /// The memory layout of `vkGetPhysicalDeviceProperties`.
    public static final MemoryLayout LAYOUT_vkGetPhysicalDeviceProperties = LAYOUT.select(PathElement.groupElement("vkGetPhysicalDeviceProperties"));
    /// The [VarHandle] of `vkGetPhysicalDeviceProperties` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetPhysicalDeviceProperties = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetPhysicalDeviceProperties"));
    /// The byte offset of `vkGetPhysicalDeviceMemoryProperties`.
    public static final long OFFSET_vkGetPhysicalDeviceMemoryProperties = LAYOUT.byteOffset(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties"));
    /// The memory layout of `vkGetPhysicalDeviceMemoryProperties`.
    public static final MemoryLayout LAYOUT_vkGetPhysicalDeviceMemoryProperties = LAYOUT.select(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties"));
    /// The [VarHandle] of `vkGetPhysicalDeviceMemoryProperties` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetPhysicalDeviceMemoryProperties = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties"));
    /// The byte offset of `vkAllocateMemory`.
    public static final long OFFSET_vkAllocateMemory = LAYOUT.byteOffset(PathElement.groupElement("vkAllocateMemory"));
    /// The memory layout of `vkAllocateMemory`.
    public static final MemoryLayout LAYOUT_vkAllocateMemory = LAYOUT.select(PathElement.groupElement("vkAllocateMemory"));
    /// The [VarHandle] of `vkAllocateMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkAllocateMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkAllocateMemory"));
    /// The byte offset of `vkFreeMemory`.
    public static final long OFFSET_vkFreeMemory = LAYOUT.byteOffset(PathElement.groupElement("vkFreeMemory"));
    /// The memory layout of `vkFreeMemory`.
    public static final MemoryLayout LAYOUT_vkFreeMemory = LAYOUT.select(PathElement.groupElement("vkFreeMemory"));
    /// The [VarHandle] of `vkFreeMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkFreeMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkFreeMemory"));
    /// The byte offset of `vkMapMemory`.
    public static final long OFFSET_vkMapMemory = LAYOUT.byteOffset(PathElement.groupElement("vkMapMemory"));
    /// The memory layout of `vkMapMemory`.
    public static final MemoryLayout LAYOUT_vkMapMemory = LAYOUT.select(PathElement.groupElement("vkMapMemory"));
    /// The [VarHandle] of `vkMapMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkMapMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkMapMemory"));
    /// The byte offset of `vkUnmapMemory`.
    public static final long OFFSET_vkUnmapMemory = LAYOUT.byteOffset(PathElement.groupElement("vkUnmapMemory"));
    /// The memory layout of `vkUnmapMemory`.
    public static final MemoryLayout LAYOUT_vkUnmapMemory = LAYOUT.select(PathElement.groupElement("vkUnmapMemory"));
    /// The [VarHandle] of `vkUnmapMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkUnmapMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkUnmapMemory"));
    /// The byte offset of `vkFlushMappedMemoryRanges`.
    public static final long OFFSET_vkFlushMappedMemoryRanges = LAYOUT.byteOffset(PathElement.groupElement("vkFlushMappedMemoryRanges"));
    /// The memory layout of `vkFlushMappedMemoryRanges`.
    public static final MemoryLayout LAYOUT_vkFlushMappedMemoryRanges = LAYOUT.select(PathElement.groupElement("vkFlushMappedMemoryRanges"));
    /// The [VarHandle] of `vkFlushMappedMemoryRanges` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkFlushMappedMemoryRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkFlushMappedMemoryRanges"));
    /// The byte offset of `vkInvalidateMappedMemoryRanges`.
    public static final long OFFSET_vkInvalidateMappedMemoryRanges = LAYOUT.byteOffset(PathElement.groupElement("vkInvalidateMappedMemoryRanges"));
    /// The memory layout of `vkInvalidateMappedMemoryRanges`.
    public static final MemoryLayout LAYOUT_vkInvalidateMappedMemoryRanges = LAYOUT.select(PathElement.groupElement("vkInvalidateMappedMemoryRanges"));
    /// The [VarHandle] of `vkInvalidateMappedMemoryRanges` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkInvalidateMappedMemoryRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkInvalidateMappedMemoryRanges"));
    /// The byte offset of `vkBindBufferMemory`.
    public static final long OFFSET_vkBindBufferMemory = LAYOUT.byteOffset(PathElement.groupElement("vkBindBufferMemory"));
    /// The memory layout of `vkBindBufferMemory`.
    public static final MemoryLayout LAYOUT_vkBindBufferMemory = LAYOUT.select(PathElement.groupElement("vkBindBufferMemory"));
    /// The [VarHandle] of `vkBindBufferMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkBindBufferMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkBindBufferMemory"));
    /// The byte offset of `vkBindImageMemory`.
    public static final long OFFSET_vkBindImageMemory = LAYOUT.byteOffset(PathElement.groupElement("vkBindImageMemory"));
    /// The memory layout of `vkBindImageMemory`.
    public static final MemoryLayout LAYOUT_vkBindImageMemory = LAYOUT.select(PathElement.groupElement("vkBindImageMemory"));
    /// The [VarHandle] of `vkBindImageMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkBindImageMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkBindImageMemory"));
    /// The byte offset of `vkGetBufferMemoryRequirements`.
    public static final long OFFSET_vkGetBufferMemoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("vkGetBufferMemoryRequirements"));
    /// The memory layout of `vkGetBufferMemoryRequirements`.
    public static final MemoryLayout LAYOUT_vkGetBufferMemoryRequirements = LAYOUT.select(PathElement.groupElement("vkGetBufferMemoryRequirements"));
    /// The [VarHandle] of `vkGetBufferMemoryRequirements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetBufferMemoryRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetBufferMemoryRequirements"));
    /// The byte offset of `vkGetImageMemoryRequirements`.
    public static final long OFFSET_vkGetImageMemoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("vkGetImageMemoryRequirements"));
    /// The memory layout of `vkGetImageMemoryRequirements`.
    public static final MemoryLayout LAYOUT_vkGetImageMemoryRequirements = LAYOUT.select(PathElement.groupElement("vkGetImageMemoryRequirements"));
    /// The [VarHandle] of `vkGetImageMemoryRequirements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetImageMemoryRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetImageMemoryRequirements"));
    /// The byte offset of `vkCreateBuffer`.
    public static final long OFFSET_vkCreateBuffer = LAYOUT.byteOffset(PathElement.groupElement("vkCreateBuffer"));
    /// The memory layout of `vkCreateBuffer`.
    public static final MemoryLayout LAYOUT_vkCreateBuffer = LAYOUT.select(PathElement.groupElement("vkCreateBuffer"));
    /// The [VarHandle] of `vkCreateBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkCreateBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkCreateBuffer"));
    /// The byte offset of `vkDestroyBuffer`.
    public static final long OFFSET_vkDestroyBuffer = LAYOUT.byteOffset(PathElement.groupElement("vkDestroyBuffer"));
    /// The memory layout of `vkDestroyBuffer`.
    public static final MemoryLayout LAYOUT_vkDestroyBuffer = LAYOUT.select(PathElement.groupElement("vkDestroyBuffer"));
    /// The [VarHandle] of `vkDestroyBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkDestroyBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkDestroyBuffer"));
    /// The byte offset of `vkCreateImage`.
    public static final long OFFSET_vkCreateImage = LAYOUT.byteOffset(PathElement.groupElement("vkCreateImage"));
    /// The memory layout of `vkCreateImage`.
    public static final MemoryLayout LAYOUT_vkCreateImage = LAYOUT.select(PathElement.groupElement("vkCreateImage"));
    /// The [VarHandle] of `vkCreateImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkCreateImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkCreateImage"));
    /// The byte offset of `vkDestroyImage`.
    public static final long OFFSET_vkDestroyImage = LAYOUT.byteOffset(PathElement.groupElement("vkDestroyImage"));
    /// The memory layout of `vkDestroyImage`.
    public static final MemoryLayout LAYOUT_vkDestroyImage = LAYOUT.select(PathElement.groupElement("vkDestroyImage"));
    /// The [VarHandle] of `vkDestroyImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkDestroyImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkDestroyImage"));
    /// The byte offset of `vkCmdCopyBuffer`.
    public static final long OFFSET_vkCmdCopyBuffer = LAYOUT.byteOffset(PathElement.groupElement("vkCmdCopyBuffer"));
    /// The memory layout of `vkCmdCopyBuffer`.
    public static final MemoryLayout LAYOUT_vkCmdCopyBuffer = LAYOUT.select(PathElement.groupElement("vkCmdCopyBuffer"));
    /// The [VarHandle] of `vkCmdCopyBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkCmdCopyBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkCmdCopyBuffer"));
    /// The byte offset of `vkGetBufferMemoryRequirements2KHR`.
    public static final long OFFSET_vkGetBufferMemoryRequirements2KHR = LAYOUT.byteOffset(PathElement.groupElement("vkGetBufferMemoryRequirements2KHR"));
    /// The memory layout of `vkGetBufferMemoryRequirements2KHR`.
    public static final MemoryLayout LAYOUT_vkGetBufferMemoryRequirements2KHR = LAYOUT.select(PathElement.groupElement("vkGetBufferMemoryRequirements2KHR"));
    /// The [VarHandle] of `vkGetBufferMemoryRequirements2KHR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetBufferMemoryRequirements2KHR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetBufferMemoryRequirements2KHR"));
    /// The byte offset of `vkGetImageMemoryRequirements2KHR`.
    public static final long OFFSET_vkGetImageMemoryRequirements2KHR = LAYOUT.byteOffset(PathElement.groupElement("vkGetImageMemoryRequirements2KHR"));
    /// The memory layout of `vkGetImageMemoryRequirements2KHR`.
    public static final MemoryLayout LAYOUT_vkGetImageMemoryRequirements2KHR = LAYOUT.select(PathElement.groupElement("vkGetImageMemoryRequirements2KHR"));
    /// The [VarHandle] of `vkGetImageMemoryRequirements2KHR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetImageMemoryRequirements2KHR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetImageMemoryRequirements2KHR"));
    /// The byte offset of `vkBindBufferMemory2KHR`.
    public static final long OFFSET_vkBindBufferMemory2KHR = LAYOUT.byteOffset(PathElement.groupElement("vkBindBufferMemory2KHR"));
    /// The memory layout of `vkBindBufferMemory2KHR`.
    public static final MemoryLayout LAYOUT_vkBindBufferMemory2KHR = LAYOUT.select(PathElement.groupElement("vkBindBufferMemory2KHR"));
    /// The [VarHandle] of `vkBindBufferMemory2KHR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkBindBufferMemory2KHR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkBindBufferMemory2KHR"));
    /// The byte offset of `vkBindImageMemory2KHR`.
    public static final long OFFSET_vkBindImageMemory2KHR = LAYOUT.byteOffset(PathElement.groupElement("vkBindImageMemory2KHR"));
    /// The memory layout of `vkBindImageMemory2KHR`.
    public static final MemoryLayout LAYOUT_vkBindImageMemory2KHR = LAYOUT.select(PathElement.groupElement("vkBindImageMemory2KHR"));
    /// The [VarHandle] of `vkBindImageMemory2KHR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkBindImageMemory2KHR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkBindImageMemory2KHR"));
    /// The byte offset of `vkGetPhysicalDeviceMemoryProperties2KHR`.
    public static final long OFFSET_vkGetPhysicalDeviceMemoryProperties2KHR = LAYOUT.byteOffset(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties2KHR"));
    /// The memory layout of `vkGetPhysicalDeviceMemoryProperties2KHR`.
    public static final MemoryLayout LAYOUT_vkGetPhysicalDeviceMemoryProperties2KHR = LAYOUT.select(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties2KHR"));
    /// The [VarHandle] of `vkGetPhysicalDeviceMemoryProperties2KHR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetPhysicalDeviceMemoryProperties2KHR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties2KHR"));
    /// The byte offset of `vkGetDeviceBufferMemoryRequirements`.
    public static final long OFFSET_vkGetDeviceBufferMemoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("vkGetDeviceBufferMemoryRequirements"));
    /// The memory layout of `vkGetDeviceBufferMemoryRequirements`.
    public static final MemoryLayout LAYOUT_vkGetDeviceBufferMemoryRequirements = LAYOUT.select(PathElement.groupElement("vkGetDeviceBufferMemoryRequirements"));
    /// The [VarHandle] of `vkGetDeviceBufferMemoryRequirements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetDeviceBufferMemoryRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetDeviceBufferMemoryRequirements"));
    /// The byte offset of `vkGetDeviceImageMemoryRequirements`.
    public static final long OFFSET_vkGetDeviceImageMemoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("vkGetDeviceImageMemoryRequirements"));
    /// The memory layout of `vkGetDeviceImageMemoryRequirements`.
    public static final MemoryLayout LAYOUT_vkGetDeviceImageMemoryRequirements = LAYOUT.select(PathElement.groupElement("vkGetDeviceImageMemoryRequirements"));
    /// The [VarHandle] of `vkGetDeviceImageMemoryRequirements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetDeviceImageMemoryRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetDeviceImageMemoryRequirements"));
    /// The byte offset of `vkGetMemoryWin32HandleKHR`.
    public static final long OFFSET_vkGetMemoryWin32HandleKHR = LAYOUT.byteOffset(PathElement.groupElement("vkGetMemoryWin32HandleKHR"));
    /// The memory layout of `vkGetMemoryWin32HandleKHR`.
    public static final MemoryLayout LAYOUT_vkGetMemoryWin32HandleKHR = LAYOUT.select(PathElement.groupElement("vkGetMemoryWin32HandleKHR"));
    /// The [VarHandle] of `vkGetMemoryWin32HandleKHR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vkGetMemoryWin32HandleKHR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vkGetMemoryWin32HandleKHR"));

    /// Creates `VmaVulkanFunctions` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaVulkanFunctions(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaVulkanFunctions` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVulkanFunctions of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVulkanFunctions(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaVulkanFunctions` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVulkanFunctions ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVulkanFunctions(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaVulkanFunctions` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVulkanFunctions ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVulkanFunctions(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaVulkanFunctions` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaVulkanFunctions`
    public static VmaVulkanFunctions alloc(SegmentAllocator allocator) { return new VmaVulkanFunctions(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaVulkanFunctions` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaVulkanFunctions`
    public static VmaVulkanFunctions alloc(SegmentAllocator allocator, long count) { return new VmaVulkanFunctions(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaVulkanFunctions copyFrom(VmaVulkanFunctions src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaVulkanFunctions reinterpret(long count) { return new VmaVulkanFunctions(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `vkGetInstanceProcAddr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetInstanceProcAddr(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetInstanceProcAddr.get(segment, 0L, index); }
    /// {@return `vkGetInstanceProcAddr`}
    public MemorySegment vkGetInstanceProcAddr() { return vkGetInstanceProcAddr(this.segment(), 0L); }
    /// Sets `vkGetInstanceProcAddr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetInstanceProcAddr(MemorySegment segment, long index, MemorySegment value) { VH_vkGetInstanceProcAddr.set(segment, 0L, index, value); }
    /// Sets `vkGetInstanceProcAddr` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetInstanceProcAddr(MemorySegment value) { vkGetInstanceProcAddr(this.segment(), 0L, value); return this; }

    /// {@return `vkGetDeviceProcAddr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetDeviceProcAddr(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetDeviceProcAddr.get(segment, 0L, index); }
    /// {@return `vkGetDeviceProcAddr`}
    public MemorySegment vkGetDeviceProcAddr() { return vkGetDeviceProcAddr(this.segment(), 0L); }
    /// Sets `vkGetDeviceProcAddr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetDeviceProcAddr(MemorySegment segment, long index, MemorySegment value) { VH_vkGetDeviceProcAddr.set(segment, 0L, index, value); }
    /// Sets `vkGetDeviceProcAddr` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetDeviceProcAddr(MemorySegment value) { vkGetDeviceProcAddr(this.segment(), 0L, value); return this; }

    /// {@return `vkGetPhysicalDeviceProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetPhysicalDeviceProperties(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetPhysicalDeviceProperties.get(segment, 0L, index); }
    /// {@return `vkGetPhysicalDeviceProperties`}
    public MemorySegment vkGetPhysicalDeviceProperties() { return vkGetPhysicalDeviceProperties(this.segment(), 0L); }
    /// Sets `vkGetPhysicalDeviceProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetPhysicalDeviceProperties(MemorySegment segment, long index, MemorySegment value) { VH_vkGetPhysicalDeviceProperties.set(segment, 0L, index, value); }
    /// Sets `vkGetPhysicalDeviceProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetPhysicalDeviceProperties(MemorySegment value) { vkGetPhysicalDeviceProperties(this.segment(), 0L, value); return this; }

    /// {@return `vkGetPhysicalDeviceMemoryProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetPhysicalDeviceMemoryProperties(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetPhysicalDeviceMemoryProperties.get(segment, 0L, index); }
    /// {@return `vkGetPhysicalDeviceMemoryProperties`}
    public MemorySegment vkGetPhysicalDeviceMemoryProperties() { return vkGetPhysicalDeviceMemoryProperties(this.segment(), 0L); }
    /// Sets `vkGetPhysicalDeviceMemoryProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetPhysicalDeviceMemoryProperties(MemorySegment segment, long index, MemorySegment value) { VH_vkGetPhysicalDeviceMemoryProperties.set(segment, 0L, index, value); }
    /// Sets `vkGetPhysicalDeviceMemoryProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties(MemorySegment value) { vkGetPhysicalDeviceMemoryProperties(this.segment(), 0L, value); return this; }

    /// {@return `vkAllocateMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkAllocateMemory(MemorySegment segment, long index) { return (MemorySegment) VH_vkAllocateMemory.get(segment, 0L, index); }
    /// {@return `vkAllocateMemory`}
    public MemorySegment vkAllocateMemory() { return vkAllocateMemory(this.segment(), 0L); }
    /// Sets `vkAllocateMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkAllocateMemory(MemorySegment segment, long index, MemorySegment value) { VH_vkAllocateMemory.set(segment, 0L, index, value); }
    /// Sets `vkAllocateMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkAllocateMemory(MemorySegment value) { vkAllocateMemory(this.segment(), 0L, value); return this; }

    /// {@return `vkFreeMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkFreeMemory(MemorySegment segment, long index) { return (MemorySegment) VH_vkFreeMemory.get(segment, 0L, index); }
    /// {@return `vkFreeMemory`}
    public MemorySegment vkFreeMemory() { return vkFreeMemory(this.segment(), 0L); }
    /// Sets `vkFreeMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkFreeMemory(MemorySegment segment, long index, MemorySegment value) { VH_vkFreeMemory.set(segment, 0L, index, value); }
    /// Sets `vkFreeMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkFreeMemory(MemorySegment value) { vkFreeMemory(this.segment(), 0L, value); return this; }

    /// {@return `vkMapMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkMapMemory(MemorySegment segment, long index) { return (MemorySegment) VH_vkMapMemory.get(segment, 0L, index); }
    /// {@return `vkMapMemory`}
    public MemorySegment vkMapMemory() { return vkMapMemory(this.segment(), 0L); }
    /// Sets `vkMapMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkMapMemory(MemorySegment segment, long index, MemorySegment value) { VH_vkMapMemory.set(segment, 0L, index, value); }
    /// Sets `vkMapMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkMapMemory(MemorySegment value) { vkMapMemory(this.segment(), 0L, value); return this; }

    /// {@return `vkUnmapMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkUnmapMemory(MemorySegment segment, long index) { return (MemorySegment) VH_vkUnmapMemory.get(segment, 0L, index); }
    /// {@return `vkUnmapMemory`}
    public MemorySegment vkUnmapMemory() { return vkUnmapMemory(this.segment(), 0L); }
    /// Sets `vkUnmapMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkUnmapMemory(MemorySegment segment, long index, MemorySegment value) { VH_vkUnmapMemory.set(segment, 0L, index, value); }
    /// Sets `vkUnmapMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkUnmapMemory(MemorySegment value) { vkUnmapMemory(this.segment(), 0L, value); return this; }

    /// {@return `vkFlushMappedMemoryRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkFlushMappedMemoryRanges(MemorySegment segment, long index) { return (MemorySegment) VH_vkFlushMappedMemoryRanges.get(segment, 0L, index); }
    /// {@return `vkFlushMappedMemoryRanges`}
    public MemorySegment vkFlushMappedMemoryRanges() { return vkFlushMappedMemoryRanges(this.segment(), 0L); }
    /// Sets `vkFlushMappedMemoryRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkFlushMappedMemoryRanges(MemorySegment segment, long index, MemorySegment value) { VH_vkFlushMappedMemoryRanges.set(segment, 0L, index, value); }
    /// Sets `vkFlushMappedMemoryRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkFlushMappedMemoryRanges(MemorySegment value) { vkFlushMappedMemoryRanges(this.segment(), 0L, value); return this; }

    /// {@return `vkInvalidateMappedMemoryRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkInvalidateMappedMemoryRanges(MemorySegment segment, long index) { return (MemorySegment) VH_vkInvalidateMappedMemoryRanges.get(segment, 0L, index); }
    /// {@return `vkInvalidateMappedMemoryRanges`}
    public MemorySegment vkInvalidateMappedMemoryRanges() { return vkInvalidateMappedMemoryRanges(this.segment(), 0L); }
    /// Sets `vkInvalidateMappedMemoryRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkInvalidateMappedMemoryRanges(MemorySegment segment, long index, MemorySegment value) { VH_vkInvalidateMappedMemoryRanges.set(segment, 0L, index, value); }
    /// Sets `vkInvalidateMappedMemoryRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkInvalidateMappedMemoryRanges(MemorySegment value) { vkInvalidateMappedMemoryRanges(this.segment(), 0L, value); return this; }

    /// {@return `vkBindBufferMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkBindBufferMemory(MemorySegment segment, long index) { return (MemorySegment) VH_vkBindBufferMemory.get(segment, 0L, index); }
    /// {@return `vkBindBufferMemory`}
    public MemorySegment vkBindBufferMemory() { return vkBindBufferMemory(this.segment(), 0L); }
    /// Sets `vkBindBufferMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkBindBufferMemory(MemorySegment segment, long index, MemorySegment value) { VH_vkBindBufferMemory.set(segment, 0L, index, value); }
    /// Sets `vkBindBufferMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindBufferMemory(MemorySegment value) { vkBindBufferMemory(this.segment(), 0L, value); return this; }

    /// {@return `vkBindImageMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkBindImageMemory(MemorySegment segment, long index) { return (MemorySegment) VH_vkBindImageMemory.get(segment, 0L, index); }
    /// {@return `vkBindImageMemory`}
    public MemorySegment vkBindImageMemory() { return vkBindImageMemory(this.segment(), 0L); }
    /// Sets `vkBindImageMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkBindImageMemory(MemorySegment segment, long index, MemorySegment value) { VH_vkBindImageMemory.set(segment, 0L, index, value); }
    /// Sets `vkBindImageMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindImageMemory(MemorySegment value) { vkBindImageMemory(this.segment(), 0L, value); return this; }

    /// {@return `vkGetBufferMemoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetBufferMemoryRequirements(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetBufferMemoryRequirements.get(segment, 0L, index); }
    /// {@return `vkGetBufferMemoryRequirements`}
    public MemorySegment vkGetBufferMemoryRequirements() { return vkGetBufferMemoryRequirements(this.segment(), 0L); }
    /// Sets `vkGetBufferMemoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetBufferMemoryRequirements(MemorySegment segment, long index, MemorySegment value) { VH_vkGetBufferMemoryRequirements.set(segment, 0L, index, value); }
    /// Sets `vkGetBufferMemoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetBufferMemoryRequirements(MemorySegment value) { vkGetBufferMemoryRequirements(this.segment(), 0L, value); return this; }

    /// {@return `vkGetImageMemoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetImageMemoryRequirements(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetImageMemoryRequirements.get(segment, 0L, index); }
    /// {@return `vkGetImageMemoryRequirements`}
    public MemorySegment vkGetImageMemoryRequirements() { return vkGetImageMemoryRequirements(this.segment(), 0L); }
    /// Sets `vkGetImageMemoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetImageMemoryRequirements(MemorySegment segment, long index, MemorySegment value) { VH_vkGetImageMemoryRequirements.set(segment, 0L, index, value); }
    /// Sets `vkGetImageMemoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetImageMemoryRequirements(MemorySegment value) { vkGetImageMemoryRequirements(this.segment(), 0L, value); return this; }

    /// {@return `vkCreateBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkCreateBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_vkCreateBuffer.get(segment, 0L, index); }
    /// {@return `vkCreateBuffer`}
    public MemorySegment vkCreateBuffer() { return vkCreateBuffer(this.segment(), 0L); }
    /// Sets `vkCreateBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkCreateBuffer(MemorySegment segment, long index, MemorySegment value) { VH_vkCreateBuffer.set(segment, 0L, index, value); }
    /// Sets `vkCreateBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkCreateBuffer(MemorySegment value) { vkCreateBuffer(this.segment(), 0L, value); return this; }

    /// {@return `vkDestroyBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkDestroyBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_vkDestroyBuffer.get(segment, 0L, index); }
    /// {@return `vkDestroyBuffer`}
    public MemorySegment vkDestroyBuffer() { return vkDestroyBuffer(this.segment(), 0L); }
    /// Sets `vkDestroyBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkDestroyBuffer(MemorySegment segment, long index, MemorySegment value) { VH_vkDestroyBuffer.set(segment, 0L, index, value); }
    /// Sets `vkDestroyBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkDestroyBuffer(MemorySegment value) { vkDestroyBuffer(this.segment(), 0L, value); return this; }

    /// {@return `vkCreateImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkCreateImage(MemorySegment segment, long index) { return (MemorySegment) VH_vkCreateImage.get(segment, 0L, index); }
    /// {@return `vkCreateImage`}
    public MemorySegment vkCreateImage() { return vkCreateImage(this.segment(), 0L); }
    /// Sets `vkCreateImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkCreateImage(MemorySegment segment, long index, MemorySegment value) { VH_vkCreateImage.set(segment, 0L, index, value); }
    /// Sets `vkCreateImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkCreateImage(MemorySegment value) { vkCreateImage(this.segment(), 0L, value); return this; }

    /// {@return `vkDestroyImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkDestroyImage(MemorySegment segment, long index) { return (MemorySegment) VH_vkDestroyImage.get(segment, 0L, index); }
    /// {@return `vkDestroyImage`}
    public MemorySegment vkDestroyImage() { return vkDestroyImage(this.segment(), 0L); }
    /// Sets `vkDestroyImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkDestroyImage(MemorySegment segment, long index, MemorySegment value) { VH_vkDestroyImage.set(segment, 0L, index, value); }
    /// Sets `vkDestroyImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkDestroyImage(MemorySegment value) { vkDestroyImage(this.segment(), 0L, value); return this; }

    /// {@return `vkCmdCopyBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkCmdCopyBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_vkCmdCopyBuffer.get(segment, 0L, index); }
    /// {@return `vkCmdCopyBuffer`}
    public MemorySegment vkCmdCopyBuffer() { return vkCmdCopyBuffer(this.segment(), 0L); }
    /// Sets `vkCmdCopyBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkCmdCopyBuffer(MemorySegment segment, long index, MemorySegment value) { VH_vkCmdCopyBuffer.set(segment, 0L, index, value); }
    /// Sets `vkCmdCopyBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkCmdCopyBuffer(MemorySegment value) { vkCmdCopyBuffer(this.segment(), 0L, value); return this; }

    /// {@return `vkGetBufferMemoryRequirements2KHR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetBufferMemoryRequirements2KHR(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetBufferMemoryRequirements2KHR.get(segment, 0L, index); }
    /// {@return `vkGetBufferMemoryRequirements2KHR`}
    public MemorySegment vkGetBufferMemoryRequirements2KHR() { return vkGetBufferMemoryRequirements2KHR(this.segment(), 0L); }
    /// Sets `vkGetBufferMemoryRequirements2KHR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetBufferMemoryRequirements2KHR(MemorySegment segment, long index, MemorySegment value) { VH_vkGetBufferMemoryRequirements2KHR.set(segment, 0L, index, value); }
    /// Sets `vkGetBufferMemoryRequirements2KHR` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetBufferMemoryRequirements2KHR(MemorySegment value) { vkGetBufferMemoryRequirements2KHR(this.segment(), 0L, value); return this; }

    /// {@return `vkGetImageMemoryRequirements2KHR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetImageMemoryRequirements2KHR(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetImageMemoryRequirements2KHR.get(segment, 0L, index); }
    /// {@return `vkGetImageMemoryRequirements2KHR`}
    public MemorySegment vkGetImageMemoryRequirements2KHR() { return vkGetImageMemoryRequirements2KHR(this.segment(), 0L); }
    /// Sets `vkGetImageMemoryRequirements2KHR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetImageMemoryRequirements2KHR(MemorySegment segment, long index, MemorySegment value) { VH_vkGetImageMemoryRequirements2KHR.set(segment, 0L, index, value); }
    /// Sets `vkGetImageMemoryRequirements2KHR` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetImageMemoryRequirements2KHR(MemorySegment value) { vkGetImageMemoryRequirements2KHR(this.segment(), 0L, value); return this; }

    /// {@return `vkBindBufferMemory2KHR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkBindBufferMemory2KHR(MemorySegment segment, long index) { return (MemorySegment) VH_vkBindBufferMemory2KHR.get(segment, 0L, index); }
    /// {@return `vkBindBufferMemory2KHR`}
    public MemorySegment vkBindBufferMemory2KHR() { return vkBindBufferMemory2KHR(this.segment(), 0L); }
    /// Sets `vkBindBufferMemory2KHR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkBindBufferMemory2KHR(MemorySegment segment, long index, MemorySegment value) { VH_vkBindBufferMemory2KHR.set(segment, 0L, index, value); }
    /// Sets `vkBindBufferMemory2KHR` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindBufferMemory2KHR(MemorySegment value) { vkBindBufferMemory2KHR(this.segment(), 0L, value); return this; }

    /// {@return `vkBindImageMemory2KHR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkBindImageMemory2KHR(MemorySegment segment, long index) { return (MemorySegment) VH_vkBindImageMemory2KHR.get(segment, 0L, index); }
    /// {@return `vkBindImageMemory2KHR`}
    public MemorySegment vkBindImageMemory2KHR() { return vkBindImageMemory2KHR(this.segment(), 0L); }
    /// Sets `vkBindImageMemory2KHR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkBindImageMemory2KHR(MemorySegment segment, long index, MemorySegment value) { VH_vkBindImageMemory2KHR.set(segment, 0L, index, value); }
    /// Sets `vkBindImageMemory2KHR` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindImageMemory2KHR(MemorySegment value) { vkBindImageMemory2KHR(this.segment(), 0L, value); return this; }

    /// {@return `vkGetPhysicalDeviceMemoryProperties2KHR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetPhysicalDeviceMemoryProperties2KHR.get(segment, 0L, index); }
    /// {@return `vkGetPhysicalDeviceMemoryProperties2KHR`}
    public MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR() { return vkGetPhysicalDeviceMemoryProperties2KHR(this.segment(), 0L); }
    /// Sets `vkGetPhysicalDeviceMemoryProperties2KHR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetPhysicalDeviceMemoryProperties2KHR(MemorySegment segment, long index, MemorySegment value) { VH_vkGetPhysicalDeviceMemoryProperties2KHR.set(segment, 0L, index, value); }
    /// Sets `vkGetPhysicalDeviceMemoryProperties2KHR` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties2KHR(MemorySegment value) { vkGetPhysicalDeviceMemoryProperties2KHR(this.segment(), 0L, value); return this; }

    /// {@return `vkGetDeviceBufferMemoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetDeviceBufferMemoryRequirements(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetDeviceBufferMemoryRequirements.get(segment, 0L, index); }
    /// {@return `vkGetDeviceBufferMemoryRequirements`}
    public MemorySegment vkGetDeviceBufferMemoryRequirements() { return vkGetDeviceBufferMemoryRequirements(this.segment(), 0L); }
    /// Sets `vkGetDeviceBufferMemoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetDeviceBufferMemoryRequirements(MemorySegment segment, long index, MemorySegment value) { VH_vkGetDeviceBufferMemoryRequirements.set(segment, 0L, index, value); }
    /// Sets `vkGetDeviceBufferMemoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetDeviceBufferMemoryRequirements(MemorySegment value) { vkGetDeviceBufferMemoryRequirements(this.segment(), 0L, value); return this; }

    /// {@return `vkGetDeviceImageMemoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetDeviceImageMemoryRequirements(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetDeviceImageMemoryRequirements.get(segment, 0L, index); }
    /// {@return `vkGetDeviceImageMemoryRequirements`}
    public MemorySegment vkGetDeviceImageMemoryRequirements() { return vkGetDeviceImageMemoryRequirements(this.segment(), 0L); }
    /// Sets `vkGetDeviceImageMemoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetDeviceImageMemoryRequirements(MemorySegment segment, long index, MemorySegment value) { VH_vkGetDeviceImageMemoryRequirements.set(segment, 0L, index, value); }
    /// Sets `vkGetDeviceImageMemoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetDeviceImageMemoryRequirements(MemorySegment value) { vkGetDeviceImageMemoryRequirements(this.segment(), 0L, value); return this; }

    /// {@return `vkGetMemoryWin32HandleKHR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vkGetMemoryWin32HandleKHR(MemorySegment segment, long index) { return (MemorySegment) VH_vkGetMemoryWin32HandleKHR.get(segment, 0L, index); }
    /// {@return `vkGetMemoryWin32HandleKHR`}
    public MemorySegment vkGetMemoryWin32HandleKHR() { return vkGetMemoryWin32HandleKHR(this.segment(), 0L); }
    /// Sets `vkGetMemoryWin32HandleKHR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vkGetMemoryWin32HandleKHR(MemorySegment segment, long index, MemorySegment value) { VH_vkGetMemoryWin32HandleKHR.set(segment, 0L, index, value); }
    /// Sets `vkGetMemoryWin32HandleKHR` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetMemoryWin32HandleKHR(MemorySegment value) { vkGetMemoryWin32HandleKHR(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaVulkanFunctions`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaVulkanFunctions`
    public VmaVulkanFunctions asSlice(long index) { return new VmaVulkanFunctions(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaVulkanFunctions`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaVulkanFunctions`
    public VmaVulkanFunctions asSlice(long index, long count) { return new VmaVulkanFunctions(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaVulkanFunctions` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaVulkanFunctions at(long index, Consumer<VmaVulkanFunctions> func) { func.accept(asSlice(index)); return this; }

    /// {@return `vkGetInstanceProcAddr` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetInstanceProcAddrAt(long index) { return vkGetInstanceProcAddr(this.segment(), index); }
    /// Sets `vkGetInstanceProcAddr` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetInstanceProcAddrAt(long index, MemorySegment value) { vkGetInstanceProcAddr(this.segment(), index, value); return this; }

    /// {@return `vkGetDeviceProcAddr` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetDeviceProcAddrAt(long index) { return vkGetDeviceProcAddr(this.segment(), index); }
    /// Sets `vkGetDeviceProcAddr` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetDeviceProcAddrAt(long index, MemorySegment value) { vkGetDeviceProcAddr(this.segment(), index, value); return this; }

    /// {@return `vkGetPhysicalDeviceProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetPhysicalDevicePropertiesAt(long index) { return vkGetPhysicalDeviceProperties(this.segment(), index); }
    /// Sets `vkGetPhysicalDeviceProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetPhysicalDevicePropertiesAt(long index, MemorySegment value) { vkGetPhysicalDeviceProperties(this.segment(), index, value); return this; }

    /// {@return `vkGetPhysicalDeviceMemoryProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetPhysicalDeviceMemoryPropertiesAt(long index) { return vkGetPhysicalDeviceMemoryProperties(this.segment(), index); }
    /// Sets `vkGetPhysicalDeviceMemoryProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryPropertiesAt(long index, MemorySegment value) { vkGetPhysicalDeviceMemoryProperties(this.segment(), index, value); return this; }

    /// {@return `vkAllocateMemory` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkAllocateMemoryAt(long index) { return vkAllocateMemory(this.segment(), index); }
    /// Sets `vkAllocateMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkAllocateMemoryAt(long index, MemorySegment value) { vkAllocateMemory(this.segment(), index, value); return this; }

    /// {@return `vkFreeMemory` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkFreeMemoryAt(long index) { return vkFreeMemory(this.segment(), index); }
    /// Sets `vkFreeMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkFreeMemoryAt(long index, MemorySegment value) { vkFreeMemory(this.segment(), index, value); return this; }

    /// {@return `vkMapMemory` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkMapMemoryAt(long index) { return vkMapMemory(this.segment(), index); }
    /// Sets `vkMapMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkMapMemoryAt(long index, MemorySegment value) { vkMapMemory(this.segment(), index, value); return this; }

    /// {@return `vkUnmapMemory` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkUnmapMemoryAt(long index) { return vkUnmapMemory(this.segment(), index); }
    /// Sets `vkUnmapMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkUnmapMemoryAt(long index, MemorySegment value) { vkUnmapMemory(this.segment(), index, value); return this; }

    /// {@return `vkFlushMappedMemoryRanges` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkFlushMappedMemoryRangesAt(long index) { return vkFlushMappedMemoryRanges(this.segment(), index); }
    /// Sets `vkFlushMappedMemoryRanges` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkFlushMappedMemoryRangesAt(long index, MemorySegment value) { vkFlushMappedMemoryRanges(this.segment(), index, value); return this; }

    /// {@return `vkInvalidateMappedMemoryRanges` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkInvalidateMappedMemoryRangesAt(long index) { return vkInvalidateMappedMemoryRanges(this.segment(), index); }
    /// Sets `vkInvalidateMappedMemoryRanges` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkInvalidateMappedMemoryRangesAt(long index, MemorySegment value) { vkInvalidateMappedMemoryRanges(this.segment(), index, value); return this; }

    /// {@return `vkBindBufferMemory` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkBindBufferMemoryAt(long index) { return vkBindBufferMemory(this.segment(), index); }
    /// Sets `vkBindBufferMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindBufferMemoryAt(long index, MemorySegment value) { vkBindBufferMemory(this.segment(), index, value); return this; }

    /// {@return `vkBindImageMemory` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkBindImageMemoryAt(long index) { return vkBindImageMemory(this.segment(), index); }
    /// Sets `vkBindImageMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindImageMemoryAt(long index, MemorySegment value) { vkBindImageMemory(this.segment(), index, value); return this; }

    /// {@return `vkGetBufferMemoryRequirements` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetBufferMemoryRequirementsAt(long index) { return vkGetBufferMemoryRequirements(this.segment(), index); }
    /// Sets `vkGetBufferMemoryRequirements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetBufferMemoryRequirementsAt(long index, MemorySegment value) { vkGetBufferMemoryRequirements(this.segment(), index, value); return this; }

    /// {@return `vkGetImageMemoryRequirements` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetImageMemoryRequirementsAt(long index) { return vkGetImageMemoryRequirements(this.segment(), index); }
    /// Sets `vkGetImageMemoryRequirements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetImageMemoryRequirementsAt(long index, MemorySegment value) { vkGetImageMemoryRequirements(this.segment(), index, value); return this; }

    /// {@return `vkCreateBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkCreateBufferAt(long index) { return vkCreateBuffer(this.segment(), index); }
    /// Sets `vkCreateBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkCreateBufferAt(long index, MemorySegment value) { vkCreateBuffer(this.segment(), index, value); return this; }

    /// {@return `vkDestroyBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkDestroyBufferAt(long index) { return vkDestroyBuffer(this.segment(), index); }
    /// Sets `vkDestroyBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkDestroyBufferAt(long index, MemorySegment value) { vkDestroyBuffer(this.segment(), index, value); return this; }

    /// {@return `vkCreateImage` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkCreateImageAt(long index) { return vkCreateImage(this.segment(), index); }
    /// Sets `vkCreateImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkCreateImageAt(long index, MemorySegment value) { vkCreateImage(this.segment(), index, value); return this; }

    /// {@return `vkDestroyImage` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkDestroyImageAt(long index) { return vkDestroyImage(this.segment(), index); }
    /// Sets `vkDestroyImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkDestroyImageAt(long index, MemorySegment value) { vkDestroyImage(this.segment(), index, value); return this; }

    /// {@return `vkCmdCopyBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkCmdCopyBufferAt(long index) { return vkCmdCopyBuffer(this.segment(), index); }
    /// Sets `vkCmdCopyBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkCmdCopyBufferAt(long index, MemorySegment value) { vkCmdCopyBuffer(this.segment(), index, value); return this; }

    /// {@return `vkGetBufferMemoryRequirements2KHR` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetBufferMemoryRequirements2KHRAt(long index) { return vkGetBufferMemoryRequirements2KHR(this.segment(), index); }
    /// Sets `vkGetBufferMemoryRequirements2KHR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetBufferMemoryRequirements2KHRAt(long index, MemorySegment value) { vkGetBufferMemoryRequirements2KHR(this.segment(), index, value); return this; }

    /// {@return `vkGetImageMemoryRequirements2KHR` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetImageMemoryRequirements2KHRAt(long index) { return vkGetImageMemoryRequirements2KHR(this.segment(), index); }
    /// Sets `vkGetImageMemoryRequirements2KHR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetImageMemoryRequirements2KHRAt(long index, MemorySegment value) { vkGetImageMemoryRequirements2KHR(this.segment(), index, value); return this; }

    /// {@return `vkBindBufferMemory2KHR` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkBindBufferMemory2KHRAt(long index) { return vkBindBufferMemory2KHR(this.segment(), index); }
    /// Sets `vkBindBufferMemory2KHR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindBufferMemory2KHRAt(long index, MemorySegment value) { vkBindBufferMemory2KHR(this.segment(), index, value); return this; }

    /// {@return `vkBindImageMemory2KHR` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkBindImageMemory2KHRAt(long index) { return vkBindImageMemory2KHR(this.segment(), index); }
    /// Sets `vkBindImageMemory2KHR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkBindImageMemory2KHRAt(long index, MemorySegment value) { vkBindImageMemory2KHR(this.segment(), index, value); return this; }

    /// {@return `vkGetPhysicalDeviceMemoryProperties2KHR` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetPhysicalDeviceMemoryProperties2KHRAt(long index) { return vkGetPhysicalDeviceMemoryProperties2KHR(this.segment(), index); }
    /// Sets `vkGetPhysicalDeviceMemoryProperties2KHR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties2KHRAt(long index, MemorySegment value) { vkGetPhysicalDeviceMemoryProperties2KHR(this.segment(), index, value); return this; }

    /// {@return `vkGetDeviceBufferMemoryRequirements` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetDeviceBufferMemoryRequirementsAt(long index) { return vkGetDeviceBufferMemoryRequirements(this.segment(), index); }
    /// Sets `vkGetDeviceBufferMemoryRequirements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetDeviceBufferMemoryRequirementsAt(long index, MemorySegment value) { vkGetDeviceBufferMemoryRequirements(this.segment(), index, value); return this; }

    /// {@return `vkGetDeviceImageMemoryRequirements` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetDeviceImageMemoryRequirementsAt(long index) { return vkGetDeviceImageMemoryRequirements(this.segment(), index); }
    /// Sets `vkGetDeviceImageMemoryRequirements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetDeviceImageMemoryRequirementsAt(long index, MemorySegment value) { vkGetDeviceImageMemoryRequirements(this.segment(), index, value); return this; }

    /// {@return `vkGetMemoryWin32HandleKHR` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vkGetMemoryWin32HandleKHRAt(long index) { return vkGetMemoryWin32HandleKHR(this.segment(), index); }
    /// Sets `vkGetMemoryWin32HandleKHR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVulkanFunctions vkGetMemoryWin32HandleKHRAt(long index, MemorySegment value) { vkGetMemoryWin32HandleKHR(this.segment(), index, value); return this; }

}
