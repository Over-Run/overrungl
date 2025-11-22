// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFramebufferCreateInfo`.
/// ## Layout
/// ```
/// struct VkFramebufferCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkFramebufferCreateFlags flags;
///     VkRenderPass renderPass;
///     uint32_t attachmentCount;
///     const VkImageView* pAttachments;
///     uint32_t width;
///     uint32_t height;
///     uint32_t layers;
/// }
/// ```
public final class VkFramebufferCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final long OFFSET_layers = LAYOUT.byteOffset(PathElement.groupElement("layers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_layers = LAYOUT.select(PathElement.groupElement("layers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    public static final VarHandle VH_layers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layers"));

    public VkFramebufferCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFramebufferCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkFramebufferCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFramebufferCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFramebufferCreateInfo alloc(SegmentAllocator allocator) { return new VkFramebufferCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkFramebufferCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkFramebufferCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO); }
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO);
        return s;
    }
    public VkFramebufferCreateInfo copyFrom(VkFramebufferCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFramebufferCreateInfo reinterpret(long count) { return new VkFramebufferCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFramebufferCreateInfo asSlice(long index) { return new VkFramebufferCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFramebufferCreateInfo asSlice(long index, long count) { return new VkFramebufferCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFramebufferCreateInfo at(long index, Consumer<VkFramebufferCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long renderPassAt(long index) { return (long) VH_renderPass.get(this.segment(), 0L, index); }
    public int attachmentCountAt(long index) { return (int) VH_attachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pAttachmentsAt(long index) { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, index); }
    public int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    public int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    public int layersAt(long index) { return (int) VH_layers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long renderPass() { return (long) VH_renderPass.get(this.segment(), 0L, 0L); }
    public int attachmentCount() { return (int) VH_attachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttachments() { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, 0L); }
    public int width() { return (int) VH_width.get(this.segment(), 0L, 0L); }
    public int height() { return (int) VH_height.get(this.segment(), 0L, 0L); }
    public int layers() { return (int) VH_layers.get(this.segment(), 0L, 0L); }
    public VkFramebufferCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo renderPassAt(long index, long value) { VH_renderPass.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo attachmentCountAt(long index, int value) { VH_attachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo pAttachmentsAt(long index, MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo widthAt(long index, int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo heightAt(long index, int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo layersAt(long index, int value) { VH_layers.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo renderPass(long value) { VH_renderPass.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo attachmentCount(int value) { VH_attachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo pAttachments(MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo width(int value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo height(int value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferCreateInfo layers(int value) { VH_layers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFramebufferCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFramebufferCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkFramebufferCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _renderPassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPass, index), LAYOUT_renderPass); }
    public MemorySegment _renderPass() { return _renderPassAt(0L); }
    public VkFramebufferCreateInfo _renderPassAt(long index, MemorySegment src) { _renderPassAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _renderPass(MemorySegment src) { return _renderPassAt(0L, src); }
    public MemorySegment _attachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentCount, index), LAYOUT_attachmentCount); }
    public MemorySegment _attachmentCount() { return _attachmentCountAt(0L); }
    public VkFramebufferCreateInfo _attachmentCountAt(long index, MemorySegment src) { _attachmentCountAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _attachmentCount(MemorySegment src) { return _attachmentCountAt(0L, src); }
    public MemorySegment _pAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttachments, index), LAYOUT_pAttachments); }
    public MemorySegment _pAttachments() { return _pAttachmentsAt(0L); }
    public VkFramebufferCreateInfo _pAttachmentsAt(long index, MemorySegment src) { _pAttachmentsAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _pAttachments(MemorySegment src) { return _pAttachmentsAt(0L, src); }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkFramebufferCreateInfo _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkFramebufferCreateInfo _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _height(MemorySegment src) { return _heightAt(0L, src); }
    public MemorySegment _layersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layers, index), LAYOUT_layers); }
    public MemorySegment _layers() { return _layersAt(0L); }
    public VkFramebufferCreateInfo _layersAt(long index, MemorySegment src) { _layersAt(index).copyFrom(src); return this; }
    public VkFramebufferCreateInfo _layers(MemorySegment src) { return _layersAt(0L, src); }
}
