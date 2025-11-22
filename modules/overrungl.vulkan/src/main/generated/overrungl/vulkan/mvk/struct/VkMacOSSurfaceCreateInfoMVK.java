// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.mvk.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMacOSSurfaceCreateInfoMVK`.
/// ## Layout
/// ```
/// struct VkMacOSSurfaceCreateInfoMVK {
///     VkStructureType sType;
///     const void* pNext;
///     VkMacOSSurfaceCreateFlagsMVK flags;
///     const void* pView;
/// }
/// ```
public final class VkMacOSSurfaceCreateInfoMVK extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pView")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pView = LAYOUT.byteOffset(PathElement.groupElement("pView"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pView = LAYOUT.select(PathElement.groupElement("pView"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pView"));

    public VkMacOSSurfaceCreateInfoMVK(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMacOSSurfaceCreateInfoMVK of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment, estimateCount(segment, LAYOUT)); }
    public static VkMacOSSurfaceCreateInfoMVK ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMacOSSurfaceCreateInfoMVK ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMacOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator) { return new VkMacOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT), 1); }
    public static VkMacOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator, long count) { return new VkMacOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT, count), count); }
    public static VkMacOSSurfaceCreateInfoMVK allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.mvk.VKMVKMacosSurface.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK); }
    public static VkMacOSSurfaceCreateInfoMVK allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.mvk.VKMVKMacosSurface.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK);
        return s;
    }
    public VkMacOSSurfaceCreateInfoMVK copyFrom(VkMacOSSurfaceCreateInfoMVK src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMacOSSurfaceCreateInfoMVK reinterpret(long count) { return new VkMacOSSurfaceCreateInfoMVK(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMacOSSurfaceCreateInfoMVK asSlice(long index) { return new VkMacOSSurfaceCreateInfoMVK(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMacOSSurfaceCreateInfoMVK asSlice(long index, long count) { return new VkMacOSSurfaceCreateInfoMVK(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMacOSSurfaceCreateInfoMVK at(long index, Consumer<VkMacOSSurfaceCreateInfoMVK> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pViewAt(long index) { return (MemorySegment) VH_pView.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pView() { return (MemorySegment) VH_pView.get(this.segment(), 0L, 0L); }
    public VkMacOSSurfaceCreateInfoMVK sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK pViewAt(long index, MemorySegment value) { VH_pView.set(this.segment(), 0L, index, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkMacOSSurfaceCreateInfoMVK pView(MemorySegment value) { VH_pView.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMacOSSurfaceCreateInfoMVK _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMacOSSurfaceCreateInfoMVK _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMacOSSurfaceCreateInfoMVK _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMacOSSurfaceCreateInfoMVK _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkMacOSSurfaceCreateInfoMVK _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkMacOSSurfaceCreateInfoMVK _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pView, index), LAYOUT_pView); }
    public MemorySegment _pView() { return _pViewAt(0L); }
    public VkMacOSSurfaceCreateInfoMVK _pViewAt(long index, MemorySegment src) { _pViewAt(index).copyFrom(src); return this; }
    public VkMacOSSurfaceCreateInfoMVK _pView(MemorySegment src) { return _pViewAt(0L, src); }
}
