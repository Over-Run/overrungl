// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLatencySleepInfoNV`.
/// ## Layout
/// ```
/// struct VkLatencySleepInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore signalSemaphore;
///     uint64_t value;
/// }
/// ```
public final class VkLatencySleepInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("signalSemaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_signalSemaphore = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphore"));
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_signalSemaphore = LAYOUT.select(PathElement.groupElement("signalSemaphore"));
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_signalSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphore"));
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    public VkLatencySleepInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLatencySleepInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkLatencySleepInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLatencySleepInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLatencySleepInfoNV alloc(SegmentAllocator allocator) { return new VkLatencySleepInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkLatencySleepInfoNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySleepInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkLatencySleepInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV); }
    public static VkLatencySleepInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV);
        return s;
    }
    public VkLatencySleepInfoNV copyFrom(VkLatencySleepInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLatencySleepInfoNV reinterpret(long count) { return new VkLatencySleepInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLatencySleepInfoNV asSlice(long index) { return new VkLatencySleepInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLatencySleepInfoNV asSlice(long index, long count) { return new VkLatencySleepInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLatencySleepInfoNV at(long index, Consumer<VkLatencySleepInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long signalSemaphoreAt(long index) { return (long) VH_signalSemaphore.get(this.segment(), 0L, index); }
    public long valueAt(long index) { return (long) VH_value.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long signalSemaphore() { return (long) VH_signalSemaphore.get(this.segment(), 0L, 0L); }
    public long value() { return (long) VH_value.get(this.segment(), 0L, 0L); }
    public VkLatencySleepInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepInfoNV signalSemaphoreAt(long index, long value) { VH_signalSemaphore.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepInfoNV valueAt(long index, long value) { VH_value.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepInfoNV signalSemaphore(long value) { VH_signalSemaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepInfoNV value(long value) { VH_value.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkLatencySleepInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkLatencySleepInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkLatencySleepInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkLatencySleepInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _signalSemaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphore, index), LAYOUT_signalSemaphore); }
    public MemorySegment _signalSemaphore() { return _signalSemaphoreAt(0L); }
    public VkLatencySleepInfoNV _signalSemaphoreAt(long index, MemorySegment src) { _signalSemaphoreAt(index).copyFrom(src); return this; }
    public VkLatencySleepInfoNV _signalSemaphore(MemorySegment src) { return _signalSemaphoreAt(0L, src); }
    public MemorySegment _valueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_value, index), LAYOUT_value); }
    public MemorySegment _value() { return _valueAt(0L); }
    public VkLatencySleepInfoNV _valueAt(long index, MemorySegment src) { _valueAt(index).copyFrom(src); return this; }
    public VkLatencySleepInfoNV _value(MemorySegment src) { return _valueAt(0L, src); }
}
