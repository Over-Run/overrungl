// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupRenderPassBeginInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupRenderPassBeginInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceMask;
///     uint32_t deviceRenderAreaCount;
///     const VkRect2D* pDeviceRenderAreas;
/// }
/// ```
public final class VkDeviceGroupRenderPassBeginInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask"),
        ValueLayout.JAVA_INT.withName("deviceRenderAreaCount"),
        ValueLayout.ADDRESS.withName("pDeviceRenderAreas")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    public static final long OFFSET_deviceRenderAreaCount = LAYOUT.byteOffset(PathElement.groupElement("deviceRenderAreaCount"));
    public static final long OFFSET_pDeviceRenderAreas = LAYOUT.byteOffset(PathElement.groupElement("pDeviceRenderAreas"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    public static final MemoryLayout LAYOUT_deviceRenderAreaCount = LAYOUT.select(PathElement.groupElement("deviceRenderAreaCount"));
    public static final MemoryLayout LAYOUT_pDeviceRenderAreas = LAYOUT.select(PathElement.groupElement("pDeviceRenderAreas"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));
    public static final VarHandle VH_deviceRenderAreaCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceRenderAreaCount"));
    public static final VarHandle VH_pDeviceRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceRenderAreas"));

    public VkDeviceGroupRenderPassBeginInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupRenderPassBeginInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupRenderPassBeginInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupRenderPassBeginInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupRenderPassBeginInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupRenderPassBeginInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupRenderPassBeginInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupRenderPassBeginInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupRenderPassBeginInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO); }
    public static VkDeviceGroupRenderPassBeginInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO);
        return s;
    }
    public VkDeviceGroupRenderPassBeginInfoKHR copyFrom(VkDeviceGroupRenderPassBeginInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR reinterpret(long count) { return new VkDeviceGroupRenderPassBeginInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupRenderPassBeginInfoKHR asSlice(long index) { return new VkDeviceGroupRenderPassBeginInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupRenderPassBeginInfoKHR asSlice(long index, long count) { return new VkDeviceGroupRenderPassBeginInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupRenderPassBeginInfoKHR at(long index, Consumer<VkDeviceGroupRenderPassBeginInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceMaskAt(long index) { return (int) VH_deviceMask.get(this.segment(), 0L, index); }
    public int deviceRenderAreaCountAt(long index) { return (int) VH_deviceRenderAreaCount.get(this.segment(), 0L, index); }
    public MemorySegment pDeviceRenderAreasAt(long index) { return (MemorySegment) VH_pDeviceRenderAreas.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceMask() { return (int) VH_deviceMask.get(this.segment(), 0L, 0L); }
    public int deviceRenderAreaCount() { return (int) VH_deviceRenderAreaCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDeviceRenderAreas() { return (MemorySegment) VH_pDeviceRenderAreas.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupRenderPassBeginInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR deviceMaskAt(long index, int value) { VH_deviceMask.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR deviceRenderAreaCountAt(long index, int value) { VH_deviceRenderAreaCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR pDeviceRenderAreasAt(long index, MemorySegment value) { VH_pDeviceRenderAreas.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR deviceMask(int value) { VH_deviceMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR deviceRenderAreaCount(int value) { VH_deviceRenderAreaCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR pDeviceRenderAreas(MemorySegment value) { VH_pDeviceRenderAreas.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupRenderPassBeginInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupRenderPassBeginInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceMask, index), LAYOUT_deviceMask); }
    public MemorySegment _deviceMask() { return _deviceMaskAt(0L); }
    public VkDeviceGroupRenderPassBeginInfoKHR _deviceMaskAt(long index, MemorySegment src) { _deviceMaskAt(index).copyFrom(src); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR _deviceMask(MemorySegment src) { return _deviceMaskAt(0L, src); }
    public MemorySegment _deviceRenderAreaCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceRenderAreaCount, index), LAYOUT_deviceRenderAreaCount); }
    public MemorySegment _deviceRenderAreaCount() { return _deviceRenderAreaCountAt(0L); }
    public VkDeviceGroupRenderPassBeginInfoKHR _deviceRenderAreaCountAt(long index, MemorySegment src) { _deviceRenderAreaCountAt(index).copyFrom(src); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR _deviceRenderAreaCount(MemorySegment src) { return _deviceRenderAreaCountAt(0L, src); }
    public MemorySegment _pDeviceRenderAreasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDeviceRenderAreas, index), LAYOUT_pDeviceRenderAreas); }
    public MemorySegment _pDeviceRenderAreas() { return _pDeviceRenderAreasAt(0L); }
    public VkDeviceGroupRenderPassBeginInfoKHR _pDeviceRenderAreasAt(long index, MemorySegment src) { _pDeviceRenderAreasAt(index).copyFrom(src); return this; }
    public VkDeviceGroupRenderPassBeginInfoKHR _pDeviceRenderAreas(MemorySegment src) { return _pDeviceRenderAreasAt(0L, src); }
}
