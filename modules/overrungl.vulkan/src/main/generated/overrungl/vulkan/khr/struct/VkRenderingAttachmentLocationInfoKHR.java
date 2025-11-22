// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingAttachmentLocationInfoKHR`.
/// ## Layout
/// ```
/// struct VkRenderingAttachmentLocationInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const uint32_t* pColorAttachmentLocations;
/// }
/// ```
public final class VkRenderingAttachmentLocationInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentLocations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachmentLocations = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentLocations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachmentLocations = LAYOUT.select(PathElement.groupElement("pColorAttachmentLocations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachmentLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentLocations"));

    public VkRenderingAttachmentLocationInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingAttachmentLocationInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentLocationInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingAttachmentLocationInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentLocationInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingAttachmentLocationInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentLocationInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingAttachmentLocationInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderingAttachmentLocationInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingAttachmentLocationInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderingAttachmentLocationInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingAttachmentLocationInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO); }
    public static VkRenderingAttachmentLocationInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO);
        return s;
    }
    public VkRenderingAttachmentLocationInfoKHR copyFrom(VkRenderingAttachmentLocationInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingAttachmentLocationInfoKHR reinterpret(long count) { return new VkRenderingAttachmentLocationInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingAttachmentLocationInfoKHR asSlice(long index) { return new VkRenderingAttachmentLocationInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingAttachmentLocationInfoKHR asSlice(long index, long count) { return new VkRenderingAttachmentLocationInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingAttachmentLocationInfoKHR at(long index, Consumer<VkRenderingAttachmentLocationInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentLocationsAt(long index) { return (MemorySegment) VH_pColorAttachmentLocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachmentLocations() { return (MemorySegment) VH_pColorAttachmentLocations.get(this.segment(), 0L, 0L); }
    public VkRenderingAttachmentLocationInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR pColorAttachmentLocationsAt(long index, MemorySegment value) { VH_pColorAttachmentLocations.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentLocationInfoKHR pColorAttachmentLocations(MemorySegment value) { VH_pColorAttachmentLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingAttachmentLocationInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentLocationInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingAttachmentLocationInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentLocationInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkRenderingAttachmentLocationInfoKHR _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentLocationInfoKHR _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachmentLocations, index), LAYOUT_pColorAttachmentLocations); }
    public MemorySegment _pColorAttachmentLocations() { return _pColorAttachmentLocationsAt(0L); }
    public VkRenderingAttachmentLocationInfoKHR _pColorAttachmentLocationsAt(long index, MemorySegment src) { _pColorAttachmentLocationsAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentLocationInfoKHR _pColorAttachmentLocations(MemorySegment src) { return _pColorAttachmentLocationsAt(0L, src); }
}
