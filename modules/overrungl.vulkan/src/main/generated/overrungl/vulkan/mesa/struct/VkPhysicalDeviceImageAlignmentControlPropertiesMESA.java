// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.mesa.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageAlignmentControlPropertiesMESA`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageAlignmentControlPropertiesMESA {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t supportedImageAlignmentMask;
/// }
/// ```
public final class VkPhysicalDeviceImageAlignmentControlPropertiesMESA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedImageAlignmentMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportedImageAlignmentMask = LAYOUT.byteOffset(PathElement.groupElement("supportedImageAlignmentMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportedImageAlignmentMask = LAYOUT.select(PathElement.groupElement("supportedImageAlignmentMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportedImageAlignmentMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedImageAlignmentMask"));

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.mesa.VKMESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA); }
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.mesa.VKMESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA);
        return s;
    }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA copyFrom(VkPhysicalDeviceImageAlignmentControlPropertiesMESA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA reinterpret(long count) { return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA asSlice(long index) { return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA asSlice(long index, long count) { return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA at(long index, Consumer<VkPhysicalDeviceImageAlignmentControlPropertiesMESA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportedImageAlignmentMaskAt(long index) { return (int) VH_supportedImageAlignmentMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportedImageAlignmentMask() { return (int) VH_supportedImageAlignmentMask.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA supportedImageAlignmentMaskAt(long index, int value) { VH_supportedImageAlignmentMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA supportedImageAlignmentMask(int value) { VH_supportedImageAlignmentMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportedImageAlignmentMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedImageAlignmentMask, index), LAYOUT_supportedImageAlignmentMask); }
    public MemorySegment _supportedImageAlignmentMask() { return _supportedImageAlignmentMaskAt(0L); }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA _supportedImageAlignmentMaskAt(long index, MemorySegment src) { _supportedImageAlignmentMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA _supportedImageAlignmentMask(MemorySegment src) { return _supportedImageAlignmentMaskAt(0L, src); }
}
