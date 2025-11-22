// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWaylandSurfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkWaylandSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkWaylandSurfaceCreateFlagsKHR flags;
///     struct wl_display* display;
///     struct wl_surface* surface;
/// }
/// ```
public final class VkWaylandSurfaceCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("surface")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_display = LAYOUT.byteOffset(PathElement.groupElement("display"));
    public static final long OFFSET_surface = LAYOUT.byteOffset(PathElement.groupElement("surface"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_display = LAYOUT.select(PathElement.groupElement("display"));
    public static final MemoryLayout LAYOUT_surface = LAYOUT.select(PathElement.groupElement("surface"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    public VkWaylandSurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWaylandSurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkWaylandSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWaylandSurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWaylandSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkWaylandSurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkWaylandSurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWaylandSurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRWaylandSurface.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR); }
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRWaylandSurface.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR);
        return s;
    }
    public VkWaylandSurfaceCreateInfoKHR copyFrom(VkWaylandSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWaylandSurfaceCreateInfoKHR reinterpret(long count) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWaylandSurfaceCreateInfoKHR asSlice(long index) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWaylandSurfaceCreateInfoKHR asSlice(long index, long count) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWaylandSurfaceCreateInfoKHR at(long index, Consumer<VkWaylandSurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment displayAt(long index) { return (MemorySegment) VH_display.get(this.segment(), 0L, index); }
    public MemorySegment surfaceAt(long index) { return (MemorySegment) VH_surface.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment display() { return (MemorySegment) VH_display.get(this.segment(), 0L, 0L); }
    public MemorySegment surface() { return (MemorySegment) VH_surface.get(this.segment(), 0L, 0L); }
    public VkWaylandSurfaceCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR displayAt(long index, MemorySegment value) { VH_display.set(this.segment(), 0L, index, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR surfaceAt(long index, MemorySegment value) { VH_surface.set(this.segment(), 0L, index, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR display(MemorySegment value) { VH_display.set(this.segment(), 0L, 0L, value); return this; }
    public VkWaylandSurfaceCreateInfoKHR surface(MemorySegment value) { VH_surface.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWaylandSurfaceCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWaylandSurfaceCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWaylandSurfaceCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWaylandSurfaceCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkWaylandSurfaceCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkWaylandSurfaceCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _displayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_display, index), LAYOUT_display); }
    public MemorySegment _display() { return _displayAt(0L); }
    public VkWaylandSurfaceCreateInfoKHR _displayAt(long index, MemorySegment src) { _displayAt(index).copyFrom(src); return this; }
    public VkWaylandSurfaceCreateInfoKHR _display(MemorySegment src) { return _displayAt(0L, src); }
    public MemorySegment _surfaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_surface, index), LAYOUT_surface); }
    public MemorySegment _surface() { return _surfaceAt(0L); }
    public VkWaylandSurfaceCreateInfoKHR _surfaceAt(long index, MemorySegment src) { _surfaceAt(index).copyFrom(src); return this; }
    public VkWaylandSurfaceCreateInfoKHR _surface(MemorySegment src) { return _surfaceAt(0L, src); }
}
