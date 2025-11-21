// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryBarrierAccessFlags3KHR`.
/// ## Layout
/// ```
/// struct VkMemoryBarrierAccessFlags3KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccessFlags3KHR srcAccessMask3;
///     VkAccessFlags3KHR dstAccessMask3;
/// }
/// ```
public final class VkMemoryBarrierAccessFlags3KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask3"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask3")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcAccessMask3 = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask3"));
    public static final long OFFSET_dstAccessMask3 = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask3"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcAccessMask3 = LAYOUT.select(PathElement.groupElement("srcAccessMask3"));
    public static final MemoryLayout LAYOUT_dstAccessMask3 = LAYOUT.select(PathElement.groupElement("dstAccessMask3"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcAccessMask3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask3"));
    public static final VarHandle VH_dstAccessMask3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask3"));

    public VkMemoryBarrierAccessFlags3KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryBarrierAccessFlags3KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrierAccessFlags3KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryBarrierAccessFlags3KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrierAccessFlags3KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryBarrierAccessFlags3KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrierAccessFlags3KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryBarrierAccessFlags3KHR alloc(SegmentAllocator allocator) { return new VkMemoryBarrierAccessFlags3KHR(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryBarrierAccessFlags3KHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryBarrierAccessFlags3KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryBarrierAccessFlags3KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance8.VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR); }
    public static VkMemoryBarrierAccessFlags3KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance8.VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR);
        return s;
    }
    public VkMemoryBarrierAccessFlags3KHR copyFrom(VkMemoryBarrierAccessFlags3KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryBarrierAccessFlags3KHR reinterpret(long count) { return new VkMemoryBarrierAccessFlags3KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryBarrierAccessFlags3KHR asSlice(long index) { return new VkMemoryBarrierAccessFlags3KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryBarrierAccessFlags3KHR asSlice(long index, long count) { return new VkMemoryBarrierAccessFlags3KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryBarrierAccessFlags3KHR at(long index, Consumer<VkMemoryBarrierAccessFlags3KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcAccessMask3At(long index) { return (long) VH_srcAccessMask3.get(this.segment(), 0L, index); }
    public long dstAccessMask3At(long index) { return (long) VH_dstAccessMask3.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcAccessMask3() { return (long) VH_srcAccessMask3.get(this.segment(), 0L, 0L); }
    public long dstAccessMask3() { return (long) VH_dstAccessMask3.get(this.segment(), 0L, 0L); }
    public VkMemoryBarrierAccessFlags3KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3At(long index, long value) { VH_srcAccessMask3.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3At(long index, long value) { VH_dstAccessMask3.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3(long value) { VH_srcAccessMask3.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3(long value) { VH_dstAccessMask3.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryBarrierAccessFlags3KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryBarrierAccessFlags3KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryBarrierAccessFlags3KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryBarrierAccessFlags3KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcAccessMask3At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccessMask3, index), LAYOUT_srcAccessMask3); }
    public MemorySegment _srcAccessMask3() { return _srcAccessMask3At(0L); }
    public VkMemoryBarrierAccessFlags3KHR _srcAccessMask3At(long index, MemorySegment src) { _srcAccessMask3At(index).copyFrom(src); return this; }
    public VkMemoryBarrierAccessFlags3KHR _srcAccessMask3(MemorySegment src) { return _srcAccessMask3At(0L, src); }
    public MemorySegment _dstAccessMask3At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccessMask3, index), LAYOUT_dstAccessMask3); }
    public MemorySegment _dstAccessMask3() { return _dstAccessMask3At(0L); }
    public VkMemoryBarrierAccessFlags3KHR _dstAccessMask3At(long index, MemorySegment src) { _dstAccessMask3At(index).copyFrom(src); return this; }
    public VkMemoryBarrierAccessFlags3KHR _dstAccessMask3(MemorySegment src) { return _dstAccessMask3At(0L, src); }
}
