// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfacePresentModeKHR`.
/// ## Layout
/// ```
/// struct VkSurfacePresentModeKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPresentModeKHR presentMode;
/// }
/// ```
public final class VkSurfacePresentModeKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentMode = LAYOUT.byteOffset(PathElement.groupElement("presentMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentMode = LAYOUT.select(PathElement.groupElement("presentMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMode"));

    public VkSurfacePresentModeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfacePresentModeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfacePresentModeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfacePresentModeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfacePresentModeKHR alloc(SegmentAllocator allocator) { return new VkSurfacePresentModeKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfacePresentModeKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentModeKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfacePresentModeKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR); }
    public static VkSurfacePresentModeKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR);
        return s;
    }
    public VkSurfacePresentModeKHR copyFrom(VkSurfacePresentModeKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfacePresentModeKHR reinterpret(long count) { return new VkSurfacePresentModeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfacePresentModeKHR asSlice(long index) { return new VkSurfacePresentModeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfacePresentModeKHR asSlice(long index, long count) { return new VkSurfacePresentModeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfacePresentModeKHR at(long index, Consumer<VkSurfacePresentModeKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentModeAt(long index) { return (int) VH_presentMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentMode() { return (int) VH_presentMode.get(this.segment(), 0L, 0L); }
    public VkSurfacePresentModeKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeKHR presentModeAt(long index, int value) { VH_presentMode.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentModeKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentModeKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentModeKHR presentMode(int value) { VH_presentMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfacePresentModeKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfacePresentModeKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentMode, index), LAYOUT_presentMode); }
    public MemorySegment _presentMode() { return _presentModeAt(0L); }
    public VkSurfacePresentModeKHR _presentModeAt(long index, MemorySegment src) { _presentModeAt(index).copyFrom(src); return this; }
    public VkSurfacePresentModeKHR _presentMode(MemorySegment src) { return _presentModeAt(0L, src); }
}
