// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreSignalInfoKHR`.
/// ## Layout
/// ```
/// struct VkSemaphoreSignalInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     uint64_t value;
/// }
/// ```
public final class VkSemaphoreSignalInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    public VkSemaphoreSignalInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSemaphoreSignalInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSignalInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSemaphoreSignalInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSignalInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSemaphoreSignalInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSignalInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSemaphoreSignalInfoKHR alloc(SegmentAllocator allocator) { return new VkSemaphoreSignalInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSemaphoreSignalInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreSignalInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSemaphoreSignalInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
    public static VkSemaphoreSignalInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO);
        return s;
    }
    public VkSemaphoreSignalInfoKHR copyFrom(VkSemaphoreSignalInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSemaphoreSignalInfoKHR reinterpret(long count) { return new VkSemaphoreSignalInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSemaphoreSignalInfoKHR asSlice(long index) { return new VkSemaphoreSignalInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSemaphoreSignalInfoKHR asSlice(long index, long count) { return new VkSemaphoreSignalInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSemaphoreSignalInfoKHR at(long index, Consumer<VkSemaphoreSignalInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long semaphoreAt(long index) { return (long) VH_semaphore.get(this.segment(), 0L, index); }
    public long valueAt(long index) { return (long) VH_value.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long semaphore() { return (long) VH_semaphore.get(this.segment(), 0L, 0L); }
    public long value() { return (long) VH_value.get(this.segment(), 0L, 0L); }
    public VkSemaphoreSignalInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSignalInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSignalInfoKHR semaphoreAt(long index, long value) { VH_semaphore.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSignalInfoKHR valueAt(long index, long value) { VH_value.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSignalInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSignalInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSignalInfoKHR semaphore(long value) { VH_semaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSignalInfoKHR value(long value) { VH_value.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSemaphoreSignalInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreSignalInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSemaphoreSignalInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSemaphoreSignalInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphore, index), LAYOUT_semaphore); }
    public MemorySegment _semaphore() { return _semaphoreAt(0L); }
    public VkSemaphoreSignalInfoKHR _semaphoreAt(long index, MemorySegment src) { _semaphoreAt(index).copyFrom(src); return this; }
    public VkSemaphoreSignalInfoKHR _semaphore(MemorySegment src) { return _semaphoreAt(0L, src); }
    public MemorySegment _valueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_value, index), LAYOUT_value); }
    public MemorySegment _value() { return _valueAt(0L); }
    public VkSemaphoreSignalInfoKHR _valueAt(long index, MemorySegment src) { _valueAt(index).copyFrom(src); return this; }
    public VkSemaphoreSignalInfoKHR _value(MemorySegment src) { return _valueAt(0L, src); }
}
