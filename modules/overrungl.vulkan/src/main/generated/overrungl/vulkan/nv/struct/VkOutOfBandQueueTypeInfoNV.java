// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOutOfBandQueueTypeInfoNV`.
/// ## Layout
/// ```
/// struct VkOutOfBandQueueTypeInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkOutOfBandQueueTypeNV queueType;
/// }
/// ```
public final class VkOutOfBandQueueTypeInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queueType = LAYOUT.byteOffset(PathElement.groupElement("queueType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queueType = LAYOUT.select(PathElement.groupElement("queueType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queueType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueType"));

    public VkOutOfBandQueueTypeInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOutOfBandQueueTypeInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOutOfBandQueueTypeInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkOutOfBandQueueTypeInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOutOfBandQueueTypeInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOutOfBandQueueTypeInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOutOfBandQueueTypeInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOutOfBandQueueTypeInfoNV alloc(SegmentAllocator allocator) { return new VkOutOfBandQueueTypeInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkOutOfBandQueueTypeInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOutOfBandQueueTypeInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkOutOfBandQueueTypeInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV); }
    public static VkOutOfBandQueueTypeInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV);
        return s;
    }
    public VkOutOfBandQueueTypeInfoNV copyFrom(VkOutOfBandQueueTypeInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOutOfBandQueueTypeInfoNV reinterpret(long count) { return new VkOutOfBandQueueTypeInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOutOfBandQueueTypeInfoNV asSlice(long index) { return new VkOutOfBandQueueTypeInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOutOfBandQueueTypeInfoNV asSlice(long index, long count) { return new VkOutOfBandQueueTypeInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOutOfBandQueueTypeInfoNV at(long index, Consumer<VkOutOfBandQueueTypeInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queueTypeAt(long index) { return (int) VH_queueType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queueType() { return (int) VH_queueType.get(this.segment(), 0L, 0L); }
    public VkOutOfBandQueueTypeInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOutOfBandQueueTypeInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOutOfBandQueueTypeInfoNV queueTypeAt(long index, int value) { VH_queueType.set(this.segment(), 0L, index, value); return this; }
    public VkOutOfBandQueueTypeInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOutOfBandQueueTypeInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOutOfBandQueueTypeInfoNV queueType(int value) { VH_queueType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOutOfBandQueueTypeInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOutOfBandQueueTypeInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOutOfBandQueueTypeInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOutOfBandQueueTypeInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueType, index), LAYOUT_queueType); }
    public MemorySegment _queueType() { return _queueTypeAt(0L); }
    public VkOutOfBandQueueTypeInfoNV _queueTypeAt(long index, MemorySegment src) { _queueTypeAt(index).copyFrom(src); return this; }
    public VkOutOfBandQueueTypeInfoNV _queueType(MemorySegment src) { return _queueTypeAt(0L, src); }
}
