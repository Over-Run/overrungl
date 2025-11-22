// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 unifiedImageLayouts;
///     VkBool32 unifiedImageLayoutsVideo;
/// }
/// ```
public final class VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unifiedImageLayouts"),
        ValueLayout.JAVA_INT.withName("unifiedImageLayoutsVideo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_unifiedImageLayouts = LAYOUT.byteOffset(PathElement.groupElement("unifiedImageLayouts"));
    public static final long OFFSET_unifiedImageLayoutsVideo = LAYOUT.byteOffset(PathElement.groupElement("unifiedImageLayoutsVideo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_unifiedImageLayouts = LAYOUT.select(PathElement.groupElement("unifiedImageLayouts"));
    public static final MemoryLayout LAYOUT_unifiedImageLayoutsVideo = LAYOUT.select(PathElement.groupElement("unifiedImageLayoutsVideo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_unifiedImageLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unifiedImageLayouts"));
    public static final VarHandle VH_unifiedImageLayoutsVideo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unifiedImageLayoutsVideo"));

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR); }
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR copyFrom(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR at(long index, Consumer<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int unifiedImageLayoutsAt(long index) { return (int) VH_unifiedImageLayouts.get(this.segment(), 0L, index); }
    public int unifiedImageLayoutsVideoAt(long index) { return (int) VH_unifiedImageLayoutsVideo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int unifiedImageLayouts() { return (int) VH_unifiedImageLayouts.get(this.segment(), 0L, 0L); }
    public int unifiedImageLayoutsVideo() { return (int) VH_unifiedImageLayoutsVideo.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsAt(long index, int value) { VH_unifiedImageLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideoAt(long index, int value) { VH_unifiedImageLayoutsVideo.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayouts(int value) { VH_unifiedImageLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideo(int value) { VH_unifiedImageLayoutsVideo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _unifiedImageLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_unifiedImageLayouts, index), LAYOUT_unifiedImageLayouts); }
    public MemorySegment _unifiedImageLayouts() { return _unifiedImageLayoutsAt(0L); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _unifiedImageLayoutsAt(long index, MemorySegment src) { _unifiedImageLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _unifiedImageLayouts(MemorySegment src) { return _unifiedImageLayoutsAt(0L, src); }
    public MemorySegment _unifiedImageLayoutsVideoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_unifiedImageLayoutsVideo, index), LAYOUT_unifiedImageLayoutsVideo); }
    public MemorySegment _unifiedImageLayoutsVideo() { return _unifiedImageLayoutsVideoAt(0L); }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _unifiedImageLayoutsVideoAt(long index, MemorySegment src) { _unifiedImageLayoutsVideoAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR _unifiedImageLayoutsVideo(MemorySegment src) { return _unifiedImageLayoutsVideoAt(0L, src); }
}
