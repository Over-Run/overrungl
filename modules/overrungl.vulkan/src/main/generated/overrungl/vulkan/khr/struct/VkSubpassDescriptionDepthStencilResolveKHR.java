// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassDescriptionDepthStencilResolveKHR`.
/// ## Layout
/// ```
/// struct VkSubpassDescriptionDepthStencilResolveKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkResolveModeFlagBits depthResolveMode;
///     VkResolveModeFlagBits stencilResolveMode;
///     const VkAttachmentReference2* pDepthStencilResolveAttachment;
/// }
/// ```
public final class VkSubpassDescriptionDepthStencilResolveKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthResolveMode"),
        ValueLayout.JAVA_INT.withName("stencilResolveMode"),
        ValueLayout.ADDRESS.withName("pDepthStencilResolveAttachment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthResolveMode = LAYOUT.byteOffset(PathElement.groupElement("depthResolveMode"));
    public static final long OFFSET_stencilResolveMode = LAYOUT.byteOffset(PathElement.groupElement("stencilResolveMode"));
    public static final long OFFSET_pDepthStencilResolveAttachment = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilResolveAttachment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthResolveMode = LAYOUT.select(PathElement.groupElement("depthResolveMode"));
    public static final MemoryLayout LAYOUT_stencilResolveMode = LAYOUT.select(PathElement.groupElement("stencilResolveMode"));
    public static final MemoryLayout LAYOUT_pDepthStencilResolveAttachment = LAYOUT.select(PathElement.groupElement("pDepthStencilResolveAttachment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthResolveMode"));
    public static final VarHandle VH_stencilResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilResolveMode"));
    public static final VarHandle VH_pDepthStencilResolveAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilResolveAttachment"));

    public VkSubpassDescriptionDepthStencilResolveKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassDescriptionDepthStencilResolveKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolveKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassDescriptionDepthStencilResolveKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolveKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassDescriptionDepthStencilResolveKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolveKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassDescriptionDepthStencilResolveKHR alloc(SegmentAllocator allocator) { return new VkSubpassDescriptionDepthStencilResolveKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassDescriptionDepthStencilResolveKHR alloc(SegmentAllocator allocator, long count) { return new VkSubpassDescriptionDepthStencilResolveKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSubpassDescriptionDepthStencilResolveKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
    public static VkSubpassDescriptionDepthStencilResolveKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE);
        return s;
    }
    public VkSubpassDescriptionDepthStencilResolveKHR copyFrom(VkSubpassDescriptionDepthStencilResolveKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR reinterpret(long count) { return new VkSubpassDescriptionDepthStencilResolveKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassDescriptionDepthStencilResolveKHR asSlice(long index) { return new VkSubpassDescriptionDepthStencilResolveKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassDescriptionDepthStencilResolveKHR asSlice(long index, long count) { return new VkSubpassDescriptionDepthStencilResolveKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassDescriptionDepthStencilResolveKHR at(long index, Consumer<VkSubpassDescriptionDepthStencilResolveKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthResolveModeAt(long index) { return (int) VH_depthResolveMode.get(this.segment(), 0L, index); }
    public int stencilResolveModeAt(long index) { return (int) VH_stencilResolveMode.get(this.segment(), 0L, index); }
    public MemorySegment pDepthStencilResolveAttachmentAt(long index) { return (MemorySegment) VH_pDepthStencilResolveAttachment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthResolveMode() { return (int) VH_depthResolveMode.get(this.segment(), 0L, 0L); }
    public int stencilResolveMode() { return (int) VH_stencilResolveMode.get(this.segment(), 0L, 0L); }
    public MemorySegment pDepthStencilResolveAttachment() { return (MemorySegment) VH_pDepthStencilResolveAttachment.get(this.segment(), 0L, 0L); }
    public VkSubpassDescriptionDepthStencilResolveKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR depthResolveModeAt(long index, int value) { VH_depthResolveMode.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR stencilResolveModeAt(long index, int value) { VH_stencilResolveMode.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR pDepthStencilResolveAttachmentAt(long index, MemorySegment value) { VH_pDepthStencilResolveAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR depthResolveMode(int value) { VH_depthResolveMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR stencilResolveMode(int value) { VH_stencilResolveMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR pDepthStencilResolveAttachment(MemorySegment value) { VH_pDepthStencilResolveAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubpassDescriptionDepthStencilResolveKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubpassDescriptionDepthStencilResolveKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthResolveModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthResolveMode, index), LAYOUT_depthResolveMode); }
    public MemorySegment _depthResolveMode() { return _depthResolveModeAt(0L); }
    public VkSubpassDescriptionDepthStencilResolveKHR _depthResolveModeAt(long index, MemorySegment src) { _depthResolveModeAt(index).copyFrom(src); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR _depthResolveMode(MemorySegment src) { return _depthResolveModeAt(0L, src); }
    public MemorySegment _stencilResolveModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilResolveMode, index), LAYOUT_stencilResolveMode); }
    public MemorySegment _stencilResolveMode() { return _stencilResolveModeAt(0L); }
    public VkSubpassDescriptionDepthStencilResolveKHR _stencilResolveModeAt(long index, MemorySegment src) { _stencilResolveModeAt(index).copyFrom(src); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR _stencilResolveMode(MemorySegment src) { return _stencilResolveModeAt(0L, src); }
    public MemorySegment _pDepthStencilResolveAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDepthStencilResolveAttachment, index), LAYOUT_pDepthStencilResolveAttachment); }
    public MemorySegment _pDepthStencilResolveAttachment() { return _pDepthStencilResolveAttachmentAt(0L); }
    public VkSubpassDescriptionDepthStencilResolveKHR _pDepthStencilResolveAttachmentAt(long index, MemorySegment src) { _pDepthStencilResolveAttachmentAt(index).copyFrom(src); return this; }
    public VkSubpassDescriptionDepthStencilResolveKHR _pDepthStencilResolveAttachment(MemorySegment src) { return _pDepthStencilResolveAttachmentAt(0L, src); }
}
