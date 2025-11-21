// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryBarrier`.
/// ## Layout
/// ```
/// struct VkMemoryBarrier {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccessFlags srcAccessMask;
///     VkAccessFlags dstAccessMask;
/// }
/// ```
public final class VkMemoryBarrier extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));

    public VkMemoryBarrier(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryBarrier of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryBarrier ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryBarrier ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryBarrier(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryBarrier alloc(SegmentAllocator allocator) { return new VkMemoryBarrier(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryBarrier alloc(SegmentAllocator allocator, long count) { return new VkMemoryBarrier(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryBarrier allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_MEMORY_BARRIER); }
    public static VkMemoryBarrier allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_MEMORY_BARRIER);
        return s;
    }
    public VkMemoryBarrier copyFrom(VkMemoryBarrier src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryBarrier reinterpret(long count) { return new VkMemoryBarrier(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryBarrier asSlice(long index) { return new VkMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryBarrier asSlice(long index, long count) { return new VkMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryBarrier at(long index, Consumer<VkMemoryBarrier> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcAccessMaskAt(long index) { return (int) VH_srcAccessMask.get(this.segment(), 0L, index); }
    public int dstAccessMaskAt(long index) { return (int) VH_dstAccessMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcAccessMask() { return (int) VH_srcAccessMask.get(this.segment(), 0L, 0L); }
    public int dstAccessMask() { return (int) VH_dstAccessMask.get(this.segment(), 0L, 0L); }
    public VkMemoryBarrier sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrier pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrier srcAccessMaskAt(long index, int value) { VH_srcAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrier dstAccessMaskAt(long index, int value) { VH_dstAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryBarrier sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryBarrier pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryBarrier srcAccessMask(int value) { VH_srcAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryBarrier dstAccessMask(int value) { VH_dstAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryBarrier _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryBarrier _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryBarrier _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryBarrier _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccessMask, index), LAYOUT_srcAccessMask); }
    public MemorySegment _srcAccessMask() { return _srcAccessMaskAt(0L); }
    public VkMemoryBarrier _srcAccessMaskAt(long index, MemorySegment src) { _srcAccessMaskAt(index).copyFrom(src); return this; }
    public VkMemoryBarrier _srcAccessMask(MemorySegment src) { return _srcAccessMaskAt(0L, src); }
    public MemorySegment _dstAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccessMask, index), LAYOUT_dstAccessMask); }
    public MemorySegment _dstAccessMask() { return _dstAccessMaskAt(0L); }
    public VkMemoryBarrier _dstAccessMaskAt(long index, MemorySegment src) { _dstAccessMaskAt(index).copyFrom(src); return this; }
    public VkMemoryBarrier _dstAccessMask(MemorySegment src) { return _dstAccessMaskAt(0L, src); }
}
