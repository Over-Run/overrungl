// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentDescriptionStencilLayoutKHR`.
/// ## Layout
/// ```
/// struct VkAttachmentDescriptionStencilLayoutKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkImageLayout stencilInitialLayout;
///     VkImageLayout stencilFinalLayout;
/// }
/// ```
public final class VkAttachmentDescriptionStencilLayoutKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilInitialLayout"),
        ValueLayout.JAVA_INT.withName("stencilFinalLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stencilInitialLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilInitialLayout"));
    public static final long OFFSET_stencilFinalLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilFinalLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stencilInitialLayout = LAYOUT.select(PathElement.groupElement("stencilInitialLayout"));
    public static final MemoryLayout LAYOUT_stencilFinalLayout = LAYOUT.select(PathElement.groupElement("stencilFinalLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stencilInitialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilInitialLayout"));
    public static final VarHandle VH_stencilFinalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilFinalLayout"));

    public VkAttachmentDescriptionStencilLayoutKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentDescriptionStencilLayoutKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayoutKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentDescriptionStencilLayoutKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayoutKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentDescriptionStencilLayoutKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayoutKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentDescriptionStencilLayoutKHR alloc(SegmentAllocator allocator) { return new VkAttachmentDescriptionStencilLayoutKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentDescriptionStencilLayoutKHR alloc(SegmentAllocator allocator, long count) { return new VkAttachmentDescriptionStencilLayoutKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentDescriptionStencilLayoutKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
    public static VkAttachmentDescriptionStencilLayoutKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT);
        return s;
    }
    public VkAttachmentDescriptionStencilLayoutKHR copyFrom(VkAttachmentDescriptionStencilLayoutKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR reinterpret(long count) { return new VkAttachmentDescriptionStencilLayoutKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentDescriptionStencilLayoutKHR asSlice(long index) { return new VkAttachmentDescriptionStencilLayoutKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentDescriptionStencilLayoutKHR asSlice(long index, long count) { return new VkAttachmentDescriptionStencilLayoutKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentDescriptionStencilLayoutKHR at(long index, Consumer<VkAttachmentDescriptionStencilLayoutKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stencilInitialLayoutAt(long index) { return (int) VH_stencilInitialLayout.get(this.segment(), 0L, index); }
    public int stencilFinalLayoutAt(long index) { return (int) VH_stencilFinalLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stencilInitialLayout() { return (int) VH_stencilInitialLayout.get(this.segment(), 0L, 0L); }
    public int stencilFinalLayout() { return (int) VH_stencilFinalLayout.get(this.segment(), 0L, 0L); }
    public VkAttachmentDescriptionStencilLayoutKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayoutAt(long index, int value) { VH_stencilInitialLayout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayoutAt(long index, int value) { VH_stencilFinalLayout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayout(int value) { VH_stencilInitialLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayout(int value) { VH_stencilFinalLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentDescriptionStencilLayoutKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentDescriptionStencilLayoutKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stencilInitialLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilInitialLayout, index), LAYOUT_stencilInitialLayout); }
    public MemorySegment _stencilInitialLayout() { return _stencilInitialLayoutAt(0L); }
    public VkAttachmentDescriptionStencilLayoutKHR _stencilInitialLayoutAt(long index, MemorySegment src) { _stencilInitialLayoutAt(index).copyFrom(src); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR _stencilInitialLayout(MemorySegment src) { return _stencilInitialLayoutAt(0L, src); }
    public MemorySegment _stencilFinalLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilFinalLayout, index), LAYOUT_stencilFinalLayout); }
    public MemorySegment _stencilFinalLayout() { return _stencilFinalLayoutAt(0L); }
    public VkAttachmentDescriptionStencilLayoutKHR _stencilFinalLayoutAt(long index, MemorySegment src) { _stencilFinalLayoutAt(index).copyFrom(src); return this; }
    public VkAttachmentDescriptionStencilLayoutKHR _stencilFinalLayout(MemorySegment src) { return _stencilFinalLayoutAt(0L, src); }
}
