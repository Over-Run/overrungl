// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWin32SurfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkWin32SurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkWin32SurfaceCreateFlagsKHR flags;
///     HINSTANCE hinstance;
///     HWND hwnd;
/// }
/// ```
public final class VkWin32SurfaceCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("hinstance"),
        ValueLayout.JAVA_INT.withName("hwnd")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_hinstance = LAYOUT.byteOffset(PathElement.groupElement("hinstance"));
    public static final long OFFSET_hwnd = LAYOUT.byteOffset(PathElement.groupElement("hwnd"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_hinstance = LAYOUT.select(PathElement.groupElement("hinstance"));
    public static final MemoryLayout LAYOUT_hwnd = LAYOUT.select(PathElement.groupElement("hwnd"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_hinstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hinstance"));
    public static final VarHandle VH_hwnd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hwnd"));

    public VkWin32SurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWin32SurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkWin32SurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWin32SurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWin32SurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkWin32SurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkWin32SurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWin32SurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRWin32Surface.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR); }
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRWin32Surface.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR);
        return s;
    }
    public VkWin32SurfaceCreateInfoKHR copyFrom(VkWin32SurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWin32SurfaceCreateInfoKHR reinterpret(long count) { return new VkWin32SurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWin32SurfaceCreateInfoKHR asSlice(long index) { return new VkWin32SurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWin32SurfaceCreateInfoKHR asSlice(long index, long count) { return new VkWin32SurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWin32SurfaceCreateInfoKHR at(long index, Consumer<VkWin32SurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int hinstanceAt(long index) { return (int) VH_hinstance.get(this.segment(), 0L, index); }
    public int hwndAt(long index) { return (int) VH_hwnd.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int hinstance() { return (int) VH_hinstance.get(this.segment(), 0L, 0L); }
    public int hwnd() { return (int) VH_hwnd.get(this.segment(), 0L, 0L); }
    public VkWin32SurfaceCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWin32SurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWin32SurfaceCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkWin32SurfaceCreateInfoKHR hinstanceAt(long index, int value) { VH_hinstance.set(this.segment(), 0L, index, value); return this; }
    public VkWin32SurfaceCreateInfoKHR hwndAt(long index, int value) { VH_hwnd.set(this.segment(), 0L, index, value); return this; }
    public VkWin32SurfaceCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32SurfaceCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32SurfaceCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32SurfaceCreateInfoKHR hinstance(int value) { VH_hinstance.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32SurfaceCreateInfoKHR hwnd(int value) { VH_hwnd.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWin32SurfaceCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWin32SurfaceCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWin32SurfaceCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWin32SurfaceCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkWin32SurfaceCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkWin32SurfaceCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _hinstanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hinstance, index), LAYOUT_hinstance); }
    public MemorySegment _hinstance() { return _hinstanceAt(0L); }
    public VkWin32SurfaceCreateInfoKHR _hinstanceAt(long index, MemorySegment src) { _hinstanceAt(index).copyFrom(src); return this; }
    public VkWin32SurfaceCreateInfoKHR _hinstance(MemorySegment src) { return _hinstanceAt(0L, src); }
    public MemorySegment _hwndAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hwnd, index), LAYOUT_hwnd); }
    public MemorySegment _hwnd() { return _hwndAt(0L); }
    public VkWin32SurfaceCreateInfoKHR _hwndAt(long index, MemorySegment src) { _hwndAt(index).copyFrom(src); return this; }
    public VkWin32SurfaceCreateInfoKHR _hwnd(MemorySegment src) { return _hwndAt(0L, src); }
}
