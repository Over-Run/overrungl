// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentReferenceStencilLayout`.
/// ## Layout
/// ```
/// struct VkAttachmentReferenceStencilLayout {
///     VkStructureType sType;
///     void* pNext;
///     VkImageLayout stencilLayout;
/// }
/// ```
public final class VkAttachmentReferenceStencilLayout extends GroupType {
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

    public VkAttachmentReferenceStencilLayout(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentReferenceStencilLayout of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReferenceStencilLayout(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentReferenceStencilLayout ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReferenceStencilLayout(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentReferenceStencilLayout ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReferenceStencilLayout(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentReferenceStencilLayout alloc(SegmentAllocator allocator) { return new VkAttachmentReferenceStencilLayout(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentReferenceStencilLayout alloc(SegmentAllocator allocator, long count) { return new VkAttachmentReferenceStencilLayout(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentReferenceStencilLayout allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT); }
    public static VkAttachmentReferenceStencilLayout allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT);
        return s;
    }
    public VkAttachmentReferenceStencilLayout copyFrom(VkAttachmentReferenceStencilLayout src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentReferenceStencilLayout reinterpret(long count) { return new VkAttachmentReferenceStencilLayout(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentReferenceStencilLayout asSlice(long index) { return new VkAttachmentReferenceStencilLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentReferenceStencilLayout asSlice(long index, long count) { return new VkAttachmentReferenceStencilLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentReferenceStencilLayout at(long index, Consumer<VkAttachmentReferenceStencilLayout> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stencilLayoutAt(long index) { return (int) VH_stencilLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stencilLayout() { return (int) VH_stencilLayout.get(this.segment(), 0L, 0L); }
    public VkAttachmentReferenceStencilLayout sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReferenceStencilLayout pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReferenceStencilLayout stencilLayoutAt(long index, int value) { VH_stencilLayout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReferenceStencilLayout sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReferenceStencilLayout pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReferenceStencilLayout stencilLayout(int value) { VH_stencilLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentReferenceStencilLayout _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentReferenceStencilLayout _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentReferenceStencilLayout _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentReferenceStencilLayout _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stencilLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilLayout, index), LAYOUT_stencilLayout); }
    public MemorySegment _stencilLayout() { return _stencilLayoutAt(0L); }
    public VkAttachmentReferenceStencilLayout _stencilLayoutAt(long index, MemorySegment src) { _stencilLayoutAt(index).copyFrom(src); return this; }
    public VkAttachmentReferenceStencilLayout _stencilLayout(MemorySegment src) { return _stencilLayoutAt(0L, src); }
}
