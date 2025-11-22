// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFramebufferAttachmentImageInfoKHR`.
/// ## Layout
/// ```
/// struct VkFramebufferAttachmentImageInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageCreateFlags flags;
///     VkImageUsageFlags usage;
///     uint32_t width;
///     uint32_t height;
///     uint32_t layerCount;
///     uint32_t viewFormatCount;
///     const VkFormat* pViewFormats;
/// }
/// ```
public final class VkFramebufferAttachmentImageInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.JAVA_INT.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withName("pViewFormats")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    public static final long OFFSET_viewFormatCount = LAYOUT.byteOffset(PathElement.groupElement("viewFormatCount"));
    public static final long OFFSET_pViewFormats = LAYOUT.byteOffset(PathElement.groupElement("pViewFormats"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    public static final MemoryLayout LAYOUT_viewFormatCount = LAYOUT.select(PathElement.groupElement("viewFormatCount"));
    public static final MemoryLayout LAYOUT_pViewFormats = LAYOUT.select(PathElement.groupElement("pViewFormats"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    public static final VarHandle VH_viewFormatCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewFormatCount"));
    public static final VarHandle VH_pViewFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewFormats"));

    public VkFramebufferAttachmentImageInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFramebufferAttachmentImageInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentImageInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkFramebufferAttachmentImageInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentImageInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFramebufferAttachmentImageInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentImageInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFramebufferAttachmentImageInfoKHR alloc(SegmentAllocator allocator) { return new VkFramebufferAttachmentImageInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkFramebufferAttachmentImageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkFramebufferAttachmentImageInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkFramebufferAttachmentImageInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
    public static VkFramebufferAttachmentImageInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO);
        return s;
    }
    public VkFramebufferAttachmentImageInfoKHR copyFrom(VkFramebufferAttachmentImageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFramebufferAttachmentImageInfoKHR reinterpret(long count) { return new VkFramebufferAttachmentImageInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFramebufferAttachmentImageInfoKHR asSlice(long index) { return new VkFramebufferAttachmentImageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFramebufferAttachmentImageInfoKHR asSlice(long index, long count) { return new VkFramebufferAttachmentImageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFramebufferAttachmentImageInfoKHR at(long index, Consumer<VkFramebufferAttachmentImageInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    public int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    public int layerCountAt(long index) { return (int) VH_layerCount.get(this.segment(), 0L, index); }
    public int viewFormatCountAt(long index) { return (int) VH_viewFormatCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewFormatsAt(long index) { return (MemorySegment) VH_pViewFormats.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public int width() { return (int) VH_width.get(this.segment(), 0L, 0L); }
    public int height() { return (int) VH_height.get(this.segment(), 0L, 0L); }
    public int layerCount() { return (int) VH_layerCount.get(this.segment(), 0L, 0L); }
    public int viewFormatCount() { return (int) VH_viewFormatCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewFormats() { return (MemorySegment) VH_pViewFormats.get(this.segment(), 0L, 0L); }
    public VkFramebufferAttachmentImageInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR widthAt(long index, int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR heightAt(long index, int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR layerCountAt(long index, int value) { VH_layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR viewFormatCountAt(long index, int value) { VH_viewFormatCount.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR pViewFormatsAt(long index, MemorySegment value) { VH_pViewFormats.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR width(int value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR height(int value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR layerCount(int value) { VH_layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR viewFormatCount(int value) { VH_viewFormatCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentImageInfoKHR pViewFormats(MemorySegment value) { VH_pViewFormats.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _usage(MemorySegment src) { return _usageAt(0L, src); }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _height(MemorySegment src) { return _heightAt(0L, src); }
    public MemorySegment _layerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerCount, index), LAYOUT_layerCount); }
    public MemorySegment _layerCount() { return _layerCountAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _layerCountAt(long index, MemorySegment src) { _layerCountAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _layerCount(MemorySegment src) { return _layerCountAt(0L, src); }
    public MemorySegment _viewFormatCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewFormatCount, index), LAYOUT_viewFormatCount); }
    public MemorySegment _viewFormatCount() { return _viewFormatCountAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _viewFormatCountAt(long index, MemorySegment src) { _viewFormatCountAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _viewFormatCount(MemorySegment src) { return _viewFormatCountAt(0L, src); }
    public MemorySegment _pViewFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewFormats, index), LAYOUT_pViewFormats); }
    public MemorySegment _pViewFormats() { return _pViewFormatsAt(0L); }
    public VkFramebufferAttachmentImageInfoKHR _pViewFormatsAt(long index, MemorySegment src) { _pViewFormatsAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentImageInfoKHR _pViewFormats(MemorySegment src) { return _pViewFormatsAt(0L, src); }
}
