// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindMemoryStatusKHR`.
/// ## Layout
/// ```
/// struct VkBindMemoryStatusKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkResult* pResult;
/// }
/// ```
public final class VkBindMemoryStatusKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pResult")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pResult = LAYOUT.byteOffset(PathElement.groupElement("pResult"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pResult = LAYOUT.select(PathElement.groupElement("pResult"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pResult = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResult"));

    public VkBindMemoryStatusKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindMemoryStatusKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatusKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindMemoryStatusKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatusKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindMemoryStatusKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatusKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindMemoryStatusKHR alloc(SegmentAllocator allocator) { return new VkBindMemoryStatusKHR(allocator.allocate(LAYOUT), 1); }
    public static VkBindMemoryStatusKHR alloc(SegmentAllocator allocator, long count) { return new VkBindMemoryStatusKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBindMemoryStatusKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS); }
    public static VkBindMemoryStatusKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS);
        return s;
    }
    public VkBindMemoryStatusKHR copyFrom(VkBindMemoryStatusKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindMemoryStatusKHR reinterpret(long count) { return new VkBindMemoryStatusKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindMemoryStatusKHR asSlice(long index) { return new VkBindMemoryStatusKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindMemoryStatusKHR asSlice(long index, long count) { return new VkBindMemoryStatusKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindMemoryStatusKHR at(long index, Consumer<VkBindMemoryStatusKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pResultAt(long index) { return (MemorySegment) VH_pResult.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pResult() { return (MemorySegment) VH_pResult.get(this.segment(), 0L, 0L); }
    public VkBindMemoryStatusKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindMemoryStatusKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindMemoryStatusKHR pResultAt(long index, MemorySegment value) { VH_pResult.set(this.segment(), 0L, index, value); return this; }
    public VkBindMemoryStatusKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindMemoryStatusKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindMemoryStatusKHR pResult(MemorySegment value) { VH_pResult.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindMemoryStatusKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindMemoryStatusKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindMemoryStatusKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindMemoryStatusKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pResultAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pResult, index), LAYOUT_pResult); }
    public MemorySegment _pResult() { return _pResultAt(0L); }
    public VkBindMemoryStatusKHR _pResultAt(long index, MemorySegment src) { _pResultAt(index).copyFrom(src); return this; }
    public VkBindMemoryStatusKHR _pResult(MemorySegment src) { return _pResultAt(0L, src); }
}
