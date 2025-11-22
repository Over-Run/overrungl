// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalComputeQueueCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkExternalComputeQueueCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueue preferredQueue;
/// }
/// ```
public final class VkExternalComputeQueueCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("preferredQueue")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_preferredQueue = LAYOUT.byteOffset(PathElement.groupElement("preferredQueue"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_preferredQueue = LAYOUT.select(PathElement.groupElement("preferredQueue"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_preferredQueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredQueue"));

    public VkExternalComputeQueueCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalComputeQueueCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalComputeQueueCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalComputeQueueCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalComputeQueueCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalComputeQueueCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalComputeQueueCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalComputeQueueCreateInfoNV alloc(SegmentAllocator allocator) { return new VkExternalComputeQueueCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkExternalComputeQueueCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkExternalComputeQueueCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalComputeQueueCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV); }
    public static VkExternalComputeQueueCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV);
        return s;
    }
    public VkExternalComputeQueueCreateInfoNV copyFrom(VkExternalComputeQueueCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalComputeQueueCreateInfoNV reinterpret(long count) { return new VkExternalComputeQueueCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalComputeQueueCreateInfoNV asSlice(long index) { return new VkExternalComputeQueueCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalComputeQueueCreateInfoNV asSlice(long index, long count) { return new VkExternalComputeQueueCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalComputeQueueCreateInfoNV at(long index, Consumer<VkExternalComputeQueueCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment preferredQueueAt(long index) { return (MemorySegment) VH_preferredQueue.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment preferredQueue() { return (MemorySegment) VH_preferredQueue.get(this.segment(), 0L, 0L); }
    public VkExternalComputeQueueCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalComputeQueueCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalComputeQueueCreateInfoNV preferredQueueAt(long index, MemorySegment value) { VH_preferredQueue.set(this.segment(), 0L, index, value); return this; }
    public VkExternalComputeQueueCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalComputeQueueCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalComputeQueueCreateInfoNV preferredQueue(MemorySegment value) { VH_preferredQueue.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalComputeQueueCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalComputeQueueCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalComputeQueueCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalComputeQueueCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _preferredQueueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredQueue, index), LAYOUT_preferredQueue); }
    public MemorySegment _preferredQueue() { return _preferredQueueAt(0L); }
    public VkExternalComputeQueueCreateInfoNV _preferredQueueAt(long index, MemorySegment src) { _preferredQueueAt(index).copyFrom(src); return this; }
    public VkExternalComputeQueueCreateInfoNV _preferredQueue(MemorySegment src) { return _preferredQueueAt(0L, src); }
}
