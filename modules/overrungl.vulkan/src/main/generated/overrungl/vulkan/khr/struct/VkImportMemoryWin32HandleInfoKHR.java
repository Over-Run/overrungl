// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMemoryWin32HandleInfoKHR`.
/// ## Layout
/// ```
/// struct VkImportMemoryWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkExternalMemoryHandleTypeFlagBits handleType;
///     HANDLE handle;
///     LPCWSTR name;
/// }
/// ```
public final class VkImportMemoryWin32HandleInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle"),
        ValueLayout.JAVA_INT.withName("name")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    public VkImportMemoryWin32HandleInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMemoryWin32HandleInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryWin32HandleInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMemoryWin32HandleInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryWin32HandleInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMemoryWin32HandleInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryWin32HandleInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMemoryWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkImportMemoryWin32HandleInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkImportMemoryWin32HandleInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkImportMemoryWin32HandleInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR); }
    public static VkImportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR);
        return s;
    }
    public VkImportMemoryWin32HandleInfoKHR copyFrom(VkImportMemoryWin32HandleInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMemoryWin32HandleInfoKHR reinterpret(long count) { return new VkImportMemoryWin32HandleInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMemoryWin32HandleInfoKHR asSlice(long index) { return new VkImportMemoryWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMemoryWin32HandleInfoKHR asSlice(long index, long count) { return new VkImportMemoryWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMemoryWin32HandleInfoKHR at(long index, Consumer<VkImportMemoryWin32HandleInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int handleAt(long index) { return (int) VH_handle.get(this.segment(), 0L, index); }
    public int nameAt(long index) { return (int) VH_name.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public int handle() { return (int) VH_handle.get(this.segment(), 0L, 0L); }
    public int name() { return (int) VH_name.get(this.segment(), 0L, 0L); }
    public VkImportMemoryWin32HandleInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR handleAt(long index, int value) { VH_handle.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR nameAt(long index, int value) { VH_name.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR handle(int value) { VH_handle.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoKHR name(int value) { VH_name.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMemoryWin32HandleInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMemoryWin32HandleInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkImportMemoryWin32HandleInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
    public MemorySegment _handleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handle, index), LAYOUT_handle); }
    public MemorySegment _handle() { return _handleAt(0L); }
    public VkImportMemoryWin32HandleInfoKHR _handleAt(long index, MemorySegment src) { _handleAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoKHR _handle(MemorySegment src) { return _handleAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkImportMemoryWin32HandleInfoKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoKHR _name(MemorySegment src) { return _nameAt(0L, src); }
}
