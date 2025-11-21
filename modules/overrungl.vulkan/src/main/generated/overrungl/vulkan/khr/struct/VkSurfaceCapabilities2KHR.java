// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceCapabilities2KHR`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilities2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkSurfaceCapabilitiesKHR surfaceCapabilities;
/// }
/// ```
public final class VkSurfaceCapabilities2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkSurfaceCapabilitiesKHR.LAYOUT.withName("surfaceCapabilities")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_surfaceCapabilities = LAYOUT.byteOffset(PathElement.groupElement("surfaceCapabilities"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_surfaceCapabilities = LAYOUT.select(PathElement.groupElement("surfaceCapabilities"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_surfaceCapabilities$minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("minImageCount"));
    public static final VarHandle VH_surfaceCapabilities$maxImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("maxImageCount"));
    public static final VarHandle VH_surfaceCapabilities$currentExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("currentExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_surfaceCapabilities$currentExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("currentExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_surfaceCapabilities$minImageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("minImageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_surfaceCapabilities$minImageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("minImageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_surfaceCapabilities$maxImageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("maxImageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_surfaceCapabilities$maxImageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("maxImageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_surfaceCapabilities$maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("maxImageArrayLayers"));
    public static final VarHandle VH_surfaceCapabilities$supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("supportedTransforms"));
    public static final VarHandle VH_surfaceCapabilities$currentTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("currentTransform"));
    public static final VarHandle VH_surfaceCapabilities$supportedCompositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("supportedCompositeAlpha"));
    public static final VarHandle VH_surfaceCapabilities$supportedUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCapabilities"), PathElement.groupElement("supportedUsageFlags"));

    public VkSurfaceCapabilities2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceCapabilities2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceCapabilities2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceCapabilities2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceCapabilities2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilities2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceCapabilities2KHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilities2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceCapabilities2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR); }
    public static VkSurfaceCapabilities2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR);
        return s;
    }
    public VkSurfaceCapabilities2KHR copyFrom(VkSurfaceCapabilities2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceCapabilities2KHR reinterpret(long count) { return new VkSurfaceCapabilities2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceCapabilities2KHR asSlice(long index) { return new VkSurfaceCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceCapabilities2KHR asSlice(long index, long count) { return new VkSurfaceCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceCapabilities2KHR at(long index, Consumer<VkSurfaceCapabilities2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$minImageCountAt(long index) { return (int) VH_surfaceCapabilities$minImageCount.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$maxImageCountAt(long index) { return (int) VH_surfaceCapabilities$maxImageCount.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$currentExtent$widthAt(long index) { return (int) VH_surfaceCapabilities$currentExtent$width.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$currentExtent$heightAt(long index) { return (int) VH_surfaceCapabilities$currentExtent$height.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$minImageExtent$widthAt(long index) { return (int) VH_surfaceCapabilities$minImageExtent$width.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$minImageExtent$heightAt(long index) { return (int) VH_surfaceCapabilities$minImageExtent$height.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$maxImageExtent$widthAt(long index) { return (int) VH_surfaceCapabilities$maxImageExtent$width.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$maxImageExtent$heightAt(long index) { return (int) VH_surfaceCapabilities$maxImageExtent$height.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$maxImageArrayLayersAt(long index) { return (int) VH_surfaceCapabilities$maxImageArrayLayers.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$supportedTransformsAt(long index) { return (int) VH_surfaceCapabilities$supportedTransforms.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$currentTransformAt(long index) { return (int) VH_surfaceCapabilities$currentTransform.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$supportedCompositeAlphaAt(long index) { return (int) VH_surfaceCapabilities$supportedCompositeAlpha.get(this.segment(), 0L, index); }
    public int surfaceCapabilities$supportedUsageFlagsAt(long index) { return (int) VH_surfaceCapabilities$supportedUsageFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$minImageCount() { return (int) VH_surfaceCapabilities$minImageCount.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$maxImageCount() { return (int) VH_surfaceCapabilities$maxImageCount.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$currentExtent$width() { return (int) VH_surfaceCapabilities$currentExtent$width.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$currentExtent$height() { return (int) VH_surfaceCapabilities$currentExtent$height.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$minImageExtent$width() { return (int) VH_surfaceCapabilities$minImageExtent$width.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$minImageExtent$height() { return (int) VH_surfaceCapabilities$minImageExtent$height.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$maxImageExtent$width() { return (int) VH_surfaceCapabilities$maxImageExtent$width.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$maxImageExtent$height() { return (int) VH_surfaceCapabilities$maxImageExtent$height.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$maxImageArrayLayers() { return (int) VH_surfaceCapabilities$maxImageArrayLayers.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$supportedTransforms() { return (int) VH_surfaceCapabilities$supportedTransforms.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$currentTransform() { return (int) VH_surfaceCapabilities$currentTransform.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$supportedCompositeAlpha() { return (int) VH_surfaceCapabilities$supportedCompositeAlpha.get(this.segment(), 0L, 0L); }
    public int surfaceCapabilities$supportedUsageFlags() { return (int) VH_surfaceCapabilities$supportedUsageFlags.get(this.segment(), 0L, 0L); }
    public VkSurfaceCapabilities2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$minImageCountAt(long index, int value) { VH_surfaceCapabilities$minImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageCountAt(long index, int value) { VH_surfaceCapabilities$maxImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$currentExtent$widthAt(long index, int value) { VH_surfaceCapabilities$currentExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$currentExtent$heightAt(long index, int value) { VH_surfaceCapabilities$currentExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$minImageExtent$widthAt(long index, int value) { VH_surfaceCapabilities$minImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$minImageExtent$heightAt(long index, int value) { VH_surfaceCapabilities$minImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageExtent$widthAt(long index, int value) { VH_surfaceCapabilities$maxImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageExtent$heightAt(long index, int value) { VH_surfaceCapabilities$maxImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageArrayLayersAt(long index, int value) { VH_surfaceCapabilities$maxImageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$supportedTransformsAt(long index, int value) { VH_surfaceCapabilities$supportedTransforms.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$currentTransformAt(long index, int value) { VH_surfaceCapabilities$currentTransform.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$supportedCompositeAlphaAt(long index, int value) { VH_surfaceCapabilities$supportedCompositeAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$supportedUsageFlagsAt(long index, int value) { VH_surfaceCapabilities$supportedUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$minImageCount(int value) { VH_surfaceCapabilities$minImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageCount(int value) { VH_surfaceCapabilities$maxImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$currentExtent$width(int value) { VH_surfaceCapabilities$currentExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$currentExtent$height(int value) { VH_surfaceCapabilities$currentExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$minImageExtent$width(int value) { VH_surfaceCapabilities$minImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$minImageExtent$height(int value) { VH_surfaceCapabilities$minImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageExtent$width(int value) { VH_surfaceCapabilities$maxImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageExtent$height(int value) { VH_surfaceCapabilities$maxImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$maxImageArrayLayers(int value) { VH_surfaceCapabilities$maxImageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$supportedTransforms(int value) { VH_surfaceCapabilities$supportedTransforms.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$currentTransform(int value) { VH_surfaceCapabilities$currentTransform.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$supportedCompositeAlpha(int value) { VH_surfaceCapabilities$supportedCompositeAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2KHR surfaceCapabilities$supportedUsageFlags(int value) { VH_surfaceCapabilities$supportedUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceCapabilities2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceCapabilities2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _surfaceCapabilitiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_surfaceCapabilities, index), LAYOUT_surfaceCapabilities); }
    public MemorySegment _surfaceCapabilities() { return _surfaceCapabilitiesAt(0L); }
    public VkSurfaceCapabilities2KHR _surfaceCapabilitiesAt(long index, MemorySegment src) { _surfaceCapabilitiesAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2KHR _surfaceCapabilities(MemorySegment src) { return _surfaceCapabilitiesAt(0L, src); }
}
