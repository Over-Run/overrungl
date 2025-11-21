// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportFenceFdInfoKHR`.
/// ## Layout
/// ```
/// struct VkImportFenceFdInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFence fence;
///     VkFenceImportFlags flags;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     int fd;
/// }
/// ```
public final class VkImportFenceFdInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("fence"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("fd")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fence = LAYOUT.byteOffset(PathElement.groupElement("fence"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final long OFFSET_fd = LAYOUT.byteOffset(PathElement.groupElement("fd"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fence = LAYOUT.select(PathElement.groupElement("fence"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_fd = LAYOUT.select(PathElement.groupElement("fd"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    public static final VarHandle VH_fd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fd"));

    public VkImportFenceFdInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportFenceFdInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceFdInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportFenceFdInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceFdInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportFenceFdInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceFdInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportFenceFdInfoKHR alloc(SegmentAllocator allocator) { return new VkImportFenceFdInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkImportFenceFdInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkImportFenceFdInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImportFenceFdInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalFenceFd.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR); }
    public static VkImportFenceFdInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalFenceFd.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR);
        return s;
    }
    public VkImportFenceFdInfoKHR copyFrom(VkImportFenceFdInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportFenceFdInfoKHR reinterpret(long count) { return new VkImportFenceFdInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportFenceFdInfoKHR asSlice(long index) { return new VkImportFenceFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportFenceFdInfoKHR asSlice(long index, long count) { return new VkImportFenceFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportFenceFdInfoKHR at(long index, Consumer<VkImportFenceFdInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long fenceAt(long index) { return (long) VH_fence.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int fdAt(long index) { return (int) VH_fd.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long fence() { return (long) VH_fence.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public int fd() { return (int) VH_fd.get(this.segment(), 0L, 0L); }
    public VkImportFenceFdInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceFdInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceFdInfoKHR fenceAt(long index, long value) { VH_fence.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceFdInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceFdInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceFdInfoKHR fdAt(long index, int value) { VH_fd.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceFdInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceFdInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceFdInfoKHR fence(long value) { VH_fence.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceFdInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceFdInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceFdInfoKHR fd(int value) { VH_fd.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportFenceFdInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportFenceFdInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportFenceFdInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportFenceFdInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fence, index), LAYOUT_fence); }
    public MemorySegment _fence() { return _fenceAt(0L); }
    public VkImportFenceFdInfoKHR _fenceAt(long index, MemorySegment src) { _fenceAt(index).copyFrom(src); return this; }
    public VkImportFenceFdInfoKHR _fence(MemorySegment src) { return _fenceAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImportFenceFdInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImportFenceFdInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkImportFenceFdInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkImportFenceFdInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
    public MemorySegment _fdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fd, index), LAYOUT_fd); }
    public MemorySegment _fd() { return _fdAt(0L); }
    public VkImportFenceFdInfoKHR _fdAt(long index, MemorySegment src) { _fdAt(index).copyFrom(src); return this; }
    public VkImportFenceFdInfoKHR _fd(MemorySegment src) { return _fdAt(0L, src); }
}
