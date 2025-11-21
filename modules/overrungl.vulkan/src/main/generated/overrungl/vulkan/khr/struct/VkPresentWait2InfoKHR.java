// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentWait2InfoKHR`.
/// ## Layout
/// ```
/// struct VkPresentWait2InfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t presentId;
///     uint64_t timeout;
/// }
/// ```
public final class VkPresentWait2InfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentId"),
        ValueLayout.JAVA_LONG.withName("timeout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentId = LAYOUT.byteOffset(PathElement.groupElement("presentId"));
    public static final long OFFSET_timeout = LAYOUT.byteOffset(PathElement.groupElement("timeout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentId = LAYOUT.select(PathElement.groupElement("presentId"));
    public static final MemoryLayout LAYOUT_timeout = LAYOUT.select(PathElement.groupElement("timeout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId"));
    public static final VarHandle VH_timeout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeout"));

    public VkPresentWait2InfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentWait2InfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentWait2InfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentWait2InfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentWait2InfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentWait2InfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentWait2InfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentWait2InfoKHR alloc(SegmentAllocator allocator) { return new VkPresentWait2InfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPresentWait2InfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentWait2InfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentWait2InfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPresentWait2.VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR); }
    public static VkPresentWait2InfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPresentWait2.VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR);
        return s;
    }
    public VkPresentWait2InfoKHR copyFrom(VkPresentWait2InfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentWait2InfoKHR reinterpret(long count) { return new VkPresentWait2InfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentWait2InfoKHR asSlice(long index) { return new VkPresentWait2InfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentWait2InfoKHR asSlice(long index, long count) { return new VkPresentWait2InfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentWait2InfoKHR at(long index, Consumer<VkPresentWait2InfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long presentIdAt(long index) { return (long) VH_presentId.get(this.segment(), 0L, index); }
    public long timeoutAt(long index) { return (long) VH_timeout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long presentId() { return (long) VH_presentId.get(this.segment(), 0L, 0L); }
    public long timeout() { return (long) VH_timeout.get(this.segment(), 0L, 0L); }
    public VkPresentWait2InfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentWait2InfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentWait2InfoKHR presentIdAt(long index, long value) { VH_presentId.set(this.segment(), 0L, index, value); return this; }
    public VkPresentWait2InfoKHR timeoutAt(long index, long value) { VH_timeout.set(this.segment(), 0L, index, value); return this; }
    public VkPresentWait2InfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentWait2InfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentWait2InfoKHR presentId(long value) { VH_presentId.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentWait2InfoKHR timeout(long value) { VH_timeout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentWait2InfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentWait2InfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentWait2InfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentWait2InfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentId, index), LAYOUT_presentId); }
    public MemorySegment _presentId() { return _presentIdAt(0L); }
    public VkPresentWait2InfoKHR _presentIdAt(long index, MemorySegment src) { _presentIdAt(index).copyFrom(src); return this; }
    public VkPresentWait2InfoKHR _presentId(MemorySegment src) { return _presentIdAt(0L, src); }
    public MemorySegment _timeoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeout, index), LAYOUT_timeout); }
    public MemorySegment _timeout() { return _timeoutAt(0L); }
    public VkPresentWait2InfoKHR _timeoutAt(long index, MemorySegment src) { _timeoutAt(index).copyFrom(src); return this; }
    public VkPresentWait2InfoKHR _timeout(MemorySegment src) { return _timeoutAt(0L, src); }
}
