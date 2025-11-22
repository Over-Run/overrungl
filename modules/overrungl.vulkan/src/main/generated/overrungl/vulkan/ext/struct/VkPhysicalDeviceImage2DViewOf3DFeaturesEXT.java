// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImage2DViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 image2DViewOf3D;
///     VkBool32 sampler2DViewOf3D;
/// }
/// ```
public final class VkPhysicalDeviceImage2DViewOf3DFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("image2DViewOf3D"),
        ValueLayout.JAVA_INT.withName("sampler2DViewOf3D")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image2DViewOf3D = LAYOUT.byteOffset(PathElement.groupElement("image2DViewOf3D"));
    public static final long OFFSET_sampler2DViewOf3D = LAYOUT.byteOffset(PathElement.groupElement("sampler2DViewOf3D"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image2DViewOf3D = LAYOUT.select(PathElement.groupElement("image2DViewOf3D"));
    public static final MemoryLayout LAYOUT_sampler2DViewOf3D = LAYOUT.select(PathElement.groupElement("sampler2DViewOf3D"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image2DViewOf3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image2DViewOf3D"));
    public static final VarHandle VH_sampler2DViewOf3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler2DViewOf3D"));

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImage2dViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT); }
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImage2dViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT copyFrom(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int image2DViewOf3DAt(long index) { return (int) VH_image2DViewOf3D.get(this.segment(), 0L, index); }
    public int sampler2DViewOf3DAt(long index) { return (int) VH_sampler2DViewOf3D.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int image2DViewOf3D() { return (int) VH_image2DViewOf3D.get(this.segment(), 0L, 0L); }
    public int sampler2DViewOf3D() { return (int) VH_sampler2DViewOf3D.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3DAt(long index, int value) { VH_image2DViewOf3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3DAt(long index, int value) { VH_sampler2DViewOf3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3D(int value) { VH_image2DViewOf3D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3D(int value) { VH_sampler2DViewOf3D.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _image2DViewOf3DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image2DViewOf3D, index), LAYOUT_image2DViewOf3D); }
    public MemorySegment _image2DViewOf3D() { return _image2DViewOf3DAt(0L); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _image2DViewOf3DAt(long index, MemorySegment src) { _image2DViewOf3DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _image2DViewOf3D(MemorySegment src) { return _image2DViewOf3DAt(0L, src); }
    public MemorySegment _sampler2DViewOf3DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampler2DViewOf3D, index), LAYOUT_sampler2DViewOf3D); }
    public MemorySegment _sampler2DViewOf3D() { return _sampler2DViewOf3DAt(0L); }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _sampler2DViewOf3DAt(long index, MemorySegment src) { _sampler2DViewOf3DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT _sampler2DViewOf3D(MemorySegment src) { return _sampler2DViewOf3DAt(0L, src); }
}
