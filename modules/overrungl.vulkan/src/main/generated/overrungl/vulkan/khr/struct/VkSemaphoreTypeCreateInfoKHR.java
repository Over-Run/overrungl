// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreTypeCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkSemaphoreTypeCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphoreType semaphoreType;
///     uint64_t initialValue;
/// }
/// ```
public final class VkSemaphoreTypeCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreType"),
        ValueLayout.JAVA_LONG.withName("initialValue")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_semaphoreType = LAYOUT.byteOffset(PathElement.groupElement("semaphoreType"));
    public static final long OFFSET_initialValue = LAYOUT.byteOffset(PathElement.groupElement("initialValue"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_semaphoreType = LAYOUT.select(PathElement.groupElement("semaphoreType"));
    public static final MemoryLayout LAYOUT_initialValue = LAYOUT.select(PathElement.groupElement("initialValue"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_semaphoreType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreType"));
    public static final VarHandle VH_initialValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialValue"));

    public VkSemaphoreTypeCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSemaphoreTypeCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSemaphoreTypeCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSemaphoreTypeCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSemaphoreTypeCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSemaphoreTypeCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSemaphoreTypeCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreTypeCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSemaphoreTypeCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
    public static VkSemaphoreTypeCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO);
        return s;
    }
    public VkSemaphoreTypeCreateInfoKHR copyFrom(VkSemaphoreTypeCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSemaphoreTypeCreateInfoKHR reinterpret(long count) { return new VkSemaphoreTypeCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSemaphoreTypeCreateInfoKHR asSlice(long index) { return new VkSemaphoreTypeCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSemaphoreTypeCreateInfoKHR asSlice(long index, long count) { return new VkSemaphoreTypeCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSemaphoreTypeCreateInfoKHR at(long index, Consumer<VkSemaphoreTypeCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int semaphoreTypeAt(long index) { return (int) VH_semaphoreType.get(this.segment(), 0L, index); }
    public long initialValueAt(long index) { return (long) VH_initialValue.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int semaphoreType() { return (int) VH_semaphoreType.get(this.segment(), 0L, 0L); }
    public long initialValue() { return (long) VH_initialValue.get(this.segment(), 0L, 0L); }
    public VkSemaphoreTypeCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR semaphoreTypeAt(long index, int value) { VH_semaphoreType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR initialValueAt(long index, long value) { VH_initialValue.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR semaphoreType(int value) { VH_semaphoreType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreTypeCreateInfoKHR initialValue(long value) { VH_initialValue.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSemaphoreTypeCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSemaphoreTypeCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphoreType, index), LAYOUT_semaphoreType); }
    public MemorySegment _semaphoreType() { return _semaphoreTypeAt(0L); }
    public VkSemaphoreTypeCreateInfoKHR _semaphoreTypeAt(long index, MemorySegment src) { _semaphoreTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfoKHR _semaphoreType(MemorySegment src) { return _semaphoreTypeAt(0L, src); }
    public MemorySegment _initialValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialValue, index), LAYOUT_initialValue); }
    public MemorySegment _initialValue() { return _initialValueAt(0L); }
    public VkSemaphoreTypeCreateInfoKHR _initialValueAt(long index, MemorySegment src) { _initialValueAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfoKHR _initialValue(MemorySegment src) { return _initialValueAt(0L, src); }
}
