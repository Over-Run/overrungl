// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMemoryFdInfoKHR`.
/// ## Layout
/// ```
/// struct VkImportMemoryFdInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkExternalMemoryHandleTypeFlagBits handleType;
///     int fd;
/// }
/// ```
public final class VkImportMemoryFdInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("fd")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final long OFFSET_fd = LAYOUT.byteOffset(PathElement.groupElement("fd"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_fd = LAYOUT.select(PathElement.groupElement("fd"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    public static final VarHandle VH_fd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fd"));

    public VkImportMemoryFdInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMemoryFdInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryFdInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMemoryFdInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryFdInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMemoryFdInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryFdInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMemoryFdInfoKHR alloc(SegmentAllocator allocator) { return new VkImportMemoryFdInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkImportMemoryFdInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkImportMemoryFdInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMemoryFdInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalMemoryFd.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR); }
    public static VkImportMemoryFdInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalMemoryFd.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR);
        return s;
    }
    public VkImportMemoryFdInfoKHR copyFrom(VkImportMemoryFdInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMemoryFdInfoKHR reinterpret(long count) { return new VkImportMemoryFdInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMemoryFdInfoKHR asSlice(long index) { return new VkImportMemoryFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMemoryFdInfoKHR asSlice(long index, long count) { return new VkImportMemoryFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMemoryFdInfoKHR at(long index, Consumer<VkImportMemoryFdInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int fdAt(long index) { return (int) VH_fd.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public int fd() { return (int) VH_fd.get(this.segment(), 0L, 0L); }
    public VkImportMemoryFdInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryFdInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryFdInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryFdInfoKHR fdAt(long index, int value) { VH_fd.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryFdInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryFdInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryFdInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryFdInfoKHR fd(int value) { VH_fd.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMemoryFdInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMemoryFdInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMemoryFdInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMemoryFdInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkImportMemoryFdInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkImportMemoryFdInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
    public MemorySegment _fdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fd, index), LAYOUT_fd); }
    public MemorySegment _fd() { return _fdAt(0L); }
    public VkImportMemoryFdInfoKHR _fdAt(long index, MemorySegment src) { _fdAt(index).copyFrom(src); return this; }
    public VkImportMemoryFdInfoKHR _fd(MemorySegment src) { return _fdAt(0L, src); }
}
