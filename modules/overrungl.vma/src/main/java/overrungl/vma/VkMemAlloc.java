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
import org.lwjgl.util.vma.Vma;
import overrungl.vulkan.VkDevice;
import overrungl.vulkan.VkInstance;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/// [vk_mem_alloc.h](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h)
///
/// To conveniently fill in a [VmaAllocatorCreateInfo],
/// use [<code>VmaUtil::fillAllocatorCreateInfo</code>][VmaUtil#fillAllocatorCreateInfo(SegmentAllocator, VmaAllocatorCreateInfo, VkInstance, VkDevice)].
///
/// @author squid233
/// @since 0.1.0
public final class VkMemAlloc {
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

    /// Invokes `vmaCreateAllocator`.
    /// ```
    /// (int) VkResult vmaCreateAllocator(const VmaAllocatorCreateInfo* pCreateInfo, VmaAllocator* pAllocator);
    /// ```
    public static int vmaCreateAllocator(@NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator) {
        return Vma.nvmaCreateAllocator(pCreateInfo.address(), pAllocator.address());
    }

    /// Invokes `vmaDestroyAllocator`.
    /// ```
    /// void vmaDestroyAllocator((struct VmaAllocator *) VmaAllocator pAllocator);
    /// ```
    public static void vmaDestroyAllocator(@NonNull MemorySegment pAllocator) {
        Vma.nvmaDestroyAllocator(pAllocator.address());
    }

