// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupSubmitInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupSubmitInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const uint32_t* pWaitSemaphoreDeviceIndices;
///     uint32_t commandBufferCount;
///     const uint32_t* pCommandBufferDeviceMasks;
///     uint32_t signalSemaphoreCount;
///     const uint32_t* pSignalSemaphoreDeviceIndices;
/// }
/// ```
public final class VkDeviceGroupSubmitInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreDeviceIndices"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withName("pCommandBufferDeviceMasks"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreDeviceIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_waitSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
    public static final long OFFSET_pWaitSemaphoreDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    public static final long OFFSET_commandBufferCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
    public static final long OFFSET_pCommandBufferDeviceMasks = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferDeviceMasks"));
    public static final long OFFSET_signalSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
    public static final long OFFSET_pSignalSemaphoreDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_waitSemaphoreCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphoreDeviceIndices = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    public static final MemoryLayout LAYOUT_commandBufferCount = LAYOUT.select(PathElement.groupElement("commandBufferCount"));
    public static final MemoryLayout LAYOUT_pCommandBufferDeviceMasks = LAYOUT.select(PathElement.groupElement("pCommandBufferDeviceMasks"));
    public static final MemoryLayout LAYOUT_signalSemaphoreCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pSignalSemaphoreDeviceIndices = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    public static final VarHandle VH_pWaitSemaphoreDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));
    public static final VarHandle VH_pCommandBufferDeviceMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferDeviceMasks"));
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    public static final VarHandle VH_pSignalSemaphoreDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));

    public VkDeviceGroupSubmitInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupSubmitInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupSubmitInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupSubmitInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSubmitInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupSubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupSubmitInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupSubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupSubmitInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupSubmitInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
    public static VkDeviceGroupSubmitInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO);
        return s;
    }
    public VkDeviceGroupSubmitInfoKHR copyFrom(VkDeviceGroupSubmitInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupSubmitInfoKHR reinterpret(long count) { return new VkDeviceGroupSubmitInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupSubmitInfoKHR asSlice(long index) { return new VkDeviceGroupSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupSubmitInfoKHR asSlice(long index, long count) { return new VkDeviceGroupSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupSubmitInfoKHR at(long index, Consumer<VkDeviceGroupSubmitInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int waitSemaphoreCountAt(long index) { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoreDeviceIndicesAt(long index) { return (MemorySegment) VH_pWaitSemaphoreDeviceIndices.get(this.segment(), 0L, index); }
    public int commandBufferCountAt(long index) { return (int) VH_commandBufferCount.get(this.segment(), 0L, index); }
    public MemorySegment pCommandBufferDeviceMasksAt(long index) { return (MemorySegment) VH_pCommandBufferDeviceMasks.get(this.segment(), 0L, index); }
    public int signalSemaphoreCountAt(long index) { return (int) VH_signalSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pSignalSemaphoreDeviceIndicesAt(long index) { return (MemorySegment) VH_pSignalSemaphoreDeviceIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreCount() { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphoreDeviceIndices() { return (MemorySegment) VH_pWaitSemaphoreDeviceIndices.get(this.segment(), 0L, 0L); }
    public int commandBufferCount() { return (int) VH_commandBufferCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCommandBufferDeviceMasks() { return (MemorySegment) VH_pCommandBufferDeviceMasks.get(this.segment(), 0L, 0L); }
    public int signalSemaphoreCount() { return (int) VH_signalSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSignalSemaphoreDeviceIndices() { return (MemorySegment) VH_pSignalSemaphoreDeviceIndices.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupSubmitInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR waitSemaphoreCountAt(long index, int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pWaitSemaphoreDeviceIndicesAt(long index, MemorySegment value) { VH_pWaitSemaphoreDeviceIndices.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR commandBufferCountAt(long index, int value) { VH_commandBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pCommandBufferDeviceMasksAt(long index, MemorySegment value) { VH_pCommandBufferDeviceMasks.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR signalSemaphoreCountAt(long index, int value) { VH_signalSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pSignalSemaphoreDeviceIndicesAt(long index, MemorySegment value) { VH_pSignalSemaphoreDeviceIndices.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSubmitInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR waitSemaphoreCount(int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pWaitSemaphoreDeviceIndices(MemorySegment value) { VH_pWaitSemaphoreDeviceIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR commandBufferCount(int value) { VH_commandBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pCommandBufferDeviceMasks(MemorySegment value) { VH_pCommandBufferDeviceMasks.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR signalSemaphoreCount(int value) { VH_signalSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSubmitInfoKHR pSignalSemaphoreDeviceIndices(MemorySegment value) { VH_pSignalSemaphoreDeviceIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreCount, index), LAYOUT_waitSemaphoreCount); }
    public MemorySegment _waitSemaphoreCount() { return _waitSemaphoreCountAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _waitSemaphoreCountAt(long index, MemorySegment src) { _waitSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _waitSemaphoreCount(MemorySegment src) { return _waitSemaphoreCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoreDeviceIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphoreDeviceIndices, index), LAYOUT_pWaitSemaphoreDeviceIndices); }
    public MemorySegment _pWaitSemaphoreDeviceIndices() { return _pWaitSemaphoreDeviceIndicesAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _pWaitSemaphoreDeviceIndicesAt(long index, MemorySegment src) { _pWaitSemaphoreDeviceIndicesAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _pWaitSemaphoreDeviceIndices(MemorySegment src) { return _pWaitSemaphoreDeviceIndicesAt(0L, src); }
    public MemorySegment _commandBufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandBufferCount, index), LAYOUT_commandBufferCount); }
    public MemorySegment _commandBufferCount() { return _commandBufferCountAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _commandBufferCountAt(long index, MemorySegment src) { _commandBufferCountAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _commandBufferCount(MemorySegment src) { return _commandBufferCountAt(0L, src); }
    public MemorySegment _pCommandBufferDeviceMasksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCommandBufferDeviceMasks, index), LAYOUT_pCommandBufferDeviceMasks); }
    public MemorySegment _pCommandBufferDeviceMasks() { return _pCommandBufferDeviceMasksAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _pCommandBufferDeviceMasksAt(long index, MemorySegment src) { _pCommandBufferDeviceMasksAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _pCommandBufferDeviceMasks(MemorySegment src) { return _pCommandBufferDeviceMasksAt(0L, src); }
    public MemorySegment _signalSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreCount, index), LAYOUT_signalSemaphoreCount); }
    public MemorySegment _signalSemaphoreCount() { return _signalSemaphoreCountAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _signalSemaphoreCountAt(long index, MemorySegment src) { _signalSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _signalSemaphoreCount(MemorySegment src) { return _signalSemaphoreCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoreDeviceIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphoreDeviceIndices, index), LAYOUT_pSignalSemaphoreDeviceIndices); }
    public MemorySegment _pSignalSemaphoreDeviceIndices() { return _pSignalSemaphoreDeviceIndicesAt(0L); }
    public VkDeviceGroupSubmitInfoKHR _pSignalSemaphoreDeviceIndicesAt(long index, MemorySegment src) { _pSignalSemaphoreDeviceIndicesAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSubmitInfoKHR _pSignalSemaphoreDeviceIndices(MemorySegment src) { return _pSignalSemaphoreDeviceIndicesAt(0L, src); }
}
