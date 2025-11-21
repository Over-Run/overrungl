// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreTypeCreateInfo`.
/// ## Layout
/// ```
/// struct VkSemaphoreTypeCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphoreType semaphoreType;
///     uint64_t initialValue;
/// }
/// ```
public final class VkSemaphoreTypeCreateInfo extends GroupType {
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

    public VkSemaphoreTypeCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSemaphoreTypeCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSemaphoreTypeCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSemaphoreTypeCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSemaphoreTypeCreateInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreTypeCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSemaphoreTypeCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreTypeCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSemaphoreTypeCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
    public static VkSemaphoreTypeCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO);
        return s;
    }
    public VkSemaphoreTypeCreateInfo copyFrom(VkSemaphoreTypeCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSemaphoreTypeCreateInfo reinterpret(long count) { return new VkSemaphoreTypeCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSemaphoreTypeCreateInfo asSlice(long index) { return new VkSemaphoreTypeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSemaphoreTypeCreateInfo asSlice(long index, long count) { return new VkSemaphoreTypeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSemaphoreTypeCreateInfo at(long index, Consumer<VkSemaphoreTypeCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int semaphoreTypeAt(long index) { return (int) VH_semaphoreType.get(this.segment(), 0L, index); }
    public long initialValueAt(long index) { return (long) VH_initialValue.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int semaphoreType() { return (int) VH_semaphoreType.get(this.segment(), 0L, 0L); }
    public long initialValue() { return (long) VH_initialValue.get(this.segment(), 0L, 0L); }
    public VkSemaphoreTypeCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfo semaphoreTypeAt(long index, int value) { VH_semaphoreType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfo initialValueAt(long index, long value) { VH_initialValue.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreTypeCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreTypeCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreTypeCreateInfo semaphoreType(int value) { VH_semaphoreType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreTypeCreateInfo initialValue(long value) { VH_initialValue.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSemaphoreTypeCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSemaphoreTypeCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphoreType, index), LAYOUT_semaphoreType); }
    public MemorySegment _semaphoreType() { return _semaphoreTypeAt(0L); }
    public VkSemaphoreTypeCreateInfo _semaphoreTypeAt(long index, MemorySegment src) { _semaphoreTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfo _semaphoreType(MemorySegment src) { return _semaphoreTypeAt(0L, src); }
    public MemorySegment _initialValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialValue, index), LAYOUT_initialValue); }
    public MemorySegment _initialValue() { return _initialValueAt(0L); }
    public VkSemaphoreTypeCreateInfo _initialValueAt(long index, MemorySegment src) { _initialValueAt(index).copyFrom(src); return this; }
    public VkSemaphoreTypeCreateInfo _initialValue(MemorySegment src) { return _initialValueAt(0L, src); }
}
