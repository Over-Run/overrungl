// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkSwapchainCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
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
///     const uint32_t* pQueueFamilyIndices;
///     VkSurfaceTransformFlagBitsKHR preTransform;
///     VkCompositeAlphaFlagBitsKHR compositeAlpha;
///     VkPresentModeKHR presentMode;
///     VkBool32 clipped;
///     VkSwapchainKHR oldSwapchain;
/// }
/// ```
public final class VkSwapchainCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_surface = LAYOUT.byteOffset(PathElement.groupElement("surface"));
    public static final long OFFSET_minImageCount = LAYOUT.byteOffset(PathElement.groupElement("minImageCount"));
    public static final long OFFSET_imageFormat = LAYOUT.byteOffset(PathElement.groupElement("imageFormat"));
    public static final long OFFSET_imageColorSpace = LAYOUT.byteOffset(PathElement.groupElement("imageColorSpace"));
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    public static final long OFFSET_imageArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("imageArrayLayers"));
    public static final long OFFSET_imageUsage = LAYOUT.byteOffset(PathElement.groupElement("imageUsage"));
    public static final long OFFSET_imageSharingMode = LAYOUT.byteOffset(PathElement.groupElement("imageSharingMode"));
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    public static final long OFFSET_preTransform = LAYOUT.byteOffset(PathElement.groupElement("preTransform"));
    public static final long OFFSET_compositeAlpha = LAYOUT.byteOffset(PathElement.groupElement("compositeAlpha"));
    public static final long OFFSET_presentMode = LAYOUT.byteOffset(PathElement.groupElement("presentMode"));
    public static final long OFFSET_clipped = LAYOUT.byteOffset(PathElement.groupElement("clipped"));
    public static final long OFFSET_oldSwapchain = LAYOUT.byteOffset(PathElement.groupElement("oldSwapchain"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_surface = LAYOUT.select(PathElement.groupElement("surface"));
    public static final MemoryLayout LAYOUT_minImageCount = LAYOUT.select(PathElement.groupElement("minImageCount"));
    public static final MemoryLayout LAYOUT_imageFormat = LAYOUT.select(PathElement.groupElement("imageFormat"));
    public static final MemoryLayout LAYOUT_imageColorSpace = LAYOUT.select(PathElement.groupElement("imageColorSpace"));
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    public static final MemoryLayout LAYOUT_imageArrayLayers = LAYOUT.select(PathElement.groupElement("imageArrayLayers"));
    public static final MemoryLayout LAYOUT_imageUsage = LAYOUT.select(PathElement.groupElement("imageUsage"));
    public static final MemoryLayout LAYOUT_imageSharingMode = LAYOUT.select(PathElement.groupElement("imageSharingMode"));
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    public static final MemoryLayout LAYOUT_preTransform = LAYOUT.select(PathElement.groupElement("preTransform"));
    public static final MemoryLayout LAYOUT_compositeAlpha = LAYOUT.select(PathElement.groupElement("compositeAlpha"));
    public static final MemoryLayout LAYOUT_presentMode = LAYOUT.select(PathElement.groupElement("presentMode"));
    public static final MemoryLayout LAYOUT_clipped = LAYOUT.select(PathElement.groupElement("clipped"));
    public static final MemoryLayout LAYOUT_oldSwapchain = LAYOUT.select(PathElement.groupElement("oldSwapchain"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));
    public static final VarHandle VH_minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageCount"));
    public static final VarHandle VH_imageFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormat"));
    public static final VarHandle VH_imageColorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageColorSpace"));
    public static final VarHandle VH_imageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_imageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageArrayLayers"));
    public static final VarHandle VH_imageUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsage"));
    public static final VarHandle VH_imageSharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSharingMode"));
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_preTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preTransform"));
    public static final VarHandle VH_compositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compositeAlpha"));
    public static final VarHandle VH_presentMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMode"));
    public static final VarHandle VH_clipped = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clipped"));
    public static final VarHandle VH_oldSwapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldSwapchain"));

    public VkSwapchainCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSwapchainCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR); }
    public static VkSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR);
        return s;
    }
    public VkSwapchainCreateInfoKHR copyFrom(VkSwapchainCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainCreateInfoKHR reinterpret(long count) { return new VkSwapchainCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainCreateInfoKHR asSlice(long index) { return new VkSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainCreateInfoKHR asSlice(long index, long count) { return new VkSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainCreateInfoKHR at(long index, Consumer<VkSwapchainCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long surfaceAt(long index) { return (long) VH_surface.get(this.segment(), 0L, index); }
    public int minImageCountAt(long index) { return (int) VH_minImageCount.get(this.segment(), 0L, index); }
    public int imageFormatAt(long index) { return (int) VH_imageFormat.get(this.segment(), 0L, index); }
    public int imageColorSpaceAt(long index) { return (int) VH_imageColorSpace.get(this.segment(), 0L, index); }
    public int imageExtent$widthAt(long index) { return (int) VH_imageExtent$width.get(this.segment(), 0L, index); }
    public int imageExtent$heightAt(long index) { return (int) VH_imageExtent$height.get(this.segment(), 0L, index); }
    public int imageArrayLayersAt(long index) { return (int) VH_imageArrayLayers.get(this.segment(), 0L, index); }
    public int imageUsageAt(long index) { return (int) VH_imageUsage.get(this.segment(), 0L, index); }
    public int imageSharingModeAt(long index) { return (int) VH_imageSharingMode.get(this.segment(), 0L, index); }
    public int queueFamilyIndexCountAt(long index) { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int preTransformAt(long index) { return (int) VH_preTransform.get(this.segment(), 0L, index); }
    public int compositeAlphaAt(long index) { return (int) VH_compositeAlpha.get(this.segment(), 0L, index); }
    public int presentModeAt(long index) { return (int) VH_presentMode.get(this.segment(), 0L, index); }
    public int clippedAt(long index) { return (int) VH_clipped.get(this.segment(), 0L, index); }
    public long oldSwapchainAt(long index) { return (long) VH_oldSwapchain.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long surface() { return (long) VH_surface.get(this.segment(), 0L, 0L); }
    public int minImageCount() { return (int) VH_minImageCount.get(this.segment(), 0L, 0L); }
    public int imageFormat() { return (int) VH_imageFormat.get(this.segment(), 0L, 0L); }
    public int imageColorSpace() { return (int) VH_imageColorSpace.get(this.segment(), 0L, 0L); }
    public int imageExtent$width() { return (int) VH_imageExtent$width.get(this.segment(), 0L, 0L); }
    public int imageExtent$height() { return (int) VH_imageExtent$height.get(this.segment(), 0L, 0L); }
    public int imageArrayLayers() { return (int) VH_imageArrayLayers.get(this.segment(), 0L, 0L); }
    public int imageUsage() { return (int) VH_imageUsage.get(this.segment(), 0L, 0L); }
    public int imageSharingMode() { return (int) VH_imageSharingMode.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndexCount() { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueFamilyIndices() { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public int preTransform() { return (int) VH_preTransform.get(this.segment(), 0L, 0L); }
    public int compositeAlpha() { return (int) VH_compositeAlpha.get(this.segment(), 0L, 0L); }
    public int presentMode() { return (int) VH_presentMode.get(this.segment(), 0L, 0L); }
    public int clipped() { return (int) VH_clipped.get(this.segment(), 0L, 0L); }
    public long oldSwapchain() { return (long) VH_oldSwapchain.get(this.segment(), 0L, 0L); }
    public VkSwapchainCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR surfaceAt(long index, long value) { VH_surface.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR minImageCountAt(long index, int value) { VH_minImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageFormatAt(long index, int value) { VH_imageFormat.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageColorSpaceAt(long index, int value) { VH_imageColorSpace.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageExtent$widthAt(long index, int value) { VH_imageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageExtent$heightAt(long index, int value) { VH_imageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageArrayLayersAt(long index, int value) { VH_imageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageUsageAt(long index, int value) { VH_imageUsage.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR imageSharingModeAt(long index, int value) { VH_imageSharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR queueFamilyIndexCountAt(long index, int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR preTransformAt(long index, int value) { VH_preTransform.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR compositeAlphaAt(long index, int value) { VH_compositeAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR presentModeAt(long index, int value) { VH_presentMode.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR clippedAt(long index, int value) { VH_clipped.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR oldSwapchainAt(long index, long value) { VH_oldSwapchain.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR surface(long value) { VH_surface.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR minImageCount(int value) { VH_minImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageFormat(int value) { VH_imageFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageColorSpace(int value) { VH_imageColorSpace.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageExtent$width(int value) { VH_imageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageExtent$height(int value) { VH_imageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageArrayLayers(int value) { VH_imageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageUsage(int value) { VH_imageUsage.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR imageSharingMode(int value) { VH_imageSharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR preTransform(int value) { VH_preTransform.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR compositeAlpha(int value) { VH_compositeAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR presentMode(int value) { VH_presentMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR clipped(int value) { VH_clipped.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCreateInfoKHR oldSwapchain(long value) { VH_oldSwapchain.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSwapchainCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _surfaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_surface, index), LAYOUT_surface); }
    public MemorySegment _surface() { return _surfaceAt(0L); }
    public VkSwapchainCreateInfoKHR _surfaceAt(long index, MemorySegment src) { _surfaceAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _surface(MemorySegment src) { return _surfaceAt(0L, src); }
    public MemorySegment _minImageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImageCount, index), LAYOUT_minImageCount); }
    public MemorySegment _minImageCount() { return _minImageCountAt(0L); }
    public VkSwapchainCreateInfoKHR _minImageCountAt(long index, MemorySegment src) { _minImageCountAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _minImageCount(MemorySegment src) { return _minImageCountAt(0L, src); }
    public MemorySegment _imageFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageFormat, index), LAYOUT_imageFormat); }
    public MemorySegment _imageFormat() { return _imageFormatAt(0L); }
    public VkSwapchainCreateInfoKHR _imageFormatAt(long index, MemorySegment src) { _imageFormatAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _imageFormat(MemorySegment src) { return _imageFormatAt(0L, src); }
    public MemorySegment _imageColorSpaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageColorSpace, index), LAYOUT_imageColorSpace); }
    public MemorySegment _imageColorSpace() { return _imageColorSpaceAt(0L); }
    public VkSwapchainCreateInfoKHR _imageColorSpaceAt(long index, MemorySegment src) { _imageColorSpaceAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _imageColorSpace(MemorySegment src) { return _imageColorSpaceAt(0L, src); }
    public MemorySegment _imageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    public MemorySegment _imageExtent() { return _imageExtentAt(0L); }
    public VkSwapchainCreateInfoKHR _imageExtentAt(long index, MemorySegment src) { _imageExtentAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _imageExtent(MemorySegment src) { return _imageExtentAt(0L, src); }
    public MemorySegment _imageArrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageArrayLayers, index), LAYOUT_imageArrayLayers); }
    public MemorySegment _imageArrayLayers() { return _imageArrayLayersAt(0L); }
    public VkSwapchainCreateInfoKHR _imageArrayLayersAt(long index, MemorySegment src) { _imageArrayLayersAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _imageArrayLayers(MemorySegment src) { return _imageArrayLayersAt(0L, src); }
    public MemorySegment _imageUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageUsage, index), LAYOUT_imageUsage); }
    public MemorySegment _imageUsage() { return _imageUsageAt(0L); }
    public VkSwapchainCreateInfoKHR _imageUsageAt(long index, MemorySegment src) { _imageUsageAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _imageUsage(MemorySegment src) { return _imageUsageAt(0L, src); }
    public MemorySegment _imageSharingModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSharingMode, index), LAYOUT_imageSharingMode); }
    public MemorySegment _imageSharingMode() { return _imageSharingModeAt(0L); }
    public VkSwapchainCreateInfoKHR _imageSharingModeAt(long index, MemorySegment src) { _imageSharingModeAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _imageSharingMode(MemorySegment src) { return _imageSharingModeAt(0L, src); }
    public MemorySegment _queueFamilyIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndexCount, index), LAYOUT_queueFamilyIndexCount); }
    public MemorySegment _queueFamilyIndexCount() { return _queueFamilyIndexCountAt(0L); }
    public VkSwapchainCreateInfoKHR _queueFamilyIndexCountAt(long index, MemorySegment src) { _queueFamilyIndexCountAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _queueFamilyIndexCount(MemorySegment src) { return _queueFamilyIndexCountAt(0L, src); }
    public MemorySegment _pQueueFamilyIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueFamilyIndices, index), LAYOUT_pQueueFamilyIndices); }
    public MemorySegment _pQueueFamilyIndices() { return _pQueueFamilyIndicesAt(0L); }
    public VkSwapchainCreateInfoKHR _pQueueFamilyIndicesAt(long index, MemorySegment src) { _pQueueFamilyIndicesAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _pQueueFamilyIndices(MemorySegment src) { return _pQueueFamilyIndicesAt(0L, src); }
    public MemorySegment _preTransformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preTransform, index), LAYOUT_preTransform); }
    public MemorySegment _preTransform() { return _preTransformAt(0L); }
    public VkSwapchainCreateInfoKHR _preTransformAt(long index, MemorySegment src) { _preTransformAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _preTransform(MemorySegment src) { return _preTransformAt(0L, src); }
    public MemorySegment _compositeAlphaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compositeAlpha, index), LAYOUT_compositeAlpha); }
    public MemorySegment _compositeAlpha() { return _compositeAlphaAt(0L); }
    public VkSwapchainCreateInfoKHR _compositeAlphaAt(long index, MemorySegment src) { _compositeAlphaAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _compositeAlpha(MemorySegment src) { return _compositeAlphaAt(0L, src); }
    public MemorySegment _presentModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentMode, index), LAYOUT_presentMode); }
    public MemorySegment _presentMode() { return _presentModeAt(0L); }
    public VkSwapchainCreateInfoKHR _presentModeAt(long index, MemorySegment src) { _presentModeAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _presentMode(MemorySegment src) { return _presentModeAt(0L, src); }
    public MemorySegment _clippedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clipped, index), LAYOUT_clipped); }
    public MemorySegment _clipped() { return _clippedAt(0L); }
    public VkSwapchainCreateInfoKHR _clippedAt(long index, MemorySegment src) { _clippedAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _clipped(MemorySegment src) { return _clippedAt(0L, src); }
    public MemorySegment _oldSwapchainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_oldSwapchain, index), LAYOUT_oldSwapchain); }
    public MemorySegment _oldSwapchain() { return _oldSwapchainAt(0L); }
    public VkSwapchainCreateInfoKHR _oldSwapchainAt(long index, MemorySegment src) { _oldSwapchainAt(index).copyFrom(src); return this; }
    public VkSwapchainCreateInfoKHR _oldSwapchain(MemorySegment src) { return _oldSwapchainAt(0L, src); }
}
