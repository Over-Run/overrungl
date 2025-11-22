// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 imageSlicedViewOf3D;
/// }
/// ```
public final class VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageSlicedViewOf3D = LAYOUT.byteOffset(PathElement.groupElement("imageSlicedViewOf3D"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageSlicedViewOf3D = LAYOUT.select(PathElement.groupElement("imageSlicedViewOf3D"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageSlicedViewOf3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSlicedViewOf3D"));

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT); }
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT copyFrom(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageSlicedViewOf3DAt(long index) { return (int) VH_imageSlicedViewOf3D.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageSlicedViewOf3D() { return (int) VH_imageSlicedViewOf3D.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3DAt(long index, int value) { VH_imageSlicedViewOf3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3D(int value) { VH_imageSlicedViewOf3D.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageSlicedViewOf3DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSlicedViewOf3D, index), LAYOUT_imageSlicedViewOf3D); }
    public MemorySegment _imageSlicedViewOf3D() { return _imageSlicedViewOf3DAt(0L); }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT _imageSlicedViewOf3DAt(long index, MemorySegment src) { _imageSlicedViewOf3DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT _imageSlicedViewOf3D(MemorySegment src) { return _imageSlicedViewOf3DAt(0L, src); }
}
