// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalIOSurfaceInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalIOSurfaceInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     IOSurfaceRef ioSurface;
/// }
/// ```
public final class VkExportMetalIOSurfaceInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.ADDRESS.withName("ioSurface")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_ioSurface = LAYOUT.byteOffset(PathElement.groupElement("ioSurface"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_ioSurface = LAYOUT.select(PathElement.groupElement("ioSurface"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_ioSurface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ioSurface"));

    public VkExportMetalIOSurfaceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMetalIOSurfaceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT); }
    public static VkExportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT);
        return s;
    }
    public VkExportMetalIOSurfaceInfoEXT copyFrom(VkExportMetalIOSurfaceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMetalIOSurfaceInfoEXT reinterpret(long count) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMetalIOSurfaceInfoEXT asSlice(long index) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMetalIOSurfaceInfoEXT asSlice(long index, long count) { return new VkExportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMetalIOSurfaceInfoEXT at(long index, Consumer<VkExportMetalIOSurfaceInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public MemorySegment ioSurfaceAt(long index) { return (MemorySegment) VH_ioSurface.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public MemorySegment ioSurface() { return (MemorySegment) VH_ioSurface.get(this.segment(), 0L, 0L); }
    public VkExportMetalIOSurfaceInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT ioSurfaceAt(long index, MemorySegment value) { VH_ioSurface.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalIOSurfaceInfoEXT ioSurface(MemorySegment value) { VH_ioSurface.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMetalIOSurfaceInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalIOSurfaceInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMetalIOSurfaceInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMetalIOSurfaceInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkExportMetalIOSurfaceInfoEXT _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkExportMetalIOSurfaceInfoEXT _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _ioSurfaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ioSurface, index), LAYOUT_ioSurface); }
    public MemorySegment _ioSurface() { return _ioSurfaceAt(0L); }
    public VkExportMetalIOSurfaceInfoEXT _ioSurfaceAt(long index, MemorySegment src) { _ioSurfaceAt(index).copyFrom(src); return this; }
    public VkExportMetalIOSurfaceInfoEXT _ioSurface(MemorySegment src) { return _ioSurfaceAt(0L, src); }
}
