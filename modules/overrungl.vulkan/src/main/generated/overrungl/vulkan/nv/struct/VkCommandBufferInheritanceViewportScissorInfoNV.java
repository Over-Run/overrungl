// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferInheritanceViewportScissorInfoNV`.
/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceViewportScissorInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 viewportScissor2D;
///     uint32_t viewportDepthCount;
///     const VkViewport* pViewportDepths;
/// }
/// ```
public final class VkCommandBufferInheritanceViewportScissorInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportScissor2D"),
        ValueLayout.JAVA_INT.withName("viewportDepthCount"),
        ValueLayout.ADDRESS.withName("pViewportDepths")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_viewportScissor2D = LAYOUT.byteOffset(PathElement.groupElement("viewportScissor2D"));
    public static final long OFFSET_viewportDepthCount = LAYOUT.byteOffset(PathElement.groupElement("viewportDepthCount"));
    public static final long OFFSET_pViewportDepths = LAYOUT.byteOffset(PathElement.groupElement("pViewportDepths"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_viewportScissor2D = LAYOUT.select(PathElement.groupElement("viewportScissor2D"));
    public static final MemoryLayout LAYOUT_viewportDepthCount = LAYOUT.select(PathElement.groupElement("viewportDepthCount"));
    public static final MemoryLayout LAYOUT_pViewportDepths = LAYOUT.select(PathElement.groupElement("pViewportDepths"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_viewportScissor2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportScissor2D"));
    public static final VarHandle VH_viewportDepthCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportDepthCount"));
    public static final VarHandle VH_pViewportDepths = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportDepths"));

    public VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceViewportScissorInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceViewportScissorInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV); }
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
        return s;
    }
    public VkCommandBufferInheritanceViewportScissorInfoNV copyFrom(VkCommandBufferInheritanceViewportScissorInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV reinterpret(long count) { return new VkCommandBufferInheritanceViewportScissorInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferInheritanceViewportScissorInfoNV asSlice(long index) { return new VkCommandBufferInheritanceViewportScissorInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferInheritanceViewportScissorInfoNV asSlice(long index, long count) { return new VkCommandBufferInheritanceViewportScissorInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferInheritanceViewportScissorInfoNV at(long index, Consumer<VkCommandBufferInheritanceViewportScissorInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int viewportScissor2DAt(long index) { return (int) VH_viewportScissor2D.get(this.segment(), 0L, index); }
    public int viewportDepthCountAt(long index) { return (int) VH_viewportDepthCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewportDepthsAt(long index) { return (MemorySegment) VH_pViewportDepths.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int viewportScissor2D() { return (int) VH_viewportScissor2D.get(this.segment(), 0L, 0L); }
    public int viewportDepthCount() { return (int) VH_viewportDepthCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewportDepths() { return (MemorySegment) VH_pViewportDepths.get(this.segment(), 0L, 0L); }
    public VkCommandBufferInheritanceViewportScissorInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2DAt(long index, int value) { VH_viewportScissor2D.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCountAt(long index, int value) { VH_viewportDepthCount.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepthsAt(long index, MemorySegment value) { VH_pViewportDepths.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(int value) { VH_viewportScissor2D.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(int value) { VH_viewportDepthCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(MemorySegment value) { VH_pViewportDepths.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferInheritanceViewportScissorInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferInheritanceViewportScissorInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _viewportScissor2DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportScissor2D, index), LAYOUT_viewportScissor2D); }
    public MemorySegment _viewportScissor2D() { return _viewportScissor2DAt(0L); }
    public VkCommandBufferInheritanceViewportScissorInfoNV _viewportScissor2DAt(long index, MemorySegment src) { _viewportScissor2DAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV _viewportScissor2D(MemorySegment src) { return _viewportScissor2DAt(0L, src); }
    public MemorySegment _viewportDepthCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportDepthCount, index), LAYOUT_viewportDepthCount); }
    public MemorySegment _viewportDepthCount() { return _viewportDepthCountAt(0L); }
    public VkCommandBufferInheritanceViewportScissorInfoNV _viewportDepthCountAt(long index, MemorySegment src) { _viewportDepthCountAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV _viewportDepthCount(MemorySegment src) { return _viewportDepthCountAt(0L, src); }
    public MemorySegment _pViewportDepthsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewportDepths, index), LAYOUT_pViewportDepths); }
    public MemorySegment _pViewportDepths() { return _pViewportDepthsAt(0L); }
    public VkCommandBufferInheritanceViewportScissorInfoNV _pViewportDepthsAt(long index, MemorySegment src) { _pViewportDepthsAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceViewportScissorInfoNV _pViewportDepths(MemorySegment src) { return _pViewportDepthsAt(0L, src); }
}
