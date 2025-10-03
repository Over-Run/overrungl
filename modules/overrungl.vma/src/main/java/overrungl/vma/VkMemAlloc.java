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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.vma;

import org.jspecify.annotations.NonNull;
import overrungl.util.CanonicalTypes;
import overrungl.util.MemoryUtil;
import overrungl.vulkan.VkDevice;
import overrungl.vulkan.VkInstance;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

import static overrungl.internal.RuntimeHelper.*;

/// [vk_mem_alloc.h](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h)
///
/// To conveniently fill in a [VmaAllocatorCreateInfo],
/// use [<code>VmaUtil::fillAllocatorCreateInfo</code>][VmaUtil#fillAllocatorCreateInfo(SegmentAllocator, VmaAllocatorCreateInfo, VkInstance, VkDevice)].
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
        /// The method handle of [`vmaCreateAllocator`][#vmaCreateAllocator].
        public static final Supplier<MethodHandle> MH_vmaCreateAllocator = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaDestroyAllocator`][#vmaDestroyAllocator].
        public static final Supplier<MethodHandle> MH_vmaDestroyAllocator = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetAllocatorInfo`][#vmaGetAllocatorInfo].
        public static final Supplier<MethodHandle> MH_vmaGetAllocatorInfo = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetPhysicalDeviceProperties`][#vmaGetPhysicalDeviceProperties].
        public static final Supplier<MethodHandle> MH_vmaGetPhysicalDeviceProperties = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetMemoryProperties`][#vmaGetMemoryProperties].
        public static final Supplier<MethodHandle> MH_vmaGetMemoryProperties = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetMemoryTypeProperties`][#vmaGetMemoryTypeProperties].
        public static final Supplier<MethodHandle> MH_vmaGetMemoryTypeProperties = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaSetCurrentFrameIndex`][#vmaSetCurrentFrameIndex].
        public static final Supplier<MethodHandle> MH_vmaSetCurrentFrameIndex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`vmaCalculateStatistics`][#vmaCalculateStatistics].
        public static final Supplier<MethodHandle> MH_vmaCalculateStatistics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetHeapBudgets`][#vmaGetHeapBudgets].
        public static final Supplier<MethodHandle> MH_vmaGetHeapBudgets = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaFindMemoryTypeIndex`][#vmaFindMemoryTypeIndex].
        public static final Supplier<MethodHandle> MH_vmaFindMemoryTypeIndex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaFindMemoryTypeIndexForBufferInfo`][#vmaFindMemoryTypeIndexForBufferInfo].
        public static final Supplier<MethodHandle> MH_vmaFindMemoryTypeIndexForBufferInfo = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaFindMemoryTypeIndexForImageInfo`][#vmaFindMemoryTypeIndexForImageInfo].
        public static final Supplier<MethodHandle> MH_vmaFindMemoryTypeIndexForImageInfo = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreatePool`][#vmaCreatePool].
        public static final Supplier<MethodHandle> MH_vmaCreatePool = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaDestroyPool`][#vmaDestroyPool].
        public static final Supplier<MethodHandle> MH_vmaDestroyPool = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetPoolStatistics`][#vmaGetPoolStatistics].
        public static final Supplier<MethodHandle> MH_vmaGetPoolStatistics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCalculatePoolStatistics`][#vmaCalculatePoolStatistics].
        public static final Supplier<MethodHandle> MH_vmaCalculatePoolStatistics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCheckPoolCorruption`][#vmaCheckPoolCorruption].
        public static final Supplier<MethodHandle> MH_vmaCheckPoolCorruption = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetPoolName`][#vmaGetPoolName].
        public static final Supplier<MethodHandle> MH_vmaGetPoolName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaSetPoolName`][#vmaSetPoolName].
        public static final Supplier<MethodHandle> MH_vmaSetPoolName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaAllocateMemory`][#vmaAllocateMemory].
        public static final Supplier<MethodHandle> MH_vmaAllocateMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaAllocateMemoryPages`][#vmaAllocateMemoryPages].
        public static final Supplier<MethodHandle> MH_vmaAllocateMemoryPages = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaAllocateMemoryForBuffer`][#vmaAllocateMemoryForBuffer].
        public static final Supplier<MethodHandle> MH_vmaAllocateMemoryForBuffer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaAllocateMemoryForImage`][#vmaAllocateMemoryForImage].
        public static final Supplier<MethodHandle> MH_vmaAllocateMemoryForImage = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaFreeMemory`][#vmaFreeMemory].
        public static final Supplier<MethodHandle> MH_vmaFreeMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaFreeMemoryPages`][#vmaFreeMemoryPages].
        public static final Supplier<MethodHandle> MH_vmaFreeMemoryPages = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetAllocationInfo`][#vmaGetAllocationInfo].
        public static final Supplier<MethodHandle> MH_vmaGetAllocationInfo = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetAllocationInfo2`][#vmaGetAllocationInfo2].
        public static final Supplier<MethodHandle> MH_vmaGetAllocationInfo2 = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaSetAllocationUserData`][#vmaSetAllocationUserData].
        public static final Supplier<MethodHandle> MH_vmaSetAllocationUserData = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaSetAllocationName`][#vmaSetAllocationName].
        public static final Supplier<MethodHandle> MH_vmaSetAllocationName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetAllocationMemoryProperties`][#vmaGetAllocationMemoryProperties].
        public static final Supplier<MethodHandle> MH_vmaGetAllocationMemoryProperties = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaMapMemory`][#vmaMapMemory].
        public static final Supplier<MethodHandle> MH_vmaMapMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaUnmapMemory`][#vmaUnmapMemory].
        public static final Supplier<MethodHandle> MH_vmaUnmapMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaFlushAllocation`][#vmaFlushAllocation].
        public static final Supplier<MethodHandle> MH_vmaFlushAllocation = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        /// The method handle of [`vmaInvalidateAllocation`][#vmaInvalidateAllocation].
        public static final Supplier<MethodHandle> MH_vmaInvalidateAllocation = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        /// The method handle of [`vmaFlushAllocations`][#vmaFlushAllocations].
        public static final Supplier<MethodHandle> MH_vmaFlushAllocations = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaInvalidateAllocations`][#vmaInvalidateAllocations].
        public static final Supplier<MethodHandle> MH_vmaInvalidateAllocations = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCopyMemoryToAllocation`][#vmaCopyMemoryToAllocation].
        public static final Supplier<MethodHandle> MH_vmaCopyMemoryToAllocation = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        /// The method handle of [`vmaCopyAllocationToMemory`][#vmaCopyAllocationToMemory].
        public static final Supplier<MethodHandle> MH_vmaCopyAllocationToMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)));
        /// The method handle of [`vmaCheckCorruption`][#vmaCheckCorruption].
        public static final Supplier<MethodHandle> MH_vmaCheckCorruption = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`vmaBeginDefragmentation`][#vmaBeginDefragmentation].
        public static final Supplier<MethodHandle> MH_vmaBeginDefragmentation = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaEndDefragmentation`][#vmaEndDefragmentation].
        public static final Supplier<MethodHandle> MH_vmaEndDefragmentation = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaBeginDefragmentationPass`][#vmaBeginDefragmentationPass].
        public static final Supplier<MethodHandle> MH_vmaBeginDefragmentationPass = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaEndDefragmentationPass`][#vmaEndDefragmentationPass].
        public static final Supplier<MethodHandle> MH_vmaEndDefragmentationPass = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaBindBufferMemory`][#vmaBindBufferMemory].
        public static final Supplier<MethodHandle> MH_vmaBindBufferMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)));
        /// The method handle of [`vmaBindBufferMemory2`][#vmaBindBufferMemory2].
        public static final Supplier<MethodHandle> MH_vmaBindBufferMemory2 = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaBindImageMemory`][#vmaBindImageMemory].
        public static final Supplier<MethodHandle> MH_vmaBindImageMemory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)));
        /// The method handle of [`vmaBindImageMemory2`][#vmaBindImageMemory2].
        public static final Supplier<MethodHandle> MH_vmaBindImageMemory2 = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateBuffer`][#vmaCreateBuffer].
        public static final Supplier<MethodHandle> MH_vmaCreateBuffer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateBufferWithAlignment`][#vmaCreateBufferWithAlignment].
        public static final Supplier<MethodHandle> MH_vmaCreateBufferWithAlignment = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateAliasingBuffer`][#vmaCreateAliasingBuffer].
        public static final Supplier<MethodHandle> MH_vmaCreateAliasingBuffer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateAliasingBuffer2`][#vmaCreateAliasingBuffer2].
        public static final Supplier<MethodHandle> MH_vmaCreateAliasingBuffer2 = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaDestroyBuffer`][#vmaDestroyBuffer].
        public static final Supplier<MethodHandle> MH_vmaDestroyBuffer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateImage`][#vmaCreateImage].
        public static final Supplier<MethodHandle> MH_vmaCreateImage = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateAliasingImage`][#vmaCreateAliasingImage].
        public static final Supplier<MethodHandle> MH_vmaCreateAliasingImage = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateAliasingImage2`][#vmaCreateAliasingImage2].
        public static final Supplier<MethodHandle> MH_vmaCreateAliasingImage2 = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaDestroyImage`][#vmaDestroyImage].
        public static final Supplier<MethodHandle> MH_vmaDestroyImage = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCreateVirtualBlock`][#vmaCreateVirtualBlock].
        public static final Supplier<MethodHandle> MH_vmaCreateVirtualBlock = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaDestroyVirtualBlock`][#vmaDestroyVirtualBlock].
        public static final Supplier<MethodHandle> MH_vmaDestroyVirtualBlock = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`vmaIsVirtualBlockEmpty`][#vmaIsVirtualBlockEmpty].
        public static final Supplier<MethodHandle> MH_vmaIsVirtualBlockEmpty = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetVirtualAllocationInfo`][#vmaGetVirtualAllocationInfo].
        public static final Supplier<MethodHandle> MH_vmaGetVirtualAllocationInfo = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaVirtualAllocate`][#vmaVirtualAllocate].
        public static final Supplier<MethodHandle> MH_vmaVirtualAllocate = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaVirtualFree`][#vmaVirtualFree].
        public static final Supplier<MethodHandle> MH_vmaVirtualFree = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaClearVirtualBlock`][#vmaClearVirtualBlock].
        public static final Supplier<MethodHandle> MH_vmaClearVirtualBlock = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`vmaSetVirtualAllocationUserData`][#vmaSetVirtualAllocationUserData].
        public static final Supplier<MethodHandle> MH_vmaSetVirtualAllocationUserData = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaGetVirtualBlockStatistics`][#vmaGetVirtualBlockStatistics].
        public static final Supplier<MethodHandle> MH_vmaGetVirtualBlockStatistics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaCalculateVirtualBlockStatistics`][#vmaCalculateVirtualBlockStatistics].
        public static final Supplier<MethodHandle> MH_vmaCalculateVirtualBlockStatistics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaBuildVirtualBlockStatsString`][#vmaBuildVirtualBlockStatsString].
        public static final Supplier<MethodHandle> MH_vmaBuildVirtualBlockStatsString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`vmaFreeVirtualBlockStatsString`][#vmaFreeVirtualBlockStatsString].
        public static final Supplier<MethodHandle> MH_vmaFreeVirtualBlockStatsString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`vmaBuildStatsString`][#vmaBuildStatsString].
        public static final Supplier<MethodHandle> MH_vmaBuildStatsString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`vmaFreeStatsString`][#vmaFreeStatsString].
        public static final Supplier<MethodHandle> MH_vmaFreeStatsString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The function address of [`vmaCreateAllocator`][#vmaCreateAllocator].
        public final MemorySegment PFN_vmaCreateAllocator;
        /// The function address of [`vmaDestroyAllocator`][#vmaDestroyAllocator].
        public final MemorySegment PFN_vmaDestroyAllocator;
        /// The function address of [`vmaGetAllocatorInfo`][#vmaGetAllocatorInfo].
        public final MemorySegment PFN_vmaGetAllocatorInfo;
        /// The function address of [`vmaGetPhysicalDeviceProperties`][#vmaGetPhysicalDeviceProperties].
        public final MemorySegment PFN_vmaGetPhysicalDeviceProperties;
        /// The function address of [`vmaGetMemoryProperties`][#vmaGetMemoryProperties].
        public final MemorySegment PFN_vmaGetMemoryProperties;
        /// The function address of [`vmaGetMemoryTypeProperties`][#vmaGetMemoryTypeProperties].
        public final MemorySegment PFN_vmaGetMemoryTypeProperties;
        /// The function address of [`vmaSetCurrentFrameIndex`][#vmaSetCurrentFrameIndex].
        public final MemorySegment PFN_vmaSetCurrentFrameIndex;
        /// The function address of [`vmaCalculateStatistics`][#vmaCalculateStatistics].
        public final MemorySegment PFN_vmaCalculateStatistics;
        /// The function address of [`vmaGetHeapBudgets`][#vmaGetHeapBudgets].
        public final MemorySegment PFN_vmaGetHeapBudgets;
        /// The function address of [`vmaFindMemoryTypeIndex`][#vmaFindMemoryTypeIndex].
        public final MemorySegment PFN_vmaFindMemoryTypeIndex;
        /// The function address of [`vmaFindMemoryTypeIndexForBufferInfo`][#vmaFindMemoryTypeIndexForBufferInfo].
        public final MemorySegment PFN_vmaFindMemoryTypeIndexForBufferInfo;
        /// The function address of [`vmaFindMemoryTypeIndexForImageInfo`][#vmaFindMemoryTypeIndexForImageInfo].
        public final MemorySegment PFN_vmaFindMemoryTypeIndexForImageInfo;
        /// The function address of [`vmaCreatePool`][#vmaCreatePool].
        public final MemorySegment PFN_vmaCreatePool;
        /// The function address of [`vmaDestroyPool`][#vmaDestroyPool].
        public final MemorySegment PFN_vmaDestroyPool;
        /// The function address of [`vmaGetPoolStatistics`][#vmaGetPoolStatistics].
        public final MemorySegment PFN_vmaGetPoolStatistics;
        /// The function address of [`vmaCalculatePoolStatistics`][#vmaCalculatePoolStatistics].
        public final MemorySegment PFN_vmaCalculatePoolStatistics;
        /// The function address of [`vmaCheckPoolCorruption`][#vmaCheckPoolCorruption].
        public final MemorySegment PFN_vmaCheckPoolCorruption;
        /// The function address of [`vmaGetPoolName`][#vmaGetPoolName].
        public final MemorySegment PFN_vmaGetPoolName;
        /// The function address of [`vmaSetPoolName`][#vmaSetPoolName].
        public final MemorySegment PFN_vmaSetPoolName;
        /// The function address of [`vmaAllocateMemory`][#vmaAllocateMemory].
        public final MemorySegment PFN_vmaAllocateMemory;
        /// The function address of [`vmaAllocateMemoryPages`][#vmaAllocateMemoryPages].
        public final MemorySegment PFN_vmaAllocateMemoryPages;
        /// The function address of [`vmaAllocateMemoryForBuffer`][#vmaAllocateMemoryForBuffer].
        public final MemorySegment PFN_vmaAllocateMemoryForBuffer;
        /// The function address of [`vmaAllocateMemoryForImage`][#vmaAllocateMemoryForImage].
        public final MemorySegment PFN_vmaAllocateMemoryForImage;
        /// The function address of [`vmaFreeMemory`][#vmaFreeMemory].
        public final MemorySegment PFN_vmaFreeMemory;
        /// The function address of [`vmaFreeMemoryPages`][#vmaFreeMemoryPages].
        public final MemorySegment PFN_vmaFreeMemoryPages;
        /// The function address of [`vmaGetAllocationInfo`][#vmaGetAllocationInfo].
        public final MemorySegment PFN_vmaGetAllocationInfo;
        /// The function address of [`vmaGetAllocationInfo2`][#vmaGetAllocationInfo2].
        public final MemorySegment PFN_vmaGetAllocationInfo2;
        /// The function address of [`vmaSetAllocationUserData`][#vmaSetAllocationUserData].
        public final MemorySegment PFN_vmaSetAllocationUserData;
        /// The function address of [`vmaSetAllocationName`][#vmaSetAllocationName].
        public final MemorySegment PFN_vmaSetAllocationName;
        /// The function address of [`vmaGetAllocationMemoryProperties`][#vmaGetAllocationMemoryProperties].
        public final MemorySegment PFN_vmaGetAllocationMemoryProperties;
        /// The function address of [`vmaMapMemory`][#vmaMapMemory].
        public final MemorySegment PFN_vmaMapMemory;
        /// The function address of [`vmaUnmapMemory`][#vmaUnmapMemory].
        public final MemorySegment PFN_vmaUnmapMemory;
        /// The function address of [`vmaFlushAllocation`][#vmaFlushAllocation].
        public final MemorySegment PFN_vmaFlushAllocation;
        /// The function address of [`vmaInvalidateAllocation`][#vmaInvalidateAllocation].
        public final MemorySegment PFN_vmaInvalidateAllocation;
        /// The function address of [`vmaFlushAllocations`][#vmaFlushAllocations].
        public final MemorySegment PFN_vmaFlushAllocations;
        /// The function address of [`vmaInvalidateAllocations`][#vmaInvalidateAllocations].
        public final MemorySegment PFN_vmaInvalidateAllocations;
        /// The function address of [`vmaCopyMemoryToAllocation`][#vmaCopyMemoryToAllocation].
        public final MemorySegment PFN_vmaCopyMemoryToAllocation;
        /// The function address of [`vmaCopyAllocationToMemory`][#vmaCopyAllocationToMemory].
        public final MemorySegment PFN_vmaCopyAllocationToMemory;
        /// The function address of [`vmaCheckCorruption`][#vmaCheckCorruption].
        public final MemorySegment PFN_vmaCheckCorruption;
        /// The function address of [`vmaBeginDefragmentation`][#vmaBeginDefragmentation].
        public final MemorySegment PFN_vmaBeginDefragmentation;
        /// The function address of [`vmaEndDefragmentation`][#vmaEndDefragmentation].
        public final MemorySegment PFN_vmaEndDefragmentation;
        /// The function address of [`vmaBeginDefragmentationPass`][#vmaBeginDefragmentationPass].
        public final MemorySegment PFN_vmaBeginDefragmentationPass;
        /// The function address of [`vmaEndDefragmentationPass`][#vmaEndDefragmentationPass].
        public final MemorySegment PFN_vmaEndDefragmentationPass;
        /// The function address of [`vmaBindBufferMemory`][#vmaBindBufferMemory].
        public final MemorySegment PFN_vmaBindBufferMemory;
        /// The function address of [`vmaBindBufferMemory2`][#vmaBindBufferMemory2].
        public final MemorySegment PFN_vmaBindBufferMemory2;
        /// The function address of [`vmaBindImageMemory`][#vmaBindImageMemory].
        public final MemorySegment PFN_vmaBindImageMemory;
        /// The function address of [`vmaBindImageMemory2`][#vmaBindImageMemory2].
        public final MemorySegment PFN_vmaBindImageMemory2;
        /// The function address of [`vmaCreateBuffer`][#vmaCreateBuffer].
        public final MemorySegment PFN_vmaCreateBuffer;
        /// The function address of [`vmaCreateBufferWithAlignment`][#vmaCreateBufferWithAlignment].
        public final MemorySegment PFN_vmaCreateBufferWithAlignment;
        /// The function address of [`vmaCreateAliasingBuffer`][#vmaCreateAliasingBuffer].
        public final MemorySegment PFN_vmaCreateAliasingBuffer;
        /// The function address of [`vmaCreateAliasingBuffer2`][#vmaCreateAliasingBuffer2].
        public final MemorySegment PFN_vmaCreateAliasingBuffer2;
        /// The function address of [`vmaDestroyBuffer`][#vmaDestroyBuffer].
        public final MemorySegment PFN_vmaDestroyBuffer;
        /// The function address of [`vmaCreateImage`][#vmaCreateImage].
        public final MemorySegment PFN_vmaCreateImage;
        /// The function address of [`vmaCreateAliasingImage`][#vmaCreateAliasingImage].
        public final MemorySegment PFN_vmaCreateAliasingImage;
        /// The function address of [`vmaCreateAliasingImage2`][#vmaCreateAliasingImage2].
        public final MemorySegment PFN_vmaCreateAliasingImage2;
        /// The function address of [`vmaDestroyImage`][#vmaDestroyImage].
        public final MemorySegment PFN_vmaDestroyImage;
        /// The function address of [`vmaCreateVirtualBlock`][#vmaCreateVirtualBlock].
        public final MemorySegment PFN_vmaCreateVirtualBlock;
        /// The function address of [`vmaDestroyVirtualBlock`][#vmaDestroyVirtualBlock].
        public final MemorySegment PFN_vmaDestroyVirtualBlock;
        /// The function address of [`vmaIsVirtualBlockEmpty`][#vmaIsVirtualBlockEmpty].
        public final MemorySegment PFN_vmaIsVirtualBlockEmpty;
        /// The function address of [`vmaGetVirtualAllocationInfo`][#vmaGetVirtualAllocationInfo].
        public final MemorySegment PFN_vmaGetVirtualAllocationInfo;
        /// The function address of [`vmaVirtualAllocate`][#vmaVirtualAllocate].
        public final MemorySegment PFN_vmaVirtualAllocate;
        /// The function address of [`vmaVirtualFree`][#vmaVirtualFree].
        public final MemorySegment PFN_vmaVirtualFree;
        /// The function address of [`vmaClearVirtualBlock`][#vmaClearVirtualBlock].
        public final MemorySegment PFN_vmaClearVirtualBlock;
        /// The function address of [`vmaSetVirtualAllocationUserData`][#vmaSetVirtualAllocationUserData].
        public final MemorySegment PFN_vmaSetVirtualAllocationUserData;
        /// The function address of [`vmaGetVirtualBlockStatistics`][#vmaGetVirtualBlockStatistics].
        public final MemorySegment PFN_vmaGetVirtualBlockStatistics;
        /// The function address of [`vmaCalculateVirtualBlockStatistics`][#vmaCalculateVirtualBlockStatistics].
        public final MemorySegment PFN_vmaCalculateVirtualBlockStatistics;
        /// The function address of [`vmaBuildVirtualBlockStatsString`][#vmaBuildVirtualBlockStatsString].
        public final MemorySegment PFN_vmaBuildVirtualBlockStatsString;
        /// The function address of [`vmaFreeVirtualBlockStatsString`][#vmaFreeVirtualBlockStatsString].
        public final MemorySegment PFN_vmaFreeVirtualBlockStatsString;
        /// The function address of [`vmaBuildStatsString`][#vmaBuildStatsString].
        public final MemorySegment PFN_vmaBuildStatsString;
        /// The function address of [`vmaFreeStatsString`][#vmaFreeStatsString].
        public final MemorySegment PFN_vmaFreeStatsString;

        private Handles() {
            var _lookup = VulkanMemoryAllocatorLibrary.lookup();
            PFN_vmaCreateAllocator = _lookup.findOrThrow("vmaCreateAllocator");
            PFN_vmaDestroyAllocator = _lookup.findOrThrow("vmaDestroyAllocator");
            PFN_vmaGetAllocatorInfo = _lookup.findOrThrow("vmaGetAllocatorInfo");
            PFN_vmaGetPhysicalDeviceProperties = _lookup.findOrThrow("vmaGetPhysicalDeviceProperties");
            PFN_vmaGetMemoryProperties = _lookup.findOrThrow("vmaGetMemoryProperties");
            PFN_vmaGetMemoryTypeProperties = _lookup.findOrThrow("vmaGetMemoryTypeProperties");
            PFN_vmaSetCurrentFrameIndex = _lookup.findOrThrow("vmaSetCurrentFrameIndex");
            PFN_vmaCalculateStatistics = _lookup.findOrThrow("vmaCalculateStatistics");
            PFN_vmaGetHeapBudgets = _lookup.findOrThrow("vmaGetHeapBudgets");
            PFN_vmaFindMemoryTypeIndex = _lookup.findOrThrow("vmaFindMemoryTypeIndex");
            PFN_vmaFindMemoryTypeIndexForBufferInfo = _lookup.findOrThrow("vmaFindMemoryTypeIndexForBufferInfo");
            PFN_vmaFindMemoryTypeIndexForImageInfo = _lookup.findOrThrow("vmaFindMemoryTypeIndexForImageInfo");
            PFN_vmaCreatePool = _lookup.findOrThrow("vmaCreatePool");
            PFN_vmaDestroyPool = _lookup.findOrThrow("vmaDestroyPool");
            PFN_vmaGetPoolStatistics = _lookup.findOrThrow("vmaGetPoolStatistics");
            PFN_vmaCalculatePoolStatistics = _lookup.findOrThrow("vmaCalculatePoolStatistics");
            PFN_vmaCheckPoolCorruption = _lookup.findOrThrow("vmaCheckPoolCorruption");
            PFN_vmaGetPoolName = _lookup.findOrThrow("vmaGetPoolName");
            PFN_vmaSetPoolName = _lookup.findOrThrow("vmaSetPoolName");
            PFN_vmaAllocateMemory = _lookup.findOrThrow("vmaAllocateMemory");
            PFN_vmaAllocateMemoryPages = _lookup.findOrThrow("vmaAllocateMemoryPages");
            PFN_vmaAllocateMemoryForBuffer = _lookup.findOrThrow("vmaAllocateMemoryForBuffer");
            PFN_vmaAllocateMemoryForImage = _lookup.findOrThrow("vmaAllocateMemoryForImage");
            PFN_vmaFreeMemory = _lookup.findOrThrow("vmaFreeMemory");
            PFN_vmaFreeMemoryPages = _lookup.findOrThrow("vmaFreeMemoryPages");
            PFN_vmaGetAllocationInfo = _lookup.findOrThrow("vmaGetAllocationInfo");
            PFN_vmaGetAllocationInfo2 = _lookup.findOrThrow("vmaGetAllocationInfo2");
            PFN_vmaSetAllocationUserData = _lookup.findOrThrow("vmaSetAllocationUserData");
            PFN_vmaSetAllocationName = _lookup.findOrThrow("vmaSetAllocationName");
            PFN_vmaGetAllocationMemoryProperties = _lookup.findOrThrow("vmaGetAllocationMemoryProperties");
            PFN_vmaMapMemory = _lookup.findOrThrow("vmaMapMemory");
            PFN_vmaUnmapMemory = _lookup.findOrThrow("vmaUnmapMemory");
            PFN_vmaFlushAllocation = _lookup.findOrThrow("vmaFlushAllocation");
            PFN_vmaInvalidateAllocation = _lookup.findOrThrow("vmaInvalidateAllocation");
            PFN_vmaFlushAllocations = _lookup.findOrThrow("vmaFlushAllocations");
            PFN_vmaInvalidateAllocations = _lookup.findOrThrow("vmaInvalidateAllocations");
            PFN_vmaCopyMemoryToAllocation = _lookup.findOrThrow("vmaCopyMemoryToAllocation");
            PFN_vmaCopyAllocationToMemory = _lookup.findOrThrow("vmaCopyAllocationToMemory");
            PFN_vmaCheckCorruption = _lookup.findOrThrow("vmaCheckCorruption");
            PFN_vmaBeginDefragmentation = _lookup.findOrThrow("vmaBeginDefragmentation");
            PFN_vmaEndDefragmentation = _lookup.findOrThrow("vmaEndDefragmentation");
            PFN_vmaBeginDefragmentationPass = _lookup.findOrThrow("vmaBeginDefragmentationPass");
            PFN_vmaEndDefragmentationPass = _lookup.findOrThrow("vmaEndDefragmentationPass");
            PFN_vmaBindBufferMemory = _lookup.findOrThrow("vmaBindBufferMemory");
            PFN_vmaBindBufferMemory2 = _lookup.findOrThrow("vmaBindBufferMemory2");
            PFN_vmaBindImageMemory = _lookup.findOrThrow("vmaBindImageMemory");
            PFN_vmaBindImageMemory2 = _lookup.findOrThrow("vmaBindImageMemory2");
            PFN_vmaCreateBuffer = _lookup.findOrThrow("vmaCreateBuffer");
            PFN_vmaCreateBufferWithAlignment = _lookup.findOrThrow("vmaCreateBufferWithAlignment");
            PFN_vmaCreateAliasingBuffer = _lookup.findOrThrow("vmaCreateAliasingBuffer");
            PFN_vmaCreateAliasingBuffer2 = _lookup.findOrThrow("vmaCreateAliasingBuffer2");
            PFN_vmaDestroyBuffer = _lookup.findOrThrow("vmaDestroyBuffer");
            PFN_vmaCreateImage = _lookup.findOrThrow("vmaCreateImage");
            PFN_vmaCreateAliasingImage = _lookup.findOrThrow("vmaCreateAliasingImage");
            PFN_vmaCreateAliasingImage2 = _lookup.findOrThrow("vmaCreateAliasingImage2");
            PFN_vmaDestroyImage = _lookup.findOrThrow("vmaDestroyImage");
            PFN_vmaCreateVirtualBlock = _lookup.findOrThrow("vmaCreateVirtualBlock");
            PFN_vmaDestroyVirtualBlock = _lookup.findOrThrow("vmaDestroyVirtualBlock");
            PFN_vmaIsVirtualBlockEmpty = _lookup.findOrThrow("vmaIsVirtualBlockEmpty");
            PFN_vmaGetVirtualAllocationInfo = _lookup.findOrThrow("vmaGetVirtualAllocationInfo");
            PFN_vmaVirtualAllocate = _lookup.findOrThrow("vmaVirtualAllocate");
            PFN_vmaVirtualFree = _lookup.findOrThrow("vmaVirtualFree");
            PFN_vmaClearVirtualBlock = _lookup.findOrThrow("vmaClearVirtualBlock");
            PFN_vmaSetVirtualAllocationUserData = _lookup.findOrThrow("vmaSetVirtualAllocationUserData");
            PFN_vmaGetVirtualBlockStatistics = _lookup.findOrThrow("vmaGetVirtualBlockStatistics");
            PFN_vmaCalculateVirtualBlockStatistics = _lookup.findOrThrow("vmaCalculateVirtualBlockStatistics");
            PFN_vmaBuildVirtualBlockStatsString = _lookup.findOrThrow("vmaBuildVirtualBlockStatsString");
            PFN_vmaFreeVirtualBlockStatsString = _lookup.findOrThrow("vmaFreeVirtualBlockStatsString");
            PFN_vmaBuildStatsString = _lookup.findOrThrow("vmaBuildStatsString");
            PFN_vmaFreeStatsString = _lookup.findOrThrow("vmaFreeStatsString");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `vmaCreateAllocator`.
    /// ```
    /// (int) VkResult vmaCreateAllocator(const VmaAllocatorCreateInfo* pCreateInfo, VmaAllocator* pAllocator);
    /// ```
    public static int vmaCreateAllocator(@NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateAllocator", pCreateInfo, pAllocator); }
        return (int) Handles.MH_vmaCreateAllocator.get().invokeExact(Handles.get().PFN_vmaCreateAllocator, pCreateInfo, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAllocator", e); }
    }

    /// Invokes `vmaDestroyAllocator`.
    /// ```
    /// void vmaDestroyAllocator((struct VmaAllocator *) VmaAllocator pAllocator);
    /// ```
    public static void vmaDestroyAllocator(@NonNull MemorySegment pAllocator) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaDestroyAllocator", pAllocator); }
        Handles.MH_vmaDestroyAllocator.get().invokeExact(Handles.get().PFN_vmaDestroyAllocator, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyAllocator", e); }
    }

    /// Invokes `vmaGetAllocatorInfo`.
    /// ```
    /// void vmaGetAllocatorInfo((struct VmaAllocator *) VmaAllocator allocator, VmaAllocatorInfo* pAllocatorInfo);
    /// ```
    public static void vmaGetAllocatorInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment pAllocatorInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetAllocatorInfo", allocator, pAllocatorInfo); }
        Handles.MH_vmaGetAllocatorInfo.get().invokeExact(Handles.get().PFN_vmaGetAllocatorInfo, allocator, pAllocatorInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocatorInfo", e); }
    }

    /// Invokes `vmaGetPhysicalDeviceProperties`.
    /// ```
    /// void vmaGetPhysicalDeviceProperties((struct VmaAllocator *) VmaAllocator allocator, const VkPhysicalDeviceProperties** ppPhysicalDeviceProperties);
    /// ```
    public static void vmaGetPhysicalDeviceProperties(@NonNull MemorySegment allocator, @NonNull MemorySegment ppPhysicalDeviceProperties) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetPhysicalDeviceProperties", allocator, ppPhysicalDeviceProperties); }
        Handles.MH_vmaGetPhysicalDeviceProperties.get().invokeExact(Handles.get().PFN_vmaGetPhysicalDeviceProperties, allocator, ppPhysicalDeviceProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetPhysicalDeviceProperties", e); }
    }

    /// Invokes `vmaGetMemoryProperties`.
    /// ```
    /// void vmaGetMemoryProperties((struct VmaAllocator *) VmaAllocator allocator, const VkPhysicalDeviceMemoryProperties** ppPhysicalDeviceMemoryProperties);
    /// ```
    public static void vmaGetMemoryProperties(@NonNull MemorySegment allocator, @NonNull MemorySegment ppPhysicalDeviceMemoryProperties) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetMemoryProperties", allocator, ppPhysicalDeviceMemoryProperties); }
        Handles.MH_vmaGetMemoryProperties.get().invokeExact(Handles.get().PFN_vmaGetMemoryProperties, allocator, ppPhysicalDeviceMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetMemoryProperties", e); }
    }

    /// Invokes `vmaGetMemoryTypeProperties`.
    /// ```
    /// void vmaGetMemoryTypeProperties((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeIndex, VkMemoryPropertyFlags* pFlags);
    /// ```
    public static void vmaGetMemoryTypeProperties(@NonNull MemorySegment allocator, int memoryTypeIndex, @NonNull MemorySegment pFlags) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetMemoryTypeProperties", allocator, memoryTypeIndex, pFlags); }
        Handles.MH_vmaGetMemoryTypeProperties.get().invokeExact(Handles.get().PFN_vmaGetMemoryTypeProperties, allocator, memoryTypeIndex, pFlags); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetMemoryTypeProperties", e); }
    }

    /// Invokes `vmaSetCurrentFrameIndex`.
    /// ```
    /// void vmaSetCurrentFrameIndex((struct VmaAllocator *) VmaAllocator allocator, uint32_t frameIndex);
    /// ```
    public static void vmaSetCurrentFrameIndex(@NonNull MemorySegment allocator, int frameIndex) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaSetCurrentFrameIndex", allocator, frameIndex); }
        Handles.MH_vmaSetCurrentFrameIndex.get().invokeExact(Handles.get().PFN_vmaSetCurrentFrameIndex, allocator, frameIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetCurrentFrameIndex", e); }
    }

    /// Invokes `vmaCalculateStatistics`.
    /// ```
    /// void vmaCalculateStatistics((struct VmaAllocator *) VmaAllocator allocator, VmaTotalStatistics* pStats);
    /// ```
    public static void vmaCalculateStatistics(@NonNull MemorySegment allocator, @NonNull MemorySegment pStats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCalculateStatistics", allocator, pStats); }
        Handles.MH_vmaCalculateStatistics.get().invokeExact(Handles.get().PFN_vmaCalculateStatistics, allocator, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCalculateStatistics", e); }
    }

    /// Invokes `vmaGetHeapBudgets`.
    /// ```
    /// void vmaGetHeapBudgets((struct VmaAllocator *) VmaAllocator allocator, VmaBudget* pBudgets);
    /// ```
    public static void vmaGetHeapBudgets(@NonNull MemorySegment allocator, @NonNull MemorySegment pBudgets) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetHeapBudgets", allocator, pBudgets); }
        Handles.MH_vmaGetHeapBudgets.get().invokeExact(Handles.get().PFN_vmaGetHeapBudgets, allocator, pBudgets); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetHeapBudgets", e); }
    }

    /// Invokes `vmaFindMemoryTypeIndex`.
    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndex((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeBits, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndex(@NonNull MemorySegment allocator, int memoryTypeBits, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pMemoryTypeIndex) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFindMemoryTypeIndex", allocator, memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex); }
        return (int) Handles.MH_vmaFindMemoryTypeIndex.get().invokeExact(Handles.get().PFN_vmaFindMemoryTypeIndex, allocator, memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFindMemoryTypeIndex", e); }
    }

    /// Invokes `vmaFindMemoryTypeIndexForBufferInfo`.
    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndexForBufferInfo((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndexForBufferInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pMemoryTypeIndex) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFindMemoryTypeIndexForBufferInfo", allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex); }
        return (int) Handles.MH_vmaFindMemoryTypeIndexForBufferInfo.get().invokeExact(Handles.get().PFN_vmaFindMemoryTypeIndexForBufferInfo, allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFindMemoryTypeIndexForBufferInfo", e); }
    }

    /// Invokes `vmaFindMemoryTypeIndexForImageInfo`.
    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndexForImageInfo((struct VmaAllocator *) VmaAllocator allocator, const VkImageCreateInfo* pImageCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndexForImageInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pMemoryTypeIndex) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFindMemoryTypeIndexForImageInfo", allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex); }
        return (int) Handles.MH_vmaFindMemoryTypeIndexForImageInfo.get().invokeExact(Handles.get().PFN_vmaFindMemoryTypeIndexForImageInfo, allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFindMemoryTypeIndexForImageInfo", e); }
    }

    /// Invokes `vmaCreatePool`.
    /// ```
    /// (int) VkResult vmaCreatePool((struct VmaAllocator *) VmaAllocator allocator, const VmaPoolCreateInfo* pCreateInfo, VmaPool* pPool);
    /// ```
    public static int vmaCreatePool(@NonNull MemorySegment allocator, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pPool) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreatePool", allocator, pCreateInfo, pPool); }
        return (int) Handles.MH_vmaCreatePool.get().invokeExact(Handles.get().PFN_vmaCreatePool, allocator, pCreateInfo, pPool); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreatePool", e); }
    }

    /// Invokes `vmaDestroyPool`.
    /// ```
    /// void vmaDestroyPool((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool);
    /// ```
    public static void vmaDestroyPool(@NonNull MemorySegment allocator, @NonNull MemorySegment pool) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaDestroyPool", allocator, pool); }
        Handles.MH_vmaDestroyPool.get().invokeExact(Handles.get().PFN_vmaDestroyPool, allocator, pool); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyPool", e); }
    }

    /// Invokes `vmaGetPoolStatistics`.
    /// ```
    /// void vmaGetPoolStatistics((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, VmaStatistics* pPoolStats);
    /// ```
    public static void vmaGetPoolStatistics(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment pPoolStats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetPoolStatistics", allocator, pool, pPoolStats); }
        Handles.MH_vmaGetPoolStatistics.get().invokeExact(Handles.get().PFN_vmaGetPoolStatistics, allocator, pool, pPoolStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetPoolStatistics", e); }
    }

    /// Invokes `vmaCalculatePoolStatistics`.
    /// ```
    /// void vmaCalculatePoolStatistics((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, VmaDetailedStatistics* pPoolStats);
    /// ```
    public static void vmaCalculatePoolStatistics(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment pPoolStats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCalculatePoolStatistics", allocator, pool, pPoolStats); }
        Handles.MH_vmaCalculatePoolStatistics.get().invokeExact(Handles.get().PFN_vmaCalculatePoolStatistics, allocator, pool, pPoolStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCalculatePoolStatistics", e); }
    }

    /// Invokes `vmaCheckPoolCorruption`.
    /// ```
    /// (int) VkResult vmaCheckPoolCorruption((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool);
    /// ```
    public static int vmaCheckPoolCorruption(@NonNull MemorySegment allocator, @NonNull MemorySegment pool) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCheckPoolCorruption", allocator, pool); }
        return (int) Handles.MH_vmaCheckPoolCorruption.get().invokeExact(Handles.get().PFN_vmaCheckPoolCorruption, allocator, pool); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCheckPoolCorruption", e); }
    }

    /// Invokes `vmaGetPoolName`.
    /// ```
    /// void vmaGetPoolName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, const char** ppName);
    /// ```
    public static void vmaGetPoolName(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment ppName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetPoolName", allocator, pool, ppName); }
        Handles.MH_vmaGetPoolName.get().invokeExact(Handles.get().PFN_vmaGetPoolName, allocator, pool, ppName); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetPoolName", e); }
    }

    /// Invokes `vmaSetPoolName`.
    /// ```
    /// void vmaSetPoolName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, const char* pName);
    /// ```
    public static void vmaSetPoolName(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment pName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaSetPoolName", allocator, pool, pName); }
        Handles.MH_vmaSetPoolName.get().invokeExact(Handles.get().PFN_vmaSetPoolName, allocator, pool, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetPoolName", e); }
    }

    /// Invokes `vmaAllocateMemory`.
    /// ```
    /// (int) VkResult vmaAllocateMemory((struct VmaAllocator *) VmaAllocator allocator, const VkMemoryRequirements* pVkMemoryRequirements, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment pVkMemoryRequirements, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaAllocateMemory", allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo); }
        return (int) Handles.MH_vmaAllocateMemory.get().invokeExact(Handles.get().PFN_vmaAllocateMemory, allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemory", e); }
    }

    /// Invokes `vmaAllocateMemoryPages`.
    /// ```
    /// (int) VkResult vmaAllocateMemoryPages((struct VmaAllocator *) VmaAllocator allocator, const VkMemoryRequirements* pVkMemoryRequirements, const VmaAllocationCreateInfo* pCreateInfo, size_t allocationCount, VmaAllocation* pAllocations, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryPages(@NonNull MemorySegment allocator, @NonNull MemorySegment pVkMemoryRequirements, @NonNull MemorySegment pCreateInfo, long allocationCount, @NonNull MemorySegment pAllocations, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaAllocateMemoryPages", allocator, pVkMemoryRequirements, pCreateInfo, allocationCount, pAllocations, pAllocationInfo); }
        return (int) Handles.MH_vmaAllocateMemoryPages.get().invoke(Handles.get().PFN_vmaAllocateMemoryPages, allocator, pVkMemoryRequirements, pCreateInfo, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, allocationCount), pAllocations, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemoryPages", e); }
    }

    /// Invokes `vmaAllocateMemoryForBuffer`.
    /// ```
    /// (int) VkResult vmaAllocateMemoryForBuffer((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkBuffer buffer, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryForBuffer(@NonNull MemorySegment allocator, long buffer, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaAllocateMemoryForBuffer", allocator, buffer, pCreateInfo, pAllocation, pAllocationInfo); }
        return (int) Handles.MH_vmaAllocateMemoryForBuffer.get().invokeExact(Handles.get().PFN_vmaAllocateMemoryForBuffer, allocator, buffer, pCreateInfo, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemoryForBuffer", e); }
    }

    /// Invokes `vmaAllocateMemoryForImage`.
    /// ```
    /// (int) VkResult vmaAllocateMemoryForImage((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkImage image, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryForImage(@NonNull MemorySegment allocator, long image, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaAllocateMemoryForImage", allocator, image, pCreateInfo, pAllocation, pAllocationInfo); }
        return (int) Handles.MH_vmaAllocateMemoryForImage.get().invokeExact(Handles.get().PFN_vmaAllocateMemoryForImage, allocator, image, pCreateInfo, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaAllocateMemoryForImage", e); }
    }

    /// Invokes `vmaFreeMemory`.
    /// ```
    /// void vmaFreeMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaFreeMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFreeMemory", allocator, allocation); }
        Handles.MH_vmaFreeMemory.get().invokeExact(Handles.get().PFN_vmaFreeMemory, allocator, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeMemory", e); }
    }

    /// Invokes `vmaFreeMemoryPages`.
    /// ```
    /// void vmaFreeMemoryPages((struct VmaAllocator *) VmaAllocator allocator, size_t allocationCount, const VmaAllocation* pAllocations);
    /// ```
    public static void vmaFreeMemoryPages(@NonNull MemorySegment allocator, long allocationCount, @NonNull MemorySegment pAllocations) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFreeMemoryPages", allocator, allocationCount, pAllocations); }
        Handles.MH_vmaFreeMemoryPages.get().invoke(Handles.get().PFN_vmaFreeMemoryPages, allocator, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, allocationCount), pAllocations); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeMemoryPages", e); }
    }

    /// Invokes `vmaGetAllocationInfo`.
    /// ```
    /// void vmaGetAllocationInfo((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static void vmaGetAllocationInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetAllocationInfo", allocator, allocation, pAllocationInfo); }
        Handles.MH_vmaGetAllocationInfo.get().invokeExact(Handles.get().PFN_vmaGetAllocationInfo, allocator, allocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocationInfo", e); }
    }

    /// Invokes `vmaGetAllocationInfo2`.
    /// ```
    /// void vmaGetAllocationInfo2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VmaAllocationInfo2* pAllocationInfo);
    /// ```
    public static void vmaGetAllocationInfo2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetAllocationInfo2", allocator, allocation, pAllocationInfo); }
        Handles.MH_vmaGetAllocationInfo2.get().invokeExact(Handles.get().PFN_vmaGetAllocationInfo2, allocator, allocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocationInfo2", e); }
    }

    /// Invokes `vmaSetAllocationUserData`.
    /// ```
    /// void vmaSetAllocationUserData((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, void* pUserData);
    /// ```
    public static void vmaSetAllocationUserData(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pUserData) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaSetAllocationUserData", allocator, allocation, pUserData); }
        Handles.MH_vmaSetAllocationUserData.get().invokeExact(Handles.get().PFN_vmaSetAllocationUserData, allocator, allocation, pUserData); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetAllocationUserData", e); }
    }

    /// Invokes `vmaSetAllocationName`.
    /// ```
    /// void vmaSetAllocationName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const char* pName);
    /// ```
    public static void vmaSetAllocationName(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaSetAllocationName", allocator, allocation, pName); }
        Handles.MH_vmaSetAllocationName.get().invokeExact(Handles.get().PFN_vmaSetAllocationName, allocator, allocation, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetAllocationName", e); }
    }

    /// Invokes `vmaGetAllocationMemoryProperties`.
    /// ```
    /// void vmaGetAllocationMemoryProperties((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VkMemoryPropertyFlags* pFlags);
    /// ```
    public static void vmaGetAllocationMemoryProperties(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pFlags) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetAllocationMemoryProperties", allocator, allocation, pFlags); }
        Handles.MH_vmaGetAllocationMemoryProperties.get().invokeExact(Handles.get().PFN_vmaGetAllocationMemoryProperties, allocator, allocation, pFlags); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetAllocationMemoryProperties", e); }
    }

    /// Invokes `vmaMapMemory`.
    /// ```
    /// (int) VkResult vmaMapMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, void** ppData);
    /// ```
    public static int vmaMapMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment ppData) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaMapMemory", allocator, allocation, ppData); }
        return (int) Handles.MH_vmaMapMemory.get().invokeExact(Handles.get().PFN_vmaMapMemory, allocator, allocation, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vmaMapMemory", e); }
    }

    /// Invokes `vmaUnmapMemory`.
    /// ```
    /// void vmaUnmapMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaUnmapMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaUnmapMemory", allocator, allocation); }
        Handles.MH_vmaUnmapMemory.get().invokeExact(Handles.get().PFN_vmaUnmapMemory, allocator, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaUnmapMemory", e); }
    }

    /// Invokes `vmaFlushAllocation`.
    /// ```
    /// (int) VkResult vmaFlushAllocation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaFlushAllocation(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long offset, long size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFlushAllocation", allocator, allocation, offset, size); }
        return (int) Handles.MH_vmaFlushAllocation.get().invokeExact(Handles.get().PFN_vmaFlushAllocation, allocator, allocation, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFlushAllocation", e); }
    }

    /// Invokes `vmaInvalidateAllocation`.
    /// ```
    /// (int) VkResult vmaInvalidateAllocation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaInvalidateAllocation(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long offset, long size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaInvalidateAllocation", allocator, allocation, offset, size); }
        return (int) Handles.MH_vmaInvalidateAllocation.get().invokeExact(Handles.get().PFN_vmaInvalidateAllocation, allocator, allocation, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaInvalidateAllocation", e); }
    }

    /// Invokes `vmaFlushAllocations`.
    /// ```
    /// (int) VkResult vmaFlushAllocations((struct VmaAllocator *) VmaAllocator allocator, uint32_t allocationCount, const VmaAllocation* allocations, const VkDeviceSize* offsets, const VkDeviceSize* sizes);
    /// ```
    public static int vmaFlushAllocations(@NonNull MemorySegment allocator, int allocationCount, @NonNull MemorySegment allocations, @NonNull MemorySegment offsets, @NonNull MemorySegment sizes) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFlushAllocations", allocator, allocationCount, allocations, offsets, sizes); }
        return (int) Handles.MH_vmaFlushAllocations.get().invokeExact(Handles.get().PFN_vmaFlushAllocations, allocator, allocationCount, allocations, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFlushAllocations", e); }
    }

    /// Invokes `vmaInvalidateAllocations`.
    /// ```
    /// (int) VkResult vmaInvalidateAllocations((struct VmaAllocator *) VmaAllocator allocator, uint32_t allocationCount, const VmaAllocation* allocations, const VkDeviceSize* offsets, const VkDeviceSize* sizes);
    /// ```
    public static int vmaInvalidateAllocations(@NonNull MemorySegment allocator, int allocationCount, @NonNull MemorySegment allocations, @NonNull MemorySegment offsets, @NonNull MemorySegment sizes) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaInvalidateAllocations", allocator, allocationCount, allocations, offsets, sizes); }
        return (int) Handles.MH_vmaInvalidateAllocations.get().invokeExact(Handles.get().PFN_vmaInvalidateAllocations, allocator, allocationCount, allocations, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in vmaInvalidateAllocations", e); }
    }

    /// Invokes `vmaCopyMemoryToAllocation`.
    /// ```
    /// (int) VkResult vmaCopyMemoryToAllocation((struct VmaAllocator *) VmaAllocator allocator, const void* pSrcHostPointer, (struct VmaAllocation *) VmaAllocation dstAllocation, (uint64_t) VkDeviceSize dstAllocationLocalOffset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaCopyMemoryToAllocation(@NonNull MemorySegment allocator, @NonNull MemorySegment pSrcHostPointer, @NonNull MemorySegment dstAllocation, long dstAllocationLocalOffset, long size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCopyMemoryToAllocation", allocator, pSrcHostPointer, dstAllocation, dstAllocationLocalOffset, size); }
        return (int) Handles.MH_vmaCopyMemoryToAllocation.get().invokeExact(Handles.get().PFN_vmaCopyMemoryToAllocation, allocator, pSrcHostPointer, dstAllocation, dstAllocationLocalOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCopyMemoryToAllocation", e); }
    }

    /// Invokes `vmaCopyAllocationToMemory`.
    /// ```
    /// (int) VkResult vmaCopyAllocationToMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation srcAllocation, (uint64_t) VkDeviceSize srcAllocationLocalOffset, void* pDstHostPointer, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaCopyAllocationToMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment srcAllocation, long srcAllocationLocalOffset, @NonNull MemorySegment pDstHostPointer, long size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCopyAllocationToMemory", allocator, srcAllocation, srcAllocationLocalOffset, pDstHostPointer, size); }
        return (int) Handles.MH_vmaCopyAllocationToMemory.get().invokeExact(Handles.get().PFN_vmaCopyAllocationToMemory, allocator, srcAllocation, srcAllocationLocalOffset, pDstHostPointer, size); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCopyAllocationToMemory", e); }
    }

    /// Invokes `vmaCheckCorruption`.
    /// ```
    /// (int) VkResult vmaCheckCorruption((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeBits);
    /// ```
    public static int vmaCheckCorruption(@NonNull MemorySegment allocator, int memoryTypeBits) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCheckCorruption", allocator, memoryTypeBits); }
        return (int) Handles.MH_vmaCheckCorruption.get().invokeExact(Handles.get().PFN_vmaCheckCorruption, allocator, memoryTypeBits); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCheckCorruption", e); }
    }

    /// Invokes `vmaBeginDefragmentation`.
    /// ```
    /// (int) VkResult vmaBeginDefragmentation((struct VmaAllocator *) VmaAllocator allocator, const VmaDefragmentationInfo* pInfo, VmaDefragmentationContext* pContext);
    /// ```
    public static int vmaBeginDefragmentation(@NonNull MemorySegment allocator, @NonNull MemorySegment pInfo, @NonNull MemorySegment pContext) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBeginDefragmentation", allocator, pInfo, pContext); }
        return (int) Handles.MH_vmaBeginDefragmentation.get().invokeExact(Handles.get().PFN_vmaBeginDefragmentation, allocator, pInfo, pContext); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBeginDefragmentation", e); }
    }

    /// Invokes `vmaEndDefragmentation`.
    /// ```
    /// void vmaEndDefragmentation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationStats* pStats);
    /// ```
    public static void vmaEndDefragmentation(@NonNull MemorySegment allocator, @NonNull MemorySegment context, @NonNull MemorySegment pStats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaEndDefragmentation", allocator, context, pStats); }
        Handles.MH_vmaEndDefragmentation.get().invokeExact(Handles.get().PFN_vmaEndDefragmentation, allocator, context, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaEndDefragmentation", e); }
    }

    /// Invokes `vmaBeginDefragmentationPass`.
    /// ```
    /// (int) VkResult vmaBeginDefragmentationPass((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo* pPassInfo);
    /// ```
    public static int vmaBeginDefragmentationPass(@NonNull MemorySegment allocator, @NonNull MemorySegment context, @NonNull MemorySegment pPassInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBeginDefragmentationPass", allocator, context, pPassInfo); }
        return (int) Handles.MH_vmaBeginDefragmentationPass.get().invokeExact(Handles.get().PFN_vmaBeginDefragmentationPass, allocator, context, pPassInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBeginDefragmentationPass", e); }
    }

    /// Invokes `vmaEndDefragmentationPass`.
    /// ```
    /// (int) VkResult vmaEndDefragmentationPass((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo* pPassInfo);
    /// ```
    public static int vmaEndDefragmentationPass(@NonNull MemorySegment allocator, @NonNull MemorySegment context, @NonNull MemorySegment pPassInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaEndDefragmentationPass", allocator, context, pPassInfo); }
        return (int) Handles.MH_vmaEndDefragmentationPass.get().invokeExact(Handles.get().PFN_vmaEndDefragmentationPass, allocator, context, pPassInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaEndDefragmentationPass", e); }
    }

    /// Invokes `vmaBindBufferMemory`.
    /// ```
    /// (int) VkResult vmaBindBufferMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkBuffer buffer);
    /// ```
    public static int vmaBindBufferMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBindBufferMemory", allocator, allocation, buffer); }
        return (int) Handles.MH_vmaBindBufferMemory.get().invokeExact(Handles.get().PFN_vmaBindBufferMemory, allocator, allocation, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindBufferMemory", e); }
    }

    /// Invokes `vmaBindBufferMemory2`.
    /// ```
    /// (int) VkResult vmaBindBufferMemory2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, (uint64_t) VkBuffer buffer, const void* pNext);
    /// ```
    public static int vmaBindBufferMemory2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, long buffer, @NonNull MemorySegment pNext) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBindBufferMemory2", allocator, allocation, allocationLocalOffset, buffer, pNext); }
        return (int) Handles.MH_vmaBindBufferMemory2.get().invokeExact(Handles.get().PFN_vmaBindBufferMemory2, allocator, allocation, allocationLocalOffset, buffer, pNext); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindBufferMemory2", e); }
    }

    /// Invokes `vmaBindImageMemory`.
    /// ```
    /// (int) VkResult vmaBindImageMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkImage image);
    /// ```
    public static int vmaBindImageMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long image) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBindImageMemory", allocator, allocation, image); }
        return (int) Handles.MH_vmaBindImageMemory.get().invokeExact(Handles.get().PFN_vmaBindImageMemory, allocator, allocation, image); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindImageMemory", e); }
    }

    /// Invokes `vmaBindImageMemory2`.
    /// ```
    /// (int) VkResult vmaBindImageMemory2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, (uint64_t) VkImage image, const void* pNext);
    /// ```
    public static int vmaBindImageMemory2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, long image, @NonNull MemorySegment pNext) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBindImageMemory2", allocator, allocation, allocationLocalOffset, image, pNext); }
        return (int) Handles.MH_vmaBindImageMemory2.get().invokeExact(Handles.get().PFN_vmaBindImageMemory2, allocator, allocation, allocationLocalOffset, image, pNext); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBindImageMemory2", e); }
    }

    /// Invokes `vmaCreateBuffer`.
    /// ```
    /// (int) VkResult vmaCreateBuffer((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, VkBuffer* pBuffer, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateBuffer(@NonNull MemorySegment allocator, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pBuffer, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateBuffer", allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo); }
        return (int) Handles.MH_vmaCreateBuffer.get().invokeExact(Handles.get().PFN_vmaCreateBuffer, allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateBuffer", e); }
    }

    /// Invokes `vmaCreateBufferWithAlignment`.
    /// ```
    /// (int) VkResult vmaCreateBufferWithAlignment((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, (uint64_t) VkDeviceSize minAlignment, VkBuffer* pBuffer, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateBufferWithAlignment(@NonNull MemorySegment allocator, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, long minAlignment, @NonNull MemorySegment pBuffer, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateBufferWithAlignment", allocator, pBufferCreateInfo, pAllocationCreateInfo, minAlignment, pBuffer, pAllocation, pAllocationInfo); }
        return (int) Handles.MH_vmaCreateBufferWithAlignment.get().invokeExact(Handles.get().PFN_vmaCreateBufferWithAlignment, allocator, pBufferCreateInfo, pAllocationCreateInfo, minAlignment, pBuffer, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateBufferWithAlignment", e); }
    }

    /// Invokes `vmaCreateAliasingBuffer`.
    /// ```
    /// (int) VkResult vmaCreateAliasingBuffer((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const VkBufferCreateInfo* pBufferCreateInfo, VkBuffer* pBuffer);
    /// ```
    public static int vmaCreateAliasingBuffer(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pBuffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateAliasingBuffer", allocator, allocation, pBufferCreateInfo, pBuffer); }
        return (int) Handles.MH_vmaCreateAliasingBuffer.get().invokeExact(Handles.get().PFN_vmaCreateAliasingBuffer, allocator, allocation, pBufferCreateInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingBuffer", e); }
    }

    /// Invokes `vmaCreateAliasingBuffer2`.
    /// ```
    /// (int) VkResult vmaCreateAliasingBuffer2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, const VkBufferCreateInfo* pBufferCreateInfo, VkBuffer* pBuffer);
    /// ```
    public static int vmaCreateAliasingBuffer2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pBuffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateAliasingBuffer2", allocator, allocation, allocationLocalOffset, pBufferCreateInfo, pBuffer); }
        return (int) Handles.MH_vmaCreateAliasingBuffer2.get().invokeExact(Handles.get().PFN_vmaCreateAliasingBuffer2, allocator, allocation, allocationLocalOffset, pBufferCreateInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingBuffer2", e); }
    }

    /// Invokes `vmaDestroyBuffer`.
    /// ```
    /// void vmaDestroyBuffer((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkBuffer buffer, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaDestroyBuffer(@NonNull MemorySegment allocator, long buffer, @NonNull MemorySegment allocation) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaDestroyBuffer", allocator, buffer, allocation); }
        Handles.MH_vmaDestroyBuffer.get().invokeExact(Handles.get().PFN_vmaDestroyBuffer, allocator, buffer, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyBuffer", e); }
    }

    /// Invokes `vmaCreateImage`.
    /// ```
    /// (int) VkResult vmaCreateImage((struct VmaAllocator *) VmaAllocator allocator, const VkImageCreateInfo* pImageCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, VkImage* pImage, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateImage(@NonNull MemorySegment allocator, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pImage, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateImage", allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo); }
        return (int) Handles.MH_vmaCreateImage.get().invokeExact(Handles.get().PFN_vmaCreateImage, allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateImage", e); }
    }

    /// Invokes `vmaCreateAliasingImage`.
    /// ```
    /// (int) VkResult vmaCreateAliasingImage((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const VkImageCreateInfo* pImageCreateInfo, VkImage* pImage);
    /// ```
    public static int vmaCreateAliasingImage(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pImage) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateAliasingImage", allocator, allocation, pImageCreateInfo, pImage); }
        return (int) Handles.MH_vmaCreateAliasingImage.get().invokeExact(Handles.get().PFN_vmaCreateAliasingImage, allocator, allocation, pImageCreateInfo, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingImage", e); }
    }

    /// Invokes `vmaCreateAliasingImage2`.
    /// ```
    /// (int) VkResult vmaCreateAliasingImage2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, const VkImageCreateInfo* pImageCreateInfo, VkImage* pImage);
    /// ```
    public static int vmaCreateAliasingImage2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pImage) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateAliasingImage2", allocator, allocation, allocationLocalOffset, pImageCreateInfo, pImage); }
        return (int) Handles.MH_vmaCreateAliasingImage2.get().invokeExact(Handles.get().PFN_vmaCreateAliasingImage2, allocator, allocation, allocationLocalOffset, pImageCreateInfo, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateAliasingImage2", e); }
    }

    /// Invokes `vmaDestroyImage`.
    /// ```
    /// void vmaDestroyImage((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkImage image, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaDestroyImage(@NonNull MemorySegment allocator, long image, @NonNull MemorySegment allocation) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaDestroyImage", allocator, image, allocation); }
        Handles.MH_vmaDestroyImage.get().invokeExact(Handles.get().PFN_vmaDestroyImage, allocator, image, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyImage", e); }
    }

    /// Invokes `vmaCreateVirtualBlock`.
    /// ```
    /// (int) VkResult vmaCreateVirtualBlock(const VmaVirtualBlockCreateInfo* pCreateInfo, VmaVirtualBlock* pVirtualBlock);
    /// ```
    public static int vmaCreateVirtualBlock(@NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pVirtualBlock) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCreateVirtualBlock", pCreateInfo, pVirtualBlock); }
        return (int) Handles.MH_vmaCreateVirtualBlock.get().invokeExact(Handles.get().PFN_vmaCreateVirtualBlock, pCreateInfo, pVirtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCreateVirtualBlock", e); }
    }

    /// Invokes `vmaDestroyVirtualBlock`.
    /// ```
    /// void vmaDestroyVirtualBlock((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static void vmaDestroyVirtualBlock(@NonNull MemorySegment virtualBlock) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaDestroyVirtualBlock", virtualBlock); }
        Handles.MH_vmaDestroyVirtualBlock.get().invokeExact(Handles.get().PFN_vmaDestroyVirtualBlock, virtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaDestroyVirtualBlock", e); }
    }

    /// Invokes `vmaIsVirtualBlockEmpty`.
    /// ```
    /// (uint32_t) VkBool32 vmaIsVirtualBlockEmpty((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static int vmaIsVirtualBlockEmpty(@NonNull MemorySegment virtualBlock) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaIsVirtualBlockEmpty", virtualBlock); }
        return (int) Handles.MH_vmaIsVirtualBlockEmpty.get().invokeExact(Handles.get().PFN_vmaIsVirtualBlockEmpty, virtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaIsVirtualBlockEmpty", e); }
    }

    /// Invokes `vmaGetVirtualAllocationInfo`.
    /// ```
    /// void vmaGetVirtualAllocationInfo((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation, VmaVirtualAllocationInfo* pVirtualAllocInfo);
    /// ```
    public static void vmaGetVirtualAllocationInfo(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment allocation, @NonNull MemorySegment pVirtualAllocInfo) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetVirtualAllocationInfo", virtualBlock, allocation, pVirtualAllocInfo); }
        Handles.MH_vmaGetVirtualAllocationInfo.get().invokeExact(Handles.get().PFN_vmaGetVirtualAllocationInfo, virtualBlock, allocation, pVirtualAllocInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetVirtualAllocationInfo", e); }
    }

    /// Invokes `vmaVirtualAllocate`.
    /// ```
    /// (int) VkResult vmaVirtualAllocate((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, const VmaVirtualAllocationCreateInfo* pCreateInfo, VmaVirtualAllocation* pAllocation, VkDeviceSize* pOffset);
    /// ```
    public static int vmaVirtualAllocate(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pOffset) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaVirtualAllocate", virtualBlock, pCreateInfo, pAllocation, pOffset); }
        return (int) Handles.MH_vmaVirtualAllocate.get().invokeExact(Handles.get().PFN_vmaVirtualAllocate, virtualBlock, pCreateInfo, pAllocation, pOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vmaVirtualAllocate", e); }
    }

    /// Invokes `vmaVirtualFree`.
    /// ```
    /// void vmaVirtualFree((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation);
    /// ```
    public static void vmaVirtualFree(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment allocation) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaVirtualFree", virtualBlock, allocation); }
        Handles.MH_vmaVirtualFree.get().invokeExact(Handles.get().PFN_vmaVirtualFree, virtualBlock, allocation); }
        catch (Throwable e) { throw new RuntimeException("error in vmaVirtualFree", e); }
    }

    /// Invokes `vmaClearVirtualBlock`.
    /// ```
    /// void vmaClearVirtualBlock((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static void vmaClearVirtualBlock(@NonNull MemorySegment virtualBlock) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaClearVirtualBlock", virtualBlock); }
        Handles.MH_vmaClearVirtualBlock.get().invokeExact(Handles.get().PFN_vmaClearVirtualBlock, virtualBlock); }
        catch (Throwable e) { throw new RuntimeException("error in vmaClearVirtualBlock", e); }
    }

    /// Invokes `vmaSetVirtualAllocationUserData`.
    /// ```
    /// void vmaSetVirtualAllocationUserData((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation, void* pUserData);
    /// ```
    public static void vmaSetVirtualAllocationUserData(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment allocation, @NonNull MemorySegment pUserData) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaSetVirtualAllocationUserData", virtualBlock, allocation, pUserData); }
        Handles.MH_vmaSetVirtualAllocationUserData.get().invokeExact(Handles.get().PFN_vmaSetVirtualAllocationUserData, virtualBlock, allocation, pUserData); }
        catch (Throwable e) { throw new RuntimeException("error in vmaSetVirtualAllocationUserData", e); }
    }

    /// Invokes `vmaGetVirtualBlockStatistics`.
    /// ```
    /// void vmaGetVirtualBlockStatistics((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, VmaStatistics* pStats);
    /// ```
    public static void vmaGetVirtualBlockStatistics(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pStats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaGetVirtualBlockStatistics", virtualBlock, pStats); }
        Handles.MH_vmaGetVirtualBlockStatistics.get().invokeExact(Handles.get().PFN_vmaGetVirtualBlockStatistics, virtualBlock, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaGetVirtualBlockStatistics", e); }
    }

    /// Invokes `vmaCalculateVirtualBlockStatistics`.
    /// ```
    /// void vmaCalculateVirtualBlockStatistics((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, VmaDetailedStatistics* pStats);
    /// ```
    public static void vmaCalculateVirtualBlockStatistics(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pStats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaCalculateVirtualBlockStatistics", virtualBlock, pStats); }
        Handles.MH_vmaCalculateVirtualBlockStatistics.get().invokeExact(Handles.get().PFN_vmaCalculateVirtualBlockStatistics, virtualBlock, pStats); }
        catch (Throwable e) { throw new RuntimeException("error in vmaCalculateVirtualBlockStatistics", e); }
    }

    /// Invokes `vmaBuildVirtualBlockStatsString`.
    /// ```
    /// void vmaBuildVirtualBlockStatsString((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, char** ppStatsString, (uint32_t) VkBool32 detailedMap);
    /// ```
    public static void vmaBuildVirtualBlockStatsString(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment ppStatsString, int detailedMap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBuildVirtualBlockStatsString", virtualBlock, ppStatsString, detailedMap); }
        Handles.MH_vmaBuildVirtualBlockStatsString.get().invokeExact(Handles.get().PFN_vmaBuildVirtualBlockStatsString, virtualBlock, ppStatsString, detailedMap); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBuildVirtualBlockStatsString", e); }
    }

    /// Invokes `vmaFreeVirtualBlockStatsString`.
    /// ```
    /// void vmaFreeVirtualBlockStatsString((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, char* pStatsString);
    /// ```
    public static void vmaFreeVirtualBlockStatsString(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pStatsString) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFreeVirtualBlockStatsString", virtualBlock, pStatsString); }
        Handles.MH_vmaFreeVirtualBlockStatsString.get().invokeExact(Handles.get().PFN_vmaFreeVirtualBlockStatsString, virtualBlock, pStatsString); }
        catch (Throwable e) { throw new RuntimeException("error in vmaFreeVirtualBlockStatsString", e); }
    }

    /// Invokes `vmaBuildStatsString`.
    /// ```
    /// void vmaBuildStatsString((struct VmaAllocator *) VmaAllocator allocator, char** ppStatsString, (uint32_t) VkBool32 detailedMap);
    /// ```
    public static void vmaBuildStatsString(@NonNull MemorySegment allocator, @NonNull MemorySegment ppStatsString, int detailedMap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaBuildStatsString", allocator, ppStatsString, detailedMap); }
        Handles.MH_vmaBuildStatsString.get().invokeExact(Handles.get().PFN_vmaBuildStatsString, allocator, ppStatsString, detailedMap); }
        catch (Throwable e) { throw new RuntimeException("error in vmaBuildStatsString", e); }
    }

    /// Invokes `vmaFreeStatsString`.
    /// ```
    /// void vmaFreeStatsString((struct VmaAllocator *) VmaAllocator allocator, char* pStatsString);
    /// ```
    public static void vmaFreeStatsString(@NonNull MemorySegment allocator, @NonNull MemorySegment pStatsString) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("vmaFreeStatsString", allocator, pStatsString); }
        Handles.MH_vmaFreeStatsString.get().invokeExact(Handles.get().PFN_vmaFreeStatsString, allocator, pStatsString); }
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
