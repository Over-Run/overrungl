// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLatencySubmissionPresentIdNV`.
/// ## Layout
/// ```
/// struct VkLatencySubmissionPresentIdNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t presentID;
/// }
/// ```
public final class VkLatencySubmissionPresentIdNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));

    public VkLatencySubmissionPresentIdNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLatencySubmissionPresentIdNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySubmissionPresentIdNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkLatencySubmissionPresentIdNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySubmissionPresentIdNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLatencySubmissionPresentIdNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySubmissionPresentIdNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLatencySubmissionPresentIdNV alloc(SegmentAllocator allocator) { return new VkLatencySubmissionPresentIdNV(allocator.allocate(LAYOUT), 1); }
    public static VkLatencySubmissionPresentIdNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySubmissionPresentIdNV(allocator.allocate(LAYOUT, count), count); }
    public static VkLatencySubmissionPresentIdNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV); }
    public static VkLatencySubmissionPresentIdNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV);
        return s;
    }
    public VkLatencySubmissionPresentIdNV copyFrom(VkLatencySubmissionPresentIdNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLatencySubmissionPresentIdNV reinterpret(long count) { return new VkLatencySubmissionPresentIdNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLatencySubmissionPresentIdNV asSlice(long index) { return new VkLatencySubmissionPresentIdNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLatencySubmissionPresentIdNV asSlice(long index, long count) { return new VkLatencySubmissionPresentIdNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLatencySubmissionPresentIdNV at(long index, Consumer<VkLatencySubmissionPresentIdNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long presentIDAt(long index) { return (long) VH_presentID.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long presentID() { return (long) VH_presentID.get(this.segment(), 0L, 0L); }
    public VkLatencySubmissionPresentIdNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySubmissionPresentIdNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySubmissionPresentIdNV presentIDAt(long index, long value) { VH_presentID.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySubmissionPresentIdNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySubmissionPresentIdNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySubmissionPresentIdNV presentID(long value) { VH_presentID.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkLatencySubmissionPresentIdNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkLatencySubmissionPresentIdNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkLatencySubmissionPresentIdNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkLatencySubmissionPresentIdNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentID, index), LAYOUT_presentID); }
    public MemorySegment _presentID() { return _presentIDAt(0L); }
    public VkLatencySubmissionPresentIdNV _presentIDAt(long index, MemorySegment src) { _presentIDAt(index).copyFrom(src); return this; }
    public VkLatencySubmissionPresentIdNV _presentID(MemorySegment src) { return _presentIDAt(0L, src); }
}
