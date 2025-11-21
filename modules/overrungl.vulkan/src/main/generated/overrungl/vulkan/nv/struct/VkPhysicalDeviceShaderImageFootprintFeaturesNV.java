// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderImageFootprintFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderImageFootprintFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 imageFootprint;
/// }
/// ```
public final class VkPhysicalDeviceShaderImageFootprintFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageFootprint")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageFootprint = LAYOUT.byteOffset(PathElement.groupElement("imageFootprint"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageFootprint = LAYOUT.select(PathElement.groupElement("imageFootprint"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageFootprint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFootprint"));

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShaderImageFootprint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV); }
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShaderImageFootprint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV copyFrom(VkPhysicalDeviceShaderImageFootprintFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV at(long index, Consumer<VkPhysicalDeviceShaderImageFootprintFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageFootprintAt(long index) { return (int) VH_imageFootprint.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageFootprint() { return (int) VH_imageFootprint.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprintAt(long index, int value) { VH_imageFootprint.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprint(int value) { VH_imageFootprint.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageFootprintAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageFootprint, index), LAYOUT_imageFootprint); }
    public MemorySegment _imageFootprint() { return _imageFootprintAt(0L); }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV _imageFootprintAt(long index, MemorySegment src) { _imageFootprintAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV _imageFootprint(MemorySegment src) { return _imageFootprintAt(0L, src); }
}
