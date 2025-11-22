// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentReferenceStencilLayoutKHR`.
/// ## Layout
/// ```
/// struct VkAttachmentReferenceStencilLayoutKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkImageLayout stencilLayout;
/// }
/// ```
public final class VkAttachmentReferenceStencilLayoutKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stencilLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stencilLayout = LAYOUT.select(PathElement.groupElement("stencilLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stencilLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilLayout"));

    public VkAttachmentReferenceStencilLayoutKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentReferenceStencilLayoutKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReferenceStencilLayoutKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentReferenceStencilLayoutKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReferenceStencilLayoutKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentReferenceStencilLayoutKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReferenceStencilLayoutKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentReferenceStencilLayoutKHR alloc(SegmentAllocator allocator) { return new VkAttachmentReferenceStencilLayoutKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentReferenceStencilLayoutKHR alloc(SegmentAllocator allocator, long count) { return new VkAttachmentReferenceStencilLayoutKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentReferenceStencilLayoutKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT); }
    public static VkAttachmentReferenceStencilLayoutKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT);
        return s;
    }
    public VkAttachmentReferenceStencilLayoutKHR copyFrom(VkAttachmentReferenceStencilLayoutKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentReferenceStencilLayoutKHR reinterpret(long count) { return new VkAttachmentReferenceStencilLayoutKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentReferenceStencilLayoutKHR asSlice(long index) { return new VkAttachmentReferenceStencilLayoutKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentReferenceStencilLayoutKHR asSlice(long index, long count) { return new VkAttachmentReferenceStencilLayoutKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentReferenceStencilLayoutKHR at(long index, Consumer<VkAttachmentReferenceStencilLayoutKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stencilLayoutAt(long index) { return (int) VH_stencilLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stencilLayout() { return (int) VH_stencilLayout.get(this.segment(), 0L, 0L); }
    public VkAttachmentReferenceStencilLayoutKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReferenceStencilLayoutKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReferenceStencilLayoutKHR stencilLayoutAt(long index, int value) { VH_stencilLayout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReferenceStencilLayoutKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReferenceStencilLayoutKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReferenceStencilLayoutKHR stencilLayout(int value) { VH_stencilLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentReferenceStencilLayoutKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentReferenceStencilLayoutKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentReferenceStencilLayoutKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentReferenceStencilLayoutKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stencilLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilLayout, index), LAYOUT_stencilLayout); }
    public MemorySegment _stencilLayout() { return _stencilLayoutAt(0L); }
    public VkAttachmentReferenceStencilLayoutKHR _stencilLayoutAt(long index, MemorySegment src) { _stencilLayoutAt(index).copyFrom(src); return this; }
    public VkAttachmentReferenceStencilLayoutKHR _stencilLayout(MemorySegment src) { return _stencilLayoutAt(0L, src); }
}
