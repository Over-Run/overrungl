// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTimelineSemaphoreSubmitInfo`.
/// ## Layout
/// ```
/// struct VkTimelineSemaphoreSubmitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreValueCount;
///     const uint64_t* pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValueCount;
///     const uint64_t* pSignalSemaphoreValues;
/// }
/// ```
public final class VkTimelineSemaphoreSubmitInfo extends GroupType {
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

    public VkTimelineSemaphoreSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTimelineSemaphoreSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkTimelineSemaphoreSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTimelineSemaphoreSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTimelineSemaphoreSubmitInfo alloc(SegmentAllocator allocator) { return new VkTimelineSemaphoreSubmitInfo(allocator.allocate(LAYOUT), 1); }
    public static VkTimelineSemaphoreSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkTimelineSemaphoreSubmitInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkTimelineSemaphoreSubmitInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
    public static VkTimelineSemaphoreSubmitInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO);
        return s;
    }
    public VkTimelineSemaphoreSubmitInfo copyFrom(VkTimelineSemaphoreSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTimelineSemaphoreSubmitInfo reinterpret(long count) { return new VkTimelineSemaphoreSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTimelineSemaphoreSubmitInfo asSlice(long index) { return new VkTimelineSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTimelineSemaphoreSubmitInfo asSlice(long index, long count) { return new VkTimelineSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTimelineSemaphoreSubmitInfo at(long index, Consumer<VkTimelineSemaphoreSubmitInfo> func) { func.accept(asSlice(index)); return this; }
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
    public VkTimelineSemaphoreSubmitInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCountAt(long index, int value) { VH_waitSemaphoreValueCount.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValuesAt(long index, MemorySegment value) { VH_pWaitSemaphoreValues.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCountAt(long index, int value) { VH_signalSemaphoreValueCount.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValuesAt(long index, MemorySegment value) { VH_pSignalSemaphoreValues.set(this.segment(), 0L, index, value); return this; }
    public VkTimelineSemaphoreSubmitInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(int value) { VH_waitSemaphoreValueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(MemorySegment value) { VH_pWaitSemaphoreValues.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(int value) { VH_signalSemaphoreValueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(MemorySegment value) { VH_pSignalSemaphoreValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTimelineSemaphoreSubmitInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTimelineSemaphoreSubmitInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreValueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreValueCount, index), LAYOUT_waitSemaphoreValueCount); }
    public MemorySegment _waitSemaphoreValueCount() { return _waitSemaphoreValueCountAt(0L); }
    public VkTimelineSemaphoreSubmitInfo _waitSemaphoreValueCountAt(long index, MemorySegment src) { _waitSemaphoreValueCountAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfo _waitSemaphoreValueCount(MemorySegment src) { return _waitSemaphoreValueCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoreValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphoreValues, index), LAYOUT_pWaitSemaphoreValues); }
    public MemorySegment _pWaitSemaphoreValues() { return _pWaitSemaphoreValuesAt(0L); }
    public VkTimelineSemaphoreSubmitInfo _pWaitSemaphoreValuesAt(long index, MemorySegment src) { _pWaitSemaphoreValuesAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfo _pWaitSemaphoreValues(MemorySegment src) { return _pWaitSemaphoreValuesAt(0L, src); }
    public MemorySegment _signalSemaphoreValueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreValueCount, index), LAYOUT_signalSemaphoreValueCount); }
    public MemorySegment _signalSemaphoreValueCount() { return _signalSemaphoreValueCountAt(0L); }
    public VkTimelineSemaphoreSubmitInfo _signalSemaphoreValueCountAt(long index, MemorySegment src) { _signalSemaphoreValueCountAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfo _signalSemaphoreValueCount(MemorySegment src) { return _signalSemaphoreValueCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoreValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphoreValues, index), LAYOUT_pSignalSemaphoreValues); }
    public MemorySegment _pSignalSemaphoreValues() { return _pSignalSemaphoreValuesAt(0L); }
    public VkTimelineSemaphoreSubmitInfo _pSignalSemaphoreValuesAt(long index, MemorySegment src) { _pSignalSemaphoreValuesAt(index).copyFrom(src); return this; }
    public VkTimelineSemaphoreSubmitInfo _pSignalSemaphoreValues(MemorySegment src) { return _pSignalSemaphoreValuesAt(0L, src); }
}
