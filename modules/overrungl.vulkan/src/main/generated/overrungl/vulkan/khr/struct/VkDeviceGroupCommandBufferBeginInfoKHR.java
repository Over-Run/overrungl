// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupCommandBufferBeginInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupCommandBufferBeginInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceMask;
/// }
/// ```
public final class VkDeviceGroupCommandBufferBeginInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    public VkDeviceGroupCommandBufferBeginInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupCommandBufferBeginInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupCommandBufferBeginInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupCommandBufferBeginInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupCommandBufferBeginInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupCommandBufferBeginInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO); }
    public static VkDeviceGroupCommandBufferBeginInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO);
        return s;
    }
    public VkDeviceGroupCommandBufferBeginInfoKHR copyFrom(VkDeviceGroupCommandBufferBeginInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR reinterpret(long count) { return new VkDeviceGroupCommandBufferBeginInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupCommandBufferBeginInfoKHR asSlice(long index) { return new VkDeviceGroupCommandBufferBeginInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupCommandBufferBeginInfoKHR asSlice(long index, long count) { return new VkDeviceGroupCommandBufferBeginInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupCommandBufferBeginInfoKHR at(long index, Consumer<VkDeviceGroupCommandBufferBeginInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceMaskAt(long index) { return (int) VH_deviceMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceMask() { return (int) VH_deviceMask.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupCommandBufferBeginInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR deviceMaskAt(long index, int value) { VH_deviceMask.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR deviceMask(int value) { VH_deviceMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupCommandBufferBeginInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupCommandBufferBeginInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceMask, index), LAYOUT_deviceMask); }
    public MemorySegment _deviceMask() { return _deviceMaskAt(0L); }
    public VkDeviceGroupCommandBufferBeginInfoKHR _deviceMaskAt(long index, MemorySegment src) { _deviceMaskAt(index).copyFrom(src); return this; }
    public VkDeviceGroupCommandBufferBeginInfoKHR _deviceMask(MemorySegment src) { return _deviceMaskAt(0L, src); }
}
