// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSetPresentConfigNV`.
/// ## Layout
/// ```
/// struct VkSetPresentConfigNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t numFramesPerBatch;
///     uint32_t presentConfigFeedback;
/// }
/// ```
public final class VkSetPresentConfigNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("numFramesPerBatch"),
        ValueLayout.JAVA_INT.withName("presentConfigFeedback")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_numFramesPerBatch = LAYOUT.byteOffset(PathElement.groupElement("numFramesPerBatch"));
    public static final long OFFSET_presentConfigFeedback = LAYOUT.byteOffset(PathElement.groupElement("presentConfigFeedback"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_numFramesPerBatch = LAYOUT.select(PathElement.groupElement("numFramesPerBatch"));
    public static final MemoryLayout LAYOUT_presentConfigFeedback = LAYOUT.select(PathElement.groupElement("presentConfigFeedback"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_numFramesPerBatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numFramesPerBatch"));
    public static final VarHandle VH_presentConfigFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentConfigFeedback"));

    public VkSetPresentConfigNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSetPresentConfigNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetPresentConfigNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSetPresentConfigNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetPresentConfigNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSetPresentConfigNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetPresentConfigNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSetPresentConfigNV alloc(SegmentAllocator allocator) { return new VkSetPresentConfigNV(allocator.allocate(LAYOUT), 1); }
    public static VkSetPresentConfigNV alloc(SegmentAllocator allocator, long count) { return new VkSetPresentConfigNV(allocator.allocate(LAYOUT, count), count); }
    public static VkSetPresentConfigNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPresentMetering.VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV); }
    public static VkSetPresentConfigNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPresentMetering.VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV);
        return s;
    }
    public VkSetPresentConfigNV copyFrom(VkSetPresentConfigNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSetPresentConfigNV reinterpret(long count) { return new VkSetPresentConfigNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSetPresentConfigNV asSlice(long index) { return new VkSetPresentConfigNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSetPresentConfigNV asSlice(long index, long count) { return new VkSetPresentConfigNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSetPresentConfigNV at(long index, Consumer<VkSetPresentConfigNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int numFramesPerBatchAt(long index) { return (int) VH_numFramesPerBatch.get(this.segment(), 0L, index); }
    public int presentConfigFeedbackAt(long index) { return (int) VH_presentConfigFeedback.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int numFramesPerBatch() { return (int) VH_numFramesPerBatch.get(this.segment(), 0L, 0L); }
    public int presentConfigFeedback() { return (int) VH_presentConfigFeedback.get(this.segment(), 0L, 0L); }
    public VkSetPresentConfigNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSetPresentConfigNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSetPresentConfigNV numFramesPerBatchAt(long index, int value) { VH_numFramesPerBatch.set(this.segment(), 0L, index, value); return this; }
    public VkSetPresentConfigNV presentConfigFeedbackAt(long index, int value) { VH_presentConfigFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkSetPresentConfigNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetPresentConfigNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetPresentConfigNV numFramesPerBatch(int value) { VH_numFramesPerBatch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetPresentConfigNV presentConfigFeedback(int value) { VH_presentConfigFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSetPresentConfigNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSetPresentConfigNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSetPresentConfigNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSetPresentConfigNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _numFramesPerBatchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numFramesPerBatch, index), LAYOUT_numFramesPerBatch); }
    public MemorySegment _numFramesPerBatch() { return _numFramesPerBatchAt(0L); }
    public VkSetPresentConfigNV _numFramesPerBatchAt(long index, MemorySegment src) { _numFramesPerBatchAt(index).copyFrom(src); return this; }
    public VkSetPresentConfigNV _numFramesPerBatch(MemorySegment src) { return _numFramesPerBatchAt(0L, src); }
    public MemorySegment _presentConfigFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentConfigFeedback, index), LAYOUT_presentConfigFeedback); }
    public MemorySegment _presentConfigFeedback() { return _presentConfigFeedbackAt(0L); }
    public VkSetPresentConfigNV _presentConfigFeedbackAt(long index, MemorySegment src) { _presentConfigFeedbackAt(index).copyFrom(src); return this; }
    public VkSetPresentConfigNV _presentConfigFeedback(MemorySegment src) { return _presentConfigFeedbackAt(0L, src); }
}
