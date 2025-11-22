// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTimelineSemaphoreSubmitInfoKHR`.
/// ## Layout
/// ```
/// struct VkTimelineSemaphoreSubmitInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreValueCount;
///     const uint64_t* pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValueCount;
///     const uint64_t* pSignalSemaphoreValues;
/// }
/// ```
public final class VkTimelineSemaphoreSubmitInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValueCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValueCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreValues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_waitSemaphoreValueCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreValueCount"));
    public static final long OFFSET_pWaitSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreValues"));
    public static final long OFFSET_signalSemaphoreValueCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreValueCount"));
    public static final long OFFSET_pSignalSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreValues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_waitSemaphoreValueCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreValueCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphoreValues = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreValues"));
    public static final MemoryLayout LAYOUT_signalSemaphoreValueCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreValueCount"));
    public static final MemoryLayout LAYOUT_pSignalSemaphoreValues = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreValues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_waitSemaphoreValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreValueCount"));
    public static final VarHandle VH_pWaitSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreValues"));
    public static final VarHandle VH_signalSemaphoreValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreValueCount"));
    public static final VarHandle VH_pSignalSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreValues"));

    public VkTimelineSemaphoreSubmitInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTimelineSemaphoreSubmitInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkTimelineSemaphoreSubmitInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTimelineSemaphoreSubmitInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTimelineSemaphoreSubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkTimelineSemaphoreSubmitInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkTimelineSemaphoreSubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkTimelineSemaphoreSubmitInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkTimelineSemaphoreSubmitInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
    public static VkTimelineSemaphoreSubmitInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO);
        return s;
    }
    public VkTimelineSemaphoreSubmitInfoKHR copyFrom(VkTimelineSemaphoreSubmitInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR reinterpret(long count) { return new VkTimelineSemaphoreSubmitInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTimelineSemaphoreSubmitInfoKHR asSlice(long index) { return new VkTimelineSemaphoreSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTimelineSemaphoreSubmitInfoKHR asSlice(long index, long count) { return new VkTimelineSemaphoreSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTimelineSemaphoreSubmitInfoKHR at(long index, Consumer<VkTimelineSemaphoreSubmitInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int waitSemaphoreValueCountAt(long index) { return (int) VH_waitSemaphoreValueCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoreValuesAt(long index) { return (MemorySegment) VH_pWaitSemaphoreValues.get(this.segment(), 0L, index); }
    public int signalSemaphoreValueCountAt(long index) { return (int) VH_signalSemaphoreValueCount.get(this.segment(), 0L, index); }
    public MemorySegment pSignalSemaphoreValuesAt(long index) { return (MemorySegment) VH_pSignalSemaphoreValues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreValueCount() { return (int) VH_waitSemaphoreValueCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphoreValues() { return (MemorySegment) VH_pWaitSemaphoreValues.get(this.segment(), 0L, 0L); }
    public int signalSemaphoreValueCount() { return (int) VH_signalSemaphoreValueCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSignalSemaphoreValues() { return (MemorySegment) VH_pSignalSemaphoreValues.get(this.segment(), 0L, 0L); }
    public VkTimelineSemaphoreSubmitInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR waitSemaphoreValueCountAt(long index, int value) { VH_waitSemaphoreValueCount.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR pWaitSemaphoreValuesAt(long index, MemorySegment value) { VH_pWaitSemaphoreValues.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR signalSemaphoreValueCountAt(long index, int value) { VH_signalSemaphoreValueCount.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR pSignalSemaphoreValuesAt(long index, MemorySegment value) { VH_pSignalSemaphoreValues.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR waitSemaphoreValueCount(int value) { VH_waitSemaphoreValueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR pWaitSemaphoreValues(MemorySegment value) { VH_pWaitSemaphoreValues.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR signalSemaphoreValueCount(int value) { VH_signalSemaphoreValueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR pSignalSemaphoreValues(MemorySegment value) { VH_pSignalSemaphoreValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTimelineSemaphoreSubmitInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTimelineSemaphoreSubmitInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreValueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreValueCount, index), LAYOUT_waitSemaphoreValueCount); }
    public MemorySegment _waitSemaphoreValueCount() { return _waitSemaphoreValueCountAt(0L); }
    public VkTimelineSemaphoreSubmitInfoKHR _waitSemaphoreValueCountAt(long index, MemorySegment src) { _waitSemaphoreValueCountAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR _waitSemaphoreValueCount(MemorySegment src) { return _waitSemaphoreValueCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoreValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphoreValues, index), LAYOUT_pWaitSemaphoreValues); }
    public MemorySegment _pWaitSemaphoreValues() { return _pWaitSemaphoreValuesAt(0L); }
    public VkTimelineSemaphoreSubmitInfoKHR _pWaitSemaphoreValuesAt(long index, MemorySegment src) { _pWaitSemaphoreValuesAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR _pWaitSemaphoreValues(MemorySegment src) { return _pWaitSemaphoreValuesAt(0L, src); }
    public MemorySegment _signalSemaphoreValueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreValueCount, index), LAYOUT_signalSemaphoreValueCount); }
    public MemorySegment _signalSemaphoreValueCount() { return _signalSemaphoreValueCountAt(0L); }
    public VkTimelineSemaphoreSubmitInfoKHR _signalSemaphoreValueCountAt(long index, MemorySegment src) { _signalSemaphoreValueCountAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR _signalSemaphoreValueCount(MemorySegment src) { return _signalSemaphoreValueCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoreValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphoreValues, index), LAYOUT_pSignalSemaphoreValues); }
    public MemorySegment _pSignalSemaphoreValues() { return _pSignalSemaphoreValuesAt(0L); }
    public VkTimelineSemaphoreSubmitInfoKHR _pSignalSemaphoreValuesAt(long index, MemorySegment src) { _pSignalSemaphoreValuesAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfoKHR _pSignalSemaphoreValues(MemorySegment src) { return _pSignalSemaphoreValuesAt(0L, src); }
}
