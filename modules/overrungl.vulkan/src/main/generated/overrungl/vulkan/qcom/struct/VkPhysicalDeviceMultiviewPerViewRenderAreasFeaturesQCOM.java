// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multiviewPerViewRenderAreas;
/// }
/// ```
public final class VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewRenderAreas")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_multiviewPerViewRenderAreas = LAYOUT.byteOffset(PathElement.groupElement("multiviewPerViewRenderAreas"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_multiviewPerViewRenderAreas = LAYOUT.select(PathElement.groupElement("multiviewPerViewRenderAreas"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_multiviewPerViewRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewPerViewRenderAreas"));

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM); }
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM copyFrom(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int multiviewPerViewRenderAreasAt(long index) { return (int) VH_multiviewPerViewRenderAreas.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int multiviewPerViewRenderAreas() { return (int) VH_multiviewPerViewRenderAreas.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM multiviewPerViewRenderAreasAt(long index, int value) { VH_multiviewPerViewRenderAreas.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM multiviewPerViewRenderAreas(int value) { VH_multiviewPerViewRenderAreas.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _multiviewPerViewRenderAreasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewPerViewRenderAreas, index), LAYOUT_multiviewPerViewRenderAreas); }
    public MemorySegment _multiviewPerViewRenderAreas() { return _multiviewPerViewRenderAreasAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM _multiviewPerViewRenderAreasAt(long index, MemorySegment src) { _multiviewPerViewRenderAreasAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM _multiviewPerViewRenderAreas(MemorySegment src) { return _multiviewPerViewRenderAreasAt(0L, src); }
}