    /// Invokes `vmaGetAllocatorInfo`.
    /// ```
    /// void vmaGetAllocatorInfo((struct VmaAllocator *) VmaAllocator allocator, VmaAllocatorInfo* pAllocatorInfo);
    /// ```
    public static void vmaGetAllocatorInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment pAllocatorInfo) {
        Vma.nvmaGetAllocatorInfo(allocator.address(), pAllocatorInfo.address());
    }

    /// Invokes `vmaGetPhysicalDeviceProperties`.
    /// ```
    /// void vmaGetPhysicalDeviceProperties((struct VmaAllocator *) VmaAllocator allocator, const VkPhysicalDeviceProperties** ppPhysicalDeviceProperties);
    /// ```
    public static void vmaGetPhysicalDeviceProperties(@NonNull MemorySegment allocator, @NonNull MemorySegment ppPhysicalDeviceProperties) {
        Vma.nvmaGetPhysicalDeviceProperties(allocator.address(), ppPhysicalDeviceProperties.address());
    }

    /// Invokes `vmaGetMemoryProperties`.
    /// ```
    /// void vmaGetMemoryProperties((struct VmaAllocator *) VmaAllocator allocator, const VkPhysicalDeviceMemoryProperties** ppPhysicalDeviceMemoryProperties);
    /// ```
    public static void vmaGetMemoryProperties(@NonNull MemorySegment allocator, @NonNull MemorySegment ppPhysicalDeviceMemoryProperties) {
        Vma.nvmaGetMemoryProperties(allocator.address(), ppPhysicalDeviceMemoryProperties.address());
    }

    /// Invokes `vmaGetMemoryTypeProperties`.
    /// ```
    /// void vmaGetMemoryTypeProperties((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeIndex, VkMemoryPropertyFlags* pFlags);
    /// ```
    public static void vmaGetMemoryTypeProperties(@NonNull MemorySegment allocator, int memoryTypeIndex, @NonNull MemorySegment pFlags) {
        Vma.nvmaGetMemoryTypeProperties(allocator.address(), memoryTypeIndex, pFlags.address());
    }

    /// Invokes `vmaSetCurrentFrameIndex`.
    /// ```
    /// void vmaSetCurrentFrameIndex((struct VmaAllocator *) VmaAllocator allocator, uint32_t frameIndex);
    /// ```
    public static void vmaSetCurrentFrameIndex(@NonNull MemorySegment allocator, int frameIndex) {
        Vma.nvmaSetCurrentFrameIndex(allocator.address(), frameIndex);
    }

    /// Invokes `vmaCalculateStatistics`.
    /// ```
    /// void vmaCalculateStatistics((struct VmaAllocator *) VmaAllocator allocator, VmaTotalStatistics* pStats);
    /// ```
    public static void vmaCalculateStatistics(@NonNull MemorySegment allocator, @NonNull MemorySegment pStats) {
        Vma.nvmaCalculateStatistics(allocator.address(), pStats.address());
    }

    /// Invokes `vmaGetHeapBudgets`.
    /// ```
    /// void vmaGetHeapBudgets((struct VmaAllocator *) VmaAllocator allocator, VmaBudget* pBudgets);
    /// ```
    public static void vmaGetHeapBudgets(@NonNull MemorySegment allocator, @NonNull MemorySegment pBudgets) {
        Vma.nvmaGetHeapBudgets(allocator.address(), pBudgets.address());
    }

    /// Invokes `vmaFindMemoryTypeIndex`.
    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndex((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeBits, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndex(@NonNull MemorySegment allocator, int memoryTypeBits, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pMemoryTypeIndex) {
        return Vma.nvmaFindMemoryTypeIndex(allocator.address(), memoryTypeBits, pAllocationCreateInfo.address(), pMemoryTypeIndex.address());
    }

    /// Invokes `vmaFindMemoryTypeIndexForBufferInfo`.
    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndexForBufferInfo((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndexForBufferInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pMemoryTypeIndex) {
        return Vma.nvmaFindMemoryTypeIndexForBufferInfo(allocator.address(), pBufferCreateInfo.address(), pAllocationCreateInfo.address(), pMemoryTypeIndex.address());
    }

    /// Invokes `vmaFindMemoryTypeIndexForImageInfo`.
    /// ```
    /// (int) VkResult vmaFindMemoryTypeIndexForImageInfo((struct VmaAllocator *) VmaAllocator allocator, const VkImageCreateInfo* pImageCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, uint32_t* pMemoryTypeIndex);
    /// ```
    public static int vmaFindMemoryTypeIndexForImageInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pMemoryTypeIndex) {
        return Vma.nvmaFindMemoryTypeIndexForImageInfo(allocator.address(), pImageCreateInfo.address(), pAllocationCreateInfo.address(), pMemoryTypeIndex.address());
    }

    /// Invokes `vmaCreatePool`.
    /// ```
    /// (int) VkResult vmaCreatePool((struct VmaAllocator *) VmaAllocator allocator, const VmaPoolCreateInfo* pCreateInfo, VmaPool* pPool);
    /// ```
    public static int vmaCreatePool(@NonNull MemorySegment allocator, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pPool) {
        return Vma.nvmaCreatePool(allocator.address(), pCreateInfo.address(), pPool.address());
    }

    /// Invokes `vmaDestroyPool`.
    /// ```
    /// void vmaDestroyPool((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool);
    /// ```
    public static void vmaDestroyPool(@NonNull MemorySegment allocator, @NonNull MemorySegment pool) {
        Vma.nvmaDestroyPool(allocator.address(), pool.address());
    }

    /// Invokes `vmaGetPoolStatistics`.
    /// ```
    /// void vmaGetPoolStatistics((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, VmaStatistics* pPoolStats);
    /// ```
    public static void vmaGetPoolStatistics(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment pPoolStats) {
        Vma.nvmaGetPoolStatistics(allocator.address(), pool.address(), pPoolStats.address());
    }

    /// Invokes `vmaCalculatePoolStatistics`.
    /// ```
    /// void vmaCalculatePoolStatistics((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, VmaDetailedStatistics* pPoolStats);
    /// ```
    public static void vmaCalculatePoolStatistics(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment pPoolStats) {
        Vma.nvmaCalculatePoolStatistics(allocator.address(), pool.address(), pPoolStats.address());
    }

    /// Invokes `vmaCheckPoolCorruption`.
    /// ```
    /// (int) VkResult vmaCheckPoolCorruption((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool);
    /// ```
    public static int vmaCheckPoolCorruption(@NonNull MemorySegment allocator, @NonNull MemorySegment pool) {
        return Vma.nvmaCheckPoolCorruption(allocator.address(), pool.address());
    }

    /// Invokes `vmaGetPoolName`.
    /// ```
    /// void vmaGetPoolName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, const char** ppName);
    /// ```
    public static void vmaGetPoolName(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment ppName) {
        Vma.nvmaGetPoolName(allocator.address(), pool.address(), ppName.address());
    }

    /// Invokes `vmaSetPoolName`.
    /// ```
    /// void vmaSetPoolName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaPool *) VmaPool pool, const char* pName);
    /// ```
    public static void vmaSetPoolName(@NonNull MemorySegment allocator, @NonNull MemorySegment pool, @NonNull MemorySegment pName) {
        Vma.nvmaSetPoolName(allocator.address(), pool.address(), pName.address());
    }

    /// Invokes `vmaAllocateMemory`.
    /// ```
    /// (int) VkResult vmaAllocateMemory((struct VmaAllocator *) VmaAllocator allocator, const VkMemoryRequirements* pVkMemoryRequirements, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment pVkMemoryRequirements, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaAllocateMemory(allocator.address(), pVkMemoryRequirements.address(), pCreateInfo.address(), pAllocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaAllocateMemoryPages`.
    /// ```
    /// (int) VkResult vmaAllocateMemoryPages((struct VmaAllocator *) VmaAllocator allocator, const VkMemoryRequirements* pVkMemoryRequirements, const VmaAllocationCreateInfo* pCreateInfo, size_t allocationCount, VmaAllocation* pAllocations, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryPages(@NonNull MemorySegment allocator, @NonNull MemorySegment pVkMemoryRequirements, @NonNull MemorySegment pCreateInfo, long allocationCount, @NonNull MemorySegment pAllocations, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaAllocateMemoryPages(allocator.address(), pVkMemoryRequirements.address(), pCreateInfo.address(), allocationCount, pAllocations.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaAllocateMemoryForBuffer`.
    /// ```
    /// (int) VkResult vmaAllocateMemoryForBuffer((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkBuffer buffer, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryForBuffer(@NonNull MemorySegment allocator, long buffer, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaAllocateMemoryForBuffer(allocator.address(), buffer, pCreateInfo.address(), pAllocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaAllocateMemoryForImage`.
    /// ```
    /// (int) VkResult vmaAllocateMemoryForImage((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkImage image, const VmaAllocationCreateInfo* pCreateInfo, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaAllocateMemoryForImage(@NonNull MemorySegment allocator, long image, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaAllocateMemoryForImage(allocator.address(), image, pCreateInfo.address(), pAllocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaFreeMemory`.
    /// ```
    /// void vmaFreeMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaFreeMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation) {
        Vma.nvmaFreeMemory(allocator.address(), allocation.address());
    }

    /// Invokes `vmaFreeMemoryPages`.
    /// ```
    /// void vmaFreeMemoryPages((struct VmaAllocator *) VmaAllocator allocator, size_t allocationCount, const VmaAllocation* pAllocations);
    /// ```
    public static void vmaFreeMemoryPages(@NonNull MemorySegment allocator, long allocationCount, @NonNull MemorySegment pAllocations) {
        Vma.nvmaFreeMemoryPages(allocator.address(), allocationCount, pAllocations.address());
    }

    /// Invokes `vmaGetAllocationInfo`.
    /// ```
    /// void vmaGetAllocationInfo((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static void vmaGetAllocationInfo(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pAllocationInfo) {
        Vma.nvmaGetAllocationInfo(allocator.address(), allocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaGetAllocationInfo2`.
    /// ```
    /// void vmaGetAllocationInfo2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VmaAllocationInfo2* pAllocationInfo);
    /// ```
    public static void vmaGetAllocationInfo2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pAllocationInfo) {
        Vma.nvmaGetAllocationInfo2(allocator.address(), allocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaSetAllocationUserData`.
    /// ```
    /// void vmaSetAllocationUserData((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, void* pUserData);
    /// ```
    public static void vmaSetAllocationUserData(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pUserData) {
        Vma.nvmaSetAllocationUserData(allocator.address(), allocation.address(), pUserData.address());
    }

    /// Invokes `vmaSetAllocationName`.
    /// ```
    /// void vmaSetAllocationName((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const char* pName);
    /// ```
    public static void vmaSetAllocationName(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pName) {
        Vma.nvmaSetAllocationName(allocator.address(), allocation.address(), pName.address());
    }

    /// Invokes `vmaGetAllocationMemoryProperties`.
    /// ```
    /// void vmaGetAllocationMemoryProperties((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, VkMemoryPropertyFlags* pFlags);
    /// ```
    public static void vmaGetAllocationMemoryProperties(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pFlags) {
        Vma.nvmaGetAllocationMemoryProperties(allocator.address(), allocation.address(), pFlags.address());
    }

    /// Invokes `vmaMapMemory`.
    /// ```
    /// (int) VkResult vmaMapMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, void** ppData);
    /// ```
    public static int vmaMapMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment ppData) {
        return Vma.nvmaMapMemory(allocator.address(), allocation.address(), ppData.address());
    }

    /// Invokes `vmaUnmapMemory`.
    /// ```
    /// void vmaUnmapMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaUnmapMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation) {
        Vma.nvmaUnmapMemory(allocator.address(), allocation.address());
    }

    /// Invokes `vmaFlushAllocation`.
    /// ```
    /// (int) VkResult vmaFlushAllocation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size);
    /// ```
    public static void vmaFlushAllocation(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long offset, long size) {
        Vma.nvmaFlushAllocation(allocator.address(), allocation.address(), offset, size);
    }

    /// Invokes `vmaInvalidateAllocation`.
    /// ```
    /// (int) VkResult vmaInvalidateAllocation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size);
    /// ```
    public static void vmaInvalidateAllocation(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long offset, long size) {
        Vma.nvmaInvalidateAllocation(allocator.address(), allocation.address(), offset, size);
    }

    /// Invokes `vmaFlushAllocations`.
    /// ```
    /// (int) VkResult vmaFlushAllocations((struct VmaAllocator *) VmaAllocator allocator, uint32_t allocationCount, const VmaAllocation* allocations, const VkDeviceSize* offsets, const VkDeviceSize* sizes);
    /// ```
    public static int vmaFlushAllocations(@NonNull MemorySegment allocator, int allocationCount, @NonNull MemorySegment allocations, @NonNull MemorySegment offsets, @NonNull MemorySegment sizes) {
        return Vma.nvmaFlushAllocations(allocator.address(), allocationCount, allocations.address(), offsets.address(), sizes.address());
    }

    /// Invokes `vmaInvalidateAllocations`.
    /// ```
    /// (int) VkResult vmaInvalidateAllocations((struct VmaAllocator *) VmaAllocator allocator, uint32_t allocationCount, const VmaAllocation* allocations, const VkDeviceSize* offsets, const VkDeviceSize* sizes);
    /// ```
    public static int vmaInvalidateAllocations(@NonNull MemorySegment allocator, int allocationCount, @NonNull MemorySegment allocations, @NonNull MemorySegment offsets, @NonNull MemorySegment sizes) {
        return Vma.nvmaInvalidateAllocations(allocator.address(), allocationCount, allocations.address(), offsets.address(), sizes.address());
    }

    /// Invokes `vmaCopyMemoryToAllocation`.
    /// ```
    /// (int) VkResult vmaCopyMemoryToAllocation((struct VmaAllocator *) VmaAllocator allocator, const void* pSrcHostPointer, (struct VmaAllocation *) VmaAllocation dstAllocation, (uint64_t) VkDeviceSize dstAllocationLocalOffset, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaCopyMemoryToAllocation(@NonNull MemorySegment allocator, @NonNull MemorySegment pSrcHostPointer, @NonNull MemorySegment dstAllocation, long dstAllocationLocalOffset, long size) {
        return Vma.nvmaCopyMemoryToAllocation(allocator.address(), pSrcHostPointer.address(), dstAllocation.address(), dstAllocationLocalOffset, size);
    }

    /// Invokes `vmaCopyAllocationToMemory`.
    /// ```
    /// (int) VkResult vmaCopyAllocationToMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation srcAllocation, (uint64_t) VkDeviceSize srcAllocationLocalOffset, void* pDstHostPointer, (uint64_t) VkDeviceSize size);
    /// ```
    public static int vmaCopyAllocationToMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment srcAllocation, long srcAllocationLocalOffset, @NonNull MemorySegment pDstHostPointer, long size) {
        return Vma.nvmaCopyAllocationToMemory(allocator.address(), srcAllocation.address(), srcAllocationLocalOffset, pDstHostPointer.address(), size);
    }

    /// Invokes `vmaCheckCorruption`.
    /// ```
    /// (int) VkResult vmaCheckCorruption((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryTypeBits);
    /// ```
    public static int vmaCheckCorruption(@NonNull MemorySegment allocator, int memoryTypeBits) {
        return Vma.nvmaCheckCorruption(allocator.address(), memoryTypeBits);
    }

    /// Invokes `vmaBeginDefragmentation`.
    /// ```
    /// (int) VkResult vmaBeginDefragmentation((struct VmaAllocator *) VmaAllocator allocator, const VmaDefragmentationInfo* pInfo, VmaDefragmentationContext* pContext);
    /// ```
    public static int vmaBeginDefragmentation(@NonNull MemorySegment allocator, @NonNull MemorySegment pInfo, @NonNull MemorySegment pContext) {
        return Vma.nvmaBeginDefragmentation(allocator.address(), pInfo.address(), pContext.address());
    }

    /// Invokes `vmaEndDefragmentation`.
    /// ```
    /// void vmaEndDefragmentation((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationStats* pStats);
    /// ```
    public static void vmaEndDefragmentation(@NonNull MemorySegment allocator, @NonNull MemorySegment context, @NonNull MemorySegment pStats) {
        Vma.nvmaEndDefragmentation(allocator.address(), context.address(), pStats.address());
    }

    /// Invokes `vmaBeginDefragmentationPass`.
    /// ```
    /// (int) VkResult vmaBeginDefragmentationPass((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo* pPassInfo);
    /// ```
    public static int vmaBeginDefragmentationPass(@NonNull MemorySegment allocator, @NonNull MemorySegment context, @NonNull MemorySegment pPassInfo) {
        return Vma.nvmaBeginDefragmentationPass(allocator.address(), context.address(), pPassInfo.address());
    }

    /// Invokes `vmaEndDefragmentationPass`.
    /// ```
    /// (int) VkResult vmaEndDefragmentationPass((struct VmaAllocator *) VmaAllocator allocator, (struct VmaDefragmentationContext *) VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo* pPassInfo);
    /// ```
    public static int vmaEndDefragmentationPass(@NonNull MemorySegment allocator, @NonNull MemorySegment context, @NonNull MemorySegment pPassInfo) {
        return Vma.nvmaEndDefragmentationPass(allocator.address(), context.address(), pPassInfo.address());
    }

    /// Invokes `vmaBindBufferMemory`.
    /// ```
    /// (int) VkResult vmaBindBufferMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkBuffer buffer);
    /// ```
    public static int vmaBindBufferMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long buffer) {
        return Vma.nvmaBindBufferMemory(allocator.address(), allocation.address(), buffer);
    }

    /// Invokes `vmaBindBufferMemory2`.
    /// ```
    /// (int) VkResult vmaBindBufferMemory2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, (uint64_t) VkBuffer buffer, const void* pNext);
    /// ```
    public static int vmaBindBufferMemory2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, long buffer, @NonNull MemorySegment pNext) {
        return Vma.nvmaBindBufferMemory2(allocator.address(), allocation.address(), allocationLocalOffset, buffer, pNext.address());
    }

    /// Invokes `vmaBindImageMemory`.
    /// ```
    /// (int) VkResult vmaBindImageMemory((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkImage image);
    /// ```
    public static int vmaBindImageMemory(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long image) {
        return Vma.nvmaBindImageMemory(allocator.address(), allocation.address(), image);
    }

    /// Invokes `vmaBindImageMemory2`.
    /// ```
    /// (int) VkResult vmaBindImageMemory2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, (uint64_t) VkImage image, const void* pNext);
    /// ```
    public static int vmaBindImageMemory2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, long image, @NonNull MemorySegment pNext) {
        return Vma.nvmaBindImageMemory2(allocator.address(), allocation.address(), allocationLocalOffset, image, pNext.address());
    }

    /// Invokes `vmaCreateBuffer`.
    /// ```
    /// (int) VkResult vmaCreateBuffer((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, VkBuffer* pBuffer, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateBuffer(@NonNull MemorySegment allocator, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pBuffer, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaCreateBuffer(allocator.address(), pBufferCreateInfo.address(), pAllocationCreateInfo.address(), pBuffer.address(), pAllocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaCreateBufferWithAlignment`.
    /// ```
    /// (int) VkResult vmaCreateBufferWithAlignment((struct VmaAllocator *) VmaAllocator allocator, const VkBufferCreateInfo* pBufferCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, (uint64_t) VkDeviceSize minAlignment, VkBuffer* pBuffer, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateBufferWithAlignment(@NonNull MemorySegment allocator, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, long minAlignment, @NonNull MemorySegment pBuffer, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaCreateBufferWithAlignment(allocator.address(), pBufferCreateInfo.address(), pAllocationCreateInfo.address(), minAlignment, pBuffer.address(), pAllocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaCreateAliasingBuffer`.
    /// ```
    /// (int) VkResult vmaCreateAliasingBuffer((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const VkBufferCreateInfo* pBufferCreateInfo, VkBuffer* pBuffer);
    /// ```
    public static int vmaCreateAliasingBuffer(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pBuffer) {
        return Vma.nvmaCreateAliasingBuffer(allocator.address(), allocation.address(), pBufferCreateInfo.address(), pBuffer.address());
    }

    /// Invokes `vmaCreateAliasingBuffer2`.
    /// ```
    /// (int) VkResult vmaCreateAliasingBuffer2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, const VkBufferCreateInfo* pBufferCreateInfo, VkBuffer* pBuffer);
    /// ```
    public static int vmaCreateAliasingBuffer2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, @NonNull MemorySegment pBufferCreateInfo, @NonNull MemorySegment pBuffer) {
        return Vma.nvmaCreateAliasingBuffer2(allocator.address(), allocation.address(), allocationLocalOffset, pBufferCreateInfo.address(), pBuffer.address());
    }

    /// Invokes `vmaDestroyBuffer`.
    /// ```
    /// void vmaDestroyBuffer((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkBuffer buffer, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaDestroyBuffer(@NonNull MemorySegment allocator, long buffer, @NonNull MemorySegment allocation) {
        Vma.nvmaDestroyBuffer(allocator.address(), buffer, allocation.address());
    }

    /// Invokes `vmaCreateImage`.
    /// ```
    /// (int) VkResult vmaCreateImage((struct VmaAllocator *) VmaAllocator allocator, const VkImageCreateInfo* pImageCreateInfo, const VmaAllocationCreateInfo* pAllocationCreateInfo, VkImage* pImage, VmaAllocation* pAllocation, VmaAllocationInfo* pAllocationInfo);
    /// ```
    public static int vmaCreateImage(@NonNull MemorySegment allocator, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pAllocationCreateInfo, @NonNull MemorySegment pImage, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pAllocationInfo) {
        return Vma.nvmaCreateImage(allocator.address(), pImageCreateInfo.address(), pAllocationCreateInfo.address(), pImage.address(), pAllocation.address(), pAllocationInfo.address());
    }

    /// Invokes `vmaCreateAliasingImage`.
    /// ```
    /// (int) VkResult vmaCreateAliasingImage((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, const VkImageCreateInfo* pImageCreateInfo, VkImage* pImage);
    /// ```
    public static int vmaCreateAliasingImage(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pImage) {
        return Vma.nvmaCreateAliasingImage(allocator.address(), allocation.address(), pImageCreateInfo.address(), pImage.address());
    }

    /// Invokes `vmaCreateAliasingImage2`.
    /// ```
    /// (int) VkResult vmaCreateAliasingImage2((struct VmaAllocator *) VmaAllocator allocator, (struct VmaAllocation *) VmaAllocation allocation, (uint64_t) VkDeviceSize allocationLocalOffset, const VkImageCreateInfo* pImageCreateInfo, VkImage* pImage);
    /// ```
    public static int vmaCreateAliasingImage2(@NonNull MemorySegment allocator, @NonNull MemorySegment allocation, long allocationLocalOffset, @NonNull MemorySegment pImageCreateInfo, @NonNull MemorySegment pImage) {
        return Vma.nvmaCreateAliasingImage2(allocator.address(), allocation.address(), allocationLocalOffset, pImageCreateInfo.address(), pImage.address());
    }

    /// Invokes `vmaDestroyImage`.
    /// ```
    /// void vmaDestroyImage((struct VmaAllocator *) VmaAllocator allocator, (uint64_t) VkImage image, (struct VmaAllocation *) VmaAllocation allocation);
    /// ```
    public static void vmaDestroyImage(@NonNull MemorySegment allocator, long image, @NonNull MemorySegment allocation) {
        Vma.nvmaDestroyImage(allocator.address(), image, allocation.address());
    }

    /// Invokes `vmaCreateVirtualBlock`.
    /// ```
    /// (int) VkResult vmaCreateVirtualBlock(const VmaVirtualBlockCreateInfo* pCreateInfo, VmaVirtualBlock* pVirtualBlock);
    /// ```
    public static int vmaCreateVirtualBlock(@NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pVirtualBlock) {
        return Vma.nvmaCreateVirtualBlock(pCreateInfo.address(), pVirtualBlock.address());
    }

    /// Invokes `vmaDestroyVirtualBlock`.
    /// ```
    /// void vmaDestroyVirtualBlock((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static void vmaDestroyVirtualBlock(@NonNull MemorySegment virtualBlock) {
        Vma.nvmaDestroyVirtualBlock(virtualBlock.address());
    }

    /// Invokes `vmaIsVirtualBlockEmpty`.
    /// ```
    /// (uint32_t) VkBool32 vmaIsVirtualBlockEmpty((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static int vmaIsVirtualBlockEmpty(@NonNull MemorySegment virtualBlock) {
        return Vma.nvmaIsVirtualBlockEmpty(virtualBlock.address());
    }

    /// Invokes `vmaGetVirtualAllocationInfo`.
    /// ```
    /// void vmaGetVirtualAllocationInfo((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation, VmaVirtualAllocationInfo* pVirtualAllocInfo);
    /// ```
    public static void vmaGetVirtualAllocationInfo(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment allocation, @NonNull MemorySegment pVirtualAllocInfo) {
        Vma.nvmaGetVirtualAllocationInfo(virtualBlock.address(), allocation.address(), pVirtualAllocInfo.address());
    }

    /// Invokes `vmaVirtualAllocate`.
    /// ```
    /// (int) VkResult vmaVirtualAllocate((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, const VmaVirtualAllocationCreateInfo* pCreateInfo, VmaVirtualAllocation* pAllocation, VkDeviceSize* pOffset);
    /// ```
    public static int vmaVirtualAllocate(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocation, @NonNull MemorySegment pOffset) {
        return Vma.nvmaVirtualAllocate(virtualBlock.address(), pCreateInfo.address(), pAllocation.address(), pOffset.address());
    }

    /// Invokes `vmaVirtualFree`.
    /// ```
    /// void vmaVirtualFree((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation);
    /// ```
    public static void vmaVirtualFree(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment allocation) {
        Vma.nvmaVirtualFree(virtualBlock.address(), allocation.address());
    }

    /// Invokes `vmaClearVirtualBlock`.
    /// ```
    /// void vmaClearVirtualBlock((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock);
    /// ```
    public static void vmaClearVirtualBlock(@NonNull MemorySegment virtualBlock) {
        Vma.nvmaClearVirtualBlock(virtualBlock.address());
    }

    /// Invokes `vmaSetVirtualAllocationUserData`.
    /// ```
    /// void vmaSetVirtualAllocationUserData((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, (struct VmaVirtualAllocation) VmaVirtualAllocation allocation, void* pUserData);
    /// ```
    public static void vmaSetVirtualAllocationUserData(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment allocation, @NonNull MemorySegment pUserData) {
        Vma.nvmaSetVirtualAllocationUserData(virtualBlock.address(), allocation.address(), pUserData.address());
    }

    /// Invokes `vmaGetVirtualBlockStatistics`.
    /// ```
    /// void vmaGetVirtualBlockStatistics((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, VmaStatistics* pStats);
    /// ```
    public static void vmaGetVirtualBlockStatistics(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pStats) {
        Vma.nvmaGetVirtualBlockStatistics(virtualBlock.address(), pStats.address());
    }

    /// Invokes `vmaCalculateVirtualBlockStatistics`.
    /// ```
    /// void vmaCalculateVirtualBlockStatistics((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, VmaDetailedStatistics* pStats);
    /// ```
    public static void vmaCalculateVirtualBlockStatistics(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pStats) {
        Vma.nvmaCalculateVirtualBlockStatistics(virtualBlock.address(), pStats.address());
    }

    /// Invokes `vmaBuildVirtualBlockStatsString`.
    /// ```
    /// void vmaBuildVirtualBlockStatsString((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, char** ppStatsString, (uint32_t) VkBool32 detailedMap);
    /// ```
    public static void vmaBuildVirtualBlockStatsString(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment ppStatsString, int detailedMap) {
        Vma.nvmaBuildVirtualBlockStatsString(virtualBlock.address(), ppStatsString.address(), detailedMap);
    }

    /// Invokes `vmaFreeVirtualBlockStatsString`.
    /// ```
    /// void vmaFreeVirtualBlockStatsString((struct VmaVirtualBlock) VmaVirtualBlock virtualBlock, char* pStatsString);
    /// ```
    public static void vmaFreeVirtualBlockStatsString(@NonNull MemorySegment virtualBlock, @NonNull MemorySegment pStatsString) {
        Vma.nvmaFreeVirtualBlockStatsString(virtualBlock.address(), pStatsString.address());
    }

    /// Invokes `vmaBuildStatsString`.
    /// ```
    /// void vmaBuildStatsString((struct VmaAllocator *) VmaAllocator allocator, char** ppStatsString, (uint32_t) VkBool32 detailedMap);
    /// ```
    public static void vmaBuildStatsString(@NonNull MemorySegment allocator, @NonNull MemorySegment ppStatsString, int detailedMap) {
        Vma.nvmaBuildStatsString(allocator.address(), ppStatsString.address(), detailedMap);
    }

    /// Invokes `vmaFreeStatsString`.
    /// ```
    /// void vmaFreeStatsString((struct VmaAllocator *) VmaAllocator allocator, char* pStatsString);
    /// ```
    public static void vmaFreeStatsString(@NonNull MemorySegment allocator, @NonNull MemorySegment pStatsString) {
        Vma.nvmaFreeStatsString(allocator.address(), pStatsString.address());
    }

    //@formatter:on

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
