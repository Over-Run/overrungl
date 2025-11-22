// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingAttachmentInfo`.
/// ## Layout
/// ```
/// struct VkRenderingAttachmentInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
///     VkResolveModeFlagBits resolveMode;
///     VkImageView resolveImageView;
///     VkImageLayout resolveImageLayout;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkClearValue clearValue;
/// }
/// ```
public final class VkRenderingAttachmentInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        ValueLayout.JAVA_INT.withName("resolveMode"),
        ValueLayout.JAVA_LONG.withName("resolveImageView"),
        ValueLayout.JAVA_INT.withName("resolveImageLayout"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        overrungl.vulkan.union.VkClearValue.LAYOUT.withName("clearValue")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    public static final long OFFSET_resolveMode = LAYOUT.byteOffset(PathElement.groupElement("resolveMode"));
    public static final long OFFSET_resolveImageView = LAYOUT.byteOffset(PathElement.groupElement("resolveImageView"));
    public static final long OFFSET_resolveImageLayout = LAYOUT.byteOffset(PathElement.groupElement("resolveImageLayout"));
    public static final long OFFSET_loadOp = LAYOUT.byteOffset(PathElement.groupElement("loadOp"));
    public static final long OFFSET_storeOp = LAYOUT.byteOffset(PathElement.groupElement("storeOp"));
    public static final long OFFSET_clearValue = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    public static final MemoryLayout LAYOUT_resolveMode = LAYOUT.select(PathElement.groupElement("resolveMode"));
    public static final MemoryLayout LAYOUT_resolveImageView = LAYOUT.select(PathElement.groupElement("resolveImageView"));
    public static final MemoryLayout LAYOUT_resolveImageLayout = LAYOUT.select(PathElement.groupElement("resolveImageLayout"));
    public static final MemoryLayout LAYOUT_loadOp = LAYOUT.select(PathElement.groupElement("loadOp"));
    public static final MemoryLayout LAYOUT_storeOp = LAYOUT.select(PathElement.groupElement("storeOp"));
    public static final MemoryLayout LAYOUT_clearValue = LAYOUT.select(PathElement.groupElement("clearValue"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));
    public static final VarHandle VH_resolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveMode"));
    public static final VarHandle VH_resolveImageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveImageView"));
    public static final VarHandle VH_resolveImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveImageLayout"));
    public static final VarHandle VH_loadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loadOp"));
    public static final VarHandle VH_storeOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storeOp"));
    public static final VarHandle VH_clearValue$color$float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("color"), PathElement.groupElement("float32"), PathElement.sequenceElement());
    public static final VarHandle VH_clearValue$color$int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("color"), PathElement.groupElement("int32"), PathElement.sequenceElement());
    public static final VarHandle VH_clearValue$color$uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("color"), PathElement.groupElement("uint32"), PathElement.sequenceElement());
    public static final VarHandle VH_clearValue$depthStencil$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("depthStencil"), PathElement.groupElement("depth"));
    public static final VarHandle VH_clearValue$depthStencil$stencil = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("depthStencil"), PathElement.groupElement("stencil"));

    public VkRenderingAttachmentInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingAttachmentInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingAttachmentInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingAttachmentInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingAttachmentInfo alloc(SegmentAllocator allocator) { return new VkRenderingAttachmentInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingAttachmentInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAttachmentInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO);
        return s;
    }
    public VkRenderingAttachmentInfo copyFrom(VkRenderingAttachmentInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingAttachmentInfo reinterpret(long count) { return new VkRenderingAttachmentInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingAttachmentInfo asSlice(long index) { return new VkRenderingAttachmentInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingAttachmentInfo asSlice(long index, long count) { return new VkRenderingAttachmentInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingAttachmentInfo at(long index, Consumer<VkRenderingAttachmentInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public int imageLayoutAt(long index) { return (int) VH_imageLayout.get(this.segment(), 0L, index); }
    public int resolveModeAt(long index) { return (int) VH_resolveMode.get(this.segment(), 0L, index); }
    public long resolveImageViewAt(long index) { return (long) VH_resolveImageView.get(this.segment(), 0L, index); }
    public int resolveImageLayoutAt(long index) { return (int) VH_resolveImageLayout.get(this.segment(), 0L, index); }
    public int loadOpAt(long index) { return (int) VH_loadOp.get(this.segment(), 0L, index); }
    public int storeOpAt(long index) { return (int) VH_storeOp.get(this.segment(), 0L, index); }
    public float clearValue$color$float32At(long index, long index0) { return (float) VH_clearValue$color$float32.get(this.segment(), 0L, index, index0); }
    public int clearValue$color$int32At(long index, long index0) { return (int) VH_clearValue$color$int32.get(this.segment(), 0L, index, index0); }
    public int clearValue$color$uint32At(long index, long index0) { return (int) VH_clearValue$color$uint32.get(this.segment(), 0L, index, index0); }
    public float clearValue$depthStencil$depthAt(long index) { return (float) VH_clearValue$depthStencil$depth.get(this.segment(), 0L, index); }
    public int clearValue$depthStencil$stencilAt(long index) { return (int) VH_clearValue$depthStencil$stencil.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public int imageLayout() { return (int) VH_imageLayout.get(this.segment(), 0L, 0L); }
    public int resolveMode() { return (int) VH_resolveMode.get(this.segment(), 0L, 0L); }
    public long resolveImageView() { return (long) VH_resolveImageView.get(this.segment(), 0L, 0L); }
    public int resolveImageLayout() { return (int) VH_resolveImageLayout.get(this.segment(), 0L, 0L); }
    public int loadOp() { return (int) VH_loadOp.get(this.segment(), 0L, 0L); }
    public int storeOp() { return (int) VH_storeOp.get(this.segment(), 0L, 0L); }
    public float clearValue$color$float32(long index0) { return (float) VH_clearValue$color$float32.get(this.segment(), 0L, 0L, index0); }
    public int clearValue$color$int32(long index0) { return (int) VH_clearValue$color$int32.get(this.segment(), 0L, 0L, index0); }
    public int clearValue$color$uint32(long index0) { return (int) VH_clearValue$color$uint32.get(this.segment(), 0L, 0L, index0); }
    public float clearValue$depthStencil$depth() { return (float) VH_clearValue$depthStencil$depth.get(this.segment(), 0L, 0L); }
    public int clearValue$depthStencil$stencil() { return (int) VH_clearValue$depthStencil$stencil.get(this.segment(), 0L, 0L); }
    public VkRenderingAttachmentInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo imageLayoutAt(long index, int value) { VH_imageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo resolveModeAt(long index, int value) { VH_resolveMode.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo resolveImageViewAt(long index, long value) { VH_resolveImageView.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo resolveImageLayoutAt(long index, int value) { VH_resolveImageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo loadOpAt(long index, int value) { VH_loadOp.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo storeOpAt(long index, int value) { VH_storeOp.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo clearValue$color$float32At(long index, long index0, float value) { VH_clearValue$color$float32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkRenderingAttachmentInfo clearValue$color$int32At(long index, long index0, int value) { VH_clearValue$color$int32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkRenderingAttachmentInfo clearValue$color$uint32At(long index, long index0, int value) { VH_clearValue$color$uint32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkRenderingAttachmentInfo clearValue$depthStencil$depthAt(long index, float value) { VH_clearValue$depthStencil$depth.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo clearValue$depthStencil$stencilAt(long index, int value) { VH_clearValue$depthStencil$stencil.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAttachmentInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo imageLayout(int value) { VH_imageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo resolveMode(int value) { VH_resolveMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo resolveImageView(long value) { VH_resolveImageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo resolveImageLayout(int value) { VH_resolveImageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo loadOp(int value) { VH_loadOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo storeOp(int value) { VH_storeOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo clearValue$color$float32(long index0, float value) { VH_clearValue$color$float32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkRenderingAttachmentInfo clearValue$color$int32(long index0, int value) { VH_clearValue$color$int32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkRenderingAttachmentInfo clearValue$color$uint32(long index0, int value) { VH_clearValue$color$uint32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkRenderingAttachmentInfo clearValue$depthStencil$depth(float value) { VH_clearValue$depthStencil$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAttachmentInfo clearValue$depthStencil$stencil(int value) { VH_clearValue$depthStencil$stencil.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingAttachmentInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingAttachmentInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkRenderingAttachmentInfo _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
    public MemorySegment _imageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageLayout, index), LAYOUT_imageLayout); }
    public MemorySegment _imageLayout() { return _imageLayoutAt(0L); }
    public VkRenderingAttachmentInfo _imageLayoutAt(long index, MemorySegment src) { _imageLayoutAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _imageLayout(MemorySegment src) { return _imageLayoutAt(0L, src); }
    public MemorySegment _resolveModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resolveMode, index), LAYOUT_resolveMode); }
    public MemorySegment _resolveMode() { return _resolveModeAt(0L); }
    public VkRenderingAttachmentInfo _resolveModeAt(long index, MemorySegment src) { _resolveModeAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _resolveMode(MemorySegment src) { return _resolveModeAt(0L, src); }
    public MemorySegment _resolveImageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resolveImageView, index), LAYOUT_resolveImageView); }
    public MemorySegment _resolveImageView() { return _resolveImageViewAt(0L); }
    public VkRenderingAttachmentInfo _resolveImageViewAt(long index, MemorySegment src) { _resolveImageViewAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _resolveImageView(MemorySegment src) { return _resolveImageViewAt(0L, src); }
    public MemorySegment _resolveImageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resolveImageLayout, index), LAYOUT_resolveImageLayout); }
    public MemorySegment _resolveImageLayout() { return _resolveImageLayoutAt(0L); }
    public VkRenderingAttachmentInfo _resolveImageLayoutAt(long index, MemorySegment src) { _resolveImageLayoutAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _resolveImageLayout(MemorySegment src) { return _resolveImageLayoutAt(0L, src); }
    public MemorySegment _loadOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_loadOp, index), LAYOUT_loadOp); }
    public MemorySegment _loadOp() { return _loadOpAt(0L); }
    public VkRenderingAttachmentInfo _loadOpAt(long index, MemorySegment src) { _loadOpAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _loadOp(MemorySegment src) { return _loadOpAt(0L, src); }
    public MemorySegment _storeOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storeOp, index), LAYOUT_storeOp); }
    public MemorySegment _storeOp() { return _storeOpAt(0L); }
    public VkRenderingAttachmentInfo _storeOpAt(long index, MemorySegment src) { _storeOpAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _storeOp(MemorySegment src) { return _storeOpAt(0L, src); }
    public MemorySegment _clearValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clearValue, index), LAYOUT_clearValue); }
    public MemorySegment _clearValue() { return _clearValueAt(0L); }
    public VkRenderingAttachmentInfo _clearValueAt(long index, MemorySegment src) { _clearValueAt(index).copyFrom(src); return this; }
    public VkRenderingAttachmentInfo _clearValue(MemorySegment src) { return _clearValueAt(0L, src); }
}
