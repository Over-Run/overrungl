// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalTextureInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalTextureInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     VkImageView imageView;
///     VkBufferView bufferView;
///     VkImageAspectFlagBits plane;
///     MTLTexture_id mtlTexture;
/// }
/// ```
public final class VkExportMetalTextureInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_LONG.withName("bufferView"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final long OFFSET_bufferView = LAYOUT.byteOffset(PathElement.groupElement("bufferView"));
    public static final long OFFSET_plane = LAYOUT.byteOffset(PathElement.groupElement("plane"));
    public static final long OFFSET_mtlTexture = LAYOUT.byteOffset(PathElement.groupElement("mtlTexture"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_bufferView = LAYOUT.select(PathElement.groupElement("bufferView"));
    public static final MemoryLayout LAYOUT_plane = LAYOUT.select(PathElement.groupElement("plane"));
    public static final MemoryLayout LAYOUT_mtlTexture = LAYOUT.select(PathElement.groupElement("mtlTexture"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    public static final VarHandle VH_bufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferView"));
    public static final VarHandle VH_plane = LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane"));
    public static final VarHandle VH_mtlTexture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture"));

    public VkExportMetalTextureInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMetalTextureInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMetalTextureInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMetalTextureInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT); }
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT);
        return s;
    }
    public VkExportMetalTextureInfoEXT copyFrom(VkExportMetalTextureInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMetalTextureInfoEXT reinterpret(long count) { return new VkExportMetalTextureInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMetalTextureInfoEXT asSlice(long index) { return new VkExportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMetalTextureInfoEXT asSlice(long index, long count) { return new VkExportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMetalTextureInfoEXT at(long index, Consumer<VkExportMetalTextureInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public long bufferViewAt(long index) { return (long) VH_bufferView.get(this.segment(), 0L, index); }
    public int planeAt(long index) { return (int) VH_plane.get(this.segment(), 0L, index); }
    public MemorySegment mtlTextureAt(long index) { return (MemorySegment) VH_mtlTexture.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public long bufferView() { return (long) VH_bufferView.get(this.segment(), 0L, 0L); }
    public int plane() { return (int) VH_plane.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlTexture() { return (MemorySegment) VH_mtlTexture.get(this.segment(), 0L, 0L); }
    public VkExportMetalTextureInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT bufferViewAt(long index, long value) { VH_bufferView.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT planeAt(long index, int value) { VH_plane.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT mtlTextureAt(long index, MemorySegment value) { VH_mtlTexture.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalTextureInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalTextureInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalTextureInfoEXT image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalTextureInfoEXT imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalTextureInfoEXT bufferView(long value) { VH_bufferView.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalTextureInfoEXT plane(int value) { VH_plane.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalTextureInfoEXT mtlTexture(MemorySegment value) { VH_mtlTexture.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMetalTextureInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMetalTextureInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkExportMetalTextureInfoEXT _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkExportMetalTextureInfoEXT _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
    public MemorySegment _bufferViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferView, index), LAYOUT_bufferView); }
    public MemorySegment _bufferView() { return _bufferViewAt(0L); }
    public VkExportMetalTextureInfoEXT _bufferViewAt(long index, MemorySegment src) { _bufferViewAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _bufferView(MemorySegment src) { return _bufferViewAt(0L, src); }
    public MemorySegment _planeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_plane, index), LAYOUT_plane); }
    public MemorySegment _plane() { return _planeAt(0L); }
    public VkExportMetalTextureInfoEXT _planeAt(long index, MemorySegment src) { _planeAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _plane(MemorySegment src) { return _planeAt(0L, src); }
    public MemorySegment _mtlTextureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlTexture, index), LAYOUT_mtlTexture); }
    public MemorySegment _mtlTexture() { return _mtlTextureAt(0L); }
    public VkExportMetalTextureInfoEXT _mtlTextureAt(long index, MemorySegment src) { _mtlTextureAt(index).copyFrom(src); return this; }
    public VkExportMetalTextureInfoEXT _mtlTexture(MemorySegment src) { return _mtlTextureAt(0L, src); }
}
