// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupPresentCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupPresentCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t presentMask[VK_MAX_DEVICE_GROUP_SIZE];
///     VkDeviceGroupPresentModeFlagsKHR modes;
/// }
/// ```
public final class VkDeviceGroupPresentCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK11.VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.JAVA_INT).withName("presentMask"),
        ValueLayout.JAVA_INT.withName("modes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentMask = LAYOUT.byteOffset(PathElement.groupElement("presentMask"));
    public static final long OFFSET_modes = LAYOUT.byteOffset(PathElement.groupElement("modes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentMask = LAYOUT.select(PathElement.groupElement("presentMask"));
    public static final MemoryLayout LAYOUT_modes = LAYOUT.select(PathElement.groupElement("modes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMask"), PathElement.sequenceElement());
    public static final VarHandle VH_modes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modes"));

    public VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupPresentCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupPresentCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupPresentCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupPresentCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupPresentCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupPresentCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupPresentCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupPresentCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR); }
    public static VkDeviceGroupPresentCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR);
        return s;
    }
    public VkDeviceGroupPresentCapabilitiesKHR copyFrom(VkDeviceGroupPresentCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR reinterpret(long count) { return new VkDeviceGroupPresentCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupPresentCapabilitiesKHR asSlice(long index) { return new VkDeviceGroupPresentCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupPresentCapabilitiesKHR asSlice(long index, long count) { return new VkDeviceGroupPresentCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupPresentCapabilitiesKHR at(long index, Consumer<VkDeviceGroupPresentCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentMaskAt(long index, long index0) { return (int) VH_presentMask.get(this.segment(), 0L, index, index0); }
    public int modesAt(long index) { return (int) VH_modes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentMask(long index0) { return (int) VH_presentMask.get(this.segment(), 0L, 0L, index0); }
    public int modes() { return (int) VH_modes.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupPresentCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR presentMaskAt(long index, long index0, int value) { VH_presentMask.set(this.segment(), 0L, index, index0, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR modesAt(long index, int value) { VH_modes.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR presentMask(long index0, int value) { VH_presentMask.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR modes(int value) { VH_modes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupPresentCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupPresentCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentMask, index), LAYOUT_presentMask); }
    public MemorySegment _presentMask() { return _presentMaskAt(0L); }
    public VkDeviceGroupPresentCapabilitiesKHR _presentMaskAt(long index, MemorySegment src) { _presentMaskAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR _presentMask(MemorySegment src) { return _presentMaskAt(0L, src); }
    public MemorySegment _modesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_modes, index), LAYOUT_modes); }
    public MemorySegment _modes() { return _modesAt(0L); }
    public VkDeviceGroupPresentCapabilitiesKHR _modesAt(long index, MemorySegment src) { _modesAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentCapabilitiesKHR _modes(MemorySegment src) { return _modesAt(0L, src); }
}
