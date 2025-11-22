// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceFullScreenExclusiveWin32InfoEXT`.
/// ## Layout
/// ```
/// struct VkSurfaceFullScreenExclusiveWin32InfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     HMONITOR hmonitor;
/// }
/// ```
public final class VkSurfaceFullScreenExclusiveWin32InfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hmonitor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hmonitor = LAYOUT.byteOffset(PathElement.groupElement("hmonitor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hmonitor = LAYOUT.select(PathElement.groupElement("hmonitor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hmonitor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hmonitor"));

    public VkSurfaceFullScreenExclusiveWin32InfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT alloc(SegmentAllocator allocator) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT); }
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
        return s;
    }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT copyFrom(VkSurfaceFullScreenExclusiveWin32InfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT reinterpret(long count) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT asSlice(long index) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT asSlice(long index, long count) { return new VkSurfaceFullScreenExclusiveWin32InfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT at(long index, Consumer<VkSurfaceFullScreenExclusiveWin32InfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hmonitorAt(long index) { return (int) VH_hmonitor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hmonitor() { return (int) VH_hmonitor.get(this.segment(), 0L, 0L); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT hmonitorAt(long index, int value) { VH_hmonitor.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT hmonitor(int value) { VH_hmonitor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hmonitorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hmonitor, index), LAYOUT_hmonitor); }
    public MemorySegment _hmonitor() { return _hmonitorAt(0L); }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT _hmonitorAt(long index, MemorySegment src) { _hmonitorAt(index).copyFrom(src); return this; }
    public VkSurfaceFullScreenExclusiveWin32InfoEXT _hmonitor(MemorySegment src) { return _hmonitorAt(0L, src); }
}
