// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreSubmitInfo`.
/// ## Layout
/// ```
/// struct VkSemaphoreSubmitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     uint64_t value;
///     VkPipelineStageFlags2 stageMask;
///     uint32_t deviceIndex;
/// }
/// ```
public final class VkSemaphoreSubmitInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value"),
        ValueLayout.JAVA_LONG.withName("stageMask"),
        ValueLayout.JAVA_INT.withName("deviceIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    public static final long OFFSET_stageMask = LAYOUT.byteOffset(PathElement.groupElement("stageMask"));
    public static final long OFFSET_deviceIndex = LAYOUT.byteOffset(PathElement.groupElement("deviceIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    public static final MemoryLayout LAYOUT_stageMask = LAYOUT.select(PathElement.groupElement("stageMask"));
    public static final MemoryLayout LAYOUT_deviceIndex = LAYOUT.select(PathElement.groupElement("deviceIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));
    public static final VarHandle VH_stageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageMask"));
    public static final VarHandle VH_deviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndex"));

    public VkSemaphoreSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSemaphoreSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSemaphoreSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSemaphoreSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSemaphoreSubmitInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreSubmitInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSemaphoreSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreSubmitInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSemaphoreSubmitInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
    public static VkSemaphoreSubmitInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO);
        return s;
    }
    public VkSemaphoreSubmitInfo copyFrom(VkSemaphoreSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSemaphoreSubmitInfo reinterpret(long count) { return new VkSemaphoreSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSemaphoreSubmitInfo asSlice(long index) { return new VkSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSemaphoreSubmitInfo asSlice(long index, long count) { return new VkSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSemaphoreSubmitInfo at(long index, Consumer<VkSemaphoreSubmitInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long semaphoreAt(long index) { return (long) VH_semaphore.get(this.segment(), 0L, index); }
    public long valueAt(long index) { return (long) VH_value.get(this.segment(), 0L, index); }
    public long stageMaskAt(long index) { return (long) VH_stageMask.get(this.segment(), 0L, index); }
    public int deviceIndexAt(long index) { return (int) VH_deviceIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long semaphore() { return (long) VH_semaphore.get(this.segment(), 0L, 0L); }
    public long value() { return (long) VH_value.get(this.segment(), 0L, 0L); }
    public long stageMask() { return (long) VH_stageMask.get(this.segment(), 0L, 0L); }
    public int deviceIndex() { return (int) VH_deviceIndex.get(this.segment(), 0L, 0L); }
    public VkSemaphoreSubmitInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSubmitInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSubmitInfo semaphoreAt(long index, long value) { VH_semaphore.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSubmitInfo valueAt(long index, long value) { VH_value.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSubmitInfo stageMaskAt(long index, long value) { VH_stageMask.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSubmitInfo deviceIndexAt(long index, int value) { VH_deviceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkSemaphoreSubmitInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSubmitInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSubmitInfo semaphore(long value) { VH_semaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSubmitInfo value(long value) { VH_value.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSubmitInfo stageMask(long value) { VH_stageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSemaphoreSubmitInfo deviceIndex(int value) { VH_deviceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSemaphoreSubmitInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSemaphoreSubmitInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSemaphoreSubmitInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSemaphoreSubmitInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphore, index), LAYOUT_semaphore); }
    public MemorySegment _semaphore() { return _semaphoreAt(0L); }
    public VkSemaphoreSubmitInfo _semaphoreAt(long index, MemorySegment src) { _semaphoreAt(index).copyFrom(src); return this; }
    public VkSemaphoreSubmitInfo _semaphore(MemorySegment src) { return _semaphoreAt(0L, src); }
    public MemorySegment _valueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_value, index), LAYOUT_value); }
    public MemorySegment _value() { return _valueAt(0L); }
    public VkSemaphoreSubmitInfo _valueAt(long index, MemorySegment src) { _valueAt(index).copyFrom(src); return this; }
    public VkSemaphoreSubmitInfo _value(MemorySegment src) { return _valueAt(0L, src); }
    public MemorySegment _stageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageMask, index), LAYOUT_stageMask); }
    public MemorySegment _stageMask() { return _stageMaskAt(0L); }
    public VkSemaphoreSubmitInfo _stageMaskAt(long index, MemorySegment src) { _stageMaskAt(index).copyFrom(src); return this; }
    public VkSemaphoreSubmitInfo _stageMask(MemorySegment src) { return _stageMaskAt(0L, src); }
    public MemorySegment _deviceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceIndex, index), LAYOUT_deviceIndex); }
    public MemorySegment _deviceIndex() { return _deviceIndexAt(0L); }
    public VkSemaphoreSubmitInfo _deviceIndexAt(long index, MemorySegment src) { _deviceIndexAt(index).copyFrom(src); return this; }
    public VkSemaphoreSubmitInfo _deviceIndex(MemorySegment src) { return _deviceIndexAt(0L, src); }
}
