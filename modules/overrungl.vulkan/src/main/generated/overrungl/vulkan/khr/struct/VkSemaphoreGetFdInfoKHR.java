// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreGetFdInfoKHR`.
/// ## Layout
/// ```
/// struct VkSemaphoreGetFdInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     VkExternalSemaphoreHandleTypeFlagBits handleType;
/// }
/// ```
public final class VkSemaphoreGetFdInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    public VkSemaphoreGetFdInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSemaphoreGetFdInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreGetFdInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSemaphoreGetFdInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreGetFdInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSemaphoreGetFdInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreGetFdInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSemaphoreGetFdInfoKHR alloc(SegmentAllocator allocator) { return new VkSemaphoreGetFdInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSemaphoreGetFdInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreGetFdInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSemaphoreGetFdInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR); }
    public static VkSemaphoreGetFdInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR);
        return s;
    }
    public VkSemaphoreGetFdInfoKHR copyFrom(VkSemaphoreGetFdInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSemaphoreGetFdInfoKHR reinterpret(long count) { return new VkSemaphoreGetFdInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSemaphoreGetFdInfoKHR asSlice(long index) { return new VkSemaphoreGetFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSemaphoreGetFdInfoKHR asSlice(long index, long count) { return new VkSemaphoreGetFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSemaphoreGetFdInfoKHR at(long index, Consumer<VkSemaphoreGetFdInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long semaphoreAt(long index) { return (long) VH_semaphore.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long semaphore() { return (long) VH_semaphore.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public VkSemaphoreGetFdInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreGetFdInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreGetFdInfoKHR semaphoreAt(long index, long value) { VH_semaphore.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreGetFdInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreGetFdInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreGetFdInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreGetFdInfoKHR semaphore(long value) { VH_semaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreGetFdInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSemaphoreGetFdInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreGetFdInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSemaphoreGetFdInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSemaphoreGetFdInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphore, index), LAYOUT_semaphore); }
    public MemorySegment _semaphore() { return _semaphoreAt(0L); }
    public VkSemaphoreGetFdInfoKHR _semaphoreAt(long index, MemorySegment src) { _semaphoreAt(index).copyFrom(src); return this; }
    public VkSemaphoreGetFdInfoKHR _semaphore(MemorySegment src) { return _semaphoreAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkSemaphoreGetFdInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreGetFdInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
}
