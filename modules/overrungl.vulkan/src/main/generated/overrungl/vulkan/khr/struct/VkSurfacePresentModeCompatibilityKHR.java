// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfacePresentModeCompatibilityKHR`.
/// ## Layout
/// ```
/// struct VkSurfacePresentModeCompatibilityKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t presentModeCount;
///     VkPresentModeKHR* pPresentModes;
/// }
/// ```
public final class VkSurfacePresentModeCompatibilityKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentModeCount = LAYOUT.byteOffset(PathElement.groupElement("presentModeCount"));
    public static final long OFFSET_pPresentModes = LAYOUT.byteOffset(PathElement.groupElement("pPresentModes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentModeCount = LAYOUT.select(PathElement.groupElement("presentModeCount"));
    public static final MemoryLayout LAYOUT_pPresentModes = LAYOUT.select(PathElement.groupElement("pPresentModes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentModeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentModeCount"));
    public static final VarHandle VH_pPresentModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes"));

    public VkSurfacePresentModeCompatibilityKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfacePresentModeCompatibilityKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfacePresentModeCompatibilityKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfacePresentModeCompatibilityKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfacePresentModeCompatibilityKHR alloc(SegmentAllocator allocator) { return new VkSurfacePresentModeCompatibilityKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfacePresentModeCompatibilityKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentModeCompatibilityKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfacePresentModeCompatibilityKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR); }
    public static VkSurfacePresentModeCompatibilityKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR);
        return s;
    }
    public VkSurfacePresentModeCompatibilityKHR copyFrom(VkSurfacePresentModeCompatibilityKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfacePresentModeCompatibilityKHR reinterpret(long count) { return new VkSurfacePresentModeCompatibilityKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfacePresentModeCompatibilityKHR asSlice(long index) { return new VkSurfacePresentModeCompatibilityKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfacePresentModeCompatibilityKHR asSlice(long index, long count) { return new VkSurfacePresentModeCompatibilityKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfacePresentModeCompatibilityKHR at(long index, Consumer<VkSurfacePresentModeCompatibilityKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentModeCountAt(long index) { return (int) VH_presentModeCount.get(this.segment(), 0L, index); }
    public MemorySegment pPresentModesAt(long index) { return (MemorySegment) VH_pPresentModes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentModeCount() { return (int) VH_presentModeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPresentModes() { return (MemorySegment) VH_pPresentModes.get(this.segment(), 0L, 0L); }
    public VkSurfacePresentModeCompatibilityKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR presentModeCountAt(long index, int value) { VH_presentModeCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR pPresentModesAt(long index, MemorySegment value) { VH_pPresentModes.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR presentModeCount(int value) { VH_presentModeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentModeCompatibilityKHR pPresentModes(MemorySegment value) { VH_pPresentModes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfacePresentModeCompatibilityKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeCompatibilityKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfacePresentModeCompatibilityKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeCompatibilityKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentModeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentModeCount, index), LAYOUT_presentModeCount); }
    public MemorySegment _presentModeCount() { return _presentModeCountAt(0L); }
    public VkSurfacePresentModeCompatibilityKHR _presentModeCountAt(long index, MemorySegment src) { _presentModeCountAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeCompatibilityKHR _presentModeCount(MemorySegment src) { return _presentModeCountAt(0L, src); }
    public MemorySegment _pPresentModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPresentModes, index), LAYOUT_pPresentModes); }
    public MemorySegment _pPresentModes() { return _pPresentModesAt(0L); }
    public VkSurfacePresentModeCompatibilityKHR _pPresentModesAt(long index, MemorySegment src) { _pPresentModesAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeCompatibilityKHR _pPresentModes(MemorySegment src) { return _pPresentModesAt(0L, src); }
}
