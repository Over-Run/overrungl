// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMemoryWin32HandleInfoNV`.
/// ## Layout
/// ```
/// struct VkExportMemoryWin32HandleInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     const SECURITY_ATTRIBUTES* pAttributes;
///     DWORD dwAccess;
/// }
/// ```
public final class VkExportMemoryWin32HandleInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pAttributes = LAYOUT.byteOffset(PathElement.groupElement("pAttributes"));
    public static final long OFFSET_dwAccess = LAYOUT.byteOffset(PathElement.groupElement("dwAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pAttributes = LAYOUT.select(PathElement.groupElement("pAttributes"));
    public static final MemoryLayout LAYOUT_dwAccess = LAYOUT.select(PathElement.groupElement("dwAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));
    public static final VarHandle VH_dwAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dwAccess"));

    public VkExportMemoryWin32HandleInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMemoryWin32HandleInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMemoryWin32HandleInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMemoryWin32HandleInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator) { return new VkExportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkExportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator, long count) { return new VkExportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV); }
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV);
        return s;
    }
    public VkExportMemoryWin32HandleInfoNV copyFrom(VkExportMemoryWin32HandleInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMemoryWin32HandleInfoNV reinterpret(long count) { return new VkExportMemoryWin32HandleInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMemoryWin32HandleInfoNV asSlice(long index) { return new VkExportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMemoryWin32HandleInfoNV asSlice(long index, long count) { return new VkExportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMemoryWin32HandleInfoNV at(long index, Consumer<VkExportMemoryWin32HandleInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pAttributesAt(long index) { return (MemorySegment) VH_pAttributes.get(this.segment(), 0L, index); }
    public int dwAccessAt(long index) { return (int) VH_dwAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttributes() { return (MemorySegment) VH_pAttributes.get(this.segment(), 0L, 0L); }
    public int dwAccess() { return (int) VH_dwAccess.get(this.segment(), 0L, 0L); }
    public VkExportMemoryWin32HandleInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoNV pAttributesAt(long index, MemorySegment value) { VH_pAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoNV dwAccessAt(long index, int value) { VH_dwAccess.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoNV pAttributes(MemorySegment value) { VH_pAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoNV dwAccess(int value) { VH_dwAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMemoryWin32HandleInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMemoryWin32HandleInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pAttributesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttributes, index), LAYOUT_pAttributes); }
    public MemorySegment _pAttributes() { return _pAttributesAt(0L); }
    public VkExportMemoryWin32HandleInfoNV _pAttributesAt(long index, MemorySegment src) { _pAttributesAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoNV _pAttributes(MemorySegment src) { return _pAttributesAt(0L, src); }
    public MemorySegment _dwAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dwAccess, index), LAYOUT_dwAccess); }
    public MemorySegment _dwAccess() { return _dwAccessAt(0L); }
    public VkExportMemoryWin32HandleInfoNV _dwAccessAt(long index, MemorySegment src) { _dwAccessAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoNV _dwAccess(MemorySegment src) { return _dwAccessAt(0L, src); }
}
