// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkD3D12FenceSubmitInfoKHR`.
/// ## Layout
/// ```
/// struct VkD3D12FenceSubmitInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreValuesCount;
///     const uint64_t* pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValuesCount;
///     const uint64_t* pSignalSemaphoreValues;
/// }
/// ```
public final class VkD3D12FenceSubmitInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreValues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_waitSemaphoreValuesCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreValuesCount"));
    public static final long OFFSET_pWaitSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreValues"));
    public static final long OFFSET_signalSemaphoreValuesCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreValuesCount"));
    public static final long OFFSET_pSignalSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreValues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_waitSemaphoreValuesCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreValuesCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphoreValues = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreValues"));
    public static final MemoryLayout LAYOUT_signalSemaphoreValuesCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreValuesCount"));
    public static final MemoryLayout LAYOUT_pSignalSemaphoreValues = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreValues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_waitSemaphoreValuesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreValuesCount"));
    public static final VarHandle VH_pWaitSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreValues"));
    public static final VarHandle VH_signalSemaphoreValuesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreValuesCount"));
    public static final VarHandle VH_pSignalSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreValues"));

    public VkD3D12FenceSubmitInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkD3D12FenceSubmitInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkD3D12FenceSubmitInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkD3D12FenceSubmitInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkD3D12FenceSubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkD3D12FenceSubmitInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkD3D12FenceSubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkD3D12FenceSubmitInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkD3D12FenceSubmitInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR); }
    public static VkD3D12FenceSubmitInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR);
        return s;
    }
    public VkD3D12FenceSubmitInfoKHR copyFrom(VkD3D12FenceSubmitInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkD3D12FenceSubmitInfoKHR reinterpret(long count) { return new VkD3D12FenceSubmitInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkD3D12FenceSubmitInfoKHR asSlice(long index) { return new VkD3D12FenceSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkD3D12FenceSubmitInfoKHR asSlice(long index, long count) { return new VkD3D12FenceSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkD3D12FenceSubmitInfoKHR at(long index, Consumer<VkD3D12FenceSubmitInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int waitSemaphoreValuesCountAt(long index) { return (int) VH_waitSemaphoreValuesCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoreValuesAt(long index) { return (MemorySegment) VH_pWaitSemaphoreValues.get(this.segment(), 0L, index); }
    public int signalSemaphoreValuesCountAt(long index) { return (int) VH_signalSemaphoreValuesCount.get(this.segment(), 0L, index); }
    public MemorySegment pSignalSemaphoreValuesAt(long index) { return (MemorySegment) VH_pSignalSemaphoreValues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreValuesCount() { return (int) VH_waitSemaphoreValuesCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphoreValues() { return (MemorySegment) VH_pWaitSemaphoreValues.get(this.segment(), 0L, 0L); }
    public int signalSemaphoreValuesCount() { return (int) VH_signalSemaphoreValuesCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSignalSemaphoreValues() { return (MemorySegment) VH_pSignalSemaphoreValues.get(this.segment(), 0L, 0L); }
    public VkD3D12FenceSubmitInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkD3D12FenceSubmitInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCountAt(long index, int value) { VH_waitSemaphoreValuesCount.set(this.segment(), 0L, index, value); return this; }
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValuesAt(long index, MemorySegment value) { VH_pWaitSemaphoreValues.set(this.segment(), 0L, index, value); return this; }
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCountAt(long index, int value) { VH_signalSemaphoreValuesCount.set(this.segment(), 0L, index, value); return this; }
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValuesAt(long index, MemorySegment value) { VH_pSignalSemaphoreValues.set(this.segment(), 0L, index, value); return this; }
    public VkD3D12FenceSubmitInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkD3D12FenceSubmitInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCount(int value) { VH_waitSemaphoreValuesCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValues(MemorySegment value) { VH_pWaitSemaphoreValues.set(this.segment(), 0L, 0L, value); return this; }
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCount(int value) { VH_signalSemaphoreValuesCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValues(MemorySegment value) { VH_pSignalSemaphoreValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkD3D12FenceSubmitInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkD3D12FenceSubmitInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkD3D12FenceSubmitInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkD3D12FenceSubmitInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreValuesCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreValuesCount, index), LAYOUT_waitSemaphoreValuesCount); }
    public MemorySegment _waitSemaphoreValuesCount() { return _waitSemaphoreValuesCountAt(0L); }
    public VkD3D12FenceSubmitInfoKHR _waitSemaphoreValuesCountAt(long index, MemorySegment src) { _waitSemaphoreValuesCountAt(index).copyFrom(src); return this; }
    public VkD3D12FenceSubmitInfoKHR _waitSemaphoreValuesCount(MemorySegment src) { return _waitSemaphoreValuesCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoreValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphoreValues, index), LAYOUT_pWaitSemaphoreValues); }
    public MemorySegment _pWaitSemaphoreValues() { return _pWaitSemaphoreValuesAt(0L); }
    public VkD3D12FenceSubmitInfoKHR _pWaitSemaphoreValuesAt(long index, MemorySegment src) { _pWaitSemaphoreValuesAt(index).copyFrom(src); return this; }
    public VkD3D12FenceSubmitInfoKHR _pWaitSemaphoreValues(MemorySegment src) { return _pWaitSemaphoreValuesAt(0L, src); }
    public MemorySegment _signalSemaphoreValuesCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreValuesCount, index), LAYOUT_signalSemaphoreValuesCount); }
    public MemorySegment _signalSemaphoreValuesCount() { return _signalSemaphoreValuesCountAt(0L); }
    public VkD3D12FenceSubmitInfoKHR _signalSemaphoreValuesCountAt(long index, MemorySegment src) { _signalSemaphoreValuesCountAt(index).copyFrom(src); return this; }
    public VkD3D12FenceSubmitInfoKHR _signalSemaphoreValuesCount(MemorySegment src) { return _signalSemaphoreValuesCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoreValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphoreValues, index), LAYOUT_pSignalSemaphoreValues); }
    public MemorySegment _pSignalSemaphoreValues() { return _pSignalSemaphoreValuesAt(0L); }
    public VkD3D12FenceSubmitInfoKHR _pSignalSemaphoreValuesAt(long index, MemorySegment src) { _pSignalSemaphoreValuesAt(index).copyFrom(src); return this; }
    public VkD3D12FenceSubmitInfoKHR _pSignalSemaphoreValues(MemorySegment src) { return _pSignalSemaphoreValuesAt(0L, src); }
}
