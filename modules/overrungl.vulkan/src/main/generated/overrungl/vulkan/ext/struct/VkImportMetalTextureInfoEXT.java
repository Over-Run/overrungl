// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMetalTextureInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMetalTextureInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageAspectFlagBits plane;
///     MTLTexture_id mtlTexture;
/// }
/// ```
public final class VkImportMetalTextureInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_plane = LAYOUT.byteOffset(PathElement.groupElement("plane"));
    public static final long OFFSET_mtlTexture = LAYOUT.byteOffset(PathElement.groupElement("mtlTexture"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_plane = LAYOUT.select(PathElement.groupElement("plane"));
    public static final MemoryLayout LAYOUT_mtlTexture = LAYOUT.select(PathElement.groupElement("mtlTexture"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_plane = LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane"));
    public static final VarHandle VH_mtlTexture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture"));

    public VkImportMetalTextureInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMetalTextureInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMetalTextureInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMetalTextureInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalTextureInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImportMetalTextureInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalTextureInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMetalTextureInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT); }
    public static VkImportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT);
        return s;
    }
    public VkImportMetalTextureInfoEXT copyFrom(VkImportMetalTextureInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMetalTextureInfoEXT reinterpret(long count) { return new VkImportMetalTextureInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMetalTextureInfoEXT asSlice(long index) { return new VkImportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMetalTextureInfoEXT asSlice(long index, long count) { return new VkImportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMetalTextureInfoEXT at(long index, Consumer<VkImportMetalTextureInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int planeAt(long index) { return (int) VH_plane.get(this.segment(), 0L, index); }
    public MemorySegment mtlTextureAt(long index) { return (MemorySegment) VH_mtlTexture.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int plane() { return (int) VH_plane.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlTexture() { return (MemorySegment) VH_mtlTexture.get(this.segment(), 0L, 0L); }
    public VkImportMetalTextureInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalTextureInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalTextureInfoEXT planeAt(long index, int value) { VH_plane.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalTextureInfoEXT mtlTextureAt(long index, MemorySegment value) { VH_mtlTexture.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalTextureInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalTextureInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalTextureInfoEXT plane(int value) { VH_plane.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalTextureInfoEXT mtlTexture(MemorySegment value) { VH_mtlTexture.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMetalTextureInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMetalTextureInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMetalTextureInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMetalTextureInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _planeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_plane, index), LAYOUT_plane); }
    public MemorySegment _plane() { return _planeAt(0L); }
    public VkImportMetalTextureInfoEXT _planeAt(long index, MemorySegment src) { _planeAt(index).copyFrom(src); return this; }
    public VkImportMetalTextureInfoEXT _plane(MemorySegment src) { return _planeAt(0L, src); }
    public MemorySegment _mtlTextureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlTexture, index), LAYOUT_mtlTexture); }
    public MemorySegment _mtlTexture() { return _mtlTextureAt(0L); }
    public VkImportMetalTextureInfoEXT _mtlTextureAt(long index, MemorySegment src) { _mtlTextureAt(index).copyFrom(src); return this; }
    public VkImportMetalTextureInfoEXT _mtlTexture(MemorySegment src) { return _mtlTextureAt(0L, src); }
}
