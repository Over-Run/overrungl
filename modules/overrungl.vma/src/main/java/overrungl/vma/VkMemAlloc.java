/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.vma;

import overrungl.internal.RuntimeHelper;
import overrungl.util.CanonicalTypes;
import overrungl.util.MemoryUtil;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/// [vk_mem_alloc.h](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h)
///
/// @author squid233
/// @since 0.1.0
public final class VkMemAlloc {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;
    public static final int VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 2;
    public static final int VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT = 4;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT = 8;
    public static final int VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 16;
    public static final int VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT = 32;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT = 64;
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT = 128;
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT = 256;
    public static final int VMA_ALLOCATOR_CREATE_KHR_EXTERNAL_MEMORY_WIN32_BIT = 512;
    public static final int VMA_ALLOCATOR_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;
    public static final int VMA_MEMORY_USAGE_UNKNOWN = 0;
    public static final int VMA_MEMORY_USAGE_GPU_ONLY = 1;
    public static final int VMA_MEMORY_USAGE_CPU_ONLY = 2;
    public static final int VMA_MEMORY_USAGE_CPU_TO_GPU = 3;
    public static final int VMA_MEMORY_USAGE_GPU_TO_CPU = 4;
    public static final int VMA_MEMORY_USAGE_CPU_COPY = 5;
    public static final int VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;
    public static final int VMA_MEMORY_USAGE_AUTO = 7;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE = 8;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_HOST = 9;
    public static final int VMA_MEMORY_USAGE_MAX_ENUM = 2147483647;
    public static final int VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT = 1;
    public static final int VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT = 2;
    public static final int VMA_ALLOCATION_CREATE_MAPPED_BIT = 4;
    public static final int VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 32;
    public static final int VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    public static final int VMA_ALLOCATION_CREATE_DONT_BIND_BIT = 128;
    public static final int VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT = 256;
    public static final int VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT = 512;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT = 1024;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT = 2048;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 4096;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT = 65536;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT = 131072;
    public static final int VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;
    public static final int VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 2;
    public static final int VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT = 4;
    public static final int VMA_POOL_CREATE_ALGORITHM_MASK = 4;
    public static final int VMA_POOL_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT = 1;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT = 2;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT = 4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 8;
    public static final int VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM = 2147483647;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY = 0;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE = 1;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY = 2;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 1;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK = 1;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `vmaCreateAllocator`.
        public static final MethodHandle MH_vmaCreateAllocator = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaDestroyAllocator`.
        public static final MethodHandle MH_vmaDestroyAllocator = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `vmaGetAllocatorInfo`.
        public static final MethodHandle MH_vmaGetAllocatorInfo = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetPhysicalDeviceProperties`.
        public static final MethodHandle MH_vmaGetPhysicalDeviceProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetMemoryProperties`.
        public static final MethodHandle MH_vmaGetMemoryProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetMemoryTypeProperties`.
        public static final MethodHandle MH_vmaGetMemoryTypeProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `vmaSetCurrentFrameIndex`.
        public static final MethodHandle MH_vmaSetCurrentFrameIndex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `vmaCalculateStatistics`.
        public static final MethodHandle MH_vmaCalculateStatistics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetHeapBudgets`.
        public static final MethodHandle MH_vmaGetHeapBudgets = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaFindMemoryTypeIndex`.
        public static final MethodHandle MH_vmaFindMemoryTypeIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaFindMemoryTypeIndexForBufferInfo`.
        public static final MethodHandle MH_vmaFindMemoryTypeIndexForBufferInfo = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaFindMemoryTypeIndexForImageInfo`.
        public static final MethodHandle MH_vmaFindMemoryTypeIndexForImageInfo = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreatePool`.
        public static final MethodHandle MH_vmaCreatePool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaDestroyPool`.
        public static final MethodHandle MH_vmaDestroyPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetPoolStatistics`.
        public static final MethodHandle MH_vmaGetPoolStatistics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCalculatePoolStatistics`.
        public static final MethodHandle MH_vmaCalculatePoolStatistics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCheckPoolCorruption`.
        public static final MethodHandle MH_vmaCheckPoolCorruption = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetPoolName`.
        public static final MethodHandle MH_vmaGetPoolName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaSetPoolName`.
        public static final MethodHandle MH_vmaSetPoolName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaAllocateMemory`.
        public static final MethodHandle MH_vmaAllocateMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaAllocateMemoryPages`.
        public static final MethodHandle MH_vmaAllocateMemoryPages = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaAllocateMemoryForBuffer`.
        public static final MethodHandle MH_vmaAllocateMemoryForBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaAllocateMemoryForImage`.
        public static final MethodHandle MH_vmaAllocateMemoryForImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaFreeMemory`.
        public static final MethodHandle MH_vmaFreeMemory = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaFreeMemoryPages`.
        public static final MethodHandle MH_vmaFreeMemoryPages = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetAllocationInfo`.
        public static final MethodHandle MH_vmaGetAllocationInfo = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetAllocationInfo2`.
        public static final MethodHandle MH_vmaGetAllocationInfo2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaSetAllocationUserData`.
        public static final MethodHandle MH_vmaSetAllocationUserData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaSetAllocationName`.
        public static final MethodHandle MH_vmaSetAllocationName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetAllocationMemoryProperties`.
        public static final MethodHandle MH_vmaGetAllocationMemoryProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaMapMemory`.
        public static final MethodHandle MH_vmaMapMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaUnmapMemory`.
        public static final MethodHandle MH_vmaUnmapMemory = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaFlushAllocation`.
        public static final MethodHandle MH_vmaFlushAllocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of `vmaInvalidateAllocation`.
        public static final MethodHandle MH_vmaInvalidateAllocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of `vmaFlushAllocations`.
        public static final MethodHandle MH_vmaFlushAllocations = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaInvalidateAllocations`.
        public static final MethodHandle MH_vmaInvalidateAllocations = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCopyMemoryToAllocation`.
        public static final MethodHandle MH_vmaCopyMemoryToAllocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of `vmaCopyAllocationToMemory`.
        public static final MethodHandle MH_vmaCopyAllocationToMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        /// The method handle of `vmaCheckCorruption`.
        public static final MethodHandle MH_vmaCheckCorruption = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `vmaBeginDefragmentation`.
        public static final MethodHandle MH_vmaBeginDefragmentation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaEndDefragmentation`.
        public static final MethodHandle MH_vmaEndDefragmentation = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaBeginDefragmentationPass`.
        public static final MethodHandle MH_vmaBeginDefragmentationPass = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaEndDefragmentationPass`.
        public static final MethodHandle MH_vmaEndDefragmentationPass = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaBindBufferMemory`.
        public static final MethodHandle MH_vmaBindBufferMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        /// The method handle of `vmaBindBufferMemory2`.
        public static final MethodHandle MH_vmaBindBufferMemory2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `vmaBindImageMemory`.
        public static final MethodHandle MH_vmaBindImageMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        /// The method handle of `vmaBindImageMemory2`.
        public static final MethodHandle MH_vmaBindImageMemory2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateBuffer`.
        public static final MethodHandle MH_vmaCreateBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateBufferWithAlignment`.
        public static final MethodHandle MH_vmaCreateBufferWithAlignment = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateAliasingBuffer`.
        public static final MethodHandle MH_vmaCreateAliasingBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateAliasingBuffer2`.
        public static final MethodHandle MH_vmaCreateAliasingBuffer2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaDestroyBuffer`.
        public static final MethodHandle MH_vmaDestroyBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateImage`.
        public static final MethodHandle MH_vmaCreateImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateAliasingImage`.
        public static final MethodHandle MH_vmaCreateAliasingImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateAliasingImage2`.
        public static final MethodHandle MH_vmaCreateAliasingImage2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaDestroyImage`.
        public static final MethodHandle MH_vmaDestroyImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `vmaCreateVirtualBlock`.
        public static final MethodHandle MH_vmaCreateVirtualBlock = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaDestroyVirtualBlock`.
        public static final MethodHandle MH_vmaDestroyVirtualBlock = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `vmaIsVirtualBlockEmpty`.
        public static final MethodHandle MH_vmaIsVirtualBlockEmpty = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetVirtualAllocationInfo`.
        public static final MethodHandle MH_vmaGetVirtualAllocationInfo = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaVirtualAllocate`.
        public static final MethodHandle MH_vmaVirtualAllocate = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaVirtualFree`.
        public static final MethodHandle MH_vmaVirtualFree = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaClearVirtualBlock`.
        public static final MethodHandle MH_vmaClearVirtualBlock = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `vmaSetVirtualAllocationUserData`.
        public static final MethodHandle MH_vmaSetVirtualAllocationUserData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaGetVirtualBlockStatistics`.
        public static final MethodHandle MH_vmaGetVirtualBlockStatistics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaCalculateVirtualBlockStatistics`.
        public static final MethodHandle MH_vmaCalculateVirtualBlockStatistics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaBuildVirtualBlockStatsString`.
        public static final MethodHandle MH_vmaBuildVirtualBlockStatsString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `vmaFreeVirtualBlockStatsString`.
        public static final MethodHandle MH_vmaFreeVirtualBlockStatsString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `vmaBuildStatsString`.
        public static final MethodHandle MH_vmaBuildStatsString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `vmaFreeStatsString`.
        public static final MethodHandle MH_vmaFreeStatsString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The function address of `vmaCreateAllocator`.
        public final MemorySegment PFN_vmaCreateAllocator;
        /// The function address of `vmaDestroyAllocator`.
        public final MemorySegment PFN_vmaDestroyAllocator;
        /// The function address of `vmaGetAllocatorInfo`.
        public final MemorySegment PFN_vmaGetAllocatorInfo;
        /// The function address of `vmaGetPhysicalDeviceProperties`.
        public final MemorySegment PFN_vmaGetPhysicalDeviceProperties;
        /// The function address of `vmaGetMemoryProperties`.
        public final MemorySegment PFN_vmaGetMemoryProperties;
        /// The function address of `vmaGetMemoryTypeProperties`.
        public final MemorySegment PFN_vmaGetMemoryTypeProperties;
        /// The function address of `vmaSetCurrentFrameIndex`.
        public final MemorySegment PFN_vmaSetCurrentFrameIndex;
        /// The function address of `vmaCalculateStatistics`.
        public final MemorySegment PFN_vmaCalculateStatistics;
        /// The function address of `vmaGetHeapBudgets`.
        public final MemorySegment PFN_vmaGetHeapBudgets;
        /// The function address of `vmaFindMemoryTypeIndex`.
        public final MemorySegment PFN_vmaFindMemoryTypeIndex;
        /// The function address of `vmaFindMemoryTypeIndexForBufferInfo`.
        public final MemorySegment PFN_vmaFindMemoryTypeIndexForBufferInfo;
        /// The function address of `vmaFindMemoryTypeIndexForImageInfo`.
        public final MemorySegment PFN_vmaFindMemoryTypeIndexForImageInfo;
        /// The function address of `vmaCreatePool`.
        public final MemorySegment PFN_vmaCreatePool;
        /// The function address of `vmaDestroyPool`.
        public final MemorySegment PFN_vmaDestroyPool;
        /// The function address of `vmaGetPoolStatistics`.
        public final MemorySegment PFN_vmaGetPoolStatistics;
        /// The function address of `vmaCalculatePoolStatistics`.
        public final MemorySegment PFN_vmaCalculatePoolStatistics;
        /// The function address of `vmaCheckPoolCorruption`.
        public final MemorySegment PFN_vmaCheckPoolCorruption;
        /// The function address of `vmaGetPoolName`.
        public final MemorySegment PFN_vmaGetPoolName;
        /// The function address of `vmaSetPoolName`.
        public final MemorySegment PFN_vmaSetPoolName;
        /// The function address of `vmaAllocateMemory`.
        public final MemorySegment PFN_vmaAllocateMemory;
        /// The function address of `vmaAllocateMemoryPages`.
        public final MemorySegment PFN_vmaAllocateMemoryPages;
        /// The function address of `vmaAllocateMemoryForBuffer`.
        public final MemorySegment PFN_vmaAllocateMemoryForBuffer;
        /// The function address of `vmaAllocateMemoryForImage`.
        public final MemorySegment PFN_vmaAllocateMemoryForImage;
        /// The function address of `vmaFreeMemory`.
        public final MemorySegment PFN_vmaFreeMemory;
        /// The function address of `vmaFreeMemoryPages`.
        public final MemorySegment PFN_vmaFreeMemoryPages;
        /// The function address of `vmaGetAllocationInfo`.
        public final MemorySegment PFN_vmaGetAllocationInfo;
        /// The function address of `vmaGetAllocationInfo2`.
        public final MemorySegment PFN_vmaGetAllocationInfo2;
        /// The function address of `vmaSetAllocationUserData`.
        public final MemorySegment PFN_vmaSetAllocationUserData;
        /// The function address of `vmaSetAllocationName`.
        public final MemorySegment PFN_vmaSetAllocationName;
        /// The function address of `vmaGetAllocationMemoryProperties`.
        public final MemorySegment PFN_vmaGetAllocationMemoryProperties;
        /// The function address of `vmaMapMemory`.
        public final MemorySegment PFN_vmaMapMemory;
        /// The function address of `vmaUnmapMemory`.
        public final MemorySegment PFN_vmaUnmapMemory;
        /// The function address of `vmaFlushAllocation`.
        public final MemorySegment PFN_vmaFlushAllocation;
        /// The function address of `vmaInvalidateAllocation`.
        public final MemorySegment PFN_vmaInvalidateAllocation;
        /// The function address of `vmaFlushAllocations`.
        public final MemorySegment PFN_vmaFlushAllocations;
        /// The function address of `vmaInvalidateAllocations`.
        public final MemorySegment PFN_vmaInvalidateAllocations;
        /// The function address of `vmaCopyMemoryToAllocation`.
        public final MemorySegment PFN_vmaCopyMemoryToAllocation;
        /// The function address of `vmaCopyAllocationToMemory`.
        public final MemorySegment PFN_vmaCopyAllocationToMemory;
        /// The function address of `vmaCheckCorruption`.
        public final MemorySegment PFN_vmaCheckCorruption;
        /// The function address of `vmaBeginDefragmentation`.
        public final MemorySegment PFN_vmaBeginDefragmentation;
        /// The function address of `vmaEndDefragmentation`.
        public final MemorySegment PFN_vmaEndDefragmentation;
        /// The function address of `vmaBeginDefragmentationPass`.
        public final MemorySegment PFN_vmaBeginDefragmentationPass;
        /// The function address of `vmaEndDefragmentationPass`.
        public final MemorySegment PFN_vmaEndDefragmentationPass;
        /// The function address of `vmaBindBufferMemory`.
        public final MemorySegment PFN_vmaBindBufferMemory;
        /// The function address of `vmaBindBufferMemory2`.
        public final MemorySegment PFN_vmaBindBufferMemory2;
        /// The function address of `vmaBindImageMemory`.
        public final MemorySegment PFN_vmaBindImageMemory;
        /// The function address of `vmaBindImageMemory2`.
        public final MemorySegment PFN_vmaBindImageMemory2;
        /// The function address of `vmaCreateBuffer`.
        public final MemorySegment PFN_vmaCreateBuffer;
        /// The function address of `vmaCreateBufferWithAlignment`.
        public final MemorySegment PFN_vmaCreateBufferWithAlignment;
        /// The function address of `vmaCreateAliasingBuffer`.
        public final MemorySegment PFN_vmaCreateAliasingBuffer;
        /// The function address of `vmaCreateAliasingBuffer2`.
        public final MemorySegment PFN_vmaCreateAliasingBuffer2;
        /// The function address of `vmaDestroyBuffer`.
        public final MemorySegment PFN_vmaDestroyBuffer;
        /// The function address of `vmaCreateImage`.
        public final MemorySegment PFN_vmaCreateImage;
        /// The function address of `vmaCreateAliasingImage`.
        public final MemorySegment PFN_vmaCreateAliasingImage;
        /// The function address of `vmaCreateAliasingImage2`.
        public final MemorySegment PFN_vmaCreateAliasingImage2;
        /// The function address of `vmaDestroyImage`.
        public final MemorySegment PFN_vmaDestroyImage;
        /// The function address of `vmaCreateVirtualBlock`.
        public final MemorySegment PFN_vmaCreateVirtualBlock;
        /// The function address of `vmaDestroyVirtualBlock`.
        public final MemorySegment PFN_vmaDestroyVirtualBlock;
        /// The function address of `vmaIsVirtualBlockEmpty`.
        public final MemorySegment PFN_vmaIsVirtualBlockEmpty;
        /// The function address of `vmaGetVirtualAllocationInfo`.
        public final MemorySegment PFN_vmaGetVirtualAllocationInfo;
        /// The function address of `vmaVirtualAllocate`.
        public final MemorySegment PFN_vmaVirtualAllocate;
        /// The function address of `vmaVirtualFree`.
        public final MemorySegment PFN_vmaVirtualFree;
        /// The function address of `vmaClearVirtualBlock`.
        public final MemorySegment PFN_vmaClearVirtualBlock;
        /// The function address of `vmaSetVirtualAllocationUserData`.
        public final MemorySegment PFN_vmaSetVirtualAllocationUserData;
        /// The function address of `vmaGetVirtualBlockStatistics`.
        public final MemorySegment PFN_vmaGetVirtualBlockStatistics;
        /// The function address of `vmaCalculateVirtualBlockStatistics`.
        public final MemorySegment PFN_vmaCalculateVirtualBlockStatistics;
        /// The function address of `vmaBuildVirtualBlockStatsString`.
        public final MemorySegment PFN_vmaBuildVirtualBlockStatsString;
        /// The function address of `vmaFreeVirtualBlockStatsString`.
        public final MemorySegment PFN_vmaFreeVirtualBlockStatsString;
        /// The function address of `vmaBuildStatsString`.
        public final MemorySegment PFN_vmaBuildStatsString;
        /// The function address of `vmaFreeStatsString`.
        public final MemorySegment PFN_vmaFreeStatsString;
        private Handles() {
            PFN_vmaCreateAllocator = VMAInternal.lookup().findOrThrow("vmaCreateAllocator");
            PFN_vmaDestroyAllocator = VMAInternal.lookup().findOrThrow("vmaDestroyAllocator");
            PFN_vmaGetAllocatorInfo = VMAInternal.lookup().findOrThrow("vmaGetAllocatorInfo");
            PFN_vmaGetPhysicalDeviceProperties = VMAInternal.lookup().findOrThrow("vmaGetPhysicalDeviceProperties");
            PFN_vmaGetMemoryProperties = VMAInternal.lookup().findOrThrow("vmaGetMemoryProperties");
            PFN_vmaGetMemoryTypeProperties = VMAInternal.lookup().findOrThrow("vmaGetMemoryTypeProperties");
            PFN_vmaSetCurrentFrameIndex = VMAInternal.lookup().findOrThrow("vmaSetCurrentFrameIndex");
            PFN_vmaCalculateStatistics = VMAInternal.lookup().findOrThrow("vmaCalculateStatistics");
            PFN_vmaGetHeapBudgets = VMAInternal.lookup().findOrThrow("vmaGetHeapBudgets");
            PFN_vmaFindMemoryTypeIndex = VMAInternal.lookup().findOrThrow("vmaFindMemoryTypeIndex");
            PFN_vmaFindMemoryTypeIndexForBufferInfo = VMAInternal.lookup().findOrThrow("vmaFindMemoryTypeIndexForBufferInfo");
            PFN_vmaFindMemoryTypeIndexForImageInfo = VMAInternal.lookup().findOrThrow("vmaFindMemoryTypeIndexForImageInfo");
            PFN_vmaCreatePool = VMAInternal.lookup().findOrThrow("vmaCreatePool");
            PFN_vmaDestroyPool = VMAInternal.lookup().findOrThrow("vmaDestroyPool");
            PFN_vmaGetPoolStatistics = VMAInternal.lookup().findOrThrow("vmaGetPoolStatistics");
            PFN_vmaCalculatePoolStatistics = VMAInternal.lookup().findOrThrow("vmaCalculatePoolStatistics");
            PFN_vmaCheckPoolCorruption = VMAInternal.lookup().findOrThrow("vmaCheckPoolCorruption");
            PFN_vmaGetPoolName = VMAInternal.lookup().findOrThrow("vmaGetPoolName");
            PFN_vmaSetPoolName = VMAInternal.lookup().findOrThrow("vmaSetPoolName");
            PFN_vmaAllocateMemory = VMAInternal.lookup().findOrThrow("vmaAllocateMemory");
            PFN_vmaAllocateMemoryPages = VMAInternal.lookup().findOrThrow("vmaAllocateMemoryPages");
            PFN_vmaAllocateMemoryForBuffer = VMAInternal.lookup().findOrThrow("vmaAllocateMemoryForBuffer");
            PFN_vmaAllocateMemoryForImage = VMAInternal.lookup().findOrThrow("vmaAllocateMemoryForImage");
            PFN_vmaFreeMemory = VMAInternal.lookup().findOrThrow("vmaFreeMemory");
            PFN_vmaFreeMemoryPages = VMAInternal.lookup().findOrThrow("vmaFreeMemoryPages");
            PFN_vmaGetAllocationInfo = VMAInternal.lookup().findOrThrow("vmaGetAllocationInfo");
            PFN_vmaGetAllocationInfo2 = VMAInternal.lookup().findOrThrow("vmaGetAllocationInfo2");
            PFN_vmaSetAllocationUserData = VMAInternal.lookup().findOrThrow("vmaSetAllocationUserData");
            PFN_vmaSetAllocationName = VMAInternal.lookup().findOrThrow("vmaSetAllocationName");
            PFN_vmaGetAllocationMemoryProperties = VMAInternal.lookup().findOrThrow("vmaGetAllocationMemoryProperties");
            PFN_vmaMapMemory = VMAInternal.lookup().findOrThrow("vmaMapMemory");
            PFN_vmaUnmapMemory = VMAInternal.lookup().findOrThrow("vmaUnmapMemory");
            PFN_vmaFlushAllocation = VMAInternal.lookup().findOrThrow("vmaFlushAllocation");
            PFN_vmaInvalidateAllocation = VMAInternal.lookup().findOrThrow("vmaInvalidateAllocation");
            PFN_vmaFlushAllocations = VMAInternal.lookup().findOrThrow("vmaFlushAllocations");
            PFN_vmaInvalidateAllocations = VMAInternal.lookup().findOrThrow("vmaInvalidateAllocations");
            PFN_vmaCopyMemoryToAllocation = VMAInternal.lookup().findOrThrow("vmaCopyMemoryToAllocation");
            PFN_vmaCopyAllocationToMemory = VMAInternal.lookup().findOrThrow("vmaCopyAllocationToMemory");
            PFN_vmaCheckCorruption = VMAInternal.lookup().findOrThrow("vmaCheckCorruption");
            PFN_vmaBeginDefragmentation = VMAInternal.lookup().findOrThrow("vmaBeginDefragmentation");
            PFN_vmaEndDefragmentation = VMAInternal.lookup().findOrThrow("vmaEndDefragmentation");
            PFN_vmaBeginDefragmentationPass = VMAInternal.lookup().findOrThrow("vmaBeginDefragmentationPass");
            PFN_vmaEndDefragmentationPass = VMAInternal.lookup().findOrThrow("vmaEndDefragmentationPass");
            PFN_vmaBindBufferMemory = VMAInternal.lookup().findOrThrow("vmaBindBufferMemory");
            PFN_vmaBindBufferMemory2 = VMAInternal.lookup().findOrThrow("vmaBindBufferMemory2");
            PFN_vmaBindImageMemory = VMAInternal.lookup().findOrThrow("vmaBindImageMemory");
            PFN_vmaBindImageMemory2 = VMAInternal.lookup().findOrThrow("vmaBindImageMemory2");
            PFN_vmaCreateBuffer = VMAInternal.lookup().findOrThrow("vmaCreateBuffer");
            PFN_vmaCreateBufferWithAlignment = VMAInternal.lookup().findOrThrow("vmaCreateBufferWithAlignment");
            PFN_vmaCreateAliasingBuffer = VMAInternal.lookup().findOrThrow("vmaCreateAliasingBuffer");
            PFN_vmaCreateAliasingBuffer2 = VMAInternal.lookup().findOrThrow("vmaCreateAliasingBuffer2");
            PFN_vmaDestroyBuffer = VMAInternal.lookup().findOrThrow("vmaDestroyBuffer");
            PFN_vmaCreateImage = VMAInternal.lookup().findOrThrow("vmaCreateImage");
            PFN_vmaCreateAliasingImage = VMAInternal.lookup().findOrThrow("vmaCreateAliasingImage");
            PFN_vmaCreateAliasingImage2 = VMAInternal.lookup().findOrThrow("vmaCreateAliasingImage2");
            PFN_vmaDestroyImage = VMAInternal.lookup().findOrThrow("vmaDestroyImage");
            PFN_vmaCreateVirtualBlock = VMAInternal.lookup().findOrThrow("vmaCreateVirtualBlock");
            PFN_vmaDestroyVirtualBlock = VMAInternal.lookup().findOrThrow("vmaDestroyVirtualBlock");
            PFN_vmaIsVirtualBlockEmpty = VMAInternal.lookup().findOrThrow("vmaIsVirtualBlockEmpty");
            PFN_vmaGetVirtualAllocationInfo = VMAInternal.lookup().findOrThrow("vmaGetVirtualAllocationInfo");
            PFN_vmaVirtualAllocate = VMAInternal.lookup().findOrThrow("vmaVirtualAllocate");
            PFN_vmaVirtualFree = VMAInternal.lookup().findOrThrow("vmaVirtualFree");
            PFN_vmaClearVirtualBlock = VMAInternal.lookup().findOrThrow("vmaClearVirtualBlock");
            PFN_vmaSetVirtualAllocationUserData = VMAInternal.lookup().findOrThrow("vmaSetVirtualAllocationUserData");
            PFN_vmaGetVirtualBlockStatistics = VMAInternal.lookup().findOrThrow("vmaGetVirtualBlockStatistics");
            PFN_vmaCalculateVirtualBlockStatistics = VMAInternal.lookup().findOrThrow("vmaCalculateVirtualBlockStatistics");
            PFN_vmaBuildVirtualBlockStatsString = VMAInternal.lookup().findOrThrow("vmaBuildVirtualBlockStatsString");
            PFN_vmaFreeVirtualBlockStatsString = VMAInternal.lookup().findOrThrow("vmaFreeVirtualBlockStatsString");
            PFN_vmaBuildStatsString = VMAInternal.lookup().findOrThrow("vmaBuildStatsString");
            PFN_vmaFreeStatsString = VMAInternal.lookup().findOrThrow("vmaFreeStatsString");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    /// ```
    /// (int) VkResult vmaCreateAllocator(const VmaAllocatorCreateInfo* pCreateInfo, VmaAllocator* pAllocator);
    /// ```
    public static int vmaCreateAllocator(MemorySegment pCreateInfo, MemorySegment pAllocator) {
        try { return (int) Handles.MH_vmaCreateAllocator.invokeExact(Handles.get().PFN_vmaCreateAllocator, pCreateInfo, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAllocator", e); }
    }

    /// ```
    /// void vmaDestroyAllocator((struct VmaAllocator *) VmaAllocator pAllocator);
    /// ```
    public static void vmaDestroyAllocator(MemorySegment pAllocator) {
        try { Handles.MH_vmaDestroyAllocator.invokeExact(Handles.get().PFN_vmaDestroyAllocator, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyAllocator", e); }
    }

    /// ```
    /// void vmaGetAllocatorInfo((struct VmaAllocator *) VmaAllocator allocator, VmaAllocatorInfo* pAllocatorInfo);
    /// ```
    public static void vmaGetAllocatorInfo(MemorySegment allocator, MemorySegment pAllocatorInfo) {
        try { Handles.MH_vmaGetAllocatorInfo.invokeExact(Handles.get().PFN_vmaGetAllocatorInfo, allocator, pAllocatorInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocatorInfo", e); }
    }

    /// ```
    /// void vmaGetPhysicalDeviceProperties((struct VmaAllocator *) VmaAllocator allocator, const VkPhysicalDeviceProperties** ppPhysicalDeviceProperties);
    /// ```
    public static void vmaGetPhysicalDeviceProperties(MemorySegment allocator, MemorySegment ppPhysicalDeviceProperties) {
        try { Handles.MH_vmaGetPhysicalDeviceProperties.invokeExact(Handles.get().PFN_vmaGetPhysicalDeviceProperties, allocator, ppPhysicalDeviceProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetPhysicalDeviceProperties", e); }
    }

    /// ```
    /// void vmaGetMemoryProperties((struct VmaAllocator *) VmaAllocator allocator, const VkPhysicalDeviceMemoryProperties** ppPhysicalDeviceMemoryProperties);
    /// ```
    public static void vmaGetMemoryProperties(MemorySegment allocator, MemorySegment ppPhysicalDeviceMemoryProperties) {
        try { Handles.MH_vmaGetMemoryProperties.invokeExact(Handles.get().PFN_vmaGetMemoryProperties, allocator, ppPhysicalDeviceMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetMemoryProperties", e); }
    }

    /// ```
    /// void vmaGetMemoryTypeProperties((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeIndex, VkMemoryPropertyFlags* pFlags);
    /// ```
    public static void vmaGetMemoryTypeProperties(MemorySegment allocator, int memoryTypeIndex, MemorySegment pFlags) {
        try { Handles.MH_vmaGetMemoryTypeProperties.invokeExact(Handles.get().PFN_vmaGetMemoryTypeProperties, allocator, memoryTypeIndex, pFlags); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetMemoryTypeProperties", e); }
    }

    /// ```
    /// void vmaSetCurrentFrameIndex((struct VmaAllocator *) VmaAllocator allocator, uint32_t frameIndex);
    /// ```
    public static void vmaSetCurrentFrameIndex(MemorySegment allocator, int frameIndex) {
        try { Handles.MH_vmaSetCurrentFrameIndex.invokeExact(Handles.get().PFN_vmaSetCurrentFrameIndex, allocator, frameIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetCurrentFrameIndex", e); }
    }

    /// ```
    /// void vmaCalculateStatistics((struct VmaAllocator *) VmaAllocator allocator, VmaTotalStatistics* pStats);
    /// ```
    public static void vmaCalculateStatistics(MemorySegment allocator, MemorySegment pStats) {
        try { Handles.MH_vmaCalculateStatistics.invokeExact(Handles.get().PFN_vmaCalculateStatistics, allocator, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCalculateStatistics", e); }
    }

    /// ```
    /// void vmaGetHeapBudgets((struct VmaAllocator *) VmaAllocator allocator, VmaBudget* pBudgets);
    /// ```
    public static void vmaGetHeapBudgets(MemorySegment allocator, MemorySegment pBudgets) {
        try { Handles.MH_vmaGetHeapBudgets.invokeExact(Handles.get().PFN_vmaGetHeapBudgets, allocator, pBudgets); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetHeapBudgets", e); }
    }

    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndex((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeBits, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndex(MemorySegment allocator, int memoryTypeBits, MemorySegment pAllocationCreateInfo, MemorySegment pMemoryTypeIndex) {
        try { return (int) Handles.MH_vmaFindMemoryTypeIndex.invokeExact(Handles.get().PFN_vmaFindMemoryTypeIndex, allocator, memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFindMemoryTypeIndex", e); }
    }

    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndexForBufferInfo((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndexForBufferInfo(MemorySegment allocator, MemorySegment pBufferCreateInfo, MemorySegment pAllocationCreateInfo, MemorySegment pMemoryTypeIndex) {
        try { return (int) Handles.MH_vmaFindMemoryTypeIndexForBufferInfo.invokeExact(Handles.get().PFN_vmaFindMemoryTypeIndexForBufferInfo, allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFindMemoryTypeIndexForBufferInfo", e); }
    }

    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndexForImageInfo((struct VmaAllocator *) VmaAllocator allocator, const VkImageCreateInfo* pImageCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndexForImageInfo(MemorySegment allocator, MemorySegment pImageCreateInfo, MemorySegment pAllocationCreateInfo, MemorySegment pMemoryTypeIndex) {
        try { return (int) Handles.MH_vmaFindMemoryTypeIndexForImageInfo.invokeExact(Handles.get().PFN_vmaFindMemoryTypeIndexForImageInfo, allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFindMemoryTypeIndexForImageInfo", e); }
    }

    /// ```
    /// (int) VkResult vmaCreatePool((struct VmaAllocator *) VmaAllocator allocator, const VmaPoolCreateInfo* pCreateInfo, VmaPool* pPool);
    /// ```
    public static int vmaCreatePool(MemorySegment allocator, MemorySegment pCreateInfo, MemorySegment pPool) {
        try { return (int) Handles.MH_vmaCreatePool.invokeExact(Handles.get().PFN_vmaCreatePool, allocator, pCreateInfo, pPool); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreatePool", e); }
    }

    /// ```
    /// void vmaDestroyPool((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool);
    /// ```
    public static void vmaDestroyPool(MemorySegment allocator, MemorySegment pool) {
        try { Handles.MH_vmaDestroyPool.invokeExact(Handles.get().PFN_vmaDestroyPool, allocator, pool); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyPool", e); }
    }

    /// ```
    /// void vmaGetPoolStatistics((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, VmaStatistics* pPoolStats);
    /// ```
    public static void vmaGetPoolStatistics(MemorySegment allocator, MemorySegment pool, MemorySegment pPoolStats) {
        try { Handles.MH_vmaGetPoolStatistics.invokeExact(Handles.get().PFN_vmaGetPoolStatistics, allocator, pool, pPoolStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetPoolStatistics", e); }
    }

    /// ```
    /// void vmaCalculatePoolStatistics((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, VmaDetailedStatistics* pPoolStats);
    /// ```
    public static void vmaCalculatePoolStatistics(MemorySegment allocator, MemorySegment pool, MemorySegment pPoolStats) {
        try { Handles.MH_vmaCalculatePoolStatistics.invokeExact(Handles.get().PFN_vmaCalculatePoolStatistics, allocator, pool, pPoolStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCalculatePoolStatistics", e); }
    }

    /// ```
    /// (int) VkResult vmaCheckPoolCorruption((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool);
    /// ```
    public static int vmaCheckPoolCorruption(MemorySegment allocator, MemorySegment pool) {
        try { return (int) Handles.MH_vmaCheckPoolCorruption.invokeExact(Handles.get().PFN_vmaCheckPoolCorruption, allocator, pool); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCheckPoolCorruption", e); }
    }

    /// ```
    /// void vmaGetPoolName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, const char** ppName);
    /// ```
    public static void vmaGetPoolName(MemorySegment allocator, MemorySegment pool, MemorySegment ppName) {
        try { Handles.MH_vmaGetPoolName.invokeExact(Handles.get().PFN_vmaGetPoolName, allocator, pool, ppName); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetPoolName", e); }
    }

    /// ```
    /// void vmaSetPoolName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, const char* pName);
    /// ```
    public static void vmaSetPoolName(MemorySegment allocator, MemorySegment pool, MemorySegment pName) {
        try { Handles.MH_vmaSetPoolName.invokeExact(Handles.get().PFN_vmaSetPoolName, allocator, pool, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetPoolName", e); }
    }

    /// ```
    /// (int) VkResult vmaAllocateMemory((struct VmaAllocator *) VmaAllocator allocator, const VkMemoryRequirements* pVkMemoryRequirements, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemory(MemorySegment allocator, MemorySegment pVkMemoryRequirements, MemorySegment pCreateInfo, MemorySegment pAllocation, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaAllocateMemory.invokeExact(Handles.get().PFN_vmaAllocateMemory, allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemory", e); }
    }

    /// ```
    /// (int) VkResult vmaAllocateMemoryPages((struct VmaAllocator *) VmaAllocator allocator, const VkMemoryRequirements* pVkMemoryRequirements, const VmaAllocationCreateInfo* pCreateInfo, size_t allocationCount, VmaAllocation* pAllocations, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryPages(MemorySegment allocator, MemorySegment pVkMemoryRequirements, MemorySegment pCreateInfo, long allocationCount, MemorySegment pAllocations, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaAllocateMemoryPages.invoke(Handles.get().PFN_vmaAllocateMemoryPages, allocator, pVkMemoryRequirements, pCreateInfo, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, allocationCount), pAllocations, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemoryPages", e); }
    }

    /// ```
    /// (int) VkResult vmaAllocateMemoryForBuffer((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkBuffer buffer, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryForBuffer(MemorySegment allocator, long buffer, MemorySegment pCreateInfo, MemorySegment pAllocation, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaAllocateMemoryForBuffer.invokeExact(Handles.get().PFN_vmaAllocateMemoryForBuffer, allocator, buffer, pCreateInfo, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemoryForBuffer", e); }
    }

    /// ```
    /// (int) VkResult vmaAllocateMemoryForImage((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkImage image, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryForImage(MemorySegment allocator, long image, MemorySegment pCreateInfo, MemorySegment pAllocation, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaAllocateMemoryForImage.invokeExact(Handles.get().PFN_vmaAllocateMemoryForImage, allocator, image, pCreateInfo, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemoryForImage", e); }
    }

    /// ```
    /// void vmaFreeMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaFreeMemory(MemorySegment allocator, MemorySegment allocation) {
        try { Handles.MH_vmaFreeMemory.invokeExact(Handles.get().PFN_vmaFreeMemory, allocator, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeMemory", e); }
    }

    /// ```
    /// void vmaFreeMemoryPages((struct VmaAllocator *) VmaAllocator allocator, size_t allocationCount, const VmaAllocation* pAllocations);
    /// ```
    public static void vmaFreeMemoryPages(MemorySegment allocator, long allocationCount, MemorySegment pAllocations) {
        try { Handles.MH_vmaFreeMemoryPages.invoke(Handles.get().PFN_vmaFreeMemoryPages, allocator, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, allocationCount), pAllocations); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeMemoryPages", e); }
    }

    /// ```
    /// void vmaGetAllocationInfo((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static void vmaGetAllocationInfo(MemorySegment allocator, MemorySegment allocation, MemorySegment pAllocationInfo) {
        try { Handles.MH_vmaGetAllocationInfo.invokeExact(Handles.get().PFN_vmaGetAllocationInfo, allocator, allocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocationInfo", e); }
    }

    /// ```
    /// void vmaGetAllocationInfo2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VmaAllocationInfo2* pAllocationInfo);
    /// ```
    public static void vmaGetAllocationInfo2(MemorySegment allocator, MemorySegment allocation, MemorySegment pAllocationInfo) {
        try { Handles.MH_vmaGetAllocationInfo2.invokeExact(Handles.get().PFN_vmaGetAllocationInfo2, allocator, allocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocationInfo2", e); }
    }

    /// ```
    /// void vmaSetAllocationUserData((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, void* pUserData);
    /// ```
    public static void vmaSetAllocationUserData(MemorySegment allocator, MemorySegment allocation, MemorySegment pUserData) {
        try { Handles.MH_vmaSetAllocationUserData.invokeExact(Handles.get().PFN_vmaSetAllocationUserData, allocator, allocation, pUserData); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetAllocationUserData", e); }
    }

    /// ```
    /// void vmaSetAllocationName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const char* pName);
    /// ```
    public static void vmaSetAllocationName(MemorySegment allocator, MemorySegment allocation, MemorySegment pName) {
        try { Handles.MH_vmaSetAllocationName.invokeExact(Handles.get().PFN_vmaSetAllocationName, allocator, allocation, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetAllocationName", e); }
    }

    /// ```
    /// void vmaGetAllocationMemoryProperties((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VkMemoryPropertyFlags* pFlags);
    /// ```
    public static void vmaGetAllocationMemoryProperties(MemorySegment allocator, MemorySegment allocation, MemorySegment pFlags) {
        try { Handles.MH_vmaGetAllocationMemoryProperties.invokeExact(Handles.get().PFN_vmaGetAllocationMemoryProperties, allocator, allocation, pFlags); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocationMemoryProperties", e); }
    }

    /// ```
    /// (int) VkResult vmaMapMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, void** ppData);
    /// ```
    public static int vmaMapMemory(MemorySegment allocator, MemorySegment allocation, MemorySegment ppData) {
        try { return (int) Handles.MH_vmaMapMemory.invokeExact(Handles.get().PFN_vmaMapMemory, allocator, allocation, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vmaMapMemory", e); }
    }

    /// ```
    /// void vmaUnmapMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaUnmapMemory(MemorySegment allocator, MemorySegment allocation) {
        try { Handles.MH_vmaUnmapMemory.invokeExact(Handles.get().PFN_vmaUnmapMemory, allocator, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaUnmapMemory", e); }
    }

    /// ```
    /// (int) VkResult vmaFlushAllocation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaFlushAllocation(MemorySegment allocator, MemorySegment allocation, long offset, long size) {
        try { return (int) Handles.MH_vmaFlushAllocation.invokeExact(Handles.get().PFN_vmaFlushAllocation, allocator, allocation, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFlushAllocation", e); }
    }

    /// ```
    /// (int) VkResult vmaInvalidateAllocation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaInvalidateAllocation(MemorySegment allocator, MemorySegment allocation, long offset, long size) {
        try { return (int) Handles.MH_vmaInvalidateAllocation.invokeExact(Handles.get().PFN_vmaInvalidateAllocation, allocator, allocation, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaInvalidateAllocation", e); }
    }

    /// ```
    /// (int) VkResult vmaFlushAllocations((struct VmaAllocator *) VmaAllocator allocator, uint32_t allocationCount, const VmaAllocation* allocations, const VkDeviceSize* offsets, const VkDeviceSize* sizes);
    /// ```
    public static int vmaFlushAllocations(MemorySegment allocator, int allocationCount, MemorySegment allocations, MemorySegment offsets, MemorySegment sizes) {
        try { return (int) Handles.MH_vmaFlushAllocations.invokeExact(Handles.get().PFN_vmaFlushAllocations, allocator, allocationCount, allocations, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFlushAllocations", e); }
    }

    /// ```
    /// (int) VkResult vmaInvalidateAllocations((struct VmaAllocator *) VmaAllocator allocator, uint32_t allocationCount, const VmaAllocation* allocations, const VkDeviceSize* offsets, const VkDeviceSize* sizes);
    /// ```
    public static int vmaInvalidateAllocations(MemorySegment allocator, int allocationCount, MemorySegment allocations, MemorySegment offsets, MemorySegment sizes) {
        try { return (int) Handles.MH_vmaInvalidateAllocations.invokeExact(Handles.get().PFN_vmaInvalidateAllocations, allocator, allocationCount, allocations, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in vmaInvalidateAllocations", e); }
    }

    /// ```
    /// (int) VkResult vmaCopyMemoryToAllocation((struct VmaAllocator *) VmaAllocator allocator, const void* pSrcHostPointer, (struct VmaAllocation *) VmaAllocation dstAllocation, (uint64_t) VkDeviceSize dstAllocationLocalOffset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaCopyMemoryToAllocation(MemorySegment allocator, MemorySegment pSrcHostPointer, MemorySegment dstAllocation, long dstAllocationLocalOffset, long size) {
        try { return (int) Handles.MH_vmaCopyMemoryToAllocation.invokeExact(Handles.get().PFN_vmaCopyMemoryToAllocation, allocator, pSrcHostPointer, dstAllocation, dstAllocationLocalOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCopyMemoryToAllocation", e); }
    }

    /// ```
    /// (int) VkResult vmaCopyAllocationToMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation srcAllocation, (uint64_t) VkDeviceSize srcAllocationLocalOffset, void* pDstHostPointer, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaCopyAllocationToMemory(MemorySegment allocator, MemorySegment srcAllocation, long srcAllocationLocalOffset, MemorySegment pDstHostPointer, long size) {
        try { return (int) Handles.MH_vmaCopyAllocationToMemory.invokeExact(Handles.get().PFN_vmaCopyAllocationToMemory, allocator, srcAllocation, srcAllocationLocalOffset, pDstHostPointer, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCopyAllocationToMemory", e); }
    }

    /// ```
    /// (int) VkResult vmaCheckCorruption((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeBits);
    /// ```
    public static int vmaCheckCorruption(MemorySegment allocator, int memoryTypeBits) {
        try { return (int) Handles.MH_vmaCheckCorruption.invokeExact(Handles.get().PFN_vmaCheckCorruption, allocator, memoryTypeBits); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCheckCorruption", e); }
    }

    /// ```
    /// (int) VkResult vmaBeginDefragmentation((struct VmaAllocator *) VmaAllocator allocator, const VmaDefragmentationInfo* pInfo, VmaDefragmentationContext* pContext);
    /// ```
    public static int vmaBeginDefragmentation(MemorySegment allocator, MemorySegment pInfo, MemorySegment pContext) {
        try { return (int) Handles.MH_vmaBeginDefragmentation.invokeExact(Handles.get().PFN_vmaBeginDefragmentation, allocator, pInfo, pContext); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBeginDefragmentation", e); }
    }

    /// ```
    /// void vmaEndDefragmentation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationStats* pStats);
    /// ```
    public static void vmaEndDefragmentation(MemorySegment allocator, MemorySegment context, MemorySegment pStats) {
        try { Handles.MH_vmaEndDefragmentation.invokeExact(Handles.get().PFN_vmaEndDefragmentation, allocator, context, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaEndDefragmentation", e); }
    }

    /// ```
    /// (int) VkResult vmaBeginDefragmentationPass((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo* pPassInfo);
    /// ```
    public static int vmaBeginDefragmentationPass(MemorySegment allocator, MemorySegment context, MemorySegment pPassInfo) {
        try { return (int) Handles.MH_vmaBeginDefragmentationPass.invokeExact(Handles.get().PFN_vmaBeginDefragmentationPass, allocator, context, pPassInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBeginDefragmentationPass", e); }
    }

    /// ```
    /// (int) VkResult vmaEndDefragmentationPass((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo* pPassInfo);
    /// ```
    public static int vmaEndDefragmentationPass(MemorySegment allocator, MemorySegment context, MemorySegment pPassInfo) {
        try { return (int) Handles.MH_vmaEndDefragmentationPass.invokeExact(Handles.get().PFN_vmaEndDefragmentationPass, allocator, context, pPassInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaEndDefragmentationPass", e); }
    }

    /// ```
    /// (int) VkResult vmaBindBufferMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkBuffer buffer);
    /// ```
    public static int vmaBindBufferMemory(MemorySegment allocator, MemorySegment allocation, long buffer) {
        try { return (int) Handles.MH_vmaBindBufferMemory.invokeExact(Handles.get().PFN_vmaBindBufferMemory, allocator, allocation, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindBufferMemory", e); }
    }

    /// ```
    /// (int) VkResult vmaBindBufferMemory2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, (uint64_t) VkBuffer buffer, const void* pNext);
    /// ```
    public static int vmaBindBufferMemory2(MemorySegment allocator, MemorySegment allocation, long allocationLocalOffset, long buffer, MemorySegment pNext) {
        try { return (int) Handles.MH_vmaBindBufferMemory2.invokeExact(Handles.get().PFN_vmaBindBufferMemory2, allocator, allocation, allocationLocalOffset, buffer, pNext); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindBufferMemory2", e); }
    }

    /// ```
    /// (int) VkResult vmaBindImageMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkImage image);
    /// ```
    public static int vmaBindImageMemory(MemorySegment allocator, MemorySegment allocation, long image) {
        try { return (int) Handles.MH_vmaBindImageMemory.invokeExact(Handles.get().PFN_vmaBindImageMemory, allocator, allocation, image); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindImageMemory", e); }
    }

    /// ```
    /// (int) VkResult vmaBindImageMemory2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, (uint64_t) VkImage image, const void* pNext);
    /// ```
    public static int vmaBindImageMemory2(MemorySegment allocator, MemorySegment allocation, long allocationLocalOffset, long image, MemorySegment pNext) {
        try { return (int) Handles.MH_vmaBindImageMemory2.invokeExact(Handles.get().PFN_vmaBindImageMemory2, allocator, allocation, allocationLocalOffset, image, pNext); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindImageMemory2", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateBuffer((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, VkBuffer* pBuffer, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateBuffer(MemorySegment allocator, MemorySegment pBufferCreateInfo, MemorySegment pAllocationCreateInfo, MemorySegment pBuffer, MemorySegment pAllocation, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaCreateBuffer.invokeExact(Handles.get().PFN_vmaCreateBuffer, allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateBuffer", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateBufferWithAlignment((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, (uint64_t) VkDeviceSize minAlignment, VkBuffer* pBuffer, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateBufferWithAlignment(MemorySegment allocator, MemorySegment pBufferCreateInfo, MemorySegment pAllocationCreateInfo, long minAlignment, MemorySegment pBuffer, MemorySegment pAllocation, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaCreateBufferWithAlignment.invokeExact(Handles.get().PFN_vmaCreateBufferWithAlignment, allocator, pBufferCreateInfo, pAllocationCreateInfo, minAlignment, pBuffer, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateBufferWithAlignment", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateAliasingBuffer((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const VkBufferCreateInfo* pBufferCreateInfo, VkBuffer* pBuffer);
    /// ```
    public static int vmaCreateAliasingBuffer(MemorySegment allocator, MemorySegment allocation, MemorySegment pBufferCreateInfo, MemorySegment pBuffer) {
        try { return (int) Handles.MH_vmaCreateAliasingBuffer.invokeExact(Handles.get().PFN_vmaCreateAliasingBuffer, allocator, allocation, pBufferCreateInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingBuffer", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateAliasingBuffer2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, const VkBufferCreateInfo* pBufferCreateInfo, VkBuffer* pBuffer);
    /// ```
    public static int vmaCreateAliasingBuffer2(MemorySegment allocator, MemorySegment allocation, long allocationLocalOffset, MemorySegment pBufferCreateInfo, MemorySegment pBuffer) {
        try { return (int) Handles.MH_vmaCreateAliasingBuffer2.invokeExact(Handles.get().PFN_vmaCreateAliasingBuffer2, allocator, allocation, allocationLocalOffset, pBufferCreateInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingBuffer2", e); }
    }

    /// ```
    /// void vmaDestroyBuffer((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkBuffer buffer, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaDestroyBuffer(MemorySegment allocator, long buffer, MemorySegment allocation) {
        try { Handles.MH_vmaDestroyBuffer.invokeExact(Handles.get().PFN_vmaDestroyBuffer, allocator, buffer, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyBuffer", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateImage((struct VmaAllocator *) VmaAllocator allocator, const VkImageCreateInfo* pImageCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, VkImage* pImage, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateImage(MemorySegment allocator, MemorySegment pImageCreateInfo, MemorySegment pAllocationCreateInfo, MemorySegment pImage, MemorySegment pAllocation, MemorySegment pAllocationInfo) {
        try { return (int) Handles.MH_vmaCreateImage.invokeExact(Handles.get().PFN_vmaCreateImage, allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateImage", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateAliasingImage((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const VkImageCreateInfo* pImageCreateInfo, VkImage* pImage);
    /// ```
    public static int vmaCreateAliasingImage(MemorySegment allocator, MemorySegment allocation, MemorySegment pImageCreateInfo, MemorySegment pImage) {
        try { return (int) Handles.MH_vmaCreateAliasingImage.invokeExact(Handles.get().PFN_vmaCreateAliasingImage, allocator, allocation, pImageCreateInfo, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingImage", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateAliasingImage2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, const VkImageCreateInfo* pImageCreateInfo, VkImage* pImage);
    /// ```
    public static int vmaCreateAliasingImage2(MemorySegment allocator, MemorySegment allocation, long allocationLocalOffset, MemorySegment pImageCreateInfo, MemorySegment pImage) {
        try { return (int) Handles.MH_vmaCreateAliasingImage2.invokeExact(Handles.get().PFN_vmaCreateAliasingImage2, allocator, allocation, allocationLocalOffset, pImageCreateInfo, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingImage2", e); }
    }

    /// ```
    /// void vmaDestroyImage((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkImage image, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaDestroyImage(MemorySegment allocator, long image, MemorySegment allocation) {
        try { Handles.MH_vmaDestroyImage.invokeExact(Handles.get().PFN_vmaDestroyImage, allocator, image, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyImage", e); }
    }

    /// ```
    /// (int) VkResult vmaCreateVirtualBlock(const VmaVirtualBlockCreateInfo* pCreateInfo, VmaVirtualBlock* pVirtualBlock);
    /// ```
    public static int vmaCreateVirtualBlock(MemorySegment pCreateInfo, MemorySegment pVirtualBlock) {
        try { return (int) Handles.MH_vmaCreateVirtualBlock.invokeExact(Handles.get().PFN_vmaCreateVirtualBlock, pCreateInfo, pVirtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateVirtualBlock", e); }
    }

    /// ```
    /// void vmaDestroyVirtualBlock((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static void vmaDestroyVirtualBlock(MemorySegment virtualBlock) {
        try { Handles.MH_vmaDestroyVirtualBlock.invokeExact(Handles.get().PFN_vmaDestroyVirtualBlock, virtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyVirtualBlock", e); }
    }

    /// ```
    /// (uint32_t) VkBool32 vmaIsVirtualBlockEmpty((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static int vmaIsVirtualBlockEmpty(MemorySegment virtualBlock) {
        try { return (int) Handles.MH_vmaIsVirtualBlockEmpty.invokeExact(Handles.get().PFN_vmaIsVirtualBlockEmpty, virtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaIsVirtualBlockEmpty", e); }
    }

    /// ```
    /// void vmaGetVirtualAllocationInfo((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation, VmaVirtualAllocationInfo* pVirtualAllocInfo);
    /// ```
    public static void vmaGetVirtualAllocationInfo(MemorySegment virtualBlock, MemorySegment allocation, MemorySegment pVirtualAllocInfo) {
        try { Handles.MH_vmaGetVirtualAllocationInfo.invokeExact(Handles.get().PFN_vmaGetVirtualAllocationInfo, virtualBlock, allocation, pVirtualAllocInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetVirtualAllocationInfo", e); }
    }

    /// ```
    /// (int) VkResult vmaVirtualAllocate((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, const VmaVirtualAllocationCreateInfo* pCreateInfo, VmaVirtualAllocation* pAllocation, VkDeviceSize* pOffset);
    /// ```
    public static int vmaVirtualAllocate(MemorySegment virtualBlock, MemorySegment pCreateInfo, MemorySegment pAllocation, MemorySegment pOffset) {
        try { return (int) Handles.MH_vmaVirtualAllocate.invokeExact(Handles.get().PFN_vmaVirtualAllocate, virtualBlock, pCreateInfo, pAllocation, pOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vmaVirtualAllocate", e); }
    }

    /// ```
    /// void vmaVirtualFree((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation);
    /// ```
    public static void vmaVirtualFree(MemorySegment virtualBlock, MemorySegment allocation) {
        try { Handles.MH_vmaVirtualFree.invokeExact(Handles.get().PFN_vmaVirtualFree, virtualBlock, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaVirtualFree", e); }
    }

    /// ```
    /// void vmaClearVirtualBlock((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static void vmaClearVirtualBlock(MemorySegment virtualBlock) {
        try { Handles.MH_vmaClearVirtualBlock.invokeExact(Handles.get().PFN_vmaClearVirtualBlock, virtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaClearVirtualBlock", e); }
    }

    /// ```
    /// void vmaSetVirtualAllocationUserData((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation, void* pUserData);
    /// ```
    public static void vmaSetVirtualAllocationUserData(MemorySegment virtualBlock, MemorySegment allocation, MemorySegment pUserData) {
        try { Handles.MH_vmaSetVirtualAllocationUserData.invokeExact(Handles.get().PFN_vmaSetVirtualAllocationUserData, virtualBlock, allocation, pUserData); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetVirtualAllocationUserData", e); }
    }

    /// ```
    /// void vmaGetVirtualBlockStatistics((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, VmaStatistics* pStats);
    /// ```
    public static void vmaGetVirtualBlockStatistics(MemorySegment virtualBlock, MemorySegment pStats) {
        try { Handles.MH_vmaGetVirtualBlockStatistics.invokeExact(Handles.get().PFN_vmaGetVirtualBlockStatistics, virtualBlock, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetVirtualBlockStatistics", e); }
    }

    /// ```
    /// void vmaCalculateVirtualBlockStatistics((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, VmaDetailedStatistics* pStats);
    /// ```
    public static void vmaCalculateVirtualBlockStatistics(MemorySegment virtualBlock, MemorySegment pStats) {
        try { Handles.MH_vmaCalculateVirtualBlockStatistics.invokeExact(Handles.get().PFN_vmaCalculateVirtualBlockStatistics, virtualBlock, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCalculateVirtualBlockStatistics", e); }
    }

    /// ```
    /// void vmaBuildVirtualBlockStatsString((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, char** ppStatsString, (uint32_t) VkBool32 detailedMap);
    /// ```
    public static void vmaBuildVirtualBlockStatsString(MemorySegment virtualBlock, MemorySegment ppStatsString, int detailedMap) {
        try { Handles.MH_vmaBuildVirtualBlockStatsString.invokeExact(Handles.get().PFN_vmaBuildVirtualBlockStatsString, virtualBlock, ppStatsString, detailedMap); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBuildVirtualBlockStatsString", e); }
    }

    /// ```
    /// void vmaFreeVirtualBlockStatsString((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, char* pStatsString);
    /// ```
    public static void vmaFreeVirtualBlockStatsString(MemorySegment virtualBlock, MemorySegment pStatsString) {
        try { Handles.MH_vmaFreeVirtualBlockStatsString.invokeExact(Handles.get().PFN_vmaFreeVirtualBlockStatsString, virtualBlock, pStatsString); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeVirtualBlockStatsString", e); }
    }

    /// ```
    /// void vmaBuildStatsString((struct VmaAllocator *) VmaAllocator allocator, char** ppStatsString, (uint32_t) VkBool32 detailedMap);
    /// ```
    public static void vmaBuildStatsString(MemorySegment allocator, MemorySegment ppStatsString, int detailedMap) {
        try { Handles.MH_vmaBuildStatsString.invokeExact(Handles.get().PFN_vmaBuildStatsString, allocator, ppStatsString, detailedMap); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBuildStatsString", e); }
    }

    /// ```
    /// void vmaFreeStatsString((struct VmaAllocator *) VmaAllocator allocator, char* pStatsString);
    /// ```
    public static void vmaFreeStatsString(MemorySegment allocator, MemorySegment pStatsString) {
        try { Handles.MH_vmaFreeStatsString.invokeExact(Handles.get().PFN_vmaFreeStatsString, allocator, pStatsString); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeStatsString", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MASK =
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT |
            VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT |
            VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK =
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK = VMA_ALLOCATION_CREATE_STRATEGY_MASK;

    private VkMemAlloc() {
    }
}
