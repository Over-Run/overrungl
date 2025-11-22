// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkReleaseSwapchainImagesInfoEXT`.
/// ## Layout
/// ```
/// struct VkReleaseSwapchainImagesInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainKHR swapchain;
///     uint32_t imageIndexCount;
///     const uint32_t* pImageIndices;
/// }
/// ```
public final class VkReleaseSwapchainImagesInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndexCount"),
        ValueLayout.ADDRESS.withName("pImageIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchain = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
    public static final long OFFSET_imageIndexCount = LAYOUT.byteOffset(PathElement.groupElement("imageIndexCount"));
    public static final long OFFSET_pImageIndices = LAYOUT.byteOffset(PathElement.groupElement("pImageIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchain = LAYOUT.select(PathElement.groupElement("swapchain"));
    public static final MemoryLayout LAYOUT_imageIndexCount = LAYOUT.select(PathElement.groupElement("imageIndexCount"));
    public static final MemoryLayout LAYOUT_pImageIndices = LAYOUT.select(PathElement.groupElement("pImageIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    public static final VarHandle VH_imageIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageIndexCount"));
    public static final VarHandle VH_pImageIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageIndices"));

    public VkReleaseSwapchainImagesInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkReleaseSwapchainImagesInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkReleaseSwapchainImagesInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkReleaseSwapchainImagesInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkReleaseSwapchainImagesInfoEXT alloc(SegmentAllocator allocator) { return new VkReleaseSwapchainImagesInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkReleaseSwapchainImagesInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkReleaseSwapchainImagesInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkReleaseSwapchainImagesInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR); }
    public static VkReleaseSwapchainImagesInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR);
        return s;
    }
    public VkReleaseSwapchainImagesInfoEXT copyFrom(VkReleaseSwapchainImagesInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkReleaseSwapchainImagesInfoEXT reinterpret(long count) { return new VkReleaseSwapchainImagesInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkReleaseSwapchainImagesInfoEXT asSlice(long index) { return new VkReleaseSwapchainImagesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkReleaseSwapchainImagesInfoEXT asSlice(long index, long count) { return new VkReleaseSwapchainImagesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkReleaseSwapchainImagesInfoEXT at(long index, Consumer<VkReleaseSwapchainImagesInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long swapchainAt(long index) { return (long) VH_swapchain.get(this.segment(), 0L, index); }
    public int imageIndexCountAt(long index) { return (int) VH_imageIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pImageIndicesAt(long index) { return (MemorySegment) VH_pImageIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long swapchain() { return (long) VH_swapchain.get(this.segment(), 0L, 0L); }
    public int imageIndexCount() { return (int) VH_imageIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageIndices() { return (MemorySegment) VH_pImageIndices.get(this.segment(), 0L, 0L); }
    public VkReleaseSwapchainImagesInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT swapchainAt(long index, long value) { VH_swapchain.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT imageIndexCountAt(long index, int value) { VH_imageIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT pImageIndicesAt(long index, MemorySegment value) { VH_pImageIndices.set(this.segment(), 0L, index, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT swapchain(long value) { VH_swapchain.set(this.segment(), 0L, 0L, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT imageIndexCount(int value) { VH_imageIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkReleaseSwapchainImagesInfoEXT pImageIndices(MemorySegment value) { VH_pImageIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkReleaseSwapchainImagesInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkReleaseSwapchainImagesInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkReleaseSwapchainImagesInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkReleaseSwapchainImagesInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchain, index), LAYOUT_swapchain); }
    public MemorySegment _swapchain() { return _swapchainAt(0L); }
    public VkReleaseSwapchainImagesInfoEXT _swapchainAt(long index, MemorySegment src) { _swapchainAt(index).copyFrom(src); return this; }
    public VkReleaseSwapchainImagesInfoEXT _swapchain(MemorySegment src) { return _swapchainAt(0L, src); }
    public MemorySegment _imageIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageIndexCount, index), LAYOUT_imageIndexCount); }
    public MemorySegment _imageIndexCount() { return _imageIndexCountAt(0L); }
    public VkReleaseSwapchainImagesInfoEXT _imageIndexCountAt(long index, MemorySegment src) { _imageIndexCountAt(index).copyFrom(src); return this; }
    public VkReleaseSwapchainImagesInfoEXT _imageIndexCount(MemorySegment src) { return _imageIndexCountAt(0L, src); }
    public MemorySegment _pImageIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageIndices, index), LAYOUT_pImageIndices); }
    public MemorySegment _pImageIndices() { return _pImageIndicesAt(0L); }
    public VkReleaseSwapchainImagesInfoEXT _pImageIndicesAt(long index, MemorySegment src) { _pImageIndicesAt(index).copyFrom(src); return this; }
    public VkReleaseSwapchainImagesInfoEXT _pImageIndices(MemorySegment src) { return _pImageIndicesAt(0L, src); }
}
