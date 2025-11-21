// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMemoryWin32HandleInfoKHR`.
/// ## Layout
/// ```
/// struct VkExportMemoryWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const SECURITY_ATTRIBUTES* pAttributes;
///     DWORD dwAccess;
///     LPCWSTR name;
/// }
/// ```
public final class VkExportMemoryWin32HandleInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess"),
        ValueLayout.JAVA_INT.withName("name")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pAttributes = LAYOUT.byteOffset(PathElement.groupElement("pAttributes"));
    public static final long OFFSET_dwAccess = LAYOUT.byteOffset(PathElement.groupElement("dwAccess"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pAttributes = LAYOUT.select(PathElement.groupElement("pAttributes"));
    public static final MemoryLayout LAYOUT_dwAccess = LAYOUT.select(PathElement.groupElement("dwAccess"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));
    public static final VarHandle VH_dwAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dwAccess"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    public VkExportMemoryWin32HandleInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMemoryWin32HandleInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMemoryWin32HandleInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMemoryWin32HandleInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMemoryWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkExportMemoryWin32HandleInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkExportMemoryWin32HandleInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkExportMemoryWin32HandleInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR); }
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR);
        return s;
    }
    public VkExportMemoryWin32HandleInfoKHR copyFrom(VkExportMemoryWin32HandleInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMemoryWin32HandleInfoKHR reinterpret(long count) { return new VkExportMemoryWin32HandleInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMemoryWin32HandleInfoKHR asSlice(long index) { return new VkExportMemoryWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMemoryWin32HandleInfoKHR asSlice(long index, long count) { return new VkExportMemoryWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMemoryWin32HandleInfoKHR at(long index, Consumer<VkExportMemoryWin32HandleInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pAttributesAt(long index) { return (MemorySegment) VH_pAttributes.get(this.segment(), 0L, index); }
    public int dwAccessAt(long index) { return (int) VH_dwAccess.get(this.segment(), 0L, index); }
    public int nameAt(long index) { return (int) VH_name.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttributes() { return (MemorySegment) VH_pAttributes.get(this.segment(), 0L, 0L); }
    public int dwAccess() { return (int) VH_dwAccess.get(this.segment(), 0L, 0L); }
    public int name() { return (int) VH_name.get(this.segment(), 0L, 0L); }
    public VkExportMemoryWin32HandleInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR pAttributesAt(long index, MemorySegment value) { VH_pAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR dwAccessAt(long index, int value) { VH_dwAccess.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR nameAt(long index, int value) { VH_name.set(this.segment(), 0L, index, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR pAttributes(MemorySegment value) { VH_pAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR dwAccess(int value) { VH_dwAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMemoryWin32HandleInfoKHR name(int value) { VH_name.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMemoryWin32HandleInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMemoryWin32HandleInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pAttributesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttributes, index), LAYOUT_pAttributes); }
    public MemorySegment _pAttributes() { return _pAttributesAt(0L); }
    public VkExportMemoryWin32HandleInfoKHR _pAttributesAt(long index, MemorySegment src) { _pAttributesAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoKHR _pAttributes(MemorySegment src) { return _pAttributesAt(0L, src); }
    public MemorySegment _dwAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dwAccess, index), LAYOUT_dwAccess); }
    public MemorySegment _dwAccess() { return _dwAccessAt(0L); }
    public VkExportMemoryWin32HandleInfoKHR _dwAccessAt(long index, MemorySegment src) { _dwAccessAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoKHR _dwAccess(MemorySegment src) { return _dwAccessAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkExportMemoryWin32HandleInfoKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkExportMemoryWin32HandleInfoKHR _name(MemorySegment src) { return _nameAt(0L, src); }
}
