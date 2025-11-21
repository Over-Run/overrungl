// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindMemoryStatus`.
/// ## Layout
/// ```
/// struct VkBindMemoryStatus {
///     VkStructureType sType;
///     const void* pNext;
///     VkResult* pResult;
/// }
/// ```
public final class VkBindMemoryStatus extends GroupType {
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

    public VkBindMemoryStatus(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindMemoryStatus of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatus(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindMemoryStatus ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatus(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindMemoryStatus ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatus(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindMemoryStatus alloc(SegmentAllocator allocator) { return new VkBindMemoryStatus(allocator.allocate(LAYOUT), 1); }
    public static VkBindMemoryStatus alloc(SegmentAllocator allocator, long count) { return new VkBindMemoryStatus(allocator.allocate(LAYOUT, count), count); }
    public static VkBindMemoryStatus allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS); }
    public static VkBindMemoryStatus allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS);
        return s;
    }
    public VkBindMemoryStatus copyFrom(VkBindMemoryStatus src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindMemoryStatus reinterpret(long count) { return new VkBindMemoryStatus(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindMemoryStatus asSlice(long index) { return new VkBindMemoryStatus(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindMemoryStatus asSlice(long index, long count) { return new VkBindMemoryStatus(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindMemoryStatus at(long index, Consumer<VkBindMemoryStatus> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pResultAt(long index) { return (MemorySegment) VH_pResult.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pResult() { return (MemorySegment) VH_pResult.get(this.segment(), 0L, 0L); }
    public VkBindMemoryStatus sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindMemoryStatus pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindMemoryStatus pResultAt(long index, MemorySegment value) { VH_pResult.set(this.segment(), 0L, index, value); return this; }
    public VkBindMemoryStatus sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindMemoryStatus pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindMemoryStatus pResult(MemorySegment value) { VH_pResult.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindMemoryStatus _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindMemoryStatus _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindMemoryStatus _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindMemoryStatus _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pResultAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pResult, index), LAYOUT_pResult); }
    public MemorySegment _pResult() { return _pResultAt(0L); }
    public VkBindMemoryStatus _pResultAt(long index, MemorySegment src) { _pResultAt(index).copyFrom(src); return this; }
    public VkBindMemoryStatus _pResult(MemorySegment src) { return _pResultAt(0L, src); }
}
