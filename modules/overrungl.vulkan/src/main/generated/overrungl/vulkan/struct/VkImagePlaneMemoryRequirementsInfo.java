// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImagePlaneMemoryRequirementsInfo`.
/// ## Layout
/// ```
/// struct VkImagePlaneMemoryRequirementsInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageAspectFlagBits planeAspect;
/// }
/// ```
public final class VkImagePlaneMemoryRequirementsInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("planeAspect")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_planeAspect = LAYOUT.byteOffset(PathElement.groupElement("planeAspect"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_planeAspect = LAYOUT.select(PathElement.groupElement("planeAspect"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_planeAspect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeAspect"));

    public VkImagePlaneMemoryRequirementsInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImagePlaneMemoryRequirementsInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePlaneMemoryRequirementsInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkImagePlaneMemoryRequirementsInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePlaneMemoryRequirementsInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImagePlaneMemoryRequirementsInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePlaneMemoryRequirementsInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImagePlaneMemoryRequirementsInfo alloc(SegmentAllocator allocator) { return new VkImagePlaneMemoryRequirementsInfo(allocator.allocate(LAYOUT), 1); }
    public static VkImagePlaneMemoryRequirementsInfo alloc(SegmentAllocator allocator, long count) { return new VkImagePlaneMemoryRequirementsInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkImagePlaneMemoryRequirementsInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO); }
    public static VkImagePlaneMemoryRequirementsInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO);
        return s;
    }
    public VkImagePlaneMemoryRequirementsInfo copyFrom(VkImagePlaneMemoryRequirementsInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImagePlaneMemoryRequirementsInfo reinterpret(long count) { return new VkImagePlaneMemoryRequirementsInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImagePlaneMemoryRequirementsInfo asSlice(long index) { return new VkImagePlaneMemoryRequirementsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImagePlaneMemoryRequirementsInfo asSlice(long index, long count) { return new VkImagePlaneMemoryRequirementsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImagePlaneMemoryRequirementsInfo at(long index, Consumer<VkImagePlaneMemoryRequirementsInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int planeAspectAt(long index) { return (int) VH_planeAspect.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int planeAspect() { return (int) VH_planeAspect.get(this.segment(), 0L, 0L); }
    public VkImagePlaneMemoryRequirementsInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImagePlaneMemoryRequirementsInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImagePlaneMemoryRequirementsInfo planeAspectAt(long index, int value) { VH_planeAspect.set(this.segment(), 0L, index, value); return this; }
    public VkImagePlaneMemoryRequirementsInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImagePlaneMemoryRequirementsInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImagePlaneMemoryRequirementsInfo planeAspect(int value) { VH_planeAspect.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImagePlaneMemoryRequirementsInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImagePlaneMemoryRequirementsInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImagePlaneMemoryRequirementsInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImagePlaneMemoryRequirementsInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _planeAspectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_planeAspect, index), LAYOUT_planeAspect); }
    public MemorySegment _planeAspect() { return _planeAspectAt(0L); }
    public VkImagePlaneMemoryRequirementsInfo _planeAspectAt(long index, MemorySegment src) { _planeAspectAt(index).copyFrom(src); return this; }
    public VkImagePlaneMemoryRequirementsInfo _planeAspect(MemorySegment src) { return _planeAspectAt(0L, src); }
}
