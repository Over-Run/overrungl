// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 formatRgba10x6WithoutYCbCrSampler;
/// }
/// ```
public final class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_formatRgba10x6WithoutYCbCrSampler = LAYOUT.byteOffset(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_formatRgba10x6WithoutYCbCrSampler = LAYOUT.select(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_formatRgba10x6WithoutYCbCrSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT); }
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT copyFrom(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT at(long index, Consumer<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatRgba10x6WithoutYCbCrSamplerAt(long index) { return (int) VH_formatRgba10x6WithoutYCbCrSampler.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int formatRgba10x6WithoutYCbCrSampler() { return (int) VH_formatRgba10x6WithoutYCbCrSampler.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSamplerAt(long index, int value) { VH_formatRgba10x6WithoutYCbCrSampler.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSampler(int value) { VH_formatRgba10x6WithoutYCbCrSampler.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatRgba10x6WithoutYCbCrSamplerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatRgba10x6WithoutYCbCrSampler, index), LAYOUT_formatRgba10x6WithoutYCbCrSampler); }
    public MemorySegment _formatRgba10x6WithoutYCbCrSampler() { return _formatRgba10x6WithoutYCbCrSamplerAt(0L); }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT _formatRgba10x6WithoutYCbCrSamplerAt(long index, MemorySegment src) { _formatRgba10x6WithoutYCbCrSamplerAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT _formatRgba10x6WithoutYCbCrSampler(MemorySegment src) { return _formatRgba10x6WithoutYCbCrSamplerAt(0L, src); }
}
