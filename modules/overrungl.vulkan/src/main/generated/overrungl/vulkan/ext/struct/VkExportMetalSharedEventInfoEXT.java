// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalSharedEventInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     VkEvent event;
///     MTLSharedEvent_id mtlSharedEvent;
/// }
/// ```
public final class VkExportMetalSharedEventInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("event"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    public static final long OFFSET_event = LAYOUT.byteOffset(PathElement.groupElement("event"));
    public static final long OFFSET_mtlSharedEvent = LAYOUT.byteOffset(PathElement.groupElement("mtlSharedEvent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    public static final MemoryLayout LAYOUT_event = LAYOUT.select(PathElement.groupElement("event"));
    public static final MemoryLayout LAYOUT_mtlSharedEvent = LAYOUT.select(PathElement.groupElement("mtlSharedEvent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    public static final VarHandle VH_event = LAYOUT.arrayElementVarHandle(PathElement.groupElement("event"));
    public static final VarHandle VH_mtlSharedEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlSharedEvent"));

    public VkExportMetalSharedEventInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMetalSharedEventInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMetalSharedEventInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMetalSharedEventInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalSharedEventInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMetalSharedEventInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT); }
    public static VkExportMetalSharedEventInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT);
        return s;
    }
    public VkExportMetalSharedEventInfoEXT copyFrom(VkExportMetalSharedEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMetalSharedEventInfoEXT reinterpret(long count) { return new VkExportMetalSharedEventInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMetalSharedEventInfoEXT asSlice(long index) { return new VkExportMetalSharedEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMetalSharedEventInfoEXT asSlice(long index, long count) { return new VkExportMetalSharedEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMetalSharedEventInfoEXT at(long index, Consumer<VkExportMetalSharedEventInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long semaphoreAt(long index) { return (long) VH_semaphore.get(this.segment(), 0L, index); }
    public long eventAt(long index) { return (long) VH_event.get(this.segment(), 0L, index); }
    public MemorySegment mtlSharedEventAt(long index) { return (MemorySegment) VH_mtlSharedEvent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long semaphore() { return (long) VH_semaphore.get(this.segment(), 0L, 0L); }
    public long event() { return (long) VH_event.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlSharedEvent() { return (MemorySegment) VH_mtlSharedEvent.get(this.segment(), 0L, 0L); }
    public VkExportMetalSharedEventInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalSharedEventInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalSharedEventInfoEXT semaphoreAt(long index, long value) { VH_semaphore.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalSharedEventInfoEXT eventAt(long index, long value) { VH_event.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalSharedEventInfoEXT mtlSharedEventAt(long index, MemorySegment value) { VH_mtlSharedEvent.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalSharedEventInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalSharedEventInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalSharedEventInfoEXT semaphore(long value) { VH_semaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalSharedEventInfoEXT event(long value) { VH_event.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalSharedEventInfoEXT mtlSharedEvent(MemorySegment value) { VH_mtlSharedEvent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMetalSharedEventInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalSharedEventInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMetalSharedEventInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMetalSharedEventInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphore, index), LAYOUT_semaphore); }
    public MemorySegment _semaphore() { return _semaphoreAt(0L); }
    public VkExportMetalSharedEventInfoEXT _semaphoreAt(long index, MemorySegment src) { _semaphoreAt(index).copyFrom(src); return this; }
    public VkExportMetalSharedEventInfoEXT _semaphore(MemorySegment src) { return _semaphoreAt(0L, src); }
    public MemorySegment _eventAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_event, index), LAYOUT_event); }
    public MemorySegment _event() { return _eventAt(0L); }
    public VkExportMetalSharedEventInfoEXT _eventAt(long index, MemorySegment src) { _eventAt(index).copyFrom(src); return this; }
    public VkExportMetalSharedEventInfoEXT _event(MemorySegment src) { return _eventAt(0L, src); }
    public MemorySegment _mtlSharedEventAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlSharedEvent, index), LAYOUT_mtlSharedEvent); }
    public MemorySegment _mtlSharedEvent() { return _mtlSharedEventAt(0L); }
    public VkExportMetalSharedEventInfoEXT _mtlSharedEventAt(long index, MemorySegment src) { _mtlSharedEventAt(index).copyFrom(src); return this; }
    public VkExportMetalSharedEventInfoEXT _mtlSharedEvent(MemorySegment src) { return _mtlSharedEventAt(0L, src); }
}
