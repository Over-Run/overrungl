// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceCapabilitiesPresentId2KHR`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilitiesPresentId2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentId2Supported;
/// }
/// ```
public final class VkSurfaceCapabilitiesPresentId2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentId2Supported")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentId2Supported = LAYOUT.byteOffset(PathElement.groupElement("presentId2Supported"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentId2Supported = LAYOUT.select(PathElement.groupElement("presentId2Supported"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentId2Supported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId2Supported"));

    public VkSurfaceCapabilitiesPresentId2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceCapabilitiesPresentId2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceCapabilitiesPresentId2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceCapabilitiesPresentId2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceCapabilitiesPresentId2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilitiesPresentId2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceCapabilitiesPresentId2KHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilitiesPresentId2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceCapabilitiesPresentId2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPresentId2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR); }
    public static VkSurfaceCapabilitiesPresentId2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPresentId2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR);
        return s;
    }
    public VkSurfaceCapabilitiesPresentId2KHR copyFrom(VkSurfaceCapabilitiesPresentId2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR reinterpret(long count) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceCapabilitiesPresentId2KHR asSlice(long index) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceCapabilitiesPresentId2KHR asSlice(long index, long count) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceCapabilitiesPresentId2KHR at(long index, Consumer<VkSurfaceCapabilitiesPresentId2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentId2SupportedAt(long index) { return (int) VH_presentId2Supported.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentId2Supported() { return (int) VH_presentId2Supported.get(this.segment(), 0L, 0L); }
    public VkSurfaceCapabilitiesPresentId2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR presentId2SupportedAt(long index, int value) { VH_presentId2Supported.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR presentId2Supported(int value) { VH_presentId2Supported.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceCapabilitiesPresentId2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceCapabilitiesPresentId2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentId2SupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentId2Supported, index), LAYOUT_presentId2Supported); }
    public MemorySegment _presentId2Supported() { return _presentId2SupportedAt(0L); }
    public VkSurfaceCapabilitiesPresentId2KHR _presentId2SupportedAt(long index, MemorySegment src) { _presentId2SupportedAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesPresentId2KHR _presentId2Supported(MemorySegment src) { return _presentId2SupportedAt(0L, src); }
}
