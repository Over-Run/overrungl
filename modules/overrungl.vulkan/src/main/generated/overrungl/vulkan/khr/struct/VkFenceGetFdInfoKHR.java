// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFenceGetFdInfoKHR`.
/// ## Layout
/// ```
/// struct VkFenceGetFdInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFence fence;
///     VkExternalFenceHandleTypeFlagBits handleType;
/// }
/// ```
public final class VkFenceGetFdInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("fence"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fence = LAYOUT.byteOffset(PathElement.groupElement("fence"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fence = LAYOUT.select(PathElement.groupElement("fence"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    public VkFenceGetFdInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFenceGetFdInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFenceGetFdInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkFenceGetFdInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFenceGetFdInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFenceGetFdInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFenceGetFdInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFenceGetFdInfoKHR alloc(SegmentAllocator allocator) { return new VkFenceGetFdInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkFenceGetFdInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkFenceGetFdInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkFenceGetFdInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalFenceFd.VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR); }
    public static VkFenceGetFdInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalFenceFd.VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR);
        return s;
    }
    public VkFenceGetFdInfoKHR copyFrom(VkFenceGetFdInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFenceGetFdInfoKHR reinterpret(long count) { return new VkFenceGetFdInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFenceGetFdInfoKHR asSlice(long index) { return new VkFenceGetFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFenceGetFdInfoKHR asSlice(long index, long count) { return new VkFenceGetFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFenceGetFdInfoKHR at(long index, Consumer<VkFenceGetFdInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long fenceAt(long index) { return (long) VH_fence.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long fence() { return (long) VH_fence.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public VkFenceGetFdInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFenceGetFdInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFenceGetFdInfoKHR fenceAt(long index, long value) { VH_fence.set(this.segment(), 0L, index, value); return this; }
    public VkFenceGetFdInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkFenceGetFdInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFenceGetFdInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFenceGetFdInfoKHR fence(long value) { VH_fence.set(this.segment(), 0L, 0L, value); return this; }
    public VkFenceGetFdInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFenceGetFdInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFenceGetFdInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFenceGetFdInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFenceGetFdInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fence, index), LAYOUT_fence); }
    public MemorySegment _fence() { return _fenceAt(0L); }
    public VkFenceGetFdInfoKHR _fenceAt(long index, MemorySegment src) { _fenceAt(index).copyFrom(src); return this; }
    public VkFenceGetFdInfoKHR _fence(MemorySegment src) { return _fenceAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkFenceGetFdInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkFenceGetFdInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
}
