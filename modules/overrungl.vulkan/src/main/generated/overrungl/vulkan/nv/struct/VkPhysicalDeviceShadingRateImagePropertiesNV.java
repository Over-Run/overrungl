// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShadingRateImagePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShadingRateImagePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D shadingRateTexelSize;
///     uint32_t shadingRatePaletteSize;
///     uint32_t shadingRateMaxCoarseSamples;
/// }
/// ```
public final class VkPhysicalDeviceShadingRateImagePropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
        ValueLayout.JAVA_INT.withName("shadingRatePaletteSize"),
        ValueLayout.JAVA_INT.withName("shadingRateMaxCoarseSamples")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shadingRateTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateTexelSize"));
    public static final long OFFSET_shadingRatePaletteSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteSize"));
    public static final long OFFSET_shadingRateMaxCoarseSamples = LAYOUT.byteOffset(PathElement.groupElement("shadingRateMaxCoarseSamples"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shadingRateTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateTexelSize"));
    public static final MemoryLayout LAYOUT_shadingRatePaletteSize = LAYOUT.select(PathElement.groupElement("shadingRatePaletteSize"));
    public static final MemoryLayout LAYOUT_shadingRateMaxCoarseSamples = LAYOUT.select(PathElement.groupElement("shadingRateMaxCoarseSamples"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shadingRateTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_shadingRateTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateTexelSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_shadingRatePaletteSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteSize"));
    public static final VarHandle VH_shadingRateMaxCoarseSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateMaxCoarseSamples"));

    public VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV); }
    public static VkPhysicalDeviceShadingRateImagePropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceShadingRateImagePropertiesNV copyFrom(VkPhysicalDeviceShadingRateImagePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV reinterpret(long count) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV asSlice(long index) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV at(long index, Consumer<VkPhysicalDeviceShadingRateImagePropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shadingRateTexelSize$widthAt(long index) { return (int) VH_shadingRateTexelSize$width.get(this.segment(), 0L, index); }
    public int shadingRateTexelSize$heightAt(long index) { return (int) VH_shadingRateTexelSize$height.get(this.segment(), 0L, index); }
    public int shadingRatePaletteSizeAt(long index) { return (int) VH_shadingRatePaletteSize.get(this.segment(), 0L, index); }
    public int shadingRateMaxCoarseSamplesAt(long index) { return (int) VH_shadingRateMaxCoarseSamples.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shadingRateTexelSize$width() { return (int) VH_shadingRateTexelSize$width.get(this.segment(), 0L, 0L); }
    public int shadingRateTexelSize$height() { return (int) VH_shadingRateTexelSize$height.get(this.segment(), 0L, 0L); }
    public int shadingRatePaletteSize() { return (int) VH_shadingRatePaletteSize.get(this.segment(), 0L, 0L); }
    public int shadingRateMaxCoarseSamples() { return (int) VH_shadingRateMaxCoarseSamples.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize$widthAt(long index, int value) { VH_shadingRateTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize$heightAt(long index, int value) { VH_shadingRateTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRatePaletteSizeAt(long index, int value) { VH_shadingRatePaletteSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateMaxCoarseSamplesAt(long index, int value) { VH_shadingRateMaxCoarseSamples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize$width(int value) { VH_shadingRateTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize$height(int value) { VH_shadingRateTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRatePaletteSize(int value) { VH_shadingRatePaletteSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateMaxCoarseSamples(int value) { VH_shadingRateMaxCoarseSamples.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shadingRateTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateTexelSize, index), LAYOUT_shadingRateTexelSize); }
    public MemorySegment _shadingRateTexelSize() { return _shadingRateTexelSizeAt(0L); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _shadingRateTexelSizeAt(long index, MemorySegment src) { _shadingRateTexelSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _shadingRateTexelSize(MemorySegment src) { return _shadingRateTexelSizeAt(0L, src); }
    public MemorySegment _shadingRatePaletteSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRatePaletteSize, index), LAYOUT_shadingRatePaletteSize); }
    public MemorySegment _shadingRatePaletteSize() { return _shadingRatePaletteSizeAt(0L); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _shadingRatePaletteSizeAt(long index, MemorySegment src) { _shadingRatePaletteSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _shadingRatePaletteSize(MemorySegment src) { return _shadingRatePaletteSizeAt(0L, src); }
    public MemorySegment _shadingRateMaxCoarseSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateMaxCoarseSamples, index), LAYOUT_shadingRateMaxCoarseSamples); }
    public MemorySegment _shadingRateMaxCoarseSamples() { return _shadingRateMaxCoarseSamplesAt(0L); }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _shadingRateMaxCoarseSamplesAt(long index, MemorySegment src) { _shadingRateMaxCoarseSamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImagePropertiesNV _shadingRateMaxCoarseSamples(MemorySegment src) { return _shadingRateMaxCoarseSamplesAt(0L, src); }
}
