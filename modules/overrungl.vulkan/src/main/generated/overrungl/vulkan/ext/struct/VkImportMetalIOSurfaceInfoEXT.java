// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMetalIOSurfaceInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMetalIOSurfaceInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     IOSurfaceRef ioSurface;
/// }
/// ```
public final class VkImportMetalIOSurfaceInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("ioSurface")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_ioSurface = LAYOUT.byteOffset(PathElement.groupElement("ioSurface"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_ioSurface = LAYOUT.select(PathElement.groupElement("ioSurface"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_ioSurface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ioSurface"));

    public VkImportMetalIOSurfaceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMetalIOSurfaceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT); }
    public static VkImportMetalIOSurfaceInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT);
        return s;
    }
    public VkImportMetalIOSurfaceInfoEXT copyFrom(VkImportMetalIOSurfaceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMetalIOSurfaceInfoEXT reinterpret(long count) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMetalIOSurfaceInfoEXT asSlice(long index) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMetalIOSurfaceInfoEXT asSlice(long index, long count) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMetalIOSurfaceInfoEXT at(long index, Consumer<VkImportMetalIOSurfaceInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment ioSurfaceAt(long index) { return (MemorySegment) VH_ioSurface.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment ioSurface() { return (MemorySegment) VH_ioSurface.get(this.segment(), 0L, 0L); }
    public VkImportMetalIOSurfaceInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalIOSurfaceInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalIOSurfaceInfoEXT ioSurfaceAt(long index, MemorySegment value) { VH_ioSurface.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalIOSurfaceInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalIOSurfaceInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalIOSurfaceInfoEXT ioSurface(MemorySegment value) { VH_ioSurface.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMetalIOSurfaceInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMetalIOSurfaceInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMetalIOSurfaceInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMetalIOSurfaceInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _ioSurfaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ioSurface, index), LAYOUT_ioSurface); }
    public MemorySegment _ioSurface() { return _ioSurfaceAt(0L); }
    public VkImportMetalIOSurfaceInfoEXT _ioSurfaceAt(long index, MemorySegment src) { _ioSurfaceAt(index).copyFrom(src); return this; }
    public VkImportMetalIOSurfaceInfoEXT _ioSurface(MemorySegment src) { return _ioSurfaceAt(0L, src); }
}
