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

/// Represents `VmaAllocatorCreateInfo`.
/// ## Layout
/// ```
/// struct VmaAllocatorCreateInfo {
///     ((uint32_t) VkFlags) VmaAllocatorCreateFlags flags;
///     (struct VkPhysicalDevice *) VkPhysicalDevice physicalDevice;
///     (struct VkDevice *) VkDevice device;
///     (uint64_t) VkDeviceSize preferredLargeHeapBlockSize;
///     const VkAllocationCallbacks* pAllocationCallbacks;
///     const VmaDeviceMemoryCallbacks* pDeviceMemoryCallbacks;
///     const VkDeviceSize* pHeapSizeLimit;
///     const VmaVulkanFunctions* pVulkanFunctions;
///     (struct VkInstance *) VkInstance instance;
///     uint32_t vulkanApiVersion;
///     const VkExternalMemoryHandleTypeFlagsKHR* pTypeExternalMemoryHandleTypes;
/// };
/// ```
public final class VmaAllocatorCreateInfo extends GroupType {
    /// The struct layout of `VmaAllocatorCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device"),
        ValueLayout.JAVA_LONG.withName("preferredLargeHeapBlockSize"),
        ValueLayout.ADDRESS.withName("pAllocationCallbacks"),
        ValueLayout.ADDRESS.withName("pDeviceMemoryCallbacks"),
        ValueLayout.ADDRESS.withName("pHeapSizeLimit"),
        ValueLayout.ADDRESS.withName("pVulkanFunctions"),
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.JAVA_INT.withName("vulkanApiVersion"),
        ValueLayout.ADDRESS.withName("pTypeExternalMemoryHandleTypes")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `physicalDevice`.
    public static final long OFFSET_physicalDevice = LAYOUT.byteOffset(PathElement.groupElement("physicalDevice"));
    /// The memory layout of `physicalDevice`.
    public static final MemoryLayout LAYOUT_physicalDevice = LAYOUT.select(PathElement.groupElement("physicalDevice"));
    /// The [VarHandle] of `physicalDevice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_physicalDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDevice"));
    /// The byte offset of `device`.
    public static final long OFFSET_device = LAYOUT.byteOffset(PathElement.groupElement("device"));
    /// The memory layout of `device`.
    public static final MemoryLayout LAYOUT_device = LAYOUT.select(PathElement.groupElement("device"));
    /// The [VarHandle] of `device` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_device = LAYOUT.arrayElementVarHandle(PathElement.groupElement("device"));
    /// The byte offset of `preferredLargeHeapBlockSize`.
    public static final long OFFSET_preferredLargeHeapBlockSize = LAYOUT.byteOffset(PathElement.groupElement("preferredLargeHeapBlockSize"));
    /// The memory layout of `preferredLargeHeapBlockSize`.
    public static final MemoryLayout LAYOUT_preferredLargeHeapBlockSize = LAYOUT.select(PathElement.groupElement("preferredLargeHeapBlockSize"));
    /// The [VarHandle] of `preferredLargeHeapBlockSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredLargeHeapBlockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredLargeHeapBlockSize"));
    /// The byte offset of `pAllocationCallbacks`.
    public static final long OFFSET_pAllocationCallbacks = LAYOUT.byteOffset(PathElement.groupElement("pAllocationCallbacks"));
    /// The memory layout of `pAllocationCallbacks`.
    public static final MemoryLayout LAYOUT_pAllocationCallbacks = LAYOUT.select(PathElement.groupElement("pAllocationCallbacks"));
    /// The [VarHandle] of `pAllocationCallbacks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAllocationCallbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAllocationCallbacks"));
    /// The byte offset of `pDeviceMemoryCallbacks`.
    public static final long OFFSET_pDeviceMemoryCallbacks = LAYOUT.byteOffset(PathElement.groupElement("pDeviceMemoryCallbacks"));
    /// The memory layout of `pDeviceMemoryCallbacks`.
    public static final MemoryLayout LAYOUT_pDeviceMemoryCallbacks = LAYOUT.select(PathElement.groupElement("pDeviceMemoryCallbacks"));
    /// The [VarHandle] of `pDeviceMemoryCallbacks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceMemoryCallbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceMemoryCallbacks"));
    /// The byte offset of `pHeapSizeLimit`.
    public static final long OFFSET_pHeapSizeLimit = LAYOUT.byteOffset(PathElement.groupElement("pHeapSizeLimit"));
    /// The memory layout of `pHeapSizeLimit`.
    public static final MemoryLayout LAYOUT_pHeapSizeLimit = LAYOUT.select(PathElement.groupElement("pHeapSizeLimit"));
    /// The [VarHandle] of `pHeapSizeLimit` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHeapSizeLimit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHeapSizeLimit"));
    /// The byte offset of `pVulkanFunctions`.
    public static final long OFFSET_pVulkanFunctions = LAYOUT.byteOffset(PathElement.groupElement("pVulkanFunctions"));
    /// The memory layout of `pVulkanFunctions`.
    public static final MemoryLayout LAYOUT_pVulkanFunctions = LAYOUT.select(PathElement.groupElement("pVulkanFunctions"));
    /// The [VarHandle] of `pVulkanFunctions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVulkanFunctions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVulkanFunctions"));
    /// The byte offset of `instance`.
    public static final long OFFSET_instance = LAYOUT.byteOffset(PathElement.groupElement("instance"));
    /// The memory layout of `instance`.
    public static final MemoryLayout LAYOUT_instance = LAYOUT.select(PathElement.groupElement("instance"));
    /// The [VarHandle] of `instance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instance"));
    /// The byte offset of `vulkanApiVersion`.
    public static final long OFFSET_vulkanApiVersion = LAYOUT.byteOffset(PathElement.groupElement("vulkanApiVersion"));
    /// The memory layout of `vulkanApiVersion`.
    public static final MemoryLayout LAYOUT_vulkanApiVersion = LAYOUT.select(PathElement.groupElement("vulkanApiVersion"));
    /// The [VarHandle] of `vulkanApiVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanApiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanApiVersion"));
    /// The byte offset of `pTypeExternalMemoryHandleTypes`.
    public static final long OFFSET_pTypeExternalMemoryHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("pTypeExternalMemoryHandleTypes"));
    /// The memory layout of `pTypeExternalMemoryHandleTypes`.
    public static final MemoryLayout LAYOUT_pTypeExternalMemoryHandleTypes = LAYOUT.select(PathElement.groupElement("pTypeExternalMemoryHandleTypes"));
    /// The [VarHandle] of `pTypeExternalMemoryHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTypeExternalMemoryHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTypeExternalMemoryHandleTypes"));

    /// Creates `VmaAllocatorCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaAllocatorCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaAllocatorCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocatorCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocatorCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaAllocatorCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocatorCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocatorCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaAllocatorCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocatorCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocatorCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaAllocatorCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaAllocatorCreateInfo`
    public static VmaAllocatorCreateInfo alloc(SegmentAllocator allocator) { return new VmaAllocatorCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaAllocatorCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaAllocatorCreateInfo`
    public static VmaAllocatorCreateInfo alloc(SegmentAllocator allocator, long count) { return new VmaAllocatorCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaAllocatorCreateInfo copyFrom(VmaAllocatorCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaAllocatorCreateInfo reinterpret(long count) { return new VmaAllocatorCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VmaAllocatorCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `physicalDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment physicalDevice(MemorySegment segment, long index) { return (MemorySegment) VH_physicalDevice.get(segment, 0L, index); }
    /// {@return `physicalDevice`}
    public MemorySegment physicalDevice() { return physicalDevice(this.segment(), 0L); }
    /// Sets `physicalDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalDevice(MemorySegment segment, long index, MemorySegment value) { VH_physicalDevice.set(segment, 0L, index, value); }
    /// Sets `physicalDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo physicalDevice(MemorySegment value) { physicalDevice(this.segment(), 0L, value); return this; }

    /// {@return `device` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment device(MemorySegment segment, long index) { return (MemorySegment) VH_device.get(segment, 0L, index); }
    /// {@return `device`}
    public MemorySegment device() { return device(this.segment(), 0L); }
    /// Sets `device` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void device(MemorySegment segment, long index, MemorySegment value) { VH_device.set(segment, 0L, index, value); }
    /// Sets `device` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo device(MemorySegment value) { device(this.segment(), 0L, value); return this; }

    /// {@return `preferredLargeHeapBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long preferredLargeHeapBlockSize(MemorySegment segment, long index) { return (long) VH_preferredLargeHeapBlockSize.get(segment, 0L, index); }
    /// {@return `preferredLargeHeapBlockSize`}
    public long preferredLargeHeapBlockSize() { return preferredLargeHeapBlockSize(this.segment(), 0L); }
    /// Sets `preferredLargeHeapBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredLargeHeapBlockSize(MemorySegment segment, long index, long value) { VH_preferredLargeHeapBlockSize.set(segment, 0L, index, value); }
    /// Sets `preferredLargeHeapBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo preferredLargeHeapBlockSize(long value) { preferredLargeHeapBlockSize(this.segment(), 0L, value); return this; }

    /// {@return `pAllocationCallbacks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAllocationCallbacks(MemorySegment segment, long index) { return (MemorySegment) VH_pAllocationCallbacks.get(segment, 0L, index); }
    /// {@return `pAllocationCallbacks`}
    public MemorySegment pAllocationCallbacks() { return pAllocationCallbacks(this.segment(), 0L); }
    /// Sets `pAllocationCallbacks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAllocationCallbacks(MemorySegment segment, long index, MemorySegment value) { VH_pAllocationCallbacks.set(segment, 0L, index, value); }
    /// Sets `pAllocationCallbacks` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pAllocationCallbacks(MemorySegment value) { pAllocationCallbacks(this.segment(), 0L, value); return this; }

    /// {@return `pDeviceMemoryCallbacks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDeviceMemoryCallbacks(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceMemoryCallbacks.get(segment, 0L, index); }
    /// {@return `pDeviceMemoryCallbacks`}
    public MemorySegment pDeviceMemoryCallbacks() { return pDeviceMemoryCallbacks(this.segment(), 0L); }
    /// Sets `pDeviceMemoryCallbacks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDeviceMemoryCallbacks(MemorySegment segment, long index, MemorySegment value) { VH_pDeviceMemoryCallbacks.set(segment, 0L, index, value); }
    /// Sets `pDeviceMemoryCallbacks` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pDeviceMemoryCallbacks(MemorySegment value) { pDeviceMemoryCallbacks(this.segment(), 0L, value); return this; }

    /// {@return `pHeapSizeLimit` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHeapSizeLimit(MemorySegment segment, long index) { return (MemorySegment) VH_pHeapSizeLimit.get(segment, 0L, index); }
    /// {@return `pHeapSizeLimit`}
    public MemorySegment pHeapSizeLimit() { return pHeapSizeLimit(this.segment(), 0L); }
    /// Sets `pHeapSizeLimit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHeapSizeLimit(MemorySegment segment, long index, MemorySegment value) { VH_pHeapSizeLimit.set(segment, 0L, index, value); }
    /// Sets `pHeapSizeLimit` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pHeapSizeLimit(MemorySegment value) { pHeapSizeLimit(this.segment(), 0L, value); return this; }

    /// {@return `pVulkanFunctions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVulkanFunctions(MemorySegment segment, long index) { return (MemorySegment) VH_pVulkanFunctions.get(segment, 0L, index); }
    /// {@return `pVulkanFunctions`}
    public MemorySegment pVulkanFunctions() { return pVulkanFunctions(this.segment(), 0L); }
    /// Sets `pVulkanFunctions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVulkanFunctions(MemorySegment segment, long index, MemorySegment value) { VH_pVulkanFunctions.set(segment, 0L, index, value); }
    /// Sets `pVulkanFunctions` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pVulkanFunctions(MemorySegment value) { pVulkanFunctions(this.segment(), 0L, value); return this; }

    /// {@return `instance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment instance(MemorySegment segment, long index) { return (MemorySegment) VH_instance.get(segment, 0L, index); }
    /// {@return `instance`}
    public MemorySegment instance() { return instance(this.segment(), 0L); }
    /// Sets `instance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instance(MemorySegment segment, long index, MemorySegment value) { VH_instance.set(segment, 0L, index, value); }
    /// Sets `instance` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo instance(MemorySegment value) { instance(this.segment(), 0L, value); return this; }

    /// {@return `vulkanApiVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanApiVersion(MemorySegment segment, long index) { return (int) VH_vulkanApiVersion.get(segment, 0L, index); }
    /// {@return `vulkanApiVersion`}
    public int vulkanApiVersion() { return vulkanApiVersion(this.segment(), 0L); }
    /// Sets `vulkanApiVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanApiVersion(MemorySegment segment, long index, int value) { VH_vulkanApiVersion.set(segment, 0L, index, value); }
    /// Sets `vulkanApiVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo vulkanApiVersion(int value) { vulkanApiVersion(this.segment(), 0L, value); return this; }

    /// {@return `pTypeExternalMemoryHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTypeExternalMemoryHandleTypes(MemorySegment segment, long index) { return (MemorySegment) VH_pTypeExternalMemoryHandleTypes.get(segment, 0L, index); }
    /// {@return `pTypeExternalMemoryHandleTypes`}
    public MemorySegment pTypeExternalMemoryHandleTypes() { return pTypeExternalMemoryHandleTypes(this.segment(), 0L); }
    /// Sets `pTypeExternalMemoryHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTypeExternalMemoryHandleTypes(MemorySegment segment, long index, MemorySegment value) { VH_pTypeExternalMemoryHandleTypes.set(segment, 0L, index, value); }
    /// Sets `pTypeExternalMemoryHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypes(MemorySegment value) { pTypeExternalMemoryHandleTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaAllocatorCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaAllocatorCreateInfo`
    public VmaAllocatorCreateInfo asSlice(long index) { return new VmaAllocatorCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaAllocatorCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaAllocatorCreateInfo`
    public VmaAllocatorCreateInfo asSlice(long index, long count) { return new VmaAllocatorCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaAllocatorCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaAllocatorCreateInfo at(long index, Consumer<VmaAllocatorCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `physicalDevice` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment physicalDeviceAt(long index) { return physicalDevice(this.segment(), index); }
    /// Sets `physicalDevice` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo physicalDeviceAt(long index, MemorySegment value) { physicalDevice(this.segment(), index, value); return this; }

    /// {@return `device` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment deviceAt(long index) { return device(this.segment(), index); }
    /// Sets `device` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo deviceAt(long index, MemorySegment value) { device(this.segment(), index, value); return this; }

    /// {@return `preferredLargeHeapBlockSize` at the given index}
    /// @param index the index of the struct buffer
    public long preferredLargeHeapBlockSizeAt(long index) { return preferredLargeHeapBlockSize(this.segment(), index); }
    /// Sets `preferredLargeHeapBlockSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo preferredLargeHeapBlockSizeAt(long index, long value) { preferredLargeHeapBlockSize(this.segment(), index, value); return this; }

    /// {@return `pAllocationCallbacks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAllocationCallbacksAt(long index) { return pAllocationCallbacks(this.segment(), index); }
    /// Sets `pAllocationCallbacks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pAllocationCallbacksAt(long index, MemorySegment value) { pAllocationCallbacks(this.segment(), index, value); return this; }

    /// {@return `pDeviceMemoryCallbacks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDeviceMemoryCallbacksAt(long index) { return pDeviceMemoryCallbacks(this.segment(), index); }
    /// Sets `pDeviceMemoryCallbacks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pDeviceMemoryCallbacksAt(long index, MemorySegment value) { pDeviceMemoryCallbacks(this.segment(), index, value); return this; }

    /// {@return `pHeapSizeLimit` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pHeapSizeLimitAt(long index) { return pHeapSizeLimit(this.segment(), index); }
    /// Sets `pHeapSizeLimit` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pHeapSizeLimitAt(long index, MemorySegment value) { pHeapSizeLimit(this.segment(), index, value); return this; }

    /// {@return `pVulkanFunctions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVulkanFunctionsAt(long index) { return pVulkanFunctions(this.segment(), index); }
    /// Sets `pVulkanFunctions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pVulkanFunctionsAt(long index, MemorySegment value) { pVulkanFunctions(this.segment(), index, value); return this; }

    /// {@return `instance` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment instanceAt(long index) { return instance(this.segment(), index); }
    /// Sets `instance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo instanceAt(long index, MemorySegment value) { instance(this.segment(), index, value); return this; }

    /// {@return `vulkanApiVersion` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanApiVersionAt(long index) { return vulkanApiVersion(this.segment(), index); }
    /// Sets `vulkanApiVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo vulkanApiVersionAt(long index, int value) { vulkanApiVersion(this.segment(), index, value); return this; }

    /// {@return `pTypeExternalMemoryHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTypeExternalMemoryHandleTypesAt(long index) { return pTypeExternalMemoryHandleTypes(this.segment(), index); }
    /// Sets `pTypeExternalMemoryHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypesAt(long index, MemorySegment value) { pTypeExternalMemoryHandleTypes(this.segment(), index, value); return this; }

}
