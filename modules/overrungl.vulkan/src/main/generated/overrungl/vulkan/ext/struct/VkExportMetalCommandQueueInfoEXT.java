// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalCommandQueueInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalCommandQueueInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueue queue;
///     MTLCommandQueue_id mtlCommandQueue;
/// }
/// ```
public final class VkExportMetalCommandQueueInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queue"),
        ValueLayout.ADDRESS.withName("mtlCommandQueue")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queue = LAYOUT.byteOffset(PathElement.groupElement("queue"));
    public static final long OFFSET_mtlCommandQueue = LAYOUT.byteOffset(PathElement.groupElement("mtlCommandQueue"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queue = LAYOUT.select(PathElement.groupElement("queue"));
    public static final MemoryLayout LAYOUT_mtlCommandQueue = LAYOUT.select(PathElement.groupElement("mtlCommandQueue"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queue"));
    public static final VarHandle VH_mtlCommandQueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlCommandQueue"));

    public VkExportMetalCommandQueueInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMetalCommandQueueInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMetalCommandQueueInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMetalCommandQueueInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalCommandQueueInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMetalCommandQueueInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalCommandQueueInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExportMetalCommandQueueInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalCommandQueueInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT); }
    public static VkExportMetalCommandQueueInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
        return s;
    }
    public VkExportMetalCommandQueueInfoEXT copyFrom(VkExportMetalCommandQueueInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMetalCommandQueueInfoEXT reinterpret(long count) { return new VkExportMetalCommandQueueInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMetalCommandQueueInfoEXT asSlice(long index) { return new VkExportMetalCommandQueueInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMetalCommandQueueInfoEXT asSlice(long index, long count) { return new VkExportMetalCommandQueueInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMetalCommandQueueInfoEXT at(long index, Consumer<VkExportMetalCommandQueueInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment queueAt(long index) { return (MemorySegment) VH_queue.get(this.segment(), 0L, index); }
    public MemorySegment mtlCommandQueueAt(long index) { return (MemorySegment) VH_mtlCommandQueue.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment queue() { return (MemorySegment) VH_queue.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlCommandQueue() { return (MemorySegment) VH_mtlCommandQueue.get(this.segment(), 0L, 0L); }
    public VkExportMetalCommandQueueInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalCommandQueueInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalCommandQueueInfoEXT queueAt(long index, MemorySegment value) { VH_queue.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalCommandQueueInfoEXT mtlCommandQueueAt(long index, MemorySegment value) { VH_mtlCommandQueue.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalCommandQueueInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalCommandQueueInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalCommandQueueInfoEXT queue(MemorySegment value) { VH_queue.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalCommandQueueInfoEXT mtlCommandQueue(MemorySegment value) { VH_mtlCommandQueue.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMetalCommandQueueInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalCommandQueueInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMetalCommandQueueInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMetalCommandQueueInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queue, index), LAYOUT_queue); }
    public MemorySegment _queue() { return _queueAt(0L); }
    public VkExportMetalCommandQueueInfoEXT _queueAt(long index, MemorySegment src) { _queueAt(index).copyFrom(src); return this; }
    public VkExportMetalCommandQueueInfoEXT _queue(MemorySegment src) { return _queueAt(0L, src); }
    public MemorySegment _mtlCommandQueueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlCommandQueue, index), LAYOUT_mtlCommandQueue); }
    public MemorySegment _mtlCommandQueue() { return _mtlCommandQueueAt(0L); }
    public VkExportMetalCommandQueueInfoEXT _mtlCommandQueueAt(long index, MemorySegment src) { _mtlCommandQueueAt(index).copyFrom(src); return this; }
    public VkExportMetalCommandQueueInfoEXT _mtlCommandQueue(MemorySegment src) { return _mtlCommandQueueAt(0L, src); }
}
