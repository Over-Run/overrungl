// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multiviewPerViewViewports;
/// }
/// ```
public final class VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewViewports")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_multiviewPerViewViewports = LAYOUT.byteOffset(PathElement.groupElement("multiviewPerViewViewports"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_multiviewPerViewViewports = LAYOUT.select(PathElement.groupElement("multiviewPerViewViewports"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_multiviewPerViewViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewPerViewViewports"));

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMMultiviewPerViewViewports.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM); }
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMMultiviewPerViewViewports.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM copyFrom(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int multiviewPerViewViewportsAt(long index) { return (int) VH_multiviewPerViewViewports.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int multiviewPerViewViewports() { return (int) VH_multiviewPerViewViewports.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewportsAt(long index, int value) { VH_multiviewPerViewViewports.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewports(int value) { VH_multiviewPerViewViewports.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _multiviewPerViewViewportsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewPerViewViewports, index), LAYOUT_multiviewPerViewViewports); }
    public MemorySegment _multiviewPerViewViewports() { return _multiviewPerViewViewportsAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM _multiviewPerViewViewportsAt(long index, MemorySegment src) { _multiviewPerViewViewportsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM _multiviewPerViewViewports(MemorySegment src) { return _multiviewPerViewViewportsAt(0L, src); }
}
