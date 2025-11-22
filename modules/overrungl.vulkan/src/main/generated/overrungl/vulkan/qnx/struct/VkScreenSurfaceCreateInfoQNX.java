// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qnx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkScreenSurfaceCreateInfoQNX`.
/// ## Layout
/// ```
/// struct VkScreenSurfaceCreateInfoQNX {
///     VkStructureType sType;
///     const void* pNext;
///     VkScreenSurfaceCreateFlagsQNX flags;
///     struct _screen_context* context;
///     struct _screen_window* window;
/// }
/// ```
public final class VkScreenSurfaceCreateInfoQNX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("context"),
        ValueLayout.ADDRESS.withName("window")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_context = LAYOUT.byteOffset(PathElement.groupElement("context"));
    public static final long OFFSET_window = LAYOUT.byteOffset(PathElement.groupElement("window"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_context = LAYOUT.select(PathElement.groupElement("context"));
    public static final MemoryLayout LAYOUT_window = LAYOUT.select(PathElement.groupElement("window"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_context = LAYOUT.arrayElementVarHandle(PathElement.groupElement("context"));
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    public VkScreenSurfaceCreateInfoQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkScreenSurfaceCreateInfoQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment, estimateCount(segment, LAYOUT)); }
    public static VkScreenSurfaceCreateInfoQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkScreenSurfaceCreateInfoQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkScreenSurfaceCreateInfoQNX alloc(SegmentAllocator allocator) { return new VkScreenSurfaceCreateInfoQNX(allocator.allocate(LAYOUT), 1); }
    public static VkScreenSurfaceCreateInfoQNX alloc(SegmentAllocator allocator, long count) { return new VkScreenSurfaceCreateInfoQNX(allocator.allocate(LAYOUT, count), count); }
    public static VkScreenSurfaceCreateInfoQNX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qnx.VKQNXScreenSurface.VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX); }
    public static VkScreenSurfaceCreateInfoQNX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qnx.VKQNXScreenSurface.VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX);
        return s;
    }
    public VkScreenSurfaceCreateInfoQNX copyFrom(VkScreenSurfaceCreateInfoQNX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkScreenSurfaceCreateInfoQNX reinterpret(long count) { return new VkScreenSurfaceCreateInfoQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkScreenSurfaceCreateInfoQNX asSlice(long index) { return new VkScreenSurfaceCreateInfoQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkScreenSurfaceCreateInfoQNX asSlice(long index, long count) { return new VkScreenSurfaceCreateInfoQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkScreenSurfaceCreateInfoQNX at(long index, Consumer<VkScreenSurfaceCreateInfoQNX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment contextAt(long index) { return (MemorySegment) VH_context.get(this.segment(), 0L, index); }
    public MemorySegment windowAt(long index) { return (MemorySegment) VH_window.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment context() { return (MemorySegment) VH_context.get(this.segment(), 0L, 0L); }
    public MemorySegment window() { return (MemorySegment) VH_window.get(this.segment(), 0L, 0L); }
    public VkScreenSurfaceCreateInfoQNX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkScreenSurfaceCreateInfoQNX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkScreenSurfaceCreateInfoQNX flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkScreenSurfaceCreateInfoQNX contextAt(long index, MemorySegment value) { VH_context.set(this.segment(), 0L, index, value); return this; }
    public VkScreenSurfaceCreateInfoQNX windowAt(long index, MemorySegment value) { VH_window.set(this.segment(), 0L, index, value); return this; }
    public VkScreenSurfaceCreateInfoQNX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenSurfaceCreateInfoQNX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenSurfaceCreateInfoQNX flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenSurfaceCreateInfoQNX context(MemorySegment value) { VH_context.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenSurfaceCreateInfoQNX window(MemorySegment value) { VH_window.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkScreenSurfaceCreateInfoQNX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkScreenSurfaceCreateInfoQNX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkScreenSurfaceCreateInfoQNX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkScreenSurfaceCreateInfoQNX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkScreenSurfaceCreateInfoQNX _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkScreenSurfaceCreateInfoQNX _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _contextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_context, index), LAYOUT_context); }
    public MemorySegment _context() { return _contextAt(0L); }
    public VkScreenSurfaceCreateInfoQNX _contextAt(long index, MemorySegment src) { _contextAt(index).copyFrom(src); return this; }
    public VkScreenSurfaceCreateInfoQNX _context(MemorySegment src) { return _contextAt(0L, src); }
    public MemorySegment _windowAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_window, index), LAYOUT_window); }
    public MemorySegment _window() { return _windowAt(0L); }
    public VkScreenSurfaceCreateInfoQNX _windowAt(long index, MemorySegment src) { _windowAt(index).copyFrom(src); return this; }
    public VkScreenSurfaceCreateInfoQNX _window(MemorySegment src) { return _windowAt(0L, src); }
}
