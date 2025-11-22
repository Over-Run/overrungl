// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportFenceWin32HandleInfoKHR`.
/// ## Layout
/// ```
/// struct VkImportFenceWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFence fence;
///     VkFenceImportFlags flags;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     HANDLE handle;
///     LPCWSTR name;
/// }
/// ```
public final class VkImportFenceWin32HandleInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("fence"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle"),
        ValueLayout.JAVA_INT.withName("name")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fence = LAYOUT.byteOffset(PathElement.groupElement("fence"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fence = LAYOUT.select(PathElement.groupElement("fence"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    public VkImportFenceWin32HandleInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportFenceWin32HandleInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceWin32HandleInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportFenceWin32HandleInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceWin32HandleInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportFenceWin32HandleInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceWin32HandleInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportFenceWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkImportFenceWin32HandleInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkImportFenceWin32HandleInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkImportFenceWin32HandleInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImportFenceWin32HandleInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalFenceWin32.VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR); }
    public static VkImportFenceWin32HandleInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalFenceWin32.VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR);
        return s;
    }
    public VkImportFenceWin32HandleInfoKHR copyFrom(VkImportFenceWin32HandleInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportFenceWin32HandleInfoKHR reinterpret(long count) { return new VkImportFenceWin32HandleInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportFenceWin32HandleInfoKHR asSlice(long index) { return new VkImportFenceWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportFenceWin32HandleInfoKHR asSlice(long index, long count) { return new VkImportFenceWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportFenceWin32HandleInfoKHR at(long index, Consumer<VkImportFenceWin32HandleInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long fenceAt(long index) { return (long) VH_fence.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int handleAt(long index) { return (int) VH_handle.get(this.segment(), 0L, index); }
    public int nameAt(long index) { return (int) VH_name.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long fence() { return (long) VH_fence.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public int handle() { return (int) VH_handle.get(this.segment(), 0L, 0L); }
    public int name() { return (int) VH_name.get(this.segment(), 0L, 0L); }
    public VkImportFenceWin32HandleInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR fenceAt(long index, long value) { VH_fence.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR handleAt(long index, int value) { VH_handle.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR nameAt(long index, int value) { VH_name.set(this.segment(), 0L, index, value); return this; }
    public VkImportFenceWin32HandleInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceWin32HandleInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceWin32HandleInfoKHR fence(long value) { VH_fence.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceWin32HandleInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceWin32HandleInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceWin32HandleInfoKHR handle(int value) { VH_handle.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportFenceWin32HandleInfoKHR name(int value) { VH_name.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fence, index), LAYOUT_fence); }
    public MemorySegment _fence() { return _fenceAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _fenceAt(long index, MemorySegment src) { _fenceAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _fence(MemorySegment src) { return _fenceAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
    public MemorySegment _handleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handle, index), LAYOUT_handle); }
    public MemorySegment _handle() { return _handleAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _handleAt(long index, MemorySegment src) { _handleAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _handle(MemorySegment src) { return _handleAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkImportFenceWin32HandleInfoKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkImportFenceWin32HandleInfoKHR _name(MemorySegment src) { return _nameAt(0L, src); }
}
