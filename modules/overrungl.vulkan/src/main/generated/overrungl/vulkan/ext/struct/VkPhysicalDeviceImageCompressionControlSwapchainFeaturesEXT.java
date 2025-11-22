// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 imageCompressionControlSwapchain;
/// }
/// ```
public final class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionControlSwapchain")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageCompressionControlSwapchain = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionControlSwapchain"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageCompressionControlSwapchain = LAYOUT.select(PathElement.groupElement("imageCompressionControlSwapchain"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageCompressionControlSwapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionControlSwapchain"));

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageCompressionControlSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT); }
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageCompressionControlSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT copyFrom(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageCompressionControlSwapchainAt(long index) { return (int) VH_imageCompressionControlSwapchain.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageCompressionControlSwapchain() { return (int) VH_imageCompressionControlSwapchain.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchainAt(long index, int value) { VH_imageCompressionControlSwapchain.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchain(int value) { VH_imageCompressionControlSwapchain.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageCompressionControlSwapchainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCompressionControlSwapchain, index), LAYOUT_imageCompressionControlSwapchain); }
    public MemorySegment _imageCompressionControlSwapchain() { return _imageCompressionControlSwapchainAt(0L); }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT _imageCompressionControlSwapchainAt(long index, MemorySegment src) { _imageCompressionControlSwapchainAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT _imageCompressionControlSwapchain(MemorySegment src) { return _imageCompressionControlSwapchainAt(0L, src); }
}
