// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreWaitInfo`.
/// ## Layout
/// ```
/// struct VkSemaphoreWaitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphoreWaitFlags flags;
///     uint32_t semaphoreCount;
///     const VkSemaphore* pSemaphores;
///     const uint64_t* pValues;
/// }
/// ```
public final class VkSemaphoreWaitInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("semaphoreCount"),
        ValueLayout.ADDRESS.withName("pSemaphores"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_semaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("semaphoreCount"));
    public static final long OFFSET_pSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pSemaphores"));
    public static final long OFFSET_pValues = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_semaphoreCount = LAYOUT.select(PathElement.groupElement("semaphoreCount"));
    public static final MemoryLayout LAYOUT_pSemaphores = LAYOUT.select(PathElement.groupElement("pSemaphores"));
    public static final MemoryLayout LAYOUT_pValues = LAYOUT.select(PathElement.groupElement("pValues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_semaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreCount"));
    public static final VarHandle VH_pSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSemaphores"));
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    public VkSemaphoreWaitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSemaphoreWaitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSemaphoreWaitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSemaphoreWaitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSemaphoreWaitInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreWaitInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSemaphoreWaitInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreWaitInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSemaphoreWaitInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
    public static VkSemaphoreWaitInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO);
        return s;
    }
    public VkSemaphoreWaitInfo copyFrom(VkSemaphoreWaitInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSemaphoreWaitInfo reinterpret(long count) { return new VkSemaphoreWaitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSemaphoreWaitInfo asSlice(long index) { return new VkSemaphoreWaitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSemaphoreWaitInfo asSlice(long index, long count) { return new VkSemaphoreWaitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSemaphoreWaitInfo at(long index, Consumer<VkSemaphoreWaitInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int semaphoreCountAt(long index) { return (int) VH_semaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pSemaphoresAt(long index) { return (MemorySegment) VH_pSemaphores.get(this.segment(), 0L, index); }
    public MemorySegment pValuesAt(long index) { return (MemorySegment) VH_pValues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int semaphoreCount() { return (int) VH_semaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSemaphores() { return (MemorySegment) VH_pSemaphores.get(this.segment(), 0L, 0L); }
    public MemorySegment pValues() { return (MemorySegment) VH_pValues.get(this.segment(), 0L, 0L); }
    public VkSemaphoreWaitInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreWaitInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreWaitInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreWaitInfo semaphoreCountAt(long index, int value) { VH_semaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreWaitInfo pSemaphoresAt(long index, MemorySegment value) { VH_pSemaphores.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreWaitInfo pValuesAt(long index, MemorySegment value) { VH_pValues.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreWaitInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreWaitInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreWaitInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreWaitInfo semaphoreCount(int value) { VH_semaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreWaitInfo pSemaphores(MemorySegment value) { VH_pSemaphores.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreWaitInfo pValues(MemorySegment value) { VH_pValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSemaphoreWaitInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreWaitInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSemaphoreWaitInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSemaphoreWaitInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSemaphoreWaitInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSemaphoreWaitInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _semaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphoreCount, index), LAYOUT_semaphoreCount); }
    public MemorySegment _semaphoreCount() { return _semaphoreCountAt(0L); }
    public VkSemaphoreWaitInfo _semaphoreCountAt(long index, MemorySegment src) { _semaphoreCountAt(index).copyFrom(src); return this; }
    public VkSemaphoreWaitInfo _semaphoreCount(MemorySegment src) { return _semaphoreCountAt(0L, src); }
    public MemorySegment _pSemaphoresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSemaphores, index), LAYOUT_pSemaphores); }
    public MemorySegment _pSemaphores() { return _pSemaphoresAt(0L); }
    public VkSemaphoreWaitInfo _pSemaphoresAt(long index, MemorySegment src) { _pSemaphoresAt(index).copyFrom(src); return this; }
    public VkSemaphoreWaitInfo _pSemaphores(MemorySegment src) { return _pSemaphoresAt(0L, src); }
    public MemorySegment _pValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pValues, index), LAYOUT_pValues); }
    public MemorySegment _pValues() { return _pValuesAt(0L); }
    public VkSemaphoreWaitInfo _pValuesAt(long index, MemorySegment src) { _pValuesAt(index).copyFrom(src); return this; }
    public VkSemaphoreWaitInfo _pValues(MemorySegment src) { return _pValuesAt(0L, src); }
}
