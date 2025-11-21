// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMemoryWin32HandleInfoNV`.
/// ## Layout
/// ```
/// struct VkImportMemoryWin32HandleInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkExternalMemoryHandleTypeFlagsNV handleType;
///     HANDLE handle;
/// }
/// ```
public final class VkImportMemoryWin32HandleInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    public VkImportMemoryWin32HandleInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMemoryWin32HandleInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryWin32HandleInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMemoryWin32HandleInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryWin32HandleInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMemoryWin32HandleInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryWin32HandleInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator) { return new VkImportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkImportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator, long count) { return new VkImportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV); }
    public static VkImportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV);
        return s;
    }
    public VkImportMemoryWin32HandleInfoNV copyFrom(VkImportMemoryWin32HandleInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMemoryWin32HandleInfoNV reinterpret(long count) { return new VkImportMemoryWin32HandleInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMemoryWin32HandleInfoNV asSlice(long index) { return new VkImportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMemoryWin32HandleInfoNV asSlice(long index, long count) { return new VkImportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMemoryWin32HandleInfoNV at(long index, Consumer<VkImportMemoryWin32HandleInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int handleAt(long index) { return (int) VH_handle.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public int handle() { return (int) VH_handle.get(this.segment(), 0L, 0L); }
    public VkImportMemoryWin32HandleInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoNV handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoNV handleAt(long index, int value) { VH_handle.set(this.segment(), 0L, index, value); return this; }
    public VkImportMemoryWin32HandleInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoNV handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMemoryWin32HandleInfoNV handle(int value) { VH_handle.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMemoryWin32HandleInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMemoryWin32HandleInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkImportMemoryWin32HandleInfoNV _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoNV _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
    public MemorySegment _handleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handle, index), LAYOUT_handle); }
    public MemorySegment _handle() { return _handleAt(0L); }
    public VkImportMemoryWin32HandleInfoNV _handleAt(long index, MemorySegment src) { _handleAt(index).copyFrom(src); return this; }
    public VkImportMemoryWin32HandleInfoNV _handle(MemorySegment src) { return _handleAt(0L, src); }
}
