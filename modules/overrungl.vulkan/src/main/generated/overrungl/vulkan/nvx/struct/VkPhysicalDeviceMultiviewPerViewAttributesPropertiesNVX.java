// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 perViewPositionAllComponents;
/// }
/// ```
public final class VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewPositionAllComponents")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_perViewPositionAllComponents = LAYOUT.byteOffset(PathElement.groupElement("perViewPositionAllComponents"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_perViewPositionAllComponents = LAYOUT.select(PathElement.groupElement("perViewPositionAllComponents"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_perViewPositionAllComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewPositionAllComponents"));

    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nvx.VKNVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX); }
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nvx.VKNVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX);
        return s;
    }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX copyFrom(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX reinterpret(long count) { return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX asSlice(long index) { return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX at(long index, Consumer<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int perViewPositionAllComponentsAt(long index) { return (int) VH_perViewPositionAllComponents.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int perViewPositionAllComponents() { return (int) VH_perViewPositionAllComponents.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX perViewPositionAllComponentsAt(long index, int value) { VH_perViewPositionAllComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX perViewPositionAllComponents(int value) { VH_perViewPositionAllComponents.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _perViewPositionAllComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_perViewPositionAllComponents, index), LAYOUT_perViewPositionAllComponents); }
    public MemorySegment _perViewPositionAllComponents() { return _perViewPositionAllComponentsAt(0L); }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX _perViewPositionAllComponentsAt(long index, MemorySegment src) { _perViewPositionAllComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX _perViewPositionAllComponents(MemorySegment src) { return _perViewPositionAllComponentsAt(0L, src); }
}
