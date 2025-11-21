// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceFormat2KHR`.
/// ## Layout
/// ```
/// struct VkSurfaceFormat2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkSurfaceFormatKHR surfaceFormat;
/// }
/// ```
public final class VkSurfaceFormat2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkSurfaceFormatKHR.LAYOUT.withName("surfaceFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_surfaceFormat = LAYOUT.byteOffset(PathElement.groupElement("surfaceFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_surfaceFormat = LAYOUT.select(PathElement.groupElement("surfaceFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_surfaceFormat$format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceFormat"), PathElement.groupElement("format"));
    public static final VarHandle VH_surfaceFormat$colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceFormat"), PathElement.groupElement("colorSpace"));

    public VkSurfaceFormat2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceFormat2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceFormat2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceFormat2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceFormat2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormat2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceFormat2KHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFormat2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceFormat2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR); }
    public static VkSurfaceFormat2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR);
        return s;
    }
    public VkSurfaceFormat2KHR copyFrom(VkSurfaceFormat2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceFormat2KHR reinterpret(long count) { return new VkSurfaceFormat2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceFormat2KHR asSlice(long index) { return new VkSurfaceFormat2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceFormat2KHR asSlice(long index, long count) { return new VkSurfaceFormat2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceFormat2KHR at(long index, Consumer<VkSurfaceFormat2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int surfaceFormat$formatAt(long index) { return (int) VH_surfaceFormat$format.get(this.segment(), 0L, index); }
    public int surfaceFormat$colorSpaceAt(long index) { return (int) VH_surfaceFormat$colorSpace.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int surfaceFormat$format() { return (int) VH_surfaceFormat$format.get(this.segment(), 0L, 0L); }
    public int surfaceFormat$colorSpace() { return (int) VH_surfaceFormat$colorSpace.get(this.segment(), 0L, 0L); }
    public VkSurfaceFormat2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFormat2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFormat2KHR surfaceFormat$formatAt(long index, int value) { VH_surfaceFormat$format.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFormat2KHR surfaceFormat$colorSpaceAt(long index, int value) { VH_surfaceFormat$colorSpace.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFormat2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFormat2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFormat2KHR surfaceFormat$format(int value) { VH_surfaceFormat$format.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFormat2KHR surfaceFormat$colorSpace(int value) { VH_surfaceFormat$colorSpace.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceFormat2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceFormat2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceFormat2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceFormat2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _surfaceFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_surfaceFormat, index), LAYOUT_surfaceFormat); }
    public MemorySegment _surfaceFormat() { return _surfaceFormatAt(0L); }
    public VkSurfaceFormat2KHR _surfaceFormatAt(long index, MemorySegment src) { _surfaceFormatAt(index).copyFrom(src); return this; }
    public VkSurfaceFormat2KHR _surfaceFormat(MemorySegment src) { return _surfaceFormatAt(0L, src); }
}
