// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSharedPresentSurfaceCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkSharedPresentSurfaceCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkImageUsageFlags sharedPresentSupportedUsageFlags;
/// }
/// ```
public final class VkSharedPresentSurfaceCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sharedPresentSupportedUsageFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sharedPresentSupportedUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("sharedPresentSupportedUsageFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sharedPresentSupportedUsageFlags = LAYOUT.select(PathElement.groupElement("sharedPresentSupportedUsageFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sharedPresentSupportedUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedPresentSupportedUsageFlags"));

    public VkSharedPresentSurfaceCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSharedPresentSurfaceCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSharedPresentSurfaceCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSharedPresentSurfaceCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSharedPresentSurfaceCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSharedPresentSurfaceCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSharedPresentSurfaceCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSharedPresentSurfaceCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkSharedPresentSurfaceCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSharedPresentSurfaceCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkSharedPresentSurfaceCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSharedPresentSurfaceCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSharedPresentableImage.VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR); }
    public static VkSharedPresentSurfaceCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSharedPresentableImage.VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR);
        return s;
    }
    public VkSharedPresentSurfaceCapabilitiesKHR copyFrom(VkSharedPresentSurfaceCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR reinterpret(long count) { return new VkSharedPresentSurfaceCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSharedPresentSurfaceCapabilitiesKHR asSlice(long index) { return new VkSharedPresentSurfaceCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSharedPresentSurfaceCapabilitiesKHR asSlice(long index, long count) { return new VkSharedPresentSurfaceCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSharedPresentSurfaceCapabilitiesKHR at(long index, Consumer<VkSharedPresentSurfaceCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sharedPresentSupportedUsageFlagsAt(long index) { return (int) VH_sharedPresentSupportedUsageFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sharedPresentSupportedUsageFlags() { return (int) VH_sharedPresentSupportedUsageFlags.get(this.segment(), 0L, 0L); }
    public VkSharedPresentSurfaceCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR sharedPresentSupportedUsageFlagsAt(long index, int value) { VH_sharedPresentSupportedUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR sharedPresentSupportedUsageFlags(int value) { VH_sharedPresentSupportedUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSharedPresentSurfaceCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSharedPresentSurfaceCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sharedPresentSupportedUsageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharedPresentSupportedUsageFlags, index), LAYOUT_sharedPresentSupportedUsageFlags); }
    public MemorySegment _sharedPresentSupportedUsageFlags() { return _sharedPresentSupportedUsageFlagsAt(0L); }
    public VkSharedPresentSurfaceCapabilitiesKHR _sharedPresentSupportedUsageFlagsAt(long index, MemorySegment src) { _sharedPresentSupportedUsageFlagsAt(index).copyFrom(src); return this; }
    public VkSharedPresentSurfaceCapabilitiesKHR _sharedPresentSupportedUsageFlags(MemorySegment src) { return _sharedPresentSupportedUsageFlagsAt(0L, src); }
}
