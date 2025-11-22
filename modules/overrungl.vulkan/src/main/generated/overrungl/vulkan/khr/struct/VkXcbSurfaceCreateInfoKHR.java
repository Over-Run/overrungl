// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkXcbSurfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkXcbSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkXcbSurfaceCreateFlagsKHR flags;
///     xcb_connection_t* connection;
///     xcb_window_t window;
/// }
/// ```
public final class VkXcbSurfaceCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("connection"),
        ValueLayout.JAVA_INT.withName("window")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_connection = LAYOUT.byteOffset(PathElement.groupElement("connection"));
    public static final long OFFSET_window = LAYOUT.byteOffset(PathElement.groupElement("window"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_connection = LAYOUT.select(PathElement.groupElement("connection"));
    public static final MemoryLayout LAYOUT_window = LAYOUT.select(PathElement.groupElement("window"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_connection = LAYOUT.arrayElementVarHandle(PathElement.groupElement("connection"));
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    public VkXcbSurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkXcbSurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkXcbSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkXcbSurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkXcbSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkXcbSurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkXcbSurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkXcbSurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkXcbSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRXcbSurface.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR); }
    public static VkXcbSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRXcbSurface.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR);
        return s;
    }
    public VkXcbSurfaceCreateInfoKHR copyFrom(VkXcbSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkXcbSurfaceCreateInfoKHR reinterpret(long count) { return new VkXcbSurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkXcbSurfaceCreateInfoKHR asSlice(long index) { return new VkXcbSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkXcbSurfaceCreateInfoKHR asSlice(long index, long count) { return new VkXcbSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkXcbSurfaceCreateInfoKHR at(long index, Consumer<VkXcbSurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment connectionAt(long index) { return (MemorySegment) VH_connection.get(this.segment(), 0L, index); }
    public int windowAt(long index) { return (int) VH_window.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment connection() { return (MemorySegment) VH_connection.get(this.segment(), 0L, 0L); }
    public int window() { return (int) VH_window.get(this.segment(), 0L, 0L); }
    public VkXcbSurfaceCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkXcbSurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkXcbSurfaceCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkXcbSurfaceCreateInfoKHR connectionAt(long index, MemorySegment value) { VH_connection.set(this.segment(), 0L, index, value); return this; }
    public VkXcbSurfaceCreateInfoKHR windowAt(long index, int value) { VH_window.set(this.segment(), 0L, index, value); return this; }
    public VkXcbSurfaceCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkXcbSurfaceCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkXcbSurfaceCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkXcbSurfaceCreateInfoKHR connection(MemorySegment value) { VH_connection.set(this.segment(), 0L, 0L, value); return this; }
    public VkXcbSurfaceCreateInfoKHR window(int value) { VH_window.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkXcbSurfaceCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkXcbSurfaceCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkXcbSurfaceCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkXcbSurfaceCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkXcbSurfaceCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkXcbSurfaceCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _connectionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_connection, index), LAYOUT_connection); }
    public MemorySegment _connection() { return _connectionAt(0L); }
    public VkXcbSurfaceCreateInfoKHR _connectionAt(long index, MemorySegment src) { _connectionAt(index).copyFrom(src); return this; }
    public VkXcbSurfaceCreateInfoKHR _connection(MemorySegment src) { return _connectionAt(0L, src); }
    public MemorySegment _windowAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_window, index), LAYOUT_window); }
    public MemorySegment _window() { return _windowAt(0L); }
    public VkXcbSurfaceCreateInfoKHR _windowAt(long index, MemorySegment src) { _windowAt(index).copyFrom(src); return this; }
    public VkXcbSurfaceCreateInfoKHR _window(MemorySegment src) { return _windowAt(0L, src); }
}
