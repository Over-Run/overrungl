// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageCompressionControlFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageCompressionControlFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 imageCompressionControl;
/// }
/// ```
public final class VkPhysicalDeviceImageCompressionControlFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionControl")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageCompressionControl = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionControl"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageCompressionControl = LAYOUT.select(PathElement.groupElement("imageCompressionControl"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageCompressionControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionControl"));

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageCompressionControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT); }
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageCompressionControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT copyFrom(VkPhysicalDeviceImageCompressionControlFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImageCompressionControlFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageCompressionControlAt(long index) { return (int) VH_imageCompressionControl.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageCompressionControl() { return (int) VH_imageCompressionControl.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT imageCompressionControlAt(long index, int value) { VH_imageCompressionControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT imageCompressionControl(int value) { VH_imageCompressionControl.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageCompressionControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCompressionControl, index), LAYOUT_imageCompressionControl); }
    public MemorySegment _imageCompressionControl() { return _imageCompressionControlAt(0L); }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT _imageCompressionControlAt(long index, MemorySegment src) { _imageCompressionControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT _imageCompressionControl(MemorySegment src) { return _imageCompressionControlAt(0L, src); }
}
